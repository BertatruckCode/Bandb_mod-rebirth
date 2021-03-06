package fr.bentur_and_bertatruck.bandb_mod.common.block;

import fr.bentur_and_bertatruck.bandb_mod.common.loader.BandbCreativeTabs;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class BlockIngot extends Block{

	public BlockIngot(Material material) {
		super(material);
		this.setHardness(5.0F);
		this.setHarvestLevel("pickaxe", 2);
		this.setResistance(20.0F);
		this.setStepSound(Block.soundTypeMetal);
		this.setCreativeTab(BandbCreativeTabs.CreativeTabsOre);
	}

}
