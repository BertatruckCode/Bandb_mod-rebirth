package fr.bentur_and_bertatruck.bandb_mod.nature.block;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.BlockBush;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.util.IIcon;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import fr.bentur_and_bertatruck.bandb_mod.common.loader.BandbCreativeTabs;
import fr.bentur_and_bertatruck.bandb_mod.common.loader.BandbItems;

public class BlockMushroom extends BlockBush 
{
	Item itemDrop;
	
	 public BlockMushroom(Item drop,float f,float f1,float f2,float f3, float f4, float f5, float f6)	
	 {	
	 super();		
	 setBlockBounds(f1 - f, f2, f3 - f, f4 + f, f * f5, f6 + f);	
	 this.setCreativeTab(BandbCreativeTabs.CreativeTabsMushroom);
	 itemDrop = drop;
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


	 protected boolean canPlaceBlockOn(Block block)
	 {
	 return block == Blocks.grass || block == Blocks.dirt || block == Blocks.stone;
	 }

	 @Override	
	 public int quantityDropped(Random random)	
	 {	
	 return random.nextInt(2)+1;	
	 }	

	 @Override	
	 public Item getItemDropped(int metadata, Random random, int par3)	
	 {	
	 return itemDrop;
	 }

	 


}
