package fr.bentur_and_bertatruck.bandb_mod.common.loader;

import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemSeeds;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.MinecraftForge;
import cpw.mods.fml.common.registry.GameRegistry;
import fr.bentur_and_bertatruck.bandb_mod.common.Bandb_mod;
import fr.bentur_and_bertatruck.bandb_mod.common.block.BlockCrop;
import fr.bentur_and_bertatruck.bandb_mod.common.block.BlockCropCereal;
import fr.bentur_and_bertatruck.bandb_mod.common.block.BlockCropCoffee;
import fr.bentur_and_bertatruck.bandb_mod.common.block.BlockCropCross;
import fr.bentur_and_bertatruck.bandb_mod.common.block.BlockCropCrossTest;
import fr.bentur_and_bertatruck.bandb_mod.common.block.BlockCropFruit;
import fr.bentur_and_bertatruck.bandb_mod.common.block.BlockCropGrapeRed;
import fr.bentur_and_bertatruck.bandb_mod.common.block.BlockCropGrapeWhite;
import fr.bentur_and_bertatruck.bandb_mod.common.block.BlockCropSquare;
import fr.bentur_and_bertatruck.bandb_mod.common.block.BlockCropVegetable;

	public class BandbCrops {
		
		//crops
		public static Block blockCropWhiteMushroom,blockCropMint,blockCropMustard,blockCropPoppy,blockCropCotton;
		public static Block blockCropBasil,blockCropAgave,blockCropCardamom,blockCropEnder;
		public static Block blockCropHibiscus,blockCropJasmine,blockCropLavender,blockCropBlowball,blockCropButtercup;
		public static Block blockCropTarragon, blockCropRosmary, blockCropAmaryllisPink, blockCropAmaryllisRed, blockCropAmaryllisWhite;
		public static Block blockCropBachelorsButtonBlue, blockCropBelladonna, blockCropBetterCactus, blockCropCallaBlack, blockCropCallaWhite;
		public static Block blockCropCannabis, blockCropChrysantheme, blockCropCoca, blockCropDaisy, blockCropEnzian;
		public static Block blockCropFoxglove, blockCropHeather, blockCropIrisBlue, blockCropIrisPurple, blockCropLily;
		public static Block blockCropMarshMarigold, blockCropOrchid, blockCropPansy, blockCropPeony, blockCropRape;
		public static Block blockCropSesame, blockCropSyringa, blockCropTobacco, blockCropViolet, blockCropWildStrawberry;
		public static Block blockCropBlackberry,blockCropBlueberry,blockCropLemonGrass,blockBluebellCrop;
		public static Block blockGardeniaCrop,blockNettleCrop,blockDillCrop,blockThistleCrop;
		public static Block blockWormwoodCrop,blockChivesCrop,blockChervilCrop,blockWatercressCrop,blockThymeCrop;
		public static Block blockSageCrop,blockOreganoCrop,blockFennelCrop,blockGentianCrop;
		
		//fruit
		public static Block blockCropPineappleCayenne,blockCropPineappleVictoria,blockCropCranberry,blockCropBlackcurrant,blockCropPricklyPear;
		public static Block blockCropStrawberry,blockCropRaspberry,blockCropCurrant,blockCropRhubarb,blockCropTomato;
		
		//Vegetables
		public static Block blockCropAsparagus,blockCropGarlic,blockCropEggplant,blockCropBeet,blockCropBroccoli;
		public static Block blockCropPeanut,blockCropCarrotTouchon,blockCropCelery,blockCropBrusselsSprout,blockCropCauliflower;
		
		public static Block blockCropRedCabbage,blockCropCabbage,blockCropCucumber,blockCropZucchini,blockCropShallots;
		public static Block blockCropSpinach,blockCropGinger,blockCropFrenchBeans,blockCropLens,blockCropTurnip;
		
		public static Block blockCropOnion,blockCropParsnip,blockCropParsley,blockCropChili,blockCropLeek;
		public static Block blockCropRedPepper,blockCropGreenPepper,blockCropRadish,blockCropRutabaga,blockCropSalat;
		
		public static Block blockCropChicory,blockCropFlageolet,blockCropPea,blockCropChickpea,blockCropYellowPepper;
		public static Block blockCropGherkin,blockCropCherryTomato;
		
		//coffee
		public static Block blockCropCoffeeArabicas,blockCropCoffeeBlueMountain,blockCropCoffeeBourbonPointu,blockCropCoffeeCattura,blockCropCoffeeHarrar;
		public static Block blockCropCoffeeHuehuetenango,blockCropCoffeeJava,blockCropCoffeeKenyaAA,blockCropCoffeeKona,blockCropCoffeeKontirWildForest;
		public static Block blockCropCoffeeKopiLuwak,blockCropCoffeeKupeAlamid,blockCropCoffeeMoka,blockCropCoffeeMundoNovo,blockCropCoffeeMuragogype;
		public static Block blockCropCoffeePeaberry,blockCropCoffeeTarrazu,blockCropCoffeeTorajaKalossi,blockCropCoffeeYirgacheffe,blockCropTea;
	
		//grains
		public static Block blockCropOats,blockCropBuckwheat,blockCropHemp,blockCropSpelt,blockCropFonio;
		public static Block blockCropHop,blockCropMalt,blockCropMillet,blockCropRye,blockCropSorghum;
		public static Block blockCropCorn,blockCropBarley,blockCropRice;
		
		//grape
		public static Block blockCropGrapeCot;
	
	//seeds
		public static Item itemSeedWhiteMushroom;
		public static Item itemSeedMustard,itemSeedPoppy,itemSeedMint,itemSeedCotton,itemSeedBasil,itemSeedAgave;
		public static Item itemSeedCardamom,itemSeedHibiscus,itemSeedJasmine,itemSeedLavender,itemSeedEnder;
		public static Item itemSeedTarragon,itemSeedRosmary,itemSeedButtercup,itemSeedBlowball, itemSeedAmaryllisPink;
		public static Item itemSeedAmaryllisRed, itemSeedAmaryllisWhite, itemSeedBachelorsButtonBlue, itemSeedBelladonna, itemSeedBetterCactus;
		public static Item itemSeedCallaBlack, itemSeedCallaWhite, itemSeedCannabis, itemSeedChrysantheme, itemSeedCoca;
		public static Item itemSeedDaisy, itemSeedEnzian, itemSeedFoxglove, itemSeedHeather, itemSeedIrisBlue;
		public static Item itemSeedIrisPurple, itemSeedLily, itemSeedMarshMarigold, itemSeedOrchid, itemSeedPansy;
		public static Item itemSeedPeony, itemSeedRape, itemSeedSesame, itemSeedSyringa, itemSeedTobacco, itemSeedViolet;
		public static Item itemSeedWildStrawberry,itemSeedBlackBerry,itemSeedBlueBerry,itemLemongrassSeed,itemBluebellSeed;
		public static Item itemNettleSeed,itemDillSeed,itemGardeniaSeed,itemSeedThistle;
		public static Item itemSeedWormwood,itemSeedChives,itemSeedChervil,itemSeedWatercress,itemSeedThyme;
		public static Item itemSeedSage,itemSeedOregano,itemSeedFennel,itemSeedGentian;
		
		//grains
		public static Item itemSeedOats,itemSeedBuckwheat,itemSeedHemp,itemSeedSpelt,itemSeedFonio;
		public static Item itemSeedHop,itemSeedMalt,itemSeedMillet,itemSeedRye,itemSeedSorghum;
		public static Item itemSeedCorn,itemSeedBarley,itemSeedRice;
		
		//Fruit
		public static Item itemSeedBlackcurrant,itemSeedCranberry,itemSeedCurrant,itemSeedPineappleCayenne,itemSeedPineappleVictoria;
		public static Item itemSeedPricklyPear,itemSeedRaspberry,itemSeedRhubarb,itemSeedStrawberry,itemSeedTomato;
	
		//Vegetables
		public static Item itemSeedAsparagus,itemSeedGarlic,itemSeedEggplant,itemSeedBeet,itemSeedBroccoli;
		public static Item itemSeedPeanut,itemSeedCarotteTouchon,itemSeedCelery,itemSeedBrusselsSprout,itemSeedCauliflower;			
		public static Item itemSeedRedCabbage,itemSeedCabbage,itemSeedCucumber,itemSeedZucchini,itemSeedShallots;
		public static Item itemSeedSpinach,itemSeedGinger,itemSeedFrenchBeans,itemSeedLens,itemSeedTurnip;			
		public static Item itemSeedOnion,itemSeedParnsip,itemSeedParsley,itemSeedChili,itemSeedLeek;
		public static Item itemSeedRedPepper,itemSeedGreenPepper,itemSeedRadish,itemSeedRutabaga,itemSeedSalat;
		public static Item itemSeedChicory,itemSeedFlageolet,itemSeedPea,itemSeedChickpea,itemSeedYellowPepper;
		public static Item itemSeedGherkin,itemSeedCherryTomato;
		
		//Coffee and tea
		public static Item itemSeedTea,itemSeedCoffeeArabicas,itemSeedCoffeeBlueMountain,itemSeedCoffeeBourbonPointu,itemSeedCoffeeCattura;
		public static Item itemSeedCoffeeHuehuetenango,itemSeedCoffeeJava,itemSeedCoffeeKenyaAA,itemSeedCoffeeKona,itemSeedCoffeeKontirWildForest;
		public static Item itemSeedCoffeeKopiLuwak,itemSeedCoffeeKupeAlamid,itemSeedCoffeeMoka,itemSeedCoffeeMundoNovo,itemSeedCoffeeMuragogype;
		public static Item itemSeedCoffeePeaberry,itemSeedCoffeeTarrazu,itemSeedCoffeeTorajaKalossi,itemSeedCoffeeYirgacheffe,itemSeedCoffeeHarrar;
		
		//Grape
		public static Item itemSeedGrapeAbouriou,itemSeedGrapeAleaticu,itemSeedGrapeAligote,itemSeedGrapeAltesse,itemSeedGrapeAramon;
		public static Item itemSeedGrapeArbois,itemSeedGrapeArrufiac,itemSeedGrapeAubinVert,itemSeedGrapeBarbarossa,itemSeedGrapeBergeron;
		public static Item itemSeedGrapeBiancone,itemSeedGrapeBiancuGentile,itemSeedGrapeBourboulenc,itemSeedGrapeBraquet,itemSeedGrapeCabernetFranc;
		public static Item itemSeedGrapeCabernetSauvignon,itemSeedGrapeCamarese,itemSeedGrapeCarcaghjoluBiancu,itemSeedGrapeCarcaghjoluNeru,itemSeedGrapeCarignan;
		public static Item itemSeedGrapeCesar,itemSeedGrapeChardonnay,itemSeedGrapeChenin,itemSeedGrapeCinsault,itemSeedGrapeClairette;
		public static Item itemSeedGrapeColombard,itemSeedGrapeCot,itemSeedGrapeCounoise,itemSeedGrapeCourbu,itemSeedGrapeCudiverta;
		public static Item itemSeedGrapeDuras,itemSeedGrapeFerServadou,itemSeedGrapeFolleBlanche,itemSeedGrapeGamay,itemSeedGrapeGewurztraminer;
		public static Item itemSeedGrapeGrenache,itemSeedGrapeGrenacheBlanc,itemSeedGrapeGrolleau,itemSeedGrapeGrosMenseng,itemSeedGrapeJacquere;
		public static Item itemSeedGrapeLenDeLEl,itemSeedGrapeListan,itemSeedGrapeMaccabeu,itemSeedGrapeMalbec,itemSeedGrapeMalvoisie;
		public static Item itemSeedGrapeMarsanne,itemSeedGrapeMarselan,itemSeedGrapeMauzac,itemSeedGrapeMelon,itemSeedGrapeMelonDeBourgogne;
		public static Item itemSeedGrapeMerlot,itemSeedGrapeMolette,itemSeedGrapeMollard,itemSeedGrapeMondeuse,itemSeedGrapeMondeuseBlanche;
		public static Item itemSeedGrapeMourvedre,itemSeedGrapeMuscadelle,itemSeedGrapeMuscardin,itemSeedGrapeMuscatBlancAPetitsGrains,itemSeedGrapeMuscatDAlexandrie;
		public static Item itemSeedGrapeNegrette,itemSeedGrapeNielluccio,itemSeedGrapePagaDebiti,itemSeedGrapePetitCourbu,itemSeedGrapePetitMenseng;
		public static Item itemSeedGrapePetitVerdot,itemSeedGrapePineauDAunis,itemSeedGrapePinotBlanc,itemSeedGrapePinotMeunier,itemSeedGrapePinotNoir;
		public static Item itemSeedGrapePiquepoul,itemSeedGrapePoulsard,itemSeedGrapeRiesling,itemSeedGrapeRomorantin,itemSeedGrapeRossulaBianca;
		public static Item itemSeedGrapeSacy,itemSeedGrapeSauvignon,itemSeedGrapeSavagnin,itemSeedGrapeSemillon,itemSeedGrapeSylvaner;
		public static Item itemSeedGrapeSyrah,itemSeedGrapeTannat,itemSeedGrapeTeoulier,itemSeedGrapeTerretNoir,itemSeedGrapeTibouren;
		public static Item itemSeedGrapeTressalier,itemSeedGrapeUgniBlanc,itemSeedGrapeVaccarese,itemSeedGrapeVermentinu,itemSeedGrapeViognier;
		public static void loaderCropSeed(){
			 
			 //seed
				itemSeedWhiteMushroom = new ItemSeeds(blockCropWhiteMushroom, Blocks.farmland).setUnlocalizedName("itemSeedWhiteMushroom").setTextureName(Bandb_mod.MODID + ":seed/itemSeedWhiteMushroom").setCreativeTab(BandbCreativeTabs.CreativeTabsSeed);

			    GameRegistry.registerItem(itemSeedWhiteMushroom, "itemSeedWhiteMushroom");
			    
			    MinecraftForge.addGrassSeed(new ItemStack(itemSeedWhiteMushroom), 5);

			    
			    itemSeedMustard = new ItemSeeds(blockCropMustard, Blocks.farmland).setUnlocalizedName("itemSeedMustard").setTextureName(Bandb_mod.MODID + ":seed/itemSeedMustard").setCreativeTab(BandbCreativeTabs.CreativeTabsSeed);
				itemSeedPoppy = new ItemSeeds(blockCropPoppy, Blocks.farmland).setUnlocalizedName("itemSeedPoppy").setTextureName(Bandb_mod.MODID + ":seed/itemSeedPoppy").setCreativeTab(BandbCreativeTabs.CreativeTabsSeed);
				itemSeedMint = new ItemSeeds(blockCropMint, Blocks.farmland).setUnlocalizedName("itemSeedMint").setTextureName(Bandb_mod.MODID + ":seed/itemSeedMint").setCreativeTab(BandbCreativeTabs.CreativeTabsSeed);
				itemSeedCotton = new ItemSeeds(blockCropCotton, Blocks.farmland).setUnlocalizedName("itemSeedCotton").setTextureName(Bandb_mod.MODID + ":seed/itemSeedCotton").setCreativeTab(BandbCreativeTabs.CreativeTabsSeed);
				itemSeedBasil = new ItemSeeds(blockCropBasil, Blocks.farmland).setUnlocalizedName("itemSeedBasil").setTextureName(Bandb_mod.MODID + ":seed/itemSeedBasil").setCreativeTab(BandbCreativeTabs.CreativeTabsSeed);

			    GameRegistry.registerItem(itemSeedMustard, "itemSeedMustard");	
			    GameRegistry.registerItem(itemSeedPoppy, "itemSeedPoppy");	
			    GameRegistry.registerItem(itemSeedMint, "itemSeedMint");	
			    GameRegistry.registerItem(itemSeedCotton, "itemSeedCotton");	
			    GameRegistry.registerItem(itemSeedBasil, "itemSeedBasil");	

			    MinecraftForge.addGrassSeed(new ItemStack(itemSeedMustard), 5);
				MinecraftForge.addGrassSeed(new ItemStack(itemSeedPoppy), 5);
				MinecraftForge.addGrassSeed(new ItemStack(itemSeedMint), 5);
				MinecraftForge.addGrassSeed(new ItemStack(itemSeedCotton), 5);
				MinecraftForge.addGrassSeed(new ItemStack(itemSeedBasil), 5);

				itemSeedAgave = new ItemSeeds(blockCropAgave, Blocks.farmland).setUnlocalizedName("itemSeedAgave").setTextureName(Bandb_mod.MODID + ":seed/itemSeedAgave").setCreativeTab(BandbCreativeTabs.CreativeTabsSeed);
				itemSeedCardamom = new ItemSeeds(blockCropCardamom, Blocks.farmland).setUnlocalizedName("itemSeedCardamom").setTextureName(Bandb_mod.MODID + ":seed/itemSeedCardamom").setCreativeTab(BandbCreativeTabs.CreativeTabsSeed);
				itemSeedHibiscus = new ItemSeeds(blockCropHibiscus, Blocks.farmland).setUnlocalizedName("itemSeedHibiscus").setTextureName(Bandb_mod.MODID + ":seed/itemSeedHibiscus").setCreativeTab(BandbCreativeTabs.CreativeTabsSeed);
				itemSeedJasmine = new ItemSeeds(blockCropJasmine, Blocks.farmland).setUnlocalizedName("itemSeedJasmine").setTextureName(Bandb_mod.MODID + ":seed/itemSeedJasmine").setCreativeTab(BandbCreativeTabs.CreativeTabsSeed);
				itemSeedLavender = new ItemSeeds(blockCropLavender, Blocks.farmland).setUnlocalizedName("itemSeedLavender").setTextureName(Bandb_mod.MODID + ":seed/itemSeedLavender").setCreativeTab(BandbCreativeTabs.CreativeTabsSeed);

			    GameRegistry.registerItem(itemSeedAgave, "itemSeedAgave");	
			    GameRegistry.registerItem(itemSeedCardamom, "itemSeedCardamom");	
			    GameRegistry.registerItem(itemSeedHibiscus, "itemSeedHibiscus");	
			    GameRegistry.registerItem(itemSeedJasmine, "itemSeedJasmine");	
			    GameRegistry.registerItem(itemSeedLavender, "itemSeedLavender");	

			    MinecraftForge.addGrassSeed(new ItemStack(itemSeedAgave), 5);
				MinecraftForge.addGrassSeed(new ItemStack(itemSeedPoppy), 5);
				MinecraftForge.addGrassSeed(new ItemStack(itemSeedMint), 5);
				MinecraftForge.addGrassSeed(new ItemStack(itemSeedCotton), 5);
				MinecraftForge.addGrassSeed(new ItemStack(itemSeedLavender), 5);
				
				itemSeedEnder = new ItemSeeds(blockCropEnder, Blocks.farmland).setUnlocalizedName("itemSeedEnder").setTextureName(Bandb_mod.MODID + ":seed/itemSeedEnder").setCreativeTab(BandbCreativeTabs.CreativeTabsSeed);
				itemSeedBlowball = new ItemSeeds(blockCropBlowball, Blocks.farmland).setUnlocalizedName("itemSeedBlowball").setTextureName(Bandb_mod.MODID + ":seed/itemSeedBlowball").setCreativeTab(BandbCreativeTabs.CreativeTabsSeed);
				itemSeedButtercup = new ItemSeeds(blockCropButtercup, Blocks.farmland).setUnlocalizedName("itemSeedButtercup").setTextureName(Bandb_mod.MODID + ":seed/itemSeedButtercup").setCreativeTab(BandbCreativeTabs.CreativeTabsSeed);
				itemSeedRosmary = new ItemSeeds(blockCropRosmary, Blocks.farmland).setUnlocalizedName("itemSeedRosmary").setTextureName(Bandb_mod.MODID + ":seed/itemSeedRosmary").setCreativeTab(BandbCreativeTabs.CreativeTabsSeed);
				itemSeedTarragon = new ItemSeeds(blockCropTarragon, Blocks.farmland).setUnlocalizedName("itemSeedTarragon").setTextureName(Bandb_mod.MODID + ":seed/itemSeedTarragon").setCreativeTab(BandbCreativeTabs.CreativeTabsSeed);

			    GameRegistry.registerItem(itemSeedEnder, "itemSeedEnder");	
			    GameRegistry.registerItem(itemSeedBlowball, "itemSeedBlowball");	
			    GameRegistry.registerItem(itemSeedButtercup, "itemSeedButtercup");	
			    GameRegistry.registerItem(itemSeedRosmary, "itemSeedRosmary");	
			    GameRegistry.registerItem(itemSeedTarragon, "itemSeedTarragon");	
			    
			    MinecraftForge.addGrassSeed(new ItemStack(itemSeedEnder), 5);
			    MinecraftForge.addGrassSeed(new ItemStack(itemSeedBlowball), 5);
			    MinecraftForge.addGrassSeed(new ItemStack(itemSeedButtercup), 5);
			    MinecraftForge.addGrassSeed(new ItemStack(itemSeedRosmary), 5);
			    MinecraftForge.addGrassSeed(new ItemStack(itemSeedTarragon), 5);
			    
			    itemSeedAmaryllisPink = new ItemSeeds(blockCropAmaryllisPink, Blocks.farmland).setUnlocalizedName("itemSeedAmaryllisPink").setTextureName(Bandb_mod.MODID + ":seed/itemSeedAmaryllisPink").setCreativeTab(BandbCreativeTabs.CreativeTabsSeed);
			    itemSeedAmaryllisRed = new ItemSeeds(blockCropAmaryllisRed, Blocks.farmland).setUnlocalizedName("itemSeedAmaryllisRed").setTextureName(Bandb_mod.MODID + ":seed/itemSeedAmaryllisRed").setCreativeTab(BandbCreativeTabs.CreativeTabsSeed);
			    itemSeedAmaryllisWhite = new ItemSeeds(blockCropAmaryllisWhite, Blocks.farmland).setUnlocalizedName("itemSeedAmaryllisWhite").setTextureName(Bandb_mod.MODID + ":seed/itemSeedAmaryllisWhite").setCreativeTab(BandbCreativeTabs.CreativeTabsSeed);
			    itemSeedBachelorsButtonBlue = new ItemSeeds(blockCropBachelorsButtonBlue, Blocks.farmland).setUnlocalizedName("itemSeedBachelorsButtonBlue").setTextureName(Bandb_mod.MODID + ":seed/itemSeedAmaryllisPink").setCreativeTab(BandbCreativeTabs.CreativeTabsSeed);
			    itemSeedBelladonna = new ItemSeeds(blockCropBelladonna, Blocks.farmland).setUnlocalizedName("itemSeedBelladonna").setTextureName(Bandb_mod.MODID + ":seed/itemSeedBelladonna").setCreativeTab(BandbCreativeTabs.CreativeTabsSeed); 

			    GameRegistry.registerItem(itemSeedAmaryllisPink, "itemSeedAmaryllisPink");
			    GameRegistry.registerItem(itemSeedAmaryllisRed, "itemSeedAmaryllisRed");
			    GameRegistry.registerItem(itemSeedAmaryllisWhite, "itemSeedAmaryllisWhite");
			    GameRegistry.registerItem(itemSeedBachelorsButtonBlue, "itemSeedBachelorsButtonBlue");
			    GameRegistry.registerItem(itemSeedBelladonna, "itemSeedBelladonna"); 

			    MinecraftForge.addGrassSeed(new ItemStack(itemSeedAmaryllisPink), 5);		    			    
			    MinecraftForge.addGrassSeed(new ItemStack(itemSeedAmaryllisRed), 5);			    			    
			    MinecraftForge.addGrassSeed(new ItemStack(itemSeedAmaryllisWhite), 5);			    			    
			    MinecraftForge.addGrassSeed(new ItemStack(itemSeedBachelorsButtonBlue), 5);			    			    
			    MinecraftForge.addGrassSeed(new ItemStack(itemSeedBelladonna), 5);

			    itemSeedBetterCactus = new ItemSeeds(blockCropBetterCactus, Blocks.farmland).setUnlocalizedName("itemSeedBetterCactus").setTextureName(Bandb_mod.MODID + ":seed/itemSeedBetterCactus").setCreativeTab(BandbCreativeTabs.CreativeTabsSeed); 
			    itemSeedCallaBlack = new ItemSeeds(blockCropCallaBlack, Blocks.farmland).setUnlocalizedName("itemSeedCallaBlack").setTextureName(Bandb_mod.MODID + ":seed/itemSeedCallaBlack").setCreativeTab(BandbCreativeTabs.CreativeTabsSeed); 

			    GameRegistry.registerItem(itemSeedBetterCactus, "itemSeedBetterCactus"); 			    			    
			    GameRegistry.registerItem(itemSeedCallaBlack, "itemSeedCallaBlack"); 			    			    

			    MinecraftForge.addGrassSeed(new ItemStack(itemSeedBetterCactus), 5);
			    MinecraftForge.addGrassSeed(new ItemStack(itemSeedCallaBlack), 5);

			    itemSeedCallaWhite = new ItemSeeds(blockCropCallaWhite, Blocks.farmland).setUnlocalizedName("itemSeedCallaWhite").setTextureName(Bandb_mod.MODID + ":seed/itemSeedCallaWhite").setCreativeTab(BandbCreativeTabs.CreativeTabsSeed); 
			    GameRegistry.registerItem(itemSeedCallaWhite, "itemSeedCallaWhite"); 			    			    
			    MinecraftForge.addGrassSeed(new ItemStack(itemSeedCallaWhite), 5);

			    itemSeedCannabis = new ItemSeeds(blockCropCannabis, Blocks.farmland).setUnlocalizedName("itemSeedCannabis").setTextureName(Bandb_mod.MODID + ":seed/itemSeedCannabis").setCreativeTab(BandbCreativeTabs.CreativeTabsSeed); 
			    GameRegistry.registerItem(itemSeedCannabis, "itemSeedCannabis"); 			    			    
			    MinecraftForge.addGrassSeed(new ItemStack(itemSeedCannabis), 5);

			    itemSeedChrysantheme = new ItemSeeds(blockCropChrysantheme, Blocks.farmland).setUnlocalizedName("itemSeedChrysantheme").setTextureName(Bandb_mod.MODID + ":seed/itemSeedChrysantheme").setCreativeTab(BandbCreativeTabs.CreativeTabsSeed); 
			    GameRegistry.registerItem(itemSeedChrysantheme, "itemSeedChrysantheme"); 			    			    
			    MinecraftForge.addGrassSeed(new ItemStack(itemSeedChrysantheme), 5);

			    itemSeedCoca = new ItemSeeds(blockCropCoca, Blocks.farmland).setUnlocalizedName("itemSeedCoca").setTextureName(Bandb_mod.MODID + ":seed/itemSeedCoca").setCreativeTab(BandbCreativeTabs.CreativeTabsSeed); 
			    GameRegistry.registerItem(itemSeedCoca, "itemSeedCoca"); 			    			    
			    MinecraftForge.addGrassSeed(new ItemStack(itemSeedCoca), 5);

			    itemSeedDaisy = new ItemSeeds(blockCropDaisy, Blocks.farmland).setUnlocalizedName("itemSeedDaisy").setTextureName(Bandb_mod.MODID + ":seed/itemSeedDaisy").setCreativeTab(BandbCreativeTabs.CreativeTabsSeed); 
			    GameRegistry.registerItem(itemSeedDaisy, "itemSeedDaisy"); 		    			    
			    MinecraftForge.addGrassSeed(new ItemStack(itemSeedDaisy), 5);

			    itemSeedEnzian = new ItemSeeds(blockCropEnzian, Blocks.farmland).setUnlocalizedName("itemSeedEnzian").setTextureName(Bandb_mod.MODID + ":seed/itemSeedEnzian").setCreativeTab(BandbCreativeTabs.CreativeTabsSeed); 
			    GameRegistry.registerItem(itemSeedEnzian, "itemSeedEnzian"); 			    			    
			    MinecraftForge.addGrassSeed(new ItemStack(itemSeedEnzian), 5);

			    itemSeedFoxglove = new ItemSeeds(blockCropFoxglove, Blocks.farmland).setUnlocalizedName("itemSeedFoxglove").setTextureName(Bandb_mod.MODID + ":seed/itemSeedFoxglove").setCreativeTab(BandbCreativeTabs.CreativeTabsSeed); 
			    GameRegistry.registerItem(itemSeedFoxglove, "itemSeedFoxglove"); 			    			    
			    MinecraftForge.addGrassSeed(new ItemStack(itemSeedFoxglove), 5);

			    itemSeedHeather = new ItemSeeds(blockCropHeather, Blocks.farmland).setUnlocalizedName("itemSeedHeather").setTextureName(Bandb_mod.MODID + ":seed/itemSeedHeather").setCreativeTab(BandbCreativeTabs.CreativeTabsSeed); 
			    GameRegistry.registerItem(itemSeedHeather, "itemSeedHeather"); 			    			    
			    MinecraftForge.addGrassSeed(new ItemStack(itemSeedHeather), 5);

			    itemSeedIrisBlue = new ItemSeeds(blockCropIrisBlue, Blocks.farmland).setUnlocalizedName("itemSeedIrisBlue").setTextureName(Bandb_mod.MODID + ":seed/itemSeedIrisBlue").setCreativeTab(BandbCreativeTabs.CreativeTabsSeed); 
			    GameRegistry.registerItem(itemSeedIrisBlue, "itemSeedIrisBlue"); 			    			    
			    MinecraftForge.addGrassSeed(new ItemStack(itemSeedIrisBlue), 5);

			    itemSeedIrisPurple = new ItemSeeds(blockCropIrisPurple, Blocks.farmland).setUnlocalizedName("itemSeedIrisPurple").setTextureName(Bandb_mod.MODID + ":seed/itemSeedIrisPurple").setCreativeTab(BandbCreativeTabs.CreativeTabsSeed); 
			    GameRegistry.registerItem(itemSeedIrisPurple, "itemSeedIrisPurple"); 			    			    
			    MinecraftForge.addGrassSeed(new ItemStack(itemSeedIrisPurple), 5);

			    itemSeedLily = new ItemSeeds(blockCropLily, Blocks.farmland).setUnlocalizedName("itemSeedLily").setTextureName(Bandb_mod.MODID + ":seed/itemSeedLily").setCreativeTab(BandbCreativeTabs.CreativeTabsSeed); 
			    GameRegistry.registerItem(itemSeedLily, "itemSeedLily"); 			    			    
			    MinecraftForge.addGrassSeed(new ItemStack(itemSeedLily), 5);

			    itemSeedMarshMarigold = new ItemSeeds(blockCropMarshMarigold, Blocks.farmland).setUnlocalizedName("itemSeedMarshMarigold").setTextureName(Bandb_mod.MODID + ":seed/itemSeedMarshMarigold").setCreativeTab(BandbCreativeTabs.CreativeTabsSeed); 
			    GameRegistry.registerItem(itemSeedMarshMarigold, "itemSeedMarshMarigold"); 		    			    
			    MinecraftForge.addGrassSeed(new ItemStack(itemSeedMarshMarigold), 5);

			    itemSeedOrchid = new ItemSeeds(blockCropOrchid, Blocks.farmland).setUnlocalizedName("itemSeedOrchid").setTextureName(Bandb_mod.MODID + ":seed/itemSeedOrchid").setCreativeTab(BandbCreativeTabs.CreativeTabsSeed); 
			    GameRegistry.registerItem(itemSeedOrchid, "itemSeedOrchid"); 			    			    
			    MinecraftForge.addGrassSeed(new ItemStack(itemSeedOrchid), 5);

			    itemSeedPansy = new ItemSeeds(blockCropPansy, Blocks.farmland).setUnlocalizedName("itemSeedPansy").setTextureName(Bandb_mod.MODID + ":seed/itemSeedPansy").setCreativeTab(BandbCreativeTabs.CreativeTabsSeed); 
			    GameRegistry.registerItem(itemSeedPansy, "itemSeedPansy"); 			    			    
			    MinecraftForge.addGrassSeed(new ItemStack(itemSeedPansy), 5);

			    itemSeedPeony = new ItemSeeds(blockCropPeony, Blocks.farmland).setUnlocalizedName("itemSeedPeony").setTextureName(Bandb_mod.MODID + ":seed/itemSeedPeony").setCreativeTab(BandbCreativeTabs.CreativeTabsSeed); 
			    GameRegistry.registerItem(itemSeedPeony, "itemSeedPeony"); 			    			    
			    MinecraftForge.addGrassSeed(new ItemStack(itemSeedPeony), 5);

			    itemSeedRape = new ItemSeeds(blockCropRape, Blocks.farmland).setUnlocalizedName("itemSeedRape").setTextureName(Bandb_mod.MODID + ":seed/itemSeedRape").setCreativeTab(BandbCreativeTabs.CreativeTabsSeed); 
			    GameRegistry.registerItem(itemSeedRape, "itemSeedRape"); 			    			    
			    MinecraftForge.addGrassSeed(new ItemStack(itemSeedRape), 5);

			    itemSeedSesame = new ItemSeeds(blockCropSesame, Blocks.farmland).setUnlocalizedName("itemSeedSesame").setTextureName(Bandb_mod.MODID + ":seed/itemSeedSesame").setCreativeTab(BandbCreativeTabs.CreativeTabsSeed); 
			    GameRegistry.registerItem(itemSeedSesame, "itemSeedSesame"); 			    			    
			    MinecraftForge.addGrassSeed(new ItemStack(itemSeedSesame), 5);

			    itemSeedSyringa = new ItemSeeds(blockCropSyringa, Blocks.farmland).setUnlocalizedName("itemSeedSyringa").setTextureName(Bandb_mod.MODID + ":seed/itemSeedSyringa").setCreativeTab(BandbCreativeTabs.CreativeTabsSeed); 
			    GameRegistry.registerItem(itemSeedSyringa, "itemSeedSyringa"); 			    			    
			    MinecraftForge.addGrassSeed(new ItemStack(itemSeedSyringa), 5);

			    itemSeedTobacco = new ItemSeeds(blockCropTobacco, Blocks.farmland).setUnlocalizedName("itemSeedTobacco").setTextureName(Bandb_mod.MODID + ":seed/itemSeedTobacco").setCreativeTab(BandbCreativeTabs.CreativeTabsSeed); 
			    GameRegistry.registerItem(itemSeedTobacco, "itemSeedTobacco"); 			    			    
			    MinecraftForge.addGrassSeed(new ItemStack(itemSeedTobacco), 5);

			    
			    itemSeedViolet = new ItemSeeds(blockCropViolet, Blocks.farmland).setUnlocalizedName("itemSeedViolet").setTextureName(Bandb_mod.MODID + ":seed/itemSeedViolet").setCreativeTab(BandbCreativeTabs.CreativeTabsSeed); 
			    itemSeedWildStrawberry = new ItemSeeds(blockCropWildStrawberry, Blocks.farmland).setUnlocalizedName("itemSeedWildStrawberry").setTextureName(Bandb_mod.MODID + ":seed/itemSeedWildStrawberry").setCreativeTab(BandbCreativeTabs.CreativeTabsSeed); 
			    itemSeedBlackBerry = new ItemSeeds(blockCropBlackberry, Blocks.farmland).setUnlocalizedName("itemSeedBlackBerry").setTextureName(Bandb_mod.MODID + ":seed/itemSeedBlackBerry").setCreativeTab(BandbCreativeTabs.CreativeTabsSeed); 
			    itemSeedBlueBerry = new ItemSeeds(blockCropBlueberry, Blocks.farmland).setUnlocalizedName("itemSeedBlueBerry").setTextureName(Bandb_mod.MODID + ":seed/itemSeedBlueBerry").setCreativeTab(BandbCreativeTabs.CreativeTabsSeed); 
			    itemLemongrassSeed = new ItemSeeds(blockCropLemonGrass, Blocks.farmland).setUnlocalizedName("itemLemongrassSeed").setTextureName(Bandb_mod.MODID + ":seed/itemLemongrassSeed").setCreativeTab(BandbCreativeTabs.CreativeTabsSeed); 

			    itemBluebellSeed = new ItemSeeds(blockBluebellCrop, Blocks.farmland).setUnlocalizedName("itemBluebellSeed").setTextureName(Bandb_mod.MODID + ":seed/itemBluebellSeed").setCreativeTab(BandbCreativeTabs.CreativeTabsSeed); 
			    itemDillSeed = new ItemSeeds(blockDillCrop, Blocks.farmland).setUnlocalizedName("itemDillSeed").setTextureName(Bandb_mod.MODID + ":seed/itemDillSeed").setCreativeTab(BandbCreativeTabs.CreativeTabsSeed); 
			    itemGardeniaSeed = new ItemSeeds(blockGardeniaCrop, Blocks.farmland).setUnlocalizedName("itemGardeniaSeed").setTextureName(Bandb_mod.MODID + ":seed/itemGardeniaSeed").setCreativeTab(BandbCreativeTabs.CreativeTabsSeed); 
			    itemNettleSeed = new ItemSeeds(blockNettleCrop, Blocks.farmland).setUnlocalizedName("itemNettleSeed").setTextureName(Bandb_mod.MODID + ":seed/itemNettleSeed").setCreativeTab(BandbCreativeTabs.CreativeTabsSeed); 
			    itemSeedThistle = new ItemSeeds(blockThistleCrop, Blocks.farmland).setUnlocalizedName("itemSeedThistle").setTextureName(Bandb_mod.MODID + ":seed/itemSeedThistle").setCreativeTab(BandbCreativeTabs.CreativeTabsSeed); 

			    GameRegistry.registerItem(itemSeedViolet, "itemSeedViolet"); 
			    GameRegistry.registerItem(itemSeedWildStrawberry, "itemSeedWildStrawberry"); 
			    GameRegistry.registerItem(itemSeedBlackBerry, "itemSeedBlackBerry"); 
			    GameRegistry.registerItem(itemSeedBlueBerry, "itemSeedBlueBerry"); 
			    GameRegistry.registerItem(itemLemongrassSeed, "itemLemongrassSeed"); 
				 
			    GameRegistry.registerItem(itemBluebellSeed, "itemBluebellSeed"); 
			    GameRegistry.registerItem(itemDillSeed, "itemDillSeed"); 
			    GameRegistry.registerItem(itemGardeniaSeed, "itemGardeniaSeed"); 
			    GameRegistry.registerItem(itemNettleSeed, "itemNettleSeed"); 
			    GameRegistry.registerItem(itemSeedThistle, "itemSeedThistle"); 
				
			    MinecraftForge.addGrassSeed(new ItemStack(itemSeedViolet), 5);
			    MinecraftForge.addGrassSeed(new ItemStack(itemSeedWildStrawberry), 5);
			    MinecraftForge.addGrassSeed(new ItemStack(itemSeedBlackBerry), 5);
			    MinecraftForge.addGrassSeed(new ItemStack(itemSeedBlueBerry), 5);
			    MinecraftForge.addGrassSeed(new ItemStack(itemLemongrassSeed), 5);

			    MinecraftForge.addGrassSeed(new ItemStack(itemBluebellSeed), 5);
			    MinecraftForge.addGrassSeed(new ItemStack(itemDillSeed), 5);
			    MinecraftForge.addGrassSeed(new ItemStack(itemGardeniaSeed), 5);
			    MinecraftForge.addGrassSeed(new ItemStack(itemNettleSeed), 5);
			    MinecraftForge.addGrassSeed(new ItemStack(itemSeedThistle), 5);
			    
				itemSeedWormwood = new ItemSeeds(blockWormwoodCrop, Blocks.farmland).setUnlocalizedName("itemSeedWormwood").setTextureName(Bandb_mod.MODID + ":seed/itemSeedWormwood").setCreativeTab(BandbCreativeTabs.CreativeTabsSeed); 
				itemSeedChives = new ItemSeeds(blockChivesCrop, Blocks.farmland).setUnlocalizedName("itemSeedChives").setTextureName(Bandb_mod.MODID + ":seed/itemSeedChives").setCreativeTab(BandbCreativeTabs.CreativeTabsSeed); 
				itemSeedChervil = new ItemSeeds(blockChervilCrop, Blocks.farmland).setUnlocalizedName("itemSeedChervil").setTextureName(Bandb_mod.MODID + ":seed/itemSeedChervil").setCreativeTab(BandbCreativeTabs.CreativeTabsSeed); 
				itemSeedWatercress = new ItemSeeds(blockWatercressCrop, Blocks.farmland).setUnlocalizedName("itemSeedWatercress").setTextureName(Bandb_mod.MODID + ":seed/itemSeedWatercress").setCreativeTab(BandbCreativeTabs.CreativeTabsSeed); 
				itemSeedThyme = new ItemSeeds(blockThymeCrop, Blocks.farmland).setUnlocalizedName("itemSeedThyme").setTextureName(Bandb_mod.MODID + ":seed/itemSeedThyme").setCreativeTab(BandbCreativeTabs.CreativeTabsSeed); 

			    GameRegistry.registerItem(itemSeedWormwood, "itemSeedWormwood"); 
			    GameRegistry.registerItem(itemSeedChives, "itemSeedChives"); 
			    GameRegistry.registerItem(itemSeedChervil, "itemSeedChervil"); 
			    GameRegistry.registerItem(itemSeedWatercress, "itemSeedWatercress"); 
			    GameRegistry.registerItem(itemSeedThyme, "itemSeedThyme"); 
			    
			    MinecraftForge.addGrassSeed(new ItemStack(itemSeedWormwood), 5);
			    MinecraftForge.addGrassSeed(new ItemStack(itemSeedChives), 5);
			    MinecraftForge.addGrassSeed(new ItemStack(itemSeedChervil), 5);
			    MinecraftForge.addGrassSeed(new ItemStack(itemSeedWatercress), 5);
			    MinecraftForge.addGrassSeed(new ItemStack(itemSeedThyme), 5);

				itemSeedSage = new ItemSeeds(blockSageCrop, Blocks.farmland).setUnlocalizedName("itemSeedSage").setTextureName(Bandb_mod.MODID + ":seed/itemSeedSage").setCreativeTab(BandbCreativeTabs.CreativeTabsSeed); 
				itemSeedOregano = new ItemSeeds(blockOreganoCrop, Blocks.farmland).setUnlocalizedName("itemSeedOregano").setTextureName(Bandb_mod.MODID + ":seed/itemSeedOregano").setCreativeTab(BandbCreativeTabs.CreativeTabsSeed); 
				itemSeedFennel = new ItemSeeds(blockFennelCrop, Blocks.farmland).setUnlocalizedName("itemSeedFennel").setTextureName(Bandb_mod.MODID + ":seed/itemSeedFennel").setCreativeTab(BandbCreativeTabs.CreativeTabsSeed); 
				itemSeedGentian = new ItemSeeds(blockGentianCrop, Blocks.farmland).setUnlocalizedName("itemSeedGentian").setTextureName(Bandb_mod.MODID + ":seed/itemSeedGentian").setCreativeTab(BandbCreativeTabs.CreativeTabsSeed); 
			
			    GameRegistry.registerItem(itemSeedSage, "itemSeedSage"); 
			    GameRegistry.registerItem(itemSeedOregano, "itemSeedOregano"); 
			    GameRegistry.registerItem(itemSeedFennel, "itemSeedFennel"); 
			    GameRegistry.registerItem(itemSeedGentian, "itemSeedGentian"); 
			    
			    MinecraftForge.addGrassSeed(new ItemStack(itemSeedSage), 5);
			    MinecraftForge.addGrassSeed(new ItemStack(itemSeedOregano), 5);
			    MinecraftForge.addGrassSeed(new ItemStack(itemSeedFennel), 5);
			    MinecraftForge.addGrassSeed(new ItemStack(itemSeedGentian), 5);
								
			    //grains
			    itemSeedOats = new ItemSeeds(blockCropOats, Blocks.farmland).setUnlocalizedName("itemSeedOats").setTextureName(Bandb_mod.MODID + ":seed/grains/itemSeedOats").setCreativeTab(BandbCreativeTabs.CreativeTabsSeed);
		    	itemSeedBuckwheat = new ItemSeeds(blockCropBuckwheat, Blocks.farmland).setUnlocalizedName("itemSeedBuckwheat").setTextureName(Bandb_mod.MODID + ":seed/grains/itemSeedBuckwheat").setCreativeTab(BandbCreativeTabs.CreativeTabsSeed);
		    	itemSeedHemp = new ItemSeeds(blockCropHemp, Blocks.farmland).setUnlocalizedName("itemSeedHemp").setTextureName(Bandb_mod.MODID + ":seed/grains/itemSeedHemp").setCreativeTab(BandbCreativeTabs.CreativeTabsSeed);
		    	itemSeedSpelt = new ItemSeeds(blockCropSpelt, Blocks.farmland).setUnlocalizedName("itemSeedSpelt").setTextureName(Bandb_mod.MODID + ":seed/grains/itemSeedSpelt").setCreativeTab(BandbCreativeTabs.CreativeTabsSeed);
		    	itemSeedFonio = new ItemSeeds(blockCropFonio, Blocks.farmland).setUnlocalizedName("itemSeedFonio").setTextureName(Bandb_mod.MODID + ":seed/grains/itemSeedFonio").setCreativeTab(BandbCreativeTabs.CreativeTabsSeed);

		    	itemSeedHop = new ItemSeeds(blockCropHop, Blocks.farmland).setUnlocalizedName("itemSeedHop").setTextureName(Bandb_mod.MODID + ":seed/grains/itemSeedHop").setCreativeTab(BandbCreativeTabs.CreativeTabsSeed);
		    	itemSeedMalt = new ItemSeeds(blockCropMalt, Blocks.farmland).setUnlocalizedName("itemSeedMalt").setTextureName(Bandb_mod.MODID + ":seed/grains/itemSeedMalt").setCreativeTab(BandbCreativeTabs.CreativeTabsSeed);
		    	itemSeedMillet = new ItemSeeds(blockCropMillet, Blocks.farmland).setUnlocalizedName("itemSeedMillet").setTextureName(Bandb_mod.MODID + ":seed/grains/itemSeedMillet").setCreativeTab(BandbCreativeTabs.CreativeTabsSeed);
		    	itemSeedRye = new ItemSeeds(blockCropRye, Blocks.farmland).setUnlocalizedName("itemSeedRye").setTextureName(Bandb_mod.MODID + ":seed/grains/itemSeedRye").setCreativeTab(BandbCreativeTabs.CreativeTabsSeed);
		    	itemSeedSorghum = new ItemSeeds(blockCropSorghum, Blocks.farmland).setUnlocalizedName("itemSeedSorghum").setTextureName(Bandb_mod.MODID + ":seed/grains/itemSeedSorghum").setCreativeTab(BandbCreativeTabs.CreativeTabsSeed);
		    	
		    	GameRegistry.registerItem(itemSeedOats, "itemSeedOats");	
				GameRegistry.registerItem(itemSeedBuckwheat, "itemSeedBuckwheat");	
				GameRegistry.registerItem(itemSeedHemp, "itemSeedHemp");	
				GameRegistry.registerItem(itemSeedSpelt, "itemSeedSpelt");	
				GameRegistry.registerItem(itemSeedFonio, "itemSeedFonio");	

				GameRegistry.registerItem(itemSeedHop, "itemSeedHop");	
				GameRegistry.registerItem(itemSeedMalt, "itemSeedMalt");	
				GameRegistry.registerItem(itemSeedMillet, "itemSeedMillet");	
				GameRegistry.registerItem(itemSeedRye, "itemSeedRye");	
				GameRegistry.registerItem(itemSeedSorghum, "itemSeedSorghum");	
				 
				MinecraftForge.addGrassSeed(new ItemStack(itemSeedOats), 5);
				MinecraftForge.addGrassSeed(new ItemStack(itemSeedBuckwheat), 5);
				MinecraftForge.addGrassSeed(new ItemStack(itemSeedHemp), 5);
				MinecraftForge.addGrassSeed(new ItemStack(itemSeedSpelt), 5);
				MinecraftForge.addGrassSeed(new ItemStack(itemSeedFonio), 5);

				MinecraftForge.addGrassSeed(new ItemStack(itemSeedHop), 5);
				MinecraftForge.addGrassSeed(new ItemStack(itemSeedMalt), 5);
				MinecraftForge.addGrassSeed(new ItemStack(itemSeedMillet), 5);
				MinecraftForge.addGrassSeed(new ItemStack(itemSeedRye), 5);
				MinecraftForge.addGrassSeed(new ItemStack(itemSeedSorghum), 5);
				
				itemSeedCorn = new ItemSeeds(blockCropCorn, Blocks.farmland).setUnlocalizedName("itemSeedCorn").setTextureName(Bandb_mod.MODID + ":seed/grains/itemSeedCorn").setCreativeTab(BandbCreativeTabs.CreativeTabsSeed);
				itemSeedBarley = new ItemSeeds(blockCropBarley, Blocks.farmland).setUnlocalizedName("itemSeedBarley").setTextureName(Bandb_mod.MODID + ":seed/grains/itemSeedBarley").setCreativeTab(BandbCreativeTabs.CreativeTabsSeed);
				itemSeedRice = new ItemSeeds(blockCropRice, Blocks.farmland).setUnlocalizedName("itemSeedRice").setTextureName(Bandb_mod.MODID + ":seed/grains/itemSeedRice").setCreativeTab(BandbCreativeTabs.CreativeTabsSeed);

				GameRegistry.registerItem(itemSeedCorn, "item_Seed_Corn");	
				GameRegistry.registerItem(itemSeedBarley, "item_Seed_Barley");	
				GameRegistry.registerItem(itemSeedRice, "item_Seed_Rice");	

				MinecraftForge.addGrassSeed(new ItemStack(itemSeedCorn), 5);
				MinecraftForge.addGrassSeed(new ItemStack(itemSeedBarley), 5);
				MinecraftForge.addGrassSeed(new ItemStack(itemSeedRice), 5);
				 			    			  
		    	//fruit
		    	itemSeedBlackcurrant = new ItemSeeds(blockCropBlackcurrant, Blocks.farmland).setUnlocalizedName("itemSeedBlackcurrant").setTextureName(Bandb_mod.MODID + ":seed/Fruit/itemSeedBlackcurrant").setCreativeTab(BandbCreativeTabs.CreativeTabsSeed);
		    	itemSeedCranberry = new ItemSeeds(blockCropCranberry, Blocks.farmland).setUnlocalizedName("itemSeedCranberry").setTextureName(Bandb_mod.MODID + ":seed/Fruit/itemSeedCranberry").setCreativeTab(BandbCreativeTabs.CreativeTabsSeed);
		    	itemSeedCurrant = new ItemSeeds(blockCropCurrant, Blocks.farmland).setUnlocalizedName("itemSeedCurrant").setTextureName(Bandb_mod.MODID + ":seed/Fruit/itemSeedCurrant").setCreativeTab(BandbCreativeTabs.CreativeTabsSeed);
		    	itemSeedPineappleCayenne = new ItemSeeds(blockCropPineappleCayenne, Blocks.farmland).setUnlocalizedName("itemSeedPineappleCayenne").setTextureName(Bandb_mod.MODID + ":seed/Fruit/itemSeedPineappleCayenne").setCreativeTab(BandbCreativeTabs.CreativeTabsSeed);
		    	itemSeedPineappleVictoria = new ItemSeeds(blockCropPineappleVictoria, Blocks.farmland).setUnlocalizedName("itemSeedPineappleVictoria").setTextureName(Bandb_mod.MODID + ":seed/Fruit/itemSeedPineappleVictoria").setCreativeTab(BandbCreativeTabs.CreativeTabsSeed);
		    	
		    	itemSeedPricklyPear = new ItemSeeds(blockCropPricklyPear, Blocks.farmland).setUnlocalizedName("itemSeedPricklyPear").setTextureName(Bandb_mod.MODID + ":seed/Fruit/itemSeedPricklyPear").setCreativeTab(BandbCreativeTabs.CreativeTabsSeed);
		    	itemSeedRaspberry = new ItemSeeds(blockCropRaspberry, Blocks.farmland).setUnlocalizedName("itemSeedRaspberry").setTextureName(Bandb_mod.MODID + ":seed/Fruit/itemSeedRaspberry").setCreativeTab(BandbCreativeTabs.CreativeTabsSeed);
		    	itemSeedRhubarb = new ItemSeeds(blockCropRhubarb, Blocks.farmland).setUnlocalizedName("itemSeedRhubarb").setTextureName(Bandb_mod.MODID + ":seed/Fruit/itemSeedRhubarb").setCreativeTab(BandbCreativeTabs.CreativeTabsSeed);
		    	itemSeedStrawberry = new ItemSeeds(blockCropStrawberry, Blocks.farmland).setUnlocalizedName("itemSeedStrawberry").setTextureName(Bandb_mod.MODID + ":seed/Fruit/itemSeedStrawberry").setCreativeTab(BandbCreativeTabs.CreativeTabsSeed);
		    	itemSeedTomato = new ItemSeeds(blockCropTomato, Blocks.farmland).setUnlocalizedName("itemSeedTomato").setTextureName(Bandb_mod.MODID + ":seed/Fruit/itemSeedTomato").setCreativeTab(BandbCreativeTabs.CreativeTabsSeed);
		    	
			    GameRegistry.registerItem(itemSeedBlackcurrant, "itemSeedBlackcurrant");	
			    GameRegistry.registerItem(itemSeedCranberry, "itemSeedCranberry");	
			    GameRegistry.registerItem(itemSeedCurrant, "itemSeedCurrant");	
			    GameRegistry.registerItem(itemSeedPineappleCayenne, "itemSeedPineappleCayenne");	
			    GameRegistry.registerItem(itemSeedPineappleVictoria, "itemSeedPineappleVictoria");
			    
			    GameRegistry.registerItem(itemSeedPricklyPear, "itemSeedPricklyPear");	
			    GameRegistry.registerItem(itemSeedRaspberry, "itemSeedRaspberry");	
			    GameRegistry.registerItem(itemSeedRhubarb, "itemSeedRhubarb");	
			    GameRegistry.registerItem(itemSeedStrawberry, "itemSeedStrawberry");	
			    GameRegistry.registerItem(itemSeedTomato, "itemSeedTomato");	
			    
			    MinecraftForge.addGrassSeed(new ItemStack(itemSeedBlackcurrant), 5);
			    MinecraftForge.addGrassSeed(new ItemStack(itemSeedCranberry), 5);
			    MinecraftForge.addGrassSeed(new ItemStack(itemSeedCurrant), 5);
			    MinecraftForge.addGrassSeed(new ItemStack(itemSeedPineappleCayenne), 5);	
			    MinecraftForge.addGrassSeed(new ItemStack(itemSeedPineappleVictoria), 5);

			    MinecraftForge.addGrassSeed(new ItemStack(itemSeedPricklyPear), 5);
			    MinecraftForge.addGrassSeed(new ItemStack(itemSeedRaspberry), 5);
			    MinecraftForge.addGrassSeed(new ItemStack(itemSeedRhubarb), 5);
			    MinecraftForge.addGrassSeed(new ItemStack(itemSeedStrawberry), 5);
			    MinecraftForge.addGrassSeed(new ItemStack(itemSeedTomato), 5);
			    
			    //Vegetables
			    itemSeedAsparagus = new ItemSeeds(blockCropAsparagus, Blocks.farmland).setUnlocalizedName("itemSeedAsparagus").setTextureName(Bandb_mod.MODID + ":seed/Vegetables/itemSeedAsparagus").setCreativeTab(BandbCreativeTabs.CreativeTabsSeed);
			    itemSeedGarlic = new ItemSeeds(blockCropGarlic, Blocks.farmland).setUnlocalizedName("itemSeedGarlic").setTextureName(Bandb_mod.MODID + ":seed/Vegetables/itemSeedGarlic").setCreativeTab(BandbCreativeTabs.CreativeTabsSeed);
			    itemSeedEggplant = new ItemSeeds(blockCropEggplant, Blocks.farmland).setUnlocalizedName("itemSeedEggplant").setTextureName(Bandb_mod.MODID + ":seed/Vegetables/itemSeedEggplant").setCreativeTab(BandbCreativeTabs.CreativeTabsSeed);
			    itemSeedBeet = new ItemSeeds(blockCropBeet, Blocks.farmland).setUnlocalizedName("itemSeedBeet").setTextureName(Bandb_mod.MODID + ":seed/Vegetables/itemSeedBeet").setCreativeTab(BandbCreativeTabs.CreativeTabsSeed);
			    itemSeedBroccoli = new ItemSeeds(blockCropBroccoli, Blocks.farmland).setUnlocalizedName("itemSeedBroccoli").setTextureName(Bandb_mod.MODID + ":seed/Vegetables/itemSeedBroccoli").setCreativeTab(BandbCreativeTabs.CreativeTabsSeed);

			    itemSeedPeanut = new ItemSeeds(blockCropPeanut, Blocks.farmland).setUnlocalizedName("itemSeedPeanut").setTextureName(Bandb_mod.MODID + ":seed/Vegetables/itemSeedPeanut").setCreativeTab(BandbCreativeTabs.CreativeTabsSeed);
			    itemSeedCarotteTouchon = new ItemSeeds(blockCropCarrotTouchon, Blocks.farmland).setUnlocalizedName("itemSeedCarotteTouchon").setTextureName(Bandb_mod.MODID + ":seed/Vegetables/itemSeedCarotteTouchon").setCreativeTab(BandbCreativeTabs.CreativeTabsSeed);
			    itemSeedCelery = new ItemSeeds(blockCropCelery, Blocks.farmland).setUnlocalizedName("itemSeedCelery").setTextureName(Bandb_mod.MODID + ":seed/Vegetables/itemSeedCelery").setCreativeTab(BandbCreativeTabs.CreativeTabsSeed);
			    itemSeedBrusselsSprout = new ItemSeeds(blockCropBrusselsSprout, Blocks.farmland).setUnlocalizedName("itemSeedBrusselsSprout").setTextureName(Bandb_mod.MODID + ":seed/Vegetables/itemSeedBrusselsSprout").setCreativeTab(BandbCreativeTabs.CreativeTabsSeed);
			    itemSeedCauliflower = new ItemSeeds(blockCropCauliflower, Blocks.farmland).setUnlocalizedName("itemSeedCauliflower").setTextureName(Bandb_mod.MODID + ":seed/Vegetables/itemSeedCauliflower").setCreativeTab(BandbCreativeTabs.CreativeTabsSeed);

			    GameRegistry.registerItem(itemSeedAsparagus, "itemSeedAsparagus");	
			    GameRegistry.registerItem(itemSeedGarlic, "itemSeedGarlic");	
			    GameRegistry.registerItem(itemSeedEggplant, "itemSeedEggplant");	
			    GameRegistry.registerItem(itemSeedBeet, "itemSeedBeet");	
			    GameRegistry.registerItem(itemSeedBroccoli, "itemSeedBroccoli");	    
			   

			    GameRegistry.registerItem(itemSeedPeanut, "itemSeedPeanut");	
			    GameRegistry.registerItem(itemSeedCarotteTouchon, "itemSeedCarotteTouchon");	
			    GameRegistry.registerItem(itemSeedCelery, "itemSeedCelery");	
			    GameRegistry.registerItem(itemSeedBrusselsSprout, "itemSeedBrusselsSprout");	
			    GameRegistry.registerItem(itemSeedCauliflower, "itemSeedCauliflower");	    
			  
			    MinecraftForge.addGrassSeed(new ItemStack(itemSeedAsparagus), 5);
			    MinecraftForge.addGrassSeed(new ItemStack(itemSeedGarlic), 5);
			    MinecraftForge.addGrassSeed(new ItemStack(itemSeedEggplant), 5);
			    MinecraftForge.addGrassSeed(new ItemStack(itemSeedBeet), 5);
			    MinecraftForge.addGrassSeed(new ItemStack(itemSeedBroccoli), 5);
	   
			    MinecraftForge.addGrassSeed(new ItemStack(itemSeedPeanut), 5);
			    MinecraftForge.addGrassSeed(new ItemStack(itemSeedCarotteTouchon), 5);
			    MinecraftForge.addGrassSeed(new ItemStack(itemSeedCelery), 5);
			    MinecraftForge.addGrassSeed(new ItemStack(itemSeedBrusselsSprout), 5);
			    MinecraftForge.addGrassSeed(new ItemStack(itemSeedCauliflower), 5);
			    
			    itemSeedRedCabbage = new ItemSeeds(blockCropRedCabbage, Blocks.farmland).setUnlocalizedName("itemSeedRedCabbage").setTextureName(Bandb_mod.MODID + ":seed/Vegetables/itemSeedRedCabbage").setCreativeTab(BandbCreativeTabs.CreativeTabsSeed);
				itemSeedCabbage = new ItemSeeds(blockCropCabbage, Blocks.farmland).setUnlocalizedName("itemSeedCabbage").setTextureName(Bandb_mod.MODID + ":seed/Vegetables/itemSeedCabbage").setCreativeTab(BandbCreativeTabs.CreativeTabsSeed);
				itemSeedCucumber = new ItemSeeds(blockCropCucumber, Blocks.farmland).setUnlocalizedName("itemSeedCucumber").setTextureName(Bandb_mod.MODID + ":seed/Vegetables/itemSeedCucumber").setCreativeTab(BandbCreativeTabs.CreativeTabsSeed);
				itemSeedZucchini = new ItemSeeds(blockCropZucchini, Blocks.farmland).setUnlocalizedName("itemSeedZucchini").setTextureName(Bandb_mod.MODID + ":seed/Vegetables/itemSeedZucchini").setCreativeTab(BandbCreativeTabs.CreativeTabsSeed);
				itemSeedShallots = new ItemSeeds(blockCropShallots, Blocks.farmland).setUnlocalizedName("itemSeedShallots").setTextureName(Bandb_mod.MODID + ":seed/Vegetables/itemSeedShallots").setCreativeTab(BandbCreativeTabs.CreativeTabsSeed);
		    	
				itemSeedSpinach = new ItemSeeds(blockCropSpinach, Blocks.farmland).setUnlocalizedName("itemSeedSpinach").setTextureName(Bandb_mod.MODID + ":seed/Vegetables/itemSeedSpinach").setCreativeTab(BandbCreativeTabs.CreativeTabsSeed);
				itemSeedGinger = new ItemSeeds(blockCropGinger, Blocks.farmland).setUnlocalizedName("itemSeedGinger").setTextureName(Bandb_mod.MODID + ":seed/Vegetables/itemSeedGinger").setCreativeTab(BandbCreativeTabs.CreativeTabsSeed);
				itemSeedFrenchBeans = new ItemSeeds(blockCropFrenchBeans, Blocks.farmland).setUnlocalizedName("itemSeedFrenchBeans").setTextureName(Bandb_mod.MODID + ":seed/Vegetables/itemSeedFrenchBeans").setCreativeTab(BandbCreativeTabs.CreativeTabsSeed);
				itemSeedLens = new ItemSeeds(blockCropLens, Blocks.farmland).setUnlocalizedName("itemSeedLens").setTextureName(Bandb_mod.MODID + ":seed/Vegetables/itemSeedLens").setCreativeTab(BandbCreativeTabs.CreativeTabsSeed);
				itemSeedTurnip = new ItemSeeds(blockCropTurnip, Blocks.farmland).setUnlocalizedName("itemSeedTurnip").setTextureName(Bandb_mod.MODID + ":seed/Vegetables/itemSeedTurnip").setCreativeTab(BandbCreativeTabs.CreativeTabsSeed);
		    	
			    GameRegistry.registerItem(itemSeedRedCabbage, "itemSeedRedCabbage");	
			    GameRegistry.registerItem(itemSeedCabbage, "itemSeedCabbage");	
			    GameRegistry.registerItem(itemSeedCucumber, "itemSeedCucumber");	
			    GameRegistry.registerItem(itemSeedZucchini, "itemSeedZucchini");	
			    GameRegistry.registerItem(itemSeedShallots, "itemSeedShallots");
			    
			    GameRegistry.registerItem(itemSeedSpinach, "itemSeedSpinach");	
			    GameRegistry.registerItem(itemSeedGinger, "itemSeedGinger");	
			    GameRegistry.registerItem(itemSeedFrenchBeans, "itemSeedFrenchBeans");	
			    GameRegistry.registerItem(itemSeedLens, "itemSeedLens");	
			    GameRegistry.registerItem(itemSeedTurnip, "itemSeedTurnip");	
			    
			    MinecraftForge.addGrassSeed(new ItemStack(itemSeedRedCabbage), 5);
			    MinecraftForge.addGrassSeed(new ItemStack(itemSeedCabbage), 5);
			    MinecraftForge.addGrassSeed(new ItemStack(itemSeedCucumber), 5);
			    MinecraftForge.addGrassSeed(new ItemStack(itemSeedZucchini), 5);	
			    MinecraftForge.addGrassSeed(new ItemStack(itemSeedShallots), 5);

			    MinecraftForge.addGrassSeed(new ItemStack(itemSeedSpinach), 5);
			    MinecraftForge.addGrassSeed(new ItemStack(itemSeedGinger), 5);
			    MinecraftForge.addGrassSeed(new ItemStack(itemSeedFrenchBeans), 5);
			    MinecraftForge.addGrassSeed(new ItemStack(itemSeedLens), 5);
			    MinecraftForge.addGrassSeed(new ItemStack(itemSeedTomato), 5);		    

				itemSeedOnion = new ItemSeeds(blockCropOnion, Blocks.farmland).setUnlocalizedName("itemSeedOnion").setTextureName(Bandb_mod.MODID + ":seed/Vegetables/itemSeedOnion").setCreativeTab(BandbCreativeTabs.CreativeTabsSeed);
				itemSeedParnsip = new ItemSeeds(blockCropParsnip, Blocks.farmland).setUnlocalizedName("itemSeedParnsip").setTextureName(Bandb_mod.MODID + ":seed/Vegetables/itemSeedParnsip").setCreativeTab(BandbCreativeTabs.CreativeTabsSeed);
				itemSeedParsley = new ItemSeeds(blockCropParsley, Blocks.farmland).setUnlocalizedName("itemSeedParsley").setTextureName(Bandb_mod.MODID + ":seed/Vegetables/itemSeedParsley").setCreativeTab(BandbCreativeTabs.CreativeTabsSeed);
				itemSeedChili = new ItemSeeds(blockCropChili, Blocks.farmland).setUnlocalizedName("itemSeedChili").setTextureName(Bandb_mod.MODID + ":seed/Vegetables/itemSeedChili").setCreativeTab(BandbCreativeTabs.CreativeTabsSeed);
				itemSeedLeek = new ItemSeeds(blockCropLeek, Blocks.farmland).setUnlocalizedName("itemSeedLeek").setTextureName(Bandb_mod.MODID + ":seed/Vegetables/itemSeedLeek").setCreativeTab(BandbCreativeTabs.CreativeTabsSeed);

				itemSeedRedPepper = new ItemSeeds(blockCropRedPepper, Blocks.farmland).setUnlocalizedName("itemSeedRedPepper").setTextureName(Bandb_mod.MODID + ":seed/Vegetables/itemSeedRedPepper").setCreativeTab(BandbCreativeTabs.CreativeTabsSeed);
				itemSeedGreenPepper = new ItemSeeds(blockCropGreenPepper, Blocks.farmland).setUnlocalizedName("itemSeedGreenPepper").setTextureName(Bandb_mod.MODID + ":seed/Vegetables/itemSeedGreenPepper").setCreativeTab(BandbCreativeTabs.CreativeTabsSeed);
				itemSeedRadish = new ItemSeeds(blockCropRadish, Blocks.farmland).setUnlocalizedName("itemSeedRadish").setTextureName(Bandb_mod.MODID + ":seed/Vegetables/itemSeedRadish").setCreativeTab(BandbCreativeTabs.CreativeTabsSeed);
				itemSeedRutabaga = new ItemSeeds(blockCropRutabaga, Blocks.farmland).setUnlocalizedName("itemSeedRutabaga").setTextureName(Bandb_mod.MODID + ":seed/Vegetables/itemSeedRutabaga").setCreativeTab(BandbCreativeTabs.CreativeTabsSeed);
				itemSeedSalat = new ItemSeeds(blockCropSalat, Blocks.farmland).setUnlocalizedName("itemSeedSalat").setTextureName(Bandb_mod.MODID + ":seed/Vegetables/itemSeedSalat").setCreativeTab(BandbCreativeTabs.CreativeTabsSeed);

			    GameRegistry.registerItem(itemSeedOnion, "itemSeedOnion");	
			    GameRegistry.registerItem(itemSeedParnsip, "itemSeedParnsip");	
			    GameRegistry.registerItem(itemSeedParsley, "itemSeedParsley");	
			    GameRegistry.registerItem(itemSeedChili, "itemSeedChili");	
			    GameRegistry.registerItem(itemSeedLeek, "itemSeedLeek");	    
			   
			    GameRegistry.registerItem(itemSeedRedPepper, "itemSeedRedPepper");	
			    GameRegistry.registerItem(itemSeedGreenPepper, "itemSeedGreenPepper");	
			    GameRegistry.registerItem(itemSeedRadish, "itemSeedRadish");	
			    GameRegistry.registerItem(itemSeedRutabaga, "itemSeedRutabaga");	
			    GameRegistry.registerItem(itemSeedSalat, "itemSeedSalat");	    
			  
			    MinecraftForge.addGrassSeed(new ItemStack(itemSeedOnion), 5);
			    MinecraftForge.addGrassSeed(new ItemStack(itemSeedParnsip), 5);
			    MinecraftForge.addGrassSeed(new ItemStack(itemSeedParsley), 5);
			    MinecraftForge.addGrassSeed(new ItemStack(itemSeedChili), 5);
			    MinecraftForge.addGrassSeed(new ItemStack(itemSeedBroccoli), 5);
	   
			    MinecraftForge.addGrassSeed(new ItemStack(itemSeedRedPepper), 5);
			    MinecraftForge.addGrassSeed(new ItemStack(itemSeedGreenPepper), 5);
			    MinecraftForge.addGrassSeed(new ItemStack(itemSeedRadish), 5);
			    MinecraftForge.addGrassSeed(new ItemStack(itemSeedRutabaga), 5);
			    MinecraftForge.addGrassSeed(new ItemStack(itemSeedSalat), 5);		    

				itemSeedChicory = new ItemSeeds(blockCropChicory, Blocks.farmland).setUnlocalizedName("itemSeedChicory").setTextureName(Bandb_mod.MODID + ":seed/Vegetables/itemSeedChicory").setCreativeTab(BandbCreativeTabs.CreativeTabsSeed);
				itemSeedFlageolet = new ItemSeeds(blockCropFlageolet, Blocks.farmland).setUnlocalizedName("itemSeedFlageolet").setTextureName(Bandb_mod.MODID + ":seed/Vegetables/itemSeedFlageolet").setCreativeTab(BandbCreativeTabs.CreativeTabsSeed);
				itemSeedPea = new ItemSeeds(blockCropPea, Blocks.farmland).setUnlocalizedName("itemSeedPea").setTextureName(Bandb_mod.MODID + ":seed/Vegetables/itemSeedPea").setCreativeTab(BandbCreativeTabs.CreativeTabsSeed);
				itemSeedChickpea = new ItemSeeds(blockCropChickpea, Blocks.farmland).setUnlocalizedName("itemSeedChickpea").setTextureName(Bandb_mod.MODID + ":seed/Vegetables/itemSeedChickpea").setCreativeTab(BandbCreativeTabs.CreativeTabsSeed);
				itemSeedYellowPepper = new ItemSeeds(blockCropYellowPepper, Blocks.farmland).setUnlocalizedName("itemSeedYellowPepper").setTextureName(Bandb_mod.MODID + ":seed/Vegetables/itemSeedYellowPepper").setCreativeTab(BandbCreativeTabs.CreativeTabsSeed);

			    GameRegistry.registerItem(itemSeedChicory, "itemSeedChicory");	
			    GameRegistry.registerItem(itemSeedFlageolet, "itemSeedFlageolet");	
			    GameRegistry.registerItem(itemSeedPea, "itemSeedPea");	
			    GameRegistry.registerItem(itemSeedChickpea, "itemSeedChickpea");	
			    GameRegistry.registerItem(itemSeedYellowPepper, "itemSeedYellowPepper");	    
			  
			    MinecraftForge.addGrassSeed(new ItemStack(itemSeedChicory), 5);
			    MinecraftForge.addGrassSeed(new ItemStack(itemSeedFlageolet), 5);
			    MinecraftForge.addGrassSeed(new ItemStack(itemSeedPea), 5);
			    MinecraftForge.addGrassSeed(new ItemStack(itemSeedChickpea), 5);
			    MinecraftForge.addGrassSeed(new ItemStack(itemSeedYellowPepper), 5);
			    
			    itemSeedGherkin = new ItemSeeds(blockCropGherkin, Blocks.farmland).setUnlocalizedName("itemSeedGherkin").setTextureName(Bandb_mod.MODID + ":seed/Vegetables/itemSeedGherkin").setCreativeTab(BandbCreativeTabs.CreativeTabsSeed);
			    itemSeedCherryTomato = new ItemSeeds(blockCropCherryTomato, Blocks.farmland).setUnlocalizedName("itemSeedCherryTomato").setTextureName(Bandb_mod.MODID + ":seed/Vegetables/itemSeedCherryTomato").setCreativeTab(BandbCreativeTabs.CreativeTabsSeed);
				   
			    GameRegistry.registerItem(itemSeedGherkin, "itemSeedGherkin");				    
			    GameRegistry.registerItem(itemSeedCherryTomato, "itemSeedCherryTomato");				    
				  
			    MinecraftForge.addGrassSeed(new ItemStack(itemSeedGherkin), 5);
			    MinecraftForge.addGrassSeed(new ItemStack(itemSeedCherryTomato), 5);
				 
			    //Coffee
			    
				itemSeedTea = new ItemSeeds(blockCropTea, Blocks.farmland).setUnlocalizedName("itemSeedTea").setTextureName(Bandb_mod.MODID + ":seed/Coffee/itemSeedTea").setCreativeTab(BandbCreativeTabs.CreativeTabsSeed);
				itemSeedCoffeeArabicas = new ItemSeeds(blockCropCoffeeArabicas, Blocks.farmland).setUnlocalizedName("itemSeedCoffeeArabicas").setTextureName(Bandb_mod.MODID + ":seed/Coffee/itemSeedCoffeeArabicas").setCreativeTab(BandbCreativeTabs.CreativeTabsSeed);
				itemSeedCoffeeBlueMountain = new ItemSeeds(blockCropCoffeeBlueMountain, Blocks.farmland).setUnlocalizedName("itemSeedCoffeeBlueMountain").setTextureName(Bandb_mod.MODID + ":seed/Coffee/itemSeedCoffeeBlueMountain").setCreativeTab(BandbCreativeTabs.CreativeTabsSeed);
				itemSeedCoffeeBourbonPointu = new ItemSeeds(blockCropCoffeeBourbonPointu, Blocks.farmland).setUnlocalizedName("itemSeedCoffeeBourbonPointu").setTextureName(Bandb_mod.MODID + ":seed/Coffee/itemSeedCoffeeBourbonPointu").setCreativeTab(BandbCreativeTabs.CreativeTabsSeed);
				itemSeedCoffeeCattura = new ItemSeeds(blockCropCoffeeCattura, Blocks.farmland).setUnlocalizedName("itemSeedCoffeeCattura").setTextureName(Bandb_mod.MODID + ":seed/Coffee/itemSeedCoffeeCattura").setCreativeTab(BandbCreativeTabs.CreativeTabsSeed);
				
				itemSeedCoffeeHuehuetenango = new ItemSeeds(blockCropCoffeeHuehuetenango, Blocks.farmland).setUnlocalizedName("itemSeedCoffeeHuehuetenango").setTextureName(Bandb_mod.MODID + ":seed/Coffee/itemSeedCoffeeHuehuetenango").setCreativeTab(BandbCreativeTabs.CreativeTabsSeed);
				itemSeedCoffeeJava = new ItemSeeds(blockCropCoffeeJava, Blocks.farmland).setUnlocalizedName("itemSeedCoffeeJava").setTextureName(Bandb_mod.MODID + ":seed/Coffee/itemSeedCoffeeJava").setCreativeTab(BandbCreativeTabs.CreativeTabsSeed);
				itemSeedCoffeeKenyaAA = new ItemSeeds(blockCropCoffeeKenyaAA, Blocks.farmland).setUnlocalizedName("itemSeedCoffeeKenyaAA").setTextureName(Bandb_mod.MODID + ":seed/Coffee/itemSeedCoffeeKenyaAA").setCreativeTab(BandbCreativeTabs.CreativeTabsSeed);
				itemSeedCoffeeKona = new ItemSeeds(blockCropCoffeeKona, Blocks.farmland).setUnlocalizedName("itemSeedCoffeeKona").setTextureName(Bandb_mod.MODID + ":seed/Coffee/itemSeedCoffeeKona").setCreativeTab(BandbCreativeTabs.CreativeTabsSeed);
				itemSeedCoffeeKontirWildForest = new ItemSeeds(blockCropCoffeeKontirWildForest, Blocks.farmland).setUnlocalizedName("itemSeedCoffeeKontirWildForest").setTextureName(Bandb_mod.MODID + ":seed/Coffee/itemSeedCoffeeKontirWildForest").setCreativeTab(BandbCreativeTabs.CreativeTabsSeed);

				itemSeedCoffeeKopiLuwak = new ItemSeeds(blockCropCoffeeKopiLuwak, Blocks.farmland).setUnlocalizedName("itemSeedCoffeeKopiLuwak").setTextureName(Bandb_mod.MODID + ":seed/Coffee/itemSeedCoffeeKopiLuwak").setCreativeTab(BandbCreativeTabs.CreativeTabsSeed);
				itemSeedCoffeeKupeAlamid = new ItemSeeds(blockCropCoffeeKupeAlamid, Blocks.farmland).setUnlocalizedName("itemSeedCoffeeKupeAlamid").setTextureName(Bandb_mod.MODID + ":seed/Coffee/itemSeedCoffeeKupeAlamid").setCreativeTab(BandbCreativeTabs.CreativeTabsSeed);
				itemSeedCoffeeMoka = new ItemSeeds(blockCropCoffeeMoka, Blocks.farmland).setUnlocalizedName("itemSeedCoffeeMoka").setTextureName(Bandb_mod.MODID + ":seed/Coffee/itemSeedCoffeeMoka").setCreativeTab(BandbCreativeTabs.CreativeTabsSeed);
				itemSeedCoffeeMundoNovo = new ItemSeeds(blockCropCoffeeMundoNovo, Blocks.farmland).setUnlocalizedName("itemSeedCoffeeMundoNovo").setTextureName(Bandb_mod.MODID + ":seed/Coffee/itemSeedCoffeeMundoNovo").setCreativeTab(BandbCreativeTabs.CreativeTabsSeed);
				itemSeedCoffeeMuragogype = new ItemSeeds(blockCropCoffeeMuragogype, Blocks.farmland).setUnlocalizedName("itemSeedCoffeeMuragogype").setTextureName(Bandb_mod.MODID + ":seed/Coffee/itemSeedCoffeeMuragogype").setCreativeTab(BandbCreativeTabs.CreativeTabsSeed);

				itemSeedCoffeePeaberry = new ItemSeeds(blockCropCoffeePeaberry, Blocks.farmland).setUnlocalizedName("itemSeedCoffeePeaberry").setTextureName(Bandb_mod.MODID + ":seed/Coffee/itemSeedCoffeePeaberry").setCreativeTab(BandbCreativeTabs.CreativeTabsSeed);
				itemSeedCoffeeTarrazu = new ItemSeeds(blockCropCoffeeTarrazu, Blocks.farmland).setUnlocalizedName("itemSeedCoffeeTarrazu").setTextureName(Bandb_mod.MODID + ":seed/Coffee/itemSeedCoffeeTarrazu").setCreativeTab(BandbCreativeTabs.CreativeTabsSeed);
				itemSeedCoffeeTorajaKalossi = new ItemSeeds(blockCropCoffeeTorajaKalossi, Blocks.farmland).setUnlocalizedName("itemSeedCoffeeTorajaKalossi").setTextureName(Bandb_mod.MODID + ":seed/Coffee/itemSeedCoffeeTorajaKalossi").setCreativeTab(BandbCreativeTabs.CreativeTabsSeed);
				itemSeedCoffeeYirgacheffe = new ItemSeeds(blockCropCoffeeYirgacheffe, Blocks.farmland).setUnlocalizedName("itemSeedCoffeeYirgacheffe").setTextureName(Bandb_mod.MODID + ":seed/Coffee/itemSeedCoffeeYirgacheffe").setCreativeTab(BandbCreativeTabs.CreativeTabsSeed);
				itemSeedCoffeeHarrar = new ItemSeeds(blockCropCoffeeHarrar, Blocks.farmland).setUnlocalizedName("itemSeedCoffeeHarrar").setTextureName(Bandb_mod.MODID + ":seed/Coffee/itemSeedCoffeeHarrar").setCreativeTab(BandbCreativeTabs.CreativeTabsSeed);

				GameRegistry.registerItem(itemSeedTea, "itemSeedTea");	
			    GameRegistry.registerItem(itemSeedCoffeeArabicas, "itemSeedCoffeeArabicas");	
			    GameRegistry.registerItem(itemSeedCoffeeBlueMountain, "itemSeedCoffeeBlueMountain");	
			    GameRegistry.registerItem(itemSeedCoffeeBourbonPointu, "itemSeedCoffeeBourbonPointu");	
			    GameRegistry.registerItem(itemSeedCoffeeCattura, "itemSeedCoffeeCattura");	    
			  
			    GameRegistry.registerItem(itemSeedCoffeeHuehuetenango, "itemSeedCoffeeHuehuetenango");	
			    GameRegistry.registerItem(itemSeedCoffeeJava, "itemSeedCoffeeJava");	
			    GameRegistry.registerItem(itemSeedCoffeeKenyaAA, "itemSeedCoffeeKenyaAA");	
			    GameRegistry.registerItem(itemSeedCoffeeKona, "itemSeedCoffeeKona");	
			    GameRegistry.registerItem(itemSeedCoffeeKontirWildForest, "itemSeedCoffeeKontirWildForest");	    
			  
			    GameRegistry.registerItem(itemSeedCoffeeKopiLuwak, "itemSeedCoffeeKopiLuwak");	
			    GameRegistry.registerItem(itemSeedCoffeeKupeAlamid, "itemSeedCoffeeKupeAlamid");	
			    GameRegistry.registerItem(itemSeedCoffeeMoka, "itemSeedCoffeeMoka");	
			    GameRegistry.registerItem(itemSeedCoffeeMundoNovo, "itemSeedCoffeeMundoNovo");	
			    GameRegistry.registerItem(itemSeedCoffeeMuragogype, "itemSeedCoffeeMuragogype");	    
			  
			    GameRegistry.registerItem(itemSeedCoffeePeaberry, "itemSeedCoffeePeaberry");	
			    GameRegistry.registerItem(itemSeedCoffeeTarrazu, "itemSeedCoffeeTarrazu");	
			    GameRegistry.registerItem(itemSeedCoffeeTorajaKalossi, "itemSeedCoffeeTorajaKalossi");	
			    GameRegistry.registerItem(itemSeedCoffeeYirgacheffe, "itemSeedCoffeeYirgacheffe");	
			    GameRegistry.registerItem(itemSeedCoffeeHarrar, "itemSeedCoffeeHarrar");	    
			    
			    MinecraftForge.addGrassSeed(new ItemStack(itemSeedTea), 5);
			    MinecraftForge.addGrassSeed(new ItemStack(itemSeedCoffeeArabicas), 5);
			    MinecraftForge.addGrassSeed(new ItemStack(itemSeedCoffeeBlueMountain), 5);
			    MinecraftForge.addGrassSeed(new ItemStack(itemSeedCoffeeBourbonPointu), 5);
			    MinecraftForge.addGrassSeed(new ItemStack(itemSeedCoffeeCattura), 5);
			    
			    MinecraftForge.addGrassSeed(new ItemStack(itemSeedCoffeeHuehuetenango), 5);
			    MinecraftForge.addGrassSeed(new ItemStack(itemSeedCoffeeJava), 5);
			    MinecraftForge.addGrassSeed(new ItemStack(itemSeedCoffeeKenyaAA), 5);
			    MinecraftForge.addGrassSeed(new ItemStack(itemSeedCoffeeKona), 5);
			    MinecraftForge.addGrassSeed(new ItemStack(itemSeedCoffeeKontirWildForest), 5);
			    
			    MinecraftForge.addGrassSeed(new ItemStack(itemSeedCoffeeKopiLuwak), 5);
			    MinecraftForge.addGrassSeed(new ItemStack(itemSeedCoffeeKupeAlamid), 5);
			    MinecraftForge.addGrassSeed(new ItemStack(itemSeedCoffeeMoka), 5);
			    MinecraftForge.addGrassSeed(new ItemStack(itemSeedCoffeeMundoNovo), 5);
			    MinecraftForge.addGrassSeed(new ItemStack(itemSeedCoffeeMuragogype), 5);
			    
			    MinecraftForge.addGrassSeed(new ItemStack(itemSeedCoffeePeaberry), 5);
			    MinecraftForge.addGrassSeed(new ItemStack(itemSeedCoffeeTarrazu), 5);
			    MinecraftForge.addGrassSeed(new ItemStack(itemSeedCoffeeTorajaKalossi), 5);
			    MinecraftForge.addGrassSeed(new ItemStack(itemSeedCoffeeYirgacheffe), 5);
			    MinecraftForge.addGrassSeed(new ItemStack(itemSeedCoffeeHarrar), 5);
			    
			    //grape
			    itemSeedGrapeCot = new ItemSeeds(blockCropGrapeCot, Blocks.farmland).setUnlocalizedName("itemSeedGrapeCot").setTextureName(Bandb_mod.MODID + ":seed/grape/itemSeedGrapeCot").setCreativeTab(BandbCreativeTabs.CreativeTabsSeed);

				GameRegistry.registerItem(itemSeedGrapeCot, "itemSeedGrapeCot");	
				
			    MinecraftForge.addGrassSeed(new ItemStack(itemSeedGrapeCot), 5);

		 }
		 
		 public static void loaderBlockCrop(){
			//crop
				 blockCropWhiteMushroom = new BlockCrop(BandbItems.itemWhiteMushroom, "whitemushroom", "square").setBlockName("blockCropWhiteMushroom");
				 blockCropMint = new BlockCrop(BandbItems.itemMint, "mint", "cross").setBlockName("blockCropMint");
				 blockCropMustard = new BlockCrop(BandbItems.itemMustard, "mustard", "cross").setBlockName("blockCropMustard");
				 blockCropPoppy = new BlockCrop(BandbItems.itemBug, "poppy", "cross").setBlockName("blockCropPoppy");
				 blockCropCotton = new BlockCrop(BandbItems.itemCotton, "cotton", "cross").setBlockName("blockCropCotton");
	
				 blockCropBasil = new BlockCrop(BandbItems.itemBasil, "basil", "cross").setBlockName("blockCropBasil");
				 blockCropCardamom = new BlockCrop(BandbItems.itemCardamom, "cardamom", "cross").setBlockName("blockCropCardamom");
				 blockCropAgave = new BlockCrop(BandbItems.itemAgave, "agave", "cross").setBlockName("blockCropAgave");
				 blockCropHibiscus = new BlockCrop(BandbItems.itemHibiscus, "hibiscus", "cross").setBlockName("blockCropHibiscus");
				 blockCropJasmine = new BlockCrop(BandbItems.itemJasmine, "jasmine", "cross").setBlockName("blockCropJasmine");
	
				 blockCropLavender = new BlockCrop(BandbItems.itemLavender, "lavender", "cross").setBlockName("blockCropLavender");
				 blockCropRosmary = new BlockCrop(BandbItems.itemRosmary, "rosmary", "cross").setBlockName("blockCropRosmary");
				 blockCropTarragon = new BlockCrop(BandbItems.itemTarragon, "tarragon", "cross").setBlockName("blockCropTarragon");
				 blockCropButtercup = new BlockCrop(BandbItems.itemButtercup, "buttercup", "cross").setBlockName("blockCropButtercup");
				 blockCropBlowball = new BlockCrop(BandbItems.itemBlowball, "blowball", "cross").setBlockName("blockCropBlowball");
	
				 blockCropEnder = new BlockCrop(Items.ender_pearl, "ender", "cross").setBlockName("blockCropEnder");
				 blockCropAmaryllisPink = new BlockCrop(BandbItems.itemAmaryllisPink, "amaryllispink", "cross").setBlockName("blockCropAmaryllisPink");
				 blockCropAmaryllisRed = new BlockCrop(BandbItems.itemAmaryllisRed , "amaryllisred", "cross").setBlockName("blockCropAmaryllisRed");
				 blockCropAmaryllisWhite = new BlockCrop(BandbItems.itemAmaryllisWhite , "amarylliswhite", "cross").setBlockName("blockCropAmaryllisWhite");
				 blockCropBachelorsButtonBlue = new BlockCrop(BandbItems.itemBachelorsButtonBlue, "bachelorsbuttonblue", "cross").setBlockName("blockCropBachelorsButtonBlue");
	
				 blockCropBelladonna = new BlockCrop(BandbItems.itemBelladonna, "belladonna", "cross").setBlockName("blockCropBelladonna"); 
				 blockCropBetterCactus = new BlockCrop(BandbItems.itemBetterCactus, "bettercactus", "cross").setBlockName("blockCropBetterCactus"); 
				 blockCropCallaBlack = new BlockCrop(BandbItems.itemCallaBlack , "callablack", "cross").setBlockName("blockCropCallaBlack"); 
				 blockCropCallaWhite = new BlockCrop(BandbItems.itemCallaWhite , "callawhite", "cross").setBlockName("blockCropCallaWhite"); 
				 blockCropCannabis = new BlockCrop(BandbItems.itemCannabis, "cannabis", "cross").setBlockName("blockCropCannabis");
	
				 blockCropChrysantheme = new BlockCrop(BandbItems.itemChrysantheme, "chrysantheme", "cross").setBlockName("blockCropChrysantheme"); 
				 blockCropCoca = new BlockCrop(BandbItems.itemLeafCoca, "coca", "cross").setBlockName("blockCropCoca"); 
				 blockCropDaisy = new BlockCrop(BandbItems.itemDaisy , "daisy", "cross").setBlockName("blockCropDaisy"); 
				 blockCropEnzian = new BlockCrop(BandbItems.itemEnzian , "enzian", "cross").setBlockName("blockCropEnzian"); 
				 blockCropFoxglove = new BlockCrop(BandbItems.itemFoxglove, "foxglove", "cross").setBlockName("blockCropFoxglove");
	
				 blockCropHeather = new BlockCrop(BandbItems.itemHeather, "heather", "cross").setBlockName("blockCropHeather"); 
				 blockCropIrisBlue = new BlockCrop(BandbItems.itemIrisBlue, "irisblue", "cross").setBlockName("blockCropIrisBlue"); 
				 blockCropIrisPurple = new BlockCrop(BandbItems.itemIrisPurple, "irispurple", "cross").setBlockName("blockCropIrisPurple"); 
				 blockCropLily = new BlockCrop(BandbItems.itemLily, "lily", "cross").setBlockName("blockCropLily"); 
				 blockCropMarshMarigold = new BlockCrop(BandbItems.itemMarshMarigold, "marshmarigold", "cross").setBlockName("blockCropMarshMarigold");
	
				 blockCropOrchid = new BlockCrop(BandbItems.itemOrchid, "orchid", "cross").setBlockName("blockCropOrchid"); 
				 blockCropPansy = new BlockCrop(BandbItems.itemPansy, "pansy", "cross").setBlockName("blockCropPansy"); 
				 blockCropPeony = new BlockCrop(BandbItems.itemPeony, "peony", "cross").setBlockName("blockCropPeony"); 
				 blockCropRape = new BlockCrop(BandbItems.itemRape, "rape", "cross").setBlockName("blockCropRape"); 
				 blockCropSesame = new BlockCrop(BandbItems.itemSesame, "sesame", "cross").setBlockName("blockCropSesame");
	
				 blockCropSyringa = new BlockCrop(BandbItems.itemSyringa, "syringa", "cross").setBlockName("blockCropSyringa"); 
				 blockCropTobacco = new BlockCrop(BandbItems.itemTobacco, "tobacco", "cross").setBlockName("blockCropTobacco"); 
				 blockCropViolet = new BlockCrop(BandbItems.itemViolet , "violet", "cross").setBlockName("blockCropViolet"); 
				 blockCropWildStrawberry = new BlockCrop(BandbItems.itemWildStrawberry , "wildstrawberry", "cross").setBlockName("blockCropWildStrawberry"); 
				 blockCropBlackberry = new BlockCrop(BandbItems.itemBlackBerry , "blackberry", "cross").setBlockName("blockCropBlackberry"); 
				 
				 blockCropBlueberry = new BlockCrop(BandbItems.itemBlueBerry , "blueberry", "cross").setBlockName("blockCropBlueberry"); 
				 blockCropLemonGrass = new BlockCrop(BandbItems.itemLemonGrass, "lemongrass", "cross").setBlockName("blockCropLemonGrass"); 
				 blockBluebellCrop = new BlockCrop(BandbItems.itemBluebell, "bluebell", "cross").setBlockName("blockBluebellCrop"); 
				 blockNettleCrop = new BlockCrop(BandbItems.itemNettle, "nettle", "cross").setBlockName("blockNettleCrop"); 
				 blockDillCrop = new BlockCrop(BandbItems.itemDill, "dill", "cross").setBlockName("blockDillCrop"); 
				 
				 blockGardeniaCrop = new BlockCrop(BandbItems.itemGardenia, "gardenia", "cross").setBlockName("blockGardeniaCrop"); 
				 blockThistleCrop = new BlockCrop(BandbItems.itemThistle, "thistle", "cross").setBlockName("blockThistleCrop"); 
					
				 
				 GameRegistry.registerBlock(blockCropWhiteMushroom, "blockCropWhiteMushroom");
				 GameRegistry.registerBlock(blockCropMint, "blockCropMint");
				 GameRegistry.registerBlock(blockCropMustard, "blockCropMustard");
				 GameRegistry.registerBlock(blockCropPoppy, "blockCropPoppy");
				 GameRegistry.registerBlock(blockCropCotton, "blockCropCotton");
				 GameRegistry.registerBlock(blockCropLemonGrass, "blockCropLemonGrass");
					
				 GameRegistry.registerBlock(blockCropBasil, "blockCropBasil");
				 GameRegistry.registerBlock(blockCropCardamom, "blockCropCardamom");
				 GameRegistry.registerBlock(blockCropAgave, "blockCropAgave");
				 GameRegistry.registerBlock(blockCropHibiscus, "blockCropHibiscus");
				 GameRegistry.registerBlock(blockCropJasmine, "blockCropJasmine");
	
				 GameRegistry.registerBlock(blockCropLavender, "blockCropLavender");
				 GameRegistry.registerBlock(blockCropRosmary, "blockCropRosmary");
				 GameRegistry.registerBlock(blockCropTarragon, "blockCropTarragon");
				 GameRegistry.registerBlock(blockCropButtercup, "blockCropButtercup");
				 GameRegistry.registerBlock(blockCropBlowball, "blockCropBlowball");
	
				 GameRegistry.registerBlock(blockCropEnder, "blockCropEnder");
				 GameRegistry.registerBlock(blockCropAmaryllisPink, "blockCropAmaryllisPink");
				 GameRegistry.registerBlock(blockCropAmaryllisRed, "blockCropAmaryllisRed");
				 GameRegistry.registerBlock(blockCropAmaryllisWhite, "blockCropAmaryllisWhite");
				 GameRegistry.registerBlock(blockCropBachelorsButtonBlue, "blockCropBachelorsButtonBlue");
	
				 GameRegistry.registerBlock(blockCropBelladonna, "blockCropBelladonna"); 
				 GameRegistry.registerBlock(blockCropBetterCactus, "blockCropBetterCactus"); 
				 GameRegistry.registerBlock(blockCropCallaBlack, "blockCropCallaBlack"); 
				 GameRegistry.registerBlock(blockCropCallaWhite, "blockCropCallaWhite"); 
				 GameRegistry.registerBlock(blockCropCannabis, "blockCropCannabis"); 
	
				 GameRegistry.registerBlock(blockCropChrysantheme, "blockCropChrysantheme"); 
				 GameRegistry.registerBlock(blockCropCoca, "blockCropCoca"); 
				 GameRegistry.registerBlock(blockCropDaisy, "blockCropDaisy"); 
				 GameRegistry.registerBlock(blockCropEnzian, "blockCropEnzian"); 
				 GameRegistry.registerBlock(blockCropFoxglove, "blockCropFoxglove"); 
	
				 GameRegistry.registerBlock(blockCropHeather, "blockCropHeather"); 
				 GameRegistry.registerBlock(blockCropIrisBlue, "blockCropIrisBlue"); 
				 GameRegistry.registerBlock(blockCropIrisPurple, "blockCropIrisPurple"); 
				 GameRegistry.registerBlock(blockCropLily, "blockCropLily"); 
				 GameRegistry.registerBlock(blockCropMarshMarigold, "blockCropMarshMarigold"); 
	
				 GameRegistry.registerBlock(blockCropOrchid, "blockCropOrchid"); 
				 GameRegistry.registerBlock(blockCropPansy, "blockCropPansy"); 
				 GameRegistry.registerBlock(blockCropPeony, "blockCropPeony"); 
				 GameRegistry.registerBlock(blockCropRape, "blockCropRape"); 
				 GameRegistry.registerBlock(blockCropSesame, "blockCropSesame"); 
	
				 GameRegistry.registerBlock(blockCropSyringa, "blockCropSyringa"); 
				 GameRegistry.registerBlock(blockCropTobacco, "blockCropTobacco"); 
				 GameRegistry.registerBlock(blockCropViolet, "blockCropViolet"); 
				 GameRegistry.registerBlock(blockCropWildStrawberry, "blockCropWildStrawberry"); 
				 GameRegistry.registerBlock(blockCropBlackberry, "blockCropBlackberry"); 
				 GameRegistry.registerBlock(blockCropBlueberry, "blockCropBlueberry"); 
					
				 GameRegistry.registerBlock(blockBluebellCrop, "blockBluebellCrop"); 
				 GameRegistry.registerBlock(blockNettleCrop, "blockNettleCrop"); 
				 GameRegistry.registerBlock(blockDillCrop, "blockDillCrop"); 
				 GameRegistry.registerBlock(blockGardeniaCrop, "blockGardeniaCrop"); 
				 GameRegistry.registerBlock(blockThistleCrop, "blockThistleCrop"); 
					
				blockWormwoodCrop = new BlockCrop(BandbItems.itemSyringa, "wormwood", "cross").setBlockName("blockWormwoodCrop"); 
				blockChivesCrop = new BlockCrop(BandbItems.itemTobacco, "chives", "cross").setBlockName("blockChivesCrop"); 
				blockChervilCrop = new BlockCrop(BandbItems.itemViolet , "chervil", "cross").setBlockName("blockChervilCrop"); 
				blockWatercressCrop = new BlockCrop(BandbItems.itemWildStrawberry , "watercress", "cross").setBlockName("blockWatercressCrop"); 
				blockThymeCrop = new BlockCrop(BandbItems.itemBlackBerry , "thyme", "cross").setBlockName("blockThymeCrop"); 

				GameRegistry.registerBlock(blockWormwoodCrop, "blockWormwoodCrop");
				GameRegistry.registerBlock(blockChivesCrop, "blockChivesCrop");
				GameRegistry.registerBlock(blockChervilCrop, "blockChervilCrop");
				GameRegistry.registerBlock(blockWatercressCrop, "blockWatercressCrop");
				GameRegistry.registerBlock(blockThymeCrop, "blockThymeCrop");
				
				blockSageCrop = new BlockCrop(BandbItems.itemSyringa, "sage", "cross").setBlockName("blockSageCrop"); 
				blockOreganoCrop = new BlockCrop(BandbItems.itemTobacco, "oregano", "cross").setBlockName("blockOreganoCrop"); 
				blockFennelCrop = new BlockCrop(BandbItems.itemViolet , "fennel", "cross").setBlockName("blockFennelCrop"); 
				blockGentianCrop = new BlockCrop(BandbItems.itemWildStrawberry , "gentian", "cross").setBlockName("blockGentianCrop"); 

				GameRegistry.registerBlock(blockSageCrop, "blockSageCrop");
				GameRegistry.registerBlock(blockOreganoCrop, "blockOreganoCrop");
				GameRegistry.registerBlock(blockFennelCrop, "blockFennelCrop");
				GameRegistry.registerBlock(blockGentianCrop, "blockGentianCrop");
				
				 //cereal
		    	blockCropOats = new BlockCropCereal(BandbItems.itemOats, "grain/oats").setBlockName("blockCropOats");
				blockCropBuckwheat = new BlockCropCereal(BandbItems.itemBuckwheat, "grain/buckwheat").setBlockName("blockCropBuckwheat");
				blockCropHemp = new BlockCropCereal(BandbItems.itemHemp, "grain/hemp").setBlockName("blockCropHemp");
				blockCropSpelt = new BlockCropCereal(BandbItems.itemSpelt, "grain/spelt").setBlockName("blockCropSpelt");
				blockCropFonio = new BlockCropCereal(BandbItems.itemFonio, "grain/fonio").setBlockName("blockCropFonio");
	
				blockCropHop = new BlockCropCereal(BandbItems.itemHop, "grain/hop").setBlockName("blockCropHop");
				blockCropMalt = new BlockCropCereal(BandbItems.itemMalt, "grain/malt").setBlockName("blockCropMalt");
				blockCropMillet = new BlockCropCereal(BandbItems.itemMillet, "grain/millet").setBlockName("blockCropMillet");
				blockCropRye = new BlockCropCereal(BandbItems.itemRye, "grain/rye").setBlockName("blockCropRye");
				blockCropSorghum = new BlockCropCereal(BandbItems.itemSorghum, "grain/sorghum").setBlockName("blockCropSorghum");
	
		    	GameRegistry.registerBlock(blockCropOats, "blockCropOats");
		    	GameRegistry.registerBlock(blockCropBuckwheat, "blockCropBuckwheat");
		    	GameRegistry.registerBlock(blockCropHemp, "blockCropHemp");
		    	GameRegistry.registerBlock(blockCropSpelt, "blockCropSpelt");
		    	GameRegistry.registerBlock(blockCropFonio, "blockCropFonio");
	
		    	GameRegistry.registerBlock(blockCropHop, "blockCropHop");
		    	GameRegistry.registerBlock(blockCropMalt, "blockCropMalt");
		    	GameRegistry.registerBlock(blockCropMillet, "blockCropMillet");
		    	GameRegistry.registerBlock(blockCropRye, "blockCropRye");
		    	GameRegistry.registerBlock(blockCropSorghum, "blockCropSorghum");
		    	
		    	blockCropCorn = new BlockCropCereal(BandbItems.itemCorn, "grain/corn").setBlockName("blockCropCorn");
		    	blockCropBarley = new BlockCropCereal(BandbItems.itemBarley, "grain/barley").setBlockName("blockCropBarley");
		    	blockCropRice = new BlockCropCereal(BandbItems.itemRice, "grain/rice").setBlockName("blockCropRice");
	
		    	GameRegistry.registerBlock(blockCropCorn, "blockCropCorn");
		    	GameRegistry.registerBlock(blockCropBarley, "blockCropBarley");
		    	GameRegistry.registerBlock(blockCropRice, "blockCropRice");
		    	
		    	//Fruits
		    	blockCropPineappleCayenne = new BlockCropFruit(BandbItems.itemPineappleCayenne, "fruits/pineapplecayenne", "cross").setBlockName("blockCropPineappleCayenne");
				blockCropPineappleVictoria = new BlockCropFruit(BandbItems.itemPineappleVictoria, "fruits/pineapplevictoria", "cross").setBlockName("blockCropPineappleVictoria");
				blockCropCranberry = new BlockCropFruit(BandbItems.itemCranberry, "fruits/cranberry", "cross").setBlockName("blockCropCranberry");
				blockCropBlackcurrant = new BlockCropFruit(BandbItems.itemBlackcurrant, "fruits/blackcurrant", "cross").setBlockName("blockCropBlackcurrant");
				blockCropPricklyPear = new BlockCropFruit(BandbItems.itemPricklyPear, "fruits/pricklypear", "cross").setBlockName("blockCropPricklyPear");
				
				blockCropStrawberry = new BlockCropFruit(BandbItems.itemStrawberry, "fruits/strawberry", "cross").setBlockName("blockCropStrawberry");
				blockCropRaspberry = new BlockCropFruit(BandbItems.itemRaspberry, "fruits/raspberry", "cross").setBlockName("blockCropRaspberry");
				blockCropCurrant = new BlockCropFruit(BandbItems.itemCurrant, "fruits/currant", "cross").setBlockName("blockCropCurrant");
				blockCropRhubarb = new BlockCropFruit(BandbItems.itemRhubarb, "fruits/rhubarb", "cross").setBlockName("blockCropRhubarb");
				blockCropTomato = new BlockCropFruit(BandbItems.itemTomato, "fruits/tomato", "square").setBlockName("blockCropTomato");

		    	GameRegistry.registerBlock(blockCropPineappleCayenne, "blockCropPineappleCayenne");
		    	GameRegistry.registerBlock(blockCropPineappleVictoria, "blockCropPineappleVictoria");
		    	GameRegistry.registerBlock(blockCropCranberry, "blockCropCranberry");
		    	GameRegistry.registerBlock(blockCropBlackcurrant, "blockCropBlackcurrant");
		    	GameRegistry.registerBlock(blockCropPricklyPear, "blockCropPricklyPear");

		    	GameRegistry.registerBlock(blockCropStrawberry, "blockCropStrawberry");
		    	GameRegistry.registerBlock(blockCropRaspberry, "blockCropRaspberry");
		    	GameRegistry.registerBlock(blockCropCurrant, "blockCropCurrant");
		    	GameRegistry.registerBlock(blockCropRhubarb, "blockCropRhubarb");
		    	GameRegistry.registerBlock(blockCropTomato, "blockCropTomato");
		    	
		    	//Vegetables
		    	blockCropAsparagus = new BlockCropVegetable(BandbItems.itemAsparagus, "vegetables/asparagus", "cross").setBlockName("blockCropAsparagus");
				blockCropGarlic = new BlockCropVegetable(BandbItems.itemGarlic, "vegetables/garlic", "cross").setBlockName("blockCropGarlic");
				blockCropEggplant = new BlockCropVegetable(BandbItems.itemEggplant, "vegetables/eggplant", "cross").setBlockName("blockCropEggplant");
				blockCropBeet = new BlockCropVegetable(BandbItems.itemBeet, "vegetables/beet", "cross").setBlockName("blockCropBeet");
				blockCropBroccoli = new BlockCropVegetable(BandbItems.itemBroccoli, "vegetables/broccoli", "cross").setBlockName("blockCropBroccoli");
				
				blockCropPeanut = new BlockCropVegetable(BandbItems.itemPeanut, "vegetables/peanut", "cross").setBlockName("blockCropPeanut");
				blockCropCarrotTouchon = new BlockCropVegetable(BandbItems.itemCarrotTouchon, "vegetables/carrottouchon", "cross").setBlockName("blockCropCarrotTouchon");
				blockCropCelery = new BlockCropVegetable(BandbItems.itemCelery, "vegetables/celery", "cross").setBlockName("blockCropCelery");
				blockCropBrusselsSprout = new BlockCropVegetable(BandbItems.itemBrusselsSprout, "vegetables/brusselssprout", "cross").setBlockName("blockCropBrusselsSprout");
				blockCropCauliflower = new BlockCropVegetable(BandbItems.itemCauliflower, "vegetables/cauliflower", "cross").setBlockName("blockCropCauliflower");
														
		    	GameRegistry.registerBlock(blockCropAsparagus, "blockCropAsparagus");
		    	GameRegistry.registerBlock(blockCropGarlic, "blockCropGarlic");
		    	GameRegistry.registerBlock(blockCropEggplant, "blockCropEggplant");
		    	GameRegistry.registerBlock(blockCropBeet, "blockCropBeet");
		    	GameRegistry.registerBlock(blockCropBroccoli, "blockCropBroccoli");
		    	
		    	GameRegistry.registerBlock(blockCropPeanut, "blockCropPeanut");
				GameRegistry.registerBlock(blockCropCarrotTouchon, "blockCropCarrotTouchon");
				GameRegistry.registerBlock(blockCropCelery, "blockCropCelery");
				GameRegistry.registerBlock(blockCropBrusselsSprout, "blockCropBrusselsSprout");
				GameRegistry.registerBlock(blockCropCauliflower, "blockCropCauliflower");
				
				blockCropRedCabbage = new BlockCropVegetable(BandbItems.itemRedCabbage, "vegetables/redcabbage", "cross").setBlockName("blockCropRedCabbage");
				blockCropCabbage = new BlockCropVegetable(BandbItems.itemCabbage, "vegetables/cabbage", "cross").setBlockName("blockCropCabbage");
				blockCropCucumber = new BlockCropVegetable(BandbItems.itemCucumber, "vegetables/cucumber", "cross").setBlockName("blockCropCucumber");
				blockCropZucchini = new BlockCropVegetable(BandbItems.itemZucchini, "vegetables/zucchini", "cross").setBlockName("blockCropZucchini");
				blockCropShallots = new BlockCropVegetable(BandbItems.itemShallots, "vegetables/shallots", "cross").setBlockName("blockCropShallots");
				
				blockCropSpinach = new BlockCropVegetable(BandbItems.itemSpinach, "vegetables/spinach", "cross").setBlockName("blockCropSpinach");
				blockCropGinger = new BlockCropVegetable(BandbItems.itemGinger, "vegetables/ginger", "cross").setBlockName("blockCropGinger");
				blockCropFrenchBeans = new BlockCropVegetable(BandbItems.itemFrenchBeans, "vegetables/frenchbeans", "cross").setBlockName("blockCropFrenchBeans");
				blockCropLens = new BlockCropVegetable(BandbItems.itemLens, "vegetables/lens", "cross").setBlockName("blockCropLens");
				blockCropTurnip = new BlockCropVegetable(BandbItems.itemTurnip, "vegetables/turnip", "cross").setBlockName("blockCropTurnip");
														
		    	GameRegistry.registerBlock(blockCropRedCabbage, "blockCropRedCabbage");
		    	GameRegistry.registerBlock(blockCropCabbage, "blockCropCabbage");
		    	GameRegistry.registerBlock(blockCropCucumber, "blockCropCucumber");
		    	GameRegistry.registerBlock(blockCropZucchini, "blockCropZucchini");
		    	GameRegistry.registerBlock(blockCropShallots, "blockCropShallots");
		    	
		    	GameRegistry.registerBlock(blockCropSpinach, "blockCropSpinach");
				GameRegistry.registerBlock(blockCropGinger, "blockCropGinger");
				GameRegistry.registerBlock(blockCropFrenchBeans, "blockCropFrenchBeans");
				GameRegistry.registerBlock(blockCropLens, "blockCropLens");
				GameRegistry.registerBlock(blockCropTurnip, "blockCropTurnip");
				
				blockCropOnion = new BlockCropVegetable(BandbItems.itemOnion, "vegetables/onion", "cross").setBlockName("blockCropOnion");
				blockCropParsnip = new BlockCropVegetable(BandbItems.itemParsnip, "vegetables/parsnip", "cross").setBlockName("blockCropParsnip");
				blockCropParsley = new BlockCropVegetable(BandbItems.itemParsley, "vegetables/parsley", "cross").setBlockName("blockCropParsley");
				blockCropChili = new BlockCropVegetable(BandbItems.itemChili, "vegetables/chili", "cross").setBlockName("blockCropChili");
				blockCropLeek = new BlockCropVegetable(BandbItems.itemLeek, "vegetables/leek", "cross").setBlockName("blockCropLeek");
				
				blockCropRedPepper = new BlockCropVegetable(BandbItems.itemSweetRedPepper, "vegetables/redpepper", "cross").setBlockName("blockCropRedPepper");
				blockCropGreenPepper = new BlockCropVegetable(BandbItems.itemSweetGreenPepper, "vegetables/greenpepper", "cross").setBlockName("blockCropGreenPepper");
				blockCropRadish = new BlockCropVegetable(BandbItems.itemRadish, "vegetables/radish", "cross").setBlockName("blockCropRadish");
				blockCropRutabaga = new BlockCropVegetable(BandbItems.itemRutabaga, "vegetables/rutabaga", "cross").setBlockName("blockCropRutabaga");
				blockCropSalat = new BlockCropVegetable(BandbItems.itemSalat, "vegetables/salat", "cross").setBlockName("blockCropSalat");
														
		    	GameRegistry.registerBlock(blockCropOnion, "blockCropOnion");
		    	GameRegistry.registerBlock(blockCropParsnip, "blockCropParsnip");
		    	GameRegistry.registerBlock(blockCropParsley, "blockCropParsley");
		    	GameRegistry.registerBlock(blockCropChili, "blockCropChili");
		    	GameRegistry.registerBlock(blockCropLeek, "blockCropLeek");
		    	
		    	GameRegistry.registerBlock(blockCropRedPepper, "blockCropRedPepper");
				GameRegistry.registerBlock(blockCropGreenPepper, "blockCropGreenPepper");
				GameRegistry.registerBlock(blockCropRadish, "blockCropRadish");
				GameRegistry.registerBlock(blockCropRutabaga, "blockCropRutabaga");
				GameRegistry.registerBlock(blockCropSalat, "blockCropSalat");
				
				blockCropChicory = new BlockCropVegetable(BandbItems.itemChicory, "vegetables/chicory", "cross").setBlockName("blockCropChicory");
				blockCropFlageolet = new BlockCropVegetable(BandbItems.itemFlageolet, "vegetables/flageolet", "cross").setBlockName("blockCropFlageolet");
				blockCropPea = new BlockCropVegetable(BandbItems.itemPea, "vegetables/pea", "cross").setBlockName("blockCropPea");
				blockCropChickpea = new BlockCropVegetable(BandbItems.itemChickpea, "vegetables/chickpea", "cross").setBlockName("blockCropChickpea");
				blockCropYellowPepper = new BlockCropVegetable(BandbItems.itemSweetYellowPepper, "vegetables/yellowpepper", "cross").setBlockName("blockCropYellowPepper");
														
		    	GameRegistry.registerBlock(blockCropChicory, "blockCropChicory");
		    	GameRegistry.registerBlock(blockCropFlageolet, "blockCropFlageolet");
		    	GameRegistry.registerBlock(blockCropPea, "blockCropPea");
		    	GameRegistry.registerBlock(blockCropChickpea, "blockCropChickpea");
		    	GameRegistry.registerBlock(blockCropYellowPepper, "blockCropYellowPepper");
		    	
				blockCropGherkin = new BlockCropVegetable(BandbItems.itemGherkin, "vegetables/gherkin", "cross").setBlockName("blockCropGherkin");
				blockCropCherryTomato = new BlockCropVegetable(BandbItems.itemCherryTomato, "vegetables/cherrytomato", "cross").setBlockName("blockCropCherryTomato");

		    	GameRegistry.registerBlock(blockCropGherkin, "blockCropGherkin");
		    	GameRegistry.registerBlock(blockCropCherryTomato, "blockCropCherryTomato");

		    	//coffee
		    	blockCropCoffeeArabicas = new BlockCropCoffee(BandbItems.itemCoffeeArabicas, "coffee/arabicas").setBlockName("blockCropCoffeeArabicas");
				blockCropCoffeeBlueMountain = new BlockCropCoffee(BandbItems.itemCoffeeBlueMountain, "coffee/bluemountain").setBlockName("blockCropCoffeeBlueMountain");
				blockCropCoffeeBourbonPointu = new BlockCropCoffee(BandbItems.itemCoffeeBourbonPointu, "coffee/bourbonpointu").setBlockName("blockCropCoffeeBourbonPointu");
				blockCropCoffeeCattura = new BlockCropCoffee(BandbItems.itemCoffeeCattura, "coffee/cattura").setBlockName("blockCropCoffeeCattura");
				blockCropCoffeeHarrar = new BlockCropCoffee(BandbItems.itemCoffeeHarrar, "coffee/harrar").setBlockName("blockCropCoffeeHarrar");
				
				blockCropCoffeeHuehuetenango = new BlockCropCoffee(BandbItems.itemCoffeeHuehuetenango, "coffee/huehuetenango").setBlockName("blockCropCoffeeHuehuetenango");
				blockCropCoffeeJava = new BlockCropCoffee(BandbItems.itemCoffeeJava, "coffee/java").setBlockName("blockCropCoffeeJava");
				blockCropCoffeeKenyaAA = new BlockCropCoffee(BandbItems.itemCoffeeKenyaAA, "coffee/kenyaaa").setBlockName("blockCropCoffeeKenyaAA");
				blockCropCoffeeKona = new BlockCropCoffee(BandbItems.itemCoffeeKona, "coffee/kona").setBlockName("blockCropCoffeeKona");
				blockCropCoffeeKontirWildForest = new BlockCropCoffee(BandbItems.itemCoffeeKontirWildForest, "coffee/kontirwildforest").setBlockName("blockCropCoffeeKontirWildForest");

		    	GameRegistry.registerBlock(blockCropCoffeeArabicas, "blockCropCoffeeArabicas");
		    	GameRegistry.registerBlock(blockCropCoffeeBlueMountain, "blockCropCoffeeBlueMountain");
		    	GameRegistry.registerBlock(blockCropCoffeeBourbonPointu, "blockCropCoffeeBourbonPointu");
		    	GameRegistry.registerBlock(blockCropCoffeeCattura, "blockCropCoffeeCattura");
		    	GameRegistry.registerBlock(blockCropCoffeeHarrar, "blockCropCoffeeHarrar");

		    	GameRegistry.registerBlock(blockCropCoffeeHuehuetenango, "blockCropCoffeeHuehuetenango");
		    	GameRegistry.registerBlock(blockCropCoffeeJava, "blockCropCoffeeJava");
		    	GameRegistry.registerBlock(blockCropCoffeeKenyaAA, "blockCropCoffeeKenyaAA");
		    	GameRegistry.registerBlock(blockCropCoffeeKona, "blockCropCoffeeKona");
		    	GameRegistry.registerBlock(blockCropCoffeeKontirWildForest, "blockCropCoffeeKontirWildForest");
		    	
		    	blockCropCoffeeKopiLuwak = new BlockCropCoffee(BandbItems.itemCoffeeKopiLuwak, "coffee/kopiluwak").setBlockName("blockCropCoffeeKopiLuwak");
				blockCropCoffeeKupeAlamid = new BlockCropCoffee(BandbItems.itemCoffeeKupeAlamid, "coffee/kupealamid").setBlockName("blockCropCoffeeKupeAlamid");
				blockCropCoffeeMoka = new BlockCropCoffee(BandbItems.itemCoffeeMoka, "coffee/moka").setBlockName("blockCropCoffeeMoka");
				blockCropCoffeeMundoNovo = new BlockCropCoffee(BandbItems.itemCoffeeMundoNovo, "coffee/mundonovo").setBlockName("blockCropCoffeeMundoNovo");
				blockCropCoffeeMuragogype = new BlockCropCoffee(BandbItems.itemCoffeeMuragogype, "coffee/muragogype").setBlockName("blockCropCoffeeMuragogype");
				
				blockCropCoffeePeaberry = new BlockCropCoffee(BandbItems.itemCoffeePeaberry, "coffee/peaberry").setBlockName("blockCropCoffeePeaberry");
				blockCropCoffeeTarrazu = new BlockCropCoffee(BandbItems.itemCoffeeTarrazu, "coffee/tarrazu").setBlockName("blockCropCoffeeTarrazu");
				blockCropCoffeeTorajaKalossi = new BlockCropCoffee(BandbItems.itemCoffeeTorajaKalossi, "coffee/torajakalossi").setBlockName("blockCropCoffeeTorajaKalossi");
				blockCropCoffeeYirgacheffe = new BlockCropCoffee(BandbItems.itemCoffeeYirgacheffe, "coffee/yirgacheffe").setBlockName("blockCropCoffeeYirgacheffe");
				blockCropTea = new BlockCropCoffee(BandbItems.itemTeaLeaves, "coffee/tea").setBlockName("blockCropTea");

		    	GameRegistry.registerBlock(blockCropCoffeeKopiLuwak, "blockCropCoffeeKopiLuwak");
		    	GameRegistry.registerBlock(blockCropCoffeeKupeAlamid, "blockCropCoffeeKupeAlamid");
		    	GameRegistry.registerBlock(blockCropCoffeeMoka, "blockCropCoffeeMoka");
		    	GameRegistry.registerBlock(blockCropCoffeeMundoNovo, "blockCropCoffeeMundoNovo");
		    	GameRegistry.registerBlock(blockCropCoffeeMuragogype, "blockCropCoffeeMuragogype");

		    	GameRegistry.registerBlock(blockCropCoffeePeaberry, "blockCropCoffeePeaberry");
		    	GameRegistry.registerBlock(blockCropCoffeeTarrazu, "blockCropCoffeeTarrazu");
		    	GameRegistry.registerBlock(blockCropCoffeeTorajaKalossi, "blockCropCoffeeTorajaKalossi");
		    	GameRegistry.registerBlock(blockCropCoffeeYirgacheffe, "blockCropCoffeeYirgacheffe");
		    	GameRegistry.registerBlock(blockCropTea, "blockCropTea");	    
		    	 
		    	//grape
		    	blockCropGrapeCot = new BlockCropGrapeRed(BandbItems.itemGrapeCot, "cot").setBlockName("blockCropGrapeCot");
		    	
		    	GameRegistry.registerBlock(blockCropGrapeCot, "blockCropGrapeCot");

		 
	 }
	
	}
