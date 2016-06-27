package fr.bentur_and_bertatruck.bandb_mod.common;


import java.awt.Color;

import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkRegistry;
import cpw.mods.fml.common.registry.EntityRegistry;
import cpw.mods.fml.common.registry.GameRegistry;
import fr.bentur_and_bertatruck.bandb_mod.common.block.BlockNuke;
import fr.bentur_and_bertatruck.bandb_mod.common.block.BlockTest;
import fr.bentur_and_bertatruck.bandb_mod.common.handler.CraftingHandler;
import fr.bentur_and_bertatruck.bandb_mod.common.handler.EventHandlerBandb;
import fr.bentur_and_bertatruck.bandb_mod.common.loader.BandbBeverages;
import fr.bentur_and_bertatruck.bandb_mod.common.loader.BandbBlocks;
import fr.bentur_and_bertatruck.bandb_mod.common.loader.BandbCocktails;
import fr.bentur_and_bertatruck.bandb_mod.common.loader.BandbCraftingRecipes;
import fr.bentur_and_bertatruck.bandb_mod.common.loader.BandbCrops;
import fr.bentur_and_bertatruck.bandb_mod.common.loader.BandbFluids;
import fr.bentur_and_bertatruck.bandb_mod.common.loader.BandbItems;
import fr.bentur_and_bertatruck.bandb_mod.common.loader.BandbLists;
import fr.bentur_and_bertatruck.bandb_mod.common.loader.BandbMachineRecipes;
import fr.bentur_and_bertatruck.bandb_mod.common.loader.BandbMachines;
import fr.bentur_and_bertatruck.bandb_mod.common.loader.BandbOreDictionary;
import fr.bentur_and_bertatruck.bandb_mod.common.loader.BandbStuffs;
import fr.bentur_and_bertatruck.bandb_mod.common.loader.BandbWorldGeneration;
import fr.bentur_and_bertatruck.bandb_mod.entity.EntityCowCharolaise;
import fr.bentur_and_bertatruck.bandb_mod.entity.EntityCowGasconne;
import fr.bentur_and_bertatruck.bandb_mod.entity.EntityCowKerry;
import fr.bentur_and_bertatruck.bandb_mod.entity.EntityCowLaughting;
import fr.bentur_and_bertatruck.bandb_mod.entity.EntityCowMilka;
import fr.bentur_and_bertatruck.bandb_mod.entity.EntityCowMontbeliarde;
import fr.bentur_and_bertatruck.bandb_mod.entity.EntityGoatWhite;
import fr.bentur_and_bertatruck.bandb_mod.entity.EntityHandler;
import fr.bentur_and_bertatruck.bandb_mod.entity.EntityWalker1;
import fr.bentur_and_bertatruck.bandb_mod.entity.EntityZebra;
import fr.bentur_and_bertatruck.bandb_mod.machine.gui.HandlerGui;
import fr.bentur_and_bertatruck.bandb_mod.machine.network.NetworkHandler;
import fr.bentur_and_bertatruck.bandb_mod.proxy.bandb_mod_ClientProxy;

import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.EnumCreatureType;
import net.minecraft.init.Items;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraftforge.common.MinecraftForge;
import test.BlockDistrib;
import test.TileEntityDistributor;



@Mod(modid = "bandb_mod", name = "bandb_mod", version = "10.0.0")
public class Bandb_mod{
	
	public static final String MODID = "bandb_mod";
	 
	@Instance("bandb_mod")
	
	public static Bandb_mod instance;
	
	@SidedProxy(clientSide = "fr.bentur_and_bertatruck.bandb_mod.proxy.bandb_mod_ClientProxy", serverSide = "fr.bentur_and_bertatruck.bandb_mod.proxy.bandb_mod_CommonProxy" )
	public static bandb_mod_ClientProxy proxy;			


	//gui block
			//oven			
	public static final int guiIDMac = 23;

	//event
	EventHandlerBandb events = new EventHandlerBandb(); 
		
	CraftingHandler craftingHandler = new CraftingHandler();
	//test
	public static Block blockTest, blockTestOGL, blockNuke;	
	public static Block blockDistrib;			
		     
