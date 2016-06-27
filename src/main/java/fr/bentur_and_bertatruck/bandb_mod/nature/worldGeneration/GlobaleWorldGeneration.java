package fr.bentur_and_bertatruck.bandb_mod.nature.worldGeneration;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.world.World;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenMinable;
import cpw.mods.fml.common.IWorldGenerator;
import fr.bentur_and_bertatruck.bandb_mod.common.loader.BandbBlocks;

public class GlobaleWorldGeneration implements IWorldGenerator 
{
	public void generate(Random random, int chunkX, int chunkZ, World world, IChunkProvider chunkGenerator, IChunkProvider chunkProvider)
	{

		switch(world.provider.dimensionId)
	{

			case -1:
					
				generateNether(world, random, chunkX * 16, chunkZ * 16);
				break;

			case 0:
				generateSurface(world, random, chunkX * 16, chunkZ * 16);
				break;

			case 1:
				generateEnd(world, random, chunkX * 16, chunkZ * 16);
				break;

		}

	}

	private void generateEnd(World world, Random random, int x, int z) {

	}

	private void generateSurface(World world, Random rand, int x, int z) {

		 for(int i = 0; i < 5; i++)
		 {
			 (new WorldGenMinable(BandbBlocks.blockTruffle, 0, 5, Blocks.dirt)).generate(world, rand, x + rand.nextInt(16), 48 + rand.nextInt(16), z + rand.nextInt(16));	
			 
		 }

		 //ore block drop
		 
		 for(int i = 0; i < 3; i++)
		 {
			 (new WorldGenMinable(BandbBlocks.blockOreAluminium, 0, 3, Blocks.stone)).generate(world, rand, x + rand.nextInt(16), 16 + rand.nextInt(16), z + rand.nextInt(16));	
			 
		 }
		 
		 
		 for(int i = 0; i < 4; i++)
		 {
			 (new WorldGenMinable(BandbBlocks.blockOrePlatinum, 0, 4, Blocks.stone)).generate(world, rand, x + rand.nextInt(16), 16 + rand.nextInt(8), z + rand.nextInt(16));	
			
		 }
		 
		 for(int i = 0; i < 1; i++)
		 {
			 (new WorldGenMinable(BandbBlocks.blockOreTitan, 0, 4, Blocks.stone)).generate(world, rand, x + rand.nextInt(16),rand.nextInt(64), z + rand.nextInt(16));	
			 
		 }
		 
		 //ore gem drop
		 for(int i = 0; i < 3; i++)
		 {
			 (new WorldGenMinable(BandbBlocks.blockOreAmethyst, 0, 3, Blocks.stone)).generate(world, rand, x + rand.nextInt(16),16 + rand.nextInt(16), z + rand.nextInt(16));	
			
		 }
		 
		 for(int i = 0; i < 3; i++)
		 {
			 (new WorldGenMinable(BandbBlocks.blockOreJade, 0, 3, Blocks.stone)).generate(world, rand, x + rand.nextInt(16),rand.nextInt(32), z + rand.nextInt(16));	
			
		 }		
		 for(int i = 0; i < 3; i++)
		 {
			 (new WorldGenMinable(BandbBlocks.blockOreOnyx, 0, 4, Blocks.stone)).generate(world, rand, x + rand.nextInt(16),24 + rand.nextInt(8), z + rand.nextInt(16));	
			 
		 }
		 for(int i = 0; i < 3; i++)
		 {
			 (new WorldGenMinable(BandbBlocks.blockOreOpal, 0, 4, Blocks.stone)).generate(world, rand, x + rand.nextInt(16),24 + rand.nextInt(8), z + rand.nextInt(16));	
			 
		 }
		 for(int i = 0; i < 3; i++)
		 {
			 (new WorldGenMinable(BandbBlocks.blockOreRuby, 0, 4, Blocks.stone)).generate(world, rand, x + rand.nextInt(16),24 + rand.nextInt(24), z + rand.nextInt(16));	
			 
		 }
		 for(int i = 0; i < 3; i++)
		 {
			 (new WorldGenMinable(BandbBlocks.blockOreSapphire, 0, 4, Blocks.stone)).generate(world, rand, x + rand.nextInt(16),24 + rand.nextInt(24), z + rand.nextInt(16));	
			 
		 }
		 for(int i = 0; i < 3; i++)
		 {
			 (new WorldGenMinable(BandbBlocks.blockOreTopaz, 0, 4, Blocks.stone)).generate(world, rand, x + rand.nextInt(16),24 + rand.nextInt(24), z + rand.nextInt(16));	
			
		 }
		 if(world.getBiomeGenForCoords(x, z).equals(BiomeGenBase.ocean))
	 	    {
		 for(int i = 0; i < 3; i++)
		 {
			 (new WorldGenMinable(BandbBlocks.blockOreSalt, 0, 4, Blocks.stone)).generate(world, rand, x + rand.nextInt(16),24 + rand.nextInt(24), z + rand.nextInt(16));	
			 
		 }
	  }
		 if(world.getBiomeGenForCoords(x, z).equals(BiomeGenBase.river))
	 	    {
		 for(int i = 0; i < 2; i++)
		 {
			 (new WorldGenMinable(BandbBlocks.blockOreSalt, 0, 4, Blocks.stone)).generate(world, rand, x + rand.nextInt(16),24 + rand.nextInt(24), z + rand.nextInt(16));	
			 
		 }
	  }
		 if(world.getBiomeGenForCoords(x, z).equals(BiomeGenBase.beach))
	 	    {
		 for(int i = 0; i < 2; i++)
		 {
			 (new WorldGenMinable(BandbBlocks.blockOreSalt, 0, 4, Blocks.stone)).generate(world, rand, x + rand.nextInt(16),24 + rand.nextInt(24), z + rand.nextInt(16));	
			 
		 }
	}
	}
	private void generateNether(World world, Random random, int x, int z) {

	}
	public void addOreSpawn(Block block, int metadata, Block target, World world, Random random, int blockXPos, int blockZPos, int maxX, int maxZ, int maxVeinSize, int chancesToSpawn, int minY, int maxY) {

		assert maxY > minY : "La position Y maximum doit �tre sup�rieure � la position Y minimum.";
		assert maxX > 0 && maxX <= 16 : "X doit se trouver entre 0 et 16.";
		assert minY > 0 : "La position Y minimum doit �tre sup�rieure � 0.";
		assert maxY < 256 && maxY > 0 : "La position Y maximum doit se trouver entre 0 et 256.";
		assert maxZ > 0 && maxZ <= 16 : "Z doit se trouver entre 0 et 16.";

		for(int i = 0; i < chancesToSpawn; i++)
		{

		int posY = random.nextInt(128);

		if((posY <= maxY) && (posY >= minY))
		{

		(new WorldGenMinable(block, metadata, maxVeinSize, target)).generate(world, random, blockXPos + random.nextInt(16), posY, blockZPos + random.nextInt(16));

		}

		}

		}

}
