package fr.bentur_and_bertatruck.bandb_mod.machine.gui;

import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.util.ResourceLocation;

import org.lwjgl.opengl.GL11;

import fr.bentur_and_bertatruck.bandb_mod.common.Bandb_mod;
import fr.bentur_and_bertatruck.bandb_mod.machine.container.ContainerCocktailBar;
import fr.bentur_and_bertatruck.bandb_mod.machine.tileEntity.TileEntityCocktailBar;

public class GuiCocktailBar extends GuiContainer {
	private TileEntityCocktailBar tileEntity;

	public GuiCocktailBar(InventoryPlayer player, TileEntityCocktailBar tile) {
		super(new ContainerCocktailBar(player, tile));
		this.tileEntity = tile;
	}

	@Override
	protected void drawGuiContainerForegroundLayer(int par1, int par2) {
		this.fontRendererObj.drawString("Cocktail Bar", 25, 6, 0x404040);
		int var5 = (width - xSize) / 2;
		int var6 = (height - ySize) / 2;
		
	}

	@Override
	protected void drawGuiContainerBackgroundLayer(float var1, int var2, int var3) {
		GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
		mc.getTextureManager().bindTexture(new ResourceLocation(Bandb_mod.MODID + ":textures/gui/guiCocktailBar.png"));
		int x = (width - xSize) / 2;
		int y = (height - ySize) / 2;
		drawTexturedModalRect(x, y, 0, 0, xSize, ySize);

		int k = this.tileEntity.getWorkProgressScaled(116);
		drawTexturedModalRect(guiLeft + 13 , guiTop + 38,  1, 166, k, 17);
	}

}
