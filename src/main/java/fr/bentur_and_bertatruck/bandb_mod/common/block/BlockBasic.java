package fr.bentur_and_bertatruck.bandb_mod.common.block;

import fr.bentur_and_bertatruck.bandb_mod.common.Bandb_mod;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.util.IIcon;

public class BlockBasic extends Block{

	public BlockBasic(Material material) {
		super(material);
		
		//setBlockTextureName(Bandb_mod.MODID + ":miscellaneous/" + this.getUnlocalizedName().substring(5));
		setHardness(5.0F);
		setResistance(1.0F);
		
	}
	
	 public void registerBlockIcons(IIconRegister iiconRegister)
	 {
	 this.blockIcon = iiconRegister.registerIcon(Bandb_mod.MODID + ":miscellaneous/"+ this.getUnlocalizedName().substring(5));
	 }

	 public IIcon getIcon(int side, int metadata)
	 {
		 return this.blockIcon;
	 }

}
