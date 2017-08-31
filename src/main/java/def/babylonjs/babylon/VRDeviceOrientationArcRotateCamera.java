package def.babylonjs.babylon;
public class VRDeviceOrientationArcRotateCamera extends ArcRotateCamera {
    public VRDeviceOrientationArcRotateCamera(String name, double alpha, double beta, double radius, Vector3 target, Scene scene, Boolean compensateDistortion, VRCameraMetrics vrCameraMetrics){}
    native public String getClassName();
    public VRDeviceOrientationArcRotateCamera(String name, double alpha, double beta, double radius, Vector3 target, Scene scene, Boolean compensateDistortion){}
    public VRDeviceOrientationArcRotateCamera(String name, double alpha, double beta, double radius, Vector3 target, Scene scene){}
    protected VRDeviceOrientationArcRotateCamera(){}
}

