package fr.bentur_and_bertatruck.bandb_mod.entity.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.MathHelper;

public class ModelEntityGoatQuadruped extends ModelBase {

	// fields
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

	public ModelEntityGoatQuadruped() {

		textureWidth = 64;
		textureHeight = 32;

		headNeck = new ModelRenderer(this, 0, 0);
		headNeck.addBox(0F, 7F, -1F, 6, 4, 3);
		headNeck.setRotationPoint(-3.5F, 0F, -7F);
		headNeck.setTextureSize(64, 32);
		headNeck.mirror = true;
		setRotation(headNeck, 0F, 0F, 0F);

		head = new ModelRenderer(this, 0, 20);
		head.addBox(-4F, -4F, -8F, 6, 4, 8);
		head.setRotationPoint(0.5F, 8F, -5F);
		head.setTextureSize(64, 32);
		head.mirror = true;
		setRotation(head, 0F, 0F, 0F);

		horn = new ModelRenderer(this, 29, 24);
		horn.addBox(0F, -4F, 0F, 1, 3, 1);
		horn.setRotationPoint(1F, 5F, -7F);
		horn.setTextureSize(64, 32);
		horn.mirror = true;
		setRotation(horn, -0.3490659F, 0F, 0F);

		horn2 = new ModelRenderer(this, 29, 28);
		horn2.addBox(0F, -4F, 0F, 1, 3, 1);
		horn2.setRotationPoint(-3F, 5F, -7F);
		horn2.setTextureSize(64, 32);
		horn2.mirror = true;
		setRotation(horn2, -0.3490659F, 0F, 0F);

		ear1 = new ModelRenderer(this, 0, 11);
		ear1.addBox(0F, 0F, 0F, 3, 1, 1);
		ear1.setRotationPoint(2F, 5F, -8F);
		ear1.setTextureSize(64, 32);
		ear1.mirror = true;
		setRotation(ear1, 0F, 0F, 0F);

		ear2 = new ModelRenderer(this, 0, 8);
		ear2.addBox(-3F, 0F, 0F, 3, 1, 1);
		ear2.setRotationPoint(-3F, 5F, -8F);
		ear2.setTextureSize(64, 32);
		ear2.mirror = true;
		setRotation(ear2, 0F, 0F, 0F);

		body = new ModelRenderer(this, 34, 11);
		body.addBox(-5F, -10F, -7F, 7, 13, 8);
		body.setRotationPoint(1F, 11F, 2F);
		body.setTextureSize(64, 32);
		body.mirror = true;
		setRotation(body, degToRad(90), degToRad(90), degToRad(90));

		leg1 = new ModelRenderer(this, 56, 0);
		leg1.addBox(-2F, -1F, -2F, 2, 7, 2);
		leg1.setRotationPoint(-1.5F, 18F, 4F);
		leg1.setTextureSize(64, 32);
		leg1.mirror = true;
		setRotation(leg1, -0.0371786F, 0F, 0F);

		leg2 = new ModelRenderer(this, 47, 0);
		leg2.addBox(-2F, -1F, -2F, 2, 7, 2);
		leg2.setRotationPoint(2.5F, 18F, 4F);
		leg2.setTextureSize(64, 32);
		leg2.mirror = true;
		setRotation(leg2, 0F, 0F, 0F);

		leg3 = new ModelRenderer(this, 38, 0);
		leg3.addBox(-2F, 0F, -2F, 2, 7, 2);
		leg3.setRotationPoint(-1.5F, 17F, -5F);
		leg3.setTextureSize(64, 32);
		leg3.mirror = true;
		setRotation(leg3, 0F, 0F, 0F);

		leg4 = new ModelRenderer(this, 29, 0);
		leg4.addBox(-2F, -1F, -2F, 2, 7, 2);
		leg4.setRotationPoint(2.5F, 18F, -5F);
		leg4.setTextureSize(64, 32);
		leg4.mirror = true;
		setRotation(leg4, 0F, 0F, 0F);

		tail = new ModelRenderer(this, 22, 14);
		tail.addBox(0F, 0F, 0F, 1, 1, 4);
		tail.setRotationPoint(-1F, 12F, 4F);
		tail.setTextureSize(64, 32);
		tail.mirror = true;
		setRotation(tail, 0F, 0F, 0F);

		// children
		/*
		 * headNeck.addChild(horn); headNeck.addChild(horn2);
		 * headNeck.addChild(head);
		 */

	}

	public void render(Entity entity, float f, float f1, float f2, float f3,
			float f4, float f5) {
		super.render(entity, f, f1, f2, f3, f4, f5);
		setRotationAngles(f, f1, f2, f3, f4, f5, entity);
		headNeck.render(f5);
		horn.render(f5);
		ear1.render(f5);
		ear2.render(f5);
		tail.render(f5);
		head.render(f5);
		body.render(f5);
		leg1.render(f5);
		leg2.render(f5);
		leg3.render(f5);
		leg4.render(f5);
		horn2.render(f5);
	}

	public void setRotationAngles(float f, float f1, float f2, float f3,
			float f4, float f5, Entity entity) {
		super.setRotationAngles(f, f1, f2, f3, f4, f5, entity);
		this.leg1.rotateAngleX = MathHelper.cos((180F / (float) Math.PI))
				* -3.8F * f1;
		this.leg1.rotateAngleX = MathHelper.cos((180F / (float) Math.PI))
				* 7.6F * f1;
		this.leg1.rotateAngleX = MathHelper.cos((180F / (float) Math.PI))
				* -3.8F * f1;

	}

	protected float degToRad(float degrees) {
		return degrees * (float) Math.PI / 180;
	}

	protected void setRotation(ModelRenderer model, float rotX, float rotY,
			float rotZ) {
		model.rotateAngleX = degToRad(rotX);
		model.rotateAngleY = degToRad(rotY);
		model.rotateAngleZ = degToRad(rotZ);
	}

	// spin methods are good for testing and debug rotation points and offsets
	// in the model
	protected void spinX(ModelRenderer model) {
		model.rotateAngleX += degToRad(0.5F);
	}

	protected void spinY(ModelRenderer model) {
		model.rotateAngleY += degToRad(0.5F);
	}

	protected void spinZ(ModelRenderer model) {
		model.rotateAngleZ += degToRad(0.5F);
	}
}
