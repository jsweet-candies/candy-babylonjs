package def.babylonjs.babylon;
public class BoneLookController extends def.js.Object {
    /**
         * The target Vector3 that the bone will look at.
         */
    public Vector3 target;
    /**
         * The mesh that the bone is attached to.
         */
    public AbstractMesh mesh;
    /**
         * The bone that will be looking to the target.
         */
    public Bone bone;
    /**
         * The up axis of the coordinate system that is used when the bone is rotated.
         */
    public Vector3 upAxis;
    /**
         * The space that the up axis is in - BABYLON.Space.BONE, BABYLON.Space.LOCAL (default), or BABYLON.Space.WORLD.
         */
    public Space upAxisSpace;
    /**
         * Used to make an adjustment to the yaw of the bone.
         */
    public double adjustYaw;
    /**
         * Used to make an adjustment to the pitch of the bone.
         */
    public double adjustPitch;
    /**
         * Used to make an adjustment to the roll of the bone.
         */
    public double adjustRoll;
    /**
         * The amount to slerp (spherical linear interpolation) to the target.  Set this to a value between 0 and 1 (a value of 1 disables slerp).
         */
    public double slerpAmount;
    /**
         * Get/set the minimum yaw angle that the bone can look to.
         */
    public double minYaw;
    /**
         * Get/set the maximum yaw angle that the bone can look to.
         */
    public double maxYaw;
    /**
         * Get/set the minimum pitch angle that the bone can look to.
         */
    public double minPitch;
    /**
         * Get/set the maximum pitch angle that the bone can look to.
         */
    public double maxPitch;
    public BoneLookController(AbstractMesh mesh, Bone bone, Vector3 target, Options options){}
    /**
         * Update the bone to look at the target.  This should be called before the scene is rendered (use scene.registerBeforeRender()).
         */
    native public void update();
    /** This is an automatically generated object type (see the source definition). */
    @jsweet.lang.ObjectType
    public static class Options extends def.js.Object {
        @jsweet.lang.Optional
        public double maxYaw;
        @jsweet.lang.Optional
        public double minYaw;
        @jsweet.lang.Optional
        public double maxPitch;
        @jsweet.lang.Optional
        public double minPitch;
        @jsweet.lang.Optional
        public double slerpAmount;
        @jsweet.lang.Optional
        public Vector3 upAxis;
        @jsweet.lang.Optional
        public Space upAxisSpace;
        @jsweet.lang.Optional
        public Vector3 yawAxis;
        @jsweet.lang.Optional
        public Vector3 pitchAxis;
        @jsweet.lang.Optional
        public double adjustYaw;
        @jsweet.lang.Optional
        public double adjustPitch;
        @jsweet.lang.Optional
        public double adjustRoll;
    }
    public BoneLookController(AbstractMesh mesh, Bone bone, Vector3 target){}
    protected BoneLookController(){}
}

