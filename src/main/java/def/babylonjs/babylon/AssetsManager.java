package def.babylonjs.babylon;
public class AssetsManager extends def.js.Object {
    public IAssetTask[] tasks;
    public double waitingTasksCount;
    public java.util.function.Consumer<IAssetTask[]> onFinish;
    public java.util.function.Consumer<IAssetTask> onTaskSuccess;
    public java.util.function.Consumer<IAssetTask> onTaskError;
    public Boolean useDefaultLoadingScreen;
    public AssetsManager(Scene scene){}
    native public IAssetTask addMeshTask(String taskName, Object meshesNames, String rootUrl, String sceneFilename);
    native public IAssetTask addTextFileTask(String taskName, String url);
    native public IAssetTask addBinaryFileTask(String taskName, String url);
    native public IAssetTask addImageTask(String taskName, String url);
    native public ITextureAssetTask addTextureTask(String taskName, String url, Boolean noMipmap, Boolean invertY, double samplingMode);
    native public IAssetTask addCubeTextureTask(String name, String url, String[] extensions, Boolean noMipmap, String[] files);
    native public IAssetTask addHDRCubeTextureTask(String name, String url, double size, Boolean noMipmap, Boolean generateHarmonics, Boolean useInGammaSpace, Boolean usePMREMGenerator);
    native public AssetsManager reset();
    native public AssetsManager load();
    native public ITextureAssetTask addTextureTask(String taskName, String url, Boolean noMipmap, Boolean invertY);
    native public ITextureAssetTask addTextureTask(String taskName, String url, Boolean noMipmap);
    native public ITextureAssetTask addTextureTask(String taskName, String url);
    native public IAssetTask addCubeTextureTask(String name, String url, String[] extensions, Boolean noMipmap);
    native public IAssetTask addCubeTextureTask(String name, String url, String[] extensions);
    native public IAssetTask addCubeTextureTask(String name, String url);
    native public IAssetTask addHDRCubeTextureTask(String name, String url, double size, Boolean noMipmap, Boolean generateHarmonics, Boolean useInGammaSpace);
    native public IAssetTask addHDRCubeTextureTask(String name, String url, double size, Boolean noMipmap, Boolean generateHarmonics);
    native public IAssetTask addHDRCubeTextureTask(String name, String url, double size, Boolean noMipmap);
    native public IAssetTask addHDRCubeTextureTask(String name, String url, double size);
    native public IAssetTask addHDRCubeTextureTask(String name, String url);
    protected AssetsManager(){}
}

