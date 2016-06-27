package fr.bentur_and_bertatruck.bandb_mod.common.loader;

import cpw.mods.fml.common.registry.GameRegistry;
import fr.bentur_and_bertatruck.bandb_mod.common.lists.ListGenerationDesertPlant;
import fr.bentur_and_bertatruck.bandb_mod.common.lists.ListGenerationDesertPalmTree;
import fr.bentur_and_bertatruck.bandb_mod.common.lists.ListGenerationForestMushroom;
import fr.bentur_and_bertatruck.bandb_mod.common.lists.ListGenerationForestPlant;
import fr.bentur_and_bertatruck.bandb_mod.common.lists.ListGenerationForestTree;
import fr.bentur_and_bertatruck.bandb_mod.common.lists.ListGenerationForestTreeApple;
import fr.bentur_and_bertatruck.bandb_mod.common.lists.ListGenerationForestTreeHigh;
import fr.bentur_and_bertatruck.bandb_mod.common.lists.ListGenerationJunglePalmTree;
import fr.bentur_and_bertatruck.bandb_mod.common.lists.ListGenerationJungleTree;
import fr.bentur_and_bertatruck.bandb_mod.common.lists.ListGenerationPlainPlant;
import fr.bentur_and_bertatruck.bandb_mod.nature.worldGeneration.GlobalWorldGenerationDesert;
import fr.bentur_and_bertatruck.bandb_mod.nature.worldGeneration.GlobalWorldGenerationForest;
import fr.bentur_and_bertatruck.bandb_mod.nature.worldGeneration.GlobalWorldGenerationJungle;
import fr.bentur_and_bertatruck.bandb_mod.nature.worldGeneration.GlobalWorldGenerationPlains;
import fr.bentur_and_bertatruck.bandb_mod.nature.worldGeneration.GlobaleWorldGeneration;

public class BandbWorldGeneration {
	
	public BandbWorldGeneration(){
		
	}
	
