package fr.bentur_and_bertatruck.bandb_mod.entity;

import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.monster.EntityMob;
import net.minecraft.world.World;

public class EntityWalker1 extends EntityMob {

	public EntityWalker1(World world) {
		super(world);
		
	}
	public void applyEntityAttributes(){
		super.applyEntityAttributes();	
		this.getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(20D);
		this.getEntityAttribute(SharedMonsterAttributes.attackDamage).setBaseValue(6D);
		this.getEntityAttribute(SharedMonsterAttributes.knockbackResistance).setBaseValue(1D);
		this.getEntityAttribute(SharedMonsterAttributes.movementSpeed).setBaseValue(0.7D);
		
	}
		
}
