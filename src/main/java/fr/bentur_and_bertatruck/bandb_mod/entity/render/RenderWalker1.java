package fr.bentur_and_bertatruck.bandb_mod.entity.render;

import fr.bentur_and_bertatruck.bandb_mod.common.Bandb_mod;
import fr.bentur_and_bertatruck.bandb_mod.entity.EntityWalker1;
import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.renderer.entity.RenderBiped;
import net.minecraft.entity.EntityLiving;
import net.minecraft.util.ResourceLocation;

public class RenderWalker1 extends RenderBiped {

	public final ResourceLocation texture = new ResourceLocation(Bandb_mod.MODID, "textures/models/mob_tutoriel.png");
	
	public RenderWalker1(ModelBiped model, float shadow){	
		super(model, shadow);
	}	
	
	protected ResourceLocation getEntityTexture(EntityLiving living){
		return this.getTexture((EntityWalker1)living);
	}

	private ResourceLocation getTexture(EntityWalker1 Walker1){
		return texture;
	}
	
}
