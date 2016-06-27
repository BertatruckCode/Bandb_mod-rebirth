package fr.bentur_and_bertatruck.bandb_mod.nature.worldGeneration;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenerator;
import cpw.mods.fml.common.IWorldGenerator;
import fr.bentur_and_bertatruck.bandb_mod.nature.construction.BlockMushroomConstruction;

public class WorldGenerationMushroom extends WorldGenerator implements IWorldGenerator {
	
	Block blockMushroom;
	
	public WorldGenerationMushroom(Block block){
		blockMushroom = block;
	}

	@Override
	public boolean generate(World world, Random random, int x, int y, int z) {

		if (world.getBlock(x, y - 1, z) == Blocks.grass
				|| world.getBlock(x, y - 1, z) == Blocks.stone
				&& world.isAirBlock(x, y, z)) {
			new BlockMushroomConstruction(true,blockMushroom).generate(world, random, x,y, z);
			return true;
		}

		else {
			return false;
		}

	}

	public void generate(Random random, int chunkX, int chunkZ, World world,
			IChunkProvider chunkGenerator, IChunkProvider chunkProvider) {

	}

}