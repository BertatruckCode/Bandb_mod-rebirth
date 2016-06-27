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

public class RecipeBarrelSpruce {

	
	public static final Map<List<String>, Fluid> fluidType = new HashMap<List<String>, Fluid>();
	public static final Map<List<String>, Integer> fluidAmount = new HashMap<List<String>, Integer>();
	public static final Map<String, ItemStack> beverage = new HashMap<String, ItemStack>();


	public static void addRecipe(Item item01, Fluid fluid, int amount, ItemStack itemstack) {
		List<String> inputRecipe = new ArrayList<String>();
		
		inputRecipe.add(item01.getUnlocalizedName());
		
		Collections.sort(inputRecipe);

		fluidType.put(inputRecipe, fluid);
		fluidAmount.put(inputRecipe, amount);
		beverage.put(fluid.getUnlocalizedName(), itemstack);
		
	}
	
	public static void addRecipe(Item item01, Item item02, Fluid fluid, int amount, ItemStack itemstack) {
		List<String> inputRecipe = new ArrayList<String>();

		inputRecipe.add(item01.getUnlocalizedName());
		inputRecipe.add(item02.getUnlocalizedName());

		Collections.sort(inputRecipe);

		fluidType.put(inputRecipe, fluid);
		fluidAmount.put(inputRecipe, amount);
		beverage.put(fluid.getUnlocalizedName(), itemstack);
		
	}
	
	public static ItemStack getBeverageResult(String fluid) {
	 
		return beverage.get(fluid);
	
	}
	
	public static Fluid getFluid(List<String> string){
		Collections.sort(string);

		return fluidType.get(string);

	}
	
	public static int getAmountFluidProvided(List<String> string){
		Collections.sort(string);

		return fluidAmount.get(string);

	}
	
}
