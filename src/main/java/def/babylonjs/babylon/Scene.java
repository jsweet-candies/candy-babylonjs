package def.babylonjs.babylon;
import def.js.Array;
import def.dom.PointerEvent;
/**
     * Represents a scene to be rendered by the engine.
     * @see http://doc.babylonjs.com/page.php?p=21911
     */
public class Scene extends IAnimatable {
    public static double MinDeltaTime;
    public static double MaxDeltaTime;
    public static final double FOGMODE_NONE=0;
    public static final double FOGMODE_EXP=0;
    public static final double FOGMODE_EXP2=0;
    public static final double FOGMODE_LINEAR=0;
    public Boolean autoClear;
    public Boolean autoClearDepthAndStencil;
    public Color4 clearColor;
    public Color3 ambientColor;
    public BaseTexture _environmentBRDFTexture;
    public BaseTexture _environmentTexture;
    /**
         * Texture used in all pbr material as the reflection texture.
         * As in the majority of the scene they are the same (exception for multi room and so on),
         * this is easier to set here than in all the materials.
         */
    public BaseTexture environmentTexture;
    public ImageProcessingConfiguration _imageProcessingConfiguration;
    /**
         * Default image processing configuration used either in the rendering
         * Forward main pass or through the imageProcessingPostProcess if present.
         * As in the majority of the scene they are the same (exception for multi camera),
         * this is easier to reference from here than from all the materials and post process.
         *
         * No setter as we it is a shared configuration, you can set the values instead.
         */
    public final ImageProcessingConfiguration imageProcessingConfiguration=null;
    public Boolean forceWireframe;
    public Boolean forcePointsCloud;
    public Boolean forceShowBoundingBoxes;
    public Plane clipPlane;
    public Boolean animationsEnabled;
    public Boolean constantlyUpdateMeshUnderPointer;
    public String hoverCursor;
    public Object metadata;
    /**
        * An event triggered when the scene is disposed.
        * @type {BABYLON.Observable}
        */
    public Observable<Scene> onDisposeObservable;
    public java.lang.Runnable onDispose;
    /**
        * An event triggered before rendering the scene
        * @type {BABYLON.Observable}
        */
    public Observable<Scene> onBeforeRenderObservable;
    public java.lang.Runnable beforeRender;
    /**
        * An event triggered after rendering the scene
        * @type {BABYLON.Observable}
        */
    public Observable<Scene> onAfterRenderObservable;
    public java.lang.Runnable afterRender;
    /**
        * An event triggered when the scene is ready
        * @type {BABYLON.Observable}
        */
    public Observable<Scene> onReadyObservable;
    /**
        * An event triggered before rendering a camera
        * @type {BABYLON.Observable}
        */
    public Observable<Camera> onBeforeCameraRenderObservable;
    public java.lang.Runnable beforeCameraRender;
    /**
        * An event triggered after rendering a camera
        * @type {BABYLON.Observable}
        */
    public Observable<Camera> onAfterCameraRenderObservable;
    public java.lang.Runnable afterCameraRender;
    /**
        * An event triggered when a camera is created
        * @type {BABYLON.Observable}
        */
    public Observable<Camera> onNewCameraAddedObservable;
    /**
        * An event triggered when a camera is removed
        * @type {BABYLON.Observable}
        */
    public Observable<Camera> onCameraRemovedObservable;
    /**
        * An event triggered when a light is created
        * @type {BABYLON.Observable}
        */
    public Observable<Light> onNewLightAddedObservable;
    /**
        * An event triggered when a light is removed
        * @type {BABYLON.Observable}
        */
    public Observable<Light> onLightRemovedObservable;
    /**
        * An event triggered when a geometry is created
        * @type {BABYLON.Observable}
        */
    public Observable<Geometry> onNewGeometryAddedObservable;
    /**
        * An event triggered when a geometry is removed
        * @type {BABYLON.Observable}
        */
    public Observable<Geometry> onGeometryRemovedObservable;
    /**
        * An event triggered when a mesh is created
        * @type {BABYLON.Observable}
        */
    public Observable<AbstractMesh> onNewMeshAddedObservable;
    /**
        * An event triggered when a mesh is removed
        * @type {BABYLON.Observable}
        */
    public Observable<AbstractMesh> onMeshRemovedObservable;
    /**
         * This Observable will be triggered for each stage of each renderingGroup of each rendered camera.
         * The RenderinGroupInfo class contains all the information about the context in which the observable is called
         * If you wish to register an Observer only for a given set of renderingGroup, use the mask with a combination of the renderingGroup index elevated to the power of two (1 for renderingGroup 0, 2 for renderingrOup1, 4 for 2 and 8 for 3)
         */
    public Observable<RenderingGroupInfo> onRenderingGroupObservable;
    public Animation[] animations;
    public java.util.function.Function<AbstractMesh,Boolean> pointerDownPredicate;
    public java.util.function.Function<AbstractMesh,Boolean> pointerUpPredicate;
    public java.util.function.Function<AbstractMesh,Boolean> pointerMovePredicate;
    public java.util.function.BiConsumer<PointerEvent,PickingInfo> onPointerMove;
    public java.util.function.BiConsumer<PointerEvent,PickingInfo> onPointerDown;
    public java.util.function.BiConsumer<PointerEvent,PickingInfo> onPointerUp;
    public java.util.function.BiConsumer<PointerEvent,PickingInfo> onPointerPick;
    /**
         * This observable event is triggered when any mouse event registered during Scene.attach() is called BEFORE the 3D engine to process anything (mesh/sprite picking for instance).
         * You have the possibility to skip the 3D Engine process and the call to onPointerObservable by setting PointerInfoBase.skipOnPointerObservable to true
         */
    public Observable<PointerInfoPre> onPrePointerObservable;
    /**
         * Observable event triggered each time an input event is received from the rendering canvas
         */
    public Observable<PointerInfo> onPointerObservable;
    public final Vector2 unTranslatedPointer=null;
    public static double DragMovementThreshold;
    public static double LongPressDelay;
    public static double DoubleClickDelay;
    public static Boolean ExclusiveDoubleClickMode;
    public Camera cameraToUseForPointers;
    public Vector3 _mirroredCameraPosition;
    public Boolean useRightHandedSystem;
    public Boolean fogEnabled;
    public double fogMode;
    public Color3 fogColor;
    public double fogDensity;
    public double fogStart;
    public double fogEnd;
    public Boolean shadowsEnabled;
    public Boolean lightsEnabled;
    /**
        * All of the lights added to this scene.
        * @see BABYLON.Light
        * @type {BABYLON.Light[]}
        */
    public Light[] lights;
    /**
        * All of the cameras added to this scene.
        * @see BABYLON.Camera
        * @type {BABYLON.Camera[]}
        */
    public Camera[] cameras;
    public Camera[] activeCameras;
    public Camera activeCamera;
    /**
        * All of the (abstract) meshes added to this scene.
        * @see BABYLON.AbstractMesh
        * @type {BABYLON.AbstractMesh[]}
        */
    public AbstractMesh[] meshes;
    public Material[] materials;
    public MultiMaterial[] multiMaterials;
    public Material defaultMaterial;
    public Boolean texturesEnabled;
    public BaseTexture[] textures;
    public Boolean particlesEnabled;
    public ParticleSystem[] particleSystems;
    public Boolean spritesEnabled;
    public SpriteManager[] spriteManagers;
    public Layer[] layers;
    public HighlightLayer[] highlightLayers;
    public Boolean skeletonsEnabled;
    public Skeleton[] skeletons;
    public MorphTargetManager[] morphTargetManagers;
    public Boolean lensFlaresEnabled;
    public LensFlareSystem[] lensFlareSystems;
    public Boolean collisionsEnabled;
    public ICollisionCoordinator collisionCoordinator;
    public Vector3 gravity;
    public Boolean postProcessesEnabled;
    public PostProcessManager postProcessManager;
    public final PostProcessRenderPipelineManager postProcessRenderPipelineManager=null;
    public Boolean renderTargetsEnabled;
    public Boolean dumpNextRenderTargets;
    public RenderTargetTexture[] customRenderTargets;
    public Boolean useDelayedTextureLoading;
    public String[] importedMeshesFiles;
    public Boolean probesEnabled;
    public ReflectionProbe[] reflectionProbes;
    public Object database;
    /**
         * This scene's action manager
         * @type {BABYLON.ActionManager}
        */
    public ActionManager actionManager;
    public ActionManager[] _actionManagers;
    public Boolean proceduralTexturesEnabled;
    public ProceduralTexture[] _proceduralTextures;
    public SoundTrack mainSoundTrack;
    public SoundTrack[] soundTracks;
    public SimplificationQueue simplificationQueue;
    public PerfCounter _activeIndices;
    public PerfCounter _activeParticles;
    public PerfCounter _particlesDuration;
    public PerfCounter _spritesDuration;
    public PerfCounter _activeBones;
    public double animationTimeScale;
    public Material _cachedMaterial;
    public Effect _cachedEffect;
    public double _cachedVisibility;
    public SmartArray<IDisposable> _toBeDisposed;
    public SmartArray<ParticleSystem> _activeParticleSystems;
    public Animatable[] _activeAnimatables;
    public final Plane[] frustumPlanes=null;
    public Boolean requireLightSorting;
    /**
         * @constructor
         * @param {BABYLON.Engine} engine - the engine to be used to render this scene.
         */
    public Scene(Engine engine){}
    public final DebugLayer debugLayer=null;
    public Boolean workerCollisions;
    public final Octree<AbstractMesh> selectionOctree=null;
    /**
         * The mesh that is currently under the pointer.
         * @return {BABYLON.AbstractMesh} mesh under the pointer/mouse cursor or null if none.
         */
    public final AbstractMesh meshUnderPointer=null;
    /**
         * Current on-screen X position of the pointer
         * @return {number} X position of the pointer
         */
    public final double pointerX=0;
    /**
         * Current on-screen Y position of the pointer
         * @return {number} Y position of the pointer
         */
    public final double pointerY=0;
    native public Material getCachedMaterial();
    native public Effect getCachedEffect();
    native public double getCachedVisibility();
    native public Boolean isCachedMaterialValid(Material material, Effect effect, double visibility);
    native public BoundingBoxRenderer getBoundingBoxRenderer();
    native public OutlineRenderer getOutlineRenderer();
    native public Engine getEngine();
    native public double getTotalVertices();
    public final PerfCounter totalVerticesPerfCounter=null;
    native public double getActiveIndices();
    public final PerfCounter totalActiveIndicesPerfCounter=null;
    native public double getActiveParticles();
    public final PerfCounter activeParticlesPerfCounter=null;
    native public double getActiveBones();
    public final PerfCounter activeBonesPerfCounter=null;
    native public double getLastFrameDuration();
    public final PerfCounter lastFramePerfCounter=null;
    native public double getEvaluateActiveMeshesDuration();
    public final PerfCounter evaluateActiveMeshesDurationPerfCounter=null;
    native public SmartArray<Mesh> getActiveMeshes();
    native public double getRenderTargetsDuration();
    native public double getRenderDuration();
    public final PerfCounter renderDurationPerfCounter=null;
    native public double getParticlesDuration();
    public final PerfCounter particlesDurationPerfCounter=null;
    native public double getSpritesDuration();
    public final PerfCounter spriteDuractionPerfCounter=null;
    native public double getAnimationRatio();
    native public double getRenderId();
    native public void incrementRenderId();
    /**
        * Attach events to the canvas (To handle actionManagers triggers and raise onPointerMove, onPointerDown and onPointerUp
        * @param attachUp defines if you want to attach events to pointerup
        * @param attachDown defines if you want to attach events to pointerdown
        * @param attachMove defines if you want to attach events to pointermove
        */
    native public void attachControl(Boolean attachUp, Boolean attachDown, Boolean attachMove);
    native public void detachControl();
    native public Boolean isReady();
    native public void resetCachedMaterial();
    native public void registerBeforeRender(java.lang.Runnable func);
    native public void unregisterBeforeRender(java.lang.Runnable func);
    native public void registerAfterRender(java.lang.Runnable func);
    native public void unregisterAfterRender(java.lang.Runnable func);
    native public void _addPendingData(Object data);
    native public void _removePendingData(Object data);
    native public double getWaitingItemsCount();
    /**
         * Registers a function to be executed when the scene is ready.
         * @param {Function} func - the function to be executed.
         */
    native public void executeWhenReady(java.lang.Runnable func);
    native public void _checkIsReady();
    /**
         * Will start the animation sequence of a given target
         * @param target - the target
         * @param {number} from - from which frame should animation start
         * @param {number} to - till which frame should animation run.
         * @param {boolean} [loop] - should the animation loop
         * @param {number} [speedRatio] - the speed in which to run the animation
         * @param {Function} [onAnimationEnd] function to be executed when the animation ended.
         * @param {BABYLON.Animatable} [animatable] an animatable object. If not provided a new one will be created from the given params.
         * @return {BABYLON.Animatable} the animatable object created for this animation
         * @see BABYLON.Animatable
         * @see http://doc.babylonjs.com/page.php?p=22081
         */
    native public Animatable beginAnimation(Object target, double from, double to, Boolean loop, double speedRatio, java.lang.Runnable onAnimationEnd, Animatable animatable);
    native public Animatable beginDirectAnimation(Object target, Animation[] animations, double from, double to, Boolean loop, double speedRatio, java.lang.Runnable onAnimationEnd);
    native public Animatable getAnimatableByTarget(Object target);
    public final Animatable[] Animatables=null;
    /**
         * Will stop the animation of the given target
         * @param target - the target
         * @param animationName - the name of the animation to stop (all animations will be stopped is empty)
         * @see beginAnimation
         */
    native public void stopAnimation(Object target, String animationName);
    native public Matrix getViewMatrix();
    native public Matrix getProjectionMatrix();
    native public Matrix getTransformMatrix();
    native public void setTransformMatrix(Matrix view, Matrix projection);
    native public UniformBuffer getSceneUniformBuffer();
    native public double getUniqueId();
    native public void addMesh(AbstractMesh newMesh);
    native public double removeMesh(AbstractMesh toRemove);
    native public double removeSkeleton(Skeleton toRemove);
    native public double removeMorphTargetManager(MorphTargetManager toRemove);
    native public double removeLight(Light toRemove);
    native public double removeCamera(Camera toRemove);
    native public void addLight(Light newLight);
    native public void sortLightsByPriority();
    native public void addCamera(Camera newCamera);
    /**
         * Switch active camera
         * @param {Camera} newCamera - new active camera
         * @param {boolean} attachControl - call attachControl for the new active camera (default: true)
         */
    native public void switchActiveCamera(Camera newCamera, Boolean attachControl);
    /**
         * sets the active camera of the scene using its ID
         * @param {string} id - the camera's ID
         * @return {BABYLON.Camera|null} the new active camera or null if none found.
         * @see activeCamera
         */
    native public Camera setActiveCameraByID(String id);
    /**
         * sets the active camera of the scene using its name
         * @param {string} name - the camera's name
         * @return {BABYLON.Camera|null} the new active camera or null if none found.
         * @see activeCamera
         */
    native public Camera setActiveCameraByName(String name);
    /**
         * get a material using its id
         * @param {string} the material's ID
         * @return {BABYLON.Material|null} the material or null if none found.
         */
    native public Material getMaterialByID(String id);
    /**
         * get a material using its name
         * @param {string} the material's name
         * @return {BABYLON.Material|null} the material or null if none found.
         */
    native public Material getMaterialByName(String name);
    native public LensFlareSystem getLensFlareSystemByName(String name);
    native public LensFlareSystem getLensFlareSystemByID(String id);
    native public Camera getCameraByID(String id);
    native public Camera getCameraByUniqueID(double uniqueId);
    /**
         * get a camera using its name
         * @param {string} the camera's name
         * @return {BABYLON.Camera|null} the camera or null if none found.
         */
    native public Camera getCameraByName(String name);
    /**
         * get a bone using its id
         * @param {string} the bone's id
         * @return {BABYLON.Bone|null} the bone or null if not found
         */
    native public Bone getBoneByID(String id);
    /**
        * get a bone using its id
        * @param {string} the bone's name
        * @return {BABYLON.Bone|null} the bone or null if not found
        */
    native public Bone getBoneByName(String name);
    /**
         * get a light node using its name
         * @param {string} the light's name
         * @return {BABYLON.Light|null} the light or null if none found.
         */
    native public Light getLightByName(String name);
    /**
         * get a light node using its ID
         * @param {string} the light's id
         * @return {BABYLON.Light|null} the light or null if none found.
         */
    native public Light getLightByID(String id);
    /**
         * get a light node using its scene-generated unique ID
         * @param {number} the light's unique id
         * @return {BABYLON.Light|null} the light or null if none found.
         */
    native public Light getLightByUniqueID(double uniqueId);
    /**
         * get a particle system by id
         * @param id {number} the particle system id
         * @return {BABYLON.ParticleSystem|null} the corresponding system or null if none found.
         */
    native public ParticleSystem getParticleSystemByID(String id);
    /**
         * get a geometry using its ID
         * @param {string} the geometry's id
         * @return {BABYLON.Geometry|null} the geometry or null if none found.
         */
    native public Geometry getGeometryByID(String id);
    /**
         * add a new geometry to this scene.
         * @param {BABYLON.Geometry} geometry - the geometry to be added to the scene.
         * @param {boolean} [force] - force addition, even if a geometry with this ID already exists
         * @return {boolean} was the geometry added or not
         */
    native public Boolean pushGeometry(Geometry geometry, Boolean force);
    /**
         * Removes an existing geometry
         * @param {BABYLON.Geometry} geometry - the geometry to be removed from the scene.
         * @return {boolean} was the geometry removed or not
         */
    native public Boolean removeGeometry(Geometry geometry);
    native public Geometry[] getGeometries();
    /**
         * Get the first added mesh found of a given ID
         * @param {string} id - the id to search for
         * @return {BABYLON.AbstractMesh|null} the mesh found or null if not found at all.
         */
    native public AbstractMesh getMeshByID(String id);
    native public Array<AbstractMesh> getMeshesByID(String id);
    /**
         * Get a mesh with its auto-generated unique id
         * @param {number} uniqueId - the unique id to search for
         * @return {BABYLON.AbstractMesh|null} the mesh found or null if not found at all.
         */
    native public AbstractMesh getMeshByUniqueID(double uniqueId);
    /**
         * Get a the last added mesh found of a given ID
         * @param {string} id - the id to search for
         * @return {BABYLON.AbstractMesh|null} the mesh found or null if not found at all.
         */
    native public AbstractMesh getLastMeshByID(String id);
    /**
         * Get a the last added node (Mesh, Camera, Light) found of a given ID
         * @param {string} id - the id to search for
         * @return {BABYLON.Node|null} the node found or null if not found at all.
         */
    native public Node getLastEntryByID(String id);
    native public Node getNodeByID(String id);
    native public Node getNodeByName(String name);
    native public AbstractMesh getMeshByName(String name);
    native public Sound getSoundByName(String name);
    native public Skeleton getLastSkeletonByID(String id);
    native public Skeleton getSkeletonById(String id);
    native public Skeleton getSkeletonByName(String name);
    native public MorphTargetManager getMorphTargetManagerById(double id);
    native public Boolean isActiveMesh(Mesh mesh);
    /**
         * Return a the first highlight layer of the scene with a given name.
         * @param name The name of the highlight layer to look for.
         * @return The highlight layer if found otherwise null.
         */
    native public HighlightLayer getHighlightLayerByName(String name);
    /**
         * Return a unique id as a string which can serve as an identifier for the scene
         */
    public final String uid=null;
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
    native public Boolean _isInIntermediateRendering();
    native public void updateTransformMatrix(Boolean force);
    native public void render();
    public Boolean audioEnabled;
    public Boolean headphone;
    native public DepthRenderer enableDepthRenderer();
    native public void disableDepthRenderer();
    native public GeometryBufferRenderer enableGeometryBufferRenderer(double ratio);
    native public void disableGeometryBufferRenderer();
    native public void freezeMaterials();
    native public void unfreezeMaterials();
    native public void dispose();
    public final Boolean isDisposed=null;
    native public void disposeSounds();
    native public GetWorldExtends getWorldExtends();
    native public Octree<AbstractMesh> createOrUpdateSelectionOctree(double maxCapacity, double maxDepth);
    native public Ray createPickingRay(double x, double y, Matrix world, Camera camera, Boolean cameraViewSpace);
    native public Ray createPickingRayInCameraSpace(double x, double y, Camera camera);
    native public PickingInfo pick(double x, double y, java.util.function.Function<AbstractMesh,Boolean> predicate, Boolean fastCheck, Camera camera);
    native public PickingInfo pickSprite(double x, double y, java.util.function.Function<Sprite,Boolean> predicate, Boolean fastCheck, Camera camera);
    native public PickingInfo pickWithRay(Ray ray, java.util.function.Function<Mesh,Boolean> predicate, Boolean fastCheck);
    native public PickingInfo[] multiPick(double x, double y, java.util.function.Function<AbstractMesh,Boolean> predicate, Camera camera);
    native public PickingInfo[] multiPickWithRay(Ray ray, java.util.function.Function<Mesh,Boolean> predicate);
    native public void setPointerOverMesh(AbstractMesh mesh);
    native public AbstractMesh getPointerOverMesh();
    native public void setPointerOverSprite(Sprite sprite);
    native public Sprite getPointerOverSprite();
    native public PhysicsEngine getPhysicsEngine();
    /**
         * Enables physics to the current scene
         * @param {BABYLON.Vector3} [gravity] - the scene's gravity for the physics engine
         * @param {BABYLON.IPhysicsEnginePlugin} [plugin] - The physics engine to be used. defaults to OimoJS.
         * @return {boolean} was the physics engine initialized
         */
    native public Boolean enablePhysics(Vector3 gravity, IPhysicsEnginePlugin plugin);
    native public void disablePhysicsEngine();
    native public Boolean isPhysicsEnabled();
    native public void deleteCompoundImpostor(Object compound);
    native public void createDefaultCameraOrLight(Boolean createArcRotateCamera, Boolean replace, Boolean attachCameraControls);
    native public Mesh createDefaultSkybox(BaseTexture environmentTexture, Boolean pbr, double scale, double blur);
    native public Mesh[] getMeshesByTags(String tagsQuery, java.util.function.Consumer<AbstractMesh> forEach);
    native public Camera[] getCamerasByTags(String tagsQuery, java.util.function.Consumer<Camera> forEach);
    native public Light[] getLightsByTags(String tagsQuery, java.util.function.Consumer<Light> forEach);
    native public Material[] getMaterialByTags(String tagsQuery, java.util.function.Consumer<Material> forEach);
    /**
         * Overrides the default sort function applied in the renderging group to prepare the meshes.
         * This allowed control for front to back rendering or reversly depending of the special needs.
         *
         * @param renderingGroupId The rendering group id corresponding to its index
         * @param opaqueSortCompareFn The opaque queue comparison function use to sort.
         * @param alphaTestSortCompareFn The alpha test queue comparison function use to sort.
         * @param transparentSortCompareFn The transparent queue comparison function use to sort.
         */
    native public void setRenderingOrder(double renderingGroupId, java.util.function.BiFunction<SubMesh,SubMesh,Double> opaqueSortCompareFn, java.util.function.BiFunction<SubMesh,SubMesh,Double> alphaTestSortCompareFn, java.util.function.BiFunction<SubMesh,SubMesh,Double> transparentSortCompareFn);
    /**
         * Specifies whether or not the stencil and depth buffer are cleared between two rendering groups.
         *
         * @param renderingGroupId The rendering group id corresponding to its index
         * @param autoClearDepthStencil Automatically clears depth and stencil between groups if true.
         * @param depth Automatically clears depth between groups if true and autoClear is true.
         * @param stencil Automatically clears stencil between groups if true and autoClear is true.
         */
    native public void setRenderingAutoClearDepthStencil(double renderingGroupId, Boolean autoClearDepthStencil, Boolean depth, Boolean stencil);
    /**
         * Will flag all materials as dirty to trigger new shader compilation
         * @param predicate If not null, it will be used to specifiy if a material has to be marked as dirty
         */
    native public void markAllMaterialsAsDirty(double flag, java.util.function.Function<Material,Boolean> predicate);
    /** This is an automatically generated object type (see the source definition). */
    @jsweet.lang.ObjectType
    public static class GetWorldExtends extends def.js.Object {
        public Vector3 min;
        public Vector3 max;
    }
    native public Boolean isCachedMaterialValid(Material material, Effect effect);
    /**
        * Attach events to the canvas (To handle actionManagers triggers and raise onPointerMove, onPointerDown and onPointerUp
        * @param attachUp defines if you want to attach events to pointerup
        * @param attachDown defines if you want to attach events to pointerdown
        * @param attachMove defines if you want to attach events to pointermove
        */
    native public void attachControl(Boolean attachUp, Boolean attachDown);
    /**
        * Attach events to the canvas (To handle actionManagers triggers and raise onPointerMove, onPointerDown and onPointerUp
        * @param attachUp defines if you want to attach events to pointerup
        * @param attachDown defines if you want to attach events to pointerdown
        * @param attachMove defines if you want to attach events to pointermove
        */
    native public void attachControl(Boolean attachUp);
    /**
        * Attach events to the canvas (To handle actionManagers triggers and raise onPointerMove, onPointerDown and onPointerUp
        * @param attachUp defines if you want to attach events to pointerup
        * @param attachDown defines if you want to attach events to pointerdown
        * @param attachMove defines if you want to attach events to pointermove
        */
    native public void attachControl();
    /**
         * Will start the animation sequence of a given target
         * @param target - the target
         * @param {number} from - from which frame should animation start
         * @param {number} to - till which frame should animation run.
         * @param {boolean} [loop] - should the animation loop
         * @param {number} [speedRatio] - the speed in which to run the animation
         * @param {Function} [onAnimationEnd] function to be executed when the animation ended.
         * @param {BABYLON.Animatable} [animatable] an animatable object. If not provided a new one will be created from the given params.
         * @return {BABYLON.Animatable} the animatable object created for this animation
         * @see BABYLON.Animatable
         * @see http://doc.babylonjs.com/page.php?p=22081
         */
    native public Animatable beginAnimation(Object target, double from, double to, Boolean loop, double speedRatio, java.lang.Runnable onAnimationEnd);
    /**
         * Will start the animation sequence of a given target
         * @param target - the target
         * @param {number} from - from which frame should animation start
         * @param {number} to - till which frame should animation run.
         * @param {boolean} [loop] - should the animation loop
         * @param {number} [speedRatio] - the speed in which to run the animation
         * @param {Function} [onAnimationEnd] function to be executed when the animation ended.
         * @param {BABYLON.Animatable} [animatable] an animatable object. If not provided a new one will be created from the given params.
         * @return {BABYLON.Animatable} the animatable object created for this animation
         * @see BABYLON.Animatable
         * @see http://doc.babylonjs.com/page.php?p=22081
         */
    native public Animatable beginAnimation(Object target, double from, double to, Boolean loop, double speedRatio);
    /**
         * Will start the animation sequence of a given target
         * @param target - the target
         * @param {number} from - from which frame should animation start
         * @param {number} to - till which frame should animation run.
         * @param {boolean} [loop] - should the animation loop
         * @param {number} [speedRatio] - the speed in which to run the animation
         * @param {Function} [onAnimationEnd] function to be executed when the animation ended.
         * @param {BABYLON.Animatable} [animatable] an animatable object. If not provided a new one will be created from the given params.
         * @return {BABYLON.Animatable} the animatable object created for this animation
         * @see BABYLON.Animatable
         * @see http://doc.babylonjs.com/page.php?p=22081
         */
    native public Animatable beginAnimation(Object target, double from, double to, Boolean loop);
    /**
         * Will start the animation sequence of a given target
         * @param target - the target
         * @param {number} from - from which frame should animation start
         * @param {number} to - till which frame should animation run.
         * @param {boolean} [loop] - should the animation loop
         * @param {number} [speedRatio] - the speed in which to run the animation
         * @param {Function} [onAnimationEnd] function to be executed when the animation ended.
         * @param {BABYLON.Animatable} [animatable] an animatable object. If not provided a new one will be created from the given params.
         * @return {BABYLON.Animatable} the animatable object created for this animation
         * @see BABYLON.Animatable
         * @see http://doc.babylonjs.com/page.php?p=22081
         */
    native public Animatable beginAnimation(Object target, double from, double to);
    native public Animatable beginDirectAnimation(Object target, Animation[] animations, double from, double to, Boolean loop, double speedRatio);
    native public Animatable beginDirectAnimation(Object target, Animation[] animations, double from, double to, Boolean loop);
    native public Animatable beginDirectAnimation(Object target, Animation[] animations, double from, double to);
    /**
         * Will stop the animation of the given target
         * @param target - the target
         * @param animationName - the name of the animation to stop (all animations will be stopped is empty)
         * @see beginAnimation
         */
    native public void stopAnimation(Object target);
    /**
         * Switch active camera
         * @param {Camera} newCamera - new active camera
         * @param {boolean} attachControl - call attachControl for the new active camera (default: true)
         */
    native public void switchActiveCamera(Camera newCamera);
    /**
         * add a new geometry to this scene.
         * @param {BABYLON.Geometry} geometry - the geometry to be added to the scene.
         * @param {boolean} [force] - force addition, even if a geometry with this ID already exists
         * @return {boolean} was the geometry added or not
         */
    native public Boolean pushGeometry(Geometry geometry);
    native public void updateTransformMatrix();
    native public GeometryBufferRenderer enableGeometryBufferRenderer();
    native public Octree<AbstractMesh> createOrUpdateSelectionOctree(double maxCapacity);
    native public Octree<AbstractMesh> createOrUpdateSelectionOctree();
    native public Ray createPickingRay(double x, double y, Matrix world, Camera camera);
    native public PickingInfo pick(double x, double y, java.util.function.Function<AbstractMesh,Boolean> predicate, Boolean fastCheck);
    native public PickingInfo pick(double x, double y, java.util.function.Function<AbstractMesh,Boolean> predicate);
    native public PickingInfo pick(double x, double y);
    native public PickingInfo pickSprite(double x, double y, java.util.function.Function<Sprite,Boolean> predicate, Boolean fastCheck);
    native public PickingInfo pickSprite(double x, double y, java.util.function.Function<Sprite,Boolean> predicate);
    native public PickingInfo pickSprite(double x, double y);
    native public PickingInfo pickWithRay(Ray ray, java.util.function.Function<Mesh,Boolean> predicate);
    native public PickingInfo[] multiPick(double x, double y, java.util.function.Function<AbstractMesh,Boolean> predicate);
    native public PickingInfo[] multiPick(double x, double y);
    /**
         * Enables physics to the current scene
         * @param {BABYLON.Vector3} [gravity] - the scene's gravity for the physics engine
         * @param {BABYLON.IPhysicsEnginePlugin} [plugin] - The physics engine to be used. defaults to OimoJS.
         * @return {boolean} was the physics engine initialized
         */
    native public Boolean enablePhysics(Vector3 gravity);
    /**
         * Enables physics to the current scene
         * @param {BABYLON.Vector3} [gravity] - the scene's gravity for the physics engine
         * @param {BABYLON.IPhysicsEnginePlugin} [plugin] - The physics engine to be used. defaults to OimoJS.
         * @return {boolean} was the physics engine initialized
         */
    native public Boolean enablePhysics();
    native public void createDefaultCameraOrLight(Boolean createArcRotateCamera, Boolean replace);
    native public void createDefaultCameraOrLight(Boolean createArcRotateCamera);
    native public void createDefaultCameraOrLight();
    native public Mesh createDefaultSkybox(BaseTexture environmentTexture, Boolean pbr, double scale);
    native public Mesh createDefaultSkybox(BaseTexture environmentTexture, Boolean pbr);
    native public Mesh createDefaultSkybox(BaseTexture environmentTexture);
    native public Mesh createDefaultSkybox();
    native public Mesh[] getMeshesByTags(String tagsQuery);
    native public Camera[] getCamerasByTags(String tagsQuery);
    native public Light[] getLightsByTags(String tagsQuery);
    native public Material[] getMaterialByTags(String tagsQuery);
    /**
         * Overrides the default sort function applied in the renderging group to prepare the meshes.
         * This allowed control for front to back rendering or reversly depending of the special needs.
         *
         * @param renderingGroupId The rendering group id corresponding to its index
         * @param opaqueSortCompareFn The opaque queue comparison function use to sort.
         * @param alphaTestSortCompareFn The alpha test queue comparison function use to sort.
         * @param transparentSortCompareFn The transparent queue comparison function use to sort.
         */
    native public void setRenderingOrder(double renderingGroupId, java.util.function.BiFunction<SubMesh,SubMesh,Double> opaqueSortCompareFn, java.util.function.BiFunction<SubMesh,SubMesh,Double> alphaTestSortCompareFn);
    /**
         * Overrides the default sort function applied in the renderging group to prepare the meshes.
         * This allowed control for front to back rendering or reversly depending of the special needs.
         *
         * @param renderingGroupId The rendering group id corresponding to its index
         * @param opaqueSortCompareFn The opaque queue comparison function use to sort.
         * @param alphaTestSortCompareFn The alpha test queue comparison function use to sort.
         * @param transparentSortCompareFn The transparent queue comparison function use to sort.
         */
    native public void setRenderingOrder(double renderingGroupId, java.util.function.BiFunction<SubMesh,SubMesh,Double> opaqueSortCompareFn);
    /**
         * Overrides the default sort function applied in the renderging group to prepare the meshes.
         * This allowed control for front to back rendering or reversly depending of the special needs.
         *
         * @param renderingGroupId The rendering group id corresponding to its index
         * @param opaqueSortCompareFn The opaque queue comparison function use to sort.
         * @param alphaTestSortCompareFn The alpha test queue comparison function use to sort.
         * @param transparentSortCompareFn The transparent queue comparison function use to sort.
         */
    native public void setRenderingOrder(double renderingGroupId);
    /**
         * Specifies whether or not the stencil and depth buffer are cleared between two rendering groups.
         *
         * @param renderingGroupId The rendering group id corresponding to its index
         * @param autoClearDepthStencil Automatically clears depth and stencil between groups if true.
         * @param depth Automatically clears depth between groups if true and autoClear is true.
         * @param stencil Automatically clears stencil between groups if true and autoClear is true.
         */
    native public void setRenderingAutoClearDepthStencil(double renderingGroupId, Boolean autoClearDepthStencil, Boolean depth);
    /**
         * Specifies whether or not the stencil and depth buffer are cleared between two rendering groups.
         *
         * @param renderingGroupId The rendering group id corresponding to its index
         * @param autoClearDepthStencil Automatically clears depth and stencil between groups if true.
         * @param depth Automatically clears depth between groups if true and autoClear is true.
         * @param stencil Automatically clears stencil between groups if true and autoClear is true.
         */
    native public void setRenderingAutoClearDepthStencil(double renderingGroupId, Boolean autoClearDepthStencil);
    /**
         * Will flag all materials as dirty to trigger new shader compilation
         * @param predicate If not null, it will be used to specifiy if a material has to be marked as dirty
         */
    native public void markAllMaterialsAsDirty(double flag);
    protected Scene(){}
}

