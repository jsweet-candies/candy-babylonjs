package def.babylonjs.babylon;
import def.dom.HTMLElement;
import def.dom.DeviceOrientationEvent;
public class ArcRotateCameraVRDeviceOrientationInput extends ICameraInput<ArcRotateCamera> {
    public ArcRotateCamera camera;
    public double alphaCorrection;
    public double betaCorrection;
    public double gammaCorrection;
    public ArcRotateCameraVRDeviceOrientationInput(){}
    native public void attachControl(HTMLElement element, Boolean noPreventDefault);
    native public void _onOrientationEvent(DeviceOrientationEvent evt);
    native public void checkInputs();
    native public void detachControl(HTMLElement element);
    native public String getTypeName();
    native public String getSimpleName();
    native public void attachControl(HTMLElement element);
}

