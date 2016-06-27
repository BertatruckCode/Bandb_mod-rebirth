package fr.bentur_and_bertatruck.bandb_mod.entity.render;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.util.ResourceLocation;
import fr.bentur_and_bertatruck.bandb_mod.common.Bandb_mod;
import fr.bentur_and_bertatruck.bandb_mod.entity.EntityGoatWhite;
import fr.bentur_and_bertatruck.bandb_mod.entity.model.ModelEntityGoatQuadruped;
import fr.bentur_and_bertatruck.bandb_mod.entity.model.ModelGoat;

public class RenderEntityGoatWhite extends RenderLiving {

	private static final ResourceLocation texture = new ResourceLocation(Bandb_mod.MODID + ":textures/models/goat/entityGoatWhite.png");
	protected ModelGoat modelEntity;

	public RenderEntityGoatWhite(ModelBase par1ModelBase, float par2) {
		super(par1ModelBase, par2);

		modelEntity = ((ModelGoat) mainModel);
	}

	public void RenderGoatWhite(EntityGoatWhite entityLiving, double x, double y,double z, float u, float v) {
		super.doRender(entityLiving, x, y, z, u, v);

	}

	public void doRenderLiving(EntityLiving entityLiving, double x, double y,double z, float u, float v) {

		RenderGoatWhite((EntityGoatWhite) entityLiving, x, y, z, u, v);
	}

	public void doRender(Entity entity, double x, double y, double z, float u,float v) {
		RenderGoatWhite((EntityGoatWhite) entity, x, y, z, u, v);
	}

	@Override
	protected ResourceLocation getEntityTexture(Entity var1) {
		return texture;
	}

}
