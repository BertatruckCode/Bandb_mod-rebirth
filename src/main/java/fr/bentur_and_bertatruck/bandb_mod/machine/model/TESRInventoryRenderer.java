package fr.bentur_and_bertatruck.bandb_mod.machine.model;

import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.RenderBlocks;
import net.minecraft.world.IBlockAccess;

import org.lwjgl.opengl.GL11;

import cpw.mods.fml.client.registry.ISimpleBlockRenderingHandler;
import fr.bentur_and_bertatruck.bandb_mod.common.Bandb_mod;
import fr.bentur_and_bertatruck.bandb_mod.common.loader.BandbMachines;
import fr.bentur_and_bertatruck.bandb_mod.machine.tileEntity.TileEntityKebabStand;
import fr.bentur_and_bertatruck.bandb_mod.proxy.bandb_mod_ClientProxy;

public class TESRInventoryRenderer implements ISimpleBlockRenderingHandler {

	public void renderInventoryBlock(Block block, int metadata, int modelId, RenderBlocks renderer) {

		 if(block == BandbMachines.blockCoffeeMaker && metadata == 0)
	        {
	            GL11.glPushMatrix();
	            GL11.glRotatef(180F, 180F, 0.0F, 1.0F);
	            GL11.glTranslatef(0.0F, -1.4F, 0.0F);
	            Minecraft.getMinecraft().getTextureManager().bindTexture(TileEntitySpecialRendererCoffeeMaker.texture);
	            TileEntitySpecialRendererCoffeeMaker.model.renderAll();
	            GL11.glPopMatrix();
	        }
		 if(block == BandbMachines.blockPrinter && metadata == 0)
	        {
	            GL11.glPushMatrix();
	            GL11.glRotatef(180F, 180F, 0.0F, 1.0F);
	            GL11.glTranslatef(0.0F, -1.4F, 0.0F);
	            Minecraft.getMinecraft().getTextureManager().bindTexture(TileEntitySpecialRendererPrinter.texture);
	            TileEntitySpecialRendererPrinter.model.renderAll();
	            GL11.glPopMatrix();
	        }
		 if(block == Bandb_mod.blockDistrib && metadata == 0)
	        {
	            GL11.glPushMatrix();
	            GL11.glScaled(0.6, 0.6, 0.6);
	            GL11.glRotatef(180F, 180F, 0.0F, 225F);
	            GL11.glTranslatef( -0.2F, -1.4F, 0.0F);
	            TileEntitySpecialRendererDistributor.renderDistributor(0, 0, 0);
	            GL11.glPopMatrix();
	        }
		 if(block == BandbMachines.blockKebabStand && metadata == 0)
	        {
	            GL11.glPushMatrix();
	            GL11.glScaled(0.6, 0.6, 0.6);
	            GL11.glRotatef(180F, 180F, 0.0F, 225F);
	            GL11.glTranslatef( -0.2F, -1.4F, 0.0F);
	            TileEntitySpecialRendererKebabStand.render(0, 0, 0, new TileEntityKebabStand());
	            GL11.glPopMatrix();
	        }
		 /*
		 if(block == Bandb_mod.blockTestOGL && metadata == 0)
	        {
	            GL11.glPushMatrix();
	            GL11.glRotatef(180F, 180F, 0.0F, 1.0F);
	            GL11.glTranslatef(0.0F, -1.4F, 0.0F);
	            GL11.glPopMatrix();
	        }
	        */
	}

	public boolean renderWorldBlock(IBlockAccess world, int x, int y, int z, Block block, int modelId, RenderBlocks renderer) {
		return false;
	}

	public boolean shouldRender3DInInventory(int modelId) {		
		return true;
	}

	public int getRenderId() {		
		return bandb_mod_ClientProxy.tesrRenderId;
	}

}
