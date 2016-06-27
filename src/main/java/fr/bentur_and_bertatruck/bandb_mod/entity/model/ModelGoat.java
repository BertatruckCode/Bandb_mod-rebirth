package fr.bentur_and_bertatruck.bandb_mod.entity.model;

import org.lwjgl.opengl.GL11;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.MathHelper;

public class ModelGoat extends ModelBase {
	//fields
    ModelRenderer headNeck;
    ModelRenderer horn;
    ModelRenderer ear1;
    ModelRenderer ear2;
    ModelRenderer tail;
    ModelRenderer head;
    ModelRenderer body;
    
    ModelRenderer leg1;
    
    ModelRenderer leg2;
    ModelRenderer leg3;
    ModelRenderer leg4;
    ModelRenderer horn2;
 
    protected float field_78145_g = 8.0F;
    protected float field_78151_h = 4.0F;

    
    public ModelGoat(){
    	textureWidth = 64;
		textureHeight = 32;

		body = new ModelRenderer(this, 34, 11);
	    body.addBox(-5F, -10F, -7F, 7, 13, 8);
	    body.setRotationPoint(1F, 11F, 2F);
	    body.setTextureSize(64, 32);
	    setRotation(body, 1.570796F, 0F, 0F);

	    leg1 = new ModelRenderer(this, 56, 0);
	    leg1.addBox(0F, 0F, -1F, 2, 6, 2);
	    leg1.setRotationPoint(-3.5F, 18F, 3F);
	    leg1.setTextureSize(64, 32);
	    setRotation(leg1, 0F, 0F, 0F);
	       
	  	leg2 = new ModelRenderer(this, 48, 0);     
	  	leg2.addBox(-2F, 0F, -1F, 2, 6, 2);
	    leg2.setRotationPoint(2.5F, 18F, 3F);
	    leg2.setTextureSize(64, 32);
	    setRotation(leg2, 0F, 0F, 0F);
	  	  
        leg3 = new ModelRenderer(this, 40, 0);
        leg3.addBox(0F, 0F, -1F, 2, 6, 2);
        leg3.setRotationPoint(-3.5F, 18F, -6F);
        leg3.setTextureSize(64, 32);
        setRotation(leg3, 0F, 0F, 0F);
  	  
        leg4 = new ModelRenderer(this, 32, 0);
        leg4.addBox(-2F, 0F, -1F, 2, 6, 2);
        leg4.setRotationPoint(2.5F, 18F, -6F);
        leg4.setTextureSize(64, 32);
        setRotation(leg4, 0F, 0F, 0F);
  	  
        tail = new ModelRenderer(this, 24, 14);
        tail.addBox(0F, 0F, -1F, 1, 1, 4);
        tail.setRotationPoint(-1F, 12F, 5F);
        tail.setTextureSize(64, 32);
        setRotation(tail, 0F, 0F, 0F);
        
        headNeck = new ModelRenderer(this, 0, 0);
        headNeck.addBox(-3F, -3F, -3F, 6, 4, 3);
        headNeck.setRotationPoint(-0.5F, 9F, -5F);
        headNeck.setTextureSize(64, 32);
        setRotation(headNeck, 0F, 0F, 0F);
  	  
        head = new ModelRenderer(this, 0, 20);
        head.addBox(-3F, -3F, -8F, 6, 4, 8);
        head.setRotationPoint(-0.5F, 7F, -5F);
        head.setTextureSize(64, 32);
        setRotation(head, 0F, 0F, 0F);

        horn = new ModelRenderer(this, 30, 24);
        horn.addBox(0F, -2F, 0F, 1, 3, 1);
        horn.setRotationPoint(1F, 3F, -7F);
        horn.setTextureSize(64, 32);
        setRotation(horn, -0.4363323F, 0F, 0F);
  	  
        horn2 = new ModelRenderer(this, 30, 28);
        horn2.addBox(-1F, -2F, 0F, 1, 3, 1);
        horn2.setRotationPoint(-2F, 3F, -7F);
        horn2.setTextureSize(64, 32);
        setRotation(horn2, -0.4363323F, 0F, 0F);	  
        
        ear2 = new ModelRenderer(this, 48, 8);  	  
        ear2.addBox(-3F, 1F, 0F, 3, 1, 1);
        ear2.setRotationPoint(-3F, 5F, -8F);
        ear2.setTextureSize(64, 32);
        setRotation(ear2, 0F, 0F, 0F);
  	  
        ear1 = new ModelRenderer(this, 56, 8);
        ear1.addBox(0F, 1F, 0F, 3, 1, 1);
        ear1.setRotationPoint(2F, 5F, -8F);
        ear1.setTextureSize(64, 32);
        setRotation(ear1, 0F, 0F, 0F);
        
        
        this.convertToChild(head, ear2);
        this.convertToChild(head, ear1);
        
        this.convertToChild(headNeck, head);
        this.convertToChild(headNeck, horn2);
        this.convertToChild(headNeck, horn);
        
  }
  
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5){
	    setRotationAngles(f, f1, f2, f3, f4, f5, entity);

	    
	    if (this.isChild){
            float f6 = 2.0F;
            GL11.glPushMatrix();
            GL11.glTranslatef(0.0F, this.field_78145_g * f5, this.field_78151_h * f5);
            this.headNeck.render(f5);
            GL11.glPopMatrix();
            GL11.glPushMatrix();
            GL11.glScalef(1.0F / f6, 1.0F / f6, 1.0F / f6);
            GL11.glTranslatef(0.0F, 24.0F * f5, 0.0F);
            this.body.render(f5);
            this.leg1.render(f5);
            this.leg2.render(f5);
            this.leg3.render(f5);
            this.leg4.render(f5);
            GL11.glPopMatrix();
        
	    }else{
    	    headNeck.render(f5);
            this.body.render(f5);
            this.leg1.render(f5);
            this.leg2.render(f5);
            this.leg3.render(f5);
            this.leg4.render(f5);
        }
	    	   
    }
  
    private void setRotation(ModelRenderer model, float x, float y, float z){
	    model.rotateAngleX = x;
	    model.rotateAngleY = y;
	    model.rotateAngleZ = z;
    }
  
    public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity entity){
    	//super.setRotationAngles(f, f1, f2, f3, f4, f5, entity);
    	float f6 = (180F / (float)Math.PI);
        this.headNeck.rotateAngleX = f4 / (180F / (float)Math.PI);
        this.headNeck.rotateAngleY = f3 / (180F / (float)Math.PI);
        
        this.body.rotateAngleX = ((float)Math.PI / 2F);
        this.leg1.rotateAngleX = MathHelper.cos(f * 0.6662F) * 1.4F * f1;
        this.leg2.rotateAngleX = MathHelper.cos(f * 0.6662F + (float)Math.PI) * 1.4F * f1;
        this.leg3.rotateAngleX = MathHelper.cos(f * 0.6662F + (float)Math.PI) * 1.4F * f1;
        this.leg4.rotateAngleX = MathHelper.cos(f * 0.6662F) * 1.4F * f1;
 
    }
  
    protected float degToRad(float degrees) {
		return degrees * (float) Math.PI / 180;
	}
    
	 // This is really useful for converting the source from a Techne model export
	 // which will have absolute rotation points that need to be converted before
	 // creating the addChild() relationship
	 protected void convertToChild(ModelRenderer parParent, ModelRenderer parChild)
	 {
	    // move child rotation point to be relative to parent
	    parChild.rotationPointX -= parParent.rotationPointX;
	    parChild.rotationPointY -= parParent.rotationPointY;
	    parChild.rotationPointZ -= parParent.rotationPointZ;
	    // make rotations relative to parent
	    parChild.rotateAngleX -= parParent.rotateAngleX;
	    parChild.rotateAngleY -= parParent.rotateAngleY;
	    parChild.rotateAngleZ -= parParent.rotateAngleZ;
	    // create relationship
	    parParent.addChild(parChild);
 }
    
}
