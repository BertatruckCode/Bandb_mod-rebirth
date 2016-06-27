package fr.bentur_and_bertatruck.bandb_mod.machine.gui;

import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.client.resources.I18n;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.util.ResourceLocation;

import org.lwjgl.opengl.GL11;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import fr.bentur_and_bertatruck.bandb_mod.common.Bandb_mod;
import fr.bentur_and_bertatruck.bandb_mod.machine.container.ContainerDrier;
import fr.bentur_and_bertatruck.bandb_mod.machine.container.ContainerPress;
import fr.bentur_and_bertatruck.bandb_mod.machine.tileEntity.TileEntityDrier;
import fr.bentur_and_bertatruck.bandb_mod.machine.tileEntity.TileEntityPress;

public class GuiPress extends GuiContainer {

	public static final ResourceLocation bground = new ResourceLocation(Bandb_mod.MODID + ":textures/gui/guiPress.png");

	public TileEntityPress tileEntity;

	public GuiPress(InventoryPlayer inventoryPlayer, TileEntityPress entity) {
		super(new ContainerPress(inventoryPlayer, entity));

		this.tileEntity = entity;

		this.xSize = 176;
		this.ySize = 166;

	}

	@Override
	@SideOnly(Side.CLIENT)
	public void drawGuiContainerForegroundLayer(int par1, int par2) {
		String name = "Press";

		this.fontRendererObj.drawString(name, this.xSize / 2 - this.fontRendererObj.getStringWidth(name) / 2 + 3 , 6, 4210752);
		this.fontRendererObj.drawString(I18n.format("container.inventory", new Object[0]), 118, this.ySize - 96 + 2, 4210752);
	}

	@Override
	public void drawGuiContainerBackgroundLayer(float var1, int var2, int var3) {
		GL11.glColor4f(1F, 1F, 1F, 1F);

		Minecraft.getMinecraft().getTextureManager().bindTexture(bground);
		drawTexturedModalRect(guiLeft, guiTop, 0, 0, xSize, ySize);

		if (this.tileEntity.isBurning()) {
			int k = this.tileEntity.getBurnTimeRemainingScaled(40);
			int j = 40 - k;
			drawTexturedModalRect(guiLeft + 29, guiTop + 65, 176, 0, 40 - j, 10);
		}
		int k = this.tileEntity.getCookProgressScaled(24);
		drawTexturedModalRect(guiLeft + 76, guiTop + 26, 176, 10, k + 1, 16);
	}

}
