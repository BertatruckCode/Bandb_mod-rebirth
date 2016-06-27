package fr.bentur_and_bertatruck.bandb_mod.common;

import fr.bentur_and_bertatruck.bandb_mod.common.loader.BandbCreativeTabs;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.util.IIcon;

public class blockDecoration extends Block{

	public blockDecoration(Material rock) {
		super(rock);
		this.setCreativeTab(BandbCreativeTabs.CreativeTabsDecorationBlock);
		this.setHardness(2.0F);
		this.setResistance(10.0F);
		
	}

	 public void registerBlockIcons(IIconRegister iiconRegister)
	 {
	 this.blockIcon = iiconRegister.registerIcon(Bandb_mod.MODID + ":decoration/"+ this.getUnlocalizedName().substring(5));
	 }

	 public IIcon getIcon(int side, int metadata)
	 {
		 return this.blockIcon;
	 }

}
