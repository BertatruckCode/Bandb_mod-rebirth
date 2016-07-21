package fr.bentur_and_bertatruck.bandb_mod.machine.model;

import org.lwjgl.opengl.GL11;

import buildcraft.core.lib.engines.RenderEngine;
import fr.bentur_and_bertatruck.bandb_mod.common.Bandb_mod;
import fr.bentur_and_bertatruck.bandb_mod.machine.tileEntity.TileEntityKebabStand;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.client.renderer.tileentity.TileEntityRendererDispatcher;
import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ResourceLocation;

public class TileEntitySpecialRendererKebabStand  extends TileEntitySpecialRenderer{
	
    public static ResourceLocation texture_kebab_1 = new ResourceLocation(Bandb_mod.MODID, "textures/blocks/texture openGL/kebab/kebabRaw_a.png");
    public static ResourceLocation texture_kebab_2 = new ResourceLocation(Bandb_mod.MODID, "textures/blocks/texture openGL/kebab/kebabRaw_b.png");
    public static ResourceLocation texture_kebab_3 = new ResourceLocation(Bandb_mod.MODID, "textures/blocks/texture openGL/kebab/kebabCooked.png");
    
    
    public static ResourceLocation texture_stand = new ResourceLocation(Bandb_mod.MODID, "textures/blocks/texture openGL/kebab/kebabStand.png");
    public static ResourceLocation texture_glass = new ResourceLocation(Bandb_mod.MODID, "textures/blocks/texture openGL/kebab/kebabGlass.png");
    public static ResourceLocation texture_spit = new ResourceLocation(Bandb_mod.MODID, "textures/blocks/texture openGL/kebab/kebabSpit.png");
    
    public TileEntitySpecialRendererKebabStand(){
        this.func_147497_a(TileEntityRendererDispatcher.instance);
    }

	@Override
	public void renderTileEntityAt(TileEntity tile, double x, double y, double z, float partialRenderTick){
		this.renderTileEntityKebabStandAt((TileEntityKebabStand)tile, x, y, z, partialRenderTick);
	}

	private void renderTileEntityKebabStandAt(TileEntityKebabStand tile, double x, double y, double z, float partialRenderTick){
		
		GL11.glPushMatrix();
		
        switch(tile.getDirection()){
    	case 0:
			GL11.glTranslated(x, y, z); // déplace le bloc sur les coordonnés et le centre
			GL11.glRotatef(-90F * tile.getDirection(), 0.0F, 1.0F, 0.0F);
			this.render(0, 0, 0, tile);
			break;
    		
    	case 1:
			GL11.glTranslated(x, y, z); // déplace le bloc sur les coordonnés et le centre
			GL11.glRotatef(-90F * tile.getDirection(), 0.0F, 1.0F, 0.0F);
			this.render(0, 0, -1, tile);
			break;


        case 2:
			GL11.glTranslated(x, y, z); // déplace le bloc sur les coordonnés et le centre
			GL11.glRotatef(-90F * tile.getDirection(), 0.0F, 1.0F, 0.0F);
			this.render(-1, 0, -1, tile);
			break;
        	
    		
    	case 3:
			GL11.glTranslated(x, y, z); // déplace le bloc sur les coordonnés et le centre
			GL11.glRotatef(-90F * tile.getDirection(), 0.0F, 1.0F, 0.0F);
			this.render(-1, 0, 0, tile);
			break;
        
        }
    		
		GL11.glPopMatrix();

    }
	
