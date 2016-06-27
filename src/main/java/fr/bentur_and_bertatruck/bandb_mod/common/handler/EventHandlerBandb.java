package fr.bentur_and_bertatruck.bandb_mod.common.handler;

import java.util.Random;

import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.passive.EntityChicken;
import net.minecraft.entity.passive.EntityCow;
import net.minecraft.entity.passive.EntityHorse;
import net.minecraft.entity.passive.EntityPig;
import net.minecraft.entity.passive.EntitySheep;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.event.entity.living.LivingDropsEvent;
import net.minecraftforge.event.world.BlockEvent.HarvestDropsEvent;
import cpw.mods.fml.common.eventhandler.EventPriority;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.gameevent.PlayerEvent.ItemCraftedEvent;
import fr.bentur_and_bertatruck.bandb_mod.common.loader.BandbItems;
import fr.bentur_and_bertatruck.bandb_mod.entity.EntityCowCharolaise;
import fr.bentur_and_bertatruck.bandb_mod.entity.EntityCowGasconne;
import fr.bentur_and_bertatruck.bandb_mod.entity.EntityCowKerry;
import fr.bentur_and_bertatruck.bandb_mod.entity.EntityCowLaughting;
import fr.bentur_and_bertatruck.bandb_mod.entity.EntityCowMilka;
import fr.bentur_and_bertatruck.bandb_mod.entity.EntityCowMontbeliarde;

public class EventHandlerBandb {

