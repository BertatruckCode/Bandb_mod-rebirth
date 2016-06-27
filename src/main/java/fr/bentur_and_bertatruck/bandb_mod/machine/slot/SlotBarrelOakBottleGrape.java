package fr.bentur_and_bertatruck.bandb_mod.machine.slot;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.IInventory;
import net.minecraft.inventory.Slot;
import net.minecraft.item.ItemStack;
import fr.bentur_and_bertatruck.bandb_mod.common.item.ItemBeverageGrape;

public class SlotBarrelOakBottleGrape extends Slot{

	public SlotBarrelOakBottleGrape(IInventory inv, int par2, int par3, int par4) {
		super(inv, par2, par3, par4);
		}
		@Override
		public boolean canTakeStack(EntityPlayer entity) {
		return true;
		}
		@Override
		public boolean isItemValid(ItemStack itemstack) {
			if(itemstack.getItem() instanceof ItemBeverageGrape)
		return true;
			else
				return false;
		}
}
