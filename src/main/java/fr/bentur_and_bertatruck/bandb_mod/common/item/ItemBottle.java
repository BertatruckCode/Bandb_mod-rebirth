package fr.bentur_and_bertatruck.bandb_mod.common.item;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.Item;
import net.minecraft.util.IIcon;
import fr.bentur_and_bertatruck.bandb_mod.common.Bandb_mod;
import fr.bentur_and_bertatruck.bandb_mod.common.loader.BandbCreativeTabs;

public class ItemBottle extends Item {
	
	
	public ItemBottle() {
		this.setMaxStackSize(32);
		this.setCreativeTab(BandbCreativeTabs.CreativeTabsBottle);
		
	}
	
	@SideOnly(Side.CLIENT)
	public IIcon getIcon(int side, int metadata) {
		return itemIcon;
	}

	@SideOnly(Side.CLIENT)
	public void registerIcons(IIconRegister iiconRegister) {
		this.itemIcon = iiconRegister.registerIcon(Bandb_mod.MODID + ":bottle/" + this.getTextureName());
		//System.out.println(this.getTextureName());
	}
	
	public String getTextureName(){
		return this.getUnlocalizedName().substring(5);
	}

}