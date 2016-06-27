package fr.bentur_and_bertatruck.bandb_mod.nature.block;

import java.util.ArrayList;
import java.util.Random;

import net.minecraft.block.BlockLeaves;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import fr.bentur_and_bertatruck.bandb_mod.common.Bandb_mod;
import fr.bentur_and_bertatruck.bandb_mod.common.loader.BandbBlocks;
import fr.bentur_and_bertatruck.bandb_mod.common.loader.BandbCreativeTabs;
import fr.bentur_and_bertatruck.bandb_mod.common.loader.BandbItems;

public class BlockTreeLeaf extends BlockLeaves {
	protected IIcon fastIcon;
	protected String name;
	protected Item itemDrop;
//drop Sapling and Fruit
	public BlockTreeLeaf(String string, Item item) {
		name = string;
		itemDrop = item;
		this.setCreativeTab(BandbCreativeTabs.CreativeTabsLeaf);
	}

	@Override
	public void registerBlockIcons(IIconRegister iconregister) {
		blockIcon = iconregister.registerIcon(this.getTextureName());
		fastIcon = iconregister.registerIcon(this.getTextureName() + "_opaque");

	}

	@Override
	public IIcon getIcon(int side, int metadata) {
		return (isOpaqueCube() ? fastIcon : blockIcon);
	}

	@Override
	public String[] func_150125_e() {
		return null;
	}

	@Override
	public boolean isOpaqueCube() {
		return Blocks.leaves.isOpaqueCube();
	}

	@Override
	public boolean isLeaves(IBlockAccess world, int x, int y, int z) {
		return true;
	}

	@Override
	public int getBlockColor() {
		return -1;
	}

	@Override
	public int getRenderColor(int par1) {
		return -1;
	}

	@Override
	public int quantityDropped(Random random) {
		return random.nextInt(20) == 0 ? 1 : 0;
	}

