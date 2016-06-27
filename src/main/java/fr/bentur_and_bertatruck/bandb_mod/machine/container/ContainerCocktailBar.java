package fr.bentur_and_bertatruck.bandb_mod.machine.container;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.init.Items;
import net.minecraft.inventory.Container;
import net.minecraft.inventory.ICrafting;
import net.minecraft.inventory.Slot;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import fr.bentur_and_bertatruck.bandb_mod.common.item.ItemGlass;
import fr.bentur_and_bertatruck.bandb_mod.common.loader.BandbFuel;
import fr.bentur_and_bertatruck.bandb_mod.common.loader.BandbItems;
import fr.bentur_and_bertatruck.bandb_mod.machine.slot.SlotCocktailBarGlass;
import fr.bentur_and_bertatruck.bandb_mod.machine.slot.SlotCocktailBarShaker;
import fr.bentur_and_bertatruck.bandb_mod.machine.slot.SlotSyrupMachineOutput;
import fr.bentur_and_bertatruck.bandb_mod.machine.tileEntity.TileEntityCocktailBar;

public class ContainerCocktailBar extends Container {

	private TileEntityCocktailBar tileEntity;
	
	public int lastFuelLeft;
	public int lastCurrentItemWorkTime;
	public int lastWorkTime;
	public int lastCurrentBottleSelected;
	

	public ContainerCocktailBar(InventoryPlayer inv, TileEntityCocktailBar tile) {
		this.tileEntity = tile;

		addSlotToContainer(new SlotSyrupMachineOutput(tile, 0, 143, 38)); //output cocktail
		addSlotToContainer(new SlotSyrupMachineOutput(tile, 1, 147, 63));	//bottle
		
		addSlotToContainer(new SlotCocktailBarShaker(tile, 2, 8, 58));	//glass
		addSlotToContainer(new SlotCocktailBarGlass(tile, 3, 8, 21));
		
		addSlotToContainer(new Slot(tile, 4, 35, 58));
		addSlotToContainer(new Slot(tile, 5, 35, 21));
		addSlotToContainer(new Slot(tile, 6, 56, 21));
		addSlotToContainer(new Slot(tile, 7, 56, 58));
		addSlotToContainer(new Slot(tile, 8, 78, 21));
		addSlotToContainer(new Slot(tile, 9, 78, 58));
		addSlotToContainer(new Slot(tile, 10, 100, 21));
		addSlotToContainer(new Slot(tile, 11, 100, 58));

		for (int i = 0; i < 3; ++i) {
			for (int j = 0; j < 9; ++j) {
				addSlotToContainer(new Slot(inv, j + (i * 9) + 9, 8 + (j * 18),
						84 + (i * 18)));
			}
		}
		for (int i = 0; i < 9; ++i) {
			addSlotToContainer(new Slot(inv, i, 8 + (i * 18), 142));
		}
	}

	@Override
	public boolean canInteractWith(EntityPlayer player) {
		return tileEntity.isUseableByPlayer(player);
	}

	@Override
	public void onContainerClosed(EntityPlayer player) {
	}

