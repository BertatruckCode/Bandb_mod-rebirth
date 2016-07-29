package fr.bentur_and_bertatruck.bandb_mod.machine.gui;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;
import cpw.mods.fml.common.network.IGuiHandler;
import fr.bentur_and_bertatruck.bandb_mod.common.Bandb_mod;
import fr.bentur_and_bertatruck.bandb_mod.common.loader.BandbMachines;
import fr.bentur_and_bertatruck.bandb_mod.machine.container.ContainerBarrelApple;
import fr.bentur_and_bertatruck.bandb_mod.machine.container.ContainerBarrelOak;
import fr.bentur_and_bertatruck.bandb_mod.machine.container.ContainerBottleCaster;
import fr.bentur_and_bertatruck.bandb_mod.machine.container.ContainerCocktailBar;
import fr.bentur_and_bertatruck.bandb_mod.machine.container.ContainerCoffeeMaker;
import fr.bentur_and_bertatruck.bandb_mod.machine.container.ContainerCottonCandyMachine;
import fr.bentur_and_bertatruck.bandb_mod.machine.container.ContainerDrier;
import fr.bentur_and_bertatruck.bandb_mod.machine.container.ContainerIngotMasher;
import fr.bentur_and_bertatruck.bandb_mod.machine.container.ContainerLabelMachine;
import fr.bentur_and_bertatruck.bandb_mod.machine.container.ContainerMac;
import fr.bentur_and_bertatruck.bandb_mod.machine.container.ContainerOven;
import fr.bentur_and_bertatruck.bandb_mod.machine.container.ContainerPress;
import fr.bentur_and_bertatruck.bandb_mod.machine.container.ContainerPrinter;
import fr.bentur_and_bertatruck.bandb_mod.machine.container.ContainerSyrupMachine;
import fr.bentur_and_bertatruck.bandb_mod.machine.tileEntity.TileEntityBarrelApple;
import fr.bentur_and_bertatruck.bandb_mod.machine.tileEntity.TileEntityBarrelOak;
import fr.bentur_and_bertatruck.bandb_mod.machine.tileEntity.TileEntityBottleCaster;
import fr.bentur_and_bertatruck.bandb_mod.machine.tileEntity.TileEntityCocktailBar;
import fr.bentur_and_bertatruck.bandb_mod.machine.tileEntity.TileEntityCoffeeMaker;
import fr.bentur_and_bertatruck.bandb_mod.machine.tileEntity.TileEntityCottonCandyMachine;
import fr.bentur_and_bertatruck.bandb_mod.machine.tileEntity.TileEntityDrier;
import fr.bentur_and_bertatruck.bandb_mod.machine.tileEntity.TileEntityIngotMasher;
import fr.bentur_and_bertatruck.bandb_mod.machine.tileEntity.TileEntityLabelMachine;
import fr.bentur_and_bertatruck.bandb_mod.machine.tileEntity.TileEntityOven;
import fr.bentur_and_bertatruck.bandb_mod.machine.tileEntity.TileEntityPress;
import fr.bentur_and_bertatruck.bandb_mod.machine.tileEntity.TileEntityPrinter;
import fr.bentur_and_bertatruck.bandb_mod.machine.tileEntity.TileEntitySyrupMachine;

public class HandlerGui implements IGuiHandler {

	public Object getServerGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
		TileEntity entity = world.getTileEntity(x, y, z);
		
