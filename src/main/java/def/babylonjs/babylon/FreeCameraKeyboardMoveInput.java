package def.babylonjs.babylon;
import def.dom.HTMLElement;
import def.dom.FocusEvent;
public class FreeCameraKeyboardMoveInput extends ICameraInput<FreeCamera> {
    public FreeCamera camera;
    public double[] keysUp;
    public double[] keysDown;
    public double[] keysLeft;
    public double[] keysRight;
    native public void attachControl(HTMLElement element, Boolean noPreventDefault);
    native public void detachControl(HTMLElement element);
    native public void checkInputs();
    native public String getTypeName();
    native public void _onLostFocus(FocusEvent e);
    native public String getSimpleName();
    native public void attachControl(HTMLElement element);
}

