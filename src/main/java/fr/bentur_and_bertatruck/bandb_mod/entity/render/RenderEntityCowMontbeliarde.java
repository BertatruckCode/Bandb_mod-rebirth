package fr.bentur_and_bertatruck.bandb_mod.entity.render;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.util.ResourceLocation;
import fr.bentur_and_bertatruck.bandb_mod.common.Bandb_mod;
import fr.bentur_and_bertatruck.bandb_mod.entity.EntityCowMontbeliarde;
import fr.bentur_and_bertatruck.bandb_mod.entity.model.ModelCow;

public class RenderEntityCowMontbeliarde extends RenderLiving {

	private static final ResourceLocation texture = new ResourceLocation(Bandb_mod.MODID + ":textures/models/cow/EntityCowMontbeliarde.png");
	protected ModelCow modelEntity;

	public RenderEntityCowMontbeliarde(ModelBase par1ModelBase, float par2) {
		super(par1ModelBase, par2);

		modelEntity = ((ModelCow) mainModel);
	}

	public void RenderCowMontbeliarde(EntityCowMontbeliarde entity, double x, double y,double z, float u, float v) {
		super.doRender(entity, x, y, z, u, v);

	}

	public void doRenderLiving(EntityLiving entityLiving, double x, double y,double z, float u, float v) {

		RenderCowMontbeliarde((EntityCowMontbeliarde) entityLiving, x, y, z, u, v);
	}

	public void doRender(Entity entity, double x, double y, double z, float u,float v) {
		RenderCowMontbeliarde((EntityCowMontbeliarde) entity, x, y, z, u, v);
	}

	@Override
	protected ResourceLocation getEntityTexture(Entity var1) {

		return texture;
	}

}