		if (entity != null) {
			switch (ID) {
			case BandbMachines.guiIDOven:
				if (entity instanceof TileEntityOven) {
					return new ContainerOven(player.inventory, (TileEntityOven) entity);
				}
			case BandbMachines.guiIDIngotMasher:
				if (entity instanceof TileEntityIngotMasher) {
					return new ContainerIngotMasher(player.inventory, (TileEntityIngotMasher) entity);
				}
			case BandbMachines.guiIDPrinter:
				if (entity instanceof TileEntityPrinter) {
					return new ContainerPrinter(player.inventory, (TileEntityPrinter) entity);
				}
			case Bandb_mod.guiIDMac: return new ContainerMac(player);
			
			case BandbMachines.guiIDPress:
				if (entity instanceof TileEntityPress) {
					return new ContainerPress(player.inventory, (TileEntityPress) entity);
				}
			case BandbMachines.guiIDSyrupMachine:
				if (entity instanceof TileEntitySyrupMachine) {
					return new ContainerSyrupMachine(player.inventory, (TileEntitySyrupMachine) entity);
				}
			case BandbMachines.guiIDDrier:
				if (entity instanceof TileEntityDrier) {
					return new ContainerDrier(player.inventory, (TileEntityDrier) entity);
				}
			case BandbMachines.guiIDCoffeeMaker:
				if (entity instanceof TileEntityCoffeeMaker) {
					return new ContainerCoffeeMaker(player.inventory, (TileEntityCoffeeMaker) entity);
				}
			case BandbMachines.guiIDLabelMachine:
				if (entity instanceof TileEntityLabelMachine) {
					return new ContainerLabelMachine(player.inventory, (TileEntityLabelMachine) entity);
				}
			case BandbMachines.guiIDCottonCandyMachine:
				if (entity instanceof TileEntityCottonCandyMachine) {
					return new ContainerCottonCandyMachine(player.inventory, (TileEntityCottonCandyMachine) entity);
				}
			case BandbMachines.guiIDBottleCaster:
				if (entity instanceof TileEntityBottleCaster) {
					return new ContainerBottleCaster(player.inventory, (TileEntityBottleCaster) entity);
				}
			case BandbMachines.guiIDBarrelOak:
				if (entity instanceof TileEntityBarrelOak) {
					return new ContainerBarrelOak(player.inventory, (TileEntityBarrelOak) entity);
				}
			case BandbMachines.guiIDCocktailBar:
				if (entity instanceof TileEntityCocktailBar) {
					return new ContainerCocktailBar(player.inventory, (TileEntityCocktailBar) entity);
				}
			case BandbMachines.guiIDBarrelApple:
				if (entity instanceof TileEntityBarrelApple) {
					return new ContainerBarrelApple(player.inventory, (TileEntityBarrelApple) entity);
				}
			default:
				return null;
			}
		}
		return null;
	}

	public Object getClientGuiElement(int ID, EntityPlayer player, World world,
			int x, int y, int z) {
		TileEntity entity = world.getTileEntity(x, y, z);
		if (entity != null) {
			switch (ID) {
			case BandbMachines.guiIDOven:
				if (entity instanceof TileEntityOven) {
					return new GuiOven(player.inventory, (TileEntityOven) entity);
				}
			case BandbMachines.guiIDIngotMasher:
				if (entity instanceof TileEntityIngotMasher) {
					return new GuiIngotMasher(player.inventory, (TileEntityIngotMasher) entity);
				}
			case BandbMachines.guiIDPrinter:
				if (entity instanceof TileEntityPrinter) {
					return new GuiPrinter(player.inventory, (TileEntityPrinter) entity);
				}
				return null;
			case Bandb_mod.guiIDMac:
				return new GuiMac(player);
				
			case BandbMachines.guiIDPress:
				if (entity instanceof TileEntityPress) {
					return new GuiPress(player.inventory, (TileEntityPress) entity);
				}
			case BandbMachines.guiIDSyrupMachine:
				if (entity instanceof TileEntitySyrupMachine) {
					return new GuiSyrupMachine(player.inventory, (TileEntitySyrupMachine) entity);
				}
			case BandbMachines.guiIDDrier:
				if (entity instanceof TileEntityDrier) {
					return new GuiDrier(player.inventory, (TileEntityDrier) entity);
				}
			case BandbMachines.guiIDCoffeeMaker:
				if (entity instanceof TileEntityCoffeeMaker) {
					return new GuiCoffeeMaker(player.inventory, (TileEntityCoffeeMaker) entity);
				}
			case BandbMachines.guiIDLabelMachine:
				if (entity instanceof TileEntityLabelMachine) {
					return new GuiLabelMachine(player.inventory, (TileEntityLabelMachine) entity);
				}
			case BandbMachines.guiIDCottonCandyMachine:
				if (entity instanceof TileEntityCottonCandyMachine) {
					return new GuiCottonCandyMachine(player.inventory, (TileEntityCottonCandyMachine) entity);
				}
			case BandbMachines.guiIDBottleCaster:
				if (entity instanceof TileEntityBottleCaster) {
					return new GuiBottleCaster(player.inventory, (TileEntityBottleCaster) entity);
				}
			case BandbMachines.guiIDBarrelOak:
				if (entity instanceof TileEntityBarrelOak) {
					return new GuiBarrelOak(player.inventory, (TileEntityBarrelOak) entity);
				}
			case BandbMachines.guiIDCocktailBar:
				if (entity instanceof TileEntityCocktailBar) {
					return new GuiCocktailBar(player.inventory, (TileEntityCocktailBar) entity);
				}
			case BandbMachines.guiIDBarrelApple:
				if (entity instanceof TileEntityBarrelApple) {
					return new GuiBarrelApple(player.inventory, (TileEntityBarrelApple) entity);
				}
			}
		}
		return null;
	}

}
