package fr.bentur_and_bertatruck.bandb_mod.machine.slot;

import fr.bentur_and_bertatruck.bandb_mod.common.loader.BandbItems;
import fr.bentur_and_bertatruck.bandb_mod.machine.recipe.RecipePress;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.inventory.IInventory;
import net.minecraft.inventory.Slot;
import net.minecraft.item.ItemStack;

public class SlotPressInput extends Slot {

	public SlotPressInput(IInventory inv, int par2, int par3, int par4) {
		super(inv, par2, par3, par4);
	}

	@Override
	public boolean canTakeStack(EntityPlayer par1EntityPlayer) {
		return true;
	}

	@Override
	public boolean isItemValid(ItemStack itemstack) {
		if (RecipePress.getAmountNeeded(itemstack.getItem()) != 0) {
			return true;
		} else {
			return false;

		}
	}
}
