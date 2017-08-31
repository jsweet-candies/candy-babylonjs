package def.babylonjs.babylon;
public class TouchCamera extends FreeCamera {
    public double touchAngularSensibility;
    public double touchMoveSensibility;
    public TouchCamera(String name, Vector3 position, Scene scene){}
    native public String getClassName();
    native public void _setupInputs();
    protected TouchCamera(){}
}

