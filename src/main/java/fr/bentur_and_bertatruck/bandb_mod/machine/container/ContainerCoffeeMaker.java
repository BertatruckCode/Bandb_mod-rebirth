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
import fr.bentur_and_bertatruck.bandb_mod.machine.slot.SlotCoffeeMakerBucket;
import fr.bentur_and_bertatruck.bandb_mod.machine.slot.SlotCoffeeMakerCapsule;
import fr.bentur_and_bertatruck.bandb_mod.machine.slot.SlotCoffeeMakerCup;
import fr.bentur_and_bertatruck.bandb_mod.machine.slot.SlotSyrupMachineFuel;
import fr.bentur_and_bertatruck.bandb_mod.machine.slot.SlotSyrupMachineOutput;
import fr.bentur_and_bertatruck.bandb_mod.machine.tileEntity.TileEntityCoffeeMaker;
import fr.bentur_and_bertatruck.bandb_mod.machine.tileEntity.TileEntityDrier;
import fr.bentur_and_bertatruck.bandb_mod.machine.tileEntity.TileEntityOven;

public class ContainerCoffeeMaker extends Container {
	private TileEntityCoffeeMaker tileEntity;
	public int lastWorkTimeLeft;
	public int lastCurrentItemWorkTime;
	public int lastWorkTime;
	public int lastWaterAmount;

	public ContainerCoffeeMaker(InventoryPlayer inventory, TileEntityCoffeeMaker tileentity) {
		this.tileEntity = tileentity;
		this.addSlotToContainer(new SlotSyrupMachineOutput(tileentity, 0, 148, 68)); //output
		this.addSlotToContainer(new SlotCoffeeMakerBucket(tileentity, 1, 33, 71)); //bucket
		this.addSlotToContainer(new SlotSyrupMachineFuel(tileentity, 2, 8, 71)); //fuel
		this.addSlotToContainer(new SlotCoffeeMakerCup(tileentity, 3, 147, 7)); //mug
		this.addSlotToContainer(new SlotCoffeeMakerCapsule(tileentity, 4, 97, 68)); //capsule
		
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 9; j++) {
				this.addSlotToContainer(new Slot(inventory, j + i * 9 + 9,8 + j * 18, 94 + i * 18));
			}
		}
		for (int i = 0; i < 9; i++) {
			this.addSlotToContainer(new Slot(inventory, i, 8 + i * 18, 152));
		}
	}

	public void addCraftingToCrafters(ICrafting icrafting) {
		super.addCraftingToCrafters(icrafting);
		icrafting.sendProgressBarUpdate(this, 0, this.tileEntity.workTime);
		icrafting.sendProgressBarUpdate(this, 1, this.tileEntity.workTimeLeft);
		icrafting.sendProgressBarUpdate(this, 2, this.tileEntity.currentItemWorkTime);
		icrafting.sendProgressBarUpdate(this, 3, this.tileEntity.waterAmount);

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
			if (this.lastWaterAmount != this.tileEntity.waterAmount) {
				icrafting.sendProgressBarUpdate(this, 3
							,this.tileEntity.waterAmount);
			}
		}
		this.lastWorkTime = this.tileEntity.workTime;
		this.lastWorkTimeLeft = this.tileEntity.workTimeLeft;
		this.lastCurrentItemWorkTime = this.tileEntity.currentItemWorkTime;
		this.lastWaterAmount = this.tileEntity.waterAmount;

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
		if (par1 == 3) {
			this.tileEntity.waterAmount = par2;
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
				if (stack.getItem() instanceof ItemCapsule) {
					if (!this.mergeItemStack(stack, 4, 5, false))
						return null;
				} else if (BandbFuel.getFuelValue(stack.getItem()) > 0) {
					if (!this.mergeItemStack(stack, 2, 3, false))
						return null;
				} else if (stack.getItem() == Items.water_bucket) {
					if (!this.mergeItemStack(stack, 1, 2, false))
						return null;
				} else if (stack.getItem() == BandbItems.itemMugCoffeeEmpty) {
					if (!this.mergeItemStack(stack, 3, 4, false))
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