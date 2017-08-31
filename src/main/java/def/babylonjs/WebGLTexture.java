package def.babylonjs;
import def.js.Array;
import def.dom.WebGLRenderbuffer;
import def.dom.WebGLFramebuffer;
import def.js.Function;
@jsweet.lang.Interface
@jsweet.lang.Mixin(target=def.dom.WebGLTexture.class)
public abstract class WebGLTexture extends def.dom.WebGLTexture {
    public Boolean isReady;
    public Boolean isCube;
    public String url;
    public double samplingMode;
    public double references;
    public Boolean generateMipMaps;
    public double samples;
    public double type;
    public double format;
    public Array<Function> onLoadedCallbacks;
    public double _size;
    public double _baseWidth;
    public double _baseHeight;
    public double _width;
    public double _height;
    public HTMLCanvasElement _workingCanvas;
    public CanvasRenderingContext2D _workingContext;
    public WebGLFramebuffer _framebuffer;
    public WebGLRenderbuffer _depthStencilBuffer;
    public WebGLFramebuffer _MSAAFramebuffer;
    public WebGLRenderbuffer _MSAARenderBuffer;
    public double _cachedCoordinatesMode;
    public double _cachedWrapU;
    public double _cachedWrapV;
    public Boolean _isDisabled;
    public Boolean _generateStencilBuffer;
    public Boolean _generateDepthBuffer;
    public def.babylonjs.babylon.SphericalPolynomial _sphericalPolynomial;
    public def.babylonjs.babylon.BaseTexture _lodTextureHigh;
    public def.babylonjs.babylon.BaseTexture _lodTextureMid;
    public def.babylonjs.babylon.BaseTexture _lodTextureLow;
}

