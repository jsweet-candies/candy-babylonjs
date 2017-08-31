package def.babylonjs.babylon;
import def.dom.WebGLTexture;
public class PostProcess extends def.js.Object {
    public String name;
    public double width;
    public double height;
    public double renderTargetSamplingMode;
    public Color4 clearColor;
    public Boolean autoClear;
    public double alphaMode;
    public Color4 alphaConstants;
    public Boolean enablePixelPerfectMode;
    public double scaleMode;
    public Boolean alwaysForcePOT;
    public double samples;
    public SmartArray<WebGLTexture> _textures;
    public double _currentRenderTextureInd;
    public Object _indexParameters;
    /**
        * An event triggered when the postprocess is activated.
        * @type {BABYLON.Observable}
        */
    public Observable<Camera> onActivateObservable;
    public java.util.function.Consumer<Camera> onActivate;
    /**
        * An event triggered when the postprocess changes its size.
        * @type {BABYLON.Observable}
        */
    public Observable<PostProcess> onSizeChangedObservable;
    public java.util.function.Consumer<PostProcess> onSizeChanged;
    /**
        * An event triggered when the postprocess applies its effect.
        * @type {BABYLON.Observable}
        */
    public Observable<Effect> onApplyObservable;
    public java.util.function.Consumer<Effect> onApply;
    /**
        * An event triggered before rendering the postprocess
        * @type {BABYLON.Observable}
        */
    public Observable<Effect> onBeforeRenderObservable;
    public java.util.function.Consumer<Effect> onBeforeRender;
    /**
        * An event triggered after rendering the postprocess
        * @type {BABYLON.Observable}
        */
    public Observable<Effect> onAfterRenderObservable;
    public java.util.function.Consumer<Effect> onAfterRender;
    public WebGLTexture outputTexture;
    native public Camera getCamera();
    public final Vector2 texelSize=null;
    public PostProcess(String name, String fragmentUrl, String[] parameters, String[] samplers, double options, Camera camera, double samplingMode, Engine engine, Boolean reusable, String defines, double textureType, String vertexUrl, Object indexParameters, Boolean blockCompilation){}
    native public Engine getEngine();
    native public Effect getEffect();
    native public PostProcess shareOutputWith(PostProcess postProcess);
    native public void updateEffect(String defines, String[] uniforms, String[] samplers, Object indexParameters, java.util.function.Consumer<Effect> onCompiled, java.util.function.BiConsumer<Effect,String> onError);
    native public Boolean isReusable();
    /** invalidate frameBuffer to hint the postprocess to create a depth buffer */
    native public void markTextureDirty();
    native public void activate(Camera camera, WebGLTexture sourceTexture, Boolean forceDepthStencil);
    public final Boolean isSupported=null;
    public final double aspectRatio=0;
    native public Effect apply();
    native public void dispose(Camera camera);
    public PostProcess(String name, String fragmentUrl, String[] parameters, String[] samplers, double options, Camera camera, double samplingMode, Engine engine, Boolean reusable, String defines, double textureType, String vertexUrl, Object indexParameters){}
    public PostProcess(String name, String fragmentUrl, String[] parameters, String[] samplers, double options, Camera camera, double samplingMode, Engine engine, Boolean reusable, String defines, double textureType, String vertexUrl){}
    public PostProcess(String name, String fragmentUrl, String[] parameters, String[] samplers, double options, Camera camera, double samplingMode, Engine engine, Boolean reusable, String defines, double textureType){}
    public PostProcess(String name, String fragmentUrl, String[] parameters, String[] samplers, double options, Camera camera, double samplingMode, Engine engine, Boolean reusable, String defines){}
    public PostProcess(String name, String fragmentUrl, String[] parameters, String[] samplers, double options, Camera camera, double samplingMode, Engine engine, Boolean reusable){}
    public PostProcess(String name, String fragmentUrl, String[] parameters, String[] samplers, double options, Camera camera, double samplingMode, Engine engine){}
    public PostProcess(String name, String fragmentUrl, String[] parameters, String[] samplers, double options, Camera camera, double samplingMode){}
    public PostProcess(String name, String fragmentUrl, String[] parameters, String[] samplers, double options, Camera camera){}
    native public void updateEffect(String defines, String[] uniforms, String[] samplers, Object indexParameters, java.util.function.Consumer<Effect> onCompiled);
    native public void updateEffect(String defines, String[] uniforms, String[] samplers, Object indexParameters);
    native public void updateEffect(String defines, String[] uniforms, String[] samplers);
    native public void updateEffect(String defines, String[] uniforms);
    native public void updateEffect(String defines);
    native public void updateEffect();
    native public void activate(Camera camera, WebGLTexture sourceTexture);
    native public void activate(Camera camera);
    native public void dispose();
    public PostProcess(String name, String fragmentUrl, String[] parameters, String[] samplers, PostProcessOptionsData options, Camera camera, double samplingMode, Engine engine, Boolean reusable, String defines, double textureType, String vertexUrl, Object indexParameters, Boolean blockCompilation){}
    public PostProcess(String name, String fragmentUrl, String[] parameters, String[] samplers, PostProcessOptionsData options, Camera camera, double samplingMode, Engine engine, Boolean reusable, String defines, double textureType, String vertexUrl, Object indexParameters){}
    public PostProcess(String name, String fragmentUrl, String[] parameters, String[] samplers, PostProcessOptionsData options, Camera camera, double samplingMode, Engine engine, Boolean reusable, String defines, double textureType, String vertexUrl){}
    public PostProcess(String name, String fragmentUrl, String[] parameters, String[] samplers, PostProcessOptionsData options, Camera camera, double samplingMode, Engine engine, Boolean reusable, String defines, double textureType){}
    public PostProcess(String name, String fragmentUrl, String[] parameters, String[] samplers, PostProcessOptionsData options, Camera camera, double samplingMode, Engine engine, Boolean reusable, String defines){}
    public PostProcess(String name, String fragmentUrl, String[] parameters, String[] samplers, PostProcessOptionsData options, Camera camera, double samplingMode, Engine engine, Boolean reusable){}
    public PostProcess(String name, String fragmentUrl, String[] parameters, String[] samplers, PostProcessOptionsData options, Camera camera, double samplingMode, Engine engine){}
    public PostProcess(String name, String fragmentUrl, String[] parameters, String[] samplers, PostProcessOptionsData options, Camera camera, double samplingMode){}
    public PostProcess(String name, String fragmentUrl, String[] parameters, String[] samplers, PostProcessOptionsData options, Camera camera){}
    protected PostProcess(){}
}

