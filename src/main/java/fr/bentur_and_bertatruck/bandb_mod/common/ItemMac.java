package fr.bentur_and_bertatruck.bandb_mod.common;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import cpw.mods.fml.common.network.internal.FMLNetworkHandler;
import fr.bentur_and_bertatruck.bandb_mod.common.Bandb_mod;

public class ItemMac extends Item{
	public ItemMac(){
				
	}
	/*
	public boolean onItemRightClick(ItemStack itemStack, EntityPlayer entityPlayer, World world, int x, int y, int z, int sideHit, float hitVecX, float hitVecY, float hitVecZ) {

        
        	System.out.println("gui mac openning");
        	FMLNetworkHandler.openGui(entityPlayer, Bandb_mod.instance,Bandb_mod.guiIDMac, world, x, y, z);
        
        return true;
    }
	*/
	public ItemStack onItemRightClick(ItemStack par1ItemStack, World par2World, EntityPlayer thePlayer)
    {
                              thePlayer.openGui(Bandb_mod.instance, Bandb_mod.guiIDMac, thePlayer.worldObj, (int) thePlayer.posX, (int) thePlayer.posY, (int) thePlayer.posZ);
       return par1ItemStack;
}
}