	@EventHandler
	public void preInit(FMLPreInitializationEvent event){

		Items.leather.setTextureName(Bandb_mod.MODID + ":miscellaneous/itemLeatherCowVanilla");
		
		//event
		FMLCommonHandler.instance().bus().register(events);
		MinecraftForge.EVENT_BUS.register(events);
			//crafting
		FMLCommonHandler.instance().bus().register(craftingHandler);
		MinecraftForge.EVENT_BUS.register(craftingHandler);
		
		//tools and stuff
		BandbStuffs.loaderStuff(true);
		//item
		BandbItems.LoaderItemIngotDustNugget(true);
		BandbItems.loaderProcessFood(true);
		BandbItems.loaderMiscellaneous(true);
		BandbItems.loaderFruit(true);
		BandbItems.loaderVegetable(true);
		BandbItems.loaderCoffeeTea(true);
		BandbItems.loaderMushroom(true);
		BandbItems.loaderLabel(true);
		BandbItems.loaderWrapping(true);
		BandbItems.loaderTools(true);
		BandbItems.loaderPharmaceuticals(true);
		BandbItems.loaderCoktail(true);
		BandbItems.loaderCreativeOnly(true);			
		//block
		BandbBlocks.loaderBlock();		
		//crop and seed
		BandbCrops.loaderBlockCrop();
		BandbCrops.loaderCropSeed();
		
		BandbMachines.preInit();
		BandbFluids.preInit();
		BandbBeverages.preInit();
		BandbCocktails.preInit();

////////blocks//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////:       
   
		//test
		blockTest = new BlockTest().setBlockName("blockTest").setCreativeTab(CreativeTabs.tabBlock).setBlockTextureName(Bandb_mod.MODID + ":ingot/blockTitan");
    	GameRegistry.registerBlock(blockTest, "blockTest");
    	/*
    	blockTestOGL = new BlockTestOGL().setBlockName("blockTestOGL").setCreativeTab(CreativeTabs.tabBlock);
    	GameRegistry.registerBlock(blockTestOGL, "blockTestOGL");
    	*/
    	blockDistrib = new BlockDistrib().setBlockName("blockDistrib").setCreativeTab(CreativeTabs.tabBlock);
    	GameRegistry.registerBlock(blockDistrib, "blockDistrib");
    	
    	blockNuke = new BlockNuke(40).setBlockName("blockNuke").setCreativeTab(CreativeTabs.tabBlock);
    	GameRegistry.registerBlock(blockNuke, "blockNuke");
	    		    	
	}
	@EventHandler
	public void init(FMLInitializationEvent event){
	
		BandbLists.init();
		BandbMachines.init();
		BandbMachineRecipes.init();
		BandbCraftingRecipes.loaderRecipe();
		BandbOreDictionary.loaderPlankWood();
		
		//register render
		proxy.registerRender();
								
		//generation///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		BandbWorldGeneration.init();
		
		//entities 
		EntityHandler.RegisterEntities(EntityCowLaughting.class,"EntityCowLaughting");
		EntityHandler.RegisterEntities(EntityCowMilka.class,"EntityCowMilka");
		EntityHandler.RegisterEntities(EntityCowCharolaise.class,"EntityCowCharolaise");
		EntityHandler.RegisterEntities(EntityCowGasconne.class,"EntityCowGasconne");
		EntityHandler.RegisterEntities(EntityCowKerry.class,"EntityCowKerry");
		EntityHandler.RegisterEntities(EntityCowMontbeliarde.class,"EntityCowMontbeliarde");
		EntityHandler.RegisterEntities(EntityGoatWhite.class, "entityGoatWhite");
		EntityHandler.RegisterEntities(EntityZebra.class, "entityZebra");

		
		EntityRegistry.addSpawn(EntityCowCharolaise.class, 10, 1, 2, EnumCreatureType.creature, BiomeGenBase.taigaHills, BiomeGenBase.jungle,
				BiomeGenBase.jungleHills, BiomeGenBase.plains, BiomeGenBase.taiga, BiomeGenBase.forest,
				BiomeGenBase.forestHills, BiomeGenBase.swampland, BiomeGenBase.extremeHills, BiomeGenBase.extremeHillsEdge);
		
		EntityRegistry.addSpawn(EntityCowGasconne.class, 10, 1, 2, EnumCreatureType.creature, BiomeGenBase.taigaHills, BiomeGenBase.jungle,
				BiomeGenBase.jungleHills, BiomeGenBase.plains, BiomeGenBase.taiga, BiomeGenBase.forest,
				BiomeGenBase.forestHills, BiomeGenBase.swampland, BiomeGenBase.extremeHills, BiomeGenBase.extremeHillsEdge);
		
		EntityRegistry.addSpawn(EntityCowKerry.class, 10, 1, 2, EnumCreatureType.creature, BiomeGenBase.taigaHills, BiomeGenBase.jungle,
				BiomeGenBase.jungleHills, BiomeGenBase.plains, BiomeGenBase.taiga, BiomeGenBase.forest,
				BiomeGenBase.forestHills, BiomeGenBase.swampland, BiomeGenBase.extremeHills, BiomeGenBase.extremeHillsEdge);
		
		EntityRegistry.addSpawn(EntityCowMontbeliarde.class, 10, 1, 2, EnumCreatureType.creature, BiomeGenBase.taigaHills, BiomeGenBase.jungle,
				BiomeGenBase.jungleHills, BiomeGenBase.plains, BiomeGenBase.taiga, BiomeGenBase.forest,
				BiomeGenBase.forestHills, BiomeGenBase.swampland, BiomeGenBase.extremeHills, BiomeGenBase.extremeHillsEdge);
			
			//walker1
		EntityRegistry.registerGlobalEntityID(EntityWalker1.class, "Walker1", EntityRegistry.findGlobalUniqueEntityId(), new Color(0, 255, 0).getRGB(), new Color(255, 0, 0).getRGB());
		EntityRegistry.registerModEntity(EntityWalker1.class, "Walker1", 420, this.instance, 40, 1, true);	

		
		//GameRegistry.registerTileEntity(TileEntityTestOGL.class, "tileEntityTestOGL");
		GameRegistry.registerTileEntity(TileEntityDistributor.class, "tileEntityDistributor");

		
		//gui handler
		NetworkRegistry.INSTANCE.registerGuiHandler(this, new HandlerGui());								
		new NetworkHandler();
		
	}

	@EventHandler
	public void postInit(FMLPostInitializationEvent event){}
}