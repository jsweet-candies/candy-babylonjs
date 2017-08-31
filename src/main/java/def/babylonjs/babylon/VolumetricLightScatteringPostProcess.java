package def.babylonjs.babylon;
public class VolumetricLightScatteringPostProcess extends PostProcess {
    /**
        * If not undefined, the mesh position is computed from the attached node position
        * @type {{position: Vector3}}
        */
    public AttachedNode attachedNode;
    /**
        * Custom position of the mesh. Used if "useCustomMeshPosition" is set to "true"
        * @type {Vector3}
        */
    public Vector3 customMeshPosition;
    /**
        * Set if the post-process should use a custom position for the light source (true) or the internal mesh position (false)
        * @type {boolean}
        */
    public Boolean useCustomMeshPosition;
    /**
        * If the post-process should inverse the light scattering direction
        * @type {boolean}
        */
    public Boolean invert;
    /**
        * The internal mesh used by the post-process
        * @type {boolean}
        */
    public Mesh mesh;
    public Boolean useDiffuseColor;
    /**
        * Array containing the excluded meshes not rendered in the internal pass
        */
    public AbstractMesh[] excludedMeshes;
    /**
        * Controls the overall intensity of the post-process
        * @type {number}
        */
    public double exposure;
    /**
        * Dissipates each sample's contribution in range [0, 1]
        * @type {number}
        */
    public double decay;
    /**
        * Controls the overall intensity of each sample
        * @type {number}
        */
    public double weight;
    /**
        * Controls the density of each sample
        * @type {number}
        */
    public double density;
    /**
         * @constructor
         * @param {string} name - The post-process name
         * @param {any} ratio - The size of the post-process and/or internal pass (0.5 means that your postprocess will have a width = canvas.width 0.5 and a height = canvas.height 0.5)
         * @param {BABYLON.Camera} camera - The camera that the post-process will be attached to
         * @param {BABYLON.Mesh} mesh - The mesh used to create the light scattering
         * @param {number} samples - The post-process quality, default 100
         * @param {number} samplingMode - The post-process filtering mode
         * @param {BABYLON.Engine} engine - The babylon engine
         * @param {boolean} reusable - If the post-process is reusable
         * @param {BABYLON.Scene} scene - The constructor needs a scene reference to initialize internal components. If "camera" is null (RenderPipelineà, "scene" must be provided
         */
    public VolumetricLightScatteringPostProcess(String name, Object ratio, Camera camera, Mesh mesh, double samples, double samplingMode, Engine engine, Boolean reusable, Scene scene){}
    native public Boolean isReady(SubMesh subMesh, Boolean useInstances);
    /**
         * Sets the new light position for light scattering effect
         * @param {BABYLON.Vector3} The new custom light position
         */
    native public void setCustomMeshPosition(Vector3 position);
    /**
         * Returns the light position for light scattering effect
         * @return {BABYLON.Vector3} The custom light position
         */
    native public Vector3 getCustomMeshPosition();
    /**
         * Disposes the internal assets and detaches the post-process from the camera
         */
    native public void dispose(Camera camera);
    /**
         * Returns the render target texture used by the post-process
         * @return {BABYLON.RenderTargetTexture} The render target texture used by the post-process
         */
    native public RenderTargetTexture getPass();
    /**
        * Creates a default mesh for the Volumeric Light Scattering post-process
        * @param {string} The mesh name
        * @param {BABYLON.Scene} The scene where to create the mesh
        * @return {BABYLON.Mesh} the default mesh
        */
    native public static Mesh CreateDefaultMesh(String name, Scene scene);
    /** This is an automatically generated object type (see the source definition). */
    @jsweet.lang.ObjectType
    public static class AttachedNode extends def.js.Object {
        public Vector3 position;
    }
    /**
         * @constructor
         * @param {string} name - The post-process name
         * @param {any} ratio - The size of the post-process and/or internal pass (0.5 means that your postprocess will have a width = canvas.width 0.5 and a height = canvas.height 0.5)
         * @param {BABYLON.Camera} camera - The camera that the post-process will be attached to
         * @param {BABYLON.Mesh} mesh - The mesh used to create the light scattering
         * @param {number} samples - The post-process quality, default 100
         * @param {number} samplingMode - The post-process filtering mode
         * @param {BABYLON.Engine} engine - The babylon engine
         * @param {boolean} reusable - If the post-process is reusable
         * @param {BABYLON.Scene} scene - The constructor needs a scene reference to initialize internal components. If "camera" is null (RenderPipelineà, "scene" must be provided
         */
    public VolumetricLightScatteringPostProcess(String name, Object ratio, Camera camera, Mesh mesh, double samples, double samplingMode, Engine engine, Boolean reusable){}
    /**
         * @constructor
         * @param {string} name - The post-process name
         * @param {any} ratio - The size of the post-process and/or internal pass (0.5 means that your postprocess will have a width = canvas.width 0.5 and a height = canvas.height 0.5)
         * @param {BABYLON.Camera} camera - The camera that the post-process will be attached to
         * @param {BABYLON.Mesh} mesh - The mesh used to create the light scattering
         * @param {number} samples - The post-process quality, default 100
         * @param {number} samplingMode - The post-process filtering mode
         * @param {BABYLON.Engine} engine - The babylon engine
         * @param {boolean} reusable - If the post-process is reusable
         * @param {BABYLON.Scene} scene - The constructor needs a scene reference to initialize internal components. If "camera" is null (RenderPipelineà, "scene" must be provided
         */
    public VolumetricLightScatteringPostProcess(String name, Object ratio, Camera camera, Mesh mesh, double samples, double samplingMode, Engine engine){}
    /**
         * @constructor
         * @param {string} name - The post-process name
         * @param {any} ratio - The size of the post-process and/or internal pass (0.5 means that your postprocess will have a width = canvas.width 0.5 and a height = canvas.height 0.5)
         * @param {BABYLON.Camera} camera - The camera that the post-process will be attached to
         * @param {BABYLON.Mesh} mesh - The mesh used to create the light scattering
         * @param {number} samples - The post-process quality, default 100
         * @param {number} samplingMode - The post-process filtering mode
         * @param {BABYLON.Engine} engine - The babylon engine
         * @param {boolean} reusable - If the post-process is reusable
         * @param {BABYLON.Scene} scene - The constructor needs a scene reference to initialize internal components. If "camera" is null (RenderPipelineà, "scene" must be provided
         */
    public VolumetricLightScatteringPostProcess(String name, Object ratio, Camera camera, Mesh mesh, double samples, double samplingMode){}
    /**
         * @constructor
         * @param {string} name - The post-process name
         * @param {any} ratio - The size of the post-process and/or internal pass (0.5 means that your postprocess will have a width = canvas.width 0.5 and a height = canvas.height 0.5)
         * @param {BABYLON.Camera} camera - The camera that the post-process will be attached to
         * @param {BABYLON.Mesh} mesh - The mesh used to create the light scattering
         * @param {number} samples - The post-process quality, default 100
         * @param {number} samplingMode - The post-process filtering mode
         * @param {BABYLON.Engine} engine - The babylon engine
         * @param {boolean} reusable - If the post-process is reusable
         * @param {BABYLON.Scene} scene - The constructor needs a scene reference to initialize internal components. If "camera" is null (RenderPipelineà, "scene" must be provided
         */
    public VolumetricLightScatteringPostProcess(String name, Object ratio, Camera camera, Mesh mesh, double samples){}
    /**
         * @constructor
         * @param {string} name - The post-process name
         * @param {any} ratio - The size of the post-process and/or internal pass (0.5 means that your postprocess will have a width = canvas.width 0.5 and a height = canvas.height 0.5)
         * @param {BABYLON.Camera} camera - The camera that the post-process will be attached to
         * @param {BABYLON.Mesh} mesh - The mesh used to create the light scattering
         * @param {number} samples - The post-process quality, default 100
         * @param {number} samplingMode - The post-process filtering mode
         * @param {BABYLON.Engine} engine - The babylon engine
         * @param {boolean} reusable - If the post-process is reusable
         * @param {BABYLON.Scene} scene - The constructor needs a scene reference to initialize internal components. If "camera" is null (RenderPipelineà, "scene" must be provided
         */
    public VolumetricLightScatteringPostProcess(String name, Object ratio, Camera camera, Mesh mesh){}
    /**
         * @constructor
         * @param {string} name - The post-process name
         * @param {any} ratio - The size of the post-process and/or internal pass (0.5 means that your postprocess will have a width = canvas.width 0.5 and a height = canvas.height 0.5)
         * @param {BABYLON.Camera} camera - The camera that the post-process will be attached to
         * @param {BABYLON.Mesh} mesh - The mesh used to create the light scattering
         * @param {number} samples - The post-process quality, default 100
         * @param {number} samplingMode - The post-process filtering mode
         * @param {BABYLON.Engine} engine - The babylon engine
         * @param {boolean} reusable - If the post-process is reusable
         * @param {BABYLON.Scene} scene - The constructor needs a scene reference to initialize internal components. If "camera" is null (RenderPipelineà, "scene" must be provided
         */
    public VolumetricLightScatteringPostProcess(String name, Object ratio, Camera camera){}
    protected VolumetricLightScatteringPostProcess(){}
}

