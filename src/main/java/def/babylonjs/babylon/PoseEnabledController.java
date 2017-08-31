package def.babylonjs.babylon;
@jsweet.lang.Extends({PoseControlled.class})
public class PoseEnabledController extends Gamepad {
    public Object vrGamepad;
    public Vector3 devicePosition;
    public Quaternion deviceRotationQuaternion;
    public double deviceScaleFactor;
    public Vector3 position;
    public Quaternion rotationQuaternion;
    public PoseEnabledControllerType controllerType;
    public DevicePose rawPose;
    public AbstractMesh _mesh;
    public PoseEnabledController(Object vrGamepad){}
    native public void update();
    native public void attachToMesh(AbstractMesh mesh);
    native public void attachToPoseControlledCamera(TargetCamera camera);
    native public void detachMesh();
    public final AbstractMesh mesh=null;
    native public Ray getForwardRay(double length);
    native public Object updateFromDevice(DevicePose poseData);
    native public Ray getForwardRay();
    protected PoseEnabledController(){}
}

