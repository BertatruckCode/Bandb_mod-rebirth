package fr.bentur_and_bertatruck.bandb_mod.nature.block;

import java.util.List;
import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.BlockSapling;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;
import net.minecraft.world.World;
import net.minecraft.world.gen.feature.WorldGenerator;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import fr.bentur_and_bertatruck.bandb_mod.common.loader.BandbCreativeTabs;
import fr.bentur_and_bertatruck.bandb_mod.nature.construction.ConstructionTreesHight;

public class BlockTreeSaplingHight extends BlockSapling{
	Block blockleaves,blockwood;
		
		public BlockTreeSaplingHight(Block leaves, Block wood)	
		{	
		super();	
		float f = 0.4F;	
		setBlockBounds(0.5F - f, 0.0F, 0.5F - f, 0.5F + f, f * 2.0F, 0.5F + f);	
		this.setCreativeTab(BandbCreativeTabs.CreativeTabSapling);
		blockleaves= leaves;
		blockwood = wood;
		}
		 @SideOnly(Side.CLIENT)	
		 public IIcon getIcon(int side, int metadata)	
		 {	
			 return blockIcon;	
		 	}	

		 @SideOnly(Side.CLIENT)	
		 	public void registerBlockIcons(IIconRegister iiconRegister)	
		 	{	
			 this.blockIcon = iiconRegister.registerIcon(this.getTextureName());	
		 	}

		 @Override	
		 	public void func_149878_d(World world, int x, int y, int z, Random random)	
		 	{	
			 int l = world.getBlockMetadata(x, y, z) & 3;	
			 world.setBlockToAir(x, y, z);	
			 Object obj = null;	
			 //le WorldGenSavannaTree sera � remplacer par votre propre gen
		 		obj = new ConstructionTreesHight(true, blockleaves, blockwood);
		 			if(!((WorldGenerator)(obj)).generate(world, random, x, y, z))	
		 			{	
		 				world.setBlock(x, y, z, this, l, 3);	
		 			}	
		 	}

		 @SideOnly(Side.CLIENT)
		    public void getSubBlocks(Item item, CreativeTabs creativetabs, List list)
		    {
		        
			 	list.add(new ItemStack(item, 1 ,0));
		        }
		    
		 
		 protected boolean canPlaceBlockOn(Block block)
		 {
		 return block == Blocks.grass || block == Blocks.dirt;
		 }
}
