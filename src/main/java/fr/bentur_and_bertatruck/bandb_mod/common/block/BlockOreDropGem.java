package fr.bentur_and_bertatruck.bandb_mod.common.block;

import java.util.Random;

import fr.bentur_and_bertatruck.bandb_mod.common.loader.BandbCreativeTabs;
import fr.bentur_and_bertatruck.bandb_mod.common.loader.BandbItems;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.util.MathHelper;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

public class BlockOreDropGem extends Block {
	Item itemDrop;
	int bonusDrop;

	public BlockOreDropGem(Material material,float hardness,int harvestLevel,Item drop,int proba) {
		super(material);
		this.setHardness(hardness);
		this.setHarvestLevel("pickaxe",harvestLevel);
		this.setStepSound(Block.soundTypeStone);
		this.setCreativeTab(BandbCreativeTabs.CreativeTabsOre);
		itemDrop = drop;
		bonusDrop = proba;
	}
	 @Override	
	 	public int quantityDropped(Random random)	
	 	{	
		 return 1 + random.nextInt(bonusDrop);	
	 	}	

	 @Override	
	 	public Item getItemDropped(int metadata, Random random, int par3)	
	 	{	
		 return itemDrop;
	 	}
	 	 
	 public void dropBlockAsItemWithChance(World p_149690_1_, int p_149690_2_, int p_149690_3_, int p_149690_4_, int p_149690_5_, float p_149690_6_, int p_149690_7_)
	    {
	        super.dropBlockAsItemWithChance(p_149690_1_, p_149690_2_, p_149690_3_, p_149690_4_, p_149690_5_, p_149690_6_, p_149690_7_);
	    }

	    private Random rand = new Random();
	    
	    
	    @Override	    
	    public int getExpDrop(IBlockAccess p_149690_1_, int p_149690_5_, int p_149690_7_)
	    {
	        return 5;
	    }

}

