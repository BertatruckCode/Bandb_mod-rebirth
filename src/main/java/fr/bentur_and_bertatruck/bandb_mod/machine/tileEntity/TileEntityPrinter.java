package fr.bentur_and_bertatruck.bandb_mod.machine.tileEntity;

import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.IInventory;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.nbt.NBTTagList;
import net.minecraft.network.NetworkManager;
import net.minecraft.network.Packet;
import net.minecraft.network.play.server.S35PacketUpdateTileEntity;
import net.minecraft.tileentity.TileEntity;
import fr.bentur_and_bertatruck.bandb_mod.common.lists.ListLabels;
import fr.bentur_and_bertatruck.bandb_mod.common.loader.BandbItems;
import fr.bentur_and_bertatruck.bandb_mod.machine.model.ModelCoffeeMaker;
import fr.bentur_and_bertatruck.bandb_mod.machine.model.ModelPrinter;
import fr.bentur_and_bertatruck.bandb_mod.machine.recipe.RecipePrinter;

public class TileEntityPrinter extends TileEntity implements IInventory {
	
	 //The model of your block
    private final ModelPrinter model;
    
    //turn block
    private byte direction;
	
	public ItemStack[] slots = new ItemStack[4];
		
	public int furnaceSpeed = 100;
	//public int lastCurrentItemWorkTime, lastWorkTime, lastCurrentLabelSelected, lastAmountLabelSelected, lastStartWorking;

	/**
	 * The number of ticks that a fresh copy of the currently-burning item would
	 * keep the furnace burning for
	 */
	public int currentItemWorkTime;
	/**
	 * The number of ticks that the current item has been cooking for
	 */
	public int workTime;

	// int inkBlack, inkCyan, inkMagenta, inkYellow;

	public int inkBlack ;

	public int inkCyan ;

	public int inkMagenta ;
	
	public int inkYellow ;

	public int currentLabelSelected;
	public int amountLabelSelected = 1;
	public int startWorking = 0;
	
	public TileEntityPrinter(){
		 this.model = new ModelPrinter();
	}
	
