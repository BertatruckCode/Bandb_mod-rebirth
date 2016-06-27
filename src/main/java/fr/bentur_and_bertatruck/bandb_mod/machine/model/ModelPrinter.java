package fr.bentur_and_bertatruck.bandb_mod.machine.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelPrinter extends ModelBase
{
	  //fields
	    ModelRenderer Shape1;
	    ModelRenderer Shape2;
	    ModelRenderer Shape3;
	    ModelRenderer Shape4;
	    ModelRenderer Shape5;
	    ModelRenderer Shape6;
	    ModelRenderer Shape7;
	  
	  public ModelPrinter()
	  {
	    textureWidth = 64;
	    textureHeight = 32;
	    
	      Shape1 = new ModelRenderer(this, 26, 21);
	      Shape1.addBox(-5F, 0F, -4F, 10, 2, 9);
	      Shape1.setRotationPoint(0F, 22F, 0F);
	      Shape1.setTextureSize(64, 32);
	      setRotation(Shape1, 0F, 0F, 0F);
	      Shape2 = new ModelRenderer(this, 0, 18);
	      Shape2.addBox(0F, 0F, 0F, 3, 1, 7);
	      Shape2.setRotationPoint(-5F, 21F, -4F);
	      Shape2.setTextureSize(64, 32);
	      setRotation(Shape2, 0F, 0F, 0F);
	      Shape3 = new ModelRenderer(this, 0, 0);
	      Shape3.addBox(0F, 0F, 0F, 3, 1, 7);
	      Shape3.setRotationPoint(2F, 21F, -4F);
	      Shape3.setTextureSize(64, 32);
	      setRotation(Shape3, 0F, 0F, 0F);
	      Shape4 = new ModelRenderer(this, 40, 15);
	      Shape4.addBox(0F, 0F, 0F, 10, 3, 2);
	      Shape4.setRotationPoint(-5F, 19F, 3F);
	      Shape4.setTextureSize(64, 32);
	      setRotation(Shape4, 0F, 0F, 0F);
	      Shape5 = new ModelRenderer(this, 36, 9);
	      Shape5.addBox(0F, 0F, 0F, 10, 1, 4);
	      Shape5.setRotationPoint(-5F, 20F, -2F);
	      Shape5.setTextureSize(64, 32);
	      setRotation(Shape5, 0F, 0F, 0F);
	      Shape6 = new ModelRenderer(this, 0, 30);
	      Shape6.addBox(0F, 0F, 0F, 3, 1, 1);
	      Shape6.setRotationPoint(2F, 20F, 2F);
	      Shape6.setTextureSize(64, 32);
	      setRotation(Shape6, 0F, 0F, 0F);
	      Shape7 = new ModelRenderer(this, 0, 27);
	      Shape7.addBox(0F, 0F, 0F, 3, 1, 1);
	      Shape7.setRotationPoint(-5F, 20F, 2F);
	      Shape7.setTextureSize(64, 32);
	      setRotation(Shape7, 0F, 0F, 0F);
	  }
	  
	  public void renderAll()
	  {
	    Shape1.render(0.0625F);
	    Shape2.render(0.0625F);
	    Shape3.render(0.0625F);
	    Shape4.render(0.0625F);
	    Shape5.render(0.0625F);
	    Shape6.render(0.0625F);
	    Shape7.render(0.0625F);
	  }
	  
	  private void setRotation(ModelRenderer model, float x, float y, float z)
	  {
	    model.rotateAngleX = x;
	    model.rotateAngleY = y;
	    model.rotateAngleZ = z;
	  }
	  
	  public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity entity)
	  {
	    super.setRotationAngles(f, f1, f2, f3, f4, f5, entity);
	  }

	}
