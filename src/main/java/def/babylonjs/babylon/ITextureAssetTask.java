package def.babylonjs.babylon;
@jsweet.lang.Interface
public abstract class ITextureAssetTask extends IAssetTask {
    public java.util.function.Consumer<ITextureAssetTask> onSuccess;
    public java.util.function.Consumer<ITextureAssetTask> onError;
    public Texture texture;
}

