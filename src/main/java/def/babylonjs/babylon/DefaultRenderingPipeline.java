package def.babylonjs.babylon;
@jsweet.lang.Extends({IDisposable.class,IAnimatable.class})
public class DefaultRenderingPipeline extends PostProcessRenderPipeline {
    public final String PassPostProcessId=null;
    public final String HighLightsPostProcessId=null;
    public final String BlurXPostProcessId=null;
    public final String BlurYPostProcessId=null;
    public final String CopyBackPostProcessId=null;
    public final String ImageProcessingPostProcessId=null;
    public final String FxaaPostProcessId=null;
    public final String FinalMergePostProcessId=null;
    public def.babylonjs.babylon.PassPostProcess pass;
    public def.babylonjs.babylon.HighlightsPostProcess highlights;
    public def.babylonjs.babylon.BlurPostProcess blurX;
    public def.babylonjs.babylon.BlurPostProcess blurY;
    public def.babylonjs.babylon.PassPostProcess copyBack;
    public FxaaPostProcess fxaa;
    public ImageProcessingPostProcess imageProcessing;
    public def.babylonjs.babylon.PassPostProcess finalMerge;
    public Animation[] animations;
    /**
         * Specifies the size of the bloom blur kernel, relative to the final output size
         */
    public double bloomKernel;
    public double bloomWeight;
    public double bloomScale;
    public Boolean bloomEnabled;
    public Boolean fxaaEnabled;
    public Boolean imageProcessingEnabled;
    /**
         * @constructor
         * @param {string} name - The rendering pipeline name
         * @param {BABYLON.Scene} scene - The scene linked to this pipeline
         * @param {any} ratio - The size of the postprocesses (0.5 means that your postprocess will have a width = canvas.width 0.5 and a height = canvas.height 0.5)
         * @param {BABYLON.Camera[]} cameras - The array of cameras that the rendering pipeline will be attached to
         */
    public DefaultRenderingPipeline(String name, Boolean hdr, Scene scene, Camera[] cameras){}
    native public Object serialize();
    native public static DefaultRenderingPipeline Parse(Object source, Scene scene, String rootUrl);
    native public void dispose();
    /**
         * @constructor
         * @param {string} name - The rendering pipeline name
         * @param {BABYLON.Scene} scene - The scene linked to this pipeline
         * @param {any} ratio - The size of the postprocesses (0.5 means that your postprocess will have a width = canvas.width 0.5 and a height = canvas.height 0.5)
         * @param {BABYLON.Camera[]} cameras - The array of cameras that the rendering pipeline will be attached to
         */
    public DefaultRenderingPipeline(String name, Boolean hdr, Scene scene){}
    protected DefaultRenderingPipeline(){}
}

