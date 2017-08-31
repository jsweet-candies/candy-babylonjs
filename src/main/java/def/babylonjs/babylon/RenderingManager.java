package def.babylonjs.babylon;
public class RenderingManager extends def.js.Object {
    /**
         * The max id used for rendering groups (not included)
         */
    public static double MAX_RENDERINGGROUPS;
    /**
         * The min id used for rendering groups (included)
         */
    public static double MIN_RENDERINGGROUPS;
    /**
         * Used to globally prevent autoclearing scenes.
         */
    public static Boolean AUTOCLEAR;
    public RenderingManager(Scene scene){}
    native public void render(jsweet.util.function.TriConsumer<SmartArray<SubMesh>,SmartArray<SubMesh>,SmartArray<SubMesh>> customRenderFunction, AbstractMesh[] activeMeshes, Boolean renderParticles, Boolean renderSprites);
    native public void reset();
    native public void dispose();
    native public void dispatchSprites(SpriteManager spriteManager);
    native public void dispatchParticles(ParticleSystem particleSystem);
    native public void dispatch(SubMesh subMesh);
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
    protected RenderingManager(){}
}

