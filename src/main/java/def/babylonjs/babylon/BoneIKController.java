package def.babylonjs.babylon;
public class BoneIKController extends def.js.Object {
    public AbstractMesh targetMesh;
    public AbstractMesh poleTargetMesh;
    public Bone poleTargetBone;
    public Vector3 targetPosition;
    public Vector3 poleTargetPosition;
    public Vector3 poleTargetLocalOffset;
    public double poleAngle;
    public AbstractMesh mesh;
    public double slerpAmount;
    public double maxAngle;
    public BoneIKController(AbstractMesh mesh, Bone bone, Options options){}
    native public void update();
    /** This is an automatically generated object type (see the source definition). */
    @jsweet.lang.ObjectType
    public static class Options extends def.js.Object {
        @jsweet.lang.Optional
        public AbstractMesh targetMesh;
        @jsweet.lang.Optional
        public AbstractMesh poleTargetMesh;
        @jsweet.lang.Optional
        public Bone poleTargetBone;
        @jsweet.lang.Optional
        public Vector3 poleTargetLocalOffset;
        @jsweet.lang.Optional
        public double poleAngle;
        @jsweet.lang.Optional
        public Vector3 bendAxis;
        @jsweet.lang.Optional
        public double maxAngle;
        @jsweet.lang.Optional
        public double slerpAmount;
    }
    public BoneIKController(AbstractMesh mesh, Bone bone){}
    protected BoneIKController(){}
}

