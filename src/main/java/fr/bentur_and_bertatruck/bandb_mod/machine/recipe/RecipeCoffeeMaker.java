package fr.bentur_and_bertatruck.bandb_mod.machine.recipe;

import java.util.HashMap;
import java.util.Map;

import fr.bentur_and_bertatruck.bandb_mod.common.loader.BandbItems;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class RecipeCoffeeMaker {

	public static final Map<String, ItemStack> recipeCoffeeMaker = new HashMap<String, ItemStack>();

	public static void addRecipe(Item item, ItemStack output) {

		recipeCoffeeMaker.put(item.getUnlocalizedName(), output);

	}

	public static ItemStack getOutputResult(Item item) {

		return recipeCoffeeMaker.get(item.getUnlocalizedName());

	}

}
