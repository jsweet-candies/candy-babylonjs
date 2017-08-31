package def.babylonjs.babylon;
import jsweet.util.function.Consumer4;
public class RenderTargetTexture extends Texture {
    public Boolean isCube;
    public static double _REFRESHRATE_RENDER_ONCE;
    public static double _REFRESHRATE_RENDER_ONEVERYFRAME;
    public static double _REFRESHRATE_RENDER_ONEVERYTWOFRAMES;
    public static final double REFRESHRATE_RENDER_ONCE=0;
    public static final double REFRESHRATE_RENDER_ONEVERYFRAME=0;
    public static final double REFRESHRATE_RENDER_ONEVERYTWOFRAMES=0;
    /**
        * Use this predicate to dynamically define the list of mesh you want to render.
        * If set, the renderList property will be overwritten.
        */
    public java.util.function.Function<AbstractMesh,Boolean> renderListPredicate;
    /**
        * Use this list to define the list of mesh you want to render.
        */
    public AbstractMesh[] renderList;
    public Boolean renderParticles;
    public Boolean renderSprites;
    public double coordinatesMode;
    public Camera activeCamera;
    public Consumer4<SmartArray<SubMesh>,SmartArray<SubMesh>,SmartArray<SubMesh>,java.lang.Runnable> customRenderFunction;
    public Boolean useCameraPostProcesses;
    /**
        * An event triggered when the texture is unbind.
        * @type {BABYLON.Observable}
        */
    public Observable<RenderTargetTexture> onAfterUnbindObservable;
    public java.lang.Runnable onAfterUnbind;
    /**
        * An event triggered before rendering the texture
        * @type {BABYLON.Observable}
        */
    public Observable<Double> onBeforeRenderObservable;
    public java.util.function.Consumer<Double> onBeforeRender;
    /**
        * An event triggered after rendering the texture
        * @type {BABYLON.Observable}
        */
    public Observable<Double> onAfterRenderObservable;
    public java.util.function.Consumer<Double> onAfterRender;
    /**
        * An event triggered after the texture clear
        * @type {BABYLON.Observable}
        */
    public Observable<Engine> onClearObservable;
    public java.util.function.Consumer<Engine> onClear;
    public double _size;
    public Boolean _generateMipMaps;
    public RenderingManager _renderingManager;
    public String[] _waitingRenderList;
    public Boolean _doNotChangeAspectRatio;
    public double _currentRefreshId;
    public double _refreshRate;
    public Matrix _textureMatrix;
    public double _samples;
    public IRenderTargetOptions _renderTargetOptions;
    public final IRenderTargetOptions renderTargetOptions=null;
    public RenderTargetTexture(String name, Object size, Scene scene, Boolean generateMipMaps, Boolean doNotChangeAspectRatio, double type, Boolean isCube, double samplingMode, Boolean generateDepthBuffer, Boolean generateStencilBuffer, Boolean isMulti){}
    public double samples;
    native public void resetRefreshCounter();
    public double refreshRate;
    native public void addPostProcess(PostProcess postProcess);
    native public void clearPostProcesses(Boolean dispose);
    native public void removePostProcess(PostProcess postProcess);
    native public Boolean _shouldRender();
    native public Boolean isReady();
    native public double getRenderSize();
    public final Boolean canRescale=null;
    native public void scale(double ratio);
    native public Matrix getReflectionTextureMatrix();
    native public void resize(Object size);
    native public void render(Boolean useCameraPostProcess, Boolean dumpForDebug);
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
         */
    native public void setRenderingAutoClearDepthStencil(double renderingGroupId, Boolean autoClearDepthStencil);
    @jsweet.lang.Name("clone")
    native public RenderTargetTexture Clone();
    native public Object serialize();
    native public void disposeFramebufferObjects();
    native public void dispose();
    public RenderTargetTexture(String name, Object size, Scene scene, Boolean generateMipMaps, Boolean doNotChangeAspectRatio, double type, Boolean isCube, double samplingMode, Boolean generateDepthBuffer, Boolean generateStencilBuffer){}
    public RenderTargetTexture(String name, Object size, Scene scene, Boolean generateMipMaps, Boolean doNotChangeAspectRatio, double type, Boolean isCube, double samplingMode, Boolean generateDepthBuffer){}
    public RenderTargetTexture(String name, Object size, Scene scene, Boolean generateMipMaps, Boolean doNotChangeAspectRatio, double type, Boolean isCube, double samplingMode){}
    public RenderTargetTexture(String name, Object size, Scene scene, Boolean generateMipMaps, Boolean doNotChangeAspectRatio, double type, Boolean isCube){}
    public RenderTargetTexture(String name, Object size, Scene scene, Boolean generateMipMaps, Boolean doNotChangeAspectRatio, double type){}
    public RenderTargetTexture(String name, Object size, Scene scene, Boolean generateMipMaps, Boolean doNotChangeAspectRatio){}
    public RenderTargetTexture(String name, Object size, Scene scene, Boolean generateMipMaps){}
    public RenderTargetTexture(String name, Object size, Scene scene){}
    native public void clearPostProcesses();
    native public void render(Boolean useCameraPostProcess);
    native public void render();
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
    native public void customRenderFunction(SmartArray<SubMesh> p1, SmartArray<SubMesh> p2, SmartArray<SubMesh> p3, java.lang.Runnable p4);
    protected RenderTargetTexture(){}
}

