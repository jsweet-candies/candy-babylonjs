package def.babylonjs.babylon;
import def.js.Array;
public class OimoJSPlugin extends IPhysicsEnginePlugin {
    public Object world;
    public String name;
    public OimoJSPlugin(double iterations){}
    native public void executeStep(double delta, Array<PhysicsImpostor> impostors);
    native public Boolean isSupported();
    native public Vector3 getLinearVelocity(PhysicsImpostor impostor);
    native public Vector3 getAngularVelocity(PhysicsImpostor impostor);
    native public double getRadius(PhysicsImpostor impostor);
    public OimoJSPlugin(){}
    native public void executeStep(double delta, PhysicsImpostor[] impostors);
}

