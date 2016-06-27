package fr.bentur_and_bertatruck.bandb_mod.common.item;

import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.Item;
import net.minecraft.util.IIcon;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import fr.bentur_and_bertatruck.bandb_mod.common.loader.BandbCreativeTabs;

public class ItemToolsKitchen extends Item{
	
	public ItemToolsKitchen(){
		super();
		this.maxStackSize = 1;
		this.setMaxDamage(64);
		this.setNoRepair();
		this.setCreativeTab(BandbCreativeTabs.CreativeTabsKitchenTools);
		
	}
	
	
}
