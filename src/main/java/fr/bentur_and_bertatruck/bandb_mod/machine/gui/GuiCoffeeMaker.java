package fr.bentur_and_bertatruck.bandb_mod.machine.gui;

import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.client.renderer.texture.TextureMap;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.util.IIcon;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fluids.FluidRegistry;
import net.minecraftforge.fluids.FluidStack;

import org.lwjgl.opengl.GL11;

import buildcraft.core.lib.render.RenderUtils;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import fr.bentur_and_bertatruck.bandb_mod.common.Bandb_mod;
import fr.bentur_and_bertatruck.bandb_mod.machine.container.ContainerCoffeeMaker;
import fr.bentur_and_bertatruck.bandb_mod.machine.tileEntity.TileEntityCoffeeMaker;

public class GuiCoffeeMaker extends GuiContainer {

	public static final ResourceLocation bground = new ResourceLocation(Bandb_mod.MODID + ":textures/gui/guiCoffeeMaker.png");

	public TileEntityCoffeeMaker tileEntity;

	public GuiCoffeeMaker(InventoryPlayer inventoryPlayer, TileEntityCoffeeMaker entity) {
		super(new ContainerCoffeeMaker(inventoryPlayer, entity));

		this.tileEntity = entity;

		this.xSize = 176;
		this.ySize = 176;

	}

	@Override
	@SideOnly(Side.CLIENT)
	public void drawGuiContainerForegroundLayer(int par1, int par2) {
		String name = "Coffee Maker";

		this.fontRendererObj.drawString(name, this.xSize / 2 - this.fontRendererObj.getStringWidth(name) / 2, 6, 4210752);
	}

	@Override
	public void drawGuiContainerBackgroundLayer(float var1, int var2, int var3) {
		GL11.glColor4f(1F, 1F, 1F, 1F);

		Minecraft.getMinecraft().getTextureManager().bindTexture(bground);
		drawTexturedModalRect(guiLeft, guiTop, 0, 0, xSize, ySize);

		
		int k = this.tileEntity.getCookProgressScaled(16);
		drawTexturedModalRect(guiLeft + 120, guiTop + 65, 176, 0, k + 1, 21);
		
		this.drawFluid(new FluidStack(FluidRegistry.WATER, tileEntity.getWaterAmount()), guiLeft + 35, guiTop + 27, 10, 40, 2000);
		if (this.tileEntity.isBurning()) {
			this.drawFluid(new FluidStack(FluidRegistry.LAVA, tileEntity.getBurnTimeRemaining()), guiLeft + 11, guiTop + 27, 10, 40, tileEntity.getFuelCapacityLastFuelItem());
			
		}
		
}
	public void drawFluid(FluidStack fluid, int x, int y, int width, int height, int maxCapacity) {
		if (fluid == null || fluid.getFluid() == null) {
			return;
		}
		IIcon icon = fluid.getFluid().getIcon(fluid);
		mc.renderEngine.bindTexture(TextureMap.locationBlocksTexture);
		RenderUtils.setGLColorFromInt(fluid.getFluid().getColor(fluid));
		int fullX = width / 16;
		int fullY = height / 16;
		int lastX = width - fullX * 16;
		int lastY = height - fullY * 16;
		int level = fluid.amount * height / maxCapacity;
		int fullLvl = (height - level) / 16;
		int lastLvl = (height - level) - fullLvl * 16;
		for (int i = 0; i < fullX; i++) {
			for (int j = 0; j < fullY; j++) {
				if (j >= fullLvl) {
					drawCutIcon(icon, x + i * 16, y + j * 16, 16, 16, j == fullLvl ? lastLvl : 0);
				}
			}
		}
		for (int i = 0; i < fullX; i++) {
			drawCutIcon(icon, x + i * 16, y + fullY * 16, 16, lastY, fullLvl == fullY ? lastLvl : 0);
		}
		for (int i = 0; i < fullY; i++) {
			if (i >= fullLvl) {
				drawCutIcon(icon, x + fullX * 16, y + i * 16, lastX, 16, i == fullLvl ? lastLvl : 0);
			}
		}
		drawCutIcon(icon, x + fullX * 16, y + fullY * 16, lastX, lastY, fullLvl == fullY ? lastLvl : 0);
	}

	//The magic is here
	private void drawCutIcon(IIcon icon, int x, int y, int width, int height, int cut) {
		Tessellator tess = Tessellator.instance;
		tess.startDrawingQuads();
		tess.addVertexWithUV(x, y + height, zLevel, icon.getMinU(), icon.getInterpolatedV(height));
		tess.addVertexWithUV(x + width, y + height, zLevel, icon.getInterpolatedU(width), icon.getInterpolatedV(height));
		tess.addVertexWithUV(x + width, y + cut, zLevel, icon.getInterpolatedU(width), icon.getInterpolatedV(cut));
		tess.addVertexWithUV(x, y + cut, zLevel, icon.getMinU(), icon.getInterpolatedV(cut));
		tess.draw();
	}
}