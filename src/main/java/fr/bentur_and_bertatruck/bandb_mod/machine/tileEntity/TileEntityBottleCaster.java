package fr.bentur_and_bertatruck.bandb_mod.machine.tileEntity;

import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.inventory.IInventory;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.nbt.NBTTagList;
import net.minecraft.tileentity.TileEntity;
import fr.bentur_and_bertatruck.bandb_mod.common.lists.ListBottle;
import fr.bentur_and_bertatruck.bandb_mod.common.lists.ListLabels;
import fr.bentur_and_bertatruck.bandb_mod.common.loader.BandbFuel;
import fr.bentur_and_bertatruck.bandb_mod.common.loader.BandbItems;
import fr.bentur_and_bertatruck.bandb_mod.machine.recipe.RecipeBottleCaster;
import fr.bentur_and_bertatruck.bandb_mod.machine.recipe.RecipePrinter;

public class TileEntityBottleCaster extends TileEntity implements IInventory {
	
	public ItemStack[] slots = new ItemStack[7];
		
	public int furnaceSpeed = 150;
	public int maxAmountMoltenGlass = 5000;
	//public int lastCurrentItemWorkTime, lastWorkTime, lastCurrentLabelSelected, lastAmountLabelSelected, lastStartWorking;

	public int workTimeLeft;
	public int burnTime;

	/**
	 * The number of ticks that a fresh copy of the currently-burning item would
	 * keep the furnace burning for
	 */
	public int currentItemWorkTime;
	public int currentGlassBurnTime;

	/**
	 * The number of ticks that the current item has been cooking for
	 */
	public int workTime;
	public int cookTime;


	public int amountMoltenGlass, amountWater;

	public int currentBottleSelected;
	public int amountBottleSelected = 1;
	public int startWorking = 0;
	
	public TileEntityBottleCaster(){
	}
	
	public String getInventoryName() {
		return "Bottle Caster";
	}

	public boolean hasCustomInventoryName() {
		return true;
	}

	public int getSizeInventory() {
		return this.slots.length;
	}

	public ItemStack getStackInSlot(int var1) {
		return this.slots[var1];
	}

	public ItemStack decrStackSize(int var1, int var2) {
		if (this.slots[var1] != null) {
			ItemStack itemstack;

			if (this.slots[var1].stackSize <= var2) {
				itemstack = this.slots[var1];
				this.slots[var1] = null;
				return itemstack;
			} else {
				itemstack = this.slots[var1].splitStack(var2);

				if (this.slots[var1].stackSize == 0) {
					this.slots[var1] = null;
				}
				return itemstack;
			}
		} else {
			return null;
		}

	}

	public ItemStack getStackInSlotOnClosing(int i) {
		if (this.slots[i] != null) {
			ItemStack itemstack = this.slots[i];
			this.slots[i] = null;
			return itemstack;
		}
		return null;
	}

	public void setInventorySlotContents(int i, ItemStack itemstack) {
		this.slots[i] = itemstack;
		if (itemstack != null && itemstack.stackSize > this.getInventoryStackLimit()) {
			itemstack.stackSize = this.getInventoryStackLimit();
		}
	}

	public int getInventoryStackLimit() {
		return 64;
	}

	public boolean isUseableByPlayer(EntityPlayer entityplayer) {
		return true;
	}

	public void openInventory() {
	}

	public void closeInventory() {
	}

	public boolean isItemValidForSlot(int i, ItemStack itemstack) {
		return true;
	}

	public int getWorkProgressScaled(int i) {
		return this.workTime * i / this.furnaceSpeed;
	}
	
	public boolean isBurning() {
		return this.burnTime > 0;
	}
	public boolean hasMoltenGlass(){
		return this.amountMoltenGlass > 0;
	}
	


