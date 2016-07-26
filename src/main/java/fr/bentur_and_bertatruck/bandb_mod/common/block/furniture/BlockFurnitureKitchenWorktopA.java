package fr.bentur_and_bertatruck.bandb_mod.common.block.furniture;

import cpw.mods.fml.common.network.internal.FMLNetworkHandler;
import fr.bentur_and_bertatruck.bandb_mod.common.Bandb_mod;
import fr.bentur_and_bertatruck.bandb_mod.common.block.furniture.tileEntity.TileEntityFurnitureKitchenWorktopA;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.MathHelper;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

public class BlockFurnitureKitchenWorktopA extends BlockFurniture{
	
	private int guiID;

	public BlockFurnitureKitchenWorktopA(TileEntity tileEntity, int guiID) {
		super(tileEntity);
		this.setBlockBounds(0, 0, 0, 1, 1, 1);
		this.guiID = guiID;
	}

	@Override
	public TileEntity createNewTileEntity(World p_149915_1_, int p_149915_2_) {
		return new TileEntityFurnitureKitchenWorktopA();
	}
	
	public void onBlockPlacedBy(World world, int x, int y, int z, EntityLivingBase living, ItemStack stack){
    	if(stack.getItemDamage() == 0){
            TileEntity tile = world.getTileEntity(x, y, z);
            if(tile instanceof TileEntityFurnitureKitchenWorktopA){
            	TileEntityFurnitureKitchenWorktopA tileFurniture = (TileEntityFurnitureKitchenWorktopA)tile;
                int direction = MathHelper.floor_double((double)(living.rotationYaw * 4.0F / 360.0F) + 2.5D) & 3;
                System.out.println(direction);
                switch(direction){
                	case 0:
                		//case this furniture is the angle
                		if(world.getTileEntity(x, y, z + 1) instanceof TileEntityFurnitureKitchenWorktopA){
                			tileFurniture.setAngle(true);               			
                		}
                		if(world.getTileEntity(x, y, z - 1) instanceof TileEntityFurnitureKitchenWorktopA){
                			tileFurniture.setAngle(true);
                			direction = 3;
                		}
                		//case next furniture is the angle
                		if(world.getTileEntity(x - 1, y, z) instanceof TileEntityFurnitureKitchenWorktopA){
                        	TileEntityFurnitureKitchenWorktopA tileFurniture_a = (TileEntityFurnitureKitchenWorktopA)world.getTileEntity(x - 1, y, z);
                			if(tileFurniture_a.getDirection() == 3)
                				tileFurniture_a.setAngle(true);
                			
                		}
                		if(world.getTileEntity(x + 1, y, z) instanceof TileEntityFurnitureKitchenWorktopA){
                        	TileEntityFurnitureKitchenWorktopA tileFurniture_a = (TileEntityFurnitureKitchenWorktopA)world.getTileEntity(x + 1, y, z);
                			if(tileFurniture_a.getDirection() == 1)
                				tileFurniture_a.setAngle(true);
                				tileFurniture_a.setDirection((byte)0);
                		}

            			break;
                	case 1:
                	case 2:	
                	case 3:
                }
                	
                ((TileEntityFurnitureKitchenWorktopA)tile).setDirection((byte)direction);
            }
        }
	}



	@Override
	public boolean onBlockActivated(World world, int x, int y, int z,EntityPlayer player, int par6, float par7, float par8, float par9) {
		if (!world.isRemote && this.guiID != 0){
		FMLNetworkHandler.openGui(player, Bandb_mod.instance, this.guiID, world, x, y, z);
		}
		return true;
	}
	
}