	@Override
	public ItemStack transferStackInSlot(EntityPlayer player, int slotid) {
		super.transferStackInSlot(player, slotid);

		ItemStack stack = null;
		Slot slot = (Slot) inventorySlots.get(slotid);
		if (slot != null && slot.getHasStack()) {
			stack = slot.getStack();
			switch (slotid) {
			case 0:	{
				if (!this.mergeItemStack(stack, 12, inventorySlots.size(), true))
				return null;
			break;
			}
			case 1:{
				if (!this.mergeItemStack(stack, 12, inventorySlots.size(), true))
				return null;
			break;
			}
			case 2: {
				if (!this.mergeItemStack(stack, 12, inventorySlots.size(), true))
					return null;
				break;
			}
			case 3: {
				if (!this.mergeItemStack(stack, 12, inventorySlots.size(), true))
					return null;
				break;
			}
			case 4: {
				if (!this.mergeItemStack(stack, 12, inventorySlots.size(), true))
					return null;
				break;
			}
			case 5: {
				if (!this.mergeItemStack(stack, 12, inventorySlots.size(), true))
					return null;
				break;
			}
			case 6: {
				if (!this.mergeItemStack(stack, 12, inventorySlots.size(), true))
					return null;
				break;
			}
			case 7: {
				if (!this.mergeItemStack(stack, 12, inventorySlots.size(), true))
					return null;
				break;
			}
			case 8: {
				if (!this.mergeItemStack(stack, 12, inventorySlots.size(), true))
					return null;
				break;
			}
			case 9: {
				if (!this.mergeItemStack(stack, 12, inventorySlots.size(), true))
					return null;
				break;
			}
			case 10: {
				if (!this.mergeItemStack(stack, 12, inventorySlots.size(), true))
					return null;
				break;
			}
			case 11: {
				if (!this.mergeItemStack(stack, 12, inventorySlots.size(), true))
					return null;
				break;
			}

			default: {
				if (stack.getItem() instanceof ItemGlass) {
					if (!this.mergeItemStack(stack, 3, 4, false))
						return null;
				} else if (stack.getItem() == BandbItems.itemShaker) {
					if (!this.mergeItemStack(stack, 2, 3, false))
						return null;
				}else {
					if (!this.mergeItemStack(stack, 4, 12, false))
						return null;
				}
			}
			}
			if (stack.stackSize == 0) {
				slot.putStack(null);
			}
		}
		return stack;
	}

	@Override
	public void addCraftingToCrafters(ICrafting craft) {
		super.addCraftingToCrafters(craft);

		craft.sendProgressBarUpdate(this, 0, this.tileEntity.FuelLeft);
		craft.sendProgressBarUpdate(this, 1, this.tileEntity.workTime);
		craft.sendProgressBarUpdate(this, 2, this.tileEntity.currentItemWorkTime);
		craft.sendProgressBarUpdate(this, 3, this.tileEntity.currentBottleSelected);

	}

	public void detectAndSendChanges() {
		super.detectAndSendChanges();
		
		for(int i = 0; i < this.crafters.size(); i++) {
			ICrafting icrafting = (ICrafting) this.crafters.get(i);
			
			if(this.lastFuelLeft != this.tileEntity.FuelLeft) {
				icrafting.sendProgressBarUpdate(this, 0, this.tileEntity.FuelLeft);
			}
			
			if(this.lastWorkTime != this.tileEntity.workTime) {
				icrafting.sendProgressBarUpdate(this, 1, this.tileEntity.workTime);
			}
			
			if(this.lastCurrentItemWorkTime != this.tileEntity.currentItemWorkTime) {
				icrafting.sendProgressBarUpdate(this, 2, this.tileEntity.currentItemWorkTime);
			}
			if(this.lastCurrentBottleSelected != this.tileEntity.currentBottleSelected) {
				icrafting.sendProgressBarUpdate(this, 3, this.tileEntity.currentBottleSelected);
			}
		}
		
		this.lastFuelLeft = this.tileEntity.FuelLeft;
		this.lastWorkTime = this.tileEntity.workTime;
		this.lastCurrentItemWorkTime = this.tileEntity.currentItemWorkTime;
		this.lastCurrentBottleSelected = this.tileEntity.currentBottleSelected;

	}

	@SideOnly(Side.CLIENT)
	public void updateProgressBar(int id, int value) {
		if (id == 0) {
            this.tileEntity.FuelLeft = value;
        }

        if (id == 1) {
            this.tileEntity.workTime = value;
        }

        if (id == 2) {
            this.tileEntity.currentItemWorkTime = value;
        }
        if (id == 3) {
            this.tileEntity.currentBottleSelected = value;
        }
	
	}

}
