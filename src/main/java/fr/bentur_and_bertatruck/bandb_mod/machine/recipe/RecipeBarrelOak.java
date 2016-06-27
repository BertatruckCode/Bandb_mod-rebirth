package fr.bentur_and_bertatruck.bandb_mod.machine.recipe;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import fr.bentur_and_bertatruck.bandb_mod.common.lists.ListBottle;
import fr.bentur_and_bertatruck.bandb_mod.common.lists.ListLabels;
import fr.bentur_and_bertatruck.bandb_mod.common.loader.BandbItems;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fluids.Fluid;
import net.minecraftforge.fluids.FluidStack;

public class RecipeBarrelOak {

	
	public static final Map<List<String>, Integer> fluidAmount = new HashMap<List<String>, Integer>();
	public static final Map<List<String>, ItemStack> beverage = new HashMap<List<String>, ItemStack>();


	public static void addRecipe(Item item01, Fluid fluid,int amount, ItemStack itemstack) {
		List<String> inputRecipe = new ArrayList<String>();
		
		inputRecipe.add(item01.getUnlocalizedName());
		
		Collections.sort(inputRecipe);

		fluidAmount.put(inputRecipe, amount);
		beverage.put(inputRecipe, itemstack);
		
	}
	
	public static void addRecipe(Item item01, Item item02, Fluid fluid, int amount, ItemStack itemstack) {
		List<String> inputRecipe = new ArrayList<String>();

		inputRecipe.add(item01.getUnlocalizedName());
		inputRecipe.add(item02.getUnlocalizedName());

		Collections.sort(inputRecipe);

		fluidAmount.put(inputRecipe, amount);
		beverage.put(inputRecipe, itemstack);
		
	}
	
	public static ItemStack getBeverageResult(List<String> string) {
		Collections.sort(string);
		
		return beverage.get(string);
	
	}
	
	public static int getAmountFluidProvided(List<String> string){
		Collections.sort(string);

		return fluidAmount.get(string);

	}
	
}
