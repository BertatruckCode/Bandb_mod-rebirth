package fr.bentur_and_bertatruck.bandb_mod.nature.construction;

import java.util.Random;

import fr.bentur_and_bertatruck.bandb_mod.common.Bandb_mod;
import fr.bentur_and_bertatruck.bandb_mod.common.loader.BandbItems;
import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.inventory.IInventory;
import net.minecraft.tileentity.TileEntityChest;
import net.minecraft.util.WeightedRandomChestContent;
import net.minecraft.world.World;

public class BlockPlantConstruction {
	Block blockPlant;
		
	public BlockPlantConstruction(boolean gen, Block block){
	 super();
	 blockPlant = block;
	 }

	 public boolean generate(World world, Random rand, int x, int y, int z){		
		world.setBlock(x , y , z , blockPlant);
		return true;
		}
}
