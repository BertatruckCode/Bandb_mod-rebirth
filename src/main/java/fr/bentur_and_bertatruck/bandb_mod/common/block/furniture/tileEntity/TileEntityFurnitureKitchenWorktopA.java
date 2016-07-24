package fr.bentur_and_bertatruck.bandb_mod.common.block.furniture.tileEntity;

import fr.bentur_and_bertatruck.bandb_mod.common.block.furniture.model.ModelFurnitureKitchenWorktopA;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.tileentity.TileEntity;

public class TileEntityFurnitureKitchenWorktopA extends TileEntity{
	
    private final ModelFurnitureKitchenWorktopA model;   
    private byte direction;
		
	public TileEntityFurnitureKitchenWorktopA(){
		 this.model = new ModelFurnitureKitchenWorktopA();
	}
		
	public void readFromNBT(NBTTagCompound nbt) {
		super.readFromNBT(nbt);		
        this.direction = nbt.getByte("Direction");		
	}

	public void writeToNBT(NBTTagCompound nbt) {
		super.writeToNBT(nbt);
		nbt.setByte("Direction", this.direction);		
	}
	
    public byte getDirection(){
        return direction;
    }

    public void setDirection(byte direction){
        this.direction = direction;
        this.worldObj.markBlockForUpdate(this.xCoord, this.yCoord, this.zCoord);
    }
 }

