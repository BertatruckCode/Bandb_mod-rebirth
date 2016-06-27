package fr.bentur_and_bertatruck.bandb_mod.machine.recipe;

import fr.bentur_and_bertatruck.bandb_mod.common.Bandb_mod;
import fr.bentur_and_bertatruck.bandb_mod.common.loader.BandbItems;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class RecipeIngotMasher {
	public RecipeIngotMasher() {
	}

	public static ItemStack getMashingResult(Item item, Item item2) {
		return getOutput(item, item2);
	}

	public static ItemStack getOutput(Item item, Item item2) {
		// Recipe One
		if (item == Items.apple && item2 == Items.iron_ingot
				|| item == Items.iron_ingot
				&& item2 == Items.iron_axe) {
			return new ItemStack(BandbItems.itemIngotTitan, 2);
		}
		return null;
	}

}
