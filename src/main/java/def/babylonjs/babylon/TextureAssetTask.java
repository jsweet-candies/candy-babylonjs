package def.babylonjs.babylon;
public class TextureAssetTask extends ITextureAssetTask {
    public String name;
    public String url;
    public Boolean noMipmap;
    public Boolean invertY;
    public double samplingMode;
    public java.util.function.Consumer<ITextureAssetTask> onSuccess;
    public java.util.function.Consumer<ITextureAssetTask> onError;
    public Boolean isCompleted;
    public Texture texture;
    public TextureAssetTask(String name, String url, Boolean noMipmap, Boolean invertY, double samplingMode){}
    public TextureAssetTask(String name, String url, Boolean noMipmap, Boolean invertY){}
    public TextureAssetTask(String name, String url, Boolean noMipmap){}
    public TextureAssetTask(String name, String url){}
    protected TextureAssetTask(){}
}

