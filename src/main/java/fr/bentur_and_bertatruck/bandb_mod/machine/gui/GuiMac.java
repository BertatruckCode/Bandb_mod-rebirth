package fr.bentur_and_bertatruck.bandb_mod.machine.gui;

import org.lwjgl.opengl.GL11;

import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.ResourceLocation;
import fr.bentur_and_bertatruck.bandb_mod.common.Bandb_mod;

public class GuiMac extends GuiScreen {

	ResourceLocation texture = new ResourceLocation(Bandb_mod.MODID
			+ ":textures/gui/guiMacBase.png");

	int xSize = 256;
	int ySize = 256;

	public GuiMac(EntityPlayer player) {

	}
/*
	public void drawScreen(int x, int y, float f) {
		drawDefaultBackground();

		GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
		Minecraft.getMinecraft().getTextureManager().bindTexture(texture);

		// mc.getTextureManager().bindTexture(new
		// ResourceLocation(Bandb_mod.MODID + ":textures/gui/guiMacBase.png"));
/*
		int posX = (width - this.xSize) / 2;
		int posY = (height - this.ySize) / 2;

		drawTexturedModalRect(posX, posY, 0, 0, xSize, ySize);

		super.drawScreen(x, y, f);

	}
*/
	
	public void drawScreen(int x, int y, float f) {
		GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
		mc.getTextureManager().bindTexture(new ResourceLocation(Bandb_mod.MODID + ":textures/gui/guiMacBase.png"));
		
	}
	
	@Override
	public boolean doesGuiPauseGame() {
		return false;
	}
}