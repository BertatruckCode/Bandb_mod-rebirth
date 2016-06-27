package fr.bentur_and_bertatruck.bandb_mod.common.block;

import java.util.Random;

import fr.bentur_and_bertatruck.bandb_mod.common.loader.BandbCreativeTabs;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;

public class BlockOreDropOre extends Block {

	public BlockOreDropOre(Material material,float hardness,int harvestLevel) {
		super(material);
		this.setHardness(hardness);
		this.setHarvestLevel("pickaxe",harvestLevel);
		this.setStepSound(Block.soundTypeStone);
		this.setCreativeTab(BandbCreativeTabs.CreativeTabsOre);
	}
}
