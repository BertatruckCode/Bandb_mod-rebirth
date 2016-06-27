package fr.bentur_and_bertatruck.bandb_mod.machine.network;

import io.netty.buffer.ByteBuf;
import net.minecraft.entity.player.EntityPlayer;
import cpw.mods.fml.common.network.simpleimpl.IMessage;
import cpw.mods.fml.common.network.simpleimpl.IMessageHandler;
import cpw.mods.fml.common.network.simpleimpl.MessageContext;
import fr.bentur_and_bertatruck.bandb_mod.machine.tileEntity.TileEntityBottleCaster;
import fr.bentur_and_bertatruck.bandb_mod.machine.tileEntity.TileEntityPrinter;

public class PacketBottleCaster implements IMessage {
	private int  x, y, z;
	private int amountMoltenGlass, amountWater;
	private int currentItemWorkTime, workTime, currentBottleSelected, amountBottleSelected, startWorking;
	private int workTimeLeft, burnTime, currentGlassBurnTime, cookTime;
	
	public PacketBottleCaster() {}

	public PacketBottleCaster(TileEntityBottleCaster tile) {
		this.x = tile.xCoord;
		this.y = tile.yCoord;
		this.z = tile.zCoord;
		
		this.amountMoltenGlass = tile.amountMoltenGlass;
		this.amountWater = tile.amountWater;
		
		this.currentItemWorkTime = tile.currentItemWorkTime;
		this.workTime = tile.workTime;
		this.currentBottleSelected = tile.currentBottleSelected;
		this.amountBottleSelected = tile.amountBottleSelected;
		this.startWorking = tile.startWorking;
		
		this.workTimeLeft = tile.workTimeLeft;
		this.burnTime = tile.burnTime;
		this.currentGlassBurnTime = tile.currentGlassBurnTime;
		this.cookTime = tile.cookTime;
	}

	public void fromBytes(ByteBuf buffer) {
		x = buffer.readInt();
		y = buffer.readInt();
		z = buffer.readInt();
		
		amountMoltenGlass = buffer.readInt();
		amountWater = buffer.readInt();

		currentItemWorkTime = buffer.readInt();
		workTime = buffer.readInt();
		currentBottleSelected = buffer.readInt();
		amountBottleSelected = buffer.readInt();
		startWorking = buffer.readInt();
		
		workTimeLeft = buffer.readInt();
		burnTime = buffer.readInt();
		currentGlassBurnTime = buffer.readInt();
		cookTime = buffer.readInt();

	}

	public void toBytes(ByteBuf buffer) {
		buffer.writeInt(x);
		buffer.writeInt(y);
		buffer.writeInt(z);
		
		buffer.writeInt(amountMoltenGlass);
		buffer.writeInt(amountWater);

		buffer.writeInt(currentItemWorkTime);
		buffer.writeInt(workTime);
		buffer.writeInt(currentBottleSelected);
		buffer.writeInt(amountBottleSelected);
		buffer.writeInt(startWorking);
		
		buffer.writeInt(workTimeLeft);
		buffer.writeInt(burnTime);
		buffer.writeInt(currentGlassBurnTime);
		buffer.writeInt(cookTime);
	}

	public void handleServerSide(EntityPlayer player) {
		TileEntityBottleCaster tile = (TileEntityBottleCaster) player.worldObj.getTileEntity(x, y, z);
		if (tile != null) {
			tile.amountMoltenGlass = amountMoltenGlass;
			tile.amountWater = amountWater;

			tile.currentItemWorkTime = currentItemWorkTime;
			tile.workTime = workTime;
			tile.currentBottleSelected = currentBottleSelected;
			tile.amountBottleSelected = amountBottleSelected;
			tile.startWorking = startWorking;
			
			tile.workTimeLeft = workTimeLeft;
			tile.burnTime = burnTime;
			tile.currentGlassBurnTime = currentGlassBurnTime;
			tile.cookTime = cookTime;
			
		}
	}
	
	public static class Handler implements IMessageHandler<PacketBottleCaster, IMessage> {

		public IMessage onMessage(PacketBottleCaster message, MessageContext ctx) {
        	EntityPlayer player = ctx.getServerHandler().playerEntity;
        	message.handleServerSide(player);
            return null;
        }
    }
}