	@SubscribeEvent(priority = EventPriority.HIGHEST, receiveCanceled = true)
	public void onEvent(LivingDropsEvent event) {
		if (event.entity instanceof EntitySheep) {
			
			Random random = new Random();
			
			ItemStack itemStackToDrop1 = new ItemStack(BandbItems.itemLegMuttonRaw, random.nextInt(2) );
			event.drops.add(new EntityItem(event.entity.worldObj,event.entity.posX,event.entity.posY, event.entity.posZ, itemStackToDrop1));
			
			ItemStack itemStackToDrop2 = new ItemStack(BandbItems.itemShoulderMuttonRaw, random.nextInt(2) );
			event.drops.add(new EntityItem(event.entity.worldObj,event.entity.posX,event.entity.posY, event.entity.posZ, itemStackToDrop2));

			ItemStack itemStackToDrop3 = new ItemStack(BandbItems.itemSaddleMuttonRaw, random.nextInt(2) );
			event.drops.add(new EntityItem(event.entity.worldObj,event.entity.posX,event.entity.posY, event.entity.posZ, itemStackToDrop3));
			
			ItemStack itemStackToDrop4 = new ItemStack(BandbItems.itemMuttonBrain, random.nextInt(1) );
			event.drops.add(new EntityItem(event.entity.worldObj,event.entity.posX,event.entity.posY, event.entity.posZ, itemStackToDrop4));
						
		}
		if (event.entity instanceof EntityHorse) {
			
			//ItemStack itemStackToDrop = new ItemStack(BandbItem.itemLasagna, 5);
			//event.drops.add(new EntityItem(event.entity.worldObj,event.entity.posX,event.entity.posY, event.entity.posZ, itemStackToDrop));			
		}
		if (event.entity instanceof EntityCow) {
			
			event.drops.clear();
			
			Random random = new Random();

			ItemStack itemStackToDrop1 = new ItemStack(BandbItems.itemCowForeRibRaw, random.nextInt(2) );
			event.drops.add(new EntityItem(event.entity.worldObj,event.entity.posX,event.entity.posY, event.entity.posZ, itemStackToDrop1));
			
			ItemStack itemStackToDrop2 = new ItemStack(BandbItems.itemCowRumpsteakRaw, random.nextInt(2) );
			event.drops.add(new EntityItem(event.entity.worldObj,event.entity.posX,event.entity.posY, event.entity.posZ, itemStackToDrop2));
			
			ItemStack itemStackToDrop3 = new ItemStack(Items.leather, random.nextInt(3) );
			event.drops.add(new EntityItem(event.entity.worldObj,event.entity.posX,event.entity.posY, event.entity.posZ, itemStackToDrop3));
			
		}
		if (event.entity instanceof EntityPig) {
			
			event.drops.clear();
			
			Random random = new Random();
			
			ItemStack itemStackToDrop1 = new ItemStack(BandbItems.itemPorkForeLoinRaw, random.nextInt(2) );
			event.drops.add(new EntityItem(event.entity.worldObj,event.entity.posX,event.entity.posY, event.entity.posZ, itemStackToDrop1));
			
			ItemStack itemStackToDrop2 = new ItemStack(BandbItems.itemPorkHamRaw, random.nextInt(2) );
			event.drops.add(new EntityItem(event.entity.worldObj,event.entity.posX,event.entity.posY, event.entity.posZ, itemStackToDrop2));

			ItemStack itemStackToDrop3 = new ItemStack(BandbItems.itemPorkLoinChopsRaw, random.nextInt(2) );
			event.drops.add(new EntityItem(event.entity.worldObj,event.entity.posX,event.entity.posY, event.entity.posZ, itemStackToDrop3));
			

		}
		if (event.entity instanceof EntityChicken) {
			Random random = new Random();

			
			event.drops.clear();
						
			ItemStack itemStackToDrop1 = new ItemStack(BandbItems.itemChickenFullRaw, 1 );
			event.drops.add(new EntityItem(event.entity.worldObj,event.entity.posX,event.entity.posY, event.entity.posZ, itemStackToDrop1));
			
			ItemStack itemStackToDrop2 = new ItemStack(Items.feather, random.nextInt(4) );
			event.drops.add(new EntityItem(event.entity.worldObj,event.entity.posX,event.entity.posY, event.entity.posZ, itemStackToDrop2));

		}	
		//custom cow
		if (event.entity instanceof EntityCowCharolaise) {
			event.drops.clear();
			
			Random random = new Random();

			ItemStack itemStackToDrop1 = new ItemStack(BandbItems.itemCowForeRibRaw, random.nextInt(2) );
			event.drops.add(new EntityItem(event.entity.worldObj,event.entity.posX,event.entity.posY, event.entity.posZ, itemStackToDrop1));
			
			ItemStack itemStackToDrop2 = new ItemStack(BandbItems.itemCowRumpsteakRaw, random.nextInt(2) );
			event.drops.add(new EntityItem(event.entity.worldObj,event.entity.posX,event.entity.posY, event.entity.posZ, itemStackToDrop2));
			
			ItemStack itemStackToDrop3 = new ItemStack(BandbItems.itemLeatherCowCharolais, random.nextInt(3) );
			event.drops.add(new EntityItem(event.entity.worldObj,event.entity.posX,event.entity.posY, event.entity.posZ, itemStackToDrop3));
		}	
		if (event.entity instanceof EntityCowGasconne) {
			event.drops.clear();
			
			Random random = new Random();

			ItemStack itemStackToDrop1 = new ItemStack(BandbItems.itemCowForeRibRaw, random.nextInt(2) );
			event.drops.add(new EntityItem(event.entity.worldObj,event.entity.posX,event.entity.posY, event.entity.posZ, itemStackToDrop1));
			
			ItemStack itemStackToDrop2 = new ItemStack(BandbItems.itemCowRumpsteakRaw, random.nextInt(2) );
			event.drops.add(new EntityItem(event.entity.worldObj,event.entity.posX,event.entity.posY, event.entity.posZ, itemStackToDrop2));
			
			ItemStack itemStackToDrop3 = new ItemStack(BandbItems.itemLeatherCowGasconne, random.nextInt(3) );
			event.drops.add(new EntityItem(event.entity.worldObj,event.entity.posX,event.entity.posY, event.entity.posZ, itemStackToDrop3));
		}	
		if (event.entity instanceof  EntityCowKerry) {
			event.drops.clear();
			
			Random random = new Random();

			ItemStack itemStackToDrop1 = new ItemStack(BandbItems.itemCowForeRibRaw, random.nextInt(2) );
			event.drops.add(new EntityItem(event.entity.worldObj,event.entity.posX,event.entity.posY, event.entity.posZ, itemStackToDrop1));
			
			ItemStack itemStackToDrop2 = new ItemStack(BandbItems.itemCowRumpsteakRaw, random.nextInt(2) );
			event.drops.add(new EntityItem(event.entity.worldObj,event.entity.posX,event.entity.posY, event.entity.posZ, itemStackToDrop2));
			
			ItemStack itemStackToDrop3 = new ItemStack(BandbItems.itemLeatherCowKerry, random.nextInt(3) );
			event.drops.add(new EntityItem(event.entity.worldObj,event.entity.posX,event.entity.posY, event.entity.posZ, itemStackToDrop3));
		}	
		if (event.entity instanceof  EntityCowLaughting) {
			event.drops.clear();
			
			Random random = new Random();
			
			ItemStack itemStackToDrop3 = new ItemStack(BandbItems.itemLeatherCowBel, random.nextInt(3) );
			event.drops.add(new EntityItem(event.entity.worldObj,event.entity.posX,event.entity.posY, event.entity.posZ, itemStackToDrop3));
		}	
		if (event.entity instanceof  EntityCowMilka) {
			event.drops.clear();
			
			Random random = new Random();
			
			ItemStack itemStackToDrop3 = new ItemStack(BandbItems.itemLeatherCowMilka, random.nextInt(3) );
			event.drops.add(new EntityItem(event.entity.worldObj,event.entity.posX,event.entity.posY, event.entity.posZ, itemStackToDrop3));
		}	
		if (event.entity instanceof  EntityCowMontbeliarde) {
			event.drops.clear();
			
			Random random = new Random();

			ItemStack itemStackToDrop1 = new ItemStack(BandbItems.itemCowForeRibRaw, random.nextInt(2) );
			event.drops.add(new EntityItem(event.entity.worldObj,event.entity.posX,event.entity.posY, event.entity.posZ, itemStackToDrop1));
			
			ItemStack itemStackToDrop2 = new ItemStack(BandbItems.itemCowRumpsteakRaw, random.nextInt(2) );
			event.drops.add(new EntityItem(event.entity.worldObj,event.entity.posX,event.entity.posY, event.entity.posZ, itemStackToDrop2));
			
			ItemStack itemStackToDrop3 = new ItemStack(BandbItems.itemLeatherCowMontbeliarde, random.nextInt(3) );
			event.drops.add(new EntityItem(event.entity.worldObj,event.entity.posX,event.entity.posY, event.entity.posZ, itemStackToDrop3));
		}	
		
		
		
	}

	@SubscribeEvent(priority = EventPriority.NORMAL, receiveCanceled = true)
	public void onBlockDestroyedByPlayer(HarvestDropsEvent event){
		    
    if(event.block == Blocks.leaves ){    	
    	event.drops.remove(Items.apple);
    	
    }
}
	@SubscribeEvent(priority = EventPriority.NORMAL, receiveCanceled = true)
	public void onCrafting(ItemCraftedEvent event){
		    
    if(event.crafting.getItem() == BandbItems.itemChickenFullRaw){
    	
    	
    }
}
	
}
