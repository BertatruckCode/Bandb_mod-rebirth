package fr.bentur_and_bertatruck.bandb_mod.common.loader;

import cpw.mods.fml.common.registry.GameRegistry;
import fr.bentur_and_bertatruck.bandb_mod.common.Bandb_mod;
import fr.bentur_and_bertatruck.bandb_mod.common.item.ItemBeverageAlcohol;
import fr.bentur_and_bertatruck.bandb_mod.common.item.ItemBeverageAlcoholStrong;
import fr.bentur_and_bertatruck.bandb_mod.common.item.ItemBeverageBrandy;
import fr.bentur_and_bertatruck.bandb_mod.common.item.ItemBeverageFruitJuice;
import fr.bentur_and_bertatruck.bandb_mod.common.item.ItemBeverageGrape;
import fr.bentur_and_bertatruck.bandb_mod.common.item.ItemBeverageLiqueur;
import fr.bentur_and_bertatruck.bandb_mod.common.item.ItemBeverageRum;
import fr.bentur_and_bertatruck.bandb_mod.common.item.ItemBeverageSweet;
import fr.bentur_and_bertatruck.bandb_mod.common.item.ItemBeverageVodka;
import fr.bentur_and_bertatruck.bandb_mod.common.item.ItemBottle;
import fr.bentur_and_bertatruck.bandb_mod.common.item.ItemBottleWOLabel;
import net.minecraft.item.Item;

public class BandbBeverages {
	
	//items beverage
			//Alcohol
			public static Item itemBeverageCapCorse, itemBeverageWhitePort, itemBeverageBordeauxChateauLary, itemBeverageBordeauxChateauTourVerite, itemBeverageBrownRum;
			public static Item itemBeverageCalvados, itemBeverageChouchen,itemBeverageCiderKerne,itemBeverageCognac,itemBeverageGin;
			public static Item itemBeverageLambig,itemBeveragePastis51,itemBeverageWhiteRum,itemBeveragePommeau,itemBeverageRedMartini;
			public static Item itemBeverageRedPort,itemBeverageTequila,itemBeverageVodka,itemBeverageWhiskey,itemBeverageWhiteMartini;
			public static Item itemBeveragePetrus,itemBeverageAmaretto, itemBeverageBitter, itemBeverageBlueCuracao, itemBeverageCuracaoTripleSec,itemBeverageAngosturaBitter;
			public static Item itemBeverageBenedictine,itemBeverageWorcestershireSauce,itemBeverageTabasco,itemBeverageDubonnetRouge;
			public static Item itemBeveragePontarlier,itemBeverageCampari,itemBeverageHeineken,itemBeverageGrandMarnier,itemBeverageChartreuseJaune;
			public static Item itemBeverageChartreuseVerte,itemBeverageCuracaoOrange,itemBeverageDrambuie,itemBeverageBaileys,itemBeverageXeres;
			public static Item itemBeveragePisco,itemBeverageFernetBranca,itemBeverageChampagneMumm,itemBeverageGuinness,itemBeverageBourgogneAligote;
			public static Item itemBeverageAlsaceRiesling,itemBeverageEnate,itemBeverageSouthernComfort,itemBeverageGet27;
			public static Item itemBeverage1664,itemBeverageBritt,itemBeverageDesperados,itemBeverageDuvel,itemBeverageGrimbergen;
			public static Item itemBeverageLeffe,itemBeverageSanMiguel,itemBeverageSkoll,itemBeverageSmirnoff,itemBeverageXII;			
			//Without Alcohol
			public static Item itemPerrier,itemBenturCola,itemFleurOranger,itemLimonade,itemSchweppesTonic;
			public static Item itemSchweppesGingerAle,itemSchweppesAgrum,itemSchweppesDarkSide,itemSchweppesLemon,itemSchweppesMango;
			public static Item itemSchweppesPamplemousse,itemSchweppesPassion,itemSchweppesPech,itemSchweppesPomme,itemSchweppesRicqles;
			public static Item itemBeverageSchweppesRaisin;
			
			//Brandy
			public static Item itemBrandyApple, itemBrandyApricot,itemBananaBrandy,itemBrandyBlackberry,itemBrandyBlackcurrant;
			public static Item itemBrandyBlueberry,itemBrandyCherry,itemBrandyClementine,itemBrandyCoconut,itemBrandyCranberry;
			public static Item itemBrandyCurrant,itemBrandyGoyava,itemBrandyGrapefruit,itemBrandyKiwi,itemBrandyLemon;
			public static Item itemBrandyLime,itemBrandyLychee,itemBrandyMango,itemBrandyMirabelle,itemBrandyOrange;
			public static Item itemBrandyPeach,itemBrandyPear,itemBrandyPineapple,itemBrandyPlum,itemBrandyRaspberry;
			public static Item itemBrandyStrawsberry,itemBrandyTangerine;
			
			//Liqueur
			public static Item itemLiqueurApricot,itemLiqueurBanana,itemLiqueurCherry,itemLiqueurClementine;
			public static Item itemLiqueurFig,itemLiqueurGuava,itemLiqueurLemon,itemLiqueurLime,itemLiqueurLychee;
			public static Item itemLiqueurPassionFruit,itemLiqueurPomegranate,itemLiqueurQuince,itemLiqueurTangerine,itemLiqueurMango;
			public static Item itemLiqueurCherryPlum,itemLiqueurApple,itemLiqueurOrange,itemLiqueurGrapefruit,itemLiqueurPeach;
			public static Item itemLiqueurStrawberry,itemLiqueurBlackberry,itemLiqueurBlueberry,itemLiqueurRaspberry,itemLiqueurBlackcurrant;
			public static Item itemLiqueurPlum,itemLiqueurCoffee,itemLiqueurPineapple,itemLiqueurKiwi,itemLiqueurPlantain;
			public static Item itemLiqueurCranberry,itemLiqueurGrape,itemLiqueurWhitePeach,itemLiqueurMelon,itemLiqueurHoney,itemLiqueurCacao;
			public static Item itemLiqueurMint,itemLiqueurCoco;
			
			//Juice
			public static Item itemJuiceBloodOrange, itemJuiceCherryPlum, itemJuiceCocoMilk, itemJuiceGrapefruitPink, itemJuiceGuava;
			public static Item itemJuiceMorelloCherry, itemJuicePassionFruit, itemJuicePlantainBanana, itemJuicePomegranate;
			public static Item itemJuiceWhitePeach,itemJuiceWildStrawberry;
			public static Item itemJuiceApricot,itemJuiceBanana,itemJuiceBlackberry,itemJuiceBlackCurrant,itemJuiceBlueberry;
			public static Item itemJuiceCarrot,itemJuiceCherry,itemJuiceClementine,itemJuiceCranberry,itemJuiceCucumber;
			public static Item itemJuiceCurrant,itemJuiceFig,itemJuiceGoava,itemJuiceGrapefruit,itemJuiceKiwi;
			public static Item itemJuiceLemon,itemJuiceLime,itemJuiceLychee,itemJuiceMango,itemJuiceMelon;
			public static Item itemJuiceMirabelle,itemJuiceOrange,itemJuicePapaya,itemJuicePassionfruit,itemJuicePeach;
			public static Item itemJuicePear,itemJuicePineappleCayenneLisse,itemJuicePineappleVictoria,itemJuicePlum;
			public static Item itemJuicePotato,itemJuicePricklyPear,itemJuiceQuince,itemJuiceRaspberry,itemJuiceRhubarb;
			public static Item itemJuiceStrawberry,itemJuiceTangerine,itemJuiceTomato,itemJuiceWatermelon,itemJuiceMultifruit;	
			
			//Apple Juice
			public static Item itemJuiceAppleAntares,itemJuiceAppleAriane,itemJuiceAppleBelchardChancelier,itemJuiceAppleBelleDeBoskoop,itemJuiceAppleBraeburn;
			public static Item itemJuiceAppleDuLimousin,itemJuiceAppleElstar,itemJuiceAppleFuji,itemJuiceAppleGala,itemJuiceAppleGolden;			
			public static Item itemJuiceAppleGrannySmith,itemJuiceAppleHoneycrunch,itemJuiceAppleJazz,itemJuiceAppleJonagoldJonagored,itemJuiceAppleLesRouges;
			public static Item itemJuiceApplePinkLady,itemJuiceAppleReineDesReinettes,itemJuiceAppleReinetteGriseDuCanada,itemJuiceAppleTentation;
			
			//Grape Juice
			public static Item itemGrapeAbouriouJuice,itemGrapeAleaticuJuice,itemGrapeAligoteJuice,itemGrapeAltesseJuice,itemGrapeAramonJuice;
			public static Item itemGrapeArboisJuice,itemGrapeArrufiacJuice,itemGrapeAubinVertJuice,itemGrapeBarbarossaJuice,itemGrapeBergeronJuice;
			public static Item itemGrapeBianconeJuice,itemGrapeBiancuGentileJuice,itemGrapeBourboulencJuice,itemGrapeBraquetJuice,itemGrapeCabernetFrancJuice;
			public static Item itemGrapeCabernetSauvignonJuice,itemGrapeCamareseJuice,itemGrapeCarcaghjoluBiancuJuice,itemGrapeCarcaghjoluNeruJuice,itemGrapeCarignanJuice;
			public static Item itemGrapeCesarJuice,itemGrapeChardonnayJuice,itemGrapeCheninJuice,itemGrapeCinsaultJuice,itemGrapeClairetteJuice;
			public static Item itemGrapeColombardJuice,itemGrapeCotJuice,itemGrapeCounoiseJuice,itemGrapeCourbuJuice,itemGrapeCudivertaJuice;
			public static Item itemGrapeDurasJuice,itemGrapeFerServadouJuice,itemGrapeFolleBlancheJuice,itemGrapeGamayJuice,itemGrapeGewurztraminerJuice;
			public static Item itemGrapeGrenacheJuice,itemGrapeGrenacheBlancJuice,itemGrapeGrolleauJuice,itemGrapeGrosMensengJuice,itemGrapeJacquereJuice;
			public static Item itemGrapeLenDeLElJuice,itemGrapeListanJuice,itemGrapeMaccabeuJuice,itemGrapeMalbecJuice,itemGrapeMalvoisieJuice;
			public static Item itemGrapeMarsanneJuice,itemGrapeMarselanJuice,itemGrapeMauzacJuice,itemGrapeMelonJuice,itemGrapeMelonDeBourgogneJuice;
			public static Item itemGrapeMerlotJuice,itemGrapeMoletteJuice,itemGrapeMollardJuice,itemGrapeMondeuseJuice,itemGrapeMondeuseBlancheJuice;
			public static Item itemGrapeMourvedreJuice,itemGrapeMuscadelleJuice,itemGrapeMuscardinJuice,itemGrapeMuscatBlancAPetitsGrainsJuice,itemGrapeMuscatDAlexandrieJuice;
			public static Item itemGrapeNegretteJuice,itemGrapeNielluccioJuice,itemGrapePagaDebitiJuice,itemGrapePetitCourbuJuice,itemGrapePetitMensengJuice;
			public static Item itemGrapePetitVerdotJuice,itemGrapePineauDAunisJuice,itemGrapePinotBlancJuice,itemGrapePinotMeunierJuice,itemGrapePinotNoirJuice;
			public static Item itemGrapePiquepoulJuice,itemGrapePoulsardJuice,itemGrapeRieslingJuice,itemGrapeRomorantinJuice,itemGrapeRossulaBiancaJuice;
			public static Item itemGrapeSacyJuice,itemGrapeSauvignonJuice,itemGrapeSavagninJuice,itemGrapeSemillonJuice,itemGrapeSylvanerJuice;
			public static Item itemGrapeSyrahJuice,itemGrapeTannatJuice,itemGrapeTeoulierJuice,itemGrapeTerretNoirJuice,itemGrapeTibourenJuice;
			public static Item itemGrapeTressalierJuice,itemGrapeUgniBlancJuice,itemGrapeVaccareseJuice,itemGrapeVermentinuJuice,itemGrapeViognierJuice;
			
			//Syrup MONIN
			public static Item itemLogoMonin,itemSyrupAlmond,itemSyrupAmaretto,itemSyrupAnise,itemSyrupApple;
			public static Item itemSyrupApplePie,itemSyrupApricot,itemSyrupBasil,itemSyrupBitter,itemSyrupBlackberry;
			public static Item itemSyrupBlackcurrant,itemSyrupBlackForest,itemSyrupBloodOrange,itemSyrupBlueberry,itemSyrupBlueCuracao;
			public static Item itemSyrupBubbleGum,itemSyrupCaipirinha,itemSyrupCandyStrawberry,itemSyrupCaramel,itemSyrupCardamom;
			public static Item itemSyrupChaiTea,itemSyrupCherry,itemSyrupCherryPlum,itemSyrupChestnut,itemSyrupChocolate;
			public static Item itemSyrupChocolateCookie,itemSyrupChocolateMint,itemSyrupCinnamon,itemSyrupCoconut,itemSyrupCoffee;
			public static Item itemSyrupCottonCandy,itemSyrupCranberry,itemSyrupCremeBrulee,itemSyrupCucumber,itemSyrupElderFlower;
			public static Item itemSyrupFig,itemSyrupFrostedMint,itemSyrupGin,itemSyrupGinger,itemSyrupGingerBread;
			public static Item itemSyrupGlascoLemon,itemSyrupGrapefruit,itemSyrupGreenApple,itemSyrupGreenBanana,itemSyrupGreenMint;
			public static Item itemSyrupGrenadine,itemSyrupGuava,itemSyrupGum,itemSyrupHazelnut,itemSyrupHibiscus;
			public static Item itemSyrupHoney,itemSyrupIrish,itemSyrupJasmine,itemSyrupKiwi,itemSyrupLavender;
			public static Item itemSyrupLemonGrass,itemSyrupLemonPie,itemSyrupLemonTea,itemSyrupLime,itemSyrupLimeJuiceCordialMixer;
			public static Item itemSyrupLychee,itemSyrupMacadamiaNut,itemSyrupMacaron,itemSyrupMango,itemSyrupMapleSpice;
			public static Item itemSyrupMatchaGreenTea,itemSyrupMelon,itemSyrupMojitoMint,itemSyrupMorelloCherry,itemSyrupOrange;
			public static Item itemSyrupPassionFruit,itemSyrupPeach,itemSyrupPeachTea,itemSyrupPear,itemSyrupPinacolada;
			public static Item itemSyrupPineapple,itemSyrupPinkGrapefruit,itemSyrupPistachio,itemSyrupPomegranate,itemSyrupPraline;
			public static Item itemSyrupPureCaneSugar,itemSyrupRantchoLemon,itemSyrupRaspberry,itemSyrupRaspberryTea,itemSyrupRoastedHazelnut;
			public static Item itemSyrupRose,itemSyrupRosmary,itemSyrupRumFlavour,itemSyrupSaltedCaramel,itemSyrupSangria;
			public static Item itemSyrupSpeculoos,itemSyrupSpicy,itemSyrupSpicyMango,itemSyrupStrawberry,itemSyrupTangerine;
			public static Item itemSyrupTarragon,itemSyrupTequilaFlavour,itemSyrupTiramisu,itemSyrupToffeeNut,itemSyrupTonkaBean;
			public static Item itemSyrupTripleSecCuracao,itemSyrupVanilla,itemSyrupViolet,itemSyrupWatermelon,itemSyrupWhiteChocolate;
			public static Item itemSyrupWhitePeach,itemSyrupWildStrawberry,itemSyrupYellowBanana;
		
		//items bottle
			//alcohol
			public static Item itemBottleCapCorse,itemBottleBordeauxChateauLary,itemBottleBordeauxChateauTourVerite,itemBottleBrandy,itemBottleCalvados;
			public static Item itemBottleChouchen,itemBottleCiderKerne,itemBottleCognac,itemBottleGin,itemBottleLambig;
			public static Item itemBottlePastis51,itemBottlePommeau,itemBottleRedMartini,itemBottleRedPort,itemBottleRum;
			public static Item itemBottleTequila,itemBottleVodka,itemBottleWhiskey,itemBottleWhiteMartini,itemBottleWhitePort;
			public static Item itemBottleVinegar,itemBottleAmaretto,itemBottleBitter,itemBottleBlueCaracao,itemBottleCuracaoTripleSec;
			public static Item itemBottlePastis51WOLabel,itemBottleWhiskeyWOLabel,itemBottleChouchenWOLabel;
			public static Item itemBottleBordeauxLaryWOLabel,itemBottleLiqueurWOLabel,itemBottleLiqueur,itemBottleBordeauxTourWOLabel;
			public static Item itemBottleTabasco,itemBottlePontarlier,itemBottleDubonnetRouge,itemBottleBenedictine,itemBottleWorcestershireSauce;
			public static Item itemBottleHeineken,itemBottleBaileys,itemBottleChartreuseVerte,itemBottlePisco,itemBottleCuracaoOrange;
			public static Item itemBottleCampari,itemBottleAngosturaBitter,itemBottlePetrus,itemBottleDrambuie,itemBottleChartreuseJaune;
			public static Item itemBottleGrandMarnier,itemBottleXeres,itemBottleFernetBranca,itemBottleChampagneMumm,itemBottleGuinness;
			public static Item itemBottleHoney,itemBottleEnate,itemBottleBourgogneAligote,itemBottleAlsaceRiesling,itemBottleGet27;
			public static Item itemBottle1664,itemBottleBritt,itemBottleDesperados,itemBottleGrimbergen,itemBottleLeffe;
			public static Item itemBottleSanMiguel,itemBottleSkoll,itemBottleSmirnoff,itemBottleXII,itemBottleDuvel,itemBottleSouthernComfort;
			
			//sweet
			public static Item itemBottleBenturCola,itemBottlePerrier,itemPint,itemBottleFleurOranger,itemBottleLimonade,itemBottleSchweppesTonic;
			public static Item itemBottleSchweppesGingerAle,itemBottleSchweppesAgrum,itemBottleSchweppesDarkSide,itemBottleSchweppesLemon,itemBottleSchweppesMango;
			public static Item itemBottleSchweppesPamplemousse,itemBottleSchweppesPassion,itemBottleSchweppesPech,itemBottleSchweppesPomme,itemBottleSchweppesRicqles;
			public static Item itemBottleSchweppesRaisin,itemBottleKetchup;
			
			//alcohol WO labels
			public static Item itemCapCorseWOLabel,itemBrandyWOLabel,itemCalvadosWOLabel,itemCiderKerneWOLabel,itemCognacWOLabel;			
			public static Item itemGinWOLabel,itemLambigWOLabel,itemPommeauWOLabel,itemRedMartiniWOLabel,itemRedPortWOLabel;			
			public static Item itemRumWOLabel,itemTequilaWOLabel,itemVodkaWOLabel,itemWhiteMartiniWOLabel,itemWhitePortWOLabel;
			public static Item itemVinegarWOLabel,itemBenedictineWOLabel,itemTabascoWOLabel,itemPontarlierWOLabel;
			public static Item itemDubonnetRougeWOLabel,itemWorcestershireSauceWOLabel,itemBlueCuracaoWOLabel,itemCuracaoTripleSecWOLabel;
			public static Item itemAmarettoWOLabel,itemBitterWOLabel,itemSouthernComfortWOLabel;
			public static Item itemFleurOrangerWOLabel,itemChartreuseJauneWOLabel,itemGrandMarnierWOLabel,itemLimonadeWOLabel,itemXeresWOLabel;
			public static Item itemScweppesTonicWOLabel,itemHeinekenWOLabel,itemBaileysWOLabel,itemChartreuseVerteWOLabel,itemPiscoWOLabel;
			public static Item itemCuracaoOrangeWOLabel,itemCampariWOLabel,itemAngosturaBitterWOLabel,itemPetrusWOLabel,itemDrambuieWOLabel;
			public static Item itemFernetBrancaWOLabel,itemSchweppesGingerAleWOLabel,itemChampagneMummWOLabel,itemGuinnessWOLabel;
			public static Item itemHoneyWOLabel,itemSchweppesAgrumWOLabel,itemSchweppesDarkSideWOLabel,itemSchweppesLemonWOLabel,itemSchweppesMangoWOLabel;
			public static Item itemSchweppesPamplemousseWOLabel,itemSchweppesPassionWOLabel,itemSchweppesPechWOLabel,itemSchweppesPommeWOLabel,itemSchweppesRicqlesWOLabel;
			public static Item itemEnateWOLabel,itemBourgogneAligoteWOLabel,itemAlsaceRieslingWOLabel,itemGet27WOLabel;
			public static Item item1664WOLabel,itemBrittWOLabel,itemDesperadosWOLabel,itemDuvelWOLabel,itemGrimberWOLabel;
			public static Item itemLeffeWOLabel,itemSanMiguelWOLabel,itemSkollWOLabel,itemSmirnoffWOLabel,itemXIIWOLabel;
	 		
