package fr.bentur_and_bertatruck.bandb_mod.common;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.util.IIcon;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import fr.bentur_and_bertatruck.bandb_mod.common.loader.BandbCreativeTabs;

public class blockDecorationGlass extends Block{

	public blockDecorationGlass(Material p_i45408_1_)
    {
        super(p_i45408_1_);
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
	 /**
	     * Returns which pass should this block be rendered on. 0 for solids and 1 for alpha
	     */
	    @SideOnly(Side.CLIENT)
	    public int getRenderBlockPass()
	    {
	        return 1;
	    }

	    /**
	     * If this block doesn't render as an ordinary block it will return False (examples: signs, buttons, stairs, etc)
	     */
	    public boolean renderAsNormalBlock()
	    {
	        return false;
	    }
	   
	    public boolean isOpaqueCube()
	    {
	        return false;
	    }


}
