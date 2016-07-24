package fr.bentur_and_bertatruck.bandb_mod.common.block.furniture;

import fr.bentur_and_bertatruck.bandb_mod.common.block.furniture.tileEntity.TileEntityFurnitureKitchenWorktopA;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.MathHelper;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

public class BlockFurnitureKitchenWorktopA extends BlockFurniture{

	public BlockFurnitureKitchenWorktopA(TileEntity tileEntity, int guiID) {
		super(tileEntity, guiID);
		this.setBlockBounds(0, 0, 0, 1, 1, 1);
	}

	@Override
	public TileEntity createNewTileEntity(World p_149915_1_, int p_149915_2_) {
		return new TileEntityFurnitureKitchenWorktopA();
	}
	
	public void onBlockPlacedBy(World world, int x, int y, int z, EntityLivingBase living, ItemStack stack){
    	if(stack.getItemDamage() == 0){
            TileEntity tile = world.getTileEntity(x, y, z);
            if(tile instanceof TileEntityFurnitureKitchenWorktopA){
                int direction = MathHelper.floor_double((double)(living.rotationYaw * 4.0F / 360.0F) + 2.5D) & 3;
                ((TileEntityFurnitureKitchenWorktopA)tile).setDirection((byte)direction);
            }
        }
	}

}
