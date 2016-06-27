package fr.bentur_and_bertatruck.bandb_mod.common.item;

import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import fr.bentur_and_bertatruck.bandb_mod.common.Bandb_mod;
import fr.bentur_and_bertatruck.bandb_mod.common.loader.BandbCreativeTabs;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.Item;
import net.minecraft.util.IIcon;

public class ItemCocktail extends Item{
	
	
	public ItemCocktail(){
		this.setCreativeTab(BandbCreativeTabs.CreativeTabsCoktail);
		this.setMaxStackSize(16);
	}
	
	@SideOnly(Side.CLIENT)
	public IIcon getIcon(int side, int metadata) {
		return itemIcon;
	}

	@SideOnly(Side.CLIENT)
	public void registerIcons(IIconRegister iiconRegister) {
		this.itemIcon = iiconRegister.registerIcon(Bandb_mod.MODID + ":cocktail/" +this.getTextureName());
		//System.out.println(this.getTextureName());
	}
	
	public String getTextureName(){
		return this.getUnlocalizedName().substring(5);
	}

}
