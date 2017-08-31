package def.babylonjs.babylon;
/**
     * This groups together the common properties used for image processing either in direct forward pass
     * or through post processing effect depending on the use of the image processing pipeline in your scene
     * or not.
     */
public class ImageProcessingConfiguration extends def.js.Object {
    /**
         * Color curves setup used in the effect if colorCurvesEnabled is set to true
         */
    public ColorCurves colorCurves;
    /**
         * Sets wether the color curves effect is enabled.
         */
    public Boolean colorCurvesEnabled;
    /**
         * Color grading LUT texture used in the effect if colorGradingEnabled is set to true
         */
    public BaseTexture colorGradingTexture;
    /**
         * Sets wether the color grading effect is enabled.
         */
    public Boolean colorGradingEnabled;
    /**
         * Sets wether the color grading effect is using a green depth for the 3d Texture.
         */
    public Boolean colorGradingWithGreenDepth;
    /**
         * Sets wether the color grading texture contains BGR values.
         */
    public Boolean colorGradingBGR;
    public double _exposure;
    /**
         * Sets the Exposure used in the effect.
         */
    public double exposure;
    /**
         * Sets wether the tone mapping effect is enabled.
         */
    public Boolean toneMappingEnabled;
    public double _contrast;
    /**
         * Sets the contrast used in the effect.
         */
    public double contrast;
    /**
         * Vignette stretch size.
         */
    public double vignetteStretch;
    /**
         * Vignette centre X Offset.
         */
    public double vignetteCentreX;
    /**
         * Vignette centre Y Offset.
         */
    public double vignetteCentreY;
    /**
         * Vignette weight or intensity of the vignette effect.
         */
    public double vignetteWeight;
    /**
         * Color of the vignette applied on the screen through the chosen blend mode (vignetteBlendMode)
         * if vignetteEnabled is set to true.
         */
    public def.babylonjs.babylon.Color4 vignetteColor;
    /**
         * Camera field of view used by the Vignette effect.
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
         * Sets wether the image processing is applied through a post process or not.
         */
    public Boolean applyByPostProcess;
    /**
        * An event triggered when the configuration changes and requires Shader to Update some parameters.
        * @type {BABYLON.Observable}
        */
    public Observable<ImageProcessingConfiguration> onUpdateParameters;
    /**
         * Method called each time the image processing information changes requires to recompile the effect.
         */
    native public void _updateParameters();
    /**
         * Prepare the list of uniforms associated with the Image Processing effects.
         * @param uniformsList The list of uniforms used in the effect
         * @param defines the list of defines currently in use
         */
    native public static void PrepareUniforms(String[] uniforms, IImageProcessingConfigurationDefines defines);
    /**
         * Prepare the list of samplers associated with the Image Processing effects.
         * @param uniformsList The list of uniforms used in the effect
         * @param defines the list of defines currently in use
         */
    native public static void PrepareSamplers(String[] samplersList, IImageProcessingConfigurationDefines defines);
    /**
         * Prepare the list of defines associated to the shader.
         * @param defines the list of defines to complete
         */
    native public void prepareDefines(IImageProcessingConfigurationDefines defines);
    /**
         * Returns true if all the image processing information are ready.
         */
    native public Boolean isReady();
    /**
         * Binds the image processing to the shader.
         * @param effect The effect to bind to
         */
    native public void bind(Effect effect, double aspectRatio);
    /**
         * Clones the current image processing instance.
         * @return The cloned image processing
         */
    @jsweet.lang.Name("clone")
    native public ImageProcessingConfiguration Clone();
    /**
         * Serializes the current image processing instance to a json representation.
         * @return a JSON representation
         */
    native public Object serialize();
    /**
         * Parses the image processing from a json representation.
         * @param source the JSON source to parse
         * @return The parsed image processing
         */
    native public static ImageProcessingConfiguration Parse(Object source);
    /**
         * Used to apply the vignette as a mix with the pixel color.
         */
    public static final double VIGNETTEMODE_MULTIPLY=0;
    /**
         * Used to apply the vignette as a replacement of the pixel color.
         */
    public static final double VIGNETTEMODE_OPAQUE=0;
    /**
         * Binds the image processing to the shader.
         * @param effect The effect to bind to
         */
    native public void bind(Effect effect);
}

