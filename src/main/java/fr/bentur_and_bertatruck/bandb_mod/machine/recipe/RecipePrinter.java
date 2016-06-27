package fr.bentur_and_bertatruck.bandb_mod.machine.recipe;

import java.util.HashMap;
import java.util.Map;

import fr.bentur_and_bertatruck.bandb_mod.common.lists.ListLabels;
import fr.bentur_and_bertatruck.bandb_mod.common.loader.BandbItems;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class RecipePrinter {

	
	public static final Map<String, Integer> AmountInkBlack = new HashMap<String, Integer>();
	public static final Map<String, Integer> AmountInkCyan = new HashMap<String, Integer>();
	public static final Map<String, Integer> AmountInkMagenta = new HashMap<String, Integer>();
	public static final Map<String, Integer> AmountInkYellow = new HashMap<String, Integer>();

	public static void addRecipe(Item item, int amountInkBlack, int amountInkCyan, int amountInkMagenta, int amountInkYellow) {

		AmountInkBlack.put(item.getUnlocalizedName(), amountInkBlack);
		AmountInkCyan.put(item.getUnlocalizedName(), amountInkCyan);
		AmountInkMagenta.put(item.getUnlocalizedName(), amountInkMagenta);
		AmountInkYellow.put(item.getUnlocalizedName(), amountInkYellow);
		
		ListLabels.addLabel(new ItemStack(item));
	}

	public static int getAmountInkBlackNeeded(Item item) {

		if(AmountInkBlack.get(item.getUnlocalizedName()) != null)
		return AmountInkBlack.get(item.getUnlocalizedName());
		else return 0;
	}
	public static int getAmountInkCyanNeeded(Item item) {

		if(AmountInkCyan.get(item.getUnlocalizedName()) != null)
		return AmountInkCyan.get(item.getUnlocalizedName());
		else return 0;
	}
	public static int getAmountInkMagentaNeeded(Item item) {

		if(AmountInkMagenta.get(item.getUnlocalizedName()) != null)
		return AmountInkMagenta.get(item.getUnlocalizedName());
		else return 0;
	}
	public static int getAmountInkYellowNeeded(Item item) {

		if(AmountInkYellow.get(item.getUnlocalizedName()) != null)
		return AmountInkYellow.get(item.getUnlocalizedName());
		else return 0;
	}

}
