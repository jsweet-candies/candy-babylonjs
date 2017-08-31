package def.babylonjs.babylon;
public class SceneOptimizer extends def.js.Object {
    native public static void _CheckCurrentState(Scene scene, SceneOptimizerOptions options, double currentPriorityLevel, java.lang.Runnable onSuccess, java.lang.Runnable onFailure);
    native public static void OptimizeAsync(Scene scene, SceneOptimizerOptions options, java.lang.Runnable onSuccess, java.lang.Runnable onFailure);
    native public static void _CheckCurrentState(Scene scene, SceneOptimizerOptions options, double currentPriorityLevel, java.lang.Runnable onSuccess);
    native public static void _CheckCurrentState(Scene scene, SceneOptimizerOptions options, double currentPriorityLevel);
    native public static void OptimizeAsync(Scene scene, SceneOptimizerOptions options, java.lang.Runnable onSuccess);
    native public static void OptimizeAsync(Scene scene, SceneOptimizerOptions options);
    native public static void OptimizeAsync(Scene scene);
}

