package def.babylonjs.babylon;
import def.js.Array;
import def.js.Float32Array;
import def.dom.HTMLImageElement;
import def.js.ArrayBufferView;
import def.js.Int32Array;
import def.dom.WebGLRenderingContext;
import def.babylonjs.WebGLVertexArrayObject;
import def.dom.WebGLTexture;
import def.dom.HTMLCanvasElement;
import def.dom.WebGLContextEvent;
import def.dom.WebGLProgram;
import def.dom.WebGLUniformLocation;
import def.js.Uint8Array;
import def.dom.ClientRect;
import def.dom.WebGLBuffer;
import def.js.ArrayBuffer;
import def.dom.HTMLVideoElement;
/**
     * The engine class is responsible for interfacing with all lower-level APIs such as WebGL and Audio.
     */
public class Engine extends def.js.Object {
    public static Engine[] Instances;
    public static final Engine LastCreatedEngine=null;
    public static final Scene LastCreatedScene=null;
    /**
         * Will flag all materials in all scenes in all engines as dirty to trigger new shader compilation
         */
    native public static void MarkAllMaterialsAsDirty(double flag, java.util.function.Function<Material,Boolean> predicate);
    public static final double NEVER=0;
    public static final double ALWAYS=0;
    public static final double LESS=0;
    public static final double EQUAL=0;
    public static final double LEQUAL=0;
    public static final double GREATER=0;
    public static final double GEQUAL=0;
    public static final double NOTEQUAL=0;
    public static final double KEEP=0;
    public static final double REPLACE=0;
    public static final double INCR=0;
    public static final double DECR=0;
    public static final double INVERT=0;
    public static final double INCR_WRAP=0;
    public static final double DECR_WRAP=0;
    public static final double ALPHA_DISABLE=0;
    public static final double ALPHA_ONEONE=0;
    public static final double ALPHA_ADD=0;
    public static final double ALPHA_COMBINE=0;
    public static final double ALPHA_SUBTRACT=0;
    public static final double ALPHA_MULTIPLY=0;
    public static final double ALPHA_MAXIMIZED=0;
    public static final double ALPHA_PREMULTIPLIED=0;
    public static final double ALPHA_PREMULTIPLIED_PORTERDUFF=0;
    public static final double ALPHA_INTERPOLATE=0;
    public static final double ALPHA_SCREENMODE=0;
    public static final double DELAYLOADSTATE_NONE=0;
    public static final double DELAYLOADSTATE_LOADED=0;
    public static final double DELAYLOADSTATE_LOADING=0;
    public static final double DELAYLOADSTATE_NOTLOADED=0;
    public static final double TEXTUREFORMAT_ALPHA=0;
    public static final double TEXTUREFORMAT_LUMINANCE=0;
    public static final double TEXTUREFORMAT_LUMINANCE_ALPHA=0;
    public static final double TEXTUREFORMAT_RGB=0;
    public static final double TEXTUREFORMAT_RGBA=0;
    public static final double TEXTURETYPE_UNSIGNED_INT=0;
    public static final double TEXTURETYPE_FLOAT=0;
    public static final double TEXTURETYPE_HALF_FLOAT=0;
    public static final double SCALEMODE_FLOOR=0;
    public static final double SCALEMODE_NEAREST=0;
    public static final double SCALEMODE_CEILING=0;
    public static final String Version=null;
    public static double CollisionsEpsilon;
    public static String CodeRepository;
    public static String ShadersRepository;
    public Boolean isFullscreen;
    public Boolean isPointerLock;
    public Boolean cullBackFaces;
    public Boolean renderEvenInBackground;
    public Boolean preventCacheWipeBetweenFrames;
    public Database enableOfflineSupport;
    public Scene[] scenes;
    /**
         * Observable event triggered each time the rendering canvas is resized
         */
    public Observable<Engine> onResizeObservable;
    /**
         * Observable event triggered each time the canvas lost focus
         */
    public Observable<Engine> onCanvasBlurObservable;
    public Object vrDisplaysPromise;
    public WebGLRenderingContext _gl;
    public final Boolean badOS=null;
    public final Boolean badDesktopOS=null;
    public static AudioEngine audioEngine;
    public PerfCounter _drawCalls;
    public final Array<String> texturesSupported=null;
    public final String textureFormatInUse=null;
    public final WebGLTexture emptyTexture=null;
    public final WebGLTexture emptyCubeTexture=null;
    /**
         * @constructor
         * @param {HTMLCanvasElement} canvas - the canvas to be used for rendering
         * @param {boolean} [antialias] - enable antialias
         * @param options - further options to be sent to the getContext function
         */
    public Engine(HTMLCanvasElement canvas, Boolean antialias, EngineOptions options, Boolean adaptToDeviceRatio){}
    public final double webGLVersion=0;
    /**
         * Returns true if the stencil buffer has been enabled through the creation option of the context.
         */
    public final Boolean isStencilEnable=null;
    native public void resetTextureCache();
    native public GetGlInfo getGlInfo();
    native public double getAspectRatio(Camera camera, Boolean useScreen);
    native public double getRenderWidth(Boolean useScreen);
    native public double getRenderHeight(Boolean useScreen);
    native public HTMLCanvasElement getRenderingCanvas();
    native public ClientRect getRenderingCanvasClientRect();
    native public void setHardwareScalingLevel(double level);
    native public double getHardwareScalingLevel();
    native public WebGLTexture[] getLoadedTexturesCache();
    native public EngineCapabilities getCaps();
    public final double drawCalls=0;
    public final PerfCounter drawCallsPerfCounter=null;
    native public double getDepthFunction();
    native public void setDepthFunction(double depthFunc);
    native public void setDepthFunctionToGreater();
    native public void setDepthFunctionToGreaterOrEqual();
    native public void setDepthFunctionToLess();
    native public void setDepthFunctionToLessOrEqual();
    native public Boolean getStencilBuffer();
    native public void setStencilBuffer(Boolean enable);
    native public double getStencilMask();
    native public void setStencilMask(double mask);
    native public double getStencilFunction();
    native public double getStencilFunctionReference();
    native public double getStencilFunctionMask();
    native public void setStencilFunction(double stencilFunc);
    native public void setStencilFunctionReference(double reference);
    native public void setStencilFunctionMask(double mask);
    native public double getStencilOperationFail();
    native public double getStencilOperationDepthFail();
    native public double getStencilOperationPass();
    native public void setStencilOperationFail(double operation);
    native public void setStencilOperationDepthFail(double operation);
    native public void setStencilOperationPass(double operation);
    native public void setDitheringState(Boolean value);
    /**
         * stop executing a render loop function and remove it from the execution array
         * @param {Function} [renderFunction] the function to be removed. If not provided all functions will be removed.
         */
    native public void stopRenderLoop(java.lang.Runnable renderFunction);
    native public void _renderLoop();
    /**
         * Register and execute a render loop. The engine can have more than one render function.
         * @param {Function} renderFunction - the function to continuously execute starting the next render loop.
         * @example
         * engine.runRenderLoop(function () {
         *      scene.render()
         * })
         */
    native public void runRenderLoop(java.lang.Runnable renderFunction);
    /**
         * Toggle full screen mode.
         * @param {boolean} requestPointerLock - should a pointer lock be requested from the user
         * @param {any} options - an options object to be sent to the requestFullscreen function
         */
    native public void switchFullscreen(Boolean requestPointerLock);
    native public void clear(Color4 color, Boolean backBuffer, Boolean depth, Boolean stencil);
    native public void scissorClear(double x, double y, double width, double height, Color4 clearColor);
    /**
         * Set the WebGL's viewport
         * @param {BABYLON.Viewport} viewport - the viewport element to be used.
         * @param {number} [requiredWidth] - the width required for rendering. If not provided the rendering canvas' width is used.
         * @param {number} [requiredHeight] - the height required for rendering. If not provided the rendering canvas' height is used.
         */
    native public void setViewport(Viewport viewport, double requiredWidth, double requiredHeight);
    /**
         * Directly set the WebGL Viewport
         * The x, y, width & height are directly passed to the WebGL call
         * @return the current viewport Object (if any) that is being replaced by this call. You can restore this viewport later on to go back to the original state.
         */
    native public Viewport setDirectViewport(double x, double y, double width, double height);
    native public void beginFrame();
    native public void endFrame();
    /**
         * resize the view according to the canvas' size.
         * @example
         *   window.addEventListener("resize", function () {
         *      engine.resize();
         *   });
         */
    native public void resize();
    /**
         * force a specific size of the canvas
         * @param {number} width - the new canvas' width
         * @param {number} height - the new canvas' height
         */
    native public void setSize(double width, double height);
    native public void isVRDevicePresent(java.util.function.Consumer<Boolean> callback);
    native public void getVRDevice(String name, java.util.function.Consumer<Object> callback);
    native public void initWebVR();
    native public void enableVR(Object vrDevice);
    native public void disableVR();
    native public void bindFramebuffer(WebGLTexture texture, double faceIndex, double requiredWidth, double requiredHeight);
    native public void unBindFramebuffer(WebGLTexture texture, Boolean disableGenerateMipMaps, java.lang.Runnable onBeforeUnbind);
    native public void generateMipMapsForCubemap(WebGLTexture texture);
    native public void flushFramebuffer();
    native public void restoreDefaultFramebuffer();
    native public WebGLBuffer createUniformBuffer(double[] elements);
    native public WebGLBuffer createDynamicUniformBuffer(double[] elements);
    native public void updateUniformBuffer(WebGLBuffer uniformBuffer, double[] elements, double offset, double count);
    native public WebGLBuffer createVertexBuffer(double[] vertices);
    native public WebGLBuffer createDynamicVertexBuffer(double[] vertices);
    native public void updateDynamicVertexBuffer(WebGLBuffer vertexBuffer, double[] vertices, double offset, double count);
    native public WebGLBuffer createIndexBuffer(Object indices);
    native public void bindArrayBuffer(WebGLBuffer buffer);
    native public void bindUniformBuffer(WebGLBuffer buffer);
    native public void bindUniformBufferBase(WebGLBuffer buffer, double location);
    native public void bindUniformBlock(WebGLProgram shaderProgram, String blockName, double index);
    native public void updateArrayBuffer(Float32Array data);
    native public WebGLVertexArrayObject recordVertexArrayObject(VertexBuffers vertexBuffers, WebGLBuffer indexBuffer, Effect effect);
    native public void bindVertexArrayObject(WebGLVertexArrayObject vertexArrayObject, WebGLBuffer indexBuffer);
    native public void bindBuffersDirectly(WebGLBuffer vertexBuffer, WebGLBuffer indexBuffer, double[] vertexDeclaration, double vertexStrideSize, Effect effect);
    native public void bindBuffers(VertexBuffers vertexBuffers, WebGLBuffer indexBuffer, Effect effect);
    native public void unbindInstanceAttributes();
    native public void releaseVertexArrayObject(WebGLVertexArrayObject vao);
    native public Boolean _releaseBuffer(WebGLBuffer buffer);
    native public WebGLBuffer createInstancesBuffer(double capacity);
    native public void deleteInstancesBuffer(WebGLBuffer buffer);
    native public void updateAndBindInstancesBuffer(WebGLBuffer instancesBuffer, Float32Array data, double[] offsetLocations);
    native public void applyStates();
    native public void draw(Boolean useTriangles, double indexStart, double indexCount, double instancesCount);
    native public void drawPointClouds(double verticesStart, double verticesCount, double instancesCount);
    native public void drawUnIndexed(Boolean useTriangles, double verticesStart, double verticesCount, double instancesCount);
    native public void _releaseEffect(Effect effect);
    native public Effect createEffect(Object baseName, String[] attributesNamesOrOptions, String[] uniformsNamesOrEngine, String[] samplers, String defines, EffectFallbacks fallbacks, java.util.function.Consumer<Effect> onCompiled, java.util.function.BiConsumer<Effect,String> onError, Object indexParameters);
    native public Effect createEffectForParticles(String fragmentName, String[] uniformsNames, String[] samplers, String defines, EffectFallbacks fallbacks, java.util.function.Consumer<Effect> onCompiled, java.util.function.BiConsumer<Effect,String> onError);
    native public WebGLProgram createShaderProgram(String vertexCode, String fragmentCode, String defines, WebGLRenderingContext context);
    native public WebGLUniformLocation[] getUniforms(WebGLProgram shaderProgram, String[] uniformsNames);
    native public double[] getAttributes(WebGLProgram shaderProgram, String[] attributesNames);
    native public void enableEffect(Effect effect);
    native public void setIntArray(WebGLUniformLocation uniform, Int32Array array);
    native public void setIntArray2(WebGLUniformLocation uniform, Int32Array array);
    native public void setIntArray3(WebGLUniformLocation uniform, Int32Array array);
    native public void setIntArray4(WebGLUniformLocation uniform, Int32Array array);
    native public void setFloatArray(WebGLUniformLocation uniform, Float32Array array);
    native public void setFloatArray2(WebGLUniformLocation uniform, Float32Array array);
    native public void setFloatArray3(WebGLUniformLocation uniform, Float32Array array);
    native public void setFloatArray4(WebGLUniformLocation uniform, Float32Array array);
    native public void setArray(WebGLUniformLocation uniform, double[] array);
    native public void setArray2(WebGLUniformLocation uniform, double[] array);
    native public void setArray3(WebGLUniformLocation uniform, double[] array);
    native public void setArray4(WebGLUniformLocation uniform, double[] array);
    native public void setMatrices(WebGLUniformLocation uniform, Float32Array matrices);
    native public void setMatrix(WebGLUniformLocation uniform, Matrix matrix);
    native public void setMatrix3x3(WebGLUniformLocation uniform, Float32Array matrix);
    native public void setMatrix2x2(WebGLUniformLocation uniform, Float32Array matrix);
    native public void setFloat(WebGLUniformLocation uniform, double value);
    native public void setFloat2(WebGLUniformLocation uniform, double x, double y);
    native public void setFloat3(WebGLUniformLocation uniform, double x, double y, double z);
    native public void setBool(WebGLUniformLocation uniform, double bool);
    native public void setFloat4(WebGLUniformLocation uniform, double x, double y, double z, double w);
    native public void setColor3(WebGLUniformLocation uniform, Color3 color3);
    native public void setColor4(WebGLUniformLocation uniform, Color3 color3, double alpha);
    native public void setState(Boolean culling, double zOffset, Boolean force, Boolean reverseSide);
    native public void setZOffset(double value);
    native public double getZOffset();
    native public void setDepthBuffer(Boolean enable);
    native public Boolean getDepthWrite();
    native public void setDepthWrite(Boolean enable);
    native public void setColorWrite(Boolean enable);
    native public void setAlphaConstants(double r, double g, double b, double a);
    native public void setAlphaMode(double mode, Boolean noDepthWriteChange);
    native public double getAlphaMode();
    native public void setAlphaTesting(Boolean enable);
    native public Boolean getAlphaTesting();
    native public void wipeCaches(Boolean bruteForce);
    /**
         * Set the compressed texture format to use, based on the formats you have, and the formats
         * supported by the hardware / browser.
         *
         * Khronos Texture Container (.ktx) files are used to support this.  This format has the
         * advantage of being specifically designed for OpenGL.  Header elements directly correspond
         * to API arguments needed to compressed textures.  This puts the burden on the container
         * generator to house the arcane code for determining these for current & future formats.
         *
         * for description see https://www.khronos.org/opengles/sdk/tools/KTX/
         * for file layout see https://www.khronos.org/opengles/sdk/tools/KTX/file_format_spec/
         *
         * Note: The result of this call is not taken into account when a texture is base64.
         *
         * @param {Array<string>} formatsAvailable- The list of those format families you have created
         * on your server.  Syntax: '-' + format family + '.ktx'.  (Case and order do not matter.)
         *
         * Current families are astc, dxt, pvrtc, etc2, & etc1.
         * @returns The extension selected.
         */
    native public String setTextureFormatToUse(Array<String> formatsAvailable);
    /**
         * Usually called from BABYLON.Texture.ts.  Passed information to create a WebGLTexture.
         * @param {string} urlArg- This contains one of the following:
         *                         1. A conventional http URL, e.g. 'http://...' or 'file://...'
         *                         2. A base64 string of in-line texture data, e.g. 'data:image/jpg;base64,/...'
         *                         3. An indicator that data being passed using the buffer parameter, e.g. 'data:mytexture.jpg'
         *
         * @param {boolean} noMipmap- When true, no mipmaps shall be generated.  Ignored for compressed textures.  They must be in the file.
         * @param {boolean} invertY- When true, image is flipped when loaded.  You probably want true. Ignored for compressed textures.  Must be flipped in the file.
         * @param {Scene} scene- Needed for loading to the correct scene.
         * @param {number} samplingMode- Mode with should be used sample / access the texture.  Default: TRILINEAR
         * @param {callback} onLoad- Optional callback to be called upon successful completion.
         * @param {callback} onError- Optional callback to be called upon failure.
         * @param {ArrayBuffer | HTMLImageElement} buffer- A source of a file previously fetched as either an ArrayBuffer (compressed or image format) or HTMLImageElement (image format)
         * @param {WebGLTexture} fallback- An internal argument in case the function must be called again, due to etc1 not having alpha capabilities.
         * @param {number} format-  Internal format.  Default: RGB when extension is '.jpg' else RGBA.  Ignored for compressed textures.
         *
         * @returns {WebGLTexture} for assignment back into BABYLON.Texture
         */
    native public WebGLTexture createTexture(String urlArg, Boolean noMipmap, Boolean invertY, Scene scene, double samplingMode, java.lang.Runnable onLoad, java.lang.Runnable onError, ArrayBuffer buffer, WebGLTexture fallBack, double format);
    native public void updateRawTexture(WebGLTexture texture, ArrayBufferView data, double format, Boolean invertY, String compression);
    native public WebGLTexture createRawTexture(ArrayBufferView data, double width, double height, double format, Boolean generateMipMaps, Boolean invertY, double samplingMode, String compression);
    native public WebGLTexture createDynamicTexture(double width, double height, Boolean generateMipMaps, double samplingMode);
    native public void updateTextureSamplingMode(double samplingMode, WebGLTexture texture);
    native public void updateDynamicTexture(WebGLTexture texture, HTMLCanvasElement canvas, Boolean invertY, Boolean premulAlpha, double format);
    native public void updateVideoTexture(WebGLTexture texture, HTMLVideoElement video, Boolean invertY);
    native public WebGLTexture createRenderTargetTexture(Object size, Object options);
    native public WebGLTexture[] createMultipleRenderTarget(Object size, Object options);
    native public double updateRenderTargetTextureSampleCount(WebGLTexture texture, double samples);
    native public void _uploadDataToTexture(double target, double lod, double internalFormat, double width, double height, double format, double type, ArrayBufferView data);
    native public void _uploadCompressedDataToTexture(double target, double lod, double internalFormat, double width, double height, ArrayBufferView data);
    native public WebGLTexture createRenderTargetCubeTexture(double size, Object options);
    native public WebGLTexture createPrefilteredCubeTexture(String rootUrl, Scene scene, double scale, double offset, java.lang.Runnable onLoad, java.lang.Runnable onError, double format);
    native public WebGLTexture createCubeTexture(String rootUrl, Scene scene, String[] files, Boolean noMipmap, java.util.function.Consumer<Object> onLoad, java.lang.Runnable onError, double format);
    native public void updateTextureSize(WebGLTexture texture, double width, double height);
    native public void updateRawCubeTexture(WebGLTexture texture, ArrayBufferView[] data, double format, double type, Boolean invertY, String compression, double level);
    native public WebGLTexture createRawCubeTexture(ArrayBufferView[] data, double size, double format, double type, Boolean generateMipMaps, Boolean invertY, double samplingMode, String compression);
    native public WebGLTexture createRawCubeTextureFromUrl(String url, Scene scene, double size, double format, double type, Boolean noMipmap, java.util.function.Function<ArrayBuffer,ArrayBufferView[]> callback, java.util.function.Function<ArrayBufferView[],ArrayBufferView[][]> mipmmapGenerator, java.lang.Runnable onLoad, java.lang.Runnable onError, double samplingMode, Boolean invertY);
    native public void _releaseFramebufferObjects(WebGLTexture texture);
    native public void _releaseTexture(WebGLTexture texture);
    native public void bindSamplers(Effect effect);
    native public void _bindTextureDirectly(double target, WebGLTexture texture);
    native public void _bindTexture(double channel, WebGLTexture texture);
    native public void setTextureFromPostProcess(double channel, PostProcess postProcess);
    native public void unbindAllTextures();
    native public void setTexture(double channel, WebGLUniformLocation uniform, BaseTexture texture);
    native public void setTextureArray(double channel, WebGLUniformLocation uniform, BaseTexture[] textures);
    native public void _setAnisotropicLevel(double key, BaseTexture texture);
    native public Uint8Array readPixels(double x, double y, double width, double height);
    /**
         * Add an externaly attached data from its key.
         * This method call will fail and return false, if such key already exists.
         * If you don't care and just want to get the data no matter what, use the more convenient getOrAddExternalDataWithFactory() method.
         * @param key the unique key that identifies the data
         * @param data the data object to associate to the key for this Engine instance
         * @return true if no such key were already present and the data was added successfully, false otherwise
         */
    native public <T> Boolean addExternalData(String key, T data);
    /**
         * Get an externaly attached data from its key
         * @param key the unique key that identifies the data
         * @return the associated data, if present (can be null), or undefined if not present
         */
    native public <T> T getExternalData(String key);
    /**
         * Get an externaly attached data from its key, create it using a factory if it's not already present
         * @param key the unique key that identifies the data
         * @param factory the factory that will be called to create the instance if and only if it doesn't exists
         * @return the associated data, can be null if the factory returned null.
         */
    native public <T> T getOrAddExternalDataWithFactory(String key, java.util.function.Function<String,T> factory);
    /**
         * Remove an externaly attached data from the Engine instance
         * @param key the unique key that identifies the data
         * @return true if the data was successfully removed, false if it doesn't exist
         */
    native public Boolean removeExternalData(Object key);
    native public void releaseInternalTexture(WebGLTexture texture);
    native public void unbindAllAttributes();
    native public void releaseEffects();
    native public void dispose();
    native public void displayLoadingUI();
    native public void hideLoadingUI();
    public ILoadingScreen loadingScreen;
    public String loadingUIText;
    public String loadingUIBackgroundColor;
    native public void attachContextLostEvent(java.util.function.Consumer<WebGLContextEvent> callback);
    native public void attachContextRestoredEvent(java.util.function.Consumer<WebGLContextEvent> callback);
    native public String getVertexShaderSource(WebGLProgram program);
    native public String getFragmentShaderSource(WebGLProgram program);
    native public double getError();
    native public double getFps();
    native public double getDeltaTime();
    native public ArrayBufferView _readTexturePixels(WebGLTexture texture, double width, double height, double faceIndex);
    native public double _getWebGLTextureType(double type);
    native public double _getRGBABufferInternalSizedFormat(double type);
    native public static Boolean isSupported();
    /** This is an automatically generated object type (see the source definition). */
    @jsweet.lang.ObjectType
    public static class GetGlInfo extends def.js.Object {
        public String vendor;
        public String renderer;
        public String version;
    }
    /** This is an automatically generated object type (see the source definition). */
    @jsweet.lang.ObjectType
    public static class VertexBuffers extends def.js.Object {
        native public VertexBuffer $get(String key);
    }
    /**
         * Will flag all materials in all scenes in all engines as dirty to trigger new shader compilation
         */
    native public static void MarkAllMaterialsAsDirty(double flag);
    /**
         * @constructor
         * @param {HTMLCanvasElement} canvas - the canvas to be used for rendering
         * @param {boolean} [antialias] - enable antialias
         * @param options - further options to be sent to the getContext function
         */
    public Engine(HTMLCanvasElement canvas, Boolean antialias, EngineOptions options){}
    /**
         * @constructor
         * @param {HTMLCanvasElement} canvas - the canvas to be used for rendering
         * @param {boolean} [antialias] - enable antialias
         * @param options - further options to be sent to the getContext function
         */
    public Engine(HTMLCanvasElement canvas, Boolean antialias){}
    /**
         * @constructor
         * @param {HTMLCanvasElement} canvas - the canvas to be used for rendering
         * @param {boolean} [antialias] - enable antialias
         * @param options - further options to be sent to the getContext function
         */
    public Engine(HTMLCanvasElement canvas){}
    native public double getAspectRatio(Camera camera);
    native public double getRenderWidth();
    native public double getRenderHeight();
    /**
         * stop executing a render loop function and remove it from the execution array
         * @param {Function} [renderFunction] the function to be removed. If not provided all functions will be removed.
         */
    native public void stopRenderLoop();
    native public void clear(Color4 color, Boolean backBuffer, Boolean depth);
    /**
         * Set the WebGL's viewport
         * @param {BABYLON.Viewport} viewport - the viewport element to be used.
         * @param {number} [requiredWidth] - the width required for rendering. If not provided the rendering canvas' width is used.
         * @param {number} [requiredHeight] - the height required for rendering. If not provided the rendering canvas' height is used.
         */
    native public void setViewport(Viewport viewport, double requiredWidth);
    /**
         * Set the WebGL's viewport
         * @param {BABYLON.Viewport} viewport - the viewport element to be used.
         * @param {number} [requiredWidth] - the width required for rendering. If not provided the rendering canvas' width is used.
         * @param {number} [requiredHeight] - the height required for rendering. If not provided the rendering canvas' height is used.
         */
    native public void setViewport(Viewport viewport);
    native public void bindFramebuffer(WebGLTexture texture, double faceIndex, double requiredWidth);
    native public void bindFramebuffer(WebGLTexture texture, double faceIndex);
    native public void bindFramebuffer(WebGLTexture texture);
    native public void unBindFramebuffer(WebGLTexture texture, Boolean disableGenerateMipMaps);
    native public void unBindFramebuffer(WebGLTexture texture);
    native public void updateUniformBuffer(WebGLBuffer uniformBuffer, double[] elements, double offset);
    native public void updateUniformBuffer(WebGLBuffer uniformBuffer, double[] elements);
    native public void updateDynamicVertexBuffer(WebGLBuffer vertexBuffer, double[] vertices, double offset);
    native public void updateDynamicVertexBuffer(WebGLBuffer vertexBuffer, double[] vertices);
    native public void bindUniformBuffer();
    native public void draw(Boolean useTriangles, double indexStart, double indexCount);
    native public void drawPointClouds(double verticesStart, double verticesCount);
    native public void drawUnIndexed(Boolean useTriangles, double verticesStart, double verticesCount);
    native public Effect createEffect(Object baseName, String[] attributesNamesOrOptions, String[] uniformsNamesOrEngine, String[] samplers, String defines, EffectFallbacks fallbacks, java.util.function.Consumer<Effect> onCompiled, java.util.function.BiConsumer<Effect,String> onError);
    native public Effect createEffect(Object baseName, String[] attributesNamesOrOptions, String[] uniformsNamesOrEngine, String[] samplers, String defines, EffectFallbacks fallbacks, java.util.function.Consumer<Effect> onCompiled);
    native public Effect createEffect(Object baseName, String[] attributesNamesOrOptions, String[] uniformsNamesOrEngine, String[] samplers, String defines, EffectFallbacks fallbacks);
    native public Effect createEffect(Object baseName, String[] attributesNamesOrOptions, String[] uniformsNamesOrEngine, String[] samplers, String defines);
    native public Effect createEffect(Object baseName, String[] attributesNamesOrOptions, String[] uniformsNamesOrEngine, String[] samplers);
    native public Effect createEffect(Object baseName, String[] attributesNamesOrOptions, String[] uniformsNamesOrEngine);
    native public Effect createEffectForParticles(String fragmentName, String[] uniformsNames, String[] samplers, String defines, EffectFallbacks fallbacks, java.util.function.Consumer<Effect> onCompiled);
    native public Effect createEffectForParticles(String fragmentName, String[] uniformsNames, String[] samplers, String defines, EffectFallbacks fallbacks);
    native public Effect createEffectForParticles(String fragmentName, String[] uniformsNames, String[] samplers, String defines);
    native public Effect createEffectForParticles(String fragmentName, String[] uniformsNames, String[] samplers);
    native public Effect createEffectForParticles(String fragmentName, String[] uniformsNames);
    native public Effect createEffectForParticles(String fragmentName);
    native public WebGLProgram createShaderProgram(String vertexCode, String fragmentCode, String defines);
    native public void setState(Boolean culling, double zOffset, Boolean force);
    native public void setState(Boolean culling, double zOffset);
    native public void setState(Boolean culling);
    native public void setAlphaMode(double mode);
    native public void wipeCaches();
    /**
         * Usually called from BABYLON.Texture.ts.  Passed information to create a WebGLTexture.
         * @param {string} urlArg- This contains one of the following:
         *                         1. A conventional http URL, e.g. 'http://...' or 'file://...'
         *                         2. A base64 string of in-line texture data, e.g. 'data:image/jpg;base64,/...'
         *                         3. An indicator that data being passed using the buffer parameter, e.g. 'data:mytexture.jpg'
         *
         * @param {boolean} noMipmap- When true, no mipmaps shall be generated.  Ignored for compressed textures.  They must be in the file.
         * @param {boolean} invertY- When true, image is flipped when loaded.  You probably want true. Ignored for compressed textures.  Must be flipped in the file.
         * @param {Scene} scene- Needed for loading to the correct scene.
         * @param {number} samplingMode- Mode with should be used sample / access the texture.  Default: TRILINEAR
         * @param {callback} onLoad- Optional callback to be called upon successful completion.
         * @param {callback} onError- Optional callback to be called upon failure.
         * @param {ArrayBuffer | HTMLImageElement} buffer- A source of a file previously fetched as either an ArrayBuffer (compressed or image format) or HTMLImageElement (image format)
         * @param {WebGLTexture} fallback- An internal argument in case the function must be called again, due to etc1 not having alpha capabilities.
         * @param {number} format-  Internal format.  Default: RGB when extension is '.jpg' else RGBA.  Ignored for compressed textures.
         *
         * @returns {WebGLTexture} for assignment back into BABYLON.Texture
         */
    native public WebGLTexture createTexture(String urlArg, Boolean noMipmap, Boolean invertY, Scene scene, double samplingMode, java.lang.Runnable onLoad, java.lang.Runnable onError, ArrayBuffer buffer, WebGLTexture fallBack);
    /**
         * Usually called from BABYLON.Texture.ts.  Passed information to create a WebGLTexture.
         * @param {string} urlArg- This contains one of the following:
         *                         1. A conventional http URL, e.g. 'http://...' or 'file://...'
         *                         2. A base64 string of in-line texture data, e.g. 'data:image/jpg;base64,/...'
         *                         3. An indicator that data being passed using the buffer parameter, e.g. 'data:mytexture.jpg'
         *
         * @param {boolean} noMipmap- When true, no mipmaps shall be generated.  Ignored for compressed textures.  They must be in the file.
         * @param {boolean} invertY- When true, image is flipped when loaded.  You probably want true. Ignored for compressed textures.  Must be flipped in the file.
         * @param {Scene} scene- Needed for loading to the correct scene.
         * @param {number} samplingMode- Mode with should be used sample / access the texture.  Default: TRILINEAR
         * @param {callback} onLoad- Optional callback to be called upon successful completion.
         * @param {callback} onError- Optional callback to be called upon failure.
         * @param {ArrayBuffer | HTMLImageElement} buffer- A source of a file previously fetched as either an ArrayBuffer (compressed or image format) or HTMLImageElement (image format)
         * @param {WebGLTexture} fallback- An internal argument in case the function must be called again, due to etc1 not having alpha capabilities.
         * @param {number} format-  Internal format.  Default: RGB when extension is '.jpg' else RGBA.  Ignored for compressed textures.
         *
         * @returns {WebGLTexture} for assignment back into BABYLON.Texture
         */
    native public WebGLTexture createTexture(String urlArg, Boolean noMipmap, Boolean invertY, Scene scene, double samplingMode, java.lang.Runnable onLoad, java.lang.Runnable onError, ArrayBuffer buffer);
    /**
         * Usually called from BABYLON.Texture.ts.  Passed information to create a WebGLTexture.
         * @param {string} urlArg- This contains one of the following:
         *                         1. A conventional http URL, e.g. 'http://...' or 'file://...'
         *                         2. A base64 string of in-line texture data, e.g. 'data:image/jpg;base64,/...'
         *                         3. An indicator that data being passed using the buffer parameter, e.g. 'data:mytexture.jpg'
         *
         * @param {boolean} noMipmap- When true, no mipmaps shall be generated.  Ignored for compressed textures.  They must be in the file.
         * @param {boolean} invertY- When true, image is flipped when loaded.  You probably want true. Ignored for compressed textures.  Must be flipped in the file.
         * @param {Scene} scene- Needed for loading to the correct scene.
         * @param {number} samplingMode- Mode with should be used sample / access the texture.  Default: TRILINEAR
         * @param {callback} onLoad- Optional callback to be called upon successful completion.
         * @param {callback} onError- Optional callback to be called upon failure.
         * @param {ArrayBuffer | HTMLImageElement} buffer- A source of a file previously fetched as either an ArrayBuffer (compressed or image format) or HTMLImageElement (image format)
         * @param {WebGLTexture} fallback- An internal argument in case the function must be called again, due to etc1 not having alpha capabilities.
         * @param {number} format-  Internal format.  Default: RGB when extension is '.jpg' else RGBA.  Ignored for compressed textures.
         *
         * @returns {WebGLTexture} for assignment back into BABYLON.Texture
         */
    native public WebGLTexture createTexture(String urlArg, Boolean noMipmap, Boolean invertY, Scene scene, double samplingMode, java.lang.Runnable onLoad, java.lang.Runnable onError);
    /**
         * Usually called from BABYLON.Texture.ts.  Passed information to create a WebGLTexture.
         * @param {string} urlArg- This contains one of the following:
         *                         1. A conventional http URL, e.g. 'http://...' or 'file://...'
         *                         2. A base64 string of in-line texture data, e.g. 'data:image/jpg;base64,/...'
         *                         3. An indicator that data being passed using the buffer parameter, e.g. 'data:mytexture.jpg'
         *
         * @param {boolean} noMipmap- When true, no mipmaps shall be generated.  Ignored for compressed textures.  They must be in the file.
         * @param {boolean} invertY- When true, image is flipped when loaded.  You probably want true. Ignored for compressed textures.  Must be flipped in the file.
         * @param {Scene} scene- Needed for loading to the correct scene.
         * @param {number} samplingMode- Mode with should be used sample / access the texture.  Default: TRILINEAR
         * @param {callback} onLoad- Optional callback to be called upon successful completion.
         * @param {callback} onError- Optional callback to be called upon failure.
         * @param {ArrayBuffer | HTMLImageElement} buffer- A source of a file previously fetched as either an ArrayBuffer (compressed or image format) or HTMLImageElement (image format)
         * @param {WebGLTexture} fallback- An internal argument in case the function must be called again, due to etc1 not having alpha capabilities.
         * @param {number} format-  Internal format.  Default: RGB when extension is '.jpg' else RGBA.  Ignored for compressed textures.
         *
         * @returns {WebGLTexture} for assignment back into BABYLON.Texture
         */
    native public WebGLTexture createTexture(String urlArg, Boolean noMipmap, Boolean invertY, Scene scene, double samplingMode, java.lang.Runnable onLoad);
    /**
         * Usually called from BABYLON.Texture.ts.  Passed information to create a WebGLTexture.
         * @param {string} urlArg- This contains one of the following:
         *                         1. A conventional http URL, e.g. 'http://...' or 'file://...'
         *                         2. A base64 string of in-line texture data, e.g. 'data:image/jpg;base64,/...'
         *                         3. An indicator that data being passed using the buffer parameter, e.g. 'data:mytexture.jpg'
         *
         * @param {boolean} noMipmap- When true, no mipmaps shall be generated.  Ignored for compressed textures.  They must be in the file.
         * @param {boolean} invertY- When true, image is flipped when loaded.  You probably want true. Ignored for compressed textures.  Must be flipped in the file.
         * @param {Scene} scene- Needed for loading to the correct scene.
         * @param {number} samplingMode- Mode with should be used sample / access the texture.  Default: TRILINEAR
         * @param {callback} onLoad- Optional callback to be called upon successful completion.
         * @param {callback} onError- Optional callback to be called upon failure.
         * @param {ArrayBuffer | HTMLImageElement} buffer- A source of a file previously fetched as either an ArrayBuffer (compressed or image format) or HTMLImageElement (image format)
         * @param {WebGLTexture} fallback- An internal argument in case the function must be called again, due to etc1 not having alpha capabilities.
         * @param {number} format-  Internal format.  Default: RGB when extension is '.jpg' else RGBA.  Ignored for compressed textures.
         *
         * @returns {WebGLTexture} for assignment back into BABYLON.Texture
         */
    native public WebGLTexture createTexture(String urlArg, Boolean noMipmap, Boolean invertY, Scene scene, double samplingMode);
    /**
         * Usually called from BABYLON.Texture.ts.  Passed information to create a WebGLTexture.
         * @param {string} urlArg- This contains one of the following:
         *                         1. A conventional http URL, e.g. 'http://...' or 'file://...'
         *                         2. A base64 string of in-line texture data, e.g. 'data:image/jpg;base64,/...'
         *                         3. An indicator that data being passed using the buffer parameter, e.g. 'data:mytexture.jpg'
         *
         * @param {boolean} noMipmap- When true, no mipmaps shall be generated.  Ignored for compressed textures.  They must be in the file.
         * @param {boolean} invertY- When true, image is flipped when loaded.  You probably want true. Ignored for compressed textures.  Must be flipped in the file.
         * @param {Scene} scene- Needed for loading to the correct scene.
         * @param {number} samplingMode- Mode with should be used sample / access the texture.  Default: TRILINEAR
         * @param {callback} onLoad- Optional callback to be called upon successful completion.
         * @param {callback} onError- Optional callback to be called upon failure.
         * @param {ArrayBuffer | HTMLImageElement} buffer- A source of a file previously fetched as either an ArrayBuffer (compressed or image format) or HTMLImageElement (image format)
         * @param {WebGLTexture} fallback- An internal argument in case the function must be called again, due to etc1 not having alpha capabilities.
         * @param {number} format-  Internal format.  Default: RGB when extension is '.jpg' else RGBA.  Ignored for compressed textures.
         *
         * @returns {WebGLTexture} for assignment back into BABYLON.Texture
         */
    native public WebGLTexture createTexture(String urlArg, Boolean noMipmap, Boolean invertY, Scene scene);
    native public void updateRawTexture(WebGLTexture texture, ArrayBufferView data, double format, Boolean invertY);
    native public WebGLTexture createRawTexture(ArrayBufferView data, double width, double height, double format, Boolean generateMipMaps, Boolean invertY, double samplingMode);
    native public void updateDynamicTexture(WebGLTexture texture, HTMLCanvasElement canvas, Boolean invertY, Boolean premulAlpha);
    native public void updateDynamicTexture(WebGLTexture texture, HTMLCanvasElement canvas, Boolean invertY);
    native public WebGLTexture createRenderTargetCubeTexture(double size);
    native public WebGLTexture createPrefilteredCubeTexture(String rootUrl, Scene scene, double scale, double offset, java.lang.Runnable onLoad, java.lang.Runnable onError);
    native public WebGLTexture createPrefilteredCubeTexture(String rootUrl, Scene scene, double scale, double offset, java.lang.Runnable onLoad);
    native public WebGLTexture createCubeTexture(String rootUrl, Scene scene, String[] files, Boolean noMipmap, java.util.function.Consumer<Object> onLoad, java.lang.Runnable onError);
    native public WebGLTexture createCubeTexture(String rootUrl, Scene scene, String[] files, Boolean noMipmap, java.util.function.Consumer<Object> onLoad);
    native public WebGLTexture createCubeTexture(String rootUrl, Scene scene, String[] files, Boolean noMipmap);
    native public WebGLTexture createCubeTexture(String rootUrl, Scene scene, String[] files);
    native public void updateRawCubeTexture(WebGLTexture texture, ArrayBufferView[] data, double format, double type, Boolean invertY, String compression);
    native public void updateRawCubeTexture(WebGLTexture texture, ArrayBufferView[] data, double format, double type, Boolean invertY);
    native public WebGLTexture createRawCubeTexture(ArrayBufferView[] data, double size, double format, double type, Boolean generateMipMaps, Boolean invertY, double samplingMode);
    native public WebGLTexture createRawCubeTextureFromUrl(String url, Scene scene, double size, double format, double type, Boolean noMipmap, java.util.function.Function<ArrayBuffer,ArrayBufferView[]> callback, java.util.function.Function<ArrayBufferView[],ArrayBufferView[][]> mipmmapGenerator, java.lang.Runnable onLoad, java.lang.Runnable onError, double samplingMode);
    native public WebGLTexture createRawCubeTextureFromUrl(String url, Scene scene, double size, double format, double type, Boolean noMipmap, java.util.function.Function<ArrayBuffer,ArrayBufferView[]> callback, java.util.function.Function<ArrayBufferView[],ArrayBufferView[][]> mipmmapGenerator, java.lang.Runnable onLoad, java.lang.Runnable onError);
    native public WebGLTexture createRawCubeTextureFromUrl(String url, Scene scene, double size, double format, double type, Boolean noMipmap, java.util.function.Function<ArrayBuffer,ArrayBufferView[]> callback, java.util.function.Function<ArrayBufferView[],ArrayBufferView[][]> mipmmapGenerator, java.lang.Runnable onLoad);
    native public WebGLTexture createRawCubeTextureFromUrl(String url, Scene scene, double size, double format, double type, Boolean noMipmap, java.util.function.Function<ArrayBuffer,ArrayBufferView[]> callback, java.util.function.Function<ArrayBufferView[],ArrayBufferView[][]> mipmmapGenerator);
    native public ArrayBufferView _readTexturePixels(WebGLTexture texture, double width, double height);
    native public WebGLTexture createCubeTexture(String rootUrl, Scene scene, String[] files, Boolean noMipmap, java.lang.Runnable onLoad, java.lang.Runnable onError, double format);
    native public WebGLTexture createCubeTexture(String rootUrl, Scene scene, String[] files, Boolean noMipmap, java.lang.Runnable onLoad, java.lang.Runnable onError);
    native public WebGLTexture createCubeTexture(String rootUrl, Scene scene, String[] files, Boolean noMipmap, java.lang.Runnable onLoad);
    native public WebGLBuffer createUniformBuffer(Float32Array elements);
    native public WebGLBuffer createDynamicUniformBuffer(Float32Array elements);
    native public void updateUniformBuffer(WebGLBuffer uniformBuffer, Float32Array elements, double offset, double count);
    native public WebGLBuffer createVertexBuffer(Float32Array vertices);
    native public WebGLBuffer createDynamicVertexBuffer(Float32Array vertices);
    native public void updateDynamicVertexBuffer(WebGLBuffer vertexBuffer, Float32Array vertices, double offset, double count);
    native public void updateAndBindInstancesBuffer(WebGLBuffer instancesBuffer, Float32Array data, InstancingAttributeInfo[] offsetLocations);
    native public Effect createEffect(Object baseName, EffectCreationOptions attributesNamesOrOptions, Engine uniformsNamesOrEngine, String[] samplers, String defines, EffectFallbacks fallbacks, java.util.function.Consumer<Effect> onCompiled, java.util.function.BiConsumer<Effect,String> onError, Object indexParameters);
    native public Effect createEffect(Object baseName, String[] attributesNamesOrOptions, Engine uniformsNamesOrEngine, String[] samplers, String defines, EffectFallbacks fallbacks, java.util.function.Consumer<Effect> onCompiled, java.util.function.BiConsumer<Effect,String> onError, Object indexParameters);
    native public Effect createEffect(Object baseName, EffectCreationOptions attributesNamesOrOptions, String[] uniformsNamesOrEngine, String[] samplers, String defines, EffectFallbacks fallbacks, java.util.function.Consumer<Effect> onCompiled, java.util.function.BiConsumer<Effect,String> onError, Object indexParameters);
    /**
         * Usually called from BABYLON.Texture.ts.  Passed information to create a WebGLTexture.
         * @param {string} urlArg- This contains one of the following:
         *                         1. A conventional http URL, e.g. 'http://...' or 'file://...'
         *                         2. A base64 string of in-line texture data, e.g. 'data:image/jpg;base64,/...'
         *                         3. An indicator that data being passed using the buffer parameter, e.g. 'data:mytexture.jpg'
         *
         * @param {boolean} noMipmap- When true, no mipmaps shall be generated.  Ignored for compressed textures.  They must be in the file.
         * @param {boolean} invertY- When true, image is flipped when loaded.  You probably want true. Ignored for compressed textures.  Must be flipped in the file.
         * @param {Scene} scene- Needed for loading to the correct scene.
         * @param {number} samplingMode- Mode with should be used sample / access the texture.  Default: TRILINEAR
         * @param {callback} onLoad- Optional callback to be called upon successful completion.
         * @param {callback} onError- Optional callback to be called upon failure.
         * @param {ArrayBuffer | HTMLImageElement} buffer- A source of a file previously fetched as either an ArrayBuffer (compressed or image format) or HTMLImageElement (image format)
         * @param {WebGLTexture} fallback- An internal argument in case the function must be called again, due to etc1 not having alpha capabilities.
         * @param {number} format-  Internal format.  Default: RGB when extension is '.jpg' else RGBA.  Ignored for compressed textures.
         *
         * @returns {WebGLTexture} for assignment back into BABYLON.Texture
         */
    native public WebGLTexture createTexture(String urlArg, Boolean noMipmap, Boolean invertY, Scene scene, double samplingMode, java.lang.Runnable onLoad, java.lang.Runnable onError, HTMLImageElement buffer, WebGLTexture fallBack, double format);
    native public void updateUniformBuffer(WebGLBuffer uniformBuffer, Float32Array elements, double offset);
    native public void updateUniformBuffer(WebGLBuffer uniformBuffer, Float32Array elements);
    native public void updateDynamicVertexBuffer(WebGLBuffer vertexBuffer, Float32Array vertices, double offset);
    native public void updateDynamicVertexBuffer(WebGLBuffer vertexBuffer, Float32Array vertices);
    native public Effect createEffect(Object baseName, EffectCreationOptions attributesNamesOrOptions, Engine uniformsNamesOrEngine, String[] samplers, String defines, EffectFallbacks fallbacks, java.util.function.Consumer<Effect> onCompiled, java.util.function.BiConsumer<Effect,String> onError);
    native public Effect createEffect(Object baseName, String[] attributesNamesOrOptions, Engine uniformsNamesOrEngine, String[] samplers, String defines, EffectFallbacks fallbacks, java.util.function.Consumer<Effect> onCompiled, java.util.function.BiConsumer<Effect,String> onError);
    native public Effect createEffect(Object baseName, EffectCreationOptions attributesNamesOrOptions, String[] uniformsNamesOrEngine, String[] samplers, String defines, EffectFallbacks fallbacks, java.util.function.Consumer<Effect> onCompiled, java.util.function.BiConsumer<Effect,String> onError);
    native public Effect createEffect(Object baseName, EffectCreationOptions attributesNamesOrOptions, Engine uniformsNamesOrEngine, String[] samplers, String defines, EffectFallbacks fallbacks, java.util.function.Consumer<Effect> onCompiled);
    native public Effect createEffect(Object baseName, String[] attributesNamesOrOptions, Engine uniformsNamesOrEngine, String[] samplers, String defines, EffectFallbacks fallbacks, java.util.function.Consumer<Effect> onCompiled);
    native public Effect createEffect(Object baseName, EffectCreationOptions attributesNamesOrOptions, String[] uniformsNamesOrEngine, String[] samplers, String defines, EffectFallbacks fallbacks, java.util.function.Consumer<Effect> onCompiled);
    native public Effect createEffect(Object baseName, EffectCreationOptions attributesNamesOrOptions, Engine uniformsNamesOrEngine, String[] samplers, String defines, EffectFallbacks fallbacks);
    native public Effect createEffect(Object baseName, EffectCreationOptions attributesNamesOrOptions, String[] uniformsNamesOrEngine, String[] samplers, String defines, EffectFallbacks fallbacks);
    native public Effect createEffect(Object baseName, String[] attributesNamesOrOptions, Engine uniformsNamesOrEngine, String[] samplers, String defines, EffectFallbacks fallbacks);
    native public Effect createEffect(Object baseName, EffectCreationOptions attributesNamesOrOptions, Engine uniformsNamesOrEngine, String[] samplers, String defines);
    native public Effect createEffect(Object baseName, String[] attributesNamesOrOptions, Engine uniformsNamesOrEngine, String[] samplers, String defines);
    native public Effect createEffect(Object baseName, EffectCreationOptions attributesNamesOrOptions, String[] uniformsNamesOrEngine, String[] samplers, String defines);
    native public Effect createEffect(Object baseName, String[] attributesNamesOrOptions, Engine uniformsNamesOrEngine, String[] samplers);
    native public Effect createEffect(Object baseName, EffectCreationOptions attributesNamesOrOptions, Engine uniformsNamesOrEngine, String[] samplers);
    native public Effect createEffect(Object baseName, EffectCreationOptions attributesNamesOrOptions, String[] uniformsNamesOrEngine, String[] samplers);
    native public Effect createEffect(Object baseName, String[] attributesNamesOrOptions, Engine uniformsNamesOrEngine);
    native public Effect createEffect(Object baseName, EffectCreationOptions attributesNamesOrOptions, Engine uniformsNamesOrEngine);
    native public Effect createEffect(Object baseName, EffectCreationOptions attributesNamesOrOptions, String[] uniformsNamesOrEngine);
    /**
         * Usually called from BABYLON.Texture.ts.  Passed information to create a WebGLTexture.
         * @param {string} urlArg- This contains one of the following:
         *                         1. A conventional http URL, e.g. 'http://...' or 'file://...'
         *                         2. A base64 string of in-line texture data, e.g. 'data:image/jpg;base64,/...'
         *                         3. An indicator that data being passed using the buffer parameter, e.g. 'data:mytexture.jpg'
         *
         * @param {boolean} noMipmap- When true, no mipmaps shall be generated.  Ignored for compressed textures.  They must be in the file.
         * @param {boolean} invertY- When true, image is flipped when loaded.  You probably want true. Ignored for compressed textures.  Must be flipped in the file.
         * @param {Scene} scene- Needed for loading to the correct scene.
         * @param {number} samplingMode- Mode with should be used sample / access the texture.  Default: TRILINEAR
         * @param {callback} onLoad- Optional callback to be called upon successful completion.
         * @param {callback} onError- Optional callback to be called upon failure.
         * @param {ArrayBuffer | HTMLImageElement} buffer- A source of a file previously fetched as either an ArrayBuffer (compressed or image format) or HTMLImageElement (image format)
         * @param {WebGLTexture} fallback- An internal argument in case the function must be called again, due to etc1 not having alpha capabilities.
         * @param {number} format-  Internal format.  Default: RGB when extension is '.jpg' else RGBA.  Ignored for compressed textures.
         *
         * @returns {WebGLTexture} for assignment back into BABYLON.Texture
         */
    native public WebGLTexture createTexture(String urlArg, Boolean noMipmap, Boolean invertY, Scene scene, double samplingMode, java.lang.Runnable onLoad, java.lang.Runnable onError, HTMLImageElement buffer, WebGLTexture fallBack);
    /**
         * Usually called from BABYLON.Texture.ts.  Passed information to create a WebGLTexture.
         * @param {string} urlArg- This contains one of the following:
         *                         1. A conventional http URL, e.g. 'http://...' or 'file://...'
         *                         2. A base64 string of in-line texture data, e.g. 'data:image/jpg;base64,/...'
         *                         3. An indicator that data being passed using the buffer parameter, e.g. 'data:mytexture.jpg'
         *
         * @param {boolean} noMipmap- When true, no mipmaps shall be generated.  Ignored for compressed textures.  They must be in the file.
         * @param {boolean} invertY- When true, image is flipped when loaded.  You probably want true. Ignored for compressed textures.  Must be flipped in the file.
         * @param {Scene} scene- Needed for loading to the correct scene.
         * @param {number} samplingMode- Mode with should be used sample / access the texture.  Default: TRILINEAR
         * @param {callback} onLoad- Optional callback to be called upon successful completion.
         * @param {callback} onError- Optional callback to be called upon failure.
         * @param {ArrayBuffer | HTMLImageElement} buffer- A source of a file previously fetched as either an ArrayBuffer (compressed or image format) or HTMLImageElement (image format)
         * @param {WebGLTexture} fallback- An internal argument in case the function must be called again, due to etc1 not having alpha capabilities.
         * @param {number} format-  Internal format.  Default: RGB when extension is '.jpg' else RGBA.  Ignored for compressed textures.
         *
         * @returns {WebGLTexture} for assignment back into BABYLON.Texture
         */
    native public WebGLTexture createTexture(String urlArg, Boolean noMipmap, Boolean invertY, Scene scene, double samplingMode, java.lang.Runnable onLoad, java.lang.Runnable onError, HTMLImageElement buffer);
    /**
         * Set the compressed texture format to use, based on the formats you have, and the formats
         * supported by the hardware / browser.
         *
         * Khronos Texture Container (.ktx) files are used to support this.  This format has the
         * advantage of being specifically designed for OpenGL.  Header elements directly correspond
         * to API arguments needed to compressed textures.  This puts the burden on the container
         * generator to house the arcane code for determining these for current & future formats.
         *
         * for description see https://www.khronos.org/opengles/sdk/tools/KTX/
         * for file layout see https://www.khronos.org/opengles/sdk/tools/KTX/file_format_spec/
         *
         * Note: The result of this call is not taken into account when a texture is base64.
         *
         * @param {Array<string>} formatsAvailable- The list of those format families you have created
         * on your server.  Syntax: '-' + format family + '.ktx'.  (Case and order do not matter.)
         *
         * Current families are astc, dxt, pvrtc, etc2, & etc1.
         * @returns The extension selected.
         */
    native public String setTextureFormatToUse(String[] formatsAvailable);
    protected Engine(){}
}

