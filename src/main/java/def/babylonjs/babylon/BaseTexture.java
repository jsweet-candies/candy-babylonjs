package def.babylonjs.babylon;
import def.js.ArrayBufferView;
import def.dom.WebGLTexture;
public class BaseTexture extends def.js.Object {
    public static double DEFAULT_ANISOTROPIC_FILTERING_LEVEL;
    public String name;
    public Boolean hasAlpha;
    public Boolean getAlphaFromRGB;
    public double level;
    public double coordinatesIndex;
    public double coordinatesMode;
    public double wrapU;
    public double wrapV;
    public double anisotropicFilteringLevel;
    public Boolean isCube;
    public Boolean gammaSpace;
    public Boolean invertZ;
    public Boolean lodLevelInAlpha;
    public double lodGenerationOffset;
    public double lodGenerationScale;
    public Boolean isRenderTarget;
    public final String uid=null;
    native public String toString();
    public Animation[] animations;
    /**
        * An event triggered when the texture is disposed.
        * @type {BABYLON.Observable}
        */
    public Observable<BaseTexture> onDisposeObservable;
    public java.lang.Runnable onDispose;
    public double delayLoadState;
    public double _cachedAnisotropicFilteringLevel;
    public WebGLTexture _texture;
    public final Boolean isBlocking=null;
    public BaseTexture(Scene scene){}
    native public Scene getScene();
    native public Matrix getTextureMatrix();
    native public Matrix getReflectionTextureMatrix();
    native public WebGLTexture getInternalTexture();
    native public Boolean isReadyOrNotBlocking();
    native public Boolean isReady();
    native public ISize getSize();
    native public ISize getBaseSize();
    native public void scale(double ratio);
    public final Boolean canRescale=null;
    native public void _removeFromCache(String url, Boolean noMipmap);
    native public WebGLTexture _getFromCache(String url, Boolean noMipmap, double sampling);
    native public void delayLoad();
    @jsweet.lang.Name("clone")
    native public BaseTexture Clone();
    public final double textureType=0;
    public final double textureFormat=0;
    native public ArrayBufferView readPixels(double faceIndex);
    native public void releaseInternalTexture();
    public SphericalPolynomial sphericalPolynomial;
    public final BaseTexture _lodTextureHigh=null;
    public final BaseTexture _lodTextureMid=null;
    public final BaseTexture _lodTextureLow=null;
    native public void dispose();
    native public Object serialize();
    native public static void WhenAllReady(BaseTexture[] textures, java.lang.Runnable onLoad);
    native public WebGLTexture _getFromCache(String url, Boolean noMipmap);
    native public ArrayBufferView readPixels();
    protected BaseTexture(){}
}

