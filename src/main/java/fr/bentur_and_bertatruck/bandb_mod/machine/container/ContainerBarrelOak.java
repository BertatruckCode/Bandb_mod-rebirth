package fr.bentur_and_bertatruck.bandb_mod.machine.container;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.inventory.Container;
import net.minecraft.inventory.ICrafting;
import net.minecraft.inventory.Slot;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import fr.bentur_and_bertatruck.bandb_mod.common.item.ItemBeverageGrape;
import fr.bentur_and_bertatruck.bandb_mod.common.item.ItemBottle;
import fr.bentur_and_bertatruck.bandb_mod.common.loader.BandbFuel;
import fr.bentur_and_bertatruck.bandb_mod.machine.slot.SlotBarrelOakBottle;
import fr.bentur_and_bertatruck.bandb_mod.machine.slot.SlotBarrelOakBottleGrape;
import fr.bentur_and_bertatruck.bandb_mod.machine.slot.SlotPrinterOutput;
import fr.bentur_and_bertatruck.bandb_mod.machine.slot.SlotSyrupMachineFuel;
import fr.bentur_and_bertatruck.bandb_mod.machine.slot.SlotSyrupMachineOutput;
import fr.bentur_and_bertatruck.bandb_mod.machine.tileEntity.TileEntityBarrelOak;

public class ContainerBarrelOak extends Container {
	private TileEntityBarrelOak tileEntity;
	public int lastWorkTimeLeft;
	public int lastCurrentItemWorkTime;
	public int lastWorkTime;

	public ContainerBarrelOak(InventoryPlayer inventory, TileEntityBarrelOak tileentity) {
		this.tileEntity = tileentity;
		
		this.addSlotToContainer(new SlotPrinterOutput(tileentity, 0, 122, 45)); //output
		this.addSlotToContainer(new SlotPrinterOutput(tileentity, 1, 157, 49)); //output bottle
		
		this.addSlotToContainer(new SlotBarrelOakBottle(tileentity, 2, 35, 11)); //input bottle empty
		this.addSlotToContainer(new SlotBarrelOakBottleGrape(tileentity, 3, 35, 30)); //input beverage
		this.addSlotToContainer(new SlotBarrelOakBottleGrape(tileentity, 4, 35, 49)); //input beverage		
		
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 9; j++) {
				this.addSlotToContainer(new Slot(inventory, j + i * 9 + 9, 13 + j * 18, 84 + i * 18));
			}
		}
		for (int i = 0; i < 9; i++) {
			this.addSlotToContainer(new Slot(inventory, i, 13 + i * 18, 142));
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
				if (!this.mergeItemStack(stack, 5, inventorySlots.size(), true))
				return null;
			case 1:
				if (!this.mergeItemStack(stack, 5, inventorySlots.size(), true))
					return null;
				break;
			case 2: {
				if (!this.mergeItemStack(stack, 5, inventorySlots.size(), true))
					return null;
				break;
			}
			case 3: {
				if (!this.mergeItemStack(stack, 5, inventorySlots.size(), true))
					return null;
				break;
			}
			case 4: {
				if (!this.mergeItemStack(stack, 5, inventorySlots.size(), true))
					return null;
				break;
			}
			default: {
				 if(stack.getItem() instanceof ItemBottle) {
					if (!this.mergeItemStack(stack, 2, 3, false))
						return null;
				} else if(stack.getItem() instanceof ItemBeverageGrape) {
					if (!this.mergeItemStack(stack, 3, 5, false))
						return null;
				} else {
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