	public static void render(double x, double y, double z, TileEntityKebabStand tile){
		Tessellator tessellator = Tessellator.instance;
		 
		//stand :
		//back
		drawCube(x, y + 0.2, z, 1, 1, 0.15, texture_stand, tessellator, 1, 1, 1);
		//top
		drawCube(x, y + 1.2 , z, 1, 0.2, 1, texture_stand, tessellator, 1, 1, 1);
		//bot
		drawCube(x, y, z, 1, 0.2, 1, texture_stand, tessellator, 1, 1, 1);
		
		if(tile.canSmelt()){
			drawKebab(x + 0.5, y + 0.3, z + 0.6, tessellator, tile);
		}
		if(tile.getLayerRemaining() > 0){
			drawSpit(x + 0.5, y + 0.2, z + 0.6, tessellator, tile);
		}
		
		GL11.glEnable(GL11.GL_BLEND); 
		drawCube(x, y + 0.2, z + 0.15, 0.1, 1, 0.4, texture_glass, tessellator, 0.8F, 0.8F, 0.8F);
		drawCube(x + 0.9, y + 0.2, z + 0.15, 0.1, 1, 0.4, texture_glass, tessellator, 0.8F, 0.8F, 0.8F);
		GL11.glDisable(GL11.GL_BLEND);
			
		
	}
	private static void drawCube(double x, double y, double z, double width, double height, double depth, ResourceLocation ressourceLocation, Tessellator tessellator, float f1, float f2, float f3){

		tessellator.startDrawingQuads();
		
		tessellator.setColorOpaque_F(f1, f2, f3);
		
		Minecraft.getMinecraft().renderEngine.bindTexture(ressourceLocation);	
		
		tessellator.addVertexWithUV(x, y, z + depth, 0, 0); //Bottom left texture
		tessellator.addVertexWithUV(x + width, y, z + depth, 0, 1); //Top left
		tessellator.addVertexWithUV(x + width, y + height, z + depth, 1, 1); //Top right
		tessellator.addVertexWithUV(x, y + height, z + depth, 1, 0); //Bottom right
	
		tessellator.addVertexWithUV(x, y + height, z, 0, 0); 
		tessellator.addVertexWithUV(x + width, y + height, z, 0, 1); 
		tessellator.addVertexWithUV(x + width, y, z, 1, 1); 
		tessellator.addVertexWithUV(x, y, z, 1, 0); 
		
		//dessous
		tessellator.addVertexWithUV(x, y, z, 0, 0); //Bottom left texture
		tessellator.addVertexWithUV(x + width, y, z, 0, 1); //Top left
		tessellator.addVertexWithUV(x + width, y, z + depth, 1, 1); //Top right
		tessellator.addVertexWithUV(x, y, z + depth, 1, 0); //Bottom right
		
		//dessus 
		tessellator.addVertexWithUV(x, y + height, z + depth, 1, 0); 
		tessellator.addVertexWithUV(x + width, y + height, z + depth, 1, 1);
		tessellator.addVertexWithUV(x + width, y + height, z, 0, 1);
		tessellator.addVertexWithUV(x, y + height, z, 0, 0); 

		tessellator.addVertexWithUV(x, y, z + depth, 1, 0); //Bottom right
		tessellator.addVertexWithUV(x, y + height, z + depth, 1, 1); //Top right
		tessellator.addVertexWithUV(x, y + height, z, 0, 1); //Top left
		tessellator.addVertexWithUV(x, y, z, 0, 0); //Bottom left texture
		
		tessellator.addVertexWithUV(x + width, y, z, 0, 0); //Bottom left texture
		tessellator.addVertexWithUV(x + width, y + height, z, 0, 1); //Top left
		tessellator.addVertexWithUV(x + width, y + height, z + depth, 1, 1); //Top right
		tessellator.addVertexWithUV(x + width, y, z + depth, 1, 0); //Bottom right
		
		tessellator.draw();

	}
	
