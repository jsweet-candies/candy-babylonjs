package def.babylonjs.babylon;
import def.dom.HTMLElement;
public class ArcRotateCameraMouseWheelInput extends ICameraInput<ArcRotateCamera> {
    public ArcRotateCamera camera;
    public double wheelPrecision;
    native public void attachControl(HTMLElement element, Boolean noPreventDefault);
    native public void detachControl(HTMLElement element);
    native public String getTypeName();
    native public String getSimpleName();
    native public void attachControl(HTMLElement element);
}

