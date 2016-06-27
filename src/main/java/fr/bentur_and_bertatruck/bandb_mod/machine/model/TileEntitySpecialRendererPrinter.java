package fr.bentur_and_bertatruck.bandb_mod.machine.model;

import net.minecraft.client.renderer.tileentity.TileEntityRendererDispatcher;
import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ResourceLocation;

import org.lwjgl.opengl.GL11;

import fr.bentur_and_bertatruck.bandb_mod.common.Bandb_mod;
import fr.bentur_and_bertatruck.bandb_mod.machine.tileEntity.TileEntityCoffeeMaker;
import fr.bentur_and_bertatruck.bandb_mod.machine.tileEntity.TileEntityPrinter;

public class TileEntitySpecialRendererPrinter  extends TileEntitySpecialRenderer{
	
	public static ModelPrinter model = new ModelPrinter();
    public static ResourceLocation texture = new ResourceLocation(Bandb_mod.MODID + ":textures/models/block/texturePrinter.png");
    
    public TileEntitySpecialRendererPrinter()
    {
        this.func_147497_a(TileEntityRendererDispatcher.instance);
    }

	@Override
	public void renderTileEntityAt(TileEntity tile, double x, double y, double z, float partialRenderTick){
		this.renderTileEntityPrinterAt((TileEntityPrinter)tile, x, y, z, partialRenderTick);
	}

	private void renderTileEntityPrinterAt(TileEntityPrinter tile, double x, double y, double z, float partialRenderTick) // ma propre fonction
    {
		GL11.glPushMatrix(); // ouvre une matrix
        GL11.glTranslated(x + 0.5D, y + 1.5D, z + 0.5D); // déplace le bloc sur les coordonnés et le centre
        GL11.glRotatef(180F, 0.0F, 0.0F, 1.0F); // met droit le bloc (par défaut il est à l'envers)
        GL11.glRotatef(180F + 90F * tile.getDirection(), 0.0F, 1.0F, 0.0F);
        this.bindTexture(texture); // affiche la texture
        model.renderAll(); // rend le modèle
        GL11.glPopMatrix(); // ferme la matrix
    }

}
