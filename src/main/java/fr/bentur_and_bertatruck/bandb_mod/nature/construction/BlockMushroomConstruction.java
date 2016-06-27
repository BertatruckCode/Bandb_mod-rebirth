package fr.bentur_and_bertatruck.bandb_mod.nature.construction;

import java.util.Random;

import fr.bentur_and_bertatruck.bandb_mod.common.Bandb_mod;
import fr.bentur_and_bertatruck.bandb_mod.common.loader.BandbItems;
import net.minecraft.block.Block;
import net.minecraft.block.BlockChest;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.inventory.IInventory;
import net.minecraft.tileentity.TileEntityChest;
import net.minecraft.util.WeightedRandomChestContent;
import net.minecraft.world.World;

public class BlockMushroomConstruction {
	Block blockMushroom;
	/*
	public static final WeightedRandomChestContent[] snipersChestContent = new WeightedRandomChestContent[] {
			new WeightedRandomChestContent(BandbItems.itemAbiu, 0, 5, 10, 10),
			new WeightedRandomChestContent(Items.bow, 150, 1, 1, 10),
			new WeightedRandomChestContent(Items.arrow, 0, 10, 15, 15)};
	*/
	public BlockMushroomConstruction(boolean gen, Block block){
		super();
		blockMushroom = block;
	}

	 public boolean generate(World world, Random rand, int x, int y, int z){		
		world.setBlock(x , y , z , blockMushroom);
		/*
		world.setBlock(x, y + 1, z, Blocks.chest);
		TileEntityChest entityChest = (TileEntityChest) world.getTileEntity(x, y + 1, z);
		if (entityChest != null && !world.isRemote) {
			WeightedRandomChestContent.generateChestContents(rand, snipersChestContent, (IInventory)entityChest, 3);
		}
		*/
		return true;
	}
}
