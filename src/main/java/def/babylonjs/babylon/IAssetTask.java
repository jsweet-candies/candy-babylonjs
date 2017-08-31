package def.babylonjs.babylon;
@jsweet.lang.Interface
public abstract class IAssetTask extends def.js.Object {
    public java.util.function.Consumer<IAssetTask> onSuccess;
    public java.util.function.Consumer<IAssetTask> onError;
    public Boolean isCompleted;
    native public Object run(Scene scene, java.lang.Runnable onSuccess, java.lang.Runnable onError);
}

