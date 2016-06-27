package fr.bentur_and_bertatruck.bandb_mod.entity.render;

import fr.bentur_and_bertatruck.bandb_mod.common.Bandb_mod;
import fr.bentur_and_bertatruck.bandb_mod.entity.EntityZebra;
import fr.bentur_and_bertatruck.bandb_mod.entity.model.ModelZebra;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelHorse;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.util.ResourceLocation;

public class RenderEntityZebra extends RenderLiving {

	private static final ResourceLocation texture = new ResourceLocation(Bandb_mod.MODID + ":textures/models/zebra/EntityZebra.png");
	protected ModelZebra modelEntity;

	public RenderEntityZebra(ModelBase par1ModelBase, float par2) {
		super(par1ModelBase, par2);

		modelEntity = ((ModelZebra) mainModel);
	}

	public void RenderEntity(EntityZebra entityLiving, double x, double y,double z, float u, float v) {
		super.doRender(entityLiving, x, y, z, u, v);

	}

	public void doRenderLiving(EntityLiving entityLiving, double x, double y,double z, float u, float v) {

		RenderEntity((EntityZebra) entityLiving, x, y, z, u, v);
	}

	public void doRender(Entity entity, double x, double y, double z, float u,float v) {
		RenderEntity((EntityZebra) entity, x, y, z, u, v);
	}

	@Override
	protected ResourceLocation getEntityTexture(Entity var1) {
		return texture;
	}

}
