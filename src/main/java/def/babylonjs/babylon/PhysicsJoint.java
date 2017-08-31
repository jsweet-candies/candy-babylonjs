package def.babylonjs.babylon;
/**
     * This is a holder class for the physics joint created by the physics plugin.
     * It holds a set of functions to control the underlying joint.
     */
public class PhysicsJoint extends def.js.Object {
    public double type;
    public PhysicsJointData jointData;
    public IPhysicsEnginePlugin _physicsPlugin;
    public PhysicsJoint(double type, PhysicsJointData jointData){}
    public Object physicsJoint;
    public IPhysicsEnginePlugin physicsPlugin;
    /**
         * Execute a function that is physics-plugin specific.
         * @param {Function} func the function that will be executed.
         *                        It accepts two parameters: the physics world and the physics joint.
         */
    native public void executeNativeFunction(java.util.function.BiConsumer<Object,Object> func);
    public static double DistanceJoint;
    public static double HingeJoint;
    public static double BallAndSocketJoint;
    public static double WheelJoint;
    public static double SliderJoint;
    public static double PrismaticJoint;
    public static double UniversalJoint;
    public static double Hinge2Joint;
    public static double PointToPointJoint;
    public static double SpringJoint;
    public static double LockJoint;
    protected PhysicsJoint(){}
}

