package def.babylonjs.babylon;
@jsweet.lang.Extends({IDisposable.class,IAnimatable.class})
public class StandardRenderingPipeline extends PostProcessRenderPipeline {
    /**
        * Public members
        */
    public PostProcess originalPostProcess;
    public PostProcess downSampleX4PostProcess;
    public PostProcess brightPassPostProcess;
    public PostProcess[] blurHPostProcesses;
    public PostProcess[] blurVPostProcesses;
    public PostProcess textureAdderPostProcess;
    public PostProcess volumetricLightPostProcess;
    public BlurPostProcess volumetricLightSmoothXPostProcess;
    public BlurPostProcess volumetricLightSmoothYPostProcess;
    public PostProcess volumetricLightMergePostProces;
    public PostProcess volumetricLightFinalPostProcess;
    public PostProcess luminancePostProcess;
    public PostProcess[] luminanceDownSamplePostProcesses;
    public PostProcess hdrPostProcess;
    public PostProcess textureAdderFinalPostProcess;
    public PostProcess lensFlareFinalPostProcess;
    public PostProcess hdrFinalPostProcess;
    public PostProcess lensFlarePostProcess;
    public PostProcess lensFlareComposePostProcess;
    public PostProcess motionBlurPostProcess;
    public PostProcess depthOfFieldPostProcess;
    public double brightThreshold;
    public double blurWidth;
    public Boolean horizontalBlur;
    public double exposure;
    public Texture lensTexture;
    public double volumetricLightCoefficient;
    public double volumetricLightPower;
    public double volumetricLightBlurScale;
    public jsweet.util.union.Union<SpotLight,DirectionalLight> sourceLight;
    public double hdrMinimumLuminance;
    public double hdrDecreaseRate;
    public double hdrIncreaseRate;
    public Texture lensColorTexture;
    public double lensFlareStrength;
    public double lensFlareGhostDispersal;
    public double lensFlareHaloWidth;
    public double lensFlareDistortionStrength;
    public Texture lensStarTexture;
    public Texture lensFlareDirtTexture;
    public double depthOfFieldDistance;
    public double depthOfFieldBlurWidth;
    public double motionStrength;
    public Animation[] animations;
    public Boolean BloomEnabled;
    public Boolean DepthOfFieldEnabled;
    public Boolean LensFlareEnabled;
    public Boolean HDREnabled;
    public Boolean VLSEnabled;
    public Boolean MotionBlurEnabled;
    public double volumetricLightStepsCount;
    public double motionBlurSamples;
    /**
         * @constructor
         * @param {string} name - The rendering pipeline name
         * @param {BABYLON.Scene} scene - The scene linked to this pipeline
         * @param {any} ratio - The size of the postprocesses (0.5 means that your postprocess will have a width = canvas.width 0.5 and a height = canvas.height 0.5)
         * @param {BABYLON.PostProcess} originalPostProcess - the custom original color post-process. Must be "reusable". Can be null.
         * @param {BABYLON.Camera[]} cameras - The array of cameras that the rendering pipeline will be attached to
         */
    public StandardRenderingPipeline(String name, Scene scene, double ratio, PostProcess originalPostProcess, Camera[] cameras){}
    native public Object serialize();
    /**
         * Static members
         */
    native public static StandardRenderingPipeline Parse(Object source, Scene scene, String rootUrl);
    public static double LuminanceSteps;
    native public void dispose();
    /**
         * @constructor
         * @param {string} name - The rendering pipeline name
         * @param {BABYLON.Scene} scene - The scene linked to this pipeline
         * @param {any} ratio - The size of the postprocesses (0.5 means that your postprocess will have a width = canvas.width 0.5 and a height = canvas.height 0.5)
         * @param {BABYLON.PostProcess} originalPostProcess - the custom original color post-process. Must be "reusable". Can be null.
         * @param {BABYLON.Camera[]} cameras - The array of cameras that the rendering pipeline will be attached to
         */
    public StandardRenderingPipeline(String name, Scene scene, double ratio, PostProcess originalPostProcess){}
    /**
         * @constructor
         * @param {string} name - The rendering pipeline name
         * @param {BABYLON.Scene} scene - The scene linked to this pipeline
         * @param {any} ratio - The size of the postprocesses (0.5 means that your postprocess will have a width = canvas.width 0.5 and a height = canvas.height 0.5)
         * @param {BABYLON.PostProcess} originalPostProcess - the custom original color post-process. Must be "reusable". Can be null.
         * @param {BABYLON.Camera[]} cameras - The array of cameras that the rendering pipeline will be attached to
         */
    public StandardRenderingPipeline(String name, Scene scene, double ratio){}
    native public def.babylonjs.babylon.Effect originalPostProcess();
    native public def.babylonjs.babylon.Effect downSampleX4PostProcess();
    native public def.babylonjs.babylon.Effect brightPassPostProcess();
    native public def.babylonjs.babylon.Effect textureAdderPostProcess();
    native public def.babylonjs.babylon.Effect volumetricLightPostProcess();
    native public def.babylonjs.babylon.Effect volumetricLightMergePostProces();
    native public def.babylonjs.babylon.Effect volumetricLightFinalPostProcess();
    native public def.babylonjs.babylon.Effect luminancePostProcess();
    native public def.babylonjs.babylon.Effect hdrPostProcess();
    native public def.babylonjs.babylon.Effect textureAdderFinalPostProcess();
    native public def.babylonjs.babylon.Effect lensFlareFinalPostProcess();
    native public def.babylonjs.babylon.Effect hdrFinalPostProcess();
    native public def.babylonjs.babylon.Effect lensFlarePostProcess();
    native public def.babylonjs.babylon.Effect lensFlareComposePostProcess();
    native public def.babylonjs.babylon.Effect motionBlurPostProcess();
    native public def.babylonjs.babylon.Effect depthOfFieldPostProcess();
    protected StandardRenderingPipeline(){}
}

