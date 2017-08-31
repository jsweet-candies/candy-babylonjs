package def.babylonjs.babylon;
public class PhysicsEngine extends def.js.Object {
    public Vector3 gravity;
    public PhysicsEngine(Vector3 gravity, IPhysicsEnginePlugin _physicsPlugin){}
    native public void setGravity(Vector3 gravity);
    /**
         * Set the time step of the physics engine.
         * default is 1/60.
         * To slow it down, enter 1/600 for example.
         * To speed it up, 1/30
         * @param {number} newTimeStep the new timestep to apply to this world.
         */
    native public void setTimeStep(double newTimeStep);
    native public void dispose();
    native public String getPhysicsPluginName();
    public static double Epsilon;
    /**
         * Adding a new impostor for the impostor tracking.
         * This will be done by the impostor itself.
         * @param {PhysicsImpostor} impostor the impostor to add
         */
    native public void addImpostor(PhysicsImpostor impostor);
    /**
         * Remove an impostor from the engine.
         * This impostor and its mesh will not longer be updated by the physics engine.
         * @param {PhysicsImpostor} impostor the impostor to remove
         */
    native public void removeImpostor(PhysicsImpostor impostor);
    /**
         * Add a joint to the physics engine
         * @param {PhysicsImpostor} mainImpostor the main impostor to which the joint is added.
         * @param {PhysicsImpostor} connectedImpostor the impostor that is connected to the main impostor using this joint
         * @param {PhysicsJoint} the joint that will connect both impostors.
         */
    native public void addJoint(PhysicsImpostor mainImpostor, PhysicsImpostor connectedImpostor, PhysicsJoint joint);
    native public void removeJoint(PhysicsImpostor mainImpostor, PhysicsImpostor connectedImpostor, PhysicsJoint joint);
    /**
         * Called by the scene. no need to call it.
         */
    native public void _step(double delta);
    native public IPhysicsEnginePlugin getPhysicsPlugin();
    native public PhysicsImpostor getImpostorForPhysicsObject(IPhysicsEnabledObject object);
    native public PhysicsImpostor getImpostorWithPhysicsBody(Object body);
    public PhysicsEngine(Vector3 gravity){}
    public PhysicsEngine(){}
    /**
         * Set the time step of the physics engine.
         * default is 1/60.
         * To slow it down, enter 1/600 for example.
         * To speed it up, 1/30
         * @param {number} newTimeStep the new timestep to apply to this world.
         */
    native public void setTimeStep();
}

