package fr.bentur_and_bertatruck.bandb_mod.machine.gui;

import net.minecraft.client.gui.GuiButton;
import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.util.ResourceLocation;

import org.lwjgl.opengl.GL11;

import fr.bentur_and_bertatruck.bandb_mod.common.Bandb_mod;
import fr.bentur_and_bertatruck.bandb_mod.machine.container.ContainerPrinter;
import fr.bentur_and_bertatruck.bandb_mod.machine.network.NetworkHandler;
import fr.bentur_and_bertatruck.bandb_mod.machine.network.PacketPrinter;
import fr.bentur_and_bertatruck.bandb_mod.machine.tileEntity.TileEntityPrinter;

public class GuiPrinter extends GuiContainer {
	private TileEntityPrinter tileEntity;

	public GuiPrinter(InventoryPlayer player, TileEntityPrinter tile) {
		super(new ContainerPrinter(player, tile));
		this.tileEntity = tile;
	}

	@SuppressWarnings("unchecked")
	@Override
	protected void drawGuiContainerForegroundLayer(int par1, int par2) {
		this.fontRendererObj.drawString("Printer", 25, 6, 0x404040);
		int var5 = (width - xSize) / 2;
		int var6 = (height - ySize) / 2;
		this.buttonList.clear();
		// labels
		this.fontRendererObj.drawString("Labels", 25, 25, 4210752);
		buttonList.add(new GuiPrinterButton(0, var5 + 7, var6 + 20, false));
		buttonList.add(new GuiPrinterButton(1, var5 + 64, var6 + 20, true));
		// quantity
		this.fontRendererObj.drawString("Amount", 25, 45, 4210752);
		buttonList.add(new GuiPrinterButton(2, var5 + 7, var6 + 40, false));
		buttonList.add(new GuiPrinterButton(3, var5 + 64, var6 + 40, true));
		// start
		buttonList.add(new GuiButton(4, var5 + 10, var6 + 60, 64, 20, "Start"));
	}

	@Override
	protected void actionPerformed(GuiButton par1GuiButton) {
		switch (par1GuiButton.id) {
			case 0: {
				tileEntity.decreaseLabelSelected();
				break;
			}
			case 1: {
				tileEntity.increaseLabelSelected();
				break;
			}
			case 2: {
				tileEntity.amountDecrease();
				break;
			}
			case 3: {
				tileEntity.amountIncrease();
				break;
			}
			case 4: {
				tileEntity.ChangeStartState();
				break;
			}
		}
		updateServer();
	}

	@Override
	protected void drawGuiContainerBackgroundLayer(float var1, int var2,
			int var3) {
		GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
		mc.getTextureManager().bindTexture(new ResourceLocation(Bandb_mod.MODID + ":textures/gui/printergui.png"));
		int x = (width - xSize) / 2;
		int y = (height - ySize) / 2;
		drawTexturedModalRect(x, y, 0, 0, xSize, ySize);

		if (this.tileEntity.getInkAmountBlack() > 0) {
			int k = this.tileEntity.getInkAmountBlack();
			int j = k / 8;
			for (int i = 0; i < j; i++) {
				drawTexturedModalRect(guiLeft + 82, guiTop + 77 - i, 176, 18,
						10, 1);
			}
		}
		if (this.tileEntity.getInkAmountCyan() > 0) {
			int k = this.tileEntity.getInkAmountCyan();
			int j = k / 8;
			for (int i = 0; i < j; i++) {
				drawTexturedModalRect(guiLeft + 99, guiTop + 77 - i, 186, 18,
						10, 1);
			}
		}
		if (this.tileEntity.getInkAmountMagenta() > 0) {
			int k = this.tileEntity.getInkAmountMagenta();
			int j = k / 8;
			for (int i = 0; i < j; i++) {
				drawTexturedModalRect(guiLeft + 116, guiTop + 77 - i, 196, 18,
						10, 1);
			}
		}
		if (this.tileEntity.getInkAmountYellow() > 0) {
			int k = this.tileEntity.getInkAmountYellow();
			int j = k / 8;
			for (int i = 0; i < j; i++) {
				drawTexturedModalRect(guiLeft + 133, guiTop + 77 - i, 206, 18,
						10, 1);
			}
		}
		int k = this.tileEntity.getWorkProgressScaled(43);
		drawTexturedModalRect(guiLeft + 99, guiTop + 16, 177, 1, k + 1, 16);
	}

	private void updateServer() {
		NetworkHandler.networkWrapper.sendToServer(new PacketPrinter(tileEntity));
	}

}
