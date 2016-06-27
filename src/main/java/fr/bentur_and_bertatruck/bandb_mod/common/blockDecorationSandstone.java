package fr.bentur_and_bertatruck.bandb_mod.common;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.util.IIcon;
import fr.bentur_and_bertatruck.bandb_mod.common.loader.BandbCreativeTabs;

public class blockDecorationSandstone extends Block{

	private IIcon top;
	
	public blockDecorationSandstone(Material rock) {
		super(rock);
		this.setCreativeTab(BandbCreativeTabs.CreativeTabsDecorationBlock);
		this.setHardness(2.0F);
		this.setResistance(10.0F);
		}

	 public void registerBlockIcons(IIconRegister iiconRegister)
	 {
	 this.blockIcon = iiconRegister.registerIcon(Bandb_mod.MODID + ":decoration/"+ this.getUnlocalizedName().substring(5)+ "_side");
	 this.top = iiconRegister.registerIcon(Bandb_mod.MODID + ":decoration/"+ this.getUnlocalizedName().substring(5)+"_top");
	 }

	 public IIcon getIcon(int side, int metadata)
	 {
	 if(side == 0)
		 return this.top;
	 else if(side == 1)
		 return this.top;
	 return this.blockIcon;
	 }
}
