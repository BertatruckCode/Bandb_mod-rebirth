package fr.bentur_and_bertatruck.bandb_mod.common.loader;

import net.minecraft.block.Block;
import cpw.mods.fml.common.registry.GameRegistry;
import fr.bentur_and_bertatruck.bandb_mod.machine.block.BlockBarrelApple;
import fr.bentur_and_bertatruck.bandb_mod.machine.block.BlockBarrelOak;
import fr.bentur_and_bertatruck.bandb_mod.machine.block.BlockBottleCaster;
import fr.bentur_and_bertatruck.bandb_mod.machine.block.BlockCocktailBar;
import fr.bentur_and_bertatruck.bandb_mod.machine.block.BlockCoffeeMaker;
import fr.bentur_and_bertatruck.bandb_mod.machine.block.BlockCottonCandyMachine;
import fr.bentur_and_bertatruck.bandb_mod.machine.block.BlockDrier;
import fr.bentur_and_bertatruck.bandb_mod.machine.block.BlockIngotMasher;
import fr.bentur_and_bertatruck.bandb_mod.machine.block.BlockKebabStand;
import fr.bentur_and_bertatruck.bandb_mod.machine.block.BlockLabelMachine;
import fr.bentur_and_bertatruck.bandb_mod.machine.block.BlockOven;
import fr.bentur_and_bertatruck.bandb_mod.machine.block.BlockPress;
import fr.bentur_and_bertatruck.bandb_mod.machine.block.BlockPrinter;
import fr.bentur_and_bertatruck.bandb_mod.machine.block.BlockSyrupMachine;
import fr.bentur_and_bertatruck.bandb_mod.machine.tileEntity.TileEntityBarrelApple;
import fr.bentur_and_bertatruck.bandb_mod.machine.tileEntity.TileEntityBarrelOak;
import fr.bentur_and_bertatruck.bandb_mod.machine.tileEntity.TileEntityBottleCaster;
import fr.bentur_and_bertatruck.bandb_mod.machine.tileEntity.TileEntityCocktailBar;
import fr.bentur_and_bertatruck.bandb_mod.machine.tileEntity.TileEntityCoffeeMaker;
import fr.bentur_and_bertatruck.bandb_mod.machine.tileEntity.TileEntityCottonCandyMachine;
import fr.bentur_and_bertatruck.bandb_mod.machine.tileEntity.TileEntityDrier;
import fr.bentur_and_bertatruck.bandb_mod.machine.tileEntity.TileEntityKebabStand;
import fr.bentur_and_bertatruck.bandb_mod.machine.tileEntity.TileEntityLabelMachine;
import fr.bentur_and_bertatruck.bandb_mod.machine.tileEntity.TileEntityOven;
import fr.bentur_and_bertatruck.bandb_mod.machine.tileEntity.TileEntityPress;
import fr.bentur_and_bertatruck.bandb_mod.machine.tileEntity.TileEntityPrinter;
import fr.bentur_and_bertatruck.bandb_mod.machine.tileEntity.TileEntitySyrupMachine;

public class BandbMachines {

	public static Block blockOvenIdle, blockOvenActive;
	public static final int guiIDOven = 20;

	public static Block blockIngotMasherIdle, blockIngotMasherActive;
	public static final int guiIDIngotMasher = 21;

	public static Block blockPrinter;
	public static final int guiIDPrinter = 22;

	public static Block blockPress;
	public static final int guiIDPress = 24;

	public static Block blockSyrupMachine;
	public static final int guiIDSyrupMachine = 25;

	public static Block blockDrier;
	public static final int guiIDDrier = 26;

	public static Block blockCoffeeMaker;
	public static final int guiIDCoffeeMaker = 27;

	public static Block blockLabelMachine;
	public static final int guiIDLabelMachine = 28;

	public static Block blockCottonCandyMachine;
	public static final int guiIDCottonCandyMachine = 29;

	public static Block blockBottleCaster;
	public static final int guiIDBottleCaster = 30;

	public static Block blockBarrelOak;
	public static final int guiIDBarrelOak = 31;
	
	public static Block blockCocktailBar;
	public static final int guiIDCocktailBar = 32;
	
	public static Block blockBarrelApple;
	public static final int guiIDBarrelApple = 33;

	public static Block blockKebabStand;

