package fr.bentur_and_bertatruck.bandb_mod.common.loader;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class BandbCreativeTabs {

	public static CreativeTabs CreativeTabsFruit = new CreativeTabs("CreativeTabsFruit") {
		
		@Override
		@SideOnly(Side.CLIENT)
		public Item getTabIconItem() {
			return BandbItems.itemApricot;
		}
	};
	public static CreativeTabs CreativeTabsVegetable = new CreativeTabs("CreativeTabsVegetable") {

		@Override
		@SideOnly(Side.CLIENT)
		public Item getTabIconItem() {
			return BandbItems.itemAvocado;
		}

	};
	public static CreativeTabs CreativeTabsPlant = new CreativeTabs("CreativeTabsPlant") {

		@Override
		@SideOnly(Side.CLIENT)
		public Item getTabIconItem() {
			return Item.getItemFromBlock(BandbBlocks.blockMint);
		}

	};
	public static CreativeTabs CreativeTabsSeed = new CreativeTabs("CreativeTabsSeed") {

		@Override
		@SideOnly(Side.CLIENT)
		public Item getTabIconItem() {
			return Items.wheat_seeds;
		}

	};
	public static CreativeTabs CreativeTabsMushroom = new CreativeTabs("CreativeTabsMushroom") {

		@Override
		@SideOnly(Side.CLIENT)
		public Item getTabIconItem() {
			return BandbItems.itemTruffle;
		}

	};
	public static CreativeTabs CreativeTabsBeverage = new CreativeTabs("CreativeTabsBeverage") {

		@Override
		@SideOnly(Side.CLIENT)
		public Item getTabIconItem() {
			return BandbBeverages.itemBeverageCapCorse;
		}

	};
	public static CreativeTabs CreativeTabsBottle = new CreativeTabs("CreativeTabsBottle") {

		@Override
		@SideOnly(Side.CLIENT)
		public Item getTabIconItem() {
			return BandbBeverages.itemBottleBordeauxChateauLary;
		}

	};
	public static CreativeTabs CreativeTabsProcessedFood = new CreativeTabs("CreativeTabsProcessedFood") {

		@Override
		@SideOnly(Side.CLIENT)
		public Item getTabIconItem() {
			return BandbItems.itemBounty;
		}

	};
	public static CreativeTabs CreativeTabsIngredient = new CreativeTabs("CreativeTabsIngredient") {

		@Override
		@SideOnly(Side.CLIENT)
		public Item getTabIconItem() {
			return BandbItems.itemBenco;
		}

	};
	public static CreativeTabs CreativeTabsMiscellaneous = new CreativeTabs("CreativeTabsMiscellaneous") {

		@Override
		@SideOnly(Side.CLIENT)
		public Item getTabIconItem() {
			return BandbItems.itemIPhone;
		}

	};
	public static CreativeTabs CreativeTabsKitchenTools = new CreativeTabs("CreativeTabsKitchenTools") {

		@Override
		@SideOnly(Side.CLIENT)
		public Item getTabIconItem() {
			return BandbItems.itemFlyingPan;
		}

	};
	public static CreativeTabs CreativeTabsLabel = new CreativeTabs("CreativeTabsLabel") {

		@Override
		@SideOnly(Side.CLIENT)
		public Item getTabIconItem() {
			return BandbItems.itemCapCorseLabel;
		}

	};
	public static CreativeTabs CreativeTabsPharmaceutical = new CreativeTabs("CreativeTabsPharmaceutical") {

		@Override
		@SideOnly(Side.CLIENT)
		public Item getTabIconItem() {
			return BandbItems.itemDoliprane200mg;
		}

	};
	public static CreativeTabs CreativeTabsWrapping = new CreativeTabs("CreativeTabsWrapping") {

		@Override
		@SideOnly(Side.CLIENT)
		public Item getTabIconItem() {
			return BandbItems.itemWrappingDoliprane200mg;
		}

	};
	public static CreativeTabs CreativeTabsOre = new CreativeTabs("CreativeTabsOre") {

		@Override
		@SideOnly(Side.CLIENT)
		public Item getTabIconItem() {
			return Item.getItemFromBlock(BandbBlocks.blockOreAluminium);
		}

	};
	public static CreativeTabs CreativeTabsLeaf = new CreativeTabs("CreativeTabsLeaf") {

		@Override
		@SideOnly(Side.CLIENT)
		public Item getTabIconItem() {
			return Item.getItemFromBlock(BandbBlocks.blockAlmondLeaves);
		}

	};
	public static CreativeTabs CreativeTabsWood = new CreativeTabs("CreativeTabsWood") {

		@Override
		@SideOnly(Side.CLIENT)
		public Item getTabIconItem() {
			return Item.getItemFromBlock(BandbBlocks.blockAlmondWood);
		}

	};
	public static CreativeTabs CreativeTabSapling = new CreativeTabs("CreativeTabsSapling") {

		@Override
		@SideOnly(Side.CLIENT)
		public Item getTabIconItem() {
			return Item.getItemFromBlock(BandbBlocks.blockAlmondSapling);
		}

	};

	public static CreativeTabs CreativeTabsDecorationBlock = new CreativeTabs("CreativeTabsDecorationBlock") {

		@Override
		@SideOnly(Side.CLIENT)
		public Item getTabIconItem() {
			return Item.getItemFromBlock(BandbBlocks.blockDecorationBrick_1);
		}

	};
	public static CreativeTabs CreativeTabsCoktail = new CreativeTabs("CreativeTabsCocktail") {

		@Override
		@SideOnly(Side.CLIENT)
		public Item getTabIconItem() {
			return BandbCocktails.itemCocktailBalletRusse;
		}

	};
	public static CreativeTabs CreativeTabsCoffeeAndTea = new CreativeTabs("CreativeTabsCoffeeAndTea") {

		@Override
		@SideOnly(Side.CLIENT)
		public Item getTabIconItem() {
			return BandbItems.itemMugCoffeeEmpty;
		}

	};
	public static CreativeTabs CreativeTabsCreativeOnly = new CreativeTabs("CreativeTabsCreativeOnly") {

		@Override
		@SideOnly(Side.CLIENT)
		public Item getTabIconItem() {
			return BandbItems.itemCreativeOnly;
		}

	};
	public static CreativeTabs CreativeTabsLu = new CreativeTabs("CreativeTabsLu") {

		@Override
		@SideOnly(Side.CLIENT)
		public Item getTabIconItem() {
			return BandbItems.itemLogoLu;
		}

	};
	public static CreativeTabs CreativeTabsMonin = new CreativeTabs("CreativeTabsMonin") {

		@Override
		@SideOnly(Side.CLIENT)
		public Item getTabIconItem() {
			return BandbBeverages.itemLogoMonin;
		}

	};
	public static CreativeTabs CreativeTabsMilka = new CreativeTabs("CreativeTabsMilka") {

		@Override
		@SideOnly(Side.CLIENT)
		public Item getTabIconItem() {
			return BandbItems.itemLogoMilka;
		}

	};
	public static CreativeTabs CreativeTabsBel = new CreativeTabs("CreativeTabsBel") {

		@Override
		@SideOnly(Side.CLIENT)
		public Item getTabIconItem() {
			return BandbItems.itemLogoBel;
		}
	};
	public static CreativeTabs CreativeTabsFluid = new CreativeTabs("CreativeTabsFluid") {

		@Override
		@SideOnly(Side.CLIENT)
		public Item getTabIconItem() {
			return BandbItems.itemAbiu;
			
		}
	};
		public static CreativeTabs CreativeTabsButterfly = new CreativeTabs("CreativeTabsButterfly") {

			@Override
			@SideOnly(Side.CLIENT)
			public Item getTabIconItem() {
				return BandbItems.itemButterflyAcmonBlue;
		}
			
		};
		public static CreativeTabs CreativeTabsEggAndFeather = new CreativeTabs("CreativeTabsEggAndFeather") {

			@Override
			@SideOnly(Side.CLIENT)
			public Item getTabIconItem() {
				return BandbItems.itemEggandFeather;
		}
		};
		public static CreativeTabs CreativeTabsMeat = new CreativeTabs("CreativeTabsMeat") {

			@Override
			@SideOnly(Side.CLIENT)
			public Item getTabIconItem() {
				return BandbItems.itemSaddleMuttonRaw;
		
				
			}
	};

	/*
	 * public static CreativeTabs CreativeTabsSlab = new
	 * CreativeTabs("Creative_Tabs_Slab"){
	 * 
	 * @Override
	 * 
	 * @SideOnly(Side.CLIENT)
	 * 
	 * public Item getTabIconItem() { return
	 * Item.getItemFromBlock(Bandb_mod.blockPlankAlmond_slab);
	 * 
	 * };
	 */

}
