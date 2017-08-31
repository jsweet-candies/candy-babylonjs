package def.babylonjs.babylon;
import def.dom.HTMLElement;
public class FreeCameraGamepadInput extends ICameraInput<FreeCamera> {
    public FreeCamera camera;
    public Gamepad gamepad;
    public double gamepadAngularSensibility;
    public double gamepadMoveSensibility;
    native public void attachControl(HTMLElement element, Boolean noPreventDefault);
    native public void detachControl(HTMLElement element);
    native public void checkInputs();
    native public String getTypeName();
    native public String getSimpleName();
    native public void attachControl(HTMLElement element);
}

