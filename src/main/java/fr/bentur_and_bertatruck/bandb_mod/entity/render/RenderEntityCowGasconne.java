package fr.bentur_and_bertatruck.bandb_mod.entity.render;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.util.ResourceLocation;
import fr.bentur_and_bertatruck.bandb_mod.common.Bandb_mod;
import fr.bentur_and_bertatruck.bandb_mod.entity.EntityCowGasconne;
import fr.bentur_and_bertatruck.bandb_mod.entity.EntityCowMilka;
import fr.bentur_and_bertatruck.bandb_mod.entity.model.ModelCow;
import fr.bentur_and_bertatruck.bandb_mod.entity.model.ModelCowMilka;

public class RenderEntityCowGasconne extends RenderLiving {

	private static final ResourceLocation texture = new ResourceLocation(Bandb_mod.MODID + ":textures/models/cow/EntityCowGasconne.png");
	protected ModelCow modelEntity;

	public RenderEntityCowGasconne(ModelBase par1ModelBase, float par2) {
		super(par1ModelBase, par2);

		modelEntity = ((ModelCow) mainModel);
	}

	public void RenderCowGasconne(EntityCowGasconne entity, double x, double y,double z, float u, float v) {
		super.doRender(entity, x, y, z, u, v);

	}

	public void doRenderLiving(EntityLiving entityLiving, double x, double y,double z, float u, float v) {

		RenderCowGasconne((EntityCowGasconne) entityLiving, x, y, z, u, v);
	}

	public void doRender(Entity entity, double x, double y, double z, float u,float v) {
		RenderCowGasconne((EntityCowGasconne) entity, x, y, z, u, v);
	}

	@Override
	protected ResourceLocation getEntityTexture(Entity var1) {

		return texture;
	}

}
