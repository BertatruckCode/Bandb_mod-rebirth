package fr.bentur_and_bertatruck.bandb_mod.common.loader;

import net.minecraft.item.ItemStack;
import fr.bentur_and_bertatruck.bandb_mod.common.lists.ListApple;
import fr.bentur_and_bertatruck.bandb_mod.common.lists.ListAppleJuice;
import fr.bentur_and_bertatruck.bandb_mod.common.lists.ListBottle;
import fr.bentur_and_bertatruck.bandb_mod.common.lists.ListCoffeeCup;
import fr.bentur_and_bertatruck.bandb_mod.common.lists.ListGrape;
import fr.bentur_and_bertatruck.bandb_mod.common.lists.ListLabels;
import fr.bentur_and_bertatruck.bandb_mod.common.lists.ListPineapple;
import fr.bentur_and_bertatruck.bandb_mod.common.lists.ListPineapplejuice;
import fr.bentur_and_bertatruck.bandb_mod.common.lists.ListTeaCup;

public class BandbLists {
	
	public static void init(){
		ListApple.add(BandbItems.itemAppleAntares);
		ListApple.add(BandbItems.itemAppleAriane);
		ListApple.add(BandbItems.itemAppleBelchardChancelier);
		ListApple.add(BandbItems.itemAppleBelleDeBoskoop);
		ListApple.add(BandbItems.itemAppleBraeburn);
		ListApple.add(BandbItems.itemAppleElstar);
		ListApple.add(BandbItems.itemAppleFuji);
		ListApple.add(BandbItems.itemAppleGala);
		ListApple.add(BandbItems.itemAppleGolden);
		ListApple.add(BandbItems.itemAppleGrannySmith);
		ListApple.add(BandbItems.itemAppleHoneycrunch);
		ListApple.add(BandbItems.itemAppleJazz);
		ListApple.add(BandbItems.itemAppleJonagoldJonagored);
		ListApple.add(BandbItems.itemAppleLesRouges);
		ListApple.add(BandbItems.itemApplePinkLady);
		ListApple.add(BandbItems.itemApplePommeDuLimousin);
		ListApple.add(BandbItems.itemAppleReineDesReinettes);
		ListApple.add(BandbItems.itemAppleReinetteGriseDuCanada);
		ListApple.add(BandbItems.itemAppleTentation);

		ListAppleJuice.add(BandbBeverages.itemJuiceAppleAntares);
		ListAppleJuice.add(BandbBeverages.itemJuiceAppleAriane);
		ListAppleJuice.add(BandbBeverages.itemJuiceAppleBelchardChancelier);
		ListAppleJuice.add(BandbBeverages.itemJuiceAppleBelleDeBoskoop);
		ListAppleJuice.add(BandbBeverages.itemJuiceAppleBraeburn);
		ListAppleJuice.add(BandbBeverages.itemJuiceAppleElstar);
		ListAppleJuice.add(BandbBeverages.itemJuiceAppleFuji);
		ListAppleJuice.add(BandbBeverages.itemJuiceAppleGala);
		ListAppleJuice.add(BandbBeverages.itemJuiceAppleGolden);
		ListAppleJuice.add(BandbBeverages.itemJuiceAppleGrannySmith);
		ListAppleJuice.add(BandbBeverages.itemJuiceAppleHoneycrunch);
		ListAppleJuice.add(BandbBeverages.itemJuiceAppleJazz);
		ListAppleJuice.add(BandbBeverages.itemJuiceAppleJonagoldJonagored);
		ListAppleJuice.add(BandbBeverages.itemJuiceAppleLesRouges);
		ListAppleJuice.add(BandbBeverages.itemJuiceApplePinkLady);
		ListAppleJuice.add(BandbBeverages.itemJuiceAppleDuLimousin);
		ListAppleJuice.add(BandbBeverages.itemJuiceAppleReineDesReinettes);
		ListAppleJuice.add(BandbBeverages.itemJuiceAppleReinetteGriseDuCanada);
		ListAppleJuice.add(BandbBeverages.itemJuiceAppleTentation);
/*
		ListBottle.add(BandbBeverages.item1664WOLabel);
		ListBottle.add(BandbBeverages.itemAlsaceRieslingWOLabel);
		ListBottle.add(BandbBeverages.itemAmarettoWOLabel);
		ListBottle.add(BandbBeverages.itemAngosturaBitterWOLabel);
		ListBottle.add(BandbBeverages.itemBaileysWOLabel);
		ListBottle.add(BandbBeverages.itemBenedictineWOLabel);
		ListBottle.add(BandbBeverages.itemBenturColaWOLabel);
		ListBottle.add(BandbBeverages.itemBitterWOLabel);
		ListBottle.add(BandbBeverages.itemBlueCuracaoWOLabel);
		ListBottle.add(BandbBeverages.itemBottleChouchenWOLabel);
		ListBottle.add(BandbBeverages.itemBottlePastis51WOLabel);
		ListBottle.add(BandbBeverages.itemBottleLiqueurWOLabel);
		ListBottle.add(BandbBeverages.itemBottleWhiskeyWOLabel);
		ListBottle.add(BandbBeverages.itemBourgogneAligoteWOLabel);
		ListBottle.add(BandbBeverages.itemBrandyWOLabel);
		ListBottle.add(BandbBeverages.itemBrittWOLabel);
		ListBottle.add(BandbBeverages.itemCalvadosWOLabel);
		ListBottle.add(BandbBeverages.itemCampariWOLabel);
		ListBottle.add(BandbBeverages.itemCapCorseWOLabel);
		ListBottle.add(BandbBeverages.itemChampagneMummWOLabel);
		ListBottle.add(BandbBeverages.itemChartreuseJauneWOLabel);
		ListBottle.add(BandbBeverages.itemChartreuseVerteWOLabel);
		ListBottle.add(BandbBeverages.itemCiderKerneWOLabel);
		ListBottle.add(BandbBeverages.itemCognacWOLabel);
		ListBottle.add(BandbBeverages.itemCuracaoOrangeWOLabel);
		ListBottle.add(BandbBeverages.itemCuracaoTripleSecWOLabel);
		ListBottle.add(BandbBeverages.itemDesperadosWOLabel);
		ListBottle.add(BandbBeverages.itemDrambuieWOLabel);
		ListBottle.add(BandbBeverages.itemDubonnetRougeWOLabel);
		ListBottle.add(BandbBeverages.itemDuvelWOLabel);
		ListBottle.add(BandbBeverages.itemEnateWOLabel);
		ListBottle.add(BandbBeverages.itemFernetBrancaWOLabel);
		ListBottle.add(BandbBeverages.itemFleurOrangerWOLabel);
		ListBottle.add(BandbBeverages.itemGet27WOLabel);
		ListBottle.add(BandbBeverages.itemGinWOLabel);
		ListBottle.add(BandbBeverages.itemGrandMarnierWOLabel);
		ListBottle.add(BandbBeverages.itemGrimberWOLabel);
		ListBottle.add(BandbBeverages.itemGuinnessWOLabel);
		ListBottle.add(BandbBeverages.itemHeinekenWOLabel);
		ListBottle.add(BandbBeverages.itemHoneyWOLabel);
		ListBottle.add(BandbBeverages.itemLambigWOLabel);
		ListBottle.add(BandbBeverages.itemLeffeWOLabel);
		ListBottle.add(BandbBeverages.itemLimonadeWOLabel);
		ListBottle.add(BandbBeverages.itemPerrierWOLabel);
		ListBottle.add(BandbBeverages.itemPetrusWOLabel);
		ListBottle.add(BandbBeverages.itemPint);
		ListBottle.add(BandbBeverages.itemPiscoWOLabel);
		ListBottle.add(BandbBeverages.itemPommeauWOLabel);
		ListBottle.add(BandbBeverages.itemPontarlierWOLabel);
		ListBottle.add(BandbBeverages.itemRedMartiniWOLabel);
		ListBottle.add(BandbBeverages.itemRedPortWOLabel);
		ListBottle.add(BandbBeverages.itemRumWOLabel);
		ListBottle.add(BandbBeverages.itemSanMiguelWOLabel);
		ListBottle.add(BandbBeverages.itemSchweppesAgrumWOLabel);
		ListBottle.add(BandbBeverages.itemSchweppesDarkSideWOLabel);
		ListBottle.add(BandbBeverages.itemSchweppesGingerAleWOLabel);
		ListBottle.add(BandbBeverages.itemSchweppesLemonWOLabel);
		ListBottle.add(BandbBeverages.itemSchweppesMangoWOLabel);
		ListBottle.add(BandbBeverages.itemSchweppesPamplemousseWOLabel);
		ListBottle.add(BandbBeverages.itemSchweppesPassionWOLabel);
		ListBottle.add(BandbBeverages.itemSchweppesPechWOLabel);
		ListBottle.add(BandbBeverages.itemSchweppesPommeWOLabel);
		ListBottle.add(BandbBeverages.itemSchweppesRaisinWOLabel);
		ListBottle.add(BandbBeverages.itemSchweppesRicqlesWOLabel);
		ListBottle.add(BandbBeverages.itemScweppesTonicWOLabel);
		ListBottle.add(BandbBeverages.itemSkollWOLabel);
		ListBottle.add(BandbBeverages.itemSmirnoffWOLabel);
		ListBottle.add(BandbBeverages.itemSouthernComfortWOLabel);
		ListBottle.add(BandbBeverages.itemSyrupMoninWOLabel);
		ListBottle.add(BandbBeverages.itemTabascoWOLabel);
		ListBottle.add(BandbBeverages.itemTequilaWOLabel);
		ListBottle.add(BandbBeverages.itemVinegarWOLabel);
		ListBottle.add(BandbBeverages.itemVodkaWOLabel);
		ListBottle.add(BandbBeverages.itemWhiteMartiniWOLabel);
		ListBottle.add(BandbBeverages.itemWhitePortWOLabel);
		ListBottle.add(BandbBeverages.itemWorcestershireSauceWOLabel);
		ListBottle.add(BandbBeverages.itemXeresWOLabel);
		ListBottle.add(BandbBeverages.itemXIIWOLabel);
*/
		ListCoffeeCup.add(BandbItems.itemCupArpeggio);
		ListCoffeeCup.add(BandbItems.itemCupBukeelaKaEthiopia);
		ListCoffeeCup.add(BandbItems.itemCupCapriccio);
		ListCoffeeCup.add(BandbItems.itemCupCosi);
		ListCoffeeCup.add(BandbItems.itemCupDecaffeinato);
		ListCoffeeCup.add(BandbItems.itemCupDecaffeinatoIntenso);
		ListCoffeeCup.add(BandbItems.itemCupDecaffeinatoLungo);
		ListCoffeeCup.add(BandbItems.itemCupDharkan);
		ListCoffeeCup.add(BandbItems.itemCupDulsaoDoBrasil);
		ListCoffeeCup.add(BandbItems.itemCupFortissioLungo);
		ListCoffeeCup.add(BandbItems.itemCupIndriyaFromIndia);
		ListCoffeeCup.add(BandbItems.itemCupKazaar);
		ListCoffeeCup.add(BandbItems.itemCupLinizioLungo);
		ListCoffeeCup.add(BandbItems.itemCupLivanto);
		ListCoffeeCup.add(BandbItems.itemCupRistretto);
		ListCoffeeCup.add(BandbItems.itemCupRoma);
		ListCoffeeCup.add(BandbItems.itemCupRosabayaDeColombia);
		ListCoffeeCup.add(BandbItems.itemCupVivaltoLungo);

		ListGrape.add(BandbItems.itemGrapeAbouriou);
		ListGrape.add(BandbItems.itemGrapeAleaticu);
		ListGrape.add(BandbItems.itemGrapeAligote);
		ListGrape.add(BandbItems.itemGrapeAltesse);
		ListGrape.add(BandbItems.itemGrapeAramon);
		ListGrape.add(BandbItems.itemGrapeArbois);
		ListGrape.add(BandbItems.itemGrapeArrufiac);
		ListGrape.add(BandbItems.itemGrapeAubinVert);
		ListGrape.add(BandbItems.itemGrapeBarbarossa);
		ListGrape.add(BandbItems.itemGrapeBergeron);
		ListGrape.add(BandbItems.itemGrapeBiancone);
		ListGrape.add(BandbItems.itemGrapeBiancuGentile);
		ListGrape.add(BandbItems.itemGrapeBourboulenc);
		ListGrape.add(BandbItems.itemGrapeBraquet);
		ListGrape.add(BandbItems.itemGrapeCabernetFranc);
		ListGrape.add(BandbItems.itemGrapeCabernetSauvignon);
		ListGrape.add(BandbItems.itemGrapeCamarese);
		ListGrape.add(BandbItems.itemGrapeCarcaghjoluBiancu);
		ListGrape.add(BandbItems.itemGrapeCarcaghjoluNeru);
		ListGrape.add(BandbItems.itemGrapeCarignan);
		ListGrape.add(BandbItems.itemGrapeCesar);
		ListGrape.add(BandbItems.itemGrapeChardonnay);
		ListGrape.add(BandbItems.itemGrapeChenin);
		ListGrape.add(BandbItems.itemGrapeCinsault);
		ListGrape.add(BandbItems.itemGrapeClairette);
		ListGrape.add(BandbItems.itemGrapeColombard);
		ListGrape.add(BandbItems.itemGrapeCot);
		ListGrape.add(BandbItems.itemGrapeCounoise);
		ListGrape.add(BandbItems.itemGrapeCourbu);
		ListGrape.add(BandbItems.itemGrapeCudiverta);
		ListGrape.add(BandbItems.itemGrapeDuras);
		ListGrape.add(BandbItems.itemGrapeFerServadou);
		ListGrape.add(BandbItems.itemGrapeFolleBlanche);
		ListGrape.add(BandbItems.itemGrapeGamay);
		ListGrape.add(BandbItems.itemGrapeGewurztraminer);
		ListGrape.add(BandbItems.itemGrapeGrenache);
		ListGrape.add(BandbItems.itemGrapeGrenacheBlanc);
		ListGrape.add(BandbItems.itemGrapeGrolleau);
		ListGrape.add(BandbItems.itemGrapeGrosMenseng);
		ListGrape.add(BandbItems.itemGrapeJacquere);
		ListGrape.add(BandbItems.itemGrapeLenDeLEl);
		ListGrape.add(BandbItems.itemGrapeListan);
		ListGrape.add(BandbItems.itemGrapeMaccabeu);
		ListGrape.add(BandbItems.itemGrapeMalbec);
		ListGrape.add(BandbItems.itemGrapeMalvoisie);
		ListGrape.add(BandbItems.itemGrapeMarsanne);
		ListGrape.add(BandbItems.itemGrapeMarselan);
		ListGrape.add(BandbItems.itemGrapeMauzac);
		ListGrape.add(BandbItems.itemGrapeMelon);
		ListGrape.add(BandbItems.itemGrapeMelonDeBourgogne);
		ListGrape.add(BandbItems.itemGrapeMerlot);
		ListGrape.add(BandbItems.itemGrapeMolette);
		ListGrape.add(BandbItems.itemGrapeMollard);
		ListGrape.add(BandbItems.itemGrapeMondeuse);
		ListGrape.add(BandbItems.itemGrapeMondeuseBlanche);
		ListGrape.add(BandbItems.itemGrapeMourvedre);
		ListGrape.add(BandbItems.itemGrapeMuscadelle);
		ListGrape.add(BandbItems.itemGrapeMuscardin);
		ListGrape.add(BandbItems.itemGrapeMuscatBlancAPetitsGrains);
		ListGrape.add(BandbItems.itemGrapeMuscatDAlexandrie);
		ListGrape.add(BandbItems.itemGrapeNegrette);
		ListGrape.add(BandbItems.itemGrapeNielluccio);
		ListGrape.add(BandbItems.itemGrapePagaDebiti);
		ListGrape.add(BandbItems.itemGrapePetitCourbu);
		ListGrape.add(BandbItems.itemGrapePetitMenseng);
		ListGrape.add(BandbItems.itemGrapePetitVerdot);
		ListGrape.add(BandbItems.itemGrapePineauDAunis);
		ListGrape.add(BandbItems.itemGrapePinotBlanc);
		ListGrape.add(BandbItems.itemGrapePinotMeunier);
		ListGrape.add(BandbItems.itemGrapePinotNoir);
		ListGrape.add(BandbItems.itemGrapePiquepoul);
		ListGrape.add(BandbItems.itemGrapePoulsard);
		ListGrape.add(BandbItems.itemGrapeRiesling);
		ListGrape.add(BandbItems.itemGrapeRomorantin);
		ListGrape.add(BandbItems.itemGrapeRossulaBianca);
		ListGrape.add(BandbItems.itemGrapeSacy);
		ListGrape.add(BandbItems.itemGrapeSauvignon);
		ListGrape.add(BandbItems.itemGrapeSavagnin);
		ListGrape.add(BandbItems.itemGrapeSemillon);
		ListGrape.add(BandbItems.itemGrapeSylvaner);
		ListGrape.add(BandbItems.itemGrapeSyrah);
		ListGrape.add(BandbItems.itemGrapeTannat);
		ListGrape.add(BandbItems.itemGrapeTeoulier);
		ListGrape.add(BandbItems.itemGrapeTerretNoir);
		ListGrape.add(BandbItems.itemGrapeTibouren);
		ListGrape.add(BandbItems.itemGrapeTressalier);
		ListGrape.add(BandbItems.itemGrapeUgniBlanc);
		ListGrape.add(BandbItems.itemGrapeVaccarese);
		ListGrape.add(BandbItems.itemGrapeViognier);
		ListGrape.add(BandbItems.itemGrapeVermentinu);
		
		/*
		ListLabels.add(BandbItems.itemAlsaceRieslingLabel);
		ListLabels.add(BandbItems.itemAmarettoLabel);
		ListLabels.add(BandbItems.itemAngosturaBitterLabel);
		ListLabels.add(BandbItems.itemBaileysLabel);
		ListLabels.add(BandbItems.itemBenedictineLabel);
		ListLabels.add(BandbItems.itemBenturColaLabel);
		ListLabels.add(BandbItems.itemBitterLabel);
		ListLabels.add(BandbItems.itemBlueCuracaoLabel);
		ListLabels.add(BandbItems.itemBordeauxLaryLabel);
		ListLabels.add(BandbItems.itemBordeauxTourLabel);
		ListLabels.add(BandbItems.itemBourgogneAligoteLabel);
		ListLabels.add(BandbItems.itemBrandyLabel);
		ListLabels.add(BandbItems.itemCalvadosLabel);
		ListLabels.add(BandbItems.itemCampariLabel);
		ListLabels.add(BandbItems.itemCapCorseLabel);
		ListLabels.add(BandbItems.itemChampagneMummLabel);
		ListLabels.add(BandbItems.itemChartreuseJauneLabel);
		ListLabels.add(BandbItems.itemChartreuseVerteLabel);
		ListLabels.add(BandbItems.itemChouchenLabel);
		ListLabels.add(BandbItems.itemCiderLabel);
		ListLabels.add(BandbItems.itemCognacLabel);
		ListLabels.add(BandbItems.itemCuracaoTripleSecLabel);
		ListLabels.add(BandbItems.itemCuracaoOrangeLabel);
		ListLabels.add(BandbItems.itemDrambuieLabel);
		ListLabels.add(BandbItems.itemDubonnetRougeLabel);
		ListLabels.add(BandbItems.itemEnateLabel);
		ListLabels.add(BandbItems.itemFernetBrancaLabel);
		ListLabels.add(BandbItems.itemFleurOrangerLabel);
		ListLabels.add(BandbItems.itemGinLabel);
		ListLabels.add(BandbItems.itemGrandMarnierLabel);
		ListLabels.add(BandbItems.itemGuinnessLabel);
		ListLabels.add(BandbItems.itemHeinekenLabel);
		ListLabels.add(BandbItems.itemLabelBritt);
		ListLabels.add(BandbItems.itemLabel1664);
		ListLabels.add(BandbItems.itemLabelDesperados);
		ListLabels.add(BandbItems.itemLabelDuvel);
		ListLabels.add(BandbItems.itemLabelGet27);
		ListLabels.add(BandbItems.itemLabelGrimbergen);
		ListLabels.add(BandbItems.itemLabelHoney);
		ListLabels.add(BandbItems.itemLabelLeffe);
		ListLabels.add(BandbItems.itemLabelSanMiguel);
		ListLabels.add(BandbItems.itemLabelSchweppesAgrum);
		ListLabels.add(BandbItems.itemLabelSchweppesDarkSide);
		ListLabels.add(BandbItems.itemLabelSchweppesLemon);
		ListLabels.add(BandbItems.itemLabelSchweppesMango);
		ListLabels.add(BandbItems.itemLabelSchweppesPamplemousse);
		ListLabels.add(BandbItems.itemLabelSchweppesPassion);
		ListLabels.add(BandbItems.itemLabelSchweppesPech);
		ListLabels.add(BandbItems.itemLabelSchweppesPomme);
		ListLabels.add(BandbItems.itemLabelSchweppesRaisin);
		ListLabels.add(BandbItems.itemLabelSchweppesRicqles);
		ListLabels.add(BandbItems.itemLabelSkoll);
		ListLabels.add(BandbItems.itemLabelSmirnoff);
		ListLabels.add(BandbItems.itemLabelXII);
		ListLabels.add(BandbItems.itemLambigLabel);
		ListLabels.add(BandbItems.itemLimonadeLabel);
		ListLabels.add(BandbItems.itemLiquorLabel);
		ListLabels.add(BandbItems.itemPastis51Label);
		ListLabels.add(BandbItems.itemPerrierLabel);
		ListLabels.add(BandbItems.itemPetrusLabel);
		ListLabels.add(BandbItems.itemPiscoLabel);
		ListLabels.add(BandbItems.itemPommeauLabel);
		ListLabels.add(BandbItems.itemPontarlierLabel);
		ListLabels.add(BandbItems.itemRedMartiniLabel);
		ListLabels.add(BandbItems.itemRedPortLabel);
		ListLabels.add(BandbItems.itemSchweppesGingerAleLabel);
		ListLabels.add(BandbItems.itemRumLabel);
		ListLabels.add(BandbItems.itemSchweppesTonicLabel);
		ListLabels.add(BandbItems.itemSiropMoninOrangeLabel);
		ListLabels.add(BandbItems.itemSouthernComfortLabel);
		ListLabels.add(BandbItems.itemTabascoLabel);
		ListLabels.add(BandbItems.itemTequilaLabel);
		ListLabels.add(BandbItems.itemVinegarLabel);
		ListLabels.add(BandbItems.itemVodkaLabel);
		ListLabels.add(BandbItems.itemWhiskeyLabel);
		ListLabels.add(BandbItems.itemWhiteMartiniLabel);
		ListLabels.add(BandbItems.itemWhitePortLabel);
		ListLabels.add(BandbItems.itemWorcestershireSauceLabel);
		ListLabels.add(BandbItems.itemXeresLabel);
			
		 */
		
		ListPineapple.add(BandbItems.itemPineappleVictoria);
		ListPineapple.add(BandbItems.itemPineappleCayenne);
		
		ListPineapplejuice.add(BandbBeverages.itemJuicePineappleVictoria);
		ListPineapplejuice.add(BandbBeverages.itemJuicePineappleCayenneLisse);

		ListTeaCup.add(BandbItems.itemLemonTea);
		ListTeaCup.add(BandbItems.itemMatchaGreenTea);
		ListTeaCup.add(BandbItems.itemPeachTea);
		ListTeaCup.add(BandbItems.itemRaspberryTea);
		ListTeaCup.add(BandbItems.itemChaiTea);


	}

}
