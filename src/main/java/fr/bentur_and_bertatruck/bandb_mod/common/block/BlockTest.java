package fr.bentur_and_bertatruck.bandb_mod.common.block;

import java.util.ArrayList;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class BlockTest extends Block{

	public BlockTest() {
		super(Material.rock);
		
		
		
		this.setHardness(1.0f);
		this.setResistance(20.0f);
		}
		@Override
		public ArrayList<ItemStack> getDrops(World world, int x, int y, int z, int metadata, int fortune) {
		ArrayList<ItemStack> drops = new ArrayList<ItemStack>();
		drops.add(new ItemStack(Items.coal, world.rand.nextInt(3) + 1));
		drops.add(new ItemStack(Items.iron_ingot, world.rand.nextInt(2) + 1));
		drops.add(new ItemStack(Items.gold_ingot, world.rand.nextInt(2) + 1));
		drops.add(new ItemStack(Items.dye, world.rand.nextInt(3) + 2, 4));
		drops.add(new ItemStack(Items.redstone, world.rand.nextInt(2) + 2));
		if (world.rand.nextFloat() < 0.5F)
		drops.add(new ItemStack(Items.diamond));
		return drops;
		}

	
}
