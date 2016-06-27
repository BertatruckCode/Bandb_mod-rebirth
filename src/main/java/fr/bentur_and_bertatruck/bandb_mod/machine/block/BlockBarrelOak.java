package fr.bentur_and_bertatruck.bandb_mod.machine.block;

import net.minecraft.block.Block;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.IIcon;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;
import cpw.mods.fml.common.network.internal.FMLNetworkHandler;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import fr.bentur_and_bertatruck.bandb_mod.common.Bandb_mod;
import fr.bentur_and_bertatruck.bandb_mod.common.loader.BandbMachines;
import fr.bentur_and_bertatruck.bandb_mod.machine.tileEntity.TileEntityBarrelOak;

public class BlockBarrelOak extends BlockContainer {

	private IIcon frontSide;
	private IIcon topSide;
	private IIcon backSide;

	public BlockBarrelOak() {

		super(Material.rock);
		setResistance(5f);
		setHardness(4f);
		
	}

	@Override
	public boolean onBlockActivated(World world, int x, int y, int z,EntityPlayer player, int par6, float par7, float par8, float par9) {
		FMLNetworkHandler.openGui(player, Bandb_mod.instance,BandbMachines.guiIDBarrelOak, world, x, y, z);
		return true;
	}

	public TileEntity createNewTileEntity(World var1, int i) {
		return new TileEntityBarrelOak();
	}

	@Override
	public void onBlockAdded(World world, int x, int y, int z) {
		super.onBlockAdded(world, x, y, z);
		setDefaultDirection(world, x, y, z);
	}

	@Override
	public void onBlockPlacedBy(World par1World, int par2, int par3, int par4, EntityLivingBase par5EntityLivingBase, ItemStack par6ItemStack) {
		int l = MathHelper.floor_double((par5EntityLivingBase.rotationYaw * 4F) / 360F + 0.5D) & 3;
		if (l == 0) {
			par1World.setBlockMetadataWithNotify(par2, par3, par4, 2, 2);
		}
		if (l == 1) {
			par1World.setBlockMetadataWithNotify(par2, par3, par4, 5, 2);
		}
		if (l == 2) {
			par1World.setBlockMetadataWithNotify(par2, par3, par4, 3, 2);
		}
		if (l == 3) {
			par1World.setBlockMetadataWithNotify(par2, par3, par4, 4, 2);
		}
	}

	public void setDefaultDirection(World world, int x, int y, int z) {
		if (!world.isRemote) {
			Block block = world.getBlock(x, y, z - 1);
			Block block1 = world.getBlock(x, y, z + 1);
			Block block2 = world.getBlock(x - 1, y, z);
			Block block3 = world.getBlock(x + 1, y, z);
			byte b0 = 3;
			if (block.func_149730_j() && !block1.func_149730_j()) {
				b0 = 3;
			}
			if (block1.func_149730_j() && !block.func_149730_j()) {
				b0 = 2;
			}
			if (block2.func_149730_j() && !block3.func_149730_j()) {
				b0 = 5;
			}
			if (block3.func_149730_j() && !block2.func_149730_j()) {
				b0 = 4;
			}
			world.setBlockMetadataWithNotify(x, y, z, b0, 2);
		}
	}

	@Override
	public void registerBlockIcons(IIconRegister icon) {
		frontSide = icon.registerIcon(Bandb_mod.MODID + ":gui/barrel/blockFront");
		topSide = icon.registerIcon(Bandb_mod.MODID + ":gui/barrel/blockSide");
		backSide = icon.registerIcon(Bandb_mod.MODID + ":gui/barrel/blockBack");
	}

	@SideOnly(Side.CLIENT)
	@Override
	public IIcon getIcon(int side, int meta) {
		if (side == 5) {
			return frontSide;
		}
		if (side == 4) {
			return backSide;
		}
		return topSide;
	}
}
