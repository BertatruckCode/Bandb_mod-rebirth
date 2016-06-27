package test;

import static org.lwjgl.opengl.GL11.GL_TRIANGLE_FAN;
import static org.lwjgl.opengl.GL11.glBegin;
import net.minecraft.client.renderer.tileentity.TileEntityRendererDispatcher;
import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ResourceLocation;

import org.lwjgl.opengl.GL11;
import org.lwjgl.util.glu.GLU;

import fr.bentur_and_bertatruck.bandb_mod.common.Bandb_mod;
import fr.bentur_and_bertatruck.bandb_mod.proxy.bandb_mod_ClientProxy;

public class TileEntitySpecialRenderTestOGL  extends TileEntitySpecialRenderer{
	
	float ctrlpoints[][][] = {
			   {{-1.5F, -1.5F, 4.0F}, {-0.5F, -1.5F, 2.0F}, {0.5F, -1.5F, -1.0F}, {1.5F, -1.5F, 2.0F}}, 
			   {{-1.5F, -0.5F, 1.0F}, {-0.5F, -0.5F, 3.0F}, {0.5F, -0.5F, 0.0F}, {1.5F, -0.5F, -1.0F}}, 
			   {{-1.5F, 0.5F, 4.0F},  {-0.5F, 0.5F, 0.0F},  {0.5F, 0.5F, 3.0F}, {1.5F, 0.5F, 4.0F}}, 
			   {{-1.5F, 1.5F, -2.0F}, {-0.5F, 1.5F, -2.0F}, {0.5F, 1.5F, 0.0F}, {1.5F, 1.5F, -1.0F}} };
	
	public static ModelTestOGL model = new ModelTestOGL();
    public static ResourceLocation texture = new ResourceLocation(Bandb_mod.MODID, "textures/models/block/greenSide.png");
    
    public TileEntitySpecialRenderTestOGL()
    {
        this.func_147497_a(TileEntityRendererDispatcher.instance);
    }

	@Override
	public void renderTileEntityAt(TileEntity tile, double x, double y, double z, float partialRenderTick){
		this.renderTileEntityTestOGLAt((TileEntityTestOGL)tile, x, y, z, partialRenderTick);
	}

	private void renderTileEntityTestOGLAt(TileEntityTestOGL tile, double x, double y, double z, float partialRenderTick) // ma propre fonction
    {
		
		//this.display();
		
		
		
		/*
		GL11.glPushMatrix();
	    GL11.glTranslated(x + 0.5F, y + 0.5F, z+ 0.5F);
	    GL11.glScalef(2F, 2F, 2F);
	    GL11.glEnable(GL11.GL_BLEND);

	    GL11.glDepthMask(false);


	    GL11.glBlendFunc(GL11.GL_SRC_ALPHA, GL11.GL_ONE_MINUS_SRC_ALPHA);
	    GL11.glColor4f(1.0F, 1.0F, 1.0F, 0.5F);
	    GL11.glEnable(GL11.GL_ALPHA_TEST);

	    GL11.glCallList(bandb_mod_ClientProxy.sphereID);

	    GL11.glCallList(bandb_mod_ClientProxy.sphereID);
	   
	    GL11.glPopMatrix();
		
		//GL11.glEnable(GL11.GL_TEXTURE_2D);
		
		/*
		GL11.glTranslated(x, y, z);
		
		Tessellator t = Tessellator.instance; //You could basically use "Tessellator.instance" all the time but it makes the code hard to read
		
		
		t.startDrawingQuads(); //Method 1
		
		 Minecraft.getMinecraft().renderEngine.bindTexture(texture);
		
		 t.addVertexWithUV(0, 0, 0, 0, 0); //Bottom left texture
		 t.addVertexWithUV(0, 1, 0, 0, 1); //Top left
		 t.addVertexWithUV(1, 1, 0, 1, 1); //Top right
		 t.addVertexWithUV(1, 0, 0, 1, 0); //Bottom right
		
		t.draw(); //Method 2
	*/
    }
	
	void display()
	{
	  
		//GL11.glClear(GL11.GL_COLOR_BUFFER_BIT | GL11.GL_DEPTH_BUFFER_BIT);
		GL11.glPushMatrix();
		GL11.glRotated(85.0, 1.0, 1.0, 1.0);
		GL11.glEvalMesh2(GL11.GL_FILL, 0, 20, 0, 20);
		GL11.glPopMatrix();
		GL11.glFlush();
	}

}
