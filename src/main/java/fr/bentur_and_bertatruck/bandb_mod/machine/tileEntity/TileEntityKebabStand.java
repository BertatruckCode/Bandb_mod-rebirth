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

public class TileEntityKebabStand extends TileEntity{
    
    //turn block
    private byte direction;
             
    //the time for the kebab to make 2 turn
	private int furnaceSpeed = 400;
	
	private int layerRemaining = 0;
	private int workTime = 0;
	private float angle = 0;
		
	private int[] currentTexture = new int[8];
	
	public TileEntityKebabStand(){
		getCurrentTexture()[0] = 0;
	    getCurrentTexture()[1] = 0;
	    getCurrentTexture()[2] = 0;
	    getCurrentTexture()[3] = 0;
	    getCurrentTexture()[4] = 0;
	    getCurrentTexture()[5] = 0;
	    getCurrentTexture()[6] = 0;
	    getCurrentTexture()[7] = 0;
	}

	public String getInventoryName() {
		return "Kebab Stand";
	}

	public void updateEntity() {
		if(worldObj.isRemote){
			if(this.canSmelt() && this.workTime <= this.furnaceSpeed){
				this.workTime++;
				this.angle += 2*Math.PI/200.0;
				if(workTime%25==0){
					//System.out.println("worktime : " + workTime);
					this.getCurrentTexture()[ 7 - (2 + this.workTime/25)%8] =  this.getCurrentTexture()[7 - (2 + this.workTime/25)%8] + 1;
					//System.out.println("changement de texture " + ((2 + this.workTime/25)%8) + this.getCurrentTexture()[(2 + this.workTime/25)%8]);
				}
				if(workTime%200==0){
					//System.out.println("angle : " + String.valueOf(angle/2.0/Math.PI));
				}
			}
		}
		
	}

	public boolean canSmelt() {
		if(this.layerRemaining > 1)
			return true;
		return false;		
	}
	
	public boolean isKebabCooked(){
		if(workTime >= this.furnaceSpeed){
			return true;
		}
		return false;
	}
	
	public boolean addKebab(){
		if(this.layerRemaining == 1){
			//System.out.println("adding kebab ");
			this.layerRemaining = 6;
	   		workTime=0;    		
    		getCurrentTexture()[0] = 0;
            getCurrentTexture()[1] = 0;
            getCurrentTexture()[2] = 0;
            getCurrentTexture()[3] = 0;
            getCurrentTexture()[4] = 0;
            getCurrentTexture()[5] = 0;
            getCurrentTexture()[6] = 0;
            getCurrentTexture()[7] = 0;

			return true;
		}
		return false;
	}
	
	public boolean addSplit(){
		if(this.layerRemaining == 0){
			//System.out.println("adding split ");
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
                
		this.setLayerRemaining(nbt.getInteger("layerRemaining"));		
		this.workTime = nbt.getInteger("workTime");
		this.angle = nbt.getFloat("angle");
		
		for(int i = 0; i < currentTexture.length; i++){
			String str = "text" + String.valueOf(i);
			this.currentTexture[i] = nbt.getInteger(str);
		}
				
	}
   
	public void writeToNBT(NBTTagCompound nbt) {
		super.writeToNBT(nbt);
		
		//turn block
		nbt.setByte("Direction", this.direction);
        //miscellaneous
		nbt.setInteger("layerRemaining", this.getLayerRemaining());
		nbt.setInteger("workTime", this.workTime);
		nbt.setFloat("angle", this.angle);
		
		for(int i = 0; i < currentTexture.length;i++){
			String str = "text" + String.valueOf(i);
			nbt.setInteger(str, this.currentTexture[i]);		
		}
		
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
    	//System.out.println("requesting layerRemaining : " + this.layerRemaining);
    	return this.layerRemaining;
    }
    
    public void decrLayer(){
    	if(workTime >= furnaceSpeed){
    		
    		workTime=0;
    		this.layerRemaining--;
    		
    		getCurrentTexture()[0] = 0;
            getCurrentTexture()[1] = 0;
            getCurrentTexture()[2] = 0;
            getCurrentTexture()[3] = 0;
            getCurrentTexture()[4] = 0;
            getCurrentTexture()[5] = 0;
            getCurrentTexture()[6] = 0;
            getCurrentTexture()[7] = 0;
    	}
    		
    }
    public int getWorkTime() {
		return workTime;
	}

	public void setWorkTime(int workTime) {
		this.workTime = workTime;
	}

	public void setAngle(float angle) {
		this.angle = angle;
	}

	public float getAngle(){
    	return this.angle;
    }
	
    public int getCurrentTexture(int i){
    	return this.currentTexture[i];
    }

	public void setLayerRemaining(int i) {
		this.layerRemaining = i;
	}

	public int[] getCurrentTexture() {
		return currentTexture;
	}

	public void setCurrentTexture(int[] currentTexture) {
		this.currentTexture = currentTexture;
	}
    
}