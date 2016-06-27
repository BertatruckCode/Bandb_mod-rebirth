package fr.bentur_and_bertatruck.bandb_mod.common.item;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class ItemChili extends ItemFood{

	public ItemChili(int heal, float saturation, boolean wolfmeat) {
		super(heal, saturation, wolfmeat);

	}
	
	public ItemStack onEaten(ItemStack item, World world, EntityPlayer player) {
		
		player.setFire(5);		
		item.stackSize--;
		
		player.getFoodStats().func_151686_a(this, item);
		world.playSoundAtEntity(player, "random.burp", 0.5F, world.rand.nextFloat() * 0.1F + 0.9F);

		return item;
	}
	

}
