package  fr.bentur_and_bertatruck.bandb_mod.machine.tileEntity;

import java.util.ArrayList;
import java.util.List;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.inventory.IInventory;
import net.minecraft.inventory.ISidedInventory;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.FurnaceRecipes;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.nbt.NBTTagList;
import net.minecraft.tileentity.TileEntity;
import fr.bentur_and_bertatruck.bandb_mod.common.item.ItemBeverage;
import fr.bentur_and_bertatruck.bandb_mod.common.lists.ListLabels;
import fr.bentur_and_bertatruck.bandb_mod.common.loader.BandbFuel;
import fr.bentur_and_bertatruck.bandb_mod.common.loader.BandbItems;
import fr.bentur_and_bertatruck.bandb_mod.machine.recipe.RecipeCocktailBar;
import fr.bentur_and_bertatruck.bandb_mod.machine.recipe.RecipeDrier;
import fr.bentur_and_bertatruck.bandb_mod.machine.recipe.RecipeSyrupMachine;

public class TileEntityCocktailBar extends TileEntity implements IInventory, ISidedInventory {
	public ItemStack[] slots = new ItemStack[12];
	public ItemStack[] bufferBottle = new ItemStack[8];
	public int currentBottleSelected = 0;
	
	public int machineSpeed = 200;
	
	/**
     * The number of ticks that the machine will keep working
     */
	public int FuelLeft;
	/**
     * The number of ticks that a fresh copy of the currently-working item would keep the machine working for
     */
	public int currentItemWorkTime;
	/**
     * The number of ticks that the current item has been working for
     */
	public int workTime;
	
	
	Item lastItemResult, currentItemResult;

	public int getSizeInventory() {
		return this.slots.length;
	}

	public ItemStack getStackInSlot(int var1) {
		return slots[var1];
	}

	public ItemStack decrStackSize(int i, int j) {
		if (slots[i] != null) {
			if (slots[i].stackSize <= j) {
				ItemStack itemstack = slots[i];
				slots[i] = null;
				return itemstack;
			}
			ItemStack itemstack1 = slots[i].splitStack(j);
			if (slots[i].stackSize == 0) {
				slots[i] = null;
			}
			return itemstack1;
		} else {
			return null;
		}
	}

	public ItemStack getStackInSlotOnClosing(int i) {
		if (this.slots[i] != null) {
			ItemStack var2 = this.slots[i];
			this.slots[i] = null;
			return var2;
		} else {
			return null;
		}
	}

	public void setInventorySlotContents(int i, ItemStack itemstack) {
		slots[i] = itemstack;
		if ((itemstack != null)
				&& (itemstack.stackSize > getInventoryStackLimit())) {
			itemstack.stackSize = getInventoryStackLimit();
		}
	}

	public String getInventoryName() {
		return "Cocktail Bar";
	}

	public int getInventoryStackLimit() {
		return 64;
	}

	public boolean isUseableByPlayer(EntityPlayer var1) {
		return true;
	}


	public boolean hasCustomInventoryName() {
		return false;
	}

	public void openInventory() {
	}

	public void closeInventory() {
	}

	public boolean isItemValidForSlot(int i, ItemStack itemstack) {
		return true;
	}

	public int[] getAccessibleSlotsFromSide(int p_94128_1_) {
		return null;
	}

	public boolean canInsertItem(int p_102007_1_, ItemStack p_102007_2_, int p_102007_3_) {
		return false;
	}

	public boolean canExtractItem(int p_102008_1_, ItemStack p_102008_2_, int p_102008_3_) {
		return false;
	}
	
	public static boolean isItemFuel (ItemStack itemstack) {
		Item item = itemstack.getItem();
		return BandbFuel.getFuelValue(item) > 0;
	}
	
	public void updateEntity() {
		boolean flag = this.FuelLeft > 0;
		boolean flag1 = false;
		
		if (!this.worldObj.isRemote) {
			if(this.slots[1] == null){
				this.changeBottleSelected();
				this.slots[1] = this.getCurrenBufferItem();
			}
			bufferBottle[currentBottleSelected] = slots[1];
			
			if(this.slots[1] != null && this.slots[1].stackSize <= 0){
				this.slots[1] = null;
			}
			
			if (this.canSmelt()) {
				this.workTime++;
				if (this.workTime == this.machineSpeed) {
					this.workTime = 0;
					this.onWorkingFinish();
					flag1 = true;
				}
			} else {
				this.workTime = 0;
			}
		}
		if (flag1) {
			this.markDirty();
		}
	}
	
	public boolean canSmelt() {
		if (this.slots[2] == null) {
			return false;
		}else if (this.slots[3] == null) {
			return false;
		}else {
			ItemStack itemstack = this.getItemResult();
			if(itemstack == null)
				return false;
			if (this.slots[0] == null)
				return true;
			if (!this.slots[0].isItemEqual(itemstack))
				return false;
			int result = this.slots[0].stackSize + itemstack.stackSize;
			return (result <= getInventoryStackLimit() && result <= itemstack.getMaxStackSize());
		}
	}
	
