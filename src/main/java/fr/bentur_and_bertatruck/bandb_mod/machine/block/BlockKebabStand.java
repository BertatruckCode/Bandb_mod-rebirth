package fr.bentur_and_bertatruck.bandb_mod.machine.block;

import fr.bentur_and_bertatruck.bandb_mod.common.loader.BandbItems;
import fr.bentur_and_bertatruck.bandb_mod.machine.tileEntity.TileEntityKebabStand;
import fr.bentur_and_bertatruck.bandb_mod.machine.tileEntity.TileEntityPrinter;
import fr.bentur_and_bertatruck.bandb_mod.proxy.bandb_mod_ClientProxy;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.server.MinecraftServer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.IIcon;
import net.minecraft.util.MathHelper;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

public class BlockKebabStand extends BlockContainer {

	private IIcon frontSide;
	private IIcon topSide;

	public BlockKebabStand() {
		super(Material.rock);
		setResistance(5f);
		setHardness(4f);
		
	}

	@Override
	public boolean onBlockActivated(World world, int x, int y, int z,EntityPlayer player, int par6, float par7, float par8, float par9) {	
		TileEntity tile = world.getTileEntity(x, y, z);
		
		if(tile instanceof TileEntityKebabStand && !player.isSneaking() && player.getCurrentEquippedItem() != null){
			TileEntityKebabStand tileKebab = (TileEntityKebabStand)tile;
        	
			if(player.getCurrentEquippedItem().getItem() == BandbItems.itemKebabRaw){
        		if(tileKebab.addKebab()){
    				ItemStack currentItem = player.getCurrentEquippedItem();
        			player.inventory.decrStackSize(player.inventory.currentItem, 1); 
        			
        		}
        		
        	}else if(player.getCurrentEquippedItem().getItem() == BandbItems.itemKnifeIron){
				if(tileKebab.isKebabCooked()){
					tileKebab.decrLayer();					
					if (!this.playerHasItem(player, BandbItems.itemKebab) && player.inventory.getFirstEmptyStack() == -1) {
						EntityItem entityitem = new EntityItem(world, player.posX, player.posY + 1, player.posZ, new ItemStack(BandbItems.itemKebab));
						if (!world.isRemote)
							world.spawnEntityInWorld(entityitem);
					}else{
						((EntityPlayer)MinecraftServer.getServer().getConfigurationManager().playerEntityList.get(0)).inventory.addItemStackToInventory(new ItemStack(BandbItems.itemKebab));					}
				}
				
        	}else if(player.getCurrentEquippedItem().getItem() == BandbItems.itemKebabSpit){
				if(tileKebab.getLayerRemaining() == 0){
					tileKebab.addSplit();
	   				ItemStack currentItem = player.getCurrentEquippedItem();
        			player.inventory.decrStackSize(player.inventory.currentItem, 1); 
				}
        	}
        	
        }
		else if(tile instanceof TileEntityKebabStand && !player.isSneaking() && (player.getCurrentEquippedItem() == null  || player.getCurrentEquippedItem().getItem() == BandbItems.itemKebabSpit)){
			TileEntityKebabStand tileKebab = (TileEntityKebabStand)tile;

			if(tileKebab.getLayerRemaining() == 1){
				if (!this.playerHasItem(player, BandbItems.itemKebabSpit) && player.inventory.getFirstEmptyStack() == -1) {
					EntityItem entityitem = new EntityItem(world, player.posX, player.posY + 1, player.posZ, new ItemStack(BandbItems.itemKebabSpit));
					tileKebab.setLayerRemaining(0);
					if (!world.isRemote)
						world.spawnEntityInWorld(entityitem);
				}else{
					
					player.inventory.addItemStackToInventory(new ItemStack(BandbItems.itemKebabSpit));
					tileKebab.setLayerRemaining(0);
				}

			}
		}
		return true;
	}

	public TileEntity createNewTileEntity(World var1, int i) {
		return new TileEntityKebabStand();
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
		
		 public void onBlockPlacedBy(World world, int x, int y, int z, EntityLivingBase living, ItemStack stack)
		    {
		        if(stack.getItemDamage() == 0)
		        {
		            TileEntity tile = world.getTileEntity(x, y, z);
		            if(tile instanceof TileEntityKebabStand)
		            {
		                int direction = MathHelper.floor_double((double)(living.rotationYaw * 4.0F / 360.0F) + 2.5D) & 3;
		                ((TileEntityKebabStand)tile).setDirection((byte)direction);
		            }
		        }
		    }
		    
		    public void setBlockBoundsBasedOnState(IBlockAccess world, int x, int y, int z)
		    {
		        TileEntity tile = world.getTileEntity(x, y, z);
		        if(tile instanceof TileEntityKebabStand)
		        {
		        	TileEntityKebabStand tileentity = (TileEntityKebabStand)tile;
		            switch(tileentity.getDirection())
		            {
		                case 0:
		                    this.setBlockBounds(0F, 0F, 0.0F, 1.0F, 1.2F, 1.0F); //valeur pour la direction 0
		                    break;
		                case 1:
		                	this.setBlockBounds(0F, 0F, 0.0F, 1.0F, 1.2F, 1.0F); //valeur pour la direction 1
		                    break;
		                case 2:
		                	this.setBlockBounds(0F, 0F, 0.0F, 1.0F, 1.2F, 1.0F); //valeur pour la direction 2
		                    break;
		                case 3:
		                	this.setBlockBounds(0F, 0F, 0.0F, 1.0F, 1.2F, 1.0F); //valeur pour la direction 3
		                    break;
		            }
		        }
		    }
		    
		 // check if the player has the itemDrop in is inventory
			public boolean playerHasItem(EntityPlayer player, Item itemB) {
				for (int i = 0; i < player.inventory.mainInventory.length; i++) {
					ItemStack itemstack = player.inventory.mainInventory[i];
					if (itemstack != null) {
						Item item = itemstack.getItem();

						if (item == itemB) {
							return true;
						}
					}
				}
				return false;
			}

}
