package def.babylonjs.babylon;
public class UniversalCamera extends TouchCamera {
    public double gamepadAngularSensibility;
    public double gamepadMoveSensibility;
    public UniversalCamera(String name, Vector3 position, Scene scene){}
    native public String getClassName();
    protected UniversalCamera(){}
}

