package def.babylonjs.babylon;
public class Texture extends BaseTexture {
    public static double NEAREST_SAMPLINGMODE;
    public static double BILINEAR_SAMPLINGMODE;
    public static double TRILINEAR_SAMPLINGMODE;
    public static double EXPLICIT_MODE;
    public static double SPHERICAL_MODE;
    public static double PLANAR_MODE;
    public static double CUBIC_MODE;
    public static double PROJECTION_MODE;
    public static double SKYBOX_MODE;
    public static double INVCUBIC_MODE;
    public static double EQUIRECTANGULAR_MODE;
    public static double FIXED_EQUIRECTANGULAR_MODE;
    public static double FIXED_EQUIRECTANGULAR_MIRRORED_MODE;
    public static double CLAMP_ADDRESSMODE;
    public static double WRAP_ADDRESSMODE;
    public static double MIRROR_ADDRESSMODE;
    public String url;
    public double uOffset;
    public double vOffset;
    public double uScale;
    public double vScale;
    public double uAng;
    public double vAng;
    public double wAng;
    public final Boolean noMipmap=null;
    public Boolean _invertY;
    public double _samplingMode;
    public double _format;
    public Boolean _isBlocking;
    public Boolean isBlocking;
    public Texture(String url, Scene scene, Boolean noMipmap, Boolean invertY, double samplingMode, java.lang.Runnable onLoad, java.lang.Runnable onError, Object buffer, Boolean deleteBuffer, double format){}
    native public void updateURL(String url);
    native public void delayLoad();
    native public void updateSamplingMode(double samplingMode);
    native public Matrix getTextureMatrix();
    native public Matrix getReflectionTextureMatrix();
    @jsweet.lang.Name("clone")
    native public Texture Clone();
    public final Observable<Texture> onLoadObservable=null;
    native public static Texture CreateFromBase64String(String data, String name, Scene scene, Boolean noMipmap, Boolean invertY, double samplingMode, java.lang.Runnable onLoad, java.lang.Runnable onError, double format);
    native public static BaseTexture Parse(Object parsedTexture, Scene scene, String rootUrl);
    native public static Texture LoadFromDataString(String name, Object buffer, Scene scene, Boolean deleteBuffer, Boolean noMipmap, Boolean invertY, double samplingMode, java.lang.Runnable onLoad, java.lang.Runnable onError, double format);
    public Texture(String url, Scene scene, Boolean noMipmap, Boolean invertY, double samplingMode, java.lang.Runnable onLoad, java.lang.Runnable onError, Object buffer, Boolean deleteBuffer){}
    public Texture(String url, Scene scene, Boolean noMipmap, Boolean invertY, double samplingMode, java.lang.Runnable onLoad, java.lang.Runnable onError, Object buffer){}
    public Texture(String url, Scene scene, Boolean noMipmap, Boolean invertY, double samplingMode, java.lang.Runnable onLoad, java.lang.Runnable onError){}
    public Texture(String url, Scene scene, Boolean noMipmap, Boolean invertY, double samplingMode, java.lang.Runnable onLoad){}
    public Texture(String url, Scene scene, Boolean noMipmap, Boolean invertY, double samplingMode){}
    public Texture(String url, Scene scene, Boolean noMipmap, Boolean invertY){}
    public Texture(String url, Scene scene, Boolean noMipmap){}
    public Texture(String url, Scene scene){}
    native public static Texture CreateFromBase64String(String data, String name, Scene scene, Boolean noMipmap, Boolean invertY, double samplingMode, java.lang.Runnable onLoad, java.lang.Runnable onError);
    native public static Texture CreateFromBase64String(String data, String name, Scene scene, Boolean noMipmap, Boolean invertY, double samplingMode, java.lang.Runnable onLoad);
    native public static Texture CreateFromBase64String(String data, String name, Scene scene, Boolean noMipmap, Boolean invertY, double samplingMode);
    native public static Texture CreateFromBase64String(String data, String name, Scene scene, Boolean noMipmap, Boolean invertY);
    native public static Texture CreateFromBase64String(String data, String name, Scene scene, Boolean noMipmap);
    native public static Texture CreateFromBase64String(String data, String name, Scene scene);
    native public static Texture LoadFromDataString(String name, Object buffer, Scene scene, Boolean deleteBuffer, Boolean noMipmap, Boolean invertY, double samplingMode, java.lang.Runnable onLoad, java.lang.Runnable onError);
    native public static Texture LoadFromDataString(String name, Object buffer, Scene scene, Boolean deleteBuffer, Boolean noMipmap, Boolean invertY, double samplingMode, java.lang.Runnable onLoad);
    native public static Texture LoadFromDataString(String name, Object buffer, Scene scene, Boolean deleteBuffer, Boolean noMipmap, Boolean invertY, double samplingMode);
    native public static Texture LoadFromDataString(String name, Object buffer, Scene scene, Boolean deleteBuffer, Boolean noMipmap, Boolean invertY);
    native public static Texture LoadFromDataString(String name, Object buffer, Scene scene, Boolean deleteBuffer, Boolean noMipmap);
    native public static Texture LoadFromDataString(String name, Object buffer, Scene scene, Boolean deleteBuffer);
    native public static Texture LoadFromDataString(String name, Object buffer, Scene scene);
    protected Texture(){}
}

