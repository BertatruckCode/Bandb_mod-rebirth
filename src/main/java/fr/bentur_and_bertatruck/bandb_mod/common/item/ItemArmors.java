package fr.bentur_and_bertatruck.bandb_mod.common.item;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.init.Items;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import cofh.thermalfoundation.item.TFItems;
import fr.bentur_and_bertatruck.bandb_mod.common.Bandb_mod;
import fr.bentur_and_bertatruck.bandb_mod.common.loader.BandbCreativeTabs;
import fr.bentur_and_bertatruck.bandb_mod.common.loader.BandbItems;

public class ItemArmors extends ItemArmor {
	String texture, itemRepairMaterial;
	

	
	public ItemArmors(ArmorMaterial material, int type, String string ,String RepairMaterial) {
		super(material, 0, type);
		texture = string;
		itemRepairMaterial = RepairMaterial;
		this.setCreativeTab(CreativeTabs.tabCombat);

	}
	@Override
	public String getArmorTexture(ItemStack stack, Entity entity, int slot, String type) {
		if (slot == 2) {
			return Bandb_mod.MODID + ":textures/models/armor/" + texture + "_2.png";
		}

		return Bandb_mod.MODID + ":textures/models/armor/" + texture + "_1.png";
	}
	@Override
	public boolean getIsRepairable(ItemStack input, ItemStack repair) {
		 if(itemRepairMaterial == "aluminium" && repair.getItem() == BandbItems.itemIngotAluminium){
			return true;
		}else if(itemRepairMaterial == "amethyst" && repair.getItem() == BandbItems.itemAmethyst){
			return true;
		}else if(itemRepairMaterial == "copper" && repair.getItem() == TFItems.ingotCopper.getItem()){
			return true;
		}else if(itemRepairMaterial == "emerald" && repair.getItem() == Items.emerald){
			return true;
		}else if(itemRepairMaterial == "onyx" && repair.getItem() == BandbItems.itemOnyx){
			return true;
		}else if(itemRepairMaterial == "platinum" && repair.getItem() == BandbItems.itemIngotPlatinum){
			return true;
		}else if(itemRepairMaterial == "ruby" && repair.getItem() == BandbItems.itemRuby){
			return true;
		}else if(itemRepairMaterial == "sapphire" && repair.getItem() == BandbItems.itemSapphire){
			return true;
		}else if(itemRepairMaterial == "silver" && repair.getItem() == TFItems.ingotSilver.getItem()){
			return true;
		}else if(itemRepairMaterial == "titan" && repair.getItem() == BandbItems.itemIngotTitan){
			return true;
		}else if(itemRepairMaterial == "painite" && repair.getItem() == BandbItems.itemPainite){
			return true;
		}else if(itemRepairMaterial == "bronze" && repair.getItem() == TFItems.ingotBronze.getItem()){
			return true;
		}
		return false;
	}
}