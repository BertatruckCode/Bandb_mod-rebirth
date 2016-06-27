package fr.bentur_and_bertatruck.bandb_mod.machine.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelCoffeeMaker extends ModelBase{
	//fields
    ModelRenderer Shape1;
    ModelRenderer Shape2;
    ModelRenderer Shape3;
    ModelRenderer Shape4;
    ModelRenderer Shape5;
  
  public ModelCoffeeMaker()
  {
    textureWidth = 64;
    textureHeight = 32;
    
      Shape1 = new ModelRenderer(this, 0, 19);
      Shape1.addBox(0F, 0F, 0F, 4, 5, 8);
      Shape1.setRotationPoint(-2F, 19F, -3F);
      Shape1.setTextureSize(64, 32);
      setRotation(Shape1, 0F, 0F, 0F);
      Shape2 = new ModelRenderer(this, 0, 0);
      Shape2.addBox(0F, 0F, 0F, 2, 1, 2);
      Shape2.setRotationPoint(-1F, 23F, -5F);
      Shape2.setTextureSize(64, 32);
      setRotation(Shape2, 0F, 0F, 0F);
      Shape3 = new ModelRenderer(this, 41, 0);
      Shape3.addBox(0F, 0F, 0F, 2, 4, 1);
      Shape3.setRotationPoint(-1F, 20F, 5F);
      Shape3.setTextureSize(64, 32);
      setRotation(Shape3, 0F, 0F, 0F);
      Shape4 = new ModelRenderer(this, 31, 0);
      Shape4.addBox(0F, 0F, 0F, 2, 1, 1);
      Shape4.setRotationPoint(-1F, 20F, -4F);
      Shape4.setTextureSize(64, 32);
      setRotation(Shape4, 0F, 0F, 0F);
      Shape5 = new ModelRenderer(this, 48, 0);
      Shape5.addBox(0F, 0F, 0F, 2, 1, 6);
      Shape5.setRotationPoint(-1F, 18F, -2F);
      Shape5.setTextureSize(64, 32);
      setRotation(Shape5, 0F, 0F, 0F);
  }
  
  public void renderAll()
  {
    
    Shape1.render( 0.0625F);
    Shape2.render( 0.0625F);
    Shape3.render( 0.0625F);
    Shape4.render( 0.0625F);
    Shape5.render( 0.0625F);
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
