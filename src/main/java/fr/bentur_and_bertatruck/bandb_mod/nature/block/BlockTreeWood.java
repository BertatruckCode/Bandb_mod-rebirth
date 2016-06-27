package fr.bentur_and_bertatruck.bandb_mod.nature.block;

import net.minecraft.block.BlockLog;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.util.IIcon;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import fr.bentur_and_bertatruck.bandb_mod.common.loader.BandbCreativeTabs;

public class BlockTreeWood extends BlockLog 
{
	private IIcon topIcon;		
	
	public BlockTreeWood(Material material)
	{   
		super();
		this.setHardness(2.0F);
        this.setStepSound(soundTypeWood);
        this.setCreativeTab(BandbCreativeTabs.CreativeTabsWood);
	}
	
	public BlockTreeWood() {
		
	}

	@SideOnly(Side.CLIENT)
	public void registerBlockIcons(IIconRegister iconregister)	
	{	
	blockIcon = iconregister.registerIcon(this.getTextureName());	
	topIcon = iconregister.registerIcon(this.getTextureName() + "_top");	
	}
	
	@Override	
	public IIcon getIcon(int side, int metadata)	
	{
	int k = metadata & 12;	
	return k == 0 && (side == 1 || side == 0) ? topIcon : (k == 4 && (side == 5 || side == 4) ? topIcon : (k == 8 && (side == 2 || side == 3) ? topIcon : blockIcon));		
	}	
	
}

