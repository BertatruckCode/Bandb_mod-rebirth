package fr.bentur_and_bertatruck.bandb_mod.machine.network;

import cpw.mods.fml.common.network.simpleimpl.IMessage;
import cpw.mods.fml.common.network.simpleimpl.IMessageHandler;
import cpw.mods.fml.common.network.simpleimpl.MessageContext;
import fr.bentur_and_bertatruck.bandb_mod.machine.tileEntity.TileEntityKebabStand;
import io.netty.buffer.ByteBuf;
import net.minecraft.entity.player.EntityPlayer;

public class PacketKebabStand implements IMessage {
	private int  x, y, z;
	private int workTime, layerRemaining;
	
	private float angle;
	public static int[] currentTexture = new int[8];
	
	public PacketKebabStand() {}

	public PacketKebabStand(TileEntityKebabStand tile) {
		this.x = tile.xCoord;
		this.y = tile.yCoord;
		this.z = tile.zCoord;
		
		this.workTime = tile.getWorkTime();
		this.layerRemaining = tile.getLayerRemaining();
		this.angle = tile.getAngle();
		this.currentTexture = tile.getCurrentTexture();
	}

	public void fromBytes(ByteBuf buffer) {
		x = buffer.readInt();
		y = buffer.readInt();
		z = buffer.readInt();
		
		workTime = buffer.readInt();
		layerRemaining = buffer.readInt();
		angle = buffer.readFloat();
		
		for(int i = 0; i < currentTexture.length;i++){
			currentTexture[i] = buffer.readInt();
		}
	}

	public void toBytes(ByteBuf buffer) {
		buffer.writeInt(x);
		buffer.writeInt(y);
		buffer.writeInt(z);
		
		buffer.writeInt(workTime);
		buffer.writeInt(layerRemaining);
		buffer.writeFloat(angle);
		
		for(int i = 0; i < currentTexture.length;i++){
			buffer.writeInt(currentTexture[i]);

		}

	}

	public void handleServerSide(EntityPlayer player) {
		TileEntityKebabStand tile = (TileEntityKebabStand) player.worldObj.getTileEntity(x, y, z);
		if (tile != null) {

			tile.setWorkTime(workTime);
			tile.setLayerRemaining(layerRemaining);
			tile.setAngle(angle);
			
			for(int i = 0; i < currentTexture.length;i++){
				tile.getCurrentTexture()[i] = currentTexture[i];

			}
			
		}
	}
	
	public static class Handler implements IMessageHandler<PacketKebabStand, IMessage> {

		public IMessage onMessage(PacketKebabStand message, MessageContext ctx) {
        	EntityPlayer player = ctx.getServerHandler().playerEntity;
        	message.handleServerSide(player);
            return null;
        }
    }
}
