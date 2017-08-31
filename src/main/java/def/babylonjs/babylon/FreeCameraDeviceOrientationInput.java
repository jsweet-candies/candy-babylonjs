package def.babylonjs.babylon;
import def.dom.HTMLElement;
public class FreeCameraDeviceOrientationInput extends ICameraInput<FreeCamera> {
    public FreeCameraDeviceOrientationInput(){}
    public FreeCamera camera;
    native public void attachControl(HTMLElement element, Boolean noPreventDefault);
    native public void detachControl(HTMLElement element);
    native public void checkInputs();
    native public String getTypeName();
    native public String getSimpleName();
    native public void attachControl(HTMLElement element);
}

