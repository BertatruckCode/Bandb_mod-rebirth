package fr.bentur_and_bertatruck.bandb_mod.nature.construction;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.world.World;
import net.minecraft.world.gen.feature.WorldGenerator;

public class ConstructionTreesHight extends WorldGenerator {

	private Block leaves ;
	private Block wood ;

	
	public ConstructionTreesHight(boolean gen , Block leaves, Block wood )
	 {
	 super(gen);
	 this.leaves = leaves ;
	 this.wood = wood;
			 
	 }

	 public boolean generate(World world, Random rand, int x, int y, int z)
	 {
			for(int i = 0; i < 10; i++)
			{
			world.setBlock(x , y + i, z , wood);
			}

			world.setBlock(x , y + 10 , z , leaves);
			world.setBlock(x , y + 11 , z , leaves);

			for(int i = 9; i < 12; i++)
			{
			world.setBlock(x + 1 , y + i , z , leaves);
			world.setBlock(x - 1 , y + i , z , leaves);
			world.setBlock(x , y + i , z + 1 , leaves);
			world.setBlock(x , y + i , z - 1 , leaves);

			}
			world.setBlock(x + 1 , y + 5 , z , leaves);
			world.setBlock(x - 1 , y + 5 , z , leaves);
			world.setBlock(x , y + 5 , z + 1 , leaves);
			world.setBlock(x , y + 5 , z - 1 , leaves);

			world.setBlock(x + 2 , y + 9 , z , leaves);
			world.setBlock(x - 2 , y + 9 , z , leaves);
			world.setBlock(x , y + 9 , z + 2 , leaves);
			world.setBlock(x , y + 9 , z - 2 , leaves);

			world.setBlock(x + 1 , y + 9 , z + 1, leaves);
			world.setBlock(x - 1 , y + 9 , z - 1, leaves);
			world.setBlock(x - 1 , y + 9 , z + 1, leaves);
			world.setBlock(x +1 , y + 9 , z - 1 , leaves);
			
			return true;
		}
	}
