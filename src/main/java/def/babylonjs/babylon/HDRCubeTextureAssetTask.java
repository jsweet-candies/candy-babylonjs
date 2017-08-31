package def.babylonjs.babylon;
public class HDRCubeTextureAssetTask extends IAssetTask {
    public String name;
    public String url;
    public double size;
    public Boolean noMipmap;
    public Boolean generateHarmonics;
    public Boolean useInGammaSpace;
    public Boolean usePMREMGenerator;
    public java.util.function.Consumer<IAssetTask> onSuccess;
    public java.util.function.Consumer<IAssetTask> onError;
    public Boolean isCompleted;
    public HDRCubeTexture texture;
    public HDRCubeTextureAssetTask(String name, String url, double size, Boolean noMipmap, Boolean generateHarmonics, Boolean useInGammaSpace, Boolean usePMREMGenerator){}
    public HDRCubeTextureAssetTask(String name, String url, double size, Boolean noMipmap, Boolean generateHarmonics, Boolean useInGammaSpace){}
    public HDRCubeTextureAssetTask(String name, String url, double size, Boolean noMipmap, Boolean generateHarmonics){}
    public HDRCubeTextureAssetTask(String name, String url, double size, Boolean noMipmap){}
    public HDRCubeTextureAssetTask(String name, String url, double size){}
    public HDRCubeTextureAssetTask(String name, String url){}
    protected HDRCubeTextureAssetTask(){}
}

