package fr.bentur_and_bertatruck.bandb_mod.nature.block;

import net.minecraft.block.Block;
import net.minecraft.block.BlockLog;
import net.minecraft.block.BlockSlab;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.util.IIcon;
import fr.bentur_and_bertatruck.bandb_mod.common.Bandb_mod;
import fr.bentur_and_bertatruck.bandb_mod.common.loader.BandbCreativeTabs;

	public class BlockTreePlank extends Block
	{
		public BlockTreePlank()
		{
			super(Material.wood);	
			this.setCreativeTab(BandbCreativeTabs.CreativeTabsWood);
			
			this.setHardness(2.0F);
			this.setHarvestLevel("axe",0);
			this.setStepSound(Block.soundTypeWood);

		}	 

		 public void registerBlockIcons(IIconRegister iiconRegister)
		 {
			 this.blockIcon = iiconRegister.registerIcon(Bandb_mod.MODID + ":plank/" + this.getUnlocalizedName().substring(5));
		 }

		 public IIcon getIcon(int side, int metadata)
		 {
			 return this.blockIcon;
		 }

	
}
