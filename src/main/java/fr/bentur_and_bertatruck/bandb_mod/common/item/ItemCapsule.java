package fr.bentur_and_bertatruck.bandb_mod.common.item;

import net.minecraft.item.Item;
import fr.bentur_and_bertatruck.bandb_mod.common.loader.BandbCreativeTabs;

public class ItemCapsule extends Item {

	public ItemCapsule() {
		this.setMaxStackSize(64);
		this.setCreativeTab(BandbCreativeTabs.CreativeTabsCoffeeAndTea);

	}
}