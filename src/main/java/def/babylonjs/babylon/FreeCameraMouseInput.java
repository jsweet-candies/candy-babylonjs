package def.babylonjs.babylon;
import def.dom.HTMLElement;
public class FreeCameraMouseInput extends ICameraInput<FreeCamera> {
    public Boolean touchEnabled;
    public FreeCamera camera;
    public double[] buttons;
    public double angularSensibility;
    public FreeCameraMouseInput(Boolean touchEnabled){}
    native public void attachControl(HTMLElement element, Boolean noPreventDefault);
    native public void detachControl(HTMLElement element);
    native public String getTypeName();
    native public String getSimpleName();
    public FreeCameraMouseInput(){}
    native public void attachControl(HTMLElement element);
}

