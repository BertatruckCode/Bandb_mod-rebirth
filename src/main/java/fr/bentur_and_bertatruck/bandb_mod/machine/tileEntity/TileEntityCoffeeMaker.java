package fr.bentur_and_bertatruck.bandb_mod.machine.tileEntity;

import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.OpenGlHelper;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.inventory.IInventory;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.nbt.NBTTagList;
import net.minecraft.network.NetworkManager;
import net.minecraft.network.Packet;
import net.minecraft.network.play.server.S35PacketUpdateTileEntity;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;

import org.lwjgl.opengl.GL11;

import fr.bentur_and_bertatruck.bandb_mod.common.Bandb_mod;
import fr.bentur_and_bertatruck.bandb_mod.common.loader.BandbFuel;
import fr.bentur_and_bertatruck.bandb_mod.machine.model.ModelCoffeeMaker;
import fr.bentur_and_bertatruck.bandb_mod.machine.recipe.RecipeCoffeeMaker;
import fr.bentur_and_bertatruck.bandb_mod.machine.recipe.RecipeDrier;

public class TileEntityCoffeeMaker extends TileEntity  implements IInventory{

	 //The model of your block
    private final ModelCoffeeMaker model;
    
    //turn block
    private byte direction;
    
    
    private ItemStack[] slots = new ItemStack[5];
   
    
	public int furnaceSpeed = 200;
	/**
	 * The number of ticks that the furnace will keep burning
	 */
	public int workTimeLeft;
	
	public int fuelCapacityLastFuelItem = 1600;
	/**
	 * The number of ticks that a fresh copy of the currently-burning item would
	 * keep the furnace burning for
	 */
	public int currentItemWorkTime;
	/**
	 * The number of ticks that the current item has been cooking for
	 */
	public int workTime;
	
	
	public int waterAmount;
	
	 public TileEntityCoffeeMaker() {
         this.model = new ModelCoffeeMaker();
	}

	public String getInventoryName() {
		return "Coffee Maker";
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
			if (this.workTimeLeft == 0 && this.canSmelt() && this.slots[2] != null) {
				this.currentItemWorkTime = this.workTimeLeft = this.fuelCapacityLastFuelItem = BandbFuel.getFuelValue(this.slots[2].getItem());
				
				if (this.isBurning()) {
					flag1 = true;
					if (this.slots[2] != null) {
						this.slots[2].stackSize--;
						if (this.slots[2].stackSize == 0) {
							this.slots[2] = this.slots[2].getItem().getContainerItem(this.slots[1]);
						}
					}
				}
			}
			if (!this.worldObj.isRemote) {
				if (this.waterAmount <= 1000){
					if(this.slots[1] != null && this.slots[1].getItem() == Items.water_bucket){
						this.slots[1] = new ItemStack(Items.bucket);
						this.waterAmount = waterAmount + 1000;
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
		if(this.worldObj.isRemote == true && this.workTime == 1){
			
		
			worldObj.playSound(this.xCoord, this.yCoord, this.zCoord, Bandb_mod.MODID + ":nespresso", 1.0F, 0.6F, false);
		}
	}

	public boolean canSmelt() {
		if (this.slots[4] == null) {
			return false;
		}else if (this.waterAmount < 199){
			return false;		
		}else if (this.slots[3] == null ){
			return false;
				
		} else {
			ItemStack itemstack = RecipeCoffeeMaker.getOutputResult(this.slots[4].getItem());
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

	public void smeltItem() {
		System.out.println(this.waterAmount);
		if (this.canSmelt()) {
			ItemStack itemstack = RecipeCoffeeMaker.getOutputResult(this.slots[4].getItem());
			if (this.slots[0] == null) {
				this.slots[0] = itemstack.copy();
			} else if (this.slots[0].isItemEqual(itemstack)) {
				this.slots[0].stackSize += itemstack.stackSize;
			}
			this.slots[4].stackSize--;
			if (this.slots[4].stackSize <= 0) {
				this.slots[4] = null;
			}
			this.slots[3].stackSize--;
			if (this.slots[3].stackSize <= 0) {
				this.slots[3] = null;
			}
			this.waterAmount -= 200;
		}
	}

	public int getBurnTimeRemaining() {
		
		return this.workTimeLeft;
	}

	public int getCookProgressScaled(int i) {
		return this.workTime * i / this.furnaceSpeed;
	}
	
	public int getWaterAmount() {
		return this.waterAmount;
	}
	
	public int getFuelCapacityLastFuelItem(){
	return this.fuelCapacityLastFuelItem;
	}
	
	public void readFromNBT(NBTTagCompound nbt) {
		super.readFromNBT(nbt);
		
		//turn block
        this.direction = nbt.getByte("Direction");
        //miscellaneous
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
		this.waterAmount = (int) nbt.getShort("waterAmount");
		
	}

	public void writeToNBT(NBTTagCompound nbt) {
		super.writeToNBT(nbt);
		//turn block
		nbt.setByte("Direction", this.direction);
        //miscellaneous
		nbt.setShort("workTimeLeft", (short) this.workTimeLeft);
		nbt.setShort("currentItemWorkTime", (short) this.currentItemWorkTime);
		nbt.setShort("workTime", (short) this.workTime);
		nbt.setShort("waterAmount", (short) this.waterAmount);
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