package fr.bentur_and_bertatruck.bandb_mod.entity.ai;

import fr.bentur_and_bertatruck.bandb_mod.entity.EntityBenLaden;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.ai.EntityAIBase;

public class EntityAIBenLaden extends EntityAIBase {
	
	EntityBenLaden benLaden;
	
    /** The creeper's attack target. This is used for the changing of the creeper's state. */
    EntityLivingBase AttackTarget;
	
	public EntityAIBenLaden(EntityBenLaden benLaden){
		this.benLaden = benLaden;
        this.setMutexBits(1);
	}

	public boolean shouldExecute() {
        EntityLivingBase entitylivingbase = this.benLaden.getAttackTarget();

		return this.benLaden.getState() > 0 || entitylivingbase != null && this.benLaden.getDistanceSqToEntity(entitylivingbase) < 9.0D;
	}
	
	/**
     * Execute a one shot task or start executing a continuous task
     */
    public void startExecuting(){
        this.benLaden.getNavigator().clearPathEntity();
        this.AttackTarget = this.benLaden.getAttackTarget();
    }
    
    /**
     * Resets the task
     */
    public void resetTask(){
        this.AttackTarget = null;
    }
    
    /**
     * Updates the task
     */
    public void updateTask(){
        if (this.AttackTarget == null)
        {
            this.benLaden.setState(-1);
        }
        else if (this.benLaden.getDistanceSqToEntity(this.AttackTarget) > 49.0D)
        {
            this.benLaden.setState(-1);
        }
        else if (!this.benLaden.getEntitySenses().canSee(this.AttackTarget))
        {
            this.benLaden.setState(-1);
        }
        else
        {
            this.benLaden.setState(1);
        }
    }

}
