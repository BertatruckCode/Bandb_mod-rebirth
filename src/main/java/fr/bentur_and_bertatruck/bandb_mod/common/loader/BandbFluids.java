package fr.bentur_and_bertatruck.bandb_mod.common.loader;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.fluids.Fluid;
import cpw.mods.fml.common.registry.GameRegistry;
import fr.bentur_and_bertatruck.bandb_mod.common.fluid.*;

public class BandbFluids {
	
	public static Fluid fluidMoltenGlass;
	public static Block blockMoltenGlass;
	
	public static Fluid fluidWin;
	public static Block blockWin;
	
	public static Fluid fluidBenedictine;
	public static Block blockBenedictine;
	
	public static Fluid fluidCapCorse;
	public static Block blockCapCorse;
	
	public static Fluid fluidBaileys;
	public static Block blockBaileys;
	
	public static Fluid fluidCampari;
	public static Block blockCampari;
	
	public static Fluid fluidChartreuseVerte;
	public static Block blockChartreuseVerte;
	
	public static Fluid fluidWorcestershireSauce;
	public static Block blockWorcestershireSauce;
	
	public static Fluid fluidVodka;
	public static Block blockVodka;
	
	public static Fluid fluidWhiskey;
	public static Block blockWhiskey;
	
	public static Fluid fluidWhiteMartini;
	public static Block blockWhiteMartini;
	
	public static Fluid fluidBlueCuracao;
	public static Block blockBlueCuracao;
	
	public static Fluid fluidAmaretto;
	public static Block blockAmaretto;
	
	public static Fluid fluidBitter;
	public static Block blockBitter;
	
	public static Fluid fluidCuracaoOrange;
	public static Block blockCuracaoOrange;
	
	public static Fluid fluidGin;
	public static Block blockGin;
	
	public static Fluid fluidWhiteRum;
	public static Block blockWhiteRum;
	
	public static Fluid fluidBrownRum;
	public static Block blockBrownRum;
	
	public static Fluid fluidWhitePort;
	public static Block blockWhitePort;
	
	public static Fluid fluidRedPort;
	public static Block blockRedPort;
	
	public static Fluid fluidLambig;
	public static Block blockLambig;
	
	public static Fluid fluidCuracaoTripleSec;
	public static Block blockCuracaoTripleSec;
	
	public static Fluid fluidAngosturaBitter;
	public static Block blockAngosturaBitter;
	
	public static Fluid fluidTequila;
	public static Block blockTequila;
	
	public static Fluid fluidRedMartini;
	public static Block blockRedMartini;
	
	public static Fluid fluidPastis51;
	public static Block blockPastis51;
	
	public static Fluid fluidPommeau;
	public static Block blockPommeau;
	
	public static Fluid fluidChampagne;
	public static Block blockChampagne;

	public static Fluid fluidWhiteWine;
	public static Block blockWhiteWine;

	public static Fluid fluidVinegar;
	public static Block blockVinegar;

	public static Fluid fluidTabasco;
	public static Block blockTabasco;

	public static Fluid fluidDrambuie;
	public static Block blockDrambuie;

	public static Fluid fluidDubonnetRouge;
	public static Block blockDubonnetRouge;

	public static Fluid fluidPontarlier;
	public static Block blockPontarlier;

	public static Fluid fluidCognac;
	public static Block blockCognac;

	public static Fluid fluidCider;
	public static Block blockCider;

	public static Fluid fluidChouchen;
	public static Block blockChouchen;

	public static Fluid fluidCalvados;
	public static Block blockCalvados;

	public static Fluid fluidFernetBranca;
	public static Block blockFernetBranca;

	public static Fluid fluidPisco;
	public static Block blockPisco;

	public static Fluid fluidChartreuseJaune;
	public static Block blockChartreuseJaune;

	public static Fluid fluidLimonade;
	public static Block blockLimonade;

	public static Fluid fluidGrandMarnier;
	public static Block blockGrandMarnier;