	public void onWorkingFinish() {
		if (this.canSmelt()) {
			ItemStack itemstack = this.getItemResult();

			if (slots[0] == null) {
				slots[0] = itemstack;
				slots[0].stackSize++;
			} else if (slots[0].getItem() == itemstack.getItem())
				slots[0].stackSize++;

			for (int i = 0; i < 9; i++) {
				if (slots[3 + i] != null) {
					// add bottle to the buffer
					if (slots[3 + i] != null && slots[3 + i].getItem() instanceof ItemBeverage) {
						Item item = slots[3 + i].getItem();
						ItemBeverage beverage = (ItemBeverage) item;
						Item bottle = beverage.getBottleEmpty();

						this.addBottleToBuffer(bottle);

					}
				}
			}
			for (int i = 0; i < 9; i++) {
				if (slots[3 + i] != null) {
					decrStackSize(3 + i, 1);
				}

			}

		}
	}
	
	public ItemStack getItemResult(){
		List<String> item = new ArrayList<String>();

		for(int i=0; i<9;i++){
			if(slots[3+i] != null){
				item.add(slots[3+i].getItem().getUnlocalizedName());
			}			
		}
		return RecipeCocktailBar.getOuputResult(item);
	}
	
	public int getWorkProgressScaled(int i){
		return this.workTime * i / this.machineSpeed;
		
	}
	//buffer item bottle
	public void addBottleToBuffer(Item item) {
		Item bottle = item;
		if(bottle == null){
			System.out.println("problem: bottle is null");
		}
		for (int i = 0; i < bufferBottle.length; i++) {
			if (bufferBottle[i] != null && bufferBottle[i].getItem() == item) {
				bufferBottle[i].stackSize++;
				//System.out.println(bufferBottle[i].stackSize);
				bottle = null;
			}
		}
		for (int i = 0; i < bufferBottle.length && bottle != null; i++) {
			if (bufferBottle[i] == null) {
				bufferBottle[i] = new ItemStack(bottle, 1);
				bottle = null;

			}
		}
	}
	public ItemStack getCurrenBufferItem(){
		return bufferBottle[currentBottleSelected];
	}
	public void changeBottleSelected(){		
		currentBottleSelected++;
		if(currentBottleSelected == this.bufferBottle.length - 1)
			this.currentBottleSelected = 0;
	}
	
	public boolean bufferIsEmpty(){
		for (int i = 0; i < bufferBottle.length; i++) {
			if(bufferBottle[i] != null)
				return false;
		}
		return true;
	}
	
	
	//nbt function
	public void readFromNBT(NBTTagCompound nbt) {
		super.readFromNBT(nbt);
		NBTTagList list = nbt.getTagList("Items", 10);
		NBTTagList listBottle = nbt.getTagList("bufferBottle", 10);

		this.slots = new ItemStack[this.getSizeInventory()];
		for (int i = 0; i < list.tagCount(); i++) {
			NBTTagCompound compound = (NBTTagCompound) list.getCompoundTagAt(i);
			byte b = compound.getByte("Slot");
			if (b >= 0 && b < this.slots.length) {
				this.slots[b] = ItemStack.loadItemStackFromNBT(compound);
			}
		}
		
		for (int i = 0; i < listBottle.tagCount(); i++) {
			NBTTagCompound compound = (NBTTagCompound) listBottle.getCompoundTagAt(i);
			byte b = compound.getByte("bufferBottle");
			if (b >= 0 && b < this.bufferBottle.length) {
				this.bufferBottle[b] = ItemStack.loadItemStackFromNBT(compound);
			}
		}
		this.FuelLeft = (int) nbt.getShort("workTimeLeft");
		this.currentItemWorkTime = (int) nbt.getShort("currentItemWorkTime");
		this.workTime = (int) nbt.getShort("workTime");
		
	}

	public void writeToNBT(NBTTagCompound nbt) {
		super.writeToNBT(nbt);
		nbt.setShort("workTimeLeft", (short) this.FuelLeft);
		nbt.setShort("currentItemWorkTime", (short) this.currentItemWorkTime);
		nbt.setShort("workTime", (short) this.workTime);
		NBTTagList list = new NBTTagList();
		for (int i = 0; i < this.slots.length; i++) {
			if (this.slots[i] != null) {
				NBTTagCompound compound = new NBTTagCompound();
				compound.setByte("Slot", (byte) i);
				this.slots[i].writeToNBT(compound);
				list.appendTag(compound);
			}
		}
		NBTTagList listBottle = new NBTTagList();
		for (int i = 0; i < this.bufferBottle.length; i++) {
			if (this.bufferBottle[i] != null) {
				NBTTagCompound compound = new NBTTagCompound();
				compound.setByte("bufferBottle", (byte) i);
				this.bufferBottle[i].writeToNBT(compound);
				listBottle.appendTag(compound);
			}
		}
		nbt.setTag("Items", list);
		nbt.setTag("bufferBottle", listBottle);
		
	}
}

