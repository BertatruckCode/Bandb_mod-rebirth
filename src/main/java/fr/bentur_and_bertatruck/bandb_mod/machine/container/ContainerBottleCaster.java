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
import fr.bentur_and_bertatruck.bandb_mod.machine.slot.SlotBottleCasterGlassProvider;
import fr.bentur_and_bertatruck.bandb_mod.machine.slot.SlotCoffeeMakerBucket;
import fr.bentur_and_bertatruck.bandb_mod.machine.slot.SlotPrinterOutput;
import fr.bentur_and_bertatruck.bandb_mod.machine.slot.SlotPrinterTexture;
import fr.bentur_and_bertatruck.bandb_mod.machine.slot.SlotSyrupMachineFuel;
import fr.bentur_and_bertatruck.bandb_mod.machine.tileEntity.TileEntityBottleCaster;

public class ContainerBottleCaster extends Container {

	private TileEntityBottleCaster tileEntity;

	public int lastAmountMoltenGlass, lastAmountWater;
	public int lastCurrentItemWorkTime, lastWorkTime, lastCurrentBottleSelected, lastAmountBottleSelected, lastStartWorking;
	public int lastWorkTimeLeft, lastBurnTime, lastCurrentGlassBurnTime, lastCookTime;
	
	public ContainerBottleCaster(InventoryPlayer inv, TileEntityBottleCaster tile) {
		this.tileEntity = tile;

		addSlotToContainer(new SlotPrinterOutput(tile, 0, 148, 17)); //output
		addSlotToContainer(new SlotSyrupMachineFuel(tile, 1, 189, 13));	//fuel	
		addSlotToContainer(new SlotCoffeeMakerBucket(tile, 2, 223, 13));	//water
		addSlotToContainer(new SlotPrinterTexture(tile, 3, 80, 15));	//texture
		addSlotToContainer(new SlotBottleCasterGlassProvider(tile, 4, 80, 56));	//glass input
		addSlotToContainer(new SlotBottleCasterGlassProvider(tile, 5, 98, 56));	//glass input
		addSlotToContainer(new SlotBottleCasterGlassProvider(tile, 6, 116, 56));	//glass input


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

	
	public void addCraftingToCrafters(ICrafting icrafting) {
		super.addCraftingToCrafters(icrafting);
		
		icrafting.sendProgressBarUpdate(this, 0, this.tileEntity.amountMoltenGlass);
		icrafting.sendProgressBarUpdate(this, 1, this.tileEntity.amountWater);
		
		icrafting.sendProgressBarUpdate(this, 2, this.tileEntity.currentItemWorkTime);
		icrafting.sendProgressBarUpdate(this, 3, this.tileEntity.workTime);
		icrafting.sendProgressBarUpdate(this, 4, this.tileEntity.currentBottleSelected);
		icrafting.sendProgressBarUpdate(this, 5, this.tileEntity.amountBottleSelected);
		icrafting.sendProgressBarUpdate(this, 6, this.tileEntity.startWorking);

		icrafting.sendProgressBarUpdate(this, 7, this.tileEntity.workTimeLeft);
		icrafting.sendProgressBarUpdate(this, 8, this.tileEntity.burnTime);
		icrafting.sendProgressBarUpdate(this, 9, this.tileEntity.currentGlassBurnTime);
		icrafting.sendProgressBarUpdate(this, 10, this.tileEntity.cookTime);

	}

	public void detectAndSendChanges() {		
		super.detectAndSendChanges();
		
		for (int i = 0; i < this.crafters.size(); i++) {
			ICrafting icrafting = (ICrafting) this.crafters.get(i);
			if (this.lastAmountMoltenGlass != this.tileEntity.amountMoltenGlass) {
				icrafting.sendProgressBarUpdate(this, 0,this.tileEntity.amountMoltenGlass);
			}
			if (this.lastAmountWater != this.tileEntity.amountWater) {
				icrafting.sendProgressBarUpdate(this, 1,this.tileEntity.amountWater);
			}
			
			if (this.lastCurrentItemWorkTime != this.tileEntity.currentItemWorkTime) {
				icrafting.sendProgressBarUpdate(this, 2,this.tileEntity.currentItemWorkTime);
			}
			if (this.lastWorkTime != this.tileEntity.workTime) {
				icrafting.sendProgressBarUpdate(this, 3,this.tileEntity.workTime);
			}
			if (this.lastCurrentBottleSelected != this.tileEntity.currentBottleSelected) {
				icrafting.sendProgressBarUpdate(this, 4,this.tileEntity.currentBottleSelected);
			}
			if (this.lastAmountBottleSelected != this.tileEntity.amountBottleSelected) {
				icrafting.sendProgressBarUpdate(this, 5,this.tileEntity.amountBottleSelected);
			}
			if (this.lastStartWorking != this.tileEntity.startWorking) {
				icrafting.sendProgressBarUpdate(this, 6,this.tileEntity.startWorking);
			}
			
			if (this.lastWorkTimeLeft != this.tileEntity.workTimeLeft) {
				icrafting.sendProgressBarUpdate(this, 7,this.tileEntity.workTimeLeft);
			}
			if (this.lastBurnTime != this.tileEntity.burnTime) {
				icrafting.sendProgressBarUpdate(this, 8,this.tileEntity.burnTime);
			}
			if (this.lastCurrentGlassBurnTime != this.tileEntity.currentGlassBurnTime) {
				icrafting.sendProgressBarUpdate(this, 9,this.tileEntity.currentGlassBurnTime);
			}
			if (this.lastCookTime != this.tileEntity.cookTime) {
				icrafting.sendProgressBarUpdate(this, 10,this.tileEntity.cookTime);
			}

		}
		this.lastAmountMoltenGlass = this.tileEntity.amountMoltenGlass;
		this.lastAmountWater = this.tileEntity.amountWater;
		
		this.lastCurrentItemWorkTime = this.tileEntity.currentItemWorkTime;
		this.lastWorkTime = this.tileEntity.workTime;
		this.lastCurrentBottleSelected = this.tileEntity.currentBottleSelected;
		this.lastAmountBottleSelected = this.tileEntity.amountBottleSelected;
		this.lastStartWorking = this.tileEntity.startWorking;
		
		this.lastWorkTimeLeft = this.tileEntity.workTimeLeft;
		this.lastBurnTime = this.tileEntity.burnTime;
		this.lastCurrentGlassBurnTime = this.tileEntity.currentGlassBurnTime;
		this.lastCookTime = this.tileEntity.cookTime;
		
	}

	@SideOnly(Side.CLIENT)
	public void updateProgressBar(int par1, int par2) {
		if (par1 == 0) {
			this.tileEntity.amountMoltenGlass = par2;
		}
		if (par1 == 1) {
			this.tileEntity.amountWater = par2;
		}
		
		if (par1 == 2) {
			this.tileEntity.currentItemWorkTime = par2;
		}
		if (par1 == 3) {
			this.tileEntity.workTime = par2;
		}
		if (par1 == 4) {
			this.tileEntity.currentBottleSelected = par2;
		}
		if (par1 == 5) {
			this.tileEntity.amountBottleSelected = par2;
		}
		if (par1 == 6) {
			this.tileEntity.startWorking = par2;
		}
		
		if (par1 == 7) {
			this.tileEntity.workTimeLeft = par2;
		}
		if (par1 == 8) {
			this.tileEntity.burnTime = par2;
		}
		if (par1 == 9) {
			this.tileEntity.currentGlassBurnTime = par2;
		}
		if (par1 == 10) {
			this.tileEntity.cookTime = par2;
		}
	}
}
