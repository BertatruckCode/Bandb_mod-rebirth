package fr.bentur_and_bertatruck.bandb_mod.machine.recipe;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import fr.bentur_and_bertatruck.bandb_mod.common.loader.BandbItems;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class RecipeSyrupMachine {
	
	public static final Map<String[], Item> recipeList = new HashMap<String[], Item>();
	public static final Map<List<String>, ItemStack> recipeSyrup = new HashMap<List<String>, ItemStack>();
	
	
	public static void addRecipe(Item item01, ItemStack output) {

		List<String> inputRecipe = new ArrayList<String>();

		inputRecipe.add(item01.getUnlocalizedName());
		
		Collections.sort(inputRecipe);

		recipeSyrup.put(inputRecipe, output);
		
	}

	public static void addRecipe(Item item01, Item item02, ItemStack output) {

		List<String> inputRecipe = new ArrayList<String>();

		inputRecipe.add(item01.getUnlocalizedName());
		inputRecipe.add(item02.getUnlocalizedName());
		
		Collections.sort(inputRecipe);

		recipeSyrup.put(inputRecipe, output);
		
	}

	public static void addRecipe(Item item01, Item item02, Item item03, ItemStack output) {

		List<String> inputRecipe = new ArrayList<String>();

		inputRecipe.add(item01.getUnlocalizedName());
		inputRecipe.add(item02.getUnlocalizedName());
		inputRecipe.add(item03.getUnlocalizedName());

		Collections.sort(inputRecipe);

		recipeSyrup.put(inputRecipe, output);
		
	}
	public static void addRecipe(Item item01, Item item02, Item item03, Item item04, ItemStack output) {
		
		List<String> inputRecipe = new ArrayList<String>();

		inputRecipe.add(item01.getUnlocalizedName());
		inputRecipe.add(item02.getUnlocalizedName());
		inputRecipe.add(item03.getUnlocalizedName());
		inputRecipe.add(item04.getUnlocalizedName());

		Collections.sort(inputRecipe);

		recipeSyrup.put(inputRecipe, output);
		
	}

	public static ItemStack getOuputResult(List<String> string) {
		Collections.sort(string);

		 
		return recipeSyrup.get(string);
	
	}
	
}