	public static void init(){
		
		//desert tree
		ListGenerationDesertPalmTree.add(BandbBlocks.blockDateLeaves, BandbBlocks.blockDateWood);
		ListGenerationDesertPalmTree.add(BandbBlocks.blockCoconutLeaves, BandbBlocks.blockCoconutWood);
		
		//desert plant
		ListGenerationDesertPlant.add(BandbBlocks.blockBetterCactus);
		ListGenerationDesertPlant.add(BandbBlocks.blockPeyote);
		ListGenerationDesertPlant.add(BandbBlocks.blockAgave);
		
		//forest tree apple
		ListGenerationForestTreeApple.add(BandbBlocks.blockCrabappleLeaves, BandbBlocks.blockCrabappleWood);
		ListGenerationForestTreeApple.add(BandbBlocks.blockAppleAntaresLeaves, BandbBlocks.blockAppleAntaresWood);
		ListGenerationForestTreeApple.add(BandbBlocks.blockAppleArianeLeaves, BandbBlocks.blockAppleArianeWood);
		ListGenerationForestTreeApple.add(BandbBlocks.blockAppleBelchardChantecierLeaves, BandbBlocks.blockAppleBelchardChantecierWood);
		ListGenerationForestTreeApple.add(BandbBlocks.blockAppleBelleDeBoskoopLeaves, BandbBlocks.blockAppleBelleDeBoskoopWood);
		
		ListGenerationForestTreeApple.add(BandbBlocks.blockAppleBelleDeBoskoopLeaves, BandbBlocks.blockAppleBelleDeBoskoopWood);
		ListGenerationForestTreeApple.add(BandbBlocks.blockAppleBraeburnLeaves, BandbBlocks.blockAppleBraeburnWood);
		ListGenerationForestTreeApple.add(BandbBlocks.blockAppleElstarLeaves, BandbBlocks.blockAppleElstarWood);
		ListGenerationForestTreeApple.add(BandbBlocks.blockAppleFujiLeaves, BandbBlocks.blockAppleFujiWood);
		ListGenerationForestTreeApple.add(BandbBlocks.blockAppleGalaLeaves, BandbBlocks.blockAppleGalaWood);
		
		ListGenerationForestTreeApple.add(BandbBlocks.blockAppleGoldenLeaves, BandbBlocks.blockAppleGoldenWood);
		ListGenerationForestTreeApple.add(BandbBlocks.blockAppleGrannySmithLeaves, BandbBlocks.blockAppleGrannySmithWood);
		ListGenerationForestTreeApple.add(BandbBlocks.blockAppleHoneycrunchLeaves, BandbBlocks.blockAppleHoneycrunchWood);
		ListGenerationForestTreeApple.add(BandbBlocks.blockAppleJazzLeaves, BandbBlocks.blockAppleJazzWood);
		ListGenerationForestTreeApple.add(BandbBlocks.blockAppleJonagoldJonagoredLeaves, BandbBlocks.blockAppleJonagoldJonagoredWood);
		
		ListGenerationForestTreeApple.add(BandbBlocks.blockAppleLesRougesLeaves, BandbBlocks.blockAppleLesRougesWood);
		ListGenerationForestTreeApple.add(BandbBlocks.blockApplePinkLadyLeaves, BandbBlocks.blockApplePinkLadyWood);
		ListGenerationForestTreeApple.add(BandbBlocks.blockApplePommeLimousinLeaves, BandbBlocks.blockApplePommeLimousinWood);
		ListGenerationForestTreeApple.add(BandbBlocks.blockAppleReineDesReinettesLeaves, BandbBlocks.blockAppleReineDesReinettesWood);
		ListGenerationForestTreeApple.add(BandbBlocks.blockAppleReinetteGriseDuCanadaLeaves, BandbBlocks.blockAppleReinetteGriseDuCanadaWood);
		
		ListGenerationForestTreeApple.add(BandbBlocks.blockAppleTentationLeaves, BandbBlocks.blockAppleTentationWood);
		
		//forest tree
		ListGenerationForestTree.add(BandbBlocks.blockAlmondLeaves, BandbBlocks.blockAlmondWood);
		ListGenerationForestTree.add(BandbBlocks.blockAmlaLeaves, BandbBlocks.blockAmlaWood);
		ListGenerationForestTree.add(BandbBlocks.blockAniseLeaves, BandbBlocks.blockAniseWood);
		ListGenerationForestTree.add(BandbBlocks.blockApricotLeaves, BandbBlocks.blockApricotWood);
		ListGenerationForestTree.add(BandbBlocks.blockAvocadoLeaves, BandbBlocks.blockAvocadoWood);

		ListGenerationForestTree.add(BandbBlocks.blockBreadNutLeaves, BandbBlocks.blockBreadNutWood);
		ListGenerationForestTree.add(BandbBlocks.blockCashewLeaves, BandbBlocks.blockCashewWood);
		ListGenerationForestTree.add(BandbBlocks.blockCherryLeaves, BandbBlocks.blockCherryWood);
		ListGenerationForestTree.add(BandbBlocks.blockChestnutLeaves, BandbBlocks.blockChestnutWood);
		ListGenerationForestTree.add(BandbBlocks.blockClementineLeaves, BandbBlocks.blockClementineWood);

		ListGenerationForestTree.add(BandbBlocks.blockFigLeaves, BandbBlocks.blockFigWood);
		ListGenerationForestTree.add(BandbBlocks.blockGrapefruitLeaves, BandbBlocks.blockGrapefruitWood);
		ListGenerationForestTree.add(BandbBlocks.blockJujubeLeaves, BandbBlocks.blockJujubeWood);
		ListGenerationForestTree.add(BandbBlocks.blockKiwiLeaves, BandbBlocks.blockKiwiWood);
		ListGenerationForestTree.add(BandbBlocks.blockLemonLeaves, BandbBlocks.blockLemonWood);

		ListGenerationForestTree.add(BandbBlocks.blockLimeLeaves, BandbBlocks.blockLimeWood);
		ListGenerationForestTree.add(BandbBlocks.blockMirabelleLeaves, BandbBlocks.blockMirabelleWood);
		ListGenerationForestTree.add(BandbBlocks.blockNectarineLeaves, BandbBlocks.blockNectarineWood);
		ListGenerationForestTree.add(BandbBlocks.blockNutsLeaves, BandbBlocks.blockNutsWood);
		ListGenerationForestTree.add(BandbBlocks.blockOliveLeaves, BandbBlocks.blockOliveWood);

		ListGenerationForestTree.add(BandbBlocks.blockOrangeLeaves, BandbBlocks.blockOrangeWood);
		ListGenerationForestTree.add(BandbBlocks.blockPeachLeaves, BandbBlocks.blockPeachWood);
		ListGenerationForestTree.add(BandbBlocks.blockPearLeaves, BandbBlocks.blockPearWood);
		ListGenerationForestTree.add(BandbBlocks.blockPersimmonLeaves, BandbBlocks.blockPersimmonWood);
		ListGenerationForestTree.add(BandbBlocks.blockPistachioLeaves, BandbBlocks.blockPistachioWood);

		ListGenerationForestTree.add(BandbBlocks.blockPlumLeaves, BandbBlocks.blockPlumWood);
		ListGenerationForestTree.add(BandbBlocks.blockStarAniseLeaves, BandbBlocks.blockStarAniseWood);
		ListGenerationForestTree.add(BandbBlocks.blockTangerineLeaves, BandbBlocks.blockTangerineWood);
		ListGenerationForestTree.add(BandbBlocks.blockVanillaLeaves, BandbBlocks.blockVanillaWood);
		ListGenerationForestTree.add(BandbBlocks.blockWalnutLeaves, BandbBlocks.blockWalnutWood);

		ListGenerationForestTree.add(BandbBlocks.blockAllspiceLeaves, BandbBlocks.blockAllspiceWood);
		ListGenerationForestTree.add(BandbBlocks.blockBaelLeaves, BandbBlocks.blockBaelWood);
		ListGenerationForestTree.add(BandbBlocks.blockBlackCherryLeaves, BandbBlocks.blockBlackCherryWood);
		ListGenerationForestTree.add(BandbBlocks.blockBlackthornLeaves, BandbBlocks.blockBlackthornWood);
		ListGenerationForestTree.add(BandbBlocks.blockBrazilNutLeaves, BandbBlocks.blockBrazilNutWood);
		
		ListGenerationForestTree.add(BandbBlocks.blockButternutLeaves, BandbBlocks.blockButternutWood);
		ListGenerationForestTree.add(BandbBlocks.blockCinnamonLeaves, BandbBlocks.blockCinnamonWood);
		ListGenerationForestTree.add(BandbBlocks.blockCloveLeaves, BandbBlocks.blockCloveWood);
		ListGenerationForestTree.add(BandbBlocks.blockDamsonPlumLeaves, BandbBlocks.blockDamsonPlumWood);
		ListGenerationForestTree.add(BandbBlocks.blockElderberryLeaves, BandbBlocks.blockElderberryWood);

		ListGenerationForestTree.add(BandbBlocks.blockLaurelLeaves, BandbBlocks.blockLaurelWood);
		ListGenerationForestTree.add(BandbBlocks.blockMacadamiaLeaves, BandbBlocks.blockMacadamiaWood);
		ListGenerationForestTree.add(BandbBlocks.blockSatsumaLeaves, BandbBlocks.blockSatsumaWood);
		ListGenerationForestTree.add(BandbBlocks.blockBloodOrangeLeaves, BandbBlocks.blockBloodOrangeWood);
		ListGenerationForestTree.add(BandbBlocks.blockWhitePeachLeaves, BandbBlocks.blockWhitePeachWood);

		ListGenerationForestTree.add(BandbBlocks.blockMorelloCherryLeaves, BandbBlocks.blockMorelloCherryWood);
		ListGenerationForestTree.add(BandbBlocks.blockGrapefruitPinkLeaves, BandbBlocks.blockGrapefruitPinkWood);
		ListGenerationForestTree.add(BandbBlocks.blockLeavesAbiu, BandbBlocks.blockAbiuWood);
		ListGenerationForestTree.add(BandbBlocks.blockLonganLeaves, BandbBlocks.blockLonganWood);
		ListGenerationForestTree.add(BandbBlocks.blockLoquatLeaves, BandbBlocks.blockLoquatWood);

		ListGenerationForestTree.add(BandbBlocks.blockNutmegLeaves, BandbBlocks.blockNutmegWood);
		ListGenerationForestTree.add(BandbBlocks.blockTonkaBeanLeaves, BandbBlocks.blockTonkaBeanWood);
		ListGenerationForestTree.add(BandbBlocks.blockMapleLeaves, BandbBlocks.blockMapleWood);
		ListGenerationForestTree.add(BandbBlocks.blockPlaneLeaves, BandbBlocks.blockPlaneWood);
		ListGenerationForestTree.add(BandbBlocks.blockBerLeaves, BandbBlocks.blockBerWood);

		ListGenerationForestTree.add(BandbBlocks.blockCurryLeaves, BandbBlocks.blockCurryWood);
		ListGenerationForestTree.add(BandbBlocks.blockBunyaNutLeaves, BandbBlocks.blockBunyaNutWood);
		ListGenerationForestTree.add(BandbBlocks.blockGingkoNutLeaves, BandbBlocks.blockGingkoNutWood);
		ListGenerationForestTree.add(BandbBlocks.blockHuckleberriesLeaves, BandbBlocks.blockHuckleberriesWood);
		ListGenerationForestTree.add(BandbBlocks.blockJackFruitLeaves, BandbBlocks.blockJackFruitWood);

		ListGenerationForestTree.add(BandbBlocks.blockMameySapoteLeaves, BandbBlocks.blockMameySapoteWood);
		ListGenerationForestTree.add(BandbBlocks.blockMangosteenLeaves, BandbBlocks.blockMangosteenWood);
		ListGenerationForestTree.add(BandbBlocks.blockOhiaAiLeaves, BandbBlocks.blockOhiaAiWood);
		ListGenerationForestTree.add(BandbBlocks.blockOsageOrangeLeaves, BandbBlocks.blockOsageOrangeWood);
		ListGenerationForestTree.add(BandbBlocks.blockParadiseNutLeaves, BandbBlocks.blockParadiseNutWood);

		ListGenerationForestTree.add(BandbBlocks.blockPineNutLeaves, BandbBlocks.blockPineNutWood);
		ListGenerationForestTree.add(BandbBlocks.blockSapodillaLeaves, BandbBlocks.blockSapodillaWood);
		ListGenerationForestTree.add(BandbBlocks.blockSoursopLeaves, BandbBlocks.blockSoursopWood);
		ListGenerationForestTree.add(BandbBlocks.blockTamarilloLeaves, BandbBlocks.blockTamarilloWood);
		ListGenerationForestTree.add(BandbBlocks.blockLeavesCinchona, BandbBlocks.blockWoodCinchona);
		
		//forest tree high
		ListGenerationForestTreeHigh.add(BandbBlocks.blockAlmondLeaves, BandbBlocks.blockAlmondWood);

		//forest mushroom
		ListGenerationForestMushroom.add(BandbBlocks.blockAmanitaMuscaria);
		ListGenerationForestMushroom.add(BandbBlocks.blockCep);
		ListGenerationForestMushroom.add(BandbBlocks.blockHornOfPlenty);
		ListGenerationForestMushroom.add(BandbBlocks.blockHydnumRepandum);
		ListGenerationForestMushroom.add(BandbBlocks.blockMorel);
		
		//forest plant
		ListGenerationForestPlant.add(BandbBlocks.blockMint);
		
		//plain plant
		ListGenerationPlainPlant.add(BandbBlocks.blockRape);
		ListGenerationPlainPlant.add(BandbBlocks.blockMint);
		ListGenerationPlainPlant.add(BandbBlocks.blockDaisy);
		ListGenerationPlainPlant.add(BandbBlocks.blockSesame);
		ListGenerationPlainPlant.add(BandbBlocks.blockOrchid);

		ListGenerationPlainPlant.add(BandbBlocks.blockLicorice);
		ListGenerationPlainPlant.add(BandbBlocks.blockHibiscus);
		ListGenerationPlainPlant.add(BandbBlocks.blockJasmine);
		ListGenerationPlainPlant.add(BandbBlocks.blockLavender);
		ListGenerationPlainPlant.add(BandbBlocks.blockRosmary);
		
		ListGenerationPlainPlant.add(BandbBlocks.blockTarragon);
		ListGenerationPlainPlant.add(BandbBlocks.blockAmaryllisPink);
		ListGenerationPlainPlant.add(BandbBlocks.blockAmaryllisRed);
		ListGenerationPlainPlant.add(BandbBlocks.blockAmaryllisWhite);
		ListGenerationPlainPlant.add(BandbBlocks.blockBachelorsButtonBlue);

		ListGenerationPlainPlant.add(BandbBlocks.blockBelladonna);
		ListGenerationPlainPlant.add(BandbBlocks.blockBlowball);
		ListGenerationPlainPlant.add(BandbBlocks.blockButtercup);
		ListGenerationPlainPlant.add(BandbBlocks.blockCallaBlack);
		ListGenerationPlainPlant.add(BandbBlocks.blockCallaWhite);

		ListGenerationPlainPlant.add(BandbBlocks.blockChrysantheme);
		ListGenerationPlainPlant.add(BandbBlocks.blockEnzian);
		ListGenerationPlainPlant.add(BandbBlocks.blockFoxglove);
		ListGenerationPlainPlant.add(BandbBlocks.blockHeather);
		ListGenerationPlainPlant.add(BandbBlocks.blockIrisBlue);
		
		ListGenerationPlainPlant.add(BandbBlocks.blockIrisPurple);
		ListGenerationPlainPlant.add(BandbBlocks.blockLily);
		ListGenerationPlainPlant.add(BandbBlocks.blockMarshMarigold);
		ListGenerationPlainPlant.add(BandbBlocks.blockPansy);
		ListGenerationPlainPlant.add(BandbBlocks.blockPeony);
	
		ListGenerationPlainPlant.add(BandbBlocks.blockSyringa);
		ListGenerationPlainPlant.add(BandbBlocks.blockViolet);
		ListGenerationPlainPlant.add(BandbBlocks.blockBluebell);
		ListGenerationPlainPlant.add(BandbBlocks.blockNettle);
		ListGenerationPlainPlant.add(BandbBlocks.blockGardenia);
		
		ListGenerationPlainPlant.add(BandbBlocks.blockDill);
		ListGenerationPlainPlant.add(BandbBlocks.blockThistle);
		ListGenerationPlainPlant.add(BandbBlocks.blockChervil);
		ListGenerationPlainPlant.add(BandbBlocks.blockChives);
		ListGenerationPlainPlant.add(BandbBlocks.blockFennel);
		
		ListGenerationPlainPlant.add(BandbBlocks.blockGentian);
		ListGenerationPlainPlant.add(BandbBlocks.blockOregano);
		ListGenerationPlainPlant.add(BandbBlocks.blockSage);
		ListGenerationPlainPlant.add(BandbBlocks.blockThyme);
		ListGenerationPlainPlant.add(BandbBlocks.blockWatercress);

		ListGenerationPlainPlant.add(BandbBlocks.blockWormwood);

		//jungle palm tree
		ListGenerationJunglePalmTree.add(BandbBlocks.blockAfricanLeaves, BandbBlocks.blockAfricanWood);
		ListGenerationJunglePalmTree.add(BandbBlocks.blockBananaLeaves, BandbBlocks.blockBananaWood);
		ListGenerationJunglePalmTree.add(BandbBlocks.blockPlantainLeaves, BandbBlocks.blockPlantainWood);
		ListGenerationJunglePalmTree.add(BandbBlocks.blockRedBananaLeaves, BandbBlocks.blockRedBananaWood);

		//jungle tree
		ListGenerationJungleTree.add(BandbBlocks.blockCacaoLeaves, BandbBlocks.blockCacaoWood);
		ListGenerationJungleTree.add(BandbBlocks.blockDragonfruitLeaves, BandbBlocks.blockDragonfruitWood);
		ListGenerationJungleTree.add(BandbBlocks.blockGuavaLeaves, BandbBlocks.blockGuavaWood);
		ListGenerationJungleTree.add(BandbBlocks.blockKumquatLeaves, BandbBlocks.blockKumquatWood);
		ListGenerationJungleTree.add(BandbBlocks.blockLycheeLeaves, BandbBlocks.blockLycheeWood);

		ListGenerationJungleTree.add(BandbBlocks.blockMangoLeaves, BandbBlocks.blockMangoWood);
		ListGenerationJungleTree.add(BandbBlocks.blockPapayaLeaves, BandbBlocks.blockPapayaWood);
		ListGenerationJungleTree.add(BandbBlocks.blockPassionfruitLeaves, BandbBlocks.blockPassionfruitWood);
		ListGenerationJungleTree.add(BandbBlocks.blockPomegranateLeaves, BandbBlocks.blockPomegranateWood);
		ListGenerationJungleTree.add(BandbBlocks.blockQuinceLeaves, BandbBlocks.blockQuinceWood);
		
		ListGenerationJungleTree.add(BandbBlocks.blockPomeloLeaves, BandbBlocks.blockPomeloWood);
		
		
		
		GlobalWorldGenerationDesert generationDesert = new GlobalWorldGenerationDesert();
		GlobalWorldGenerationForest generationForest = new GlobalWorldGenerationForest();
		GlobalWorldGenerationJungle generationJungle = new GlobalWorldGenerationJungle();
		GlobalWorldGenerationPlains generationPlains = new GlobalWorldGenerationPlains();
		GlobaleWorldGeneration generationWorld = new GlobaleWorldGeneration();
		
		GameRegistry.registerWorldGenerator(generationDesert, 0);
		GameRegistry.registerWorldGenerator(generationForest, 0);
		GameRegistry.registerWorldGenerator(generationJungle, 0);
		GameRegistry.registerWorldGenerator(generationPlains, 0);
		GameRegistry.registerWorldGenerator(generationWorld, 0);
	}

}