	private static void drawKebab(double x, double y, double z, Tessellator tessellator, TileEntityKebabStand tile){
		float nbPart = 8.0f;
		int nbCut = 5; 
		
		float height = 0.8f;
		float[] cut = new float[nbCut];
		cut[0] = 0.0f;
		cut[1] = 0.1f;
		cut[2] = 0.3f;
		cut[3] = 0.6f;
		cut[4] = height;

		int layer = tile.getLayerRemaining()-1;
		float angle = tile.getAngle();
		
		
		float[][] size = {
				{0.02f, 0.02f, 0.02f, 0.02f, 0.02f, 0.02f},
				{0.02f, 0.03f, 0.05f, 0.1f,  0.1f,  0.1f},
				{0.03f, 0.05f, 0.1f,  0.15f, 0.25f, 0.3f},
				{0.05f, 0.1f,  0.15f,  0.25f, 0.3f,  0.4f},
				{0.02f, 0.02f, 0.02f, 0.02f, 0.02f, 0.02f}
		};
			
		for(int i = 0; i < nbPart; i++){
			for(int j =0; j<nbCut-1;j++){
				
				tessellator.startDrawingQuads();
				
				switch(tile.getCurrentTexture(i)){
				
					case 0:
						Minecraft.getMinecraft().renderEngine.bindTexture(texture_kebab_1);

						break;
					case 1:
						Minecraft.getMinecraft().renderEngine.bindTexture(texture_kebab_2);
						break;
					case 2:
						Minecraft.getMinecraft().renderEngine.bindTexture(texture_kebab_3);	
						break;

				}
				
				//part 2
				tessellator.addVertexWithUV(x + Math.cos((2*Math.PI/nbPart)*i + angle + (2*Math.PI/nbPart - Math.PI/nbPart))*size[j][layer], y + cut[j], z + Math.sin((2*Math.PI/nbPart)*i + angle + (2*Math.PI/nbPart - Math.PI/nbPart))*size[j][layer], 0, 0);			
				tessellator.addVertexWithUV(x + Math.cos((2*Math.PI/nbPart)*i + angle + (2*Math.PI/nbPart - Math.PI/nbPart))*size[j+1][layer], y + cut[j+1], z + Math.sin((2*Math.PI/nbPart)*i + angle + (2*Math.PI/nbPart - Math.PI/nbPart))*size[j+1][layer], 1, 1);
				tessellator.addVertexWithUV(x + Math.cos((2*Math.PI/nbPart)*i + angle + (2*Math.PI/nbPart + Math.PI/nbPart))*size[j+1][layer], y + cut[j+1], z + Math.sin((2*Math.PI/nbPart)*i + angle + (2*Math.PI/nbPart + Math.PI/nbPart))*size[j+1][layer], 0, 1);						
				tessellator.addVertexWithUV(x + Math.cos((2*Math.PI/nbPart)*i + angle + (2*Math.PI/nbPart + Math.PI/nbPart))*size[j][layer], y + cut[j], z + Math.sin((2*Math.PI/nbPart)*i + angle + (2*Math.PI/nbPart + Math.PI/nbPart))*size[j][layer], 1, 0);
				
				tessellator.draw();
			}
						
		}
		
	}
	
	private static void drawSpit(double x, double y, double z, Tessellator tessellator, TileEntityKebabStand tile){
		float nbPart = 8.0f;
		float size = 0.02f;
		
		int layer = tile.getLayerRemaining();
		float angle = tile.getAngle();

		for(int i = 0; i < nbPart; i++){
				
			tessellator.startDrawingQuads();
			Minecraft.getMinecraft().renderEngine.bindTexture(texture_spit);
			
			//part 2
			tessellator.addVertexWithUV(x + Math.cos((2*Math.PI/nbPart)*i + angle + (2*Math.PI/nbPart - Math.PI/nbPart))*size, y, z + Math.sin((2*Math.PI/nbPart)*i + angle + (2*Math.PI/nbPart - Math.PI/nbPart))*size, 0, 0);			
			tessellator.addVertexWithUV(x + Math.cos((2*Math.PI/nbPart)*i + angle + (2*Math.PI/nbPart - Math.PI/nbPart))*size, y + 1, z + Math.sin((2*Math.PI/nbPart)*i + angle + (2*Math.PI/nbPart - Math.PI/nbPart))*size, 1, 1);
			tessellator.addVertexWithUV(x + Math.cos((2*Math.PI/nbPart)*i + angle + (2*Math.PI/nbPart + Math.PI/nbPart))*size, y + 1, z + Math.sin((2*Math.PI/nbPart)*i + angle + (2*Math.PI/nbPart + Math.PI/nbPart))*size, 0, 1);						
			tessellator.addVertexWithUV(x + Math.cos((2*Math.PI/nbPart)*i + angle + (2*Math.PI/nbPart + Math.PI/nbPart))*size, y, z + Math.sin((2*Math.PI/nbPart)*i + angle + (2*Math.PI/nbPart + Math.PI/nbPart))*size, 1, 0);
			
			tessellator.draw();

			
						
		}
	}

		
}
