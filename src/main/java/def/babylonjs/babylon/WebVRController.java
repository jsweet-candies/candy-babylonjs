package def.babylonjs.babylon;
import def.babylonjs.ExtendedGamepadButton;
import def.js.Array;
public class WebVRController extends PoseEnabledController {
    public Observable<ExtendedGamepadButton> onTriggerStateChangedObservable;
    public Observable<ExtendedGamepadButton> onMainButtonStateChangedObservable;
    public Observable<ExtendedGamepadButton> onSecondaryButtonStateChangedObservable;
    public Observable<ExtendedGamepadButton> onPadStateChangedObservable;
    public Observable<StickValues> onPadValuesChangedObservable;
    public Array<MutableGamepadButton> _buttons;
    native public void onButtonStateChange(jsweet.util.function.TriConsumer<Double,Double,ExtendedGamepadButton> callback);
    public StickValues pad;
    public String hand;
    public WebVRController(Object vrGamepad){}
    native public void update();
    public ExtendedGamepadButton value;
    protected WebVRController(){}
}

