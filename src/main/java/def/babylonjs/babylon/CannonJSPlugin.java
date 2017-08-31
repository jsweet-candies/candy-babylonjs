package def.babylonjs.babylon;
import def.js.Array;
public class CannonJSPlugin extends IPhysicsEnginePlugin {
    public Object world;
    public String name;
    public CannonJSPlugin(Boolean _useDeltaForWorldStep, double iterations){}
    native public void executeStep(double delta, Array<PhysicsImpostor> impostors);
    native public Boolean isSupported();
    native public Vector3 getLinearVelocity(PhysicsImpostor impostor);
    native public Vector3 getAngularVelocity(PhysicsImpostor impostor);
    native public double getRadius(PhysicsImpostor impostor);
    public CannonJSPlugin(Boolean _useDeltaForWorldStep){}
    public CannonJSPlugin(){}
    native public void setMotor(IMotorEnabledJoint joint);
    native public void executeStep(double delta, PhysicsImpostor[] impostors);
}

