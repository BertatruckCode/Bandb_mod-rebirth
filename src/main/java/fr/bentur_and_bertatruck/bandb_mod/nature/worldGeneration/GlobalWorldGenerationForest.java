package fr.bentur_and_bertatruck.bandb_mod.nature.worldGeneration;

import java.util.Random;

import cpw.mods.fml.common.IWorldGenerator;
import fr.bentur_and_bertatruck.bandb_mod.common.lists.ListGenerationForestMushroom;
import fr.bentur_and_bertatruck.bandb_mod.common.lists.ListGenerationForestPlant;
import fr.bentur_and_bertatruck.bandb_mod.common.lists.ListGenerationForestTree;
import fr.bentur_and_bertatruck.bandb_mod.common.lists.ListGenerationForestTreeApple;
import fr.bentur_and_bertatruck.bandb_mod.common.lists.ListGenerationForestTreeHigh;
import fr.bentur_and_bertatruck.bandb_mod.common.loader.BandbBlocks;
import net.minecraft.world.World;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraft.world.chunk.IChunkProvider;

public class GlobalWorldGenerationForest implements IWorldGenerator{

	public void generate(Random rand, int X, int Z, World world, IChunkProvider chunkGenerator, IChunkProvider chunkProvider) {
		switch (world.provider.dimensionId) {
			case 0:
			this.generateSurface(world, X * 16, Z * 16, rand);		
		}
	}

	private void generateSurface(World world, int x, int z, Random rand) {
		// forestHills
		if (world.getBiomeGenForCoords(x, z).equals(BiomeGenBase.forest)) {			
			// trees
			for(int j = 0; j < ListGenerationForestTree.getListSize(); j++){	
	 			
	 			for (int i = 0; i < 8; i++){
					int x1 = x + rand.nextInt(16);
					int y1 = rand.nextInt(128);
					int z1 = z + rand.nextInt(16);
					(new WorldGenerationTreesFruit(ListGenerationForestTree.getBlocks(j)[0], ListGenerationForestTree.getBlocks(j)[1])).generate(world, rand, x1, y1, z1);	 				
	 			}	
	 		}
			// apple			
			for(int j = 0; j < ListGenerationForestTreeApple.getListSize(); j++){	
	 			
	 			for (int i = 0; i < 5; i++){
					int x1 = x + rand.nextInt(16);
					int y1 = rand.nextInt(128);
					int z1 = z + rand.nextInt(16);
					(new WorldGenerationTreesApple(ListGenerationForestTreeApple.getBlocks(j)[0], ListGenerationForestTreeApple.getBlocks(j)[1])).generate(world, rand, x1, y1, z1);	 				
	 			}	
	 		}
			// tree high			
			for(int j = 0; j < ListGenerationForestTreeHigh.getListSize(); j++){	
	 			
	 			for (int i = 0; i < 8; i++){
					int x1 = x + rand.nextInt(16);
					int y1 = rand.nextInt(128);
					int z1 = z + rand.nextInt(16);
					(new WorldGenerationTreesHigh(ListGenerationForestTreeHigh.getBlocks(j)[0], ListGenerationForestTreeHigh.getBlocks(j)[1])).generate(world, rand, x1, y1, z1);	 				
	 			}	
	 		}
			//plants
 			for(int k = 0; k < ListGenerationForestPlant.getListSize(); k++){	
	 			
	 			for (int i = 0; i < 20; i++){
					int x1 = x + rand.nextInt(16);
					int y1 = rand.nextInt(128);
					int z1 = z + rand.nextInt(16);
					(new WorldGenerationPlant(ListGenerationForestPlant.getBlocks(k))).generate(world, rand, x1, y1, z1);	 				
	 			}
 			}
 			// mushrooms
			for(int k = 0; k < ListGenerationForestMushroom.getListSize(); k++){	
	 			
	 			for (int i = 0; i < 20; i++){
					int x1 = x + rand.nextInt(16);
					int y1 = rand.nextInt(128);
					int z1 = z + rand.nextInt(16);
					(new WorldGenerationPlant(ListGenerationForestMushroom.getBlocks(k))).generate(world, rand, x1, y1, z1);	 				
	 			}
 			}

		}
		
		// Roofed Forest//
		if (world.getBiomeGenForCoords(x, z).equals(BiomeGenBase.roofedForest)) {
			//plants
 			for(int k = 0; k < ListGenerationForestPlant.getListSize(); k++){	
	 			
	 			for (int i = 0; i < 20; i++){
					int x1 = x + rand.nextInt(16);
					int y1 = rand.nextInt(128);
					int z1 = z + rand.nextInt(16);
					(new WorldGenerationPlant(ListGenerationForestPlant.getBlocks(k))).generate(world, rand, x1, y1, z1);	 				
	 			}
 			}
 			// mushrooms
			for(int k = 0; k < ListGenerationForestMushroom.getListSize(); k++){		 			

				for (int i = 0; i < 20; i++){
					int x1 = x + rand.nextInt(16);
					int y1 = rand.nextInt(128);
					int z1 = z + rand.nextInt(16);
					(new WorldGenerationMushroom(ListGenerationForestMushroom.getBlocks(k))).generate(world, rand, x1, y1, z1);	 				
	 			}
 			}
				
			for (int i = 0; i < 20; i++){
 				int x1 = x + rand.nextInt(16);
 				int y1 = rand.nextInt(128);
 				int z1 = z + rand.nextInt(16);
 				(new WorldGenerationPlant(BandbBlocks.blockBluebell)).generate(world, rand, x1, y1, z1);
			}
		}

	}

}
