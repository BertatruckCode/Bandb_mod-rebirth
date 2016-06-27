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
import fr.bentur_and_bertatruck.bandb_mod.common.loader.BandbBeverages;
import fr.bentur_and_bertatruck.bandb_mod.common.loader.BandbFuel;
import fr.bentur_and_bertatruck.bandb_mod.common.loader.BandbItems;
import fr.bentur_and_bertatruck.bandb_mod.machine.slot.SlotSyrupMachineBottle;
import fr.bentur_and_bertatruck.bandb_mod.machine.slot.SlotSyrupMachineFuel;
import fr.bentur_and_bertatruck.bandb_mod.machine.slot.SlotSyrupMachineLabel;
import fr.bentur_and_bertatruck.bandb_mod.machine.slot.SlotSyrupMachineOutput;
import fr.bentur_and_bertatruck.bandb_mod.machine.slot.SlotSyrupMachineSugar;
import fr.bentur_and_bertatruck.bandb_mod.machine.tileEntity.TileEntitySyrupMachine;

public class ContainerSyrupMachine extends Container {

	private TileEntitySyrupMachine tileEntity;
	
	public int lastFuelLeft;
	public int lastCurrentItemWorkTime;
	public int lastWorkTime;
	

	public ContainerSyrupMachine(InventoryPlayer inv, TileEntitySyrupMachine tile) {
		this.tileEntity = tile;

		addSlotToContainer(new SlotSyrupMachineOutput(tile, 0, 146, 37));
		addSlotToContainer(new SlotSyrupMachineOutput(tile, 1, 146, 61));
		addSlotToContainer(new SlotSyrupMachineFuel(tile, 2, 8, 61));

		addSlotToContainer(new SlotSyrupMachineLabel(tile, 3, 42, 56));
		addSlotToContainer(new SlotSyrupMachineSugar(tile, 4, 19, 36));
		addSlotToContainer(new SlotSyrupMachineBottle(tile, 5, 42, 18));

		addSlotToContainer(new Slot(tile, 6, 68, 18));
		addSlotToContainer(new Slot(tile, 7, 68, 56));
		addSlotToContainer(new Slot(tile, 8, 94, 18));
		addSlotToContainer(new Slot(tile, 9, 94, 56));

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
			case 0:
			case 1:
			case 2: {
				if (!this.mergeItemStack(stack, 10, inventorySlots.size(), true))
					return null;
				break;
			}
			case 3: {
				if (!this.mergeItemStack(stack, 10, inventorySlots.size(), true))
					return null;
				break;
			}
			case 4: {
				if (!this.mergeItemStack(stack, 10, inventorySlots.size(), true))
					return null;
				break;
			}
			case 5: {
				if (!this.mergeItemStack(stack, 10, inventorySlots.size(), true))
					return null;
				break;
			}
			case 6: {
				if (!this.mergeItemStack(stack, 10, inventorySlots.size(), true))
					return null;
				break;
			}
			case 7: {
				if (!this.mergeItemStack(stack, 10, inventorySlots.size(), true))
					return null;
				break;
			}
			case 8: {
				if (!this.mergeItemStack(stack, 10, inventorySlots.size(), true))
					return null;
				break;
			}
			case 9: {
				if (!this.mergeItemStack(stack, 10, inventorySlots.size(), true))
					return null;
				break;
			}

			default: {
				if (stack.getItem() == Items.sugar) {
					if (!this.mergeItemStack(stack, 4, 5, false))
						return null;
				} else if (stack.getItem() == BandbItems.itemSiropMoninOrangeLabel) {
					if (!this.mergeItemStack(stack, 3, 4, false))
						return null;
				} else if (stack.getItem() == BandbBeverages.itemSyrupMoninWOLabel) {
					if (!this.mergeItemStack(stack, 5, 6, false))
						return null;
				} else if (BandbFuel.getFuelValue(stack.getItem()) > 0) {
					if (!this.mergeItemStack(stack, 2, 3, false))
						return null;
				} else {
					if (!this.mergeItemStack(stack, 6, 10, false))
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
		}
		
		this.lastFuelLeft = this.tileEntity.FuelLeft;
		this.lastWorkTime = this.tileEntity.workTime;
		this.lastCurrentItemWorkTime = this.tileEntity.currentItemWorkTime;
		
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
	
	}

}
