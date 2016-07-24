package fr.bentur_and_bertatruck.bandb_mod.proxy;

import cpw.mods.fml.client.registry.ClientRegistry;
import cpw.mods.fml.client.registry.RenderingRegistry;
import fr.bentur_and_bertatruck.bandb_mod.common.block.furniture.model.TileEntitySpecialRendererFurnitureKitchenWorktopA;
import fr.bentur_and_bertatruck.bandb_mod.common.block.furniture.tileEntity.TileEntityFurnitureKitchenWorktopA;
import fr.bentur_and_bertatruck.bandb_mod.entity.EntityBenLaden;
import fr.bentur_and_bertatruck.bandb_mod.entity.EntityCowCharolaise;
import fr.bentur_and_bertatruck.bandb_mod.entity.EntityCowGasconne;
import fr.bentur_and_bertatruck.bandb_mod.entity.EntityCowKerry;
import fr.bentur_and_bertatruck.bandb_mod.entity.EntityCowLaughting;
import fr.bentur_and_bertatruck.bandb_mod.entity.EntityCowMilka;
import fr.bentur_and_bertatruck.bandb_mod.entity.EntityCowMontbeliarde;
import fr.bentur_and_bertatruck.bandb_mod.entity.EntityDracula;
import fr.bentur_and_bertatruck.bandb_mod.entity.EntityGoatWhite;
import fr.bentur_and_bertatruck.bandb_mod.entity.EntityMomie;
import fr.bentur_and_bertatruck.bandb_mod.entity.EntityWalker1;
import fr.bentur_and_bertatruck.bandb_mod.entity.EntityZebra;
import fr.bentur_and_bertatruck.bandb_mod.entity.model.ModelCow;
import fr.bentur_and_bertatruck.bandb_mod.entity.model.ModelGoat;
import fr.bentur_and_bertatruck.bandb_mod.entity.model.ModelZebra;
import fr.bentur_and_bertatruck.bandb_mod.entity.render.RenderBenLaden;
import fr.bentur_and_bertatruck.bandb_mod.entity.render.RenderDracula;
import fr.bentur_and_bertatruck.bandb_mod.entity.render.RenderEntityCowCharolaise;
import fr.bentur_and_bertatruck.bandb_mod.entity.render.RenderEntityCowGasconne;
import fr.bentur_and_bertatruck.bandb_mod.entity.render.RenderEntityCowKerry;
import fr.bentur_and_bertatruck.bandb_mod.entity.render.RenderEntityCowLaughting;
import fr.bentur_and_bertatruck.bandb_mod.entity.render.RenderEntityCowMilka;
import fr.bentur_and_bertatruck.bandb_mod.entity.render.RenderEntityCowMontbeliarde;
import fr.bentur_and_bertatruck.bandb_mod.entity.render.RenderEntityGoatWhite;
import fr.bentur_and_bertatruck.bandb_mod.entity.render.RenderEntityZebra;
import fr.bentur_and_bertatruck.bandb_mod.entity.render.RenderMomie;
import fr.bentur_and_bertatruck.bandb_mod.entity.render.RenderWalker1;
import fr.bentur_and_bertatruck.bandb_mod.machine.model.TESRInventoryRenderer;
import fr.bentur_and_bertatruck.bandb_mod.machine.model.TileEntitySpecialRendererCoffeeMaker;
import fr.bentur_and_bertatruck.bandb_mod.machine.model.TileEntitySpecialRendererDistributor;
import fr.bentur_and_bertatruck.bandb_mod.machine.model.TileEntitySpecialRendererKebabStand;
import fr.bentur_and_bertatruck.bandb_mod.machine.model.TileEntitySpecialRendererPrinter;
import fr.bentur_and_bertatruck.bandb_mod.machine.tileEntity.TileEntityCoffeeMaker;
import fr.bentur_and_bertatruck.bandb_mod.machine.tileEntity.TileEntityKebabStand;
import fr.bentur_and_bertatruck.bandb_mod.machine.tileEntity.TileEntityPrinter;
import net.minecraft.client.model.ModelBiped;
import test.TileEntityDistributor;


public class bandb_mod_ClientProxy extends bandb_mod_CommonProxy{
	
	public static int tesrRenderId;
	
	@Override
	public void registerRender(){
		
	    RenderingRegistry.registerEntityRenderingHandler(EntityBenLaden.class, new RenderBenLaden(new ModelBiped(), 0.5F));
	    RenderingRegistry.registerEntityRenderingHandler(EntityWalker1.class, new RenderWalker1(new ModelBiped(), 0.5F));
	    RenderingRegistry.registerEntityRenderingHandler(EntityDracula.class, new RenderDracula(new ModelBiped(), 0.5F));
	    RenderingRegistry.registerEntityRenderingHandler(EntityMomie.class, new RenderMomie(new ModelBiped(), 0.5F));
	    	   
	    //entities
	    RenderingRegistry.registerEntityRenderingHandler(EntityCowLaughting.class, new RenderEntityCowLaughting(new ModelCow(), 0.3F));
	    RenderingRegistry.registerEntityRenderingHandler(EntityCowMilka.class, new RenderEntityCowMilka(new ModelCow(), 0.3F));
	    RenderingRegistry.registerEntityRenderingHandler(EntityCowCharolaise.class, new RenderEntityCowCharolaise(new ModelCow(), 0.3F));
	    RenderingRegistry.registerEntityRenderingHandler(EntityCowGasconne.class, new RenderEntityCowGasconne(new ModelCow(), 0.3F));
	    RenderingRegistry.registerEntityRenderingHandler(EntityCowKerry.class, new RenderEntityCowKerry(new ModelCow(), 0.3F));
	    RenderingRegistry.registerEntityRenderingHandler(EntityCowMontbeliarde.class, new RenderEntityCowMontbeliarde(new ModelCow(), 0.3F));
	    RenderingRegistry.registerEntityRenderingHandler(EntityGoatWhite.class, new RenderEntityGoatWhite(new ModelGoat(), 0.3F));
	    RenderingRegistry.registerEntityRenderingHandler(EntityZebra.class, new RenderEntityZebra(new ModelZebra(), 0.3F));
	    
	    ClientRegistry.bindTileEntitySpecialRenderer(TileEntityCoffeeMaker.class, new TileEntitySpecialRendererCoffeeMaker());	
	    ClientRegistry.bindTileEntitySpecialRenderer(TileEntityPrinter.class, new TileEntitySpecialRendererPrinter());
	    ClientRegistry.bindTileEntitySpecialRenderer(TileEntityDistributor.class, new TileEntitySpecialRendererDistributor());
	    ClientRegistry.bindTileEntitySpecialRenderer(TileEntityKebabStand.class, new TileEntitySpecialRendererKebabStand());
	    
	    //furniture
	    ClientRegistry.bindTileEntitySpecialRenderer(TileEntityFurnitureKitchenWorktopA.class, new TileEntitySpecialRendererFurnitureKitchenWorktopA());	

	    tesrRenderId = RenderingRegistry.getNextAvailableRenderId();
        RenderingRegistry.registerBlockHandler(new TESRInventoryRenderer());
        
	}

}