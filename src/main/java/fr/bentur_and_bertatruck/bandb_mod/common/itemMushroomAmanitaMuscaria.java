package fr.bentur_and_bertatruck.bandb_mod.common;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.item.EnumAction;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;
import net.minecraftforge.common.util.ForgeDirection;

public class itemMushroomAmanitaMuscaria extends Item
{
    private static final String __OBFID = "CL_00000048";

    public itemMushroomAmanitaMuscaria()
    {
        this.setMaxStackSize(64);
        
        
    }

    public ItemStack onEaten(ItemStack item, World world, EntityPlayer player)
    {
    	 if (!player.capabilities.isCreativeMode)
         {
             --item.stackSize;
         }

         if (!world.isRemote)
         {           
             player.addPotionEffect(new PotionEffect(19, 200));
         }
		return item;
         
        
    }
  public int getMaxItemUseDuration(ItemStack item)
    {
        return 32;
    }

    /**
     * returns the action that specifies what animation to play when the items is being used
     */
    public EnumAction getItemUseAction(ItemStack item)
    {
        return EnumAction.eat;
    }

    /**
     * Called whenever this item is equipped and the right mouse button is pressed. Args: itemStack, world, entityPlayer
     */
    public ItemStack onItemRightClick(ItemStack item, World world, EntityPlayer player)
    {
    	player.setItemInUse(item, this.getMaxItemUseDuration(item));
        return item;
    }

   
}
