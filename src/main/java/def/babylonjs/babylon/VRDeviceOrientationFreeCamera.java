package def.babylonjs.babylon;
public class VRDeviceOrientationFreeCamera extends DeviceOrientationCamera {
    public VRDeviceOrientationFreeCamera(String name, Vector3 position, Scene scene, Boolean compensateDistortion, VRCameraMetrics vrCameraMetrics){}
    native public String getClassName();
    public VRDeviceOrientationFreeCamera(String name, Vector3 position, Scene scene, Boolean compensateDistortion){}
    public VRDeviceOrientationFreeCamera(String name, Vector3 position, Scene scene){}
    protected VRDeviceOrientationFreeCamera(){}
}