	@Override
	public ArrayList<ItemStack> getDrops(World world, int x, int y, int z, int metadata, int fortune) {
	ArrayList<ItemStack> drops = new ArrayList<ItemStack>();
	if (world.rand.nextFloat() < 0.10F){
		if (name == "almond")
			drops.add(new ItemStack(Item.getItemFromBlock(BandbBlocks.blockAlmondSapling)));
		if (name == "apricot")
			drops.add(new ItemStack(Item.getItemFromBlock(BandbBlocks.blockApricotSapling)));
		if (name == "banana")
			drops.add(new ItemStack(Item.getItemFromBlock(BandbBlocks.blockBananaSapling)));
		if (name == "cherry")
			drops.add(new ItemStack(Item.getItemFromBlock(BandbBlocks.blockCherrySapling)));
		if (name == "clementine")
			drops.add(new ItemStack(Item.getItemFromBlock(BandbBlocks.blockClementineSapling)));
		if (name == "date")
			drops.add(new ItemStack(Item.getItemFromBlock(BandbBlocks.blockDateSapling)));
		if (name == "dragonfruit")
			drops.add(new ItemStack(Item.getItemFromBlock(BandbBlocks.blockDragonfruitSapling)));
		if (name == "fig")
			drops.add(new ItemStack(Item.getItemFromBlock(BandbBlocks.blockFigSapling)));
		if (name == "guava")
			drops.add(new ItemStack(Item.getItemFromBlock(BandbBlocks.blockGuavaSapling)));
		if (name == "lemon")
			drops.add(new ItemStack(Item.getItemFromBlock(BandbBlocks.blockLemonSapling)));
		if (name == "lime")
			drops.add(new ItemStack(Item.getItemFromBlock(BandbBlocks.blockLimeSapling)));
		if (name == "lychee")
			drops.add(new ItemStack(Item.getItemFromBlock(BandbBlocks.blockLycheeSapling)));
		if (name == "passionfruit")
			drops.add(new ItemStack(Item.getItemFromBlock(BandbBlocks.blockPassionfruitSapling)));
		if (name == "pomegranate")
			drops.add(new ItemStack(Item.getItemFromBlock(BandbBlocks.blockPomegranateSapling)));
		if (name == "quince")
			drops.add(new ItemStack( Item.getItemFromBlock(BandbBlocks.blockQuinceSapling)));

		if (name == "avocado")
			drops.add(new ItemStack( Item.getItemFromBlock(BandbBlocks.blockAvocadoSapling)));

		if (name == "coconut")
			drops.add(new ItemStack( Item.getItemFromBlock(BandbBlocks.blockCoconutSapling)));

		if (name == "tangerine")
			drops.add(new ItemStack( Item.getItemFromBlock(BandbBlocks.blockTangerineSapling)));

		if (name == "mango")
			drops.add(new ItemStack( Item.getItemFromBlock(BandbBlocks.blockMangoSapling)));

		if (name == "chestnut")
			drops.add(new ItemStack( Item.getItemFromBlock(BandbBlocks.blockChestnutSapling)));

		if (name == "mirabelle")
			drops.add(new ItemStack( Item.getItemFromBlock(BandbBlocks.blockMirabelleSapling)));

		if (name == "nuts")
			drops.add(new ItemStack( Item.getItemFromBlock(BandbBlocks.blockNutsSapling)));

		if (name == "walnut")
			drops.add(new ItemStack( Item.getItemFromBlock(BandbBlocks.blockWalnutSapling)));

		if (name == "olive")
			drops.add(new ItemStack( Item.getItemFromBlock(BandbBlocks.blockOliveSapling)));

		if (name == "orange")
			drops.add(new ItemStack( Item.getItemFromBlock(BandbBlocks.blockOrangeSapling)));

		if (name == "grapefruit")
			drops.add(new ItemStack( Item.getItemFromBlock(BandbBlocks.blockGrapefruitSapling)));

		if (name == "papaya")
			drops.add(new ItemStack( Item.getItemFromBlock(BandbBlocks.blockPapayaSapling)));

		if (name == "peach")
			drops.add(new ItemStack( Item.getItemFromBlock(BandbBlocks.blockPeachSapling)));

		if (name == "pear")
			drops.add(new ItemStack( Item.getItemFromBlock(BandbBlocks.blockPearSapling)));

		if (name == "plum")
			drops.add(new ItemStack( Item.getItemFromBlock(BandbBlocks.blockPlumSapling)));

		if (name == "african")
			drops.add(new ItemStack( Item.getItemFromBlock(BandbBlocks.blockAfricanSapling)));

		if (name == "anise")
			drops.add(new ItemStack( Item.getItemFromBlock(BandbBlocks.blockAniseSapling)));

		if (name == "staranise")
			drops.add(new ItemStack( Item.getItemFromBlock(BandbBlocks.blockStarAniseSapling)));

		if (name == "cacao")
			drops.add(new ItemStack( Item.getItemFromBlock(BandbBlocks.blockCacaoSapling)));

		if (name == "cashew")
			drops.add(new ItemStack( Item.getItemFromBlock(BandbBlocks.blockCashewSapling)));

		if (name == "amia")
			drops.add(new ItemStack( Item.getItemFromBlock(BandbBlocks.blockAmlaSapling)));

		if (name == "persimmon")
			drops.add(new ItemStack( Item.getItemFromBlock(BandbBlocks.blockPersimmonSapling)));

		if (name == "nectarine")
			drops.add(new ItemStack( Item.getItemFromBlock(BandbBlocks.blockNectarineSapling)));

		if (name == "kumquat")
			drops.add(new ItemStack( Item.getItemFromBlock(BandbBlocks.blockKumquatSapling)));

		if (name == "jujube")
			drops.add(new ItemStack( Item.getItemFromBlock(BandbBlocks.blockJujubeSapling)));

		if (name == "crabapple")
			drops.add(new ItemStack( Item.getItemFromBlock(BandbBlocks.blockCrabappleSapling)));

		if (name == "antares")
			drops.add(new ItemStack( Item.getItemFromBlock(BandbBlocks.blockAppleAntaresSapling)));

		if (name == "ariane")
			drops.add(new ItemStack( Item.getItemFromBlock(BandbBlocks.blockAppleArianeSapling)));

		if (name == "belchardchantecier")
			drops.add(new ItemStack( Item.getItemFromBlock(BandbBlocks.blockAppleBelchardChancelierSapling)));

		if (name == "belledeboskoop")
			drops.add(new ItemStack( Item.getItemFromBlock(BandbBlocks.blockAppleBelleDeBoskoopSapling)));

		if (name == "braeburn")
			drops.add(new ItemStack( Item.getItemFromBlock(BandbBlocks.blockAppleBraeburnSapling)));

		if (name == "elstar")
			drops.add(new ItemStack( Item.getItemFromBlock(BandbBlocks.blockAppleElstarSapling)));

		if (name == "Fuji")
			drops.add(new ItemStack( Item.getItemFromBlock(BandbBlocks.blockAppleFujiSapling)));

		if (name == "Gala")
			drops.add(new ItemStack( Item.getItemFromBlock(BandbBlocks.blockAppleGalaSapling)));

		if (name == "golden")
			drops.add(new ItemStack( Item.getItemFromBlock(BandbBlocks.blockAppleGoldenSapling)));

		if (name == "grannysmith")
			drops.add(new ItemStack( Item.getItemFromBlock(BandbBlocks.blockAppleGrannySmithSapling)));

		if (name == "honeycrunch")
			drops.add(new ItemStack( Item.getItemFromBlock(BandbBlocks.blockAppleHoneycrunchSapling)));

		if (name == "jazz")
			drops.add(new ItemStack( Item.getItemFromBlock(BandbBlocks.blockAppleJazzSapling)));

		if (name == "jonagoldjonagored")
			drops.add(new ItemStack( Item.getItemFromBlock(BandbBlocks.blockAppleJonagoldJonagoredSapling)));

		if (name == "lesrouges")
			drops.add(new ItemStack( Item.getItemFromBlock(BandbBlocks.blockAppleLesRougesSapling)));

		if (name == "pinklady")
			drops.add(new ItemStack( Item.getItemFromBlock(BandbBlocks.blockApplePinkLadySapling)));

		if (name == "pommedulimousin")
			drops.add(new ItemStack( Item.getItemFromBlock(BandbBlocks.blockApplePommeDuLimousinSapling)));

		if (name == "reinedesreinettes")
			drops.add(new ItemStack( Item.getItemFromBlock(BandbBlocks.blockAppleReineDesReinettesSapling)));

		if (name == "reinettegriseducanada")
			drops.add(new ItemStack( Item.getItemFromBlock(BandbBlocks.blockAppleReinetteGriseDuCanadaSapling)));

		if (name == "tentation")
			drops.add(new ItemStack( Item.getItemFromBlock(BandbBlocks.blockAppleTentationSapling)));

		if (name == "breadnut")
			drops.add(new ItemStack( Item.getItemFromBlock(BandbBlocks.blockBreadNutSapling)));

		if (name == "kiwi")
			drops.add(new ItemStack( Item.getItemFromBlock(BandbBlocks.blockKiwiSapling)));

		if (name == "pistachio")
			drops.add(new ItemStack( Item.getItemFromBlock(BandbBlocks.blockPistachioSapling)));

		if (name == "vanilla")
			drops.add(new ItemStack( Item.getItemFromBlock(BandbBlocks.blockVanillaSapling)));	
		
		if (name == "allspice")
			drops.add(new ItemStack( Item.getItemFromBlock(BandbBlocks.blockAllspiceSapling)));
		if (name == "bael")
			drops.add(new ItemStack( Item.getItemFromBlock(BandbBlocks.blockBaelSapling)));
		if (name == "bananaplantain")
			drops.add(new ItemStack( Item.getItemFromBlock(BandbBlocks.blockBananaPlantainSapling)));
		if (name == "blackcherry")
			drops.add(new ItemStack( Item.getItemFromBlock(BandbBlocks.blockBlackCherrySapling)));
		if (name == "blackthorn")
			drops.add(new ItemStack( Item.getItemFromBlock(BandbBlocks.blockBlackthornSapling)));
		
		if (name == "brazilnut")
			drops.add(new ItemStack( Item.getItemFromBlock(BandbBlocks.blockBrazilNutSapling)));
		if (name == "butternut")
			drops.add(new ItemStack( Item.getItemFromBlock(BandbBlocks.blockButternutSapling)));
		if (name == "cinnamon")
			drops.add(new ItemStack( Item.getItemFromBlock(BandbBlocks.blockCinnamonSapling)));
		if (name == "clove")
			drops.add(new ItemStack( Item.getItemFromBlock(BandbBlocks.blockCloveSapling)));
		if (name == "damsonplum")
			drops.add(new ItemStack( Item.getItemFromBlock(BandbBlocks.blockDamsonPlumSapling)));

		if (name == "elderberry")
			drops.add(new ItemStack( Item.getItemFromBlock(BandbBlocks.blockElderberrySapling)));
		if (name == "laurel")
			drops.add(new ItemStack( Item.getItemFromBlock(BandbBlocks.blockLaurelSapling)));
		if (name == "macadamia")
			drops.add(new ItemStack( Item.getItemFromBlock(BandbBlocks.blockMacadamiaSapling)));
		if (name == "pomelo")
			drops.add(new ItemStack( Item.getItemFromBlock(BandbBlocks.blockPomeloSapling)));
		if (name == "satsuma")
			drops.add(new ItemStack( Item.getItemFromBlock(BandbBlocks.blockSatsumaSapling)));
		
		if (name == "bloodorange")
			drops.add(new ItemStack( Item.getItemFromBlock(BandbBlocks.blockBloodOrangeSapling)));
		if (name == "morellocherry")
			drops.add(new ItemStack( Item.getItemFromBlock(BandbBlocks.blockMorelloCherrySapling)));
		if (name == "whitepeach")
			drops.add(new ItemStack( Item.getItemFromBlock(BandbBlocks.blockWhitePeachSapling)));
		
		
	
	}else if (world.rand.nextFloat() < 0.05F){
		drops.add(new ItemStack(itemDrop));			
	}
	
	
	return drops;
	}
}
