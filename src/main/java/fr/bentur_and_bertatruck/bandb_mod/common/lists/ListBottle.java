package fr.bentur_and_bertatruck.bandb_mod.common.lists;

import java.util.ArrayList;
import java.util.List;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import fr.bentur_and_bertatruck.bandb_mod.common.loader.BandbItems;

public class ListBottle {

	public static List<ItemStack> Bottle = new ArrayList<ItemStack>();
	protected static int numberbottle = 0;

	public static void addBottle(ItemStack item) {
		//System.out.println("adding Bottle to the list " + Bottle.size() + " = " + item.getItem().getUnlocalizedName());
		Bottle.add(item);
		numberbottle++;
	}

	public static int getBottleQuantity(){	
		return Bottle.size();
	}
	
	public static ItemStack getItem(int i){
		//System.out.println(Bottle.get(i).getItem().getUnlocalizedName());
		return Bottle.get(i);
	}
	
	

}
