package fr.bentur_and_bertatruck.bandb_mod.machine.model;

import org.lwjgl.opengl.GL11;

import fr.bentur_and_bertatruck.bandb_mod.common.Bandb_mod;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.client.renderer.tileentity.TileEntityRendererDispatcher;
import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ResourceLocation;
import test.TileEntityDistributor;

public class TileEntitySpecialRendererDistributor  extends TileEntitySpecialRenderer{
	
    public static ResourceLocation texture_side = new ResourceLocation(Bandb_mod.MODID, "textures/blocks/texture openGL/distrib/distrib_side.png");
    public static ResourceLocation texture_top = new ResourceLocation(Bandb_mod.MODID, "textures/blocks/texture openGL/distrib/distrib_top.png");
    public static ResourceLocation texture_front = new ResourceLocation(Bandb_mod.MODID, "textures/blocks/texture openGL/distrib/distrib_front.png");

    
    public TileEntitySpecialRendererDistributor()
    {
        this.func_147497_a(TileEntityRendererDispatcher.instance);
    }

	@Override
	public void renderTileEntityAt(TileEntity tile, double x, double y, double z, float partialRenderTick){
		this.renderTileEntityDistributorAt((TileEntityDistributor)tile, x, y, z, partialRenderTick);
	}

	private void renderTileEntityDistributorAt(TileEntityDistributor tile, double x, double y, double z, float partialRenderTick) // ma propre fonction
    {
		
		GL11.glPushMatrix(); // ouvre une matrix
        switch(tile.getDirection()){
        case 2:
        	GL11.glTranslated(x, y, z); // déplace le bloc sur les coordonnés et le centre
            this.renderDistributor(0, 0, 0);
    		 break;
        	
    	case 1:
    		GL11.glTranslated(x - 1, y, z + 1 ); // déplace le bloc sur les coordonnés et le centre
    		GL11.glRotatef(90F, 0.0F, 1.0F, 0.0F);
    		this.renderDistributor(0, 0, 1);
    		break;
    		
    	case 0:
    		GL11.glTranslated(x + 1, y, z + 2); // déplace le bloc sur les coordonnés et le centre
    		GL11.glRotatef(180F, 0.0F, 1.0F, 0.0F);
    		this.renderDistributor(0, 0, 1);
    		break;
    	case 3:
    		GL11.glTranslated(x + 2, y, z); // déplace le bloc sur les coordonnés et le centre
    		GL11.glRotatef(270F, 0.0F, 1.0F, 0.0F);
    		this.renderDistributor(0, 0, 1);
    		break;
        
        }
    	
		 
		GL11.glPopMatrix(); // ferme la matrix

    }
	
