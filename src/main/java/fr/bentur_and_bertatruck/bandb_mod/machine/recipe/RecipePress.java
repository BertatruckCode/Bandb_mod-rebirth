package fr.bentur_and_bertatruck.bandb_mod.machine.recipe;

import java.util.HashMap;
import java.util.Map;

import fr.bentur_and_bertatruck.bandb_mod.common.loader.BandbItems;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class RecipePress {

	public static final Map<String, ItemStack> recipePress = new HashMap<String, ItemStack>();
	public static final Map<String, Integer> recipePressAmount = new HashMap<String, Integer>();

	public static void addRecipe(Item item, int quantity, ItemStack output) {

		recipePress.put(item.getUnlocalizedName(), output);
		recipePressAmount.put(item.getUnlocalizedName(), quantity);

	}

	public static ItemStack getOutputResult(Item item) {

		return recipePress.get(item.getUnlocalizedName());

	}

	public static int getAmountNeeded(Item item) {

		if(recipePressAmount.get(item.getUnlocalizedName()) != null)
		return recipePressAmount.get(item.getUnlocalizedName());
		else return 0;
	}

}
