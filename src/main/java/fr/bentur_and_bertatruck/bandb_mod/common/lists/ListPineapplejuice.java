package fr.bentur_and_bertatruck.bandb_mod.common.lists;

import java.util.ArrayList;
import java.util.List;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import fr.bentur_and_bertatruck.bandb_mod.common.loader.BandbItems;

public class ListPineapplejuice {

	public static List<Item> Pineapplejuice = new ArrayList<Item>();

	public static void add(Item item) {
		//System.out.println("adding pineapple to the list " + Pineapple.size() + " = " + item.getUnlocalizedName());
		Pineapplejuice.add(item);
	}

	public static int getListSize(){	
		return Pineapplejuice.size();
	}
	
	public static Item getItem(int i){
		//System.out.println(Labels.get(i).getItem().getUnlocalizedName());
		return Pineapplejuice.get(i);
	}
	
	

}
