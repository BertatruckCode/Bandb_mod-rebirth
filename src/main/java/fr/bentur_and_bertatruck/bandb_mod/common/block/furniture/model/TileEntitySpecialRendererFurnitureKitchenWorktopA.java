package fr.bentur_and_bertatruck.bandb_mod.common.block.furniture.model;

import org.lwjgl.opengl.GL11;

import fr.bentur_and_bertatruck.bandb_mod.common.Bandb_mod;
import fr.bentur_and_bertatruck.bandb_mod.common.block.furniture.tileEntity.TileEntityFurnitureKitchenWorktopA;
import net.minecraft.client.renderer.tileentity.TileEntityRendererDispatcher;
import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ResourceLocation;

public class TileEntitySpecialRendererFurnitureKitchenWorktopA  extends TileEntitySpecialRenderer{
	
	public static ModelFurnitureKitchenWorktopA model = new ModelFurnitureKitchenWorktopA();
    public static ResourceLocation texture = new ResourceLocation(Bandb_mod.MODID, "textures/models/block/furniture/textureWorktopA.png");
    
    public TileEntitySpecialRendererFurnitureKitchenWorktopA(){
        this.func_147497_a(TileEntityRendererDispatcher.instance);
    }

	@Override
	public void renderTileEntityAt(TileEntity tile, double x, double y, double z, float partialRenderTick){
		this.render((TileEntityFurnitureKitchenWorktopA)tile, x, y, z, partialRenderTick);
	}

	private void render(TileEntityFurnitureKitchenWorktopA tile, double x, double y, double z, float partialRenderTick){
		
		GL11.glPushMatrix();
        GL11.glTranslated(x + 0.5D, y + 1.5D, z + 0.5D);
        GL11.glRotatef(180F, 0.0F, 0.0F, 1.0F);
        GL11.glRotatef(180 + 90F * tile.getDirection(), 0.0F, 1.0F, 0.0F);
        this.bindTexture(texture);
        model.renderAll();
        GL11.glPopMatrix();
    }

}
