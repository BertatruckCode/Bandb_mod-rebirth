package fr.bentur_and_bertatruck.bandb_mod.machine.recipe;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class RecipeLabelMachine {

	public static final Map<List<String>, ItemStack> recipeLabelMachine = new HashMap<List<String>, ItemStack>();

	public static void addRecipe(Item itemBottle,Item itemLabel, ItemStack output) {
		
		List<String> inputRecipe = new ArrayList<String>();

		inputRecipe.add(itemBottle.getUnlocalizedName());
		inputRecipe.add(itemLabel.getUnlocalizedName());
		
		Collections.sort(inputRecipe);

		recipeLabelMachine.put(inputRecipe, output);

	}

	public static ItemStack getOutputResult(Item item, Item item2) {
				
		List<String> input = new ArrayList<String>();
		
		input.add(item.getUnlocalizedName());
		input.add(item2.getUnlocalizedName());
		
		Collections.sort(input);
		
		return recipeLabelMachine.get(input);

	}

}
