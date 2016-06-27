package fr.bentur_and_bertatruck.bandb_mod.machine.tileEntity;

import java.util.ArrayList;
import java.util.List;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.IInventory;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.nbt.NBTTagList;
import net.minecraft.tileentity.TileEntity;
import net.minecraftforge.fluids.Fluid;
import fr.bentur_and_bertatruck.bandb_mod.common.loader.BandbFuel;
import fr.bentur_and_bertatruck.bandb_mod.machine.recipe.RecipeBarrelApple;
import fr.bentur_and_bertatruck.bandb_mod.machine.recipe.RecipeCocktailBar;
import fr.bentur_and_bertatruck.bandb_mod.machine.recipe.RecipeDrier;

public class TileEntityBarrelApple extends TileEntity implements IInventory {

	private ItemStack[] slots = new ItemStack[5];

	public int workTime;
	
	public Fluid currentFluid;
	public int amountFluid;

	public String getInventoryName() {
		return "Barrel Apple Tree";
	}

	public boolean hasCustomInventoryName() {
		return false;
	}

	public int getSizeInventory() {
		return this.slots.length;
	}
	public int getFluidCapacity(){
		return 50000;
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
		if (itemstack != null
				&& itemstack.stackSize > this.getInventoryStackLimit()) {
			itemstack.stackSize = this.getInventoryStackLimit();
		}
	}

	public int getInventoryStackLimit() {
		return 64;
	}

	public boolean isUseableByPlayer(EntityPlayer entityplayer) {
		return this.worldObj.getTileEntity(this.xCoord, this.yCoord,
				this.zCoord) != this ? false : entityplayer.getDistanceSq(
				(double) this.xCoord + 0.5D, (double) this.yCoord + 0.5D,
				(double) this.zCoord + 0.5D) <= 64.0D;
	}

	public void openInventory() {
	}

	public void closeInventory() {
	}

	public boolean isItemValidForSlot(int i, ItemStack itemstack) {
		return true;
	}

	public void updateEntity() {
		boolean flag1 = false;
		if (!this.worldObj.isRemote) {
	
			if (this.canWork()) {
				this.workTime++;
				if (this.workTime == this.getBrewingTime()) {
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

	public boolean canWork() {
		if (this.slots[2] == null) {
			return false;
		} else {
			Fluid fluid = getFluidResult();
			if (fluid == null)
				return false;
			if (currentFluid == null)
				return true;
			if (currentFluid.getUnlocalizedName() != fluid.getUnlocalizedName())
				return false;
			int result = amountFluid + getAmountFluidResult();
			return (result <= getFluidCapacity());
		}
	}

	public void onWorkingFinish() {
		if (this.canWork()) {
			Fluid fluid = getFluidResult();
			if(currentFluid == null){
				currentFluid = fluid;
				
			}
			amountFluid = amountFluid + getAmountFluidResult();
						
			if(this.slots[3] != null){
			this.slots[3].stackSize--;
				if (this.slots[3].stackSize <= 0) {
				this.slots[3] = null;
				}
			}
			if(this.slots[4] != null){
				this.slots[4].stackSize--;
					if (this.slots[4].stackSize <= 0) {
					this.slots[4] = null;
					}
				}
		}
		System.out.println("finish working: fluid = "+ this.getFluid() + " quantity = "+ this.getFluidAmount());
	}
	
	public ItemStack getItemResult(){
		return RecipeBarrelApple.getBeverageResult(currentFluid.getUnlocalizedName());
	}
	
	public Fluid getFluidResult(){
		List<String> item = new ArrayList<String>();

		for(int i=0; i<3 ;i++){
			if(slots[2+i] != null){
				item.add(slots[2+i].getItem().getUnlocalizedName());
			}			
		}
		return RecipeBarrelApple.getFluid(item);
		
	}
	
	public int getAmountFluidResult(){
		List<String> item = new ArrayList<String>();

		for(int i=0; i<3 ;i++){
			if(slots[2+i] != null){
				item.add(slots[2+i].getItem().getUnlocalizedName());
			}			
		}
		return RecipeBarrelApple.getAmountFluidProvided(item);
	}
	
	public int getBrewingTime(){
		List<String> item = new ArrayList<String>();

		for(int i=0; i<3 ;i++){
			if(slots[2+i] != null){
				item.add(slots[2+i].getItem().getUnlocalizedName());
			}			
		}
		return RecipeBarrelApple.getBrewingTime(item);
	}
	
	public int getFluidAmount(){
		return amountFluid;
	}
	public Fluid getFluid(){
		return currentFluid;
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
		this.amountFluid = (int) nbt.getShort("amountFluid");
		this.workTime = (int) nbt.getShort("workTime");

	}

	public void writeToNBT(NBTTagCompound nbt) {
		super.writeToNBT(nbt);
		nbt.setShort("amountFluid", (short) this.amountFluid);
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
		/*
		nbt.setTag("Items", list);
		if(this.getFluid() != null){
			NBTTagCompound compound = new NBTTagCompound();

		}
		*/
	}

}