			//sweet WO labels
			public static Item itemBenturColaWOLabel,itemPerrierWOLabel,itemSyrupMoninWOLabel,itemSchweppesRaisinWOLabel,itemKetchupWOLabel;

	
	public static void preInit(){
		
		//items beverage empty			
		//alcohol
		itemBottleCapCorse = new ItemBottle().setUnlocalizedName("itemBottleCapCorse");
		itemBottleBordeauxChateauLary = new ItemBottle().setUnlocalizedName("itemBottleBordeauxChateauLary");
		itemBottleBordeauxChateauTourVerite = new ItemBottle().setUnlocalizedName("itemBottleBordeauxChateauTourVerite");
		itemBottleBrandy = new ItemBottle().setUnlocalizedName("itemBottleBrandy");
		itemBottleCalvados = new ItemBottle().setUnlocalizedName("itemBottleCalvados");

		itemBottleChouchen = new ItemBottle().setUnlocalizedName("itemBottleChouchen");
		itemBottleCiderKerne = new ItemBottle().setUnlocalizedName("itemBottleCiderKerne");
		itemBottleCognac = new ItemBottle().setUnlocalizedName("itemBottleCognac");
		itemBottleGin = new ItemBottle().setUnlocalizedName("itemBottleGin");
		itemBottleLambig = new ItemBottle().setUnlocalizedName("itemBottleLambig");
		
		GameRegistry.registerItem(itemBottleCapCorse, "itemBottleCapCorse");
		GameRegistry.registerItem(itemBottleBordeauxChateauLary, "itemBottleBordeauxChateauLary");
		GameRegistry.registerItem(itemBottleBordeauxChateauTourVerite, "itemBottleBordeauxChateauTourVerite");
		GameRegistry.registerItem(itemBottleBrandy, "itemBottleBrandy");
		GameRegistry.registerItem(itemBottleCalvados, "itemBottleCalvados");
		
		GameRegistry.registerItem(itemBottleChouchen, "itemBottleChouchen");
		GameRegistry.registerItem(itemBottleCiderKerne, "itemBottleCiderKerne");
		GameRegistry.registerItem(itemBottleCognac, "itemBottleCognac");
		GameRegistry.registerItem(itemBottleGin, "itemBottleGin");
		GameRegistry.registerItem(itemBottleLambig, "itemBottleLambig");
		
		itemBottlePastis51 = new ItemBottle().setUnlocalizedName("itemBottlePastis51");
		itemBottlePommeau = new ItemBottle().setUnlocalizedName("itemBottlePommeau");
		itemBottleRedMartini = new ItemBottle().setUnlocalizedName("itemBottleRedMartini");
		itemBottleRedPort = new ItemBottle().setUnlocalizedName("itemBottleRedPort");
		itemBottleRum = new ItemBottle().setUnlocalizedName("itemBottleRum");
		
		itemBottleTequila = new ItemBottle().setUnlocalizedName("itemBottleTequila");
		itemBottleVodka = new ItemBottle().setUnlocalizedName("itemBottleVodka");
		itemBottleWhiskey = new ItemBottle().setUnlocalizedName("itemBottleWhiskey");
		itemBottleWhiteMartini = new ItemBottle().setUnlocalizedName("itemBottleWhiteMartini");
		itemBottleWhitePort = new ItemBottle().setUnlocalizedName("itemBottleWhitePort");
	
		GameRegistry.registerItem(itemBottlePastis51, "itemBottlePastis51");
		GameRegistry.registerItem(itemBottlePommeau, "itemBottlePommeau");
		GameRegistry.registerItem(itemBottleRedMartini, "itemBottleRedMartini");
		GameRegistry.registerItem(itemBottleRedPort, "itemBottleRedPort");
		GameRegistry.registerItem(itemBottleRum, "itemBottleRum");
		
		GameRegistry.registerItem(itemBottleTequila, "itemBottleTequila");
		GameRegistry.registerItem(itemBottleVodka, "itemBottleVodka");
		GameRegistry.registerItem(itemBottleWhiskey, "itemBottleWhiskey");
		GameRegistry.registerItem(itemBottleWhiteMartini, "itemBottleWhiteMartini");
		GameRegistry.registerItem(itemBottleWhitePort, "itemBottleWhitePort");

		itemBottleVinegar = new ItemBottle().setUnlocalizedName("itemBottleVinegar");
		itemBottleAmaretto = new ItemBottle().setUnlocalizedName("itemBottleAmaretto");
		itemBottleBitter = new ItemBottle().setUnlocalizedName("itemBottleBitter");
		itemBottleBlueCaracao = new ItemBottle().setUnlocalizedName("itemBottleBlueCaracao");
		itemBottleCuracaoTripleSec = new ItemBottle().setUnlocalizedName("itemBottleCuracaoTripleSec");
		
		GameRegistry.registerItem(itemBottleVinegar, "itemBottleVinegar");
		GameRegistry.registerItem(itemBottleAmaretto, "itemBottleAmaretto");
		GameRegistry.registerItem(itemBottleBitter, "itemBottleBitter");
		GameRegistry.registerItem(itemBottleBlueCaracao, "itemBottleBlueCaracao");
		GameRegistry.registerItem(itemBottleCuracaoTripleSec, "itemBottleCuracaoTripleSec");
		
		
		
		itemBottlePastis51WOLabel = new ItemBottle().setUnlocalizedName("itemBottlePastis51WOLabel");
		itemBottleWhiskeyWOLabel = new ItemBottle().setUnlocalizedName("itemBottleWhiskeyWOLabel");
		itemBottleChouchenWOLabel = new ItemBottle().setUnlocalizedName("itemBottleChouchenWOLabel");
		
		GameRegistry.registerItem(itemBottlePastis51WOLabel, "itemBottlePastis51WOLabel");
		GameRegistry.registerItem(itemBottleWhiskeyWOLabel, "itemBottleWhiskeyWOLabel");
		GameRegistry.registerItem(itemBottleChouchenWOLabel, "itemBottleChouchenWOLabel");
		
		itemBottleBordeauxLaryWOLabel = new ItemBottle().setUnlocalizedName("itemBottleBordeauxLaryWOLabel");
		itemBottleLiqueurWOLabel = new ItemBottle().setUnlocalizedName("itemBottleLiqueurWOLabel");
		itemBottleLiqueur = new ItemBottle().setUnlocalizedName("itemBottleLiqueur");
		itemBottleBordeauxTourWOLabel = new ItemBottle().setUnlocalizedName("itemBottleBordeauxTourWOLabel");

		GameRegistry.registerItem(itemBottleBordeauxLaryWOLabel, "itemBottleBordeauxLaryWOLabel");
		GameRegistry.registerItem(itemBottleLiqueurWOLabel, "itemBottleLiqueurWOLabel");
		GameRegistry.registerItem(itemBottleLiqueur, "itemBottleLiqueur");
		GameRegistry.registerItem(itemBottleBordeauxTourWOLabel, "itemBottleBordeauxTourWOLabel");
		
		//sweets 
		itemBottleBenturCola = new ItemBottle().setUnlocalizedName("itemBottleBenturCola");
		itemBottlePerrier = new ItemBottle().setUnlocalizedName("itemBottlePerrier");	
		itemPint = new ItemBottle().setUnlocalizedName("itemPint");
		itemBottleFleurOranger = new ItemBottle().setUnlocalizedName("itemBottleFleurOranger");
		itemBottleLimonade = new ItemBottle().setUnlocalizedName("itemBottleLimonade");
		
		GameRegistry.registerItem(itemBottleBenturCola, "itemBottleBenturCola");
		GameRegistry.registerItem(itemBottlePerrier, "itemBottlePerrier");
		GameRegistry.registerItem(itemPint, "itemPint");
		GameRegistry.registerItem(itemBottleFleurOranger, "itemBottleFleurOranger");
		GameRegistry.registerItem(itemBottleLimonade, "itemBottleLimonade");
		
		itemBottleSchweppesTonic = new ItemBottle().setUnlocalizedName("itemBottleSchweppesTonic");
		itemBottleSchweppesGingerAle = new ItemBottle().setUnlocalizedName("itemBottleSchweppesGingerAle");
		itemBottleSchweppesAgrum = new ItemBottle().setUnlocalizedName("itemBottleSchweppesAgrum");
		itemBottleSchweppesDarkSide = new ItemBottle().setUnlocalizedName("itemBottleSchweppesDarkSide");
		itemBottleSchweppesLemon = new ItemBottle().setUnlocalizedName("itemBottleSchweppesLemon");
		itemBottleSchweppesMango = new ItemBottle().setUnlocalizedName("itemBottleSchweppesMango");
		
		GameRegistry.registerItem(itemBottleSchweppesTonic, "itemBottleSchweppesTonic");
		GameRegistry.registerItem(itemBottleSchweppesGingerAle, "itemBottleSchweppesGingerAle");
		GameRegistry.registerItem(itemBottleSchweppesAgrum, "itemBottleSchweppesAgrum");
		GameRegistry.registerItem(itemBottleSchweppesDarkSide, "itemBottleSchweppesDarkSide");
		GameRegistry.registerItem(itemBottleSchweppesLemon, "itemBottleSchweppesLemon");
		GameRegistry.registerItem(itemBottleSchweppesMango, "itemBottleSchweppesMango");
		
		itemBottleSchweppesPamplemousse = new ItemBottle().setUnlocalizedName("itemBottleSchweppesPamplemousse");
		itemBottleSchweppesPassion = new ItemBottle().setUnlocalizedName("itemBottleSchweppesPassion");
		itemBottleSchweppesPech = new ItemBottle().setUnlocalizedName("itemBottleSchweppesPech");
		itemBottleSchweppesPomme = new ItemBottle().setUnlocalizedName("itemBottleSchweppesPomme");
		itemBottleSchweppesRicqles = new ItemBottle().setUnlocalizedName("itemBottleSchweppesRicqles");
		
		GameRegistry.registerItem(itemBottleSchweppesPamplemousse, "itemBottleSchweppesPamplemousse");
		GameRegistry.registerItem(itemBottleSchweppesPassion, "itemBottleSchweppesPassion");
		GameRegistry.registerItem(itemBottleSchweppesPech, "itemBottleSchweppesPech");
		GameRegistry.registerItem(itemBottleSchweppesPomme, "itemBottleSchweppesPomme");
		GameRegistry.registerItem(itemBottleSchweppesRicqles, "itemBottleSchweppesRicqles");
	
		itemBottleSchweppesRaisin = new ItemBottle().setUnlocalizedName("itemBottleSchweppesRaisin");
		itemBottleKetchup = new ItemBeverageSweet(BandbBeverages.itemBottleKetchup).setUnlocalizedName("itemBottleKetchup").setTextureName(Bandb_mod.MODID + ":beverage/itemBottleKetchup");
		
		GameRegistry.registerItem(itemBottleSchweppesRaisin, "itemBottleSchweppesRaisin");
		GameRegistry.registerItem(itemBottleKetchup, "itemBottleKetchup");
		
		
		itemBottleTabasco = new ItemBottle().setUnlocalizedName("itemBottleTabasco");
		itemBottlePontarlier = new ItemBottle().setUnlocalizedName("itemBottlePontarlier");
		itemBottleDubonnetRouge = new ItemBottle().setUnlocalizedName("itemBottleDubonnetRouge");
		itemBottleBenedictine = new ItemBottle().setUnlocalizedName("itemBottleBenedictine");
		itemBottleWorcestershireSauce = new ItemBottle().setUnlocalizedName("itemBottleWorcestershireSauce");
	
		GameRegistry.registerItem(itemBottleTabasco, "itemBottleTabasco");
		GameRegistry.registerItem(itemBottlePontarlier, "itemBottlePontarlier");
		GameRegistry.registerItem(itemBottleDubonnetRouge, "itemBottleDubonnetRouge");
		GameRegistry.registerItem(itemBottleBenedictine, "itemBottleBenedictine");
		GameRegistry.registerItem(itemBottleWorcestershireSauce, "itemBottleWorcestershireSauce");
		
		itemBottleHeineken = new ItemBottle().setUnlocalizedName("itemBottleHeineken");
		itemBottleBaileys = new ItemBottle().setUnlocalizedName("itemBottleBaileys");
		itemBottleChartreuseVerte = new ItemBottle().setUnlocalizedName("itemBottleChartreuseVerte");
		itemBottlePisco = new ItemBottle().setUnlocalizedName("itemBottlePisco");
		itemBottleCuracaoOrange = new ItemBottle().setUnlocalizedName("itemBottleCuracaoOrange");
	
		GameRegistry.registerItem(itemBottleHeineken, "itemBottleHeineken");
		GameRegistry.registerItem(itemBottleBaileys, "itemBottleBaileys");
		GameRegistry.registerItem(itemBottleChartreuseVerte, "itemBottleChartreuseVerte");
		GameRegistry.registerItem(itemBottlePisco, "itemBottlePisco");
		GameRegistry.registerItem(itemBottleCuracaoOrange, "itemBottleCuracaoOrange");
		
		itemBottleCampari = new ItemBottle().setUnlocalizedName("itemBottleCampari");
		itemBottleAngosturaBitter = new ItemBottle().setUnlocalizedName("itemBottleAngosturaBitter");
		itemBottlePetrus = new ItemBottle().setUnlocalizedName("itemBottlePetrus");
		itemBottleDrambuie = new ItemBottle().setUnlocalizedName("itemBottleDrambuie");
		itemBottleChartreuseJaune = new ItemBottle().setUnlocalizedName("itemBottleChartreuseJaune");
	
		GameRegistry.registerItem(itemBottleCampari, "itemBottleCampari");
		GameRegistry.registerItem(itemBottleAngosturaBitter, "itemBottleAngosturaBitter");
		GameRegistry.registerItem(itemBottlePetrus, "itemBottlePetrus");
		GameRegistry.registerItem(itemBottleDrambuie, "itemBottleDrambuie");
		GameRegistry.registerItem(itemBottleChartreuseJaune, "itemBottleChartreuseJaune");
		
		itemBottleGrandMarnier = new ItemBottle().setUnlocalizedName("itemBottleGrandMarnier");
		itemBottleXeres = new ItemBottle().setUnlocalizedName("itemBottleXeres");
		itemBottleFernetBranca = new ItemBottle().setUnlocalizedName("itemBottleFernetBranca");
		itemBottleChampagneMumm = new ItemBottle().setUnlocalizedName("itemBottleChampagneMumm");
		itemBottleGuinness = new ItemBottle().setUnlocalizedName("itemBottleGuinness");
		
		GameRegistry.registerItem(itemBottleGrandMarnier, "itemBottleGrandMarnier");
		GameRegistry.registerItem(itemBottleXeres, "itemBottleXeres");
		GameRegistry.registerItem(itemBottleFernetBranca, "itemBottleFernetBranca");
		GameRegistry.registerItem(itemBottleChampagneMumm, "itemBottleChampagneMumm");
		GameRegistry.registerItem(itemBottleGuinness, "itemBottleGuinness");	
		
		itemBottleHoney = new ItemBottle().setUnlocalizedName("itemBottleHoney");
		itemBottleEnate = new ItemBottle().setUnlocalizedName("itemBottleEnate");
		itemBottleBourgogneAligote = new ItemBottle().setUnlocalizedName("itemBottleBourgogneAligote");
		itemBottleAlsaceRiesling = new ItemBottle().setUnlocalizedName("itemBottleAlsaceRiesling");
		itemBottleGet27 = new ItemBottle().setUnlocalizedName("itemBottleGet27");
		
		GameRegistry.registerItem(itemBottleHoney, "itemBottleHoney");
		GameRegistry.registerItem(itemBottleEnate, "itemBottleEnate");
		GameRegistry.registerItem(itemBottleBourgogneAligote, "itemBottleBourgogneAligote");
		GameRegistry.registerItem(itemBottleAlsaceRiesling, "itemBottleAlsaceRiesling");
		GameRegistry.registerItem(itemBottleGet27, "itemBottleGet27");

		itemBottle1664 = new ItemBottle().setUnlocalizedName("itemBottle1664");
		itemBottleBritt = new ItemBottle().setUnlocalizedName("itemBottleBritt");
		itemBottleDesperados = new ItemBottle().setUnlocalizedName("itemBottleDesperados");
		itemBottleGrimbergen = new ItemBottle().setUnlocalizedName("itemBottleGrimbergen");
		itemBottleLeffe = new ItemBottle().setUnlocalizedName("itemBottleLeffe");
		
		GameRegistry.registerItem(itemBottle1664, "itemBottle1664");
		GameRegistry.registerItem(itemBottleBritt, "itemBottleBritt");
		GameRegistry.registerItem(itemBottleDesperados, "itemBottleDesperados");
		GameRegistry.registerItem(itemBottleGrimbergen, "itemBottleGrimbergen");
		GameRegistry.registerItem(itemBottleLeffe, "itemBottleLeffe");	
		
		itemBottleSanMiguel = new ItemBottle().setUnlocalizedName("itemBottleSanMiguel");
		itemBottleSkoll = new ItemBottle().setUnlocalizedName("itemBottleSkoll");
		itemBottleSmirnoff = new ItemBottle().setUnlocalizedName("itemBottleSmirnoff");
		itemBottleXII = new ItemBottle().setUnlocalizedName("itemBottleXII");
		itemBottleDuvel = new ItemBottle().setUnlocalizedName("itemBottleDuvel");
		
		GameRegistry.registerItem(itemBottleSanMiguel, "itemBottleSanMiguel");
		GameRegistry.registerItem(itemBottleSkoll, "itemBottleSkoll");
		GameRegistry.registerItem(itemBottleSmirnoff, "itemBottleSmirnoff");
		GameRegistry.registerItem(itemBottleXII, "itemBottleXII");
		GameRegistry.registerItem(itemBottleDuvel, "itemBottleDuvel");	
		
		itemBottleSouthernComfort = new ItemBottle().setUnlocalizedName("itemBottleSouthernComfort");
		
		GameRegistry.registerItem(itemBottleSouthernComfort, "itemBottleSouthernComfort");
		
		
		//alcohol WO labels			
		itemCapCorseWOLabel = new ItemBottleWOLabel().setUnlocalizedName("itemCapCorseWOLabel");
		itemBrandyWOLabel = new ItemBottleWOLabel().setUnlocalizedName("itemBrandyWOLabel");
		itemCalvadosWOLabel = new ItemBottleWOLabel().setUnlocalizedName("itemCalvadosWOLabel");
		itemCiderKerneWOLabel = new ItemBottleWOLabel().setUnlocalizedName("itemCiderKerneWOLabel");
		itemCognacWOLabel = new ItemBottleWOLabel().setUnlocalizedName("itemCognacWOLabel");
		
		itemGinWOLabel = new ItemBottleWOLabel().setUnlocalizedName("itemGinWOLabel");
		itemLambigWOLabel = new ItemBottleWOLabel().setUnlocalizedName("itemLambigWOLabel");
		itemPommeauWOLabel = new ItemBottleWOLabel().setUnlocalizedName("itemPommeauWOLabel");
		itemRedMartiniWOLabel = new ItemBottleWOLabel().setUnlocalizedName("itemRedMartiniWOLabel");
		itemRedPortWOLabel = new ItemBottleWOLabel().setUnlocalizedName("itemRedPortWOLabel");
		
		GameRegistry.registerItem(itemCapCorseWOLabel, "itemCapCorseWOLabel");
		GameRegistry.registerItem(itemBrandyWOLabel, "itemBrandyWOLabel");
		GameRegistry.registerItem(itemCalvadosWOLabel, "itemCalvadosWOLabel");
		GameRegistry.registerItem(itemCiderKerneWOLabel, "itemCiderKerneWOLabel");
		GameRegistry.registerItem(itemCognacWOLabel, "itemCognacWOLabel");
		
		GameRegistry.registerItem(itemGinWOLabel, "itemGinWOLabel");
		GameRegistry.registerItem(itemLambigWOLabel, "itemLambigWOLabel");
		GameRegistry.registerItem(itemPommeauWOLabel, "itemPommeauWOLabel");
		GameRegistry.registerItem(itemRedMartiniWOLabel, "itemRedMartiniWOLabel");
		GameRegistry.registerItem(itemRedPortWOLabel, "itemRedPortWOLabel");
		
		itemRumWOLabel = new ItemBottleWOLabel().setUnlocalizedName("itemRumWOLabel");
		itemTequilaWOLabel = new ItemBottleWOLabel().setUnlocalizedName("itemTequilaWOLabel");
		itemVodkaWOLabel = new ItemBottleWOLabel().setUnlocalizedName("itemVodkaWOLabel");
		itemWhiteMartiniWOLabel = new ItemBottleWOLabel().setUnlocalizedName("itemWhiteMartiniWOLabel");
		itemWhitePortWOLabel = new ItemBottleWOLabel().setUnlocalizedName("itemWhitePortWOLabel");		

		itemVinegarWOLabel = new ItemBottleWOLabel().setUnlocalizedName("itemVinegarWOLabel");

		GameRegistry.registerItem(itemRumWOLabel, "itemRumWOLabel");
		GameRegistry.registerItem(itemTequilaWOLabel, "itemTequilaWOLabel");
		GameRegistry.registerItem(itemVodkaWOLabel, "itemVodkaWOLabel");
		GameRegistry.registerItem(itemWhiteMartiniWOLabel, "itemWhiteMartiniWOLabel");
		GameRegistry.registerItem(itemWhitePortWOLabel, "itemWhitePortWOLabel");
		
		GameRegistry.registerItem(itemVinegarWOLabel, "itemVinegarWOLabel");
		
		itemBenedictineWOLabel = new ItemBottleWOLabel().setUnlocalizedName("itemBenedictineWOLabel");
		itemTabascoWOLabel = new ItemBottleWOLabel().setUnlocalizedName("itemTabascoWOLabel");
		itemPontarlierWOLabel = new ItemBottleWOLabel().setUnlocalizedName("itemPontarlierWOLabel");
		itemDubonnetRougeWOLabel = new ItemBottleWOLabel().setUnlocalizedName("itemDubonnetRougeWOLabel");
		itemWorcestershireSauceWOLabel = new ItemBottleWOLabel().setUnlocalizedName("itemWorcestershireSauceWOLabel");		

		GameRegistry.registerItem(itemBenedictineWOLabel, "itemBenedictineWOLabel");
		GameRegistry.registerItem(itemTabascoWOLabel, "itemTabascoWOLabel");
		GameRegistry.registerItem(itemPontarlierWOLabel, "itemPontarlierWOLabel");
		GameRegistry.registerItem(itemDubonnetRougeWOLabel, "itemDubonnetRougeWOLabel");
		GameRegistry.registerItem(itemWorcestershireSauceWOLabel, "itemWorcestershireSauceWOLabel");
		
		itemFleurOrangerWOLabel = new ItemBottleWOLabel().setUnlocalizedName("itemFleurOrangerWOLabel");
		itemChartreuseJauneWOLabel = new ItemBottleWOLabel().setUnlocalizedName("itemChartreuseJauneWOLabel");
		itemGrandMarnierWOLabel = new ItemBottleWOLabel().setUnlocalizedName("itemGrandMarnierWOLabel");
		itemLimonadeWOLabel = new ItemBottleWOLabel().setUnlocalizedName("itemLimonadeWOLabel");
		itemXeresWOLabel = new ItemBottleWOLabel().setUnlocalizedName("itemXeresWOLabel");		

		GameRegistry.registerItem(itemFleurOrangerWOLabel, "itemFleurOrangerWOLabel");
		GameRegistry.registerItem(itemChartreuseJauneWOLabel, "itemChartreuseJauneWOLabel");
		GameRegistry.registerItem(itemGrandMarnierWOLabel, "itemGrandMarnierWOLabel");
		GameRegistry.registerItem(itemLimonadeWOLabel, "itemLimonadeWOLabel");
		GameRegistry.registerItem(itemXeresWOLabel, "itemXeresWOLabel");
		
		itemBlueCuracaoWOLabel = new ItemBottleWOLabel().setUnlocalizedName("itemBlueCuracaoWOLabel");
		itemCuracaoTripleSecWOLabel = new ItemBottleWOLabel().setUnlocalizedName("itemCuracaoTripleSecWOLabel");
		itemAmarettoWOLabel = new ItemBottleWOLabel().setUnlocalizedName("itemAmarettoWOLabel");
		itemBitterWOLabel = new ItemBottleWOLabel().setUnlocalizedName("itemBitterWOLabel");
		itemSouthernComfortWOLabel = new ItemBottleWOLabel().setUnlocalizedName("itemSouthernComfortWOLabel");

		GameRegistry.registerItem(itemBlueCuracaoWOLabel, "itemBlueCuracaoWOLabel");
		GameRegistry.registerItem(itemCuracaoTripleSecWOLabel, "itemCuracaoTripleSecWOLabel");
		GameRegistry.registerItem(itemAmarettoWOLabel, "itemAmarettoWOLabel");
		GameRegistry.registerItem(itemBitterWOLabel, "itemBitterWOLabel");
		GameRegistry.registerItem(itemSouthernComfortWOLabel, "itemSouthernComfortWOLabel");
		
		itemScweppesTonicWOLabel = new ItemBottleWOLabel().setUnlocalizedName("itemScweppesTonicWOLabel");
		itemHeinekenWOLabel = new ItemBottleWOLabel().setUnlocalizedName("itemHeinekenWOLabel");
		itemBaileysWOLabel = new ItemBottleWOLabel().setUnlocalizedName("itemBaileysWOLabel");
		itemChartreuseVerteWOLabel = new ItemBottleWOLabel().setUnlocalizedName("itemChartreuseVerteWOLabel");
		itemPiscoWOLabel = new ItemBottleWOLabel().setUnlocalizedName("itemPiscoWOLabel");		

		GameRegistry.registerItem(itemScweppesTonicWOLabel, "itemScweppesTonicWOLabel");
		GameRegistry.registerItem(itemHeinekenWOLabel, "itemHeinekenWOLabel");
		GameRegistry.registerItem(itemBaileysWOLabel, "itemBaileysWOLabel");
		GameRegistry.registerItem(itemChartreuseVerteWOLabel, "itemChartreuseVerteWOLabel");
		GameRegistry.registerItem(itemPiscoWOLabel, "itemPiscoWOLabel");

		itemCuracaoOrangeWOLabel = new ItemBottleWOLabel().setUnlocalizedName("itemCuracaoOrangeWOLabel");
		itemCampariWOLabel = new ItemBottleWOLabel().setUnlocalizedName("itemCampariWOLabel");
		itemAngosturaBitterWOLabel = new ItemBottleWOLabel().setUnlocalizedName("itemAngosturaBitterWOLabel");
		itemPetrusWOLabel = new ItemBottleWOLabel().setUnlocalizedName("itemPetrusWOLabel");
		itemDrambuieWOLabel = new ItemBottleWOLabel().setUnlocalizedName("itemDrambuieWOLabel");	

		GameRegistry.registerItem(itemCuracaoOrangeWOLabel, "itemCuracaoOrangeWOLabel");
		GameRegistry.registerItem(itemCampariWOLabel, "itemCampariWOLabel");
		GameRegistry.registerItem(itemAngosturaBitterWOLabel, "itemAngosturaBitterWOLabel");
		GameRegistry.registerItem(itemPetrusWOLabel, "itemPetrusWOLabel");
		GameRegistry.registerItem(itemDrambuieWOLabel, "itemDrambuieWOLabel");

		itemFernetBrancaWOLabel = new ItemBottleWOLabel().setUnlocalizedName("itemFernetBrancaWOLabel");
		itemSchweppesGingerAleWOLabel = new ItemBottleWOLabel().setUnlocalizedName("itemSchweppesGingerAleWOLabel");		
		itemChampagneMummWOLabel = new ItemBottleWOLabel().setUnlocalizedName("itemChampagneMummWOLabel");		
		itemGuinnessWOLabel = new ItemBottleWOLabel().setUnlocalizedName("itemGuinnessWOLabel");		
		itemHoneyWOLabel = new ItemBottleWOLabel().setUnlocalizedName("itemHoneyWOLabel");		
		
		GameRegistry.registerItem(itemFernetBrancaWOLabel, "itemFernetBrancaWOLabel");
		GameRegistry.registerItem(itemSchweppesGingerAleWOLabel, "itemSchweppesGingerAleWOLabel");
		GameRegistry.registerItem(itemChampagneMummWOLabel, "itemChampagneMummWOLabel");
		GameRegistry.registerItem(itemGuinnessWOLabel, "itemGuinnessWOLabel");
		GameRegistry.registerItem(itemHoneyWOLabel, "itemHoneyWOLabel");
		
		itemSchweppesAgrumWOLabel = new ItemBottleWOLabel().setUnlocalizedName("itemSchweppesAgrumWOLabel");
		itemSchweppesDarkSideWOLabel = new ItemBottleWOLabel().setUnlocalizedName("itemSchweppesDarkSideWOLabel");		
		itemSchweppesLemonWOLabel = new ItemBottleWOLabel().setUnlocalizedName("itemSchweppesLemonWOLabel");		
		itemSchweppesMangoWOLabel = new ItemBottleWOLabel().setUnlocalizedName("itemSchweppesMangoWOLabel");		
		itemSchweppesPamplemousseWOLabel = new ItemBottleWOLabel().setUnlocalizedName("itemSchweppesPamplemousseWOLabel");		
		
		GameRegistry.registerItem(itemSchweppesAgrumWOLabel, "itemSchweppesAgrumWOLabel");
		GameRegistry.registerItem(itemSchweppesDarkSideWOLabel, "itemSchweppesDarkSideWOLabel");
		GameRegistry.registerItem(itemSchweppesLemonWOLabel, "itemSchweppesLemonWOLabel");
		GameRegistry.registerItem(itemSchweppesMangoWOLabel, "itemSchweppesMangoWOLabel");
		GameRegistry.registerItem(itemSchweppesPamplemousseWOLabel, "itemSchweppesPamplemousseWOLabel");
		
		itemSchweppesPassionWOLabel = new ItemBottleWOLabel().setUnlocalizedName("itemSchweppesPassionWOLabel");		
		itemSchweppesPechWOLabel = new ItemBottleWOLabel().setUnlocalizedName("itemSchweppesPechWOLabel");		
		itemSchweppesPommeWOLabel = new ItemBottleWOLabel().setUnlocalizedName("itemSchweppesPommeWOLabel");		
		itemSchweppesRicqlesWOLabel = new ItemBottleWOLabel().setUnlocalizedName("itemSchweppesRicqlesWOLabel");		
		itemEnateWOLabel = new ItemBottleWOLabel().setUnlocalizedName("itemEnateWOLabel");		
		
		GameRegistry.registerItem(itemSchweppesPassionWOLabel, "itemSchweppesPassionWOLabel");
		GameRegistry.registerItem(itemSchweppesPechWOLabel, "itemSchweppesPechWOLabel");
		GameRegistry.registerItem(itemSchweppesPommeWOLabel, "itemSchweppesPommeWOLabel");
		GameRegistry.registerItem(itemSchweppesRicqlesWOLabel, "itemSchweppesRicqlesWOLabel");
		GameRegistry.registerItem(itemEnateWOLabel, "itemEnateWOLabel");
		
		itemBourgogneAligoteWOLabel = new ItemBottleWOLabel().setUnlocalizedName("itemBourgogneAligoteWOLabel");		
		itemAlsaceRieslingWOLabel = new ItemBottleWOLabel().setUnlocalizedName("itemAlsaceRieslingWOLabel");		
		itemGet27WOLabel = new ItemBottleWOLabel().setUnlocalizedName("itemGet27WOLabel");		
		itemSchweppesRaisinWOLabel = new ItemBottleWOLabel().setUnlocalizedName("itemSchweppesRaisinWOLabel");		
		itemKetchupWOLabel = new ItemBottleWOLabel().setUnlocalizedName("itemKetchupWOLabel");		
		
		GameRegistry.registerItem(itemBourgogneAligoteWOLabel, "itemBourgogneAligoteWOLabel");
		GameRegistry.registerItem(itemAlsaceRieslingWOLabel, "itemAlsaceRieslingWOLabel");
		GameRegistry.registerItem(itemGet27WOLabel, "itemGet27WOLabel");
		GameRegistry.registerItem(itemSchweppesRaisinWOLabel, "itemSchweppesRaisinWOLabel");
		GameRegistry.registerItem(itemKetchupWOLabel, "itemKetchupWOLabel");
		
		
		item1664WOLabel = new ItemBottleWOLabel().setUnlocalizedName("item1664WOLabel");		
		itemBrittWOLabel = new ItemBottleWOLabel().setUnlocalizedName("itemBrittWOLabel");		
		itemDesperadosWOLabel = new ItemBottleWOLabel().setUnlocalizedName("itemDesperadosWOLabel");		
		itemDuvelWOLabel = new ItemBottleWOLabel().setUnlocalizedName("itemDuvelWOLabel");		
		itemGrimberWOLabel = new ItemBottleWOLabel().setUnlocalizedName("itemGrimberWOLabel");		
		
		GameRegistry.registerItem(item1664WOLabel, "item1664WOLabel");
		GameRegistry.registerItem(itemBrittWOLabel, "itemBrittWOLabel");
		GameRegistry.registerItem(itemDesperadosWOLabel, "itemDesperadosWOLabel");
		GameRegistry.registerItem(itemDuvelWOLabel, "itemDuvelWOLabel");
		GameRegistry.registerItem(itemGrimberWOLabel, "itemGrimberWOLabel");
		
		itemLeffeWOLabel = new ItemBottleWOLabel().setUnlocalizedName("itemLeffeWOLabel");		
		itemSanMiguelWOLabel = new ItemBottleWOLabel().setUnlocalizedName("itemSanMiguelWOLabel");		
		itemSkollWOLabel = new ItemBottleWOLabel().setUnlocalizedName("itemSkollWOLabel");		
		itemSmirnoffWOLabel = new ItemBottleWOLabel().setUnlocalizedName("itemSmirnoffWOLabel");		
		itemXIIWOLabel = new ItemBottleWOLabel().setUnlocalizedName("itemXIIWOLabel");		
		
		GameRegistry.registerItem(itemLeffeWOLabel, "itemLeffeWOLabel");
		GameRegistry.registerItem(itemSanMiguelWOLabel, "itemSanMiguelWOLabel");
		GameRegistry.registerItem(itemSkollWOLabel, "itemSkollWOLabel");
		GameRegistry.registerItem(itemSmirnoffWOLabel, "itemSmirnoffWOLabel");
		GameRegistry.registerItem(itemXIIWOLabel, "itemXIIWOLabel");
		

		
		//sweets WO labels
		itemBenturColaWOLabel = new ItemBottleWOLabel().setUnlocalizedName("itemBenturColaWOLabel");
		itemPerrierWOLabel = new ItemBottleWOLabel().setUnlocalizedName("itemPerrierWOLabel");
		itemSyrupMoninWOLabel = new ItemBottleWOLabel().setUnlocalizedName("itemSyrupMoninWOLabel");

		GameRegistry.registerItem(itemBenturColaWOLabel, "itemBenturColaWOLabel");
		GameRegistry.registerItem(itemPerrierWOLabel, "itemPerrierWOLabel");	
		GameRegistry.registerItem(itemSyrupMoninWOLabel, "itemSyrupMoninWOLabel");	

		
	//items beverage
		//Alcohol
		itemBeverageCapCorse = new ItemBeverageAlcohol(BandbBeverages.itemBottleCapCorse).setUnlocalizedName("itemBeverageCapCorse").setTextureName(Bandb_mod.MODID + ":beverage/itemCapCorse");
		itemBeverageWhitePort = new ItemBeverageAlcohol(BandbBeverages.itemBottleBordeauxChateauLary).setUnlocalizedName("itemBeverageWhitePort").setTextureName(Bandb_mod.MODID + ":beverage/itemWhitePort");
		itemBeverageBordeauxChateauLary = new ItemBeverageAlcohol(BandbBeverages.itemBottleBordeauxChateauLary).setUnlocalizedName("itemBeverageBordeauxChateauLary").setTextureName(Bandb_mod.MODID + ":beverage/itemBordeauxChateauLary");
		itemBeverageBordeauxChateauTourVerite = new ItemBeverageAlcohol(BandbBeverages.itemBottleBordeauxChateauTourVerite).setUnlocalizedName("itemBeverageBordeauxChateauTourVerite").setTextureName(Bandb_mod.MODID + ":beverage/itemBordeauxChateauTourVerite");
		itemBeverageBrownRum = new ItemBeverageRum().setUnlocalizedName("itemBeverageBrownRum").setTextureName(Bandb_mod.MODID + ":beverage/itemBrownRum");
		
		itemBeverageCalvados = new ItemBeverageAlcoholStrong(BandbBeverages.itemBottleCalvados).setUnlocalizedName("itemBeverageCalvados").setTextureName(Bandb_mod.MODID + ":beverage/itemCalvados");
		itemBeverageChouchen = new ItemBeverageAlcoholStrong(BandbBeverages.itemBottleChouchen).setUnlocalizedName("itemBeverageChouchen").setTextureName(Bandb_mod.MODID + ":beverage/itemChouchen");
		itemBeverageCiderKerne = new ItemBeverageAlcohol(BandbBeverages.itemBottleCiderKerne).setUnlocalizedName("itemBeverageCiderKerne").setTextureName(Bandb_mod.MODID + ":beverage/itemCiderKerne");
		itemBeverageCognac = new ItemBeverageAlcoholStrong(BandbBeverages.itemBottleCognac).setUnlocalizedName("itemBeverageCognac").setTextureName(Bandb_mod.MODID + ":beverage/itemCognac");
		itemBeverageGin = new ItemBeverageAlcoholStrong(BandbBeverages.itemBottleGin).setUnlocalizedName("itemBeverageGin").setTextureName(Bandb_mod.MODID + ":beverage/itemGin");

		GameRegistry.registerItem(itemBeverageCapCorse, "itemBeverageCapCorse");
		GameRegistry.registerItem(itemBeverageWhitePort, "itemBeverageWhitePort");
		GameRegistry.registerItem(itemBeverageBordeauxChateauLary, "itemBeverageBordeauxChateauLary");
		GameRegistry.registerItem(itemBeverageBordeauxChateauTourVerite, "itemBeverageBordeauxChateauTourVerite");
		GameRegistry.registerItem(itemBeverageBrownRum, "itemBeverageBrownRum");

		GameRegistry.registerItem(itemBeverageCalvados, "itemBeverageCalvados");
		GameRegistry.registerItem(itemBeverageChouchen, "itemBeverageChouchen");
		GameRegistry.registerItem(itemBeverageCiderKerne, "itemBeverageCiderKerne");
		GameRegistry.registerItem(itemBeverageCognac, "itemBeverageCognac");
		GameRegistry.registerItem(itemBeverageGin, "itemBeverageGin");

		itemBeverageLambig = new ItemBeverageAlcoholStrong(BandbBeverages.itemBottleLambig).setUnlocalizedName("itemBeverageLambig").setTextureName(Bandb_mod.MODID + ":beverage/itemLambig");
		itemBeveragePastis51 = new ItemBeverageAlcoholStrong(BandbBeverages.itemBottlePastis51).setUnlocalizedName("itemBeveragePastis51").setTextureName(Bandb_mod.MODID + ":beverage/itemPastis51");
		itemBeverageWhiteRum = new ItemBeverageRum().setUnlocalizedName("itemBottleRum").setTextureName(Bandb_mod.MODID + ":beverage/itemWhiteRum");
		itemBeveragePommeau = new ItemBeverageAlcoholStrong(BandbBeverages.itemBottlePommeau).setUnlocalizedName("itemBeveragePommeau").setTextureName(Bandb_mod.MODID + ":beverage/itemPommeau");
		itemBeverageRedMartini = new ItemBeverageAlcohol(BandbBeverages.itemBottleRedMartini).setUnlocalizedName("itemBeverageRedMartini").setTextureName(Bandb_mod.MODID + ":beverage/itemRedMartini");

		itemBeverageRedPort = new ItemBeverageAlcoholStrong(BandbBeverages.itemBottleRedPort).setUnlocalizedName("itemBeverageRedPort").setTextureName(Bandb_mod.MODID + ":beverage/itemRedPort");
		itemBeverageTequila = new ItemBeverageAlcoholStrong(BandbBeverages.itemBottleTequila).setUnlocalizedName("itemBeverageTequila").setTextureName(Bandb_mod.MODID + ":beverage/itemTequila");
		itemBeverageVodka = new ItemBeverageVodka(BandbBeverages.itemBottleVodka).setUnlocalizedName("itemBeverageVodka").setTextureName(Bandb_mod.MODID + ":beverage/itemVodka");
		itemBeverageWhiskey = new ItemBeverageAlcoholStrong(BandbBeverages.itemBottleWhiskey).setUnlocalizedName("itemBeverageWhiskey").setTextureName(Bandb_mod.MODID + ":beverage/itemWhiskey");
		itemBeverageWhiteMartini = new ItemBeverageAlcohol(BandbBeverages.itemBottleWhiteMartini).setUnlocalizedName("itemBeverageWhiteMartini").setTextureName(Bandb_mod.MODID + ":beverage/itemWhiteMartini");
		
		GameRegistry.registerItem(itemBeverageLambig, "itemBeverageLambig");
		GameRegistry.registerItem(itemBeveragePastis51, "itemBeveragePastis51");
		GameRegistry.registerItem(itemBeverageWhiteRum, "itemBeverageWhiteRum");
		GameRegistry.registerItem(itemBeveragePommeau, "itemBeveragePommeau");
		GameRegistry.registerItem(itemBeverageRedMartini, "itemBeverageRedMartini");

		GameRegistry.registerItem(itemBeverageRedPort, "itemBeverageRedPort");
		GameRegistry.registerItem(itemBeverageTequila, "itemBeverageTequila");
		GameRegistry.registerItem(itemBeverageVodka, "itemBeverageVodka");
		GameRegistry.registerItem(itemBeverageWhiskey, "itemBeverageWhiskey");
		GameRegistry.registerItem(itemBeverageWhiteMartini, "itemBeverageWhiteMartini");
		
		itemBeverageAmaretto = new ItemBeverageAlcoholStrong(BandbBeverages.itemBottleAmaretto).setUnlocalizedName("itemBeverageAmaretto").setTextureName(Bandb_mod.MODID + ":beverage/itemAmaretto");
		itemBeverageBitter = new ItemBeverageAlcohol(BandbBeverages.itemBottleBitter).setUnlocalizedName("itemBeverageBitter").setTextureName(Bandb_mod.MODID + ":beverage/itemBitter");
		itemBeverageBlueCuracao = new ItemBeverageAlcoholStrong(BandbBeverages.itemBottleBlueCaracao).setUnlocalizedName("itemBeverageBlueCuracao").setTextureName(Bandb_mod.MODID + ":beverage/itemBlueCuracao");
		itemBeverageCuracaoTripleSec = new ItemBeverageAlcohol(BandbBeverages.itemBottleCuracaoTripleSec).setUnlocalizedName("itemBeverageCuracaoTripleSec").setTextureName(Bandb_mod.MODID + ":beverage/itemCuracaoTripleSec");
		itemBeveragePetrus = new ItemBeverageAlcohol(BandbBeverages.itemBottlePetrus).setUnlocalizedName("itemBeveragePetrus").setTextureName(Bandb_mod.MODID + ":beverage/itemPetrus");
		
		GameRegistry.registerItem(itemBeverageAmaretto, "itemBeverageAmaretto");
		GameRegistry.registerItem(itemBeverageBitter, "itemBeverageBitter");
		GameRegistry.registerItem(itemBeverageBlueCuracao, "itemBeverageBlueCuracao");
		GameRegistry.registerItem(itemBeverageCuracaoTripleSec, "itemBeverageCuracaoTripleSec");
		GameRegistry.registerItem(itemBeveragePetrus, "itemBeveragePetrus");
		
		itemBeverageAngosturaBitter = new ItemBeverageAlcohol(BandbBeverages.itemBottleAngosturaBitter).setUnlocalizedName("itemBeverageAngosturaBitter").setTextureName(Bandb_mod.MODID + ":beverage/itemAngosturaBitter");
		itemBeverageWorcestershireSauce = new ItemBeverageAlcohol(BandbBeverages.itemBottleWorcestershireSauce).setUnlocalizedName("itemBeverageWorcestershireSauce").setTextureName(Bandb_mod.MODID + ":beverage/itemWorcestershireSauce");
		itemBeverageTabasco = new ItemBeverageAlcohol(BandbBeverages.itemBottleTabasco).setUnlocalizedName("itemBeverageTabasco").setTextureName(Bandb_mod.MODID + ":beverage/itemTabasco");
		itemBeverageDubonnetRouge = new ItemBeverageAlcohol(BandbBeverages.itemBottleDubonnetRouge).setUnlocalizedName("itemBeverageDubonnetRouge").setTextureName(Bandb_mod.MODID + ":beverage/itemDubonnetRouge");
		itemBeveragePontarlier = new ItemBeverageAlcohol(BandbBeverages.itemBottlePontarlier).setUnlocalizedName("itemBeveragePontarlier").setTextureName(Bandb_mod.MODID + ":beverage/itemPontarlier");
		
		GameRegistry.registerItem(itemBeverageAngosturaBitter, "itemBeverageAngosturaBitter");
		GameRegistry.registerItem(itemBeverageWorcestershireSauce, "itemBeverageWorcestershireSauce");
		GameRegistry.registerItem(itemBeverageTabasco, "itemBeverageTabasco");
		GameRegistry.registerItem(itemBeverageDubonnetRouge, "itemBeverageDubonnetRouge");
		GameRegistry.registerItem(itemBeveragePontarlier, "itemBeveragePontarlier");
		
		itemBeverageBenedictine = new ItemBeverageAlcohol(BandbBeverages.itemBottleBenedictine).setUnlocalizedName("itemBeverageBenedictine").setTextureName(Bandb_mod.MODID + ":beverage/itemBenedictine");
		itemBeverageCampari = new ItemBeverageAlcohol(BandbBeverages.itemBottleCampari).setUnlocalizedName("itemBeverageCampari").setTextureName(Bandb_mod.MODID + ":beverage/itemCampari");
		itemBeverageHeineken = new ItemBeverageAlcohol(BandbBeverages.itemBottleHeineken).setUnlocalizedName("itemBeverageHeineken").setTextureName(Bandb_mod.MODID + ":beverage/itemHeineken");
		itemBeverageGrandMarnier = new ItemBeverageAlcohol(BandbBeverages.itemBottleGrandMarnier).setUnlocalizedName("itemBeverageGrandMarnier").setTextureName(Bandb_mod.MODID + ":beverage/itemGrandMarnier");
		itemBeverageChartreuseJaune = new ItemBeverageAlcohol(BandbBeverages.itemBottleChartreuseJaune).setUnlocalizedName("itemBeverageChartreuseJaune").setTextureName(Bandb_mod.MODID + ":beverage/itemChartreuseJaune");
		
		GameRegistry.registerItem(itemBeverageBenedictine, "itemBeverageBenedictine");
		GameRegistry.registerItem(itemBeverageCampari, "itemBeverageCampari");
		GameRegistry.registerItem(itemBeverageHeineken, "itemBeverageHeineken");
		GameRegistry.registerItem(itemBeverageGrandMarnier, "itemBeverageGrandMarnier");
		GameRegistry.registerItem(itemBeverageChartreuseJaune, "itemBeverageChartreuseJaune");
		
		itemBeverageChartreuseVerte = new ItemBeverageAlcohol(BandbBeverages.itemBottleChartreuseVerte).setUnlocalizedName("itemBeverageChartreuseVerte").setTextureName(Bandb_mod.MODID + ":beverage/itemChartreuseVerte");
		itemBeverageCuracaoOrange = new ItemBeverageAlcohol(BandbBeverages.itemBottleCuracaoOrange).setUnlocalizedName("itemBeverageCuracaoOrange").setTextureName(Bandb_mod.MODID + ":beverage/itemCuracaoOrange");
		itemBeverageDrambuie = new ItemBeverageAlcohol(BandbBeverages.itemBottleDrambuie).setUnlocalizedName("itemBeverageDrambuie").setTextureName(Bandb_mod.MODID + ":beverage/itemDrambuie");
		itemBeverageBaileys = new ItemBeverageAlcohol(BandbBeverages.itemBottleBaileys).setUnlocalizedName("itemBeverageBaileys").setTextureName(Bandb_mod.MODID + ":beverage/itemBaileys");
		itemBeverageXeres = new ItemBeverageAlcohol(BandbBeverages.itemBottleXeres).setUnlocalizedName("itemBeverageXeres").setTextureName(Bandb_mod.MODID + ":beverage/itemXeres");
		
		GameRegistry.registerItem(itemBeverageChartreuseVerte, "itemBeverageChartreuseVerte");
		GameRegistry.registerItem(itemBeverageCuracaoOrange, "itemBeverageCuracaoOrange");
		GameRegistry.registerItem(itemBeverageDrambuie, "itemBeverageDrambuie");
		GameRegistry.registerItem(itemBeverageBaileys, "itemBeverageBaileys");
		GameRegistry.registerItem(itemBeverageXeres, "itemBeverageXeres");
		
		itemBeveragePisco = new ItemBeverageAlcohol(BandbBeverages.itemBottlePisco).setUnlocalizedName("itemBeveragePisco").setTextureName(Bandb_mod.MODID + ":beverage/itemPisco");
		itemBeverageFernetBranca = new ItemBeverageAlcohol(BandbBeverages.itemBottleFernetBranca).setUnlocalizedName("itemBeverageFernetBranca").setTextureName(Bandb_mod.MODID + ":beverage/itemFernetBranca");
		itemBeverageChampagneMumm = new ItemBeverageAlcohol(BandbBeverages.itemBottleChampagneMumm).setUnlocalizedName("itemBeverageChampagneMumm").setTextureName(Bandb_mod.MODID + ":beverage/itemChampagneMumm");
		itemBeverageGuinness = new ItemBeverageAlcohol(BandbBeverages.itemBottleGuinness).setUnlocalizedName("itemBeverageGuinness").setTextureName(Bandb_mod.MODID + ":beverage/itemGuinness");
		itemBeverageBourgogneAligote = new ItemBeverageAlcohol(BandbBeverages.itemBottleBourgogneAligote).setUnlocalizedName("itemBeverageBourgogneAligote").setTextureName(Bandb_mod.MODID + ":beverage/itemBourgogneAligote");
		
		GameRegistry.registerItem(itemBeveragePisco, "itemBeveragePisco");
		GameRegistry.registerItem(itemBeverageFernetBranca, "itemBeverageFernetBranca");
		GameRegistry.registerItem(itemBeverageChampagneMumm, "itemBeverageChampagneMumm");
		GameRegistry.registerItem(itemBeverageGuinness, "itemBeverageGuinness");
		GameRegistry.registerItem(itemBeverageBourgogneAligote, "itemBeverageBourgogneAligote");
		
		itemBeverageAlsaceRiesling = new ItemBeverageAlcohol(BandbBeverages.itemBottleAlsaceRiesling).setUnlocalizedName("itemBeverageAlsaceRiesling").setTextureName(Bandb_mod.MODID + ":beverage/itemAlsaceRiesling");
		itemBeverageEnate = new ItemBeverageAlcohol(BandbBeverages.itemBottleEnate).setUnlocalizedName("itemBeverageEnate").setTextureName(Bandb_mod.MODID + ":beverage/itemEnate");
		itemBeverageSouthernComfort = new ItemBeverageAlcohol(BandbBeverages.itemBottleSouthernComfort).setUnlocalizedName("itemBeverageSouthernComfort").setTextureName(Bandb_mod.MODID + ":beverage/itemSouthernComfort");
		itemBeverageGet27 = new ItemBeverageAlcohol(BandbBeverages.itemBottleGet27).setUnlocalizedName("itemBeverageGet27").setTextureName(Bandb_mod.MODID + ":beverage/itemBeverageGet27");
			
		GameRegistry.registerItem(itemBeverageAlsaceRiesling, "itemBeverageAlsaceRiesling");
		GameRegistry.registerItem(itemBeverageEnate, "itemBeverageEnate");
		GameRegistry.registerItem(itemBeverageSouthernComfort, "itemBeverageSouthernComfort");		
		GameRegistry.registerItem(itemBeverageGet27, "itemBeverageGet27");		
		
		itemBeverage1664 = new ItemBeverageAlcohol(BandbBeverages.itemBottle1664).setUnlocalizedName("itemBeverage1664").setTextureName(Bandb_mod.MODID + ":beverage/itemBeverage1664");
		itemBeverageBritt = new ItemBeverageAlcohol(BandbBeverages.itemBottleBritt).setUnlocalizedName("itemBeverageBritt").setTextureName(Bandb_mod.MODID + ":beverage/itemBeverageBritt");
		itemBeverageDesperados = new ItemBeverageAlcohol(BandbBeverages.itemBottleDesperados).setUnlocalizedName("itemBeverageDesperados").setTextureName(Bandb_mod.MODID + ":beverage/itemBeverageDesperados");
		itemBeverageDuvel = new ItemBeverageAlcohol(BandbBeverages.itemBottleDuvel).setUnlocalizedName("itemBeverageDuvel").setTextureName(Bandb_mod.MODID + ":beverage/itemBeverageDuvel");
		itemBeverageGrimbergen = new ItemBeverageAlcohol(BandbBeverages.itemBottleGrimbergen).setUnlocalizedName("itemBeverageGrimbergen").setTextureName(Bandb_mod.MODID + ":beverage/itemBeverageGrimbergen");
		
		GameRegistry.registerItem(itemBeverage1664, "itemBeverage1664");
		GameRegistry.registerItem(itemBeverageBritt, "itemBeverageBritt");
		GameRegistry.registerItem(itemBeverageDesperados, "itemBeverageDesperados");
		GameRegistry.registerItem(itemBeverageDuvel, "itemBeverageDuvel");
		GameRegistry.registerItem(itemBeverageGrimbergen, "itemBeverageGrimbergen");
	
		itemBeverageLeffe = new ItemBeverageAlcohol(BandbBeverages.itemBottleLeffe).setUnlocalizedName("itemBeverageLeffe").setTextureName(Bandb_mod.MODID + ":beverage/itemBeverageLeffe");
		itemBeverageSanMiguel = new ItemBeverageAlcohol(BandbBeverages.itemBottleSanMiguel).setUnlocalizedName("itemBeverageSanMiguel").setTextureName(Bandb_mod.MODID + ":beverage/itemBeverageSanMiguel");
		itemBeverageSkoll = new ItemBeverageAlcohol(BandbBeverages.itemBottleSkoll).setUnlocalizedName("itemBeverageSkoll").setTextureName(Bandb_mod.MODID + ":beverage/itemBeverageSkoll");
		itemBeverageSmirnoff = new ItemBeverageAlcohol(BandbBeverages.itemBottleSmirnoff).setUnlocalizedName("itemBeverageSmirnoff").setTextureName(Bandb_mod.MODID + ":beverage/itemBeverageSmirnoff");
		itemBeverageXII = new ItemBeverageAlcohol(BandbBeverages.itemBottleXII).setUnlocalizedName("itemBeverageXII").setTextureName(Bandb_mod.MODID + ":beverage/itemBeverageXII");
		
		GameRegistry.registerItem(itemBeverageLeffe, "itemBeverageLeffe");
		GameRegistry.registerItem(itemBeverageSanMiguel, "itemBeverageSanMiguel");
		GameRegistry.registerItem(itemBeverageSkoll, "itemBeverageSkoll");
		GameRegistry.registerItem(itemBeverageSmirnoff, "itemBeverageSmirnoff");
		GameRegistry.registerItem(itemBeverageXII, "itemBeverageXII");
	
		
			//Liqueur		
		itemLiqueurBlackcurrant = new ItemBeverageLiqueur().setUnlocalizedName("itemLiqueurBlackcurrant");
		itemLiqueurApricot = new ItemBeverageLiqueur().setUnlocalizedName("itemLiqueurApricot");
		itemLiqueurBanana = new ItemBeverageLiqueur().setUnlocalizedName("itemLiqueurBanana");
		itemLiqueurCherry = new ItemBeverageLiqueur().setUnlocalizedName("itemLiqueurCherry");
		itemLiqueurClementine = new ItemBeverageLiqueur().setUnlocalizedName("itemLiqueurClementine");		
		
		GameRegistry.registerItem(itemLiqueurBlackcurrant, "itemLiqueurBlackcurrant");
		GameRegistry.registerItem(itemLiqueurApricot, "itemLiqueurApricot");
		GameRegistry.registerItem(itemLiqueurBanana, "itemLiqueurBanana");
		GameRegistry.registerItem(itemLiqueurCherry, "itemLiqueurCherry");
		GameRegistry.registerItem(itemLiqueurClementine, "itemLiqueurClementine");
		
		itemLiqueurFig = new ItemBeverageLiqueur().setUnlocalizedName("itemLiqueurFig");
		itemLiqueurGuava = new ItemBeverageAlcohol(BandbBeverages.itemLiqueurGuava).setUnlocalizedName("itemLiqueurGuava").setTextureName(Bandb_mod.MODID + ":beverage/itemLiqueurGuava");
		itemLiqueurLemon = new ItemBeverageAlcohol(BandbBeverages.itemLiqueurLemon).setUnlocalizedName("itemLiqueurLemon").setTextureName(Bandb_mod.MODID + ":beverage/itemLiqueurLemon");
		itemLiqueurLime = new ItemBeverageAlcohol(BandbBeverages.itemLiqueurLime).setUnlocalizedName("itemLiqueurLime").setTextureName(Bandb_mod.MODID + ":beverage/itemLiqueurLime");
		itemLiqueurLychee = new ItemBeverageAlcohol(BandbBeverages.itemLiqueurLychee).setUnlocalizedName("itemLiqueurLychee").setTextureName(Bandb_mod.MODID + ":beverage/itemLiqueurLychee");			
		
		GameRegistry.registerItem(itemLiqueurFig, "itemLiqueurFig");
		GameRegistry.registerItem(itemLiqueurGuava, "itemLiqueurGuava");
		GameRegistry.registerItem(itemLiqueurLemon, "itemLiqueurLemon");
		GameRegistry.registerItem(itemLiqueurLime, "itemLiqueurLime");
		GameRegistry.registerItem(itemLiqueurLychee, "itemLiqueurLychee");
		
		itemLiqueurPassionFruit = new ItemBeverageAlcohol(BandbBeverages.itemLiqueurPassionFruit).setUnlocalizedName("itemLiqueurPassionFruit").setTextureName(Bandb_mod.MODID + ":beverage/itemLiqueurPassionFruit");
		itemLiqueurPomegranate = new ItemBeverageAlcohol(BandbBeverages.itemLiqueurPomegranate).setUnlocalizedName("itemLiqueurPomegranate").setTextureName(Bandb_mod.MODID + ":beverage/itemLiqueurPomegranate");
		itemLiqueurQuince = new ItemBeverageAlcohol(BandbBeverages.itemLiqueurQuince).setUnlocalizedName("itemLiqueurQuince").setTextureName(Bandb_mod.MODID + ":beverage/itemLiqueurQuince");
		itemLiqueurTangerine = new ItemBeverageAlcohol(BandbBeverages.itemLiqueurTangerine).setUnlocalizedName("itemLiqueurTangerine").setTextureName(Bandb_mod.MODID + ":beverage/itemLiqueurTangerine");
		itemLiqueurMango = new ItemBeverageAlcohol(BandbBeverages.itemLiqueurMango).setUnlocalizedName("itemLiqueurMango").setTextureName(Bandb_mod.MODID + ":beverage/itemLiqueurMango");			
		
		GameRegistry.registerItem(itemLiqueurPassionFruit, "itemLiqueurPassionFruit");
		GameRegistry.registerItem(itemLiqueurPomegranate, "itemLiqueurPomegranate");
		GameRegistry.registerItem(itemLiqueurQuince, "itemLiqueurQuince");
		GameRegistry.registerItem(itemLiqueurTangerine, "itemLiqueurTangerine");
		GameRegistry.registerItem(itemLiqueurMango, "itemLiqueurMango");
		
		itemLiqueurCherryPlum = new ItemBeverageAlcohol(BandbBeverages.itemLiqueurCherryPlum).setUnlocalizedName("itemLiqueurCherryPlum").setTextureName(Bandb_mod.MODID + ":beverage/itemLiqueurCherryPlum");
		itemLiqueurApple = new ItemBeverageAlcohol(BandbBeverages.itemLiqueurApple).setUnlocalizedName("itemLiqueurApple").setTextureName(Bandb_mod.MODID + ":beverage/itemLiqueurApple");
		itemLiqueurOrange = new ItemBeverageAlcohol(BandbBeverages.itemLiqueurOrange).setUnlocalizedName("itemLiqueurOrange").setTextureName(Bandb_mod.MODID + ":beverage/itemLiqueurOrange");
		itemLiqueurGrapefruit = new ItemBeverageAlcohol(BandbBeverages.itemLiqueurGrapefruit).setUnlocalizedName("itemLiqueurGrapefruit").setTextureName(Bandb_mod.MODID + ":beverage/itemLiqueurGrapefruit");
		itemLiqueurPeach = new ItemBeverageAlcohol(BandbBeverages.itemLiqueurPeach).setUnlocalizedName("itemLiqueurPeach").setTextureName(Bandb_mod.MODID + ":beverage/itemLiqueurPeach");			
		
		GameRegistry.registerItem(itemLiqueurCherryPlum, "itemLiqueurCherryPlum");
		GameRegistry.registerItem(itemLiqueurApple, "itemLiqueurApple");
		GameRegistry.registerItem(itemLiqueurOrange, "itemLiqueurOrange");
		GameRegistry.registerItem(itemLiqueurGrapefruit, "itemLiqueurGrapefruit");
		GameRegistry.registerItem(itemLiqueurPeach, "itemLiqueurPeach");
		
		itemLiqueurStrawberry = new ItemBeverageAlcohol(BandbBeverages.itemLiqueurStrawberry).setUnlocalizedName("itemLiqueurStrawberry").setTextureName(Bandb_mod.MODID + ":beverage/itemLiqueurStrawberry");
		itemLiqueurBlackberry = new ItemBeverageAlcohol(BandbBeverages.itemLiqueurBlackberry).setUnlocalizedName("itemLiqueurBlackberry").setTextureName(Bandb_mod.MODID + ":beverage/itemLiqueurBlackberry");
		itemLiqueurBlueberry = new ItemBeverageAlcohol(BandbBeverages.itemLiqueurBlueberry).setUnlocalizedName("itemLiqueurBlueberry").setTextureName(Bandb_mod.MODID + ":beverage/itemLiqueurBlueberry");
		itemLiqueurRaspberry = new ItemBeverageAlcohol(BandbBeverages.itemLiqueurRaspberry).setUnlocalizedName("itemLiqueurRaspberry").setTextureName(Bandb_mod.MODID + ":beverage/itemLiqueurRaspberry");
		itemLiqueurCranberry = new ItemBeverageAlcohol(BandbBeverages.itemLiqueurCranberry).setUnlocalizedName("itemLiqueurCranberry").setTextureName(Bandb_mod.MODID + ":beverage/itemLiqueurCranberry");			
		
		GameRegistry.registerItem(itemLiqueurStrawberry, "itemLiqueurStrawberry");
		GameRegistry.registerItem(itemLiqueurBlackberry, "itemLiqueurBlackberry");
		GameRegistry.registerItem(itemLiqueurBlueberry, "itemLiqueurBlueberry");
		GameRegistry.registerItem(itemLiqueurRaspberry, "itemLiqueurRaspberry");
		GameRegistry.registerItem(itemLiqueurCranberry, "itemLiqueurCranberry");
		
		itemLiqueurPlum = new ItemBeverageAlcohol(BandbBeverages.itemLiqueurPlum).setUnlocalizedName("itemLiqueurPlum").setTextureName(Bandb_mod.MODID + ":beverage/itemLiqueurPlum");
		itemLiqueurCoffee = new ItemBeverageAlcohol(BandbBeverages.itemLiqueurCoffee).setUnlocalizedName("itemLiqueurCoffee").setTextureName(Bandb_mod.MODID + ":beverage/itemLiqueurCoffee");
		itemLiqueurPineapple = new ItemBeverageAlcohol(BandbBeverages.itemLiqueurPineapple).setUnlocalizedName("itemLiqueurPineapple").setTextureName(Bandb_mod.MODID + ":beverage/itemLiqueurPineapple");
		itemLiqueurKiwi = new ItemBeverageAlcohol(BandbBeverages.itemLiqueurKiwi).setUnlocalizedName("itemLiqueurKiwi").setTextureName(Bandb_mod.MODID + ":beverage/itemLiqueurKiwi");
		itemLiqueurPlantain = new ItemBeverageAlcohol(BandbBeverages.itemLiqueurPlantain).setUnlocalizedName("itemLiqueurPlantain").setTextureName(Bandb_mod.MODID + ":beverage/itemLiqueurPlantain");			
		
		GameRegistry.registerItem(itemLiqueurPlum, "itemLiqueurPlum");
		GameRegistry.registerItem(itemLiqueurCoffee, "itemLiqueurCoffee");
		GameRegistry.registerItem(itemLiqueurPineapple, "itemLiqueurPineapple");
		GameRegistry.registerItem(itemLiqueurKiwi, "itemLiqueurKiwi");
		GameRegistry.registerItem(itemLiqueurPlantain, "itemLiqueurPlantain");
		
		itemLiqueurGrape = new ItemBeverageAlcohol(BandbBeverages.itemLiqueurGrape).setUnlocalizedName("itemLiqueurGrape").setTextureName(Bandb_mod.MODID + ":beverage/itemLiqueurGrape");
		itemLiqueurWhitePeach = new ItemBeverageAlcohol(BandbBeverages.itemLiqueurWhitePeach).setUnlocalizedName("itemLiqueurWhitePeach").setTextureName(Bandb_mod.MODID + ":beverage/itemLiqueurWhitePeach");
		itemLiqueurMelon = new ItemBeverageAlcohol(BandbBeverages.itemLiqueurMelon).setUnlocalizedName("itemLiqueurMelon").setTextureName(Bandb_mod.MODID + ":beverage/itemLiqueurMelon");
		itemLiqueurHoney = new ItemBeverageAlcohol(BandbBeverages.itemLiqueurHoney).setUnlocalizedName("itemLiqueurHoney").setTextureName(Bandb_mod.MODID + ":beverage/itemLiqueurHoney");
		itemLiqueurCacao = new ItemBeverageAlcohol(BandbBeverages.itemLiqueurCacao).setUnlocalizedName("itemLiqueurCacao").setTextureName(Bandb_mod.MODID + ":beverage/itemLiqueurCacao");
		
		itemLiqueurMint = new ItemBeverageAlcohol(BandbBeverages.itemLiqueurMint).setUnlocalizedName("itemLiqueurMint").setTextureName(Bandb_mod.MODID + ":beverage/itemLiqueurMint");
		itemLiqueurCoco = new ItemBeverageAlcohol(BandbBeverages.itemLiqueurCoco).setUnlocalizedName("itemLiqueurCoco").setTextureName(Bandb_mod.MODID + ":beverage/itemLiqueurCoco");
		
		GameRegistry.registerItem(itemLiqueurGrape, "itemLiqueurGrape");
		GameRegistry.registerItem(itemLiqueurWhitePeach, "itemLiqueurWhitePeach");
		GameRegistry.registerItem(itemLiqueurMelon, "itemLiqueurMelon");
		GameRegistry.registerItem(itemLiqueurHoney, "itemLiqueurHoney");
		GameRegistry.registerItem(itemLiqueurCacao, "itemLiqueurCacao");
		
		GameRegistry.registerItem(itemLiqueurMint, "itemLiqueurMint");
		GameRegistry.registerItem(itemLiqueurCoco, "itemLiqueurCoco");		
		
			//brandy
		itemBrandyApple = new ItemBeverageBrandy().setUnlocalizedName("itemBrandyApple").setTextureName(Bandb_mod.MODID + ":beverage/itemAppleBrandy");
		itemBrandyApricot = new ItemBeverageBrandy().setUnlocalizedName("itemBrandyApricot").setTextureName(Bandb_mod.MODID + ":beverage/itemApricotBrandy");
		itemBananaBrandy = new ItemBeverageBrandy().setUnlocalizedName("itemBananaBrandy").setTextureName(Bandb_mod.MODID + ":beverage/itemBananaBrandy");
		itemBrandyBlackberry = new ItemBeverageBrandy().setUnlocalizedName("itemBrandyBlackberry").setTextureName(Bandb_mod.MODID + ":beverage/itemBlackberryBrandy");
		itemBrandyBlackcurrant = new ItemBeverageBrandy().setUnlocalizedName("itemBrandyBlackcurrant").setTextureName(Bandb_mod.MODID + ":beverage/itemBlackcurrantBrandy");
		
		itemBrandyBlueberry = new ItemBeverageBrandy().setUnlocalizedName("itemBrandyBlueberry").setTextureName(Bandb_mod.MODID + ":beverage/itemBlueberryBrandy");
		itemBrandyCherry = new ItemBeverageBrandy().setUnlocalizedName("itemBrandyCherry").setTextureName(Bandb_mod.MODID + ":beverage/itemCherryBrandy");
		itemBrandyClementine = new ItemBeverageBrandy().setUnlocalizedName("itemBrandyClementine").setTextureName(Bandb_mod.MODID + ":beverage/itemClementineBrandy");
		itemBrandyCoconut = new ItemBeverageBrandy().setUnlocalizedName("itemBrandyCoconut").setTextureName(Bandb_mod.MODID + ":beverage/itemCoconutBrandy");
		itemBrandyCranberry = new ItemBeverageBrandy().setUnlocalizedName("itemBrandyCranberry").setTextureName(Bandb_mod.MODID + ":beverage/itemCranberryBrandy");
	
		GameRegistry.registerItem(itemBrandyApple, "itemBrandyApple");
		GameRegistry.registerItem(itemBrandyApricot, "itemBrandyApricot");
		GameRegistry.registerItem(itemBananaBrandy, "itemBananaBrandy");
		GameRegistry.registerItem(itemBrandyBlackberry, "itemBrandyBlackberry");
		GameRegistry.registerItem(itemBrandyBlackcurrant, "itemBrandyBlackcurrant");
		
		GameRegistry.registerItem(itemBrandyBlueberry, "itemBrandyBlueberry");
		GameRegistry.registerItem(itemBrandyCherry, "itemBrandyCherry");
		GameRegistry.registerItem(itemBrandyClementine, "itemBrandyClementine");
		GameRegistry.registerItem(itemBrandyCoconut, "itemBrandyCoconut");
		GameRegistry.registerItem(itemBrandyCranberry, "itemBrandyCranberry");
	
		itemBrandyCurrant = new ItemBeverageBrandy().setUnlocalizedName("itemBrandyCurrant").setTextureName(Bandb_mod.MODID + ":beverage/itemCurrantBrandy");
		itemBrandyGoyava = new ItemBeverageBrandy().setUnlocalizedName("itemBrandyGoyava").setTextureName(Bandb_mod.MODID + ":beverage/itemGoyavaBrandy");
		itemBrandyGrapefruit = new ItemBeverageBrandy().setUnlocalizedName("itemBrandyGrapefruit").setTextureName(Bandb_mod.MODID + ":beverage/itemGrapefruitBrandy");
		itemBrandyKiwi = new ItemBeverageBrandy().setUnlocalizedName("itemBrandyKiwi").setTextureName(Bandb_mod.MODID + ":beverage/itemKiwiBrandy");
		itemBrandyLemon = new ItemBeverageBrandy().setUnlocalizedName("itemBrandyLemon").setTextureName(Bandb_mod.MODID + ":beverage/itemLemonBrandy");
		
		itemBrandyLime = new ItemBeverageBrandy().setUnlocalizedName("itemBrandyLime").setTextureName(Bandb_mod.MODID + ":beverage/itemLimeBrandy");
		itemBrandyLychee = new ItemBeverageBrandy().setUnlocalizedName("itemBrandyLychee").setTextureName(Bandb_mod.MODID + ":beverage/itemLycheeBrandy");
		itemBrandyMango = new ItemBeverageBrandy().setUnlocalizedName("itemBrandyMango").setTextureName(Bandb_mod.MODID + ":beverage/itemMangoBrandy");
		itemBrandyMirabelle = new ItemBeverageBrandy().setUnlocalizedName("itemBrandyMirabelle").setTextureName(Bandb_mod.MODID + ":beverage/itemMirabelleBrandy");
		itemBrandyOrange = new ItemBeverageBrandy().setUnlocalizedName("itemBrandyOrange").setTextureName(Bandb_mod.MODID + ":beverage/itemOrangeBrandy");
		
		GameRegistry.registerItem(itemBrandyCurrant, "itemBrandyCurrant");
		GameRegistry.registerItem(itemBrandyGoyava, "itemBrandyGoyava");
		GameRegistry.registerItem(itemBrandyGrapefruit, "itemBrandyGrapefruit");
		GameRegistry.registerItem(itemBrandyKiwi, "itemBrandyKiwi");
		GameRegistry.registerItem(itemBrandyLemon, "itemBrandyLemon");
		
		GameRegistry.registerItem(itemBrandyLime, "itemBrandyLime");
		GameRegistry.registerItem(itemBrandyLychee, "itemBrandyLychee");
		GameRegistry.registerItem(itemBrandyMango, "itemBrandyMango");
		GameRegistry.registerItem(itemBrandyMirabelle, "itemBrandyMirabelle");
		GameRegistry.registerItem(itemBrandyOrange, "itemBrandyOrange");
		
		itemBrandyPeach = new ItemBeverageBrandy().setUnlocalizedName("itemBrandyPeach").setTextureName(Bandb_mod.MODID + ":beverage/itemPeachBrandy");
		itemBrandyPear = new ItemBeverageBrandy().setUnlocalizedName("itemBrandyPear").setTextureName(Bandb_mod.MODID + ":beverage/itemPearBrandy");
		itemBrandyPineapple = new ItemBeverageBrandy().setUnlocalizedName("itemBrandyPineapple").setTextureName(Bandb_mod.MODID + ":beverage/itemPineappleBrandy");
		itemBrandyPlum = new ItemBeverageBrandy().setUnlocalizedName("itemBrandyPlum").setTextureName(Bandb_mod.MODID + ":beverage/itemPlumBrandy");
		itemBrandyRaspberry = new ItemBeverageBrandy().setUnlocalizedName("itemBrandyRaspberry").setTextureName(Bandb_mod.MODID + ":beverage/itemRaspberryBrandy");
	
		itemBrandyStrawsberry = new ItemBeverageBrandy().setUnlocalizedName("itemBrandyStrawsberry").setTextureName(Bandb_mod.MODID + ":beverage/itemStrawsberryBrandy");
		itemBrandyTangerine = new ItemBeverageBrandy().setUnlocalizedName("itemBrandyTangerine").setTextureName(Bandb_mod.MODID + ":beverage/itemTangerineBrandy");
	
		GameRegistry.registerItem(itemBrandyPeach, "itemBrandyPeach");
		GameRegistry.registerItem(itemBrandyPear, "itemBrandyPear");
		GameRegistry.registerItem(itemBrandyPineapple, "itemBrandyPineapple");
		GameRegistry.registerItem(itemBrandyPlum, "itemBrandyPlum");
		GameRegistry.registerItem(itemBrandyRaspberry, "itemBrandyRaspberry");
		
		GameRegistry.registerItem(itemBrandyStrawsberry, "itemBrandyStrawsberry");
		GameRegistry.registerItem(itemBrandyTangerine, "itemBrandyTangerine");		
		
		//Sweet
		itemBenturCola = new ItemBeverageSweet(BandbBeverages.itemBottleBenturCola).setUnlocalizedName("itemBenturCola").setTextureName(Bandb_mod.MODID + ":beverage/itemBenturCola");
		itemPerrier = new ItemBeverageSweet(BandbBeverages.itemBottlePerrier).setUnlocalizedName("itemPerrier").setTextureName(Bandb_mod.MODID + ":beverage/itemPerrier");
		itemFleurOranger = new ItemBeverageSweet(BandbBeverages.itemBottleFleurOranger).setUnlocalizedName("itemFleurOranger").setTextureName(Bandb_mod.MODID + ":beverage/itemFleurOranger");
		itemLimonade = new ItemBeverageSweet(BandbBeverages.itemBottleLimonade).setUnlocalizedName("itemLimonade").setTextureName(Bandb_mod.MODID + ":beverage/itemLimonade");
		itemSchweppesTonic = new ItemBeverageSweet(BandbBeverages.itemBottleSchweppesTonic).setUnlocalizedName("itemSchweppesTonic").setTextureName(Bandb_mod.MODID + ":beverage/itemSchweppesTonic");
		
		GameRegistry.registerItem(itemBenturCola, "itemBenturCola");
		GameRegistry.registerItem(itemPerrier, "itemPerrier");
		GameRegistry.registerItem(itemFleurOranger, "itemFleurOranger");
		GameRegistry.registerItem(itemLimonade, "itemLimonade");
		GameRegistry.registerItem(itemSchweppesTonic, "itemSchweppesTonic");
		
		itemSchweppesGingerAle = new ItemBeverageSweet(BandbBeverages.itemBottleSchweppesGingerAle).setUnlocalizedName("itemSchweppesGingerAle").setTextureName(Bandb_mod.MODID + ":beverage/itemSchweppesGingerAle");
		itemSchweppesAgrum = new ItemBeverageSweet(BandbBeverages.itemBottleSchweppesAgrum).setUnlocalizedName("itemSchweppesAgrum").setTextureName(Bandb_mod.MODID + ":beverage/itemSchweppesAgrum");
		itemSchweppesDarkSide = new ItemBeverageSweet(BandbBeverages.itemBottleSchweppesDarkSide).setUnlocalizedName("itemSchweppesDarkSide").setTextureName(Bandb_mod.MODID + ":beverage/itemSchweppesDarkSide");
		itemSchweppesLemon = new ItemBeverageSweet(BandbBeverages.itemBottleSchweppesLemon).setUnlocalizedName("itemSchweppesLemon").setTextureName(Bandb_mod.MODID + ":beverage/itemSchweppesLemon");
		itemSchweppesMango = new ItemBeverageSweet(BandbBeverages.itemBottleSchweppesMango).setUnlocalizedName("itemSchweppesMango").setTextureName(Bandb_mod.MODID + ":beverage/itemSchweppesMango");
			
		GameRegistry.registerItem(itemSchweppesGingerAle, "itemSchweppesGingerAle");
		GameRegistry.registerItem(itemSchweppesAgrum, "itemSchweppesAgrum");
		GameRegistry.registerItem(itemSchweppesDarkSide, "itemSchweppesDarkSide");
		GameRegistry.registerItem(itemSchweppesLemon, "itemSchweppesLemon");
		GameRegistry.registerItem(itemSchweppesMango, "itemSchweppesMango");
		
		itemSchweppesPamplemousse = new ItemBeverageSweet(BandbBeverages.itemBottleSchweppesPamplemousse).setUnlocalizedName("itemSchweppesPamplemousse").setTextureName(Bandb_mod.MODID + ":beverage/itemSchweppesPamplemousse");
		itemSchweppesPassion = new ItemBeverageSweet(BandbBeverages.itemBottleSchweppesPassion).setUnlocalizedName("itemSchweppesPassion").setTextureName(Bandb_mod.MODID + ":beverage/itemSchweppesPassion");
		itemSchweppesPech = new ItemBeverageSweet(BandbBeverages.itemBottleSchweppesPech).setUnlocalizedName("itemSchweppesPech").setTextureName(Bandb_mod.MODID + ":beverage/itemSchweppesPech");
		itemSchweppesPomme = new ItemBeverageSweet(BandbBeverages.itemBottleSchweppesPomme).setUnlocalizedName("itemSchweppesPomme").setTextureName(Bandb_mod.MODID + ":beverage/itemSchweppesPomme");
		itemSchweppesRicqles = new ItemBeverageSweet(BandbBeverages.itemBottleSchweppesRicqles).setUnlocalizedName("itemSchweppesRicqles").setTextureName(Bandb_mod.MODID + ":beverage/itemSchweppesRicqles");
			
		GameRegistry.registerItem(itemSchweppesPamplemousse, "itemSchweppesPamplemousse");
		GameRegistry.registerItem(itemSchweppesPassion, "itemSchweppesPassion");
		GameRegistry.registerItem(itemSchweppesPech, "itemSchweppesPech");
		GameRegistry.registerItem(itemSchweppesPomme, "itemSchweppesPomme");
		GameRegistry.registerItem(itemSchweppesRicqles, "itemSchweppesRicqles");
		
		itemBeverageSchweppesRaisin = new ItemBeverageSweet(BandbBeverages.itemBottleSchweppesRaisin).setUnlocalizedName("itemBeverageSchweppesRaisin").setTextureName(Bandb_mod.MODID + ":beverage/itemBeverageSchweppesRaisin");
		
		GameRegistry.registerItem(itemBeverageSchweppesRaisin, "itemBeverageSchweppesRaisin");
		
		//fruit juice						
			//Apple Juice
		itemJuiceAppleAntares = new ItemBeverageFruitJuice().setUnlocalizedName("itemJuiceAppleAntares").setTextureName(Bandb_mod.MODID + ":beverage/itemAppleAntaresJuice");
		itemJuiceAppleAriane = new ItemBeverageFruitJuice().setUnlocalizedName("itemJuiceAppleAriane").setTextureName(Bandb_mod.MODID + ":beverage/itemAppleArianeJuice");
		itemJuiceAppleBelchardChancelier = new ItemBeverageFruitJuice().setUnlocalizedName("itemJuiceAppleBelchardChancelier").setTextureName(Bandb_mod.MODID + ":beverage/itemAppleBelchardChancelierJuice");
		itemJuiceAppleBelleDeBoskoop = new ItemBeverageFruitJuice().setUnlocalizedName("itemJuiceAppleBelleDeBoskoop").setTextureName(Bandb_mod.MODID + ":beverage/itemAppleBelleDeBoskoopJuice");
		itemJuiceAppleBraeburn = new ItemBeverageFruitJuice().setUnlocalizedName("itemJuiceAppleBraeburn").setTextureName(Bandb_mod.MODID + ":beverage/itemAppleBraeburnJuice");

		itemJuiceAppleDuLimousin = new ItemBeverageFruitJuice().setUnlocalizedName("itemJuiceAppleDuLimousin").setTextureName(Bandb_mod.MODID + ":beverage/itemAppleDuLimousinJuice");
		itemJuiceAppleElstar = new ItemBeverageFruitJuice().setUnlocalizedName("itemJuiceAppleElstar").setTextureName(Bandb_mod.MODID + ":beverage/itemAppleElstarJuice");
		itemJuiceAppleFuji = new ItemBeverageFruitJuice().setUnlocalizedName("itemJuiceAppleFuji").setTextureName(Bandb_mod.MODID + ":beverage/itemAppleFujiJuice");
		itemJuiceAppleGala = new ItemBeverageFruitJuice().setUnlocalizedName("itemJuiceAppleGala").setTextureName(Bandb_mod.MODID + ":beverage/itemAppleGalaJuice");
		itemJuiceAppleGolden = new ItemBeverageFruitJuice().setUnlocalizedName("itemJuiceAppleGolden").setTextureName(Bandb_mod.MODID + ":beverage/itemAppleGoldenJuice");

		GameRegistry.registerItem(itemJuiceAppleAntares, "itemJuiceAppleAntares");
		GameRegistry.registerItem(itemJuiceAppleAriane, "itemJuiceAppleAriane");
		GameRegistry.registerItem(itemJuiceAppleBelchardChancelier, "itemJuiceAppleBelchardChancelier");
		GameRegistry.registerItem(itemJuiceAppleBelleDeBoskoop, "itemJuiceAppleBelleDeBoskoop");
		GameRegistry.registerItem(itemJuiceAppleBraeburn, "itemJuiceAppleBraeburn");

		GameRegistry.registerItem(itemJuiceAppleDuLimousin, "itemJuiceAppleDuLimousin");
		GameRegistry.registerItem(itemJuiceAppleElstar, "itemJuiceAppleElstar");
		GameRegistry.registerItem(itemJuiceAppleFuji, "itemJuiceAppleFuji");
		GameRegistry.registerItem(itemJuiceAppleGala, "itemJuiceAppleGala");
		GameRegistry.registerItem(itemJuiceAppleGolden, "itemJuiceAppleGolden");
	
		itemJuiceAppleGrannySmith = new ItemBeverageFruitJuice().setUnlocalizedName("itemJuiceAppleGrannySmith").setTextureName(Bandb_mod.MODID + ":beverage/itemAppleGrannySmithJuice");
		itemJuiceAppleHoneycrunch = new ItemBeverageFruitJuice().setUnlocalizedName("itemJuiceAppleHoneycrunch").setTextureName(Bandb_mod.MODID + ":beverage/itemAppleHoneycrunchJuice");
		itemJuiceAppleJazz = new ItemBeverageFruitJuice().setUnlocalizedName("itemJuiceAppleJazz").setTextureName(Bandb_mod.MODID + ":beverage/itemAppleJazzJuice");
		itemJuiceAppleJonagoldJonagored = new ItemBeverageFruitJuice().setUnlocalizedName("itemJuiceAppleJonagoldJonagored").setTextureName(Bandb_mod.MODID + ":beverage/itemAppleJonagoldJonagoredJuice");
		itemJuiceAppleLesRouges = new ItemBeverageFruitJuice().setUnlocalizedName("itemJuiceAppleLesRouges").setTextureName(Bandb_mod.MODID + ":beverage/itemAppleLesRougesJuice");

		itemJuiceApplePinkLady = new ItemBeverageFruitJuice().setUnlocalizedName("itemJuiceApplePinkLady").setTextureName(Bandb_mod.MODID + ":beverage/itemApplePinkLadyJuice");
		itemJuiceAppleReineDesReinettes = new ItemBeverageFruitJuice().setUnlocalizedName("itemJuiceAppleReineDesReinettes").setTextureName(Bandb_mod.MODID + ":beverage/itemAppleReineDesReinettesJuice");
		itemJuiceAppleReinetteGriseDuCanada = new ItemBeverageFruitJuice().setUnlocalizedName("itemJuiceAppleReinetteGriseDuCanada").setTextureName(Bandb_mod.MODID + ":beverage/itemAppleReinetteGriseDuCanadaJuice");
		itemJuiceAppleTentation = new ItemBeverageFruitJuice().setUnlocalizedName("itemJuiceAppleTentation").setTextureName(Bandb_mod.MODID + ":beverage/itemAppleTentationJuice");
			
		GameRegistry.registerItem(itemJuiceAppleGrannySmith, "itemJuiceAppleGrannySmith");
		GameRegistry.registerItem(itemJuiceAppleHoneycrunch, "itemJuiceAppleHoneycrunch");
		GameRegistry.registerItem(itemJuiceAppleJazz, "itemJuiceAppleJazz");
		GameRegistry.registerItem(itemJuiceAppleJonagoldJonagored, "itemJuiceAppleJonagoldJonagored");
		GameRegistry.registerItem(itemJuiceAppleLesRouges, "itemJuiceAppleLesRouges");

		GameRegistry.registerItem(itemJuiceApplePinkLady, "itemJuiceApplePinkLady");
		GameRegistry.registerItem(itemJuiceAppleReineDesReinettes, "itemJuiceAppleReineDesReinettes");
		GameRegistry.registerItem(itemJuiceAppleReinetteGriseDuCanada, "itemJuiceAppleReinetteGriseDuCanada");
		GameRegistry.registerItem(itemJuiceAppleTentation, "itemJuiceAppleTentation");
		
			//other					
		itemJuiceApricot = new ItemBeverageFruitJuice().setUnlocalizedName("itemJuiceApricot").setTextureName(Bandb_mod.MODID + ":beverage/itemApricotJuice");
		itemJuiceBanana = new ItemBeverageFruitJuice().setUnlocalizedName("itemJuiceBanana").setTextureName(Bandb_mod.MODID + ":beverage/itemBananaJuice");
		itemJuiceBlackberry = new ItemBeverageFruitJuice().setUnlocalizedName("itemJuiceBlackberry").setTextureName(Bandb_mod.MODID + ":beverage/itemBlackberryJuice");
		itemJuiceBlackCurrant = new ItemBeverageFruitJuice().setUnlocalizedName("itemJuiceBlackCurrant").setTextureName(Bandb_mod.MODID + ":beverage/itemBlackCurrantJuice");
		itemJuiceBlueberry = new ItemBeverageFruitJuice().setUnlocalizedName("itemJuiceBlueberry").setTextureName(Bandb_mod.MODID + ":beverage/itemBlueberryJuice");

		itemJuiceCarrot = new ItemBeverageFruitJuice().setUnlocalizedName("itemJuiceCarrot").setTextureName(Bandb_mod.MODID + ":beverage/itemCarrotJuice");
		itemJuiceCherry = new ItemBeverageFruitJuice().setUnlocalizedName("itemJuiceCherry").setTextureName(Bandb_mod.MODID + ":beverage/itemCherryJuice");
		itemJuiceClementine = new ItemBeverageFruitJuice().setUnlocalizedName("itemJuiceClementine").setTextureName(Bandb_mod.MODID + ":beverage/itemAppleTentationJuice");
		itemJuiceCranberry = new ItemBeverageFruitJuice().setUnlocalizedName("itemJuiceCranberry").setTextureName(Bandb_mod.MODID + ":beverage/itemCranberryJuice");
		itemJuiceCucumber = new ItemBeverageFruitJuice().setUnlocalizedName("itemJuiceCucumber").setTextureName(Bandb_mod.MODID + ":beverage/itemCucumberJuice");
		
		GameRegistry.registerItem(itemJuiceApricot, "itemJuiceApricot");
		GameRegistry.registerItem(itemJuiceBanana, "itemJuiceBanana");
		GameRegistry.registerItem(itemJuiceBlackberry, "itemJuiceBlackberry");
		GameRegistry.registerItem(itemJuiceBlackCurrant, "itemJuiceBlackCurrant");
		GameRegistry.registerItem(itemJuiceBlueberry, "itemJuiceBlueberry");

		GameRegistry.registerItem(itemJuiceCarrot, "itemJuiceCarrot");
		GameRegistry.registerItem(itemJuiceCherry, "itemJuiceCherry");
		GameRegistry.registerItem(itemJuiceClementine, "itemJuiceClementine");
		GameRegistry.registerItem(itemJuiceCranberry, "itemJuiceCranberry");
		GameRegistry.registerItem(itemJuiceCucumber, "itemJuiceCucumber");
		
		itemJuiceBloodOrange = new ItemBeverageFruitJuice().setUnlocalizedName("itemJuiceBloodOrange").setTextureName(Bandb_mod.MODID + ":beverage/itemBloodOrangeJuice");
		itemJuiceCherryPlum = new ItemBeverageFruitJuice().setUnlocalizedName("itemJuiceCherryPlum").setTextureName(Bandb_mod.MODID + ":beverage/itemCherryPlumJuice");
		itemJuiceCocoMilk = new ItemBeverageFruitJuice().setUnlocalizedName("itemJuiceCocoMilk").setTextureName(Bandb_mod.MODID + ":beverage/itemCocoMilk");
		itemJuiceGrapefruitPink = new ItemBeverageFruitJuice().setUnlocalizedName("itemJuiceGrapefruitPink").setTextureName(Bandb_mod.MODID + ":beverage/itemGrapefruitPinkJuice");
		itemJuiceGuava = new ItemBeverageFruitJuice().setUnlocalizedName("itemJuiceGuava").setTextureName(Bandb_mod.MODID + ":beverage/itemGuavaJuice");

		itemJuiceMorelloCherry = new ItemBeverageFruitJuice().setUnlocalizedName("itemJuiceMorelloCherry").setTextureName(Bandb_mod.MODID + ":beverage/itemMorelloCherryJuice");
		itemJuiceWildStrawberry = new ItemBeverageFruitJuice().setUnlocalizedName("itemJuiceWildStrawberry").setTextureName(Bandb_mod.MODID + ":beverage/itemWildStrawberryJuice");
		itemJuicePlantainBanana = new ItemBeverageFruitJuice().setUnlocalizedName("itemJuicePlantainBanana").setTextureName(Bandb_mod.MODID + ":beverage/itemPlantainBananaJuice");
		itemJuicePomegranate = new ItemBeverageFruitJuice().setUnlocalizedName("itemJuicePomegranate").setTextureName(Bandb_mod.MODID + ":beverage/itemPomegranateJuice");
		itemJuiceWhitePeach = new ItemBeverageFruitJuice().setUnlocalizedName("itemJuiceWhitePeach").setTextureName(Bandb_mod.MODID + ":beverage/itemWhitePeachJuice");
		
		GameRegistry.registerItem(itemJuiceBloodOrange, "itemJuiceBloodOrange");
		GameRegistry.registerItem(itemJuiceCherryPlum, "itemJuiceCherryPlum");
		GameRegistry.registerItem(itemJuiceCocoMilk, "itemJuiceCocoMilk");
		GameRegistry.registerItem(itemJuiceGrapefruitPink, "itemJuiceGrapefruitPink");
		GameRegistry.registerItem(itemJuiceGuava, "itemJuiceGuava");

		GameRegistry.registerItem(itemJuiceMorelloCherry, "itemJuiceMorelloCherry");
		GameRegistry.registerItem(itemJuiceWildStrawberry, "itemJuiceWildStrawberry");
		GameRegistry.registerItem(itemJuicePlantainBanana, "itemJuicePlantainBanana");
		GameRegistry.registerItem(itemJuicePomegranate, "itemJuicePomegranate");
		GameRegistry.registerItem(itemJuiceWhitePeach, "itemJuiceWhitePeach");
		
		itemJuiceCurrant = new ItemBeverageFruitJuice().setUnlocalizedName("itemJuiceCurrant").setTextureName(Bandb_mod.MODID + ":beverage/itemCurrantJuice");
		itemJuiceFig = new ItemBeverageFruitJuice().setUnlocalizedName("itemJuiceFig").setTextureName(Bandb_mod.MODID + ":beverage/itemFigJuice");
		itemJuiceGoava = new ItemBeverageFruitJuice().setUnlocalizedName("itemJuiceGoava").setTextureName(Bandb_mod.MODID + ":beverage/itemGuavaJuice");
		itemJuiceGrapefruit = new ItemBeverageFruitJuice().setUnlocalizedName("itemJuiceGrapefruit").setTextureName(Bandb_mod.MODID + ":beverage/itemGrapefruitJuice");
		itemJuiceKiwi = new ItemBeverageFruitJuice().setUnlocalizedName("itemJuiceKiwi").setTextureName(Bandb_mod.MODID + ":beverage/itemKiwiJuice");

		itemJuiceLemon = new ItemBeverageFruitJuice().setUnlocalizedName("itemJuiceLemon").setTextureName(Bandb_mod.MODID + ":beverage/itemLemonJuice");
		itemJuiceLime = new ItemBeverageFruitJuice().setUnlocalizedName("itemJuiceLime").setTextureName(Bandb_mod.MODID + ":beverage/itemLimeJuice");
		itemJuiceLychee = new ItemBeverageFruitJuice().setUnlocalizedName("itemJuiceLychee").setTextureName(Bandb_mod.MODID + ":beverage/itemLycheeJuice");
		itemJuiceMango = new ItemBeverageFruitJuice().setUnlocalizedName("itemJuiceMango").setTextureName(Bandb_mod.MODID + ":beverage/itemMangoJuice");
		itemJuiceMelon = new ItemBeverageFruitJuice().setUnlocalizedName("itemJuiceMelon").setTextureName(Bandb_mod.MODID + ":beverage/itemMelonJuice");
		
		GameRegistry.registerItem(itemJuiceCurrant, "itemJuiceCurrant");
		GameRegistry.registerItem(itemJuiceFig, "itemJuiceFig");
		GameRegistry.registerItem(itemJuiceGoava, "itemJuiceGoava");
		GameRegistry.registerItem(itemJuiceGrapefruit, "itemJuiceGrapefruit");
		GameRegistry.registerItem(itemJuiceKiwi, "itemJuiceKiwi");

		GameRegistry.registerItem(itemJuiceLemon, "itemJuiceLemon");
		GameRegistry.registerItem(itemJuiceLime, "itemJuiceLime");
		GameRegistry.registerItem(itemJuiceLychee, "itemJuiceLychee");
		GameRegistry.registerItem(itemJuiceMango, "itemJuiceMango");
		GameRegistry.registerItem(itemJuiceMelon, "itemJuiceMelon");

		itemJuiceMirabelle = new ItemBeverageFruitJuice().setUnlocalizedName("itemJuiceMirabelle").setTextureName(Bandb_mod.MODID + ":beverage/itemMirabelleJuice");
		itemJuiceOrange = new ItemBeverageFruitJuice().setUnlocalizedName("itemJuiceOrange").setTextureName(Bandb_mod.MODID + ":beverage/itemOrangeJuice");
		itemJuicePapaya = new ItemBeverageFruitJuice().setUnlocalizedName("itemJuicePapaya").setTextureName(Bandb_mod.MODID + ":beverage/itemPapayaJuice");
		itemJuicePassionfruit = new ItemBeverageFruitJuice().setUnlocalizedName("itemJuicePassionfruit").setTextureName(Bandb_mod.MODID + ":beverage/itemPassionFruitJuice");
		itemJuicePeach = new ItemBeverageFruitJuice().setUnlocalizedName("itemJuicePeach").setTextureName(Bandb_mod.MODID + ":beverage/itemPeachJuice");

		itemJuicePear = new ItemBeverageFruitJuice().setUnlocalizedName("itemJuicePear").setTextureName(Bandb_mod.MODID + ":beverage/itemPearJuice");
		itemJuicePineappleCayenneLisse = new ItemBeverageFruitJuice().setUnlocalizedName("itemJuicePineappleCayenneLisse").setTextureName(Bandb_mod.MODID + ":beverage/itemPineappleCayenneLisseJuice");
		itemJuicePineappleVictoria = new ItemBeverageFruitJuice().setUnlocalizedName("itemJuicePineappleVictoria").setTextureName(Bandb_mod.MODID + ":beverage/itemPineappleVictoriaJuice");
		itemJuicePlum = new ItemBeverageFruitJuice().setUnlocalizedName("itemJuicePlum").setTextureName(Bandb_mod.MODID + ":beverage/itemPlumJuice");
			
		GameRegistry.registerItem(itemJuiceMirabelle, "itemJuiceMirabelle");
		GameRegistry.registerItem(itemJuiceOrange, "itemJuiceOrange");
		GameRegistry.registerItem(itemJuicePapaya, "itemJuicePapaya");
		GameRegistry.registerItem(itemJuicePassionfruit, "itemJuicePassionfruit");
		GameRegistry.registerItem(itemJuicePeach, "itemJuicePeach");

		GameRegistry.registerItem(itemJuicePear, "itemJuicePear");
		GameRegistry.registerItem(itemJuicePineappleCayenneLisse, "itemJuicePineappleCayenneLisse");
		GameRegistry.registerItem(itemJuicePineappleVictoria, "itemJuicePineappleVictoria");
		GameRegistry.registerItem(itemJuicePlum, "itemJuicePlum");
		
		itemJuicePotato = new ItemBeverageFruitJuice().setUnlocalizedName("itemJuicePotato").setTextureName(Bandb_mod.MODID + ":beverage/itemPotatoJuice");
		itemJuicePricklyPear = new ItemBeverageFruitJuice().setUnlocalizedName("itemJuicePricklyPear").setTextureName(Bandb_mod.MODID + ":beverage/itemPricklyPearJuice");
		itemJuiceQuince = new ItemBeverageFruitJuice().setUnlocalizedName("itemJuiceQuince").setTextureName(Bandb_mod.MODID + ":beverage/itemQuinceJuice");
		itemJuiceRaspberry = new ItemBeverageFruitJuice().setUnlocalizedName("itemJuiceRaspberry").setTextureName(Bandb_mod.MODID + ":beverage/itemRaspberryJuice");
		itemJuiceRhubarb = new ItemBeverageFruitJuice().setUnlocalizedName("itemJuiceRhubarb").setTextureName(Bandb_mod.MODID + ":beverage/itemRhubarbJuice");

		itemJuiceStrawberry = new ItemBeverageFruitJuice().setUnlocalizedName("itemJuiceStrawberry").setTextureName(Bandb_mod.MODID + ":beverage/itemStrawberryJuice");
		itemJuiceTangerine = new ItemBeverageFruitJuice().setUnlocalizedName("itemJuiceTangerine").setTextureName(Bandb_mod.MODID + ":beverage/itemTangerineJuice");
		itemJuiceTomato = new ItemBeverageFruitJuice().setUnlocalizedName("itemJuiceTomato").setTextureName(Bandb_mod.MODID + ":beverage/itemTomatoJuice");
		itemJuiceWatermelon = new ItemBeverageFruitJuice().setUnlocalizedName("itemJuiceWatermelon").setTextureName(Bandb_mod.MODID + ":beverage/itemWatermelonJuice");
		itemJuiceMultifruit = new ItemBeverageFruitJuice().setUnlocalizedName("itemJuiceMultifruit").setTextureName(Bandb_mod.MODID + ":beverage/itemMultifruitJuice");

		GameRegistry.registerItem(itemJuicePotato, "itemJuicePotato");
		GameRegistry.registerItem(itemJuicePricklyPear, "itemJuicePricklyPear");
		GameRegistry.registerItem(itemJuiceQuince, "itemJuiceQuince");
		GameRegistry.registerItem(itemJuiceRaspberry, "itemJuiceRaspberry");
		GameRegistry.registerItem(itemJuiceRhubarb, "itemJuiceRhubarb");

		GameRegistry.registerItem(itemJuiceStrawberry, "itemJuiceStrawberry");
		GameRegistry.registerItem(itemJuiceTangerine, "itemJuiceTangerine");
		GameRegistry.registerItem(itemJuiceTomato, "itemJuiceTomato");
		GameRegistry.registerItem(itemJuiceWatermelon, "itemJuiceWatermelon");
		GameRegistry.registerItem(itemJuiceMultifruit, "itemJuiceMultifruit");
		
		
		itemJuicePassionFruit = new ItemBeverageFruitJuice().setUnlocalizedName("itemJuicePassionFruit").setTextureName(Bandb_mod.MODID + ":beverage/itemPassionFruitJuice");
		
		GameRegistry.registerItem(itemJuicePassionFruit, "itemJuicePassionFruit");
		
		
			//Grape Juice
		itemGrapeAbouriouJuice = new ItemBeverageGrape().setUnlocalizedName("itemGrapeAbouriouJuice").setTextureName(Bandb_mod.MODID + ":beverage/grape/itemGrapeAbouriouJuice");
		itemGrapeAleaticuJuice = new ItemBeverageGrape().setUnlocalizedName("itemGrapeAleaticuJuice").setTextureName(Bandb_mod.MODID + ":beverage/grape/itemGrapeAleaticuJuice");
		itemGrapeAligoteJuice = new ItemBeverageGrape().setUnlocalizedName("itemGrapeAligoteJuice").setTextureName(Bandb_mod.MODID + ":beverage/grape/itemGrapeAligoteJuice");
		itemGrapeAltesseJuice = new ItemBeverageGrape().setUnlocalizedName("itemGrapeAltesseJuice").setTextureName(Bandb_mod.MODID + ":beverage/grape/itemGrapeAltesseJuice");
		itemGrapeAramonJuice = new ItemBeverageGrape().setUnlocalizedName("itemGrapeAramonJuice").setTextureName(Bandb_mod.MODID + ":beverage/grape/itemGrapeAramonJuice");

    	GameRegistry.registerItem(itemGrapeAbouriouJuice, "itemGrapeAbouriouJuice");
    	GameRegistry.registerItem(itemGrapeAleaticuJuice, "itemGrapeAleaticuJuice");
    	GameRegistry.registerItem(itemGrapeAligoteJuice, "itemGrapeAligoteJuice");
    	GameRegistry.registerItem(itemGrapeAltesseJuice, "itemGrapeAltesseJuice");
    	GameRegistry.registerItem(itemGrapeAramonJuice, "itemGrapeAramonJuice");
    	
		itemGrapeArboisJuice = new ItemBeverageGrape().setUnlocalizedName("itemGrapeArboisJuice").setTextureName(Bandb_mod.MODID + ":beverage/grape/itemGrapeArboisJuice");
		itemGrapeArrufiacJuice = new ItemBeverageGrape().setUnlocalizedName("itemGrapeArrufiacJuice").setTextureName(Bandb_mod.MODID + ":beverage/grape/itemGrapeArrufiacJuice");
		itemGrapeAubinVertJuice = new ItemBeverageGrape().setUnlocalizedName("itemGrapeAubinVertJuice").setTextureName(Bandb_mod.MODID + ":beverage/grape/itemGrapeAubinVertJuice");
		itemGrapeBarbarossaJuice = new ItemBeverageGrape().setUnlocalizedName("itemGrapeBarbarossaJuice").setTextureName(Bandb_mod.MODID + ":beverage/grape/itemGrapeBarbarossaJuice");
		itemGrapeBergeronJuice = new ItemBeverageGrape().setUnlocalizedName("itemGrapeBergeronJuice").setTextureName(Bandb_mod.MODID + ":beverage/grape/itemGrapeBergeronJuice");

    	GameRegistry.registerItem(itemGrapeArboisJuice, "itemGrapeArboisJuice");
    	GameRegistry.registerItem(itemGrapeArrufiacJuice, "itemGrapeArrufiacJuice");
    	GameRegistry.registerItem(itemGrapeAubinVertJuice, "itemGrapeAubinVertJuice");
    	GameRegistry.registerItem(itemGrapeBarbarossaJuice, "itemGrapeBarbarossaJuice");
    	GameRegistry.registerItem(itemGrapeBergeronJuice, "itemGrapeBergeronJuice");
    	
		itemGrapeBianconeJuice = new ItemBeverageGrape().setUnlocalizedName("itemGrapeBianconeJuice").setTextureName(Bandb_mod.MODID + ":beverage/grape/itemGrapeBianconeJuice");
		itemGrapeBiancuGentileJuice = new ItemBeverageGrape().setUnlocalizedName("itemGrapeBiancuGentileJuice").setTextureName(Bandb_mod.MODID + ":beverage/grape/itemGrapeBiancuGentileJuice");
		itemGrapeBourboulencJuice = new ItemBeverageGrape().setUnlocalizedName("itemGrapeBourboulencJuice").setTextureName(Bandb_mod.MODID + ":beverage/grape/itemGrapeBourboulencJuice");
		itemGrapeBraquetJuice = new ItemBeverageGrape().setUnlocalizedName("itemGrapeBraquetJuice").setTextureName(Bandb_mod.MODID + ":beverage/grape/itemGrapeBraquetJuice");
		itemGrapeCabernetFrancJuice = new ItemBeverageGrape().setUnlocalizedName("itemGrapeCabernetFrancJuice").setTextureName(Bandb_mod.MODID + ":beverage/grape/itemGrapeCabernetFrancJuice");

    	GameRegistry.registerItem(itemGrapeBianconeJuice, "itemGrapeBianconeJuice");
    	GameRegistry.registerItem(itemGrapeBiancuGentileJuice, "itemGrapeBiancuGentileJuice");
    	GameRegistry.registerItem(itemGrapeBourboulencJuice, "itemGrapeBourboulencJuice");
    	GameRegistry.registerItem(itemGrapeBraquetJuice, "itemGrapeBraquetJuice");
    	GameRegistry.registerItem(itemGrapeCabernetFrancJuice, "itemGrapeCabernetFrancJuice");
    	
		itemGrapeCabernetSauvignonJuice = new ItemBeverageGrape().setUnlocalizedName("itemGrapeCabernetSauvignonJuice").setTextureName(Bandb_mod.MODID + ":beverage/grape/itemGrapeCabernetSauvignonJuice");
		itemGrapeCamareseJuice = new ItemBeverageGrape().setUnlocalizedName("itemGrapeCamareseJuice").setTextureName(Bandb_mod.MODID + ":beverage/grape/itemGrapeCamareseJuice");
		itemGrapeCarcaghjoluBiancuJuice = new ItemBeverageGrape().setUnlocalizedName("itemGrapeCarcaghjoluBiancuJuice").setTextureName(Bandb_mod.MODID + ":beverage/grape/itemGrapeCarcaghjoluBiancuJuice");
		itemGrapeCarcaghjoluNeruJuice = new ItemBeverageGrape().setUnlocalizedName("itemGrapeCarcaghjoluNeruJuice").setTextureName(Bandb_mod.MODID + ":beverage/grape/itemGrapeCarcaghjoluNeruJuice");
		itemGrapeCarignanJuice = new ItemBeverageGrape().setUnlocalizedName("itemGrapeCarignanJuice").setTextureName(Bandb_mod.MODID + ":beverage/grape/itemGrapeCarignanJuice");

    	GameRegistry.registerItem(itemGrapeCabernetSauvignonJuice, "itemGrapeCabernetSauvignonJuice");
    	GameRegistry.registerItem(itemGrapeCamareseJuice, "itemGrapeCamareseJuice");
    	GameRegistry.registerItem(itemGrapeCarcaghjoluBiancuJuice, "itemGrapeCarcaghjoluBiancuJuice");
    	GameRegistry.registerItem(itemGrapeCarcaghjoluNeruJuice, "itemGrapeCarcaghjoluNeruJuice");
    	GameRegistry.registerItem(itemGrapeCarignanJuice, "itemGrapeCarignanJuice");
    	
		itemGrapeCesarJuice = new ItemBeverageGrape().setUnlocalizedName("itemGrapeCesarJuice").setTextureName(Bandb_mod.MODID + ":beverage/grape/itemGrapeCesarJuice");
		itemGrapeChardonnayJuice = new ItemBeverageGrape().setUnlocalizedName("itemGrapeChardonnayJuice").setTextureName(Bandb_mod.MODID + ":beverage/grape/itemGrapeChardonnayJuice");
		itemGrapeCheninJuice = new ItemBeverageGrape().setUnlocalizedName("itemGrapeCheninJuice").setTextureName(Bandb_mod.MODID + ":beverage/grape/itemGrapeCheninJuice");
		itemGrapeCinsaultJuice = new ItemBeverageGrape().setUnlocalizedName("itemGrapeCinsaultJuice").setTextureName(Bandb_mod.MODID + ":beverage/grape/itemGrapeCinsaultJuice");
		itemGrapeClairetteJuice = new ItemBeverageGrape().setUnlocalizedName("itemGrapeClairetteJuice").setTextureName(Bandb_mod.MODID + ":beverage/grape/itemGrapeClairetteJuice");

    	GameRegistry.registerItem(itemGrapeCesarJuice, "itemGrapeCesarJuice");
    	GameRegistry.registerItem(itemGrapeChardonnayJuice, "itemGrapeChardonnayJuice");
    	GameRegistry.registerItem(itemGrapeCheninJuice, "itemGrapeCheninJuice");
    	GameRegistry.registerItem(itemGrapeCinsaultJuice, "itemGrapeCinsaultJuice");
    	GameRegistry.registerItem(itemGrapeClairetteJuice, "itemGrapeClairetteJuice");
    	
		itemGrapeColombardJuice = new ItemBeverageGrape().setUnlocalizedName("itemGrapeColombardJuice").setTextureName(Bandb_mod.MODID + ":beverage/grape/itemGrapeColombardJuice");
		itemGrapeCotJuice = new ItemBeverageGrape().setUnlocalizedName("itemGrapeCotJuice").setTextureName(Bandb_mod.MODID + ":beverage/grape/itemGrapeCotJuice");
		itemGrapeCounoiseJuice = new ItemBeverageGrape().setUnlocalizedName("itemGrapeCounoiseJuice").setTextureName(Bandb_mod.MODID + ":beverage/grape/itemGrapeCounoiseJuice");
		itemGrapeCourbuJuice = new ItemBeverageGrape().setUnlocalizedName("itemGrapeCourbuJuice").setTextureName(Bandb_mod.MODID + ":beverage/grape/itemGrapeCourbuJuice");
		itemGrapeCudivertaJuice = new ItemBeverageGrape().setUnlocalizedName("itemGrapeCudivertaJuice").setTextureName(Bandb_mod.MODID + ":beverage/grape/itemGrapeCudivertaJuice");

    	GameRegistry.registerItem(itemGrapeColombardJuice, "itemGrapeColombardJuice");
    	GameRegistry.registerItem(itemGrapeCotJuice, "itemGrapeCotJuice");
    	GameRegistry.registerItem(itemGrapeCounoiseJuice, "itemGrapeCounoiseJuice");
    	GameRegistry.registerItem(itemGrapeCourbuJuice, "itemGrapeCourbuJuice");
    	GameRegistry.registerItem(itemGrapeCudivertaJuice, "itemGrapeCudivertaJuice");
    	
		itemGrapeDurasJuice = new ItemBeverageGrape().setUnlocalizedName("itemGrapeDurasJuice").setTextureName(Bandb_mod.MODID + ":beverage/grape/itemGrapeDurasJuice");
		itemGrapeFerServadouJuice = new ItemBeverageGrape().setUnlocalizedName("itemGrapeFerServadouJuice").setTextureName(Bandb_mod.MODID + ":beverage/grape/itemGrapeFerServadouJuice");
		itemGrapeFolleBlancheJuice = new ItemBeverageGrape().setUnlocalizedName("itemGrapeFolleBlancheJuice").setTextureName(Bandb_mod.MODID + ":beverage/grape/itemGrapeFolleBlancheJuice");
		itemGrapeGamayJuice = new ItemBeverageGrape().setUnlocalizedName("itemGrapeGamayJuice").setTextureName(Bandb_mod.MODID + ":beverage/grape/itemGrapeGamayJuice");
		itemGrapeGewurztraminerJuice = new ItemBeverageGrape().setUnlocalizedName("itemGrapeGewurztraminerJuice").setTextureName(Bandb_mod.MODID + ":beverage/grape/itemGrapeGewurztraminerJuice");

    	GameRegistry.registerItem(itemGrapeDurasJuice, "itemGrapeDurasJuice");
    	GameRegistry.registerItem(itemGrapeFerServadouJuice, "itemGrapeFerServadouJuice");
    	GameRegistry.registerItem(itemGrapeFolleBlancheJuice, "itemGrapeFolleBlancheJuice");
    	GameRegistry.registerItem(itemGrapeGamayJuice, "itemGrapeGamayJuice");
    	GameRegistry.registerItem(itemGrapeGewurztraminerJuice, "itemGrapeGewurztraminerJuice");

		itemGrapeGrenacheJuice = new ItemBeverageGrape().setUnlocalizedName("itemGrapeGrenacheJuice").setTextureName(Bandb_mod.MODID + ":beverage/grape/itemGrapeGrenacheJuice");
		itemGrapeGrenacheBlancJuice = new ItemBeverageGrape().setUnlocalizedName("itemGrapeGrenacheBlancJuice").setTextureName(Bandb_mod.MODID + ":beverage/grape/itemGrapeGrenacheBlancJuice");
		itemGrapeGrolleauJuice = new ItemBeverageGrape().setUnlocalizedName("itemGrapeGrolleauJuice").setTextureName(Bandb_mod.MODID + ":beverage/grape/itemGrapeGrolleauJuice");
		itemGrapeGrosMensengJuice = new ItemBeverageGrape().setUnlocalizedName("itemGrapeGrosMensengJuice").setTextureName(Bandb_mod.MODID + ":beverage/grape/itemGrapeGrosMensengJuice");
		itemGrapeJacquereJuice = new ItemBeverageGrape().setUnlocalizedName("itemGrapeJacquereJuice").setTextureName(Bandb_mod.MODID + ":beverage/grape/itemGrapeJacquereJuice");

    	GameRegistry.registerItem(itemGrapeGrenacheJuice, "itemGrapeGrenacheJuice");
    	GameRegistry.registerItem(itemGrapeGrenacheBlancJuice, "itemGrapeGrenacheBlancJuice");
    	GameRegistry.registerItem(itemGrapeGrolleauJuice, "itemGrapeGrolleauJuice");
    	GameRegistry.registerItem(itemGrapeGrosMensengJuice, "itemGrapeGrosMensengJuice");
    	GameRegistry.registerItem(itemGrapeJacquereJuice, "itemGrapeJacquereJuice");
   
		itemGrapeLenDeLElJuice = new ItemBeverageGrape().setUnlocalizedName("itemGrapeLenDeLElJuice").setTextureName(Bandb_mod.MODID + ":beverage/grape/itemGrapeLenDeLElJuice");
		itemGrapeListanJuice = new ItemBeverageGrape().setUnlocalizedName("itemGrapeListanJuice").setTextureName(Bandb_mod.MODID + ":beverage/grape/itemGrapeListanJuice");
		itemGrapeMaccabeuJuice = new ItemBeverageGrape().setUnlocalizedName("itemGrapeMaccabeuJuice").setTextureName(Bandb_mod.MODID + ":beverage/grape/itemGrapeMaccabeuJuice");
		itemGrapeMalbecJuice = new ItemBeverageGrape().setUnlocalizedName("itemGrapeMalbecJuice").setTextureName(Bandb_mod.MODID + ":beverage/grape/itemGrapeMalbecJuice");
		itemGrapeMalvoisieJuice = new ItemBeverageGrape().setUnlocalizedName("itemGrapeMalvoisieJuice").setTextureName(Bandb_mod.MODID + ":beverage/grape/itemGrapeMalvoisieJuice");

    	GameRegistry.registerItem(itemGrapeLenDeLElJuice, "itemGrapeLenDeLElJuice");
    	GameRegistry.registerItem(itemGrapeListanJuice, "itemGrapeListanJuice");
    	GameRegistry.registerItem(itemGrapeMaccabeuJuice, "itemGrapeMaccabeuJuice");
    	GameRegistry.registerItem(itemGrapeMalbecJuice, "itemGrapeMalbecJuice");
    	GameRegistry.registerItem(itemGrapeMalvoisieJuice, "itemGrapeMalvoisieJuice");
    	
    	itemGrapeMarsanneJuice = new ItemBeverageGrape().setUnlocalizedName("itemGrapeMarsanneJuice").setTextureName(Bandb_mod.MODID + ":beverage/grape/itemGrapeMarsanneJuice");
    	itemGrapeMarselanJuice = new ItemBeverageGrape().setUnlocalizedName("itemGrapeMarselanJuice").setTextureName(Bandb_mod.MODID + ":beverage/grape/itemGrapeMarselanJuice");
    	itemGrapeMauzacJuice = new ItemBeverageGrape().setUnlocalizedName("itemGrapeMauzacJuice").setTextureName(Bandb_mod.MODID + ":beverage/grape/itemGrapeMauzacJuice");
    	itemGrapeMelonJuice = new ItemBeverageGrape().setUnlocalizedName("itemGrapeMelonJuice").setTextureName(Bandb_mod.MODID + ":beverage/grape/itemGrapeMelonJuice");
    	itemGrapeMelonDeBourgogneJuice = new ItemBeverageGrape().setUnlocalizedName("itemGrapeMelonDeBourgogneJuice").setTextureName(Bandb_mod.MODID + ":beverage/grape/itemGrapeMelonDeBourgogneJuice");

    	GameRegistry.registerItem(itemGrapeMarsanneJuice, "itemGrapeMarsanneJuice");
    	GameRegistry.registerItem(itemGrapeMarselanJuice, "itemGrapeMarselanJuice");
    	GameRegistry.registerItem(itemGrapeMauzacJuice, "itemGrapeMauzacJuice");
    	GameRegistry.registerItem(itemGrapeMelonJuice, "itemGrapeMelonJuice");
    	GameRegistry.registerItem(itemGrapeMelonDeBourgogneJuice, "itemGrapeMelonDeBourgogneJuice");
    	
    	itemGrapeMerlotJuice = new ItemBeverageGrape().setUnlocalizedName("itemGrapeMerlotJuice").setTextureName(Bandb_mod.MODID + ":beverage/grape/itemGrapeMerlotJuice");
    	itemGrapeMoletteJuice = new ItemBeverageGrape().setUnlocalizedName("itemGrapeMoletteJuice").setTextureName(Bandb_mod.MODID + ":beverage/grape/itemGrapeMoletteJuice");
    	itemGrapeMollardJuice = new ItemBeverageGrape().setUnlocalizedName("itemGrapeMollardJuice").setTextureName(Bandb_mod.MODID + ":beverage/grape/itemGrapeMollardJuice");
    	itemGrapeMondeuseJuice = new ItemBeverageGrape().setUnlocalizedName("itemGrapeMondeuseJuice").setTextureName(Bandb_mod.MODID + ":beverage/grape/itemGrapeMondeuseJuice");
    	itemGrapeMondeuseBlancheJuice = new ItemBeverageGrape().setUnlocalizedName("itemGrapeMondeuseBlancheJuice").setTextureName(Bandb_mod.MODID + ":beverage/grape/itemGrapeMondeuseBlancheJuice");

    	GameRegistry.registerItem(itemGrapeMerlotJuice, "itemGrapeMerlotJuice");
    	GameRegistry.registerItem(itemGrapeMoletteJuice, "itemGrapeMoletteJuice");
    	GameRegistry.registerItem(itemGrapeMollardJuice, "itemGrapeMollardJuice");
    	GameRegistry.registerItem(itemGrapeMondeuseJuice, "itemGrapeMondeuseJuice");
    	GameRegistry.registerItem(itemGrapeMondeuseBlancheJuice, "itemGrapeMondeuseBlancheJuice");
    	
    	itemGrapeMourvedreJuice = new ItemBeverageGrape().setUnlocalizedName("itemGrapeMourvedreJuice").setTextureName(Bandb_mod.MODID + ":beverage/grape/itemGrapeMourvedreJuice");
    	itemGrapeMuscadelleJuice = new ItemBeverageGrape().setUnlocalizedName("itemGrapeMuscadelleJuice").setTextureName(Bandb_mod.MODID + ":beverage/grape/itemGrapeMuscadelleJuice");
    	itemGrapeMuscardinJuice = new ItemBeverageGrape().setUnlocalizedName("itemGrapeMuscardinJuice").setTextureName(Bandb_mod.MODID + ":beverage/grape/itemGrapeMuscardinJuice");
    	itemGrapeMuscatBlancAPetitsGrainsJuice = new ItemBeverageGrape().setUnlocalizedName("itemGrapeMuscatBlancAPetitsGrainsJuice").setTextureName(Bandb_mod.MODID + ":beverage/grape/itemGrapeMuscatBlancAPetitsGrainsJuice");
    	itemGrapeMuscatDAlexandrieJuice = new ItemBeverageGrape().setUnlocalizedName("itemGrapeMuscatDAlexandrieJuice").setTextureName(Bandb_mod.MODID + ":beverage/grape/itemGrapeMuscatDAlexandrieJuice");

    	GameRegistry.registerItem(itemGrapeMourvedreJuice, "itemGrapeMourvedreJuice");
    	GameRegistry.registerItem(itemGrapeMuscadelleJuice, "itemGrapeMuscadelleJuice");
    	GameRegistry.registerItem(itemGrapeMuscardinJuice, "itemGrapeMuscardinJuice");
    	GameRegistry.registerItem(itemGrapeMuscatBlancAPetitsGrainsJuice, "itemGrapeMuscatBlancAPetitsGrainsJuice");
    	GameRegistry.registerItem(itemGrapeMuscatDAlexandrieJuice, "itemGrapeMuscatDAlexandrieJuice");
    	
    	itemGrapeNegretteJuice = new ItemBeverageGrape().setUnlocalizedName("itemGrapeNegretteJuice").setTextureName(Bandb_mod.MODID + ":beverage/grape/itemGrapeNegretteJuice");
    	itemGrapeNielluccioJuice = new ItemBeverageGrape().setUnlocalizedName("itemGrapeNielluccioJuice").setTextureName(Bandb_mod.MODID + ":beverage/grape/itemGrapeNielluccioJuice");
    	itemGrapePagaDebitiJuice = new ItemBeverageGrape().setUnlocalizedName("itemGrapePagaDebitiJuice").setTextureName(Bandb_mod.MODID + ":beverage/grape/itemGrapePagaDebitiJuice");
    	itemGrapePetitCourbuJuice = new ItemBeverageGrape().setUnlocalizedName("itemGrapePetitCourbuJuice").setTextureName(Bandb_mod.MODID + ":beverage/grape/itemGrapePetitCourbuJuice");
    	itemGrapePetitMensengJuice = new ItemBeverageGrape().setUnlocalizedName("itemGrapePetitMensengJuice").setTextureName(Bandb_mod.MODID + ":beverage/grape/itemGrapePetitMensengJuice");

    	GameRegistry.registerItem(itemGrapeNegretteJuice, "itemGrapeNegretteJuice");
    	GameRegistry.registerItem(itemGrapeNielluccioJuice, "itemGrapeNielluccioJuice");
    	GameRegistry.registerItem(itemGrapePagaDebitiJuice, "itemGrapePagaDebitiJuice");
    	GameRegistry.registerItem(itemGrapePetitCourbuJuice, "itemGrapePetitCourbuJuice");
    	GameRegistry.registerItem(itemGrapePetitMensengJuice, "itemGrapePetitMensengJuice");

    	itemGrapePetitVerdotJuice = new ItemBeverageGrape().setUnlocalizedName("itemGrapePetitVerdotJuice").setTextureName(Bandb_mod.MODID + ":beverage/grape/itemGrapePetitVerdotJuice");
    	itemGrapePineauDAunisJuice = new ItemBeverageGrape().setUnlocalizedName("itemGrapePineauDAunisJuice").setTextureName(Bandb_mod.MODID + ":beverage/grape/itemGrapePineauDAunisJuice");
    	itemGrapePinotBlancJuice = new ItemBeverageGrape().setUnlocalizedName("itemGrapePinotBlancJuice").setTextureName(Bandb_mod.MODID + ":beverage/grape/itemGrapePinotBlancJuice");
    	itemGrapePinotMeunierJuice = new ItemBeverageGrape().setUnlocalizedName("itemGrapePinotMeunierJuice").setTextureName(Bandb_mod.MODID + ":beverage/grape/itemGrapePinotMeunierJuice");
    	itemGrapePinotNoirJuice = new ItemBeverageGrape().setUnlocalizedName("itemGrapePinotNoirJuice").setTextureName(Bandb_mod.MODID + ":beverage/grape/itemGrapePinotNoirJuice");

    	GameRegistry.registerItem(itemGrapePetitVerdotJuice, "itemGrapePetitVerdotJuice");
    	GameRegistry.registerItem(itemGrapePineauDAunisJuice, "itemGrapePineauDAunisJuice");
    	GameRegistry.registerItem(itemGrapePinotBlancJuice, "itemGrapePinotBlancJuice");
    	GameRegistry.registerItem(itemGrapePinotMeunierJuice, "itemGrapePinotMeunierJuice");
    	GameRegistry.registerItem(itemGrapePinotNoirJuice, "itemGrapePinotNoirJuice");
    	
    	itemGrapePiquepoulJuice = new ItemBeverageGrape().setUnlocalizedName("itemGrapePiquepoulJuice").setTextureName(Bandb_mod.MODID + ":beverage/grape/itemGrapePiquepoulJuice");
    	itemGrapePoulsardJuice = new ItemBeverageGrape().setUnlocalizedName("itemGrapePoulsardJuice").setTextureName(Bandb_mod.MODID + ":beverage/grape/itemGrapePoulsardJuice");
    	itemGrapeRieslingJuice = new ItemBeverageGrape().setUnlocalizedName("itemGrapeRieslingJuice").setTextureName(Bandb_mod.MODID + ":beverage/grape/itemGrapeRieslingJuice");
    	itemGrapeRomorantinJuice = new ItemBeverageGrape().setUnlocalizedName("itemGrapeRomorantinJuice").setTextureName(Bandb_mod.MODID + ":beverage/grape/itemGrapeRomorantinJuice");
    	itemGrapeRossulaBiancaJuice = new ItemBeverageGrape().setUnlocalizedName("itemGrapeRossulaBiancaJuice").setTextureName(Bandb_mod.MODID + ":beverage/grape/itemGrapeRossulaBiancaJuice");

    	GameRegistry.registerItem(itemGrapePiquepoulJuice, "itemGrapePiquepoulJuice");
    	GameRegistry.registerItem(itemGrapePoulsardJuice, "itemGrapePoulsardJuice");
    	GameRegistry.registerItem(itemGrapeRieslingJuice, "itemGrapeRieslingJuice");
    	GameRegistry.registerItem(itemGrapeRomorantinJuice, "itemGrapeRomorantinJuice");
    	GameRegistry.registerItem(itemGrapeRossulaBiancaJuice, "itemGrapeRossulaBiancaJuice");
    	
    	itemGrapeSacyJuice = new ItemBeverageGrape().setUnlocalizedName("itemGrapeSacyJuice").setTextureName(Bandb_mod.MODID + ":beverage/grape/itemGrapeSacyJuice");
    	itemGrapeSauvignonJuice = new ItemBeverageGrape().setUnlocalizedName("itemGrapeSauvignonJuice").setTextureName(Bandb_mod.MODID + ":beverage/grape/itemGrapeSauvignonJuice");
    	itemGrapeSavagninJuice = new ItemBeverageGrape().setUnlocalizedName("itemGrapeSavagninJuice").setTextureName(Bandb_mod.MODID + ":beverage/grape/itemGrapeSavagninJuice");
    	itemGrapeSemillonJuice = new ItemBeverageGrape().setUnlocalizedName("itemGrapeSemillonJuice").setTextureName(Bandb_mod.MODID + ":beverage/grape/itemGrapeSemillonJuice");
    	itemGrapeSylvanerJuice = new ItemBeverageGrape().setUnlocalizedName("itemGrapeSylvanerJuice").setTextureName(Bandb_mod.MODID + ":beverage/grape/itemGrapeSylvanerJuice");

    	GameRegistry.registerItem(itemGrapeSacyJuice, "itemGrapeSacyJuice");
    	GameRegistry.registerItem(itemGrapeSauvignonJuice, "itemGrapeSauvignonJuice");
    	GameRegistry.registerItem(itemGrapeSavagninJuice, "itemGrapeSavagninJuice");
    	GameRegistry.registerItem(itemGrapeSemillonJuice, "itemGrapeSemillonJuice");
    	GameRegistry.registerItem(itemGrapeSylvanerJuice, "itemGrapeSylvanerJuice");
    	
    	itemGrapeSyrahJuice = new ItemBeverageGrape().setUnlocalizedName("itemGrapeSyrahJuice").setTextureName(Bandb_mod.MODID + ":beverage/grape/itemGrapeSyrahJuice");
    	itemGrapeTannatJuice = new ItemBeverageGrape().setUnlocalizedName("itemGrapeTannatJuice").setTextureName(Bandb_mod.MODID + ":beverage/grape/itemGrapeTannatJuice");
    	itemGrapeTeoulierJuice = new ItemBeverageGrape().setUnlocalizedName("itemGrapeTeoulierJuice").setTextureName(Bandb_mod.MODID + ":beverage/grape/itemGrapeTeoulierJuice");
    	itemGrapeTerretNoirJuice = new ItemBeverageGrape().setUnlocalizedName("itemGrapeTerretNoirJuice").setTextureName(Bandb_mod.MODID + ":beverage/grape/itemGrapeTerretNoirJuice");
    	itemGrapeTibourenJuice = new ItemBeverageGrape().setUnlocalizedName("itemGrapeTibourenJuice").setTextureName(Bandb_mod.MODID + ":beverage/grape/itemGrapeTibourenJuice");

    	GameRegistry.registerItem(itemGrapeSyrahJuice, "itemGrapeSyrahJuice");
    	GameRegistry.registerItem(itemGrapeTannatJuice, "itemGrapeTannatJuice");
    	GameRegistry.registerItem(itemGrapeTeoulierJuice, "itemGrapeTeoulierJuice");
    	GameRegistry.registerItem(itemGrapeTerretNoirJuice, "itemGrapeTerretNoirJuice");
    	GameRegistry.registerItem(itemGrapeTibourenJuice, "itemGrapeTibourenJuice");
    	   
    	itemGrapeTressalierJuice = new ItemBeverageGrape().setUnlocalizedName("itemGrapeTressalierJuice").setTextureName(Bandb_mod.MODID + ":beverage/grape/itemGrapeTressalierJuice");
    	itemGrapeUgniBlancJuice = new ItemBeverageGrape().setUnlocalizedName("itemGrapeUgniBlancJuice").setTextureName(Bandb_mod.MODID + ":beverage/grape/itemGrapeUgniBlancJuice");
    	itemGrapeVaccareseJuice = new ItemBeverageGrape().setUnlocalizedName("itemGrapeVaccareseJuice").setTextureName(Bandb_mod.MODID + ":beverage/grape/itemGrapeVaccareseJuice");
    	itemGrapeVermentinuJuice = new ItemBeverageGrape().setUnlocalizedName("itemGrapeVermentinuJuice").setTextureName(Bandb_mod.MODID + ":beverage/grape/itemGrapeVermentinuJuice");
    	itemGrapeViognierJuice = new ItemBeverageGrape().setUnlocalizedName("itemGrapeViognierJuice").setTextureName(Bandb_mod.MODID + ":beverage/grape/itemGrapeViognierJuice");

    	GameRegistry.registerItem(itemGrapeTressalierJuice, "itemGrapeTressalierJuice");
    	GameRegistry.registerItem(itemGrapeUgniBlancJuice, "itemGrapeUgniBlancJuice");
    	GameRegistry.registerItem(itemGrapeVaccareseJuice, "itemGrapeVaccareseJuice");
    	GameRegistry.registerItem(itemGrapeVermentinuJuice, "itemGrapeVermentinuJuice");
    	GameRegistry.registerItem(itemGrapeViognierJuice, "itemGrapeViognierJuice");
		
		//Syrup MONIN
		itemLogoMonin = new Item().setUnlocalizedName("itemLogoMonin").setTextureName(Bandb_mod.MODID + ":syrup/itemLogoMonin").setCreativeTab(BandbCreativeTabs.CreativeTabsMonin);
		itemSyrupAlmond = new Item().setUnlocalizedName("itemSyrupAlmond").setTextureName(Bandb_mod.MODID + ":syrup/itemSyrupAlmond").setCreativeTab(BandbCreativeTabs.CreativeTabsMonin);
		itemSyrupAmaretto = new Item().setUnlocalizedName("itemSyrupAmaretto").setTextureName(Bandb_mod.MODID + ":syrup/itemSyrupAmaretto").setCreativeTab(BandbCreativeTabs.CreativeTabsMonin);
		itemSyrupAnise = new Item().setUnlocalizedName("itemSyrupAnise").setTextureName(Bandb_mod.MODID + ":syrup/itemSyrupAnise").setCreativeTab(BandbCreativeTabs.CreativeTabsMonin);
		itemSyrupApple = new Item().setUnlocalizedName("itemSyrupApple").setTextureName(Bandb_mod.MODID + ":syrup/itemSyrupApple").setCreativeTab(BandbCreativeTabs.CreativeTabsMonin);
		
		itemSyrupApplePie = new Item().setUnlocalizedName("itemSyrupApplePie").setTextureName(Bandb_mod.MODID + ":syrup/itemSyrupApplePie").setCreativeTab(BandbCreativeTabs.CreativeTabsMonin);
		itemSyrupApricot = new Item().setUnlocalizedName("itemSyrupApricot").setTextureName(Bandb_mod.MODID + ":syrup/itemSyrupApricot").setCreativeTab(BandbCreativeTabs.CreativeTabsMonin);
		itemSyrupBasil = new Item().setUnlocalizedName("itemSyrupBasil").setTextureName(Bandb_mod.MODID + ":syrup/itemSyrupBasil").setCreativeTab(BandbCreativeTabs.CreativeTabsMonin);
		itemSyrupBitter = new Item().setUnlocalizedName("itemSyrupBitter").setTextureName(Bandb_mod.MODID + ":syrup/itemSyrupBitter").setCreativeTab(BandbCreativeTabs.CreativeTabsMonin);
		itemSyrupBlackberry = new Item().setUnlocalizedName("itemSyrupBlackberry").setTextureName(Bandb_mod.MODID + ":syrup/itemSyrupBlackberry").setCreativeTab(BandbCreativeTabs.CreativeTabsMonin);
		
		itemSyrupBlackcurrant = new Item().setUnlocalizedName("itemSyrupBlackcurrant").setTextureName(Bandb_mod.MODID + ":syrup/itemSyrupBlackcurrant").setCreativeTab(BandbCreativeTabs.CreativeTabsMonin);
		itemSyrupBlackForest = new Item().setUnlocalizedName("itemSyrupBlackForest").setTextureName(Bandb_mod.MODID + ":syrup/itemSyrupBlackForest").setCreativeTab(BandbCreativeTabs.CreativeTabsMonin);
		itemSyrupBloodOrange = new Item().setUnlocalizedName("itemSyrupBloodOrange").setTextureName(Bandb_mod.MODID + ":syrup/itemSyrupBloodOrange").setCreativeTab(BandbCreativeTabs.CreativeTabsMonin);
		itemSyrupBlueberry = new Item().setUnlocalizedName("itemSyrupBlueberry").setTextureName(Bandb_mod.MODID + ":syrup/itemSyrupBlueberry").setCreativeTab(BandbCreativeTabs.CreativeTabsMonin);
		itemSyrupBlueCuracao = new Item().setUnlocalizedName("itemSyrupBlueCuracao").setTextureName(Bandb_mod.MODID + ":syrup/itemSyrupBlueCuracao").setCreativeTab(BandbCreativeTabs.CreativeTabsMonin);
		
		itemSyrupBubbleGum = new Item().setUnlocalizedName("itemSyrupBubbleGum").setTextureName(Bandb_mod.MODID + ":syrup/itemSyrupBubbleGum").setCreativeTab(BandbCreativeTabs.CreativeTabsMonin);
		itemSyrupCaipirinha = new Item().setUnlocalizedName("itemSyrupCaipirinha").setTextureName(Bandb_mod.MODID + ":syrup/itemSyrupCaipirinha").setCreativeTab(BandbCreativeTabs.CreativeTabsMonin);
		itemSyrupCandyStrawberry = new Item().setUnlocalizedName("itemSyrupCandyStrawberry").setTextureName(Bandb_mod.MODID + ":syrup/itemSyrupCandyStrawberry").setCreativeTab(BandbCreativeTabs.CreativeTabsMonin);
		itemSyrupCaramel = new Item().setUnlocalizedName("itemSyrupCaramel").setTextureName(Bandb_mod.MODID + ":syrup/itemSyrupCaramel").setCreativeTab(BandbCreativeTabs.CreativeTabsMonin);
		itemSyrupCardamom = new Item().setUnlocalizedName("itemSyrupCardamom").setTextureName(Bandb_mod.MODID + ":syrup/itemSyrupCardamom").setCreativeTab(BandbCreativeTabs.CreativeTabsMonin);
		
		itemSyrupChaiTea = new Item().setUnlocalizedName("itemSyrupChaiTea").setTextureName(Bandb_mod.MODID + ":syrup/itemSyrupChaiTea").setCreativeTab(BandbCreativeTabs.CreativeTabsMonin);
		itemSyrupCherry = new Item().setUnlocalizedName("itemSyrupCherry").setTextureName(Bandb_mod.MODID + ":syrup/itemSyrupCherry").setCreativeTab(BandbCreativeTabs.CreativeTabsMonin);
		itemSyrupCherryPlum = new Item().setUnlocalizedName("itemSyrupCherryPlum").setTextureName(Bandb_mod.MODID + ":syrup/itemSyrupCherryPlum").setCreativeTab(BandbCreativeTabs.CreativeTabsMonin);
		itemSyrupChestnut = new Item().setUnlocalizedName("itemSyrupChestnut").setTextureName(Bandb_mod.MODID + ":syrup/itemSyrupChestnut").setCreativeTab(BandbCreativeTabs.CreativeTabsMonin);
		itemSyrupChocolate = new Item().setUnlocalizedName("itemSyrupChocolate").setTextureName(Bandb_mod.MODID + ":syrup/itemSyrupChocolate").setCreativeTab(BandbCreativeTabs.CreativeTabsMonin);
		
		itemSyrupChocolateCookie = new Item().setUnlocalizedName("itemSyrupChocolateCookie").setTextureName(Bandb_mod.MODID + ":syrup/itemSyrupChocolateCookie").setCreativeTab(BandbCreativeTabs.CreativeTabsMonin);
		itemSyrupChocolateMint = new Item().setUnlocalizedName("itemSyrupChocolateMint").setTextureName(Bandb_mod.MODID + ":syrup/itemSyrupChocolateMint").setCreativeTab(BandbCreativeTabs.CreativeTabsMonin);
		itemSyrupCinnamon = new Item().setUnlocalizedName("itemSyrupCinnamon").setTextureName(Bandb_mod.MODID + ":syrup/itemSyrupCinnamon").setCreativeTab(BandbCreativeTabs.CreativeTabsMonin);
		itemSyrupCoconut = new Item().setUnlocalizedName("itemSyrupCoconut").setTextureName(Bandb_mod.MODID + ":syrup/itemSyrupCoconut").setCreativeTab(BandbCreativeTabs.CreativeTabsMonin);
		itemSyrupCoffee = new Item().setUnlocalizedName("itemSyrupCoffee").setTextureName(Bandb_mod.MODID + ":syrup/itemSyrupCoffee").setCreativeTab(BandbCreativeTabs.CreativeTabsMonin);
		
		itemSyrupCottonCandy = new Item().setUnlocalizedName("itemSyrupCottonCandy").setTextureName(Bandb_mod.MODID + ":syrup/itemSyrupCottonCandy").setCreativeTab(BandbCreativeTabs.CreativeTabsMonin);
		itemSyrupCranberry = new Item().setUnlocalizedName("itemSyrupCranberry").setTextureName(Bandb_mod.MODID + ":syrup/itemSyrupCranberry").setCreativeTab(BandbCreativeTabs.CreativeTabsMonin);
		itemSyrupCremeBrulee = new Item().setUnlocalizedName("itemSyrupCremeBrulee").setTextureName(Bandb_mod.MODID + ":syrup/itemSyrupCremeBrulee").setCreativeTab(BandbCreativeTabs.CreativeTabsMonin);
		itemSyrupCucumber = new Item().setUnlocalizedName("itemSyrupCucumber").setTextureName(Bandb_mod.MODID + ":syrup/itemSyrupCucumber").setCreativeTab(BandbCreativeTabs.CreativeTabsMonin);
		itemSyrupElderFlower = new Item().setUnlocalizedName("itemSyrupElderFlower").setTextureName(Bandb_mod.MODID + ":syrup/itemSyrupElderFlower").setCreativeTab(BandbCreativeTabs.CreativeTabsMonin);
		
		itemSyrupFig = new Item().setUnlocalizedName("itemSyrupFig").setTextureName(Bandb_mod.MODID + ":syrup/itemSyrupFig").setCreativeTab(BandbCreativeTabs.CreativeTabsMonin);
		itemSyrupFrostedMint = new Item().setUnlocalizedName("itemSyrupFrostedMint").setTextureName(Bandb_mod.MODID + ":syrup/itemSyrupFrostedMint").setCreativeTab(BandbCreativeTabs.CreativeTabsMonin);
		itemSyrupGin = new Item().setUnlocalizedName("itemSyrupGin").setTextureName(Bandb_mod.MODID + ":syrup/itemSyrupGin").setCreativeTab(BandbCreativeTabs.CreativeTabsMonin);
		itemSyrupGinger = new Item().setUnlocalizedName("itemSyrupGinger").setTextureName(Bandb_mod.MODID + ":syrup/itemSyrupGinger").setCreativeTab(BandbCreativeTabs.CreativeTabsMonin);
		itemSyrupGingerBread = new Item().setUnlocalizedName("itemSyrupGingerBread").setTextureName(Bandb_mod.MODID + ":syrup/itemSyrupGingerBread").setCreativeTab(BandbCreativeTabs.CreativeTabsMonin);
		
		itemSyrupGlascoLemon = new Item().setUnlocalizedName("itemSyrupGlascoLemon").setTextureName(Bandb_mod.MODID + ":syrup/itemSyrupGlascoLemon").setCreativeTab(BandbCreativeTabs.CreativeTabsMonin);
		itemSyrupGrapefruit = new Item().setUnlocalizedName("itemSyrupGrapefruit").setTextureName(Bandb_mod.MODID + ":syrup/itemSyrupGrapefruit").setCreativeTab(BandbCreativeTabs.CreativeTabsMonin);
		itemSyrupGreenApple = new Item().setUnlocalizedName("itemSyrupGreenApple").setTextureName(Bandb_mod.MODID + ":syrup/itemSyrupGreenApple").setCreativeTab(BandbCreativeTabs.CreativeTabsMonin);
		itemSyrupGreenBanana = new Item().setUnlocalizedName("itemSyrupGreenBanana").setTextureName(Bandb_mod.MODID + ":syrup/itemSyrupGreenBanana").setCreativeTab(BandbCreativeTabs.CreativeTabsMonin);
		itemSyrupGreenMint = new Item().setUnlocalizedName("itemSyrupGreenMint").setTextureName(Bandb_mod.MODID + ":syrup/itemSyrupGreenMint").setCreativeTab(BandbCreativeTabs.CreativeTabsMonin);
		
		itemSyrupGrenadine = new Item().setUnlocalizedName("itemSyrupGrenadine").setTextureName(Bandb_mod.MODID + ":syrup/itemSyrupGrenadine").setCreativeTab(BandbCreativeTabs.CreativeTabsMonin);
		itemSyrupGuava = new Item().setUnlocalizedName("itemSyrupGuava").setTextureName(Bandb_mod.MODID + ":syrup/itemSyrupGuava").setCreativeTab(BandbCreativeTabs.CreativeTabsMonin);
		itemSyrupGum = new Item().setUnlocalizedName("itemSyrupGum").setTextureName(Bandb_mod.MODID + ":syrup/itemSyrupGum").setCreativeTab(BandbCreativeTabs.CreativeTabsMonin);
		itemSyrupHazelnut = new Item().setUnlocalizedName("itemSyrupHazelnut").setTextureName(Bandb_mod.MODID + ":syrup/itemSyrupHazelnut").setCreativeTab(BandbCreativeTabs.CreativeTabsMonin);
		itemSyrupHibiscus = new Item().setUnlocalizedName("itemSyrupHibiscus").setTextureName(Bandb_mod.MODID + ":syrup/itemSyrupHibiscus").setCreativeTab(BandbCreativeTabs.CreativeTabsMonin);
		
		itemSyrupHoney = new Item().setUnlocalizedName("itemSyrupHoney").setTextureName(Bandb_mod.MODID + ":syrup/itemSyrupHoney").setCreativeTab(BandbCreativeTabs.CreativeTabsMonin);
		itemSyrupIrish = new Item().setUnlocalizedName("itemSyrupIrish").setTextureName(Bandb_mod.MODID + ":syrup/itemSyrupIrish").setCreativeTab(BandbCreativeTabs.CreativeTabsMonin);
		itemSyrupJasmine = new Item().setUnlocalizedName("itemSyrupJasmine").setTextureName(Bandb_mod.MODID + ":syrup/itemSyrupJasmine").setCreativeTab(BandbCreativeTabs.CreativeTabsMonin);
		itemSyrupKiwi = new Item().setUnlocalizedName("itemSyrupKiwi").setTextureName(Bandb_mod.MODID + ":syrup/itemSyrupKiwi").setCreativeTab(BandbCreativeTabs.CreativeTabsMonin);
		itemSyrupLavender = new Item().setUnlocalizedName("itemSyrupLavender").setTextureName(Bandb_mod.MODID + ":syrup/itemSyrupLavender").setCreativeTab(BandbCreativeTabs.CreativeTabsMonin);
		
		itemSyrupLemonGrass = new Item().setUnlocalizedName("itemSyrupLemonGrass").setTextureName(Bandb_mod.MODID + ":syrup/itemSyrupLemonGrass").setCreativeTab(BandbCreativeTabs.CreativeTabsMonin);
		itemSyrupLemonPie = new Item().setUnlocalizedName("itemSyrupLemonPie").setTextureName(Bandb_mod.MODID + ":syrup/itemSyrupLemonPie").setCreativeTab(BandbCreativeTabs.CreativeTabsMonin);
		itemSyrupLemonTea = new Item().setUnlocalizedName("itemSyrupLemonTea").setTextureName(Bandb_mod.MODID + ":syrup/itemSyrupLemonTea").setCreativeTab(BandbCreativeTabs.CreativeTabsMonin);
		itemSyrupLime = new Item().setUnlocalizedName("itemSyrupLime").setTextureName(Bandb_mod.MODID + ":syrup/itemSyrupLime").setCreativeTab(BandbCreativeTabs.CreativeTabsMonin);
		itemSyrupLimeJuiceCordialMixer = new Item().setUnlocalizedName("itemSyrupLimeJuiceCordialMixer").setTextureName(Bandb_mod.MODID + ":syrup/itemSyrupLimeJuiceCordialMixer").setCreativeTab(BandbCreativeTabs.CreativeTabsMonin);
		
		itemSyrupLychee = new Item().setUnlocalizedName("itemSyrupLychee").setTextureName(Bandb_mod.MODID + ":syrup/itemSyrupLychee").setCreativeTab(BandbCreativeTabs.CreativeTabsMonin);
		itemSyrupMacadamiaNut = new Item().setUnlocalizedName("itemSyrupMacadamiaNut").setTextureName(Bandb_mod.MODID + ":syrup/itemSyrupMacadamiaNut").setCreativeTab(BandbCreativeTabs.CreativeTabsMonin);
		itemSyrupMacaron = new Item().setUnlocalizedName("itemSyrupMacaron").setTextureName(Bandb_mod.MODID + ":syrup/itemSyrupMacaron").setCreativeTab(BandbCreativeTabs.CreativeTabsMonin);
		itemSyrupMango = new Item().setUnlocalizedName("itemSyrupMango").setTextureName(Bandb_mod.MODID + ":syrup/itemSyrupMango").setCreativeTab(BandbCreativeTabs.CreativeTabsMonin);
		itemSyrupMapleSpice = new Item().setUnlocalizedName("itemSyrupMapleSpice").setTextureName(Bandb_mod.MODID + ":syrup/itemSyrupMapleSpice").setCreativeTab(BandbCreativeTabs.CreativeTabsMonin);
		
		itemSyrupMatchaGreenTea = new Item().setUnlocalizedName("itemSyrupMatchaGreenTea").setTextureName(Bandb_mod.MODID + ":syrup/itemSyrupMatchaGreenTea").setCreativeTab(BandbCreativeTabs.CreativeTabsMonin);
		itemSyrupMelon = new Item().setUnlocalizedName("itemSyrupMelon").setTextureName(Bandb_mod.MODID + ":syrup/itemSyrupMelon").setCreativeTab(BandbCreativeTabs.CreativeTabsMonin);
		itemSyrupMojitoMint = new Item().setUnlocalizedName("itemSyrupMojitoMint").setTextureName(Bandb_mod.MODID + ":syrup/itemSyrupMojitoMint").setCreativeTab(BandbCreativeTabs.CreativeTabsMonin);
		itemSyrupMorelloCherry = new Item().setUnlocalizedName("itemSyrupMorelloCherry").setTextureName(Bandb_mod.MODID + ":syrup/itemSyrupMorelloCherry").setCreativeTab(BandbCreativeTabs.CreativeTabsMonin);
		itemSyrupOrange = new Item().setUnlocalizedName("itemSyrupOrange").setTextureName(Bandb_mod.MODID + ":syrup/itemSyrupOrange").setCreativeTab(BandbCreativeTabs.CreativeTabsMonin);
		
		itemSyrupPassionFruit = new Item().setUnlocalizedName("itemSyrupPassionFruit").setTextureName(Bandb_mod.MODID + ":syrup/itemSyrupPassionFruit").setCreativeTab(BandbCreativeTabs.CreativeTabsMonin);
		itemSyrupPeach = new Item().setUnlocalizedName("itemSyrupPeach").setTextureName(Bandb_mod.MODID + ":syrup/itemSyrupPeach").setCreativeTab(BandbCreativeTabs.CreativeTabsMonin);
		itemSyrupPeachTea = new Item().setUnlocalizedName("itemSyrupPeachTea").setTextureName(Bandb_mod.MODID + ":syrup/itemSyrupPeachTea").setCreativeTab(BandbCreativeTabs.CreativeTabsMonin);
		itemSyrupPear = new Item().setUnlocalizedName("itemSyrupPear").setTextureName(Bandb_mod.MODID + ":syrup/itemSyrupPear").setCreativeTab(BandbCreativeTabs.CreativeTabsMonin);
		itemSyrupPinacolada = new Item().setUnlocalizedName("itemSyrupPinacolada").setTextureName(Bandb_mod.MODID + ":syrup/itemSyrupPinacolada").setCreativeTab(BandbCreativeTabs.CreativeTabsMonin);
		
		itemSyrupPineapple = new Item().setUnlocalizedName("itemSyrupPineapple").setTextureName(Bandb_mod.MODID + ":syrup/itemSyrupPineapple").setCreativeTab(BandbCreativeTabs.CreativeTabsMonin);
		itemSyrupPinkGrapefruit = new Item().setUnlocalizedName("itemSyrupPinkGrapefruit").setTextureName(Bandb_mod.MODID + ":syrup/itemSyrupPinkGrapefruit").setCreativeTab(BandbCreativeTabs.CreativeTabsMonin);
		itemSyrupPistachio = new Item().setUnlocalizedName("itemSyrupPistachio").setTextureName(Bandb_mod.MODID + ":syrup/itemSyrupPistachio").setCreativeTab(BandbCreativeTabs.CreativeTabsMonin);
		itemSyrupPomegranate = new Item().setUnlocalizedName("itemSyrupPomegranate").setTextureName(Bandb_mod.MODID + ":syrup/itemSyrupPomegranate").setCreativeTab(BandbCreativeTabs.CreativeTabsMonin);
		itemSyrupPraline = new Item().setUnlocalizedName("itemSyrupPraline").setTextureName(Bandb_mod.MODID + ":syrup/itemSyrupPraline").setCreativeTab(BandbCreativeTabs.CreativeTabsMonin);
		
		itemSyrupPureCaneSugar = new Item().setUnlocalizedName("itemSyrupPureCaneSugar").setTextureName(Bandb_mod.MODID + ":syrup/itemSyrupPureCaneSugar").setCreativeTab(BandbCreativeTabs.CreativeTabsMonin);
		itemSyrupRantchoLemon = new Item().setUnlocalizedName("itemSyrupRantchoLemon").setTextureName(Bandb_mod.MODID + ":syrup/itemSyrupRantchoLemon").setCreativeTab(BandbCreativeTabs.CreativeTabsMonin);
		itemSyrupRaspberry = new Item().setUnlocalizedName("itemSyrupRaspberry").setTextureName(Bandb_mod.MODID + ":syrup/itemSyrupRaspberry").setCreativeTab(BandbCreativeTabs.CreativeTabsMonin);
		itemSyrupRaspberryTea = new Item().setUnlocalizedName("itemSyrupRaspberryTea").setTextureName(Bandb_mod.MODID + ":syrup/itemSyrupRaspberryTea").setCreativeTab(BandbCreativeTabs.CreativeTabsMonin);
		itemSyrupRoastedHazelnut = new Item().setUnlocalizedName("itemSyrupRoastedHazelnut").setTextureName(Bandb_mod.MODID + ":syrup/itemSyrupRoastedHazelnut").setCreativeTab(BandbCreativeTabs.CreativeTabsMonin);
		
		itemSyrupRose = new Item().setUnlocalizedName("itemSyrupRose").setTextureName(Bandb_mod.MODID + ":syrup/itemSyrupRose").setCreativeTab(BandbCreativeTabs.CreativeTabsMonin);
		itemSyrupRosmary = new Item().setUnlocalizedName("itemSyrupRosmary").setTextureName(Bandb_mod.MODID + ":syrup/itemSyrupRosmary").setCreativeTab(BandbCreativeTabs.CreativeTabsMonin);
		itemSyrupRumFlavour = new Item().setUnlocalizedName("itemSyrupRumFlavour").setTextureName(Bandb_mod.MODID + ":syrup/itemSyrupRumFlavour").setCreativeTab(BandbCreativeTabs.CreativeTabsMonin);
		itemSyrupSaltedCaramel = new Item().setUnlocalizedName("itemSyrupSaltedCaramel").setTextureName(Bandb_mod.MODID + ":syrup/itemSyrupSaltedCaramel").setCreativeTab(BandbCreativeTabs.CreativeTabsMonin);
		itemSyrupSangria = new Item().setUnlocalizedName("itemSyrupSangria").setTextureName(Bandb_mod.MODID + ":syrup/itemSyrupSangria").setCreativeTab(BandbCreativeTabs.CreativeTabsMonin);
		
		itemSyrupSpeculoos = new Item().setUnlocalizedName("itemSyrupSpeculoos").setTextureName(Bandb_mod.MODID + ":syrup/itemSyrupSpeculoos").setCreativeTab(BandbCreativeTabs.CreativeTabsMonin);
		itemSyrupSpicy = new Item().setUnlocalizedName("itemSyrupSpicy").setTextureName(Bandb_mod.MODID + ":syrup/itemSyrupSpicy").setCreativeTab(BandbCreativeTabs.CreativeTabsMonin);
		itemSyrupSpicyMango = new Item().setUnlocalizedName("itemSyrupSpicyMango").setTextureName(Bandb_mod.MODID + ":syrup/itemSyrupSpicyMango").setCreativeTab(BandbCreativeTabs.CreativeTabsMonin);
		itemSyrupStrawberry = new Item().setUnlocalizedName("itemSyrupStrawberry").setTextureName(Bandb_mod.MODID + ":syrup/itemSyrupStrawberry").setCreativeTab(BandbCreativeTabs.CreativeTabsMonin);
		itemSyrupTangerine = new Item().setUnlocalizedName("itemSyrupTangerine").setTextureName(Bandb_mod.MODID + ":syrup/itemSyrupTangerine").setCreativeTab(BandbCreativeTabs.CreativeTabsMonin);
		
		itemSyrupTarragon = new Item().setUnlocalizedName("itemSyrupTarragon").setTextureName(Bandb_mod.MODID + ":syrup/itemSyrupTarragon").setCreativeTab(BandbCreativeTabs.CreativeTabsMonin);
		itemSyrupTequilaFlavour = new Item().setUnlocalizedName("itemSyrupTequilaFlavour").setTextureName(Bandb_mod.MODID + ":syrup/itemSyrupTequilaFlavour").setCreativeTab(BandbCreativeTabs.CreativeTabsMonin);
		itemSyrupTiramisu = new Item().setUnlocalizedName("itemSyrupTiramisu").setTextureName(Bandb_mod.MODID + ":syrup/itemSyrupTiramisu").setCreativeTab(BandbCreativeTabs.CreativeTabsMonin);
		itemSyrupToffeeNut = new Item().setUnlocalizedName("itemSyrupToffeeNut").setTextureName(Bandb_mod.MODID + ":syrup/itemSyrupToffeeNut").setCreativeTab(BandbCreativeTabs.CreativeTabsMonin);
		itemSyrupTonkaBean = new Item().setUnlocalizedName("itemSyrupTonkaBean").setTextureName(Bandb_mod.MODID + ":syrup/itemSyrupTonkaBean").setCreativeTab(BandbCreativeTabs.CreativeTabsMonin);
		
		itemSyrupTripleSecCuracao = new Item().setUnlocalizedName("itemSyrupTripleSecCuracao").setTextureName(Bandb_mod.MODID + ":syrup/itemSyrupTripleSecCuracao").setCreativeTab(BandbCreativeTabs.CreativeTabsMonin);
		itemSyrupVanilla = new Item().setUnlocalizedName("itemSyrupVanilla").setTextureName(Bandb_mod.MODID + ":syrup/itemSyrupVanilla").setCreativeTab(BandbCreativeTabs.CreativeTabsMonin);
		itemSyrupViolet = new Item().setUnlocalizedName("itemSyrupViolet").setTextureName(Bandb_mod.MODID + ":syrup/itemSyrupViolet").setCreativeTab(BandbCreativeTabs.CreativeTabsMonin);
		itemSyrupWatermelon = new Item().setUnlocalizedName("itemSyrupWatermelon").setTextureName(Bandb_mod.MODID + ":syrup/itemSyrupWatermelon").setCreativeTab(BandbCreativeTabs.CreativeTabsMonin);
		itemSyrupWhiteChocolate = new Item().setUnlocalizedName("itemSyrupWhiteChocolate").setTextureName(Bandb_mod.MODID + ":syrup/itemSyrupWhiteChocolate").setCreativeTab(BandbCreativeTabs.CreativeTabsMonin);
		
		itemSyrupWhitePeach = new Item().setUnlocalizedName("itemSyrupWhitePeach").setTextureName(Bandb_mod.MODID + ":syrup/itemSyrupWhitePeach").setCreativeTab(BandbCreativeTabs.CreativeTabsMonin);
		itemSyrupWildStrawberry = new Item().setUnlocalizedName("itemSyrupWildStrawberry").setTextureName(Bandb_mod.MODID + ":syrup/itemSyrupWildStrawberry").setCreativeTab(BandbCreativeTabs.CreativeTabsMonin);
		itemSyrupYellowBanana = new Item().setUnlocalizedName("itemSyrupYellowBanana").setTextureName(Bandb_mod.MODID + ":syrup/itemSyrupYellowBanana").setCreativeTab(BandbCreativeTabs.CreativeTabsMonin);
	
		GameRegistry.registerItem(itemLogoMonin, "itemLogoMonin");	
		GameRegistry.registerItem(itemSyrupAlmond, "itemSyrupAlmond");	
		GameRegistry.registerItem(itemSyrupAmaretto, "itemSyrupAmaretto");	
		GameRegistry.registerItem(itemSyrupAnise, "itemSyrupAnise");	
		GameRegistry.registerItem(itemSyrupApple, "itemSyrupApple");	
		
		GameRegistry.registerItem(itemSyrupApplePie, "itemSyrupApplePie");	
		GameRegistry.registerItem(itemSyrupApricot, "itemSyrupApricot");	
		GameRegistry.registerItem(itemSyrupBasil, "itemSyrupBasil");	
		GameRegistry.registerItem(itemSyrupBitter, "itemSyrupBitter");	
		GameRegistry.registerItem(itemSyrupBlackberry, "itemSyrupBlackberry");	
		
		GameRegistry.registerItem(itemSyrupBlackcurrant, "itemSyrupBlackcurrant");	
		GameRegistry.registerItem(itemSyrupBlackForest, "itemSyrupBlackForest");	
		GameRegistry.registerItem(itemSyrupBloodOrange, "itemSyrupBloodOrange");	
		GameRegistry.registerItem(itemSyrupBlueberry, "itemSyrupBlueberry");	
		GameRegistry.registerItem(itemSyrupBlueCuracao, "itemSyrupBlueCuracao");	
		
		GameRegistry.registerItem(itemSyrupBubbleGum, "itemSyrupBubbleGum");	
		GameRegistry.registerItem(itemSyrupCaipirinha, "itemSyrupCaipirinha");	
		GameRegistry.registerItem(itemSyrupCandyStrawberry, "itemSyrupCandyStrawberry");	
		GameRegistry.registerItem(itemSyrupCaramel, "itemSyrupCaramel");	
		GameRegistry.registerItem(itemSyrupCardamom, "itemSyrupCardamom");	
		
		GameRegistry.registerItem(itemSyrupChaiTea, "itemSyrupChaiTea");	
		GameRegistry.registerItem(itemSyrupCherry, "itemSyrupCherry");	
		GameRegistry.registerItem(itemSyrupCherryPlum, "itemSyrupCherryPlum");	
		GameRegistry.registerItem(itemSyrupChestnut, "itemSyrupChestnut");	
		GameRegistry.registerItem(itemSyrupChocolate, "itemSyrupChocolate");	
		
		GameRegistry.registerItem(itemSyrupChocolateCookie, "itemSyrupChocolateCookie");	
		GameRegistry.registerItem(itemSyrupChocolateMint, "itemSyrupChocolateMint");	
		GameRegistry.registerItem(itemSyrupCinnamon, "itemSyrupCinnamon");	
		GameRegistry.registerItem(itemSyrupCoconut, "itemSyrupCoconut");	
		GameRegistry.registerItem(itemSyrupCoffee, "itemSyrupCoffee");	
		
		GameRegistry.registerItem(itemSyrupCottonCandy, "itemSyrupCottonCandy");	
		GameRegistry.registerItem(itemSyrupCranberry, "itemSyrupCranberry");	
		GameRegistry.registerItem(itemSyrupCremeBrulee, "itemSyrupCremeBrulee");	
		GameRegistry.registerItem(itemSyrupCucumber, "itemSyrupCucumber");	
		GameRegistry.registerItem(itemSyrupElderFlower, "itemSyrupElderFlower");	
		
		GameRegistry.registerItem(itemSyrupFig, "itemSyrupFig");	
		GameRegistry.registerItem(itemSyrupFrostedMint, "itemSyrupFrostedMint");	
		GameRegistry.registerItem(itemSyrupGin, "itemSyrupGin");	
		GameRegistry.registerItem(itemSyrupGinger, "itemSyrupGinger");	
		GameRegistry.registerItem(itemSyrupGingerBread, "itemSyrupGingerBread");	
		
		GameRegistry.registerItem(itemSyrupGlascoLemon, "itemSyrupGlascoLemon");	
		GameRegistry.registerItem(itemSyrupGrapefruit, "itemSyrupGrapefruit");	
		GameRegistry.registerItem(itemSyrupGreenApple, "itemSyrupGreenApple");	
		GameRegistry.registerItem(itemSyrupGreenBanana, "itemSyrupGreenBanana");	
		GameRegistry.registerItem(itemSyrupGreenMint, "itemSyrupGreenMint");	
		
		GameRegistry.registerItem(itemSyrupGrenadine, "itemSyrupGrenadine");	
		GameRegistry.registerItem(itemSyrupGuava, "itemSyrupGuava");	
		GameRegistry.registerItem(itemSyrupGum, "itemSyrupGum");	
		GameRegistry.registerItem(itemSyrupHazelnut, "itemSyrupHazelnut");	
		GameRegistry.registerItem(itemSyrupHibiscus, "itemSyrupHibiscus");	
		
		GameRegistry.registerItem(itemSyrupHoney, "itemSyrupHoney");	
		GameRegistry.registerItem(itemSyrupIrish, "itemSyrupIrish");	
		GameRegistry.registerItem(itemSyrupJasmine, "itemSyrupJasmine");	
		GameRegistry.registerItem(itemSyrupKiwi, "itemSyrupKiwi");	
		GameRegistry.registerItem(itemSyrupLavender, "itemSyrupLavender");	
	
		GameRegistry.registerItem(itemSyrupLemonGrass, "itemSyrupLemonGrass");	
		GameRegistry.registerItem(itemSyrupLemonPie, "itemSyrupLemonPie");	
		GameRegistry.registerItem(itemSyrupLemonTea, "itemSyrupLemonTea");	
		GameRegistry.registerItem(itemSyrupLime, "itemSyrupLime");	
		GameRegistry.registerItem(itemSyrupLimeJuiceCordialMixer, "itemSyrupLimeJuiceCordialMixer");	
		
		GameRegistry.registerItem(itemSyrupLychee, "itemSyrupLychee");	
		GameRegistry.registerItem(itemSyrupMacadamiaNut, "itemSyrupMacadamiaNut");	
		GameRegistry.registerItem(itemSyrupMacaron, "itemSyrupMacaron");	
		GameRegistry.registerItem(itemSyrupMango, "itemSyrupMango");	
		GameRegistry.registerItem(itemSyrupMapleSpice, "itemSyrupMapleSpice");	
		
		GameRegistry.registerItem(itemSyrupMatchaGreenTea, "itemSyrupMatchaGreenTea");	
		GameRegistry.registerItem(itemSyrupMelon, "itemSyrupMelon");	
		GameRegistry.registerItem(itemSyrupMojitoMint, "itemSyrupMojitoMint");	
		GameRegistry.registerItem(itemSyrupMorelloCherry, "itemSyrupMorelloCherry");	
		GameRegistry.registerItem(itemSyrupOrange, "itemSyrupOrange");	
		
		GameRegistry.registerItem(itemSyrupPassionFruit, "itemSyrupPassionFruit");	
		GameRegistry.registerItem(itemSyrupPeach, "itemSyrupPeach");	
		GameRegistry.registerItem(itemSyrupPeachTea, "itemSyrupPeachTea");	
		GameRegistry.registerItem(itemSyrupPear, "itemSyrupPear");	
		GameRegistry.registerItem(itemSyrupPinacolada, "itemSyrupPinacolada");	
		
		GameRegistry.registerItem(itemSyrupPineapple, "itemSyrupPineapple");	
		GameRegistry.registerItem(itemSyrupPinkGrapefruit, "itemSyrupPinkGrapefruit");	
		GameRegistry.registerItem(itemSyrupPistachio, "itemSyrupPistachio");	
		GameRegistry.registerItem(itemSyrupPomegranate, "itemSyrupPomegranate");	
		GameRegistry.registerItem(itemSyrupPraline, "itemSyrupPraline");	
		
		GameRegistry.registerItem(itemSyrupPureCaneSugar, "itemSyrupPureCaneSugar");	
		GameRegistry.registerItem(itemSyrupRantchoLemon, "itemSyrupRantchoLemon");	
		GameRegistry.registerItem(itemSyrupRaspberry, "itemSyrupRaspberry");	
		GameRegistry.registerItem(itemSyrupRaspberryTea, "itemSyrupRaspberryTea");	
		GameRegistry.registerItem(itemSyrupRoastedHazelnut, "itemSyrupRoastedHazelnut");	
		
		GameRegistry.registerItem(itemSyrupRose, "itemSyrupRose");	
		GameRegistry.registerItem(itemSyrupRosmary, "itemSyrupRosmary");	
		GameRegistry.registerItem(itemSyrupRumFlavour, "itemSyrupRumFlavour");	
		GameRegistry.registerItem(itemSyrupSaltedCaramel, "itemSyrupSaltedCaramel");	
		GameRegistry.registerItem(itemSyrupSangria, "itemSyrupSangria");	
		
		GameRegistry.registerItem(itemSyrupSpeculoos, "itemSyrupSpeculoos");	
		GameRegistry.registerItem(itemSyrupSpicy, "itemSyrupSpicy");	
		GameRegistry.registerItem(itemSyrupSpicyMango, "itemSyrupSpicyMango");	
		GameRegistry.registerItem(itemSyrupStrawberry, "itemSyrupStrawberry");	
		GameRegistry.registerItem(itemSyrupTangerine, "itemSyrupTangerine");	
		
		GameRegistry.registerItem(itemSyrupTarragon, "itemSyrupTarragon");	
		GameRegistry.registerItem(itemSyrupTequilaFlavour, "itemSyrupTequilaFlavour");	
		GameRegistry.registerItem(itemSyrupTiramisu, "itemSyrupTiramisu");	
		GameRegistry.registerItem(itemSyrupToffeeNut, "itemSyrupToffeeNut");	
		GameRegistry.registerItem(itemSyrupTonkaBean, "itemSyrupTonkaBean");	
		
		GameRegistry.registerItem(itemSyrupTripleSecCuracao, "itemSyrupTripleSecCuracao");	
		GameRegistry.registerItem(itemSyrupVanilla, "itemSyrupVanilla");	
		GameRegistry.registerItem(itemSyrupViolet, "itemSyrupViolet");	
		GameRegistry.registerItem(itemSyrupWatermelon, "itemSyrupWatermelon");	
		GameRegistry.registerItem(itemSyrupWhiteChocolate, "itemSyrupWhiteChocolate");	
		
		GameRegistry.registerItem(itemSyrupWhitePeach, "itemSyrupWhitePeach");	
		GameRegistry.registerItem(itemSyrupWildStrawberry, "itemSyrupWildStrawberry");	
		GameRegistry.registerItem(itemSyrupYellowBanana, "itemSyrupYellowBanana");	
			
	}

}
