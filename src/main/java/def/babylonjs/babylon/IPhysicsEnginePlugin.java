package def.babylonjs.babylon;
import def.js.Array;
@jsweet.lang.Interface
public abstract class IPhysicsEnginePlugin extends def.js.Object {
    public Object world;
    public String name;
    native public Object setGravity(Vector3 gravity);
    native public Object setTimeStep(double timeStep);
    native public void executeStep(double delta, Array<PhysicsImpostor> impostors);
    native public Object applyImpulse(PhysicsImpostor impostor, Vector3 force, Vector3 contactPoint);
    native public Object applyForce(PhysicsImpostor impostor, Vector3 force, Vector3 contactPoint);
    native public Object generatePhysicsBody(PhysicsImpostor impostor);
    native public Object removePhysicsBody(PhysicsImpostor impostor);
    native public Object generateJoint(PhysicsImpostorJoint joint);
    native public Object removeJoint(PhysicsImpostorJoint joint);
    native public Boolean isSupported();
    native public Object setTransformationFromPhysicsBody(PhysicsImpostor impostor);
    native public Object setPhysicsBodyTransformation(PhysicsImpostor impostor, Vector3 newPosition, Quaternion newRotation);
    native public Object setLinearVelocity(PhysicsImpostor impostor, Vector3 velocity);
    native public Object setAngularVelocity(PhysicsImpostor impostor, Vector3 velocity);
    native public Vector3 getLinearVelocity(PhysicsImpostor impostor);
    native public Vector3 getAngularVelocity(PhysicsImpostor impostor);
    native public Object setBodyMass(PhysicsImpostor impostor, double mass);
    native public Object getBodyMass(PhysicsImpostor impostor);
    native public Object getBodyFriction(PhysicsImpostor impostor);
    native public Object setBodyFriction(PhysicsImpostor impostor, double friction);
    native public Object getBodyRestitution(PhysicsImpostor impostor);
    native public Object setBodyRestitution(PhysicsImpostor impostor, double restitution);
    native public Object sleepBody(PhysicsImpostor impostor);
    native public Object wakeUpBody(PhysicsImpostor impostor);
    native public Object updateDistanceJoint(PhysicsJoint joint, double maxDistance, double minDistance);
    native public Object setMotor(IMotorEnabledJoint joint, double speed, double maxForce, double motorIndex);
    native public Object setLimit(IMotorEnabledJoint joint, double upperLimit, double lowerLimit, double motorIndex);
    native public double getRadius(PhysicsImpostor impostor);
    native public Object getBoxSizeToRef(PhysicsImpostor impostor, Vector3 result);
    native public Object syncMeshWithImpostor(AbstractMesh mesh, PhysicsImpostor impostor);
    native public Object dispose();
    native public Object updateDistanceJoint(PhysicsJoint joint, double maxDistance);
    native public Object setMotor(IMotorEnabledJoint joint, double speed, double maxForce);
    native public Object setMotor(IMotorEnabledJoint joint, double speed);
    native public Object setLimit(IMotorEnabledJoint joint, double upperLimit, double lowerLimit);
    native public Object setLimit(IMotorEnabledJoint joint, double upperLimit);
    native public void executeStep(double delta, PhysicsImpostor[] impostors);
}

