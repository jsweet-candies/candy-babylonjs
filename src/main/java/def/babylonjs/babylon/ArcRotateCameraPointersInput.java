package def.babylonjs.babylon;
import def.dom.HTMLElement;
public class ArcRotateCameraPointersInput extends ICameraInput<ArcRotateCamera> {
    public ArcRotateCamera camera;
    public double[] buttons;
    public double angularSensibilityX;
    public double angularSensibilityY;
    public double pinchPrecision;
    public double panningSensibility;
    public Boolean pinchInwards;
    native public void attachControl(HTMLElement element, Boolean noPreventDefault);
    native public void detachControl(HTMLElement element);
    native public String getTypeName();
    native public String getSimpleName();
    native public void attachControl(HTMLElement element);
}

