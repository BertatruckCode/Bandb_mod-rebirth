package fr.bentur_and_bertatruck.bandb_mod.common.fluid;

import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.IIcon;
import net.minecraft.util.StringUtils;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraftforge.fluids.BlockFluidClassic;
import net.minecraftforge.fluids.Fluid;
import cpw.mods.fml.common.FMLLog;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import fr.bentur_and_bertatruck.bandb_mod.common.Bandb_mod;


public class BlockFluidPastis51 extends BlockFluidClassic {


      public static BlockFluidPastis51 create(Fluid fluid, Material material) {
    	  BlockFluidPastis51 res = new BlockFluidPastis51(fluid, material);
        res.init();
        fluid.setBlock(res);
        return res;
      }

      protected Fluid fluid;

      public BlockFluidPastis51(Fluid fluid, Material material) {
        super(fluid, material);
        this.fluid = fluid;
        setBlockName("blockPastis51");
        setLightLevel(1.0f);
        setCreativeTab(CreativeTabs.tabBlock);
      }

      protected void init() {
        GameRegistry.registerBlock(this, "blockPastis51");
      }


      @SideOnly(Side.CLIENT)
      protected IIcon[] icons;


      @Override
      public IIcon getIcon(int side, int meta) {
        return side != 0 && side != 1 ? this.icons[1] : this.icons[0];
      }


      @Override
      @SideOnly(Side.CLIENT)
      public void registerBlockIcons(IIconRegister iconRegister) {
        icons = new IIcon[] { iconRegister.registerIcon(Bandb_mod.MODID + ":fluid/still/pastis51_still"),
            iconRegister.registerIcon(Bandb_mod.MODID + ":fluid/flowing/pastis51_flow") };

        fluid.setIcons(icons[0], icons[1]);
      }

      @Override
      public boolean canDisplace(IBlockAccess world, int x, int y, int z) {
        if(world.getBlock(x, y, z).getMaterial().isLiquid()) {
          return false;
        }
        return super.canDisplace(world, x, y, z);
      }


      @Override
      public boolean displaceIfPossible(World world, int x, int y, int z) {
        if(world.getBlock(x, y, z).getMaterial().isLiquid()) {
          return false;
        }
        return super.displaceIfPossible(world, x, y, z);
      }

}