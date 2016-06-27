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

public class RecipeCocktailBar {
	
	public static final Map<List<String>, ItemStack> recipeCocktail = new HashMap<List<String>, ItemStack>();
	
	
	public static void addRecipe(Item itemGlass, Item item01, ItemStack output) {

		List<String> inputRecipe = new ArrayList<String>();

		inputRecipe.add(item01.getUnlocalizedName());
		inputRecipe.add(itemGlass.getUnlocalizedName());

		Collections.sort(inputRecipe);

		recipeCocktail.put(inputRecipe, output);
		
	}

	public static void addRecipe(Item itemGlass,Item item01, Item item02, ItemStack output) {

		List<String> inputRecipe = new ArrayList<String>();

		inputRecipe.add(item01.getUnlocalizedName());
		inputRecipe.add(item02.getUnlocalizedName());
		inputRecipe.add(itemGlass.getUnlocalizedName());

		Collections.sort(inputRecipe);

		recipeCocktail.put(inputRecipe, output);
		
	}

	public static void addRecipe(Item itemGlass, Item item01, Item item02, Item item03, ItemStack output) {

		List<String> inputRecipe = new ArrayList<String>();

		inputRecipe.add(item01.getUnlocalizedName());
		inputRecipe.add(item02.getUnlocalizedName());
		inputRecipe.add(item03.getUnlocalizedName());
		inputRecipe.add(itemGlass.getUnlocalizedName());

		Collections.sort(inputRecipe);

		recipeCocktail.put(inputRecipe, output);
		
	}
	public static void addRecipe(Item itemGlass, Item item01, Item item02, Item item03, Item item04, ItemStack output) {
		
		List<String> inputRecipe = new ArrayList<String>();

		inputRecipe.add(item01.getUnlocalizedName());
		inputRecipe.add(item02.getUnlocalizedName());
		inputRecipe.add(item03.getUnlocalizedName());
		inputRecipe.add(item04.getUnlocalizedName());
		inputRecipe.add(itemGlass.getUnlocalizedName());

		Collections.sort(inputRecipe);

		recipeCocktail.put(inputRecipe, output);
		
	}

	public static void addRecipe(Item itemGlass, Item item01, Item item02, Item item03, Item item04, Item item05, ItemStack output) {

		List<String> inputRecipe = new ArrayList<String>();

		inputRecipe.add(item01.getUnlocalizedName());
		inputRecipe.add(item02.getUnlocalizedName());
		inputRecipe.add(item03.getUnlocalizedName());
		inputRecipe.add(item04.getUnlocalizedName());
		inputRecipe.add(item05.getUnlocalizedName());
		inputRecipe.add(itemGlass.getUnlocalizedName());

		Collections.sort(inputRecipe);

		recipeCocktail.put(inputRecipe, output);

	}

	public static void addRecipe(Item itemGlass, Item item01, Item item02, Item item03, Item item04, Item item05, Item item06, ItemStack output) {

		List<String> inputRecipe = new ArrayList<String>();

		inputRecipe.add(item01.getUnlocalizedName());
		inputRecipe.add(item02.getUnlocalizedName());
		inputRecipe.add(item03.getUnlocalizedName());
		inputRecipe.add(item04.getUnlocalizedName());
		inputRecipe.add(item05.getUnlocalizedName());
		inputRecipe.add(item06.getUnlocalizedName());
		inputRecipe.add(itemGlass.getUnlocalizedName());

		Collections.sort(inputRecipe);

		recipeCocktail.put(inputRecipe, output);

	}
	
	public static void addRecipe(Item itemGlass, Item item01, Item item02, Item item03, Item item04, Item item05, Item item06, Item item07, ItemStack output) {

		List<String> inputRecipe = new ArrayList<String>();

		inputRecipe.add(item01.getUnlocalizedName());
		inputRecipe.add(item02.getUnlocalizedName());
		inputRecipe.add(item03.getUnlocalizedName());
		inputRecipe.add(item04.getUnlocalizedName());
		inputRecipe.add(item05.getUnlocalizedName());
		inputRecipe.add(item06.getUnlocalizedName());
		inputRecipe.add(item07.getUnlocalizedName());
		inputRecipe.add(itemGlass.getUnlocalizedName());

		Collections.sort(inputRecipe);

		recipeCocktail.put(inputRecipe, output);

	}
	
	public static void addRecipe(Item itemGlass, Item item01, Item item02, Item item03, Item item04, Item item05, Item item06, Item item07, Item item08, ItemStack output) {

		List<String> inputRecipe = new ArrayList<String>();
		
		inputRecipe.add(itemGlass.getUnlocalizedName());
		inputRecipe.add(item01.getUnlocalizedName());
		inputRecipe.add(item02.getUnlocalizedName());
		inputRecipe.add(item03.getUnlocalizedName());
		inputRecipe.add(item04.getUnlocalizedName());
		inputRecipe.add(item05.getUnlocalizedName());
		inputRecipe.add(item06.getUnlocalizedName());
		inputRecipe.add(item07.getUnlocalizedName());
		inputRecipe.add(item08.getUnlocalizedName());

		Collections.sort(inputRecipe);

		recipeCocktail.put(inputRecipe, output);

	}
	
	public static void addRecipe(Item itemGlass, Item item01, Item item02, Item item03, Item item04, Item item05, Item item06, Item item07, Item item08, Item item09, ItemStack output) {

		List<String> inputRecipe = new ArrayList<String>();
		
		inputRecipe.add(itemGlass.getUnlocalizedName());
		inputRecipe.add(item01.getUnlocalizedName());
		inputRecipe.add(item02.getUnlocalizedName());
		inputRecipe.add(item03.getUnlocalizedName());
		inputRecipe.add(item04.getUnlocalizedName());
		inputRecipe.add(item05.getUnlocalizedName());
		inputRecipe.add(item06.getUnlocalizedName());
		inputRecipe.add(item07.getUnlocalizedName());
		inputRecipe.add(item08.getUnlocalizedName());
		inputRecipe.add(item09.getUnlocalizedName());

		Collections.sort(inputRecipe);

		recipeCocktail.put(inputRecipe, output);

	}

	public static ItemStack getOuputResult(List<String> string) {
		Collections.sort(string);
	 
		return recipeCocktail.get(string);
	
	}
	
}