	public void updateEntity() {
		boolean flag = this.workTimeLeft > 0;
		boolean flag1 = false;
		if (this.isBurning()) {
			this.burnTime--;
		}
		if (!this.worldObj.isRemote) {
			if (this.burnTime == 0 && this.hasItemSmeltable() && this.slots[1] != null) {
				this.currentGlassBurnTime = this.burnTime = BandbFuel.getFuelValue(this.slots[1].getItem());
				if (this.isBurning()) {
					flag1 = true;

					if (this.slots[1] != null) {
						this.slots[1].stackSize--;
						if (this.slots[1].stackSize == 0) {
							this.slots[1] = this.slots[1].getItem().getContainerItem(this.slots[1]);
						}
					}

				}

			} else if (this.hasMoltenGlass() && this.slots[1] != null && this.burnTime == 0) {
				this.currentGlassBurnTime = this.burnTime = BandbFuel.getFuelValue(this.slots[1].getItem());
				if (this.isBurning()) {
					flag1 = true;
					if (this.slots[1] != null) {
						this.slots[1].stackSize--;
						if (this.slots[1].stackSize == 0) {
							this.slots[1] = this.slots[1].getItem().getContainerItem(this.slots[1]);
						}
					}
				}
			}
			if (!this.worldObj.isRemote) {
				if (this.amountWater <= 1000){
					if(this.slots[2] != null && this.slots[2].getItem() == Items.water_bucket){
						this.slots[2] = new ItemStack(Items.bucket);
						this.amountWater = amountWater + 1000;
					}
				}
			}
			if (!this.worldObj.isRemote) {
				if(this.hasMoltenGlass()){
					if(!this.isBurning()){
						this.amountMoltenGlass--;
					}
				}
			}
			if(this.hasItemSmeltable() && this.isBurning()  && (this.amountMoltenGlass + this.getCurrentItemProviderGlassAmountProvide()) <= this.maxAmountMoltenGlass) {
				this.cookTime++;
				if (this.cookTime == 60) {
					this.cookTime = 0;
					this.smeltItemProvider();
					flag1 = true;
				}
			} else {
				this.cookTime = 0;
			}
			if (this.canSmelt()) {
				this.workTime++;
				if (this.workTime == this.furnaceSpeed) {
					this.workTime = 0;
					this.smeltItem();
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

	public boolean hasItemSmeltable(){
		if(this.slots[4] != null){
			if( RecipeBottleCaster.getAmountMoltenGlassProvided(this.slots[4].getItem()) > 0 ){
			return true;	
				}
		}else if(this.slots[5]!= null){
			if( RecipeBottleCaster.getAmountMoltenGlassProvided(this.slots[5].getItem()) > 0 ){		
			return true;
			}			
		}else if(this.slots[6] != null){
			if(RecipeBottleCaster.getAmountMoltenGlassProvided(this.slots[6].getItem()) > 0 ){
			return true;
			}
		}else return false;
		return false;
		
	}
	public void smeltItemProvider(){	
		if(this.slots[4] != null){
			this.amountMoltenGlass += RecipeBottleCaster.getAmountMoltenGlassProvided(this.slots[4].getItem());
			this.decrStackSize(4, 1);
		}else if(this.slots[5]!= null){
			this.amountMoltenGlass += RecipeBottleCaster.getAmountMoltenGlassProvided(this.slots[5].getItem());
			this.decrStackSize(5, 1);
		}else if(this.slots[6] != null){
			this.amountMoltenGlass += RecipeBottleCaster.getAmountMoltenGlassProvided(this.slots[6].getItem());
			this.decrStackSize(6, 1);
		}

	}
	public int getCurrentItemProviderGlassAmountProvide(){
		if(this.slots[4] != null){
			return RecipeBottleCaster.getAmountMoltenGlassProvided(this.slots[4].getItem());
		}else if(this.slots[5] != null){
			return RecipeBottleCaster.getAmountMoltenGlassProvided(this.slots[5].getItem());
		}else if(this.slots[6] != null){
			return RecipeBottleCaster.getAmountMoltenGlassProvided(this.slots[6].getItem());
		}
		return 0;
	}
	public boolean canSmelt() {
		if (this.startWorking == 1) {
			if (this.amountWater < 100) {
				return false;
			}else if (this.amountBottleSelected < 1){
				return false;
			}else if (this.amountMoltenGlass < RecipeBottleCaster.getAmountMoltenGlassNeeded(ListBottle.getItem(currentBottleSelected).getItem()) && RecipeBottleCaster.getAmountMoltenGlassNeeded(ListBottle.getItem(currentBottleSelected).getItem()) > 0) {
				return false;
			}else {
				ItemStack itemstack = ListBottle.getItem(currentBottleSelected);
				if (itemstack == null)
					return false;
				if (this.slots[0] == null)
					return true;
				if (!this.slots[0].isItemEqual(itemstack))
					return false;
				int result = this.slots[0].stackSize + itemstack.stackSize;
				return (result <= getInventoryStackLimit() && result <= itemstack.getMaxStackSize());
			}
		}else 
			return false;
	}

	public void smeltItem() {
		if (this.canSmelt()) {
			ItemStack itemstack = ListBottle.getItem(currentBottleSelected);
			if (this.slots[0] == null) {
				this.slots[0] = itemstack.copy();
			} else if (this.slots[0].isItemEqual(itemstack)) {
				this.slots[0].stackSize += itemstack.stackSize;
			}
			this.amountMoltenGlass -= RecipeBottleCaster.getAmountMoltenGlassNeeded(ListBottle.getItem(currentBottleSelected).getItem());
			this.amountWater -= 100;
			
			this.amountDecrease();
		}
	}
	
	public void renderTexture(){
		this.slots[3] = null;
		ItemStack stack = new ItemStack(ListBottle.getItem(currentBottleSelected).getItem(), amountBottleSelected);
		this.slots[3] = stack;
	}
	
	public void increaseLabelSelected(){
		this.currentBottleSelected++;
		if(this.currentBottleSelected == ListBottle.getBottleQuantity())
			this.currentBottleSelected = 0;
		this.renderTexture();
	}
	public void decreaseLabelSelected(){
		this.currentBottleSelected--;
		if(this.currentBottleSelected < 0)
			this.currentBottleSelected = ListBottle.getBottleQuantity() - 1;
		this.renderTexture();

	}
	
	public boolean getStartState(){
		return this.startWorking == 1;				
	}

	public void ChangeStartState(){
		if(this.startWorking == 0){
		this.startWorking = 1;
		}else{
			this.startWorking = 0;
		}
	}
	
	public void amountIncrease() {
		if(this.amountBottleSelected < this.getInventoryStackLimit())
		this.amountBottleSelected++;
		this.renderTexture();

	}

	public void amountDecrease() {
		this.amountBottleSelected--;
		if(this.amountBottleSelected < 0)
			this.amountBottleSelected = 0;
		this.renderTexture();

	}
	
	public int getAmountMoltenGlass(){
		return this.amountMoltenGlass;
	}
	public int getAmountWater(){
		return this.amountWater;
	}
	public int getBurnTimeRemaining() {
		
		return this.burnTime;
	}
	
	public void readFromNBT(NBTTagCompound nbt) {
		super.readFromNBT(nbt);
		
		NBTTagList list = nbt.getTagList("Items", 10);
		this.slots = new ItemStack[this.getSizeInventory()];
		for (int i = 0; i < list.tagCount(); i++) {
			NBTTagCompound compound = (NBTTagCompound) list.getCompoundTagAt(i);
			byte b = compound.getByte("Slot");
			if (b >= 0 && b < this.slots.length) {
				this.slots[b] = ItemStack.loadItemStackFromNBT(compound);
			}
		}
		this.currentItemWorkTime = (int) nbt.getShort("currentItemWorkTime");
		this.workTime = (int) nbt.getShort("workTime");
		this.currentBottleSelected = (int) nbt.getShort("currentBottleSelected");
		this.amountBottleSelected = (int) nbt.getShort("amountBottleSelected");

		this.amountMoltenGlass = (int) nbt.getShort("amountMoltenGlass");	
		
	}

	public void writeToNBT(NBTTagCompound nbt) {
		super.writeToNBT(nbt);
		
		nbt.setShort("currentItemWorkTime", (short) this.currentItemWorkTime);
		nbt.setShort("workTime", (short) this.workTime);
		nbt.setShort("currentLabelSelected", (short) this.currentBottleSelected);
		nbt.setShort("amountLabelSelected", (short) this.amountBottleSelected);
		
		nbt.setShort("amountMoltenGlass", (short) this.amountMoltenGlass);
			
		NBTTagList list = new NBTTagList();
		for (int i = 0; i < this.slots.length; i++) {
			if (this.slots[i] != null) {
				NBTTagCompound compound = new NBTTagCompound();
				compound.setByte("Slot", (byte) i);
				this.slots[i].writeToNBT(compound);
				list.appendTag(compound);
			}
		}
		nbt.setTag("Items", list);
		
	}
}

