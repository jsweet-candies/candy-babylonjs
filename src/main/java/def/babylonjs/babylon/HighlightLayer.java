package def.babylonjs.babylon;
/**
     * The highlight layer Helps adding a glow effect around a mesh.
     *
     * Once instantiated in a scene, simply use the pushMesh or removeMesh method to add or remove
     * glowy meshes to your scene.
     *
     * !!! THIS REQUIRES AN ACTIVE STENCIL BUFFER ON THE CANVAS !!!
     */
public class HighlightLayer extends def.js.Object {
    public String name;
    /**
         * The neutral color used during the preparation of the glow effect.
         * This is black by default as the blend operation is a blend operation.
         */
    public static Color4 neutralColor;
    /**
         * Stencil value used for glowing meshes.
         */
    public static double glowingMeshStencilReference;
    /**
         * Stencil value used for the other meshes in the scene.
         */
    public static double normalMeshStencilReference;
    /**
         * Specifies whether or not the inner glow is ACTIVE in the layer.
         */
    public Boolean innerGlow;
    /**
         * Specifies whether or not the outer glow is ACTIVE in the layer.
         */
    public Boolean outerGlow;
    /**
         * Specifies wether the highlight layer is enabled or not.
         */
    public Boolean isEnabled;
    /**
         * Specifies the horizontal size of the blur.
         */
    public double blurHorizontalSize;
    /**
         * Specifies the vertical size of the blur.
         */
    public double blurVerticalSize;
    /**
         * Gets the camera attached to the layer.
         */
    public final Camera camera=null;
    /**
         * An event triggered when the highlight layer has been disposed.
         * @type {BABYLON.Observable}
         */
    public Observable<HighlightLayer> onDisposeObservable;
    /**
         * An event triggered when the highlight layer is about rendering the main texture with the glowy parts.
         * @type {BABYLON.Observable}
         */
    public Observable<HighlightLayer> onBeforeRenderMainTextureObservable;
    /**
         * An event triggered when the highlight layer is being blurred.
         * @type {BABYLON.Observable}
         */
    public Observable<HighlightLayer> onBeforeBlurObservable;
    /**
         * An event triggered when the highlight layer has been blurred.
         * @type {BABYLON.Observable}
         */
    public Observable<HighlightLayer> onAfterBlurObservable;
    /**
         * An event triggered when the glowing blurred texture is being merged in the scene.
         * @type {BABYLON.Observable}
         */
    public Observable<HighlightLayer> onBeforeComposeObservable;
    /**
         * An event triggered when the glowing blurred texture has been merged in the scene.
         * @type {BABYLON.Observable}
         */
    public Observable<HighlightLayer> onAfterComposeObservable;
    /**
         * An event triggered when the highlight layer changes its size.
         * @type {BABYLON.Observable}
         */
    public Observable<HighlightLayer> onSizeChangedObservable;
    /**
         * Instantiates a new highlight Layer and references it to the scene..
         * @param name The name of the layer
         * @param scene The scene to use the layer in
         * @param options Sets of none mandatory options to use with the layer (see IHighlightLayerOptions for more information)
         */
    public HighlightLayer(String name, Scene scene, IHighlightLayerOptions options){}
    /**
         * Renders the glowing part of the scene by blending the blurred glowing meshes on top of the rendered scene.
         */
    native public void render();
    /**
         * Add a mesh in the exclusion list to prevent it to impact or being impacted by the highlight layer.
         * @param mesh The mesh to exclude from the highlight layer
         */
    native public void addExcludedMesh(Mesh mesh);
    /**
          * Remove a mesh from the exclusion list to let it impact or being impacted by the highlight layer.
          * @param mesh The mesh to highlight
          */
    native public void removeExcludedMesh(Mesh mesh);
    /**
         * Add a mesh in the highlight layer in order to make it glow with the chosen color.
         * @param mesh The mesh to highlight
         * @param color The color of the highlight
         * @param glowEmissiveOnly Extract the glow from the emissive texture
         */
    native public void addMesh(Mesh mesh, Color3 color, Boolean glowEmissiveOnly);
    /**
         * Remove a mesh from the highlight layer in order to make it stop glowing.
         * @param mesh The mesh to highlight
         */
    native public void removeMesh(Mesh mesh);
    /**
         * Returns true if the layer contains information to display, otherwise false.
         */
    native public Boolean shouldRender();
    /**
         * Dispose the highlight layer and free resources.
         */
    native public void dispose();
    /**
         * Instantiates a new highlight Layer and references it to the scene..
         * @param name The name of the layer
         * @param scene The scene to use the layer in
         * @param options Sets of none mandatory options to use with the layer (see IHighlightLayerOptions for more information)
         */
    public HighlightLayer(String name, Scene scene){}
    /**
         * Add a mesh in the highlight layer in order to make it glow with the chosen color.
         * @param mesh The mesh to highlight
         * @param color The color of the highlight
         * @param glowEmissiveOnly Extract the glow from the emissive texture
         */
    native public void addMesh(Mesh mesh, Color3 color);
    protected HighlightLayer(){}
}

