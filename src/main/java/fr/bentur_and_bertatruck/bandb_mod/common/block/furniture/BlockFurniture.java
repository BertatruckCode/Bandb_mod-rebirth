package fr.bentur_and_bertatruck.bandb_mod.common.block.furniture;

import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.IIcon;
import net.minecraft.util.MathHelper;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import cpw.mods.fml.common.network.internal.FMLNetworkHandler;
import fr.bentur_and_bertatruck.bandb_mod.common.Bandb_mod;
import fr.bentur_and_bertatruck.bandb_mod.common.loader.BandbCreativeTabs;
import fr.bentur_and_bertatruck.bandb_mod.common.loader.BandbMachines;
import fr.bentur_and_bertatruck.bandb_mod.machine.tileEntity.TileEntityPrinter;
import fr.bentur_and_bertatruck.bandb_mod.proxy.bandb_mod_ClientProxy;

public abstract class BlockFurniture extends BlockContainer {
	
	private TileEntity tileEntity;
	
	public BlockFurniture(TileEntity tileEntity) {
		super(Material.rock);
		this.setResistance(5f);
		this.setHardness(4f);
		this.setCreativeTab(BandbCreativeTabs.CreativeTabsKitchenTools);
		
		this.tileEntity = tileEntity;
	}

	// You don't want the normal render type, or it wont render properly.
	@Override
	public int getRenderType() {
		return bandb_mod_ClientProxy.tesrRenderId;
	}

	// It's not an opaque cube, so you need this.
	@Override
	public boolean isOpaqueCube() {
		return false;
	}

	// It's not a normal block, so you need this too.
	public boolean renderAsNormalBlock() {
		return false;
	}

	// This is the icon to use for showing the block in your hand.
	public void registerIcons(IIconRegister icon) {
		this.blockIcon = icon.registerIcon("Roads:TrafficLightIcon");
	}
	
}
