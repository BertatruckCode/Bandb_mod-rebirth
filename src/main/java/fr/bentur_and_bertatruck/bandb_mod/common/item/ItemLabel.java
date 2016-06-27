package fr.bentur_and_bertatruck.bandb_mod.common.item;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import fr.bentur_and_bertatruck.bandb_mod.common.lists.ListLabels;
import fr.bentur_and_bertatruck.bandb_mod.common.loader.BandbCreativeTabs;

public class ItemLabel extends Item{
	
	public ItemLabel(){
		this.setMaxStackSize(32);
		this.setCreativeTab(BandbCreativeTabs.CreativeTabsLabel);

	}

}
