package fr.bentur_and_bertatruck.bandb_mod.entity.render;

import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.renderer.entity.RenderBiped;
import net.minecraft.entity.EntityLiving;
import net.minecraft.util.ResourceLocation;
import fr.bentur_and_bertatruck.bandb_mod.common.Bandb_mod;
import fr.bentur_and_bertatruck.bandb_mod.entity.EntityDracula;
import fr.bentur_and_bertatruck.bandb_mod.entity.EntityMomie;
import fr.bentur_and_bertatruck.bandb_mod.entity.EntityWalker1;

public class RenderDracula extends RenderBiped {

	public final ResourceLocation texture = new ResourceLocation(Bandb_mod.MODID, "textures/entity/modelDracula.png");
	
	public RenderDracula(ModelBiped model, float shadow){	
		super(model, shadow);
	}	
	protected ResourceLocation getEntityTexture(EntityLiving living){
		return this.getTexture((EntityDracula)living);
	}

	private ResourceLocation getTexture(EntityDracula Dracula){
		return texture;
	}
	
}
