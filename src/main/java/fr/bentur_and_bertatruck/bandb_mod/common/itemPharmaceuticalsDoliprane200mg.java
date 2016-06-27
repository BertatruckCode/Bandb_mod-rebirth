package fr.bentur_and_bertatruck.bandb_mod.common;

import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumAction;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import fr.bentur_and_bertatruck.bandb_mod.common.loader.BandbItems;

public class itemPharmaceuticalsDoliprane200mg extends Item {

	Item itemDrop = BandbItems.itemWrappingDoliprane200mg;

	public itemPharmaceuticalsDoliprane200mg() {
		this.setMaxStackSize(16);
	}

	public ItemStack onEaten(ItemStack item, World world, EntityPlayer player) {
		if (!player.capabilities.isCreativeMode) {
			--item.stackSize;
		}

		if (!world.isRemote) {
			player.curePotionEffects(item);
			player.clearActivePotions();
		}

		if (!this.playerHasItemDrop(player) && player.inventory.getFirstEmptyStack() == -1) {
			EntityItem entityitem = new EntityItem(world, player.posX, player.posY + 1, player.posZ, new ItemStack(itemDrop));
			if (!world.isRemote)
				world.spawnEntityInWorld(entityitem);
		} else
			player.inventory.addItemStackToInventory(new ItemStack(itemDrop));
		
		return item;
	}

	/**
	 * How long it takes to use or consume an item
	 */
	public int getMaxItemUseDuration(ItemStack item) {
		return 32;
	}

	/**
	 * returns the action that specifies what animation to play when the items
	 * is being used
	 */
	public EnumAction getItemUseAction(ItemStack item) {
		return EnumAction.eat;
	}

	/**
	 * Called whenever this item is equipped and the right mouse button is
	 * pressed. Args: itemStack, world, entityPlayer
	 */
	public ItemStack onItemRightClick(ItemStack item, World world, EntityPlayer player) {
		player.setItemInUse(item, this.getMaxItemUseDuration(item));
		return item;
	}

	// check if the player has the itemDrop in is inventory
	public boolean playerHasItemDrop(EntityPlayer player) {
		for (int i = 0; i < player.inventory.mainInventory.length; i++) {
			ItemStack itemstack = player.inventory.mainInventory[i];
			if (itemstack != null) {
				Item item = itemstack.getItem();

				if (item == itemDrop) {
					return true;
				}
			}
		}
		return false;
	}

}