package fr.bentur_and_bertatruck.bandb_mod.entity.render;

import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.renderer.entity.RenderBiped;
import net.minecraft.entity.EntityLiving;
import net.minecraft.util.ResourceLocation;
import fr.bentur_and_bertatruck.bandb_mod.common.Bandb_mod;
import fr.bentur_and_bertatruck.bandb_mod.entity.EntityBenLaden;
import fr.bentur_and_bertatruck.bandb_mod.entity.EntityWalker1;

public class RenderBenLaden extends RenderBiped {

	public final ResourceLocation texture = new ResourceLocation(Bandb_mod.MODID, "textures/entity/modelBenLaden.png");
	
	public RenderBenLaden(ModelBiped model, float shadow){	
		super(model, shadow);
	}	
	protected ResourceLocation getEntityTexture(EntityLiving living){
		return this.getBenLadenTexture((EntityBenLaden)living);
	}

	private ResourceLocation getBenLadenTexture(EntityBenLaden BenLaden){
		return texture;
	}
	
}
