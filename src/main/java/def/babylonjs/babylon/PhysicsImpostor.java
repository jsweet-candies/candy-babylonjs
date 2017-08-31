package def.babylonjs.babylon;
import def.js.Array;
public class PhysicsImpostor extends def.js.Object {
    public IPhysicsEnabledObject object;
    public double type;
    public static Vector3 DEFAULT_OBJECT_SIZE;
    public static Quaternion IDENTITY_QUATERNION;
    public final Boolean isDisposed=null;
    public double mass;
    public double friction;
    public double restitution;
    public double uniqueId;
    public PhysicsImpostor(IPhysicsEnabledObject object, double type, PhysicsImpostorParameters _options, Scene _scene){}
    /**
         * This function will completly initialize this impostor.
         * It will create a new body - but only if this mesh has no parent.
         * If it has, this impostor will not be used other than to define the impostor
         * of the child mesh.
         */
    native public void _init();
    /**
         * Should a new body be generated.
         */
    native public Boolean isBodyInitRequired();
    native public void setScalingUpdated(Boolean updated);
    /**
         * Force a regeneration of this or the parent's impostor's body.
         * Use under cautious - This will remove all joints already implemented.
         */
    native public void forceUpdate();
    /**
         * Set the physics body. Used mainly by the physics engine/plugin
         */
    public Object physicsBody;
    public PhysicsImpostor parent;
    native public void resetUpdateFlags();
    native public Vector3 getObjectExtendSize();
    native public Vector3 getObjectCenter();
    /**
         * Get a specific parametes from the options parameter.
         */
    native public Object getParam(String paramName);
    /**
         * Sets a specific parameter in the options given to the physics plugin
         */
    native public void setParam(String paramName, double value);
    /**
         * Specifically change the body's mass option. Won't recreate the physics body object
         */
    native public void setMass(double mass);
    native public Vector3 getLinearVelocity();
    native public void setLinearVelocity(Vector3 velocity);
    native public Vector3 getAngularVelocity();
    native public void setAngularVelocity(Vector3 velocity);
    /**
         * Execute a function with the physics plugin native code.
         * Provide a function the will have two variables - the world object and the physics body object.
         */
    native public void executeNativeFunction(java.util.function.BiConsumer<Object,Object> func);
    /**
         * Register a function that will be executed before the physics world is stepping forward.
         */
    native public void registerBeforePhysicsStep(java.util.function.Consumer<PhysicsImpostor> func);
    native public void unregisterBeforePhysicsStep(java.util.function.Consumer<PhysicsImpostor> func);
    /**
         * Register a function that will be executed after the physics step
         */
    native public void registerAfterPhysicsStep(java.util.function.Consumer<PhysicsImpostor> func);
    native public void unregisterAfterPhysicsStep(java.util.function.Consumer<PhysicsImpostor> func);
    /**
         * register a function that will be executed when this impostor collides against a different body.
         */
    native public void registerOnPhysicsCollide(PhysicsImpostor collideAgainst, java.util.function.BiConsumer<PhysicsImpostor,PhysicsImpostor> func);
    @jsweet.lang.Name("unregisterOnPhysicsCollide")
    native public void unregisterOnPhysicsCollideFuncBiConsumer(PhysicsImpostor collideAgainst, java.util.function.BiConsumer<PhysicsImpostor,PhysicsImpostor> func);
    /**
         * this function is executed by the physics engine.
         */
    public java.lang.Runnable beforeStep;
    /**
         * this function is executed by the physics engine.
         */
    public java.lang.Runnable afterStep;
    /**
         * Legacy collision detection event support
         */
    public java.util.function.BiConsumer<def.babylonjs.babylon.PhysicsImpostor,def.babylonjs.babylon.PhysicsImpostor> onCollideEvent;
    public java.util.function.Consumer<E> onCollide;
    /**
         * Apply a force
         */
    native public void applyForce(Vector3 force, Vector3 contactPoint);
    /**
         * Apply an impulse
         */
    native public void applyImpulse(Vector3 force, Vector3 contactPoint);
    /**
         * A help function to create a joint.
         */
    native public void createJoint(PhysicsImpostor otherImpostor, double jointType, PhysicsJointData jointData);
    /**
         * Add a joint to this impostor with a different impostor.
         */
    native public void addJoint(PhysicsImpostor otherImpostor, PhysicsJoint joint);
    /**
         * Will keep this body still, in a sleep mode.
         */
    native public void sleep();
    /**
         * Wake the body up.
         */
    native public void wakeUp();
    native public PhysicsImpostor clone(IPhysicsEnabledObject newObject);
    native public void dispose();
    native public void setDeltaPosition(Vector3 position);
    native public void setDeltaRotation(Quaternion rotation);
    native public void getBoxSizeToRef(Vector3 result);
    native public double getRadius();
    /**
         * Sync a bone with this impostor
         * @param bone The bone to sync to the impostor.
         * @param boneMesh The mesh that the bone is influencing.
         * @param jointPivot The pivot of the joint / bone in local space.
         * @param distToJoint Optional distance from the impostor to the joint.
         * @param adjustRotation Optional quaternion for adjusting the local rotation of the bone.
         */
    native public void syncBoneWithImpostor(Bone bone, AbstractMesh boneMesh, Vector3 jointPivot, double distToJoint, Quaternion adjustRotation);
    /**
         * Sync impostor to a bone
         * @param bone The bone that the impostor will be synced to.
         * @param boneMesh The mesh that the bone is influencing.
         * @param jointPivot The pivot of the joint / bone in local space.
         * @param distToJoint Optional distance from the impostor to the joint.
         * @param adjustRotation Optional quaternion for adjusting the local rotation of the bone.
         * @param boneAxis Optional vector3 axis the bone is aligned with
         */
    native public void syncImpostorWithBone(Bone bone, AbstractMesh boneMesh, Vector3 jointPivot, double distToJoint, Quaternion adjustRotation, Vector3 boneAxis);
    public static double NoImpostor;
    public static double SphereImpostor;
    public static double BoxImpostor;
    public static double PlaneImpostor;
    public static double MeshImpostor;
    public static double CylinderImpostor;
    public static double ParticleImpostor;
    public static double HeightmapImpostor;
    /** This is an automatically generated object type (see the source definition). */
    @jsweet.lang.ObjectType
    public static class E extends def.js.Object {
        public Object body;
    }
    public PhysicsImpostor(IPhysicsEnabledObject object, double type, PhysicsImpostorParameters _options){}
    public PhysicsImpostor(IPhysicsEnabledObject object, double type){}
    /**
         * Sync a bone with this impostor
         * @param bone The bone to sync to the impostor.
         * @param boneMesh The mesh that the bone is influencing.
         * @param jointPivot The pivot of the joint / bone in local space.
         * @param distToJoint Optional distance from the impostor to the joint.
         * @param adjustRotation Optional quaternion for adjusting the local rotation of the bone.
         */
    native public void syncBoneWithImpostor(Bone bone, AbstractMesh boneMesh, Vector3 jointPivot, double distToJoint);
    /**
         * Sync a bone with this impostor
         * @param bone The bone to sync to the impostor.
         * @param boneMesh The mesh that the bone is influencing.
         * @param jointPivot The pivot of the joint / bone in local space.
         * @param distToJoint Optional distance from the impostor to the joint.
         * @param adjustRotation Optional quaternion for adjusting the local rotation of the bone.
         */
    native public void syncBoneWithImpostor(Bone bone, AbstractMesh boneMesh, Vector3 jointPivot);
    /**
         * Sync impostor to a bone
         * @param bone The bone that the impostor will be synced to.
         * @param boneMesh The mesh that the bone is influencing.
         * @param jointPivot The pivot of the joint / bone in local space.
         * @param distToJoint Optional distance from the impostor to the joint.
         * @param adjustRotation Optional quaternion for adjusting the local rotation of the bone.
         * @param boneAxis Optional vector3 axis the bone is aligned with
         */
    native public void syncImpostorWithBone(Bone bone, AbstractMesh boneMesh, Vector3 jointPivot, double distToJoint, Quaternion adjustRotation);
    /**
         * Sync impostor to a bone
         * @param bone The bone that the impostor will be synced to.
         * @param boneMesh The mesh that the bone is influencing.
         * @param jointPivot The pivot of the joint / bone in local space.
         * @param distToJoint Optional distance from the impostor to the joint.
         * @param adjustRotation Optional quaternion for adjusting the local rotation of the bone.
         * @param boneAxis Optional vector3 axis the bone is aligned with
         */
    native public void syncImpostorWithBone(Bone bone, AbstractMesh boneMesh, Vector3 jointPivot, double distToJoint);
    /**
         * Sync impostor to a bone
         * @param bone The bone that the impostor will be synced to.
         * @param boneMesh The mesh that the bone is influencing.
         * @param jointPivot The pivot of the joint / bone in local space.
         * @param distToJoint Optional distance from the impostor to the joint.
         * @param adjustRotation Optional quaternion for adjusting the local rotation of the bone.
         * @param boneAxis Optional vector3 axis the bone is aligned with
         */
    native public void syncImpostorWithBone(Bone bone, AbstractMesh boneMesh, Vector3 jointPivot);
    /**
         * register a function that will be executed when this impostor collides against a different body.
         */
    native public void registerOnPhysicsCollide(Array<PhysicsImpostor> collideAgainst, java.util.function.BiConsumer<PhysicsImpostor,PhysicsImpostor> func);
    @jsweet.lang.Name("unregisterOnPhysicsCollide")
    native public void unregisterOnPhysicsCollideFuncArrayBiConsumer(Array<PhysicsImpostor> collideAgainst, java.util.function.BiConsumer<PhysicsImpostor,Array<PhysicsImpostor>> func);
    @jsweet.lang.Name("unregisterOnPhysicsCollide")
    native public void unregisterOnPhysicsCollideFuncBiConsumer(Array<PhysicsImpostor> collideAgainst, java.util.function.BiConsumer<PhysicsImpostor,PhysicsImpostor> func);
    @jsweet.lang.Name("unregisterOnPhysicsCollide")
    native public void unregisterOnPhysicsCollideFuncArrayBiConsumer(PhysicsImpostor collideAgainst, java.util.function.BiConsumer<PhysicsImpostor,Array<PhysicsImpostor>> func);
    /**
         * register a function that will be executed when this impostor collides against a different body.
         */
    native public void registerOnPhysicsCollide(PhysicsImpostor[] collideAgainst, java.util.function.BiConsumer<PhysicsImpostor,PhysicsImpostor> func);
    native public void unregisterOnPhysicsCollide(PhysicsImpostor[] collideAgainst, java.util.function.BiConsumer<PhysicsImpostor,Array<PhysicsImpostor>> func);
    protected PhysicsImpostor(){}
}

