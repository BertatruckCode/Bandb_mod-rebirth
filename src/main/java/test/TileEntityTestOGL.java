package test;

import fr.bentur_and_bertatruck.bandb_mod.machine.model.ModelCoffeeMaker;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.nbt.NBTTagList;
import net.minecraft.network.NetworkManager;
import net.minecraft.network.Packet;
import net.minecraft.network.play.server.S35PacketUpdateTileEntity;
import net.minecraft.tileentity.TileEntity;

public class TileEntityTestOGL extends TileEntity {

	 //The model of your block
    private final ModelTestOGL model;
    
    //turn block
    private byte direction;
    
    public TileEntityTestOGL() {
        this.model = new ModelTestOGL();
	}

    public void readFromNBT(NBTTagCompound nbt) {
		super.readFromNBT(nbt);
		
		//turn block
        this.direction = nbt.getByte("Direction");
	}

	public void writeToNBT(NBTTagCompound nbt) {
		super.writeToNBT(nbt);
		//turn block
		nbt.setByte("Direction", this.direction);
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
