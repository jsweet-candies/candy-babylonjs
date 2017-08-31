package def.babylonjs.babylon;
public class Gamepad extends def.js.Object {
    public String id;
    public double index;
    public Object browserGamepad;
    public double type;
    public static double GAMEPAD;
    public static double GENERIC;
    public static double XBOX;
    public static double POSE_ENABLED;
    public Gamepad(String id, double index, Object browserGamepad, double leftStickX, double leftStickY, double rightStickX, double rightStickY){}
    native public void onleftstickchanged(java.util.function.Consumer<StickValues> callback);
    native public void onrightstickchanged(java.util.function.Consumer<StickValues> callback);
    public StickValues leftStick;
    public StickValues rightStick;
    native public void update();
    public Gamepad(String id, double index, Object browserGamepad, double leftStickX, double leftStickY, double rightStickX){}
    public Gamepad(String id, double index, Object browserGamepad, double leftStickX, double leftStickY){}
    public Gamepad(String id, double index, Object browserGamepad, double leftStickX){}
    public Gamepad(String id, double index, Object browserGamepad){}
    protected Gamepad(){}
}

