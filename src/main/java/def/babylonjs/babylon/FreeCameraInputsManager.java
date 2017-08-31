package def.babylonjs.babylon;
public class FreeCameraInputsManager extends CameraInputsManager<FreeCamera> {
    public FreeCameraInputsManager(FreeCamera camera){}
    native public FreeCameraInputsManager addKeyboard();
    native public FreeCameraInputsManager addMouse(Boolean touchEnabled);
    native public FreeCameraInputsManager addGamepad();
    native public FreeCameraInputsManager addDeviceOrientation();
    native public FreeCameraInputsManager addTouch();
    native public FreeCameraInputsManager addVirtualJoystick();
    native public FreeCameraInputsManager addMouse();
    protected FreeCameraInputsManager(){}
}

