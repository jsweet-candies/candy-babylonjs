package def.babylonjs.babylon;
public class CubeTextureAssetTask extends IAssetTask {
    public String name;
    public String url;
    public String[] extensions;
    public Boolean noMipmap;
    public String[] files;
    public java.util.function.Consumer<IAssetTask> onSuccess;
    public java.util.function.Consumer<IAssetTask> onError;
    public Boolean isCompleted;
    public CubeTexture texture;
    public CubeTextureAssetTask(String name, String url, String[] extensions, Boolean noMipmap, String[] files){}
    public CubeTextureAssetTask(String name, String url, String[] extensions, Boolean noMipmap){}
    public CubeTextureAssetTask(String name, String url, String[] extensions){}
    public CubeTextureAssetTask(String name, String url){}
    protected CubeTextureAssetTask(){}
}

