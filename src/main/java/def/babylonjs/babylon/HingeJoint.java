package def.babylonjs.babylon;
/**
     * This class represents a single hinge physics joint
     */
public class HingeJoint extends MotorEnabledJoint {
    public HingeJoint(PhysicsJointData jointData){}
    /**
         * Set the motor values.
         * Attention, this function is plugin specific. Engines won't react 100% the same.
         * @param {number} force the force to apply
         * @param {number} maxForce max force for this motor.
         */
    native public void setMotor(double force, double maxForce);
    /**
         * Set the motor's limits.
         * Attention, this function is plugin specific. Engines won't react 100% the same.
         */
    native public void setLimit(double upperLimit, double lowerLimit);
    /**
         * Set the motor values.
         * Attention, this function is plugin specific. Engines won't react 100% the same.
         * @param {number} force the force to apply
         * @param {number} maxForce max force for this motor.
         */
    native public void setMotor(double force);
    /**
         * Set the motor values.
         * Attention, this function is plugin specific. Engines won't react 100% the same.
         * @param {number} force the force to apply
         * @param {number} maxForce max force for this motor.
         */
    native public void setMotor();
    /**
         * Set the motor's limits.
         * Attention, this function is plugin specific. Engines won't react 100% the same.
         */
    native public void setLimit(double upperLimit);
    protected HingeJoint(){}
}

