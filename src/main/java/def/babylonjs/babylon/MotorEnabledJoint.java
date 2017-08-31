package def.babylonjs.babylon;
@jsweet.lang.Extends({IMotorEnabledJoint.class})
public class MotorEnabledJoint extends PhysicsJoint {
    public MotorEnabledJoint(double type, PhysicsJointData jointData){}
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
    public Object physicsJoint;
    native public Object setMotor(double force, double maxForce, double motorIndex);
    native public Object setLimit(double upperLimit, double lowerLimit, double motorIndex);
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
    protected MotorEnabledJoint(){}
}

