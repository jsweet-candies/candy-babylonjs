package def.babylonjs.babylon;
public class FollowCamera extends TargetCamera {
    public double radius;
    public double rotationOffset;
    public double heightOffset;
    public double cameraAcceleration;
    public double maxCameraSpeed;
    public AbstractMesh lockedTarget;
    public FollowCamera(String name, Vector3 position, Scene scene, AbstractMesh lockedTarget){}
    native public void _checkInputs();
    native public String getClassName();
    public FollowCamera(String name, Vector3 position, Scene scene){}
    protected FollowCamera(){}
}

