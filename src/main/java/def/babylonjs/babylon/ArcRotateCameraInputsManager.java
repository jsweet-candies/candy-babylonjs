package def.babylonjs.babylon;
public class ArcRotateCameraInputsManager extends CameraInputsManager<ArcRotateCamera> {
    public ArcRotateCameraInputsManager(ArcRotateCamera camera){}
    native public ArcRotateCameraInputsManager addMouseWheel();
    native public ArcRotateCameraInputsManager addPointers();
    native public ArcRotateCameraInputsManager addKeyboard();
    native public ArcRotateCameraInputsManager addGamepad();
    native public ArcRotateCameraInputsManager addVRDeviceOrientation();
    protected ArcRotateCameraInputsManager(){}
}

