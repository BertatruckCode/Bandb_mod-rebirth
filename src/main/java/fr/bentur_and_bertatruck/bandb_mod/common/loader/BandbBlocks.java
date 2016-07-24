package fr.bentur_and_bertatruck.bandb_mod.common.loader;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import cpw.mods.fml.common.registry.GameRegistry;
import fr.bentur_and_bertatruck.bandb_mod.common.Bandb_mod;
import fr.bentur_and_bertatruck.bandb_mod.common.blockDecoration;
import fr.bentur_and_bertatruck.bandb_mod.common.blockDecorationGlass;
import fr.bentur_and_bertatruck.bandb_mod.common.blockDecorationSandstone;
import fr.bentur_and_bertatruck.bandb_mod.common.blockDecorationTnt;
import fr.bentur_and_bertatruck.bandb_mod.common.block.BlockBasic;
import fr.bentur_and_bertatruck.bandb_mod.common.block.BlockIngot;
import fr.bentur_and_bertatruck.bandb_mod.common.block.BlockMilka;
import fr.bentur_and_bertatruck.bandb_mod.common.block.BlockOreDropGem;
import fr.bentur_and_bertatruck.bandb_mod.common.block.BlockOreDropOre;
import fr.bentur_and_bertatruck.bandb_mod.common.block.furniture.BlockFurnitureKitchenWorktopA;
import fr.bentur_and_bertatruck.bandb_mod.common.block.furniture.tileEntity.TileEntityFurnitureKitchenWorktopA;
import fr.bentur_and_bertatruck.bandb_mod.nature.block.BlockMushroom;
import fr.bentur_and_bertatruck.bandb_mod.nature.block.BlockMushroomOre;
import fr.bentur_and_bertatruck.bandb_mod.nature.block.BlockPlant;
import fr.bentur_and_bertatruck.bandb_mod.nature.block.BlockPlantDesert;
import fr.bentur_and_bertatruck.bandb_mod.nature.block.BlockTreeLeaf;
import fr.bentur_and_bertatruck.bandb_mod.nature.block.BlockTreePlank;
import fr.bentur_and_bertatruck.bandb_mod.nature.block.BlockTreeSaplingApple;
import fr.bentur_and_bertatruck.bandb_mod.nature.block.BlockTreeSaplingFruit;
import fr.bentur_and_bertatruck.bandb_mod.nature.block.BlockTreeSaplingHight;
import fr.bentur_and_bertatruck.bandb_mod.nature.block.BlockTreeSaplingPalmTree;
import fr.bentur_and_bertatruck.bandb_mod.nature.block.BlockTreeWood;

public class BandbBlocks {
	
		//woods
		public static Block blockAlmondWood,blockApricotWood,blockBananaWood,blockCherryWood,blockClementineWood;
		public static Block blockDateWood,blockDragonfruitWood,blockFigWood,blockGuavaWood,blockLemonWood;
		public static Block blockLimeWood,blockLycheeWood,blockPassionfruitWood,blockPomegranateWood,blockQuinceWood;
		public static Block blockAvocadoWood,blockCoconutWood,blockTangerineWood,blockMangoWood,blockChestnutWood;
		public static Block blockMirabelleWood,blockNutsWood,blockWalnutWood,blockOliveWood,blockOrangeWood;
		public static Block blockGrapefruitWood,blockPapayaWood,blockPeachWood,blockPearWood,blockPlumWood;
		public static Block blockAfricanWood,blockAniseWood,blockStarAniseWood,blockCacaoWood,blockCashewWood;
		public static Block blockBreadNutWood,blockKiwiWood,blockPistachioWood,blockVanillaWood;
		public static Block blockAmlaWood,blockPersimmonWood,blockNectarineWood,blockKumquatWood,blockJujubeWood;
		public static Block blockAllspiceWood, blockBaelWood, blockPlantainWood, blockBlackCherryWood, blockBlackthornWood;
		public static Block blockBrazilNutWood, blockButternutWood, blockCinnamonWood, blockCloveWood, blockDamsonPlumWood;
		public static Block blockElderberryWood, blockLaurelWood, blockMacadamiaWood, blockPomeloWood, blockSatsumaWood;
		public static Block blockBloodOrangeWood,blockMorelloCherryWood,blockWhitePeachWood,blockAbiuWood;
		public static Block blockLonganWood,blockLoquatWood,blockNutmegWood,blockPlaneWood,blockTonkaBeanWood;
		public static Block blockGrapefruitPinkWood,blockMapleWood,blockBerWood,blockCurryWood,blockRedBananaWood;
		public static Block blockBunyaNutWood,blockGingkoNutWood,blockHuckleberriesWood,blockJackFruitWood,blockMameySapoteWood;
		public static Block blockMangosteenWood,blockOhiaAiWood,blockOsageOrangeWood,blockParadiseNutWood,blockPineNutWood;
		public static Block blockSapodillaWood,blockSoursopWood,blockTamarilloWood,blockWoodCinchona;
			//apple
		public static Block blockCrabappleWood,blockAppleAntaresWood,blockAppleArianeWood,blockAppleBelchardChantecierWood,blockAppleBelleDeBoskoopWood;
		public static Block blockAppleBraeburnWood,blockAppleElstarWood,blockAppleFujiWood,blockAppleGalaWood,blockAppleGoldenWood;
		public static Block blockAppleGrannySmithWood,blockAppleHoneycrunchWood,blockAppleJazzWood,blockAppleJonagoldJonagoredWood,blockAppleLesRougesWood;
		public static Block blockApplePinkLadyWood,blockApplePommeLimousinWood,blockAppleReineDesReinettesWood,blockAppleReinetteGriseDuCanadaWood,blockAppleTentationWood;
		
		//leaves
		public static Block blockAlmondLeaves,blockApricotLeaves,blockBananaLeaves,blockCherryLeaves,blockClementineLeaves;
		public static Block blockDateLeaves,blockDragonfruitLeaves,blockFigLeaves,blockGuavaLeaves,blockLemonLeaves;
		public static Block blockLimeLeaves,blockLycheeLeaves,blockPassionfruitLeaves,blockPomegranateLeaves,blockQuinceLeaves;
    	public static Block blockAvocadoLeaves,blockCoconutLeaves,blockTangerineLeaves,blockMangoLeaves,blockChestnutLeaves;
    	public static Block blockMirabelleLeaves,blockNutsLeaves,blockWalnutLeaves,blockOliveLeaves,blockOrangeLeaves;
    	public static Block blockGrapefruitLeaves,blockPapayaLeaves,blockPeachLeaves,blockPearLeaves,blockPlumLeaves;
		public static Block blockAfricanLeaves,blockAniseLeaves,blockStarAniseLeaves,blockCacaoLeaves,blockCashewLeaves;
		public static Block blockBreadNutLeaves,blockKiwiLeaves,blockPistachioLeaves,blockVanillaLeaves;
		public static Block blockAmlaLeaves,blockPersimmonLeaves,blockNectarineLeaves,blockKumquatLeaves,blockJujubeLeaves;
		public static Block blockAllspiceLeaves, blockBaelLeaves, blockPlantainLeaves, blockBlackCherryLeaves, blockBlackthornLeaves;
		public static Block blockBrazilNutLeaves, blockButternutLeaves, blockCinnamonLeaves, blockCloveLeaves, blockDamsonPlumLeaves;
		public static Block blockElderberryLeaves, blockLaurelLeaves, blockMacadamiaLeaves, blockPomeloLeaves, blockSatsumaLeaves;
		public static Block blockWhitePeachLeaves,blockMorelloCherryLeaves,blockBloodOrangeLeaves,blockLeavesAbiu;
		public static Block blockLonganLeaves,blockLoquatLeaves,blockNutmegLeaves,blockPlaneLeaves,blockTonkaBeanLeaves;
		public static Block blockMapleLeaves,blockGrapefruitPinkLeaves,blockBerLeaves,blockCurryLeaves,blockRedBananaLeaves;
		public static Block blockBunyaNutLeaves,blockGingkoNutLeaves,blockHuckleberriesLeaves,blockJackFruitLeaves,blockMameySapoteLeaves;
		public static Block blockMangosteenLeaves,blockOhiaAiLeaves,blockOsageOrangeLeaves,blockParadiseNutLeaves,blockPineNutLeaves;
		public static Block blockSapodillaLeaves,blockSoursopLeaves,blockTamarilloLeaves,blockLeavesCinchona;
    		//apple
    	public static Block blockCrabappleLeaves,blockAppleAntaresLeaves,blockAppleArianeLeaves,blockAppleBelchardChantecierLeaves,blockAppleBelleDeBoskoopLeaves;	    	
		public static Block blockAppleBraeburnLeaves,blockAppleElstarLeaves,blockAppleFujiLeaves,blockAppleGalaLeaves,blockAppleGoldenLeaves;
		public static Block blockAppleGrannySmithLeaves,blockAppleHoneycrunchLeaves,blockAppleJazzLeaves,blockAppleJonagoldJonagoredLeaves,blockAppleLesRougesLeaves;
		public static Block blockApplePinkLadyLeaves,blockApplePommeLimousinLeaves,blockAppleReineDesReinettesLeaves,blockAppleReinetteGriseDuCanadaLeaves,blockAppleTentationLeaves; 
		
		//sapling		
		public static Block blockAlmondSapling,blockApricotSapling,blockBananaSapling,blockCherrySapling,blockClementineSapling;
		public static Block blockDateSapling,blockDragonfruitSapling,blockFigSapling,blockGuavaSapling,blockLemonSapling;
		public static Block blockLimeSapling,blockLycheeSapling,blockPassionfruitSapling,blockPomegranateSapling,blockQuinceSapling;
    	public static Block blockAvocadoSapling,blockCoconutSapling,blockTangerineSapling,blockMangoSapling,blockChestnutSapling;
    	public static Block blockMirabelleSapling,blockNutsSapling,blockWalnutSapling,blockOliveSapling,blockOrangeSapling;
    	public static Block blockGrapefruitSapling,blockPapayaSapling,blockPeachSapling,blockPearSapling,blockPlumSapling;
    	public static Block blockAfricanSapling,blockAniseSapling,blockStarAniseSapling,blockCacaoSapling,blockCashewSapling;
    	public static Block blockBreadNutSapling,blockKiwiSapling,blockPistachioSapling,blockVanillaSapling;
    	public static Block blockAmlaSapling,blockJujubeSapling,blockKumquatSapling,blockNectarineSapling,blockPersimmonSapling;
    	public static Block blockAllspiceSapling, blockBaelSapling, blockBananaPlantainSapling, blockBlackCherrySapling, blockBlackthornSapling;
    	public static Block blockBrazilNutSapling, blockButternutSapling, blockCinnamonSapling, blockCloveSapling, blockDamsonPlumSapling;
    	public static Block blockElderberrySapling, blockLaurelSapling, blockMacadamiaSapling, blockPomeloSapling, blockSatsumaSapling;
    	public static Block blockBloodOrangeSapling,blockMorelloCherrySapling,blockWhitePeachSapling,blockAbiuSapling;
    	public static Block blockLonganSapling,blockLoquatSapling,blockSaplingNutmeg,blockSaplingPlane,blockSaplingTonkaBean;
    	public static Block blockGrapefruitPinkSapling,blockSaplingMaple,blockBerSapling,blockCurrySapling,blockRedBananaSapling;
    	public static Block blockBunyaNutSapling,blockGingkoNutSapling,blockHuckleberriesSapling,blockJackFruitSapling,blockMameySapoteSapling;
    	public static Block blockMangosteenSapling,blockOhiaAiSapling,blockOsageOrangeSapling,blockParadiseNutSapling,blockPineNutSapling;
    	public static Block blockSoursopSapling,blockTamarilloSapling,blockSapodillaSapling,blockSaplingCinchona;
    	
    		//apple
    	public static Block blockCrabappleSapling,blockAppleAntaresSapling,blockAppleArianeSapling,blockAppleBelchardChancelierSapling,blockAppleBelleDeBoskoopSapling;
    	public static Block blockAppleBraeburnSapling,blockAppleElstarSapling,blockAppleFujiSapling,blockAppleGalaSapling,blockAppleGoldenSapling;
    	public static Block blockAppleGrannySmithSapling,blockAppleHoneycrunchSapling,blockAppleJazzSapling,blockAppleJonagoldJonagoredSapling,blockAppleLesRougesSapling;
    	public static Block blockApplePinkLadySapling,blockApplePommeDuLimousinSapling,blockAppleReineDesReinettesSapling,blockAppleReinetteGriseDuCanadaSapling,blockAppleTentationSapling;  	
    		
    	//plank   	
    	public static Block blockPlankAlmond,blockPlankAvocado,blockPlankBanana,blockPlankCherry,blockPlankChestnut;
		public static Block blockPlankClementine,blockPlankDate,blockPlankDragonfruit,blockPlankFig,blockPlankGrapefruit;
		public static Block blockPlankGuava,blockPlankLemon,blockPlankLime,blockPlankLychee,blockPlankMango;
		public static Block blockPlankMirabelle,blockPlankNuts,blockPlankOlive,blockPlankOrange,blockPlankPapaya;
		public static Block blockPlankPassionfruit,blockPlankPeach,blockPlankPear,blockPlankPlum,blockPlankPomegranate;
		public static Block blockPlankQuince,blockPlankTangerine,blockPlankWalnut,blockPlankApricot,blockPlankCoconut;
		public static Block blockPlankAmla,blockPlankAppleAntares,blockPlankAppleAriane,blockPlankAppleBelchardChancelier,blockPlankAppleBelleDeBoskoop;
		public static Block blockPlankAppleBraeburn,blockPlankAppleElstar,blockPlankAppleFuji,blockPlankAppleGala,blockPlankAppleGolden;
		public static Block blockPlankAppleGrannySmith,blockPlankAppleHoneyCrunch,blockPlankAppleJazz,blockPlankAppleJonagoldJonagored,blockPlankAppleLesRouges;
		public static Block blockPlankApplePinkLady,blockPlankApplePommeLimousin,BlockPlankAppleReineDesReinettes,blockPlankAppleReinetteGriseDuCanada,blockPlankAppleTentation;
		public static Block blockPlankCrabapple,blockPlankJujube,blockPlankKumquat,blockPlankNectarine,blockPlankPersimmon;
		public static Block blockPlankAfrican,blockPlankBreadnut,blockPlankCashew,blockPlankPistachio,blockPlankVanilla;
		public static Block blockPlankAnise,blockPlankCacao,blockPlankKiwi,blockPlankStarAnise;
		public static Block blockPlankAbiu,blockPlankAllspice,blockPlankBael,blockPlankBlackCherry,blockPlankBlackthorn;
		public static Block blockPlankBloodOrange,blockPlankBrazilNut,blockPlankButternut,blockPlankCinnamon,blockPlankClove;
		public static Block blockPlankDamsonPlum,blockPlankElderberry,blockPlankLaurel,blockPlankLongan,blockPlankLoquat;
		public static Block blockPlankMacadamia,blockPlankMorelloCherry,blockPlankNutmeg,blockPlankPlane,blockPlankPlantain;
		public static Block blockplankPomelo,blockPlankSatsuma,blockPlankTonkaBean,blockPlankWhitePeach;
		public static Block blockPlankGrapefruitPink,blockPlankMaple,blockPlankBer,blockPlankCurry,blockPlankRedBanana;
		public static Block blockPlankBunyaNut,blockPlankGingkoNut,blockPlankHuckleberries,blockPlankJackFruit,blockPlankMameySapote;
		public static Block blockPlankMangosteen,blockPlankOhiaAi,blockPlankOsageOrange,blockPlankParadiseNut,blockPlankPineNut;
		public static Block blockPlankSapodilla,blockPlankSoursop,blockPlankTamarillo,blockPlankCinchona;
		
		//block plants
		public static Block blockMint,blockRape,blockBetterCactus,blockDaisy,blockOrchid;	
		public static Block blockSesame,blockLicorice,blockHibiscus,blockJasmine,blockLavender;
		public static Block blockRosmary,blockTarragon,blockAgave,blockAmaryllisPink,blockAmaryllisRed;
		public static Block blockAmaryllisWhite,blockBachelorsButtonBlue,blockBelladonna,blockBlowball,blockButtercup;
		public static Block blockCallaBlack,blockCallaWhite,blockChrysantheme,blockEnzian,blockFoxglove;
		public static Block blockHeather,blockIrisBlue,blockIrisPurple,blockLily,blockMarshMarigold;
		public static Block blockPansy,blockPeony,blockSyringa,blockViolet,blockLemonGrass;
		public static Block blockPeyote,blockBluebell,blockDill,blockNettle,blockGardenia;
		public static Block blockThistle;
		public static Block blockWormwood,blockCinchona,blockChives,blockChervil,blockWatercress;
		public static Block blockThyme,blockSage,blockOregano,blockFennel,blockGentian;
			//mushrooms	
		public static Block blockTruffle,blockMorel,blockHornOfPlenty,blockCep,blockHydnumRepandum;
		public static Block blockAmanitaMuscaria;
						
		//ore 
			//ingot 
		public static Block blockOreAluminium,blockOrePlatinum, blockOreTitan;
			//gem
		public static Block blockOreAmethyst,blockOreJade,blockOreOnyx;
		public static Block blockOreOpal,blockOreRuby,blockOreSalt,blockOreSapphire;
		public static Block blockOreTopaz,blockOrePainite;						
			//block ingot 
		public static Block blockAluminium,blockAmethyst,blockJade,blockPainite;
		public static Block blockOnyx,blockOpal;
		public static Block blockPlatinum;
		public static Block blockRuby,blockSapphire,blockSteel;
		public static Block blockTitan,blockTopaz;
		
		//block gen map
		public static Block blockMarble;
	
		//decoration		
			//brick
		public static Block blockDecorationBrick_1;
			//sandstone
		public static Block blockDecorationSandstone_1;
			//glass
		public static Block blockDecorationGlass_black_1;
			//other
		public static Block blockDecorationTnt_1,blockCobblestoneMilka,blockStoneMilka,blockDirtMilka_top;
		
		public static Block blockLambda;
		
		public static Block blockFurnitureKitchenWorktopA;
   	
