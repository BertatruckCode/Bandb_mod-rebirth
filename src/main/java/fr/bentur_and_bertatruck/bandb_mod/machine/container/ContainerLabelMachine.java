package fr.bentur_and_bertatruck.bandb_mod.machine.container;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.init.Items;
import net.minecraft.inventory.Container;
import net.minecraft.inventory.ICrafting;
import net.minecraft.inventory.Slot;
import net.minecraft.inventory.SlotFurnace;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.FurnaceRecipes;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import fr.bentur_and_bertatruck.bandb_mod.common.item.ItemCapsule;
import fr.bentur_and_bertatruck.bandb_mod.common.loader.BandbFuel;
import fr.bentur_and_bertatruck.bandb_mod.common.loader.BandbItems;
import fr.bentur_and_bertatruck.bandb_mod.machine.slot.SlotSyrupMachineFuel;
import fr.bentur_and_bertatruck.bandb_mod.machine.slot.SlotSyrupMachineOutput;
import fr.bentur_and_bertatruck.bandb_mod.machine.tileEntity.TileEntityDrier;
import fr.bentur_and_bertatruck.bandb_mod.machine.tileEntity.TileEntityLabelMachine;
import fr.bentur_and_bertatruck.bandb_mod.machine.tileEntity.TileEntityOven;

public class ContainerLabelMachine extends Container {
	private TileEntityLabelMachine tileEntity;
	public int lastWorkTimeLeft;
	public int lastCurrentItemWorkTime;
	public int lastWorkTime;

	public ContainerLabelMachine(InventoryPlayer inventory, TileEntityLabelMachine tileentity) {
		this.tileEntity = tileentity;
		this.addSlotToContainer(new SlotSyrupMachineOutput(tileentity, 0, 116, 34)); //output 
		this.addSlotToContainer(new SlotSyrupMachineFuel(tileentity, 1, 9, 57));
		this.addSlotToContainer(new Slot(tileentity, 2, 56, 24));
		this.addSlotToContainer(new Slot(tileentity, 3, 56, 45));

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 9; j++) {
				this.addSlotToContainer(new Slot(inventory, j + i * 9 + 9,
						8 + j * 18, 84 + i * 18));
			}
		}
		for (int i = 0; i < 9; i++) {
			this.addSlotToContainer(new Slot(inventory, i, 8 + i * 18, 142));
		}
	}

	public void addCraftingToCrafters(ICrafting icrafting) {
		super.addCraftingToCrafters(icrafting);
		icrafting.sendProgressBarUpdate(this, 0, this.tileEntity.workTime);
		icrafting.sendProgressBarUpdate(this, 1, this.tileEntity.workTimeLeft);
		icrafting.sendProgressBarUpdate(this, 2, this.tileEntity.currentItemWorkTime);
	}

	public void detectAndSendChanges() {
		super.detectAndSendChanges();
		for (int i = 0; i < this.crafters.size(); i++) {
			ICrafting icrafting = (ICrafting) this.crafters.get(i);
			if (this.lastWorkTime != this.tileEntity.workTime) {
				icrafting.sendProgressBarUpdate(this, 0,this.tileEntity.workTime);
			}
			if (this.lastWorkTimeLeft != this.tileEntity.workTimeLeft) {
				icrafting.sendProgressBarUpdate(this, 1,this.tileEntity.workTimeLeft);
			}
			if (this.lastCurrentItemWorkTime != this.tileEntity.currentItemWorkTime) {
				icrafting.sendProgressBarUpdate(this, 2,this.tileEntity.currentItemWorkTime);
			}
		}
		this.lastWorkTime = this.tileEntity.workTime;
		this.lastWorkTimeLeft = this.tileEntity.workTimeLeft;
		this.lastCurrentItemWorkTime = this.tileEntity.currentItemWorkTime;
	}

	@SideOnly(Side.CLIENT)
	public void updateProgressBar(int par1, int par2) {
		if (par1 == 0) {
			this.tileEntity.workTime = par2;
		}
		if (par1 == 1) {
			this.tileEntity.workTimeLeft = par2;
		}
		if (par1 == 2) {
			this.tileEntity.currentItemWorkTime = par2;
		}
	}

	public ItemStack transferStackInSlot(EntityPlayer player, int slotid) {
		super.transferStackInSlot(player, slotid);
		ItemStack stack = null;
		Slot slot = (Slot) inventorySlots.get(slotid);
		if (slot != null && slot.getHasStack()) {
			stack = slot.getStack();
			switch (slotid) {
			case 0:
				if (!this.mergeItemStack(stack, 3, inventorySlots.size(), true))
				return null;
			case 1:
				if (!this.mergeItemStack(stack, 3, inventorySlots.size(), true))
					return null;
				break;
			case 2: {
				if (!this.mergeItemStack(stack, 3, inventorySlots.size(), true))
					return null;
				break;
			}
			default: {
				 if (BandbFuel.getFuelValue(stack.getItem()) > 0) {
					if (!this.mergeItemStack(stack, 1, 2, false))
						return null;
				} else {
					if (!this.mergeItemStack(stack, 0, 1, false))
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

	public boolean canInteractWith(EntityPlayer var1) {
		return true;
	}
}