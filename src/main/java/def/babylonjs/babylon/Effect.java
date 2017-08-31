package def.babylonjs.babylon;
import def.dom.WebGLProgram;
import def.dom.WebGLUniformLocation;
import def.js.Float32Array;
import def.js.Int32Array;
import def.dom.WebGLBuffer;
import def.dom.WebGLTexture;
public class Effect extends def.js.Object {
    public Object name;
    public String defines;
    public java.util.function.Consumer<Effect> onCompiled;
    public java.util.function.BiConsumer<Effect,String> onError;
    public java.util.function.Consumer<Effect> onBind;
    public double uniqueId;
    public Observable<Effect> onCompileObservable;
    public Observable<Effect> onErrorObservable;
    public Observable<Effect> onBindObservable;
    public String _key;
    public Effect(Object baseName, String[] attributesNamesOrOptions, String[] uniformsNamesOrEngine, String[] samplers, Engine engine, String defines, EffectFallbacks fallbacks, java.util.function.Consumer<Effect> onCompiled, java.util.function.BiConsumer<Effect,String> onError, Object indexParameters){}
    public final String key=null;
    native public Boolean isReady();
    native public Engine getEngine();
    native public WebGLProgram getProgram();
    native public String[] getAttributesNames();
    native public double getAttributeLocation(double index);
    native public double getAttributeLocationByName(String name);
    native public double getAttributesCount();
    native public double getUniformIndex(String uniformName);
    native public WebGLUniformLocation getUniform(String uniformName);
    native public String[] getSamplers();
    native public String getCompilationError();
    native public String getVertexShaderSource();
    native public String getFragmentShaderSource();
    native public void executeWhenCompiled(java.util.function.Consumer<Effect> func);
    native public void _loadVertexShader(Object vertex, java.util.function.Consumer<Object> callback);
    native public void _loadFragmentShader(Object fragment, java.util.function.Consumer<Object> callback);
    public final Boolean isSupported=null;
    native public void _bindTexture(String channel, WebGLTexture texture);
    native public void setTexture(String channel, BaseTexture texture);
    native public void setTextureArray(String channel, BaseTexture[] textures);
    native public void setTextureFromPostProcess(String channel, PostProcess postProcess);
    native public Boolean _cacheMatrix(String uniformName, Matrix matrix);
    native public Boolean _cacheFloat2(String uniformName, double x, double y);
    native public Boolean _cacheFloat3(String uniformName, double x, double y, double z);
    native public Boolean _cacheFloat4(String uniformName, double x, double y, double z, double w);
    native public void bindUniformBuffer(WebGLBuffer buffer, String name);
    native public void bindUniformBlock(String blockName, double index);
    native public Effect setIntArray(String uniformName, Int32Array array);
    native public Effect setIntArray2(String uniformName, Int32Array array);
    native public Effect setIntArray3(String uniformName, Int32Array array);
    native public Effect setIntArray4(String uniformName, Int32Array array);
    native public Effect setFloatArray(String uniformName, Float32Array array);
    native public Effect setFloatArray2(String uniformName, Float32Array array);
    native public Effect setFloatArray3(String uniformName, Float32Array array);
    native public Effect setFloatArray4(String uniformName, Float32Array array);
    native public Effect setArray(String uniformName, double[] array);
    native public Effect setArray2(String uniformName, double[] array);
    native public Effect setArray3(String uniformName, double[] array);
    native public Effect setArray4(String uniformName, double[] array);
    native public Effect setMatrices(String uniformName, Float32Array matrices);
    native public Effect setMatrix(String uniformName, Matrix matrix);
    native public Effect setMatrix3x3(String uniformName, Float32Array matrix);
    native public Effect setMatrix2x2(String uniformName, Float32Array matrix);
    native public Effect setFloat(String uniformName, double value);
    native public Effect setBool(String uniformName, Boolean bool);
    native public Effect setVector2(String uniformName, Vector2 vector2);
    native public Effect setFloat2(String uniformName, double x, double y);
    native public Effect setVector3(String uniformName, Vector3 vector3);
    native public Effect setFloat3(String uniformName, double x, double y, double z);
    native public Effect setVector4(String uniformName, Vector4 vector4);
    native public Effect setFloat4(String uniformName, double x, double y, double z, double w);
    native public Effect setColor3(String uniformName, Color3 color3);
    native public Effect setColor4(String uniformName, Color3 color3, double alpha);
    public static java.lang.Object ShadersStore;
    public static java.lang.Object IncludesShadersStore;
    public Effect(Object baseName, String[] attributesNamesOrOptions, String[] uniformsNamesOrEngine, String[] samplers, Engine engine, String defines, EffectFallbacks fallbacks, java.util.function.Consumer<Effect> onCompiled, java.util.function.BiConsumer<Effect,String> onError){}
    public Effect(Object baseName, String[] attributesNamesOrOptions, String[] uniformsNamesOrEngine, String[] samplers, Engine engine, String defines, EffectFallbacks fallbacks, java.util.function.Consumer<Effect> onCompiled){}
    public Effect(Object baseName, String[] attributesNamesOrOptions, String[] uniformsNamesOrEngine, String[] samplers, Engine engine, String defines, EffectFallbacks fallbacks){}
    public Effect(Object baseName, String[] attributesNamesOrOptions, String[] uniformsNamesOrEngine, String[] samplers, Engine engine, String defines){}
    public Effect(Object baseName, String[] attributesNamesOrOptions, String[] uniformsNamesOrEngine, String[] samplers, Engine engine){}
    public Effect(Object baseName, String[] attributesNamesOrOptions, String[] uniformsNamesOrEngine, String[] samplers){}
    public Effect(Object baseName, String[] attributesNamesOrOptions, String[] uniformsNamesOrEngine){}
    public Effect(Object baseName, String[] attributesNamesOrOptions, Engine uniformsNamesOrEngine, String[] samplers, Engine engine, String defines, EffectFallbacks fallbacks, java.util.function.Consumer<Effect> onCompiled, java.util.function.BiConsumer<Effect,String> onError, Object indexParameters){}
    public Effect(Object baseName, EffectCreationOptions attributesNamesOrOptions, String[] uniformsNamesOrEngine, String[] samplers, Engine engine, String defines, EffectFallbacks fallbacks, java.util.function.Consumer<Effect> onCompiled, java.util.function.BiConsumer<Effect,String> onError, Object indexParameters){}
    public Effect(Object baseName, EffectCreationOptions attributesNamesOrOptions, Engine uniformsNamesOrEngine, String[] samplers, Engine engine, String defines, EffectFallbacks fallbacks, java.util.function.Consumer<Effect> onCompiled, java.util.function.BiConsumer<Effect,String> onError, Object indexParameters){}
    public Effect(Object baseName, String[] attributesNamesOrOptions, Engine uniformsNamesOrEngine, String[] samplers, Engine engine, String defines, EffectFallbacks fallbacks, java.util.function.Consumer<Effect> onCompiled, java.util.function.BiConsumer<Effect,String> onError){}
    public Effect(Object baseName, EffectCreationOptions attributesNamesOrOptions, Engine uniformsNamesOrEngine, String[] samplers, Engine engine, String defines, EffectFallbacks fallbacks, java.util.function.Consumer<Effect> onCompiled, java.util.function.BiConsumer<Effect,String> onError){}
    public Effect(Object baseName, EffectCreationOptions attributesNamesOrOptions, String[] uniformsNamesOrEngine, String[] samplers, Engine engine, String defines, EffectFallbacks fallbacks, java.util.function.Consumer<Effect> onCompiled, java.util.function.BiConsumer<Effect,String> onError){}
    public Effect(Object baseName, EffectCreationOptions attributesNamesOrOptions, Engine uniformsNamesOrEngine, String[] samplers, Engine engine, String defines, EffectFallbacks fallbacks, java.util.function.Consumer<Effect> onCompiled){}
    public Effect(Object baseName, EffectCreationOptions attributesNamesOrOptions, String[] uniformsNamesOrEngine, String[] samplers, Engine engine, String defines, EffectFallbacks fallbacks, java.util.function.Consumer<Effect> onCompiled){}
    public Effect(Object baseName, String[] attributesNamesOrOptions, Engine uniformsNamesOrEngine, String[] samplers, Engine engine, String defines, EffectFallbacks fallbacks, java.util.function.Consumer<Effect> onCompiled){}
    public Effect(Object baseName, EffectCreationOptions attributesNamesOrOptions, Engine uniformsNamesOrEngine, String[] samplers, Engine engine, String defines, EffectFallbacks fallbacks){}
    public Effect(Object baseName, EffectCreationOptions attributesNamesOrOptions, String[] uniformsNamesOrEngine, String[] samplers, Engine engine, String defines, EffectFallbacks fallbacks){}
    public Effect(Object baseName, String[] attributesNamesOrOptions, Engine uniformsNamesOrEngine, String[] samplers, Engine engine, String defines, EffectFallbacks fallbacks){}
    public Effect(Object baseName, EffectCreationOptions attributesNamesOrOptions, Engine uniformsNamesOrEngine, String[] samplers, Engine engine, String defines){}
    public Effect(Object baseName, EffectCreationOptions attributesNamesOrOptions, String[] uniformsNamesOrEngine, String[] samplers, Engine engine, String defines){}
    public Effect(Object baseName, String[] attributesNamesOrOptions, Engine uniformsNamesOrEngine, String[] samplers, Engine engine, String defines){}
    public Effect(Object baseName, EffectCreationOptions attributesNamesOrOptions, Engine uniformsNamesOrEngine, String[] samplers, Engine engine){}
    public Effect(Object baseName, EffectCreationOptions attributesNamesOrOptions, String[] uniformsNamesOrEngine, String[] samplers, Engine engine){}
    public Effect(Object baseName, String[] attributesNamesOrOptions, Engine uniformsNamesOrEngine, String[] samplers, Engine engine){}
    public Effect(Object baseName, EffectCreationOptions attributesNamesOrOptions, String[] uniformsNamesOrEngine, String[] samplers){}
    public Effect(Object baseName, EffectCreationOptions attributesNamesOrOptions, Engine uniformsNamesOrEngine, String[] samplers){}
    public Effect(Object baseName, String[] attributesNamesOrOptions, Engine uniformsNamesOrEngine, String[] samplers){}
    public Effect(Object baseName, EffectCreationOptions attributesNamesOrOptions, Engine uniformsNamesOrEngine){}
    public Effect(Object baseName, EffectCreationOptions attributesNamesOrOptions, String[] uniformsNamesOrEngine){}
    public Effect(Object baseName, String[] attributesNamesOrOptions, Engine uniformsNamesOrEngine){}
    protected Effect(){}
}