	public static Fluid fluidFleurOranger;
	public static Block blockFleurOranger;

	public static Fluid fluidBenturCola;
	public static Block blockBenturCola;

	public static Fluid fluidPerrier;
	public static Block blockPerrier;

	public static Fluid fluidGet27;
	public static Block blockGet27;

	public static Fluid fluidSouthernComfort;
	public static Block blockSouthernComfort;

	public static Fluid fluidHoney;
	public static Block blockHoney;

	public static Fluid fluidSchweppesTonic;
	public static Block blockSchweppesTonic;

	public static Fluid fluidSchweppesLemon;
	public static Block blockSchweppesLemon;

	public static Fluid fluidSchweppesPamplemousse;
	public static Block blockSchweppesPamplemousse;

	public static Fluid fluidSchweppesMango;
	public static Block blockSchweppesMango;

	public static Fluid fluidSchweppesPech;
	public static Block blockSchweppesPech;

	public static Fluid fluidSchweppesPassion;
	public static Block blockSchweppesPassion;

	public static Fluid fluidSchweppesGingerAle;
	public static Block blockSchweppesGingerAle;

	public static Fluid fluidSchweppesAgrum;
	public static Block blockSchweppesAgrum;

	public static Fluid fluidSchweppesRicqles;
	public static Block blockSchweppesRicqles;

	public static Fluid fluidSchweppesPomm;
	public static Block blockSchweppesPomm;

	public static Fluid fluidSchweppesDarkSide;
	public static Block blockSchweppesDarkSide;
	
	public static Fluid fluidSchweppesRaisin;
	public static Block blockSchweppesRaisin;
	
	public static Fluid fluidLeffe;
	public static Block blockLeffe;

	public static Fluid fluidSkoll;
	public static Block blockSkoll;

