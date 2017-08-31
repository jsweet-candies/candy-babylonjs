package def.babylonjs.babylon;
public class SSAO2RenderingPipeline extends PostProcessRenderPipeline {
    /**
        * The PassPostProcess id in the pipeline that contains the original scene color
        * @type {string}
        */
    public String SSAOOriginalSceneColorEffect;
    /**
        * The SSAO PostProcess id in the pipeline
        * @type {string}
        */
    public String SSAORenderEffect;
    /**
        * The horizontal blur PostProcess id in the pipeline
        * @type {string}
        */
    public String SSAOBlurHRenderEffect;
    /**
        * The vertical blur PostProcess id in the pipeline
        * @type {string}
        */
    public String SSAOBlurVRenderEffect;
    /**
        * The PostProcess id in the pipeline that combines the SSAO-Blur output with the original scene color (SSAOOriginalSceneColorEffect)
        * @type {string}
        */
    public String SSAOCombineRenderEffect;
    /**
        * The output strength of the SSAO post-process. Default value is 1.0.
        * @type {number}
        */
    public double totalStrength;
    /**
        * Maximum depth value to still render AO. A smooth falloff makes the dimming more natural, so there will be no abrupt shading change.
        * @type {number}
        */
    public double maxZ;
    /**
        * In order to save performances, SSAO radius is clamped on close geometry. This ratio changes by how much
        * @type {number}
        */
    public double minZAspect;
    public double samples;
    public Boolean expensiveBlur;
    /**
        * The radius around the analyzed pixel used by the SSAO post-process. Default value is 2.0
        * @type {number}
        */
    public double radius;
    /**
        * The base color of the SSAO post-process
        * The final result is "base + ssao" between [0, 1]
        * @type {number}
        */
    public double base;
    /**
        *  Support test.
        * @type {boolean}
        */
    public static final Boolean IsSupported=null;
    /**
         * @constructor
         * @param {string} name - The rendering pipeline name
         * @param {BABYLON.Scene} scene - The scene linked to this pipeline
         * @param {any} ratio - The size of the postprocesses. Can be a number shared between passes or an object for more precision: { ssaoRatio: 0.5, blurRatio: 1.0 }
         * @param {BABYLON.Camera[]} cameras - The array of cameras that the rendering pipeline will be attached to
         */
    public SSAO2RenderingPipeline(String name, Scene scene, Object ratio, Camera[] cameras){}
    /**
         * Removes the internal pipeline assets and detatches the pipeline from the scene cameras
         */
    native public void dispose(Boolean disableGeometryBufferRenderer);
    /**
         * @constructor
         * @param {string} name - The rendering pipeline name
         * @param {BABYLON.Scene} scene - The scene linked to this pipeline
         * @param {any} ratio - The size of the postprocesses. Can be a number shared between passes or an object for more precision: { ssaoRatio: 0.5, blurRatio: 1.0 }
         * @param {BABYLON.Camera[]} cameras - The array of cameras that the rendering pipeline will be attached to
         */
    public SSAO2RenderingPipeline(String name, Scene scene, Object ratio){}
    /**
         * Removes the internal pipeline assets and detatches the pipeline from the scene cameras
         */
    native public void dispose();
    protected SSAO2RenderingPipeline(){}
}

