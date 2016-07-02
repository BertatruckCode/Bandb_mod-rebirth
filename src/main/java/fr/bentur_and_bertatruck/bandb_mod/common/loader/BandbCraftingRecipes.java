package fr.bentur_and_bertatruck.bandb_mod.common.loader;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;

public class BandbCraftingRecipes {
	
	public static void loaderRecipe(){
		
		//Shapeless crafting recipes
		//beverage empty
		GameRegistry.addShapelessRecipe(new ItemStack(BandbBeverages.itemBottleBenturCola), new ItemStack(BandbBeverages.itemBenturColaWOLabel), new ItemStack(BandbItems.itemBenturColaLabel));
		GameRegistry.addShapelessRecipe(new ItemStack(BandbBeverages.itemBottleCapCorse), new ItemStack(BandbBeverages.itemCapCorseWOLabel), new ItemStack(BandbItems.itemCapCorseLabel));
		GameRegistry.addShapelessRecipe(new ItemStack(BandbBeverages.itemBottleBrandy), new ItemStack(BandbBeverages.itemBrandyWOLabel), new ItemStack(BandbItems.itemBrandyLabel));
		GameRegistry.addShapelessRecipe(new ItemStack(BandbBeverages.itemBottleCalvados), new ItemStack(BandbBeverages.itemCalvadosWOLabel), new ItemStack(BandbItems.itemCalvadosLabel));
		GameRegistry.addShapelessRecipe(new ItemStack(BandbBeverages.itemBottleVinegar), new ItemStack(BandbBeverages.itemVinegarWOLabel), new ItemStack(BandbItems.itemVinegarLabel));

		GameRegistry.addShapelessRecipe(new ItemStack(BandbBeverages.itemBottleCiderKerne), new ItemStack(BandbBeverages.itemCiderKerneWOLabel), new ItemStack(BandbItems.itemCiderLabel));
		GameRegistry.addShapelessRecipe(new ItemStack(BandbBeverages.itemBottleCognac), new ItemStack(BandbBeverages.itemCognacWOLabel), new ItemStack(BandbItems.itemCognacLabel));
		GameRegistry.addShapelessRecipe(new ItemStack(BandbBeverages.itemBottleGin), new ItemStack(BandbBeverages.itemGinWOLabel), new ItemStack(BandbItems.itemGinLabel));
		GameRegistry.addShapelessRecipe(new ItemStack(BandbBeverages.itemBottleLambig), new ItemStack(BandbBeverages.itemLambigWOLabel), new ItemStack(BandbItems.itemLambigLabel));
		GameRegistry.addShapelessRecipe(new ItemStack(BandbBeverages.itemBottlePastis51), new ItemStack(BandbBeverages.itemWhiteMartiniWOLabel), new ItemStack(BandbItems.itemPastis51Label));

		GameRegistry.addShapelessRecipe(new ItemStack(BandbBeverages.itemBottleChouchen), new ItemStack(BandbBeverages.itemWhiteMartiniWOLabel), new ItemStack(BandbItems.itemChouchenLabel));
		GameRegistry.addShapelessRecipe(new ItemStack(BandbBeverages.itemBottlePerrier), new ItemStack(BandbBeverages.itemPerrierWOLabel), new ItemStack(BandbItems.itemPerrierLabel));
		GameRegistry.addShapelessRecipe(new ItemStack(BandbBeverages.itemBottlePommeau), new ItemStack(BandbBeverages.itemPommeauWOLabel), new ItemStack(BandbItems.itemPommeauLabel));
		GameRegistry.addShapelessRecipe(new ItemStack(BandbBeverages.itemBottleRedMartini), new ItemStack(BandbBeverages.itemRedMartiniWOLabel), new ItemStack(BandbItems.itemRedMartiniLabel));
		GameRegistry.addShapelessRecipe(new ItemStack(BandbBeverages.itemBottleRedPort), new ItemStack(BandbBeverages.itemRedPortWOLabel), new ItemStack(BandbItems.itemRedPortLabel));

		GameRegistry.addShapelessRecipe(new ItemStack(BandbBeverages.itemBottleRum), new ItemStack(BandbBeverages.itemRumWOLabel), new ItemStack(BandbItems.itemRumLabel));
		GameRegistry.addShapelessRecipe(new ItemStack(BandbBeverages.itemBottleTequila), new ItemStack(BandbBeverages.itemTequilaWOLabel), new ItemStack(BandbItems.itemTequilaLabel));
		GameRegistry.addShapelessRecipe(new ItemStack(BandbBeverages.itemBottleVodka), new ItemStack(BandbBeverages.itemVodkaWOLabel), new ItemStack(BandbItems.itemVodkaLabel));
		GameRegistry.addShapelessRecipe(new ItemStack(BandbBeverages.itemBottleWhiskey), new ItemStack(BandbBeverages.itemVinegarWOLabel), new ItemStack(BandbItems.itemWhiskeyLabel));
		GameRegistry.addShapelessRecipe(new ItemStack(BandbBeverages.itemBottleWhiteMartini), new ItemStack(BandbBeverages.itemWhiteMartiniWOLabel), new ItemStack(BandbItems.itemWhiteMartiniLabel));

		GameRegistry.addShapelessRecipe(new ItemStack(BandbBeverages.itemBottleWhitePort), new ItemStack(BandbBeverages.itemWhitePortWOLabel), new ItemStack(BandbItems.itemWhitePortLabel));
		
		//wood to plank 
		GameRegistry.addShapelessRecipe(new ItemStack(BandbBlocks.blockPlankAfrican ,4), new ItemStack(BandbBlocks.blockAfricanWood));
		GameRegistry.addShapelessRecipe(new ItemStack(BandbBlocks.blockPlankAlmond,4), new ItemStack(BandbBlocks.blockAlmondWood));
		GameRegistry.addShapelessRecipe(new ItemStack(BandbBlocks.blockPlankAmla ,4), new ItemStack(BandbBlocks.blockAmlaWood));
		GameRegistry.addShapelessRecipe(new ItemStack(BandbBlocks.blockPlankAnise ,4), new ItemStack(BandbBlocks.blockAniseWood));
		GameRegistry.addShapelessRecipe(new ItemStack(BandbBlocks.blockPlankApricot ,4), new ItemStack(BandbBlocks.blockApricotWood));
		GameRegistry.addShapelessRecipe(new ItemStack(BandbBlocks.blockPlankAvocado ,4), new ItemStack(BandbBlocks.blockAvocadoWood));
		GameRegistry.addShapelessRecipe(new ItemStack(BandbBlocks.blockPlankBanana ,4), new ItemStack(BandbBlocks.blockBananaWood));
		GameRegistry.addShapelessRecipe(new ItemStack(BandbBlocks.blockPlankBreadnut ,4), new ItemStack(BandbBlocks.blockBreadNutWood));
		GameRegistry.addShapelessRecipe(new ItemStack(BandbBlocks.blockPlankCacao ,4), new ItemStack(BandbBlocks.blockCacaoWood));
		GameRegistry.addShapelessRecipe(new ItemStack(BandbBlocks.blockPlankCashew ,4), new ItemStack(BandbBlocks.blockCashewWood));
		GameRegistry.addShapelessRecipe(new ItemStack(BandbBlocks.blockPlankCherry ,4), new ItemStack(BandbBlocks.blockCherryWood));
		GameRegistry.addShapelessRecipe(new ItemStack(BandbBlocks.blockPlankChestnut ,4), new ItemStack(BandbBlocks.blockChestnutWood));						
		GameRegistry.addShapelessRecipe(new ItemStack(BandbBlocks.blockPlankClementine ,4), new ItemStack(BandbBlocks.blockClementineWood));
		GameRegistry.addShapelessRecipe(new ItemStack(BandbBlocks.blockPlankCoconut ,4), new ItemStack(BandbBlocks.blockCoconutWood));
		GameRegistry.addShapelessRecipe(new ItemStack(BandbBlocks.blockPlankDate ,4), new ItemStack(BandbBlocks.blockDateWood));
		GameRegistry.addShapelessRecipe(new ItemStack(BandbBlocks.blockPlankDragonfruit ,4), new ItemStack(BandbBlocks.blockDragonfruitWood));
		GameRegistry.addShapelessRecipe(new ItemStack(BandbBlocks.blockPlankFig ,4), new ItemStack(BandbBlocks.blockFigWood));
		GameRegistry.addShapelessRecipe(new ItemStack(BandbBlocks.blockPlankGrapefruit ,4), new ItemStack(BandbBlocks.blockGrapefruitWood));
		GameRegistry.addShapelessRecipe(new ItemStack(BandbBlocks.blockPlankGuava ,4), new ItemStack(BandbBlocks.blockGuavaWood));
		GameRegistry.addShapelessRecipe(new ItemStack(BandbBlocks.blockPlankJujube ,4), new ItemStack(BandbBlocks.blockJujubeWood));
		GameRegistry.addShapelessRecipe(new ItemStack(BandbBlocks.blockPlankKiwi ,4), new ItemStack(BandbBlocks.blockKiwiWood));
		GameRegistry.addShapelessRecipe(new ItemStack(BandbBlocks.blockPlankKumquat ,4), new ItemStack(BandbBlocks.blockKumquatWood));			
		GameRegistry.addShapelessRecipe(new ItemStack(BandbBlocks.blockPlankLemon ,4), new ItemStack(BandbBlocks.blockLemonWood));
		GameRegistry.addShapelessRecipe(new ItemStack(BandbBlocks.blockPlankLime ,4), new ItemStack(BandbBlocks.blockLimeWood));
		GameRegistry.addShapelessRecipe(new ItemStack(BandbBlocks.blockPlankLychee ,4), new ItemStack(BandbBlocks.blockLycheeWood));
		GameRegistry.addShapelessRecipe(new ItemStack(BandbBlocks.blockPlankMango ,4), new ItemStack(BandbBlocks.blockMangoWood));
		GameRegistry.addShapelessRecipe(new ItemStack(BandbBlocks.blockPlankMirabelle ,4), new ItemStack(BandbBlocks.blockMirabelleWood));
		GameRegistry.addShapelessRecipe(new ItemStack(BandbBlocks.blockPlankNectarine ,4), new ItemStack(BandbBlocks.blockNectarineWood));			
		GameRegistry.addShapelessRecipe(new ItemStack(BandbBlocks.blockPlankNuts ,4), new ItemStack(BandbBlocks.blockNutsWood));
		GameRegistry.addShapelessRecipe(new ItemStack(BandbBlocks.blockPlankOlive ,4), new ItemStack(BandbBlocks.blockOliveWood));	
		GameRegistry.addShapelessRecipe(new ItemStack(BandbBlocks.blockPlankOrange ,4), new ItemStack(BandbBlocks.blockOrangeWood));
		GameRegistry.addShapelessRecipe(new ItemStack(BandbBlocks.blockPlankPapaya ,4), new ItemStack(BandbBlocks.blockPapayaWood));
		GameRegistry.addShapelessRecipe(new ItemStack(BandbBlocks.blockPlankPassionfruit ,4), new ItemStack(BandbBlocks.blockPassionfruitWood));
		GameRegistry.addShapelessRecipe(new ItemStack(BandbBlocks.blockPlankPeach ,4), new ItemStack(BandbBlocks.blockPeachWood));
		GameRegistry.addShapelessRecipe(new ItemStack(BandbBlocks.blockPlankPear ,4), new ItemStack(BandbBlocks.blockPearWood));
		GameRegistry.addShapelessRecipe(new ItemStack(BandbBlocks.blockPlankPersimmon ,4), new ItemStack(BandbBlocks.blockPersimmonWood));
		GameRegistry.addShapelessRecipe(new ItemStack(BandbBlocks.blockPlankPistachio ,4), new ItemStack(BandbBlocks.blockPistachioWood));
		GameRegistry.addShapelessRecipe(new ItemStack(BandbBlocks.blockPlankPlum ,4), new ItemStack(BandbBlocks.blockPlumWood));
		GameRegistry.addShapelessRecipe(new ItemStack(BandbBlocks.blockPlankPomegranate ,4), new ItemStack(BandbBlocks.blockPomegranateWood));
		GameRegistry.addShapelessRecipe(new ItemStack(BandbBlocks.blockPlankQuince ,4), new ItemStack(BandbBlocks.blockQuinceWood));
		GameRegistry.addShapelessRecipe(new ItemStack(BandbBlocks.blockPlankStarAnise ,4), new ItemStack(BandbBlocks.blockStarAniseWood));
		GameRegistry.addShapelessRecipe(new ItemStack(BandbBlocks.blockPlankTangerine ,4), new ItemStack(BandbBlocks.blockTangerineWood));
		GameRegistry.addShapelessRecipe(new ItemStack(BandbBlocks.blockPlankVanilla ,4), new ItemStack(BandbBlocks.blockVanillaWood));
		GameRegistry.addShapelessRecipe(new ItemStack(BandbBlocks.blockPlankWalnut ,4), new ItemStack(BandbBlocks.blockWalnutWood));
		GameRegistry.addShapelessRecipe(new ItemStack(BandbBlocks.blockPlankAbiu ,4), new ItemStack(BandbBlocks.blockAbiuWood));
		GameRegistry.addShapelessRecipe(new ItemStack(BandbBlocks.blockPlankAllspice ,4), new ItemStack(BandbBlocks.blockAllspiceWood));
		GameRegistry.addShapelessRecipe(new ItemStack(BandbBlocks.blockPlankBael ,4), new ItemStack(BandbBlocks.blockBaelWood));
		GameRegistry.addShapelessRecipe(new ItemStack(BandbBlocks.blockPlankBlackCherry ,4), new ItemStack(BandbBlocks.blockBlackCherryWood));
		GameRegistry.addShapelessRecipe(new ItemStack(BandbBlocks.blockPlankBlackthorn ,4), new ItemStack(BandbBlocks.blockBlackthornWood));
		GameRegistry.addShapelessRecipe(new ItemStack(BandbBlocks.blockPlankBloodOrange ,4), new ItemStack(BandbBlocks.blockBloodOrangeWood));
		GameRegistry.addShapelessRecipe(new ItemStack(BandbBlocks.blockPlankBrazilNut ,4), new ItemStack(BandbBlocks.blockBrazilNutWood));
		GameRegistry.addShapelessRecipe(new ItemStack(BandbBlocks.blockPlankButternut ,4), new ItemStack(BandbBlocks.blockButternutWood));
		GameRegistry.addShapelessRecipe(new ItemStack(BandbBlocks.blockPlankCinnamon ,4), new ItemStack(BandbBlocks.blockCinnamonWood));
		GameRegistry.addShapelessRecipe(new ItemStack(BandbBlocks.blockPlankClove ,4), new ItemStack(BandbBlocks.blockCloveWood));
		GameRegistry.addShapelessRecipe(new ItemStack(BandbBlocks.blockPlankDamsonPlum ,4), new ItemStack(BandbBlocks.blockDamsonPlumWood));
		GameRegistry.addShapelessRecipe(new ItemStack(BandbBlocks.blockPlankElderberry ,4), new ItemStack(BandbBlocks.blockElderberryWood));
		GameRegistry.addShapelessRecipe(new ItemStack(BandbBlocks.blockPlankLaurel ,4), new ItemStack(BandbBlocks.blockLaurelWood));
		GameRegistry.addShapelessRecipe(new ItemStack(BandbBlocks.blockPlankLongan ,4), new ItemStack(BandbBlocks.blockLonganWood));
		GameRegistry.addShapelessRecipe(new ItemStack(BandbBlocks.blockPlankLoquat ,4), new ItemStack(BandbBlocks.blockLoquatWood));
		GameRegistry.addShapelessRecipe(new ItemStack(BandbBlocks.blockPlankMacadamia ,4), new ItemStack(BandbBlocks.blockMacadamiaWood));
		GameRegistry.addShapelessRecipe(new ItemStack(BandbBlocks.blockPlankMorelloCherry ,4), new ItemStack(BandbBlocks.blockMorelloCherryWood));
		GameRegistry.addShapelessRecipe(new ItemStack(BandbBlocks.blockPlankNutmeg ,4), new ItemStack(BandbBlocks.blockNutmegWood));
		GameRegistry.addShapelessRecipe(new ItemStack(BandbBlocks.blockPlankPlane ,4), new ItemStack(BandbBlocks.blockPlaneWood));
		GameRegistry.addShapelessRecipe(new ItemStack(BandbBlocks.blockPlankPlantain ,4), new ItemStack(BandbBlocks.blockPlantainWood));
		GameRegistry.addShapelessRecipe(new ItemStack(BandbBlocks.blockplankPomelo ,4), new ItemStack(BandbBlocks.blockPomeloWood));
		GameRegistry.addShapelessRecipe(new ItemStack(BandbBlocks.blockPlankSatsuma ,4), new ItemStack(BandbBlocks.blockSatsumaWood));
		GameRegistry.addShapelessRecipe(new ItemStack(BandbBlocks.blockPlankTonkaBean ,4), new ItemStack(BandbBlocks.blockTonkaBeanWood));
		GameRegistry.addShapelessRecipe(new ItemStack(BandbBlocks.blockPlankWhitePeach ,4), new ItemStack(BandbBlocks.blockWhitePeachWood));
		GameRegistry.addShapelessRecipe(new ItemStack(BandbBlocks.blockPlankGrapefruitPink ,4), new ItemStack(BandbBlocks.blockGrapefruitPinkWood));
		GameRegistry.addShapelessRecipe(new ItemStack(BandbBlocks.blockPlankMaple ,4), new ItemStack(BandbBlocks.blockMapleWood));
		GameRegistry.addShapelessRecipe(new ItemStack(BandbBlocks.blockPlankBer ,4), new ItemStack(BandbBlocks.blockBerWood));
		GameRegistry.addShapelessRecipe(new ItemStack(BandbBlocks.blockPlankCurry ,4), new ItemStack(BandbBlocks.blockCurryWood));
		GameRegistry.addShapelessRecipe(new ItemStack(BandbBlocks.blockPlankRedBanana ,4), new ItemStack(BandbBlocks.blockRedBananaWood));
		GameRegistry.addShapelessRecipe(new ItemStack(BandbBlocks.blockPlankBunyaNut ,4), new ItemStack(BandbBlocks.blockBunyaNutWood));
		GameRegistry.addShapelessRecipe(new ItemStack(BandbBlocks.blockPlankGingkoNut ,4), new ItemStack(BandbBlocks.blockGingkoNutWood));
		GameRegistry.addShapelessRecipe(new ItemStack(BandbBlocks.blockPlankHuckleberries ,4), new ItemStack(BandbBlocks.blockHuckleberriesWood));
		GameRegistry.addShapelessRecipe(new ItemStack(BandbBlocks.blockPlankJackFruit ,4), new ItemStack(BandbBlocks.blockJackFruitWood));
		GameRegistry.addShapelessRecipe(new ItemStack(BandbBlocks.blockPlankMameySapote ,4), new ItemStack(BandbBlocks.blockMameySapoteWood));
		GameRegistry.addShapelessRecipe(new ItemStack(BandbBlocks.blockPlankMangosteen ,4), new ItemStack(BandbBlocks.blockMangosteenWood));
		GameRegistry.addShapelessRecipe(new ItemStack(BandbBlocks.blockPlankOhiaAi ,4), new ItemStack(BandbBlocks.blockOhiaAiWood));
		GameRegistry.addShapelessRecipe(new ItemStack(BandbBlocks.blockPlankOsageOrange ,4), new ItemStack(BandbBlocks.blockOsageOrangeWood));
		GameRegistry.addShapelessRecipe(new ItemStack(BandbBlocks.blockPlankParadiseNut ,4), new ItemStack(BandbBlocks.blockParadiseNutWood));
		GameRegistry.addShapelessRecipe(new ItemStack(BandbBlocks.blockPlankPineNut ,4), new ItemStack(BandbBlocks.blockPineNutWood));
		GameRegistry.addShapelessRecipe(new ItemStack(BandbBlocks.blockPlankSapodilla ,4), new ItemStack(BandbBlocks.blockSapodillaWood));
		GameRegistry.addShapelessRecipe(new ItemStack(BandbBlocks.blockPlankSoursop ,4), new ItemStack(BandbBlocks.blockSoursopWood));
		GameRegistry.addShapelessRecipe(new ItemStack(BandbBlocks.blockPlankTamarillo ,4), new ItemStack(BandbBlocks.blockTamarilloWood));
		GameRegistry.addShapelessRecipe(new ItemStack(BandbBlocks.blockPlankCinchona ,4), new ItemStack(BandbBlocks.blockWoodCinchona));

		GameRegistry.addShapelessRecipe(new ItemStack(BandbBlocks.blockPlankCrabapple ,4), new ItemStack(BandbBlocks.blockCrabappleWood));
		GameRegistry.addShapelessRecipe(new ItemStack(BandbBlocks.blockPlankAppleAntares ,4), new ItemStack(BandbBlocks.blockAppleAntaresWood));
		GameRegistry.addShapelessRecipe(new ItemStack(BandbBlocks.blockPlankAppleAriane ,4), new ItemStack(BandbBlocks.blockAppleArianeWood));
		GameRegistry.addShapelessRecipe(new ItemStack(BandbBlocks.blockPlankAppleBelchardChancelier ,4), new ItemStack(BandbBlocks.blockAppleBelchardChantecierWood));
		GameRegistry.addShapelessRecipe(new ItemStack(BandbBlocks.blockPlankAppleBelleDeBoskoop ,4), new ItemStack(BandbBlocks.blockAppleBelleDeBoskoopWood));
		GameRegistry.addShapelessRecipe(new ItemStack(BandbBlocks.blockPlankAppleBraeburn ,4), new ItemStack(BandbBlocks.blockAppleBraeburnWood));
		GameRegistry.addShapelessRecipe(new ItemStack(BandbBlocks.blockPlankAppleElstar ,4), new ItemStack(BandbBlocks.blockAppleElstarWood));
		GameRegistry.addShapelessRecipe(new ItemStack(BandbBlocks.blockPlankAppleFuji ,4), new ItemStack(BandbBlocks.blockAppleFujiWood));
		GameRegistry.addShapelessRecipe(new ItemStack(BandbBlocks.blockPlankAppleGala ,4), new ItemStack(BandbBlocks.blockAppleGalaWood));
		GameRegistry.addShapelessRecipe(new ItemStack(BandbBlocks.blockPlankAppleGolden ,4), new ItemStack(BandbBlocks.blockAppleGoldenWood));		
		GameRegistry.addShapelessRecipe(new ItemStack(BandbBlocks.blockPlankAppleGrannySmith ,4), new ItemStack(BandbBlocks.blockAppleGrannySmithWood));
		GameRegistry.addShapelessRecipe(new ItemStack(BandbBlocks.blockPlankAppleHoneyCrunch ,4), new ItemStack(BandbBlocks.blockAppleHoneycrunchWood));
		GameRegistry.addShapelessRecipe(new ItemStack(BandbBlocks.blockPlankAppleJazz ,4), new ItemStack(BandbBlocks.blockAppleJazzWood));
		GameRegistry.addShapelessRecipe(new ItemStack(BandbBlocks.blockPlankAppleJonagoldJonagored ,4), new ItemStack(BandbBlocks.blockAppleJonagoldJonagoredWood));
		GameRegistry.addShapelessRecipe(new ItemStack(BandbBlocks.blockPlankAppleLesRouges ,4), new ItemStack(BandbBlocks.blockAppleLesRougesWood));
		GameRegistry.addShapelessRecipe(new ItemStack(BandbBlocks.blockPlankApplePinkLady ,4), new ItemStack(BandbBlocks.blockApplePinkLadyWood));
		GameRegistry.addShapelessRecipe(new ItemStack(BandbBlocks.blockPlankApplePommeLimousin ,4), new ItemStack(BandbBlocks.blockApplePommeLimousinWood));
		GameRegistry.addShapelessRecipe(new ItemStack(BandbBlocks.BlockPlankAppleReineDesReinettes ,4), new ItemStack(BandbBlocks.blockAppleReineDesReinettesWood));
		GameRegistry.addShapelessRecipe(new ItemStack(BandbBlocks.blockPlankAppleReinetteGriseDuCanada ,4), new ItemStack(BandbBlocks.blockAppleReinetteGriseDuCanadaWood));
		GameRegistry.addShapelessRecipe(new ItemStack(BandbBlocks.blockPlankAppleTentation ,4), new ItemStack(BandbBlocks.blockAppleTentationWood));		
		
	
		GameRegistry.addShapelessRecipe(new ItemStack(BandbItems.itemChickenLegRaw ,2), new ItemStack(BandbItems.itemChickenFullRaw));								
		GameRegistry.addShapelessRecipe(new ItemStack(BandbItems.itemNuggetAluminium ,9), new ItemStack(BandbItems.itemIngotAluminium));								
		GameRegistry.addShapelessRecipe(new ItemStack(BandbItems.itemNuggetAmethyst ,9), new ItemStack(BandbItems.itemAmethyst));								
		GameRegistry.addShapelessRecipe(new ItemStack(BandbItems.itemNuggetJade ,9), new ItemStack(BandbItems.itemJade));																
		GameRegistry.addShapelessRecipe(new ItemStack(BandbItems.itemNuggetOnyx ,9), new ItemStack(BandbItems.itemOnyx));								
		GameRegistry.addShapelessRecipe(new ItemStack(BandbItems.itemNuggetPlatinum ,9), new ItemStack(BandbItems.itemIngotPlatinum));								
		GameRegistry.addShapelessRecipe(new ItemStack(BandbItems.itemNuggetRuby ,9), new ItemStack(BandbItems.itemRuby));
		GameRegistry.addShapelessRecipe(new ItemStack(BandbItems.itemNuggetSapphire ,9), new ItemStack(BandbItems.itemSapphire));										
		
		GameRegistry.addShapelessRecipe(new ItemStack(BandbItems.itemCurry ,1), new ItemStack(BandbItems.itemCurryLeafDried));
		
		GameRegistry.addShapelessRecipe(new ItemStack(BandbItems.itemSesameSeed ,2), new ItemStack(BandbItems.itemSesame));
		GameRegistry.addShapelessRecipe(new ItemStack(BandbItems.itemSesameSeed ,2), new ItemStack(BandbBlocks.blockSesame));
		
		GameRegistry.addShapelessRecipe(new ItemStack(BandbBlocks.blockRape ,1), new ItemStack(BandbItems.itemRape));
		GameRegistry.addShapelessRecipe(new ItemStack(BandbBlocks.blockBetterCactus ,1), new ItemStack(BandbItems.itemBetterCactus));
		GameRegistry.addShapelessRecipe(new ItemStack(BandbBlocks.blockDaisy ,1), new ItemStack(BandbItems.itemDaisy));
		GameRegistry.addShapelessRecipe(new ItemStack(BandbBlocks.blockOrchid ,1), new ItemStack(BandbItems.itemOrchid));
		GameRegistry.addShapelessRecipe(new ItemStack(BandbBlocks.blockSesame ,1), new ItemStack(BandbItems.itemSesame));
		GameRegistry.addShapelessRecipe(new ItemStack(BandbBlocks.blockLicorice ,1), new ItemStack(BandbItems.itemLicorice));
		GameRegistry.addShapelessRecipe(new ItemStack(BandbBlocks.blockHibiscus ,1), new ItemStack(BandbItems.itemHibiscus));
		GameRegistry.addShapelessRecipe(new ItemStack(BandbBlocks.blockJasmine ,1), new ItemStack(BandbItems.itemJasmine));
		GameRegistry.addShapelessRecipe(new ItemStack(BandbBlocks.blockLavender ,1), new ItemStack(BandbItems.itemLavender));
		GameRegistry.addShapelessRecipe(new ItemStack(BandbBlocks.blockRosmary ,1), new ItemStack(BandbItems.itemRosmary));
		GameRegistry.addShapelessRecipe(new ItemStack(BandbBlocks.blockTarragon ,1), new ItemStack(BandbItems.itemTarragon));
		GameRegistry.addShapelessRecipe(new ItemStack(BandbBlocks.blockAgave ,1), new ItemStack(BandbItems.itemAgave));
		GameRegistry.addShapelessRecipe(new ItemStack(BandbBlocks.blockAmaryllisPink ,1), new ItemStack(BandbItems.itemAmaryllisPink));
		GameRegistry.addShapelessRecipe(new ItemStack(BandbBlocks.blockAmaryllisRed ,1), new ItemStack(BandbItems.itemAmaryllisRed));
		GameRegistry.addShapelessRecipe(new ItemStack(BandbBlocks.blockAmaryllisWhite ,1), new ItemStack(BandbItems.itemAmaryllisWhite));
		GameRegistry.addShapelessRecipe(new ItemStack(BandbBlocks.blockBachelorsButtonBlue ,1), new ItemStack(BandbItems.itemBachelorsButtonBlue));
		GameRegistry.addShapelessRecipe(new ItemStack(BandbBlocks.blockBelladonna ,1), new ItemStack(BandbItems.itemBelladonna));
		GameRegistry.addShapelessRecipe(new ItemStack(BandbBlocks.blockBlowball ,1), new ItemStack(BandbItems.itemBlowball));
		GameRegistry.addShapelessRecipe(new ItemStack(BandbBlocks.blockButtercup ,1), new ItemStack(BandbItems.itemButtercup));
		GameRegistry.addShapelessRecipe(new ItemStack(BandbBlocks.blockCallaBlack ,1), new ItemStack(BandbItems.itemCallaBlack));
		GameRegistry.addShapelessRecipe(new ItemStack(BandbBlocks.blockCallaWhite ,1), new ItemStack(BandbItems.itemCallaWhite));
		GameRegistry.addShapelessRecipe(new ItemStack(BandbBlocks.blockChrysantheme ,1), new ItemStack(BandbItems.itemChrysantheme));
		GameRegistry.addShapelessRecipe(new ItemStack(BandbBlocks.blockEnzian ,1), new ItemStack(BandbItems.itemEnzian));
		GameRegistry.addShapelessRecipe(new ItemStack(BandbBlocks.blockFoxglove ,1), new ItemStack(BandbItems.itemFoxglove));
		GameRegistry.addShapelessRecipe(new ItemStack(BandbBlocks.blockHeather ,1), new ItemStack(BandbItems.itemHeather));
		GameRegistry.addShapelessRecipe(new ItemStack(BandbBlocks.blockIrisBlue ,1), new ItemStack(BandbItems.itemIrisBlue));
		GameRegistry.addShapelessRecipe(new ItemStack(BandbBlocks.blockIrisPurple ,1), new ItemStack(BandbItems.itemIrisPurple));
		GameRegistry.addShapelessRecipe(new ItemStack(BandbBlocks.blockLily ,1), new ItemStack(BandbItems.itemLily));
		GameRegistry.addShapelessRecipe(new ItemStack(BandbBlocks.blockMarshMarigold ,1), new ItemStack(BandbItems.itemMarshMarigold));
		GameRegistry.addShapelessRecipe(new ItemStack(BandbBlocks.blockPansy ,1), new ItemStack(BandbItems.itemPansy));
		GameRegistry.addShapelessRecipe(new ItemStack(BandbBlocks.blockPeony ,1), new ItemStack(BandbItems.itemPeony));
		GameRegistry.addShapelessRecipe(new ItemStack(BandbBlocks.blockSyringa ,1), new ItemStack(BandbItems.itemSyringa));
		GameRegistry.addShapelessRecipe(new ItemStack(BandbBlocks.blockViolet ,1), new ItemStack(BandbItems.itemViolet));
		GameRegistry.addShapelessRecipe(new ItemStack(BandbBlocks.blockBluebell ,1), new ItemStack(BandbItems.itemBluebell));
		GameRegistry.addShapelessRecipe(new ItemStack(BandbBlocks.blockDill ,1), new ItemStack(BandbItems.itemDill));
		GameRegistry.addShapelessRecipe(new ItemStack(BandbBlocks.blockGardenia ,1), new ItemStack(BandbItems.itemGardenia));
		GameRegistry.addShapelessRecipe(new ItemStack(BandbBlocks.blockNettle ,1), new ItemStack(BandbItems.itemNettle));
		GameRegistry.addShapelessRecipe(new ItemStack(BandbBlocks.blockThistle ,1), new ItemStack(BandbItems.itemThistle));
		GameRegistry.addShapelessRecipe(new ItemStack(BandbBlocks.blockChervil ,1), new ItemStack(BandbItems.itemChervil));
		GameRegistry.addShapelessRecipe(new ItemStack(BandbBlocks.blockChives ,1), new ItemStack(BandbItems.itemChives));
		GameRegistry.addShapelessRecipe(new ItemStack(BandbBlocks.blockFennel ,1), new ItemStack(BandbItems.itemFennel));
		GameRegistry.addShapelessRecipe(new ItemStack(BandbBlocks.blockGentian ,1), new ItemStack(BandbItems.itemGentian));
		GameRegistry.addShapelessRecipe(new ItemStack(BandbBlocks.blockOregano ,1), new ItemStack(BandbItems.itemOregano));
		GameRegistry.addShapelessRecipe(new ItemStack(BandbBlocks.blockSage ,1), new ItemStack(BandbItems.itemSage));
		GameRegistry.addShapelessRecipe(new ItemStack(BandbBlocks.blockThyme ,1), new ItemStack(BandbItems.itemThyme));
		GameRegistry.addShapelessRecipe(new ItemStack(BandbBlocks.blockWatercress ,1), new ItemStack(BandbItems.itemWatercress));
		GameRegistry.addShapelessRecipe(new ItemStack(BandbBlocks.blockWormwood ,1), new ItemStack(BandbItems.itemWormwood));
	
		GameRegistry.addShapelessRecipe(new ItemStack(Items.dye, 2, 11), new ItemStack(BandbItems.itemRape));
		GameRegistry.addShapelessRecipe(new ItemStack(Items.dye, 2, 2), new ItemStack(BandbItems.itemBetterCactus));
		GameRegistry.addShapelessRecipe(new ItemStack(BandbItems.itemWhiteDye), new ItemStack(BandbItems.itemDaisy));
		GameRegistry.addShapelessRecipe(new ItemStack(Items.dye, 2, 6), new ItemStack(BandbItems.itemOrchid));
		GameRegistry.addShapelessRecipe(new ItemStack(Items.dye, 2, 1), new ItemStack(BandbItems.itemHibiscus));
		GameRegistry.addShapelessRecipe(new ItemStack(BandbItems.itemWhiteDye), new ItemStack(BandbItems.itemJasmine));
		GameRegistry.addShapelessRecipe(new ItemStack(BandbItems.itemWhiteDye), new ItemStack(BandbItems.itemBlowball));
		GameRegistry.addShapelessRecipe(new ItemStack(Items.dye, 2, 5), new ItemStack(BandbItems.itemViolet));
		GameRegistry.addShapelessRecipe(new ItemStack(Items.dye, 2, 6), new ItemStack(BandbItems.itemBachelorsButtonBlue));
		GameRegistry.addShapelessRecipe(new ItemStack(Items.dye, 2, 9), new ItemStack(BandbItems.itemPeony));
		GameRegistry.addShapelessRecipe(new ItemStack(BandbItems.itemBlueDye), new ItemStack(BandbItems.itemIrisBlue));
		GameRegistry.addShapelessRecipe(new ItemStack(Items.dye, 2, 13), new ItemStack(BandbItems.itemLavender));
		GameRegistry.addShapelessRecipe(new ItemStack(Items.dye, 2, 13), new ItemStack(BandbItems.itemLily));
		GameRegistry.addShapelessRecipe(new ItemStack(Items.dye, 2, 11), new ItemStack(BandbItems.itemChrysantheme));
		GameRegistry.addShapelessRecipe(new ItemStack(BandbItems.itemWhiteDye), new ItemStack(BandbItems.itemAmaryllisWhite));
		GameRegistry.addShapelessRecipe(new ItemStack(Items.dye, 2, 9), new ItemStack(BandbItems.itemHeather));
		GameRegistry.addShapelessRecipe(new ItemStack(Items.dye, 2, 5), new ItemStack(BandbItems.itemSyringa));
		GameRegistry.addShapelessRecipe(new ItemStack(BandbItems.itemBlackDye), new ItemStack(BandbItems.itemCallaBlack));
		GameRegistry.addShapelessRecipe(new ItemStack(BandbItems.itemBlueDye), new ItemStack(BandbItems.itemEnzian));
		GameRegistry.addShapelessRecipe(new ItemStack(Items.dye, 2, 14), new ItemStack(BandbItems.itemFoxglove));
		GameRegistry.addShapelessRecipe(new ItemStack(BandbItems.itemWhiteDye), new ItemStack(BandbItems.itemCallaWhite));
		GameRegistry.addShapelessRecipe(new ItemStack(BandbItems.itemBlueDye), new ItemStack(BandbItems.itemBelladonna));
		GameRegistry.addShapelessRecipe(new ItemStack(Items.dye, 2, 9), new ItemStack(BandbItems.itemAmaryllisPink));
		GameRegistry.addShapelessRecipe(new ItemStack(Items.dye, 2, 5), new ItemStack(BandbItems.itemIrisPurple));
		GameRegistry.addShapelessRecipe(new ItemStack(Items.dye, 2, 1), new ItemStack(BandbItems.itemAmaryllisRed));
		GameRegistry.addShapelessRecipe(new ItemStack(BandbItems.itemBlackDye), new ItemStack(BandbItems.itemPansy));
		GameRegistry.addShapelessRecipe(new ItemStack(Items.dye, 2, 11), new ItemStack(BandbItems.itemMarshMarigold));
		GameRegistry.addShapelessRecipe(new ItemStack(Items.dye, 2, 11), new ItemStack(BandbItems.itemButtercup));
		
		
	//Crafting recipe
			
		//Block
		GameRegistry.addRecipe(new ItemStack(BandbBlocks.blockAluminium), "XXX", "XXX", "XXX",'X', new ItemStack(BandbItems.itemIngotAluminium));
		GameRegistry.addRecipe(new ItemStack(BandbBlocks.blockAmethyst), "XXX", "XXX", "XXX",'X', new ItemStack(BandbItems.itemAmethyst));
		GameRegistry.addRecipe(new ItemStack(BandbBlocks.blockJade), "XXX", "XXX", "XXX",'X', new ItemStack(BandbItems.itemJade));
		GameRegistry.addRecipe(new ItemStack(BandbBlocks.blockOnyx), "XXX", "XXX", "XXX",'X', new ItemStack(BandbItems.itemOnyx));
		GameRegistry.addRecipe(new ItemStack(BandbBlocks.blockOpal), "XXX", "XXX", "XXX",'X', new ItemStack(BandbItems.itemOpal));
		GameRegistry.addRecipe(new ItemStack(BandbBlocks.blockPainite), "XXX", "XXX", "XXX",'X', new ItemStack(BandbItems.itemPainite));
		GameRegistry.addRecipe(new ItemStack(BandbBlocks.blockPlatinum), "XXX", "XXX", "XXX",'X', new ItemStack(BandbItems.itemIngotPlatinum));
		GameRegistry.addRecipe(new ItemStack(BandbBlocks.blockRuby), "XXX", "XXX", "XXX",'X', new ItemStack(BandbItems.itemRuby));
		GameRegistry.addRecipe(new ItemStack(BandbBlocks.blockSapphire), "XXX", "XXX", "XXX",'X', new ItemStack(BandbItems.itemSapphire));
		GameRegistry.addRecipe(new ItemStack(BandbBlocks.blockTitan), "XXX", "XXX", "XXX",'X', new ItemStack(BandbItems.itemIngotTitan));
		GameRegistry.addRecipe(new ItemStack(BandbBlocks.blockTopaz), "XXX", "XXX", "XXX",'X', new ItemStack(BandbItems.itemTopaz));
		
		//Ingot
		GameRegistry.addRecipe(new ItemStack(BandbItems.itemIngotAluminium), "XXX", "XXX", "XXX",'X', new ItemStack(BandbItems.itemNuggetAluminium));
		GameRegistry.addRecipe(new ItemStack(BandbItems.itemIngotPlatinum), "XXX", "XXX", "XXX",'X', new ItemStack(BandbItems.itemNuggetPlatinum));
	
		
		
		// Miscellaneous
		GameRegistry.addRecipe(new ItemStack(BandbItems.itemSurprise), " Y ", "ZXZ", " Y ",'X', new ItemStack(BandbItems.itemApplePommeDuLimousin),'Y', new ItemStack (BandbBeverages.itemJuiceAppleTentation), 'Z', new ItemStack (BandbItems.itemAppleGrannySmith));
		//GameRegistry.addRecipe(new ItemStack(BandbItem.itemMac), " Y ", "ZXZ", " Y ",'X', new ItemStack(Items.redstone),'Y', new ItemStack (BandbItem.itemIngotZinc), 'Z', new ItemStack(Item.getItemFromBlock(Blocks.glass)));
		//GameRegistry.addRecipe(new ItemStack(BandbItem.itemiPad), " Y ", "ZXZ", " Y ",'X', new ItemStack(Items.redstone),'Y', new ItemStack (BandbItem.itemIngotZinc), 'Z', new ItemStack(Item.getItemFromBlock(Blocks.glass)));
		GameRegistry.addRecipe(new ItemStack(BandbItems.itemBookCocktailGlass), "XXX", "XYX", "XXX",'X', new ItemStack(Items.book),'Y', new ItemStack (BandbItems.itemCocktailGlass));
		GameRegistry.addRecipe(new ItemStack(BandbItems.itemBookCocktails), "XXX", "XYX", "XXX",'X', new ItemStack(Items.book),'Y', new ItemStack (BandbItems.itemBookCocktailGlass));
		GameRegistry.addRecipe(new ItemStack(BandbItems.itemBookOldFashioned), "XXX", "XYX", "XXX",'X', new ItemStack(Items.book),'Y', new ItemStack (BandbItems.itemOldFashoned));
		GameRegistry.addRecipe(new ItemStack(BandbItems.itemBookShaker), "XXX", "XYX", "XXX",'X', new ItemStack(Items.book),'Y', new ItemStack (BandbItems.itemShaker));
		GameRegistry.addRecipe(new ItemStack(BandbItems.itemBookTumbler), "XXX", "XYX", "XXX",'X', new ItemStack(Items.book),'Y', new ItemStack (BandbItems.itemTumbler));
			
			//aluminium
			//armor
		GameRegistry.addRecipe(new ItemStack(BandbStuffs.itemHelmetAluminium), "XXX", "X X", "   ",'X', new ItemStack(BandbItems.itemIngotAluminium));
		GameRegistry.addRecipe(new ItemStack(BandbStuffs.itemHelmetAluminium), "   ", "XXX", "X X",'X', new ItemStack(BandbItems.itemIngotAluminium));

		GameRegistry.addRecipe(new ItemStack(BandbStuffs.itemChestplateAluminium), "X X", "XXX", "XXX",'X', new ItemStack(BandbItems.itemIngotAluminium));

		GameRegistry.addRecipe(new ItemStack(BandbStuffs.itemLeggingsAluminium), "XXX", "X X", "X X",'X', new ItemStack(BandbItems.itemIngotAluminium));

		GameRegistry.addRecipe(new ItemStack(BandbStuffs.itemBootsAluminium), "X X", "X X", "   ",'X', new ItemStack(BandbItems.itemIngotAluminium));
		GameRegistry.addRecipe(new ItemStack(BandbStuffs.itemBootsAluminium), "   ", "X X", "X X",'X', new ItemStack(BandbItems.itemIngotAluminium));
		
		//amethyst
				//armor
		GameRegistry.addRecipe(new ItemStack(BandbStuffs.itemHelmetAmethyst), "XXX", "X X", "   ",'X', new ItemStack(BandbItems.itemAmethyst));
		GameRegistry.addRecipe(new ItemStack(BandbStuffs.itemHelmetAmethyst), "   ", "XXX", "X X",'X', new ItemStack(BandbItems.itemAmethyst));
	
		GameRegistry.addRecipe(new ItemStack(BandbStuffs.itemChestplateAmethyst), "X X", "XXX", "XXX",'X', new ItemStack(BandbItems.itemAmethyst));
	
		GameRegistry.addRecipe(new ItemStack(BandbStuffs.itemLeggingsAmethyst), "XXX", "X X", "X X",'X', new ItemStack(BandbItems.itemAmethyst));
	
		GameRegistry.addRecipe(new ItemStack(BandbStuffs.itemBootsAmethyst), "X X", "X X", "   ",'X', new ItemStack(BandbItems.itemAmethyst));
		GameRegistry.addRecipe(new ItemStack(BandbStuffs.itemBootsAmethyst), "   ", "X X", "X X",'X', new ItemStack(BandbItems.itemAmethyst));			
		
		//emerald
				//armor
		GameRegistry.addRecipe(new ItemStack(BandbStuffs.itemHelmetEmerald), "XXX", "X X", "   ",'X', new ItemStack(Items.emerald));
		GameRegistry.addRecipe(new ItemStack(BandbStuffs.itemHelmetEmerald), "   ", "XXX", "X X",'X', new ItemStack(Items.emerald));
	
		GameRegistry.addRecipe(new ItemStack(BandbStuffs.itemChestplateEmerald), "X X", "XXX", "XXX",'X', new ItemStack(Items.emerald));
	
		GameRegistry.addRecipe(new ItemStack(BandbStuffs.itemLeggingsEmerald), "XXX", "X X", "X X",'X', new ItemStack(Items.emerald));
	
		GameRegistry.addRecipe(new ItemStack(BandbStuffs.itemBootsEmerald), "X X", "X X", "   ",'X', new ItemStack(Items.emerald));
		GameRegistry.addRecipe(new ItemStack(BandbStuffs.itemBootsEmerald), "   ", "X X", "X X",'X', new ItemStack(Items.emerald));
						
		//onyx
				//armor
		GameRegistry.addRecipe(new ItemStack(BandbStuffs.itemHelmetOnyx), "XXX", "X X", "   ",'X', new ItemStack(BandbItems.itemOnyx));
		GameRegistry.addRecipe(new ItemStack(BandbStuffs.itemHelmetOnyx), "   ", "XXX", "X X",'X', new ItemStack(BandbItems.itemOnyx));
	
		GameRegistry.addRecipe(new ItemStack(BandbStuffs.itemChestplateOnyx), "X X", "XXX", "XXX",'X', new ItemStack(BandbItems.itemOnyx));
	
		GameRegistry.addRecipe(new ItemStack(BandbStuffs.itemLeggingsOnyx), "XXX", "X X", "X X",'X', new ItemStack(BandbItems.itemOnyx));
	
		GameRegistry.addRecipe(new ItemStack(BandbStuffs.itemBootsOnyx), "X X", "X X", "   ",'X', new ItemStack(BandbItems.itemOnyx));
		GameRegistry.addRecipe(new ItemStack(BandbStuffs.itemBootsOnyx), "   ", "X X", "X X",'X', new ItemStack(BandbItems.itemOnyx));
		
		//platinum
			//armor
		GameRegistry.addRecipe(new ItemStack(BandbStuffs.itemHelmetPlatinum), "XXX", "X X", "   ",'X', new ItemStack(BandbItems.itemIngotPlatinum));
		GameRegistry.addRecipe(new ItemStack(BandbStuffs.itemHelmetPlatinum), "   ", "XXX", "X X",'X', new ItemStack(BandbItems.itemIngotPlatinum));
	
		GameRegistry.addRecipe(new ItemStack(BandbStuffs.itemChestplatePlatinum), "X X", "XXX", "XXX",'X', new ItemStack(BandbItems.itemIngotPlatinum));
	
		GameRegistry.addRecipe(new ItemStack(BandbStuffs.itemLeggingsPlatinum), "XXX", "X X", "X X",'X', new ItemStack(BandbItems.itemIngotPlatinum));
	
		GameRegistry.addRecipe(new ItemStack(BandbStuffs.itemBootsPlatinum), "X X", "X X", "   ",'X', new ItemStack(BandbItems.itemIngotPlatinum));
		GameRegistry.addRecipe(new ItemStack(BandbStuffs.itemBootsPlatinum), "   ", "X X", "X X",'X', new ItemStack(BandbItems.itemIngotPlatinum));
					
		//ruby
				//armor
		GameRegistry.addRecipe(new ItemStack(BandbStuffs.itemHelmetRuby), "XXX", "X X", "   ",'X', new ItemStack(BandbItems.itemRuby));
		GameRegistry.addRecipe(new ItemStack(BandbStuffs.itemHelmetRuby), "   ", "XXX", "X X",'X', new ItemStack(BandbItems.itemRuby));
	
		GameRegistry.addRecipe(new ItemStack(BandbStuffs.itemChestplateRuby), "X X", "XXX", "XXX",'X', new ItemStack(BandbItems.itemRuby));
	
		GameRegistry.addRecipe(new ItemStack(BandbStuffs.itemLeggingsRuby), "XXX", "X X", "X X",'X', new ItemStack(BandbItems.itemRuby));
	
		GameRegistry.addRecipe(new ItemStack(BandbStuffs.itemBootsRuby), "X X", "X X", "   ",'X', new ItemStack(BandbItems.itemRuby));
		GameRegistry.addRecipe(new ItemStack(BandbStuffs.itemBootsRuby), "   ", "X X", "X X",'X', new ItemStack(BandbItems.itemRuby));
			
		//sapphire
				//armor
		GameRegistry.addRecipe(new ItemStack(BandbStuffs.itemHelmetSapphire), "XXX", "X X", "   ",'X', new ItemStack(BandbItems.itemSapphire));
		GameRegistry.addRecipe(new ItemStack(BandbStuffs.itemHelmetSapphire), "   ", "XXX", "X X",'X', new ItemStack(BandbItems.itemSapphire));
	
		GameRegistry.addRecipe(new ItemStack(BandbStuffs.itemChestplateSapphire), "X X", "XXX", "XXX",'X', new ItemStack(BandbItems.itemSapphire));
	
		GameRegistry.addRecipe(new ItemStack(BandbStuffs.itemLeggingsSapphire), "XXX", "X X", "X X",'X', new ItemStack(BandbItems.itemSapphire));
	
		GameRegistry.addRecipe(new ItemStack(BandbStuffs.itemBootsSapphire), "X X", "X X", "   ",'X', new ItemStack(BandbItems.itemSapphire));
		GameRegistry.addRecipe(new ItemStack(BandbStuffs.itemBootsSapphire), "   ", "X X", "X X",'X', new ItemStack(BandbItems.itemSapphire));
		
	
		//titan
				//armor
		GameRegistry.addRecipe(new ItemStack(BandbStuffs.itemHelmetTitan), "XXX", "X X", "   ",'X', new ItemStack(BandbItems.itemIngotTitan));
		GameRegistry.addRecipe(new ItemStack(BandbStuffs.itemHelmetTitan), "   ", "XXX", "X X",'X', new ItemStack(BandbItems.itemIngotTitan));
	
		GameRegistry.addRecipe(new ItemStack(BandbStuffs.itemChestplateTitan), "X X", "XXX", "XXX",'X', new ItemStack(BandbItems.itemIngotTitan));
	
		GameRegistry.addRecipe(new ItemStack(BandbStuffs.itemLeggingsTitan), "XXX", "X X", "X X",'X', new ItemStack(BandbItems.itemIngotTitan));
	
		GameRegistry.addRecipe(new ItemStack(BandbStuffs.itemBootsTitan), "X X", "X X", "   ",'X', new ItemStack(BandbItems.itemIngotTitan));
		GameRegistry.addRecipe(new ItemStack(BandbStuffs.itemBootsTitan), "   ", "X X", "X X",'X', new ItemStack(BandbItems.itemIngotTitan));
				
		//painite
				//armor
		GameRegistry.addRecipe(new ItemStack(BandbStuffs.itemHelmetPainite), "XXX", "X X", "   ",'X', new ItemStack(BandbItems.itemPainite));
		GameRegistry.addRecipe(new ItemStack(BandbStuffs.itemHelmetPainite), "   ", "XXX", "X X",'X', new ItemStack(BandbItems.itemPainite));
	
		GameRegistry.addRecipe(new ItemStack(BandbStuffs.itemChestplatePainite), "X X", "XXX", "XXX",'X', new ItemStack(BandbItems.itemPainite));
	
		GameRegistry.addRecipe(new ItemStack(BandbStuffs.itemLeggingsPainite), "XXX", "X X", "X X",'X', new ItemStack(BandbItems.itemPainite));
	
		GameRegistry.addRecipe(new ItemStack(BandbStuffs.itemBootsPainite), "X X", "X X", "   ",'X', new ItemStack(BandbItems.itemPainite));
		GameRegistry.addRecipe(new ItemStack(BandbStuffs.itemBootsPainite), "   ", "X X", "X X",'X', new ItemStack(BandbItems.itemPainite));
		
				
		GameRegistry.addRecipe(new ItemStack(BandbItems.itemAmanitaMuscaria), "   ", "   ", "  Y", 'Y', new ItemStack(BandbItems.itemKnifeIron));
		
		GameRegistry.addRecipe(new ItemStack(BandbItems.itemBlueGode), " X ", " Y ", "ZZZ", 'Z', new ItemStack (Items.diamond),'Y', new ItemStack (BandbItems.itemSapphire), 'X', new ItemStack (BandbItems.itemOrchid));
		GameRegistry.addRecipe(new ItemStack(BandbItems.itemPinkGode), " X ", " Y ", "ZZZ", 'Z', new ItemStack (Items.diamond),'Y', new ItemStack (BandbItems.itemPainite), 'X', new ItemStack (BandbItems.itemAmaryllisPink));
		GameRegistry.addRecipe(new ItemStack(BandbItems.itemPurpleGode), " X ", " Y ", "ZZZ", 'Z', new ItemStack (Items.diamond),'Y', new ItemStack (BandbItems.itemAmethyst), 'X', new ItemStack (BandbItems.itemSyringa));
		GameRegistry.addRecipe(new ItemStack(BandbItems.itemRedGode), " X ", " Y ", "ZZZ", 'Z', new ItemStack (Items.diamond),'Y', new ItemStack (BandbItems.itemRuby), 'X', new ItemStack (BandbItems.itemAmaryllisRed));
		
		//Kitchen Tools
		GameRegistry.addRecipe(new ItemStack(BandbItems.itemFlyingPan), " XX", " YX", "Y  ", 'X', new ItemStack (Items.iron_ingot),'Y', new ItemStack (Items.stick));
		GameRegistry.addRecipe(new ItemStack(BandbItems.itemCheeseGrater), "X X", " X ", "X X", 'X', new ItemStack (Items.iron_ingot));
		GameRegistry.addRecipe(new ItemStack(BandbItems.itemCheeseKnife), "  X", " YX", "Y  ", 'X', new ItemStack (Items.iron_ingot),'Y', new ItemStack (Items.stick));
		GameRegistry.addRecipe(new ItemStack(BandbItems.itemCleaverIron), "XXX", " YX", "Y  ", 'X', new ItemStack (Items.iron_ingot),'Y', new ItemStack (Items.stick));
		GameRegistry.addRecipe(new ItemStack(BandbItems.itemCookieCutterCircle), " X ", "X X", " X ", 'X', new ItemStack (Items.iron_ingot));
		GameRegistry.addRecipe(new ItemStack(BandbItems.itemCookieCutterSquare), " XXX", "X X", "XXX", 'X', new ItemStack (Items.iron_ingot));
		GameRegistry.addRecipe(new ItemStack(BandbItems.itemFoforkStone), "X X", " Y ", "XYX", 'X', new ItemStack (Items.iron_ingot),'Y', new ItemStack (Items.stick));
		GameRegistry.addRecipe(new ItemStack(BandbItems.itemKnifeIron), "   ", " X ", " Y ", 'X', new ItemStack (Items.iron_ingot),'Y', new ItemStack (Items.stick));
		
		//Mug and Teapot
		GameRegistry.addRecipe(new ItemStack(BandbItems.itemMugCoffeeEmpty), "   ", " XY", "   ", 'X', new ItemStack (Items.iron_ingot),'Y', new ItemStack (BandbItems.itemNuggetPlatinum));
		GameRegistry.addRecipe(new ItemStack(BandbItems.itemMugCoffeeEmpty), " XY", "   ", "   ", 'X', new ItemStack (Items.iron_ingot),'Y', new ItemStack (BandbItems.itemNuggetPlatinum));
		GameRegistry.addRecipe(new ItemStack(BandbItems.itemMugCoffeeEmpty), "   ", "   ", "XY ", 'X', new ItemStack (Items.iron_ingot),'Y', new ItemStack (BandbItems.itemNuggetPlatinum));
		GameRegistry.addRecipe(new ItemStack(BandbItems.itemMugCoffeeEmpty), "   ", "   ", " XY", 'X', new ItemStack (Items.iron_ingot),'Y', new ItemStack (BandbItems.itemNuggetPlatinum));
		GameRegistry.addRecipe(new ItemStack(BandbItems.itemMugCoffeeEmpty), "   ", "XY ", "   ", 'X', new ItemStack (Items.iron_ingot),'Y', new ItemStack (BandbItems.itemNuggetPlatinum));
		GameRegistry.addRecipe(new ItemStack(BandbItems.itemMugCoffeeEmpty), "XY ", "   ", "   ", 'X', new ItemStack (Items.iron_ingot),'Y', new ItemStack (BandbItems.itemNuggetPlatinum));
		GameRegistry.addRecipe(new ItemStack(BandbItems.itemTeapot), "X  ", " XX", " XX", 'X', new ItemStack (Items.iron_ingot));
		//Capsules
		GameRegistry.addRecipe(new ItemStack(BandbItems.itemCapsuleArpeggioEmpty, 32), "XXX", "XYX", "XXX", 'X', new ItemStack (Items.dye,1,5),'Y', new ItemStack (BandbItems.itemIngotAluminium));
		GameRegistry.addRecipe(new ItemStack(BandbItems.itemCapsuleBukeelaKaEthiopiaEmpty, 32), "XXX", "XYZ", "ZZZ", 'X', new ItemStack (Items.dye,1,14),'Y', new ItemStack (BandbItems.itemIngotAluminium), 'Z', new ItemStack (BandbItems.itemWhiteDye));
		GameRegistry.addRecipe(new ItemStack(BandbItems.itemCapsuleCapriccioEmpty, 32), "XXX", "XYZ", "ZZZ", 'X', new ItemStack (Items.dye,1,2),'Y', new ItemStack (BandbItems.itemIngotAluminium), 'Z', new ItemStack (BandbItems.itemBlackDye));
		GameRegistry.addRecipe(new ItemStack(BandbItems.itemCapsuleCosiEmpty, 32), "XXX", "XYZ", "ZZZ", 'X', new ItemStack (Items.dye,1,1),'Y', new ItemStack (BandbItems.itemIngotAluminium), 'X', new ItemStack (Items.dye,1,2));
		GameRegistry.addRecipe(new ItemStack(BandbItems.itemCapsuleDecaffeinatoEmpty, 32), "XXX", "XYX", "XXX", 'X', new ItemStack (Items.dye,1,1),'Y', new ItemStack (BandbItems.itemIngotAluminium));
		GameRegistry.addRecipe(new ItemStack(BandbItems.itemCapsuleDecaffeinatoLungoEmpty, 32), "XXX", "XYZ", "ZZZ", 'X', new ItemStack (Items.dye,1,1),'Y', new ItemStack (BandbItems.itemIngotAluminium), 'Z', new ItemStack (BandbItems.itemWhiteDye));
		GameRegistry.addRecipe(new ItemStack(BandbItems.itemCapsuleDecaffeinatoIntensoEmpty, 32), "XXX", "XYX", "ZZZ", 'X', new ItemStack (Items.dye,1,1),'Y', new ItemStack (BandbItems.itemIngotAluminium), 'Z', new ItemStack (BandbItems.itemBlackDye));
		GameRegistry.addRecipe(new ItemStack(BandbItems.itemCapsuleDharkanEmpty, 32), "XXX", "XYX", "XXX", 'X', new ItemStack (Items.dye,1,6),'Y', new ItemStack (BandbItems.itemIngotAluminium));
		GameRegistry.addRecipe(new ItemStack(BandbItems.itemCapsuleDulsaoDoBrasilEmpty, 32), "XXX", "XYZ", "ZZZ", 'X', new ItemStack (Items.dye,1,11),'Y', new ItemStack (BandbItems.itemIngotAluminium), 'Z', new ItemStack (BandbItems.itemWhiteDye));
		GameRegistry.addRecipe(new ItemStack(BandbItems.itemCapsuleFortissioLungoEmpty, 32), "XXX", "XYZ", "ZZZ", 'X', new ItemStack (Items.dye,1,2),'Y', new ItemStack (BandbItems.itemIngotAluminium), 'Z', new ItemStack (BandbItems.itemWhiteDye));
		GameRegistry.addRecipe(new ItemStack(BandbItems.itemCapsuleIndriyaFromIndiaEmpty, 32), "XXX", "XYX", "XXX", 'X', new ItemStack (Items.dye,1,2),'Y', new ItemStack (BandbItems.itemIngotAluminium));
		GameRegistry.addRecipe(new ItemStack(BandbItems.itemCapsuleKazaarEmpty, 32), "XXX", "XYX", "XXX", 'X', new ItemStack (BandbItems.itemBlueDye),'Y', new ItemStack (BandbItems.itemIngotAluminium));
		GameRegistry.addRecipe(new ItemStack(BandbItems.itemCapsuleLinizioLungoEmpty, 32), "XXX", "XYX", "XXX", 'X', new ItemStack (Items.dye,1,14),'Y', new ItemStack (BandbItems.itemIngotAluminium));
		GameRegistry.addRecipe(new ItemStack(BandbItems.itemCapsuleLivantoEmpty, 32), "XXX", "XYX", "XXX", 'X', new ItemStack (Items.dye,1,14),'Y', new ItemStack (BandbItems.itemIngotAluminium), 'Z', new ItemStack (BandbItems.itemBlackDye));
		GameRegistry.addRecipe(new ItemStack(BandbItems.itemCapsuleRistrettoEmpty, 32), "XXX", "XYX", "XXX", 'X', new ItemStack (BandbItems.itemBlackDye),'Y', new ItemStack (BandbItems.itemIngotAluminium));
		GameRegistry.addRecipe(new ItemStack(BandbItems.itemCapsuleRomaEmpty, 32), "XXX", "XYX", "XXX", 'X', new ItemStack (Items.dye,1,7),'Y', new ItemStack (BandbItems.itemIngotAluminium));
		GameRegistry.addRecipe(new ItemStack(BandbItems.itemCapsuleRosabayaDeColombiaEmpty, 32), "XXX", "XYX", "XXX", 'X', new ItemStack (Items.dye,1,9),'Y', new ItemStack (BandbItems.itemIngotAluminium));
		GameRegistry.addRecipe(new ItemStack(BandbItems.itemCapsuleVivaltoLungoEmpty, 32), "XXX", "XYX", "XXX", 'X', new ItemStack (Items.dye,1,12),'Y', new ItemStack (BandbItems.itemIngotAluminium));
		GameRegistry.addRecipe(new ItemStack(BandbItems.itemCapsuleVollutoEmpty, 32), "XXX", "XYX", "XXX", 'X', new ItemStack (Items.dye,1,11),'Y', new ItemStack (BandbItems.itemIngotAluminium));
		
		GameRegistry.addRecipe(new ItemStack(BandbItems.itemCapsuleArpeggio, 1), "X X", " Y ", "X X", 'X', new ItemStack (BandbItems.itemCoffeeArabicasGround),'Y', new ItemStack (BandbItems.itemCapsuleArpeggioEmpty));
		GameRegistry.addRecipe(new ItemStack(BandbItems.itemCapsuleBukeelaKaEthiopia, 1), "X X", " Y ", "X X", 'X', new ItemStack (BandbItems.itemCoffeeBlueMountainGround),'Y', new ItemStack (BandbItems.itemCapsuleBukeelaKaEthiopiaEmpty));
		GameRegistry.addRecipe(new ItemStack(BandbItems.itemCapsuleCapriccio, 1), "X X", " Y ", "X X", 'X', new ItemStack (BandbItems.itemCoffeeBourbonPointuGround),'Y', new ItemStack (BandbItems.itemCapsuleCapriccioEmpty));
		GameRegistry.addRecipe(new ItemStack(BandbItems.itemCapsuleCosi, 1), "X X", " Y ", "X X", 'X', new ItemStack (BandbItems.itemCoffeeCatturaGround),'Y', new ItemStack (BandbItems.itemCapsuleCosiEmpty));
		GameRegistry.addRecipe(new ItemStack(BandbItems.itemCapsuleDecaffeinato, 1), "X X", " Y ", "X X", 'X', new ItemStack (BandbItems.itemCoffeeHarrarGround),'Y', new ItemStack (BandbItems.itemCapsuleDecaffeinatoEmpty));
		GameRegistry.addRecipe(new ItemStack(BandbItems.itemCapsuleDecaffeinatoIntenso, 1), "X X", " Y ", "X X", 'X', new ItemStack (BandbItems.itemCoffeeHuehuetenangoGround),'Y', new ItemStack (BandbItems.itemCapsuleDecaffeinatoIntensoEmpty));
		GameRegistry.addRecipe(new ItemStack(BandbItems.itemCapsuleDecaffeinatoLungo, 1), "X X", " Y ", "X X", 'X', new ItemStack (BandbItems.itemCoffeeJavaGround),'Y', new ItemStack (BandbItems.itemCapsuleDecaffeinatoLungoEmpty));
		GameRegistry.addRecipe(new ItemStack(BandbItems.itemCapsuleDharkan, 1), "X X", " Y ", "X X", 'X', new ItemStack (BandbItems.itemCoffeeKenyaAAGround),'Y', new ItemStack (BandbItems.itemCapsuleDharkanEmpty));
		GameRegistry.addRecipe(new ItemStack(BandbItems.itemCapsuleDulsaoDoBrasil, 1), "X X", " Y ", "X X", 'X', new ItemStack (BandbItems.itemCoffeeKonaGround),'Y', new ItemStack (BandbItems.itemCapsuleDulsaoDoBrasilEmpty));
		GameRegistry.addRecipe(new ItemStack(BandbItems.itemCapsuleFortissioLungo, 1), "X X", " Y ", "X X", 'X', new ItemStack (BandbItems.itemCoffeeKontirWildForestGround),'Y', new ItemStack (BandbItems.itemCapsuleFortissioLungoEmpty));
		GameRegistry.addRecipe(new ItemStack(BandbItems.itemCapsuleIndriyaFromIndia, 1), "X X", " Y ", "X X", 'X', new ItemStack (BandbItems.itemCoffeeKopiLuwakGround),'Y', new ItemStack (BandbItems.itemCapsuleIndriyaFromIndiaEmpty));
		GameRegistry.addRecipe(new ItemStack(BandbItems.itemCapsuleKazaar, 1), "X X", " Y ", "X X", 'X', new ItemStack (BandbItems.itemCoffeeKupeAlamidGround),'Y', new ItemStack (BandbItems.itemCapsuleKazaarEmpty));
		GameRegistry.addRecipe(new ItemStack(BandbItems.itemCapsuleLinizioLungo, 1), "X X", " Y ", "X X", 'X', new ItemStack (BandbItems.itemCoffeeMokaGround),'Y', new ItemStack (BandbItems.itemCapsuleLinizioLungoEmpty));
		GameRegistry.addRecipe(new ItemStack(BandbItems.itemCapsuleLivanto, 1), "X X", " Y ", "X X", 'X', new ItemStack (BandbItems.itemCoffeeMundoNovoGround),'Y', new ItemStack (BandbItems.itemCapsuleLivantoEmpty));
		GameRegistry.addRecipe(new ItemStack(BandbItems.itemCapsuleRistretto, 1), "X X", " Y ", "X X", 'X', new ItemStack (BandbItems.itemCoffeeMuragogypeGround),'Y', new ItemStack (BandbItems.itemCapsuleRistrettoEmpty));
		GameRegistry.addRecipe(new ItemStack(BandbItems.itemCapsuleRoma, 1), "X X", " Y ", "X X", 'X', new ItemStack (BandbItems.itemCoffeePeaberryGround),'Y', new ItemStack (BandbItems.itemCapsuleRomaEmpty));
		GameRegistry.addRecipe(new ItemStack(BandbItems.itemCapsuleRosabayaDeColombia, 1), "X X", " Y ", "X X", 'X', new ItemStack (BandbItems.itemCoffeeTarrazuGround),'Y', new ItemStack (BandbItems.itemCapsuleRosabayaDeColombiaEmpty));
		GameRegistry.addRecipe(new ItemStack(BandbItems.itemCapsuleVivaltoLungo, 1), "X X", " Y ", "X X", 'X', new ItemStack (BandbItems.itemCoffeeTorajaKalossiGround),'Y', new ItemStack (BandbItems.itemCapsuleVivaltoLungoEmpty));
		GameRegistry.addRecipe(new ItemStack(BandbItems.itemCapsuleVolluto, 1), "X X", " Y ", "X X", 'X', new ItemStack (BandbItems.itemCoffeeYirgacheffeGround),'Y', new ItemStack (BandbItems.itemCapsuleVollutoEmpty));
		
		
		//Guy
		
		/*
		GameRegistry.addRecipe(new ItemStack(BandbItems.itemTeapot), 
				new Object[] {"STT", "UVW", "XYZ",
				'S', TFItems.ingotCopper,
				'T', TFItems.ingotLead,
				'U', new ItemStack (BandbItems.itemPowerCoilMithril),
				'V', BandbItems.itemTeapot,
				'W', new ItemStack (Blocks.iron_block),
				'X', new ItemStack (BandbItems.itemPneumaticServoPainite),
				'Y', new ItemStack (Items.redstone),
				'Z', new ItemStack (BandbItems.itemBattery)});
		/*
		GameRegistry.addRecipe(new ItemStack(BandbItem.itemTeapot), new Object[] { "AAH", "BGF","CDE" 
				, 'A' , TFItems.ingotCopper
				, 'B' , TFItems.ingotLead
				, 'C' , new ItemStack (BandbItem.itemPowerCoilMithril)
				, 'D' , new ItemStack (BandbItem.itemPneumaticServoPainite)
				, 'E' , new ItemStack (Blocks.iron_block)
				, 'F' , new ItemStack (Items.redstone)
				, 'G' , new ItemStack (BandbItem.itemBattery)


		});
		/*
		GameRegistry.addRecipe(new ItemStack(Bandb_mod.blockPrinter), "STT", "UVW", "XYZ",'S', (Items.gold_ingot),'T', (Items.diamond),'U', new ItemStack (BandbItem.itemPowerCoilAmethyst),'V', (TFBlocks.blockFluidAerotheum),'W', new ItemStack (BandbBlock.blockOpal),'X', new ItemStack (BandbItem.itemPneumaticServoZinc),'Y', new ItemStack (Items.redstone),'Z', new ItemStack (BandbItem.itemGearNatrium));
		GameRegistry.addRecipe(new ItemStack(Bandb_mod.blockPress), "STT", "UVW", "XYZ",'S', (TFItems.ingotTin),'T', (TFItems.ingotSilver),'U', new ItemStack (BandbItem.itemPowerCoilAluminium),'V', (TFBlocks.blockFluidCoal),'W', new ItemStack (BandbBlock.blockPlatinum),'X', new ItemStack (BandbItem.itemPneumaticServoRuby),'Y', new ItemStack (Items.redstone),'Z', new ItemStack (BandbItem.itemGearSteel));
		GameRegistry.addRecipe(new ItemStack(Bandb_mod.blockOvenIdle), "STT", "UVW", "XYZ",'S', (TFItems.ingotElectrum),'T', (TFItems.ingotBronze),'U', new ItemStack (BandbItem.itemPowerCoilNickel),'V', (TFBlocks.blockFluidCryotheum),'W', new ItemStack (BandbBlock.blockTopaz),'X', new ItemStack (BandbItem.itemPneumaticServoTopaz),'Y', new ItemStack (Items.glowstone_dust),'Z', new ItemStack (BandbItem.itemGearTungsten));
		 */
		//Other
		GameRegistry.addRecipe(new ItemStack(BandbItems.itemCottonCandySugar), "XXX", "XYX", "XXX", 'X', new ItemStack(Items.dye,1,13),'Y', new ItemStack (Items.sugar));
		
	}
	
