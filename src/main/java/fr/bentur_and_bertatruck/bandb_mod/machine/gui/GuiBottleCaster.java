package fr.bentur_and_bertatruck.bandb_mod.machine.gui;

import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiButton;
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
import fr.bentur_and_bertatruck.bandb_mod.common.loader.BandbFluids;
import fr.bentur_and_bertatruck.bandb_mod.machine.container.ContainerBottleCaster;
import fr.bentur_and_bertatruck.bandb_mod.machine.network.NetworkHandler;
import fr.bentur_and_bertatruck.bandb_mod.machine.network.PacketBottleCaster;
import fr.bentur_and_bertatruck.bandb_mod.machine.tileEntity.TileEntityBottleCaster;

public class GuiBottleCaster extends GuiContainer {
	
	public TileEntityBottleCaster tileEntity;
	
	public static final ResourceLocation bground = new ResourceLocation(Bandb_mod.MODID + ":textures/gui/guiBottleCaster.png");

	public GuiBottleCaster(InventoryPlayer player, TileEntityBottleCaster tile) {
		super(new ContainerBottleCaster(player, tile));
		this.tileEntity = tile;
		
		this.xSize = 256;
		this.ySize = 166;
	}

	@Override
	@SideOnly(Side.CLIENT)
	public void drawGuiContainerForegroundLayer(int par1, int par2) {
		this.fontRendererObj.drawString("Bottle Caster", 6, 6, 0x404040);
		int var5 = (width - xSize) / 2;
		int var6 = (height - ySize) / 2;
		this.buttonList.clear();
		// labels
		this.fontRendererObj.drawString("Bottle", 25, 25, 4210752);
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
	public void actionPerformed(GuiButton par1GuiButton) {
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
	public void drawGuiContainerBackgroundLayer(float var1, int var2, int var3) {
		GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
		
		Minecraft.getMinecraft().getTextureManager().bindTexture(bground);
		int x = (width - xSize) / 2;
		int y = (height - ySize) / 2;
		drawTexturedModalRect(x, y, 0, 0, xSize, ySize);
	
		int k = this.tileEntity.getWorkProgressScaled(43);
		drawTexturedModalRect(x + 98, y + 15, 1, 166, k + 1, 16);

		int m = this.tileEntity.getAmountMoltenGlass();
		this.drawFluid(new FluidStack(BandbFluids.fluidMoltenGlass, m), x + 198, y + 85, 34, 58, 5000);
		//FluidRegistry.WATER
		
		this.drawFluid(new FluidStack(FluidRegistry.WATER, tileEntity.getAmountWater() ), guiLeft + 226, guiTop + 36, 10, 32, 2000);
		if (this.tileEntity.isBurning()) {
			this.drawFluid(new FluidStack(FluidRegistry.LAVA, tileEntity.getBurnTimeRemaining()), guiLeft + 192, guiTop + 36, 10, 32, 2000);
			
		}
		//
		//
	}

	public void updateServer() {
		NetworkHandler.networkWrapper.sendToServer(new PacketBottleCaster(tileEntity));
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
