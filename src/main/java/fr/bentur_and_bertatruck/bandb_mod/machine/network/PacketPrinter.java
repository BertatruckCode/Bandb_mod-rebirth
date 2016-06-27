package fr.bentur_and_bertatruck.bandb_mod.machine.network;

import io.netty.buffer.ByteBuf;
import net.minecraft.entity.player.EntityPlayer;
import cpw.mods.fml.common.network.simpleimpl.IMessage;
import cpw.mods.fml.common.network.simpleimpl.IMessageHandler;
import cpw.mods.fml.common.network.simpleimpl.MessageContext;
import fr.bentur_and_bertatruck.bandb_mod.machine.tileEntity.TileEntityPrinter;

public class PacketPrinter implements IMessage {
	private int  x, y, z;
	private int inkBlack, inkCyan, inkMagenta, inkYellow;
	private int currentItemWorkTime, workTime, currentLabelSelected, amountLabelSelected, startWorking;
	
	public PacketPrinter() {}

	public PacketPrinter(TileEntityPrinter tile) {
		this.x = tile.xCoord;
		this.y = tile.yCoord;
		this.z = tile.zCoord;
		
		this.inkBlack = tile.inkBlack;
		this.inkCyan = tile.inkCyan;
		this.inkMagenta = tile.inkMagenta;
		this.inkYellow = tile.inkYellow;
		
		this.currentItemWorkTime = tile.currentItemWorkTime;
		this.workTime = tile.workTime;
		this.currentLabelSelected = tile.currentLabelSelected;
		this.amountLabelSelected = tile.amountLabelSelected;
		this.startWorking = tile.startWorking;
	}

	public void fromBytes(ByteBuf buffer) {
		x = buffer.readInt();
		y = buffer.readInt();
		z = buffer.readInt();
		
		inkBlack = buffer.readInt();
		inkCyan = buffer.readInt();
		inkMagenta = buffer.readInt();
		inkYellow = buffer.readInt();

		currentItemWorkTime = buffer.readInt();
		workTime = buffer.readInt();
		currentLabelSelected = buffer.readInt();
		amountLabelSelected = buffer.readInt();
		startWorking = buffer.readInt();
	}

	public void toBytes(ByteBuf buffer) {
		buffer.writeInt(x);
		buffer.writeInt(y);
		buffer.writeInt(z);
		
		buffer.writeInt(inkBlack);
		buffer.writeInt(inkCyan);
		buffer.writeInt(inkMagenta);
		buffer.writeInt(inkYellow);

		buffer.writeInt(currentItemWorkTime);
		buffer.writeInt(workTime);
		buffer.writeInt(currentLabelSelected);
		buffer.writeInt(amountLabelSelected);
		buffer.writeInt(startWorking);


	}

	public void handleServerSide(EntityPlayer player) {
		TileEntityPrinter tile = (TileEntityPrinter) player.worldObj.getTileEntity(x, y, z);
		if (tile != null) {
			tile.inkBlack = inkBlack;
			tile.inkCyan = inkCyan;
			tile.inkMagenta = inkMagenta;
			tile.inkYellow = inkYellow;

			tile.currentItemWorkTime = currentItemWorkTime;
			tile.workTime = workTime;
			tile.currentLabelSelected = currentLabelSelected;
			tile.amountLabelSelected = amountLabelSelected;
			tile.startWorking = startWorking;
			
		}
	}
	
	public static class Handler implements IMessageHandler<PacketPrinter, IMessage> {

		public IMessage onMessage(PacketPrinter message, MessageContext ctx) {
        	EntityPlayer player = ctx.getServerHandler().playerEntity;
        	message.handleServerSide(player);
            return null;
        }
    }
}
