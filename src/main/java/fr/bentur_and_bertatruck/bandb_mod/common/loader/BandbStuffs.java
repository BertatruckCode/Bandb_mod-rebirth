package fr.bentur_and_bertatruck.bandb_mod.common.loader;

import cpw.mods.fml.common.registry.GameRegistry;
import fr.bentur_and_bertatruck.bandb_mod.common.Bandb_mod;
import fr.bentur_and_bertatruck.bandb_mod.common.item.ItemArmors;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraftforge.common.util.EnumHelper;

	public class BandbStuffs {
		//items ore
		
		//armor
		public static Item itemHelmetAluminium,itemChestplateAluminium,itemLeggingsAluminium,itemBootsAluminium;
		public static Item itemHelmetAmethyst,itemChestplateAmethyst,itemLeggingsAmethyst,itemBootsAmethyst;
		public static Item itemHelmetEmerald,itemChestplateEmerald,itemLeggingsEmerald,itemBootsEmerald;
		public static Item itemHelmetOnyx,itemChestplateOnyx,itemLeggingsOnyx,itemBootsOnyx;
		public static Item itemHelmetPlatinum,itemChestplatePlatinum,itemLeggingsPlatinum,itemBootsPlatinum;
		public static Item itemHelmetRuby,itemChestplateRuby,itemLeggingsRuby,itemBootsRuby;
		public static Item itemHelmetSapphire,itemChestplateSapphire,itemLeggingsSapphire,itemBootsSapphire;
		public static Item itemHelmetTitan,itemChestplateTitan,itemLeggingsTitan,itemBootsTitan;
    	public static Item itemHelmetPainite,itemChestplatePainite,itemLeggingsPainite,itemBootsPainite;
		
		//material
		public static ArmorMaterial armorAluminium = EnumHelper.addArmorMaterial("armorAluminium",15, new int[]{2, 6, 5, 2}, 9);
		public static ArmorMaterial armorAmethyst = EnumHelper.addArmorMaterial("armorAmethyst",15, new int[]{2, 6, 5, 2}, 9);
		public static ArmorMaterial armorEmerald = EnumHelper.addArmorMaterial("armorEmerald",15, new int[]{2, 6, 5, 2}, 9);
		public static ArmorMaterial armorOnyx = EnumHelper.addArmorMaterial("armorOnyx",15, new int[]{2, 6, 5, 2}, 9);
		public static ArmorMaterial armorPlatinum = EnumHelper.addArmorMaterial("armorPlatinum",15, new int[]{2, 6, 5, 2}, 9);
		public static ArmorMaterial armorRuby = EnumHelper.addArmorMaterial("armorRuby",15, new int[]{2, 6, 5, 2}, 9);
		public static ArmorMaterial armorSapphire = EnumHelper.addArmorMaterial("armorSapphire",15, new int[]{2, 6, 5, 2}, 9);
		public static ArmorMaterial armorSteel = EnumHelper.addArmorMaterial("armorSteel",15, new int[]{2, 6, 5, 2}, 9);
		public static ArmorMaterial armorTitan = EnumHelper.addArmorMaterial("armorTitan",15, new int[]{2, 6, 5, 2}, 9);	
		public static ArmorMaterial armorPainite = EnumHelper.addArmorMaterial("armorPainite",15, new int[]{2, 6, 5, 2}, 9);	
		public static ArmorMaterial armorBronze = EnumHelper.addArmorMaterial("armorBronze",15, new int[]{2, 6, 5, 2}, 9);	

		public static void loaderStuff(boolean bool){
			if(bool){
				    					
		    	//aluminium		    			    	
		    	itemHelmetAluminium = new ItemArmors(armorAluminium, 0, "ArmorAluminium", "aluminium").setUnlocalizedName("itemHelmetAluminium").setTextureName(Bandb_mod.MODID + ":ore/armor/itemHelmetAluminium");
				itemChestplateAluminium= new ItemArmors(armorAluminium, 1, "ArmorAluminium", "aluminium").setUnlocalizedName("itemChestplateAluminium").setTextureName(Bandb_mod.MODID + ":ore/armor/itemChestplateAluminium");
				itemLeggingsAluminium = new ItemArmors(armorAluminium, 2, "ArmorAluminium", "aluminium").setUnlocalizedName("itemLeggingsAluminium").setTextureName(Bandb_mod.MODID + ":ore/armor/itemLeggingsAluminium");
				itemBootsAluminium = new ItemArmors(armorAluminium, 3, "ArmorAluminium", "aluminium").setUnlocalizedName("itemBootsAluminium").setTextureName(Bandb_mod.MODID + ":ore/armor/itemBootsAluminium");
		    	
		    	GameRegistry.registerItem(itemHelmetAluminium, "itemHelmetAluminium");
		    	GameRegistry.registerItem(itemChestplateAluminium, "itemChestplateAluminium");
		    	GameRegistry.registerItem(itemLeggingsAluminium, "itemLeggingsAluminium");
		    	GameRegistry.registerItem(itemBootsAluminium, "itemBootsAluminium");
		    	
				//amethyst 		    	
		    	itemHelmetAmethyst = new ItemArmors(armorAmethyst, 0, "ArmorAmethyst", "amethyst").setUnlocalizedName("itemHelmetAmethyst").setTextureName(Bandb_mod.MODID + ":ore/armor/itemHelmetAmethyst");
				itemChestplateAmethyst= new ItemArmors(armorAmethyst, 1, "ArmorAmethyst", "amethyst").setUnlocalizedName("itemChestplateAmethyst").setTextureName(Bandb_mod.MODID + ":ore/armor/itemChestplateAmethyst");
				itemLeggingsAmethyst = new ItemArmors(armorAmethyst, 2, "ArmorAmethyst", "amethyst").setUnlocalizedName("itemLeggingsAmethyst").setTextureName(Bandb_mod.MODID + ":ore/armor/itemLeggingsAmethyst");
				itemBootsAmethyst = new ItemArmors(armorAmethyst, 3, "ArmorAmethyst", "amethyst").setUnlocalizedName("itemBootsAmethyst").setTextureName(Bandb_mod.MODID + ":ore/armor/itemBootsAmethyst");
		    	
		    	GameRegistry.registerItem(itemHelmetAmethyst, "itemHelmetAmethyst");
		    	GameRegistry.registerItem(itemChestplateAmethyst, "itemChestplateAmethyst");
		    	GameRegistry.registerItem(itemLeggingsAmethyst, "itemLeggingsAmethyst");
		    	GameRegistry.registerItem(itemBootsAmethyst, "itemBootsAmethyst");
		    			    	
		    	//emerald
		    	itemHelmetEmerald = new ItemArmors(armorEmerald, 0, "ArmorEmerald", "emerald").setUnlocalizedName("itemHelmetEmerald").setTextureName(Bandb_mod.MODID + ":ore/armor/itemHelmetEmerald");
				itemChestplateEmerald= new ItemArmors(armorEmerald, 1, "ArmorEmerald", "emerald").setUnlocalizedName("itemChestplateEmerald").setTextureName(Bandb_mod.MODID + ":ore/armor/itemChestplateEmerald");
				itemLeggingsEmerald = new ItemArmors(armorEmerald, 2, "ArmorEmerald", "emerald").setUnlocalizedName("itemLeggingsEmerald").setTextureName(Bandb_mod.MODID + ":ore/armor/itemLeggingsEmerald");
				itemBootsEmerald = new ItemArmors(armorEmerald, 3, "ArmorEmerald", "emerald").setUnlocalizedName("itemBootsEmerald").setTextureName(Bandb_mod.MODID + ":ore/armor/itemBootsEmerald");
		    	
		    	GameRegistry.registerItem(itemHelmetEmerald, "itemHelmetEmerald");
		    	GameRegistry.registerItem(itemChestplateEmerald, "itemChestplateEmerald");
		    	GameRegistry.registerItem(itemLeggingsEmerald, "itemLeggingsEmerald");
		    	GameRegistry.registerItem(itemBootsEmerald, "itemBootsEmerald");
		    		    	
		    	//onyx
		    	itemHelmetOnyx = new ItemArmors(armorOnyx, 0, "ArmorOnyx" ,"onyx").setUnlocalizedName("itemHelmetOnyx").setTextureName(Bandb_mod.MODID + ":ore/armor/itemHelmetOnyx");
		    	itemChestplateOnyx= new ItemArmors(armorOnyx, 1, "ArmorOnyx" ,"onyx").setUnlocalizedName("itemChestplateOnyx").setTextureName(Bandb_mod.MODID + ":ore/armor/itemChestplateOnyx");
		    	itemLeggingsOnyx = new ItemArmors(armorOnyx, 2, "ArmorOnyx" ,"onyx").setUnlocalizedName("itemLeggingsOnyx").setTextureName(Bandb_mod.MODID + ":ore/armor/itemLeggingsOnyx");
		    	itemBootsOnyx = new ItemArmors(armorOnyx, 3, "ArmorOnyx" ,"onyx").setUnlocalizedName("itemBootsOnyx").setTextureName(Bandb_mod.MODID + ":ore/armor/itemBootsOnyx");
		    	
		    	GameRegistry.registerItem(itemHelmetOnyx, "itemHelmetOnyx");
		    	GameRegistry.registerItem(itemChestplateOnyx, "itemChestplateOnyx");
		    	GameRegistry.registerItem(itemLeggingsOnyx, "itemLeggingsOnyx");
		    	GameRegistry.registerItem(itemBootsOnyx, "itemBootsOnyx");
		    	
		    	//platinum
		    	itemHelmetPlatinum = new ItemArmors(armorPlatinum, 0, "ArmorPlatinum", "platinum").setUnlocalizedName("itemHelmetPlatinum").setTextureName(Bandb_mod.MODID + ":ore/armor/itemHelmetPlatinum");
				itemChestplatePlatinum= new ItemArmors(armorPlatinum, 1, "ArmorPlatinum", "platinum").setUnlocalizedName("itemChestplatePlatinum").setTextureName(Bandb_mod.MODID + ":ore/armor/itemChestplatePlatinum");
				itemLeggingsPlatinum = new ItemArmors(armorPlatinum, 2, "ArmorPlatinum", "platinum").setUnlocalizedName("itemLeggingsPlatinum").setTextureName(Bandb_mod.MODID + ":ore/armor/itemLeggingsPlatinum");
				itemBootsPlatinum = new ItemArmors(armorPlatinum, 3, "ArmorPlatinum", "platinum").setUnlocalizedName("itemBootsPlatinum").setTextureName(Bandb_mod.MODID + ":ore/armor/itemBootsPlatinum");
		    	
		    	GameRegistry.registerItem(itemHelmetPlatinum, "itemHelmetPlatinum");
		    	GameRegistry.registerItem(itemChestplatePlatinum, "itemChestplatePlatinum");
		    	GameRegistry.registerItem(itemLeggingsPlatinum, "itemLeggingsPlatinum");
		    	GameRegistry.registerItem(itemBootsPlatinum, "itemBootsPlatinum");
		    	
		    	//ruby
		    	itemHelmetRuby = new ItemArmors(armorRuby, 0, "ArmorRuby", "ruby").setUnlocalizedName("itemHelmetRuby").setTextureName(Bandb_mod.MODID + ":ore/armor/itemHelmetRuby");
				itemChestplateRuby= new ItemArmors(armorRuby, 1, "ArmorRuby", "ruby").setUnlocalizedName("itemChestplateRuby").setTextureName(Bandb_mod.MODID + ":ore/armor/itemChestplateRuby");
				itemLeggingsRuby = new ItemArmors(armorRuby, 2, "ArmorRuby", "ruby").setUnlocalizedName("itemLeggingsRuby").setTextureName(Bandb_mod.MODID + ":ore/armor/itemLeggingsRuby");
				itemBootsRuby = new ItemArmors(armorRuby, 3, "ArmorRuby", "ruby").setUnlocalizedName("itemBootsRuby").setTextureName(Bandb_mod.MODID + ":ore/armor/itemBootsRuby");
		    	
		    	GameRegistry.registerItem(itemHelmetRuby, "itemHelmetRuby");
		    	GameRegistry.registerItem(itemChestplateRuby, "itemChestplateRuby");
		    	GameRegistry.registerItem(itemLeggingsRuby, "itemLeggingsRuby");
		    	GameRegistry.registerItem(itemBootsRuby, "itemBootsRuby");
		    	
		    	//sapphire
				itemHelmetSapphire = new ItemArmors(armorSapphire, 0, "ArmorSapphire" ,"sapphire").setUnlocalizedName("itemHelmetSapphire").setTextureName(Bandb_mod.MODID + ":ore/armor/itemHelmetSapphire");
				itemChestplateSapphire= new ItemArmors(armorSapphire, 1, "ArmorSapphire" ,"sapphire").setUnlocalizedName("itemChestplateSapphire").setTextureName(Bandb_mod.MODID + ":ore/armor/itemChestplateSapphire");
				itemLeggingsSapphire = new ItemArmors(armorSapphire, 2, "ArmorSapphire" ,"sapphire").setUnlocalizedName("itemLeggingsSapphire").setTextureName(Bandb_mod.MODID + ":ore/armor/itemLeggingsSapphire");
				itemBootsSapphire = new ItemArmors(armorSapphire, 3, "ArmorSapphire" ,"sapphire").setUnlocalizedName("itemBootsSapphire").setTextureName(Bandb_mod.MODID + ":ore/armor/itemBootsSapphire");
		    	
		    	GameRegistry.registerItem(itemHelmetSapphire, "itemHelmetSapphire");
		    	GameRegistry.registerItem(itemChestplateSapphire, "itemChestplateSapphire");
		    	GameRegistry.registerItem(itemLeggingsSapphire, "itemLeggingsSapphire");
		    	GameRegistry.registerItem(itemBootsSapphire, "itemBootsSapphire");
		    
		    		    	
		    	//titan
		    	itemHelmetTitan = new ItemArmors(armorTitan, 0, "ArmorTitan", "titan").setUnlocalizedName("itemHelmetTitan").setTextureName(Bandb_mod.MODID + ":ore/armor/itemHelmetTitan");
				itemChestplateTitan= new ItemArmors(armorTitan, 1, "ArmorTitan", "titan").setUnlocalizedName("itemChestplateTitan").setTextureName(Bandb_mod.MODID + ":ore/armor/itemChestplateTitan");
				itemLeggingsTitan = new ItemArmors(armorTitan, 2, "ArmorTitan", "titan").setUnlocalizedName("itemLeggingsTitan").setTextureName(Bandb_mod.MODID + ":ore/armor/itemLeggingsTitan");
				itemBootsTitan = new ItemArmors(armorTitan, 3, "ArmorTitan", "titan").setUnlocalizedName("itemBootsTitan").setTextureName(Bandb_mod.MODID + ":ore/armor/itemBootsTitan");
		    	
		    	GameRegistry.registerItem(itemHelmetTitan, "itemHelmetTitan");
		    	GameRegistry.registerItem(itemChestplateTitan, "itemChestplateTitan");
		    	GameRegistry.registerItem(itemLeggingsTitan, "itemLeggingsTitan");
		    	GameRegistry.registerItem(itemBootsTitan, "itemBootsTitan");
		    	  	
				//painite		    	
		    	itemHelmetPainite = new ItemArmors(armorPainite, 0, "ArmorPainite", "painite").setUnlocalizedName("itemHelmetPainite").setTextureName(Bandb_mod.MODID + ":ore/armor/itemHelmetPainite");
				itemChestplatePainite= new ItemArmors(armorPainite, 1, "ArmorPainite", "painite").setUnlocalizedName("itemChestplatePainite").setTextureName(Bandb_mod.MODID + ":ore/armor/itemChestplatePainite");
				itemLeggingsPainite = new ItemArmors(armorPainite, 2, "ArmorPainite", "painite").setUnlocalizedName("itemLeggingsPainite").setTextureName(Bandb_mod.MODID + ":ore/armor/itemLeggingsPainite");
				itemBootsPainite = new ItemArmors(armorPainite, 3, "ArmorPainite", "painite").setUnlocalizedName("itemBootsPainite").setTextureName(Bandb_mod.MODID + ":ore/armor/itemBootsPainite");
		    	
		    	GameRegistry.registerItem(itemHelmetPainite, "itemHelmetPainite");
		    	GameRegistry.registerItem(itemChestplatePainite, "itemChestplatePainite");
		    	GameRegistry.registerItem(itemLeggingsPainite, "itemLeggingsPainite");
		    	GameRegistry.registerItem(itemBootsPainite, "itemBootsPainite");
		    			 
			}
		}
}
