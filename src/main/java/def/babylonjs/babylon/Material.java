package def.babylonjs.babylon;
public class Material extends def.js.Object {
    public static final double TriangleFillMode=0;
    public static final double WireFrameFillMode=0;
    public static final double PointFillMode=0;
    public static final double ClockWiseSideOrientation=0;
    public static final double CounterClockWiseSideOrientation=0;
    public static final double TextureDirtyFlag=0;
    public static final double LightDirtyFlag=0;
    public static final double FresnelDirtyFlag=0;
    public static final double AttributesDirtyFlag=0;
    public static final double MiscDirtyFlag=0;
    public String id;
    public String name;
    public Boolean checkReadyOnEveryCall;
    public Boolean checkReadyOnlyOnce;
    public String state;
    public double alpha;
    public Boolean _backFaceCulling;
    public Boolean backFaceCulling;
    public double sideOrientation;
    public java.util.function.Consumer<Effect> onCompiled;
    public java.util.function.BiConsumer<Effect,String> onError;
    public java.util.function.Supplier<SmartArray<RenderTargetTexture>> getRenderTargetTextures;
    public Boolean doNotSerialize;
    public Boolean storeEffectOnSubMeshes;
    /**
        * An event triggered when the material is disposed.
        * @type {BABYLON.Observable}
        */
    public Observable<Material> onDisposeObservable;
    public java.lang.Runnable onDispose;
    /**
        * An event triggered when the material is bound.
        * @type {BABYLON.Observable}
        */
    public Observable<AbstractMesh> onBindObservable;
    public java.util.function.Consumer<AbstractMesh> onBind;
    /**
        * An event triggered when the material is unbound.
        * @type {BABYLON.Observable}
        */
    public Observable<Material> onUnBindObservable;
    public double alphaMode;
    public Boolean disableDepthWrite;
    public Boolean fogEnabled;
    public double pointSize;
    public double zOffset;
    public Boolean wireframe;
    public Boolean pointsCloud;
    public double fillMode;
    public Effect _effect;
    public Boolean _wasPreviouslyReady;
    public UniformBuffer _uniformBuffer;
    public Material(String name, Scene scene, Boolean doNotAdd){}
    /**
         * @param {boolean} fullDetails - support for multiple levels of logging within scene loading
         * subclasses should override adding information pertainent to themselves
         */
    native public String toString(Boolean fullDetails);
    /**
         * Child classes can use it to update shaders
         */
    native public String getClassName();
    public final Boolean isFrozen=null;
    native public void freeze();
    native public void unfreeze();
    native public Boolean isReady(AbstractMesh mesh, Boolean useInstances);
    native public Boolean isReadyForSubMesh(AbstractMesh mesh, BaseSubMesh subMesh, Boolean useInstances);
    native public Effect getEffect();
    native public Scene getScene();
    native public Boolean needAlphaBlending();
    native public Boolean needAlphaTesting();
    native public BaseTexture getAlphaTestTexture();
    native public void markDirty();
    native public void _preBind(Effect effect);
    native public void bind(Matrix world, Mesh mesh);
    native public void bindForSubMesh(Matrix world, Mesh mesh, SubMesh subMesh);
    native public void bindOnlyWorldMatrix(Matrix world);
    native public void bindSceneUniformBuffer(Effect effect, UniformBuffer sceneUbo);
    native public void bindView(Effect effect);
    native public void bindViewProjection(Effect effect);
    native public void _afterBind(Mesh mesh);
    native public void unbind();
    native public BaseTexture[] getActiveTextures();
    native public Boolean hasTexture(BaseTexture texture);
    native public Material clone(String name);
    native public AbstractMesh[] getBindedMeshes();
    native public void forceCompilation(AbstractMesh mesh, java.util.function.Consumer<Material> onCompiled, Options options);
    native public void markAsDirty(double flag);
    native public void _markAllSubMeshesAsDirty(java.util.function.Consumer<MaterialDefines> func);
    native public void _markAllSubMeshesAsImageProcessingDirty();
    native public void _markAllSubMeshesAsTexturesDirty();
    native public void _markAllSubMeshesAsFresnelDirty();
    native public void _markAllSubMeshesAsLightsDirty();
    native public void _markAllSubMeshesAsAttributesDirty();
    native public void _markAllSubMeshesAsMiscDirty();
    native public void dispose(Boolean forceDisposeEffect, Boolean forceDisposeTextures);
    native public Object serialize();
    native public static MultiMaterial ParseMultiMaterial(Object parsedMultiMaterial, Scene scene);
    native public static Object Parse(Object parsedMaterial, Scene scene, String rootUrl);
    /** This is an automatically generated object type (see the source definition). */
    @jsweet.lang.ObjectType
    public static class Options extends def.js.Object {
        public Boolean alphaTest;
    }
    public Material(String name, Scene scene){}
    /**
         * @param {boolean} fullDetails - support for multiple levels of logging within scene loading
         * subclasses should override adding information pertainent to themselves
         */
    native public String toString();
    native public Boolean isReady(AbstractMesh mesh);
    native public Boolean isReady();
    native public Boolean isReadyForSubMesh(AbstractMesh mesh, BaseSubMesh subMesh);
    native public void _preBind();
    native public void bind(Matrix world);
    native public void forceCompilation(AbstractMesh mesh, java.util.function.Consumer<Material> onCompiled);
    native public void dispose(Boolean forceDisposeEffect);
    native public void dispose();
    protected Material(){}
}

