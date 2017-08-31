package def.babylonjs.babylon;
public class DeviceOrientationCamera extends FreeCamera {
    public DeviceOrientationCamera(String name, Vector3 position, Scene scene){}
    native public String getClassName();
    native public void _checkInputs();
    native public void resetToCurrentRotation(Axis axis);
    native public void resetToCurrentRotation();
    protected DeviceOrientationCamera(){}
}

