package def.babylonjs.babylon;
import def.babylonjs.ExtendedGamepadButton;
public class ViveController extends WebVRController {
    public ViveController(Object vrGamepad){}
    native public void initControllerMesh(Scene scene, java.util.function.Consumer<AbstractMesh> meshLoaded);
    public final Observable<ExtendedGamepadButton> onLeftButtonStateChangedObservable=null;
    public final Observable<ExtendedGamepadButton> onRightButtonStateChangedObservable=null;
    public final Observable<ExtendedGamepadButton> onMenuButtonStateChangedObservable=null;
    /**
         * Vive mapping:
         * 0: touchpad
         * 1: trigger
         * 2: left AND right buttons
         * 3: menu button
         */
    native public void handleButtonChange(double buttonIdx, ExtendedGamepadButton state, GamepadButtonChanges changes);
    native public void initControllerMesh(Scene scene);
    protected ViveController(){}
}

