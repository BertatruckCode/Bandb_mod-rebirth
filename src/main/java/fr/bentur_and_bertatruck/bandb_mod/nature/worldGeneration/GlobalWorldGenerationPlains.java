package fr.bentur_and_bertatruck.bandb_mod.nature.worldGeneration;

import java.util.Random;

import cpw.mods.fml.common.IWorldGenerator;
import fr.bentur_and_bertatruck.bandb_mod.common.lists.ListGenerationPlainPlant;
import net.minecraft.world.World;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraft.world.chunk.IChunkProvider;

public class GlobalWorldGenerationPlains implements IWorldGenerator{

	public void generate(Random rand, int X, int Z, World world, IChunkProvider chunkGenerator, IChunkProvider chunkProvider){
		switch(world.provider.dimensionId){
			case 0:
			this.generateSurface(world, X * 16, Z * 16, rand);
		}
	}
	
	private void generateSurface(World world, int x, int z, Random rand){			
	 	if(world.getBiomeGenForCoords(x, z).equals(BiomeGenBase.plains)){
	 		//plants
	 		for(int k = 0; k < ListGenerationPlainPlant.getListSize(); k++){		 			

				for (int i = 0; i < 20; i++){
					int x1 = x + rand.nextInt(16);
					int y1 = rand.nextInt(128);
					int z1 = z + rand.nextInt(16);
					(new WorldGenerationPlant(ListGenerationPlainPlant.getBlocks(k))).generate(world, rand, x1, y1, z1);	 				
	 			}
 			}		
 			
	 	}	    
 	}	 	
	 
 }



