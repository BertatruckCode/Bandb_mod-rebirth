package fr.bentur_and_bertatruck.bandb_mod.common.lists;

import java.util.ArrayList;
import java.util.List;

import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import fr.bentur_and_bertatruck.bandb_mod.common.loader.BandbItems;

public class ListGenerationJungleTree {

	public static List<Block[]> block = new ArrayList<Block[]>();

	public static void add(Block b1, Block b2){
		Block b[] = {b1, b2};
		block.add(b);
	}

	public static int getListSize(){	
		return block.size();
	}
	
	public static Block[] getBlocks(int i){
		return block.get(i);
	}
	
	

}