	public static void loaderFurnaceRecipe(){
		GameRegistry.addSmelting(BandbItems.itemZebraRaw, new ItemStack(BandbItems.itemZebraCooked, 1), 0.5F);
		GameRegistry.addSmelting(BandbItems.itemGoatRaw, new ItemStack(BandbItems.itemGoatCooked, 1), 0.5F);
		GameRegistry.addSmelting(BandbItems.itemGoatRaw, new ItemStack(BandbItems.itemGoatCooked, 1), 0.5F);
		GameRegistry.addSmelting(BandbItems.itemGoatRaw, new ItemStack(BandbItems.itemGoatCooked, 1), 0.5F);
		GameRegistry.addSmelting(BandbItems.itemGoatRaw, new ItemStack(BandbItems.itemGoatCooked, 1), 0.5F);
		GameRegistry.addSmelting(BandbItems.itemGoatRaw, new ItemStack(BandbItems.itemGoatCooked, 1), 0.5F);
		GameRegistry.addSmelting(BandbItems.itemGoatRaw, new ItemStack(BandbItems.itemGoatCooked, 1), 0.5F);
		GameRegistry.addSmelting(BandbItems.itemGoatRaw, new ItemStack(BandbItems.itemGoatCooked, 1), 0.5F);
		GameRegistry.addSmelting(BandbItems.itemGoatRaw, new ItemStack(BandbItems.itemGoatCooked, 1), 0.5F);
		GameRegistry.addSmelting(BandbItems.itemGoatRaw, new ItemStack(BandbItems.itemGoatCooked, 1), 0.5F);
		GameRegistry.addSmelting(BandbItems.itemGoatRaw, new ItemStack(BandbItems.itemGoatCooked, 1), 0.5F);
		
	}


}
