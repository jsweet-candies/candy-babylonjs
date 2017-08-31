package def.babylonjs.babylon;
@jsweet.lang.Interface
public abstract class CameraInputsMap<TCamera extends def.babylonjs.babylon.Camera> extends def.js.Object {
    native public ICameraInput<TCamera> $get(String name);
    native public ICameraInput<TCamera> $get(double idx);
}

