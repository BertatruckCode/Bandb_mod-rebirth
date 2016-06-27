package fr.bentur_and_bertatruck.bandb_mod.machine.slot;

import fr.bentur_and_bertatruck.bandb_mod.common.loader.BandbFuel;
import fr.bentur_and_bertatruck.bandb_mod.common.loader.BandbItems;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.inventory.IInventory;
import net.minecraft.inventory.Slot;
import net.minecraft.item.ItemStack;

public class SlotSyrupMachineFuel extends Slot{

	public SlotSyrupMachineFuel(IInventory inv, int par2, int par3, int par4) {
		super(inv, par2, par3, par4);
		}
		@Override
		public boolean canTakeStack(EntityPlayer par1EntityPlayer) {
		return true;
		}
		@Override
		public boolean isItemValid(ItemStack itemstack) {
		if(BandbFuel.getFuelValue(itemstack.getItem())>0 ){
			return true;
		}else{
			return false;
		
		}
	}
}