		public static void loaderBlock(){
						
			blockAfricanWood = new BlockTreeWood(Material.wood).setBlockTextureName(Bandb_mod.MODID + ":tree/african/blockAfricanWood").setBlockName("blockAfricanWood");
	    	GameRegistry.registerBlock(blockAfricanWood , "blockAfricanWood");

	    	blockAlmondWood = new BlockTreeWood().setBlockTextureName(Bandb_mod.MODID + ":tree/almond/blockAlmondWood").setBlockName("blockAlmondWood");
			GameRegistry.registerBlock(blockAlmondWood , "blockAlmondWood");

	    	blockAmlaWood = new BlockTreeWood(Material.wood).setBlockTextureName(Bandb_mod.MODID + ":tree/amia/blockAmiaWood").setBlockName("blockAmlaWood");
	    	GameRegistry.registerBlock(blockAmlaWood , "blockAmlaWood");
	    	
	    	blockAniseWood = new BlockTreeWood(Material.wood).setBlockTextureName(Bandb_mod.MODID + ":tree/anise/blockAniseWood").setBlockName("blockAniseWood");
	    	GameRegistry.registerBlock(blockAniseWood , "blockAniseWood");
	    	
	    	blockApricotWood = new BlockTreeWood(Material.wood).setBlockTextureName(Bandb_mod.MODID + ":tree/apricot/blockApricotWood").setBlockName("blockApricotWood");
	    	GameRegistry.registerBlock(blockApricotWood , "blockApricotWood");

	    	blockAvocadoWood = new BlockTreeWood(Material.wood).setBlockTextureName(Bandb_mod.MODID + ":tree/avocado/blockAvocadoWood").setBlockName("blockAvocadoWood");
	    	GameRegistry.registerBlock(blockAvocadoWood , "blockAvocadoWood");
	    	
	    	blockBananaWood = new BlockTreeWood(Material.wood).setBlockTextureName(Bandb_mod.MODID + ":tree/banana/blockBananaWood").setBlockName("blockBananaWood");
	    	GameRegistry.registerBlock(blockBananaWood , "blockBananaWood");

	    	blockBreadNutWood = new BlockTreeWood(Material.wood).setBlockTextureName(Bandb_mod.MODID + ":tree/breadnut/blockWoodBreadNut").setBlockName("blockBreadNutWood");
	    	GameRegistry.registerBlock(blockBreadNutWood , "blockBreadNutWood");
	    	
	    	blockCacaoWood = new BlockTreeWood(Material.wood).setBlockTextureName(Bandb_mod.MODID + ":tree/cacao/blockWoodCacao").setBlockName("blockCacaoWood");
	    	GameRegistry.registerBlock(blockCacaoWood , "blockCacaoWood");
	    	
	    	blockCashewWood = new BlockTreeWood(Material.wood).setBlockTextureName(Bandb_mod.MODID + ":tree/cashew/blockCashewWood").setBlockName("blockCashewWood");
	    	GameRegistry.registerBlock(blockCashewWood , "blockCashewWood");
	    	 		    	
	    	blockCherryWood = new BlockTreeWood(Material.wood).setBlockTextureName(Bandb_mod.MODID + ":tree/cherry/blockCherryWood").setBlockName("blockCherryWood");
	    	GameRegistry.registerBlock(blockCherryWood , "blockCherryWood");

	    	blockChestnutWood = new BlockTreeWood(Material.wood).setBlockTextureName(Bandb_mod.MODID + ":tree/chestnut/blockChestnutWood").setBlockName("blockChestnutWood");				
	    	GameRegistry.registerBlock(blockChestnutWood , "blockChestnutWood");

	    	blockClementineWood = new BlockTreeWood(Material.wood).setBlockTextureName(Bandb_mod.MODID + ":tree/clementine/blockClementineWood").setBlockName("blockClementineWood");
	    	GameRegistry.registerBlock(blockClementineWood , "blockClementineWood");

	    	blockCoconutWood = new BlockTreeWood(Material.wood).setBlockTextureName(Bandb_mod.MODID + ":tree/coconut/blockCoconutWood").setBlockName("blockCoconutWood");
	    	GameRegistry.registerBlock(blockCoconutWood , "blockCoconutWood");

			blockDateWood = new BlockTreeWood(Material.wood).setBlockTextureName(Bandb_mod.MODID + ":tree/date/blockDateWood").setBlockName("blockDateWood");
	    	GameRegistry.registerBlock(blockDateWood , "blockDateWood");

			blockDragonfruitWood = new BlockTreeWood(Material.wood).setBlockTextureName(Bandb_mod.MODID + ":tree/dragonfruit/blockDragonfruitWood").setBlockName("blockDragonfruitWood");
	    	GameRegistry.registerBlock(blockDragonfruitWood , "blockDragonfruitWood");

			blockFigWood = new BlockTreeWood(Material.wood).setBlockTextureName(Bandb_mod.MODID + ":tree/fig/blockFigWood").setBlockName("blockFigWood");
	    	GameRegistry.registerBlock(blockFigWood , "blockFigWood");

	    	blockGrapefruitWood = new BlockTreeWood(Material.wood).setBlockTextureName(Bandb_mod.MODID + ":tree/grapefruit/blockGrapefruitWood").setBlockName("blockGrapefruitWood");
	    	GameRegistry.registerBlock(blockGrapefruitWood , "blockGrapefruitWood");
	    	
	    	blockGuavaWood = new BlockTreeWood(Material.wood).setBlockTextureName(Bandb_mod.MODID + ":tree/guava/blockGuavaWood").setBlockName("blockGuavaWood");
			GameRegistry.registerBlock(blockGuavaWood , "blockGuavaWood");

	    	blockJujubeWood = new BlockTreeWood(Material.wood).setBlockTextureName(Bandb_mod.MODID + ":tree/jujube/blockJujubeWood").setBlockName("blockJujubeWood");
	    	GameRegistry.registerBlock(blockJujubeWood , "blockJujubeWood");
	    	
	    	blockKiwiWood = new BlockTreeWood(Material.wood).setBlockTextureName(Bandb_mod.MODID + ":tree/kiwi/blockKiwiWood").setBlockName("blockKiwiWood");
	    	GameRegistry.registerBlock(blockKiwiWood , "blockKiwiWood");

	    	blockKumquatWood = new BlockTreeWood(Material.wood).setBlockTextureName(Bandb_mod.MODID + ":tree/kumquat/blockKumquatWood").setBlockName("blockKumquatWood");
	    	GameRegistry.registerBlock(blockKumquatWood , "blockKumquatWood");		    	
	    	
	    	blockLemonWood = new BlockTreeWood(Material.wood).setBlockTextureName(Bandb_mod.MODID + ":tree/lemon/blockLemonWood").setBlockName("blockLemonWood");
	    	GameRegistry.registerBlock(blockLemonWood , "blockLemonWood");

			blockLimeWood = new BlockTreeWood(Material.wood).setBlockTextureName(Bandb_mod.MODID + ":tree/lime/blockLimeWood").setBlockName("blockLimeWood");
			GameRegistry.registerBlock(blockLimeWood , "blockLimeWood");

			blockLycheeWood = new BlockTreeWood(Material.wood).setBlockTextureName(Bandb_mod.MODID + ":tree/lychee/blockLycheeWood").setBlockName("blockLycheeWood");
	    	GameRegistry.registerBlock(blockLycheeWood , "blockLycheeWood");

	    	blockMangoWood = new BlockTreeWood(Material.wood).setBlockTextureName(Bandb_mod.MODID + ":tree/mango/blockMangoWood").setBlockName("blockMangoWood");
	    	GameRegistry.registerBlock(blockMangoWood , "blockMangoWood");

			blockMirabelleWood = new BlockTreeWood(Material.wood).setBlockTextureName(Bandb_mod.MODID + ":tree/mirabelle/blockMirabelleWood").setBlockName("blockMirabelleWood");
			GameRegistry.registerBlock(blockMirabelleWood , "blockMirabelleWood");

			blockNectarineWood = new BlockTreeWood(Material.wood).setBlockTextureName(Bandb_mod.MODID + ":tree/nectarine/blockNectarineWood").setBlockName("blockNectarineWood");
	    	GameRegistry.registerBlock(blockNectarineWood , "blockNectarineWood");

			blockNutsWood = new BlockTreeWood(Material.wood).setBlockTextureName(Bandb_mod.MODID + ":tree/nuts/blockNutsWood").setBlockName("blockNutsWood");
	    	GameRegistry.registerBlock(blockNutsWood , "blockNutsWood");

			blockOliveWood = new BlockTreeWood(Material.wood).setBlockTextureName(Bandb_mod.MODID + ":tree/olive/blockOliveWood").setBlockName("blockOliveWood");
	    	GameRegistry.registerBlock(blockOliveWood , "blockOliveWood");

			blockOrangeWood = new BlockTreeWood(Material.wood).setBlockTextureName(Bandb_mod.MODID + ":tree/orange/blockOrangeWood").setBlockName("blockOrangeWood");
	    	GameRegistry.registerBlock(blockOrangeWood , "blockOrangeWood");

			blockPapayaWood = new BlockTreeWood(Material.wood).setBlockTextureName(Bandb_mod.MODID + ":tree/papaya/blockPapayaWood").setBlockName("blockPapayaWood");
	    	GameRegistry.registerBlock(blockPapayaWood , "blockPapayaWood");

			blockPassionfruitWood = new BlockTreeWood(Material.wood).setBlockTextureName(Bandb_mod.MODID + ":tree/passionfruit/blockPassionfruitWood").setBlockName("blockPassionfruitWood");
	    	GameRegistry.registerBlock(blockPassionfruitWood , "blockPassionfruitWood");

			blockPeachWood = new BlockTreeWood(Material.wood).setBlockTextureName(Bandb_mod.MODID + ":tree/peach/blockPeachWood").setBlockName("blockPeachWood");
	    	GameRegistry.registerBlock(blockPeachWood , "blockPeachWood");

			blockPearWood = new BlockTreeWood(Material.wood).setBlockTextureName(Bandb_mod.MODID + ":tree/pear/blockPearWood").setBlockName("blockPearWood");
	    	GameRegistry.registerBlock(blockPearWood , "blockPearWood");

	    	blockPersimmonWood = new BlockTreeWood(Material.wood).setBlockTextureName(Bandb_mod.MODID + ":tree/persimmon/blockPersimmonWood").setBlockName("blockPersimmonWood");
			GameRegistry.registerBlock(blockPersimmonWood , "blockPersimmonWood");
	    	
			blockPistachioWood = new BlockTreeWood(Material.wood).setBlockTextureName(Bandb_mod.MODID + ":tree/pistachio/blockPistachioWood").setBlockName("blockPistachioWood");
	    	GameRegistry.registerBlock(blockPistachioWood , "blockPistachioWood");

	    	blockPlumWood = new BlockTreeWood(Material.wood).setBlockTextureName(Bandb_mod.MODID + ":tree/plum/blockPlumWood").setBlockName("blockPlumWood");						    	
	    	GameRegistry.registerBlock(blockPlumWood , "blockPlumWood");
	    	
			blockPomegranateWood = new BlockTreeWood(Material.wood).setBlockTextureName(Bandb_mod.MODID + ":tree/pomegranate/blockPomegranateWood").setBlockName("blockPomegranateWood");
	    	GameRegistry.registerBlock(blockPomegranateWood , "blockPomegranateWood");
	    	
			blockQuinceWood = new BlockTreeWood(Material.wood).setBlockTextureName(Bandb_mod.MODID + ":tree/quince/blockQuinceWood").setBlockName("blockQuinceWood");				
	    	GameRegistry.registerBlock(blockQuinceWood , "blockQuinceWood");

			blockStarAniseWood = new BlockTreeWood(Material.wood).setBlockTextureName(Bandb_mod.MODID + ":tree/anisestar/blockStarAniseWood").setBlockName("blockStarAniseWood");
			GameRegistry.registerBlock(blockStarAniseWood , "blockStarAniseWood");		    							    	
	    				
			blockTangerineWood = new BlockTreeWood(Material.wood).setBlockTextureName(Bandb_mod.MODID + ":tree/tangerine/blockTangerineWood").setBlockName("blockTangerineWood");			
	    	GameRegistry.registerBlock(blockTangerineWood , "blockTangerineWood");
	
	    	blockVanillaWood = new BlockTreeWood(Material.wood).setBlockTextureName(Bandb_mod.MODID + ":tree/vanilla/blockVanillaWood").setBlockName("blockVanillaWood");
	    	GameRegistry.registerBlock(blockVanillaWood , "blockVanillaWood");
	    	
			blockWalnutWood = new BlockTreeWood(Material.wood).setBlockTextureName(Bandb_mod.MODID + ":tree/walnut/blockWalnutWood").setBlockName("blockWalnutWood");				
	    	GameRegistry.registerBlock(blockWalnutWood , "blockWalnutWood");
	    	
	    	blockAllspiceWood = new BlockTreeWood(Material.wood).setBlockTextureName(Bandb_mod.MODID + ":tree/allspice/blockAllspiceWood").setBlockName("blockAllspiceWood");				
	    	GameRegistry.registerBlock(blockAllspiceWood , "blockAllspiceWood");
	    	
	    	blockBaelWood = new BlockTreeWood(Material.wood).setBlockTextureName(Bandb_mod.MODID + ":tree/bael/blockBaelWood").setBlockName("blockBaelWood");				
	    	GameRegistry.registerBlock(blockBaelWood , "blockBaelWood");
	    	
	    	blockPlantainWood = new BlockTreeWood(Material.wood).setBlockTextureName(Bandb_mod.MODID + ":tree/bananaplantain/blockPlantainWood").setBlockName("blockPlantainWood");				
	    	GameRegistry.registerBlock(blockPlantainWood , "blockPlantainWood");
	    	
	    	blockBlackCherryWood = new BlockTreeWood(Material.wood).setBlockTextureName(Bandb_mod.MODID + ":tree/blackcherry/blockBlackCherryWood").setBlockName("blockBlackCherryWood");				
	    	GameRegistry.registerBlock(blockBlackCherryWood , "blockBlackCherryWood");
	    	
	    	blockBlackthornWood = new BlockTreeWood(Material.wood).setBlockTextureName(Bandb_mod.MODID + ":tree/blackthorn/blockBlackthornWood").setBlockName("blockBlackthornWood");				
	    	GameRegistry.registerBlock(blockBlackthornWood , "blockBlackthornWood");
	    	
	    	blockBrazilNutWood = new BlockTreeWood(Material.wood).setBlockTextureName(Bandb_mod.MODID + ":tree/brazilnut/blockBrazilNutWood").setBlockName("blockBrazilNutWood");				
	    	GameRegistry.registerBlock(blockBrazilNutWood , "blockBrazilNutWood");
	    	
	    	blockButternutWood = new BlockTreeWood(Material.wood).setBlockTextureName(Bandb_mod.MODID + ":tree/butternut/blockButternutWood").setBlockName("blockButternutWood");				
	    	GameRegistry.registerBlock(blockButternutWood , "blockButternutWood");
	    	
	    	blockCinnamonWood = new BlockTreeWood(Material.wood).setBlockTextureName(Bandb_mod.MODID + ":tree/cinnamon/blockCinnamonWood").setBlockName("blockCinnamonWood");				
	    	GameRegistry.registerBlock(blockCinnamonWood , "blockCinnamonWood");
	    	
	    	blockCloveWood = new BlockTreeWood(Material.wood).setBlockTextureName(Bandb_mod.MODID + ":tree/clove/blockCloveWood").setBlockName("blockCloveWood");				
	    	GameRegistry.registerBlock(blockCloveWood , "blockCloveWood");
	    	
	    	blockDamsonPlumWood = new BlockTreeWood(Material.wood).setBlockTextureName(Bandb_mod.MODID + ":tree/damsonplum/blockDamsonPlumWood").setBlockName("blockDamsonPlumWood");				
	    	GameRegistry.registerBlock(blockDamsonPlumWood , "blockDamsonPlumWood");
	    	
	    	blockElderberryWood = new BlockTreeWood(Material.wood).setBlockTextureName(Bandb_mod.MODID + ":tree/elderberry/blockElderberryWood").setBlockName("blockElderberryWood");				
	    	GameRegistry.registerBlock(blockElderberryWood , "blockElderberryWood");
	    	
	    	blockLaurelWood = new BlockTreeWood(Material.wood).setBlockTextureName(Bandb_mod.MODID + ":tree/laurel/blockLaurelWood").setBlockName("blockLaurelWood");				
	    	GameRegistry.registerBlock(blockLaurelWood , "blockLaurelWood");
	    	
	    	blockMacadamiaWood = new BlockTreeWood(Material.wood).setBlockTextureName(Bandb_mod.MODID + ":tree/macadamia/blockMacadamiaWood").setBlockName("blockMacadamiaWood");				
	    	GameRegistry.registerBlock(blockMacadamiaWood , "blockMacadamiaWood");
	    	
	    	blockPomeloWood = new BlockTreeWood(Material.wood).setBlockTextureName(Bandb_mod.MODID + ":tree/pomelo/blockPomeloWood").setBlockName("blockPomeloWood");				
	    	GameRegistry.registerBlock(blockPomeloWood , "blockPomeloWood");
	    	
	    	blockSatsumaWood = new BlockTreeWood(Material.wood).setBlockTextureName(Bandb_mod.MODID + ":tree/satsuma/blockSatsumaWood").setBlockName("blockSatsumaWood");				
	    	GameRegistry.registerBlock(blockSatsumaWood , "blockSatsumaWood");
	    	
	    	blockBloodOrangeWood = new BlockTreeWood(Material.wood).setBlockTextureName(Bandb_mod.MODID + ":tree/bloodorange/blockBloodOrangeWood").setBlockName("blockBloodOrangeWood");				
	    	GameRegistry.registerBlock(blockBloodOrangeWood , "blockBloodOrangeWood");
	    	
	    	blockMorelloCherryWood = new BlockTreeWood(Material.wood).setBlockTextureName(Bandb_mod.MODID + ":tree/morellocherry/blockMorelloCherryWood").setBlockName("blockMorelloCherryWood");				
	    	GameRegistry.registerBlock(blockMorelloCherryWood , "blockMorelloCherryWood");
	    	
	    	blockWhitePeachWood = new BlockTreeWood(Material.wood).setBlockTextureName(Bandb_mod.MODID + ":tree/whitepeach/blockWhitePeachWood").setBlockName("blockWhitePeachWood");				
	    	GameRegistry.registerBlock(blockWhitePeachWood , "blockWhitePeachWood");
	    	
	    	blockAbiuWood = new BlockTreeWood(Material.wood).setBlockTextureName(Bandb_mod.MODID + ":tree/abiu/blockAbiuWood").setBlockName("blockAbiuWood");				
	    	GameRegistry.registerBlock(blockAbiuWood , "blockAbiuWood");
	    	
	    	blockLonganWood = new BlockTreeWood(Material.wood).setBlockTextureName(Bandb_mod.MODID + ":tree/longan/blockLonganWood").setBlockName("blockLonganWood");				
	    	GameRegistry.registerBlock(blockLonganWood , "blockLonganWood");
	    	
	    	blockLoquatWood = new BlockTreeWood(Material.wood).setBlockTextureName(Bandb_mod.MODID + ":tree/loquat/blockLoquatWood").setBlockName("blockLoquatWood");				
	    	GameRegistry.registerBlock(blockLoquatWood , "blockLoquatWood");
	    	
	    	blockNutmegWood = new BlockTreeWood(Material.wood).setBlockTextureName(Bandb_mod.MODID + ":tree/nutmeg/blockNutmegWood").setBlockName("blockNutmegWood");				
	    	GameRegistry.registerBlock(blockNutmegWood , "blockNutmegWood");
	    	
	    	blockPlaneWood = new BlockTreeWood(Material.wood).setBlockTextureName(Bandb_mod.MODID + ":tree/plane/blockPlaneWood").setBlockName("blockPlaneWood");				
	    	GameRegistry.registerBlock(blockPlaneWood , "blockPlaneWood");
	    	
	    	blockTonkaBeanWood = new BlockTreeWood(Material.wood).setBlockTextureName(Bandb_mod.MODID + ":tree/tonkabean/blockTonkaBeanWood").setBlockName("blockTonkaBeanWood");				
	    	GameRegistry.registerBlock(blockTonkaBeanWood , "blockTonkaBeanWood");
	    	
	    	blockMapleWood = new BlockTreeWood(Material.wood).setBlockTextureName(Bandb_mod.MODID + ":tree/maple/blockMapleWood").setBlockName("blockMapleWood");				
	    	GameRegistry.registerBlock(blockMapleWood , "blockMapleWood");
	    	
	    	blockGrapefruitPinkWood = new BlockTreeWood(Material.wood).setBlockTextureName(Bandb_mod.MODID + ":tree/grapefruitpink/blockGrapefruitPinkWood").setBlockName("blockGrapefruitPinkWood");				
	    	GameRegistry.registerBlock(blockGrapefruitPinkWood , "blockGrapefruitPinkWood");
	    	
	    	blockBerWood = new BlockTreeWood(Material.wood).setBlockTextureName(Bandb_mod.MODID + ":tree/ber/blockBerWood").setBlockName("blockBerWood");				
	    	GameRegistry.registerBlock(blockBerWood , "blockBerWood");
	    	
	    	blockCurryWood = new BlockTreeWood(Material.wood).setBlockTextureName(Bandb_mod.MODID + ":tree/curry/blockCurryWood").setBlockName("blockCurryWood");				
	    	GameRegistry.registerBlock(blockCurryWood , "blockCurryWood");
	    	
	    	blockRedBananaWood = new BlockTreeWood(Material.wood).setBlockTextureName(Bandb_mod.MODID + ":tree/redbanana/blockRedBananaWood").setBlockName("blockRedBananaWood");				
	    	GameRegistry.registerBlock(blockRedBananaWood , "blockRedBananaWood");
	    	
	    	
	    	
	    	
	    	
	    	blockBunyaNutWood = new BlockTreeWood(Material.wood).setBlockTextureName(Bandb_mod.MODID + ":tree/bunyanut/blockBunyaNutWood").setBlockName("blockBunyaNutWood");				
	    	GameRegistry.registerBlock(blockBunyaNutWood , "blockBunyaNutWood");
	    	
	    	blockGingkoNutWood = new BlockTreeWood(Material.wood).setBlockTextureName(Bandb_mod.MODID + ":tree/gingkonut/blockGingkoNutWood").setBlockName("blockGingkoNutWood");				
	    	GameRegistry.registerBlock(blockGingkoNutWood , "blockGingkoNutWood");
	    	
	    	blockHuckleberriesWood = new BlockTreeWood(Material.wood).setBlockTextureName(Bandb_mod.MODID + ":tree/huckleberries/blockHuckleberriesWood").setBlockName("blockHuckleberriesWood");				
	    	GameRegistry.registerBlock(blockHuckleberriesWood , "blockHuckleberriesWood");
	    	
	    	blockJackFruitWood = new BlockTreeWood(Material.wood).setBlockTextureName(Bandb_mod.MODID + ":tree/jackfruit/blockJackFruitWood").setBlockName("blockJackFruitWood");				
	    	GameRegistry.registerBlock(blockJackFruitWood , "blockJackFruitWood");
	    	
	    	blockMameySapoteWood = new BlockTreeWood(Material.wood).setBlockTextureName(Bandb_mod.MODID + ":tree/mameysapote/blockMameySapoteWood").setBlockName("blockMameySapoteWood");				
	    	GameRegistry.registerBlock(blockMameySapoteWood , "blockMameySapoteWood");
	    	
	    	blockMangosteenWood = new BlockTreeWood(Material.wood).setBlockTextureName(Bandb_mod.MODID + ":tree/mangosteen/blockMangosteenWood").setBlockName("blockMangosteenWood");				
	    	GameRegistry.registerBlock(blockMangosteenWood , "blockMangosteenWood");
	    	
	    	blockOhiaAiWood = new BlockTreeWood(Material.wood).setBlockTextureName(Bandb_mod.MODID + ":tree/ohiaai/blockOhiaAiWood").setBlockName("blockOhiaAiWood");				
	    	GameRegistry.registerBlock(blockOhiaAiWood , "blockOhiaAiWood");
	    	
	    	blockOsageOrangeWood = new BlockTreeWood(Material.wood).setBlockTextureName(Bandb_mod.MODID + ":tree/osageorange/blockOsageOrangeWood").setBlockName("blockOsageOrangeWood");				
	    	GameRegistry.registerBlock(blockOsageOrangeWood , "blockOsageOrangeWood");
	    	
	    	blockParadiseNutWood = new BlockTreeWood(Material.wood).setBlockTextureName(Bandb_mod.MODID + ":tree/paradisenut/blockParadiseNutWood").setBlockName("blockParadiseNutWood");				
	    	GameRegistry.registerBlock(blockParadiseNutWood , "blockParadiseNutWood");
	    	
	    	blockPineNutWood = new BlockTreeWood(Material.wood).setBlockTextureName(Bandb_mod.MODID + ":tree/pinenut/blockPineNutWood").setBlockName("blockPineNutWood");				
	    	GameRegistry.registerBlock(blockPineNutWood , "blockPineNutWood");
	    	
	    	blockSoursopWood = new BlockTreeWood(Material.wood).setBlockTextureName(Bandb_mod.MODID + ":tree/soursop/blockSoursopWood").setBlockName("blockSoursopWood");				
	    	GameRegistry.registerBlock(blockSoursopWood , "blockSoursopWood");
	    	
	    	blockSapodillaWood = new BlockTreeWood(Material.wood).setBlockTextureName(Bandb_mod.MODID + ":tree/sapodilla/blockSapodillaWood").setBlockName("blockSapodillaWood");				
	    	GameRegistry.registerBlock(blockSapodillaWood , "blockSapodillaWood");
	    	
	    	blockTamarilloWood = new BlockTreeWood(Material.wood).setBlockTextureName(Bandb_mod.MODID + ":tree/tamarillo/blockTamarilloWood").setBlockName("blockTamarilloWood");				
	    	GameRegistry.registerBlock(blockTamarilloWood , "blockTamarilloWood");
	    	
	    	blockWoodCinchona = new BlockTreeWood(Material.wood).setBlockTextureName(Bandb_mod.MODID + ":tree/cinchona/blockWoodCinchona").setBlockName("blockWoodCinchona");				
	    	GameRegistry.registerBlock(blockWoodCinchona , "blockWoodCinchona");
	    	
	    	
	    	//apple
	    	
	    	blockCrabappleWood = new BlockTreeWood(Material.wood).setBlockTextureName(Bandb_mod.MODID + ":tree/apple/crabapple/blockCrabappleWood").setBlockName("blockCrabappleWood");
			blockAppleAntaresWood = new BlockTreeWood(Material.wood).setBlockTextureName(Bandb_mod.MODID + ":tree/apple/antares/blockAppleAntaresWood").setBlockName("blockAppleAntaresWood");
			blockAppleArianeWood = new BlockTreeWood(Material.wood).setBlockTextureName(Bandb_mod.MODID + ":tree/apple/ariane/blockAppleArianeWood").setBlockName("blockAppleArianeWood");
			blockAppleBelchardChantecierWood = new BlockTreeWood(Material.wood).setBlockTextureName(Bandb_mod.MODID + ":tree/apple/belchardchantecier/blockAppleBelchardChantecierWood").setBlockName("blockAppleBelchardChantecierWood");
			blockAppleBelleDeBoskoopWood = new BlockTreeWood(Material.wood).setBlockTextureName(Bandb_mod.MODID + ":tree/apple/belledeboskoop/blockAppleBelleDeBoskoopWood").setBlockName("blockAppleBelleDeBoskoopWood");

			blockAppleBraeburnWood = new BlockTreeWood(Material.wood).setBlockTextureName(Bandb_mod.MODID + ":tree/apple/braeburn/blockAppleBraeburnWood").setBlockName("blockAppleBraeburnWood");
			blockAppleElstarWood = new BlockTreeWood(Material.wood).setBlockTextureName(Bandb_mod.MODID + ":tree/apple/elstar/blockAppleElstarWood").setBlockName("blockAppleElstarWood");
			blockAppleFujiWood = new BlockTreeWood(Material.wood).setBlockTextureName(Bandb_mod.MODID + ":tree/apple/fuji/blockAppleFujiWood").setBlockName("blockAppleFujiWood");
			blockAppleGalaWood = new BlockTreeWood(Material.wood).setBlockTextureName(Bandb_mod.MODID + ":tree/apple/gala/blockAppleGalaWood").setBlockName("blockAppleGalaWood");
			blockAppleGoldenWood = new BlockTreeWood(Material.wood).setBlockTextureName(Bandb_mod.MODID + ":tree/apple/golden/blockAppleGoldenWood").setBlockName("blockAppleGoldenWood");

	    	GameRegistry.registerBlock(blockCrabappleWood , "blockCrabappleWood");
	    	GameRegistry.registerBlock(blockAppleAntaresWood , "blockAppleAntaresWood");
	    	GameRegistry.registerBlock(blockAppleArianeWood , "blockAppleArianeWood");
	    	GameRegistry.registerBlock(blockAppleBelchardChantecierWood , "blockAppleBelchardChantecierWood");
	    	GameRegistry.registerBlock(blockAppleBelleDeBoskoopWood , "blockAppleBelleDeBoskoopWood");

	    	GameRegistry.registerBlock(blockAppleBraeburnWood , "blockAppleBraeburnWood");
	    	GameRegistry.registerBlock(blockAppleElstarWood , "blockAppleElstarWood");
	    	GameRegistry.registerBlock(blockAppleFujiWood , "blockAppleFujiWood");
	    	GameRegistry.registerBlock(blockAppleGalaWood , "blockAppleGalaWood");
	    	GameRegistry.registerBlock(blockAppleGoldenWood , "blockAppleGoldenWood");
	    	
			blockAppleGrannySmithWood = new BlockTreeWood(Material.wood).setBlockTextureName(Bandb_mod.MODID + ":tree/apple/grannysmith/blockAppleGrannySmithWood").setBlockName("blockAppleGrannySmithWood");
			blockAppleHoneycrunchWood = new BlockTreeWood(Material.wood).setBlockTextureName(Bandb_mod.MODID + ":tree/apple/honeycrunch/blockAppleHoneycrunchWood").setBlockName("blockAppleHoneycrunchWood");
			blockAppleJazzWood = new BlockTreeWood(Material.wood).setBlockTextureName(Bandb_mod.MODID + ":tree/apple/jazz/blockAppleJazzWood").setBlockName("blockAppleJazzWood");
			blockAppleJonagoldJonagoredWood = new BlockTreeWood(Material.wood).setBlockTextureName(Bandb_mod.MODID + ":tree/apple/jonagoldjonagored/blockAppleJonagoldJonagoredWood").setBlockName("blockAppleJonagoldJonagoredWood");
			blockAppleLesRougesWood = new BlockTreeWood(Material.wood).setBlockTextureName(Bandb_mod.MODID + ":tree/apple/lesrouges/blockAppleLesRougesWood").setBlockName("blockAppleLesRougesWood");

			blockApplePinkLadyWood = new BlockTreeWood(Material.wood).setBlockTextureName(Bandb_mod.MODID + ":tree/apple/pinklady/blockApplePinkLadyWood").setBlockName("blockApplePinkLadyWood");
			blockApplePommeLimousinWood = new BlockTreeWood(Material.wood).setBlockTextureName(Bandb_mod.MODID + ":tree/apple/pommedulimousin/blockApplePommeLimousinWood").setBlockName("blockApplePommeLimousinWood");
			blockAppleReineDesReinettesWood = new BlockTreeWood(Material.wood).setBlockTextureName(Bandb_mod.MODID + ":tree/apple/reinedesreinettes/blockAppleReineDesReinettesWood").setBlockName("blockAppleReineDesReinettesWood");
			blockAppleReinetteGriseDuCanadaWood = new BlockTreeWood(Material.wood).setBlockTextureName(Bandb_mod.MODID + ":tree/apple/reinettegriseducanada/blockAppleReinetteGriseDuCanadaWood").setBlockName("blockAppleReinetteGriseDuCanadaWood");
			blockAppleTentationWood = new BlockTreeWood(Material.wood).setBlockTextureName(Bandb_mod.MODID + ":tree/apple/tentation/blockAppleTentationWood").setBlockName("blockAppleTentationWood");

	    	GameRegistry.registerBlock(blockAppleGrannySmithWood , "blockAppleGrannySmithWood");
	    	GameRegistry.registerBlock(blockAppleHoneycrunchWood , "blockAppleHoneycrunchWood");
	    	GameRegistry.registerBlock(blockAppleJazzWood , "blockAppleJazzWood");
	    	GameRegistry.registerBlock(blockAppleJonagoldJonagoredWood , "blockAppleJonagoldJonagoredWood");
	    	GameRegistry.registerBlock(blockAppleLesRougesWood , "blockAppleLesRougesWood");

	    	GameRegistry.registerBlock(blockApplePinkLadyWood , "blockApplePinkLadyWood");
	    	GameRegistry.registerBlock(blockApplePommeLimousinWood , "blockApplePommeLimousinWood");
	    	GameRegistry.registerBlock(blockAppleReineDesReinettesWood , "blockAppleReineDesReinettesWood");
	    	GameRegistry.registerBlock(blockAppleReinetteGriseDuCanadaWood , "blockAppleReinetteGriseDuCanadaWood");
	    	GameRegistry.registerBlock(blockAppleTentationWood , "blockAppleTentationWood");	
	    	
			
			blockAfricanLeaves = new BlockTreeLeaf("african",BandbItems.itemAfrican).setBlockTextureName(Bandb_mod.MODID + ":tree/african/blockAfricanLeaves").setBlockName("blockAfricanLeaves");
			GameRegistry.registerBlock(blockAfricanLeaves , "blockAfricanLeaves");
	    					
			blockAlmondLeaves = new BlockTreeLeaf("almond",BandbItems.itemAlmond).setBlockTextureName(Bandb_mod.MODID + ":tree/almond/blockAlmondLeaves").setBlockName("blockAlmondLeaves");
	    	GameRegistry.registerBlock(blockAlmondLeaves , "blockAlmondLeaves");
	    	
	    	blockAmlaLeaves = new BlockTreeLeaf("amia",BandbItems.itemAmla).setBlockTextureName(Bandb_mod.MODID + ":tree/amia/blockAmiaLeaves").setBlockName("blockAmlaLeaves");
			GameRegistry.registerBlock(blockAmlaLeaves , "blockAmlaLeaves");
			
			blockAniseLeaves = new BlockTreeLeaf("anise",BandbItems.itemAnise).setBlockTextureName(Bandb_mod.MODID + ":tree/anise/blockAniseLeaves").setBlockName("blockAniseLeaves"); 
			GameRegistry.registerBlock(blockAniseLeaves , "blockAniseLeaves");
	    	
	    	blockApricotLeaves = new BlockTreeLeaf("apricot",BandbItems.itemApricot).setBlockTextureName(Bandb_mod.MODID + ":tree/apricot/blockApricotLeaves").setBlockName("blockApricotLeaves"); 
	    	GameRegistry.registerBlock(blockApricotLeaves , "blockApricotLeaves");
	    	
	    	blockAvocadoLeaves = new BlockTreeLeaf("avocado",BandbItems.itemAvocado).setBlockTextureName(Bandb_mod.MODID + ":tree/avocado/blockAvocadoLeaves").setBlockName("blockAvocadoLeaves");
			GameRegistry.registerBlock(blockAvocadoLeaves , "blockAvocadoLeaves");
	    	
	    	blockBananaLeaves = new BlockTreeLeaf("banana",BandbItems.itemBanana).setBlockTextureName(Bandb_mod.MODID + ":tree/banana/blockBananaLeaves").setBlockName("blockBananaLeaves");
	    	GameRegistry.registerBlock(blockBananaLeaves , "blockBananaLeaves");

	    	blockBreadNutLeaves = new BlockTreeLeaf("breadnut",BandbItems.itemBreadNut).setBlockTextureName(Bandb_mod.MODID + ":tree/breadnut/blockBreadNutLeaves").setBlockName("blockBreadNutLeaves");
			GameRegistry.registerBlock(blockBreadNutLeaves , "blockBreadNutLeaves");
			
	    	blockCacaoLeaves = new BlockTreeLeaf("cacao",BandbItems.itemCacao).setBlockTextureName(Bandb_mod.MODID + ":tree/cacao/blockCacaoLeaves").setBlockName("blockCacaoLeaves");
			GameRegistry.registerBlock(blockCacaoLeaves , "blockCacaoLeaves");
	    	
			blockCashewLeaves = new BlockTreeLeaf("cashew",BandbItems.itemCashew).setBlockTextureName(Bandb_mod.MODID + ":tree/cashew/blockCashewLeaves").setBlockName("blockCashewLeaves");
			GameRegistry.registerBlock(blockCashewLeaves , "blockCashewLeaves");
	    	
	    	blockCherryLeaves = new BlockTreeLeaf("cherry",BandbItems.itemCherry).setBlockTextureName(Bandb_mod.MODID + ":tree/cherry/blockCherryLeaves").setBlockName("blockCherryLeaves");
	    	GameRegistry.registerBlock(blockCherryLeaves , "blockCherryLeaves");
	    	
	    	blockChestnutLeaves = new BlockTreeLeaf("chestnut",BandbItems.itemChestnut).setBlockTextureName(Bandb_mod.MODID + ":tree/chestnut/blockChestnutLeaves").setBlockName("blockChestnutLeaves");
			GameRegistry.registerBlock(blockChestnutLeaves , "blockChestnutLeaves");
	   
	    	blockClementineLeaves = new BlockTreeLeaf("clementine",BandbItems.itemClementine).setBlockTextureName(Bandb_mod.MODID + ":tree/clementine/blockClementineLeaves").setBlockName("blockClementineLeaves");
	    	GameRegistry.registerBlock(blockClementineLeaves , "blockClementineLeaves");

	    	blockCoconutLeaves = new BlockTreeLeaf("coconut",BandbItems.itemCoconut).setBlockTextureName(Bandb_mod.MODID + ":tree/coconut/blockCoconutLeaves").setBlockName("blockCoconutLeaves"); 
			GameRegistry.registerBlock(blockCoconutLeaves , "blockCoconutLeaves");
	    	
	    	blockDateLeaves = new BlockTreeLeaf("date",BandbItems.itemDate).setBlockTextureName(Bandb_mod.MODID + ":tree/date/blockDateLeaves").setBlockName("blockDateLeaves");
	    	GameRegistry.registerBlock(blockDateLeaves , "blockDateLeaves");
	    			    	
			blockDragonfruitLeaves = new BlockTreeLeaf("dragonfruit",BandbItems.itemDragonfruit).setBlockTextureName(Bandb_mod.MODID + ":tree/dragonfruit/blockDragonfruitLeaves").setBlockName("blockDragonfruitLeaves"); 
			GameRegistry.registerBlock(blockDragonfruitLeaves , "blockDragonfruitLeaves");
	    	
			blockFigLeaves = new BlockTreeLeaf("fig",BandbItems.itemFig).setBlockTextureName(Bandb_mod.MODID + ":tree/fig/blockFigLeaves").setBlockName("blockFigLeaves");
			GameRegistry.registerBlock(blockFigLeaves , "blockFigLeaves");
	    	
	    	blockGrapefruitLeaves = new BlockTreeLeaf("grapefruit",BandbItems.itemGrapefruit).setBlockTextureName(Bandb_mod.MODID + ":tree/grapefruit/blockGrapefruitLeaves").setBlockName("blockGrapefruitLeaves");
			GameRegistry.registerBlock(blockGrapefruitLeaves , "blockGrapefruitLeaves");
	    	
	    	blockGuavaLeaves = new BlockTreeLeaf("guava",BandbItems.itemGuava).setBlockTextureName(Bandb_mod.MODID + ":tree/guava/blockGuavaLeaves").setBlockName("blockGuavaLeaves");
	    	GameRegistry.registerBlock(blockGuavaLeaves , "blockGuavaLeaves");
	    	
	    	blockJujubeLeaves = new BlockTreeLeaf("jujube",BandbItems.itemJujube).setBlockTextureName(Bandb_mod.MODID + ":tree/jujube/blockJujubeLeaves").setBlockName("blockJujubeLeaves");
			GameRegistry.registerBlock(blockJujubeLeaves , "blockJujubeLeaves");
			
			blockKiwiLeaves = new BlockTreeLeaf("kiwi",BandbItems.itemKiwi).setBlockTextureName(Bandb_mod.MODID + ":tree/kiwi/blockKiwiLeaves").setBlockName("blockKiwiLeaves");
			GameRegistry.registerBlock(blockKiwiLeaves , "blockKiwiLeaves");
			
			blockKumquatLeaves = new BlockTreeLeaf("kumquat",BandbItems.itemKumquat).setBlockTextureName(Bandb_mod.MODID + ":tree/kumquat/blockKumquatLeaves").setBlockName("blockKumquatLeaves");
			GameRegistry.registerBlock(blockKumquatLeaves , "blockKumquatLeaves");
	    	
			blockLemonLeaves = new BlockTreeLeaf("lemon",BandbItems.itemLemon).setBlockTextureName(Bandb_mod.MODID + ":tree/lemon/blockLemonLeaves").setBlockName("blockLemonLeaves");
	    	GameRegistry.registerBlock(blockLemonLeaves , "blockLemonLeaves");
	    
			blockLimeLeaves = new BlockTreeLeaf("lime",BandbItems.itemLime).setBlockTextureName(Bandb_mod.MODID + ":tree/lime/blockLimeLeaves").setBlockName("blockLimeLeaves");
			GameRegistry.registerBlock(blockLimeLeaves , "blockLimeLeaves");
	    	
	    	blockLycheeLeaves = new BlockTreeLeaf("lychee",BandbItems.itemLychee).setBlockTextureName(Bandb_mod.MODID + ":tree/lychee/blockLycheeLeaves").setBlockName("blockLycheeLeaves"); 
			GameRegistry.registerBlock(blockLycheeLeaves , "blockLycheeLeaves");
	    	
	    	blockMangoLeaves = new BlockTreeLeaf("mango",BandbItems.itemMango).setBlockTextureName(Bandb_mod.MODID + ":tree/mango/blockMangoLeaves").setBlockName("blockMangoLeaves");
			GameRegistry.registerBlock(blockMangoLeaves , "blockMangoLeaves");
	    	
	    	blockMirabelleLeaves = new BlockTreeLeaf("mirabelle",BandbItems.itemMirabelle).setBlockTextureName(Bandb_mod.MODID + ":tree/mirabelle/blockMirabelleLeaves").setBlockName("blockMirabelleLeaves");
			GameRegistry.registerBlock(blockMirabelleLeaves , "blockMirabelleLeaves");
	    	
	    	blockNectarineLeaves = new BlockTreeLeaf("nectarine",BandbItems.itemNectarine).setBlockTextureName(Bandb_mod.MODID + ":tree/nectarine/blockNectarineLeaves").setBlockName("blockNectarineLeaves");
			GameRegistry.registerBlock(blockNectarineLeaves , "blockNectarineLeaves");
		
			blockNutsLeaves = new BlockTreeLeaf("nuts",BandbItems.itemNuts).setBlockTextureName(Bandb_mod.MODID + ":tree/nuts/blockNutsLeaves").setBlockName("blockNutsLeaves"); 
			GameRegistry.registerBlock(blockNutsLeaves , "blockNutsLeaves");
	    	
	    	blockOliveLeaves = new BlockTreeLeaf("olive",BandbItems.itemOlive).setBlockTextureName(Bandb_mod.MODID + ":tree/olive/blockOliveLeaves").setBlockName("blockOliveLeaves");
			GameRegistry.registerBlock(blockOliveLeaves , "blockOliveLeaves");
	    	
	    	blockOrangeLeaves = new BlockTreeLeaf("orange",BandbItems.itemOrange).setBlockTextureName(Bandb_mod.MODID + ":tree/orange/blockOrangeLeaves").setBlockName("blockOrangeLeaves");
			GameRegistry.registerBlock(blockOrangeLeaves , "blockOrangeLeaves");

	    	blockPapayaLeaves = new BlockTreeLeaf("papaya",BandbItems.itemPapaya).setBlockTextureName(Bandb_mod.MODID + ":tree/papaya/blockPapayaLeaves").setBlockName("blockPapayaLeaves"); 
			GameRegistry.registerBlock(blockPapayaLeaves , "blockPapayaLeaves");
	    	
	    	blockPassionfruitLeaves = new BlockTreeLeaf("passionfruit",BandbItems.itemPassionfruit).setBlockTextureName(Bandb_mod.MODID + ":tree/passionfruit/blockPassionfruitLeaves").setBlockName("blockPassionfruitLeaves");
			GameRegistry.registerBlock(blockPassionfruitLeaves , "blockPassionfruitLeaves");
	    	
	    	blockPeachLeaves = new BlockTreeLeaf("peach",BandbItems.itemPeach).setBlockTextureName(Bandb_mod.MODID + ":tree/peach/blockPeachLeaves").setBlockName("blockPeachLeaves");
			GameRegistry.registerBlock(blockPeachLeaves , "blockPeachLeaves");
	    	
	    	blockPearLeaves = new BlockTreeLeaf("pear",BandbItems.itemPear).setBlockTextureName(Bandb_mod.MODID + ":tree/pear/blockPearLeaves").setBlockName("blockPearLeaves");
			GameRegistry.registerBlock(blockPearLeaves , "blockPearLeaves");
	    	
	    	blockPersimmonLeaves = new BlockTreeLeaf("persimmon",BandbItems.itemPersimmon).setBlockTextureName(Bandb_mod.MODID + ":tree/persimmon/blockPersimmonLeaves").setBlockName("blockPersimmonLeaves");
			GameRegistry.registerBlock(blockPersimmonLeaves , "blockPersimmonLeaves");
			
			blockPistachioLeaves = new BlockTreeLeaf("pistachio",BandbItems.itemPistachio).setBlockTextureName(Bandb_mod.MODID + ":tree/pistachio/blockPistachioLeaves").setBlockName("blockPistachioLeaves");
			GameRegistry.registerBlock(blockPistachioLeaves , "blockPistachioLeaves");
			
			blockPlumLeaves = new BlockTreeLeaf("plum",BandbItems.itemPlum).setBlockTextureName(Bandb_mod.MODID + ":tree/plum/blockPlumLeaves").setBlockName("blockPlumLeaves");
	    	GameRegistry.registerBlock(blockPlumLeaves , "blockPlumLeaves");
	    	
	    	blockPomegranateLeaves = new BlockTreeLeaf("pomegranate",BandbItems.itemPomegranate).setBlockTextureName(Bandb_mod.MODID + ":tree/pomegranate/blockPomegranateLeaves").setBlockName("blockPomegranateLeaves");
			GameRegistry.registerBlock(blockPomegranateLeaves , "blockPomegranateLeaves");
	    	
	    	blockQuinceLeaves = new BlockTreeLeaf("quince",BandbItems.itemQuince).setBlockTextureName(Bandb_mod.MODID + ":tree/quince/blockQuinceLeaves").setBlockName("blockQuinceLeaves");
			GameRegistry.registerBlock(blockQuinceLeaves , "blockQuinceLeaves");
			
	    	blockStarAniseLeaves = new BlockTreeLeaf("staranise",BandbItems.itemStarAnise).setBlockTextureName(Bandb_mod.MODID + ":tree/anisestar/blockStarAniseLeaves").setBlockName("blockStarAniseLeaves");
			GameRegistry.registerBlock(blockStarAniseLeaves , "blockStarAniseLeaves");
	    	
			blockTangerineLeaves = new BlockTreeLeaf("tangerine",BandbItems.itemTangerine).setBlockTextureName(Bandb_mod.MODID + ":tree/tangerine/blockTangerineLeaves").setBlockName("blockTangerineLeaves");
			GameRegistry.registerBlock(blockTangerineLeaves , "blockTangerineLeaves");
	    	
	    	blockVanillaLeaves = new BlockTreeLeaf("vanilla",BandbItems.itemVanilla).setBlockTextureName(Bandb_mod.MODID + ":tree/vanilla/blockVanillaLeaves").setBlockName("blockVanillaLeaves");
			GameRegistry.registerBlock(blockVanillaLeaves , "blockVanillaLeaves");
			
			blockWalnutLeaves = new BlockTreeLeaf("walnut",BandbItems.itemWalnut).setBlockTextureName(Bandb_mod.MODID + ":tree/walnut/blockWalnutLeaves").setBlockName("blockWalnutLeaves");
			GameRegistry.registerBlock(blockWalnutLeaves , "blockWalnutLeaves");
			
			blockAllspiceLeaves = new BlockTreeLeaf("allspice",BandbItems.itemAllspice).setBlockTextureName(Bandb_mod.MODID + ":tree/allspice/blockAllspiceLeaves").setBlockName("blockAllspiceLeaves");
			GameRegistry.registerBlock(blockAllspiceLeaves , "blockAllspiceLeaves");
			
			blockBaelLeaves = new BlockTreeLeaf("bael",BandbItems.itemBael).setBlockTextureName(Bandb_mod.MODID + ":tree/bael/blockBaelLeaves").setBlockName("blockBaelLeaves");
			GameRegistry.registerBlock(blockBaelLeaves , "blockBaelLeaves");
			
			blockPlantainLeaves = new BlockTreeLeaf("bananaplantain",BandbItems.itemBananaPlantain).setBlockTextureName(Bandb_mod.MODID + ":tree/bananaplantain/blockPlantainLeaves").setBlockName("blockPlantainLeaves");
			GameRegistry.registerBlock(blockPlantainLeaves , "blockPlantainLeaves");
			
			blockBlackCherryLeaves = new BlockTreeLeaf("blackcherry",BandbItems.itemBlackCherry).setBlockTextureName(Bandb_mod.MODID + ":tree/blackcherry/blockBlackCherryLeaves").setBlockName("blockBlackCherryLeaves");
			GameRegistry.registerBlock(blockBlackCherryLeaves , "blockBlackCherryLeaves");
			
			blockBlackthornLeaves = new BlockTreeLeaf("blackthorn",BandbItems.itemBlackthorn).setBlockTextureName(Bandb_mod.MODID + ":tree/blackthorn/blockBlackthornLeaves").setBlockName("blockBlackthornLeaves");
			GameRegistry.registerBlock(blockBlackthornLeaves , "blockBlackthornLeaves");
			
			blockBrazilNutLeaves = new BlockTreeLeaf("brazilnut",BandbItems.itemBrazilNut).setBlockTextureName(Bandb_mod.MODID + ":tree/brazilnut/blockBrazilNutLeaves").setBlockName("blockBrazilNutLeaves");
			GameRegistry.registerBlock(blockBrazilNutLeaves , "blockBrazilNutLeaves");
			
			blockButternutLeaves = new BlockTreeLeaf("butternut",BandbItems.itemButternut).setBlockTextureName(Bandb_mod.MODID + ":tree/butternut/blockButternutLeaves").setBlockName("blockButternutLeaves");
			GameRegistry.registerBlock(blockButternutLeaves , "blockButternutLeaves");
			
			blockCinnamonLeaves = new BlockTreeLeaf("cinnamon",BandbItems.itemCinnamon).setBlockTextureName(Bandb_mod.MODID + ":tree/cinnamon/blockCinnamonLeaves").setBlockName("blockCinnamonLeaves");
			GameRegistry.registerBlock(blockCinnamonLeaves , "blockCinnamonLeaves");
			
			blockCloveLeaves = new BlockTreeLeaf("clove",BandbItems.itemClove).setBlockTextureName(Bandb_mod.MODID + ":tree/clove/blockCloveLeaves").setBlockName("blockCloveLeaves");
			GameRegistry.registerBlock(blockCloveLeaves , "blockCloveLeaves");
			
			blockDamsonPlumLeaves = new BlockTreeLeaf("damsonplum",BandbItems.itemDamsonPlum).setBlockTextureName(Bandb_mod.MODID + ":tree/damsonplum/blockDamsonPlumLeaves").setBlockName("blockDamsonPlumLeaves");
			GameRegistry.registerBlock(blockDamsonPlumLeaves , "blockDamsonPlumLeaves");
			
			blockElderberryLeaves = new BlockTreeLeaf("elderberry",BandbItems.itemElderberry).setBlockTextureName(Bandb_mod.MODID + ":tree/elderberry/blockElderberryLeaves").setBlockName("blockElderberryLeaves");
			GameRegistry.registerBlock(blockElderberryLeaves , "blockElderberryLeaves");
			
			blockLaurelLeaves = new BlockTreeLeaf("laurel",BandbItems.itemBayLaurel).setBlockTextureName(Bandb_mod.MODID + ":tree/laurel/blockLaurelLeaves").setBlockName("blockLaurelLeaves");
			GameRegistry.registerBlock(blockLaurelLeaves , "blockLaurelLeaves");
			
			blockMacadamiaLeaves = new BlockTreeLeaf("macadamia",BandbItems.itemMacadamia).setBlockTextureName(Bandb_mod.MODID + ":tree/macadamia/blockMacadamiaLeaves").setBlockName("blockMacadamiaLeaves");
			GameRegistry.registerBlock(blockMacadamiaLeaves , "blockMacadamiaLeaves");
			
			blockPomeloLeaves = new BlockTreeLeaf("pomelo",BandbItems.itemPomelo).setBlockTextureName(Bandb_mod.MODID + ":tree/pomelo/blockPomeloLeaves").setBlockName("blockPomeloLeaves");
			GameRegistry.registerBlock(blockPomeloLeaves , "blockPomeloLeaves");
			
			blockSatsumaLeaves = new BlockTreeLeaf("satsuma",BandbItems.itemSatsuma).setBlockTextureName(Bandb_mod.MODID + ":tree/satsuma/blockSatsumaLeaves").setBlockName("blockSatsumaLeaves");
			GameRegistry.registerBlock(blockSatsumaLeaves , "blockSatsumaLeaves");
			
			blockBloodOrangeLeaves = new BlockTreeLeaf("bloodorange",BandbItems.itemBloodOrange).setBlockTextureName(Bandb_mod.MODID + ":tree/bloodorange/blockBloodOrangeLeaves").setBlockName("blockBloodOrangeLeaves");
			GameRegistry.registerBlock(blockBloodOrangeLeaves , "blockBloodOrangeLeaves");
			
			blockMorelloCherryLeaves = new BlockTreeLeaf("morellocherry",BandbItems.itemMorelloCherry).setBlockTextureName(Bandb_mod.MODID + ":tree/morellocherry/blockMorelloCherryLeaves").setBlockName("blockMorelloCherryLeaves");
			GameRegistry.registerBlock(blockMorelloCherryLeaves , "blockMorelloCherryLeaves");
			
			blockWhitePeachLeaves = new BlockTreeLeaf("whitepeach",BandbItems.itemWhitePeach).setBlockTextureName(Bandb_mod.MODID + ":tree/whitepeach/blockWhitePeachLeaves").setBlockName("blockWhitePeachLeaves");
			GameRegistry.registerBlock(blockWhitePeachLeaves , "blockWhitePeachLeaves");
			
			
			blockLeavesAbiu = new BlockTreeLeaf("abiu",BandbItems.itemAbiu).setBlockTextureName(Bandb_mod.MODID + ":tree/abiu/blockLeavesAbiu").setBlockName("blockLeavesAbiu");
			GameRegistry.registerBlock(blockLeavesAbiu , "blockLeavesAbiu");
		
			blockLonganLeaves = new BlockTreeLeaf("longan",BandbItems.itemLongan).setBlockTextureName(Bandb_mod.MODID + ":tree/longan/blockLonganLeaves").setBlockName("blockLonganLeaves");
			GameRegistry.registerBlock(blockLonganLeaves , "blockLonganLeaves");
		
			blockLoquatLeaves = new BlockTreeLeaf("loquat",BandbItems.itemLoquat).setBlockTextureName(Bandb_mod.MODID + ":tree/loquat/blockLoquatLeaves").setBlockName("blockLoquatLeaves");
			GameRegistry.registerBlock(blockLoquatLeaves , "blockLoquatLeaves");
			
			blockNutmegLeaves = new BlockTreeLeaf("nutmeg",BandbItems.itemNutmeg).setBlockTextureName(Bandb_mod.MODID + ":tree/nutmeg/blockNutmegLeaves").setBlockName("blockNutmegLeaves");
			GameRegistry.registerBlock(blockNutmegLeaves , "blockNutmegLeaves");
			
			blockPlaneLeaves = new BlockTreeLeaf("plane",null).setBlockTextureName(Bandb_mod.MODID + ":tree/plane/blockPlaneLeaves").setBlockName("blockPlaneLeaves");
			GameRegistry.registerBlock(blockPlaneLeaves , "blockPlaneLeaves");
		
			blockTonkaBeanLeaves = new BlockTreeLeaf("tonkabean",BandbItems.itemTonkaBean).setBlockTextureName(Bandb_mod.MODID + ":tree/tonkabean/blockTonkaBeanLeaves").setBlockName("blockTonkaBeanLeaves");
			GameRegistry.registerBlock(blockTonkaBeanLeaves , "blockTonkaBeanLeaves");
			
			blockGrapefruitPinkLeaves = new BlockTreeLeaf("grapefruitpink",BandbItems.itemGrapefruitPink).setBlockTextureName(Bandb_mod.MODID + ":tree/grapefruitpink/blockGrapefruitPinkLeaves").setBlockName("blockGrapefruitPinkLeaves");
			GameRegistry.registerBlock(blockGrapefruitPinkLeaves , "blockGrapefruitPinkLeaves");
			
			blockMapleLeaves = new BlockTreeLeaf("maple",null).setBlockTextureName(Bandb_mod.MODID + ":tree/maple/blockMapleLeaves").setBlockName("blockMapleLeaves");
			GameRegistry.registerBlock(blockMapleLeaves , "blockMapleLeaves");
			
			blockBerLeaves = new BlockTreeLeaf("ber",BandbItems.itemBer).setBlockTextureName(Bandb_mod.MODID + ":tree/ber/blockBerLeaves").setBlockName("blockBerLeaves");
			GameRegistry.registerBlock(blockBerLeaves , "blockBerLeaves");
			
			blockCurryLeaves = new BlockTreeLeaf("curry",BandbItems.itemCurryLeaf).setBlockTextureName(Bandb_mod.MODID + ":tree/curry/blockCurryLeaves").setBlockName("blockCurryLeaves");
			GameRegistry.registerBlock(blockCurryLeaves , "blockCurryLeaves");
			
			blockRedBananaLeaves = new BlockTreeLeaf("redbanana",BandbItems.itemRedBanana).setBlockTextureName(Bandb_mod.MODID + ":tree/redbanana/blockRedBananaLeaves").setBlockName("blockRedBananaLeaves");
			GameRegistry.registerBlock(blockRedBananaLeaves , "blockRedBananaLeaves");

			blockBunyaNutLeaves = new BlockTreeLeaf("bunyanut",BandbItems.itemBunyaNut).setBlockTextureName(Bandb_mod.MODID + ":tree/bunyanut/blockBunyaNutLeaves").setBlockName("blockBunyaNutLeaves");
			GameRegistry.registerBlock(blockBunyaNutLeaves , "blockBunyaNutLeaves");
			
			blockGingkoNutLeaves = new BlockTreeLeaf("gingkonut",BandbItems.itemGingkoNut).setBlockTextureName(Bandb_mod.MODID + ":tree/gingkonut/blockGingkoNutLeaves").setBlockName("blockGingkoNutLeaves");
			GameRegistry.registerBlock(blockGingkoNutLeaves , "blockGingkoNutLeaves");
			
			blockHuckleberriesLeaves = new BlockTreeLeaf("huckleberries",BandbItems.itemHuckleberries).setBlockTextureName(Bandb_mod.MODID + ":tree/huckleberries/blockHuckleberriesLeaves").setBlockName("blockHuckleberriesLeaves");
			GameRegistry.registerBlock(blockHuckleberriesLeaves , "blockHuckleberriesLeaves");
			
			blockJackFruitLeaves = new BlockTreeLeaf("jackfruit",BandbItems.itemJackfruit).setBlockTextureName(Bandb_mod.MODID + ":tree/jackfruit/blockJackFruitLeaves").setBlockName("blockJackFruitLeaves");
			GameRegistry.registerBlock(blockJackFruitLeaves , "blockJackFruitLeaves");
			
			blockMameySapoteLeaves = new BlockTreeLeaf("mameysapote",BandbItems.itemMameySapote).setBlockTextureName(Bandb_mod.MODID + ":tree/mameysapote/blockMameySapoteLeaves").setBlockName("blockMameySapoteLeaves");
			GameRegistry.registerBlock(blockMameySapoteLeaves , "blockMameySapoteLeaves");

			blockMangosteenLeaves = new BlockTreeLeaf("mangosteen",BandbItems.itemMangosteen).setBlockTextureName(Bandb_mod.MODID + ":tree/mangosteen/blockMangosteenLeaves").setBlockName("blockMangosteenLeaves");
			GameRegistry.registerBlock(blockMangosteenLeaves , "blockMangosteenLeaves");
			
			blockOhiaAiLeaves = new BlockTreeLeaf("ohiaai",BandbItems.itemOhiaAi).setBlockTextureName(Bandb_mod.MODID + ":tree/ohiaai/blockOhiaAiLeaves").setBlockName("blockOhiaAiLeaves");
			GameRegistry.registerBlock(blockOhiaAiLeaves , "blockOhiaAiLeaves");
			
			blockOsageOrangeLeaves = new BlockTreeLeaf("osageorange",BandbItems.itemOsageOrange).setBlockTextureName(Bandb_mod.MODID + ":tree/osageorange/blockOsageOrangeLeaves").setBlockName("blockOsageOrangeLeaves");
			GameRegistry.registerBlock(blockOsageOrangeLeaves , "blockOsageOrangeLeaves");
			
			
			
			
			blockParadiseNutLeaves = new BlockTreeLeaf("paradisenut",BandbItems.itemParadiseNut).setBlockTextureName(Bandb_mod.MODID + ":tree/paradisenut/blockParadiseNutLeaves").setBlockName("blockParadiseNutLeaves");
			GameRegistry.registerBlock(blockParadiseNutLeaves , "blockParadiseNutLeaves");
			
			blockPineNutLeaves = new BlockTreeLeaf("pinenut",BandbItems.itemPineNut).setBlockTextureName(Bandb_mod.MODID + ":tree/pinenut/blockPineNutLeaves").setBlockName("blockPineNutLeaves");
			GameRegistry.registerBlock(blockPineNutLeaves , "blockPineNutLeaves");
			
			blockSapodillaLeaves = new BlockTreeLeaf("sapodilla",BandbItems.itemSapodilla).setBlockTextureName(Bandb_mod.MODID + ":tree/sapodilla/blockSapodillaLeaves").setBlockName("blockSapodillaLeaves");
			GameRegistry.registerBlock(blockSapodillaLeaves , "blockSapodillaLeaves");
			
			blockSoursopLeaves = new BlockTreeLeaf("soursop",BandbItems.itemSoursop).setBlockTextureName(Bandb_mod.MODID + ":tree/soursop/blockSoursopLeaves").setBlockName("blockSoursopLeaves");
			GameRegistry.registerBlock(blockSoursopLeaves , "blockSoursopLeaves");
			
			blockTamarilloLeaves = new BlockTreeLeaf("tamarillo",BandbItems.itemTamarillo).setBlockTextureName(Bandb_mod.MODID + ":tree/tamarillo/blockTamarilloLeaves").setBlockName("blockTamarilloLeaves");
			GameRegistry.registerBlock(blockTamarilloLeaves , "blockTamarilloLeaves");
			
			blockLeavesCinchona = new BlockTreeLeaf("cinchona",BandbItems.itemCinchona).setBlockTextureName(Bandb_mod.MODID + ":tree/cinchona/blockLeavesCinchona").setBlockName("blockLeavesCinchona");
			GameRegistry.registerBlock(blockLeavesCinchona , "blockLeavesCinchona");
			
			
			//apple
	    	blockCrabappleLeaves = new BlockTreeLeaf("crabapple",BandbItems.itemCrabapple).setBlockTextureName(Bandb_mod.MODID + ":tree/apple/crabapple/blockCrabappleLeaves").setBlockName("blockCrabappleLeaves");
	    	blockAppleAntaresLeaves = new BlockTreeLeaf("antares",BandbItems.itemAppleAntares).setBlockTextureName(Bandb_mod.MODID + ":tree/apple/antares/blockAppleAntaresLeaves").setBlockName("blockAppleAntaresLeaves");
	    	blockAppleArianeLeaves = new BlockTreeLeaf("ariane",BandbItems.itemAppleAriane).setBlockTextureName(Bandb_mod.MODID + ":tree/apple/ariane/blockAppleArianeLeaves").setBlockName("blockAppleArianeLeaves");
	    	blockAppleBelchardChantecierLeaves = new BlockTreeLeaf("belchardchantecier",BandbItems.itemAppleBelchardChancelier).setBlockTextureName(Bandb_mod.MODID + ":tree/apple/belchardchantecier/blockAppleBelchardChantecierLeaves").setBlockName("blockAppleBelchardChantecierLeaves");
	    	blockAppleBelleDeBoskoopLeaves = new BlockTreeLeaf("belledeboskoop",BandbItems.itemAppleBelleDeBoskoop).setBlockTextureName(Bandb_mod.MODID + ":tree/apple/belledeboskoop/blockAppleBelleDeBoskoopLeaves").setBlockName("blockAppleBelleDeBoskoopLeaves");
		
	    	blockAppleBraeburnLeaves = new BlockTreeLeaf("braeburn",BandbItems.itemAppleBraeburn).setBlockTextureName(Bandb_mod.MODID + ":tree/apple/braeburn/blockAppleBraeburnLeaves").setBlockName("blockAppleBraeburnLeaves");
	    	blockAppleElstarLeaves = new BlockTreeLeaf("elstar",BandbItems.itemAppleElstar).setBlockTextureName(Bandb_mod.MODID + ":tree/apple/elstar/blockAppleElstarLeaves").setBlockName("blockAppleElstarLeaves");
	    	blockAppleFujiLeaves = new BlockTreeLeaf("fuji",BandbItems.itemAppleFuji).setBlockTextureName(Bandb_mod.MODID + ":tree/apple/fuji/blockAppleFujiLeaves").setBlockName("blockAppleFujiLeaves");
	    	blockAppleGalaLeaves = new BlockTreeLeaf("gala",BandbItems.itemAppleGala).setBlockTextureName(Bandb_mod.MODID + ":tree/apple/gala/blockAppleGalaLeaves").setBlockName("blockAppleGalaLeaves");
	    	blockAppleGoldenLeaves = new BlockTreeLeaf("golden",BandbItems.itemAppleGolden).setBlockTextureName(Bandb_mod.MODID + ":tree/apple/golden/blockAppleGoldenLeaves").setBlockName("blockAppleGoldenLeaves");
		
			GameRegistry.registerBlock(blockCrabappleLeaves , "blockCrabappleLeaves");
	    	GameRegistry.registerBlock(blockAppleAntaresLeaves , "blockAppleAntaresLeaves");
	    	GameRegistry.registerBlock(blockAppleArianeLeaves , "blockAppleArianeLeaves");
	    	GameRegistry.registerBlock(blockAppleBelchardChantecierLeaves , "blockAppleBelchardChantecierLeaves");
	    	GameRegistry.registerBlock(blockAppleBelleDeBoskoopLeaves , "blockAppleBelleDeBoskoopLeaves");
	    
	    	GameRegistry.registerBlock(blockAppleBraeburnLeaves , "blockAppleBraeburnLeaves");
	    	GameRegistry.registerBlock(blockAppleElstarLeaves , "blockAppleElstarLeaves");
	    	GameRegistry.registerBlock(blockAppleFujiLeaves , "blockAppleFujiLeaves");
	    	GameRegistry.registerBlock(blockAppleGalaLeaves , "blockAppleGalaLeaves");
	    	GameRegistry.registerBlock(blockAppleGoldenLeaves , "blockAppleGoldenLeaves");
	    	
			blockAppleGrannySmithLeaves = new BlockTreeLeaf("grannysmith",BandbItems.itemAppleGrannySmith).setBlockTextureName(Bandb_mod.MODID + ":tree/apple/grannysmith/blockAppleGrannySmithLeaves").setBlockName("blockAppleGrannySmithLeaves");
			blockAppleHoneycrunchLeaves = new BlockTreeLeaf("honeycrunch",BandbItems.itemAppleHoneycrunch).setBlockTextureName(Bandb_mod.MODID + ":tree/apple/honeycrunch/blockAppleHoneycrunchLeaves").setBlockName("blockAppleHoneycrunchLeaves");
			blockAppleJazzLeaves = new BlockTreeLeaf("jazz",BandbItems.itemAppleJazz).setBlockTextureName(Bandb_mod.MODID + ":tree/apple/jazz/blockAppleJazzLeaves").setBlockName("blockAppleJazzLeaves");
			blockAppleJonagoldJonagoredLeaves = new BlockTreeLeaf("jonagoldjonagored",BandbItems.itemAppleJonagoldJonagored).setBlockTextureName(Bandb_mod.MODID + ":tree/apple/jonagoldjonagored/blockAppleJonagoldJonagoredLeaves").setBlockName("blockAppleJonagoldJonagoredLeaves");
			blockAppleLesRougesLeaves = new BlockTreeLeaf("lesrouges",BandbItems.itemAppleLesRouges).setBlockTextureName(Bandb_mod.MODID + ":tree/apple/lesrouges/blockAppleLesRougesLeaves").setBlockName("blockAppleLesRougesLeaves");
		
			blockApplePinkLadyLeaves = new BlockTreeLeaf("pinklady",BandbItems.itemApplePinkLady).setBlockTextureName(Bandb_mod.MODID + ":tree/apple/pinklady/blockApplePinkLadyLeaves").setBlockName("blockApplePinkLadyLeaves");
			blockApplePommeLimousinLeaves = new BlockTreeLeaf("pommedulimousin",BandbItems.itemApplePommeDuLimousin).setBlockTextureName(Bandb_mod.MODID + ":tree/apple/pommedulimousin/blockApplePommeLimousinLeaves").setBlockName("blockApplePommeLimousinLeaves");
			blockAppleReineDesReinettesLeaves = new BlockTreeLeaf("reinedesreinettes",BandbItems.itemAppleReineDesReinettes).setBlockTextureName(Bandb_mod.MODID + ":tree/apple/reinedesreinettes/blockAppleReineDesReinettesLeaves").setBlockName("blockAppleReineDesReinettesLeaves");
			blockAppleReinetteGriseDuCanadaLeaves = new BlockTreeLeaf("reinettegriseducanada",BandbItems.itemAppleReinetteGriseDuCanada).setBlockTextureName(Bandb_mod.MODID + ":tree/apple/reinettegriseducanada/blockAppleReinetteGriseDuCanadaLeaves").setBlockName("blockAppleReinetteGriseDuCanadaLeaves");
			blockAppleTentationLeaves = new BlockTreeLeaf("tentation",BandbItems.itemAppleTentation).setBlockTextureName(Bandb_mod.MODID + ":tree/apple/tentation/blockAppleTentationLeaves").setBlockName("blockAppleTentationLeaves");
		
			GameRegistry.registerBlock(blockAppleGrannySmithLeaves , "blockAppleGrannySmithLeaves");
	    	GameRegistry.registerBlock(blockAppleHoneycrunchLeaves , "blockAppleHoneycrunchLeaves");
	    	GameRegistry.registerBlock(blockAppleJazzLeaves , "blockAppleJazzLeaves");
	    	GameRegistry.registerBlock(blockAppleJonagoldJonagoredLeaves , "blockAppleJonagoldJonagoredLeaves");
	    	GameRegistry.registerBlock(blockAppleLesRougesLeaves , "blockAppleLesRougesLeaves");
	    
	    	GameRegistry.registerBlock(blockApplePinkLadyLeaves , "blockApplePinkLadyLeaves");
	    	GameRegistry.registerBlock(blockApplePommeLimousinLeaves , "blockApplePommeLimousinLeaves");
	    	GameRegistry.registerBlock(blockAppleReineDesReinettesLeaves , "blockAppleReineDesReinettesLeaves");
	    	GameRegistry.registerBlock(blockAppleReinetteGriseDuCanadaLeaves , "blockAppleReinetteGriseDuCanadaLeaves");
	    	GameRegistry.registerBlock(blockAppleTentationLeaves , "blockAppleTentationLeaves");
		
	    	
			blockAfricanSapling = new BlockTreeSaplingPalmTree(BandbBlocks.blockAfricanLeaves,  BandbBlocks.blockAfricanWood).setBlockTextureName(Bandb_mod.MODID + ":sapling/blockAfricanSapling").setBlockName("blockAfricanSapling");
	    	GameRegistry.registerBlock(blockAfricanSapling , "blockAfricanSapling");    	
	    	
	    	blockAlmondSapling = new BlockTreeSaplingHight(BandbBlocks.blockAlmondLeaves,  BandbBlocks.blockAlmondWood).setBlockTextureName(Bandb_mod.MODID + ":sapling/blockAlmondSapling").setBlockName("blockAlmondSapling");
	    	GameRegistry.registerBlock(blockAlmondSapling , "blockAlmondSapling");

	    	blockAmlaSapling = new BlockTreeSaplingFruit(BandbBlocks.blockAmlaLeaves,  BandbBlocks.blockAmlaWood).setBlockTextureName(Bandb_mod.MODID + ":sapling/blockAmiaSapling").setBlockName("blockAmlaSapling");
	    	GameRegistry.registerBlock(blockAmlaSapling , "blockAmlaSapling");
	    	
	    	blockAniseSapling = new BlockTreeSaplingFruit(BandbBlocks.blockAniseLeaves,  BandbBlocks.blockAniseWood).setBlockTextureName(Bandb_mod.MODID + ":sapling/blockAniseSapling").setBlockName("blockAniseSapling");
	    	GameRegistry.registerBlock(blockAniseSapling , "blockAniseSapling");
	    	
	    	blockApricotSapling = new BlockTreeSaplingFruit(BandbBlocks.blockApricotLeaves,  BandbBlocks.blockApricotWood).setBlockTextureName(Bandb_mod.MODID + ":sapling/blockApricotSapling").setBlockName("blockApricotSapling");
	    	GameRegistry.registerBlock(blockApricotSapling , "blockApricotSapling");	    	

	    	blockAvocadoSapling = new BlockTreeSaplingFruit(BandbBlocks.blockAvocadoLeaves,  BandbBlocks.blockAvocadoWood).setBlockTextureName(Bandb_mod.MODID + ":sapling/blockAvocadoSapling").setBlockName("blockAvocadoSapling");
	    	GameRegistry.registerBlock(blockAvocadoSapling , "blockAvocadoSapling");
	    	
	    	blockBananaSapling = new BlockTreeSaplingPalmTree(BandbBlocks.blockBananaLeaves, BandbBlocks.blockBananaWood).setBlockTextureName(Bandb_mod.MODID + ":sapling/blockBananaSapling").setBlockName("blockBananaSapling");
	    	GameRegistry.registerBlock(blockBananaSapling , "blockBananaSapling");

	    	blockBreadNutSapling = new BlockTreeSaplingFruit(BandbBlocks.blockBreadNutLeaves,  BandbBlocks.blockBreadNutWood).setBlockTextureName(Bandb_mod.MODID + ":sapling/blockBreadNutSapling").setBlockName("blockBreadNutSapling");
	    	GameRegistry.registerBlock(blockBreadNutSapling , "blockBreadNutSapling");

	    	blockCacaoSapling = new BlockTreeSaplingFruit(BandbBlocks.blockCacaoLeaves,  BandbBlocks.blockCacaoWood).setBlockTextureName(Bandb_mod.MODID + ":sapling/blockCacaoSapling").setBlockName("blockCacaoSapling");
	    	GameRegistry.registerBlock(blockCacaoSapling , "blockCacaoSapling");

	    	blockCashewSapling = new BlockTreeSaplingFruit(BandbBlocks.blockCashewLeaves,  BandbBlocks.blockCashewWood).setBlockTextureName(Bandb_mod.MODID + ":sapling/itemCashewSapling").setBlockName("blockCashewSapling");
	    	GameRegistry.registerBlock(blockCashewSapling , "blockCashewSapling");
    	
	    	blockCherrySapling = new BlockTreeSaplingFruit(BandbBlocks.blockCherryLeaves,  BandbBlocks.blockCherryWood).setBlockTextureName(Bandb_mod.MODID + ":sapling/blockCherrySapling").setBlockName("blockCherrySapling");
	    	GameRegistry.registerBlock(blockCherrySapling , "blockCherrySapling");

	    	blockChestnutSapling = new BlockTreeSaplingFruit( BandbBlocks.blockChestnutLeaves,  BandbBlocks.blockChestnutWood).setBlockTextureName(Bandb_mod.MODID + ":sapling/blockChestnutSapling").setBlockName("blockChestnutSapling");
	    	GameRegistry.registerBlock(blockChestnutSapling , "blockChestnutSapling");
	    	
	    	blockClementineSapling = new BlockTreeSaplingFruit(BandbBlocks.blockClementineLeaves,  BandbBlocks.blockClementineWood).setBlockTextureName(Bandb_mod.MODID + ":sapling/blockClementineSapling").setBlockName("blockClementineSapling");
	    	GameRegistry.registerBlock(blockClementineSapling , "blockClementineSapling");

	    	blockCoconutSapling = new BlockTreeSaplingPalmTree(BandbBlocks.blockCoconutLeaves, BandbBlocks.blockCoconutWood).setBlockTextureName(Bandb_mod.MODID + ":sapling/blockCoconutSapling").setBlockName("blockCoconutSapling");
	    	GameRegistry.registerBlock(blockCoconutSapling , "blockCoconutSapling");
    	
	    	blockDateSapling = new BlockTreeSaplingPalmTree(BandbBlocks.blockDateLeaves, BandbBlocks.blockDateWood).setBlockTextureName(Bandb_mod.MODID + ":sapling/blockDateSapling").setBlockName("blockDateSapling");
	    	GameRegistry.registerBlock(blockDateSapling , "blockDateSapling");

	    	blockDragonfruitSapling = new BlockTreeSaplingFruit(BandbBlocks.blockDragonfruitLeaves,  BandbBlocks.blockDragonfruitWood).setBlockTextureName(Bandb_mod.MODID + ":sapling/blockDragonfruitSapling").setBlockName("blockDragonfruitSapling");
	    	GameRegistry.registerBlock(blockDragonfruitSapling , "blockDragonfruitSapling");
	    	
	    	blockFigSapling = new BlockTreeSaplingFruit(BandbBlocks.blockFigLeaves,  BandbBlocks.blockFigWood).setBlockTextureName(Bandb_mod.MODID + ":sapling/blockFigSapling").setBlockName("blockFigSapling");
	    	GameRegistry.registerBlock(blockFigSapling , "blockFigSapling");

	    	blockGrapefruitSapling = new BlockTreeSaplingFruit(BandbBlocks.blockGrapefruitLeaves,  BandbBlocks.blockGrapefruitWood).setBlockTextureName(Bandb_mod.MODID + ":sapling/blockGrapefruitSapling").setBlockName("blockGrapefruitSapling");
	    	GameRegistry.registerBlock(blockGrapefruitSapling , "blockGrapefruitSapling");

	    	blockGuavaSapling = new BlockTreeSaplingFruit(BandbBlocks.blockGuavaLeaves,  BandbBlocks.blockGuavaWood).setBlockTextureName(Bandb_mod.MODID + ":sapling/blockGuavaSapling").setBlockName("blockGuavaSapling");
	    	GameRegistry.registerBlock(blockGuavaSapling , "blockGuavaSapling");

	    	blockJujubeSapling = new BlockTreeSaplingFruit(BandbBlocks.blockJujubeLeaves,  BandbBlocks.blockJujubeWood).setBlockTextureName(Bandb_mod.MODID + ":sapling/blockJujubeSapling").setBlockName("blockJujubeSapling");
	    	GameRegistry.registerBlock(blockJujubeSapling , "blockJujubeSapling");

	    	blockKiwiSapling = new BlockTreeSaplingFruit( BandbBlocks.blockKiwiLeaves,  BandbBlocks.blockKiwiWood).setBlockTextureName(Bandb_mod.MODID + ":sapling/blockKiwiSapling").setBlockName("blockKiwiSapling");
	    	GameRegistry.registerBlock(blockKiwiSapling , "blockKiwiSapling");

	    	blockKumquatSapling = new BlockTreeSaplingFruit(BandbBlocks.blockKumquatLeaves,  BandbBlocks.blockKumquatWood).setBlockTextureName(Bandb_mod.MODID + ":sapling/blockKumquatSapling").setBlockName("blockKumquatSapling");
	    	GameRegistry.registerBlock(blockKumquatSapling , "blockKumquatSapling");

	    	blockLemonSapling = new BlockTreeSaplingFruit(BandbBlocks.blockLemonLeaves,  BandbBlocks.blockLemonWood).setBlockTextureName(Bandb_mod.MODID + ":sapling/blockLemonSapling").setBlockName("blockLemonSapling");
	    	GameRegistry.registerBlock(blockLemonSapling , "blockLemonSapling");
	    	
	    	blockLimeSapling = new BlockTreeSaplingFruit(BandbBlocks.blockLimeLeaves,  BandbBlocks.blockLimeWood).setBlockTextureName(Bandb_mod.MODID + ":sapling/blockLimeSapling").setBlockName("blockLimeSapling");
	    	GameRegistry.registerBlock(blockLimeSapling , "blockLimeSapling");
	    	
	    	blockLycheeSapling = new BlockTreeSaplingFruit(BandbBlocks.blockLycheeLeaves,  BandbBlocks.blockLycheeWood).setBlockTextureName(Bandb_mod.MODID + ":sapling/blockLycheeSapling").setBlockName("blockLycheeSapling");
	    	GameRegistry.registerBlock(blockLycheeSapling , "blockLycheeSapling");

	    	blockMangoSapling = new BlockTreeSaplingFruit(BandbBlocks.blockMangoLeaves,  BandbBlocks.blockMangoWood).setBlockTextureName(Bandb_mod.MODID + ":sapling/blockMangoSapling").setBlockName("blockMangoSapling");
	    	GameRegistry.registerBlock(blockMangoSapling , "blockMangoSapling");

	    	blockMirabelleSapling = new BlockTreeSaplingFruit(BandbBlocks.blockMirabelleLeaves,  BandbBlocks.blockMirabelleWood).setBlockTextureName(Bandb_mod.MODID + ":sapling/blockMirabelleSapling").setBlockName("blockMirabelleSapling");
	    	GameRegistry.registerBlock(blockMirabelleSapling , "blockMirabelleSapling");

	    	blockNectarineSapling = new BlockTreeSaplingFruit(BandbBlocks.blockNectarineLeaves,  BandbBlocks.blockNectarineWood).setBlockTextureName(Bandb_mod.MODID + ":sapling/blockNectarineSapling").setBlockName("blockNectarineSapling");
	    	GameRegistry.registerBlock(blockNectarineSapling , "blockNectarineSapling");

	    	blockNutsSapling = new BlockTreeSaplingFruit(BandbBlocks.blockNutsLeaves,  BandbBlocks.blockNutsWood).setBlockTextureName(Bandb_mod.MODID + ":sapling/blockNutsSapling").setBlockName("blockNutsSapling");
	    	GameRegistry.registerBlock(blockNutsSapling , "blockNutsSapling");

	    	blockOliveSapling = new BlockTreeSaplingFruit(BandbBlocks.blockOliveLeaves,  BandbBlocks.blockOliveWood).setBlockTextureName(Bandb_mod.MODID + ":sapling/blockOliveSapling").setBlockName("blockOliveSapling");
	    	GameRegistry.registerBlock(blockOliveSapling , "blockOliveSapling");

	    	blockOrangeSapling = new BlockTreeSaplingFruit(BandbBlocks.blockOrangeLeaves,  BandbBlocks.blockOrangeWood).setBlockTextureName(Bandb_mod.MODID + ":sapling/blockOrangeSapling").setBlockName("blockOrangeSapling");	    	
	    	GameRegistry.registerBlock(blockOrangeSapling , "blockOrangeSapling");

	    	blockPapayaSapling = new BlockTreeSaplingFruit(BandbBlocks.blockPapayaLeaves,  BandbBlocks.blockPapayaWood).setBlockTextureName(Bandb_mod.MODID + ":sapling/blockPapayaSapling").setBlockName("blockPapayaSapling");
	    	GameRegistry.registerBlock(blockPapayaSapling , "blockPapayaSapling");
    	
	    	blockPassionfruitSapling = new BlockTreeSaplingFruit(BandbBlocks.blockPassionfruitLeaves,  BandbBlocks.blockPassionfruitWood).setBlockTextureName(Bandb_mod.MODID + ":sapling/blockPassionfruitSapling").setBlockName("blockPassionfruitSapling");
	    	GameRegistry.registerBlock(blockPassionfruitSapling , "blockPassionfruitSapling");

	    	blockPeachSapling = new BlockTreeSaplingFruit(BandbBlocks.blockPeachLeaves,  BandbBlocks.blockPeachWood).setBlockTextureName(Bandb_mod.MODID + ":sapling/blockPeachSapling").setBlockName("blockPeachSapling");
	    	GameRegistry.registerBlock(blockPeachSapling , "blockPeachSapling");

	    	blockPearSapling = new BlockTreeSaplingFruit(BandbBlocks.blockPearLeaves,  BandbBlocks.blockPearWood).setBlockTextureName(Bandb_mod.MODID + ":sapling/blockPearSapling").setBlockName("blockPearSapling");
	    	GameRegistry.registerBlock(blockPearSapling , "blockPearSapling");

	    	blockPersimmonSapling = new BlockTreeSaplingFruit(BandbBlocks.blockPersimmonLeaves,  BandbBlocks.blockPersimmonWood).setBlockTextureName(Bandb_mod.MODID + ":sapling/blockPersimmonSapling").setBlockName("blockPersimmonSapling");
	    	GameRegistry.registerBlock(blockPersimmonSapling , "blockPersimmonSapling");
		
	    	blockPistachioSapling = new BlockTreeSaplingFruit(BandbBlocks.blockPistachioLeaves,  BandbBlocks.blockPistachioWood).setBlockTextureName(Bandb_mod.MODID + ":sapling/blockPistachioSapling").setBlockName("blockPistachioSapling");
	    	GameRegistry.registerBlock(blockPistachioSapling , "blockPistachioSapling");

	    	blockPlumSapling = new BlockTreeSaplingFruit( BandbBlocks.blockPlumLeaves,  BandbBlocks.blockPlumWood).setBlockTextureName(Bandb_mod.MODID + ":sapling/blockPlumSapling").setBlockName("blockPlumSapling");
	    	GameRegistry.registerBlock(blockPlumSapling , "blockPlumSapling");	    	
	    	
	    	blockPomegranateSapling = new BlockTreeSaplingFruit(BandbBlocks.blockPomegranateLeaves,  BandbBlocks.blockPomegranateWood).setBlockTextureName(Bandb_mod.MODID + ":sapling/blockPomegranateSapling").setBlockName("blockPomegranateSapling");
	    	GameRegistry.registerBlock(blockPomegranateSapling , "blockPomegranateSapling");
    	
	    	blockQuinceSapling = new BlockTreeSaplingFruit(BandbBlocks.blockQuinceLeaves,  BandbBlocks.blockQuinceWood).setBlockTextureName(Bandb_mod.MODID + ":sapling/blockQuinceSapling").setBlockName("blockQuinceSapling");
	    	GameRegistry.registerBlock(blockQuinceSapling , "blockQuinceSapling");

	    	blockStarAniseSapling = new BlockTreeSaplingFruit(BandbBlocks.blockStarAniseLeaves,  BandbBlocks.blockStarAniseWood).setBlockTextureName(Bandb_mod.MODID + ":sapling/blockStarAniseSapling").setBlockName("blockStarAniseSapling");
	    	GameRegistry.registerBlock(blockStarAniseSapling , "blockStarAniseSapling");
	    	
	    	blockTangerineSapling = new BlockTreeSaplingFruit(BandbBlocks.blockTangerineLeaves,  BandbBlocks.blockTangerineWood).setBlockTextureName(Bandb_mod.MODID + ":sapling/blockTangerineSapling").setBlockName("blockTangerineSapling");
	    	GameRegistry.registerBlock(blockTangerineSapling , "blockTangerineSapling");

	    	blockVanillaSapling = new BlockTreeSaplingFruit(BandbBlocks.blockVanillaLeaves,  BandbBlocks.blockVanillaWood).setBlockTextureName(Bandb_mod.MODID + ":sapling/blockVanillaSapling").setBlockName("blockVanillaSapling");
	    	GameRegistry.registerBlock(blockVanillaSapling , "blockVanillaSapling");

	    	blockWalnutSapling = new BlockTreeSaplingFruit(BandbBlocks.blockWalnutLeaves,  BandbBlocks.blockWalnutWood).setBlockTextureName(Bandb_mod.MODID + ":sapling/blockWalnutSapling").setBlockName("blockWalnutSapling");
	    	GameRegistry.registerBlock(blockWalnutSapling , "blockWalnutSapling");
	    	
	    	blockAllspiceSapling = new BlockTreeSaplingFruit(BandbBlocks.blockAllspiceLeaves,  BandbBlocks.blockAllspiceWood).setBlockTextureName(Bandb_mod.MODID + ":sapling/blockAllspiceSapling").setBlockName("blockAllspiceSapling");
	    	GameRegistry.registerBlock(blockAllspiceSapling , "blockAllspiceSapling");
	    	blockBaelSapling = new BlockTreeSaplingFruit(BandbBlocks.blockBaelLeaves,  BandbBlocks.blockBaelWood).setBlockTextureName(Bandb_mod.MODID + ":sapling/blockBaelSapling").setBlockName("blockBaelSapling");
	    	GameRegistry.registerBlock(blockBaelSapling , "blockBaelSapling");
	    	blockBananaPlantainSapling = new BlockTreeSaplingFruit(BandbBlocks.blockPlantainLeaves,  BandbBlocks.blockPlantainWood).setBlockTextureName(Bandb_mod.MODID + ":sapling/blockBananaPlantainSapling").setBlockName("blockBananaPlantainSapling");
	    	GameRegistry.registerBlock(blockBananaPlantainSapling , "blockBananaPlantainSapling");
	    	blockBlackCherrySapling = new BlockTreeSaplingFruit(BandbBlocks.blockBlackCherryLeaves,  BandbBlocks.blockBlackCherryWood).setBlockTextureName(Bandb_mod.MODID + ":sapling/blockBlackCherrySapling").setBlockName("blockBlackCherrySapling");
	    	GameRegistry.registerBlock(blockBlackCherrySapling , "blockBlackCherrySapling");
	    	blockBlackthornSapling = new BlockTreeSaplingFruit(BandbBlocks.blockBlackthornLeaves,  BandbBlocks.blockBlackthornWood).setBlockTextureName(Bandb_mod.MODID + ":sapling/blockBlackthornSapling").setBlockName("blockBlackthornSapling");
	    	GameRegistry.registerBlock(blockBlackthornSapling , "blockBlackthornSapling");
	    	blockBrazilNutSapling = new BlockTreeSaplingFruit(BandbBlocks.blockBrazilNutLeaves,  BandbBlocks.blockBrazilNutWood).setBlockTextureName(Bandb_mod.MODID + ":sapling/blockBrazilNutSapling").setBlockName("blockBrazilNutSapling");
	    	GameRegistry.registerBlock(blockBrazilNutSapling , "blockBrazilNutSapling");
	    	blockButternutSapling = new BlockTreeSaplingFruit(BandbBlocks.blockButternutLeaves,  BandbBlocks.blockButternutWood).setBlockTextureName(Bandb_mod.MODID + ":sapling/blockButternutSapling").setBlockName("blockButternutSapling");
	    	GameRegistry.registerBlock(blockButternutSapling , "blockButternutSapling");
	    	blockCinnamonSapling = new BlockTreeSaplingFruit(BandbBlocks.blockCinnamonLeaves,  BandbBlocks.blockCinnamonWood).setBlockTextureName(Bandb_mod.MODID + ":sapling/blockCinnamonSapling").setBlockName("blockCinnamonSapling");
	    	GameRegistry.registerBlock(blockCinnamonSapling , "blockCinnamonSapling");
	    	blockCloveSapling = new BlockTreeSaplingFruit(BandbBlocks.blockCloveLeaves,  BandbBlocks.blockCloveWood).setBlockTextureName(Bandb_mod.MODID + ":sapling/blockCloveSapling").setBlockName("blockCloveSapling");
	    	GameRegistry.registerBlock(blockCloveSapling , "blockCloveSapling");
	    	blockDamsonPlumSapling = new BlockTreeSaplingFruit(BandbBlocks.blockDamsonPlumLeaves,  BandbBlocks.blockDamsonPlumWood).setBlockTextureName(Bandb_mod.MODID + ":sapling/blockDamsonPlumSapling").setBlockName("blockDamsonPlumSapling");
	    	GameRegistry.registerBlock(blockDamsonPlumSapling , "blockDamsonPlumSapling");
	    	blockElderberrySapling = new BlockTreeSaplingFruit(BandbBlocks.blockElderberryLeaves,  BandbBlocks.blockElderberryWood).setBlockTextureName(Bandb_mod.MODID + ":sapling/blockElderberrySapling").setBlockName("blockElderberrySapling");
	    	GameRegistry.registerBlock(blockElderberrySapling , "blockElderberrySapling");
	    	blockLaurelSapling = new BlockTreeSaplingFruit(BandbBlocks.blockLaurelLeaves,  BandbBlocks.blockLaurelWood).setBlockTextureName(Bandb_mod.MODID + ":sapling/blockLaurelSapling").setBlockName("blockLaurelSapling");
	    	GameRegistry.registerBlock(blockLaurelSapling , "blockLaurelSapling");
	    	blockMacadamiaSapling = new BlockTreeSaplingFruit(BandbBlocks.blockMacadamiaLeaves,  BandbBlocks.blockMacadamiaWood).setBlockTextureName(Bandb_mod.MODID + ":sapling/blockMacadamiaSapling").setBlockName("blockMacadamiaSapling");
	    	GameRegistry.registerBlock(blockMacadamiaSapling , "blockMacadamiaSapling");
	    	blockPomeloSapling = new BlockTreeSaplingFruit(BandbBlocks.blockPomeloLeaves,  BandbBlocks.blockPomeloWood).setBlockTextureName(Bandb_mod.MODID + ":sapling/blockPomeloSapling").setBlockName("blockPomeloSapling");
	    	GameRegistry.registerBlock(blockPomeloSapling , "blockPomeloSapling");
	    	blockSatsumaSapling = new BlockTreeSaplingFruit(BandbBlocks.blockSatsumaLeaves,  BandbBlocks.blockSatsumaWood).setBlockTextureName(Bandb_mod.MODID + ":sapling/blockSatsumaSapling").setBlockName("blockSatsumaSapling");
	    	GameRegistry.registerBlock(blockSatsumaSapling , "blockSatsumaSapling");
	    	blockBloodOrangeSapling = new BlockTreeSaplingFruit(BandbBlocks.blockBloodOrangeLeaves,  BandbBlocks.blockBloodOrangeWood).setBlockTextureName(Bandb_mod.MODID + ":sapling/blockBloodOrangeSapling").setBlockName("blockBloodOrangeSapling");
	    	GameRegistry.registerBlock(blockBloodOrangeSapling , "blockBloodOrangeSapling");
	    	blockMorelloCherrySapling = new BlockTreeSaplingFruit(BandbBlocks.blockMorelloCherryLeaves,  BandbBlocks.blockMorelloCherryWood).setBlockTextureName(Bandb_mod.MODID + ":sapling/blockMorelloCherrySapling").setBlockName("blockMorelloCherrySapling");
	    	GameRegistry.registerBlock(blockMorelloCherrySapling , "blockMorelloCherrySapling");
	    	blockWhitePeachSapling = new BlockTreeSaplingFruit(BandbBlocks.blockWhitePeachLeaves,  BandbBlocks.blockWhitePeachWood).setBlockTextureName(Bandb_mod.MODID + ":sapling/blockWhitePeachSapling").setBlockName("blockWhitePeachSapling");
	    	GameRegistry.registerBlock(blockWhitePeachSapling , "blockWhitePeachSapling");
	    	
	    	
	    	blockAbiuSapling = new BlockTreeSaplingFruit(BandbBlocks.blockLeavesAbiu,  BandbBlocks.blockAbiuWood).setBlockTextureName(Bandb_mod.MODID + ":sapling/blockAbiuSapling").setBlockName("blockAbiuSapling");
	    	GameRegistry.registerBlock(blockAbiuSapling , "blockAbiuSapling");
	    	blockLonganSapling = new BlockTreeSaplingFruit(BandbBlocks.blockLonganLeaves,  BandbBlocks.blockLonganWood).setBlockTextureName(Bandb_mod.MODID + ":sapling/blockLonganSapling").setBlockName("blockLonganSapling");
	    	GameRegistry.registerBlock(blockLonganSapling , "blockLonganSapling");
	    	blockLoquatSapling = new BlockTreeSaplingFruit(BandbBlocks.blockLoquatLeaves,  BandbBlocks.blockLoquatWood).setBlockTextureName(Bandb_mod.MODID + ":sapling/blockLoquatSapling").setBlockName("blockLoquatSapling");
	    	GameRegistry.registerBlock(blockLoquatSapling , "blockLoquatSapling");
	    	blockSaplingNutmeg = new BlockTreeSaplingFruit(BandbBlocks.blockNutmegLeaves,  BandbBlocks.blockNutmegWood).setBlockTextureName(Bandb_mod.MODID + ":sapling/blockSaplingNutmeg").setBlockName("blockSaplingNutmeg");
	    	GameRegistry.registerBlock(blockSaplingNutmeg , "blockSaplingNutmeg");
	    	blockSaplingPlane = new BlockTreeSaplingFruit(BandbBlocks.blockPlaneLeaves,  BandbBlocks.blockPlaneWood).setBlockTextureName(Bandb_mod.MODID + ":sapling/blockSaplingPlane").setBlockName("blockSaplingPlane");
	    	GameRegistry.registerBlock(blockSaplingPlane , "blockSaplingPlane");
	    	blockSaplingTonkaBean = new BlockTreeSaplingFruit(BandbBlocks.blockTonkaBeanLeaves,  BandbBlocks.blockTonkaBeanWood).setBlockTextureName(Bandb_mod.MODID + ":sapling/blockSaplingTonkaBean").setBlockName("blockSaplingTonkaBean");
	    	GameRegistry.registerBlock(blockSaplingTonkaBean , "blockSaplingTonkaBean");
	    	
	    	blockGrapefruitPinkSapling = new BlockTreeSaplingFruit(BandbBlocks.blockGrapefruitPinkLeaves,  BandbBlocks.blockGrapefruitPinkWood).setBlockTextureName(Bandb_mod.MODID + ":sapling/blockGrapefruitPinkSapling").setBlockName("blockGrapefruitPinkSapling");
	    	GameRegistry.registerBlock(blockGrapefruitPinkSapling , "blockGrapefruitPinkSapling");
	    	
	    	blockSaplingMaple = new BlockTreeSaplingFruit(BandbBlocks.blockMapleLeaves,  BandbBlocks.blockMapleWood).setBlockTextureName(Bandb_mod.MODID + ":sapling/blockSaplingMaple").setBlockName("blockSaplingMaple");
	    	GameRegistry.registerBlock(blockSaplingMaple , "blockSaplingMaple");
	    	
	    	blockBerSapling = new BlockTreeSaplingFruit(BandbBlocks.blockBerLeaves,  BandbBlocks.blockBerWood).setBlockTextureName(Bandb_mod.MODID + ":sapling/blockBerSapling").setBlockName("blockBerSapling");
	    	GameRegistry.registerBlock(blockBerSapling , "blockBerSapling");
	    	
	    	blockCurrySapling = new BlockTreeSaplingFruit(BandbBlocks.blockCurryLeaves,  BandbBlocks.blockCurryWood).setBlockTextureName(Bandb_mod.MODID + ":sapling/blockCurrySapling").setBlockName("blockCurrySapling");
	    	GameRegistry.registerBlock(blockCurrySapling , "blockCurrySapling");
	    	
	    	blockRedBananaSapling = new BlockTreeSaplingFruit(BandbBlocks.blockRedBananaLeaves,  BandbBlocks.blockRedBananaWood).setBlockTextureName(Bandb_mod.MODID + ":sapling/blockRedBananaSapling").setBlockName("blockRedBananaSapling");
	    	GameRegistry.registerBlock(blockRedBananaSapling , "blockRedBananaSapling");
	    	
	    	blockBunyaNutSapling = new BlockTreeSaplingApple(BandbBlocks.blockBunyaNutLeaves,BandbBlocks.blockBunyaNutWood).setBlockTextureName(Bandb_mod.MODID + ":sapling/blockBunyaNutSapling").setBlockName("blockBunyaNutSapling");
	    	blockGingkoNutSapling = new BlockTreeSaplingApple(BandbBlocks.blockGingkoNutLeaves,  BandbBlocks.blockGingkoNutWood).setBlockTextureName(Bandb_mod.MODID + ":sapling/blockGingkoNutSapling").setBlockName("blockGingkoNutSapling");
	    	blockHuckleberriesSapling = new BlockTreeSaplingApple(BandbBlocks.blockHuckleberriesLeaves,  BandbBlocks.blockHuckleberriesWood).setBlockTextureName(Bandb_mod.MODID + ":sapling/blockHuckleberriesSapling").setBlockName("blockHuckleberriesSapling");
	    	blockJackFruitSapling = new BlockTreeSaplingApple(BandbBlocks.blockJackFruitLeaves,   BandbBlocks.blockJackFruitWood).setBlockTextureName(Bandb_mod.MODID + ":sapling/blockJackFruitSapling").setBlockName("blockJackFruitSapling");
	    	blockMameySapoteSapling = new BlockTreeSaplingApple(BandbBlocks.blockMameySapoteLeaves,   BandbBlocks.blockMameySapoteWood).setBlockTextureName(Bandb_mod.MODID + ":sapling/blockMameySapoteSapling").setBlockName("blockMameySapoteSapling");

	    	blockMangosteenSapling = new BlockTreeSaplingApple(BandbBlocks.blockMangosteenLeaves,   BandbBlocks.blockMangosteenWood).setBlockTextureName(Bandb_mod.MODID + ":sapling/blockMangosteenSapling").setBlockName("blockMangosteenSapling");
	    	blockOhiaAiSapling = new BlockTreeSaplingApple(BandbBlocks.blockOhiaAiLeaves,  BandbBlocks.blockOhiaAiWood).setBlockTextureName(Bandb_mod.MODID + ":sapling/blockOhiaAiSapling").setBlockName("blockOhiaAiSapling");
	    	blockOsageOrangeSapling = new BlockTreeSaplingApple(BandbBlocks.blockOsageOrangeLeaves,   BandbBlocks.blockOsageOrangeWood).setBlockTextureName(Bandb_mod.MODID + ":sapling/blockOsageOrangeSapling").setBlockName("blockOsageOrangeSapling");
	    	blockParadiseNutSapling = new BlockTreeSaplingApple(BandbBlocks.blockParadiseNutLeaves,   BandbBlocks.blockParadiseNutWood).setBlockTextureName(Bandb_mod.MODID + ":sapling/blockParadiseNutSapling").setBlockName("blockParadiseNutSapling");
	    	blockPineNutSapling = new BlockTreeSaplingApple(BandbBlocks.blockPineNutLeaves,   BandbBlocks.blockPineNutWood).setBlockTextureName(Bandb_mod.MODID + ":sapling/blockPineNutSapling").setBlockName("blockPineNutSapling");

	    	GameRegistry.registerBlock(blockBunyaNutSapling , "blockBunyaNutSapling");
	    	GameRegistry.registerBlock(blockGingkoNutSapling , "blockGingkoNutSapling");
	    	GameRegistry.registerBlock(blockHuckleberriesSapling , "blockHuckleberriesSapling");
	    	GameRegistry.registerBlock(blockJackFruitSapling , "blockJackFruitSapling");
	    	GameRegistry.registerBlock(blockMameySapoteSapling , "blockMameySapoteSapling");

	    	GameRegistry.registerBlock(blockMangosteenSapling , "blockMangosteenSapling");
	    	GameRegistry.registerBlock(blockOhiaAiSapling , "blockOhiaAiSapling");
	    	GameRegistry.registerBlock(blockOsageOrangeSapling , "blockOsageOrangeSapling");
	    	GameRegistry.registerBlock(blockParadiseNutSapling , "blockParadiseNutSapling");
	    	GameRegistry.registerBlock(blockPineNutSapling , "blockPineNutSapling");
	    	
	    	blockSoursopSapling = new BlockTreeSaplingApple(BandbBlocks.blockSoursopLeaves,   BandbBlocks.blockSoursopWood).setBlockTextureName(Bandb_mod.MODID + ":sapling/blockSoursopSapling").setBlockName("blockSoursopSapling");
	    	blockTamarilloSapling = new BlockTreeSaplingApple(BandbBlocks.blockTamarilloLeaves,   BandbBlocks.blockTamarilloWood).setBlockTextureName(Bandb_mod.MODID + ":sapling/blockTamarilloSapling").setBlockName("blockTamarilloSapling");
	    	blockSapodillaSapling = new BlockTreeSaplingApple(BandbBlocks.blockSapodillaLeaves,   BandbBlocks.blockSapodillaWood).setBlockTextureName(Bandb_mod.MODID + ":sapling/blockSapodillaSapling").setBlockName("blockSapodillaSapling");
	    	blockSaplingCinchona = new BlockTreeSaplingApple(BandbBlocks.blockLeavesCinchona,   BandbBlocks.blockWoodCinchona).setBlockTextureName(Bandb_mod.MODID + ":sapling/blockSaplingCinchona").setBlockName("blockSaplingCinchona");

	    	GameRegistry.registerBlock(blockSoursopSapling , "blockSoursopSapling");
	    	GameRegistry.registerBlock(blockTamarilloSapling , "blockTamarilloSapling");
	    	GameRegistry.registerBlock(blockSapodillaSapling , "blockSapodillaSapling");
	    	GameRegistry.registerBlock(blockSaplingCinchona , "blockSaplingCinchona");
	    	
	    	
	    	
	    	
	    	// Apple
	    	blockCrabappleSapling = new BlockTreeSaplingApple(BandbBlocks.blockCrabappleLeaves,BandbBlocks.blockCrabappleWood).setBlockTextureName(Bandb_mod.MODID + ":sapling/blockCrabappleSapling").setBlockName("blockCrabappleSapling");
	    	blockAppleAntaresSapling = new BlockTreeSaplingApple(BandbBlocks.blockAppleAntaresLeaves,  BandbBlocks.blockAppleAntaresWood).setBlockTextureName(Bandb_mod.MODID + ":sapling/blockAppleAntaresSapling").setBlockName("blockAppleAntaresSapling");
	    	blockAppleArianeSapling = new BlockTreeSaplingApple(BandbBlocks.blockAppleArianeLeaves,  BandbBlocks.blockAppleArianeWood).setBlockTextureName(Bandb_mod.MODID + ":sapling/blockAppleArianeSapling").setBlockName("blockAppleArianeSapling");
	    	blockAppleBelchardChancelierSapling = new BlockTreeSaplingApple(BandbBlocks.blockAppleBelchardChantecierLeaves,   BandbBlocks.blockAppleBelchardChantecierWood).setBlockTextureName(Bandb_mod.MODID + ":sapling/blockAppleBelchardChancelierSapling").setBlockName("blockAppleBelchardChancelierSapling");
	    	blockAppleBelleDeBoskoopSapling = new BlockTreeSaplingApple(BandbBlocks.blockAppleBelleDeBoskoopLeaves,   BandbBlocks.blockAppleBelleDeBoskoopWood).setBlockTextureName(Bandb_mod.MODID + ":sapling/blockAppleBelleDeBoskoopSapling").setBlockName("blockAppleBelleDeBoskoopSapling");

	    	blockAppleBraeburnSapling = new BlockTreeSaplingApple(BandbBlocks.blockAppleBraeburnLeaves,   BandbBlocks.blockAppleBraeburnWood).setBlockTextureName(Bandb_mod.MODID + ":sapling/blockAppleBraeburnSapling").setBlockName("blockAppleBraeburnSapling");
	    	blockAppleElstarSapling = new BlockTreeSaplingApple(BandbBlocks.blockAppleElstarLeaves,  BandbBlocks.blockAppleElstarWood).setBlockTextureName(Bandb_mod.MODID + ":sapling/blockAppleElstarSapling").setBlockName("blockAppleElstarSapling");
	    	blockAppleFujiSapling = new BlockTreeSaplingApple(BandbBlocks.blockAppleFujiLeaves,   BandbBlocks.blockAppleFujiWood).setBlockTextureName(Bandb_mod.MODID + ":sapling/blockAppleFujiSapling").setBlockName("blockAppleFujiSapling");
	    	blockAppleGalaSapling = new BlockTreeSaplingApple(BandbBlocks.blockAppleGalaLeaves,   BandbBlocks.blockAppleGalaWood).setBlockTextureName(Bandb_mod.MODID + ":sapling/blockAppleGalaSapling").setBlockName("blockAppleGalaSapling");
	    	blockAppleGoldenSapling = new BlockTreeSaplingApple(BandbBlocks.blockAppleGoldenLeaves,   BandbBlocks.blockAppleGoldenWood).setBlockTextureName(Bandb_mod.MODID + ":sapling/blockAppleGoldenSapling").setBlockName("blockAppleGoldenSapling");

	    	GameRegistry.registerBlock(blockCrabappleSapling , "blockCrabappleSapling");
	    	GameRegistry.registerBlock(blockAppleAntaresSapling , "blockAppleAntaresSapling");
	    	GameRegistry.registerBlock(blockAppleArianeSapling , "blockAppleArianeSapling");
	    	GameRegistry.registerBlock(blockAppleBelchardChancelierSapling , "blockAppleBelchardChancelierSapling");
	    	GameRegistry.registerBlock(blockAppleBelleDeBoskoopSapling , "blockAppleBelleDeBoskoopSapling");

	    	GameRegistry.registerBlock(blockAppleBraeburnSapling , "blockAppleBraeburnSapling");
	    	GameRegistry.registerBlock(blockAppleElstarSapling , "blockAppleElstarSapling");
	    	GameRegistry.registerBlock(blockAppleFujiSapling , "blockAppleFujiSapling");
	    	GameRegistry.registerBlock(blockAppleGalaSapling , "blockAppleGalaSapling");
	    	GameRegistry.registerBlock(blockAppleGoldenSapling , "blockAppleGoldenSapling");
	    	
	    	blockAppleGrannySmithSapling = new BlockTreeSaplingApple(BandbBlocks.blockAppleGrannySmithLeaves,   BandbBlocks.blockAppleGrannySmithWood).setBlockTextureName(Bandb_mod.MODID + ":sapling/blockAppleGrannySmithSapling").setBlockName("blockAppleGrannySmithSapling");
	    	blockAppleHoneycrunchSapling = new BlockTreeSaplingApple(BandbBlocks.blockAppleHoneycrunchLeaves,   BandbBlocks.blockAppleHoneycrunchWood).setBlockTextureName(Bandb_mod.MODID + ":sapling/blockAppleHoneycrunchSapling").setBlockName("blockAppleHoneycrunchSapling");
	    	blockAppleJazzSapling = new BlockTreeSaplingApple(BandbBlocks.blockAppleJazzLeaves,   BandbBlocks.blockAppleJazzWood).setBlockTextureName(Bandb_mod.MODID + ":sapling/blockAppleJazzSapling").setBlockName("blockAppleJazzSapling");
	    	blockAppleJonagoldJonagoredSapling = new BlockTreeSaplingApple(BandbBlocks.blockAppleJonagoldJonagoredLeaves,   BandbBlocks.blockAppleJonagoldJonagoredWood).setBlockTextureName(Bandb_mod.MODID + ":sapling/blockAppleJonagoldJonagoredSapling").setBlockName("blockAppleJonagoldJonagoredSapling");
	    	blockAppleLesRougesSapling = new BlockTreeSaplingApple(BandbBlocks.blockAppleLesRougesLeaves,   BandbBlocks.blockAppleLesRougesWood).setBlockTextureName(Bandb_mod.MODID + ":sapling/blockAppleLesRougesSapling").setBlockName("blockAppleLesRougesSapling");

	    	blockApplePinkLadySapling = new BlockTreeSaplingApple(BandbBlocks.blockApplePinkLadyLeaves,   BandbBlocks.blockApplePinkLadyWood).setBlockTextureName(Bandb_mod.MODID + ":sapling/blockApplePinkLadySapling").setBlockName("blockApplePinkLadySapling");
	    	blockApplePommeDuLimousinSapling = new BlockTreeSaplingApple(BandbBlocks.blockApplePommeLimousinLeaves,  BandbBlocks.blockApplePommeLimousinWood).setBlockTextureName(Bandb_mod.MODID + ":sapling/blockApplePommeDuLimousinSapling").setBlockName("blockApplePommeDuLimousinSapling");
	    	blockAppleReineDesReinettesSapling = new BlockTreeSaplingApple(BandbBlocks.blockAppleReineDesReinettesLeaves,   BandbBlocks.blockAppleReineDesReinettesWood).setBlockTextureName(Bandb_mod.MODID + ":sapling/blockAppleReineDesReinettesSapling").setBlockName("blockAppleReineDesReinettesSapling");
	    	blockAppleReinetteGriseDuCanadaSapling = new BlockTreeSaplingApple(BandbBlocks.blockAppleReinetteGriseDuCanadaLeaves,  BandbBlocks.blockAppleReinetteGriseDuCanadaWood).setBlockTextureName(Bandb_mod.MODID + ":sapling/blockAppleReinetteGriseDuCanadaSapling").setBlockName("blockAppleReinetteGriseDuCanadaSapling");
	    	blockAppleTentationSapling = new BlockTreeSaplingApple(BandbBlocks.blockAppleTentationLeaves,   BandbBlocks.blockAppleTentationWood).setBlockTextureName(Bandb_mod.MODID + ":sapling/blockAppleTentationSapling").setBlockName("blockAppleTentationSapling");

	    	GameRegistry.registerBlock(blockAppleGrannySmithSapling , "blockAppleGrannySmithSapling");
	    	GameRegistry.registerBlock(blockAppleHoneycrunchSapling , "blockAppleHoneycrunchSapling");
	    	GameRegistry.registerBlock(blockAppleJazzSapling , "blockAppleJazzSapling");
	    	GameRegistry.registerBlock(blockAppleJonagoldJonagoredSapling , "blockAppleJonagoldJonagoredSapling");
	    	GameRegistry.registerBlock(blockAppleLesRougesSapling , "blockAppleLesRougesSapling");

	    	GameRegistry.registerBlock(blockApplePinkLadySapling , "blockApplePinkLadySapling");
	    	GameRegistry.registerBlock(blockApplePommeDuLimousinSapling , "blockApplePommeDuLimousinSapling");
	    	GameRegistry.registerBlock(blockAppleReineDesReinettesSapling , "blockAppleReineDesReinettesSapling");
	    	GameRegistry.registerBlock(blockAppleReinetteGriseDuCanadaSapling , "blockAppleReinetteGriseDuCanadaSapling");
	    	GameRegistry.registerBlock(blockAppleTentationSapling , "blockAppleTentationSapling");		    			   

			
	    	blockPlankAfrican = new BlockTreePlank().setBlockName("blockPlankAfrican");
	    	blockPlankAlmond = new BlockTreePlank().setBlockName("blockPlankAlmond");
			blockPlankAmla = new BlockTreePlank().setBlockName("blockPlankAmla");
			blockPlankAnise = new BlockTreePlank().setBlockName("blockPlankAnise");
			blockPlankApricot = new BlockTreePlank().setBlockName("blockPlankApricot");

			GameRegistry.registerBlock(blockPlankAfrican,"block_Plank_African");
	    	GameRegistry.registerBlock(blockPlankAlmond,"block_Plank_Almond");
			GameRegistry.registerBlock(blockPlankAmla,"block_Plank_Amla");
			GameRegistry.registerBlock(blockPlankAnise,"block_Plank_Anise");
			GameRegistry.registerBlock(blockPlankApricot,"block_Plank_Apricot");

	    	blockPlankAvocado = new BlockTreePlank().setBlockName("blockPlankAvocado");
	    	blockPlankBanana = new BlockTreePlank().setBlockName("blockPlankBanana");
	    	blockPlankBreadnut = new BlockTreePlank().setBlockName("blockPlankBreadnut");
	    	blockPlankCacao = new BlockTreePlank().setBlockName("blockPlankCacao");
	    	blockPlankCashew = new BlockTreePlank().setBlockName("blockPlankCashew");

			GameRegistry.registerBlock(blockPlankAvocado,"blockPlankAvocado");
	    	GameRegistry.registerBlock(blockPlankBanana,"blockPlankBanana");
			GameRegistry.registerBlock(blockPlankBreadnut,"blockPlankBreadnut");
			GameRegistry.registerBlock(blockPlankCacao,"blockPlankCacao");
			GameRegistry.registerBlock(blockPlankCashew,"blockPlankCashew");

	    	blockPlankCherry = new BlockTreePlank().setBlockName("blockPlankCherry");
			blockPlankMirabelle = new BlockTreePlank().setBlockName("blockPlankMirabelle");
	    	blockPlankChestnut = new BlockTreePlank().setBlockName("blockPlankChestnut");
	    	blockPlankClementine = new BlockTreePlank().setBlockName("blockPlankClementine");
			blockPlankCoconut = new BlockTreePlank().setBlockName("blockPlankCoconut");

	    	GameRegistry.registerBlock(blockPlankCherry,"blockPlankCherry");
			GameRegistry.registerBlock(blockPlankMirabelle,"blockPlankMirabelle");
	    	GameRegistry.registerBlock(blockPlankChestnut,"blockPlankChestnut");
	    	GameRegistry.registerBlock(blockPlankClementine,"blockPlankClementine");
			GameRegistry.registerBlock(blockPlankCoconut,"blockPlankCoconut");

			blockPlankCrabapple = new BlockTreePlank().setBlockName("blockPlankCrabapple");
	    	blockPlankDate = new BlockTreePlank().setBlockName("blockPlankDate");
	    	blockPlankDragonfruit = new BlockTreePlank().setBlockName("blockPlankDragonfruit");
	    	blockPlankFig = new BlockTreePlank().setBlockName("blockPlankFig");
	    	blockPlankGrapefruit = new BlockTreePlank().setBlockName("blockPlankGrapefruit");

			GameRegistry.registerBlock(blockPlankCrabapple,"blockPlankCrabapple");
	    	GameRegistry.registerBlock(blockPlankDate,"blockPlankDate");
	    	GameRegistry.registerBlock(blockPlankDragonfruit,"blockPlankDragonfruit");
	    	GameRegistry.registerBlock(blockPlankFig,"blockPlankFig");
	    	GameRegistry.registerBlock(blockPlankGrapefruit,"blockPlankGrapefruit");

			blockPlankGuava = new BlockTreePlank().setBlockName("blockPlankGuava");
			blockPlankJujube = new BlockTreePlank().setBlockName("blockPlankJujube");
	    	blockPlankKiwi = new BlockTreePlank().setBlockName("blockPlankKiwi");
			blockPlankKumquat = new BlockTreePlank().setBlockName("blockPlankKumquat");
			blockPlankLemon = new BlockTreePlank().setBlockName("blockPlankLemon");

			GameRegistry.registerBlock(blockPlankGuava,"blockPlankGuava");
			GameRegistry.registerBlock(blockPlankJujube,"blockPlankJujube");
			GameRegistry.registerBlock(blockPlankKiwi,"blockPlankKiwi");
			GameRegistry.registerBlock(blockPlankKumquat,"blockPlankKumquat");
			GameRegistry.registerBlock(blockPlankLemon,"blockPlankLemon");

			blockPlankLime = new BlockTreePlank().setBlockName("blockPlankLime");
			blockPlankLychee = new BlockTreePlank().setBlockName("blockPlankLychee");
			blockPlankMango = new BlockTreePlank().setBlockName("blockPlankMango");
			blockPlankNectarine = new BlockTreePlank().setBlockName("blockPlankNectarine");
			blockPlankNuts = new BlockTreePlank().setBlockName("blockPlankNuts");

			GameRegistry.registerBlock(blockPlankLime,"blockPlankLime");
			GameRegistry.registerBlock(blockPlankLychee,"blockPlankLychee");
			GameRegistry.registerBlock(blockPlankMango,"blockPlankMango");
			GameRegistry.registerBlock(blockPlankNectarine,"blockPlankNectarine");
			GameRegistry.registerBlock(blockPlankNuts,"blockPlankNuts");

			blockPlankOlive = new BlockTreePlank().setBlockName("blockPlankOlive");
			blockPlankOrange = new BlockTreePlank().setBlockName("blockPlankOrange");
			blockPlankPapaya = new BlockTreePlank().setBlockName("blockPlankPapaya");
			blockPlankPassionfruit = new BlockTreePlank().setBlockName("blockPlankPassionfruit");
			blockPlankPeach = new BlockTreePlank().setBlockName("blockPlankPeach");

			GameRegistry.registerBlock(blockPlankOlive,"blockPlankOlive");
			GameRegistry.registerBlock(blockPlankOrange,"blockPlankOrange");
			GameRegistry.registerBlock(blockPlankPapaya,"blockPlankPapaya");
			GameRegistry.registerBlock(blockPlankPassionfruit,"blockPlankPassionfruit");
			GameRegistry.registerBlock(blockPlankPeach,"blockPlankPeach");

			blockPlankPear = new BlockTreePlank().setBlockName("blockPlankPear");
			blockPlankPersimmon = new BlockTreePlank().setBlockName("blockPlankPersimmon");
	    	blockPlankPistachio = new BlockTreePlank().setBlockName("blockPlankPistachio");
			blockPlankPlum = new BlockTreePlank().setBlockName("blockPlankPlum");
			blockPlankPomegranate = new BlockTreePlank().setBlockName("blockPlankPomegranate");

			GameRegistry.registerBlock(blockPlankPear,"blockPlankPear");
			GameRegistry.registerBlock(blockPlankPersimmon,"blockPlankPersimmon");
			GameRegistry.registerBlock(blockPlankPistachio,"blockPlankPistachio");
			GameRegistry.registerBlock(blockPlankPlum,"blockPlankPlum");
			GameRegistry.registerBlock(blockPlankPomegranate,"blockPlankPomegranate");

			blockPlankQuince = new BlockTreePlank().setBlockName("blockPlankQuince");
	    	blockPlankStarAnise = new BlockTreePlank().setBlockName("blockPlankStarAnise");
			blockPlankTangerine = new BlockTreePlank().setBlockName("blockPlankTangerine");
	    	blockPlankVanilla = new BlockTreePlank().setBlockName("blockPlankVanilla");
			blockPlankWalnut = new BlockTreePlank().setBlockName("blockPlankWalnut");

			GameRegistry.registerBlock(blockPlankQuince,"blockPlankQuince");
			GameRegistry.registerBlock(blockPlankStarAnise,"blockPlankStarAnise");
			GameRegistry.registerBlock(blockPlankTangerine,"blockPlankTangerine");
			GameRegistry.registerBlock(blockPlankVanilla,"blockPlankVanilla");
			GameRegistry.registerBlock(blockPlankWalnut,"blockPlankWalnut");
						
			blockPlankAbiu = new BlockTreePlank().setBlockName("blockPlankAbiu");
			blockPlankAllspice = new BlockTreePlank().setBlockName("blockPlankAllspice");
			blockPlankBael = new BlockTreePlank().setBlockName("blockPlankBael");
			blockPlankBlackCherry = new BlockTreePlank().setBlockName("blockPlankBlackCherry");
			blockPlankBlackthorn = new BlockTreePlank().setBlockName("blockPlankBlackthorn");

			GameRegistry.registerBlock(blockPlankAbiu,"blockPlankAbiu");
			GameRegistry.registerBlock(blockPlankAllspice,"blockPlankAllspice");
			GameRegistry.registerBlock(blockPlankBael,"blockPlankBael");
			GameRegistry.registerBlock(blockPlankBlackCherry,"blockPlankBlackCherry");
			GameRegistry.registerBlock(blockPlankBlackthorn,"blockPlankBlackthorn");
			
			blockPlankBloodOrange = new BlockTreePlank().setBlockName("blockPlankBloodOrange");
			blockPlankBrazilNut = new BlockTreePlank().setBlockName("blockPlankBrazilNut");
			blockPlankButternut = new BlockTreePlank().setBlockName("blockPlankButternut");
			blockPlankCinnamon = new BlockTreePlank().setBlockName("blockPlankCinnamon");
			blockPlankClove = new BlockTreePlank().setBlockName("blockPlankClove");

			GameRegistry.registerBlock(blockPlankBloodOrange,"blockPlankBloodOrange");
			GameRegistry.registerBlock(blockPlankBrazilNut,"blockPlankBrazilNut");
			GameRegistry.registerBlock(blockPlankButternut,"blockPlankButternut");
			GameRegistry.registerBlock(blockPlankCinnamon,"blockPlankCinnamon");
			GameRegistry.registerBlock(blockPlankClove,"blockPlankClove");
			
			blockPlankDamsonPlum = new BlockTreePlank().setBlockName("blockPlankDamsonPlum");
			blockPlankElderberry = new BlockTreePlank().setBlockName("blockPlankElderberry");
			blockPlankLaurel = new BlockTreePlank().setBlockName("blockPlankLaurel");
			blockPlankLongan = new BlockTreePlank().setBlockName("blockPlankLongan");
			blockPlankLoquat = new BlockTreePlank().setBlockName("blockPlankLoquat");

			GameRegistry.registerBlock(blockPlankDamsonPlum,"blockPlankDamsonPlum");
			GameRegistry.registerBlock(blockPlankElderberry,"blockPlankElderberry");
			GameRegistry.registerBlock(blockPlankLaurel,"blockPlankLaurel");
			GameRegistry.registerBlock(blockPlankLongan,"blockPlankLongan");
			GameRegistry.registerBlock(blockPlankLoquat,"blockPlankLoquat");
			
			blockPlankMacadamia = new BlockTreePlank().setBlockName("blockPlankMacadamia");
			blockPlankMorelloCherry = new BlockTreePlank().setBlockName("blockPlankMorelloCherry");
			blockPlankNutmeg = new BlockTreePlank().setBlockName("blockPlankNutmeg");
			blockPlankPlane = new BlockTreePlank().setBlockName("blockPlankPlane");
			blockPlankPlantain = new BlockTreePlank().setBlockName("blockPlankPlantain");

			GameRegistry.registerBlock(blockPlankMacadamia,"blockPlankMacadamia");
			GameRegistry.registerBlock(blockPlankMorelloCherry,"blockPlankMorelloCherry");
			GameRegistry.registerBlock(blockPlankNutmeg,"blockPlankNutmeg");
			GameRegistry.registerBlock(blockPlankPlane,"blockPlankPlane");
			GameRegistry.registerBlock(blockPlankPlantain,"blockPlankPlantain");
			
			blockplankPomelo = new BlockTreePlank().setBlockName("blockplankPomelo");
			blockPlankSatsuma = new BlockTreePlank().setBlockName("blockPlankSatsuma");
			blockPlankTonkaBean = new BlockTreePlank().setBlockName("blockPlankTonkaBean");
			blockPlankWhitePeach = new BlockTreePlank().setBlockName("blockPlankWhitePeach");
			blockPlankGrapefruitPink = new BlockTreePlank().setBlockName("blockPlankGrapefruitPink");
			blockPlankMaple = new BlockTreePlank().setBlockName("blockPlankMaple");

			GameRegistry.registerBlock(blockplankPomelo,"blockplankPomelo");
			GameRegistry.registerBlock(blockPlankSatsuma,"blockPlankSatsuma");
			GameRegistry.registerBlock(blockPlankTonkaBean,"blockPlankTonkaBean");
			GameRegistry.registerBlock(blockPlankWhitePeach,"blockPlankWhitePeach");
			GameRegistry.registerBlock(blockPlankGrapefruitPink,"blockPlankGrapefruitPink");
			GameRegistry.registerBlock(blockPlankMaple,"blockPlankMaple");
			
			blockPlankBer = new BlockTreePlank().setBlockName("blockPlankBer");
			blockPlankCurry = new BlockTreePlank().setBlockName("blockPlankCurry");
			blockPlankRedBanana = new BlockTreePlank().setBlockName("blockPlankRedBanana");

			GameRegistry.registerBlock(blockPlankBer,"blockPlankBer");
			GameRegistry.registerBlock(blockPlankCurry,"blockPlankCurry");
			GameRegistry.registerBlock(blockPlankRedBanana,"blockPlankRedBanana");
			
			blockPlankBunyaNut = new BlockTreePlank().setBlockName("blockPlankBunyaNut");
			blockPlankGingkoNut = new BlockTreePlank().setBlockName("blockPlankGingkoNut");
			blockPlankHuckleberries = new BlockTreePlank().setBlockName("blockPlankHuckleberries");
			blockPlankJackFruit = new BlockTreePlank().setBlockName("blockPlankJackFruit");
			blockPlankMameySapote = new BlockTreePlank().setBlockName("blockPlankMameySapote");

			GameRegistry.registerBlock(blockPlankBunyaNut,"blockPlankBunyaNut");
			GameRegistry.registerBlock(blockPlankGingkoNut,"blockPlankGingkoNut");
			GameRegistry.registerBlock(blockPlankHuckleberries,"blockPlankHuckleberries");
			GameRegistry.registerBlock(blockPlankJackFruit,"blockPlankJackFruit");
			GameRegistry.registerBlock(blockPlankMameySapote,"blockPlankMameySapote");
				
			blockPlankMangosteen = new BlockTreePlank().setBlockName("blockPlankMangosteen");
			blockPlankOhiaAi = new BlockTreePlank().setBlockName("blockPlankOhiaAi");
			blockPlankOsageOrange = new BlockTreePlank().setBlockName("blockPlankOsageOrange");
			blockPlankParadiseNut = new BlockTreePlank().setBlockName("blockPlankParadiseNut");
			blockPlankPineNut = new BlockTreePlank().setBlockName("blockPlankPineNut");

			GameRegistry.registerBlock(blockPlankMangosteen,"blockPlankMangosteen");
			GameRegistry.registerBlock(blockPlankOhiaAi,"blockPlankOhiaAi");
			GameRegistry.registerBlock(blockPlankOsageOrange,"blockPlankOsageOrange");
			GameRegistry.registerBlock(blockPlankParadiseNut,"blockPlankParadiseNut");
			GameRegistry.registerBlock(blockPlankPineNut,"blockPlankPineNut");
			
			blockPlankSapodilla = new BlockTreePlank().setBlockName("blockPlankSapodilla");
			blockPlankSoursop = new BlockTreePlank().setBlockName("blockPlankSoursop");
			blockPlankTamarillo = new BlockTreePlank().setBlockName("blockPlankTamarillo");
			blockPlankCinchona = new BlockTreePlank().setBlockName("blockPlankCinchona");

			GameRegistry.registerBlock(blockPlankSapodilla,"blockPlankSapodilla");
			GameRegistry.registerBlock(blockPlankSoursop,"blockPlankSoursop");
			GameRegistry.registerBlock(blockPlankTamarillo,"blockPlankTamarillo");
			GameRegistry.registerBlock(blockPlankCinchona,"blockPlankCinchona");


			
			
			//apple
	    	blockPlankAppleAntares = new BlockTreePlank().setBlockName("blockPlankAppleAntares");
			blockPlankAppleAriane = new BlockTreePlank().setBlockName("blockPlankAppleAriane");
			blockPlankAppleBelchardChancelier = new BlockTreePlank().setBlockName("blockPlankAppleBelchardChancelier");
			blockPlankAppleBelleDeBoskoop = new BlockTreePlank().setBlockName("blockPlankAppleBelleDeBoskoop");
	    	blockPlankAppleBraeburn = new BlockTreePlank().setBlockName("blockPlankAppleBraeburn");
	    	
	    	GameRegistry.registerBlock(blockPlankAppleAntares,"blockPlankAppleAntares");
			GameRegistry.registerBlock(blockPlankAppleAriane,"blockPlankAppleAriane");
			GameRegistry.registerBlock(blockPlankAppleBelchardChancelier,"blockPlankAppleBelchardChancelier");
			GameRegistry.registerBlock(blockPlankAppleBelleDeBoskoop,"blockPlankAppleBelleDeBoskoop");
	    	GameRegistry.registerBlock(blockPlankAppleBraeburn,"blockPlankAppleBraeburn");

	    	blockPlankAppleElstar = new BlockTreePlank().setBlockName("blockPlankAppleElstar");
	    	blockPlankAppleFuji = new BlockTreePlank().setBlockName("blockPlankAppleFuji");
	    	blockPlankAppleGala = new BlockTreePlank().setBlockName("blockPlankAppleGala");
	    	blockPlankAppleGolden = new BlockTreePlank().setBlockName("blockPlankAppleGolden");
	    	blockPlankAppleGrannySmith = new BlockTreePlank().setBlockName("blockPlankAppleGrannySmith");

	    	GameRegistry.registerBlock(blockPlankAppleElstar,"blockPlankAppleElstar");
	    	GameRegistry.registerBlock(blockPlankAppleFuji,"blockPlankAppleFuji");
	    	GameRegistry.registerBlock(blockPlankAppleGala,"blockPlankAppleGala");
	    	GameRegistry.registerBlock(blockPlankAppleGolden,"blockPlankAppleGolden");
	    	GameRegistry.registerBlock(blockPlankAppleGrannySmith,"blockPlankAppleGrannySmith");

			blockPlankAppleHoneyCrunch = new BlockTreePlank().setBlockName("blockPlankAppleHoneyCrunch");
			blockPlankAppleJazz = new BlockTreePlank().setBlockName("blockPlankAppleJazz");
			blockPlankAppleJonagoldJonagored = new BlockTreePlank().setBlockName("blockPlankAppleJonagoldJonagored");
			blockPlankAppleLesRouges = new BlockTreePlank().setBlockName("blockPlankAppleLesRouges");
			blockPlankApplePinkLady = new BlockTreePlank().setBlockName("blockPlankApplePinkLady");

			GameRegistry.registerBlock(blockPlankAppleHoneyCrunch,"blockPlankAppleHoneyCrunch");
			GameRegistry.registerBlock(blockPlankAppleJazz,"blockPlankAppleJazz");
			GameRegistry.registerBlock(blockPlankAppleJonagoldJonagored,"blockPlankAppleJonagoldJonagored");
			GameRegistry.registerBlock(blockPlankAppleLesRouges,"blockPlankAppleLesRouges");
		 	GameRegistry.registerBlock(blockPlankApplePinkLady,"blockPlankApplePinkLady");

			
			blockPlankApplePommeLimousin = new BlockTreePlank().setBlockName("blockPlankApplePommeLimousin");
			BlockPlankAppleReineDesReinettes = new BlockTreePlank().setBlockName("BlockPlankAppleReineDesReinettes");
			blockPlankAppleReinetteGriseDuCanada = new BlockTreePlank().setBlockName("blockPlankAppleReinetteGriseDuCanada");
			blockPlankAppleTentation = new BlockTreePlank().setBlockName("blockPlankAppleTentation");

			GameRegistry.registerBlock(blockPlankApplePommeLimousin,"blockPlankApplePommeLimousin");
			GameRegistry.registerBlock(BlockPlankAppleReineDesReinettes,"BlockPlankAppleReineDesReinettes");
			GameRegistry.registerBlock(blockPlankAppleReinetteGriseDuCanada,"blockPlankAppleReinetteGriseDuCanada");
			GameRegistry.registerBlock(blockPlankAppleTentation,"blockPlankAppleTentation");		    			    	
		
			 //blocks plants
	    	blockMint = new BlockPlant(BandbItems.itemMint, 0.4F, 0.5F, 0.0F, 0.5F, 0.5F, 1.50F, 0.5F).setBlockTextureName(Bandb_mod.MODID + ":plant/blockMint").setBlockName("blockMint");
	    	blockRape = new BlockPlant(BandbItems.itemRape, 0.4F, 0.5F, 0.0F, 0.5F, 0.5F, 2.0F, 0.5F).setBlockTextureName(Bandb_mod.MODID + ":plant/blockRape").setBlockName("blockRape");
	    	blockBetterCactus = new BlockPlantDesert(BandbItems.itemBetterCactus, 0.4F, 0.6F, 0.0F, 0.6F, 0.4F, 1.1F, 0.4F).setBlockTextureName(Bandb_mod.MODID + ":plant/blockBetterCactus").setBlockName("blockBetterCactus");
	    	blockDaisy = new BlockPlant(BandbItems.itemDaisy, 0.4F, 0.5F, 0.0F, 0.5F, 0.5F, 2.0F, 0.5F).setBlockTextureName(Bandb_mod.MODID + ":plant/blockDaisy").setBlockName("blockDaisy");
	    	blockOrchid = new BlockPlant(BandbItems.itemOrchid, 0.4F, 0.6F, 0.0F, 0.6F, 0.4F, 1.1F, 0.4F).setBlockTextureName(Bandb_mod.MODID + ":plant/blockOrchid").setBlockName("blockOrchid");

	    	GameRegistry.registerBlock(blockMint,"blockMint");
	    	GameRegistry.registerBlock(blockRape,"blockRape");
	    	GameRegistry.registerBlock(blockBetterCactus,"blockBetterCactus");
	    	GameRegistry.registerBlock(blockDaisy,"blockDaisy");
	    	GameRegistry.registerBlock(blockOrchid,"blockOrchid");
	    			    	
	    	blockSesame = new BlockPlant(BandbItems.itemSesame, 0.4F, 0.6F, 0.0F, 0.6F, 0.4F, 1.1F, 0.4F).setBlockTextureName(Bandb_mod.MODID + ":plant/blockSesame").setBlockName("blockSesame");
	    	blockLicorice = new BlockPlant(BandbItems.itemLicorice, 0.4F, 0.6F, 0.0F, 0.6F, 0.4F, 1.1F, 0.4F).setBlockTextureName(Bandb_mod.MODID + ":plant/blockLicorice").setBlockName("blockLicorice");
	    	blockHibiscus = new BlockPlant(BandbItems.itemHibiscus, 0.4F, 0.6F, 0.0F, 0.6F, 0.4F, 1.1F, 0.4F).setBlockTextureName(Bandb_mod.MODID + ":plant/blockHibiscus").setBlockName("blockHibiscus");
	    	blockJasmine = new BlockPlant(BandbItems.itemJasmine, 0.4F, 0.6F, 0.0F, 0.6F, 0.4F, 1.1F, 0.4F).setBlockTextureName(Bandb_mod.MODID + ":plant/blockJasmine").setBlockName("blockJasmine");
	    	blockLavender = new BlockPlant(BandbItems.itemLavender, 0.4F, 0.6F, 0.0F, 0.6F, 0.4F, 1.1F, 0.4F).setBlockTextureName(Bandb_mod.MODID + ":plant/blockLavender").setBlockName("blockLavender");

	    	GameRegistry.registerBlock(blockSesame,"blockSesame");
	    	GameRegistry.registerBlock(blockLicorice,"blockLicorice");
	    	GameRegistry.registerBlock(blockHibiscus,"blockHibiscus");
	    	GameRegistry.registerBlock(blockJasmine,"blockJasmine");
	    	GameRegistry.registerBlock(blockLavender,"blockLavender");
	    	
	    	blockRosmary = new BlockPlant(BandbItems.itemRosmary, 0.4F, 0.6F, 0.0F, 0.6F, 0.4F, 1.1F, 0.4F).setBlockTextureName(Bandb_mod.MODID + ":plant/blockRosmary").setBlockName("blockRosmary");
	    	blockTarragon = new BlockPlant(BandbItems.itemTarragon, 0.4F, 0.6F, 0.0F, 0.6F, 0.4F, 1.1F, 0.4F).setBlockTextureName(Bandb_mod.MODID + ":plant/blockTarragon").setBlockName("blockTarragon");
	    	blockAgave = new BlockPlantDesert(BandbItems.itemAgave, 0.4F, 0.6F, 0.0F, 0.6F, 0.4F, 1.1F, 0.4F).setBlockTextureName(Bandb_mod.MODID + ":plant/blockAgave").setBlockName("blockAgave");
	    	blockAmaryllisPink = new BlockPlant(BandbItems.itemAmaryllisPink, 0.4F, 0.6F, 0.0F, 0.6F, 0.4F, 1.1F, 0.4F).setBlockTextureName(Bandb_mod.MODID + ":plant/blockAmaryllisPink").setBlockName("blockAmaryllisPink");
	    	blockAmaryllisRed = new BlockPlant(BandbItems.itemAmaryllisRed, 0.4F, 0.6F, 0.0F, 0.6F, 0.4F, 1.1F, 0.4F).setBlockTextureName(Bandb_mod.MODID + ":plant/blockAmaryllisRed").setBlockName("blockAmaryllisRed");
	    	
	    	GameRegistry.registerBlock(blockRosmary,"blockRosmary");
	    	GameRegistry.registerBlock(blockTarragon,"blockTarragon");
	    	GameRegistry.registerBlock(blockAgave,"blockAgave");
	    	GameRegistry.registerBlock(blockAmaryllisPink,"blockAmaryllisPink");
	    	GameRegistry.registerBlock(blockAmaryllisRed,"blockAmaryllisRed");
	    	
	    	blockAmaryllisWhite = new BlockPlant(BandbItems.itemAmaryllisWhite, 0.4F, 0.6F, 0.0F, 0.6F, 0.4F, 1.1F, 0.4F).setBlockTextureName(Bandb_mod.MODID + ":plant/blockAmaryllisWhite").setBlockName("blockAmaryllisWhite");
	    	blockBachelorsButtonBlue = new BlockPlant(BandbItems.itemBachelorsButtonBlue, 0.4F, 0.6F, 0.0F, 0.6F, 0.4F, 1.1F, 0.4F).setBlockTextureName(Bandb_mod.MODID + ":plant/blockBachelorsButtonBlue").setBlockName("blockBachelorsButtonBlue");
	    	blockBelladonna = new BlockPlant(BandbItems.itemBelladonna, 0.4F, 0.6F, 0.0F, 0.6F, 0.4F, 1.1F, 0.4F).setBlockTextureName(Bandb_mod.MODID + ":plant/blockBelladonna").setBlockName("blockBelladonna");
	    	blockBlowball = new BlockPlant(BandbItems.itemBlowball, 0.4F, 0.6F, 0.0F, 0.6F, 0.4F, 1.1F, 0.4F).setBlockTextureName(Bandb_mod.MODID + ":plant/blockBlowball").setBlockName("blockBlowball");
	    	blockButtercup = new BlockPlant(BandbItems.itemButtercup, 0.4F, 0.6F, 0.0F, 0.6F, 0.4F, 1.1F, 0.4F).setBlockTextureName(Bandb_mod.MODID + ":plant/blockButtercup").setBlockName("blockButtercup");
	    	
	    	GameRegistry.registerBlock(blockAmaryllisWhite,"blockAmaryllisWhite");
	    	GameRegistry.registerBlock(blockBachelorsButtonBlue,"blockBachelorsButtonBlue");
	    	GameRegistry.registerBlock(blockBelladonna,"blockBelladonna");
	    	GameRegistry.registerBlock(blockBlowball,"blockBlowball");
	    	GameRegistry.registerBlock(blockButtercup,"blockButtercup");
	    	
	    	blockCallaBlack = new BlockPlant(BandbItems.itemCallaBlack, 0.4F, 0.6F, 0.0F, 0.6F, 0.4F, 1.1F, 0.4F).setBlockTextureName(Bandb_mod.MODID + ":plant/blockCallaBlack").setBlockName("blockCallaBlack");
	    	blockCallaWhite = new BlockPlant(BandbItems.itemCallaWhite, 0.4F, 0.6F, 0.0F, 0.6F, 0.4F, 1.1F, 0.4F).setBlockTextureName(Bandb_mod.MODID + ":plant/blockCallaWhite").setBlockName("blockCallaWhite");
	    	blockChrysantheme = new BlockPlant(BandbItems.itemChrysantheme, 0.4F, 0.6F, 0.0F, 0.6F, 0.4F, 1.1F, 0.4F).setBlockTextureName(Bandb_mod.MODID + ":plant/blockChrysantheme").setBlockName("blockChrysantheme");
	    	blockEnzian = new BlockPlant(BandbItems.itemEnzian, 0.4F, 0.6F, 0.0F, 0.6F, 0.4F, 1.1F, 0.4F).setBlockTextureName(Bandb_mod.MODID + ":plant/blockEnzian").setBlockName("blockEnzian");
	    	blockFoxglove = new BlockPlant(BandbItems.itemFoxglove, 0.4F, 0.6F, 0.0F, 0.6F, 0.4F, 1.1F, 0.4F).setBlockTextureName(Bandb_mod.MODID + ":plant/blockFoxglove").setBlockName("blockFoxglove");
	    	
	    	GameRegistry.registerBlock(blockCallaBlack,"blockCallaBlack");
	    	GameRegistry.registerBlock(blockCallaWhite,"blockCallaWhite");
	    	GameRegistry.registerBlock(blockChrysantheme,"blockChrysantheme");
	    	GameRegistry.registerBlock(blockEnzian,"blockEnzian");
	    	GameRegistry.registerBlock(blockFoxglove,"blockFoxglove");
	    	
	    	blockHeather = new BlockPlant(BandbItems.itemHeather, 0.4F, 0.6F, 0.0F, 0.6F, 0.4F, 1.1F, 0.4F).setBlockTextureName(Bandb_mod.MODID + ":plant/blockHeather").setBlockName("blockHeather");
	    	blockIrisBlue = new BlockPlant(BandbItems.itemIrisBlue, 0.4F, 0.6F, 0.0F, 0.6F, 0.4F, 1.1F, 0.4F).setBlockTextureName(Bandb_mod.MODID + ":plant/blockIrisBlue").setBlockName("blockIrisBlue");
	    	blockIrisPurple = new BlockPlant(BandbItems.itemIrisPurple, 0.4F, 0.6F, 0.0F, 0.6F, 0.4F, 1.1F, 0.4F).setBlockTextureName(Bandb_mod.MODID + ":plant/blockIrisPurple").setBlockName("blockIrisPurple");
	    	blockLily = new BlockPlant(BandbItems.itemLily, 0.4F, 0.6F, 0.0F, 0.6F, 0.4F, 1.1F, 0.4F).setBlockTextureName(Bandb_mod.MODID + ":plant/blockLily").setBlockName("blockLily");
	    	blockMarshMarigold = new BlockPlant(BandbItems.itemMarshMarigold, 0.4F, 0.6F, 0.0F, 0.6F, 0.4F, 1.1F, 0.4F).setBlockTextureName(Bandb_mod.MODID + ":plant/blockMarshMarigold").setBlockName("blockMarshMarigold");
	    	
	    	GameRegistry.registerBlock(blockHeather,"blockHeather");
	    	GameRegistry.registerBlock(blockIrisBlue,"blockIrisBlue");
	    	GameRegistry.registerBlock(blockIrisPurple,"blockIrisPurple");
	    	GameRegistry.registerBlock(blockLily,"blockLily");
	    	GameRegistry.registerBlock(blockMarshMarigold,"blockMarshMarigold");
	    	
	    	blockPansy = new BlockPlant(BandbItems.itemPansy, 0.4F, 0.6F, 0.0F, 0.6F, 0.4F, 1.1F, 0.4F).setBlockTextureName(Bandb_mod.MODID + ":plant/blockPansy").setBlockName("blockPansy");
	    	blockPeony = new BlockPlant(BandbItems.itemPeony, 0.4F, 0.6F, 0.0F, 0.6F, 0.4F, 1.1F, 0.4F).setBlockTextureName(Bandb_mod.MODID + ":plant/blockPeony").setBlockName("blockPeony");
	    	blockSyringa = new BlockPlant(BandbItems.itemSyringa, 0.4F, 0.6F, 0.0F, 0.6F, 0.4F, 1.1F, 0.4F).setBlockTextureName(Bandb_mod.MODID + ":plant/blockSyringa").setBlockName("blockSyringa");
	    	blockViolet = new BlockPlant(BandbItems.itemViolet, 0.4F, 0.6F, 0.0F, 0.6F, 0.4F, 1.1F, 0.4F).setBlockTextureName(Bandb_mod.MODID + ":plant/blockViolet").setBlockName("blockViolet");
	    	blockLemonGrass = new BlockPlant(BandbItems.itemLemonGrass, 0.4F, 0.6F, 0.0F, 0.6F, 0.4F, 1.1F, 0.4F).setBlockTextureName(Bandb_mod.MODID + ":plant/blockLemonGrass").setBlockName("blockLemonGrass");
	    	blockPeyote = new BlockPlantDesert(BandbItems.itemPeyote, 0.4F, 0.6F, 0.0F, 0.6F, 0.4F, 1.1F, 0.4F).setBlockTextureName(Bandb_mod.MODID + ":plant/blockPeyote").setBlockName("blockPeyote");
	    	
	    	blockBluebell = new BlockPlant(BandbItems.itemBluebell, 0.4F, 0.6F, 0.0F, 0.6F, 0.4F, 1.1F, 0.4F).setBlockTextureName(Bandb_mod.MODID + ":plant/blockBluebell").setBlockName("blockBluebell");
	    	blockDill = new BlockPlant(BandbItems.itemDill, 0.4F, 0.6F, 0.0F, 0.6F, 0.4F, 1.1F, 0.4F).setBlockTextureName(Bandb_mod.MODID + ":plant/blockDill").setBlockName("blockDill");
	    	blockGardenia = new BlockPlant(BandbItems.itemGardenia, 0.4F, 0.6F, 0.0F, 0.6F, 0.4F, 1.1F, 0.4F).setBlockTextureName(Bandb_mod.MODID + ":plant/blockGardenia").setBlockName("blockGardenia");
	    	blockNettle = new BlockPlant(BandbItems.itemNettle, 0.4F, 0.6F, 0.0F, 0.6F, 0.4F, 1.1F, 0.4F).setBlockTextureName(Bandb_mod.MODID + ":plant/blockNettle").setBlockName("blockNettle");
	    	blockThistle = new BlockPlant(BandbItems.itemThistle, 0.4F, 0.6F, 0.0F, 0.6F, 0.4F, 1.1F, 0.4F).setBlockTextureName(Bandb_mod.MODID + ":plant/blockThistle").setBlockName("blockThistle");
	    	
			GameRegistry.registerBlock(blockPansy,"blockPansy");
	    	GameRegistry.registerBlock(blockPeony,"blockPeony");
	    	GameRegistry.registerBlock(blockSyringa,"blockSyringa");
	    	GameRegistry.registerBlock(blockViolet,"blockViolet");
	    	GameRegistry.registerBlock(blockLemonGrass,"blockLemonGrass");
	    	GameRegistry.registerBlock(blockPeyote,"blockPeyote");
	    	
	    	GameRegistry.registerBlock(blockBluebell,"blockBluebell");
	    	GameRegistry.registerBlock(blockDill,"blockDill");
	    	GameRegistry.registerBlock(blockGardenia,"blockGardenia");
	    	GameRegistry.registerBlock(blockNettle,"blockNettle");
	    	GameRegistry.registerBlock(blockThistle,"blockThistle");
	    	
			blockWormwood = new BlockPlant(BandbItems.itemWormwood, 0.4F, 0.6F, 0.0F, 0.6F, 0.4F, 1.1F, 0.4F).setBlockTextureName(Bandb_mod.MODID + ":plant/blockWormwood").setBlockName("blockWormwood");
			blockCinchona = new BlockPlant(BandbItems.itemCinchona, 0.4F, 0.6F, 0.0F, 0.6F, 0.4F, 1.1F, 0.4F).setBlockTextureName(Bandb_mod.MODID + ":plant/blockCinchona").setBlockName("blockCinchona");
			blockChives = new BlockPlant(BandbItems.itemChives, 0.4F, 0.6F, 0.0F, 0.6F, 0.4F, 1.1F, 0.4F).setBlockTextureName(Bandb_mod.MODID + ":plant/blockChives").setBlockName("blockChives");
			blockChervil = new BlockPlant(BandbItems.itemChervil, 0.4F, 0.6F, 0.0F, 0.6F, 0.4F, 1.1F, 0.4F).setBlockTextureName(Bandb_mod.MODID + ":plant/blockChervil").setBlockName("blockChervil");
			blockWatercress = new BlockPlant(BandbItems.itemWatercress, 0.4F, 0.6F, 0.0F, 0.6F, 0.4F, 1.1F, 0.4F).setBlockTextureName(Bandb_mod.MODID + ":plant/blockWatercress").setBlockName("blockWatercress");
	    	
	    	GameRegistry.registerBlock(blockWormwood,"blockWormwood");
	    	GameRegistry.registerBlock(blockCinchona,"blockCinchona");
	    	GameRegistry.registerBlock(blockChives,"blockChives");
	    	GameRegistry.registerBlock(blockChervil,"blockChervil");
	    	GameRegistry.registerBlock(blockWatercress,"blockWatercress");
	    	   
			blockThyme = new BlockPlant(BandbItems.itemThyme, 0.4F, 0.6F, 0.0F, 0.6F, 0.4F, 1.1F, 0.4F).setBlockTextureName(Bandb_mod.MODID + ":plant/blockThyme").setBlockName("blockThyme");
			blockSage = new BlockPlant(BandbItems.itemSage, 0.4F, 0.6F, 0.0F, 0.6F, 0.4F, 1.1F, 0.4F).setBlockTextureName(Bandb_mod.MODID + ":plant/blockSage").setBlockName("blockSage");
			blockOregano = new BlockPlant(BandbItems.itemOregano, 0.4F, 0.6F, 0.0F, 0.6F, 0.4F, 1.1F, 0.4F).setBlockTextureName(Bandb_mod.MODID + ":plant/blockOregano").setBlockName("blockOregano");
			blockFennel = new BlockPlant(BandbItems.itemFennel, 0.4F, 0.6F, 0.0F, 0.6F, 0.4F, 1.1F, 0.4F).setBlockTextureName(Bandb_mod.MODID + ":plant/blockFennel").setBlockName("blockFennel");
			blockGentian = new BlockPlant(BandbItems.itemGentian, 0.4F, 0.6F, 0.0F, 0.6F, 0.4F, 1.1F, 0.4F).setBlockTextureName(Bandb_mod.MODID + ":plant/blockGentian").setBlockName("blockGentian");
	    	
	    	GameRegistry.registerBlock(blockThyme,"blockThyme");
	    	GameRegistry.registerBlock(blockSage,"blockSage");
	    	GameRegistry.registerBlock(blockOregano,"blockOregano");
	    	GameRegistry.registerBlock(blockFennel,"blockFennel");
	    	GameRegistry.registerBlock(blockGentian,"blockGentian");
	    	
	    //mushrooms
	    	blockTruffle = new BlockMushroomOre(BandbItems.itemTruffle).setBlockTextureName(Bandb_mod.MODID + ":mushrooms/blockTruffle").setBlockName("blockTruffle");
	    	blockMorel = new BlockMushroom(BandbItems.itemMorel, 0.4F, 0.65F, 0.0F, 0.65F, 0.35F, 1.8F, 0.35F).setBlockTextureName(Bandb_mod.MODID + ":mushrooms/blockMorel").setBlockName("blockMorel");
	    	blockHornOfPlenty = new BlockMushroom(BandbItems.itemHornOfPlenty, 0.4F, 0.6F, 0.0F, 0.6F, 0.4F, 1.85F, 0.40F).setBlockTextureName(Bandb_mod.MODID + ":mushrooms/blockHornOfPlenty").setBlockName("blockHornOfPlenty");
	    	blockCep = new BlockMushroom(BandbItems.itemCep,0.4F, 0.6F, 0.0F, 0.6F, 0.4F, 1.25F, 0.4F).setBlockTextureName(Bandb_mod.MODID + ":mushrooms/blockCep").setBlockName("blockCep");
	    	blockHydnumRepandum = new BlockMushroom(BandbItems.itemHydnumRepandum, 0.4F, 0.6F, 0.0F, 0.6F, 0.4F, 1.85F, 0.4F).setBlockTextureName(Bandb_mod.MODID + ":mushrooms/blockHydnumRepandum").setBlockName("blockHydnumRepandum");

	    	blockAmanitaMuscaria = new BlockMushroom(BandbItems.itemAmanitaMuscaria, 0.4F, 0.5F, 0.0F, 0.5F, 0.5F, 2.0F, 0.5F).setBlockTextureName(Bandb_mod.MODID + ":mushrooms/blockAmanitaMuscaria").setBlockName("blockAmanitaMuscaria");

	    	GameRegistry.registerBlock(blockTruffle,"blockTruffle");
	    	GameRegistry.registerBlock(blockMorel,"blockMorel");
	    	GameRegistry.registerBlock(blockHornOfPlenty,"blockHornOfPlenty");
	    	GameRegistry.registerBlock(blockCep,"blockCep");
	    	GameRegistry.registerBlock(blockHydnumRepandum,"blockHydnumRepandum");

	    	GameRegistry.registerBlock(blockAmanitaMuscaria,"blockAmanitaMuscaria");				
		
			//ore
	    		//drop block
	    	blockOreAluminium = new BlockOreDropOre(Material.rock, 5.0F, 2).setBlockTextureName(Bandb_mod.MODID + ":ore/blockOreAluminium").setBlockName("blockOreAluminium");
	    	blockOrePlatinum = new BlockOreDropOre(Material.rock, 15.0F, 3).setBlockTextureName(Bandb_mod.MODID + ":ore/blockOrePlatinum").setBlockName("blockOrePlatinum");
	    	blockOreTitan = new BlockOreDropOre(Material.rock, 15.0F, 3).setBlockTextureName(Bandb_mod.MODID + ":ore/blockOreTitan").setBlockName("blockOreTitan");

	    	GameRegistry.registerBlock(blockOreAluminium, "blockOreAluminium");
	    	GameRegistry.registerBlock(blockOrePlatinum, "blockOrePlatinum");
	    	GameRegistry.registerBlock(blockOreTitan, "blockOreTitan");
	    	
	    	//drop gem
	    	blockOreAmethyst = new BlockOreDropGem(Material.rock, 5.0F, 2, BandbItems.itemAmethyst, 1).setBlockTextureName(Bandb_mod.MODID + ":ore/blockOreAmethyst").setBlockName("blockOreAmethyst");
			blockOreJade = new BlockOreDropGem(Material.rock, 5.0F, 2, BandbItems.itemJade, 1).setBlockTextureName(Bandb_mod.MODID + ":ore/blockOreJade").setBlockName("blockOreJade");
	    	blockOreOnyx = new BlockOreDropGem(Material.rock, 6.0F, 2, BandbItems.itemOnyx, 1).setBlockTextureName(Bandb_mod.MODID + ":ore/blockOreOnyx").setBlockName("blockOreOnyx");
	    	
	    	blockOreOpal = new BlockOreDropGem(Material.rock, 6.0F, 1, BandbItems.itemOpal, 1).setBlockTextureName(Bandb_mod.MODID + ":ore/blockOreOpal").setBlockName("blockOreOpal");
	    	blockOreRuby = new BlockOreDropGem(Material.rock, 5.0F,	2, BandbItems.itemRuby, 1).setBlockTextureName(Bandb_mod.MODID + ":ore/blockOreRuby").setBlockName("blockOreRuby");
	    	blockOreSalt = new BlockOreDropGem(Material.rock, 4.0F, 1, BandbItems.itemSalt, 9).setBlockTextureName(Bandb_mod.MODID + ":ore/blockOreSalt").setBlockName("blockOreSalt");
	    	blockOreSapphire = new BlockOreDropGem(Material.rock,5.0F,	2, BandbItems.itemSapphire, 2).setBlockTextureName(Bandb_mod.MODID + ":ore/blockOreSapphire").setBlockName("blockOreSapphire");

	    	GameRegistry.registerBlock(blockOreAmethyst, "blockOreAmethyst");
	    	GameRegistry.registerBlock(blockOreJade, "blockOreJade");
	    	GameRegistry.registerBlock(blockOreOnyx, "blockOreOnyx");
 	
	    	GameRegistry.registerBlock(blockOreOpal, "blockOreOpal");
	    	GameRegistry.registerBlock(blockOreRuby, "blockOreRuby");
	    	GameRegistry.registerBlock(blockOreSalt, "blockOreSalt");
	    	GameRegistry.registerBlock(blockOreSapphire, "blockOreSapphire");
	    	
	    	blockOreTopaz = new BlockOreDropGem(Material.rock,5.0F,	2, BandbItems.itemTopaz, 1).setBlockTextureName(Bandb_mod.MODID + ":ore/blockOreTopaz").setBlockName("blockOreTopaz");
	    	blockOrePainite = new BlockOreDropGem(Material.rock,5.0F,	2, BandbItems.itemPainite, 1).setBlockTextureName(Bandb_mod.MODID + ":ore/blockOrePainite").setBlockName("blockOrePainite");

	    	GameRegistry.registerBlock(blockOreTopaz, "blockOreTopaz");			
	    	GameRegistry.registerBlock(blockOrePainite, "blockOrePainite");
			
	    		//block ingot 	    	
			blockAluminium = new BlockIngot(Material.iron).setBlockTextureName(Bandb_mod.MODID + ":ingot/blockAluminium").setBlockName("blockAluminium");
			blockAmethyst = new BlockIngot(Material.iron).setBlockTextureName(Bandb_mod.MODID + ":ingot/blockAmethyst").setBlockName("blockAmethyst");
			blockJade = new BlockIngot(Material.iron).setBlockTextureName(Bandb_mod.MODID + ":ingot/blockJade").setBlockName("blockJade");
			blockPainite = new BlockIngot(Material.iron).setBlockTextureName(Bandb_mod.MODID + ":ingot/blockPainite").setBlockName("blockPainite");
			
			blockOnyx = new BlockIngot(Material.iron).setBlockTextureName(Bandb_mod.MODID + ":ingot/blockOnyx").setBlockName("blockOnyx");
			blockOpal = new BlockIngot(Material.iron).setBlockTextureName(Bandb_mod.MODID + ":ingot/blockOpal").setBlockName("blockOpal");

			
			GameRegistry.registerBlock(blockAluminium, "blockAluminium");
	    	GameRegistry.registerBlock(blockAmethyst, "blockAmethyst");
	    	GameRegistry.registerBlock(blockJade, "blockJade");
	    	GameRegistry.registerBlock(blockPainite, "blockPainite");

	    	GameRegistry.registerBlock(blockOnyx, "blockOnyx");
	    	GameRegistry.registerBlock(blockOpal, "blockOpal");

			blockPlatinum = new BlockIngot(Material.iron).setBlockTextureName(Bandb_mod.MODID + ":ingot/blockPlatinum").setBlockName("blockPlatinum");

			GameRegistry.registerBlock(blockPlatinum, "blockPlatinum");
	    	
	    	blockRuby = new BlockIngot(Material.iron).setBlockTextureName(Bandb_mod.MODID + ":ingot/blockRuby").setBlockName("blockRuby");
	    	blockSapphire = new BlockIngot(Material.iron).setBlockTextureName(Bandb_mod.MODID + ":ingot/blockSapphire").setBlockName("blockSapphire");
	    	blockSteel = new BlockIngot(Material.iron).setBlockTextureName(Bandb_mod.MODID + ":ingot/blockSteel").setBlockName("blockSteel");
	    	blockTitan = new BlockIngot(Material.iron).setBlockTextureName(Bandb_mod.MODID + ":ingot/blockTitan").setBlockName("blockTitan");
	    	blockTopaz = new BlockIngot(Material.iron).setBlockTextureName(Bandb_mod.MODID + ":ingot/blockTopaz").setBlockName("blockTopaz");
	    	
			GameRegistry.registerBlock(blockRuby, "blockRuby");
	    	GameRegistry.registerBlock(blockSapphire, "blockSapphire");
	    	GameRegistry.registerBlock(blockSteel, "blockSteel");

			GameRegistry.registerBlock(blockTitan, "blockTitan");
	    	GameRegistry.registerBlock(blockTopaz, "blockTopaz");
	    					    	
	    	//Other
	    	blockCobblestoneMilka = new BlockMilka(Material.rock).setBlockTextureName(Bandb_mod.MODID + ":miscellaneous/blockCobblestoneMilka").setBlockName("blockCobblestoneMilka");
	    	blockDirtMilka_top = new BlockMilka(Material.rock).setBlockTextureName(Bandb_mod.MODID + ":miscellaneous/blockDirtMilka_top").setBlockName("blockDirtMilka_top");
	    	blockStoneMilka = new BlockMilka(Material.rock).setBlockTextureName(Bandb_mod.MODID + ":miscellaneous/blockStoneMilka").setBlockName("blockStoneMilka");

	    	GameRegistry.registerBlock(blockCobblestoneMilka, "blockCobblestoneMilka");			
	    	GameRegistry.registerBlock(blockDirtMilka_top, "blockDirtMilka_top");			
	    	GameRegistry.registerBlock(blockStoneMilka, "blockStoneMilka");			
							    	
				//block decoration	
				//bedrock
				//bookshelf	
				//brick
			blockDecorationBrick_1 = new blockDecoration(Material.rock).setBlockName("blockDecorationBrick_1").setBlockTextureName(Bandb_mod.MODID + ":decoration/blockDecorationBrick_1");		;	
			
			GameRegistry.registerBlock(blockDecorationBrick_1, "blockDecorationBrick_1");
		
					//black
			
				//clay
				//coalblock
				//cobblestone
					//mossy
				//diamondBlock
				//dirt
				//emeraldblock
				//endstone
				//Floor
				//glass
					//black
			blockDecorationGlass_black_1 = new blockDecorationGlass(Material.glass).setBlockName("blockDecorationGlass_black_1");	
			
			GameRegistry.registerBlock(blockDecorationGlass_black_1, "blockDecorationGlass_black_1");
		
					//blue
					//brown
					//cyan
					//gray
					//green
					//lightblue
					//lime
					//magenta
					//orange
					//pink
					//purple
					//red
					//silver
					//white
					//yellow
				//glowstone
				//goldblock
				//gravel
				//hardenedclay
					//black
					//blue
					//brown
					//cyan
					//gray
					//green
					//lightblue
					//lime
					//magenta
					//orange
					//pink
					//purple
					//red
					//silver
					//white
					//yellow
				//ice
					//packed
				//ironblock
				//lapisblock
				//netherbrick
				//netherrack
				//obsidian
				//quartzblock
				//redstoneblock
				//sand
					//red
				//sandstone

			blockDecorationSandstone_1 = new blockDecorationSandstone(Material.rock).setBlockName("blockDecorationSandstone_1");
			
			GameRegistry.registerBlock(blockDecorationSandstone_1, "blockDecorationSandstone_1");
			
				//soulsand
				//sponge
				//stone
					//slab
				//stonebrick
					//carved
					//cracked
					//mossy
				//wool
					//black
					//blue
					//brown
					//cyan
					//gray
					//green
					//lightblue
					//lime
					//magenta
					//orange
					//pink
					//purple
					//red
					//silver
					//white
					//yellow
				//other
			blockDecorationTnt_1 = new blockDecorationTnt(Material.rock).setBlockName("blockDecorationTnt_1");
			
			GameRegistry.registerBlock(blockDecorationTnt_1, "blockDecorationTnt_1");
			
			/*
			blockLambda = new BlockBasic(Material.iron).setBlockName("blockLambda");
			
			GameRegistry.registerBlock(blockLambda, "blockLambda");
			*/
			
			//furniture 
			blockFurnitureKitchenWorktopA = new BlockFurnitureKitchenWorktopA(new TileEntityFurnitureKitchenWorktopA(), 0).setBlockName("blockFurnitureKitchenWortopA");
			
			GameRegistry.registerBlock(blockFurnitureKitchenWorktopA, "blockFurnitureKitchenWortopA");

		}			
			
		}