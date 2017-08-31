package def.babylonjs.babylon;
public class RenderingGroup extends def.js.Object {
    public double index;
    public java.lang.Runnable onBeforeTransparentRendering;
    /**
         * Set the opaque sort comparison function.
         * If null the sub meshes will be render in the order they were created
         */
    public java.util.function.BiFunction<SubMesh,SubMesh,Double> opaqueSortCompareFn;
    /**
         * Set the alpha test sort comparison function.
         * If null the sub meshes will be render in the order they were created
         */
    public java.util.function.BiFunction<SubMesh,SubMesh,Double> alphaTestSortCompareFn;
    /**
         * Set the transparent sort comparison function.
         * If null the sub meshes will be render in the order they were created
         */
    public java.util.function.BiFunction<SubMesh,SubMesh,Double> transparentSortCompareFn;
    /**
         * Creates a new rendering group.
         * @param index The rendering group index
         * @param opaqueSortCompareFn The opaque sort comparison function. If null no order is applied
         * @param alphaTestSortCompareFn The alpha test sort comparison function. If null no order is applied
         * @param transparentSortCompareFn The transparent sort comparison function. If null back to front + alpha index sort is applied
         */
    public RenderingGroup(double index, Scene scene, java.util.function.BiFunction<SubMesh,SubMesh,Double> opaqueSortCompareFn, java.util.function.BiFunction<SubMesh,SubMesh,Double> alphaTestSortCompareFn, java.util.function.BiFunction<SubMesh,SubMesh,Double> transparentSortCompareFn){}
    /**
         * Render all the sub meshes contained in the group.
         * @param customRenderFunction Used to override the default render behaviour of the group.
         * @returns true if rendered some submeshes.
         */
    native public void render(jsweet.util.function.TriConsumer<SmartArray<SubMesh>,SmartArray<SubMesh>,SmartArray<SubMesh>> customRenderFunction, Boolean renderSprites, Boolean renderParticles, AbstractMesh[] activeMeshes);
    /**
         * Build in function which can be applied to ensure meshes of a special queue (opaque, alpha test, transparent)
         * are rendered back to front if in the same alpha index.
         *
         * @param a The first submesh
         * @param b The second submesh
         * @returns The result of the comparison
         */
    native public static double defaultTransparentSortCompare(SubMesh a, SubMesh b);
    /**
         * Build in function which can be applied to ensure meshes of a special queue (opaque, alpha test, transparent)
         * are rendered back to front.
         *
         * @param a The first submesh
         * @param b The second submesh
         * @returns The result of the comparison
         */
    native public static double backToFrontSortCompare(SubMesh a, SubMesh b);
    /**
         * Build in function which can be applied to ensure meshes of a special queue (opaque, alpha test, transparent)
         * are rendered front to back (prevent overdraw).
         *
         * @param a The first submesh
         * @param b The second submesh
         * @returns The result of the comparison
         */
    native public static double frontToBackSortCompare(SubMesh a, SubMesh b);
    /**
         * Resets the different lists of submeshes to prepare a new frame.
         */
    native public void prepare();
    native public void dispose();
    /**
         * Inserts the submesh in its correct queue depending on its material.
         * @param subMesh The submesh to dispatch
         */
    native public void dispatch(SubMesh subMesh);
    native public void dispatchSprites(SpriteManager spriteManager);
    native public void dispatchParticles(ParticleSystem particleSystem);
    /**
         * Creates a new rendering group.
         * @param index The rendering group index
         * @param opaqueSortCompareFn The opaque sort comparison function. If null no order is applied
         * @param alphaTestSortCompareFn The alpha test sort comparison function. If null no order is applied
         * @param transparentSortCompareFn The transparent sort comparison function. If null back to front + alpha index sort is applied
         */
    public RenderingGroup(double index, Scene scene, java.util.function.BiFunction<SubMesh,SubMesh,Double> opaqueSortCompareFn, java.util.function.BiFunction<SubMesh,SubMesh,Double> alphaTestSortCompareFn){}
    /**
         * Creates a new rendering group.
         * @param index The rendering group index
         * @param opaqueSortCompareFn The opaque sort comparison function. If null no order is applied
         * @param alphaTestSortCompareFn The alpha test sort comparison function. If null no order is applied
         * @param transparentSortCompareFn The transparent sort comparison function. If null back to front + alpha index sort is applied
         */
    public RenderingGroup(double index, Scene scene, java.util.function.BiFunction<SubMesh,SubMesh,Double> opaqueSortCompareFn){}
    /**
         * Creates a new rendering group.
         * @param index The rendering group index
         * @param opaqueSortCompareFn The opaque sort comparison function. If null no order is applied
         * @param alphaTestSortCompareFn The alpha test sort comparison function. If null no order is applied
         * @param transparentSortCompareFn The transparent sort comparison function. If null back to front + alpha index sort is applied
         */
    public RenderingGroup(double index, Scene scene){}
    protected RenderingGroup(){}
}

