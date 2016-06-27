/*
import net.minecraft.block.Block;
import net.minecraft.item.Item;


public static Block demoDoorBlock;
			public static Item demoDoorItem;
/*
			ListLabels.addLabels(new ItemStack(BandbItem.itemCapCorseLabel));
			ListLabels.addLabels(new ItemStack(BandbItem.itemVodkaLabel));
			System.out.println(ListLabels.Labels.size());
			ListLabels.Labels.clear();
			ListLabels.addLabels(new ItemStack(BandbItem.itemCapCorseLabel));
			ListLabels.addLabels(new ItemStack(BandbItem.itemVodkaLabel));
			System.out.println(ListLabels.Labels.size());
			*/
			
			//ChestGenHooks.			
			
			/*
			System.out.println(ListLabels.Labels.size());
			ListLabels.addLabels(new ItemStack(BandbItem.itemVodkaLabel));
			System.out.println(ListLabels.Labels.size());
*/
/*
				if (Loader.isModLoaded("malisisdoors"))	{
					//Instantiate your descriptor
					WoodenDoor demoDoor = new WoodenDoor();
					//register will register the Block, the Item, and the recipe if not null
					demoDoor.register();
					//if you need to hold a reference to the block :
					demoDoorBlock = demoDoor.getBlock();
					//if you need to hold a reference to the item :
					demoDoorItem = demoDoor.getItem();
				}else
				{
					demoDoorBlock = new WoodenDoorBlock();
					demoDoorItem = new WoodenDoorItem();

					GameRegistry.registerBlock(demoDoorBlock, demoDoorBlock.getUnlocalizedName().substring(5));
					GameRegistry.registerItem(demoDoorItem, demoDoorItem.getUnlocalizedName());
					
					GameRegistry.addRecipe(new ItemStack(demoDoorItem), new Object[] { "AC", "BB", "CA", 'A', Items.ender_pearl, 'B', Items.iron_ingot, 'C', Blocks.trapdoor });
				}
*/