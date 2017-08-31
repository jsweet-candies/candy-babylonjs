package def.babylonjs.babylon;
/**
     * The color grading curves provide additional color adjustmnent that is applied after any color grading transform (3D LUT).
     * They allow basic adjustment of saturation and small exposure adjustments, along with color filter tinting to provide white balance adjustment or more stylistic effects.
     * These are similar to controls found in many professional imaging or colorist software. The global controls are applied to the entire image. For advanced tuning, extra controls are provided to adjust the shadow, midtone and highlight areas of the image;
     * corresponding to low luminance, medium luminance, and high luminance areas respectively.
     */
public class ColorCurves extends def.js.Object {
    /**
         * Sets the global Hue value.
         * The hue value is a standard HSB hue in the range [0,360] where 0=red, 120=green and 240=blue. The default value is 30 degrees (orange).
         */
    public double globalHue;
    /**
         * Sets the global Density value.
         * The density value is in range [-100,+100] where 0 means the color filter has no effect and +100 means the color filter has maximum effect.
         * Values less than zero provide a filter of opposite hue.
         */
    public double globalDensity;
    /**
         * Sets the global Saturation value.
         * This is an adjustment value in the range [-100,+100], where the default value of 0.0 makes no adjustment, positive values increase saturation and negative values decrease saturation.
         */
    public double globalSaturation;
    /**
         * Sets the highlights Hue value.
         * The hue value is a standard HSB hue in the range [0,360] where 0=red, 120=green and 240=blue. The default value is 30 degrees (orange).
         */
    public double highlightsHue;
    /**
         * Sets the highlights Density value.
         * The density value is in range [-100,+100] where 0 means the color filter has no effect and +100 means the color filter has maximum effect.
         * Values less than zero provide a filter of opposite hue.
         */
    public double highlightsDensity;
    /**
         * Sets the highlights Saturation value.
         * This is an adjustment value in the range [-100,+100], where the default value of 0.0 makes no adjustment, positive values increase saturation and negative values decrease saturation.
         */
    public double highlightsSaturation;
    /**
         * Sets the highlights Exposure value.
         * This is an adjustment value in the range [-100,+100], where the default value of 0.0 makes no adjustment, positive values increase exposure and negative values decrease exposure.
         */
    public double highlightsExposure;
    /**
         * Sets the midtones Hue value.
         * The hue value is a standard HSB hue in the range [0,360] where 0=red, 120=green and 240=blue. The default value is 30 degrees (orange).
         */
    public double midtonesHue;
    /**
         * Sets the midtones Density value.
         * The density value is in range [-100,+100] where 0 means the color filter has no effect and +100 means the color filter has maximum effect.
         * Values less than zero provide a filter of opposite hue.
         */
    public double midtonesDensity;
    /**
         * Sets the midtones Saturation value.
         * This is an adjustment value in the range [-100,+100], where the default value of 0.0 makes no adjustment, positive values increase saturation and negative values decrease saturation.
         */
    public double midtonesSaturation;
    /**
         * Sets the midtones Exposure value.
         * This is an adjustment value in the range [-100,+100], where the default value of 0.0 makes no adjustment, positive values increase exposure and negative values decrease exposure.
         */
    public double midtonesExposure;
    /**
         * Sets the shadows Hue value.
         * The hue value is a standard HSB hue in the range [0,360] where 0=red, 120=green and 240=blue. The default value is 30 degrees (orange).
         */
    public double shadowsHue;
    /**
         * Sets the shadows Density value.
         * The density value is in range [-100,+100] where 0 means the color filter has no effect and +100 means the color filter has maximum effect.
         * Values less than zero provide a filter of opposite hue.
         */
    public double shadowsDensity;
    /**
         * Sets the shadows Saturation value.
         * This is an adjustment value in the range [-100,+100], where the default value of 0.0 makes no adjustment, positive values increase saturation and negative values decrease saturation.
         */
    public double shadowsSaturation;
    /**
         * Sets the shadows Exposure value.
         * This is an adjustment value in the range [-100,+100], where the default value of 0.0 makes no adjustment, positive values increase exposure and negative values decrease exposure.
         */
    public double shadowsExposure;
    /**
         * Binds the color curves to the shader.
         * @param colorCurves The color curve to bind
         * @param effect The effect to bind to
         */
    native public static void Bind(ColorCurves colorCurves, Effect effect, String positiveUniform, String neutralUniform, String negativeUniform);
    /**
         * Prepare the list of uniforms associated with the ColorCurves effects.
         * @param uniformsList The list of uniforms used in the effect
         */
    native public static void PrepareUniforms(String[] uniformsList);
    /**
         * Clones the current color curve instance.
         * @return The cloned curves
         */
    @jsweet.lang.Name("clone")
    native public ColorCurves Clone();
    /**
         * Serializes the current color curve instance to a json representation.
         * @return a JSON representation
         */
    native public Object serialize();
    /**
         * Parses the color curve from a json representation.
         * @param source the JSON source to parse
         * @return The parsed curves
         */
    native public static ColorCurves Parse(Object source);
    /**
         * Binds the color curves to the shader.
         * @param colorCurves The color curve to bind
         * @param effect The effect to bind to
         */
    native public static void Bind(ColorCurves colorCurves, Effect effect, String positiveUniform, String neutralUniform);
    /**
         * Binds the color curves to the shader.
         * @param colorCurves The color curve to bind
         * @param effect The effect to bind to
         */
    native public static void Bind(ColorCurves colorCurves, Effect effect, String positiveUniform);
    /**
         * Binds the color curves to the shader.
         * @param colorCurves The color curve to bind
         * @param effect The effect to bind to
         */
    native public static void Bind(ColorCurves colorCurves, Effect effect);
}

