package fr.bentur_and_bertatruck.bandb_mod.machine.tileEntity;

import fr.bentur_and_bertatruck.bandb_mod.common.Bandb_mod;
import fr.bentur_and_bertatruck.bandb_mod.common.loader.BandbFuel;
import fr.bentur_and_bertatruck.bandb_mod.machine.model.ModelCoffeeMaker;
import fr.bentur_and_bertatruck.bandb_mod.machine.recipe.RecipeCoffeeMaker;
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

public class TileEntityKebabStand extends TileEntity  implements IInventory{
    
    //turn block
    private byte direction;
       
    private ItemStack[] slots = new ItemStack[1];
      
    //the time for the kebab to make 2 turn
	public int furnaceSpeed = 400;
	
	public int layerRemaining = 0;
	public int workTime = 0;
	public float angle = 0;
		
	public int[] currentTexture = new int[8];

	
	public TileEntityKebabStand() {
		currentTexture[0] = 0;
	    currentTexture[1] = 0;
	    currentTexture[2] = 0;
	    currentTexture[3] = 0;
	    currentTexture[4] = 0;
	    currentTexture[5] = 0;
	    currentTexture[6] = 0;
	    currentTexture[7] = 0;
	}

	public String getInventoryName() {
		return "Kebab Stand";
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

	public void updateEntity() {
		if (worldObj.isRemote){
			if(this.canSmelt() && this.workTime <= this.furnaceSpeed){
				this.workTime++;
				this.angle += 2*Math.PI/200.0;
				if(workTime%25==0){
					System.out.println("worktime : " + workTime);
					this.currentTexture[ 7 - (2 + this.workTime/25)%8] =  this.currentTexture[7 - (2 + this.workTime/25)%8] + 1;
					System.out.println("changement de texture " + ((2 + this.workTime/25)%8) + this.currentTexture[(2 + this.workTime/25)%8]);
				}
				if(workTime%200==0){
					System.out.println("angle : " + String.valueOf(angle/2.0/Math.PI));
				}
			}
		}
		
	}

	public boolean canSmelt() {
		if(this.layerRemaining > 1)
			return true;
		return false;		
	}

	public void smeltItem() {
		this.layerRemaining -= 1;
		if(layerRemaining <= 0){
			this.layerRemaining = 0;
			this.decrStackSize(0, 1);
		}
	}
	
	public boolean isKebabCooked(){
		if(workTime >= this.furnaceSpeed){
			return true;
		}
		return false;
	}
	
	public boolean addKebab(){
		if(this.layerRemaining == 1){
			System.out.println("adding kebab ");
			this.layerRemaining = 6;
	   		workTime=0;    		
    		currentTexture[0] = 0;
            currentTexture[1] = 0;
            currentTexture[2] = 0;
            currentTexture[3] = 0;
            currentTexture[4] = 0;
            currentTexture[5] = 0;
            currentTexture[6] = 0;
            currentTexture[7] = 0;

			return true;
		}
		return false;
	}
	
	public boolean addSplit(){
		if(this.layerRemaining == 0){
			System.out.println("adding split ");
			this.layerRemaining = 1;
			return true;
		}
		return false;
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
		this.layerRemaining = (int) nbt.getShort("layerRemaining");
		this.workTime = (int) nbt.getShort("workTime");
		this.angle = (int) nbt.getShort("angle");
		for(int i = 0; i < currentTexture.length;i++){
			this.currentTexture[i] = (int) 	nbt.getShort("text" + String.valueOf(i));
		}

	}

	public void writeToNBT(NBTTagCompound nbt) {
		super.writeToNBT(nbt);
		//turn block
		nbt.setByte("Direction", this.direction);
        //miscellaneous
		nbt.setShort("layerRemaining", (short) this.layerRemaining);
		nbt.setShort("workTime", (short) this.workTime);
		nbt.setShort("angle", (short) this.angle);
		
		for(int i = 0; i < currentTexture.length;i++){
			nbt.setShort("text" + String.valueOf(i), (short) this.currentTexture[i]);		}
		
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
	
    public byte getDirection(){
        return direction;
    }

    public void setDirection(byte direction){
        this.direction = direction;
        this.worldObj.markBlockForUpdate(this.xCoord, this.yCoord, this.zCoord);
    }

    public Packet getDescriptionPacket(){
        NBTTagCompound nbttagcompound = new NBTTagCompound();
        this.writeToNBT(nbttagcompound);
        return new S35PacketUpdateTileEntity(this.xCoord, this.yCoord, this.zCoord, 0, nbttagcompound);
    }
    
    public void onDataPacket(NetworkManager net, S35PacketUpdateTileEntity pkt){
        this.readFromNBT(pkt.func_148857_g());
        this.worldObj.markBlockRangeForRenderUpdate(this.xCoord, this.yCoord, this.zCoord, this.xCoord, this.yCoord, this.zCoord);
        worldObj.markBlockForUpdate(xCoord, yCoord, zCoord);
        markDirty();
    }
    
    public int getLayerRemaining(){
    	return this.layerRemaining;
    }
    
    public void decrLayer(){
    	if(workTime >= furnaceSpeed){
    		
    		workTime=0;
    		this.layerRemaining--;
    		
    		currentTexture[0] = 0;
            currentTexture[1] = 0;
            currentTexture[2] = 0;
            currentTexture[3] = 0;
            currentTexture[4] = 0;
            currentTexture[5] = 0;
            currentTexture[6] = 0;
            currentTexture[7] = 0;
    	}
    		
    }
    public float getAngle(){
    	return this.angle;
    }
	
    public int getCurrentTexture(int i){
    	return this.currentTexture[i];
    }
    
}