	public static Fluid fluid;
	public static Block block;


	
	public static void preInit(){				
		
		fluidMoltenGlass = new FluidMoltenGlass().setUnlocalizedName("fluidMoltenGlass");
		blockMoltenGlass = new BlockFluidMoltenGlass(fluidMoltenGlass, Material.water).setCreativeTab(BandbCreativeTabs.CreativeTabsFluid).setBlockName("blockMoltenGlass");
		GameRegistry.registerBlock(blockMoltenGlass, "blockMoltenGlass");
		
		fluidWin = new FluidWin().setUnlocalizedName("fluidWin");
		blockWin = new BlockFluidWin(fluidWin, Material.water).setCreativeTab(BandbCreativeTabs.CreativeTabsFluid).setBlockName("blockWin");
		GameRegistry.registerBlock(blockWin, "blockWin");
		
		fluidBenedictine = new FluidBenedictine().setUnlocalizedName("fluidBenedictine");
		blockBenedictine = new BlockFluidBenedictine(fluidBenedictine, Material.water).setCreativeTab(BandbCreativeTabs.CreativeTabsFluid).setBlockName("blockBenedictine");
		GameRegistry.registerBlock(blockBenedictine, "blockBenedictine");
		
		fluidCapCorse = new FluidCapCorse().setUnlocalizedName("fluidCapCorse");
		blockCapCorse = new BlockFluidCapCorse(fluidCapCorse, Material.water).setCreativeTab(BandbCreativeTabs.CreativeTabsFluid).setBlockName("blockCapCorse");
		GameRegistry.registerBlock(blockCapCorse, "blockCapCorse");
		
		fluidPerrier = new FluidPerrier().setUnlocalizedName("fluidPerrier");
		blockPerrier = new BlockFluidPerrier(fluidPerrier, Material.water).setCreativeTab(BandbCreativeTabs.CreativeTabsFluid).setBlockName("blockPerrier");
		GameRegistry.registerBlock(blockPerrier, "blockPerrier");
		
		fluidGet27 = new FluidGet27().setUnlocalizedName("fluidGet27");
		blockGet27 = new BlockFluidGet27(fluidGet27, Material.water).setCreativeTab(BandbCreativeTabs.CreativeTabsFluid).setBlockName("blockGet27");
		GameRegistry.registerBlock(blockGet27, "blockGet27");
		
		fluidSouthernComfort = new FluidSouthernComfort().setUnlocalizedName("fluidSouthernComfort");
		blockSouthernComfort = new BlockFluidSouthernComfort(fluidSouthernComfort, Material.water).setCreativeTab(BandbCreativeTabs.CreativeTabsFluid).setBlockName("blockSouthernComfort");
		GameRegistry.registerBlock(blockSouthernComfort, "blockSouthernComfort");
		
		fluidChartreuseJaune = new FluidChartreuseJaune().setUnlocalizedName("fluidChartreuseJaune");
		blockChartreuseJaune = new BlockFluidChartreuseJaune(fluidChartreuseJaune, Material.water).setCreativeTab(BandbCreativeTabs.CreativeTabsFluid).setBlockName("blockChartreuseJaune");
		GameRegistry.registerBlock(blockChartreuseJaune, "blockChartreuseJaune");
		
		fluidLimonade = new FluidLimonade().setUnlocalizedName("fluidLimonade");
		blockLimonade = new BlockFluidLimonade(fluidLimonade, Material.water).setCreativeTab(BandbCreativeTabs.CreativeTabsFluid).setBlockName("blockLimonade");
		GameRegistry.registerBlock(blockLimonade, "blockLimonade");
		
		fluidGrandMarnier = new FluidGrandMarnier().setUnlocalizedName("fluidGrandMarnier");
		blockGrandMarnier = new BlockFluidGrandMarnier(fluidGrandMarnier, Material.water).setCreativeTab(BandbCreativeTabs.CreativeTabsFluid).setBlockName("blockGrandMarnier");
		GameRegistry.registerBlock(blockGrandMarnier, "blockGrandMarnier");
		
		fluidFleurOranger = new FluidFleurOranger().setUnlocalizedName("fluidFleurOranger");
		blockFleurOranger = new BlockFluidFleurOranger(fluidFleurOranger, Material.water).setCreativeTab(BandbCreativeTabs.CreativeTabsFluid).setBlockName("blockFleurOranger");
		GameRegistry.registerBlock(blockFleurOranger, "blockFleurOranger");
	
		fluidBenturCola = new FluidBenturCola().setUnlocalizedName("fluidBenturCola");
		blockBenturCola = new BlockFluidBenturCola(fluidBenturCola, Material.water).setCreativeTab(BandbCreativeTabs.CreativeTabsFluid).setBlockName("blockBenturCola");
		GameRegistry.registerBlock(blockBenturCola, "blockBenturCola");
		
		fluidHoney = new FluidHoney().setUnlocalizedName("fluidHoney");
		blockHoney = new BlockFluidHoney(fluidHoney, Material.water).setCreativeTab(BandbCreativeTabs.CreativeTabsFluid).setBlockName("blockHoney");
		GameRegistry.registerBlock(blockHoney, "blockHoney");
		
		fluidAngosturaBitter = new FluidAngosturaBitter().setUnlocalizedName("fluidAngosturaBitter");
		blockAngosturaBitter = new BlockFluidAngosturaBitter(fluidAngosturaBitter, Material.water).setCreativeTab(BandbCreativeTabs.CreativeTabsFluid).setBlockName("blockAngosturaBitter");
		GameRegistry.registerBlock(blockAngosturaBitter, "blockAngosturaBitter");
		
		fluidCognac = new FluidCognac().setUnlocalizedName("fluidCognac");
		blockCognac = new BlockFluidCognac(fluidCognac, Material.water).setCreativeTab(BandbCreativeTabs.CreativeTabsFluid).setBlockName("blockCognac");
		GameRegistry.registerBlock(blockCognac, "blockCognac");
		
		fluidCider = new FluidCider().setUnlocalizedName("fluidCider");
		blockCider = new BlockFluidCider(fluidCider, Material.water).setCreativeTab(BandbCreativeTabs.CreativeTabsFluid).setBlockName("blockCider");
		GameRegistry.registerBlock(blockCider, "blockCider");
		
		fluidChouchen = new FluidChouchen().setUnlocalizedName("fluidChouchen");
		blockChouchen = new BlockFluidChouchen(fluidChouchen, Material.water).setCreativeTab(BandbCreativeTabs.CreativeTabsFluid).setBlockName("blockChouchen");
		GameRegistry.registerBlock(blockChouchen, "blockChouchen");
		
		fluidCalvados = new FluidCalvados().setUnlocalizedName("fluidCalvados");
		blockCalvados = new BlockFluidCalvados(fluidCalvados, Material.water).setCreativeTab(BandbCreativeTabs.CreativeTabsFluid).setBlockName("blockCalvados");
		GameRegistry.registerBlock(blockCalvados, "blockCalvados");
		
		fluidFernetBranca = new FluidFernetBranca().setUnlocalizedName("fluidFernetBranca");
		blockFernetBranca = new BlockFluidFernetBranca(fluidFernetBranca, Material.water).setCreativeTab(BandbCreativeTabs.CreativeTabsFluid).setBlockName("blockFernetBranca");
		GameRegistry.registerBlock(blockFernetBranca, "blockFernetBranca");
		
		fluidPisco = new FluidPisco().setUnlocalizedName("fluidPisco");
		blockPisco = new BlockFluidPisco(fluidPisco, Material.water).setCreativeTab(BandbCreativeTabs.CreativeTabsFluid).setBlockName("blockPisco");
		GameRegistry.registerBlock(blockPisco, "blockPisco");
		
		fluidVinegar = new FluidVinegar().setUnlocalizedName("fluidVinegar");
		blockVinegar = new BlockFluidVinegar(fluidVinegar, Material.water).setCreativeTab(BandbCreativeTabs.CreativeTabsFluid).setBlockName("blockVinegar");
		GameRegistry.registerBlock(blockVinegar, "blockVinegar");
		
		fluidTabasco = new FluidTabasco().setUnlocalizedName("fluidTabasco");
		blockTabasco = new BlockFluidTabasco(fluidTabasco, Material.lava).setCreativeTab(BandbCreativeTabs.CreativeTabsFluid).setBlockName("blockTabasco");
		GameRegistry.registerBlock(blockTabasco, "blockTabasco");
		
		fluidDrambuie = new FluidDrambuie().setUnlocalizedName("fluidDrambuie");
		blockDrambuie = new BlockFluidDrambuie(fluidDrambuie, Material.water).setCreativeTab(BandbCreativeTabs.CreativeTabsFluid).setBlockName("blockDrambuie");
		GameRegistry.registerBlock(blockDrambuie, "blockDrambuie");
		
		fluidDubonnetRouge = new FluidDubonnetRouge().setUnlocalizedName("fluidDubonnetRouge");
		blockDubonnetRouge = new BlockFluidDubonnetRouge(fluidDubonnetRouge, Material.water).setCreativeTab(BandbCreativeTabs.CreativeTabsFluid).setBlockName("blockDubonnetRouge");
		GameRegistry.registerBlock(blockDubonnetRouge, "blockDubonnetRouge");
		
		fluidPontarlier = new FluidPontarlier().setUnlocalizedName("fluidPontarlier");
		blockPontarlier = new BlockFluidPontarlier(fluidPontarlier, Material.water).setCreativeTab(BandbCreativeTabs.CreativeTabsFluid).setBlockName("blockPontarlier");
		GameRegistry.registerBlock(blockPontarlier, "blockPontarlier");
		
		fluidCuracaoTripleSec = new FluidCuracaoTripleSec().setUnlocalizedName("fluidCuracaoTripleSec");
		blockCuracaoTripleSec = new BlockFluidCuracaoTripleSec(fluidCuracaoTripleSec, Material.water).setCreativeTab(BandbCreativeTabs.CreativeTabsFluid).setBlockName("blockCuracaoTripleSec");
		GameRegistry.registerBlock(blockCuracaoTripleSec, "blockCuracaoTripleSec");
		
		fluidTequila = new FluidTequila().setUnlocalizedName("fluidTequila");
		blockTequila = new BlockFluidTequila(fluidTequila, Material.water).setCreativeTab(BandbCreativeTabs.CreativeTabsFluid).setBlockName("blockTequila");
		GameRegistry.registerBlock(blockTequila, "blockTequila");
		
		fluidRedMartini = new FluidRedMartini().setUnlocalizedName("fluidRedMartini");
		blockRedMartini = new BlockFluidRedMartini(fluidRedMartini, Material.water).setCreativeTab(BandbCreativeTabs.CreativeTabsFluid).setBlockName("blockRedMartini");
		GameRegistry.registerBlock(blockRedMartini, "blockRedMartini");
		
		fluidPastis51 = new FluidPastis51().setUnlocalizedName("fluidPastis51");
		blockPastis51 = new BlockFluidPastis51(fluidPastis51, Material.water).setCreativeTab(BandbCreativeTabs.CreativeTabsFluid).setBlockName("blockPastis51");
		GameRegistry.registerBlock(blockPastis51, "blockPastis51");
		
		fluidPommeau = new FluidPommeau().setUnlocalizedName("fluidPommeau");
		blockPommeau = new BlockFluidPommeau(fluidPommeau, Material.water).setCreativeTab(BandbCreativeTabs.CreativeTabsFluid).setBlockName("blockPommeau");
		GameRegistry.registerBlock(blockPommeau, "blockPommeau");
		
		fluidChampagne = new FluidChampagne().setUnlocalizedName("fluidChampagne");
		blockChampagne = new BlockFluidChampagne(fluidChampagne, Material.water).setCreativeTab(BandbCreativeTabs.CreativeTabsFluid).setBlockName("blockChampagne");
		GameRegistry.registerBlock(blockChampagne, "blockChampagne");
			
		fluidWhiteWine = new FluidWhiteWine().setUnlocalizedName("fluidWhiteWine");
		blockWhiteWine = new BlockFluidWhiteWine(fluidWhiteWine, Material.water).setCreativeTab(BandbCreativeTabs.CreativeTabsFluid).setBlockName("blockWhiteWine");
		GameRegistry.registerBlock(blockWhiteWine, "blockWhiteWine");
		
		fluidGin = new FluidGin().setUnlocalizedName("fluidGin");
		blockGin = new BlockFluidGin(fluidGin, Material.water).setCreativeTab(BandbCreativeTabs.CreativeTabsFluid).setBlockName("blockGin");
		GameRegistry.registerBlock(blockGin, "blockGin");
		
		fluidWhiteRum = new FluidWhiteRum().setUnlocalizedName("fluidWhiteRum");
		blockWhiteRum = new BlockFluidWhiteRum(fluidWhiteRum, Material.water).setCreativeTab(BandbCreativeTabs.CreativeTabsFluid).setBlockName("blockWhiteRum");
		GameRegistry.registerBlock(blockWhiteRum, "blockWhiteRum");
		
		fluidBrownRum = new FluidBrownRum().setUnlocalizedName("fluidBrownRum");
		blockBrownRum = new BlockFluidBrownRum(fluidBrownRum, Material.water).setCreativeTab(BandbCreativeTabs.CreativeTabsFluid).setBlockName("blockBrownRum");
		GameRegistry.registerBlock(blockBrownRum, "blockBrownRum");
		
		fluidWhitePort = new FluidWhitePort().setUnlocalizedName("fluidWhitePort");
		blockWhitePort = new BlockFluidWhitePort(fluidWhitePort, Material.water).setCreativeTab(BandbCreativeTabs.CreativeTabsFluid).setBlockName("blockWhitePort");
		GameRegistry.registerBlock(blockWhitePort, "blockWhitePort");
		
		fluidRedPort = new FluidRedPort().setUnlocalizedName("fluidRedPort");
		blockRedPort = new BlockFluidRedPort(fluidRedPort, Material.water).setCreativeTab(BandbCreativeTabs.CreativeTabsFluid).setBlockName("blockRedPort");
		GameRegistry.registerBlock(blockRedPort, "blockRedPort");
		
		fluidLambig = new FluidLambig().setUnlocalizedName("fluidLambig");
		blockLambig = new BlockFluidLambig(fluidLambig, Material.water).setCreativeTab(BandbCreativeTabs.CreativeTabsFluid).setBlockName("blockLambig");
		GameRegistry.registerBlock(blockLambig, "blockLambig");
		
		fluidBaileys = new FluidBaileys().setUnlocalizedName("fluidBaileys");
		blockBaileys = new BlockFluidBaileys(fluidBaileys, Material.water).setCreativeTab(BandbCreativeTabs.CreativeTabsFluid).setBlockName("blockBaileys");
		GameRegistry.registerBlock(blockBaileys, "blockBaileys");
		
		fluidCampari = new FluidCampari().setUnlocalizedName("fluidCampari");
		blockCampari = new BlockFluidCampari(fluidCampari, Material.water).setCreativeTab(BandbCreativeTabs.CreativeTabsFluid).setBlockName("blockCampari");
		GameRegistry.registerBlock(blockCampari, "blockCampari");
		
		fluidChartreuseVerte = new FluidChartreuseVerte().setUnlocalizedName("fluidChartreuseVerte");
		blockChartreuseVerte = new BlockFluidChartreuseVerte(fluidChartreuseVerte, Material.water).setCreativeTab(BandbCreativeTabs.CreativeTabsFluid).setBlockName("blockChartreuseVerte");
		GameRegistry.registerBlock(blockChartreuseVerte, "blockChartreuseVerte");
		
		fluidWorcestershireSauce = new FluidWorcestershireSauce().setUnlocalizedName("fluidWorcestershireSauce");
		blockWorcestershireSauce = new BlockFluidWorcestershireSauce(fluidWorcestershireSauce, Material.lava).setCreativeTab(BandbCreativeTabs.CreativeTabsFluid).setBlockName("blockWorcestershireSauce");
		GameRegistry.registerBlock(blockWorcestershireSauce, "blockWorcestershireSauce");
		
		fluidVodka = new FluidVodka().setUnlocalizedName("fluidVodka");
		blockVodka = new BlockFluidVodka(fluidVodka, Material.water).setCreativeTab(BandbCreativeTabs.CreativeTabsFluid).setBlockName("blockVodka");
		GameRegistry.registerBlock(blockVodka, "blockVodka");
		
		fluidWhiskey = new FluidWhiskey().setUnlocalizedName("fluidWhiskey");
		blockWhiskey = new BlockFluidWhiskey(fluidWhiskey, Material.water).setCreativeTab(BandbCreativeTabs.CreativeTabsFluid).setBlockName("blockWhiskey");
		GameRegistry.registerBlock(blockWhiskey, "blockWhiskey");
		
		fluidWhiteMartini = new FluidWhiteMartini().setUnlocalizedName("fluidWhiteMartini");
		blockWhiteMartini = new BlockFluidWhiteMartini(fluidWhiteMartini, Material.water).setCreativeTab(BandbCreativeTabs.CreativeTabsFluid).setBlockName("blockWhiteMartini");
		GameRegistry.registerBlock(blockWhiteMartini, "blockWhiteMartini");
		
		fluidBlueCuracao = new FluidBlueCuracao().setUnlocalizedName("fluidBlueCuracao");
		blockBlueCuracao = new BlockFluidBlueCuracao(fluidBlueCuracao, Material.water).setCreativeTab(BandbCreativeTabs.CreativeTabsFluid).setBlockName("blockBlueCuracao");
		GameRegistry.registerBlock(blockBlueCuracao, "blockBlueCuracao");
		
		fluidAmaretto = new FluidAmaretto().setUnlocalizedName("fluidAmaretto");
		blockAmaretto = new BlockFluidAmaretto(fluidAmaretto, Material.water).setCreativeTab(BandbCreativeTabs.CreativeTabsFluid).setBlockName("blockAmaretto");
		GameRegistry.registerBlock(blockAmaretto, "blockAmaretto");
		
		fluidBitter = new FluidBitter().setUnlocalizedName("fluidBitter");
		blockBitter = new BlockFluidBitter(fluidBitter, Material.water).setCreativeTab(BandbCreativeTabs.CreativeTabsFluid).setBlockName("blockBitter");
		GameRegistry.registerBlock(blockBitter, "blockBitter");
		
		fluidCuracaoOrange = new FluidCuracaoOrange().setUnlocalizedName("fluidCuracaoOrange");
		blockCuracaoOrange = new BlockFluidCuracaoOrange(fluidCuracaoOrange, Material.water).setCreativeTab(BandbCreativeTabs.CreativeTabsFluid).setBlockName("blockCuracaoOrange");
		GameRegistry.registerBlock(blockCuracaoOrange, "blockCuracaoOrange");
		
		fluidSchweppesTonic = new FluidSchweppesTonic().setUnlocalizedName("fluidSchweppesTonic");
		blockSchweppesTonic = new BlockFluidSchweppesTonic(fluidSchweppesTonic, Material.water).setCreativeTab(BandbCreativeTabs.CreativeTabsFluid).setBlockName("blockSchweppesTonic");
		GameRegistry.registerBlock(blockSchweppesTonic, "blockSchweppesTonic");
	
		fluidSchweppesGingerAle = new FluidSchweppesGingerAle().setUnlocalizedName("fluidSchweppesGingerAle");
		blockSchweppesGingerAle = new BlockFluidSchweppesGingerAle(fluidSchweppesGingerAle, Material.water).setCreativeTab(BandbCreativeTabs.CreativeTabsFluid).setBlockName("blockSchweppesGingerAle");
		GameRegistry.registerBlock(blockSchweppesGingerAle, "blockSchweppesGingerAle");
	
		fluidSchweppesAgrum = new FluidSchweppesAgrum().setUnlocalizedName("fluidSchweppesAgrum");
		blockSchweppesAgrum = new BlockFluidSchweppesAgrum(fluidSchweppesAgrum, Material.water).setCreativeTab(BandbCreativeTabs.CreativeTabsFluid).setBlockName("blockSchweppesAgrum");
		GameRegistry.registerBlock(blockSchweppesAgrum, "blockSchweppesAgrum");
	
		fluidSchweppesRicqles = new FluidSchweppesRicqles().setUnlocalizedName("fluidSchweppesRicqles");
		blockSchweppesRicqles = new BlockFluidSchweppesRicqles(fluidSchweppesRicqles, Material.water).setCreativeTab(BandbCreativeTabs.CreativeTabsFluid).setBlockName("blockSchweppesRicqles");
		GameRegistry.registerBlock(blockSchweppesRicqles, "blockSchweppesRicqles");
	
		fluidSchweppesPomm = new FluidSchweppesPomm().setUnlocalizedName("fluidSchweppesPomm");
		blockSchweppesPomm = new BlockFluidSchweppesPomm(fluidSchweppesPomm, Material.water).setCreativeTab(BandbCreativeTabs.CreativeTabsFluid).setBlockName("blockSchweppesPomm");
		GameRegistry.registerBlock(blockSchweppesPomm, "blockSchweppesPomm");
	
		fluidSchweppesDarkSide = new FluidSchweppesDarkSide().setUnlocalizedName("fluidSchweppesDarkSide");
		blockSchweppesDarkSide = new BlockFluidSchweppesDarkSide(fluidSchweppesDarkSide, Material.water).setCreativeTab(BandbCreativeTabs.CreativeTabsFluid).setBlockName("blockSchweppesDarkSide");
		GameRegistry.registerBlock(blockSchweppesDarkSide, "blockSchweppesDarkSide");
	
		fluidSchweppesLemon = new FluidSchweppesLemon().setUnlocalizedName("fluidSchweppesLemon");
		blockSchweppesLemon = new BlockFluidSchweppesLemon(fluidSchweppesLemon, Material.water).setCreativeTab(BandbCreativeTabs.CreativeTabsFluid).setBlockName("blockSchweppesLemon");
		GameRegistry.registerBlock(blockSchweppesLemon, "blockSchweppesLemon");
	
		fluidSchweppesPamplemousse = new FluidSchweppesPamplemousse().setUnlocalizedName("fluidSchweppesPamplemousse");
		blockSchweppesPamplemousse = new BlockFluidSchweppesPamplemousse(fluidSchweppesPamplemousse, Material.water).setCreativeTab(BandbCreativeTabs.CreativeTabsFluid).setBlockName("blockSchweppesPamplemousse");
		GameRegistry.registerBlock(blockSchweppesPamplemousse, "blockSchweppesPamplemousse");
	
		fluidSchweppesMango = new FluidSchweppesMango().setUnlocalizedName("fluidSchweppesMango");
		blockSchweppesMango = new BlockFluidSchweppesMango(fluidSchweppesMango, Material.water).setCreativeTab(BandbCreativeTabs.CreativeTabsFluid).setBlockName("blockSchweppesMango");
		GameRegistry.registerBlock(blockSchweppesMango, "blockSchweppesMango");
	
		fluidSchweppesPech = new FluidSchweppesPech().setUnlocalizedName("fluidSchweppesPech");
		blockSchweppesPech = new BlockFluidSchweppesPech(fluidSchweppesPech, Material.water).setCreativeTab(BandbCreativeTabs.CreativeTabsFluid).setBlockName("blockSchweppesPech");
		GameRegistry.registerBlock(blockSchweppesPech, "blockSchweppesPech");
	
		fluidSchweppesPassion = new FluidSchweppesPassion().setUnlocalizedName("fluidSchweppesPassion");
		blockSchweppesPassion = new BlockFluidSchweppesPassion(fluidSchweppesTonic, Material.water).setCreativeTab(BandbCreativeTabs.CreativeTabsFluid).setBlockName("blockSchweppesPassion");
		GameRegistry.registerBlock(blockSchweppesPassion, "blockSchweppesPassion");
	
		fluidSchweppesRaisin = new FluidSchweppesRaisin().setUnlocalizedName("fluidSchweppesRaisin");
		blockSchweppesRaisin = new BlockFluidSchweppesRaisin(fluidSchweppesRaisin, Material.water).setCreativeTab(BandbCreativeTabs.CreativeTabsFluid).setBlockName("blockSchweppesRaisin");
		GameRegistry.registerBlock(blockSchweppesRaisin, "blockSchweppesRaisin");
	
		fluidLeffe = new FluidLeffe().setUnlocalizedName("fluidLeffe");
		blockLeffe = new BlockFluidLeffe(fluidLeffe, Material.water).setCreativeTab(BandbCreativeTabs.CreativeTabsFluid).setBlockName("blockLeffe");
		GameRegistry.registerBlock(blockLeffe, "blockLeffe");
	
		fluidSkoll = new FluidSkoll().setUnlocalizedName("fluidSkoll");
		blockSkoll = new BlockFluidSkoll(fluidSkoll, Material.water).setCreativeTab(BandbCreativeTabs.CreativeTabsFluid).setBlockName("blockSkoll");
		GameRegistry.registerBlock(blockSkoll, "blockSkoll");
		
		
		
		
		
	
//		fluid = new Fluid().setUnlocalizedName("fluidCapCorse");
	//	block = new BlockFluid(fluidCapCorse, Material.water).setCreativeTab(BandbCreativeTabs.CreativeTabsFluid).setBlockName("blockCapCorse");
	//	GameRegistry.registerBlock(blockCapCorse, "blockCapCorse");
		
	}



	private static void setBlockName(String string) {
		// TODO Auto-generated method stub
		
	}

}