	public static void preInit() {
		
		blockOvenIdle = new BlockOven(false).setBlockName("blockOvenIdle").setCreativeTab(BandbCreativeTabs.CreativeTabsKitchenTools);
		blockOvenActive = new BlockOven(true).setBlockName("blockOvenActive").setLightLevel(0.625F);

    	GameRegistry.registerBlock(blockOvenIdle, "blockOvenIdle");
    	GameRegistry.registerBlock(blockOvenActive, "blockOvenActive");
    	
    	blockIngotMasherIdle = new BlockIngotMasher(false).setBlockName("blockIngotMasherIdle").setCreativeTab(BandbCreativeTabs.CreativeTabsKitchenTools);
    	blockIngotMasherActive = new BlockIngotMasher(true).setBlockName("blockIngotMasherActive").setLightLevel(0.625F);

    	GameRegistry.registerBlock(blockIngotMasherIdle, "blockIngotMasherIdle");
    	GameRegistry.registerBlock(blockIngotMasherActive, "blockIngotMasherActive");
    	
    	blockPrinter = new BlockPrinter().setBlockName("blockPrinter").setCreativeTab(BandbCreativeTabs.CreativeTabsKitchenTools);
    	GameRegistry.registerBlock(blockPrinter, "blockPrinter");
    	
    	blockPress = new BlockPress().setBlockName("blockPress").setCreativeTab(BandbCreativeTabs.CreativeTabsKitchenTools);
    	GameRegistry.registerBlock(blockPress, "blockPress");
    	
    	blockSyrupMachine = new BlockSyrupMachine().setBlockName("blockSyrupMachine").setCreativeTab(BandbCreativeTabs.CreativeTabsKitchenTools);
    	GameRegistry.registerBlock(blockSyrupMachine, "blockSyrupMachine");
    	
    	blockDrier = new BlockDrier().setBlockName("blockDrier").setCreativeTab(BandbCreativeTabs.CreativeTabsKitchenTools);
    	GameRegistry.registerBlock(blockDrier, "blockDrier");
    	
    	blockCoffeeMaker = new BlockCoffeeMaker().setBlockName("blockCoffeeMaker").setCreativeTab(BandbCreativeTabs.CreativeTabsKitchenTools);
    	GameRegistry.registerBlock(blockCoffeeMaker, "blockCoffeeMaker");
    	
    	blockLabelMachine = new BlockLabelMachine().setBlockName("blockLabelMachine").setCreativeTab(BandbCreativeTabs.CreativeTabsKitchenTools);
    	GameRegistry.registerBlock(blockLabelMachine, "blockLabelMachine");
    	
    	blockCottonCandyMachine = new BlockCottonCandyMachine().setBlockName("blockCottonCandyMachine").setCreativeTab(BandbCreativeTabs.CreativeTabsKitchenTools);
    	GameRegistry.registerBlock(blockCottonCandyMachine, "blockCottonCandyMachine");
    	
    	blockBottleCaster = new BlockBottleCaster().setBlockName("blockBottleCaster").setCreativeTab(BandbCreativeTabs.CreativeTabsKitchenTools);
    	GameRegistry.registerBlock(blockBottleCaster, "blockBottleCaster");
    	
    	blockBarrelOak = new BlockBarrelOak().setBlockName("blockBarrelOak").setCreativeTab(BandbCreativeTabs.CreativeTabsKitchenTools);
    	GameRegistry.registerBlock(blockBarrelOak, "blockBarrelOak");
    	
    	blockCocktailBar = new BlockCocktailBar().setBlockName("blockCocktailBar").setCreativeTab(BandbCreativeTabs.CreativeTabsKitchenTools);
    	GameRegistry.registerBlock(blockCocktailBar, "blockCocktailBar");
    	
    	blockBarrelApple = new BlockBarrelApple().setBlockName("blockBarrelApple").setCreativeTab(BandbCreativeTabs.CreativeTabsKitchenTools);
    	GameRegistry.registerBlock(blockBarrelApple, "blockBarrelApple");
    	
    	blockKebabStand = new BlockKebabStand().setBlockName("blockKebabStand").setCreativeTab(BandbCreativeTabs.CreativeTabsKitchenTools);
    	GameRegistry.registerBlock(blockKebabStand, "blockKebabStand");
	}

	public static void init() {
		
		GameRegistry.registerTileEntity(TileEntityOven.class, "tileEntityOven");
		GameRegistry.registerTileEntity(TileEntityPrinter.class, "tileEntityPrinter");
		GameRegistry.registerTileEntity(TileEntityPress.class, "tileEntityPress");
		GameRegistry.registerTileEntity(TileEntitySyrupMachine.class, "tileEntitySurupMachine");
		GameRegistry.registerTileEntity(TileEntityDrier.class, "tileEntityDrier");
		GameRegistry.registerTileEntity(TileEntityCoffeeMaker.class, "tileEntityCoffeeMaker");
		GameRegistry.registerTileEntity(TileEntityLabelMachine.class, "tileEntityLabelMachine");
		GameRegistry.registerTileEntity(TileEntityCottonCandyMachine.class, "tileEntityCottonCandyMachine");
		GameRegistry.registerTileEntity(TileEntityBottleCaster.class, "tileEntityBottleCaster");
		GameRegistry.registerTileEntity(TileEntityBarrelOak.class, "tileEntityBarrelOak");
		GameRegistry.registerTileEntity(TileEntityCocktailBar.class, "tileEntityCocktailBar");
		GameRegistry.registerTileEntity(TileEntityBarrelApple.class, "tileEntityBarrelApple");
		GameRegistry.registerTileEntity(TileEntityKebabStand.class, "tileEntityKebabStand");

	}

}
