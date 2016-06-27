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
import fr.bentur_and_bertatruck.bandb_mod.machine.container.ContainerCottonCandyMachine;
import fr.bentur_and_bertatruck.bandb_mod.machine.tileEntity.TileEntityCottonCandyMachine;

public class GuiCottonCandyMachine extends GuiContainer {

	public static final ResourceLocation bground = new ResourceLocation(Bandb_mod.MODID + ":textures/gui/GuiCottonCandyMachine.png");

	public TileEntityCottonCandyMachine tileEntity;

	public GuiCottonCandyMachine(InventoryPlayer inventoryPlayer, TileEntityCottonCandyMachine entity) {
		super(new ContainerCottonCandyMachine(inventoryPlayer, entity));

		this.tileEntity = entity;

		this.xSize = 176;
		this.ySize = 166;

	}

	@Override
	@SideOnly(Side.CLIENT)
	public void drawGuiContainerForegroundLayer(int par1, int par2) {
		String name = "Cotton Candy Machine";

		this.fontRendererObj.drawString(name, this.xSize / 2 - this.fontRendererObj.getStringWidth(name) / 2, 6, 4210752);
		this.fontRendererObj.drawString(I18n.format("container.inventory", new Object[0]), 118, this.ySize - 96 + 2, 4210752);
	}

	@Override
	public void drawGuiContainerBackgroundLayer(float var1, int var2, int var3) {
		GL11.glColor4f(1F, 1F, 1F, 1F);

		Minecraft.getMinecraft().getTextureManager().bindTexture(bground);
		drawTexturedModalRect(guiLeft, guiTop, 0, 0, xSize, ySize);

		if (this.tileEntity.isBurning()) {
			int k = this.tileEntity.getBurnTimeRemainingScaled(13);
			drawTexturedModalRect(guiLeft + 8, guiTop + 59 - k, 241, 13 - k, 14, k + 1);
		
			int j = this.tileEntity.getCookProgressScaled(91);
			drawTexturedModalRect(guiLeft + 47, guiTop + 19, 0, 166, j + 1, 16);
			
			int l = this.tileEntity.getCookProgressScaled(6);
			switch(l){
			case 0 :
				drawTexturedModalRect(guiLeft + 73, guiTop + 40, 176, 0, 32, 32);
				break;
			case 1 :
				drawTexturedModalRect(guiLeft + 73, guiTop + 40, 209, 0, 32, 32);
				break;
			case 2 :
				drawTexturedModalRect(guiLeft + 73, guiTop + 40, 176, 33, 32, 32);
				break;

			case 3 :
				drawTexturedModalRect(guiLeft + 73, guiTop + 40, 209, 33, 32, 32);
				break;

			case 4 :
				drawTexturedModalRect(guiLeft + 73, guiTop + 40, 176, 66, 32, 32);
				break;

			case 5 :
				drawTexturedModalRect(guiLeft + 73, guiTop + 40, 209, 66, 32, 32);
				break;

			case 6:
				drawTexturedModalRect(guiLeft + 73, guiTop + 40, 209, 66, 32, 32);
				break;

			
			}

		}
	}

}
