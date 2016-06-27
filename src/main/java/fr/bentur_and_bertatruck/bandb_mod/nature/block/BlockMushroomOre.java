package fr.bentur_and_bertatruck.bandb_mod.nature.block;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;
import fr.bentur_and_bertatruck.bandb_mod.common.loader.BandbItems;

public class BlockMushroomOre extends Block {
	Item itemDrop ;
	
	public BlockMushroomOre(Item item) {

		super(Material.ground);
		itemDrop = item;
	}

	public int quantityDropped(Random rand) {

		return 1 + rand.nextInt(2);

	}

	public Item getItemDropped(int metadata, Random rand, int fortune) {
		
		return itemDrop;
	}
}