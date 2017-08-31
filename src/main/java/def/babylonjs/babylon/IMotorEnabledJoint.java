package def.babylonjs.babylon;
@jsweet.lang.Interface
public abstract class IMotorEnabledJoint extends def.js.Object {
    public Object physicsJoint;
    native public Object setMotor(double force, double maxForce, double motorIndex);
    native public Object setLimit(double upperLimit, double lowerLimit, double motorIndex);
    native public Object setMotor(double force, double maxForce);
    native public Object setMotor(double force);
    native public Object setMotor();
    native public Object setLimit(double upperLimit, double lowerLimit);
    native public Object setLimit(double upperLimit);
}

