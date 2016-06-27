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
import fr.bentur_and_bertatruck.bandb_mod.common.loader.BandbItems;
import fr.bentur_and_bertatruck.bandb_mod.machine.slot.SlotPrinterInk;
import fr.bentur_and_bertatruck.bandb_mod.machine.slot.SlotPrinterOutput;
import fr.bentur_and_bertatruck.bandb_mod.machine.slot.SlotPrinterPaper;
import fr.bentur_and_bertatruck.bandb_mod.machine.slot.SlotPrinterTexture;
import fr.bentur_and_bertatruck.bandb_mod.machine.tileEntity.TileEntityPrinter;

public class ContainerPrinter extends Container {

	private TileEntityPrinter tileEntity;

	public int lastInkBlack, lastInkCyan, lastInkMagenta, lastInkYellow;
	public int lastCurrentItemWorkTime, lastWorkTime, lastCurrentLabelSelected, lastAmountLabelSelected, lastStartWorking;

	public ContainerPrinter(InventoryPlayer inv, TileEntityPrinter tile) {
		this.tileEntity = tile;
		// 0=return, 1=ink, 2=paper, 3=texture
		addSlotToContainer(new SlotPrinterOutput(tile, 0, 148, 17)); //output
		addSlotToContainer(new SlotPrinterInk(tile, 1, 152, 44));	//ink	
		addSlotToContainer(new SlotPrinterPaper(tile, 2, 152, 64));	//paper
		addSlotToContainer(new SlotPrinterTexture(tile, 3, 80, 15));	//texture

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

	public boolean canInteractWith(EntityPlayer player) {
		return true;
	}

	
	public ItemStack transferStackInSlot(EntityPlayer player, int slotid) {
		super.transferStackInSlot(player, slotid);
		ItemStack stack = null;
		Slot slot = (Slot) inventorySlots.get(slotid);
		if (slot != null && slot.getHasStack()) {
			stack = slot.getStack();
			switch (slotid) {
			case 0:{
				if (!this.mergeItemStack(stack, 4, inventorySlots.size(), true))
					return null;
				break;
			}
			case 1: {
				if (!this.mergeItemStack(stack, 4, inventorySlots.size(), true))
					return null;
				break;
			}
			case 2: {
				if (!this.mergeItemStack(stack, 4, inventorySlots.size(), true))
					return null;
				break;
			}
			case 3:

			default: {
				if (stack.getItem() == BandbItems.itemBlackInkCartridge
						|| stack.getItem() == BandbItems.itemMagentaInkCartridge
						|| stack.getItem() == BandbItems.itemYellowInkCartridge
						|| stack.getItem() == BandbItems.itemCyanInkCartridge) {
					if (!this.mergeItemStack(stack, 1, 2, false))
						return null;
				} else if (stack.getItem() == Items.paper) {
					if (!this.mergeItemStack(stack, 2, 3, false))
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

	
	public void addCraftingToCrafters(ICrafting craft) {
		super.addCraftingToCrafters(craft);

		craft.sendProgressBarUpdate(this, 0, this.tileEntity.inkBlack);
		craft.sendProgressBarUpdate(this, 1, this.tileEntity.inkCyan);
		craft.sendProgressBarUpdate(this, 2, this.tileEntity.inkMagenta);
		craft.sendProgressBarUpdate(this, 3, this.tileEntity.inkYellow);
		
		craft.sendProgressBarUpdate(this, 4, this.tileEntity.currentItemWorkTime);
		craft.sendProgressBarUpdate(this, 5, this.tileEntity.workTime);
		craft.sendProgressBarUpdate(this, 6, this.tileEntity.currentLabelSelected);
		craft.sendProgressBarUpdate(this, 7, this.tileEntity.amountLabelSelected);
		craft.sendProgressBarUpdate(this, 8, this.tileEntity.startWorking);


	}

	public void detectAndSendChanges() {
		super.detectAndSendChanges();
		for (int i = 0; i < this.crafters.size(); i++) {
			ICrafting icrafting = (ICrafting) this.crafters.get(i);
			if (this.lastInkBlack != this.tileEntity.inkBlack) {
				icrafting.sendProgressBarUpdate(this, 0, this.tileEntity.inkBlack);
			}
			if (this.lastInkCyan != this.tileEntity.inkCyan) {
				icrafting.sendProgressBarUpdate(this, 1, this.tileEntity.inkCyan);
			}
			if (this.lastInkMagenta != this.tileEntity.inkMagenta) {
				icrafting.sendProgressBarUpdate(this, 2, this.tileEntity.inkMagenta);
			}
			if (this.lastInkYellow != this.tileEntity.inkYellow) {
				icrafting.sendProgressBarUpdate(this, 3, this.tileEntity.inkYellow);
			}
			
			if (this.lastCurrentItemWorkTime != this.tileEntity.currentItemWorkTime) {
				icrafting.sendProgressBarUpdate(this, 4, this.tileEntity.currentItemWorkTime);
			}
			if (this.lastWorkTime != this.tileEntity.workTime) {
				icrafting.sendProgressBarUpdate(this, 5, this.tileEntity.workTime);
			}
			if (this.lastCurrentLabelSelected != this.tileEntity.currentLabelSelected) {
				icrafting.sendProgressBarUpdate(this, 6, this.tileEntity.currentLabelSelected);
			}
			if (this.lastAmountLabelSelected != this.tileEntity.amountLabelSelected) {
				icrafting.sendProgressBarUpdate(this, 7, this.tileEntity.amountLabelSelected);
			}
			if (this.lastStartWorking != this.tileEntity.startWorking) {
				icrafting.sendProgressBarUpdate(this, 8, this.tileEntity.startWorking);
			}
		}
		this.lastInkBlack = this.tileEntity.inkBlack;
		this.lastInkCyan = this.tileEntity.inkCyan;
		this.lastInkMagenta = this.tileEntity.inkMagenta;
		this.lastInkYellow = this.tileEntity.inkYellow;
		
		this.lastCurrentItemWorkTime = this.tileEntity.currentItemWorkTime;
		this.lastWorkTime = this.tileEntity.workTime;
		this.lastCurrentLabelSelected = this.tileEntity.currentLabelSelected;
		this.lastAmountLabelSelected = this.tileEntity.amountLabelSelected;
		this.lastStartWorking = this.tileEntity.startWorking;
	}

	@SideOnly(Side.CLIENT)
	public void updateProgressBar(int id, int value) {
		if (id == 0) {
			this.tileEntity.inkBlack = value;
		}
		if (id == 1) {
			this.tileEntity.inkCyan = value;
		}
		if (id == 2) {
			this.tileEntity.inkMagenta = value;
		}
		if (id == 3) {
			this.tileEntity.inkYellow = value;
		}
		if (id == 4) {
			this.tileEntity.currentItemWorkTime = value;
		}
		if (id == 5) {
			this.tileEntity.workTime = value;
		}
		if (id == 6) {
			this.tileEntity.currentLabelSelected = value;
		}
		if (id == 7) {
			this.tileEntity.amountLabelSelected = value;
		}
		if (id == 8) {
			this.tileEntity.startWorking = value;
		}
		
	}
	
}
