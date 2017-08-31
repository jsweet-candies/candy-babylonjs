package def.babylonjs.babylon;
public class SSAORenderingPipeline extends PostProcessRenderPipeline {
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
        * The radius around the analyzed pixel used by the SSAO post-process. Default value is 0.0006
        * @type {number}
        */
    public double radius;
    /**
        * Related to fallOff, used to interpolate SSAO samples (first interpolate function input) based on the occlusion difference of each pixel
        * Must not be equal to fallOff and superior to fallOff.
        * Default value is 0.975
        * @type {number}
        */
    public double area;
    /**
        * Related to area, used to interpolate SSAO samples (second interpolate function input) based on the occlusion difference of each pixel
        * Must not be equal to area and inferior to area.
        * Default value is 0.0
        * @type {number}
        */
    public double fallOff;
    /**
        * The base color of the SSAO post-process
        * The final result is "base + ssao" between [0, 1]
        * @type {number}
        */
    public double base;
    /**
         * @constructor
         * @param {string} name - The rendering pipeline name
         * @param {BABYLON.Scene} scene - The scene linked to this pipeline
         * @param {any} ratio - The size of the postprocesses. Can be a number shared between passes or an object for more precision: { ssaoRatio: 0.5, combineRatio: 1.0 }
         * @param {BABYLON.Camera[]} cameras - The array of cameras that the rendering pipeline will be attached to
         */
    public SSAORenderingPipeline(String name, Scene scene, Object ratio, Camera[] cameras){}
    /**
         * Removes the internal pipeline assets and detatches the pipeline from the scene cameras
         */
    native public void dispose(Boolean disableDepthRender);
    /**
         * @constructor
         * @param {string} name - The rendering pipeline name
         * @param {BABYLON.Scene} scene - The scene linked to this pipeline
         * @param {any} ratio - The size of the postprocesses. Can be a number shared between passes or an object for more precision: { ssaoRatio: 0.5, combineRatio: 1.0 }
         * @param {BABYLON.Camera[]} cameras - The array of cameras that the rendering pipeline will be attached to
         */
    public SSAORenderingPipeline(String name, Scene scene, Object ratio){}
    /**
         * Removes the internal pipeline assets and detatches the pipeline from the scene cameras
         */
    native public void dispose();
    protected SSAORenderingPipeline(){}
}