	public static void renderDistributor(double x, double y, double z){
		Tessellator tessellator = Tessellator.instance;
		 
		 //front
		 tessellator.startDrawingQuads();		 
		 Minecraft.getMinecraft().renderEngine.bindTexture(texture_front);	
		 		 		 		
		 tessellator.addVertexWithUV(x + 0.8, y + 2   , z, 0, 0); //Bottom left texture
		 tessellator.addVertexWithUV(x + 0.8, y, z, 0, 1); //Top left
		 tessellator.addVertexWithUV(x + 0.2, y, z, 1, 1); //Top right
		 tessellator.addVertexWithUV(x + 0.2, y + 2, z, 1, 0); //Bottom right
		 
		 tessellator.draw();

		 //side
		 tessellator.startDrawingQuads();		 
		 Minecraft.getMinecraft().renderEngine.bindTexture(texture_side);	
		 
		 tessellator.addVertexWithUV(x + 0.8, y    , z, 0, 0); //Bottom left texture
		 tessellator.addVertexWithUV(x + 0.8, y + 2, z, 0, 1); //Top left
		 tessellator.addVertexWithUV(x + 1, y + 2, z + 0.2, 1, 1); //Top right
		 tessellator.addVertexWithUV(x + 1, y    , z + 0.2, 1, 0); //Bottom right
		 
		 tessellator.addVertexWithUV(x + 1, y    , z + 0.2, 0, 0); //Bottom left texture
		 tessellator.addVertexWithUV(x + 1, y + 2, z + 0.2, 0, 1); //Top left
		 tessellator.addVertexWithUV(x + 1, y + 2, z + 1, 1, 1); //Top right
		 tessellator.addVertexWithUV(x + 1, y    , z + 1, 1, 0); //Bottom right
		 
		 tessellator.addVertexWithUV(x + 1, y    , z + 1, 0, 0); //Bottom left texture
		 tessellator.addVertexWithUV(x + 1, y + 2, z + 1, 0, 1); //Top left
		 tessellator.addVertexWithUV(x, y + 2, z + 1, 1, 1); //Top right
		 tessellator.addVertexWithUV(x, y    , z + 1, 1, 0); //Bottom right
		 
		 tessellator.addVertexWithUV(x, y    , z + 1, 0, 0); //Bottom left texture
		 tessellator.addVertexWithUV(x, y + 2, z + 1, 0, 1); //Top left
		 tessellator.addVertexWithUV(x, y + 2, z + 0.2, 1, 1); //Top right
		 tessellator.addVertexWithUV(x, y    , z + 0.2, 1, 0); //Bottom right
		 
		 tessellator.addVertexWithUV(x, y    , z  + 0.2 , 0, 0); //Bottom left texture
		 tessellator.addVertexWithUV(x, y + 2, z  + 0.2, 0, 1); //Top left
		 tessellator.addVertexWithUV(x + 0.2, y + 2, z, 1, 1); //Top right
		 tessellator.addVertexWithUV(x + 0.2, y    , z, 1, 0); //Bottom right
		 
		 tessellator.draw();
		
		 //bot
		 tessellator.startDrawingQuads();
		 Minecraft.getMinecraft().renderEngine.bindTexture(texture_top);	
		 
		 tessellator.addVertexWithUV(x + 0.2, y, z + 1, 0, 0); //Bottom left texture
		 tessellator.addVertexWithUV(x + 0.2, y, z , 0, 1); //Top left
		 tessellator.addVertexWithUV(x + 0.8, y, z , 1, 1); //Top right
		 tessellator.addVertexWithUV(x + 0.8, y, z + 1, 1, 0); //Bottom right
		 
		 tessellator.addVertexWithUV(x, y, z + 1 , 0, 0); //Bottom left texture
		 tessellator.addVertexWithUV(x, y, z + 0.2, 0, 1); //Top left
		 tessellator.addVertexWithUV(x + 1, y, z + 0.2, 1, 1); //Top right
		 tessellator.addVertexWithUV(x + 1, y, z + 1, 1, 0); //Bottom right
		 
		 	//corner
		 tessellator.addVertexWithUV(x, y, z + 0.2 , 0, 0); //Bottom left texture
		 tessellator.addVertexWithUV(x + 0.2, y, z, 0, 1); //Top left
		 tessellator.addVertexWithUV(x + 0.2, y, z + 0.2, 1, 1); //Top right
		 tessellator.addVertexWithUV(x + 0.2, y, z + 0.2, 1, 0); //Bottom right
		 
		 tessellator.addVertexWithUV(x + 0.8, y, z + 0.2 , 0, 0); //Bottom left texture
		 tessellator.addVertexWithUV(x + 0.8, y, z , 0, 1); //Top left
		 tessellator.addVertexWithUV(x + 1, y, z + 0.2, 1, 1); //Top right
		 tessellator.addVertexWithUV(x + 1, y, z + 0.2, 1, 0); //Bottom right
		 	 
		 //top
		 tessellator.addVertexWithUV(x + 0.2, y + 2, z, 0, 0); //Bottom left texture
		 tessellator.addVertexWithUV(x + 0.2, y + 2, z + 1, 0, 1); //Top left
		 tessellator.addVertexWithUV(x + 0.8, y + 2, z + 1, 1, 1); //Top right
		 tessellator.addVertexWithUV(x + 0.8, y + 2, z, 1, 0); //Bottom right
		 
		 tessellator.addVertexWithUV(x , y + 2, z + 0.2, 0, 0); //Bottom left texture
		 tessellator.addVertexWithUV(x , y + 2, z + 1, 0, 1); //Top left
		 tessellator.addVertexWithUV(x + 1, y + 2, z + 1, 1, 1); //Top right
		 tessellator.addVertexWithUV(x + 1, y + 2, z + 0.2, 1, 0); //Bottom right
		 
		 	//corner
		 tessellator.addVertexWithUV(x + 0.2, y + 2, z, 0, 0); //Bottom left texture
		 tessellator.addVertexWithUV(x , y + 2, z + 0.2, 0, 1); //Top left
		 tessellator.addVertexWithUV(x  + 0.2, y + 2, z + 0.2, 1, 1); //Top right
		 tessellator.addVertexWithUV(x + 0.2, y + 2, z + 0.2, 1, 0); //Bottom right
		 
		 tessellator.addVertexWithUV(x + 0.8, y + 2, z , 0, 0); //Bottom left texture
		 tessellator.addVertexWithUV(x + 0.8, y + 2, z + 0.2, 0, 1); //Top left
		 tessellator.addVertexWithUV(x + 1, y + 2, z + 0.2, 1, 1); //Top right
		 tessellator.addVertexWithUV(x + 1, y + 2, z + 0.2, 1, 0); //Top right
		 
		 tessellator.draw();
		 
	}
	
}
