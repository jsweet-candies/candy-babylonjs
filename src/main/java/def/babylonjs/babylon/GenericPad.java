package def.babylonjs.babylon;
public class GenericPad extends Gamepad {
    native public void onbuttondown(java.util.function.Consumer<Double> callback);
    native public void onbuttonup(java.util.function.Consumer<Double> callback);
    public GenericPad(String id, double index, Object browserGamepad){}
    native public void update();
    protected GenericPad(){}
}

