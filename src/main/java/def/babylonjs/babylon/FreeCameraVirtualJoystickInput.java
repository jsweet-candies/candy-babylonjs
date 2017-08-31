package def.babylonjs.babylon;
import def.dom.HTMLElement;
public class FreeCameraVirtualJoystickInput extends ICameraInput<FreeCamera> {
    public FreeCamera camera;
    native public VirtualJoystick getLeftJoystick();
    native public VirtualJoystick getRightJoystick();
    native public void checkInputs();
    native public void attachControl(HTMLElement element, Boolean noPreventDefault);
    native public void detachControl(HTMLElement element);
    native public String getTypeName();
    native public String getSimpleName();
    native public void attachControl(HTMLElement element);
}

