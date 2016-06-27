package fr.bentur_and_bertatruck.bandb_mod.common.lists;

import java.util.ArrayList;
import java.util.List;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import fr.bentur_and_bertatruck.bandb_mod.common.loader.BandbItems;

public class ListAppleJuice {

	public static List<Item> AppleJuice = new ArrayList<Item>();

	public static void add(Item item) {
		//System.out.println("adding pineapple to the list " + Pineapple.size() + " = " + item.getUnlocalizedName());
		AppleJuice.add(item);
	}

	public static int getListSize(){	
		return AppleJuice.size();
	}
	
	public static Item getItem(int i){
		//System.out.println(Labels.get(i).getItem().getUnlocalizedName());
		return AppleJuice.get(i);
	}
	
	

}
