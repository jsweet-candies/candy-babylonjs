package def.babylonjs.babylon;
public class ImageProcessingPostProcess extends PostProcess {
    /**
         * Default configuration related to image processing available in the PBR Material.
         */
    public ImageProcessingConfiguration _imageProcessingConfiguration;
    /**
         * Sets the Default image processing configuration used either in the this material.
         *
         * If sets to null, the scene one is in use.
         */
    public ImageProcessingConfiguration imageProcessingConfiguration;
    /**
         * Attaches a new image processing configuration to the PBR Material.
         * @param configuration
         */
    native public void _attachImageProcessingConfiguration(ImageProcessingConfiguration configuration);
    /**
         * Sets Color curves setup used in the effect if colorCurvesEnabled is set to true .
         */
    public ColorCurves colorCurves;
    /**
         * Sets wether the color curves effect is enabled.
         */
    public Boolean colorCurvesEnabled;
    /**
         * Sets Color grading LUT texture used in the effect if colorGradingEnabled is set to true.
         */
    public BaseTexture colorGradingTexture;
    /**
         * Gets wether the color grading effect is enabled.
         */
    public Boolean colorGradingEnabled;
    /**
         * Sets exposure used in the effect.
         */
    public double exposure;
    /**
         * Sets wether tonemapping is enabled or not
         */
    public Boolean toneMappingEnabled;
    /**
         * Sets contrast used in the effect.
         */
    public double contrast;
    /**
         * Sets Vignette stretch size.
         */
    public double vignetteStretch;
    /**
         * Sets Vignette centre X Offset.
         */
    public double vignetteCentreX;
    /**
         * Sets Vignette centre Y Offset.
         */
    public double vignetteCentreY;
    /**
         * Sets Vignette weight or intensity of the vignette effect.
         */
    public double vignetteWeight;
    /**
         * Sets Color of the vignette applied on the screen through the chosen blend mode (vignetteBlendMode)
         * if vignetteEnabled is set to true.
         */
    public Color4 vignetteColor;
    /**
         * Sets Camera field of view used by the Vignette effect.
         */
    public double vignetteCameraFov;
    /**
         * Sets the vignette blend mode allowing different kind of effect.
         */
    public double vignetteBlendMode;
    /**
         * Sets wether the vignette effect is enabled.
         */
    public Boolean vignetteEnabled;
    /**
         * Sets wether the input of the processing is in Gamma or Linear Space.
         */
    public Boolean fromLinearSpace;
    public ImageProcessingPostProcess(String name, double options, Camera camera, double samplingMode, Engine engine, Boolean reusable, double textureType){}
    native public void _updateParameters();
    native public void dispose(Camera camera);
    public ImageProcessingPostProcess(String name, double options, Camera camera, double samplingMode, Engine engine, Boolean reusable){}
    public ImageProcessingPostProcess(String name, double options, Camera camera, double samplingMode, Engine engine){}
    public ImageProcessingPostProcess(String name, double options, Camera camera, double samplingMode){}
    public ImageProcessingPostProcess(String name, double options, Camera camera){}
    public ImageProcessingPostProcess(String name, double options){}
    native public void dispose();
    public ImageProcessingPostProcess(String name, PostProcessOptionsData options, Camera camera, double samplingMode, Engine engine, Boolean reusable, double textureType){}
    public ImageProcessingPostProcess(String name, PostProcessOptionsData options, Camera camera, double samplingMode, Engine engine, Boolean reusable){}
    public ImageProcessingPostProcess(String name, PostProcessOptionsData options, Camera camera, double samplingMode, Engine engine){}
    public ImageProcessingPostProcess(String name, PostProcessOptionsData options, Camera camera, double samplingMode){}
    public ImageProcessingPostProcess(String name, PostProcessOptionsData options, Camera camera){}
    public ImageProcessingPostProcess(String name, PostProcessOptionsData options){}
    protected ImageProcessingPostProcess(){}
}

