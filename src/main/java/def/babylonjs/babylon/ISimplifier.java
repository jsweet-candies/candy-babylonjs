package def.babylonjs.babylon;
/**
     * A simplifier interface for future simplification implementations.
     */
@jsweet.lang.Interface
public abstract class ISimplifier extends def.js.Object {
    /**
         * Simplification of a given mesh according to the given settings.
         * Since this requires computation, it is assumed that the function runs async.
         * @param settings The settings of the simplification, including quality and distance
         * @param successCallback A callback that will be called after the mesh was simplified.
         * @param errorCallback in case of an error, this callback will be called. optional.
         */
    native public void simplify(ISimplificationSettings settings, java.util.function.Consumer<Mesh> successCallback, java.lang.Runnable errorCallback);
    /**
         * Simplification of a given mesh according to the given settings.
         * Since this requires computation, it is assumed that the function runs async.
         * @param settings The settings of the simplification, including quality and distance
         * @param successCallback A callback that will be called after the mesh was simplified.
         * @param errorCallback in case of an error, this callback will be called. optional.
         */
    native public void simplify(ISimplificationSettings settings, java.util.function.Consumer<Mesh> successCallback);
}

