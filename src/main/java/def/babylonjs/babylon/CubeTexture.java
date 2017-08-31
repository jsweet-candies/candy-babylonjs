package def.babylonjs.babylon;
public class CubeTexture extends BaseTexture {
    public String url;
    public double coordinatesMode;
    native public static CubeTexture CreateFromImages(String[] files, Scene scene, Boolean noMipmap);
    native public static CubeTexture CreateFromPrefilteredData(String url, Scene scene);
    public CubeTexture(String rootUrl, Scene scene, String[] extensions, Boolean noMipmap, String[] files, java.lang.Runnable onLoad, java.lang.Runnable onError, double format, Boolean prefiltered){}
    native public void delayLoad();
    native public Matrix getReflectionTextureMatrix();
    native public void setReflectionTextureMatrix(Matrix value);
    native public static CubeTexture Parse(Object parsedTexture, Scene scene, String rootUrl);
    @jsweet.lang.Name("clone")
    native public CubeTexture Clone();
    native public static CubeTexture CreateFromImages(String[] files, Scene scene);
    public CubeTexture(String rootUrl, Scene scene, String[] extensions, Boolean noMipmap, String[] files, java.lang.Runnable onLoad, java.lang.Runnable onError, double format){}
    public CubeTexture(String rootUrl, Scene scene, String[] extensions, Boolean noMipmap, String[] files, java.lang.Runnable onLoad, java.lang.Runnable onError){}
    public CubeTexture(String rootUrl, Scene scene, String[] extensions, Boolean noMipmap, String[] files, java.lang.Runnable onLoad){}
    public CubeTexture(String rootUrl, Scene scene, String[] extensions, Boolean noMipmap, String[] files){}
    public CubeTexture(String rootUrl, Scene scene, String[] extensions, Boolean noMipmap){}
    public CubeTexture(String rootUrl, Scene scene, String[] extensions){}
    public CubeTexture(String rootUrl, Scene scene){}
    protected CubeTexture(){}
}

