package fr.bentur_and_bertatruck.bandb_mod.machine.recipe;

import java.util.HashMap;
import java.util.Map;

import fr.bentur_and_bertatruck.bandb_mod.common.loader.BandbItems;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class RecipeDrier {
	
	public static final Map<String, ItemStack> recipeDrier = new HashMap<String, ItemStack>();

	public static void addRecipe(Item item, ItemStack output) {
		
		recipeDrier.put(item.getUnlocalizedName(), output);
		
		
	}

public static ItemStack getOutputResult(Item item) {
	
	return recipeDrier.get(item.getUnlocalizedName());

}

}
