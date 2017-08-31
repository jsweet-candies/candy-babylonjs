package def.babylonjs.babylon;
public class Xbox360Pad extends Gamepad {
    public Xbox360Pad(String id, double index, Object gamepad, Boolean xboxOne){}
    native public void onlefttriggerchanged(java.util.function.Consumer<Double> callback);
    native public void onrighttriggerchanged(java.util.function.Consumer<Double> callback);
    public double leftTrigger;
    public double rightTrigger;
    native public void onbuttondown(java.util.function.Consumer<Xbox360Button> callback);
    native public void onbuttonup(java.util.function.Consumer<Xbox360Button> callback);
    native public void ondpaddown(java.util.function.Consumer<Xbox360Dpad> callback);
    native public void ondpadup(java.util.function.Consumer<Xbox360Dpad> callback);
    public double buttonA;
    public double buttonB;
    public double buttonX;
    public double buttonY;
    public double buttonStart;
    public double buttonBack;
    public double buttonLB;
    public double buttonRB;
    public double buttonLeftStick;
    public double buttonRightStick;
    public double dPadUp;
    public double dPadDown;
    public double dPadLeft;
    public double dPadRight;
    native public void update();
    public Xbox360Pad(String id, double index, Object gamepad){}
    protected Xbox360Pad(){}
}

