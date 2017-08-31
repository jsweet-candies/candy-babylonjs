package def.babylonjs.babylon;
import def.dom.HTMLElement;
public class FreeCameraTouchInput extends ICameraInput<FreeCamera> {
    public FreeCamera camera;
    public double touchAngularSensibility;
    public double touchMoveSensibility;
    native public void attachControl(HTMLElement element, Boolean noPreventDefault);
    native public void detachControl(HTMLElement element);
    native public void checkInputs();
    native public String getTypeName();
    native public String getSimpleName();
    native public void attachControl(HTMLElement element);
}

