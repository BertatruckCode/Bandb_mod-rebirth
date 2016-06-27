package fr.bentur_and_bertatruck.bandb_mod.common.lists;

import java.util.ArrayList;
import java.util.List;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import fr.bentur_and_bertatruck.bandb_mod.common.loader.BandbItems;

public class ListLabels {

	public static List<ItemStack> Labels = new ArrayList<ItemStack>();
	protected static int numberLabel = 0;

	public static void addLabel(ItemStack item) {
		//System.out.println("adding Labels to the list " + Labels.size() + " = " + item.getItem().getUnlocalizedName());
		Labels.add(item);
		numberLabel++;
	}

	public static int getLabelQuantity(){	
		return Labels.size();
	}
	
	public static ItemStack getItem(int i){
		//System.out.println(Labels.get(i).getItem().getUnlocalizedName());
		return Labels.get(i);
	}
	
	

}
