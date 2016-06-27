	package fr.bentur_and_bertatruck.bandb_mod.common.loader;
	
	import cpw.mods.fml.common.registry.GameRegistry;
import fr.bentur_and_bertatruck.bandb_mod.common.Bandb_mod;
import fr.bentur_and_bertatruck.bandb_mod.common.ItemMac;
import fr.bentur_and_bertatruck.bandb_mod.common.itemMushroomAmanitaMuscaria;
import fr.bentur_and_bertatruck.bandb_mod.common.itemPharmaceuticalsDoliprane1000mg;
import fr.bentur_and_bertatruck.bandb_mod.common.itemPharmaceuticalsDoliprane200mg;
import fr.bentur_and_bertatruck.bandb_mod.common.itemPharmaceuticalsDoliprane300mg;
import fr.bentur_and_bertatruck.bandb_mod.common.itemPharmaceuticalsDoliprane500mg;
import fr.bentur_and_bertatruck.bandb_mod.common.item.ItemCapsule;
import fr.bentur_and_bertatruck.bandb_mod.common.item.ItemChili;
import fr.bentur_and_bertatruck.bandb_mod.common.item.ItemGlass;
import fr.bentur_and_bertatruck.bandb_mod.common.item.ItemLabel;
import fr.bentur_and_bertatruck.bandb_mod.common.item.ItemToolsKitchen;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemFood;
import net.minecraftforge.common.util.EnumHelper;
	
	public class BandbItems {
	
	//items ore
		//ingot
		public static Item itemIngotAluminium,itemIngotPlatinum,itemIngotTitan;
		
		//gem
		public static Item itemAmethyst,itemJade,itemOnyx,itemOpal,itemRuby;
		public static Item itemSapphire,itemTopaz,itemPainite;
		
		//dust
		public static Item itemDustAluminium,itemDustAmethyst,itemDustEmerald,itemDustJade,itemSalt;
		public static Item itemDustOpal,itemDustPlatinum,itemDustSteel,itemDustTitan;
		
		//nugget
		public static Item itemNuggetAluminium,itemNuggetAmethyst,itemNuggetEmerald,itemNuggetJade,itemNuggetSteel;
		public static Item itemNuggetOnyx,itemNuggetPlatinum,itemNuggetRuby,itemNuggetSapphire;
					
		//items processed food
		public static Item itemBrownieCoco,itemCocoPopsCrockRoll,itemCountry,itemBrownieCookie,itemBarba;
		public static Item itemBounty,itemMars,itemSnickers,itemTwix,itemSmarties;
		
		public static Item itemKinderSurprise,itemKinderBueno,itemBrowniPecan,itemCerealeLion,itemCerealeNesquik;
		public static Item itemCerealeNesquikLactee,itemChocapic,itemChocapicDuo,itemChocapicFondant,itemSmartiesGlace;
		
		public static Item itemHariboZanzigliss,itemChocapicPepite,itemChocos,itemBarreNesquik,itemBarreChocapic;
		public static Item itemKinderChocolat,itemMilkyway,itemLion,itemBarreMM,itemBarreGlacee;
		
		public static Item itemKitKat,itemCocoPopsCroco,itemCookiesCrisp,itemCrunch,itemFinger;
		public static Item itemFroesties,itemMielPops,itemSavane,itemSavaneNoir,itemSavaneNoisette;
		
		public static Item itemSavanePocket,itemSavaneYaourt,itemSmacks,itemSpecialK,itemTresor;
		public static Item itemTresorBlanc,itemTresorChoco,itemTresorChocoLait,itemWeetos;
		
		public static Item itemApplePie,itemLemonPie,itemBubbleGum,itemBlackForest, itemCandyStrawberry;
		public static Item itemChocolate,ItemCremeBrulee,itemCaramel,itemGingerBread,itemSaltedCaramel;
		
		public static Item itemGum,itemMacaron,itemReastedHazelnut,itemSpeculoos,itemTiramisu;
		public static Item itemCottonCandySugar,itemWhiteChocolate,itemHoney,itemToffeeNut,itemCelerySalt;
		
		public static Item itemIceCube,itemDarkChocolate,itemJamOrange,itemBlackPepper,itemJamCurrant;
		public static Item itemButter,itemKetchup,itemIceCreamVanilla,itemVinegar;
		
		public static Item itemBenco,itemBanania,itemSuperPoulain,itemNesquik,itemNesquikIntense;
		public static Item itemSucreVanille,itemSucreVahine,itemCassonade;
		
		//Gâteau Lu
		public static Item itemLogoLu,itemMikadoChocolatNoir,itemMikadoChocolatLait,itemMikadoKingChoco,itemMikadoChocoNoisette;
		public static Item itemMikadoDaim,itemNapolitain,itemNapolitainClassicIndi,itemNapolitainPartage,itemNapolitain3Choco;
		public static Item itemNapolitainCaramel,itemNapolitainCoco,itemNapolitainFramboise,itemNapolitainMousse,itemNapolitainPraline;
		public static Item itemNapolitainChoco,itemLuluOurson,itemLuluOursonChoco,itemLuluOursonChocolat,itemPepito;
		public static Item itemGranola,itemBarquetteAbricot,itemBarreGranny,itemCoquelineChocolat,itemGateauCoteDOr;
		public static Item itemPetitBeurre,itemPetitLuChocolat,itemPetitLuBeurre,itemPetitCoeur,itemPetitEcolier;
		public static Item itemPockitosCrousti,itemPockitosNoir,itemPrince;
		
		//Milka
		public static Item itemLogoMilka,itemMilka,itemMilkaCaramel,itemMilkaChocolatBlanc,itemMilkaDaim;
		public static Item itemMilkaGranola,itemMilkaInColors,itemMilkaNoisettesEntieres,itemMilkaOreo,itemMilkaRizCroustillant;
		public static Item itemMilkaTendreLait,itemMilkaTuc,itemMilkaLu,itemMilkaChocoBiscuit,itemMilkaChocoJelly;
		public static Item itemMilkaGrosMorceau,itemMilkaGrosMorceauCaramel,itemMilkaGrosMorceauNoistte,itemMilkaGrosMorceauPraline,itemMilkaDaimCrack;
		public static Item itemMilkaMJoy,itemMilkaMJoyCacahuete,itemMilkaMJoyNoisette,itemMilkaTendresMomentMousse,itemMilkaTendresMomentMoussePraline;
		public static Item itemMilkaPullChoco,itemMilkaPullDaim,itemMilkaPullNoisette,itemMilkaPullChocoBarre,itemMilkaPullDaimBarre;
		public static Item itemMilkaPullNoisetteBarre,itemMilkaMeloCakes,itemMilkaCrispello,itemMilkaCrispelloPopcorn,itemMilkaCrispelloVanille;
		public static Item itemMilkaCrispySnax,itemMilkaCrispySnaxDaim,itemMilkaLilaStars,itemMilkaCakeChoc,itemMilkaChocoMooo;
		public static Item itemMilkaChocoSupreme,itemMilkaChocoTutti,itemMilkaChocoTwist,itemCurryLeaf,itemCurry,itemCurryLeafDried;
	
		//Bel
		public static Item itemLogoBel,itemBabybelRed,itemBabybelBlue,itemBabybelYellow,itemBabybelPurple;
		public static Item itemBabybelOrange,itemBabybelLightGreen,itemBabybelGreen,itemBabybelBrown,itemBabybelBlack;
		
//miscellaneous
		public static Item itemJoint,itemIPhone,itemiPad,itemMinecraftForDummies, itemBreakageOfGlass;
		public static Item itemMagentaInkCartridge,itemBlackInkCartridge,itemYellowInkCartridge,itemCyanInkCartridge,itemEmptyInkCartridge;
		public static Item itemBookCocktailGlass,itemBookCocktails,itemBookShaker,itemBookOldFashioned,itemSurpriseKinderYellow;
		public static Item itemBookTumbler,itemSurprise,itemSurpriseKinderRed,itemBleach,itemMac;
		public static Item itemLeatherCowBel, itemLeatherCowCharolais, itemLeatherCowGasconne, itemLeatherCowKerry, itemLeatherCowMilka;
		public static Item itemLeatherCowMontbeliarde,itemWhiteDye,itemBlackDye,itemBlueDye;
		
//fruit
		public static Item itemAlmond,itemApricot,itemBanana,itemCherry,itemClementine;
		public static Item itemDate,itemDragonfruit,itemFig,itemGuava,itemLemon;
		public static Item itemLime,itemLychee,itemPassionfruit,itemPomegranate,itemQuince;
		public static Item itemCoconut,itemTangerine,itemMango,itemChestnut,itemMirabelle;
		public static Item itemNuts,itemWalnut,itemOrange,itemGrapefruit,itemPapaya;
		public static Item itemPeach,itemPear,itemPlum,itemAmla,itemPineappleCayenne;
		public static Item itemPineappleVictoria,itemCranberry,itemBlackcurrant,itemPricklyPear,itemStrawberry;
		public static Item itemRaspberry,itemCurrant,itemJujube,itemKumquat,itemNectarine;
		public static Item itemPersimmon,itemRhubarb,itemKiwi,itemCacao,itemAnise,itemStarAnise;
		public static Item itemAfrican,itemVanilla,itemBreadNut;
		public static Item itemAllspice,itemBael, itemBananaPlantain, itemBayLaurel, itemBlackCherry;
		public static Item itemBlackthorn, itemBrazilNut, itemButternut, itemCinnamon, itemClove;
		public static Item itemDamsonPlum, itemElderberry, itemMacadamia, itemPomelo, itemSatsuma;
		public static Item itemBloodOrange,itemMorelloCherry,itemWhitePeach,itemWildStrawberry;
		public static Item itemAbiu,itemLongan,itemLoquat,itemNutmeg,itemTonkaBean;
		public static Item itemGrapefruitPink,itemBlueBerry,itemBlackBerry;
		public static Item itemBer,itemRedBanana,itemBunyaNut,itemGingkoNut,itemHuckleberries;
		public static Item itemJackfruit,itemMameySapote,itemMangosteen,itemOhiaAi,itemOsageOrange;
		public static Item itemParadiseNut,itemPineNut,itemSapodilla,itemSoursop,itemTamarillo;
		
		//apple
		public static Item itemAppleAntares,itemAppleAriane,itemAppleBelchardChancelier,itemAppleBelleDeBoskoop,itemAppleBraeburn;
		public static Item itemAppleElstar,itemAppleFuji,itemAppleGala,itemAppleGolden,itemAppleGrannySmith;
		public static Item itemAppleHoneycrunch,itemAppleJazz,itemAppleJonagoldJonagored,itemAppleLesRouges,itemApplePinkLady;
		public static Item itemApplePommeDuLimousin,itemAppleReineDesReinettes,itemAppleReinetteGriseDuCanada,itemAppleTentation,itemCrabapple;
		
		//Grape
		public static Item itemGrapeAbouriou,itemGrapeAleaticu,itemGrapeAligote,itemGrapeAltesse,itemGrapeAramon;
		public static Item itemGrapeArbois,itemGrapeArrufiac,itemGrapeAubinVert,itemGrapeBarbarossa,itemGrapeBergeron;
		public static Item itemGrapeBiancone,itemGrapeBiancuGentile,itemGrapeBourboulenc,itemGrapeBraquet,itemGrapeCabernetFranc;
		public static Item itemGrapeCabernetSauvignon,itemGrapeCamarese,itemGrapeCarcaghjoluBiancu,itemGrapeCarcaghjoluNeru,itemGrapeCarignan;
		public static Item itemGrapeCesar,itemGrapeChardonnay,itemGrapeChenin,itemGrapeCinsault,itemGrapeClairette;
		public static Item itemGrapeColombard,itemGrapeCot,itemGrapeCounoise,itemGrapeCourbu,itemGrapeCudiverta;
		public static Item itemGrapeDuras,itemGrapeFerServadou,itemGrapeFolleBlanche,itemGrapeGamay,itemGrapeGewurztraminer;
		public static Item itemGrapeGrenache,itemGrapeGrenacheBlanc,itemGrapeGrolleau,itemGrapeGrosMenseng,itemGrapeJacquere;
		public static Item itemGrapeLenDeLEl,itemGrapeListan,itemGrapeMaccabeu,itemGrapeMalbec,itemGrapeMalvoisie;
		public static Item itemGrapeMarsanne,itemGrapeMarselan,itemGrapeMauzac,itemGrapeMelon,itemGrapeMelonDeBourgogne;
		public static Item itemGrapeMerlot,itemGrapeMolette,itemGrapeMollard,itemGrapeMondeuse,itemGrapeMondeuseBlanche;
		public static Item itemGrapeMourvedre,itemGrapeMuscadelle,itemGrapeMuscardin,itemGrapeMuscatBlancAPetitsGrains,itemGrapeMuscatDAlexandrie;
		public static Item itemGrapeNegrette,itemGrapeNielluccio,itemGrapePagaDebiti,itemGrapePetitCourbu,itemGrapePetitMenseng;
		public static Item itemGrapePetitVerdot,itemGrapePineauDAunis,itemGrapePinotBlanc,itemGrapePinotMeunier,itemGrapePinotNoir;
		public static Item itemGrapePiquepoul,itemGrapePoulsard,itemGrapeRiesling,itemGrapeRomorantin,itemGrapeRossulaBianca;
		public static Item itemGrapeSacy,itemGrapeSauvignon,itemGrapeSavagnin,itemGrapeSemillon,itemGrapeSylvaner;
		public static Item itemGrapeSyrah,itemGrapeTannat,itemGrapeTeoulier,itemGrapeTerretNoir,itemGrapeTibouren;
		public static Item itemGrapeTressalier,itemGrapeUgniBlanc,itemGrapeVaccarese,itemGrapeVermentinu,itemGrapeViognier;
		
//vegetables	
		public static Item itemAvocado,itemOlive,itemGarlic,itemAsparagus,itemEggplant;
		public static Item itemBeet,itemBroccoli,itemPeanut,itemCarrotTouchon,itemCashew;
		public static Item itemCelery,itemBrusselsSprout,itemCauliflower,itemRedCabbage,itemCabbage;
		public static Item itemCucumber,itemZucchini,itemParsnip,itemPistachio,itemTomato;
		public static Item itemShallots,itemSpinach,itemGinger,itemFrenchBeans,itemLens;
		public static Item itemTurnip,itemOnion,itemParsley,itemChili,itemLeek;
		public static Item itemSweetRedPepper,itemSweetGreenPepper,itemRadish,itemRutabaga,itemSalat;
		public static Item itemChicory,itemFlageolet,itemPea,itemChickpea,itemSweetYellowPepper;
		public static Item itemGherkin,itemBasil,itemCardamom,itemCherryTomato;
		
//Coffee and tea
		public static Item itemMugCoffeeEmpty,itemTeapot,itemCapsuleArpeggio,itemCapsuleBukeelaKaEthiopia,itemCapsuleCapriccio;
		public static Item itemCapsuleCosi,itemCapsuleDecaffeinato,itemCapsuleDecaffeinatoIntenso,itemCapsuleIndriyaFromIndia,itemCapsuleKazaar;
		public static Item itemCapsuleRistretto;
		public static Item itemCapsuleDecaffeinatoLungo,itemCapsuleRosabayaDeColombia,itemCapsuleDulsaoDoBrasil,itemCapsuleFortissioLungo,itemCapsuleLinizioLungo;
		public static Item itemCapsuleLivanto,itemCapsuleRoma,itemCapsuleVivaltoLungo,itemCapsuleVolluto,itemCapsuleDharkan;
		
		public static Item itemCapsuleArpeggioEmpty,itemCapsuleBukeelaKaEthiopiaEmpty,itemCapsuleCapriccioEmpty;
		public static Item itemCapsuleCosiEmpty,itemCapsuleDecaffeinatoEmpty,itemCapsuleDecaffeinatoIntensoEmpty,itemCapsuleIndriyaFromIndiaEmpty,itemCapsuleKazaarEmpty;
		public static Item itemCapsuleRistrettoEmpty;
		public static Item itemCapsuleDecaffeinatoLungoEmpty,itemCapsuleRosabayaDeColombiaEmpty,itemCapsuleDulsaoDoBrasilEmpty,itemCapsuleFortissioLungoEmpty,itemCapsuleLinizioLungoEmpty;
		public static Item itemCapsuleLivantoEmpty,itemCapsuleRomaEmpty,itemCapsuleVivaltoLungoEmpty,itemCapsuleVollutoEmpty,itemCapsuleDharkanEmpty;
		
		
		public static Item itemCoffeeArabicas,itemCoffeeBlueMountain,itemCoffeeBourbonPointu,itemCoffeeCattura,itemCoffeeHarrar;
		public static Item itemCoffeeHuehuetenango,itemCoffeeJava,itemCoffeeKenyaAA,itemCoffeeKona,itemCoffeeKontirWildForest;
		public static Item itemCoffeeKopiLuwak,itemCoffeeKupeAlamid,itemCoffeeMoka,itemCoffeeMundoNovo,itemCoffeeMuragogype;
		public static Item itemCoffeePeaberry,itemCoffeeTarrazu,itemCoffeeTorajaKalossi,itemCoffeeYirgacheffe,itemTeaLeaves;
		public static Item itemCoffeeArabicasGround,itemCoffeeBlueMountainGround,itemCoffeeBourbonPointuGround,itemCoffeeCatturaGround,itemCoffeeHarrarGround;
		public static Item itemCoffeeHuehuetenangoGround,itemCoffeeJavaGround,itemCoffeeKenyaAAGround,itemCoffeeKonaGround,itemCoffeeKontirWildForestGround;
		public static Item itemCoffeeKopiLuwakGround,itemCoffeeKupeAlamidGround,itemCoffeeMokaGround,itemCoffeeMundoNovoGround,itemCoffeeMuragogypeGround;
		public static Item itemCoffeePeaberryGround,itemCoffeeTarrazuGround,itemCoffeeTorajaKalossiGround,itemCoffeeYirgacheffeGround,itemDriedTeaLeaves;
		
		public static Item itemLemonTea,itemPeachTea,itemRaspberryTea,itemMatchaGreenTea,itemChaiTea;
		
		public static Item itemCupArpeggio,itemCupBukeelaKaEthiopia,itemCupCapriccio,itemCupCosi,itemCupDecaffeinato;
		public static Item itemCupDecaffeinatoIntenso,itemCupIndriyaFromIndia,itemCupKazaar,itemCupRistretto,itemCupLinizioLungo;
		public static Item itemCupRosabayaDeColombia,itemCupDulsaoDoBrasil,itemCupFortissioLungo,itemCupLivanto,itemCupDecaffeinatoLungo;
		public static Item itemCupRoma,itemCupVivaltoLungo,itemCupVolluto,itemCupDharkan;
		
		
//mushrooms
		public static Item itemTruffle,itemAmanitaMuscaria,itemWhiteMushroom;
		public static Item itemMorel,itemHornOfPlenty,itemCep,itemHydnumRepandum;
		
		//grains
		public static Item itemBuckwheat,itemHemp,itemSpelt,itemFonio,itemHop;
		public static Item itemOats,itemMalt,itemMillet,itemRye,itemSorghum;			
		public static Item itemCorn,itemBarley,itemRice,itemSesameSeed;
		
		//plants
		public static Item itemMustard,itemMint,itemCotton,itemBetterCactus,itemRape;
		public static Item itemSesame,itemOrchid,itemLicorice,itemDaisy,itemHibiscus;
		public static Item itemJasmine,itemLavender,itemRosmary,itemTarragon, itemAgave;
		public static Item itemAmaryllisPink, itemAmaryllisRed, itemAmaryllisWhite, itemBachelorsButtonBlue, itemBelladonna;
		public static Item itemBlowball, itemButtercup, itemCallaBlack, itemCallaWhite, itemCannabis;
		public static Item itemChrysantheme, itemEnzian, itemFoxglove, itemHeather, itemIrisBlue;
		public static Item itemIrisPurple, itemLeafCoca, itemLily, itemMarshMarigold, itemPansy;
		public static Item itemPeony, itemSyringa, itemTobacco, itemViolet, itemLemonGrass;
		public static Item itemPeyote,itemBluebell,itemDill,itemGardenia,itemNettle,itemThistle;
		public static Item itemWormwood,itemCinchona,itemChives,itemChervil,itemWatercress;
		public static Item itemThyme,itemSage,itemOregano,itemFennel,itemGentian;
// labels		
		public static Item itemCapCorseLabel,itemBenturColaLabel,itemBrandyLabel,itemCalvadosLabel,itemChouchenLabel;
		public static Item itemCiderLabel,itemCognacLabel,itemGinLabel,itemLambigLabel;
		public static Item itemLiquorLabel,itemPastis51Label,itemPerrierLabel,itemPommeauLabel,itemRedMartiniLabel;
		public static Item itemRedPortLabel,itemRumLabel,itemTequilaLabel,itemVinegarLabel;
		public static Item itemVodkaLabel,itemWhiskeyLabel,itemWhiteMartiniLabel,itemWhitePortLabel;
		public static Item itemSiropMoninOrangeLabel,itemBordeauxTourLabel,itemBordeauxLaryLabel;
		public static Item itemBlueCuracaoLabel,itemTabascoLabel,itemPontarlierLabel,itemDubonnetRougeLabel,itemBenedictineLabel;
		public static Item itemWorcestershireSauceLabel,itemAmarettoLabel,itemBitterLabel,itemCuracaoTripleSecLabel;
		public static Item itemHeinekenLabel,itemBaileysLabel,itemChartreuseVerteLabel,itemPiscoLabel,itemCuracaoOrangeLabel;
		public static Item itemCampariLabel,itemAngosturaBitterLabel,itemPetrusLabel,itemDrambuieLabel,itemFleurOrangerLabel;
		public static Item itemChartreuseJauneLabel,itemGrandMarnierLabel,itemLimonadeLabel,itemXeresLabel,itemSchweppesTonicLabel;
		public static Item itemSchweppesGingerAleLabel,itemFernetBrancaLabel,itemChampagneMummLabel,itemGuinnessLabel;
		public static Item itemEnateLabel,itemAlsaceRieslingLabel,itemBourgogneAligoteLabel,itemSouthernComfortLabel;
		public static Item itemLabelHoney,itemLabelSchweppesAgrum,itemLabelSchweppesDarkSide,itemLabelSchweppesLemon,itemLabelSchweppesMango;
		public static Item itemLabelSchweppesPamplemousse,itemLabelSchweppesPassion,itemLabelSchweppesPech,itemLabelSchweppesPomme,itemLabelSchweppesRicqles;
		public static Item itemLabel1664,itemLabelBritt,itemLabelDesperados,itemLabelDuvel,itemLabelGrimbergen;
		public static Item itemLabelLeffe,itemLabelSanMiguel,itemLabelSkoll,itemLabelSmirnoff,itemLabelXII;
		public static Item itemLabelGet27,itemLabelSchweppesRaisin;
		
//pharmaceuticals		
		public static Item itemDoliprane200mg,itemDoliprane300mg,itemDoliprane500mg,itemDoliprane1000mg;
		
// wrappings		
		public static Item itemWrappingDoliprane200mg,itemWrappingDoliprane300mg,itemWrappingDoliprane500mg,itemWrappingDoliprane1000mg;
		
// tools
		//Tools Material
				public static ToolMaterial toolGode = EnumHelper.addToolMaterial("toolGode", 2, 16, 12.0F,12.0F, 1);
			
		public static Item itemPinkGode,itemPurpleGode,itemGreenGode,itemBlueGode,itemRedGode;
		public static Item itemAdjustableSpanner;
		//kitchen tools
		public static Item itemFlyingPan,itemCheeseKnife,itemCleaverIron,itemKnifeIron,itemShaker;
		public static Item itemPizzaWheel,itemFoforkStone,itemCookieCutterStar,itemCookieCutterSquare,itemCookieCutterMan;
		public static Item itemCookieCutterCircle,itemCheeseGrater,itemBucketBelMilk,itemBucketMilkaMilk,itemScrewdriver;
		public static Item itemCocktailGlass,itemFlute,itemOldFashoned,itemTumbler,itemGlassCup;
		public static Item itemCocktailGlassDirty,itemFluteDirty,itemGlassCupDirty,itemOldFashonnedDirty,itemTumblerDirty;
		public static Item itemLightsaberBlue,itemLightsaberGreen,itemLightsaberPurple,itemLightsaberRed;
		public static Item itemLightsaberBlue2,itemLightsaberGreen2,itemLightsaberPurple2,itemLightsaberRed2;
		

//creative only
		public static Item itemCreativeOnly,itemBug;
		
//Butterfly
		public static Item itemButterflyAcmonBlue,itemButterflyAfricanCloudedYellow,itemButterflyAfricanMapWing,itemButterflyAfricanPeachMoth,itemButterflyAlcidesAgathyrsus;

		
//meat 
		//raw
			//chicken
		public static Item itemChickenFleshRaw, itemChickenFullRaw, itemChickenLegRaw, itemChickenNuggetRaw;		
			//cow
		public static Item itemCowForeRibRaw,itemCowRumpsteakRaw;		
			//sheep
		public static Item itemLegMuttonRaw, itemSaddleMuttonRaw, itemShoulderMuttonRaw,itemMuttonBrain;		
			//pig
		public static Item itemPorkForeLoinRaw, itemPorkHamRaw, itemPorkLoinChopsRaw;
			//miscellaneous
		public static Item itemWorm, itemZombieArm, itemZombieFeet ;
		
		//cooked
			//chicken
		public static Item itemChickenFleshCooked, itemChickenFullCooked, itemChickenLegCooked, itemChickenNuggetCooked;
			//cow
		public static Item itemCowForeRibCooked, itemCowRumpsteakCooked;
			//sheep
		public static Item itemLegMuttonCooked, itemSaddleMuttonCooked, itemShoulderMuttonCooked,itemMuttonCookedBrain;
			//pig
		public static Item itemPorkForeLoinCooked, itemPorkHamCooked, itemPorkLoinChopsCooked;
		
//item dried
		public static Item itemLeaveCocaDried, itemTobaccoDried;
		
//item kebab
		public static Item itemKebabRaw, itemKebabSpit, itemKebab;
		
//Item Ingot Dust Nugget	
		public static void LoaderItemIngotDustNugget(Boolean bool){
			if(bool = true){				

			//items ore
	    	//ingot
		    	itemIngotAluminium = new Item().setUnlocalizedName("itemIngotAluminium").setTextureName(Bandb_mod.MODID + ":ore/ingot/itemIngotAluminium").setCreativeTab(BandbCreativeTabs.CreativeTabsOre);		    	
		    	itemIngotPlatinum = new Item().setUnlocalizedName("itemIngotPlatinum").setTextureName(Bandb_mod.MODID + ":ore/ingot/itemIngotPlatinum").setCreativeTab(BandbCreativeTabs.CreativeTabsOre);
				itemIngotTitan = new Item().setUnlocalizedName("itemIngotTitan").setTextureName(Bandb_mod.MODID + ":ore/ingot/itemIngotTitan").setCreativeTab(BandbCreativeTabs.CreativeTabsOre);

		    	GameRegistry.registerItem(itemIngotAluminium, "itemIngotAluminium");		    	
		    	GameRegistry.registerItem(itemIngotPlatinum, "itemIngotPlatinum");		    
		    	GameRegistry.registerItem(itemIngotTitan, "itemIngotTitan");
		    
		    	//gem
				itemAmethyst = new Item().setUnlocalizedName("itemAmethyst").setTextureName(Bandb_mod.MODID + ":ore/ingot/itemAmethyst").setCreativeTab(BandbCreativeTabs.CreativeTabsOre);
				itemJade = new Item().setUnlocalizedName("itemJade").setTextureName(Bandb_mod.MODID + ":ore/ingot/itemJade").setCreativeTab(BandbCreativeTabs.CreativeTabsOre);
				itemOnyx = new Item().setUnlocalizedName("itemOnyx").setTextureName(Bandb_mod.MODID + ":ore/ingot/itemOnyx").setCreativeTab(BandbCreativeTabs.CreativeTabsOre);
				itemOpal = new Item().setUnlocalizedName("itemOpal").setTextureName(Bandb_mod.MODID + ":ore/ingot/itemOpal").setCreativeTab(BandbCreativeTabs.CreativeTabsOre);
				itemRuby = new Item().setUnlocalizedName("itemRuby").setTextureName(Bandb_mod.MODID + ":ore/ingot/itemRuby").setCreativeTab(BandbCreativeTabs.CreativeTabsOre);
		
				itemSapphire = new Item().setUnlocalizedName("itemSapphire").setTextureName(Bandb_mod.MODID + ":ore/ingot/itemSapphire").setCreativeTab(BandbCreativeTabs.CreativeTabsOre);
				itemTopaz = new Item().setUnlocalizedName("itemTopaz").setTextureName(Bandb_mod.MODID + ":ore/ingot/itemTopaz").setCreativeTab(BandbCreativeTabs.CreativeTabsOre);
				itemPainite = new Item().setUnlocalizedName("itemPainite").setTextureName(Bandb_mod.MODID + ":ore/ingot/itemPainite").setCreativeTab(BandbCreativeTabs.CreativeTabsOre);
				
				GameRegistry.registerItem(itemAmethyst, "itemAmethyst");
		    	GameRegistry.registerItem(itemJade, "itemJade");
		    	GameRegistry.registerItem(itemOnyx, "itemOnyx");
		    	GameRegistry.registerItem(itemOpal, "itemOpal");
		    	GameRegistry.registerItem(itemRuby, "itemRuby");	    	
		
		    	GameRegistry.registerItem(itemSapphire, "itemSapphire");
		    	GameRegistry.registerItem(itemTopaz, "itemTopaz");
		    	GameRegistry.registerItem(itemPainite, "itemPainite");
		    	
		    	//dust
				
				itemDustAluminium = new Item().setUnlocalizedName("itemDustAluminium").setTextureName(Bandb_mod.MODID + ":ore/dust/itemDustAluminium").setCreativeTab(BandbCreativeTabs.CreativeTabsOre);
				itemDustAmethyst = new Item().setUnlocalizedName("itemDustAmethyst").setTextureName(Bandb_mod.MODID + ":ore/dust/itemDustAmethyst").setCreativeTab(BandbCreativeTabs.CreativeTabsOre);
		
				itemDustEmerald = new Item().setUnlocalizedName("itemDustEmerald").setTextureName(Bandb_mod.MODID + ":ore/dust/itemDustEmerald").setCreativeTab(BandbCreativeTabs.CreativeTabsOre);
				itemDustJade = new Item().setUnlocalizedName("itemDustJade").setTextureName(Bandb_mod.MODID + ":ore/dust/itemDustJade").setCreativeTab(BandbCreativeTabs.CreativeTabsOre);

				GameRegistry.registerItem(itemDustAluminium, "itemDustAluminium");
		    	GameRegistry.registerItem(itemDustAmethyst, "itemDustAmethyst");
		
		    	GameRegistry.registerItem(itemDustEmerald, "itemDustEmerald");
		    	GameRegistry.registerItem(itemDustJade, "itemDustJade");
				itemSalt = new Item().setUnlocalizedName("itemSalt").setTextureName(Bandb_mod.MODID + ":ore/dust/itemSalt").setCreativeTab(BandbCreativeTabs.CreativeTabsOre);
				itemDustOpal = new Item().setUnlocalizedName("itemDustOpal").setTextureName(Bandb_mod.MODID + ":ore/dust/itemDustOpal").setCreativeTab(BandbCreativeTabs.CreativeTabsOre);
		
				itemDustPlatinum = new Item().setUnlocalizedName("itemDustPlatinum").setTextureName(Bandb_mod.MODID + ":ore/dust/itemDustPlatinum").setCreativeTab(BandbCreativeTabs.CreativeTabsOre);
				itemDustSteel = new Item().setUnlocalizedName("itemDustSteel").setTextureName(Bandb_mod.MODID + ":ore/dust/itemDustSteel").setCreativeTab(BandbCreativeTabs.CreativeTabsOre);
				itemDustTitan = new Item().setUnlocalizedName("itemDustTitan").setTextureName(Bandb_mod.MODID + ":ore/dust/itemDustTitan").setCreativeTab(BandbCreativeTabs.CreativeTabsOre);
				
		    	GameRegistry.registerItem(itemSalt, "itemSalt");
		    	GameRegistry.registerItem(itemDustOpal, "itemDustOpal");
		
		    	GameRegistry.registerItem(itemDustPlatinum, "itemDustPlatinum");
		    	GameRegistry.registerItem(itemDustSteel, "itemDustSteel");
		    	GameRegistry.registerItem(itemDustTitan, "itemDustTitan");
		
				itemDustAluminium = new Item().setUnlocalizedName("itemDustAluminium").setTextureName(Bandb_mod.MODID + ":ore/dust/itemDustAluminium").setCreativeTab(BandbCreativeTabs.CreativeTabsOre);
				GameRegistry.registerItem(itemDustAluminium, "item_Dust_Aluminium");
		    	
				//nugget
				itemNuggetAluminium = new Item().setUnlocalizedName("itemNuggetAluminium").setTextureName(Bandb_mod.MODID + ":ore/nugget/itemNuggetAluminium").setCreativeTab(BandbCreativeTabs.CreativeTabsOre);
		    	itemNuggetAmethyst = new Item().setUnlocalizedName("itemNuggetAmethyst").setTextureName(Bandb_mod.MODID + ":ore/nugget/itemNuggetAmethyst").setCreativeTab(BandbCreativeTabs.CreativeTabsOre);
		    	itemNuggetEmerald = new Item().setUnlocalizedName("itemNuggetEmerald").setTextureName(Bandb_mod.MODID + ":ore/nugget/itemNuggetEmerald").setCreativeTab(BandbCreativeTabs.CreativeTabsOre);
		
		    	itemNuggetJade = new Item().setUnlocalizedName("itemNuggetJade").setTextureName(Bandb_mod.MODID + ":ore/nugget/itemNuggetJade").setCreativeTab(BandbCreativeTabs.CreativeTabsOre);
		    	GameRegistry.registerItem(itemNuggetAluminium, "itemNuggetAluminium");
		    	GameRegistry.registerItem(itemNuggetAmethyst, "itemNuggetAmethyst");
		    	GameRegistry.registerItem(itemNuggetEmerald, "itemNuggetEmerald");
		
		    	GameRegistry.registerItem(itemNuggetJade, "itemNuggetJade");
		    	
		    	itemNuggetOnyx = new Item().setUnlocalizedName("itemNuggetOnyx").setTextureName(Bandb_mod.MODID + ":ore/nugget/itemNuggetOnyx").setCreativeTab(BandbCreativeTabs.CreativeTabsOre);
				itemNuggetPlatinum = new Item().setUnlocalizedName("itemNuggetPlatinum").setTextureName(Bandb_mod.MODID + ":ore/nugget/itemNuggetPlatinum").setCreativeTab(BandbCreativeTabs.CreativeTabsOre);
				itemNuggetRuby = new Item().setUnlocalizedName("itemNuggetRuby").setTextureName(Bandb_mod.MODID + ":ore/nugget/itemNuggetRuby").setCreativeTab(BandbCreativeTabs.CreativeTabsOre);
				itemNuggetSapphire = new Item().setUnlocalizedName("itemNuggetSapphire").setTextureName(Bandb_mod.MODID + ":ore/nugget/itemNuggetSapphire").setCreativeTab(BandbCreativeTabs.CreativeTabsOre);
		
				itemNuggetSteel = new Item().setUnlocalizedName("itemNuggetSteel").setTextureName(Bandb_mod.MODID + ":ore/nugget/itemNuggetSteel").setCreativeTab(BandbCreativeTabs.CreativeTabsOre);
		
		    	GameRegistry.registerItem(itemNuggetOnyx, "itemNuggetOnyx");
		    	GameRegistry.registerItem(itemNuggetPlatinum, "itemNuggetPlatinum");
		    	GameRegistry.registerItem(itemNuggetRuby, "itemNuggetRuby");
		    	GameRegistry.registerItem(itemNuggetSapphire, "itemNuggetSapphire");
		
		    	GameRegistry.registerItem(itemNuggetSteel, "itemNuggetSteel");
		    	
		    	
		    	
		    	
			}
		}
		
//item processed food		
		public static void loaderProcessFood(boolean bool){
			if(bool = true){
				//items processed food 
				itemCerealeLion = new ItemFood(2,1.0F,false).setUnlocalizedName("itemCerealeLion").setTextureName(Bandb_mod.MODID + ":processed food/itemCerealeLion").setCreativeTab(BandbCreativeTabs.CreativeTabsProcessedFood);
				itemCerealeNesquik = new ItemFood(2,1.0F,false).setUnlocalizedName("itemCerealeNesquik").setTextureName(Bandb_mod.MODID + ":processed food/itemCerealeNesquik").setCreativeTab(BandbCreativeTabs.CreativeTabsProcessedFood);
				itemCerealeNesquikLactee = new ItemFood(2,1.0F,false).setUnlocalizedName("itemCerealeNesquikLactee").setTextureName(Bandb_mod.MODID + ":processed food/itemCerealeNesquikLactee").setCreativeTab(BandbCreativeTabs.CreativeTabsProcessedFood);
				itemChocapic = new ItemFood(5, 1.0F, false).setUnlocalizedName("itemChocapic").setTextureName(Bandb_mod.MODID + ":processed food/itemChocapic").setCreativeTab(BandbCreativeTabs.CreativeTabsProcessedFood);
		    	itemChocapicDuo = new ItemFood(5, 1.0F, false).setUnlocalizedName("itemChocapicDuo").setTextureName(Bandb_mod.MODID + ":processed food/itemChocapicDuo").setCreativeTab(BandbCreativeTabs.CreativeTabsProcessedFood);
		    	
		    	itemChocapicFondant = new ItemFood(5, 1.0F, false).setUnlocalizedName("itemChocapicFondant").setTextureName(Bandb_mod.MODID + ":processed food/itemChocapicFondant").setCreativeTab(BandbCreativeTabs.CreativeTabsProcessedFood);
		    	itemChocapicPepite = new ItemFood(5, 1.0F, false).setUnlocalizedName("itemChocapicPepite").setTextureName(Bandb_mod.MODID + ":processed food/itemChocapicPepite").setCreativeTab(BandbCreativeTabs.CreativeTabsProcessedFood);		
				itemCocoPopsCrockRoll = new ItemFood(5,1.0F,false).setUnlocalizedName("itemCocoPopsCrockRoll").setTextureName(Bandb_mod.MODID + ":processed food/itemCocoPopsCrockRoll").setCreativeTab(BandbCreativeTabs.CreativeTabsProcessedFood);
				itemCocoPopsCroco = new ItemFood(5,1.0F,false).setUnlocalizedName("itemCocoPopsCroco").setTextureName(Bandb_mod.MODID + ":processed food/itemCocoPopsCroco").setCreativeTab(BandbCreativeTabs.CreativeTabsProcessedFood);
				itemCookiesCrisp = new ItemFood(5,1.0F,false).setUnlocalizedName("itemCookiesCrisp").setTextureName(Bandb_mod.MODID + ":processed food/itemCookiesCrisp").setCreativeTab(BandbCreativeTabs.CreativeTabsProcessedFood);
				
				itemCrunch = new ItemFood(5,1.0F,false).setUnlocalizedName("itemCrunch").setTextureName(Bandb_mod.MODID + ":processed food/itemCrunch").setCreativeTab(BandbCreativeTabs.CreativeTabsProcessedFood);
				itemFroesties = new ItemFood(5,1.0F,false).setUnlocalizedName("itemFroesties").setTextureName(Bandb_mod.MODID + ":processed food/itemFroesties").setCreativeTab(BandbCreativeTabs.CreativeTabsProcessedFood);
				itemMielPops = new ItemFood(5,1.0F,false).setUnlocalizedName("itemMielPops").setTextureName(Bandb_mod.MODID + ":processed food/itemMielPops").setCreativeTab(BandbCreativeTabs.CreativeTabsProcessedFood);
				itemSmacks = new ItemFood(5,1.0F,false).setUnlocalizedName("itemSmacks").setTextureName(Bandb_mod.MODID + ":processed food/itemSmacks").setCreativeTab(BandbCreativeTabs.CreativeTabsProcessedFood);
				itemSpecialK = new ItemFood(5,1.0F,false).setUnlocalizedName("itemSpecialK").setTextureName(Bandb_mod.MODID + ":processed food/itemSpecialK").setCreativeTab(BandbCreativeTabs.CreativeTabsProcessedFood);
				
				itemTresor = new ItemFood(5,1.0F,false).setUnlocalizedName("itemTresor").setTextureName(Bandb_mod.MODID + ":processed food/itemTresor").setCreativeTab(BandbCreativeTabs.CreativeTabsProcessedFood);
				itemTresorBlanc = new ItemFood(5,1.0F,false).setUnlocalizedName("itemTresorBlanc").setTextureName(Bandb_mod.MODID + ":processed food/itemTresorBlanc").setCreativeTab(BandbCreativeTabs.CreativeTabsProcessedFood);
				itemTresorChoco = new ItemFood(5,1.0F,false).setUnlocalizedName("itemTresorChoco").setTextureName(Bandb_mod.MODID + ":processed food/itemTresorChoco").setCreativeTab(BandbCreativeTabs.CreativeTabsProcessedFood);
				itemTresorChocoLait = new ItemFood(5,1.0F,false).setUnlocalizedName("itemTresorChocoLait").setTextureName(Bandb_mod.MODID + ":processed food/itemTresorChocoLait").setCreativeTab(BandbCreativeTabs.CreativeTabsProcessedFood);
				itemWeetos = new ItemFood(5,1.0F,false).setUnlocalizedName("itemWeetos").setTextureName(Bandb_mod.MODID + ":processed food/itemWeetos").setCreativeTab(BandbCreativeTabs.CreativeTabsProcessedFood);
				
				itemChocos = new ItemFood(5,1.0F,false).setUnlocalizedName("itemChocos").setTextureName(Bandb_mod.MODID + ":processed food/itemChocos").setCreativeTab(BandbCreativeTabs.CreativeTabsProcessedFood);
				itemApplePie = new ItemFood(5,1.0F,false).setUnlocalizedName("itemApplePie").setTextureName(Bandb_mod.MODID + ":processed food/itemApplePie").setCreativeTab(BandbCreativeTabs.CreativeTabsProcessedFood);
				itemLemonPie = new ItemFood(5,1.0F,false).setUnlocalizedName("itemLemonPie").setTextureName(Bandb_mod.MODID + ":processed food/itemLemonPie").setCreativeTab(BandbCreativeTabs.CreativeTabsProcessedFood);
				itemBlackForest = new ItemFood(5,1.0F,false).setUnlocalizedName("itemBlackForest").setTextureName(Bandb_mod.MODID + ":processed food/itemBlackForest").setCreativeTab(BandbCreativeTabs.CreativeTabsProcessedFood);
				itemBubbleGum = new ItemFood(5,1.0F,false).setUnlocalizedName("itemBubbleGum").setTextureName(Bandb_mod.MODID + ":processed food/itemBubbleGum").setCreativeTab(BandbCreativeTabs.CreativeTabsProcessedFood);
				
				GameRegistry.registerItem(itemCerealeLion, "itemCerealeLion");
		    	GameRegistry.registerItem(itemCerealeNesquik, "itemCerealeNesquik");
		    	GameRegistry.registerItem(itemCerealeNesquikLactee, "itemCerealeNesquikLactee");
		    	GameRegistry.registerItem(itemChocapic, "itemChocapic");
				GameRegistry.registerItem(itemChocapicDuo, "itemChocapicDuo");
		    	
				GameRegistry.registerItem(itemChocapicFondant, "itemChocapicFondant");
		    	GameRegistry.registerItem(itemChocapicPepite, "itemChocapicPepite");
		    	GameRegistry.registerItem(itemCocoPopsCrockRoll, "itemCocoPopsCrockRoll");
		    	GameRegistry.registerItem(itemCocoPopsCroco, "itemCocoPopsCroco");
		    	GameRegistry.registerItem(itemCookiesCrisp, "itemCookiesCrisp");
		    	
		    	GameRegistry.registerItem(itemCrunch, "itemCrunch");	    	
		    	GameRegistry.registerItem(itemFroesties, "itemFroesties");
		    	GameRegistry.registerItem(itemMielPops, "itemMielPops");
		    	GameRegistry.registerItem(itemSmacks, "itemSmacks");
		    	GameRegistry.registerItem(itemSpecialK, "itemSpecialK");
		    	
		    	GameRegistry.registerItem(itemTresor, "itemTresor");	    		    	
		    	GameRegistry.registerItem(itemTresorBlanc, "itemTresorBlanc");
		    	GameRegistry.registerItem(itemTresorChoco, "itemTresorChoco");
		    	GameRegistry.registerItem(itemTresorChocoLait, "itemTresorChocoLait");
		    	GameRegistry.registerItem(itemWeetos, "itemWeetos");
		    	
		    	GameRegistry.registerItem(itemChocos, "itemChocos");
		    	GameRegistry.registerItem(itemApplePie, "itemApplePie");
		    	GameRegistry.registerItem(itemLemonPie, "itemLemonPie");
		    	GameRegistry.registerItem(itemBlackForest, "itemBlackForest");
		    	GameRegistry.registerItem(itemBubbleGum, "itemBubbleGum");
		    	
		    	itemCandyStrawberry = new ItemFood(5,1.0F,false).setUnlocalizedName("itemCandyStrawberry").setTextureName(Bandb_mod.MODID + ":processed food/itemCandyStrawberry").setCreativeTab(BandbCreativeTabs.CreativeTabsProcessedFood);
				itemChocolate = new ItemFood(5,1.0F,false).setUnlocalizedName("itemChocolate").setTextureName(Bandb_mod.MODID + ":processed food/itemChocolate").setCreativeTab(BandbCreativeTabs.CreativeTabsProcessedFood);
				ItemCremeBrulee = new ItemFood(5,1.0F,false).setUnlocalizedName("ItemCremeBrulee").setTextureName(Bandb_mod.MODID + ":processed food/ItemCremeBrulee").setCreativeTab(BandbCreativeTabs.CreativeTabsProcessedFood);
				itemCaramel = new ItemFood(5,1.0F,false).setUnlocalizedName("itemCaramel").setTextureName(Bandb_mod.MODID + ":processed food/itemCaramel").setCreativeTab(BandbCreativeTabs.CreativeTabsProcessedFood);
				itemGingerBread = new ItemFood(5,1.0F,false).setUnlocalizedName("itemGingerBread").setTextureName(Bandb_mod.MODID + ":processed food/itemGingerBread").setCreativeTab(BandbCreativeTabs.CreativeTabsProcessedFood);
			
				GameRegistry.registerItem(itemCandyStrawberry, "itemCandyStrawberry");
		    	GameRegistry.registerItem(itemChocolate, "itemChocolate");
		    	GameRegistry.registerItem(ItemCremeBrulee, "ItemCremeBrulee");
		    	GameRegistry.registerItem(itemCaramel, "itemCaramel");
			 	GameRegistry.registerItem(itemGingerBread, "itemGingerBread");
			 	
				itemSaltedCaramel = new ItemFood(5,1.0F,false).setUnlocalizedName("itemSaltedCaramel").setTextureName(Bandb_mod.MODID + ":processed food/itemSaltedCaramel").setCreativeTab(BandbCreativeTabs.CreativeTabsProcessedFood);
				itemGum = new ItemFood(5,1.0F,false).setUnlocalizedName("itemGum").setTextureName(Bandb_mod.MODID + ":processed food/itemGum").setCreativeTab(BandbCreativeTabs.CreativeTabsProcessedFood);
				itemMacaron = new ItemFood(5,1.0F,false).setUnlocalizedName("itemMacaron").setTextureName(Bandb_mod.MODID + ":processed food/itemMacaron").setCreativeTab(BandbCreativeTabs.CreativeTabsProcessedFood);
				itemReastedHazelnut = new ItemFood(5,1.0F,false).setUnlocalizedName("itemReastedHazelnut").setTextureName(Bandb_mod.MODID + ":processed food/itemReastedHazelnut").setCreativeTab(BandbCreativeTabs.CreativeTabsProcessedFood);
				itemSpeculoos = new ItemFood(5,1.0F,false).setUnlocalizedName("itemSpeculoos").setTextureName(Bandb_mod.MODID + ":processed food/itemSpeculoos").setCreativeTab(BandbCreativeTabs.CreativeTabsProcessedFood);
				itemTiramisu = new ItemFood(5,1.0F,false).setUnlocalizedName("itemTiramisu").setTextureName(Bandb_mod.MODID + ":processed food/itemTiramisu").setCreativeTab(BandbCreativeTabs.CreativeTabsProcessedFood);
				
				GameRegistry.registerItem(itemSaltedCaramel, "itemSaltedCaramel");
		    	GameRegistry.registerItem(itemGum, "itemGum");
		    	GameRegistry.registerItem(itemMacaron, "itemMacaron");
		    	GameRegistry.registerItem(itemReastedHazelnut, "itemReastedHazelnut");
		    	GameRegistry.registerItem(itemSpeculoos, "itemSpeculoos");
		    	GameRegistry.registerItem(itemTiramisu, "itemTiramisu");
		    	
		    	itemCottonCandySugar = new ItemFood(5,1.0F,false).setUnlocalizedName("itemCottonCandySugar").setTextureName(Bandb_mod.MODID + ":processed food/itemCottonCandySugar").setCreativeTab(BandbCreativeTabs.CreativeTabsProcessedFood);
		    	itemHoney = new ItemFood(5,1.0F,false).setUnlocalizedName("itemHoney").setTextureName(Bandb_mod.MODID + ":processed food/itemHoney").setCreativeTab(BandbCreativeTabs.CreativeTabsProcessedFood);
		    	itemWhiteChocolate = new ItemFood(5,1.0F,false).setUnlocalizedName("itemWhiteChocolate").setTextureName(Bandb_mod.MODID + ":processed food/itemWhiteChocolate").setCreativeTab(BandbCreativeTabs.CreativeTabsProcessedFood);
		    	itemCelerySalt = new ItemFood(5,1.0F,false).setUnlocalizedName("itemCelerySalt").setTextureName(Bandb_mod.MODID + ":processed food/itemCelerySalt").setCreativeTab(BandbCreativeTabs.CreativeTabsProcessedFood);
		    	itemIceCube = new ItemFood(0,1.0F,false).setUnlocalizedName("itemIceCube").setTextureName(Bandb_mod.MODID + ":processed food/itemIceCube").setCreativeTab(BandbCreativeTabs.CreativeTabsProcessedFood);
		    	
		    	itemDarkChocolate = new ItemFood(0,1.0F,false).setUnlocalizedName("itemDarkChocolate").setTextureName(Bandb_mod.MODID + ":processed food/itemDarkChocolate").setCreativeTab(BandbCreativeTabs.CreativeTabsProcessedFood);
		    	itemJamOrange = new ItemFood(0,1.0F,false).setUnlocalizedName("itemJamOrange").setTextureName(Bandb_mod.MODID + ":processed food/itemJamOrange").setCreativeTab(BandbCreativeTabs.CreativeTabsProcessedFood);
		    	itemBlackPepper = new ItemFood(0,1.0F,false).setUnlocalizedName("itemBlackPepper").setTextureName(Bandb_mod.MODID + ":processed food/itemBlackPepper").setCreativeTab(BandbCreativeTabs.CreativeTabsProcessedFood);
		    	itemJamCurrant = new ItemFood(0,1.0F,false).setUnlocalizedName("itemJamCurrant").setTextureName(Bandb_mod.MODID + ":processed food/itemJamCurrant").setCreativeTab(BandbCreativeTabs.CreativeTabsProcessedFood);
		    	itemButter = new ItemFood(0,1.0F,false).setUnlocalizedName("itemButter").setTextureName(Bandb_mod.MODID + ":processed food/itemButter").setCreativeTab(BandbCreativeTabs.CreativeTabsProcessedFood);
		    	
		    	itemKetchup = new ItemFood(0,1.0F,false).setUnlocalizedName("itemKetchup").setTextureName(Bandb_mod.MODID + ":processed food/itemKetchup").setCreativeTab(BandbCreativeTabs.CreativeTabsProcessedFood);
		    	itemIceCreamVanilla = new ItemFood(0,1.0F,false).setUnlocalizedName("itemIceCreamVanilla").setTextureName(Bandb_mod.MODID + ":processed food/itemIceCreamVanilla").setCreativeTab(BandbCreativeTabs.CreativeTabsProcessedFood);
		    	
		    	
				GameRegistry.registerItem(itemCottonCandySugar, "itemCottonCandySugar");
				GameRegistry.registerItem(itemHoney, "itemHoney");
				GameRegistry.registerItem(itemWhiteChocolate, "itemWhiteChocolate");
				GameRegistry.registerItem(itemCelerySalt, "itemCelerySalt");
				GameRegistry.registerItem(itemIceCube, "itemIceCube");
				
				GameRegistry.registerItem(itemDarkChocolate, "itemDarkChocolate");
				GameRegistry.registerItem(itemJamOrange, "itemJamOrange");
				GameRegistry.registerItem(itemBlackPepper, "itemBlackPepper");
				GameRegistry.registerItem(itemJamCurrant, "itemJamCurrant");
				GameRegistry.registerItem(itemButter, "itemButter");
				
				GameRegistry.registerItem(itemKetchup, "itemKetchup");
				GameRegistry.registerItem(itemIceCreamVanilla, "itemIceCreamVanilla");
				
		    	
				itemSavane = new ItemFood(5,1.0F,false).setUnlocalizedName("itemSavane").setTextureName(Bandb_mod.MODID + ":processed food/itemSavane").setCreativeTab(BandbCreativeTabs.CreativeTabsProcessedFood);
				itemSavaneNoir = new ItemFood(5,1.0F,false).setUnlocalizedName("itemSavaneNoir").setTextureName(Bandb_mod.MODID + ":processed food/itemSavaneNoir").setCreativeTab(BandbCreativeTabs.CreativeTabsProcessedFood);
				itemSavaneNoisette = new ItemFood(5,1.0F,false).setUnlocalizedName("itemSavaneNoisette").setTextureName(Bandb_mod.MODID + ":processed food/itemSavaneNoisette").setCreativeTab(BandbCreativeTabs.CreativeTabsProcessedFood);
				itemSavanePocket = new ItemFood(5,1.0F,false).setUnlocalizedName("itemSavanePocket").setTextureName(Bandb_mod.MODID + ":processed food/itemSavanePocket").setCreativeTab(BandbCreativeTabs.CreativeTabsProcessedFood);
				itemSavaneYaourt = new ItemFood(5,1.0F,false).setUnlocalizedName("itemSavaneYaourt").setTextureName(Bandb_mod.MODID + ":processed food/itemSavaneYaourt").setCreativeTab(BandbCreativeTabs.CreativeTabsProcessedFood);
			
				GameRegistry.registerItem(itemSavane, "itemSavane");
		    	GameRegistry.registerItem(itemSavaneNoir, "itemSavaneNoir");
		    	GameRegistry.registerItem(itemSavaneNoisette, "itemSavaneNoisette");
		    	GameRegistry.registerItem(itemSavanePocket, "itemSavanePocket");
			 	GameRegistry.registerItem(itemSavaneYaourt, "itemSavaneYaourt");
	
			 	itemBounty = new ItemFood(5,1.0F,false).setUnlocalizedName("itemBounty").setTextureName(Bandb_mod.MODID + ":processed food/itemBounty").setCreativeTab(BandbCreativeTabs.CreativeTabsProcessedFood);
				itemMars = new ItemFood(5,1.0F,false).setUnlocalizedName("itemMars").setTextureName(Bandb_mod.MODID + ":processed food/itemMars").setCreativeTab(BandbCreativeTabs.CreativeTabsProcessedFood);
				itemSnickers = new ItemFood(5,1.0F,false).setUnlocalizedName("itemSnickers").setTextureName(Bandb_mod.MODID + ":processed food/itemSnickers").setCreativeTab(BandbCreativeTabs.CreativeTabsProcessedFood);
				itemTwix = new ItemFood(5,1.0F,false).setUnlocalizedName("itemTwix").setTextureName(Bandb_mod.MODID + ":processed food/itemTwix").setCreativeTab(BandbCreativeTabs.CreativeTabsProcessedFood);
				itemCountry = new ItemFood(5, 1.0F, false).setUnlocalizedName("itemCountry").setTextureName(Bandb_mod.MODID + ":processed food/itemCountry").setCreativeTab(BandbCreativeTabs.CreativeTabsProcessedFood);
				
				itemKitKat = new ItemFood(5,1.0F,false).setUnlocalizedName("itemKitKat").setTextureName(Bandb_mod.MODID + ":processed food/itemKitKat").setCreativeTab(BandbCreativeTabs.CreativeTabsProcessedFood);
				itemKinderBueno = new ItemFood(2,1.0F,false).setUnlocalizedName("itemKinderBueno").setTextureName(Bandb_mod.MODID + ":processed food/itemKinderBueno").setCreativeTab(BandbCreativeTabs.CreativeTabsProcessedFood);
				itemMilkyway = new ItemFood(5,1.0F,false).setUnlocalizedName("itemMilkyway").setTextureName(Bandb_mod.MODID + ":processed food/itemMilkyway").setCreativeTab(BandbCreativeTabs.CreativeTabsProcessedFood);
				itemLion = new ItemFood(5,1.0F,false).setUnlocalizedName("itemLion").setTextureName(Bandb_mod.MODID + ":processed food/itemLion").setCreativeTab(BandbCreativeTabs.CreativeTabsProcessedFood);
				itemBarreMM = new ItemFood(5,1.0F,false).setUnlocalizedName("itemBarreMM").setTextureName(Bandb_mod.MODID + ":processed food/itemBarreMM").setCreativeTab(BandbCreativeTabs.CreativeTabsProcessedFood);
				
				itemBarreNesquik = new ItemFood(5,1.0F,false).setUnlocalizedName("itemBarreNesquik").setTextureName(Bandb_mod.MODID + ":processed food/itemBarreNesquik").setCreativeTab(BandbCreativeTabs.CreativeTabsProcessedFood);
				itemBarreChocapic = new ItemFood(5,1.0F,false).setUnlocalizedName("itemBarreChocapic").setTextureName(Bandb_mod.MODID + ":processed food/itemBarreChocapic").setCreativeTab(BandbCreativeTabs.CreativeTabsProcessedFood);
	
		    	GameRegistry.registerItem(itemBounty, "itemBounty");
		    	GameRegistry.registerItem(itemMars, "itemMars");
		    	GameRegistry.registerItem(itemSnickers, "itemSnickers");
		    	GameRegistry.registerItem(itemTwix, "itemTwix");
		    	GameRegistry.registerItem(itemCountry, "itemCountry");
		    	
		    	GameRegistry.registerItem(itemKitKat, "itemKitKat");
		    	GameRegistry.registerItem(itemKinderBueno, "itemKinderBueno");
		    	GameRegistry.registerItem(itemMilkyway, "itemMilkyway");
		    	GameRegistry.registerItem(itemLion, "itemLion");
		    	GameRegistry.registerItem(itemBarreMM, "itemBarreMM");
		    
		    	GameRegistry.registerItem(itemBarreNesquik, "itemBarreNesquik");
		    	GameRegistry.registerItem(itemBarreChocapic, "itemBarreChocapic");
	
		    	itemBrownieCoco = new ItemFood(5, 1.0F, false).setUnlocalizedName("itemBrownieCoco").setTextureName(Bandb_mod.MODID + ":processed food/itemBrownieCoco").setCreativeTab(BandbCreativeTabs.CreativeTabsProcessedFood);			
				itemBrownieCookie = new ItemFood(5, 1.0F, false).setUnlocalizedName("itemBrownieCookie").setTextureName(Bandb_mod.MODID + ":processed food/itemBrownieCookie").setCreativeTab(BandbCreativeTabs.CreativeTabsProcessedFood);
				itemBrowniPecan = new ItemFood(5, 1.0F, false).setUnlocalizedName("itemBrowniPecan").setTextureName(Bandb_mod.MODID + ":processed food/itemBrowniPecan").setCreativeTab(BandbCreativeTabs.CreativeTabsProcessedFood);		
				
				GameRegistry.registerItem(itemBrownieCoco, "itemBrownieCoco");
				GameRegistry.registerItem(itemBrownieCookie, "itemBrownieCookie");
		    	GameRegistry.registerItem(itemBrowniPecan, "itemBrowniPecan");
		    
				itemFinger = new ItemFood(5,1.0F,false).setUnlocalizedName("itemFinger").setTextureName(Bandb_mod.MODID + ":processed food/itemFinger").setCreativeTab(BandbCreativeTabs.CreativeTabsProcessedFood);
				itemKinderSurprise = new ItemFood(2,1.0F,false).setUnlocalizedName("itemKinderSurprise").setTextureName(Bandb_mod.MODID + ":processed food/itemKinderSurprise").setCreativeTab(BandbCreativeTabs.CreativeTabsProcessedFood);
				itemBarba = new ItemFood(5,1.0F,false).setUnlocalizedName("itemBarba").setTextureName(Bandb_mod.MODID + ":processed food/itemBarba").setCreativeTab(BandbCreativeTabs.CreativeTabsProcessedFood);
				itemSmarties = new ItemFood(5,1.0F,false).setUnlocalizedName("itemSmarties").setTextureName(Bandb_mod.MODID + ":processed food/itemSmarties").setCreativeTab(BandbCreativeTabs.CreativeTabsProcessedFood);
				itemSmartiesGlace = new ItemFood(5,1.0F,false).setUnlocalizedName("itemSmartiesGlace").setTextureName(Bandb_mod.MODID + ":processed food/itemSmartiesGlace").setCreativeTab(BandbCreativeTabs.CreativeTabsProcessedFood);
				
				itemHariboZanzigliss = new ItemFood(5,1.0F,false).setUnlocalizedName("itemHariboZanzigliss").setTextureName(Bandb_mod.MODID + ":processed food/itemHariboZanzigliss").setCreativeTab(BandbCreativeTabs.CreativeTabsProcessedFood);
				itemKinderChocolat = new ItemFood(5,1.0F,false).setUnlocalizedName("itemKinderChocolat").setTextureName(Bandb_mod.MODID + ":processed food/itemKinderChocolat").setCreativeTab(BandbCreativeTabs.CreativeTabsProcessedFood);
				itemBarreGlacee = new ItemFood(5,1.0F,false).setUnlocalizedName("itemBarreGlacee").setTextureName(Bandb_mod.MODID + ":processed food/itemBarreGlacee").setCreativeTab(BandbCreativeTabs.CreativeTabsProcessedFood);
	
				GameRegistry.registerItem(itemFinger, "itemFinger");	    	
		    	GameRegistry.registerItem(itemKinderSurprise, "itemKinderSurprise");
				GameRegistry.registerItem(itemBarba, "itemBarba");
		    	GameRegistry.registerItem(itemSmarties, "itemSmarties");	    	
				GameRegistry.registerItem(itemSmartiesGlace, "itemSmartiesGlace");	   
		    	
				GameRegistry.registerItem(itemHariboZanzigliss, "itemHariboZanzigliss");
			 	GameRegistry.registerItem(itemKinderChocolat, "itemKinderChocolat");
		    	GameRegistry.registerItem(itemBarreGlacee, "itemBarreGlacee");
		    	
		    	itemBenco = new Item().setUnlocalizedName("itemBenco").setTextureName(Bandb_mod.MODID + ":ingredients/itemBenco").setCreativeTab(BandbCreativeTabs.CreativeTabsIngredient);
				itemBanania = new Item().setUnlocalizedName("itemBanania").setTextureName(Bandb_mod.MODID + ":ingredients/itemBanania").setCreativeTab(BandbCreativeTabs.CreativeTabsIngredient);
				itemSuperPoulain = new Item().setUnlocalizedName("itemSuperPoulain").setTextureName(Bandb_mod.MODID + ":ingredients/itemSuperPoulain").setCreativeTab(BandbCreativeTabs.CreativeTabsIngredient);
				itemNesquik = new Item().setUnlocalizedName("itemNesquik").setTextureName(Bandb_mod.MODID + ":ingredients/itemNesquik").setCreativeTab(BandbCreativeTabs.CreativeTabsIngredient);
				itemNesquikIntense = new Item().setUnlocalizedName("itemNesquikIntense").setTextureName(Bandb_mod.MODID + ":ingredients/itemNesquikIntense").setCreativeTab(BandbCreativeTabs.CreativeTabsIngredient);
	
				itemSucreVanille = new Item().setUnlocalizedName("itemSucreVanille").setTextureName(Bandb_mod.MODID + ":ingredients/itemSucreVanille").setCreativeTab(BandbCreativeTabs.CreativeTabsIngredient);
				itemSucreVahine = new Item().setUnlocalizedName("itemSucreVahine").setTextureName(Bandb_mod.MODID + ":ingredients/itemSucreVahine").setCreativeTab(BandbCreativeTabs.CreativeTabsIngredient);
				itemVinegar = new Item().setUnlocalizedName("itemVinegar").setTextureName(Bandb_mod.MODID + ":beverage/itemVinegar").setCreativeTab(BandbCreativeTabs.CreativeTabsBeverage);
				itemCassonade = new Item().setUnlocalizedName("itemCassonade").setTextureName(Bandb_mod.MODID + ":ingredients/itemCassonade").setCreativeTab(BandbCreativeTabs.CreativeTabsIngredient);
				
				GameRegistry.registerItem(itemBenco, "itemBenco");
		    	GameRegistry.registerItem(itemBanania, "itemBanania");
		    	GameRegistry.registerItem(itemSuperPoulain, "itemSuperPoulain");
		    	GameRegistry.registerItem(itemNesquik, "itemNesquik");
		    	GameRegistry.registerItem(itemNesquikIntense, "itemNesquikIntense");
	
		    	GameRegistry.registerItem(itemSucreVanille, "itemSucreVanille");
		    	GameRegistry.registerItem(itemSucreVahine, "itemSucreVahine");
		    	GameRegistry.registerItem(itemVinegar, "itemVinegar");
		    	GameRegistry.registerItem(itemCassonade, "itemCassonade");
		  
		    	
		    	//Gï¿½teau LU 			
				itemLogoLu = new Item().setUnlocalizedName("itemLogoLu").setTextureName(Bandb_mod.MODID + ":lu/itemLogoLu").setCreativeTab(BandbCreativeTabs.CreativeTabsLu);
				itemMikadoChocolatNoir = new Item().setUnlocalizedName("itemMikadoChocolatNoir").setTextureName(Bandb_mod.MODID + ":lu/itemMikadoChocolatNoir").setCreativeTab(BandbCreativeTabs.CreativeTabsLu);
				itemMikadoChocolatLait = new Item().setUnlocalizedName("itemMikadoChocolatLait").setTextureName(Bandb_mod.MODID + ":lu/itemMikadoChocolatLait").setCreativeTab(BandbCreativeTabs.CreativeTabsLu);
				itemMikadoKingChoco = new Item().setUnlocalizedName("itemMikadoKingChoco").setTextureName(Bandb_mod.MODID + ":lu/itemMikadoKingChoco").setCreativeTab(BandbCreativeTabs.CreativeTabsLu);
				itemMikadoChocoNoisette = new Item().setUnlocalizedName("itemMikadoChocoNoisette").setTextureName(Bandb_mod.MODID + ":lu/itemMikadoChocoNoisette").setCreativeTab(BandbCreativeTabs.CreativeTabsLu);
				
				itemMikadoDaim = new Item().setUnlocalizedName("itemMikadoDaim").setTextureName(Bandb_mod.MODID + ":lu/itemMikadoDaim").setCreativeTab(BandbCreativeTabs.CreativeTabsLu);
				itemNapolitain = new Item().setUnlocalizedName("itemNapolitain").setTextureName(Bandb_mod.MODID + ":lu/itemNapolitain").setCreativeTab(BandbCreativeTabs.CreativeTabsLu);
				itemNapolitainClassicIndi = new Item().setUnlocalizedName("itemNapolitainClassicIndi").setTextureName(Bandb_mod.MODID + ":lu/itemNapolitainClassicIndi").setCreativeTab(BandbCreativeTabs.CreativeTabsLu);
				itemNapolitainPartage = new Item().setUnlocalizedName("itemNapolitainPartage").setTextureName(Bandb_mod.MODID + ":lu/itemNapolitainPartage").setCreativeTab(BandbCreativeTabs.CreativeTabsLu);
				itemNapolitain3Choco = new Item().setUnlocalizedName("itemNapolitain3Choco").setTextureName(Bandb_mod.MODID + ":lu/itemNapolitain3Choco").setCreativeTab(BandbCreativeTabs.CreativeTabsLu);
				
				itemNapolitainCaramel = new Item().setUnlocalizedName("itemNapolitainCaramel").setTextureName(Bandb_mod.MODID + ":lu/itemNapolitainCaramel").setCreativeTab(BandbCreativeTabs.CreativeTabsLu);
				itemNapolitainCoco = new ItemToolsKitchen().setUnlocalizedName("itemNapolitainCoco").setTextureName(Bandb_mod.MODID + ":lu/itemNapolitainCoco").setCreativeTab(BandbCreativeTabs.CreativeTabsLu);
				itemNapolitainFramboise = new ItemToolsKitchen().setUnlocalizedName("itemNapolitainFramboise").setTextureName(Bandb_mod.MODID + ":lu/itemNapolitainFramboise").setCreativeTab(BandbCreativeTabs.CreativeTabsLu);
				itemNapolitainMousse = new ItemToolsKitchen().setUnlocalizedName("itemNapolitainMousse").setTextureName(Bandb_mod.MODID + ":lu/itemNapolitainMousse").setCreativeTab(BandbCreativeTabs.CreativeTabsLu);
				itemNapolitainPraline = new ItemToolsKitchen().setUnlocalizedName("itemNapolitainPraline").setTextureName(Bandb_mod.MODID + ":lu/itemNapolitainPraline").setCreativeTab(BandbCreativeTabs.CreativeTabsLu);
				
				itemNapolitainChoco = new ItemToolsKitchen().setUnlocalizedName("itemNapolitainChoco").setTextureName(Bandb_mod.MODID + ":lu/itemNapolitainChoco").setCreativeTab(BandbCreativeTabs.CreativeTabsLu);
				itemLuluOurson = new ItemToolsKitchen().setUnlocalizedName("itemLuluOurson").setTextureName(Bandb_mod.MODID + ":lu/itemLuluOurson").setCreativeTab(BandbCreativeTabs.CreativeTabsLu);
				itemLuluOursonChoco = new ItemToolsKitchen().setUnlocalizedName("itemLuluOursonChoco").setTextureName(Bandb_mod.MODID + ":lu/itemLuluOursonChoco").setCreativeTab(BandbCreativeTabs.CreativeTabsLu);
				itemLuluOursonChocolat = new ItemToolsKitchen().setUnlocalizedName("itemLuluOursonChocolat").setTextureName(Bandb_mod.MODID + ":lu/itemLuluOursonChocolat").setCreativeTab(BandbCreativeTabs.CreativeTabsLu);
				itemPepito = new ItemToolsKitchen().setUnlocalizedName("itemPepito").setTextureName(Bandb_mod.MODID + ":lu/itemPepito").setCreativeTab(BandbCreativeTabs.CreativeTabsLu);
				
				itemGranola = new ItemToolsKitchen().setUnlocalizedName("itemGranola").setTextureName(Bandb_mod.MODID + ":lu/itemGranola").setCreativeTab(BandbCreativeTabs.CreativeTabsLu);
				itemBarquetteAbricot = new ItemToolsKitchen().setUnlocalizedName("itemBarquetteAbricot").setTextureName(Bandb_mod.MODID + ":lu/itemBarquetteAbricot").setCreativeTab(BandbCreativeTabs.CreativeTabsLu);
				itemBarreGranny = new ItemToolsKitchen().setUnlocalizedName("itemBarreGranny").setTextureName(Bandb_mod.MODID + ":lu/itemBarreGranny").setCreativeTab(BandbCreativeTabs.CreativeTabsLu);
				itemCoquelineChocolat = new ItemToolsKitchen().setUnlocalizedName("itemCoquelineChocolat").setTextureName(Bandb_mod.MODID + ":lu/itemCoquelineChocolat").setCreativeTab(BandbCreativeTabs.CreativeTabsLu);
				itemGateauCoteDOr = new ItemToolsKitchen().setUnlocalizedName("itemGateauCoteDOr").setTextureName(Bandb_mod.MODID + ":lu/itemGateauCoteDOr").setCreativeTab(BandbCreativeTabs.CreativeTabsLu);
	
				itemPetitBeurre = new ItemToolsKitchen().setUnlocalizedName("itemPetitBeurre").setTextureName(Bandb_mod.MODID + ":lu/itemPetitBeurre").setCreativeTab(BandbCreativeTabs.CreativeTabsLu);
				itemPetitLuChocolat = new ItemToolsKitchen().setUnlocalizedName("itemPetitLuChocolat").setTextureName(Bandb_mod.MODID + ":lu/itemPetitLuChocolat").setCreativeTab(BandbCreativeTabs.CreativeTabsLu);
				itemPetitLuBeurre = new ItemToolsKitchen().setUnlocalizedName("itemPetitLuBeurre").setTextureName(Bandb_mod.MODID + ":lu/itemPetitLuBeurre").setCreativeTab(BandbCreativeTabs.CreativeTabsLu);
				itemPetitCoeur = new ItemToolsKitchen().setUnlocalizedName("itemPetitCoeur").setTextureName(Bandb_mod.MODID + ":lu/itemPetitCoeur").setCreativeTab(BandbCreativeTabs.CreativeTabsLu);
				itemPetitEcolier = new ItemToolsKitchen().setUnlocalizedName("itemPetitEcolier").setTextureName(Bandb_mod.MODID + ":lu/itemPetitEcolier").setCreativeTab(BandbCreativeTabs.CreativeTabsLu);
				
				itemPockitosCrousti = new ItemToolsKitchen().setUnlocalizedName("itemPockitosCrousti").setTextureName(Bandb_mod.MODID + ":lu/itemPockitosCrousti").setCreativeTab(BandbCreativeTabs.CreativeTabsLu);
				itemPockitosNoir = new ItemToolsKitchen().setUnlocalizedName("itemPockitosNoir").setTextureName(Bandb_mod.MODID + ":lu/itemPockitosNoir").setCreativeTab(BandbCreativeTabs.CreativeTabsLu);
				itemPrince = new ItemToolsKitchen().setUnlocalizedName("itemPrince").setTextureName(Bandb_mod.MODID + ":lu/itemPrince").setCreativeTab(BandbCreativeTabs.CreativeTabsLu);
				
				GameRegistry.registerItem(itemLogoLu, "itemLogoLu");	
				GameRegistry.registerItem(itemMikadoChocolatNoir, "itemMikadoChocolatNoir");	
				GameRegistry.registerItem(itemMikadoChocolatLait, "itemMikadoChocolatLait");	
				GameRegistry.registerItem(itemMikadoKingChoco, "itemMikadoKingChoco");	
				GameRegistry.registerItem(itemMikadoChocoNoisette, "itemMikadoChocoNoisette");	
				
				GameRegistry.registerItem(itemMikadoDaim, "itemMikadoDaim");	
				GameRegistry.registerItem(itemNapolitain, "itemNapolitain");	
				GameRegistry.registerItem(itemNapolitainClassicIndi, "itemNapolitainClassicIndi");	
				GameRegistry.registerItem(itemNapolitainPartage, "itemNapolitainPartage");	
				GameRegistry.registerItem(itemNapolitain3Choco, "itemNapolitain3Choco");	
				
				GameRegistry.registerItem(itemNapolitainCaramel, "itemNapolitainCaramel");	
				GameRegistry.registerItem(itemNapolitainCoco, "itemNapolitainCoco");	
				GameRegistry.registerItem(itemNapolitainFramboise, "itemNapolitainFramboise");	
				GameRegistry.registerItem(itemNapolitainMousse, "itemNapolitainMousse");	
				GameRegistry.registerItem(itemNapolitainPraline, "itemNapolitainPraline");
				
				GameRegistry.registerItem(itemNapolitainChoco, "itemNapolitainChoco");	
				GameRegistry.registerItem(itemLuluOurson, "itemLuluOurson");	
				GameRegistry.registerItem(itemLuluOursonChoco, "itemLuluOursonChoco");	
				GameRegistry.registerItem(itemLuluOursonChocolat, "itemLuluOursonChocolat");	
				GameRegistry.registerItem(itemPepito, "itemPepito");	
	
				GameRegistry.registerItem(itemGranola, "itemGranola");	
				GameRegistry.registerItem(itemBarquetteAbricot, "itemBarquetteAbricot");	
				GameRegistry.registerItem(itemBarreGranny, "itemBarreGranny");	
				GameRegistry.registerItem(itemCoquelineChocolat, "itemCoquelineChocolat");	
				GameRegistry.registerItem(itemGateauCoteDOr, "itemGateauCoteDOr");	
	
				GameRegistry.registerItem(itemPetitBeurre, "itemPetitBeurre");	
				GameRegistry.registerItem(itemPetitLuChocolat, "itemPetitLuChocolat");	
				GameRegistry.registerItem(itemPetitLuBeurre, "itemPetitLuBeurre");	
				GameRegistry.registerItem(itemPetitCoeur, "itemPetitCoeur");	
				GameRegistry.registerItem(itemPetitEcolier, "itemPetitEcolier");	
	
				GameRegistry.registerItem(itemPockitosCrousti, "itemPockitosCrousti");	
				GameRegistry.registerItem(itemPockitosNoir, "itemPockitosNoir");	
				GameRegistry.registerItem(itemPrince, "itemPrince");
				
				//Milka
				
				itemLogoMilka = new Item().setUnlocalizedName("itemLogoMilka").setTextureName(Bandb_mod.MODID + ":milka/itemLogoMilka").setCreativeTab(BandbCreativeTabs.CreativeTabsMilka);
				itemMilka = new Item().setUnlocalizedName("itemMilka").setTextureName(Bandb_mod.MODID + ":milka/itemMilka").setCreativeTab(BandbCreativeTabs.CreativeTabsMilka);
				itemMilkaCaramel = new Item().setUnlocalizedName("itemMilkaCaramel").setTextureName(Bandb_mod.MODID + ":milka/itemMilkaCaramel").setCreativeTab(BandbCreativeTabs.CreativeTabsMilka);
				itemMilkaChocolatBlanc = new Item().setUnlocalizedName("itemMilkaChocolatBlanc").setTextureName(Bandb_mod.MODID + ":milka/itemMilkaChocolatBlanc").setCreativeTab(BandbCreativeTabs.CreativeTabsMilka);
				itemMilkaDaim = new Item().setUnlocalizedName("itemMilkaDaim").setTextureName(Bandb_mod.MODID + ":milka/itemMilkaDaim").setCreativeTab(BandbCreativeTabs.CreativeTabsMilka);
				
				itemMilkaGranola = new Item().setUnlocalizedName("itemMilkaGranola").setTextureName(Bandb_mod.MODID + ":milka/itemMilkaGranola").setCreativeTab(BandbCreativeTabs.CreativeTabsMilka);
				itemMilkaInColors = new Item().setUnlocalizedName("itemMilkaInColors").setTextureName(Bandb_mod.MODID + ":milka/itemMilkaInColors").setCreativeTab(BandbCreativeTabs.CreativeTabsMilka);
				itemMilkaNoisettesEntieres = new Item().setUnlocalizedName("itemMilkaNoisettesEntieres").setTextureName(Bandb_mod.MODID + ":milka/itemMilkaNoisettesEntieres").setCreativeTab(BandbCreativeTabs.CreativeTabsMilka);
				itemMilkaOreo = new Item().setUnlocalizedName("itemMilkaOreo").setTextureName(Bandb_mod.MODID + ":milka/itemMilkaOreo").setCreativeTab(BandbCreativeTabs.CreativeTabsMilka);
				itemMilkaRizCroustillant = new Item().setUnlocalizedName("itemMilkaRizCroustillant").setTextureName(Bandb_mod.MODID + ":milka/itemMilkaRizCroustillant").setCreativeTab(BandbCreativeTabs.CreativeTabsMilka);
				
				itemMilkaTendreLait = new Item().setUnlocalizedName("itemMilkaTendreLait").setTextureName(Bandb_mod.MODID + ":milka/itemMilkaTendreLait").setCreativeTab(BandbCreativeTabs.CreativeTabsMilka);
				itemMilkaTuc = new Item().setUnlocalizedName("itemMilkaTuc").setTextureName(Bandb_mod.MODID + ":milka/itemMilkaTuc").setCreativeTab(BandbCreativeTabs.CreativeTabsMilka);
				itemMilkaLu = new Item().setUnlocalizedName("itemMilkaLu").setTextureName(Bandb_mod.MODID + ":milka/itemMilkaLu").setCreativeTab(BandbCreativeTabs.CreativeTabsMilka);
				itemMilkaChocoBiscuit = new Item().setUnlocalizedName("itemMilkaChocoBiscuit").setTextureName(Bandb_mod.MODID + ":milka/itemMilkaChocoBiscuit").setCreativeTab(BandbCreativeTabs.CreativeTabsMilka);
				itemMilkaChocoJelly = new Item().setUnlocalizedName("itemMilkaChocoJelly").setTextureName(Bandb_mod.MODID + ":milka/itemMilkaChocoJelly").setCreativeTab(BandbCreativeTabs.CreativeTabsMilka);
				
				itemMilkaGrosMorceau = new Item().setUnlocalizedName("itemMilkaGrosMorceau").setTextureName(Bandb_mod.MODID + ":milka/itemMilkaGrosMorceau").setCreativeTab(BandbCreativeTabs.CreativeTabsMilka);
				itemMilkaGrosMorceauCaramel = new Item().setUnlocalizedName("itemMilkaGrosMorceauCaramel").setTextureName(Bandb_mod.MODID + ":milka/itemMilkaGrosMorceauCaramel").setCreativeTab(BandbCreativeTabs.CreativeTabsMilka);
				itemMilkaGrosMorceauNoistte = new Item().setUnlocalizedName("itemMilkaGrosMorceauNoistte").setTextureName(Bandb_mod.MODID + ":milka/itemMilkaGrosMorceauNoistte").setCreativeTab(BandbCreativeTabs.CreativeTabsMilka);
				itemMilkaGrosMorceauPraline = new Item().setUnlocalizedName("itemMilkaGrosMorceauPraline").setTextureName(Bandb_mod.MODID + ":milka/itemMilkaGrosMorceauPraline").setCreativeTab(BandbCreativeTabs.CreativeTabsMilka);
				itemMilkaDaimCrack = new Item().setUnlocalizedName("itemMilkaDaimCrack").setTextureName(Bandb_mod.MODID + ":milka/itemMilkaDaimCrack").setCreativeTab(BandbCreativeTabs.CreativeTabsMilka);
				
				itemMilkaMJoy = new Item().setUnlocalizedName("itemMilkaMJoy").setTextureName(Bandb_mod.MODID + ":milka/itemMilkaMJoy").setCreativeTab(BandbCreativeTabs.CreativeTabsMilka);
				itemMilkaMJoyCacahuete = new Item().setUnlocalizedName("itemMilkaMJoyCacahuete").setTextureName(Bandb_mod.MODID + ":milka/itemMilkaMJoyCacahuete").setCreativeTab(BandbCreativeTabs.CreativeTabsMilka);
				itemMilkaMJoyNoisette = new Item().setUnlocalizedName("itemMilkaMJoyNoisette").setTextureName(Bandb_mod.MODID + ":milka/itemMilkaMJoyNoisette").setCreativeTab(BandbCreativeTabs.CreativeTabsMilka);
				itemMilkaTendresMomentMousse = new Item().setUnlocalizedName("itemMilkaTendresMomentMousse").setTextureName(Bandb_mod.MODID + ":milka/itemMilkaTendresMomentMousse").setCreativeTab(BandbCreativeTabs.CreativeTabsMilka);
				itemMilkaTendresMomentMoussePraline = new Item().setUnlocalizedName("itemMilkaTendresMomentMoussePraline").setTextureName(Bandb_mod.MODID + ":milka/itemMilkaTendresMomentMoussePraline").setCreativeTab(BandbCreativeTabs.CreativeTabsMilka);
				
				itemMilkaPullChoco = new Item().setUnlocalizedName("itemMilkaPullChoco").setTextureName(Bandb_mod.MODID + ":milka/itemMilkaPullChoco").setCreativeTab(BandbCreativeTabs.CreativeTabsMilka);
				itemMilkaPullDaim = new Item().setUnlocalizedName("itemMilkaPullDaim").setTextureName(Bandb_mod.MODID + ":milka/itemMilkaPullDaim").setCreativeTab(BandbCreativeTabs.CreativeTabsMilka);
				itemMilkaPullNoisette = new Item().setUnlocalizedName("itemMilkaPullNoisette").setTextureName(Bandb_mod.MODID + ":milka/itemMilkaPullNoisette").setCreativeTab(BandbCreativeTabs.CreativeTabsMilka);
				itemMilkaPullChocoBarre = new Item().setUnlocalizedName("itemMilkaPullChocoBarre").setTextureName(Bandb_mod.MODID + ":milka/itemMilkaPullChocoBarre").setCreativeTab(BandbCreativeTabs.CreativeTabsMilka);
				itemMilkaPullDaimBarre = new Item().setUnlocalizedName("itemMilkaPullDaimBarre").setTextureName(Bandb_mod.MODID + ":milka/itemMilkaPullDaimBarre").setCreativeTab(BandbCreativeTabs.CreativeTabsMilka);
				
				itemMilkaPullNoisetteBarre = new Item().setUnlocalizedName("itemMilkaPullNoisetteBarre").setTextureName(Bandb_mod.MODID + ":milka/itemMilkaPullNoisetteBarre").setCreativeTab(BandbCreativeTabs.CreativeTabsMilka);
				itemMilkaMeloCakes = new Item().setUnlocalizedName("itemMilkaMeloCakes").setTextureName(Bandb_mod.MODID + ":milka/itemMilkaMeloCakes").setCreativeTab(BandbCreativeTabs.CreativeTabsMilka);
				itemMilkaLilaStars = new Item().setUnlocalizedName("itemMilkaLilaStars").setTextureName(Bandb_mod.MODID + ":milka/itemMilkaLilaStars").setCreativeTab(BandbCreativeTabs.CreativeTabsMilka);
				itemMilkaCrispelloPopcorn = new Item().setUnlocalizedName("itemMilkaCrispelloPopcorn").setTextureName(Bandb_mod.MODID + ":milka/itemMilkaCrispelloPopcorn").setCreativeTab(BandbCreativeTabs.CreativeTabsMilka);
				itemMilkaCrispelloVanille = new Item().setUnlocalizedName("itemMilkaCrispelloVanille").setTextureName(Bandb_mod.MODID + ":milka/itemMilkaCrispelloVanille").setCreativeTab(BandbCreativeTabs.CreativeTabsMilka);
				
				itemMilkaCrispySnax = new Item().setUnlocalizedName("itemMilkaCrispySnax").setTextureName(Bandb_mod.MODID + ":milka/itemMilkaCrispySnax").setCreativeTab(BandbCreativeTabs.CreativeTabsMilka);
				itemMilkaCrispySnaxDaim = new Item().setUnlocalizedName("itemMilkaCrispySnaxDaim").setTextureName(Bandb_mod.MODID + ":milka/itemMilkaCrispySnaxDaim").setCreativeTab(BandbCreativeTabs.CreativeTabsMilka);
				itemMilkaNoisettesEntieres = new Item().setUnlocalizedName("itemMilkaNoisettesEntieres").setTextureName(Bandb_mod.MODID + ":milka/itemMilkaNoisettesEntieres").setCreativeTab(BandbCreativeTabs.CreativeTabsMilka);
				itemMilkaCakeChoc = new Item().setUnlocalizedName("itemMilkaCakeChoc").setTextureName(Bandb_mod.MODID + ":milka/itemMilkaCakeChoc").setCreativeTab(BandbCreativeTabs.CreativeTabsMilka);
				itemMilkaChocoMooo = new Item().setUnlocalizedName("itemMilkaChocoMooo").setTextureName(Bandb_mod.MODID + ":milka/itemMilkaChocoMooo").setCreativeTab(BandbCreativeTabs.CreativeTabsMilka);
				
				itemMilkaChocoSupreme = new Item().setUnlocalizedName("itemMilkaChocoSupreme").setTextureName(Bandb_mod.MODID + ":milka/itemMilkaChocoSupreme").setCreativeTab(BandbCreativeTabs.CreativeTabsMilka);
				itemMilkaChocoTutti = new Item().setUnlocalizedName("itemMilkaChocoTutti").setTextureName(Bandb_mod.MODID + ":milka/itemMilkaChocoTutti").setCreativeTab(BandbCreativeTabs.CreativeTabsMilka);
				itemMilkaChocoTwist = new Item().setUnlocalizedName("itemMilkaChocoTwist").setTextureName(Bandb_mod.MODID + ":milka/itemMilkaChocoTwist").setCreativeTab(BandbCreativeTabs.CreativeTabsMilka);	
				itemMilkaCrispello = new Item().setUnlocalizedName("itemMilkaCrispello").setTextureName(Bandb_mod.MODID + ":milka/itemMilkaCrispello").setCreativeTab(BandbCreativeTabs.CreativeTabsMilka);	
				
				GameRegistry.registerItem(itemLogoMilka, "itemLogoMilka");	
				GameRegistry.registerItem(itemMilka, "itemMilka");	
				GameRegistry.registerItem(itemMilkaCaramel, "itemMilkaCaramel");	
				GameRegistry.registerItem(itemMilkaChocolatBlanc, "itemMilkaChocolatBlanc");	
				GameRegistry.registerItem(itemMilkaDaim, "itemMilkaDaim");	
				
				GameRegistry.registerItem(itemMilkaGranola, "itemMilkaGranola");	
				GameRegistry.registerItem(itemMilkaInColors, "itemMilkaInColors");	
				GameRegistry.registerItem(itemMilkaNoisettesEntieres, "itemMilkaNoisettesEntieres");	
				GameRegistry.registerItem(itemMilkaOreo, "itemMilkaOreo");	
				GameRegistry.registerItem(itemMilkaRizCroustillant, "itemMilkaRizCroustillant");	
				
				GameRegistry.registerItem(itemMilkaTendreLait, "itemMilkaTendreLait");	
				GameRegistry.registerItem(itemMilkaTuc, "itemMilkaTuc");	
				GameRegistry.registerItem(itemMilkaLu, "itemMilkaLu");	
				GameRegistry.registerItem(itemMilkaChocoBiscuit, "itemMilkaChocoBiscuit");	
				GameRegistry.registerItem(itemMilkaChocoJelly, "itemMilkaChocoJelly");	
				
				GameRegistry.registerItem(itemMilkaGrosMorceau, "itemMilkaGrosMorceau");	
				GameRegistry.registerItem(itemMilkaGrosMorceauCaramel, "itemMilkaGrosMorceauCaramel");	
				GameRegistry.registerItem(itemMilkaGrosMorceauNoistte, "itemMilkaGrosMorceauNoistte");	
				GameRegistry.registerItem(itemMilkaGrosMorceauPraline, "itemMilkaGrosMorceauPraline");	
				GameRegistry.registerItem(itemMilkaDaimCrack, "itemMilkaDaimCrack");	
				
				GameRegistry.registerItem(itemMilkaMJoy, "itemMilkaMJoy");	
				GameRegistry.registerItem(itemMilkaMJoyCacahuete, "itemMilkaMJoyCacahuete");	
				GameRegistry.registerItem(itemMilkaMJoyNoisette, "itemMilkaMJoyNoisette");	
				GameRegistry.registerItem(itemMilkaTendresMomentMousse, "itemMilkaTendresMomentMousse");	
				GameRegistry.registerItem(itemMilkaTendresMomentMoussePraline, "itemMilkaTendresMomentMoussePraline");	
				
				GameRegistry.registerItem(itemMilkaPullChoco, "itemMilkaPullChoco");	
				GameRegistry.registerItem(itemMilkaPullDaim, "itemMilkaPullDaim");	
				GameRegistry.registerItem(itemMilkaPullNoisette, "itemMilkaPullNoisette");	
				GameRegistry.registerItem(itemMilkaPullChocoBarre, "itemMilkaPullChocoBarre");	
				GameRegistry.registerItem(itemMilkaPullDaimBarre, "itemMilkaPullDaimBarre");	
				
				GameRegistry.registerItem(itemMilkaPullNoisetteBarre, "itemMilkaPullNoisetteBarre");	
				GameRegistry.registerItem(itemMilkaMeloCakes, "itemMilkaMeloCakes");	
				GameRegistry.registerItem(itemMilkaCrispello, "itemMilkaCrispello");	
				GameRegistry.registerItem(itemMilkaCrispelloPopcorn, "itemMilkaCrispelloPopcorn");	
				GameRegistry.registerItem(itemMilkaCrispelloVanille, "itemMilkaCrispelloVanille");	
				
				GameRegistry.registerItem(itemMilkaCrispySnax, "itemMilkaCrispySnax");	
				GameRegistry.registerItem(itemMilkaCrispySnaxDaim, "itemMilkaCrispySnaxDaim");	
				GameRegistry.registerItem(itemMilkaLilaStars, "itemMilkaLilaStars");	
				GameRegistry.registerItem(itemMilkaCakeChoc, "itemMilkaCakeChoc");	
				GameRegistry.registerItem(itemMilkaChocoMooo, "itemMilkaChocoMooo");	
				
				GameRegistry.registerItem(itemMilkaChocoSupreme, "itemMilkaChocoSupreme");	
				GameRegistry.registerItem(itemMilkaChocoTutti, "itemMilkaChocoTutti");	
				GameRegistry.registerItem(itemMilkaChocoTwist, "itemMilkaChocoTwist");
				
				itemCurry = new Item().setUnlocalizedName("itemCurry").setTextureName(Bandb_mod.MODID + ":processed food/itemCurry").setCreativeTab(BandbCreativeTabs.CreativeTabsProcessedFood);
				itemCurryLeaf = new Item().setUnlocalizedName("itemCurryLeaf").setTextureName(Bandb_mod.MODID + ":processed food/itemCurryLeaf").setCreativeTab(BandbCreativeTabs.CreativeTabsProcessedFood);	
				itemCurryLeafDried = new Item().setUnlocalizedName("itemCurryLeafDried").setTextureName(Bandb_mod.MODID + ":processed food/itemCurryLeafDried").setCreativeTab(BandbCreativeTabs.CreativeTabsProcessedFood);	
				
				GameRegistry.registerItem(itemCurry, "itemCurry");	
				GameRegistry.registerItem(itemCurryLeaf, "itemCurryLeaf");	
				GameRegistry.registerItem(itemCurryLeafDried, "itemCurryLeafDried");	
				
				
				//Bel
				
				itemLogoBel = new Item().setUnlocalizedName("itemLogoBel").setTextureName(Bandb_mod.MODID + ":bel/itemLogoBel").setCreativeTab(BandbCreativeTabs.CreativeTabsBel);
				itemBabybelRed = new Item().setUnlocalizedName("itemBabybelRed").setTextureName(Bandb_mod.MODID + ":bel/itemBabybelRed").setCreativeTab(BandbCreativeTabs.CreativeTabsBel);
				itemBabybelBlue = new Item().setUnlocalizedName("itemBabybelBlue").setTextureName(Bandb_mod.MODID + ":bel/itemBabybelBlue").setCreativeTab(BandbCreativeTabs.CreativeTabsBel);
				itemBabybelYellow = new Item().setUnlocalizedName("itemBabybelYellow").setTextureName(Bandb_mod.MODID + ":bel/itemBabybelYellow").setCreativeTab(BandbCreativeTabs.CreativeTabsBel);
				itemBabybelPurple = new Item().setUnlocalizedName("itemBabybelPurple").setTextureName(Bandb_mod.MODID + ":bel/itemBabybelPurple").setCreativeTab(BandbCreativeTabs.CreativeTabsBel);
				
				itemBabybelOrange = new Item().setUnlocalizedName("itemBabybelOrange").setTextureName(Bandb_mod.MODID + ":bel/itemBabybelOrange").setCreativeTab(BandbCreativeTabs.CreativeTabsBel);
				itemBabybelLightGreen = new Item().setUnlocalizedName("itemBabybelLightGreen").setTextureName(Bandb_mod.MODID + ":bel/itemBabybelLightGreen").setCreativeTab(BandbCreativeTabs.CreativeTabsBel);
				itemBabybelGreen = new Item().setUnlocalizedName("itemBabybelGreen").setTextureName(Bandb_mod.MODID + ":bel/itemBabybelGreen").setCreativeTab(BandbCreativeTabs.CreativeTabsBel);
				itemBabybelBrown = new Item().setUnlocalizedName("itemBabybelBrown").setTextureName(Bandb_mod.MODID + ":bel/itemBabybelBrown").setCreativeTab(BandbCreativeTabs.CreativeTabsBel);
				itemBabybelBlack = new Item().setUnlocalizedName("itemBabybelBlack").setTextureName(Bandb_mod.MODID + ":bel/itemBabybelBlack").setCreativeTab(BandbCreativeTabs.CreativeTabsBel);
				
				GameRegistry.registerItem(itemLogoBel, "itemLogoBel");	
				GameRegistry.registerItem(itemBabybelRed, "itemBabybelRed");	
				GameRegistry.registerItem(itemBabybelBlue, "itemBabybelBlue");	
				GameRegistry.registerItem(itemBabybelYellow, "itemBabybelYellow");	
				GameRegistry.registerItem(itemBabybelPurple, "itemBabybelPurple");	
				
				GameRegistry.registerItem(itemBabybelOrange, "itemBabybelOrange");	
				GameRegistry.registerItem(itemBabybelLightGreen, "itemBabybelLightGreen");	
				GameRegistry.registerItem(itemBabybelGreen, "itemBabybelGreen");	
				GameRegistry.registerItem(itemBabybelBrown, "itemBabybelBrown");	
				GameRegistry.registerItem(itemBabybelBlack, "itemBabybelBlack");	
			}
			
		}
		
		public static void loaderMiscellaneous(boolean bool){
			if(bool){
				//items miscellaneous
				itemJoint = new Item().setUnlocalizedName("itemJoint").setTextureName(Bandb_mod.MODID + ":miscellaneous/itemJoint").setCreativeTab(BandbCreativeTabs.CreativeTabsMiscellaneous);
				itemIPhone = new Item().setUnlocalizedName("itemIPhone").setTextureName(Bandb_mod.MODID + ":miscellaneous/itemIPhone").setCreativeTab(BandbCreativeTabs.CreativeTabsMiscellaneous);
				itemiPad = new Item().setUnlocalizedName("itemiPad").setTextureName(Bandb_mod.MODID + ":miscellaneous/itemiPad").setCreativeTab(BandbCreativeTabs.CreativeTabsMiscellaneous);				
				itemMinecraftForDummies = new Item().setUnlocalizedName("itemMinecraftForDummies").setTextureName(Bandb_mod.MODID + ":miscellaneous/itemMinecraftForDummies").setCreativeTab(BandbCreativeTabs.CreativeTabsMiscellaneous);
				itemBreakageOfGlass = new Item().setUnlocalizedName("itemBreakageOfGlass").setTextureName(Bandb_mod.MODID + ":miscellaneous/itemBreakageOfGlass").setCreativeTab(BandbCreativeTabs.CreativeTabsMiscellaneous);

				itemMagentaInkCartridge = new Item().setUnlocalizedName("itemMagentaInkCartridge").setTextureName(Bandb_mod.MODID + ":miscellaneous/itemMagentaInkCartridge").setCreativeTab(BandbCreativeTabs.CreativeTabsMiscellaneous);
				itemBlackInkCartridge = new Item().setUnlocalizedName("itemBlackInkCartridge").setTextureName(Bandb_mod.MODID + ":miscellaneous/itemBlackInkCartridge").setCreativeTab(BandbCreativeTabs.CreativeTabsMiscellaneous);
				itemYellowInkCartridge = new Item().setUnlocalizedName("itemYellowInkCartridge").setTextureName(Bandb_mod.MODID + ":miscellaneous/itemYellowInkCartridge").setCreativeTab(BandbCreativeTabs.CreativeTabsMiscellaneous);
				itemCyanInkCartridge = new Item().setUnlocalizedName("itemCyanInkCartridge").setTextureName(Bandb_mod.MODID + ":miscellaneous/itemCyanInkCartridge").setCreativeTab(BandbCreativeTabs.CreativeTabsMiscellaneous);
				itemEmptyInkCartridge = new Item().setUnlocalizedName("itemEmptyInkCartridge").setTextureName(Bandb_mod.MODID + ":miscellaneous/itemEmptyInkCartridge").setCreativeTab(BandbCreativeTabs.CreativeTabsMiscellaneous);

				GameRegistry.registerItem(itemJoint, "itemJoint");
		    	GameRegistry.registerItem(itemIPhone, "itemIPhone");
		    	GameRegistry.registerItem(itemiPad, "itemiPad");		    	
		    	GameRegistry.registerItem(itemMinecraftForDummies, "itemMinecraftForDummies");
		    	GameRegistry.registerItem(itemBreakageOfGlass, "itemBreakageOfGlass");

				GameRegistry.registerItem(itemMagentaInkCartridge, "itemMagentaInkCartridge");
		    	GameRegistry.registerItem(itemBlackInkCartridge, "itemBlackInkCartridge");
		    	GameRegistry.registerItem(itemYellowInkCartridge, "itemYellowInkCartridge");
		    	GameRegistry.registerItem(itemCyanInkCartridge, "itemCyanInkCartridge");
		    	GameRegistry.registerItem(itemEmptyInkCartridge, "itemEmptyInkCartridge");

				itemBookCocktailGlass = new Item().setUnlocalizedName("itemBookCocktailGlass").setTextureName(Bandb_mod.MODID + ":miscellaneous/itemBookCocktailGlass").setCreativeTab(BandbCreativeTabs.CreativeTabsMiscellaneous);
				itemBookCocktails = new Item().setUnlocalizedName("itemBookCocktails").setTextureName(Bandb_mod.MODID + ":miscellaneous/itemBookCocktails").setCreativeTab(BandbCreativeTabs.CreativeTabsMiscellaneous);
				itemBookShaker = new Item().setUnlocalizedName("itemBookShaker").setTextureName(Bandb_mod.MODID + ":miscellaneous/itemBookShaker").setCreativeTab(BandbCreativeTabs.CreativeTabsMiscellaneous);
				itemBookOldFashioned = new Item().setUnlocalizedName("itemBookOldFashioned").setTextureName(Bandb_mod.MODID + ":miscellaneous/itemBookOldFashioned").setCreativeTab(BandbCreativeTabs.CreativeTabsMiscellaneous);		
				itemSurpriseKinderYellow = new Item().setUnlocalizedName("itemSurpriseKinderYellow").setTextureName(Bandb_mod.MODID + ":miscellaneous/itemSurpriseKinderYellow").setCreativeTab(BandbCreativeTabs.CreativeTabsMiscellaneous);
	
		    	itemSurpriseKinderRed = new Item().setUnlocalizedName("itemSurpriseKinderRed").setTextureName(Bandb_mod.MODID + ":miscellaneous/itemSurpriseKinderRed").setCreativeTab(BandbCreativeTabs.CreativeTabsMiscellaneous);    	
		    	itemSurprise = new ItemFood(1, 1.0F, false).setUnlocalizedName("itemSurprise").setTextureName(Bandb_mod.MODID + ":miscellaneous/itemSurprise").setCreativeTab(BandbCreativeTabs.CreativeTabsMiscellaneous);
		    	itemBleach = new Item().setUnlocalizedName("itemBleach").setTextureName(Bandb_mod.MODID + ":miscellaneous/itemBleach").setCreativeTab(BandbCreativeTabs.CreativeTabsMiscellaneous);
				itemBookTumbler = new Item().setUnlocalizedName("itemBookTumbler").setTextureName(Bandb_mod.MODID + ":miscellaneous/itemBookTumbler").setCreativeTab(BandbCreativeTabs.CreativeTabsMiscellaneous);
		    	itemMac = new ItemMac().setUnlocalizedName("itemMac").setTextureName(Bandb_mod.MODID + ":miscellaneous/itemMac").setCreativeTab(BandbCreativeTabs.CreativeTabsMiscellaneous);

		    	GameRegistry.registerItem(itemBookCocktailGlass, "itemBookCocktailGlass");
		    	GameRegistry.registerItem(itemBookCocktails, "itemBookCocktails");
		    	GameRegistry.registerItem(itemBookShaker, "itemBookShaker");
		    	GameRegistry.registerItem(itemBookOldFashioned, "itemBookOldFashioned");
		    	GameRegistry.registerItem(itemSurpriseKinderYellow, "itemSurpriseKinderYellow");
		
		    	GameRegistry.registerItem(itemSurpriseKinderRed, "itemSurpriseKinderRed");
		    	GameRegistry.registerItem(itemSurprise, "itemSurprise");
		    	GameRegistry.registerItem(itemBleach, "itemBleach");
		    	GameRegistry.registerItem(itemBookTumbler, "itemBookTumbler");
		    	GameRegistry.registerItem(itemMac, "itemMac");		    	
		    					
				itemLeatherCowBel = new Item().setUnlocalizedName("itemLeatherCowBel").setTextureName(Bandb_mod.MODID + ":miscellaneous/itemLeatherCowBel").setCreativeTab(BandbCreativeTabs.CreativeTabsMiscellaneous);    	
				itemLeatherCowCharolais = new Item().setUnlocalizedName("itemLeatherCowCharolais").setTextureName(Bandb_mod.MODID + ":miscellaneous/itemLeatherCowCharolais").setCreativeTab(BandbCreativeTabs.CreativeTabsMiscellaneous);    	
				itemLeatherCowGasconne = new ItemFood(1, 1.0F, false).setUnlocalizedName("itemLeatherCowGasconne").setTextureName(Bandb_mod.MODID + ":miscellaneous/itemLeatherCowGasconne").setCreativeTab(BandbCreativeTabs.CreativeTabsMiscellaneous);
				itemLeatherCowKerry = new Item().setUnlocalizedName("itemLeatherCowKerry").setTextureName(Bandb_mod.MODID + ":miscellaneous/itemLeatherCowKerry").setCreativeTab(BandbCreativeTabs.CreativeTabsMiscellaneous);
				itemLeatherCowMilka = new Item().setUnlocalizedName("itemLeatherCowMilka").setTextureName(Bandb_mod.MODID + ":miscellaneous/itemLeatherCowMilka").setCreativeTab(BandbCreativeTabs.CreativeTabsMiscellaneous);

				itemLeatherCowMontbeliarde = new Item().setUnlocalizedName("itemLeatherCowMontbeliarde").setTextureName(Bandb_mod.MODID + ":miscellaneous/itemLeatherCowMontbeliarde").setCreativeTab(BandbCreativeTabs.CreativeTabsMiscellaneous);		    	
		    	itemWhiteDye = new Item().setUnlocalizedName("itemWhiteDye").setTextureName(Bandb_mod.MODID + ":miscellaneous/itemWhiteDye").setCreativeTab(BandbCreativeTabs.CreativeTabsMiscellaneous);
		    	itemBlackDye = new Item().setUnlocalizedName("itemBlackDye").setTextureName(Bandb_mod.MODID + ":miscellaneous/itemBlackDye").setCreativeTab(BandbCreativeTabs.CreativeTabsMiscellaneous);
		    	itemBlueDye = new Item().setUnlocalizedName("itemBlueDye").setTextureName(Bandb_mod.MODID + ":miscellaneous/itemBlueDye").setCreativeTab(BandbCreativeTabs.CreativeTabsMiscellaneous);

		    	GameRegistry.registerItem(itemLeatherCowBel, "itemLeatherCowBel");
		    	GameRegistry.registerItem(itemLeatherCowCharolais, "itemLeatherCowCharolais");
		    	GameRegistry.registerItem(itemLeatherCowGasconne, "itemLeatherCowGasconne");
		    	GameRegistry.registerItem(itemLeatherCowKerry, "itemLeatherCowKerry");
		    	GameRegistry.registerItem(itemLeatherCowMilka, "itemLeatherCowMilka");
		    	
		    	GameRegistry.registerItem(itemLeatherCowMontbeliarde, "itemLeatherCowMontbeliarde");
		    	GameRegistry.registerItem(itemWhiteDye, "itemWhiteDye");
		    	GameRegistry.registerItem(itemBlackDye, "itemBlackDye");
		    	GameRegistry.registerItem(itemBlueDye, "itemBlueDye");
		    	
			}
			
		}
		public static void loaderFruit(boolean bool){
			if(bool){
				 //items fruit 
		    	itemAlmond = new ItemFood(1, 1.0F, false).setUnlocalizedName("itemAlmond").setTextureName(Bandb_mod.MODID + ":fruit/itemAlmond").setCreativeTab(BandbCreativeTabs.CreativeTabsFruit);
		    	itemApricot = new ItemFood(2, 1.0F, false).setUnlocalizedName("itemApricot").setTextureName(Bandb_mod.MODID + ":fruit/itemApricot").setCreativeTab(BandbCreativeTabs.CreativeTabsFruit);
		    	itemBanana = new ItemFood(2, 1.0F, false).setUnlocalizedName("itemBanana").setTextureName(Bandb_mod.MODID + ":fruit/itemBanana").setCreativeTab(BandbCreativeTabs.CreativeTabsFruit);
		    	itemCherry = new ItemFood(1, 1.0F, false).setUnlocalizedName("itemCherry").setTextureName(Bandb_mod.MODID + ":fruit/itemCherry").setCreativeTab(BandbCreativeTabs.CreativeTabsFruit);
		    	itemClementine = new ItemFood(2, 1.0F, false).setUnlocalizedName("itemClementine").setTextureName(Bandb_mod.MODID + ":fruit/itemClementine").setCreativeTab(BandbCreativeTabs.CreativeTabsFruit);

		    	itemDate = new ItemFood(1, 1.0F, false).setUnlocalizedName("itemDate").setTextureName(Bandb_mod.MODID + ":fruit/itemDate").setCreativeTab(BandbCreativeTabs.CreativeTabsFruit);
		    	itemDragonfruit = new ItemFood(2, 1.0F, false).setUnlocalizedName("itemDragonfruit").setTextureName(Bandb_mod.MODID + ":fruit/itemDragonfruit").setCreativeTab(BandbCreativeTabs.CreativeTabsFruit);
		    	itemFig = new ItemFood(1, 1.0F, false).setUnlocalizedName("itemFig").setTextureName(Bandb_mod.MODID + ":fruit/itemFig").setCreativeTab(BandbCreativeTabs.CreativeTabsFruit);
		    	itemGuava = new ItemFood(1, 1.0F, false).setUnlocalizedName("itemGuava").setTextureName(Bandb_mod.MODID + ":fruit/itemGuava").setCreativeTab(BandbCreativeTabs.CreativeTabsFruit);
		    	itemLemon = new ItemFood(1, 1.0F, false).setUnlocalizedName("itemLemon").setTextureName(Bandb_mod.MODID + ":fruit/itemLemon").setCreativeTab(BandbCreativeTabs.CreativeTabsFruit);

		    	GameRegistry.registerItem(itemAlmond, "itemAlmond");
		    	GameRegistry.registerItem(itemApricot, "itemApricot");
		    	GameRegistry.registerItem(itemBanana, "itemBanana");
		    	GameRegistry.registerItem(itemCherry, "itemCherry");
		    	GameRegistry.registerItem(itemClementine, "itemClementine");

		    	GameRegistry.registerItem(itemDate, "itemDate");
		    	GameRegistry.registerItem(itemDragonfruit, "itemDragonfruit");
		    	GameRegistry.registerItem(itemFig, "itemFig");
		    	GameRegistry.registerItem(itemGuava, "itemGuava");
		    	GameRegistry.registerItem(itemLemon, "itemLemon");

		    	itemLime = new ItemFood(1, 1.0F, false).setUnlocalizedName("itemLime").setTextureName(Bandb_mod.MODID + ":fruit/itemLime").setCreativeTab(BandbCreativeTabs.CreativeTabsFruit);
		    	itemLychee = new ItemFood(1, 1.0F, false).setUnlocalizedName("itemLychee").setTextureName(Bandb_mod.MODID + ":fruit/itemLychee").setCreativeTab(BandbCreativeTabs.CreativeTabsFruit);
		    	itemPassionfruit = new ItemFood(2, 1.0F, false).setUnlocalizedName("itemPassionfruit").setTextureName(Bandb_mod.MODID + ":fruit/itemPassionfruit").setCreativeTab(BandbCreativeTabs.CreativeTabsFruit);
		    	itemPomegranate = new ItemFood(2, 1.0F, false).setUnlocalizedName("itemPomegranate").setTextureName(Bandb_mod.MODID + ":fruit/itemPomegranate").setCreativeTab(BandbCreativeTabs.CreativeTabsFruit);
		    	itemQuince = new ItemFood(2, 1.0F, false).setUnlocalizedName("itemQuince").setTextureName(Bandb_mod.MODID + ":fruit/itemQuince").setCreativeTab(BandbCreativeTabs.CreativeTabsFruit);

		    	itemCoconut = new ItemFood(2, 1.0F, false).setUnlocalizedName("itemCoconut").setTextureName(Bandb_mod.MODID + ":fruit/itemCoconut").setCreativeTab(BandbCreativeTabs.CreativeTabsFruit);
		    	itemTangerine = new ItemFood(2, 1.0F, false).setUnlocalizedName("itemTangerine").setTextureName(Bandb_mod.MODID + ":fruit/itemTangerine").setCreativeTab(BandbCreativeTabs.CreativeTabsFruit);
		    	itemMango = new ItemFood(2, 1.0F, false).setUnlocalizedName("itemMango").setTextureName(Bandb_mod.MODID + ":fruit/itemMango").setCreativeTab(BandbCreativeTabs.CreativeTabsFruit);
		    	itemChestnut = new ItemFood(1, 1.0F, false).setUnlocalizedName("itemChestnut").setTextureName(Bandb_mod.MODID + ":fruit/itemChestnut").setCreativeTab(BandbCreativeTabs.CreativeTabsFruit);
		    	itemMirabelle = new ItemFood(1, 1.0F, false).setUnlocalizedName("itemMirabelle").setTextureName(Bandb_mod.MODID + ":fruit/itemMirabelle").setCreativeTab(BandbCreativeTabs.CreativeTabsFruit);

		    	GameRegistry.registerItem(itemLime, "itemLime");
		    	GameRegistry.registerItem(itemLychee, "itemLychee");
		    	GameRegistry.registerItem(itemPassionfruit, "itemPassionfruit");
		    	GameRegistry.registerItem(itemPomegranate, "itemPomegranate");
		    	GameRegistry.registerItem(itemQuince, "itemQuince");
		    	
		    	GameRegistry.registerItem(itemCoconut, "itemCoconut");
		    	GameRegistry.registerItem(itemTangerine, "itemTangerine");
		    	GameRegistry.registerItem(itemMango, "itemMango");
		    	GameRegistry.registerItem(itemChestnut, "itemChestnut");
		    	GameRegistry.registerItem(itemMirabelle, "itemMirabelle");
		    
		    	itemNuts = new ItemFood(1, 1.0F, false).setUnlocalizedName("itemNuts").setTextureName(Bandb_mod.MODID + ":fruit/itemNuts").setCreativeTab(BandbCreativeTabs.CreativeTabsFruit);
		    	itemWalnut = new ItemFood(1, 1.0F, false).setUnlocalizedName("itemWalnut").setTextureName(Bandb_mod.MODID + ":fruit/itemWalnut").setCreativeTab(BandbCreativeTabs.CreativeTabsFruit);
		    	itemOrange = new ItemFood(2, 1.0F, false).setUnlocalizedName("itemOrange").setTextureName(Bandb_mod.MODID + ":fruit/itemOrange").setCreativeTab(BandbCreativeTabs.CreativeTabsFruit);
		    	itemGrapefruit = new ItemFood(2, 1.0F, false).setUnlocalizedName("itemGrapefruit").setTextureName(Bandb_mod.MODID + ":fruit/itemGrapefruit").setCreativeTab(BandbCreativeTabs.CreativeTabsFruit);
		    	itemPapaya = new ItemFood(2, 1.0F, false).setUnlocalizedName("itemPapaya").setTextureName(Bandb_mod.MODID + ":fruit/itemPapaya").setCreativeTab(BandbCreativeTabs.CreativeTabsFruit);

		    	itemPeach = new ItemFood(2, 1.0F, false).setUnlocalizedName("itemPeach").setTextureName(Bandb_mod.MODID + ":fruit/itemPeach").setCreativeTab(BandbCreativeTabs.CreativeTabsFruit);
		    	itemPear = new ItemFood(2, 1.0F, false).setUnlocalizedName("itemPear").setTextureName(Bandb_mod.MODID + ":fruit/itemPear").setCreativeTab(BandbCreativeTabs.CreativeTabsFruit);
		    	itemPlum = new ItemFood(1, 1.0F, false).setUnlocalizedName("itemPlum").setTextureName(Bandb_mod.MODID + ":fruit/itemPlum").setCreativeTab(BandbCreativeTabs.CreativeTabsFruit);
	    		
		    	GameRegistry.registerItem(itemNuts, "itemNuts");
		    	GameRegistry.registerItem(itemWalnut, "itemWalnut");
		    	GameRegistry.registerItem(itemOrange, "itemOrange");
		    	GameRegistry.registerItem(itemGrapefruit, "itemGrapefruit");	    	
		    	GameRegistry.registerItem(itemPapaya, "itemPapaya");

		    	GameRegistry.registerItem(itemPeach, "itemPeach");
		    	GameRegistry.registerItem(itemPear, "itemPear");
		    	GameRegistry.registerItem(itemPlum, "itemPlum");
		    	
		    	//apple
		    	itemAppleAntares = new ItemFood(1, 1.0F, false).setUnlocalizedName("itemAppleAntares").setTextureName(Bandb_mod.MODID + ":fruit/itemAppleAntares").setCreativeTab(BandbCreativeTabs.CreativeTabsFruit);
		    	itemAppleAriane = new ItemFood(1, 1.0F, false).setUnlocalizedName("itemAppleAriane").setTextureName(Bandb_mod.MODID + ":fruit/itemAppleAriane").setCreativeTab(BandbCreativeTabs.CreativeTabsFruit);
		    	itemAppleBelchardChancelier = new ItemFood(1, 1.0F, false).setUnlocalizedName("itemAppleBelchardChancelier").setTextureName(Bandb_mod.MODID + ":fruit/itemAppleBelchardChancelier").setCreativeTab(BandbCreativeTabs.CreativeTabsFruit);
		    	itemAppleBelleDeBoskoop = new ItemFood(1, 1.0F, false).setUnlocalizedName("itemAppleBelleDeBoskoop").setTextureName(Bandb_mod.MODID + ":fruit/itemAppleBelleDeBoskoop").setCreativeTab(BandbCreativeTabs.CreativeTabsFruit);
		    	itemAppleBraeburn = new ItemFood(1, 1.0F, false).setUnlocalizedName("itemAppleBraeburn").setTextureName(Bandb_mod.MODID + ":fruit/itemAppleBraeburn").setCreativeTab(BandbCreativeTabs.CreativeTabsFruit);

		    	itemAppleElstar = new ItemFood(1, 1.0F, false).setUnlocalizedName("itemAppleElstar").setTextureName(Bandb_mod.MODID + ":fruit/itemAppleElstar").setCreativeTab(BandbCreativeTabs.CreativeTabsFruit);
		    	itemAppleFuji = new ItemFood(1, 1.0F, false).setUnlocalizedName("itemAppleFuji").setTextureName(Bandb_mod.MODID + ":fruit/itemAppleFuji").setCreativeTab(BandbCreativeTabs.CreativeTabsFruit);
		    	itemAppleGala = new ItemFood(1, 1.0F, false).setUnlocalizedName("itemAppleGala").setTextureName(Bandb_mod.MODID + ":fruit/itemAppleGala").setCreativeTab(BandbCreativeTabs.CreativeTabsFruit);
		    	itemAppleGolden = new ItemFood(1, 1.0F, false).setUnlocalizedName("itemAppleGolden").setTextureName(Bandb_mod.MODID + ":fruit/itemAppleGolden").setCreativeTab(BandbCreativeTabs.CreativeTabsFruit);
		    	itemAppleGrannySmith = new ItemFood(1, 1.0F, false).setUnlocalizedName("itemAppleGrannySmith").setTextureName(Bandb_mod.MODID + ":fruit/itemAppleGrannySmith").setCreativeTab(BandbCreativeTabs.CreativeTabsFruit);

		    	GameRegistry.registerItem(itemAppleAntares, "itemAppleAntares");
		    	GameRegistry.registerItem(itemAppleAriane, "itemAppleAriane");
		    	GameRegistry.registerItem(itemAppleBelchardChancelier, "itemAppleBelchardChancelier");
		    	GameRegistry.registerItem(itemAppleBelleDeBoskoop, "itemAppleBelleDeBoskoop");
		    	GameRegistry.registerItem(itemAppleBraeburn, "itemAppleBraeburn");

		    	GameRegistry.registerItem(itemAppleElstar, "itemAppleElstar");
		    	GameRegistry.registerItem(itemAppleFuji, "itemAppleFuji");
		    	GameRegistry.registerItem(itemAppleGala, "itemAppleGala");
		    	GameRegistry.registerItem(itemAppleGolden, "itemAppleGolden");
		    	GameRegistry.registerItem(itemAppleGrannySmith, "itemAppleGrannySmith");

		    	itemAppleHoneycrunch = new ItemFood(1, 1.0F, false).setUnlocalizedName("itemAppleHoneycrunch").setTextureName(Bandb_mod.MODID + ":fruit/itemAppleHoneycrunch").setCreativeTab(BandbCreativeTabs.CreativeTabsFruit);
		    	itemAppleJazz = new ItemFood(1, 1.0F, false).setUnlocalizedName("itemAppleJazz").setTextureName(Bandb_mod.MODID + ":fruit/itemAppleJazz").setCreativeTab(BandbCreativeTabs.CreativeTabsFruit);
		    	itemAppleJonagoldJonagored = new ItemFood(1, 1.0F, false).setUnlocalizedName("itemAppleJonagoldJonagored").setTextureName(Bandb_mod.MODID + ":fruit/itemAppleJonagoldJonagored").setCreativeTab(BandbCreativeTabs.CreativeTabsFruit);
		    	itemAppleLesRouges = new ItemFood(1, 1.0F, false).setUnlocalizedName("itemAppleLesRouges").setTextureName(Bandb_mod.MODID + ":fruit/itemAppleLesRouges").setCreativeTab(BandbCreativeTabs.CreativeTabsFruit);
		    	itemApplePinkLady = new ItemFood(1, 1.0F, false).setUnlocalizedName("itemApplePinkLady").setTextureName(Bandb_mod.MODID + ":fruit/itemApplePinkLady").setCreativeTab(BandbCreativeTabs.CreativeTabsFruit);

		    	itemApplePommeDuLimousin = new ItemFood(1, 1.0F, false).setUnlocalizedName("itemApplePommeDuLimousin").setTextureName(Bandb_mod.MODID + ":fruit/itemApplePommeDuLimousin").setCreativeTab(BandbCreativeTabs.CreativeTabsFruit);
		    	itemAppleReineDesReinettes = new ItemFood(1, 1.0F, false).setUnlocalizedName("itemAppleReineDesReinettes").setTextureName(Bandb_mod.MODID + ":fruit/itemAppleReineDesReinettes").setCreativeTab(BandbCreativeTabs.CreativeTabsFruit);
		    	itemAppleReinetteGriseDuCanada = new ItemFood(1, 1.0F, false).setUnlocalizedName("itemAppleReinetteGriseDuCanada").setTextureName(Bandb_mod.MODID + ":fruit/itemAppleReinetteGriseDuCanada").setCreativeTab(BandbCreativeTabs.CreativeTabsFruit);
		    	itemAppleTentation = new ItemFood(1, 1.0F, false).setUnlocalizedName("itemAppleTentation").setTextureName(Bandb_mod.MODID + ":fruit/itemAppleTentation").setCreativeTab(BandbCreativeTabs.CreativeTabsFruit);
		    	itemCrabapple = new ItemFood(1, 1.0F, false).setUnlocalizedName("itemCrabapple").setTextureName(Bandb_mod.MODID + ":fruit/itemCrabapple").setCreativeTab(BandbCreativeTabs.CreativeTabsFruit);

		    	GameRegistry.registerItem(itemAppleHoneycrunch, "itemAppleHoneycrunch");
		    	GameRegistry.registerItem(itemAppleJazz, "itemAppleJazz");
		    	GameRegistry.registerItem(itemAppleJonagoldJonagored, "itemAppleJonagoldJonagored");
		    	GameRegistry.registerItem(itemAppleLesRouges, "itemAppleLesRouges");
		    	GameRegistry.registerItem(itemApplePinkLady, "itemApplePinkLady");
		    	
		    	GameRegistry.registerItem(itemApplePommeDuLimousin, "itemApplePommeDuLimousin");
		    	GameRegistry.registerItem(itemAppleReineDesReinettes, "itemAppleReineDesReinettes");
		    	GameRegistry.registerItem(itemAppleReinetteGriseDuCanada, "itemAppleReinetteGriseDuCanada");
		    	GameRegistry.registerItem(itemAppleTentation, "itemAppleTentation");
		    	GameRegistry.registerItem(itemCrabapple, "itemCrabapple");
		    	
				itemAmla = new ItemFood(1, 1.0F, false).setUnlocalizedName("itemAmla").setTextureName(Bandb_mod.MODID + ":fruit/itemAmla").setCreativeTab(BandbCreativeTabs.CreativeTabsFruit);
				itemPineappleCayenne = new ItemFood(1, 1.0F, false).setUnlocalizedName("itemPineappleCayenne").setTextureName(Bandb_mod.MODID + ":fruit/itemPineappleCayenne").setCreativeTab(BandbCreativeTabs.CreativeTabsFruit);
				itemPineappleVictoria = new ItemFood(1, 1.0F, false).setUnlocalizedName("itemPineappleVictoria").setTextureName(Bandb_mod.MODID + ":fruit/itemPineappleVictoria").setCreativeTab(BandbCreativeTabs.CreativeTabsFruit);
				itemCranberry = new ItemFood(1, 1.0F, false).setUnlocalizedName("itemCranberry").setTextureName(Bandb_mod.MODID + ":fruit/itemCranberry").setCreativeTab(BandbCreativeTabs.CreativeTabsFruit);
				itemBlackcurrant = new ItemFood(1, 1.0F, false).setUnlocalizedName("itemBlackcurrant").setTextureName(Bandb_mod.MODID + ":fruit/itemBlackcurrant").setCreativeTab(BandbCreativeTabs.CreativeTabsFruit);

				itemPricklyPear = new ItemFood(1, 1.0F, false).setUnlocalizedName("itemPricklyPear").setTextureName(Bandb_mod.MODID + ":fruit/itemPricklyPear").setCreativeTab(BandbCreativeTabs.CreativeTabsFruit);
				itemStrawberry = new ItemFood(1, 1.0F, false).setUnlocalizedName("itemStrawberry").setTextureName(Bandb_mod.MODID + ":fruit/itemStrawberry").setCreativeTab(BandbCreativeTabs.CreativeTabsFruit);
				itemNectarine = new ItemFood(1, 1.0F, false).setUnlocalizedName("itemNectarine").setTextureName(Bandb_mod.MODID + ":fruit/itemNectarine").setCreativeTab(BandbCreativeTabs.CreativeTabsFruit);
				itemPersimmon = new ItemFood(1, 1.0F, false).setUnlocalizedName("itemPersimmon").setTextureName(Bandb_mod.MODID + ":fruit/itemPersimmon").setCreativeTab(BandbCreativeTabs.CreativeTabsFruit);
				itemRhubarb = new ItemFood(1, 1.0F, false).setUnlocalizedName("itemRhubarb").setTextureName(Bandb_mod.MODID + ":fruit/itemRhubarb").setCreativeTab(BandbCreativeTabs.CreativeTabsFruit);
		
		    	GameRegistry.registerItem(itemAmla, "itemAmla");
		    	GameRegistry.registerItem(itemPineappleCayenne, "itemPineappleCayenne");
		    	GameRegistry.registerItem(itemPineappleVictoria, "itemPineappleVictoria");
		    	GameRegistry.registerItem(itemCranberry, "itemCranberry");
		    	GameRegistry.registerItem(itemBlackcurrant, "itemBlackcurrant");
		    	
		    	GameRegistry.registerItem(itemPricklyPear, "itemPricklyPear");
		    	GameRegistry.registerItem(itemStrawberry, "itemStrawberry");
		    	GameRegistry.registerItem(itemNectarine, "itemNectarine");
		    	GameRegistry.registerItem(itemPersimmon, "itemPersimmon");
		    	GameRegistry.registerItem(itemRhubarb, "itemRhubarb");
		    	
				itemRaspberry = new ItemFood(1, 1.0F, false).setUnlocalizedName("itemRaspberry").setTextureName(Bandb_mod.MODID + ":fruit/itemRaspberry").setCreativeTab(BandbCreativeTabs.CreativeTabsFruit);
				itemCurrant = new ItemFood(1, 1.0F, false).setUnlocalizedName("itemCurrant").setTextureName(Bandb_mod.MODID + ":fruit/itemCurrant").setCreativeTab(BandbCreativeTabs.CreativeTabsFruit);
				itemJujube = new ItemFood(1, 1.0F, false).setUnlocalizedName("itemJujube").setTextureName(Bandb_mod.MODID + ":fruit/itemJujube").setCreativeTab(BandbCreativeTabs.CreativeTabsFruit);
				itemKumquat = new ItemFood(1, 1.0F, false).setUnlocalizedName("itemKumquat").setTextureName(Bandb_mod.MODID + ":fruit/itemKumquat").setCreativeTab(BandbCreativeTabs.CreativeTabsFruit);
				itemVanilla = new ItemFood(1, 1.0F, false).setUnlocalizedName("itemVanilla").setTextureName(Bandb_mod.MODID + ":fruit/itemVanilla").setCreativeTab(BandbCreativeTabs.CreativeTabsFruit);
		    		    	
				itemKiwi = new ItemFood(1, 1.0F, false).setUnlocalizedName("itemKiwi").setTextureName(Bandb_mod.MODID + ":fruit/itemKiwi").setCreativeTab(BandbCreativeTabs.CreativeTabsFruit);
				itemCacao = new ItemFood(1, 1.0F, false).setUnlocalizedName("itemCacao").setTextureName(Bandb_mod.MODID + ":fruit/itemCacao").setCreativeTab(BandbCreativeTabs.CreativeTabsFruit);
				itemAnise = new ItemFood(1, 1.0F, false).setUnlocalizedName("itemAnise").setTextureName(Bandb_mod.MODID + ":fruit/itemAnise").setCreativeTab(BandbCreativeTabs.CreativeTabsFruit);
				itemStarAnise = new ItemFood(1, 1.0F, false).setUnlocalizedName("itemStarAnise").setTextureName(Bandb_mod.MODID + ":fruit/itemStarAnise").setCreativeTab(BandbCreativeTabs.CreativeTabsFruit);
				itemAfrican = new ItemFood(1, 1.0F, false).setUnlocalizedName("itemAfrican").setTextureName(Bandb_mod.MODID + ":fruit/itemAfrican").setCreativeTab(BandbCreativeTabs.CreativeTabsFruit);
		
		    	GameRegistry.registerItem(itemRaspberry, "itemRaspberry");
		    	GameRegistry.registerItem(itemCurrant, "itemCurrant");
		    	GameRegistry.registerItem(itemJujube, "itemJujube");
		    	GameRegistry.registerItem(itemKumquat, "itemKumquat");
		    	GameRegistry.registerItem(itemVanilla, "itemVanilla");

		    	GameRegistry.registerItem(itemKiwi, "itemKiwi");
		    	GameRegistry.registerItem(itemCacao, "itemCacao");
		    	GameRegistry.registerItem(itemAnise, "itemAnise");
		    	GameRegistry.registerItem(itemStarAnise, "itemStarAnise");
		    	GameRegistry.registerItem(itemAfrican, "itemAfrican");	    	
		    	
		    	itemBreadNut = new ItemFood(1, 1.0F, false).setUnlocalizedName("itemBreadNut").setTextureName(Bandb_mod.MODID + ":fruit/itemBreadNut").setCreativeTab(BandbCreativeTabs.CreativeTabsFruit);
		    	
		    	GameRegistry.registerItem(itemBreadNut, "itemBreadNut");
		    	
		    	itemAllspice = new ItemFood(1, 1.0F, false).setUnlocalizedName("itemAllspice").setTextureName(Bandb_mod.MODID + ":fruit/itemAllspice").setCreativeTab(BandbCreativeTabs.CreativeTabsFruit);
		    	itemBael = new ItemFood(1, 1.0F, false).setUnlocalizedName("itemBael").setTextureName(Bandb_mod.MODID + ":fruit/itemBael").setCreativeTab(BandbCreativeTabs.CreativeTabsFruit);
		    	itemBananaPlantain = new ItemFood(1, 1.0F, false).setUnlocalizedName("itemBananaPlantain").setTextureName(Bandb_mod.MODID + ":fruit/itemBananaPlantain").setCreativeTab(BandbCreativeTabs.CreativeTabsFruit);
		    	itemBayLaurel = new ItemFood(1, 1.0F, false).setUnlocalizedName("itemBayLaurel").setTextureName(Bandb_mod.MODID + ":fruit/itemBayLaurel").setCreativeTab(BandbCreativeTabs.CreativeTabsFruit);
		    	itemBlackCherry = new ItemFood(1, 1.0F, false).setUnlocalizedName("itemBlackCherry").setTextureName(Bandb_mod.MODID + ":fruit/itemBlackCherry").setCreativeTab(BandbCreativeTabs.CreativeTabsFruit);
		    		    	
		    	itemBlackthorn = new ItemFood(1, 1.0F, false).setUnlocalizedName("itemBlackthorn").setTextureName(Bandb_mod.MODID + ":fruit/itemBlackthorn").setCreativeTab(BandbCreativeTabs.CreativeTabsFruit);
		    	itemBrazilNut = new ItemFood(1, 1.0F, false).setUnlocalizedName("itemBrazilNut").setTextureName(Bandb_mod.MODID + ":fruit/itemBrazilNut").setCreativeTab(BandbCreativeTabs.CreativeTabsFruit);
		    	itemButternut = new ItemFood(1, 1.0F, false).setUnlocalizedName("itemButternut").setTextureName(Bandb_mod.MODID + ":fruit/itemButternut").setCreativeTab(BandbCreativeTabs.CreativeTabsFruit);
		    	itemCinnamon = new ItemFood(1, 1.0F, false).setUnlocalizedName("itemCinnamon").setTextureName(Bandb_mod.MODID + ":fruit/itemCinnamon").setCreativeTab(BandbCreativeTabs.CreativeTabsFruit);
		    	itemClove = new ItemFood(1, 1.0F, false).setUnlocalizedName("itemClove").setTextureName(Bandb_mod.MODID + ":fruit/itemClove").setCreativeTab(BandbCreativeTabs.CreativeTabsFruit);
		
		    	GameRegistry.registerItem(itemAllspice, "itemAllspice");
		    	GameRegistry.registerItem(itemBael, "itemBael");
		    	GameRegistry.registerItem(itemBananaPlantain, "itemBananaPlantain");
		    	GameRegistry.registerItem(itemBayLaurel, "itemBayLaurel");
		    	GameRegistry.registerItem(itemBlackCherry, "itemBlackCherry");

		    	GameRegistry.registerItem(itemBlackthorn, "itemBlackthorn");
		    	GameRegistry.registerItem(itemBrazilNut, "itemBrazilNut");
		    	GameRegistry.registerItem(itemButternut, "itemButternut");
		    	GameRegistry.registerItem(itemCinnamon, "itemCinnamon");
		    	GameRegistry.registerItem(itemClove, "itemClove");
		    	
		    	itemDamsonPlum = new ItemFood(1, 1.0F, false).setUnlocalizedName("itemDamsonPlum").setTextureName(Bandb_mod.MODID + ":fruit/itemDamsonPlum").setCreativeTab(BandbCreativeTabs.CreativeTabsFruit);
		    	itemElderberry = new ItemFood(1, 1.0F, false).setUnlocalizedName("itemElderberry").setTextureName(Bandb_mod.MODID + ":fruit/itemElderberry").setCreativeTab(BandbCreativeTabs.CreativeTabsFruit);
		    	itemMacadamia = new ItemFood(1, 1.0F, false).setUnlocalizedName("itemMacadamia").setTextureName(Bandb_mod.MODID + ":fruit/itemMacadamia").setCreativeTab(BandbCreativeTabs.CreativeTabsFruit);
		    	itemPomelo = new ItemFood(1, 1.0F, false).setUnlocalizedName("itemPomelo").setTextureName(Bandb_mod.MODID + ":fruit/itemPomelo").setCreativeTab(BandbCreativeTabs.CreativeTabsFruit);
		    	itemSatsuma = new ItemFood(1, 1.0F, false).setUnlocalizedName("itemSatsuma").setTextureName(Bandb_mod.MODID + ":fruit/itemSatsuma").setCreativeTab(BandbCreativeTabs.CreativeTabsFruit);
		
		    	GameRegistry.registerItem(itemDamsonPlum, "itemDamsonPlum");
		    	GameRegistry.registerItem(itemElderberry, "itemElderberry");
		    	GameRegistry.registerItem(itemMacadamia, "itemMacadamia");
		    	GameRegistry.registerItem(itemPomelo, "itemPomelo");
		    	GameRegistry.registerItem(itemSatsuma, "itemSatsuma");
		    	
		    	itemBloodOrange = new ItemFood(1, 1.0F, false).setUnlocalizedName("itemBloodOrange").setTextureName(Bandb_mod.MODID + ":fruit/itemBloodOrange").setCreativeTab(BandbCreativeTabs.CreativeTabsFruit);
		    	itemMorelloCherry = new ItemFood(1, 1.0F, false).setUnlocalizedName("itemMorelloCherry").setTextureName(Bandb_mod.MODID + ":fruit/itemMorelloCherry").setCreativeTab(BandbCreativeTabs.CreativeTabsFruit);
		    	itemWhitePeach = new ItemFood(1, 1.0F, false).setUnlocalizedName("itemWhitePeach").setTextureName(Bandb_mod.MODID + ":fruit/itemWhitePeach").setCreativeTab(BandbCreativeTabs.CreativeTabsFruit);
		    	itemWildStrawberry = new ItemFood(1, 1.0F, false).setUnlocalizedName("itemWildStrawberry").setTextureName(Bandb_mod.MODID + ":fruit/itemWildStrawberry").setCreativeTab(BandbCreativeTabs.CreativeTabsFruit);
		    	itemGrapefruitPink = new ItemFood(1, 1.0F, false).setUnlocalizedName("itemGrapefruitPink").setTextureName(Bandb_mod.MODID + ":fruit/itemGrapefruitPink").setCreativeTab(BandbCreativeTabs.CreativeTabsFruit);
		    	
		    	GameRegistry.registerItem(itemBloodOrange, "itemBloodOrange");
		    	GameRegistry.registerItem(itemMorelloCherry, "itemMorelloCherry");
		    	GameRegistry.registerItem(itemWhitePeach, "itemWhitePeach");
		    	GameRegistry.registerItem(itemWildStrawberry, "itemWildStrawberry");	    	
		    	GameRegistry.registerItem(itemGrapefruitPink, "itemGrapefruitPink");	    	
				
				itemAbiu = new ItemFood(1, 1.0F, false).setUnlocalizedName("itemAbiu").setTextureName(Bandb_mod.MODID + ":fruit/itemAbiu").setCreativeTab(BandbCreativeTabs.CreativeTabsFruit);
				itemLongan = new ItemFood(1, 1.0F, false).setUnlocalizedName("itemLongan").setTextureName(Bandb_mod.MODID + ":fruit/itemLongan").setCreativeTab(BandbCreativeTabs.CreativeTabsFruit);
				itemLoquat = new ItemFood(1, 1.0F, false).setUnlocalizedName("itemLoquat").setTextureName(Bandb_mod.MODID + ":fruit/itemLoquat").setCreativeTab(BandbCreativeTabs.CreativeTabsFruit);
				itemNutmeg = new ItemFood(1, 1.0F, false).setUnlocalizedName("itemNutmeg").setTextureName(Bandb_mod.MODID + ":fruit/itemNutmeg").setCreativeTab(BandbCreativeTabs.CreativeTabsFruit);
		    	itemTonkaBean = new ItemFood(1, 1.0F, false).setUnlocalizedName("itemTonkaBean").setTextureName(Bandb_mod.MODID + ":fruit/itemTonkaBean").setCreativeTab(BandbCreativeTabs.CreativeTabsFruit);
		    	itemToffeeNut = new ItemFood(1, 1.0F, false).setUnlocalizedName("itemToffeeNut").setTextureName(Bandb_mod.MODID + ":processed food/itemToffeeNut").setCreativeTab(BandbCreativeTabs.CreativeTabsProcessedFood);
				
		    	GameRegistry.registerItem(itemAbiu, "itemAbiu");
		    	GameRegistry.registerItem(itemLongan, "itemLongan");
		    	GameRegistry.registerItem(itemLoquat, "itemLoquat");
		    	GameRegistry.registerItem(itemNutmeg, "itemNutmeg");
		    	GameRegistry.registerItem(itemTonkaBean, "itemTonkaBean");
		    	GameRegistry.registerItem(itemToffeeNut, "itemToffeeNut");	   
		    	
		    	itemBlueBerry = new ItemFood(1, 1.0F, false).setUnlocalizedName("itemBlueBerry").setTextureName(Bandb_mod.MODID + ":fruit/itemBlueBerry").setCreativeTab(BandbCreativeTabs.CreativeTabsFruit);
		    	itemBlackBerry = new ItemFood(1, 1.0F, false).setUnlocalizedName("itemBlackBerry").setTextureName(Bandb_mod.MODID + ":fruit/itemBlackBerry").setCreativeTab(BandbCreativeTabs.CreativeTabsFruit);
		    	itemBer = new ItemFood(1, 1.0F, false).setUnlocalizedName("itemBer").setTextureName(Bandb_mod.MODID + ":fruit/itemBer").setCreativeTab(BandbCreativeTabs.CreativeTabsFruit);
		    	itemRedBanana = new ItemFood(1, 1.0F, false).setUnlocalizedName("itemRedBanana").setTextureName(Bandb_mod.MODID + ":fruit/itemRedBanana").setCreativeTab(BandbCreativeTabs.CreativeTabsFruit);
		    	itemBunyaNut = new ItemFood(1, 1.0F, false).setUnlocalizedName("itemBunyaNut").setTextureName(Bandb_mod.MODID + ":fruit/itemBunyaNut").setCreativeTab(BandbCreativeTabs.CreativeTabsFruit);
		    	itemGingkoNut = new ItemFood(1, 1.0F, false).setUnlocalizedName("itemGingkoNut").setTextureName(Bandb_mod.MODID + ":fruit/itemGingkoNut").setCreativeTab(BandbCreativeTabs.CreativeTabsFruit);
				
		    	GameRegistry.registerItem(itemBlueBerry, "itemBlueBerry");
		    	GameRegistry.registerItem(itemBlackBerry, "itemBlackBerry");
		    	GameRegistry.registerItem(itemBer, "itemBer");
		    	GameRegistry.registerItem(itemRedBanana, "itemRedBanana");
		    	GameRegistry.registerItem(itemBunyaNut, "itemBunyaNut");
		    	GameRegistry.registerItem(itemGingkoNut, "itemGingkoNut");
		    			    	
		    	itemHuckleberries = new ItemFood(1, 1.0F, false).setUnlocalizedName("itemHuckleberries").setTextureName(Bandb_mod.MODID + ":fruit/itemHuckleberries").setCreativeTab(BandbCreativeTabs.CreativeTabsFruit);
		    	itemJackfruit = new ItemFood(1, 1.0F, false).setUnlocalizedName("itemJackfruit").setTextureName(Bandb_mod.MODID + ":fruit/itemJackfruit").setCreativeTab(BandbCreativeTabs.CreativeTabsFruit);
		    	itemMameySapote = new ItemFood(1, 1.0F, false).setUnlocalizedName("itemMameySapote").setTextureName(Bandb_mod.MODID + ":fruit/itemMameySapote").setCreativeTab(BandbCreativeTabs.CreativeTabsFruit);
		    	itemMangosteen = new ItemFood(1, 1.0F, false).setUnlocalizedName("itemMangosteen").setTextureName(Bandb_mod.MODID + ":fruit/itemMangosteen").setCreativeTab(BandbCreativeTabs.CreativeTabsFruit);
		    	itemOhiaAi = new ItemFood(1, 1.0F, false).setUnlocalizedName("itemOhiaAi").setTextureName(Bandb_mod.MODID + ":fruit/itemOhiaAi").setCreativeTab(BandbCreativeTabs.CreativeTabsFruit);
				
		    	GameRegistry.registerItem(itemHuckleberries, "itemHuckleberries");
		    	GameRegistry.registerItem(itemJackfruit, "itemJackfruit");
		    	GameRegistry.registerItem(itemMameySapote, "itemMameySapote");
		    	GameRegistry.registerItem(itemMangosteen, "itemMangosteen");
		    	GameRegistry.registerItem(itemOhiaAi, "itemOhiaAi");

		    	itemOsageOrange = new ItemFood(1, 1.0F, false).setUnlocalizedName("itemOsageOrange").setTextureName(Bandb_mod.MODID + ":fruit/itemOsageOrange").setCreativeTab(BandbCreativeTabs.CreativeTabsFruit);
		    	itemParadiseNut = new ItemFood(1, 1.0F, false).setUnlocalizedName("itemParadiseNut").setTextureName(Bandb_mod.MODID + ":fruit/itemParadiseNut").setCreativeTab(BandbCreativeTabs.CreativeTabsFruit);
		    	itemPineNut = new ItemFood(1, 1.0F, false).setUnlocalizedName("itemPineNut").setTextureName(Bandb_mod.MODID + ":fruit/itemPineNut").setCreativeTab(BandbCreativeTabs.CreativeTabsFruit);
		    	itemSapodilla = new ItemFood(1, 1.0F, false).setUnlocalizedName("itemSapodilla").setTextureName(Bandb_mod.MODID + ":fruit/itemSapodilla").setCreativeTab(BandbCreativeTabs.CreativeTabsFruit);
		    	itemSoursop = new ItemFood(1, 1.0F, false).setUnlocalizedName("itemSoursop").setTextureName(Bandb_mod.MODID + ":fruit/itemSoursop").setCreativeTab(BandbCreativeTabs.CreativeTabsFruit);
		    	itemTamarillo = new ItemFood(1, 1.0F, false).setUnlocalizedName("itemTamarillo").setTextureName(Bandb_mod.MODID + ":fruit/itemTamarillo").setCreativeTab(BandbCreativeTabs.CreativeTabsFruit);
				
		    	GameRegistry.registerItem(itemOsageOrange, "itemOsageOrange");
		    	GameRegistry.registerItem(itemParadiseNut, "itemParadiseNut");
		    	GameRegistry.registerItem(itemPineNut, "itemPineNut");
		    	GameRegistry.registerItem(itemSapodilla, "itemSapodilla");
		    	GameRegistry.registerItem(itemSoursop, "itemSoursop");
		    	GameRegistry.registerItem(itemTamarillo, "itemTamarillo");
		    	
		    	
		    	//grape
				itemGrapeAbouriou = new ItemFood(1, 1.0F, false).setUnlocalizedName("itemGrapeAbouriou").setTextureName(Bandb_mod.MODID + ":fruit/grape/itemGrapeAbouriou").setCreativeTab(BandbCreativeTabs.CreativeTabsFruit);
				itemGrapeAleaticu = new ItemFood(1, 1.0F, false).setUnlocalizedName("itemGrapeAleaticu").setTextureName(Bandb_mod.MODID + ":fruit/grape/itemGrapeAleaticu").setCreativeTab(BandbCreativeTabs.CreativeTabsFruit);
				itemGrapeAligote = new ItemFood(1, 1.0F, false).setUnlocalizedName("itemGrapeAligote").setTextureName(Bandb_mod.MODID + ":fruit/grape/itemGrapeAligote").setCreativeTab(BandbCreativeTabs.CreativeTabsFruit);
				itemGrapeAltesse = new ItemFood(1, 1.0F, false).setUnlocalizedName("itemGrapeAltesse").setTextureName(Bandb_mod.MODID + ":fruit/grape/itemGrapeAltesse").setCreativeTab(BandbCreativeTabs.CreativeTabsFruit);
				itemGrapeAramon = new ItemFood(1, 1.0F, false).setUnlocalizedName("itemGrapeAramon").setTextureName(Bandb_mod.MODID + ":fruit/grape/itemGrapeAramon").setCreativeTab(BandbCreativeTabs.CreativeTabsFruit);

		    	GameRegistry.registerItem(itemGrapeAbouriou, "itemGrapeAbouriou");
		    	GameRegistry.registerItem(itemGrapeAleaticu, "itemGrapeAleaticu");
		    	GameRegistry.registerItem(itemGrapeAligote, "itemGrapeAligote");
		    	GameRegistry.registerItem(itemGrapeAltesse, "itemGrapeAltesse");
		    	GameRegistry.registerItem(itemGrapeAramon, "itemGrapeAramon");
		    	
		    	itemGrapeArbois = new ItemFood(1, 1.0F, false).setUnlocalizedName("itemGrapeArbois").setTextureName(Bandb_mod.MODID + ":fruit/grape/itemGrapeArbois").setCreativeTab(BandbCreativeTabs.CreativeTabsFruit);
		    	itemGrapeArrufiac = new ItemFood(1, 1.0F, false).setUnlocalizedName("itemGrapeArrufiac").setTextureName(Bandb_mod.MODID + ":fruit/grape/itemGrapeArrufiac").setCreativeTab(BandbCreativeTabs.CreativeTabsFruit);
		    	itemGrapeAubinVert = new ItemFood(1, 1.0F, false).setUnlocalizedName("itemGrapeAubinVert").setTextureName(Bandb_mod.MODID + ":fruit/grape/itemGrapeAubinVert").setCreativeTab(BandbCreativeTabs.CreativeTabsFruit);
		    	itemGrapeBarbarossa = new ItemFood(1, 1.0F, false).setUnlocalizedName("itemGrapeBarbarossa").setTextureName(Bandb_mod.MODID + ":fruit/grape/itemGrapeBarbarossa").setCreativeTab(BandbCreativeTabs.CreativeTabsFruit);
		    	itemGrapeBergeron = new ItemFood(1, 1.0F, false).setUnlocalizedName("itemGrapeBergeron").setTextureName(Bandb_mod.MODID + ":fruit/grape/itemGrapeBergeron").setCreativeTab(BandbCreativeTabs.CreativeTabsFruit);

		    	GameRegistry.registerItem(itemGrapeArbois, "itemGrapeArbois");
		    	GameRegistry.registerItem(itemGrapeArrufiac, "itemGrapeArrufiac");
		    	GameRegistry.registerItem(itemGrapeAubinVert, "itemGrapeAubinVert");
		    	GameRegistry.registerItem(itemGrapeBarbarossa, "itemGrapeBarbarossa");
		    	GameRegistry.registerItem(itemGrapeBergeron, "itemGrapeBergeron");
		    	
		    	itemGrapeBiancone = new ItemFood(1, 1.0F, false).setUnlocalizedName("itemGrapeBiancone").setTextureName(Bandb_mod.MODID + ":fruit/grape/itemGrapeBiancone").setCreativeTab(BandbCreativeTabs.CreativeTabsFruit);
		    	itemGrapeBiancuGentile = new ItemFood(1, 1.0F, false).setUnlocalizedName("itemGrapeBiancuGentile").setTextureName(Bandb_mod.MODID + ":fruit/grape/itemGrapeBiancuGentile").setCreativeTab(BandbCreativeTabs.CreativeTabsFruit);
		    	itemGrapeBourboulenc = new ItemFood(1, 1.0F, false).setUnlocalizedName("itemGrapeBourboulenc").setTextureName(Bandb_mod.MODID + ":fruit/grape/itemGrapeBourboulenc").setCreativeTab(BandbCreativeTabs.CreativeTabsFruit);
		    	itemGrapeBraquet = new ItemFood(1, 1.0F, false).setUnlocalizedName("itemGrapeBraquet").setTextureName(Bandb_mod.MODID + ":fruit/grape/itemGrapeBraquet").setCreativeTab(BandbCreativeTabs.CreativeTabsFruit);
		    	itemGrapeCabernetFranc = new ItemFood(1, 1.0F, false).setUnlocalizedName("itemGrapeCabernetFranc").setTextureName(Bandb_mod.MODID + ":fruit/grape/itemGrapeCabernetFranc").setCreativeTab(BandbCreativeTabs.CreativeTabsFruit);

		    	GameRegistry.registerItem(itemGrapeBiancone, "itemGrapeBiancone");
		    	GameRegistry.registerItem(itemGrapeBiancuGentile, "itemGrapeBiancuGentile");
		    	GameRegistry.registerItem(itemGrapeBourboulenc, "itemGrapeBourboulenc");
		    	GameRegistry.registerItem(itemGrapeBraquet, "itemGrapeBraquet");
		    	GameRegistry.registerItem(itemGrapeCabernetFranc, "itemGrapeCabernetFranc");
		    	
		    	itemGrapeCabernetSauvignon = new ItemFood(1, 1.0F, false).setUnlocalizedName("itemGrapeCabernetSauvignon").setTextureName(Bandb_mod.MODID + ":fruit/grape/itemGrapeCabernetSauvignon").setCreativeTab(BandbCreativeTabs.CreativeTabsFruit);
		    	itemGrapeCamarese = new ItemFood(1, 1.0F, false).setUnlocalizedName("itemGrapeCamarese").setTextureName(Bandb_mod.MODID + ":fruit/grape/itemGrapeCamarese").setCreativeTab(BandbCreativeTabs.CreativeTabsFruit);
		    	itemGrapeCarcaghjoluBiancu = new ItemFood(1, 1.0F, false).setUnlocalizedName("itemGrapeCarcaghjoluBiancu").setTextureName(Bandb_mod.MODID + ":fruit/grape/itemGrapeCarcaghjoluBiancu").setCreativeTab(BandbCreativeTabs.CreativeTabsFruit);
		    	itemGrapeCarcaghjoluNeru = new ItemFood(1, 1.0F, false).setUnlocalizedName("itemGrapeCarcaghjoluNeru").setTextureName(Bandb_mod.MODID + ":fruit/grape/itemGrapeCarcaghjoluNeru").setCreativeTab(BandbCreativeTabs.CreativeTabsFruit);
		    	itemGrapeCarignan = new ItemFood(1, 1.0F, false).setUnlocalizedName("itemGrapeCarignan").setTextureName(Bandb_mod.MODID + ":fruit/grape/itemGrapeCarignan").setCreativeTab(BandbCreativeTabs.CreativeTabsFruit);

		    	GameRegistry.registerItem(itemGrapeCabernetSauvignon, "itemGrapeCabernetSauvignon");
		    	GameRegistry.registerItem(itemGrapeCamarese, "itemGrapeCamarese");
		    	GameRegistry.registerItem(itemGrapeCarcaghjoluBiancu, "itemGrapeCarcaghjoluBiancu");
		    	GameRegistry.registerItem(itemGrapeCarcaghjoluNeru, "itemGrapeCarcaghjoluNeru");
		    	GameRegistry.registerItem(itemGrapeCarignan, "itemGrapeCarignan");
		    	
		    	itemGrapeCesar = new ItemFood(1, 1.0F, false).setUnlocalizedName("itemGrapeCesar").setTextureName(Bandb_mod.MODID + ":fruit/grape/itemGrapeCesar").setCreativeTab(BandbCreativeTabs.CreativeTabsFruit);
		    	itemGrapeChardonnay = new ItemFood(1, 1.0F, false).setUnlocalizedName("itemGrapeChardonnay").setTextureName(Bandb_mod.MODID + ":fruit/grape/itemGrapeChardonnay").setCreativeTab(BandbCreativeTabs.CreativeTabsFruit);
		    	itemGrapeChenin = new ItemFood(1, 1.0F, false).setUnlocalizedName("itemGrapeChenin").setTextureName(Bandb_mod.MODID + ":fruit/grape/itemGrapeChenin").setCreativeTab(BandbCreativeTabs.CreativeTabsFruit);
		    	itemGrapeCinsault = new ItemFood(1, 1.0F, false).setUnlocalizedName("itemGrapeCinsault").setTextureName(Bandb_mod.MODID + ":fruit/grape/itemGrapeCinsault").setCreativeTab(BandbCreativeTabs.CreativeTabsFruit);
		    	itemGrapeClairette = new ItemFood(1, 1.0F, false).setUnlocalizedName("itemGrapeClairette").setTextureName(Bandb_mod.MODID + ":fruit/grape/itemGrapeClairette").setCreativeTab(BandbCreativeTabs.CreativeTabsFruit);

		    	GameRegistry.registerItem(itemGrapeCesar, "itemGrapeCesar");
		    	GameRegistry.registerItem(itemGrapeChardonnay, "itemGrapeChardonnay");
		    	GameRegistry.registerItem(itemGrapeChenin, "itemGrapeChenin");
		    	GameRegistry.registerItem(itemGrapeCinsault, "itemGrapeCinsault");
		    	GameRegistry.registerItem(itemGrapeClairette, "itemGrapeClairette");
		    	
		    	itemGrapeColombard = new ItemFood(1, 1.0F, false).setUnlocalizedName("itemGrapeColombard").setTextureName(Bandb_mod.MODID + ":fruit/grape/itemGrapeColombard").setCreativeTab(BandbCreativeTabs.CreativeTabsFruit);
		    	itemGrapeCot = new ItemFood(1, 1.0F, false).setUnlocalizedName("itemGrapeCot").setTextureName(Bandb_mod.MODID + ":fruit/grape/itemGrapeCot").setCreativeTab(BandbCreativeTabs.CreativeTabsFruit);
		    	itemGrapeCounoise = new ItemFood(1, 1.0F, false).setUnlocalizedName("itemGrapeCounoise").setTextureName(Bandb_mod.MODID + ":fruit/grape/itemGrapeCounoise").setCreativeTab(BandbCreativeTabs.CreativeTabsFruit);
		    	itemGrapeCourbu = new ItemFood(1, 1.0F, false).setUnlocalizedName("itemGrapeCourbu").setTextureName(Bandb_mod.MODID + ":fruit/grape/itemGrapeCourbu").setCreativeTab(BandbCreativeTabs.CreativeTabsFruit);
		    	itemGrapeCudiverta = new ItemFood(1, 1.0F, false).setUnlocalizedName("itemGrapeCudiverta").setTextureName(Bandb_mod.MODID + ":fruit/grape/itemGrapeCudiverta").setCreativeTab(BandbCreativeTabs.CreativeTabsFruit);

		    	GameRegistry.registerItem(itemGrapeColombard, "itemGrapeColombard");
		    	GameRegistry.registerItem(itemGrapeCot, "itemGrapeCot");
		    	GameRegistry.registerItem(itemGrapeCounoise, "itemGrapeCounoise");
		    	GameRegistry.registerItem(itemGrapeCourbu, "itemGrapeCourbu");
		    	GameRegistry.registerItem(itemGrapeCudiverta, "itemGrapeCudiverta");
		    	
		    	itemGrapeDuras = new ItemFood(1, 1.0F, false).setUnlocalizedName("itemGrapeDuras").setTextureName(Bandb_mod.MODID + ":fruit/grape/itemGrapeDuras").setCreativeTab(BandbCreativeTabs.CreativeTabsFruit);
		    	itemGrapeFerServadou = new ItemFood(1, 1.0F, false).setUnlocalizedName("itemGrapeFerServadou").setTextureName(Bandb_mod.MODID + ":fruit/grape/itemGrapeFerServadou").setCreativeTab(BandbCreativeTabs.CreativeTabsFruit);
		    	itemGrapeFolleBlanche = new ItemFood(1, 1.0F, false).setUnlocalizedName("itemGrapeFolleBlanche").setTextureName(Bandb_mod.MODID + ":fruit/grape/itemGrapeFolleBlanche").setCreativeTab(BandbCreativeTabs.CreativeTabsFruit);
		    	itemGrapeGamay = new ItemFood(1, 1.0F, false).setUnlocalizedName("itemGrapeGamay").setTextureName(Bandb_mod.MODID + ":fruit/grape/itemGrapeGamay").setCreativeTab(BandbCreativeTabs.CreativeTabsFruit);
		    	itemGrapeGewurztraminer = new ItemFood(1, 1.0F, false).setUnlocalizedName("itemGrapeGewurztraminer").setTextureName(Bandb_mod.MODID + ":fruit/grape/itemGrapeGewurztraminer").setCreativeTab(BandbCreativeTabs.CreativeTabsFruit);

		    	GameRegistry.registerItem(itemGrapeDuras, "itemGrapeDuras");
		    	GameRegistry.registerItem(itemGrapeFerServadou, "itemGrapeFerServadou");
		    	GameRegistry.registerItem(itemGrapeFolleBlanche, "itemGrapeFolleBlanche");
		    	GameRegistry.registerItem(itemGrapeGamay, "itemGrapeGamay");
		    	GameRegistry.registerItem(itemGrapeGewurztraminer, "itemGrapeGewurztraminer");
		    	
		    	itemGrapeGrenache = new ItemFood(1, 1.0F, false).setUnlocalizedName("itemGrapeGrenache").setTextureName(Bandb_mod.MODID + ":fruit/grape/itemGrapeGrenache").setCreativeTab(BandbCreativeTabs.CreativeTabsFruit);
		    	itemGrapeGrenacheBlanc = new ItemFood(1, 1.0F, false).setUnlocalizedName("itemGrapeGrenacheBlanc").setTextureName(Bandb_mod.MODID + ":fruit/grape/itemGrapeGrenacheBlanc").setCreativeTab(BandbCreativeTabs.CreativeTabsFruit);
		    	itemGrapeGrolleau = new ItemFood(1, 1.0F, false).setUnlocalizedName("itemGrapeGrolleau").setTextureName(Bandb_mod.MODID + ":fruit/grape/itemGrapeGrolleau").setCreativeTab(BandbCreativeTabs.CreativeTabsFruit);
		    	itemGrapeGrosMenseng = new ItemFood(1, 1.0F, false).setUnlocalizedName("itemGrapeGrosMenseng").setTextureName(Bandb_mod.MODID + ":fruit/grape/itemGrapeGrosMenseng").setCreativeTab(BandbCreativeTabs.CreativeTabsFruit);
		    	itemGrapeJacquere = new ItemFood(1, 1.0F, false).setUnlocalizedName("itemGrapeJacquere").setTextureName(Bandb_mod.MODID + ":fruit/grape/itemGrapeJacquere").setCreativeTab(BandbCreativeTabs.CreativeTabsFruit);

		    	GameRegistry.registerItem(itemGrapeGrenache, "itemGrapeGrenache");
		    	GameRegistry.registerItem(itemGrapeGrenacheBlanc, "itemGrapeGrenacheBlanc");
		    	GameRegistry.registerItem(itemGrapeGrolleau, "itemGrapeGrolleau");
		    	GameRegistry.registerItem(itemGrapeGrosMenseng, "itemGrapeGrosMenseng");
		    	GameRegistry.registerItem(itemGrapeJacquere, "itemGrapeJacquere");
		    	
		    	itemGrapeLenDeLEl = new ItemFood(1, 1.0F, false).setUnlocalizedName("itemGrapeLenDeLEl").setTextureName(Bandb_mod.MODID + ":fruit/grape/itemGrapeLenDeLEl").setCreativeTab(BandbCreativeTabs.CreativeTabsFruit);
		    	itemGrapeListan = new ItemFood(1, 1.0F, false).setUnlocalizedName("itemGrapeListan").setTextureName(Bandb_mod.MODID + ":fruit/grape/itemGrapeListan").setCreativeTab(BandbCreativeTabs.CreativeTabsFruit);
		    	itemGrapeMaccabeu = new ItemFood(1, 1.0F, false).setUnlocalizedName("itemGrapeMaccabeu").setTextureName(Bandb_mod.MODID + ":fruit/grape/itemGrapeMaccabeu").setCreativeTab(BandbCreativeTabs.CreativeTabsFruit);
		    	itemGrapeMalbec = new ItemFood(1, 1.0F, false).setUnlocalizedName("itemGrapeMalbec").setTextureName(Bandb_mod.MODID + ":fruit/grape/itemGrapeMalbec").setCreativeTab(BandbCreativeTabs.CreativeTabsFruit);
		    	itemGrapeMalvoisie = new ItemFood(1, 1.0F, false).setUnlocalizedName("itemGrapeMalvoisie").setTextureName(Bandb_mod.MODID + ":fruit/grape/itemGrapeMalvoisie").setCreativeTab(BandbCreativeTabs.CreativeTabsFruit);

		    	GameRegistry.registerItem(itemGrapeLenDeLEl, "itemGrapeLenDeLEl");
		    	GameRegistry.registerItem(itemGrapeListan, "itemGrapeListan");
		    	GameRegistry.registerItem(itemGrapeMaccabeu, "itemGrapeMaccabeu");
		    	GameRegistry.registerItem(itemGrapeMalbec, "itemGrapeMalbec");
		    	GameRegistry.registerItem(itemGrapeMalvoisie, "itemGrapeMalvoisie");
		    	
		    	itemGrapeMarsanne = new ItemFood(1, 1.0F, false).setUnlocalizedName("itemGrapeMarsanne").setTextureName(Bandb_mod.MODID + ":fruit/grape/itemGrapeMarsanne").setCreativeTab(BandbCreativeTabs.CreativeTabsFruit);
		    	itemGrapeMarselan = new ItemFood(1, 1.0F, false).setUnlocalizedName("itemGrapeMarselan").setTextureName(Bandb_mod.MODID + ":fruit/grape/itemGrapeMarselan").setCreativeTab(BandbCreativeTabs.CreativeTabsFruit);
		    	itemGrapeMauzac = new ItemFood(1, 1.0F, false).setUnlocalizedName("itemGrapeMauzac").setTextureName(Bandb_mod.MODID + ":fruit/grape/itemGrapeMauzac").setCreativeTab(BandbCreativeTabs.CreativeTabsFruit);
		    	itemGrapeMelon = new ItemFood(1, 1.0F, false).setUnlocalizedName("itemGrapeMelon").setTextureName(Bandb_mod.MODID + ":fruit/grape/itemGrapeMelon").setCreativeTab(BandbCreativeTabs.CreativeTabsFruit);
		    	itemGrapeMelonDeBourgogne = new ItemFood(1, 1.0F, false).setUnlocalizedName("itemGrapeMelonDeBourgogne").setTextureName(Bandb_mod.MODID + ":fruit/grape/itemGrapeMelonDeBourgogne").setCreativeTab(BandbCreativeTabs.CreativeTabsFruit);

		    	GameRegistry.registerItem(itemGrapeMarsanne, "itemGrapeMarsanne");
		    	GameRegistry.registerItem(itemGrapeMarselan, "itemGrapeMarselan");
		    	GameRegistry.registerItem(itemGrapeMauzac, "itemGrapeMauzac");
		    	GameRegistry.registerItem(itemGrapeMelon, "itemGrapeMelon");
		    	GameRegistry.registerItem(itemGrapeMelonDeBourgogne, "itemGrapeMelonDeBourgogne");
		    	
		    	itemGrapeMerlot = new ItemFood(1, 1.0F, false).setUnlocalizedName("itemGrapeMerlot").setTextureName(Bandb_mod.MODID + ":fruit/grape/itemGrapeMerlot").setCreativeTab(BandbCreativeTabs.CreativeTabsFruit);
		    	itemGrapeMolette = new ItemFood(1, 1.0F, false).setUnlocalizedName("itemGrapeMolette").setTextureName(Bandb_mod.MODID + ":fruit/grape/itemGrapeMolette").setCreativeTab(BandbCreativeTabs.CreativeTabsFruit);
		    	itemGrapeMollard = new ItemFood(1, 1.0F, false).setUnlocalizedName("itemGrapeMollard").setTextureName(Bandb_mod.MODID + ":fruit/grape/itemGrapeMollard").setCreativeTab(BandbCreativeTabs.CreativeTabsFruit);
		    	itemGrapeMondeuse = new ItemFood(1, 1.0F, false).setUnlocalizedName("itemGrapeMondeuse").setTextureName(Bandb_mod.MODID + ":fruit/grape/itemGrapeMondeuse").setCreativeTab(BandbCreativeTabs.CreativeTabsFruit);
		    	itemGrapeMondeuseBlanche = new ItemFood(1, 1.0F, false).setUnlocalizedName("itemGrapeMondeuseBlanche").setTextureName(Bandb_mod.MODID + ":fruit/grape/itemGrapeMondeuseBlanche").setCreativeTab(BandbCreativeTabs.CreativeTabsFruit);

		    	GameRegistry.registerItem(itemGrapeMerlot, "itemGrapeMerlot");
		    	GameRegistry.registerItem(itemGrapeMolette, "itemGrapeMolette");
		    	GameRegistry.registerItem(itemGrapeMollard, "itemGrapeMollard");
		    	GameRegistry.registerItem(itemGrapeMondeuse, "itemGrapeMondeuse");
		    	GameRegistry.registerItem(itemGrapeMondeuseBlanche, "itemGrapeMondeuseBlanche");
		    
		    	itemGrapeMourvedre = new ItemFood(1, 1.0F, false).setUnlocalizedName("itemGrapeMourvedre").setTextureName(Bandb_mod.MODID + ":fruit/grape/itemGrapeMourvedre").setCreativeTab(BandbCreativeTabs.CreativeTabsFruit);
		    	itemGrapeMuscadelle = new ItemFood(1, 1.0F, false).setUnlocalizedName("itemGrapeMuscadelle").setTextureName(Bandb_mod.MODID + ":fruit/grape/itemGrapeMuscadelle").setCreativeTab(BandbCreativeTabs.CreativeTabsFruit);
		    	itemGrapeMuscardin = new ItemFood(1, 1.0F, false).setUnlocalizedName("itemGrapeMuscardin").setTextureName(Bandb_mod.MODID + ":fruit/grape/itemGrapeMuscardin").setCreativeTab(BandbCreativeTabs.CreativeTabsFruit);
		    	itemGrapeMuscatBlancAPetitsGrains = new ItemFood(1, 1.0F, false).setUnlocalizedName("itemGrapeMuscatBlancAPetitsGrains").setTextureName(Bandb_mod.MODID + ":fruit/grape/itemGrapeMuscatBlancAPetitsGrains").setCreativeTab(BandbCreativeTabs.CreativeTabsFruit);
		    	itemGrapeMuscatDAlexandrie = new ItemFood(1, 1.0F, false).setUnlocalizedName("itemGrapeMuscatDAlexandrie").setTextureName(Bandb_mod.MODID + ":fruit/grape/itemGrapeMuscatDAlexandrie").setCreativeTab(BandbCreativeTabs.CreativeTabsFruit);

		    	GameRegistry.registerItem(itemGrapeMourvedre, "itemGrapeMourvedre");
		    	GameRegistry.registerItem(itemGrapeMuscadelle, "itemGrapeMuscadelle");
		    	GameRegistry.registerItem(itemGrapeMuscardin, "itemGrapeMuscardin");
		    	GameRegistry.registerItem(itemGrapeMuscatBlancAPetitsGrains, "itemGrapeMuscatBlancAPetitsGrains");
		    	GameRegistry.registerItem(itemGrapeMuscatDAlexandrie, "itemGrapeMuscatDAlexandrie");
		    
		    	itemGrapeNegrette = new ItemFood(1, 1.0F, false).setUnlocalizedName("itemGrapeNegrette").setTextureName(Bandb_mod.MODID + ":fruit/grape/itemGrapeNegrette").setCreativeTab(BandbCreativeTabs.CreativeTabsFruit);
		    	itemGrapeNielluccio = new ItemFood(1, 1.0F, false).setUnlocalizedName("itemGrapeNielluccio").setTextureName(Bandb_mod.MODID + ":fruit/grape/itemGrapeNielluccio").setCreativeTab(BandbCreativeTabs.CreativeTabsFruit);
		    	itemGrapePagaDebiti = new ItemFood(1, 1.0F, false).setUnlocalizedName("itemGrapePagaDebiti").setTextureName(Bandb_mod.MODID + ":fruit/grape/itemGrapePagaDebiti").setCreativeTab(BandbCreativeTabs.CreativeTabsFruit);
		    	itemGrapePetitCourbu = new ItemFood(1, 1.0F, false).setUnlocalizedName("itemGrapePetitCourbu").setTextureName(Bandb_mod.MODID + ":fruit/grape/itemGrapePetitCourbu").setCreativeTab(BandbCreativeTabs.CreativeTabsFruit);
		    	itemGrapePetitMenseng = new ItemFood(1, 1.0F, false).setUnlocalizedName("itemGrapePetitMenseng").setTextureName(Bandb_mod.MODID + ":fruit/grape/itemGrapePetitMenseng").setCreativeTab(BandbCreativeTabs.CreativeTabsFruit);

		    	GameRegistry.registerItem(itemGrapeNegrette, "itemGrapeNegrette");
		    	GameRegistry.registerItem(itemGrapeNielluccio, "itemGrapeNielluccio");
		    	GameRegistry.registerItem(itemGrapePagaDebiti, "itemGrapePagaDebiti");
		    	GameRegistry.registerItem(itemGrapePetitCourbu, "itemGrapePetitCourbu");
		    	GameRegistry.registerItem(itemGrapePetitMenseng, "itemGrapePetitMenseng");
		    
		    	itemGrapePetitVerdot = new ItemFood(1, 1.0F, false).setUnlocalizedName("itemGrapePetitVerdot").setTextureName(Bandb_mod.MODID + ":fruit/grape/itemGrapePetitVerdot").setCreativeTab(BandbCreativeTabs.CreativeTabsFruit);
		    	itemGrapePineauDAunis = new ItemFood(1, 1.0F, false).setUnlocalizedName("itemGrapePineauDAunis").setTextureName(Bandb_mod.MODID + ":fruit/grape/itemGrapePineauDAunis").setCreativeTab(BandbCreativeTabs.CreativeTabsFruit);
		    	itemGrapePinotBlanc = new ItemFood(1, 1.0F, false).setUnlocalizedName("itemGrapePinotBlanc").setTextureName(Bandb_mod.MODID + ":fruit/grape/itemGrapePinotBlanc").setCreativeTab(BandbCreativeTabs.CreativeTabsFruit);
		    	itemGrapePinotMeunier = new ItemFood(1, 1.0F, false).setUnlocalizedName("itemGrapePinotMeunier").setTextureName(Bandb_mod.MODID + ":fruit/grape/itemGrapePinotMeunier").setCreativeTab(BandbCreativeTabs.CreativeTabsFruit);
		    	itemGrapePinotNoir = new ItemFood(1, 1.0F, false).setUnlocalizedName("itemGrapePinotNoir").setTextureName(Bandb_mod.MODID + ":fruit/grape/itemGrapePinotNoir").setCreativeTab(BandbCreativeTabs.CreativeTabsFruit);

		    	GameRegistry.registerItem(itemGrapePetitVerdot, "itemGrapePetitVerdot");
		    	GameRegistry.registerItem(itemGrapePineauDAunis, "itemGrapePineauDAunis");
		    	GameRegistry.registerItem(itemGrapePinotBlanc, "itemGrapePinotBlanc");
		    	GameRegistry.registerItem(itemGrapePinotMeunier, "itemGrapePinotMeunier");
		    	GameRegistry.registerItem(itemGrapePinotNoir, "itemGrapePinotNoir");
		    
		    	itemGrapePiquepoul = new ItemFood(1, 1.0F, false).setUnlocalizedName("itemGrapePiquepoul").setTextureName(Bandb_mod.MODID + ":fruit/grape/itemGrapePiquepoul").setCreativeTab(BandbCreativeTabs.CreativeTabsFruit);
		    	itemGrapePoulsard = new ItemFood(1, 1.0F, false).setUnlocalizedName("itemGrapePoulsard").setTextureName(Bandb_mod.MODID + ":fruit/grape/itemGrapePoulsard").setCreativeTab(BandbCreativeTabs.CreativeTabsFruit);
		    	itemGrapeRiesling = new ItemFood(1, 1.0F, false).setUnlocalizedName("itemGrapeRiesling").setTextureName(Bandb_mod.MODID + ":fruit/grape/itemGrapeRiesling").setCreativeTab(BandbCreativeTabs.CreativeTabsFruit);
		    	itemGrapeRomorantin = new ItemFood(1, 1.0F, false).setUnlocalizedName("itemGrapeRomorantin").setTextureName(Bandb_mod.MODID + ":fruit/grape/itemGrapeRomorantin").setCreativeTab(BandbCreativeTabs.CreativeTabsFruit);
		    	itemGrapeRossulaBianca = new ItemFood(1, 1.0F, false).setUnlocalizedName("itemGrapeRossulaBianca").setTextureName(Bandb_mod.MODID + ":fruit/grape/itemGrapeRossulaBianca").setCreativeTab(BandbCreativeTabs.CreativeTabsFruit);

		    	GameRegistry.registerItem(itemGrapePiquepoul, "itemGrapePiquepoul");
		    	GameRegistry.registerItem(itemGrapePoulsard, "itemGrapePoulsard");
		    	GameRegistry.registerItem(itemGrapeRiesling, "itemGrapeRiesling");
		    	GameRegistry.registerItem(itemGrapeRomorantin, "itemGrapeRomorantin");
		    	GameRegistry.registerItem(itemGrapeRossulaBianca, "itemGrapeRossulaBianca");
		 
		    	itemGrapeSacy = new ItemFood(1, 1.0F, false).setUnlocalizedName("itemGrapeSacy").setTextureName(Bandb_mod.MODID + ":fruit/grape/itemGrapeSacy").setCreativeTab(BandbCreativeTabs.CreativeTabsFruit);
		    	itemGrapeSauvignon = new ItemFood(1, 1.0F, false).setUnlocalizedName("itemGrapeSauvignon").setTextureName(Bandb_mod.MODID + ":fruit/grape/itemGrapeSauvignon").setCreativeTab(BandbCreativeTabs.CreativeTabsFruit);
		    	itemGrapeSavagnin = new ItemFood(1, 1.0F, false).setUnlocalizedName("itemGrapeSavagnin").setTextureName(Bandb_mod.MODID + ":fruit/grape/itemGrapeSavagnin").setCreativeTab(BandbCreativeTabs.CreativeTabsFruit);
		    	itemGrapeSemillon = new ItemFood(1, 1.0F, false).setUnlocalizedName("itemGrapeSemillon").setTextureName(Bandb_mod.MODID + ":fruit/grape/itemGrapeSemillon").setCreativeTab(BandbCreativeTabs.CreativeTabsFruit);
		    	itemGrapeSylvaner = new ItemFood(1, 1.0F, false).setUnlocalizedName("itemGrapeSylvaner").setTextureName(Bandb_mod.MODID + ":fruit/grape/itemGrapeSylvaner").setCreativeTab(BandbCreativeTabs.CreativeTabsFruit);

		    	GameRegistry.registerItem(itemGrapeSacy, "itemGrapeSacy");
		    	GameRegistry.registerItem(itemGrapeSauvignon, "itemGrapeSauvignon");
		    	GameRegistry.registerItem(itemGrapeSavagnin, "itemGrapeSavagnin");
		    	GameRegistry.registerItem(itemGrapeSemillon, "itemGrapeSemillon");
		    	GameRegistry.registerItem(itemGrapeSylvaner, "itemGrapeSylvaner");
		    
		    	itemGrapeSyrah = new ItemFood(1, 1.0F, false).setUnlocalizedName("itemGrapeSyrah").setTextureName(Bandb_mod.MODID + ":fruit/grape/itemGrapeSyrah").setCreativeTab(BandbCreativeTabs.CreativeTabsFruit);
		    	itemGrapeTannat = new ItemFood(1, 1.0F, false).setUnlocalizedName("itemGrapeTannat").setTextureName(Bandb_mod.MODID + ":fruit/grape/itemGrapeTannat").setCreativeTab(BandbCreativeTabs.CreativeTabsFruit);
		    	itemGrapeTeoulier = new ItemFood(1, 1.0F, false).setUnlocalizedName("itemGrapeTeoulier").setTextureName(Bandb_mod.MODID + ":fruit/grape/itemGrapeTeoulier").setCreativeTab(BandbCreativeTabs.CreativeTabsFruit);
		    	itemGrapeTerretNoir = new ItemFood(1, 1.0F, false).setUnlocalizedName("itemGrapeTerretNoir").setTextureName(Bandb_mod.MODID + ":fruit/grape/itemGrapeTerretNoir").setCreativeTab(BandbCreativeTabs.CreativeTabsFruit);
		    	itemGrapeTibouren = new ItemFood(1, 1.0F, false).setUnlocalizedName("itemGrapeTibouren").setTextureName(Bandb_mod.MODID + ":fruit/grape/itemGrapeTibouren").setCreativeTab(BandbCreativeTabs.CreativeTabsFruit);

		    	GameRegistry.registerItem(itemGrapeSyrah, "itemGrapeSyrah");
		    	GameRegistry.registerItem(itemGrapeTannat, "itemGrapeTannat");
		    	GameRegistry.registerItem(itemGrapeTeoulier, "itemGrapeTeoulier");
		    	GameRegistry.registerItem(itemGrapeTerretNoir, "itemGrapeTerretNoir");
		    	GameRegistry.registerItem(itemGrapeTibouren, "itemGrapeTibouren");
		    
		    	itemGrapeTressalier = new ItemFood(1, 1.0F, false).setUnlocalizedName("itemGrapeTressalier").setTextureName(Bandb_mod.MODID + ":fruit/grape/itemGrapeTressalier").setCreativeTab(BandbCreativeTabs.CreativeTabsFruit);
		    	itemGrapeUgniBlanc = new ItemFood(1, 1.0F, false).setUnlocalizedName("itemGrapeUgniBlanc").setTextureName(Bandb_mod.MODID + ":fruit/grape/itemGrapeUgniBlanc").setCreativeTab(BandbCreativeTabs.CreativeTabsFruit);
		    	itemGrapeVaccarese = new ItemFood(1, 1.0F, false).setUnlocalizedName("itemGrapeVaccarese").setTextureName(Bandb_mod.MODID + ":fruit/grape/itemGrapeVaccarese").setCreativeTab(BandbCreativeTabs.CreativeTabsFruit);
		    	itemGrapeVermentinu = new ItemFood(1, 1.0F, false).setUnlocalizedName("itemGrapeVermentinu").setTextureName(Bandb_mod.MODID + ":fruit/grape/itemGrapeVermentinu").setCreativeTab(BandbCreativeTabs.CreativeTabsFruit);
		    	itemGrapeViognier = new ItemFood(1, 1.0F, false).setUnlocalizedName("itemGrapeViognier").setTextureName(Bandb_mod.MODID + ":fruit/grape/itemGrapeViognier").setCreativeTab(BandbCreativeTabs.CreativeTabsFruit);

		    	GameRegistry.registerItem(itemGrapeTressalier, "itemGrapeTressalier");
		    	GameRegistry.registerItem(itemGrapeUgniBlanc, "itemGrapeUgniBlanc");
		    	GameRegistry.registerItem(itemGrapeVaccarese, "itemGrapeVaccarese");
		    	GameRegistry.registerItem(itemGrapeVermentinu, "itemGrapeVermentinu");
		    	GameRegistry.registerItem(itemGrapeViognier, "itemGrapeViognier");
		    
		    	
			}
		}
		
		public static void loaderVegetable(boolean bool){
			if(bool){
		 //items vegetables,
		    	itemAsparagus = new ItemFood(2, 1.0F, false).setUnlocalizedName("itemAsparagus").setTextureName(Bandb_mod.MODID + ":vegetables/itemAsparagus").setCreativeTab(BandbCreativeTabs.CreativeTabsVegetable);
		    	itemBeet = new ItemFood(2, 1.0F, false).setUnlocalizedName("itemBeet").setTextureName(Bandb_mod.MODID + ":vegetables/itemBeet").setCreativeTab(BandbCreativeTabs.CreativeTabsVegetable);
		    	itemBroccoli = new ItemFood(2, 1.0F, false).setUnlocalizedName("itemBroccoli").setTextureName(Bandb_mod.MODID + ":vegetables/itemBroccoli").setCreativeTab(BandbCreativeTabs.CreativeTabsVegetable);
		    	itemBrusselsSprout = new Item().setUnlocalizedName("itemBrusselsSprout").setTextureName(Bandb_mod.MODID + ":vegetables/itemBrusselsSprout").setCreativeTab(BandbCreativeTabs.CreativeTabsVegetable);
		    	itemCarrotTouchon = new ItemFood(2, 1.0F, false).setUnlocalizedName("itemCarrotTouchon").setTextureName(Bandb_mod.MODID + ":vegetables/itemCarrotTouchon").setCreativeTab(BandbCreativeTabs.CreativeTabsVegetable);
			    
		    	itemCabbage = new Item().setUnlocalizedName("itemCabbage").setTextureName(Bandb_mod.MODID + ":vegetables/itemCabbage").setCreativeTab(BandbCreativeTabs.CreativeTabsVegetable);
		    	itemCashew = new ItemFood(2, 1.0F, false).setUnlocalizedName("itemCashew").setTextureName(Bandb_mod.MODID + ":vegetables/itemCashew").setCreativeTab(BandbCreativeTabs.CreativeTabsVegetable);
		    	itemCauliflower = new ItemFood(2, 1.0F, false).setUnlocalizedName("itemCauliflower").setTextureName(Bandb_mod.MODID + ":vegetables/itemCauliflower").setCreativeTab(BandbCreativeTabs.CreativeTabsVegetable);
		    	itemCelery = new ItemFood(2, 1.0F, false).setUnlocalizedName("itemCelery").setTextureName(Bandb_mod.MODID + ":vegetables/itemCelery").setCreativeTab(BandbCreativeTabs.CreativeTabsVegetable);
		    	itemCucumber = new ItemFood(2, 1.0F, false).setUnlocalizedName("itemCucumber").setTextureName(Bandb_mod.MODID + ":vegetables/itemCucumber").setCreativeTab(BandbCreativeTabs.CreativeTabsVegetable);
			    
		    	GameRegistry.registerItem(itemAsparagus, "itemAsparagus");
		    	GameRegistry.registerItem(itemBeet, "itemBeet");
		    	GameRegistry.registerItem(itemBroccoli, "itemBroccoli");
		    	GameRegistry.registerItem(itemBrusselsSprout, "itemBrusselsSprout");
		    	GameRegistry.registerItem(itemCarrotTouchon, "itemCarrotTouchon");		    	

		    	GameRegistry.registerItem(itemCabbage, "item_Cabbage");
		    	GameRegistry.registerItem(itemCashew, "item_Cashew");
		    	GameRegistry.registerItem(itemCauliflower, "item_Cauliflower");
		    	GameRegistry.registerItem(itemCelery, "item_Celery");
		    	GameRegistry.registerItem(itemCucumber, "item_Cucumber");

		    	itemEggplant = new Item().setUnlocalizedName("itemEggplant").setTextureName(Bandb_mod.MODID + ":vegetables/itemEggplant").setCreativeTab(BandbCreativeTabs.CreativeTabsVegetable);
		    	itemGarlic = new Item().setUnlocalizedName("itemGarlic").setTextureName(Bandb_mod.MODID + ":vegetables/itemGarlic").setCreativeTab(BandbCreativeTabs.CreativeTabsVegetable);
		    	itemParsnip = new Item().setUnlocalizedName("itemParsnip").setTextureName(Bandb_mod.MODID + ":vegetables/itemParsnip").setCreativeTab(BandbCreativeTabs.CreativeTabsVegetable);
		    	itemPeanut = new ItemFood(2, 1.0F, false).setUnlocalizedName("itemPeanut").setTextureName(Bandb_mod.MODID + ":vegetables/itemPeanut").setCreativeTab(BandbCreativeTabs.CreativeTabsVegetable);
		    	itemPistachio = new ItemFood(2, 1.0F, false).setUnlocalizedName("itemPistachio").setTextureName(Bandb_mod.MODID + ":vegetables/itemPistachio").setCreativeTab(BandbCreativeTabs.CreativeTabsVegetable);
			    
		    	itemRedCabbage = new Item().setUnlocalizedName("itemRedCabbage").setTextureName(Bandb_mod.MODID + ":vegetables/itemRedCabbage").setCreativeTab(BandbCreativeTabs.CreativeTabsVegetable);
		    	itemTomato = new ItemFood(2, 1.0F, false).setUnlocalizedName("itemTomato").setTextureName(Bandb_mod.MODID + ":vegetables/itemTomato").setCreativeTab(BandbCreativeTabs.CreativeTabsVegetable);
		    	itemZucchini = new ItemFood(2, 1.0F, false).setUnlocalizedName("itemZucchini").setTextureName(Bandb_mod.MODID + ":vegetables/itemZucchini").setCreativeTab(BandbCreativeTabs.CreativeTabsVegetable);
		    	itemShallots = new Item().setUnlocalizedName("itemShallots").setTextureName(Bandb_mod.MODID + ":vegetables/itemShallots").setCreativeTab(BandbCreativeTabs.CreativeTabsVegetable);
		    	itemSpinach = new Item().setUnlocalizedName("itemSpinach").setTextureName(Bandb_mod.MODID + ":vegetables/itemSpinach").setCreativeTab(BandbCreativeTabs.CreativeTabsVegetable);
		    	
		    	GameRegistry.registerItem(itemEggplant, "itemEggplant");
		    	GameRegistry.registerItem(itemGarlic, "itemGarlic");
		    	GameRegistry.registerItem(itemParsnip, "itemParsnip");
		    	GameRegistry.registerItem(itemPeanut, "itemPeanut");
		    	GameRegistry.registerItem(itemPistachio, "itemPistachio");

		    	GameRegistry.registerItem(itemRedCabbage, "itemRedCabbage");
		    	GameRegistry.registerItem(itemTomato, "itemTomato");
		    	GameRegistry.registerItem(itemZucchini, "itemZucchini");
		    	GameRegistry.registerItem(itemShallots, "itemShallots");
		    	GameRegistry.registerItem(itemSpinach, "itemSpinach");
		    	
				itemGinger = new ItemFood(2, 1.0F, false).setUnlocalizedName("itemGinger").setTextureName(Bandb_mod.MODID + ":vegetables/itemGinger").setCreativeTab(BandbCreativeTabs.CreativeTabsVegetable);
				itemFrenchBeans = new ItemFood(2, 1.0F, false).setUnlocalizedName("itemFrenchBeans").setTextureName(Bandb_mod.MODID + ":vegetables/itemFrenchBeans").setCreativeTab(BandbCreativeTabs.CreativeTabsVegetable);
				itemLens = new ItemFood(2, 1.0F, false).setUnlocalizedName("itemLens").setTextureName(Bandb_mod.MODID + ":vegetables/itemLens").setCreativeTab(BandbCreativeTabs.CreativeTabsVegetable);
				itemTurnip = new Item().setUnlocalizedName("itemTurnip").setTextureName(Bandb_mod.MODID + ":vegetables/itemTurnip").setCreativeTab(BandbCreativeTabs.CreativeTabsVegetable);
				itemOnion = new ItemFood(2, 1.0F, false).setUnlocalizedName("itemOnion").setTextureName(Bandb_mod.MODID + ":vegetables/itemOnion").setCreativeTab(BandbCreativeTabs.CreativeTabsVegetable);
		    	
		    	itemParsley = new Item().setUnlocalizedName("itemParsley").setTextureName(Bandb_mod.MODID + ":vegetables/itemParsley").setCreativeTab(BandbCreativeTabs.CreativeTabsVegetable);
		    	itemChili = new ItemChili(2, 1.0F, false).setUnlocalizedName("itemChili").setTextureName(Bandb_mod.MODID + ":vegetables/itemChili").setCreativeTab(BandbCreativeTabs.CreativeTabsVegetable);
		    	itemLeek = new Item().setUnlocalizedName("itemLeek").setTextureName(Bandb_mod.MODID + ":vegetables/itemLeek").setCreativeTab(BandbCreativeTabs.CreativeTabsVegetable);
		    	itemSweetRedPepper = new ItemFood(2, 1.0F, false).setUnlocalizedName("itemSweetRedPepper").setTextureName(Bandb_mod.MODID + ":vegetables/itemSweetRedPepper").setCreativeTab(BandbCreativeTabs.CreativeTabsVegetable);
		    	itemSweetGreenPepper = new ItemFood(2, 1.0F, false).setUnlocalizedName("itemSweetGreenPepper").setTextureName(Bandb_mod.MODID + ":vegetables/itemSweetGreenPepper").setCreativeTab(BandbCreativeTabs.CreativeTabsVegetable);
		    	
		    	GameRegistry.registerItem(itemGinger, "itemGinger");
		    	GameRegistry.registerItem(itemFrenchBeans, "itemFrenchBeans");
		    	GameRegistry.registerItem(itemLens, "itemLens");
		    	GameRegistry.registerItem(itemTurnip, "itemTurnip");
		    	GameRegistry.registerItem(itemOnion, "itemOnion");
		    	
		    	GameRegistry.registerItem(itemParsley, "itemParsley");
		    	GameRegistry.registerItem(itemChili, "itemChili");
		    	GameRegistry.registerItem(itemLeek, "itemLeek");
		    	GameRegistry.registerItem(itemSweetRedPepper, "itemSweetRedPepper");
		    	GameRegistry.registerItem(itemSweetGreenPepper, "itemSweetGreenPepper");
	    	
				itemRadish = new ItemFood(2, 1.0F, false).setUnlocalizedName("itemRadish").setTextureName(Bandb_mod.MODID + ":vegetables/itemRadish").setCreativeTab(BandbCreativeTabs.CreativeTabsVegetable);
				itemRutabaga = new Item().setUnlocalizedName("itemRutabaga").setTextureName(Bandb_mod.MODID + ":vegetables/itemRutabaga").setCreativeTab(BandbCreativeTabs.CreativeTabsVegetable);
				itemSalat = new ItemFood(2, 1.0F, false).setUnlocalizedName("itemSalat").setTextureName(Bandb_mod.MODID + ":vegetables/itemSalat").setCreativeTab(BandbCreativeTabs.CreativeTabsVegetable);  	
			    itemAvocado = new ItemFood(2, 1.0F, false).setUnlocalizedName("itemAvocado").setTextureName(Bandb_mod.MODID + ":vegetables/itemAvocado").setCreativeTab(BandbCreativeTabs.CreativeTabsVegetable);
			    itemOlive = new Item().setUnlocalizedName("itemOlive").setTextureName(Bandb_mod.MODID + ":fruit/itemOlive").setCreativeTab(BandbCreativeTabs.CreativeTabsVegetable);

			    itemChicory = new ItemFood(2, 1.0F, false).setUnlocalizedName("itemChicory").setTextureName(Bandb_mod.MODID + ":vegetables/itemChicory").setCreativeTab(BandbCreativeTabs.CreativeTabsVegetable);
				itemFlageolet = new ItemFood(1, 1.0F, false).setUnlocalizedName("itemFlageolet").setTextureName(Bandb_mod.MODID + ":vegetables/itemFlageolet").setCreativeTab(BandbCreativeTabs.CreativeTabsVegetable);
				itemPea = new ItemFood(1, 1.0F, false).setUnlocalizedName("itemPea").setTextureName(Bandb_mod.MODID + ":vegetables/itemPea").setCreativeTab(BandbCreativeTabs.CreativeTabsVegetable);  	
				itemChickpea = new ItemFood(1, 1.0F, false).setUnlocalizedName("itemChickpea").setTextureName(Bandb_mod.MODID + ":vegetables/itemChickpea").setCreativeTab(BandbCreativeTabs.CreativeTabsVegetable);
				itemSweetYellowPepper = new ItemFood(2, 1.0F, false).setUnlocalizedName("itemSweetYellowPepper").setTextureName(Bandb_mod.MODID + ":vegetables/itemSweetYellowPepper").setCreativeTab(BandbCreativeTabs.CreativeTabsVegetable);

				GameRegistry.registerItem(itemAvocado, "itemAvocado");
			    GameRegistry.registerItem(itemOlive, "itemOlive");		
		    	GameRegistry.registerItem(itemRadish, "itemRadish");
		    	GameRegistry.registerItem(itemRutabaga, "itemRutabaga");
		    	GameRegistry.registerItem(itemSalat, "itemSalat");
		    	
		    	GameRegistry.registerItem(itemChicory, "itemChicory");
			    GameRegistry.registerItem(itemFlageolet, "itemFlageolet");		
		    	GameRegistry.registerItem(itemPea, "itemPea");
		    	GameRegistry.registerItem(itemChickpea, "itemChickpea");
		    	GameRegistry.registerItem(itemSweetYellowPepper, "itemSweetYellowPepper");
		    	
		    	itemGherkin = new ItemFood(1, 1.0F, false).setUnlocalizedName("itemGherkin").setTextureName(Bandb_mod.MODID + ":vegetables/itemGherkin").setCreativeTab(BandbCreativeTabs.CreativeTabsVegetable);
		    	itemBasil = new ItemFood(1, 1.0F, false).setUnlocalizedName("itemBasil").setTextureName(Bandb_mod.MODID + ":vegetables/itemBasil").setCreativeTab(BandbCreativeTabs.CreativeTabsVegetable);
		    	itemCardamom = new ItemFood(1, 1.0F, false).setUnlocalizedName("itemCardamom").setTextureName(Bandb_mod.MODID + ":vegetables/itemCardamom").setCreativeTab(BandbCreativeTabs.CreativeTabsVegetable);
		    	itemCherryTomato = new ItemFood(1, 1.0F, false).setUnlocalizedName("itemCherryTomato").setTextureName(Bandb_mod.MODID + ":vegetables/itemCherryTomato").setCreativeTab(BandbCreativeTabs.CreativeTabsVegetable);

		    	GameRegistry.registerItem(itemGherkin, "itemGherkin");
		    	GameRegistry.registerItem(itemBasil, "itemBasil");
		    	GameRegistry.registerItem(itemCardamom, "itemCardamom");
		    	GameRegistry.registerItem(itemCherryTomato, "itemCherryTomato");
		    	
		    	//grains
				itemBuckwheat = new Item().setUnlocalizedName("itemBuckwheat").setTextureName(Bandb_mod.MODID + ":ingredients/grains/itemBuckwheat").setCreativeTab(BandbCreativeTabs.CreativeTabsIngredient);
		    	itemHemp = new Item().setUnlocalizedName("itemHemp").setTextureName(Bandb_mod.MODID + ":ingredients/grains/itemHemp").setCreativeTab(BandbCreativeTabs.CreativeTabsIngredient);
		    	itemSpelt = new Item().setUnlocalizedName("itemSpelt").setTextureName(Bandb_mod.MODID + ":ingredients/grains/itemSpelt").setCreativeTab(BandbCreativeTabs.CreativeTabsIngredient);
		    	itemFonio = new Item().setUnlocalizedName("itemFonio").setTextureName(Bandb_mod.MODID + ":ingredients/grains/itemFonio").setCreativeTab(BandbCreativeTabs.CreativeTabsIngredient);
		    	itemHop = new Item().setUnlocalizedName("itemHop").setTextureName(Bandb_mod.MODID + ":ingredients/grains/itemHop").setCreativeTab(BandbCreativeTabs.CreativeTabsIngredient);

		    	itemOats = new Item().setUnlocalizedName("itemOats").setTextureName(Bandb_mod.MODID + ":ingredients/grains/itemOats").setCreativeTab(BandbCreativeTabs.CreativeTabsIngredient);
		    	itemMalt = new Item().setUnlocalizedName("itemMalt").setTextureName(Bandb_mod.MODID + ":ingredients/grains/itemMalt").setCreativeTab(BandbCreativeTabs.CreativeTabsIngredient);
		    	itemMillet = new Item().setUnlocalizedName("itemMillet").setTextureName(Bandb_mod.MODID + ":ingredients/grains/itemMillet").setCreativeTab(BandbCreativeTabs.CreativeTabsIngredient);
		    	itemRye = new Item().setUnlocalizedName("itemRye").setTextureName(Bandb_mod.MODID + ":ingredients/grains/itemRye").setCreativeTab(BandbCreativeTabs.CreativeTabsIngredient);
		    	itemSorghum = new Item().setUnlocalizedName("itemSorghum").setTextureName(Bandb_mod.MODID + ":ingredients/grains/itemSorghum").setCreativeTab(BandbCreativeTabs.CreativeTabsIngredient);
		
				GameRegistry.registerItem(itemBuckwheat, "itemBuckwheat");
				GameRegistry.registerItem(itemHemp, "itemHemp");
				GameRegistry.registerItem(itemSpelt, "itemSpelt");
				GameRegistry.registerItem(itemFonio, "itemFonio");
				GameRegistry.registerItem(itemHop, "itemHop");

				GameRegistry.registerItem(itemOats, "itemOats");
				GameRegistry.registerItem(itemMalt, "itemMalt");
				GameRegistry.registerItem(itemMillet, "itemMillet");
				GameRegistry.registerItem(itemRye, "itemRye");
				GameRegistry.registerItem(itemSorghum, "itemSorghum");
				
				itemCorn = new Item().setUnlocalizedName("itemCorn").setTextureName(Bandb_mod.MODID + ":ingredients/grains/itemCorn").setCreativeTab(BandbCreativeTabs.CreativeTabsIngredient);
				itemBarley = new Item().setUnlocalizedName("itemBarley").setTextureName(Bandb_mod.MODID + ":ingredients/grains/itemBarley").setCreativeTab(BandbCreativeTabs.CreativeTabsIngredient);
				itemRice = new Item().setUnlocalizedName("itemRice").setTextureName(Bandb_mod.MODID + ":ingredients/grains/itemRice").setCreativeTab(BandbCreativeTabs.CreativeTabsIngredient);
				itemSesameSeed = new Item().setUnlocalizedName("itemSesameSeed").setTextureName(Bandb_mod.MODID + ":ingredients/grains/itemSesameSeed").setCreativeTab(BandbCreativeTabs.CreativeTabsIngredient);

				GameRegistry.registerItem(itemCorn, "itemCorn");
				GameRegistry.registerItem(itemBarley, "itemBarley");
				GameRegistry.registerItem(itemRice, "itemRice");
				GameRegistry.registerItem(itemSesameSeed, "itemSesameSeed");

				//plants
				itemMustard = new Item().setUnlocalizedName("itemMustard").setTextureName(Bandb_mod.MODID + ":ingredients/plants/itemMustard").setCreativeTab(BandbCreativeTabs.CreativeTabsPlant);
				itemMint = new Item().setUnlocalizedName("itemMint").setTextureName(Bandb_mod.MODID + ":ingredients/plants/itemMint").setCreativeTab(BandbCreativeTabs.CreativeTabsPlant);
				itemCotton = new Item().setUnlocalizedName("itemCotton").setTextureName(Bandb_mod.MODID + ":ingredients/plants/itemCotton").setCreativeTab(BandbCreativeTabs.CreativeTabsPlant);
				itemBetterCactus = new Item().setUnlocalizedName("itemBetterCactus").setTextureName(Bandb_mod.MODID + ":ingredients/plants/itemBetterCactus").setCreativeTab(BandbCreativeTabs.CreativeTabsPlant);
				itemRape = new Item().setUnlocalizedName("itemRape").setTextureName(Bandb_mod.MODID + ":ingredients/plants/itemRape").setCreativeTab(BandbCreativeTabs.CreativeTabsPlant);
				
				GameRegistry.registerItem(itemMustard, "itemMustard");
				GameRegistry.registerItem(itemMint, "itemMint");
				GameRegistry.registerItem(itemCotton, "itemCotton");
				GameRegistry.registerItem(itemBetterCactus, "itemBetterCactus");
				GameRegistry.registerItem(itemRape, "itemRape");
				
				itemSesame = new Item().setUnlocalizedName("itemSesame").setTextureName(Bandb_mod.MODID + ":ingredients/plants/itemSesame").setCreativeTab(BandbCreativeTabs.CreativeTabsPlant);
				itemOrchid = new Item().setUnlocalizedName("itemOrchid").setTextureName(Bandb_mod.MODID + ":ingredients/plants/itemOrchid").setCreativeTab(BandbCreativeTabs.CreativeTabsPlant);
				itemLicorice = new Item().setUnlocalizedName("itemLicorice").setTextureName(Bandb_mod.MODID + ":ingredients/plants/itemLicorice").setCreativeTab(BandbCreativeTabs.CreativeTabsPlant);
				itemDaisy = new Item().setUnlocalizedName("itemDaisy").setTextureName(Bandb_mod.MODID + ":ingredients/plants/itemDaisy").setCreativeTab(BandbCreativeTabs.CreativeTabsPlant);
				itemHibiscus = new Item().setUnlocalizedName("itemHibiscus").setTextureName(Bandb_mod.MODID + ":ingredients/plants/itemHibiscus").setCreativeTab(BandbCreativeTabs.CreativeTabsPlant);
				
				GameRegistry.registerItem(itemSesame, "itemSesame");
				GameRegistry.registerItem(itemOrchid, "itemOrchid");
				GameRegistry.registerItem(itemLicorice, "itemLicorice");
				GameRegistry.registerItem(itemDaisy, "itemDaisy");
				GameRegistry.registerItem(itemHibiscus, "itemHibiscus");
				
				itemJasmine = new Item().setUnlocalizedName("itemJasmine").setTextureName(Bandb_mod.MODID + ":ingredients/plants/itemJasmine").setCreativeTab(BandbCreativeTabs.CreativeTabsPlant);
				itemLavender = new Item().setUnlocalizedName("itemLavender").setTextureName(Bandb_mod.MODID + ":ingredients/plants/itemLavender").setCreativeTab(BandbCreativeTabs.CreativeTabsPlant);
				itemRosmary = new Item().setUnlocalizedName("itemRosmary").setTextureName(Bandb_mod.MODID + ":ingredients/plants/itemRosmary").setCreativeTab(BandbCreativeTabs.CreativeTabsPlant);
				itemTarragon = new Item().setUnlocalizedName("itemTarragon").setTextureName(Bandb_mod.MODID + ":ingredients/plants/itemTarragon").setCreativeTab(BandbCreativeTabs.CreativeTabsPlant);
				itemAgave = new Item().setUnlocalizedName("itemAgave").setTextureName(Bandb_mod.MODID + ":ingredients/plants/itemAgave").setCreativeTab(BandbCreativeTabs.CreativeTabsPlant);
				
				GameRegistry.registerItem(itemJasmine, "itemJasmine");
				GameRegistry.registerItem(itemLavender, "itemLavender");
				GameRegistry.registerItem(itemRosmary, "itemRosmary");
				GameRegistry.registerItem(itemTarragon, "itemTarragon");
				GameRegistry.registerItem(itemAgave, "itemAgave");
				
				itemAmaryllisPink = new Item().setUnlocalizedName("itemAmaryllisPink").setTextureName(Bandb_mod.MODID + ":ingredients/plants/itemAmaryllisPink").setCreativeTab(BandbCreativeTabs.CreativeTabsPlant);
				itemAmaryllisRed = new Item().setUnlocalizedName("itemAmaryllisRed").setTextureName(Bandb_mod.MODID + ":ingredients/plants/itemAmaryllisRed").setCreativeTab(BandbCreativeTabs.CreativeTabsPlant);
				itemAmaryllisWhite = new Item().setUnlocalizedName("itemAmaryllisWhite").setTextureName(Bandb_mod.MODID + ":ingredients/plants/itemAmaryllisWhite").setCreativeTab(BandbCreativeTabs.CreativeTabsPlant);
				itemBachelorsButtonBlue = new Item().setUnlocalizedName("itemBachelorsButtonBlue").setTextureName(Bandb_mod.MODID + ":ingredients/plants/itemBachelorsButtonBlue").setCreativeTab(BandbCreativeTabs.CreativeTabsPlant);
				itemBelladonna = new Item().setUnlocalizedName("itemBelladonna").setTextureName(Bandb_mod.MODID + ":ingredients/plants/itemBelladonna").setCreativeTab(BandbCreativeTabs.CreativeTabsPlant);
								
				GameRegistry.registerItem(itemAmaryllisPink, "itemAmaryllisPink");
				GameRegistry.registerItem(itemAmaryllisRed, "itemAmaryllisRed");
				GameRegistry.registerItem(itemAmaryllisWhite, "itemAmaryllisWhite");
				GameRegistry.registerItem(itemBachelorsButtonBlue, "itemBachelorsButtonBlue");
				GameRegistry.registerItem(itemBelladonna, "itemBelladonna");

				itemBlowball = new Item().setUnlocalizedName("itemBlowball").setTextureName(Bandb_mod.MODID + ":ingredients/plants/itemBlowball").setCreativeTab(BandbCreativeTabs.CreativeTabsPlant);
				itemButtercup = new Item().setUnlocalizedName("itemButtercup").setTextureName(Bandb_mod.MODID + ":ingredients/plants/itemButtercup").setCreativeTab(BandbCreativeTabs.CreativeTabsPlant);
				itemCallaBlack = new Item().setUnlocalizedName("itemCallaBlack").setTextureName(Bandb_mod.MODID + ":ingredients/plants/itemCallaBlack").setCreativeTab(BandbCreativeTabs.CreativeTabsPlant);
				itemCallaWhite = new Item().setUnlocalizedName("itemCallaWhite").setTextureName(Bandb_mod.MODID + ":ingredients/plants/itemCallaWhite").setCreativeTab(BandbCreativeTabs.CreativeTabsPlant);
				itemCannabis = new Item().setUnlocalizedName("itemCannabis").setTextureName(Bandb_mod.MODID + ":ingredients/plants/itemCannabis").setCreativeTab(BandbCreativeTabs.CreativeTabsPlant);
								
				GameRegistry.registerItem(itemBlowball, "itemBlowball");
				GameRegistry.registerItem(itemButtercup, "itemButtercup");
				GameRegistry.registerItem(itemCallaBlack, "itemCallaBlack");
				GameRegistry.registerItem(itemCallaWhite, "itemCallaWhite");
				GameRegistry.registerItem(itemCannabis, "itemCannabis");

				itemChrysantheme = new Item().setUnlocalizedName("itemChrysantheme").setTextureName(Bandb_mod.MODID + ":ingredients/plants/itemChrysantheme").setCreativeTab(BandbCreativeTabs.CreativeTabsPlant);
				itemEnzian = new Item().setUnlocalizedName("itemEnzian").setTextureName(Bandb_mod.MODID + ":ingredients/plants/itemEnzian").setCreativeTab(BandbCreativeTabs.CreativeTabsPlant);
				itemFoxglove = new Item().setUnlocalizedName("itemFoxglove").setTextureName(Bandb_mod.MODID + ":ingredients/plants/itemFoxglove").setCreativeTab(BandbCreativeTabs.CreativeTabsPlant);
				itemHeather = new Item().setUnlocalizedName("itemHeather").setTextureName(Bandb_mod.MODID + ":ingredients/plants/itemHeather").setCreativeTab(BandbCreativeTabs.CreativeTabsPlant);
				itemIrisBlue = new Item().setUnlocalizedName("itemIrisBlue").setTextureName(Bandb_mod.MODID + ":ingredients/plants/itemIrisBlue").setCreativeTab(BandbCreativeTabs.CreativeTabsPlant);
								
				GameRegistry.registerItem(itemChrysantheme, "itemChrysantheme");
				GameRegistry.registerItem(itemEnzian, "itemEnzian");
				GameRegistry.registerItem(itemFoxglove, "itemFoxglove");
				GameRegistry.registerItem(itemHeather, "itemHeather");
				GameRegistry.registerItem(itemIrisBlue, "itemIrisBlue");
				
				itemIrisPurple = new Item().setUnlocalizedName("itemIrisPurple").setTextureName(Bandb_mod.MODID + ":ingredients/plants/itemIrisPurple").setCreativeTab(BandbCreativeTabs.CreativeTabsPlant);
				itemLeafCoca = new Item().setUnlocalizedName("itemLeafCoca").setTextureName(Bandb_mod.MODID + ":ingredients/plants/itemLeafCoca").setCreativeTab(BandbCreativeTabs.CreativeTabsPlant);
				itemLily = new Item().setUnlocalizedName("itemLily").setTextureName(Bandb_mod.MODID + ":ingredients/plants/itemLily").setCreativeTab(BandbCreativeTabs.CreativeTabsPlant);
				itemMarshMarigold = new Item().setUnlocalizedName("itemMarshMarigold").setTextureName(Bandb_mod.MODID + ":ingredients/plants/itemMarshMarigold").setCreativeTab(BandbCreativeTabs.CreativeTabsPlant);
				itemPansy = new Item().setUnlocalizedName("itemPansy").setTextureName(Bandb_mod.MODID + ":ingredients/plants/itemPansy").setCreativeTab(BandbCreativeTabs.CreativeTabsPlant);
								
				GameRegistry.registerItem(itemIrisPurple, "itemIrisPurple");
				GameRegistry.registerItem(itemLeafCoca, "itemLeafCoca");
				GameRegistry.registerItem(itemLily, "itemLily");
				GameRegistry.registerItem(itemMarshMarigold, "itemMarshMarigold");
				GameRegistry.registerItem(itemPansy, "itemPansy");

				itemPeony = new Item().setUnlocalizedName("itemPeony").setTextureName(Bandb_mod.MODID + ":ingredients/plants/itemPeony").setCreativeTab(BandbCreativeTabs.CreativeTabsPlant);
				itemSyringa = new Item().setUnlocalizedName("itemSyringa").setTextureName(Bandb_mod.MODID + ":ingredients/plants/itemSyringa").setCreativeTab(BandbCreativeTabs.CreativeTabsPlant);
				itemTobacco = new Item().setUnlocalizedName("itemTobacco").setTextureName(Bandb_mod.MODID + ":ingredients/plants/itemTobacco").setCreativeTab(BandbCreativeTabs.CreativeTabsPlant);
				itemViolet = new Item().setUnlocalizedName("itemViolet").setTextureName(Bandb_mod.MODID + ":ingredients/plants/itemViolet").setCreativeTab(BandbCreativeTabs.CreativeTabsPlant);
				itemLemonGrass = new Item().setUnlocalizedName("itemLemonGrass").setTextureName(Bandb_mod.MODID + ":ingredients/plants/itemLemonGrass").setCreativeTab(BandbCreativeTabs.CreativeTabsPlant);
							
				GameRegistry.registerItem(itemPeony, "itemPeony");
				GameRegistry.registerItem(itemSyringa, "itemSyringa");
				GameRegistry.registerItem(itemTobacco, "itemTobacco");
				GameRegistry.registerItem(itemViolet, "itemViolet");
				GameRegistry.registerItem(itemLemonGrass, "itemLemonGrass");
				
				itemPeyote = new Item().setUnlocalizedName("itemPeyote").setTextureName(Bandb_mod.MODID + ":ingredients/plants/itemPeyote").setCreativeTab(BandbCreativeTabs.CreativeTabsPlant);
				itemBluebell = new Item().setUnlocalizedName("itemBluebell").setTextureName(Bandb_mod.MODID + ":ingredients/plants/itemBluebell").setCreativeTab(BandbCreativeTabs.CreativeTabsPlant);
				itemNettle = new Item().setUnlocalizedName("itemNettle").setTextureName(Bandb_mod.MODID + ":ingredients/plants/itemNettle").setCreativeTab(BandbCreativeTabs.CreativeTabsPlant);
				itemGardenia = new Item().setUnlocalizedName("itemGardenia").setTextureName(Bandb_mod.MODID + ":ingredients/plants/itemGardenia").setCreativeTab(BandbCreativeTabs.CreativeTabsPlant);
				itemDill = new Item().setUnlocalizedName("itemDill").setTextureName(Bandb_mod.MODID + ":ingredients/plants/itemDill").setCreativeTab(BandbCreativeTabs.CreativeTabsPlant);
				itemThistle = new Item().setUnlocalizedName("itemThistle").setTextureName(Bandb_mod.MODID + ":ingredients/plants/itemThistle").setCreativeTab(BandbCreativeTabs.CreativeTabsPlant);
				
				GameRegistry.registerItem(itemPeyote, "itemPeyote");
				GameRegistry.registerItem(itemBluebell, "itemBluebell");
				GameRegistry.registerItem(itemNettle, "itemNettle");
				GameRegistry.registerItem(itemGardenia, "itemGardenia");
				GameRegistry.registerItem(itemDill, "itemDill");
				GameRegistry.registerItem(itemThistle, "itemThistle");
				
				itemWormwood = new Item().setUnlocalizedName("itemWormwood").setTextureName(Bandb_mod.MODID + ":ingredients/plants/itemWormwood").setCreativeTab(BandbCreativeTabs.CreativeTabsPlant);
				itemCinchona = new Item().setUnlocalizedName("itemCinchona").setTextureName(Bandb_mod.MODID + ":ingredients/plants/itemCinchona").setCreativeTab(BandbCreativeTabs.CreativeTabsPlant);
				itemChives = new Item().setUnlocalizedName("itemChives").setTextureName(Bandb_mod.MODID + ":ingredients/plants/itemChives").setCreativeTab(BandbCreativeTabs.CreativeTabsPlant);
				itemChervil = new Item().setUnlocalizedName("itemChervil").setTextureName(Bandb_mod.MODID + ":ingredients/plants/itemChervil").setCreativeTab(BandbCreativeTabs.CreativeTabsPlant);
				itemWatercress = new Item().setUnlocalizedName("itemWatercress").setTextureName(Bandb_mod.MODID + ":ingredients/plants/itemWatercress").setCreativeTab(BandbCreativeTabs.CreativeTabsPlant);
				
				GameRegistry.registerItem(itemWormwood, "itemWormwood");
				GameRegistry.registerItem(itemCinchona, "itemCinchona");
				GameRegistry.registerItem(itemChives, "itemChives");
				GameRegistry.registerItem(itemChervil, "itemChervil");
				GameRegistry.registerItem(itemWatercress, "itemWatercress");
				
				itemThyme = new Item().setUnlocalizedName("itemThyme").setTextureName(Bandb_mod.MODID + ":ingredients/plants/itemThyme").setCreativeTab(BandbCreativeTabs.CreativeTabsPlant);
				itemSage = new Item().setUnlocalizedName("itemSage").setTextureName(Bandb_mod.MODID + ":ingredients/plants/itemSage").setCreativeTab(BandbCreativeTabs.CreativeTabsPlant);
				itemOregano = new Item().setUnlocalizedName("itemOregano").setTextureName(Bandb_mod.MODID + ":ingredients/plants/itemOregano").setCreativeTab(BandbCreativeTabs.CreativeTabsPlant);
				itemFennel = new Item().setUnlocalizedName("itemFennel").setTextureName(Bandb_mod.MODID + ":ingredients/plants/itemFennel").setCreativeTab(BandbCreativeTabs.CreativeTabsPlant);
				itemGentian = new Item().setUnlocalizedName("itemGentian").setTextureName(Bandb_mod.MODID + ":ingredients/plants/itemGentian").setCreativeTab(BandbCreativeTabs.CreativeTabsPlant);
				
				GameRegistry.registerItem(itemThyme, "itemThyme");
				GameRegistry.registerItem(itemSage, "itemSage");
				GameRegistry.registerItem(itemOregano, "itemOregano");
				GameRegistry.registerItem(itemFennel, "itemFennel");
				GameRegistry.registerItem(itemGentian, "itemGentian");
				
			}
			
		}
		public static void loaderCoffeeTea(boolean bool){
			if(bool){
				//coffee & tea			
				itemMugCoffeeEmpty = new Item().setUnlocalizedName("itemMugCoffeeEmpty").setTextureName(Bandb_mod.MODID + ":coffee/itemMugCoffeeEmpty").setCreativeTab(BandbCreativeTabs.CreativeTabsCoffeeAndTea);
				itemTeapot = new Item().setUnlocalizedName("itemTeapot").setTextureName(Bandb_mod.MODID + ":coffee/itemTeapot").setCreativeTab(BandbCreativeTabs.CreativeTabsCoffeeAndTea);
				
				GameRegistry.registerItem(itemMugCoffeeEmpty, "itemMugCoffeeEmpty");	
				GameRegistry.registerItem(itemTeapot, "itemTeapot");	
				
				itemCapsuleArpeggio = new ItemCapsule().setUnlocalizedName("itemCapsuleArpeggio").setTextureName(Bandb_mod.MODID + ":coffee/itemCapsuleArpeggio");
				itemCapsuleBukeelaKaEthiopia = new ItemCapsule().setUnlocalizedName("itemCapsuleBukeelaKaEthiopia").setTextureName(Bandb_mod.MODID + ":coffee/itemCapsuleBukeelaKaEthiopia");
				itemCapsuleCapriccio = new ItemCapsule().setUnlocalizedName("itemCapsuleCapriccio").setTextureName(Bandb_mod.MODID + ":coffee/itemCapsuleCapriccio");
				
				itemCapsuleCosi = new ItemCapsule().setUnlocalizedName("itemCapsuleCosi").setTextureName(Bandb_mod.MODID + ":coffee/itemCapsuleCosi");
				itemCapsuleDecaffeinato = new ItemCapsule().setUnlocalizedName("itemCapsuleDecaffeinato").setTextureName(Bandb_mod.MODID + ":coffee/itemCapsuleDecaffeinato");
				itemCapsuleDecaffeinatoIntenso = new ItemCapsule().setUnlocalizedName("itemCapsuleDecaffeinatoIntenso").setTextureName(Bandb_mod.MODID + ":coffee/itemCapsuleDecaffeinatoIntenso");
				itemCapsuleIndriyaFromIndia = new ItemCapsule().setUnlocalizedName("itemCapsuleIndriyaFromIndia").setTextureName(Bandb_mod.MODID + ":coffee/itemCapsuleIndriyaFromIndia");
				itemCapsuleKazaar = new ItemCapsule().setUnlocalizedName("itemCapsuleKazaar").setTextureName(Bandb_mod.MODID + ":coffee/itemCapsuleKazaar");
				
				itemCapsuleRistretto = new ItemCapsule().setUnlocalizedName("itemCapsuleRistretto").setTextureName(Bandb_mod.MODID + ":coffee/itemCapsuleRistretto");
				
				itemCapsuleDecaffeinatoLungo = new ItemCapsule().setUnlocalizedName("itemCapsuleDecaffeinatoLungo").setTextureName(Bandb_mod.MODID + ":coffee/itemCapsuleDecaffeinatoLungo");
				itemCapsuleRosabayaDeColombia = new ItemCapsule().setUnlocalizedName("itemCapsuleRosabayaDeColombia").setTextureName(Bandb_mod.MODID + ":coffee/itemCapsuleRosabayaDeColombia");
				itemCapsuleDulsaoDoBrasil = new ItemCapsule().setUnlocalizedName("itemCapsuleDulsaoDoBrasil").setTextureName(Bandb_mod.MODID + ":coffee/itemCapsuleDulsaoDoBrasil");
				itemCapsuleFortissioLungo = new ItemCapsule().setUnlocalizedName("itemCapsuleFortissioLungo").setTextureName(Bandb_mod.MODID + ":coffee/itemCapsuleFortissioLungo");
				itemCapsuleLinizioLungo = new ItemCapsule().setUnlocalizedName("itemCapsuleLinizioLungo").setTextureName(Bandb_mod.MODID + ":coffee/itemCapsuleLinizioLungo");
				
				itemCapsuleLivanto = new ItemCapsule().setUnlocalizedName("itemCapsuleLivanto").setTextureName(Bandb_mod.MODID + ":coffee/itemCapsuleLivanto");
				itemCapsuleRoma = new ItemCapsule().setUnlocalizedName("itemCapsuleRoma").setTextureName(Bandb_mod.MODID + ":coffee/itemCapsuleRoma");
				itemCapsuleVivaltoLungo = new ItemCapsule().setUnlocalizedName("itemCapsuleVivaltoLungo").setTextureName(Bandb_mod.MODID + ":coffee/itemCapsuleVivaltoLungo");
				itemCapsuleVolluto = new ItemCapsule().setUnlocalizedName("itemCapsuleVolluto").setTextureName(Bandb_mod.MODID + ":coffee/itemCapsuleVolluto");
				itemCapsuleDharkan = new ItemCapsule().setUnlocalizedName("itemCapsuleDharkan").setTextureName(Bandb_mod.MODID + ":coffee/itemCapsuleDharkan");			
				
				GameRegistry.registerItem(itemCapsuleArpeggio, "itemCapsuleArpeggio");	
				GameRegistry.registerItem(itemCapsuleBukeelaKaEthiopia, "itemCapsuleBukeelaKaEthiopia");	
				GameRegistry.registerItem(itemCapsuleCapriccio, "itemCapsuleCapriccio");	
				
				GameRegistry.registerItem(itemCapsuleCosi, "itemCapsuleCosi");	
				GameRegistry.registerItem(itemCapsuleDecaffeinato, "itemCapsuleDecaffeinato");	
				GameRegistry.registerItem(itemCapsuleDecaffeinatoIntenso, "itemCapsuleDecaffeinatoIntenso");	
				GameRegistry.registerItem(itemCapsuleIndriyaFromIndia, "itemCapsuleIndriyaFromIndia");	
				GameRegistry.registerItem(itemCapsuleKazaar, "itemCapsuleKazaar");	
				
				GameRegistry.registerItem(itemCapsuleRistretto, "itemCapsuleRistretto");	
				
				GameRegistry.registerItem(itemCapsuleDecaffeinatoLungo, "itemCapsuleDecaffeinatoLungo");	
				GameRegistry.registerItem(itemCapsuleRosabayaDeColombia, "itemCapsuleRosabayaDeColombia");	
				GameRegistry.registerItem(itemCapsuleDulsaoDoBrasil, "itemCapsuleDulsaoDoBrasil");	
				GameRegistry.registerItem(itemCapsuleFortissioLungo, "itemCapsuleFortissioLungo");	
				GameRegistry.registerItem(itemCapsuleLinizioLungo, "itemCapsuleLinizioLungo");	
				
				GameRegistry.registerItem(itemCapsuleLivanto, "itemCapsuleLivanto");	
				GameRegistry.registerItem(itemCapsuleRoma, "itemCapsuleRoma");	
				GameRegistry.registerItem(itemCapsuleVivaltoLungo, "itemCapsuleVivaltoLungo");	
				GameRegistry.registerItem(itemCapsuleVolluto, "itemCapsuleVolluto");	
				GameRegistry.registerItem(itemCapsuleDharkan, "itemCapsuleDharkan");				
				
				itemCapsuleArpeggioEmpty = new ItemCapsule().setUnlocalizedName("itemCapsuleArpeggioEmpty").setTextureName(Bandb_mod.MODID + ":coffee/itemCapsuleArpeggioEmpty");
				itemCapsuleBukeelaKaEthiopiaEmpty = new ItemCapsule().setUnlocalizedName("itemCapsuleBukeelaKaEthiopiaEmpty").setTextureName(Bandb_mod.MODID + ":coffee/itemCapsuleBukeelaKaEthiopiaEmpty");
				itemCapsuleCapriccioEmpty = new ItemCapsule().setUnlocalizedName("itemCapsuleCapriccioEmpty").setTextureName(Bandb_mod.MODID + ":coffee/itemCapsuleCapriccioEmpty");
				
				itemCapsuleCosiEmpty = new ItemCapsule().setUnlocalizedName("itemCapsuleCosiEmpty").setTextureName(Bandb_mod.MODID + ":coffee/itemCapsuleCosiEmpty");
				itemCapsuleDecaffeinatoEmpty = new ItemCapsule().setUnlocalizedName("itemCapsuleDecaffeinatoEmpty").setTextureName(Bandb_mod.MODID + ":coffee/itemCapsuleDecaffeinatoEmpty");
				itemCapsuleDecaffeinatoIntensoEmpty = new ItemCapsule().setUnlocalizedName("itemCapsuleDecaffeinatoIntensoEmpty").setTextureName(Bandb_mod.MODID + ":coffee/itemCapsuleDecaffeinatoIntensoEmpty");
				itemCapsuleIndriyaFromIndiaEmpty = new ItemCapsule().setUnlocalizedName("itemCapsuleIndriyaFromIndiaEmpty").setTextureName(Bandb_mod.MODID + ":coffee/itemCapsuleIndriyaFromIndiaEmpty");
				itemCapsuleKazaarEmpty = new ItemCapsule().setUnlocalizedName("itemCapsuleKazaarEmpty").setTextureName(Bandb_mod.MODID + ":coffee/itemCapsuleKazaarEmpty");
				
				itemCapsuleRistrettoEmpty = new ItemCapsule().setUnlocalizedName("itemCapsuleRistrettoEmpty").setTextureName(Bandb_mod.MODID + ":coffee/itemCapsuleRistrettoEmpty");
				
				itemCapsuleDecaffeinatoLungoEmpty = new ItemCapsule().setUnlocalizedName("itemCapsuleDecaffeinatoLungoEmpty").setTextureName(Bandb_mod.MODID + ":coffee/itemCapsuleDecaffeinatoLungoEmpty");
				itemCapsuleRosabayaDeColombiaEmpty = new ItemCapsule().setUnlocalizedName("itemCapsuleRosabayaDeColombiaEmpty").setTextureName(Bandb_mod.MODID + ":coffee/itemCapsuleRosabayaDeColombiaEmpty");
				itemCapsuleDulsaoDoBrasilEmpty = new ItemCapsule().setUnlocalizedName("itemCapsuleDulsaoDoBrasilEmpty").setTextureName(Bandb_mod.MODID + ":coffee/itemCapsuleDulsaoDoBrasilEmpty");
				itemCapsuleFortissioLungoEmpty = new ItemCapsule().setUnlocalizedName("itemCapsuleFortissioLungoEmpty").setTextureName(Bandb_mod.MODID + ":coffee/itemCapsuleFortissioLungoEmpty");
				itemCapsuleLinizioLungoEmpty = new ItemCapsule().setUnlocalizedName("itemCapsuleLinizioLungoEmpty").setTextureName(Bandb_mod.MODID + ":coffee/itemCapsuleLinizioLungoEmpty");
				
				itemCapsuleLivantoEmpty = new ItemCapsule().setUnlocalizedName("itemCapsuleLivantoEmpty").setTextureName(Bandb_mod.MODID + ":coffee/itemCapsuleLivantoEmpty");
				itemCapsuleRomaEmpty = new ItemCapsule().setUnlocalizedName("itemCapsuleRomaEmpty").setTextureName(Bandb_mod.MODID + ":coffee/itemCapsuleRomaEmpty");
				itemCapsuleVivaltoLungoEmpty = new ItemCapsule().setUnlocalizedName("itemCapsuleVivaltoLungoEmpty").setTextureName(Bandb_mod.MODID + ":coffee/itemCapsuleVivaltoLungoEmpty");
				itemCapsuleVollutoEmpty = new ItemCapsule().setUnlocalizedName("itemCapsuleVollutoEmpty").setTextureName(Bandb_mod.MODID + ":coffee/itemCapsuleVollutoEmpty");
				itemCapsuleDharkanEmpty = new ItemCapsule().setUnlocalizedName("itemCapsuleDharkanEmpty").setTextureName(Bandb_mod.MODID + ":coffee/itemCapsuleDharkanEmpty");
				
				GameRegistry.registerItem(itemCapsuleArpeggioEmpty, "itemCapsuleArpeggioEmpty");	
				GameRegistry.registerItem(itemCapsuleBukeelaKaEthiopiaEmpty, "itemCapsuleBukeelaKaEthiopiaEmpty");	
				GameRegistry.registerItem(itemCapsuleCapriccioEmpty, "itemCapsuleCapriccioEmpty");	
				
				GameRegistry.registerItem(itemCapsuleCosiEmpty, "itemCapsuleCosiEmpty");	
				GameRegistry.registerItem(itemCapsuleDecaffeinatoEmpty, "itemCapsuleDecaffeinatoEmpty");	
				GameRegistry.registerItem(itemCapsuleDecaffeinatoIntensoEmpty, "itemCapsuleDecaffeinatoIntensoEmpty");	
				GameRegistry.registerItem(itemCapsuleIndriyaFromIndiaEmpty, "itemCapsuleIndriyaFromIndiaEmpty");	
				GameRegistry.registerItem(itemCapsuleKazaarEmpty, "itemCapsuleKazaarEmpty");	
				
				GameRegistry.registerItem(itemCapsuleRistrettoEmpty, "itemCapsuleRistrettoEmpty");	
				
				GameRegistry.registerItem(itemCapsuleDecaffeinatoLungoEmpty, "itemCapsuleDecaffeinatoLungoEmpty");	
				GameRegistry.registerItem(itemCapsuleRosabayaDeColombiaEmpty, "itemCapsuleRosabayaDeColombiaEmpty");	
				GameRegistry.registerItem(itemCapsuleDulsaoDoBrasilEmpty, "itemCapsuleDulsaoDoBrasilEmpty");	
				GameRegistry.registerItem(itemCapsuleFortissioLungoEmpty, "itemCapsuleFortissioLungoEmpty");	
				GameRegistry.registerItem(itemCapsuleLinizioLungoEmpty, "itemCapsuleLinizioLungoEmpty");	
				
				GameRegistry.registerItem(itemCapsuleLivantoEmpty, "itemCapsuleLivantoEmpty");	
				GameRegistry.registerItem(itemCapsuleRomaEmpty, "itemCapsuleRomaEmpty");	
				GameRegistry.registerItem(itemCapsuleVivaltoLungoEmpty, "itemCapsuleVivaltoLungoEmpty");	
				GameRegistry.registerItem(itemCapsuleVollutoEmpty, "itemCapsuleVollutoEmpty");	
				GameRegistry.registerItem(itemCapsuleDharkanEmpty, "itemCapsuleDharkanEmpty");	
				
				//Graines de cafï¿½
				itemCoffeeArabicas = new Item().setUnlocalizedName("itemCoffeeArabicas").setTextureName(Bandb_mod.MODID + ":coffee/itemCoffeeArabicas").setCreativeTab(BandbCreativeTabs.CreativeTabsCoffeeAndTea);
				itemCoffeeBlueMountain = new Item().setUnlocalizedName("itemCoffeeBlueMountain").setTextureName(Bandb_mod.MODID + ":coffee/itemCoffeeBlueMountain").setCreativeTab(BandbCreativeTabs.CreativeTabsCoffeeAndTea);
				itemCoffeeBourbonPointu = new Item().setUnlocalizedName("itemCoffeeBourbonPointu").setTextureName(Bandb_mod.MODID + ":coffee/itemCoffeeBourbonPointu").setCreativeTab(BandbCreativeTabs.CreativeTabsCoffeeAndTea);
				itemCoffeeCattura = new Item().setUnlocalizedName("itemCoffeeCattura").setTextureName(Bandb_mod.MODID + ":coffee/itemCoffeeCattura").setCreativeTab(BandbCreativeTabs.CreativeTabsCoffeeAndTea);
				itemCoffeeHarrar = new Item().setUnlocalizedName("itemCoffeeHarrar").setTextureName(Bandb_mod.MODID + ":coffee/itemCoffeeHarrar").setCreativeTab(BandbCreativeTabs.CreativeTabsCoffeeAndTea);
				
				itemCoffeeHuehuetenango = new Item().setUnlocalizedName("itemCoffeeHuehuetenango").setTextureName(Bandb_mod.MODID + ":coffee/itemCoffeeHuehuetenango").setCreativeTab(BandbCreativeTabs.CreativeTabsCoffeeAndTea);
				itemCoffeeJava = new Item().setUnlocalizedName("itemCoffeeJava").setTextureName(Bandb_mod.MODID + ":coffee/itemCoffeeJava").setCreativeTab(BandbCreativeTabs.CreativeTabsCoffeeAndTea);
				itemCoffeeKenyaAA = new Item().setUnlocalizedName("itemCoffeeKenyaAA").setTextureName(Bandb_mod.MODID + ":coffee/itemCoffeeKenyaAA").setCreativeTab(BandbCreativeTabs.CreativeTabsCoffeeAndTea);
				itemCoffeeKona = new Item().setUnlocalizedName("itemCoffeeKona").setTextureName(Bandb_mod.MODID + ":coffee/itemCoffeeKona").setCreativeTab(BandbCreativeTabs.CreativeTabsCoffeeAndTea);
				itemCoffeeKontirWildForest = new Item().setUnlocalizedName("itemCoffeeKontirWildForest").setTextureName(Bandb_mod.MODID + ":coffee/itemCoffeeKontirWildForest").setCreativeTab(BandbCreativeTabs.CreativeTabsCoffeeAndTea);
				
				itemCoffeeKopiLuwak = new Item().setUnlocalizedName("itemCoffeeKopiLuwak").setTextureName(Bandb_mod.MODID + ":coffee/itemCoffeeKopiLuwak").setCreativeTab(BandbCreativeTabs.CreativeTabsCoffeeAndTea);
				itemCoffeeKupeAlamid = new Item().setUnlocalizedName("itemCoffeeKupeAlamid").setTextureName(Bandb_mod.MODID + ":coffee/itemCoffeeKupeAlamid").setCreativeTab(BandbCreativeTabs.CreativeTabsCoffeeAndTea);
				itemCoffeeMoka = new Item().setUnlocalizedName("itemCoffeeMoka").setTextureName(Bandb_mod.MODID + ":coffee/itemCoffeeMoka").setCreativeTab(BandbCreativeTabs.CreativeTabsCoffeeAndTea);
				itemCoffeeMundoNovo = new Item().setUnlocalizedName("itemCoffeeMundoNovo").setTextureName(Bandb_mod.MODID + ":coffee/itemCoffeeMundoNovo").setCreativeTab(BandbCreativeTabs.CreativeTabsCoffeeAndTea);
				itemCoffeeMuragogype = new Item().setUnlocalizedName("itemCoffeeMuragogype").setTextureName(Bandb_mod.MODID + ":coffee/itemCoffeeMuragogype").setCreativeTab(BandbCreativeTabs.CreativeTabsCoffeeAndTea);

				itemCoffeePeaberry = new Item().setUnlocalizedName("itemCoffeePeaberry").setTextureName(Bandb_mod.MODID + ":coffee/itemCoffeePeaberry").setCreativeTab(BandbCreativeTabs.CreativeTabsCoffeeAndTea);
				itemCoffeeTarrazu = new Item().setUnlocalizedName("itemCoffeeTarrazu").setTextureName(Bandb_mod.MODID + ":coffee/itemCoffeeTarrazu").setCreativeTab(BandbCreativeTabs.CreativeTabsCoffeeAndTea);
				itemCoffeeTorajaKalossi = new Item().setUnlocalizedName("itemCoffeeTorajaKalossi").setTextureName(Bandb_mod.MODID + ":coffee/itemCoffeeTorajaKalossi").setCreativeTab(BandbCreativeTabs.CreativeTabsCoffeeAndTea);
				itemCoffeeYirgacheffe = new Item().setUnlocalizedName("itemCoffeeYirgacheffe").setTextureName(Bandb_mod.MODID + ":coffee/itemCoffeeYirgacheffe").setCreativeTab(BandbCreativeTabs.CreativeTabsCoffeeAndTea);
				itemTeaLeaves = new Item().setUnlocalizedName("itemTeaLeaves").setTextureName(Bandb_mod.MODID + ":coffee/itemTeaLeaves").setCreativeTab(BandbCreativeTabs.CreativeTabsCoffeeAndTea);

				GameRegistry.registerItem(itemCoffeeArabicas, "itemCoffeeArabicas");	
				GameRegistry.registerItem(itemCoffeeBlueMountain, "itemCoffeeBlueMountain");	
				GameRegistry.registerItem(itemCoffeeBourbonPointu, "itemCoffeeBourbonPointu");	
				GameRegistry.registerItem(itemCoffeeCattura, "itemCoffeeCattura");	
				GameRegistry.registerItem(itemCoffeeHarrar, "itemCoffeeHarrar");	
				
				GameRegistry.registerItem(itemCoffeeHuehuetenango, "itemCoffeeHuehuetenango");	
				GameRegistry.registerItem(itemCoffeeJava, "itemCoffeeJava");	
				GameRegistry.registerItem(itemCoffeeKenyaAA, "itemCoffeeKenyaAA");	
				GameRegistry.registerItem(itemCoffeeKona, "itemCoffeeKona");	
				GameRegistry.registerItem(itemCoffeeKontirWildForest, "itemCoffeeKontirWildForest");	
				
				GameRegistry.registerItem(itemCoffeeKopiLuwak, "itemCoffeeKopiLuwak");	
				GameRegistry.registerItem(itemCoffeeKupeAlamid, "itemCoffeeKupeAlamid");	
				GameRegistry.registerItem(itemCoffeeMoka, "itemCoffeeMoka");	
				GameRegistry.registerItem(itemCoffeeMundoNovo, "itemCoffeeMundoNovo");	
				GameRegistry.registerItem(itemCoffeeMuragogype, "itemCoffeeMuragogype");	
				
				GameRegistry.registerItem(itemCoffeePeaberry, "itemCoffeePeaberry");	
				GameRegistry.registerItem(itemCoffeeTarrazu, "itemCoffeeTarrazu");	
				GameRegistry.registerItem(itemCoffeeTorajaKalossi, "itemCoffeeTorajaKalossi");	
				GameRegistry.registerItem(itemCoffeeYirgacheffe, "itemCoffeeYirgacheffe");	
				GameRegistry.registerItem(itemTeaLeaves, "itemTeaLeaves");	

				itemCoffeeArabicasGround = new Item().setUnlocalizedName("itemCoffeeArabicasGround").setTextureName(Bandb_mod.MODID + ":coffee/itemCoffeeArabicasGround").setCreativeTab(BandbCreativeTabs.CreativeTabsCoffeeAndTea);
				itemCoffeeBlueMountainGround = new Item().setUnlocalizedName("itemCoffeeBlueMountainGround").setTextureName(Bandb_mod.MODID + ":coffee/itemCoffeeBlueMountainGround").setCreativeTab(BandbCreativeTabs.CreativeTabsCoffeeAndTea);
				itemCoffeeBourbonPointuGround = new Item().setUnlocalizedName("itemCoffeeBourbonPointuGround").setTextureName(Bandb_mod.MODID + ":coffee/itemCoffeeBourbonPointuGround").setCreativeTab(BandbCreativeTabs.CreativeTabsCoffeeAndTea);
				itemCoffeeCatturaGround = new Item().setUnlocalizedName("itemCoffeeCatturaGround").setTextureName(Bandb_mod.MODID + ":coffee/itemCoffeeCatturaGround").setCreativeTab(BandbCreativeTabs.CreativeTabsCoffeeAndTea);
				itemCoffeeHarrarGround = new Item().setUnlocalizedName("itemCoffeeHarrarGround").setTextureName(Bandb_mod.MODID + ":coffee/itemCoffeeHarrarGround").setCreativeTab(BandbCreativeTabs.CreativeTabsCoffeeAndTea);
				
				itemCoffeeHuehuetenangoGround = new Item().setUnlocalizedName("itemCoffeeHuehuetenangoGround").setTextureName(Bandb_mod.MODID + ":coffee/itemCoffeeHuehuetenangoGround").setCreativeTab(BandbCreativeTabs.CreativeTabsCoffeeAndTea);
				itemCoffeeJavaGround = new Item().setUnlocalizedName("itemCoffeeJavaGround").setTextureName(Bandb_mod.MODID + ":coffee/itemCoffeeJavaGround").setCreativeTab(BandbCreativeTabs.CreativeTabsCoffeeAndTea);
				itemCoffeeKenyaAAGround = new Item().setUnlocalizedName("itemCoffeeKenyaAAGround").setTextureName(Bandb_mod.MODID + ":coffee/itemCoffeeKenyaAAGround").setCreativeTab(BandbCreativeTabs.CreativeTabsCoffeeAndTea);
				itemCoffeeKonaGround = new Item().setUnlocalizedName("itemCoffeeKonaGround").setTextureName(Bandb_mod.MODID + ":coffee/itemCoffeeKonaGround").setCreativeTab(BandbCreativeTabs.CreativeTabsCoffeeAndTea);
				itemCoffeeKontirWildForestGround = new Item().setUnlocalizedName("itemCoffeeKontirWildForestGround").setTextureName(Bandb_mod.MODID + ":coffee/itemCoffeeKontirWildForestGround").setCreativeTab(BandbCreativeTabs.CreativeTabsCoffeeAndTea);
				
				itemCoffeeKopiLuwakGround = new Item().setUnlocalizedName("itemCoffeeKopiLuwakGround").setTextureName(Bandb_mod.MODID + ":coffee/itemCoffeeKopiLuwakGround").setCreativeTab(BandbCreativeTabs.CreativeTabsCoffeeAndTea);
				itemCoffeeKupeAlamidGround = new Item().setUnlocalizedName("itemCoffeeKupeAlamidGround").setTextureName(Bandb_mod.MODID + ":coffee/itemCoffeeKupeAlamidGround").setCreativeTab(BandbCreativeTabs.CreativeTabsCoffeeAndTea);
				itemCoffeeMokaGround = new Item().setUnlocalizedName("itemCoffeeMokaGround").setTextureName(Bandb_mod.MODID + ":coffee/itemCoffeeMokaGround").setCreativeTab(BandbCreativeTabs.CreativeTabsCoffeeAndTea);
				itemCoffeeMundoNovoGround = new Item().setUnlocalizedName("itemCoffeeMundoNovoGround").setTextureName(Bandb_mod.MODID + ":coffee/itemCoffeeMundoNovoGround").setCreativeTab(BandbCreativeTabs.CreativeTabsCoffeeAndTea);
				itemCoffeeMuragogypeGround = new Item().setUnlocalizedName("itemCoffeeMuragogypeGround").setTextureName(Bandb_mod.MODID + ":coffee/itemCoffeeMuragogypeGround").setCreativeTab(BandbCreativeTabs.CreativeTabsCoffeeAndTea);

				itemCoffeePeaberryGround = new Item().setUnlocalizedName("itemCoffeePeaberryGround").setTextureName(Bandb_mod.MODID + ":coffee/itemCoffeePeaberryGround").setCreativeTab(BandbCreativeTabs.CreativeTabsCoffeeAndTea);
				itemCoffeeTarrazuGround = new Item().setUnlocalizedName("itemCoffeeTarrazuGround").setTextureName(Bandb_mod.MODID + ":coffee/itemCoffeeTarrazuGround").setCreativeTab(BandbCreativeTabs.CreativeTabsCoffeeAndTea);
				itemCoffeeTorajaKalossiGround = new Item().setUnlocalizedName("itemCoffeeTorajaKalossiGround").setTextureName(Bandb_mod.MODID + ":coffee/itemCoffeeTorajaKalossiGround").setCreativeTab(BandbCreativeTabs.CreativeTabsCoffeeAndTea);
				itemCoffeeYirgacheffeGround = new Item().setUnlocalizedName("itemCoffeeYirgacheffeGround").setTextureName(Bandb_mod.MODID + ":coffee/itemCoffeeYirgacheffeGround").setCreativeTab(BandbCreativeTabs.CreativeTabsCoffeeAndTea);
				itemDriedTeaLeaves = new Item().setUnlocalizedName("itemDriedTeaLeaves").setTextureName(Bandb_mod.MODID + ":coffee/itemDriedTeaLeaves").setCreativeTab(BandbCreativeTabs.CreativeTabsCoffeeAndTea);

				GameRegistry.registerItem(itemCoffeeArabicasGround, "itemCoffeeArabicasGround");	
				GameRegistry.registerItem(itemCoffeeBlueMountainGround, "itemCoffeeBlueMountainGround");	
				GameRegistry.registerItem(itemCoffeeBourbonPointuGround, "itemCoffeeBourbonPointuGround");	
				GameRegistry.registerItem(itemCoffeeCatturaGround, "itemCoffeeCatturaGround");	
				GameRegistry.registerItem(itemCoffeeHarrarGround, "itemCoffeeHarrarGround");	
				
				GameRegistry.registerItem(itemCoffeeHuehuetenangoGround, "itemCoffeeHuehuetenangoGround");	
				GameRegistry.registerItem(itemCoffeeJavaGround, "itemCoffeeJavaGround");	
				GameRegistry.registerItem(itemCoffeeKenyaAAGround, "itemCoffeeKenyaAAGround");	
				GameRegistry.registerItem(itemCoffeeKonaGround, "itemCoffeeKonaGround");	
				GameRegistry.registerItem(itemCoffeeKontirWildForestGround, "itemCoffeeKontirWildForestGround");	
				
				GameRegistry.registerItem(itemCoffeeKopiLuwakGround, "itemCoffeeKopiLuwakGround");	
				GameRegistry.registerItem(itemCoffeeKupeAlamidGround, "itemCoffeeKupeAlamidGround");	
				GameRegistry.registerItem(itemCoffeeMokaGround, "itemCoffeeMokaGround");	
				GameRegistry.registerItem(itemCoffeeMundoNovoGround, "itemCoffeeMundoNovoGround");	
				GameRegistry.registerItem(itemCoffeeMuragogypeGround, "itemCoffeeMuragogypeGround");	
				
				GameRegistry.registerItem(itemCoffeePeaberryGround, "item_Coffee_Peaberry_Ground");	
				GameRegistry.registerItem(itemCoffeeTarrazuGround, "item_Coffee_Tarrazu_Ground");	
				GameRegistry.registerItem(itemCoffeeTorajaKalossiGround, "item_Coffee_Toraja_Kalossi_Ground");	
				GameRegistry.registerItem(itemCoffeeYirgacheffeGround, "item_Coffee_Yirgacheffe_Ground");	
				GameRegistry.registerItem(itemDriedTeaLeaves, "item_Dried_Tea_Leaves");
				
				itemLemonTea = new Item().setUnlocalizedName("itemLemonTea").setTextureName(Bandb_mod.MODID + ":coffee/itemLemonTea").setCreativeTab(BandbCreativeTabs.CreativeTabsCoffeeAndTea);
				itemPeachTea = new Item().setUnlocalizedName("itemPeachTea").setTextureName(Bandb_mod.MODID + ":coffee/itemPeachTea").setCreativeTab(BandbCreativeTabs.CreativeTabsCoffeeAndTea);
				itemRaspberryTea = new Item().setUnlocalizedName("itemRaspberryTea").setTextureName(Bandb_mod.MODID + ":coffee/itemRaspberryTea").setCreativeTab(BandbCreativeTabs.CreativeTabsCoffeeAndTea);
				itemMatchaGreenTea = new Item().setUnlocalizedName("itemMatchaGreenTea").setTextureName(Bandb_mod.MODID + ":coffee/itemMatchaGreenTea").setCreativeTab(BandbCreativeTabs.CreativeTabsCoffeeAndTea);

				GameRegistry.registerItem(itemLemonTea, "itemLemonTea");	
				GameRegistry.registerItem(itemPeachTea, "itemPeachTea");	
				GameRegistry.registerItem(itemRaspberryTea, "itemRaspberryTea");	
				GameRegistry.registerItem(itemMatchaGreenTea, "itemMatchaGreenTea");
				
				itemChaiTea = new Item().setUnlocalizedName("itemChaiTea").setTextureName(Bandb_mod.MODID + ":coffee/itemChaiTea").setCreativeTab(BandbCreativeTabs.CreativeTabsCoffeeAndTea);

				GameRegistry.registerItem(itemChaiTea, "itemChaiTea");	
				
				
				itemCupArpeggio = new Item().setUnlocalizedName("itemCupArpeggio").setTextureName(Bandb_mod.MODID + ":coffee/itemCupArpeggio").setCreativeTab(BandbCreativeTabs.CreativeTabsCoffeeAndTea);
				itemCupBukeelaKaEthiopia = new Item().setUnlocalizedName("itemCupBukeelaKaEthiopia").setTextureName(Bandb_mod.MODID + ":coffee/itemCupBukeelaKaEthiopia").setCreativeTab(BandbCreativeTabs.CreativeTabsCoffeeAndTea);
				itemCupCapriccio = new Item().setUnlocalizedName("itemCupCapriccio").setTextureName(Bandb_mod.MODID + ":coffee/itemCupCapriccio").setCreativeTab(BandbCreativeTabs.CreativeTabsCoffeeAndTea);
				itemCupCosi = new Item().setUnlocalizedName("itemCupCosi").setTextureName(Bandb_mod.MODID + ":coffee/itemCupCosi").setCreativeTab(BandbCreativeTabs.CreativeTabsCoffeeAndTea);
				itemCupDecaffeinato = new Item().setUnlocalizedName("itemCupDecaffeinato").setTextureName(Bandb_mod.MODID + ":coffee/itemCupDecaffeinato").setCreativeTab(BandbCreativeTabs.CreativeTabsCoffeeAndTea);

				GameRegistry.registerItem(itemCupArpeggio, "itemCupArpeggio");	
				GameRegistry.registerItem(itemCupBukeelaKaEthiopia, "itemCupBukeelaKaEthiopia");	
				GameRegistry.registerItem(itemCupCapriccio, "itemCupCapriccio");	
				GameRegistry.registerItem(itemCupCosi, "itemCupCosi");	
				GameRegistry.registerItem(itemCupDecaffeinato, "itemCupDecaffeinato");	
				
				itemCupDecaffeinatoIntenso = new Item().setUnlocalizedName("itemCupDecaffeinatoIntenso").setTextureName(Bandb_mod.MODID + ":coffee/itemCupDecaffeinatoIntenso").setCreativeTab(BandbCreativeTabs.CreativeTabsCoffeeAndTea);
				itemCupIndriyaFromIndia = new Item().setUnlocalizedName("itemCupIndriyaFromIndia").setTextureName(Bandb_mod.MODID + ":coffee/itemCupIndriyaFromIndia").setCreativeTab(BandbCreativeTabs.CreativeTabsCoffeeAndTea);
				itemCupKazaar = new Item().setUnlocalizedName("itemCupKazaar").setTextureName(Bandb_mod.MODID + ":coffee/itemCupKazaar").setCreativeTab(BandbCreativeTabs.CreativeTabsCoffeeAndTea);
				itemCupRistretto = new Item().setUnlocalizedName("itemCupRistretto").setTextureName(Bandb_mod.MODID + ":coffee/itemCupRistretto").setCreativeTab(BandbCreativeTabs.CreativeTabsCoffeeAndTea);
				itemCupRosabayaDeColombia = new Item().setUnlocalizedName("itemCupRosabayaDeColombia").setTextureName(Bandb_mod.MODID + ":coffee/itemCupRosabayaDeColombia").setCreativeTab(BandbCreativeTabs.CreativeTabsCoffeeAndTea);

				GameRegistry.registerItem(itemCupDecaffeinatoIntenso, "itemCupDecaffeinatoIntenso");	
				GameRegistry.registerItem(itemCupIndriyaFromIndia, "itemCupIndriyaFromIndia");	
				GameRegistry.registerItem(itemCupKazaar, "itemCupKazaar");	
				GameRegistry.registerItem(itemCupRistretto, "itemCupRistretto");	
				GameRegistry.registerItem(itemCupRosabayaDeColombia, "itemCupRosabayaDeColombia");	
				
				itemCupDulsaoDoBrasil = new Item().setUnlocalizedName("itemCupDulsaoDoBrasil").setTextureName(Bandb_mod.MODID + ":coffee/itemCupDulsaoDoBrasil").setCreativeTab(BandbCreativeTabs.CreativeTabsCoffeeAndTea);
				itemCupFortissioLungo = new Item().setUnlocalizedName("itemCupFortissioLungo").setTextureName(Bandb_mod.MODID + ":coffee/itemCupFortissioLungo").setCreativeTab(BandbCreativeTabs.CreativeTabsCoffeeAndTea);
				itemCupLinizioLungo = new Item().setUnlocalizedName("itemCupLinizioLungo").setTextureName(Bandb_mod.MODID + ":coffee/itemCupLinizioLungo").setCreativeTab(BandbCreativeTabs.CreativeTabsCoffeeAndTea);
				itemCupLivanto = new Item().setUnlocalizedName("itemCupLivanto").setTextureName(Bandb_mod.MODID + ":coffee/itemCupLivanto").setCreativeTab(BandbCreativeTabs.CreativeTabsCoffeeAndTea);
				itemCupRoma = new Item().setUnlocalizedName("itemCupRoma").setTextureName(Bandb_mod.MODID + ":coffee/itemCupRoma").setCreativeTab(BandbCreativeTabs.CreativeTabsCoffeeAndTea);

				GameRegistry.registerItem(itemCupDulsaoDoBrasil, "itemCupDulsaoDoBrasil");	
				GameRegistry.registerItem(itemCupFortissioLungo, "itemCupFortissioLungo");	
				GameRegistry.registerItem(itemCupLinizioLungo, "itemCupLinizioLungo");	
				GameRegistry.registerItem(itemCupLivanto, "itemCupLivanto");	
				GameRegistry.registerItem(itemCupRoma, "itemCupRoma");	
				
				itemCupVivaltoLungo = new Item().setUnlocalizedName("itemCupVivaltoLungo").setTextureName(Bandb_mod.MODID + ":coffee/itemCupVivaltoLungo").setCreativeTab(BandbCreativeTabs.CreativeTabsCoffeeAndTea);
				itemCupVolluto = new Item().setUnlocalizedName("itemCupVolluto").setTextureName(Bandb_mod.MODID + ":coffee/itemCupVolluto").setCreativeTab(BandbCreativeTabs.CreativeTabsCoffeeAndTea);
				itemCupDharkan = new Item().setUnlocalizedName("itemCupDharkan").setTextureName(Bandb_mod.MODID + ":coffee/itemCupDharkan").setCreativeTab(BandbCreativeTabs.CreativeTabsCoffeeAndTea);
				itemCupDecaffeinatoLungo = new Item().setUnlocalizedName("itemCupDecaffeinatoLungo").setTextureName(Bandb_mod.MODID + ":coffee/itemCupDecaffeinatoLungo").setCreativeTab(BandbCreativeTabs.CreativeTabsCoffeeAndTea);

				GameRegistry.registerItem(itemCupVivaltoLungo, "itemCupVivaltoLungo");	
				GameRegistry.registerItem(itemCupVolluto, "itemCupVolluto");	
				GameRegistry.registerItem(itemCupDharkan, "itemCupDharkan");	
				GameRegistry.registerItem(itemCupDecaffeinatoLungo, "itemCupDecaffeinatoLungo");					
				
			}
		}
		public static void loaderMushroom(boolean bool){
			
			if(bool){
				 //items mushrooms,
		    	itemTruffle = new Item().setUnlocalizedName("itemTruffle").setTextureName(Bandb_mod.MODID + ":mushrooms/itemTruffle").setCreativeTab(BandbCreativeTabs.CreativeTabsMushroom);
		    	itemAmanitaMuscaria = new itemMushroomAmanitaMuscaria().setUnlocalizedName("itemAmanitaMuscaria").setTextureName(Bandb_mod.MODID + ":mushrooms/itemAmanitaMuscaria").setCreativeTab(BandbCreativeTabs.CreativeTabsMushroom);
		    	itemWhiteMushroom = new Item().setUnlocalizedName("itemWhiteMushroom").setTextureName(Bandb_mod.MODID + ":mushrooms/itemWhiteMushroom").setCreativeTab(BandbCreativeTabs.CreativeTabsMushroom);
		    	itemMorel = new Item().setUnlocalizedName("itemMorel").setTextureName(Bandb_mod.MODID + ":mushrooms/itemMorel").setCreativeTab(BandbCreativeTabs.CreativeTabsMushroom);
		    	itemHornOfPlenty = new Item().setUnlocalizedName("itemHornOfPlenty").setTextureName(Bandb_mod.MODID + ":mushrooms/itemHornOfPlenty").setCreativeTab(BandbCreativeTabs.CreativeTabsMushroom);
		    
		    	GameRegistry.registerItem(itemTruffle, "itemTruffle");
		    	GameRegistry.registerItem(itemAmanitaMuscaria, "itemAmanitaMuscaria");	    	
		    	GameRegistry.registerItem(itemWhiteMushroom, "itemWhiteMushroom");
		    	GameRegistry.registerItem(itemMorel, "itemMorel");
		    	GameRegistry.registerItem(itemHornOfPlenty, "itemHornOfPlenty");
		    	
		    	itemCep = new Item().setUnlocalizedName("itemCep").setTextureName(Bandb_mod.MODID + ":mushrooms/itemCep").setCreativeTab(BandbCreativeTabs.CreativeTabsMushroom);
		    	itemHydnumRepandum = new Item().setUnlocalizedName("itemHydnumRepandum").setTextureName(Bandb_mod.MODID + ":mushrooms/itemHydnumRepandum").setCreativeTab(BandbCreativeTabs.CreativeTabsMushroom);

		    	GameRegistry.registerItem(itemCep, "itemCep");
		    	GameRegistry.registerItem(itemHydnumRepandum, "itemHydnumRepandum");
			}
		}
		public static void loaderPharmaceuticals(boolean bool){
			
			if(bool){
				//items pharmaceuticals	    	
		    	itemDoliprane200mg = new itemPharmaceuticalsDoliprane200mg().setUnlocalizedName("itemDoliprane200mg").setTextureName(Bandb_mod.MODID + ":pharmaceuticals/itemDoliprane200mg").setCreativeTab(BandbCreativeTabs.CreativeTabsPharmaceutical);
		    	itemDoliprane300mg = new itemPharmaceuticalsDoliprane300mg().setUnlocalizedName("itemDoliprane300mg").setTextureName(Bandb_mod.MODID + ":pharmaceuticals/itemDoliprane300mg").setCreativeTab(BandbCreativeTabs.CreativeTabsPharmaceutical);
		    	itemDoliprane500mg = new itemPharmaceuticalsDoliprane500mg().setUnlocalizedName("itemDoliprane500mg").setTextureName(Bandb_mod.MODID + ":pharmaceuticals/itemDoliprane500mg").setCreativeTab(BandbCreativeTabs.CreativeTabsPharmaceutical);
		    	itemDoliprane1000mg = new itemPharmaceuticalsDoliprane1000mg().setUnlocalizedName("itemDoliprane1000mg").setTextureName(Bandb_mod.MODID + ":pharmaceuticals/itemDoliprane1000mg").setCreativeTab(BandbCreativeTabs.CreativeTabsPharmaceutical);

		    	GameRegistry.registerItem(itemDoliprane200mg, "itemDoliprane200mg");
		    	GameRegistry.registerItem(itemDoliprane300mg, "itemDoliprane300mg");
		    	GameRegistry.registerItem(itemDoliprane500mg, "itemDoliprane500mg");
		    	GameRegistry.registerItem(itemDoliprane1000mg, "itemDoliprane1000mg");
				
			}
		}
		public static void loaderLabel(boolean bool){
			if(bool){
				//items labels    	
		    	itemCapCorseLabel = new ItemLabel().setUnlocalizedName("itemCapCorseLabel").setTextureName(Bandb_mod.MODID + ":labels/itemCapCorseLabel");
		    	itemBenturColaLabel = new ItemLabel().setUnlocalizedName("itemBenturColaLabel").setTextureName(Bandb_mod.MODID + ":labels/itemBenturColaLabel");
		    	itemBrandyLabel = new ItemLabel().setUnlocalizedName("itemBrandyLabel").setTextureName(Bandb_mod.MODID + ":labels/itemBrandyLabel");
		    	itemCalvadosLabel = new ItemLabel().setUnlocalizedName("itemCalvadosLabel").setTextureName(Bandb_mod.MODID + ":labels/itemCalvadosLabel");
		    	itemChouchenLabel = new ItemLabel().setUnlocalizedName("itemChouchenLabel").setTextureName(Bandb_mod.MODID + ":labels/itemChouchenLabel");

		    	itemCiderLabel = new ItemLabel().setUnlocalizedName("itemCiderLabel").setTextureName(Bandb_mod.MODID + ":labels/itemCiderLabel");
		    	itemCognacLabel = new ItemLabel().setUnlocalizedName("itemCognacLabel").setTextureName(Bandb_mod.MODID + ":labels/itemCognacLabel");
		    	itemGinLabel = new ItemLabel().setUnlocalizedName("itemGinLabel").setTextureName(Bandb_mod.MODID + ":labels/itemGinLabel");
		    	itemLambigLabel = new ItemLabel().setUnlocalizedName("itemLambigLabel").setTextureName(Bandb_mod.MODID + ":labels/itemLambigLabel");

		    	GameRegistry.registerItem(itemCapCorseLabel, "itemCapCorseLabel");
		    	GameRegistry.registerItem(itemBenturColaLabel, "itemBenturColaLabel");
		    	GameRegistry.registerItem(itemBrandyLabel, "itemBrandyLabel");
		    	GameRegistry.registerItem(itemCalvadosLabel, "itemCalvadosLabel");
		    	GameRegistry.registerItem(itemChouchenLabel, "itemChouchenLabel");

		    	GameRegistry.registerItem(itemCiderLabel, "itemCiderLabel");
		    	GameRegistry.registerItem(itemCognacLabel, "itemCognacLabel");
		    	GameRegistry.registerItem(itemGinLabel, "itemGinLabel");
		    	GameRegistry.registerItem(itemLambigLabel, "itemLambigLabel");

		    	itemLiquorLabel = new ItemLabel().setUnlocalizedName("itemLiquorLabel").setTextureName(Bandb_mod.MODID + ":labels/itemLiquorLabel");
		    	itemPastis51Label = new ItemLabel().setUnlocalizedName("itemPastis51Label").setTextureName(Bandb_mod.MODID + ":labels/itemPastis51Label");
		    	itemPerrierLabel = new ItemLabel().setUnlocalizedName("itemPerrierLabel").setTextureName(Bandb_mod.MODID + ":labels/itemPerrierLabel");
		    	itemPommeauLabel = new ItemLabel().setUnlocalizedName("itemPommeauLabel").setTextureName(Bandb_mod.MODID + ":labels/itemPommeauLabel");
		    	itemRedMartiniLabel = new ItemLabel().setUnlocalizedName("itemRedMartiniLabel").setTextureName(Bandb_mod.MODID + ":labels/itemRedMartiniLabel");

		    	itemRedPortLabel = new ItemLabel().setUnlocalizedName("itemRedPortLabel").setTextureName(Bandb_mod.MODID + ":labels/itemRedPortLabel");
		    	itemRumLabel = new ItemLabel().setUnlocalizedName("itemRumLabel").setTextureName(Bandb_mod.MODID + ":labels/itemRumLabel");
		    	itemTequilaLabel = new ItemLabel().setUnlocalizedName("itemTequilaLabel").setTextureName(Bandb_mod.MODID + ":labels/itemTequilaLabel");
		    	itemVinegarLabel = new ItemLabel().setUnlocalizedName("itemVinegarLabel").setTextureName(Bandb_mod.MODID + ":labels/itemVinegarLabel");

		    	GameRegistry.registerItem(itemLiquorLabel, "itemLiquorLabel");
		    	GameRegistry.registerItem(itemPastis51Label, "itemPastis51Label");
		    	GameRegistry.registerItem(itemPerrierLabel, "itemPerrierLabel");
		    	GameRegistry.registerItem(itemPommeauLabel, "itemPommeauLabel");
		    	GameRegistry.registerItem(itemRedMartiniLabel, "itemRedMartiniLabel");

		    	GameRegistry.registerItem(itemRedPortLabel, "itemRedPortLabel");
		    	GameRegistry.registerItem(itemRumLabel, "itemRumLabel");
		    	GameRegistry.registerItem(itemTequilaLabel, "itemTequilaLabel");
		    	GameRegistry.registerItem(itemVinegarLabel, "itemVinegarLabel");

		    	itemVodkaLabel = new ItemLabel().setUnlocalizedName("itemVodkaLabel").setTextureName(Bandb_mod.MODID + ":labels/itemVodkaLabel");
		    	itemWhiskeyLabel = new ItemLabel().setUnlocalizedName("itemWhiskeyLabel").setTextureName(Bandb_mod.MODID + ":labels/itemWhiskeyLabel");
		    	itemWhiteMartiniLabel = new ItemLabel().setUnlocalizedName("itemWhiteMartiniLabel").setTextureName(Bandb_mod.MODID + ":labels/itemWhiteMartiniLabel");
		    	itemWhitePortLabel = new ItemLabel().setUnlocalizedName("itemWhitePortLabel").setTextureName(Bandb_mod.MODID + ":labels/itemWhitePortLabel");

		    	itemSiropMoninOrangeLabel = new ItemLabel().setUnlocalizedName("itemSiropMoninOrangeLabel").setTextureName(Bandb_mod.MODID + ":labels/itemSiropMoninOrangeLabel");
		    	itemBordeauxTourLabel = new ItemLabel().setUnlocalizedName("itemBordeauxTourLabel").setTextureName(Bandb_mod.MODID + ":labels/itemBordeauxTourLabel");
		    	itemBordeauxLaryLabel = new ItemLabel().setUnlocalizedName("itemBordeauxLaryLabel").setTextureName(Bandb_mod.MODID + ":labels/itemBordeauxLaryLabel");
				
		    	GameRegistry.registerItem(itemVodkaLabel, "itemVodkaLabel");
		    	GameRegistry.registerItem(itemWhiskeyLabel, "itemWhiskeyLabel");
		    	GameRegistry.registerItem(itemWhiteMartiniLabel, "itemWhiteMartiniLabel");
		    	GameRegistry.registerItem(itemWhitePortLabel, "itemWhitePortLabel");
		    	
		    	GameRegistry.registerItem(itemSiropMoninOrangeLabel, "itemSiropMoninOrangeLabel");
		    	GameRegistry.registerItem(itemBordeauxTourLabel, "itemBordeauxTourLabel");
		    	GameRegistry.registerItem(itemBordeauxLaryLabel, "itemBordeauxLaryLabel");
		    	
				itemBlueCuracaoLabel = new ItemLabel().setUnlocalizedName("itemBlueCuracaoLabel").setTextureName(Bandb_mod.MODID + ":labels/itemBlueCuracaoLabel");
				itemTabascoLabel = new ItemLabel().setUnlocalizedName("itemTabascoLabel").setTextureName(Bandb_mod.MODID + ":labels/itemTabascoLabel");
				itemPontarlierLabel = new ItemLabel().setUnlocalizedName("itemPontarlierLabel").setTextureName(Bandb_mod.MODID + ":labels/itemPontarlierLabel");
				itemDubonnetRougeLabel = new ItemLabel().setUnlocalizedName("itemDubonnetRougeLabel").setTextureName(Bandb_mod.MODID + ":labels/itemDubonnetRougeLabel");
				itemBenedictineLabel = new ItemLabel().setUnlocalizedName("itemBenedictineLabel").setTextureName(Bandb_mod.MODID + ":labels/itemBenedictineLabel");

		    	GameRegistry.registerItem(itemBlueCuracaoLabel, "itemBlueCuracaoLabel");
		    	GameRegistry.registerItem(itemTabascoLabel, "itemTabascoLabel");
		    	GameRegistry.registerItem(itemPontarlierLabel, "itemPontarlierLabel");
		    	GameRegistry.registerItem(itemDubonnetRougeLabel, "itemDubonnetRougeLabel");
		    	GameRegistry.registerItem(itemBenedictineLabel, "itemBenedictineLabel");
		    	
				itemWorcestershireSauceLabel = new ItemLabel().setUnlocalizedName("itemWorcestershireSauceLabel").setTextureName(Bandb_mod.MODID + ":labels/itemWorcestershireSauceLabel");
				itemAmarettoLabel = new ItemLabel().setUnlocalizedName("itemAmarettoLabel").setTextureName(Bandb_mod.MODID + ":labels/itemAmarettoLabel");
				itemBitterLabel = new ItemLabel().setUnlocalizedName("itemBitterLabel").setTextureName(Bandb_mod.MODID + ":labels/itemBitterLabel");
				itemCuracaoTripleSecLabel = new ItemLabel().setUnlocalizedName("itemCuracaoTripleSecLabel").setTextureName(Bandb_mod.MODID + ":labels/itemCuracaoTripleSecLabel");

		    	GameRegistry.registerItem(itemWorcestershireSauceLabel, "itemWorcestershireSauceLabel");
		    	GameRegistry.registerItem(itemAmarettoLabel, "itemAmarettoLabel");
		    	GameRegistry.registerItem(itemBitterLabel, "itemBitterLabel");
		    	GameRegistry.registerItem(itemCuracaoTripleSecLabel, "itemCuracaoTripleSecLabel");
		    	
				itemHeinekenLabel = new ItemLabel().setUnlocalizedName("itemHeinekenLabel").setTextureName(Bandb_mod.MODID + ":labels/itemHeinekenLabel");
				itemBaileysLabel = new ItemLabel().setUnlocalizedName("itemBaileysLabel").setTextureName(Bandb_mod.MODID + ":labels/itemBaileysLabel");
				itemChartreuseVerteLabel = new ItemLabel().setUnlocalizedName("itemChartreuseVerteLabel").setTextureName(Bandb_mod.MODID + ":labels/itemChartreuseVerteLabel");
				itemPiscoLabel = new ItemLabel().setUnlocalizedName("itemPiscoLabel").setTextureName(Bandb_mod.MODID + ":labels/itemPiscoLabel");
				itemCuracaoOrangeLabel = new ItemLabel().setUnlocalizedName("itemCuracaoOrangeLabel").setTextureName(Bandb_mod.MODID + ":labels/itemCuracaoOrangeLabel");

		    	GameRegistry.registerItem(itemHeinekenLabel, "itemHeinekenLabel");
		    	GameRegistry.registerItem(itemBaileysLabel, "itemBaileysLabel");
		    	GameRegistry.registerItem(itemChartreuseVerteLabel, "itemChartreuseVerteLabel");
		    	GameRegistry.registerItem(itemPiscoLabel, "itemPiscoLabel");
		    	GameRegistry.registerItem(itemCuracaoOrangeLabel, "itemCuracaoOrangeLabel");
		    	
				itemCampariLabel = new ItemLabel().setUnlocalizedName("itemCampariLabel").setTextureName(Bandb_mod.MODID + ":labels/itemCampariLabel");
				itemAngosturaBitterLabel = new ItemLabel().setUnlocalizedName("itemAngosturaBitterLabel").setTextureName(Bandb_mod.MODID + ":labels/itemAngosturaBitterLabel");
				itemPetrusLabel = new ItemLabel().setUnlocalizedName("itemPetrusLabel").setTextureName(Bandb_mod.MODID + ":labels/itemPetrusLabel");
				itemDrambuieLabel = new ItemLabel().setUnlocalizedName("itemDrambuieLabel").setTextureName(Bandb_mod.MODID + ":labels/itemDrambuieLabel");
				itemFleurOrangerLabel = new ItemLabel().setUnlocalizedName("itemFleurOrangerLabel").setTextureName(Bandb_mod.MODID + ":labels/itemFleurOrangerLabel");

		    	GameRegistry.registerItem(itemCampariLabel, "itemCampariLabel");
		    	GameRegistry.registerItem(itemAngosturaBitterLabel, "itemAngosturaBitterLabel");
		    	GameRegistry.registerItem(itemPetrusLabel, "itemPetrusLabel");
		    	GameRegistry.registerItem(itemDrambuieLabel, "itemDrambuieLabel");
		    	GameRegistry.registerItem(itemFleurOrangerLabel, "itemFleurOrangerLabel");

				itemChartreuseJauneLabel = new ItemLabel().setUnlocalizedName("itemChartreuseJauneLabel").setTextureName(Bandb_mod.MODID + ":labels/itemChartreuseJauneLabel");
				itemGrandMarnierLabel = new ItemLabel().setUnlocalizedName("itemGrandMarnierLabel").setTextureName(Bandb_mod.MODID + ":labels/itemGrandMarnierLabel");
				itemLimonadeLabel = new ItemLabel().setUnlocalizedName("itemLimonadeLabel").setTextureName(Bandb_mod.MODID + ":labels/itemLimonadeLabel");
				itemXeresLabel = new ItemLabel().setUnlocalizedName("itemXeresLabel").setTextureName(Bandb_mod.MODID + ":labels/itemXeresLabel");
				itemSchweppesTonicLabel = new ItemLabel().setUnlocalizedName("itemSchweppesTonicLabel").setTextureName(Bandb_mod.MODID + ":labels/itemSchweppesTonicLabel");
				
		    	GameRegistry.registerItem(itemChartreuseJauneLabel, "itemChartreuseJauneLabel");
		    	GameRegistry.registerItem(itemGrandMarnierLabel, "itemGrandMarnierLabel");
		    	GameRegistry.registerItem(itemLimonadeLabel, "itemLimonadeLabel");
		    	GameRegistry.registerItem(itemXeresLabel, "itemXeresLabel");
		    	GameRegistry.registerItem(itemSchweppesTonicLabel, "itemSchweppesTonicLabel");

		    	itemFernetBrancaLabel = new ItemLabel().setUnlocalizedName("itemFernetBrancaLabel").setTextureName(Bandb_mod.MODID + ":labels/itemFernetBrancaLabel");
		    	itemSchweppesGingerAleLabel = new ItemLabel().setUnlocalizedName("itemSchweppesGingerAleLabel").setTextureName(Bandb_mod.MODID + ":labels/itemSchweppesGingerAleLabel");
		    	itemChampagneMummLabel = new ItemLabel().setUnlocalizedName("itemChampagneMummLabel").setTextureName(Bandb_mod.MODID + ":labels/itemChampagneMummLabel");
		    	itemGuinnessLabel = new ItemLabel().setUnlocalizedName("itemGuinnessLabel").setTextureName(Bandb_mod.MODID + ":labels/itemGuinnessLabel");
		    	itemEnateLabel = new ItemLabel().setUnlocalizedName("itemEnateLabel").setTextureName(Bandb_mod.MODID + ":labels/itemEnateLabel");
				
		    	GameRegistry.registerItem(itemFernetBrancaLabel, "itemFernetBrancaLabel");
		    	GameRegistry.registerItem(itemSchweppesGingerAleLabel, "itemSchweppesGingerAleLabel");
		    	GameRegistry.registerItem(itemChampagneMummLabel, "itemChampagneMummLabel");
		    	GameRegistry.registerItem(itemGuinnessLabel, "itemGuinnessLabel");
		    	GameRegistry.registerItem(itemEnateLabel, "itemEnateLabel");
		    	
		    	itemAlsaceRieslingLabel = new ItemLabel().setUnlocalizedName("itemAlsaceRieslingLabel").setTextureName(Bandb_mod.MODID + ":labels/itemAlsaceRieslingLabel");
		    	itemBourgogneAligoteLabel = new ItemLabel().setUnlocalizedName("itemBourgogneAligoteLabel").setTextureName(Bandb_mod.MODID + ":labels/itemBourgogneAligoteLabel");
		    	itemSouthernComfortLabel = new ItemLabel().setUnlocalizedName("itemSouthernComfortLabel").setTextureName(Bandb_mod.MODID + ":labels/itemSouthernComfortLabel");
		    	itemLabelHoney = new ItemLabel().setUnlocalizedName("itemLabelHoney").setTextureName(Bandb_mod.MODID + ":labels/itemLabelHoney");
		    	itemLabelSchweppesRaisin = new ItemLabel().setUnlocalizedName("itemLabelSchweppesRaisin").setTextureName(Bandb_mod.MODID + ":labels/itemLabelSchweppesRaisin");
				
		    	GameRegistry.registerItem(itemAlsaceRieslingLabel, "itemAlsaceRieslingLabel");
		    	GameRegistry.registerItem(itemBourgogneAligoteLabel, "itemBourgogneAligoteLabel");
		    	GameRegistry.registerItem(itemSouthernComfortLabel, "itemSouthernComfortLabel");		    	
		    	GameRegistry.registerItem(itemLabelHoney, "itemLabelHoney");		    	
		    	GameRegistry.registerItem(itemLabelSchweppesRaisin, "itemLabelSchweppesRaisin");		    	
		     	
		    	itemLabelSchweppesAgrum = new ItemLabel().setUnlocalizedName("itemLabelSchweppesAgrum").setTextureName(Bandb_mod.MODID + ":labels/itemLabelSchweppesAgrum");
		    	itemLabelSchweppesDarkSide = new ItemLabel().setUnlocalizedName("itemLabelSchweppesDarkSide").setTextureName(Bandb_mod.MODID + ":labels/itemLabelSchweppesDarkSide");
		    	itemLabelSchweppesLemon = new ItemLabel().setUnlocalizedName("itemLabelSchweppesLemon").setTextureName(Bandb_mod.MODID + ":labels/itemLabelSchweppesLemon");
		    	itemLabelSchweppesMango = new ItemLabel().setUnlocalizedName("itemLabelSchweppesMango").setTextureName(Bandb_mod.MODID + ":labels/itemLabelSchweppesMango");
		    	itemLabelSchweppesPamplemousse = new ItemLabel().setUnlocalizedName("itemLabelSchweppesPamplemousse").setTextureName(Bandb_mod.MODID + ":labels/itemLabelSchweppesPamplemousse");
				
		    	GameRegistry.registerItem(itemLabelSchweppesAgrum, "itemLabelSchweppesAgrum");
		    	GameRegistry.registerItem(itemLabelSchweppesDarkSide, "itemLabelSchweppesDarkSide");
		    	GameRegistry.registerItem(itemLabelSchweppesLemon, "itemLabelSchweppesLemon");
		    	GameRegistry.registerItem(itemLabelSchweppesMango, "itemLabelSchweppesMango");
		    	GameRegistry.registerItem(itemLabelSchweppesPamplemousse, "itemLabelSchweppesPamplemousse");
		    	
		    	itemLabelSchweppesPassion = new ItemLabel().setUnlocalizedName("itemLabelSchweppesPassion").setTextureName(Bandb_mod.MODID + ":labels/itemLabelSchweppesPassion");
		    	itemLabelSchweppesPech = new ItemLabel().setUnlocalizedName("itemLabelSchweppesPech").setTextureName(Bandb_mod.MODID + ":labels/itemLabelSchweppesPech");
		    	itemLabelSchweppesPomme = new ItemLabel().setUnlocalizedName("itemLabelSchweppesPomme").setTextureName(Bandb_mod.MODID + ":labels/itemLabelSchweppesPomme");
		    	itemLabelSchweppesRicqles = new ItemLabel().setUnlocalizedName("itemLabelSchweppesRicqles").setTextureName(Bandb_mod.MODID + ":labels/itemLabelSchweppesRicqles");
		    	itemLabelGet27 = new ItemLabel().setUnlocalizedName("itemLabelGet27").setTextureName(Bandb_mod.MODID + ":labels/itemLabelGet27");
				
		    	GameRegistry.registerItem(itemLabelSchweppesPassion, "itemLabelSchweppesPassion");
		    	GameRegistry.registerItem(itemLabelSchweppesPech, "itemLabelSchweppesPech");
		    	GameRegistry.registerItem(itemLabelSchweppesPomme, "itemLabelSchweppesPomme");		    	
		    	GameRegistry.registerItem(itemLabelSchweppesRicqles, "itemLabelSchweppesRicqles");		
		    	GameRegistry.registerItem(itemLabelGet27, "itemLabelGet27");		
		    	
		    	itemLabel1664 = new ItemLabel().setUnlocalizedName("itemLabel1664").setTextureName(Bandb_mod.MODID + ":labels/itemLabel1664");
		    	itemLabelBritt = new ItemLabel().setUnlocalizedName("itemLabelBritt").setTextureName(Bandb_mod.MODID + ":labels/itemLabelBritt");
		    	itemLabelDesperados = new ItemLabel().setUnlocalizedName("itemLabelDesperados").setTextureName(Bandb_mod.MODID + ":labels/itemLabelDesperados");
		    	itemLabelDuvel = new ItemLabel().setUnlocalizedName("itemLabelDuvel").setTextureName(Bandb_mod.MODID + ":labels/itemLabelDuvel");
		    	itemLabelGrimbergen = new ItemLabel().setUnlocalizedName("itemLabelGrimbergen").setTextureName(Bandb_mod.MODID + ":labels/itemLabelGrimbergen");
				
		    	GameRegistry.registerItem(itemLabel1664, "itemLabel1664");
		    	GameRegistry.registerItem(itemLabelBritt, "itemLabelBritt");
		    	GameRegistry.registerItem(itemLabelDesperados, "itemLabelDesperados");
		    	GameRegistry.registerItem(itemLabelDuvel, "itemLabelDuvel");
		    	GameRegistry.registerItem(itemLabelGrimbergen, "itemLabelGrimbergen");
		    	
		    	itemLabelLeffe = new ItemLabel().setUnlocalizedName("itemLabelLeffe").setTextureName(Bandb_mod.MODID + ":labels/itemLabelLeffe");
		    	itemLabelSanMiguel = new ItemLabel().setUnlocalizedName("itemLabelSanMiguel").setTextureName(Bandb_mod.MODID + ":labels/itemLabelSanMiguel");
		    	itemLabelSkoll = new ItemLabel().setUnlocalizedName("itemLabelSkoll").setTextureName(Bandb_mod.MODID + ":labels/itemLabelSkoll");
		    	itemLabelSmirnoff = new ItemLabel().setUnlocalizedName("itemLabelSmirnoff").setTextureName(Bandb_mod.MODID + ":labels/itemLabelSmirnoff");
		    	itemLabelXII = new ItemLabel().setUnlocalizedName("itemLabelXII").setTextureName(Bandb_mod.MODID + ":labels/itemLabelXII");
				
		    	GameRegistry.registerItem(itemLabelLeffe, "itemLabelLeffe");
		    	GameRegistry.registerItem(itemLabelSanMiguel, "itemLabelSanMiguel");
		    	GameRegistry.registerItem(itemLabelSkoll, "itemLabelSkoll");
		    	GameRegistry.registerItem(itemLabelSmirnoff, "itemLabelSmirnoff");
		    	GameRegistry.registerItem(itemLabelXII, "itemLabelXII");
		    	

		    	
		    	
			}
		}
		public static void loaderWrapping(boolean bool){
			
			if(bool){
				 //items wrapping
		    	itemWrappingDoliprane200mg = new Item().setUnlocalizedName("itemWrappingDoliprane200mg").setTextureName(Bandb_mod.MODID + ":wrapping/itemWrappingDoliprane200mg").setCreativeTab(BandbCreativeTabs.CreativeTabsWrapping);
		    	itemWrappingDoliprane300mg = new Item().setUnlocalizedName("itemWrappingDoliprane300mg").setTextureName(Bandb_mod.MODID + ":wrapping/itemWrappingDoliprane300mg").setCreativeTab(BandbCreativeTabs.CreativeTabsWrapping);
		    	itemWrappingDoliprane500mg = new Item().setUnlocalizedName("itemWrappingDoliprane500mg").setTextureName(Bandb_mod.MODID + ":wrapping/itemWrappingDoliprane500mg").setCreativeTab(BandbCreativeTabs.CreativeTabsWrapping);
		    	itemWrappingDoliprane1000mg = new Item().setUnlocalizedName("itemWrappingDoliprane1000mg").setTextureName(Bandb_mod.MODID + ":wrapping/itemWrappingDoliprane1000mg").setCreativeTab(BandbCreativeTabs.CreativeTabsWrapping);

		    	GameRegistry.registerItem(itemWrappingDoliprane200mg, "itemWrappingDoliprane200mg");
		    	GameRegistry.registerItem(itemWrappingDoliprane300mg, "itemWrappingDoliprane300mg");
		    	GameRegistry.registerItem(itemWrappingDoliprane500mg, "itemWrappingDoliprane500mg");
		    	GameRegistry.registerItem(itemWrappingDoliprane1000mg, "itemWrappingDoliprane1000mg");
			}
		}
		public static void loaderTools(boolean bool){
			if(bool){
				
				//kitchen tools
				itemFlyingPan = new ItemToolsKitchen().setUnlocalizedName("itemFlyingPan").setTextureName(Bandb_mod.MODID + ":kitchentools/itemFlyingPan");
				itemCheeseKnife = new ItemToolsKitchen().setUnlocalizedName("itemCheeseKnife").setTextureName(Bandb_mod.MODID + ":kitchentools/itemCheeseKnife");
				itemCleaverIron = new ItemToolsKitchen().setUnlocalizedName("itemCleaverIron").setTextureName(Bandb_mod.MODID + ":kitchentools/itemCleaverIron");
				itemKnifeIron = new ItemToolsKitchen().setUnlocalizedName("itemKnifeIron").setTextureName(Bandb_mod.MODID + ":kitchentools/itemKnifeIron");
				itemShaker = new ItemToolsKitchen().setUnlocalizedName("itemShaker").setTextureName(Bandb_mod.MODID + ":kitchentools/itemShaker");

				itemPizzaWheel = new ItemToolsKitchen().setUnlocalizedName("itemPizzaWheel").setTextureName(Bandb_mod.MODID + ":kitchentools/itemPizzaWheel");
				itemCookieCutterStar = new ItemToolsKitchen().setUnlocalizedName("itemCookieCutterStar").setTextureName(Bandb_mod.MODID + ":kitchentools/itemCookieCutterStar");
				itemCookieCutterSquare = new ItemToolsKitchen().setUnlocalizedName("itemCookieCutterSquare").setTextureName(Bandb_mod.MODID + ":kitchentools/itemCookieCutterSquare");
				itemCookieCutterMan = new ItemToolsKitchen().setUnlocalizedName("itemCookieCutterMan").setTextureName(Bandb_mod.MODID + ":kitchentools/itemCookieCutterMan");
				itemCookieCutterCircle = new ItemToolsKitchen().setUnlocalizedName("itemCookieCutterCircle").setTextureName(Bandb_mod.MODID + ":kitchentools/itemCookieCutterCircle");

				GameRegistry.registerItem(itemFlyingPan, "itemFlyingPan");	
				GameRegistry.registerItem(itemCheeseKnife, "itemCheeseKnife");	
				GameRegistry.registerItem(itemCleaverIron, "itemCleaverIron");	
				GameRegistry.registerItem(itemKnifeIron, "itemKnifeIron");	
				GameRegistry.registerItem(itemShaker, "itemShaker");	

				GameRegistry.registerItem(itemPizzaWheel, "itemPizzaWheel");	
				GameRegistry.registerItem(itemCookieCutterStar, "itemCookieCutterStar");	
				GameRegistry.registerItem(itemCookieCutterSquare, "itemCookieCutterSquare");	
				GameRegistry.registerItem(itemCookieCutterMan, "itemCookieCutterMan");	
				GameRegistry.registerItem(itemCookieCutterCircle, "itemCookieCutterCircle");	

				itemCheeseGrater = new ItemToolsKitchen().setUnlocalizedName("itemCheeseGrater").setTextureName(Bandb_mod.MODID + ":kitchentools/itemCheeseGrater");
				itemFoforkStone = new ItemToolsKitchen().setUnlocalizedName("itemFoforkStone").setTextureName(Bandb_mod.MODID + ":kitchentools/itemFoforkStone");
				itemBucketBelMilk = new ItemToolsKitchen().setUnlocalizedName("itemBucketBelMilk").setTextureName(Bandb_mod.MODID + ":kitchentools/itemBucketBelMilk");
				itemBucketMilkaMilk = new ItemToolsKitchen().setUnlocalizedName("itemBucketMilkaMilk").setTextureName(Bandb_mod.MODID + ":kitchentools/itemBucketMilkaMilk");
				itemScrewdriver = new ItemToolsKitchen().setUnlocalizedName("itemScrewdriver").setTextureName(Bandb_mod.MODID + ":kitchentools/itemScrewdriver");
					
				itemCocktailGlass = new ItemGlass().setUnlocalizedName("itemCocktailGlass").setTextureName(Bandb_mod.MODID + ":kitchentools/itemCocktailGlass");
				itemFlute = new ItemGlass().setUnlocalizedName("itemFlute").setTextureName(Bandb_mod.MODID + ":kitchentools/itemFlute");
				itemOldFashoned = new ItemGlass().setUnlocalizedName("itemOldFashoned").setTextureName(Bandb_mod.MODID + ":kitchentools/itemOldFashoned");
				itemTumbler = new ItemGlass().setUnlocalizedName("itemTumbler").setTextureName(Bandb_mod.MODID + ":kitchentools/itemTumbler");
				itemGlassCup = new ItemGlass().setUnlocalizedName("itemGlassCup").setTextureName(Bandb_mod.MODID + ":kitchentools/itemGlassCup");

				GameRegistry.registerItem(itemCheeseGrater, "itemCheeseGrater");	
				GameRegistry.registerItem(itemFoforkStone, "itemFoforkStone");	
				GameRegistry.registerItem(itemBucketBelMilk, "itemBucketBelMilk");	
				GameRegistry.registerItem(itemBucketMilkaMilk, "itemBucketMilkaMilk");			
				GameRegistry.registerItem(itemScrewdriver, "itemScrewdriver");	
				
				GameRegistry.registerItem(itemCocktailGlass, "itemCocktailGlass");	
				GameRegistry.registerItem(itemFlute, "itemFlute");	
				GameRegistry.registerItem(itemOldFashoned, "itemOldFashoned");	
				GameRegistry.registerItem(itemTumbler, "itemTumbler");	
				GameRegistry.registerItem(itemGlassCup, "itemGlassCup");

				itemCocktailGlassDirty = new ItemGlass().setUnlocalizedName("itemCocktailGlassDirty").setTextureName(Bandb_mod.MODID + ":kitchentools/itemCocktailGlassDirty");
				itemFluteDirty = new ItemGlass().setUnlocalizedName("itemFluteDirty").setTextureName(Bandb_mod.MODID + ":kitchentools/itemFluteDirty");
				itemOldFashonnedDirty = new ItemGlass().setUnlocalizedName("itemOldFashonnedDirty").setTextureName(Bandb_mod.MODID + ":kitchentools/itemOldFashonnedDirty");
				itemTumblerDirty = new ItemGlass().setUnlocalizedName("itemTumblerDirty").setTextureName(Bandb_mod.MODID + ":kitchentools/itemTumblerDirty");
				itemGlassCupDirty = new ItemGlass().setUnlocalizedName("itemGlassCupDirty").setTextureName(Bandb_mod.MODID + ":kitchentools/itemGlassCupDirty");

				GameRegistry.registerItem(itemCocktailGlassDirty, "itemCocktailGlassDirty");	
				GameRegistry.registerItem(itemFluteDirty, "itemFluteDirty");	
				GameRegistry.registerItem(itemOldFashonnedDirty, "itemOldFashonnedDirty");	
				GameRegistry.registerItem(itemTumblerDirty, "itemTumblerDirty");			
				GameRegistry.registerItem(itemGlassCupDirty, "itemGlassCupDirty");	
				
				
			}
		}

		public static void loaderCoktail(boolean bool) {
			if(bool){
							}
			
		}

		public static void loaderCreativeOnly(boolean bool) {
			if(bool){
				  //creative only 		    
				itemCreativeOnly = new Item().setUnlocalizedName("itemCreativeOnly").setTextureName(Bandb_mod.MODID + ":creativeonly/itemCreativeOnly").setCreativeTab(BandbCreativeTabs.CreativeTabsCreativeOnly);
				itemBug = new Item().setUnlocalizedName("itemBug").setTextureName(Bandb_mod.MODID + ":creativeonly/itemBug").setCreativeTab(BandbCreativeTabs.CreativeTabsCreativeOnly);

			    GameRegistry.registerItem(itemCreativeOnly, "itemCreativeOnly");	    
			    GameRegistry.registerItem(itemBug, "itemBug");	    
	    
			}
		
		//meat 
				//raw
					//chicken				
				itemChickenFleshRaw = new Item().setUnlocalizedName("itemChickenFleshRaw").setTextureName(Bandb_mod.MODID + ":ingredients/meat/itemChickenFleshRaw").setCreativeTab(BandbCreativeTabs.CreativeTabsIngredient);
				itemChickenFullRaw = new Item().setUnlocalizedName("itemChickenFullRaw").setTextureName(Bandb_mod.MODID + ":ingredients/meat/itemChickenFullRaw").setCreativeTab(BandbCreativeTabs.CreativeTabsIngredient);
				itemChickenLegRaw = new Item().setUnlocalizedName("itemChickenLegRaw").setTextureName(Bandb_mod.MODID + ":ingredients/meat/itemChickenLegRaw").setCreativeTab(BandbCreativeTabs.CreativeTabsIngredient);
				itemChickenNuggetRaw = new Item().setUnlocalizedName("itemChickenNuggetRaw").setTextureName(Bandb_mod.MODID + ":ingredients/meat/itemChickenNuggetRaw").setCreativeTab(BandbCreativeTabs.CreativeTabsIngredient);

				GameRegistry.registerItem(itemChickenFleshRaw, "itemChickenFleshRaw");	
				GameRegistry.registerItem(itemChickenFullRaw, "itemChickenFullRaw");	
				GameRegistry.registerItem(itemChickenLegRaw, "itemChickenLegRaw");	
				GameRegistry.registerItem(itemChickenNuggetRaw, "itemChickenNuggetRaw");	

					//cow
				itemCowForeRibRaw = new Item().setUnlocalizedName("itemCowForeRibRaw").setTextureName(Bandb_mod.MODID + ":ingredients/meat/itemCowForeRibRaw").setCreativeTab(BandbCreativeTabs.CreativeTabsIngredient);
				itemCowRumpsteakRaw = new Item().setUnlocalizedName("itemCowRumpsteakRaw").setTextureName(Bandb_mod.MODID + ":ingredients/meat/itemCowRumpsteakRaw").setCreativeTab(BandbCreativeTabs.CreativeTabsIngredient);

				GameRegistry.registerItem(itemCowForeRibRaw, "itemCowForeRibRaw");	
				GameRegistry.registerItem(itemCowRumpsteakRaw, "itemCowRumpsteakRaw");
					//sheep
				itemLegMuttonRaw = new Item().setUnlocalizedName("itemLegMuttonRaw").setTextureName(Bandb_mod.MODID + ":ingredients/meat/itemLegMuttonRaw").setCreativeTab(BandbCreativeTabs.CreativeTabsIngredient);
				itemSaddleMuttonRaw = new Item().setUnlocalizedName("itemSaddleMuttonRaw").setTextureName(Bandb_mod.MODID + ":ingredients/meat/itemSaddleMuttonRaw").setCreativeTab(BandbCreativeTabs.CreativeTabsIngredient);
				itemShoulderMuttonRaw = new Item().setUnlocalizedName("itemShoulderMuttonRaw").setTextureName(Bandb_mod.MODID + ":ingredients/meat/itemShoulderMuttonRaw").setCreativeTab(BandbCreativeTabs.CreativeTabsIngredient);
				itemMuttonBrain = new Item().setUnlocalizedName("itemMuttonBrain").setTextureName(Bandb_mod.MODID + ":ingredients/meat/itemMuttonBrain").setCreativeTab(BandbCreativeTabs.CreativeTabsIngredient);

				GameRegistry.registerItem(itemLegMuttonRaw, "itemLegMuttonRaw");	
				GameRegistry.registerItem(itemSaddleMuttonRaw, "itemSaddleMuttonRaw");	
				GameRegistry.registerItem(itemShoulderMuttonRaw, "itemShoulderMuttonRaw");	
				GameRegistry.registerItem(itemMuttonBrain, "itemMuttonBrain");	
					//pig
				itemPorkForeLoinRaw = new Item().setUnlocalizedName("itemPorkForeLoinRaw").setTextureName(Bandb_mod.MODID + ":ingredients/meat/itemPorkForeLoinRaw").setCreativeTab(BandbCreativeTabs.CreativeTabsIngredient);
				itemPorkHamRaw = new Item().setUnlocalizedName("itemPorkHamRaw").setTextureName(Bandb_mod.MODID + ":ingredients/meat/itemPorkHamRaw").setCreativeTab(BandbCreativeTabs.CreativeTabsIngredient);
				itemPorkLoinChopsRaw = new Item().setUnlocalizedName("itemPorkLoinChopsRaw").setTextureName(Bandb_mod.MODID + ":ingredients/meat/itemPorkLoinChopsRaw").setCreativeTab(BandbCreativeTabs.CreativeTabsIngredient);

				GameRegistry.registerItem(itemPorkForeLoinRaw, "itemPorkForeLoinRaw");	
				GameRegistry.registerItem(itemPorkHamRaw, "itemPorkHamRaw");	
				GameRegistry.registerItem(itemPorkLoinChopsRaw, "itemPorkLoinChopsRaw");
				
				itemWorm = new Item().setUnlocalizedName("itemWorm").setTextureName(Bandb_mod.MODID + ":ingredients/meat/itemWorm").setCreativeTab(BandbCreativeTabs.CreativeTabsIngredient);
				itemZombieArm = new Item().setUnlocalizedName("itemZombieArm").setTextureName(Bandb_mod.MODID + ":ingredients/meat/itemZombieArm").setCreativeTab(BandbCreativeTabs.CreativeTabsIngredient);
				itemZombieFeet = new Item().setUnlocalizedName("itemZombieFeet").setTextureName(Bandb_mod.MODID + ":ingredients/meat/itemZombieFeet").setCreativeTab(BandbCreativeTabs.CreativeTabsIngredient);

				GameRegistry.registerItem(itemWorm, "itemWorm");
				GameRegistry.registerItem(itemZombieArm, "itemZombieArm");
				GameRegistry.registerItem(itemZombieFeet, "itemZombieFeet");
			
				//cooked
					//chicken
				itemChickenFleshCooked = new Item().setUnlocalizedName("itemChickenFleshCooked").setTextureName(Bandb_mod.MODID + ":ingredients/meat/itemChickenFleshCooked").setCreativeTab(BandbCreativeTabs.CreativeTabsIngredient);
				itemChickenFullCooked = new Item().setUnlocalizedName("itemChickenFullCooked").setTextureName(Bandb_mod.MODID + ":ingredients/meat/itemChickenFullCooked").setCreativeTab(BandbCreativeTabs.CreativeTabsIngredient);
				itemChickenLegCooked = new Item().setUnlocalizedName("itemChickenLegCooked").setTextureName(Bandb_mod.MODID + ":ingredients/meat/itemChickenLegCooked").setCreativeTab(BandbCreativeTabs.CreativeTabsIngredient);
				itemChickenNuggetCooked = new Item().setUnlocalizedName("itemChickenNuggetCooked").setTextureName(Bandb_mod.MODID + ":ingredients/meat/itemChickenNugget").setCreativeTab(BandbCreativeTabs.CreativeTabsIngredient);

				GameRegistry.registerItem(itemChickenFleshCooked, "itemChickenFleshCooked");	
				GameRegistry.registerItem(itemChickenFullCooked, "itemChickenFullCooked");	
				GameRegistry.registerItem(itemChickenLegCooked, "itemChickenLegCooked");	
				GameRegistry.registerItem(itemChickenNuggetCooked, "itemChickenNuggetCooked");	

					//cow
				itemCowForeRibCooked = new Item().setUnlocalizedName("itemCowForeRibCooked").setTextureName(Bandb_mod.MODID + ":ingredients/meat/itemCowForeRibCooked").setCreativeTab(BandbCreativeTabs.CreativeTabsIngredient);
				itemCowRumpsteakCooked = new Item().setUnlocalizedName("itemCowRumpsteakCooked").setTextureName(Bandb_mod.MODID + ":ingredients/meat/itemCowRumpsteakCooked").setCreativeTab(BandbCreativeTabs.CreativeTabsIngredient);

				GameRegistry.registerItem(itemCowForeRibCooked, "itemCowForeRibCooked");	
				GameRegistry.registerItem(itemCowRumpsteakCooked, "itemCowRumpsteakCooked");	
					//sheep
				itemLegMuttonCooked = new Item().setUnlocalizedName("itemLegMuttonCooked").setTextureName(Bandb_mod.MODID + ":ingredients/meat/itemLegMuttonCooked").setCreativeTab(BandbCreativeTabs.CreativeTabsIngredient);
				itemSaddleMuttonCooked = new Item().setUnlocalizedName("itemSaddleMuttonCooked").setTextureName(Bandb_mod.MODID + ":ingredients/meat/itemSaddleMuttonCooked").setCreativeTab(BandbCreativeTabs.CreativeTabsIngredient);
				itemShoulderMuttonCooked = new Item().setUnlocalizedName("itemShoulderMuttonCooked").setTextureName(Bandb_mod.MODID + ":ingredients/meat/itemShoulderMuttonCooked").setCreativeTab(BandbCreativeTabs.CreativeTabsIngredient);
				itemMuttonCookedBrain = new Item().setUnlocalizedName("itemMuttonCookedBrain").setTextureName(Bandb_mod.MODID + ":ingredients/meat/itemMuttonCookedBrain").setCreativeTab(BandbCreativeTabs.CreativeTabsIngredient);

				GameRegistry.registerItem(itemLegMuttonCooked, "itemLegMuttonCooked");	
				GameRegistry.registerItem(itemSaddleMuttonCooked, "itemSaddleMuttonCooked");	
				GameRegistry.registerItem(itemShoulderMuttonCooked, "itemShoulderMuttonCooked");
				GameRegistry.registerItem(itemMuttonCookedBrain, "itemMuttonCookedBrain");	
					//pig
				itemPorkForeLoinCooked = new Item().setUnlocalizedName("itemPorkForeLoinCooked").setTextureName(Bandb_mod.MODID + ":ingredients/meat/itemPorkForeLoinCooked").setCreativeTab(BandbCreativeTabs.CreativeTabsIngredient);
				itemPorkHamCooked = new Item().setUnlocalizedName("itemPorkHamCooked").setTextureName(Bandb_mod.MODID + ":ingredients/meat/itemPorkHamCooked").setCreativeTab(BandbCreativeTabs.CreativeTabsIngredient);
				itemPorkLoinChopsCooked = new Item().setUnlocalizedName("itemPorkLoinChopsCooked").setTextureName(Bandb_mod.MODID + ":ingredients/meat/itemPorkLoinChopsCooked").setCreativeTab(BandbCreativeTabs.CreativeTabsIngredient);

				GameRegistry.registerItem(itemPorkForeLoinCooked, "itemPorkForeLoinCooked");	
				GameRegistry.registerItem(itemPorkHamCooked, "itemPorkHamCooked");	
				GameRegistry.registerItem(itemPorkLoinChopsCooked, "itemPorkLoinChopsCooked");		
				
				
				
				itemLeaveCocaDried = new Item().setUnlocalizedName("itemLeaveCocaDried").setTextureName(Bandb_mod.MODID + ":ingredients/itemLeaveCocaDried").setCreativeTab(BandbCreativeTabs.CreativeTabsIngredient);
				itemTobaccoDried = new Item().setUnlocalizedName("itemTobaccoDried").setTextureName(Bandb_mod.MODID + ":ingredients/itemTobaccoDried").setCreativeTab(BandbCreativeTabs.CreativeTabsIngredient);

				GameRegistry.registerItem(itemLeaveCocaDried, "itemLeaveCocaDried");	
				GameRegistry.registerItem(itemTobaccoDried, "itemTobaccoDried");	

				itemKebabRaw = new Item().setUnlocalizedName("itemKebabRaw").setTextureName(Bandb_mod.MODID + ":ingredients/meat/itemKebabRaw").setCreativeTab(BandbCreativeTabs.CreativeTabsIngredient);
				itemKebabSpit = new Item().setUnlocalizedName("itemKebabSpit").setTextureName(Bandb_mod.MODID + ":ingredients/meat/itemKebabSpit").setCreativeTab(BandbCreativeTabs.CreativeTabsIngredient);
				itemKebab = new Item().setUnlocalizedName("itemKebab").setTextureName(Bandb_mod.MODID + ":ingredients/meat/itemKebab").setCreativeTab(BandbCreativeTabs.CreativeTabsIngredient);

				GameRegistry.registerItem(itemKebabRaw, "itemKebabRaw");	
				GameRegistry.registerItem(itemKebabSpit, "itemKebabSpit");	
				GameRegistry.registerItem(itemKebab, "itemKebab");	
				
//Butterfly
				itemButterflyAcmonBlue = new Item().setUnlocalizedName("itemButterflyAcmonBlue").setTextureName(Bandb_mod.MODID + ":butterfly/itemButterflyAcmonBlue").setCreativeTab(BandbCreativeTabs.CreativeTabsButterfly);
				itemButterflyAfricanCloudedYellow = new Item().setUnlocalizedName("itemButterflyAfricanCloudedYellow").setTextureName(Bandb_mod.MODID + ":butterfly/itemButterflyAfricanCloudedYellow").setCreativeTab(BandbCreativeTabs.CreativeTabsButterfly);
				itemButterflyAfricanMapWing = new Item().setUnlocalizedName("itemButterflyAfricanMapWing").setTextureName(Bandb_mod.MODID + ":butterfly/itemButterflyAfricanMapWing").setCreativeTab(BandbCreativeTabs.CreativeTabsButterfly);
				itemButterflyAfricanPeachMoth = new Item().setUnlocalizedName("itemButterflyAfricanPeachMoth").setTextureName(Bandb_mod.MODID + ":butterfly/itemButterflyAfricanPeachMoth").setCreativeTab(BandbCreativeTabs.CreativeTabsButterfly);
				itemButterflyAlcidesAgathyrsus = new Item().setUnlocalizedName("itemButterflyAlcidesAgathyrsus").setTextureName(Bandb_mod.MODID + ":butterfly/itemButterflyAlcidesAgathyrsus").setCreativeTab(BandbCreativeTabs.CreativeTabsButterfly);

				GameRegistry.registerItem(itemButterflyAcmonBlue, "itemButterflyAcmonBlue");	
				GameRegistry.registerItem(itemButterflyAfricanCloudedYellow, "itemButterflyAfricanCloudedYellow");	
				GameRegistry.registerItem(itemButterflyAfricanMapWing, "itemButterflyAfricanMapWing");	
				GameRegistry.registerItem(itemButterflyAfricanPeachMoth, "itemButterflyAfricanPeachMoth");	
				GameRegistry.registerItem(itemButterflyAlcidesAgathyrsus, "itemButterflyAlcidesAgathyrsus");	
				

		}
	}