	public String getInventoryName() {
		return "Printer";
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

	public int getInkAmountBlack() {
		return this.inkBlack;
	}

	public int getInkAmountCyan() {
		return this.inkCyan;
	}

	public int getInkAmountMagenta() {
		return this.inkMagenta;
	}

	public int getInkAmountYellow() {
		return this.inkYellow;
	}

	public void updateEntity() {
		boolean flag1 = false;

		if (!this.worldObj.isRemote) {
			if (this.slots[1] != null) {
				ItemStack itemstack1 = this.slots[1];
				if (itemstack1.getItem() == BandbItems.itemBlackInkCartridge && inkBlack < 129) {
					inkBlack += 128;
					itemstack1.stackSize--;
					if (itemstack1.stackSize <= 0) {
						this.slots[1] = null;
					}
					changeinkCartridge();
				}else
				if (itemstack1.getItem() == BandbItems.itemCyanInkCartridge && inkCyan < 129) {
					inkCyan += 128;
					itemstack1.stackSize--;
					if (itemstack1.stackSize <= 0) {
						this.slots[1] = null;
					}
					changeinkCartridge();
				}else
				if (itemstack1.getItem() == BandbItems.itemMagentaInkCartridge && inkMagenta < 129) {
					inkMagenta += 128;
					itemstack1.stackSize--;
					if (itemstack1.stackSize <= 0) {
						this.slots[1] = null;
					}
					changeinkCartridge();
				}else
				if (itemstack1.getItem() == BandbItems.itemYellowInkCartridge && inkYellow < 129) {
					inkYellow += 128;
					itemstack1.stackSize--;
					if (itemstack1.stackSize <= 0) {
						this.slots[1] = null;
					}
					changeinkCartridge();
				}
			}
		}

		if (this.canSmelt() && this.amountLabelSelected > 0) {
			this.workTime++;
			if (this.workTime == this.furnaceSpeed) {
				this.workTime = 0;
				this.smeltItem();
				flag1 = true;
			}
		} else {
			this.workTime = 0;
			this.startWorking = 0;
		}

		if (flag1) {
			this.markDirty();
		}
	}

	public boolean canSmelt() {
		if (this.startWorking == 1) {
			if (this.slots[2] == null) {
				return false;
			}else if (this.inkBlack < RecipePrinter.getAmountInkBlackNeeded(ListLabels.getItem(currentLabelSelected).getItem()) && RecipePrinter.getAmountInkBlackNeeded(ListLabels.getItem(currentLabelSelected).getItem()) > 0) {
				return false;
			}else if (this.inkCyan < RecipePrinter.getAmountInkCyanNeeded(ListLabels.getItem(currentLabelSelected).getItem()) && RecipePrinter.getAmountInkCyanNeeded(ListLabels.getItem(currentLabelSelected).getItem()) > 0) {
				return false;
			}else if (this.inkMagenta < RecipePrinter.getAmountInkMagentaNeeded(ListLabels.getItem(currentLabelSelected).getItem()) && RecipePrinter.getAmountInkMagentaNeeded(ListLabels.getItem(currentLabelSelected).getItem()) > 0) {
				return false;
			}else if (this.inkYellow < RecipePrinter.getAmountInkYellowNeeded(ListLabels.getItem(currentLabelSelected).getItem()) && RecipePrinter.getAmountInkYellowNeeded(ListLabels.getItem(currentLabelSelected).getItem()) > 0) {
				return false;
			} else {
				ItemStack itemstack = ListLabels.getItem(currentLabelSelected);
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
		//System.out.println("finish working");
		if (this.canSmelt()) {
			ItemStack itemstack = ListLabels.getItem(currentLabelSelected);
			if (this.slots[0] == null) {
				this.slots[0] = itemstack.copy();
			} else if (this.slots[0].isItemEqual(itemstack)) {
				this.slots[0].stackSize += itemstack.stackSize;
			}
			this.slots[2].stackSize--;
			if (this.slots[2].stackSize <= 0) {
				this.slots[2] = null;
			}
			this.inkBlack -= RecipePrinter.getAmountInkBlackNeeded(ListLabels.getItem(currentLabelSelected).getItem());
			this.inkCyan -= RecipePrinter.getAmountInkCyanNeeded(ListLabels.getItem(currentLabelSelected).getItem());
			this.inkMagenta -= RecipePrinter.getAmountInkMagentaNeeded(ListLabels.getItem(currentLabelSelected).getItem());
			this.inkYellow -= RecipePrinter.getAmountInkYellowNeeded(ListLabels.getItem(currentLabelSelected).getItem());
			
			this.amountDecrease();
		}
	}
	
	public void changeinkCartridge(){
		ItemStack drop = new ItemStack(BandbItems.itemEmptyInkCartridge, 1);
		EntityItem entityitem = new EntityItem(this.worldObj, this.xCoord, this.yCoord + 1, this.zCoord, drop);
		
		if(this.slots[0] ==  null )
			this.slots[0] = drop.copy();
		else if(this.slots[0].getItem() == BandbItems.itemEmptyInkCartridge && this.slots[0].stackSize < 64 )
			this.slots[0].stackSize++;
		else
			this.worldObj.spawnEntityInWorld(entityitem);
		
	}
	
	public void renderTexture(){
		//System.out.println("rendering item");

		this.slots[3] = null;
		ItemStack stack = new ItemStack(ListLabels.getItem(currentLabelSelected).getItem(), amountLabelSelected);
		this.slots[3] = stack;
	}
	
	public void increaseLabelSelected(){
		this.currentLabelSelected++;
		if(this.currentLabelSelected == ListLabels.getLabelQuantity())
			this.currentLabelSelected = 0;
		this.renderTexture();
		//System.out.println(currentLabelSelected);

	}
	public void decreaseLabelSelected(){
		this.currentLabelSelected--;
		if(this.currentLabelSelected < 0)
			this.currentLabelSelected = ListLabels.getLabelQuantity() - 1;
		//System.out.println(currentLabelSelected);
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
		if(this.amountLabelSelected < this.getInventoryStackLimit())
		this.amountLabelSelected++;
		this.renderTexture();

	}

	public void amountDecrease() {
		this.amountLabelSelected--;
		if(this.amountLabelSelected < 0)
			this.amountLabelSelected = 0;
		this.renderTexture();

	}
	
	public void readFromNBT(NBTTagCompound nbt) {
		super.readFromNBT(nbt);
		
        this.direction = nbt.getByte("Direction");

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
		this.currentLabelSelected = (int) nbt.getShort("currentLabelSelected");
		this.amountLabelSelected = (int) nbt.getShort("amountLabelSelected");

		this.inkBlack = (int) nbt.getShort("inkBlack");
		this.inkCyan = (int) nbt.getShort("inkCyan");
		this.inkMagenta = (int) nbt.getShort("inkMagenta");
		this.inkYellow = (int) nbt.getShort("inkYellow");

		
	}

	public void writeToNBT(NBTTagCompound nbt) {
		super.writeToNBT(nbt);
		nbt.setByte("Direction", this.direction);
		
		nbt.setShort("currentItemWorkTime", (short) this.currentItemWorkTime);
		nbt.setShort("workTime", (short) this.workTime);
		nbt.setShort("currentLabelSelected", (short) this.currentLabelSelected);
		nbt.setShort("amountLabelSelected", (short) this.amountLabelSelected);
		
		nbt.setShort("inkBlack", (short) this.inkBlack);
		nbt.setShort("inkCyan", (short) this.inkCyan);
		nbt.setShort("inkMagenta", (short) this.inkMagenta);
		nbt.setShort("inkYellow", (short) this.inkYellow);		
			
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
//turn block 
	
    public byte getDirection()
    {
        return direction;
    }

    public void setDirection(byte direction)
    {
        this.direction = direction;
        this.worldObj.markBlockForUpdate(this.xCoord, this.yCoord, this.zCoord);
    }

    public Packet getDescriptionPacket()
    {
        NBTTagCompound nbttagcompound = new NBTTagCompound();
        this.writeToNBT(nbttagcompound);
        return new S35PacketUpdateTileEntity(this.xCoord, this.yCoord, this.zCoord, 0, nbttagcompound);
    }

    public void onDataPacket(NetworkManager net, S35PacketUpdateTileEntity pkt)
    {
        this.readFromNBT(pkt.func_148857_g());
        this.worldObj.markBlockRangeForRenderUpdate(this.xCoord, this.yCoord, this.zCoord, this.xCoord, this.yCoord, this.zCoord);
    }
}

