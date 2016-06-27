package fr.bentur_and_bertatruck.bandb_mod.machine.tileEntity;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.IInventory;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.nbt.NBTTagList;
import net.minecraft.tileentity.TileEntity;
import fr.bentur_and_bertatruck.bandb_mod.common.loader.BandbFuel;
import fr.bentur_and_bertatruck.bandb_mod.machine.recipe.RecipeDrier;

public class TileEntityDrier extends TileEntity implements IInventory{

	
	private ItemStack[] slots = new ItemStack[3];
	
	public int furnaceSpeed = 150;
	/**
	 * The number of ticks that the furnace will keep burning
	 */
	public int workTimeLeft;
	/**
	 * The number of ticks that a fresh copy of the currently-burning item would
	 * keep the furnace burning for
	 */
	public int currentItemWorkTime;
	/**
	 * The number of ticks that the current item has been cooking for
	 */
	public int workTime;

	public String getInventoryName() {
		return "Drier";
	}

	public boolean hasCustomInventoryName() {
		return false;
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

	public static boolean isItemFuel(Item item) {
		return BandbFuel.getFuelValue(item) > 0;
	}

	public boolean isBurning() {
		return this.workTimeLeft > 0;
	}

	public void updateEntity() {
		boolean flag = this.workTimeLeft > 0;
		boolean flag1 = false;
		if (this.isBurning()) {
			this.workTimeLeft--;
		}
		if (!this.worldObj.isRemote) {
			if (this.workTimeLeft == 0 && this.canSmelt() && this.slots[1] != null) {
				this.currentItemWorkTime = this.workTimeLeft = BandbFuel.getFuelValue(this.slots[1].getItem());
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
			if (this.isBurning() && this.canSmelt()) {
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

	public boolean canSmelt() {
		if (this.slots[0] == null) {
			return false;
		} else {
			ItemStack itemstack = RecipeDrier.getOutputResult(this.slots[0].getItem());
			if(itemstack == null)
				return false;
			if (this.slots[2] == null)
				return true;
			if (!this.slots[2].isItemEqual(itemstack))
				return false;
			int result = this.slots[2].stackSize + itemstack.stackSize;
			return (result <= getInventoryStackLimit() && result <= itemstack
					.getMaxStackSize());
		}
	}

	public void smeltItem() {
		if (this.canSmelt()) {
			ItemStack itemstack = RecipeDrier.getOutputResult(this.slots[0].getItem());
			if (this.slots[2] == null) {
				this.slots[2] = itemstack.copy();
			} else if (this.slots[2].isItemEqual(itemstack)) {
				this.slots[2].stackSize += itemstack.stackSize;
			}
			this.slots[0].stackSize--;
			if (this.slots[0].stackSize <= 0) {
				this.slots[0] = null;
			}
		}
	}

	public int getBurnTimeRemainingScaled(int i) {
		if (this.currentItemWorkTime == 0) {
			this.currentItemWorkTime = this.furnaceSpeed;
		}
		return this.workTimeLeft * i / this.currentItemWorkTime;
	}

	public int getCookProgressScaled(int i) {
		return this.workTime * i / this.furnaceSpeed;
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
		this.workTimeLeft = (int) nbt.getShort("workTimeLeft");
		this.currentItemWorkTime = (int) nbt.getShort("currentItemWorkTime");
		this.workTime = (int) nbt.getShort("workTime");
		
	}

	public void writeToNBT(NBTTagCompound nbt) {
		super.writeToNBT(nbt);
		nbt.setShort("workTimeLeft", (short) this.workTimeLeft);
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
		nbt.setTag("Items", list);
		
	}

}