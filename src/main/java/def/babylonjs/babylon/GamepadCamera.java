package def.babylonjs.babylon;
public class GamepadCamera extends UniversalCamera {
    public double gamepadAngularSensibility;
    public double gamepadMoveSensibility;
    public GamepadCamera(String name, Vector3 position, Scene scene){}
    native public String getClassName();
    protected GamepadCamera(){}
}

