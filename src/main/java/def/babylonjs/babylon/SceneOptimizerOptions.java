package def.babylonjs.babylon;
public class SceneOptimizerOptions extends def.js.Object {
    public double targetFrameRate;
    public double trackerDuration;
    public SceneOptimization[] optimizations;
    public SceneOptimizerOptions(double targetFrameRate, double trackerDuration){}
    native public static SceneOptimizerOptions LowDegradationAllowed(double targetFrameRate);
    native public static SceneOptimizerOptions ModerateDegradationAllowed(double targetFrameRate);
    native public static SceneOptimizerOptions HighDegradationAllowed(double targetFrameRate);
    public SceneOptimizerOptions(double targetFrameRate){}
    public SceneOptimizerOptions(){}
    native public static SceneOptimizerOptions LowDegradationAllowed();
    native public static SceneOptimizerOptions ModerateDegradationAllowed();
    native public static SceneOptimizerOptions HighDegradationAllowed();
}

