package fr.bentur_and_bertatruck.bandb_mod.common.block.furniture.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelFurnitureKitchenWorktopA extends ModelBase{
	  //fields
	    ModelRenderer Top;
	    ModelRenderer Meuble;
	    ModelRenderer Shape1;
	  
	  public ModelFurnitureKitchenWorktopA(){
		  textureWidth = 64;
		  textureHeight = 64;
	    
		  Top = new ModelRenderer(this, 0, 30);
	      Top.addBox(-8F, -1F, -8F, 16, 1, 16);
	      Top.setRotationPoint(0F, 9F, 0F);
	      Top.setTextureSize(64, 64);
	      
	      Meuble = new ModelRenderer(this, 0, 0);
	      Meuble.addBox(-8F, -7F, -8F, 16, 15, 14);
	      Meuble.setRotationPoint(0F, 16F, 2F);
	      Meuble.setTextureSize(64, 64);
	      
	      Shape1 = new ModelRenderer(this, 0, 0);
	      Shape1.addBox(-1F, 0F, -1F, 14, 15, 2);
	      Shape1.setRotationPoint(-5F, 9F, -7F);
	      Shape1.setTextureSize(64, 64);
	      
	  }
	  
	  public void renderAll(){
	    Top.render(0.0625F);
	    Meuble.render(0.0625F);
	  }
	  
	  public void renderAngle(){
	    Top.render(0.0625F);
	    Meuble.render(0.0625F);
	    Shape1.render(0.0625F);

	  }
	  
	}

