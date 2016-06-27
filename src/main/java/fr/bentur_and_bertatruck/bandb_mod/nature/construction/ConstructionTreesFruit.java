package fr.bentur_and_bertatruck.bandb_mod.nature.construction;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.world.World;
import net.minecraft.world.gen.feature.WorldGenerator;

public class ConstructionTreesFruit extends WorldGenerator {

	private Block leaves ;
	private Block wood ;

	
	public ConstructionTreesFruit(boolean gen , Block leaves, Block wood )
	 {
	 super(gen);
	 this.leaves = leaves ;
	 this.wood = wood;			 
	 }
	
	 public boolean generate(World world, Random rand, int x, int y, int z)
	 {
		 if ( 		
				   world.isAirBlock(x, y+1, z) 
				&& world.isAirBlock(x, y+2, z) 
				&& world.isAirBlock(x, y+3, z) 
				&& world.isAirBlock(x, y+4, z) 
				&& world.isAirBlock(x, y+5, z) 
				
				&& world.isAirBlock(x+1 ,y +2,z )
				&& world.isAirBlock(x-1 ,y +2,z )
				&& world.isAirBlock(x ,y +2,z+1 )
				&& world.isAirBlock(x ,y +2,z-1 )
				
				&& world.isAirBlock(x+1 ,y +3,z )
				&& world.isAirBlock(x-1 ,y +3,z )
				&& world.isAirBlock(x ,y +3,z+1 )
				&& world.isAirBlock(x ,y +3,z-1 )
				
				&& world.isAirBlock(x+1 ,y +3,z )
				&& world.isAirBlock(x-1 ,y +3,z )
				&& world.isAirBlock(x ,y +3,z+1 )
				&& world.isAirBlock(x ,y +3,z-1 )

				&& world.isAirBlock(x+1 ,y +3,z+1 )
				&& world.isAirBlock(x-1 ,y +3,z+1 )
				&& world.isAirBlock(x-1 ,y +3,z-1 )
				&& world.isAirBlock(x+1 ,y +3,z-1 )

				&& world.isAirBlock(x+1 ,y +4,z )
				&& world.isAirBlock(x-1 ,y +4,z )
				&& world.isAirBlock(x ,y +4,z+1 )
				&& world.isAirBlock(x ,y +4,z-1 )

				){
			for(int i = 0; i < 5; i++)
			{
			world.setBlock(x , y + i, z , wood);
			}

			//y == 7
			world.setBlock(x , y + 6 , z , leaves);
			
			//y == 3
			
			for (int i = 0; i<3; i++) {
					
				world.setBlock(x+i-1 , y+2 , z-2 , leaves);
				}
			
			for (int i = 0; i<5; i++) {
					world.setBlock(x+i-2 , y+2 , z-1 , leaves);
					}
			
			for (int i = 0; i<5; i++) {
					world.setBlock(x+i-2 , y+2 , z+1 , leaves);
					}
			
			for (int i = 0; i<3; i++) {
					world.setBlock(x+i-1 , y+2 , z+2 , leaves);
					}
			world.setBlock(x+2 , y+2 , z , leaves);
			world.setBlock(x-2 , y+2 , z , leaves);
			world.setBlock(x+1 , y+2 , z , leaves);
			world.setBlock(x-1 , y+2 , z , leaves);
			
		//y == 4
			
			for (int i = 0; i<5; i++) {
					world.setBlock(x+i-2 , y+3 , z-2 , leaves);
					}
				
			for (int i = 0; i<5; i++) {
					world.setBlock(x+i-2 , y+3 , z-1 , leaves);
					}
				
			for (int i = 0; i<5; i++) {
					world.setBlock(x+i-2 , y+3 , z+1 , leaves);
					}
				
			for (int i = 0; i<5; i++) {
					world.setBlock(x+i-2 , y+3 , z+2 , leaves);
					}
			
			world.setBlock(x+2 , y+3 , z , leaves);
			world.setBlock(x-2 , y+3 , z , leaves);
			world.setBlock(x+1 , y+3 , z , leaves);
			world.setBlock(x-1 , y+3 , z , leaves);
			
			//y == 5
			
			for (int i = 0; i<3; i++) {
				world.setBlock(x+i-1 , y+4 , z-2 , leaves);
				}
								
			for (int i = 0; i<5; i++) {
					world.setBlock(x+i-2 , y+4 , z-1 , leaves);
					}				
				
			for (int i = 0; i<5; i++) {
					world.setBlock(x+i-2 , y+4 , z+1 , leaves);
					}				
				
			for (int i = 0; i<3; i++) {
					world.setBlock(x+i-1 , y+4 , z+2 , leaves);
					}
			
			world.setBlock(x+2 , y+4 , z , leaves);
			world.setBlock(x-2 , y+4 , z , leaves);
			world.setBlock(x+1 , y+4 , z , leaves);
			world.setBlock(x-1 , y+4 , z , leaves);
			
			//y == 6
			
			world.setBlock(x+1 , y + 5 , z+1 , leaves);
			world.setBlock(x+1 , y + 5 , z   , leaves);
			world.setBlock(x+1 , y + 5 , z-1 , leaves);
			world.setBlock(x   , y + 5 , z+1 , leaves);
			world.setBlock(x   , y + 5 , z   , leaves);
			world.setBlock(x   , y + 5 , z-1 , leaves);
			world.setBlock(x-1 , y + 5 , z+1 , leaves);
			world.setBlock(x-1 , y + 5 , z   , leaves);
			world.setBlock(x-1 , y + 5 , z-1 , leaves);
			
			return true;
			
	 }
	return false ;
}
}

