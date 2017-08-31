package def.babylonjs.babylon;
/**
     * This represents a color grading texture. This acts as a lookup table LUT, useful during post process
     * It can help converting any input color in a desired output one. This can then be used to create effects
     * from sepia, black and white to sixties or futuristic rendering...
     *
     * The only supported format is currently 3dl.
     * More information on LUT: https://en.wikipedia.org/wiki/3D_lookup_table/
     */
public class ColorGradingTexture extends BaseTexture {
    /**
         * The texture URL.
         */
    public String url;
    /**
         * Instantiates a ColorGradingTexture from the following parameters.
         *
         * @param url The location of the color gradind data (currently only supporting 3dl)
         * @param scene The scene the texture will be used in
         */
    public ColorGradingTexture(String url, Scene scene){}
    /**
         * Returns the texture matrix used in most of the material.
         * This is not used in color grading but keep for troubleshooting purpose (easily swap diffuse by colorgrading to look in).
         */
    native public Matrix getTextureMatrix();
    /**
         * Clones the color gradind texture.
         */
    @jsweet.lang.Name("clone")
    native public ColorGradingTexture Clone();
    /**
         * Called during delayed load for textures.
         */
    native public void delayLoad();
    /**
         * Parses a color grading texture serialized by Babylon.
         * @param parsedTexture The texture information being parsedTexture
         * @param scene The scene to load the texture in
         * @param rootUrl The root url of the data assets to load
         * @return A color gradind texture
         */
    native public static ColorGradingTexture Parse(Object parsedTexture, Scene scene, String rootUrl);
    /**
         * Serializes the LUT texture to json format.
         */
    native public Object serialize();
    protected ColorGradingTexture(){}
}

