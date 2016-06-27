package fr.bentur_and_bertatruck.bandb_mod.machine.gui;

import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.client.renderer.texture.TextureMap;
import net.minecraft.client.resources.I18n;
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
import fr.bentur_and_bertatruck.bandb_mod.common.loader.BandbFluids;
import fr.bentur_and_bertatruck.bandb_mod.machine.container.ContainerBarrelApple;
import fr.bentur_and_bertatruck.bandb_mod.machine.tileEntity.TileEntityBarrelApple;

public class GuiBarrelApple extends GuiContainer {

	public static final ResourceLocation bground = new ResourceLocation(Bandb_mod.MODID + ":textures/gui/GuiBarrelApple.png");

	public TileEntityBarrelApple tileEntity;

	public GuiBarrelApple(InventoryPlayer inventoryPlayer, TileEntityBarrelApple entity) {
		super(new ContainerBarrelApple(inventoryPlayer, entity));

		this.tileEntity = entity;

		this.xSize = 186;
		this.ySize = 171;

	}

	@Override
	@SideOnly(Side.CLIENT)
	public void drawGuiContainerForegroundLayer(int par1, int par2) {
		String name = "Barrel Apple Tree";

		this.fontRendererObj.drawString(name, 120, 6, 0xFFECC6);
		this.fontRendererObj.drawString(I18n.format("container.inventory", new Object[0]), 118, this.ySize - 101 + 2, 0xFFECC6);
	}

	@Override
	public void drawGuiContainerBackgroundLayer(float var1, int var2, int var3) {
		GL11.glColor4f(1F, 1F, 1F, 1F);

		Minecraft.getMinecraft().getTextureManager().bindTexture(bground);
		drawTexturedModalRect(guiLeft, guiTop, 0, 0, xSize, ySize);

		
		if(tileEntity.getFluid() != null){
			System.out.println(tileEntity.getFluid().getUnlocalizedName());

			this.drawFluid(new FluidStack(tileEntity.getFluid(), tileEntity.getFluidAmount()), guiLeft + 60, guiTop + 9, 52, 54, 100);
			//this.drawFluid(new FluidStack(tileEntity.getFluid(), tileEntity.getFluidAmount() ), guiLeft + 226, guiTop + 36, 10, 32, tileEntity.getFluidCapacity());
		}else if (tileEntity.getFluid() == null && tileEntity.getFluidAmount() > 0){
			//System.out.println(tileEntity.getFluidAmount());
		}else {
			//System.out.println(tileEntity.getFluidAmount());

		}
	}
	
	public void drawFluid(FluidStack fluid, int x, int y, int width, int height, int maxCapacity) {
		if (fluid == null || fluid.getFluid() == null) {
			System.out.println("fluid seems not be register");
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
