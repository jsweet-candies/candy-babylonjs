package def.babylonjs.babylon;
import def.babylonjs.ExtendedGamepadButton;
public class OculusTouchController extends WebVRController {
    public Observable<ExtendedGamepadButton> onSecondaryTriggerStateChangedObservable;
    public Observable<ExtendedGamepadButton> onThumbRestChangedObservable;
    public OculusTouchController(Object vrGamepad){}
    native public void initControllerMesh(Scene scene, java.util.function.Consumer<AbstractMesh> meshLoaded);
    public final Observable<ExtendedGamepadButton> onAButtonStateChangedObservable=null;
    public final Observable<ExtendedGamepadButton> onBButtonStateChangedObservable=null;
    public final Observable<ExtendedGamepadButton> onXButtonStateChangedObservable=null;
    public final Observable<ExtendedGamepadButton> onYButtonStateChangedObservable=null;
    native public void handleButtonChange(double buttonIdx, ExtendedGamepadButton state, GamepadButtonChanges changes);
    native public void initControllerMesh(Scene scene);
    protected OculusTouchController(){}
}

