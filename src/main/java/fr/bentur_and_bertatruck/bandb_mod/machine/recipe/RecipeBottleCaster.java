package fr.bentur_and_bertatruck.bandb_mod.machine.recipe;

import java.util.HashMap;
import java.util.Map;

import fr.bentur_and_bertatruck.bandb_mod.common.lists.ListBottle;
import fr.bentur_and_bertatruck.bandb_mod.common.lists.ListLabels;
import fr.bentur_and_bertatruck.bandb_mod.common.loader.BandbItems;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class RecipeBottleCaster {

	
	public static final Map<String, Integer> AmountMoltenGlassNeeded = new HashMap<String, Integer>();
	public static final Map<String, Integer> AmountMoltenGlassProvided = new HashMap<String, Integer>();


	public static void addRecipe(Item item, int amountMoltenGlass) {

		AmountMoltenGlassNeeded.put(item.getUnlocalizedName(), amountMoltenGlass);
		
		ListBottle.addBottle(new ItemStack(item));
	}
	
	public static void addItemMoltenGlassProvider(Item item, int amountMoltenGlass) {

		AmountMoltenGlassProvided.put(item.getUnlocalizedName(), amountMoltenGlass);

	}

	public static int getAmountMoltenGlassNeeded(Item item) {

		if(AmountMoltenGlassNeeded.get(item.getUnlocalizedName()) != null)
		return AmountMoltenGlassNeeded.get(item.getUnlocalizedName());
		else return 0;
	}
	
	public static int getAmountMoltenGlassProvided(Item item) {

		if(AmountMoltenGlassProvided.get(item.getUnlocalizedName()) != null)
		return AmountMoltenGlassProvided.get(item.getUnlocalizedName());
		else return 0;
	}

}
