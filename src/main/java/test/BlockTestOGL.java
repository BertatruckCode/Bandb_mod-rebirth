package test;

import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.MathHelper;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import fr.bentur_and_bertatruck.bandb_mod.machine.tileEntity.TileEntityCoffeeMaker;
import fr.bentur_and_bertatruck.bandb_mod.proxy.bandb_mod_ClientProxy;

public class BlockTestOGL extends BlockContainer{
	// Make sure you set this as your TileEntity class relevant for the block!
	

		public BlockTestOGL() {
			super(Material.iron);		
			// TODO Auto-generated constructor stub
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


		public TileEntity createNewTileEntity(World p_149915_1_, int p_149915_2_) {
			// TODO Auto-generated method stub
			return new TileEntityTestOGL();
		}
		
	    public void onBlockPlacedBy(World world, int x, int y, int z, EntityLivingBase living, ItemStack stack)
	    {
	        if(stack.getItemDamage() == 0)
	        {
	            TileEntity tile = world.getTileEntity(x, y, z);
	            if(tile instanceof TileEntityTestOGL)
	            {
	                int direction = MathHelper.floor_double((double)(living.rotationYaw * 4.0F / 360.0F) + 2.5D) & 3;
	                ((TileEntityTestOGL)tile).setDirection((byte)direction);
	            }
	        }
	    }
	    /*
	    public void setBlockBoundsBasedOnState(IBlockAccess world, int x, int y, int z)
	    {
	        TileEntity tile = world.getTileEntity(x, y, z);
	        if(tile instanceof TileEntityTestOGL)
	        {
	        	TileEntityTestOGL tileentity = (TileEntityTestOGL)tile;
	            switch(tileentity.getDirection())
	            {
	                case 0:
	                    this.setBlockBounds(0.36F, 0.0F, 0.11F, 0.64F, 0.4F, 0.81F); //valeur pour la direction 0
	                    break;
	                case 1:
	                    this.setBlockBounds(0.19F, 0.0F, 0.36F, 0.89F, 0.4F, 0.64F); //valeur pour la direction 1
	                    break;
	                case 2:
	                    this.setBlockBounds(0.36F, 0.0F, 0.19F, 0.64F, 0.4F, 0.89F); //valeur pour la direction 2
	                    break;
	                case 3:
	                	this.setBlockBounds(0.11F, 0.0F, 0.36F, 0.81F, 0.4F, 0.64F); //valeur pour la direction 3
	                    break;
	            }
	        }
	    }
*/
}
