package def.babylonjs.babylon;
import def.js.ArrayBuffer;
/**
     * This represents a texture coming from an HDR input.
     *
     * The only supported format is currently panorama picture stored in RGBE format.
     * Example of such files can be found on HDRLib: http://hdrlib.com/
     */
public class HDRCubeTexture extends BaseTexture {
    /**
         * The texture URL.
         */
    public String url;
    /**
         * The texture coordinates mode. As this texture is stored in a cube format, please modify carefully.
         */
    public double coordinatesMode;
    /**
         * Specifies wether the texture has been generated through the PMREMGenerator tool.
         * This is usefull at run time to apply the good shader.
         */
    public Boolean isPMREM;
    public Boolean _isBlocking;
    /**
         * Sets wether or not the texture is blocking during loading.
         */
    public Boolean isBlocking;
    /**
         * Instantiates an HDRTexture from the following parameters.
         *
         * @param url The location of the HDR raw data (Panorama stored in RGBE format)
         * @param scene The scene the texture will be used in
         * @param size The cubemap desired size (the more it increases the longer the generation will be) If the size is omitted this implies you are using a preprocessed cubemap.
         * @param noMipmap Forces to not generate the mipmap if true
         * @param generateHarmonics Specifies wether you want to extract the polynomial harmonics during the generation process
         * @param useInGammaSpace Specifies if the texture will be use in gamma or linear space (the PBR material requires those texture in linear space, but the standard material would require them in Gamma space)
         * @param usePMREMGenerator Specifies wether or not to generate the CubeMap through CubeMapGen to avoid seams issue at run time.
         */
    public HDRCubeTexture(String url, Scene scene, double size, Boolean noMipmap, Boolean generateHarmonics, Boolean useInGammaSpace, Boolean usePMREMGenerator, java.lang.Runnable onLoad, java.lang.Runnable onError){}
    @jsweet.lang.Name("clone")
    native public HDRCubeTexture Clone();
    native public void delayLoad();
    native public Matrix getReflectionTextureMatrix();
    native public void setReflectionTextureMatrix(Matrix value);
    native public static HDRCubeTexture Parse(Object parsedTexture, Scene scene, String rootUrl);
    native public Object serialize();
    /**
         * Saves as a file the data contained in the texture in a binary format.
         * This can be used to prevent the long loading tie associated with creating the seamless texture as well
         * as the spherical used in the lighting.
         * @param url The HDR file url.
         * @param size The size of the texture data to generate (one of the cubemap face desired width).
         * @param onError Method called if any error happens during download.
         * @return The packed binary data.
         */
    native public static void generateBabylonHDROnDisk(String url, double size, java.lang.Runnable onError);
    /**
         * Serializes the data contained in the texture in a binary format.
         * This can be used to prevent the long loading tie associated with creating the seamless texture as well
         * as the spherical used in the lighting.
         * @param url The HDR file url.
         * @param size The size of the texture data to generate (one of the cubemap face desired width).
         * @param onError Method called if any error happens during download.
         * @return The packed binary data.
         */
    native public static void generateBabylonHDR(String url, double size, java.util.function.Consumer<ArrayBuffer> callback, java.lang.Runnable onError);
    /**
         * Instantiates an HDRTexture from the following parameters.
         *
         * @param url The location of the HDR raw data (Panorama stored in RGBE format)
         * @param scene The scene the texture will be used in
         * @param size The cubemap desired size (the more it increases the longer the generation will be) If the size is omitted this implies you are using a preprocessed cubemap.
         * @param noMipmap Forces to not generate the mipmap if true
         * @param generateHarmonics Specifies wether you want to extract the polynomial harmonics during the generation process
         * @param useInGammaSpace Specifies if the texture will be use in gamma or linear space (the PBR material requires those texture in linear space, but the standard material would require them in Gamma space)
         * @param usePMREMGenerator Specifies wether or not to generate the CubeMap through CubeMapGen to avoid seams issue at run time.
         */
    public HDRCubeTexture(String url, Scene scene, double size, Boolean noMipmap, Boolean generateHarmonics, Boolean useInGammaSpace, Boolean usePMREMGenerator, java.lang.Runnable onLoad){}
    /**
         * Instantiates an HDRTexture from the following parameters.
         *
         * @param url The location of the HDR raw data (Panorama stored in RGBE format)
         * @param scene The scene the texture will be used in
         * @param size The cubemap desired size (the more it increases the longer the generation will be) If the size is omitted this implies you are using a preprocessed cubemap.
         * @param noMipmap Forces to not generate the mipmap if true
         * @param generateHarmonics Specifies wether you want to extract the polynomial harmonics during the generation process
         * @param useInGammaSpace Specifies if the texture will be use in gamma or linear space (the PBR material requires those texture in linear space, but the standard material would require them in Gamma space)
         * @param usePMREMGenerator Specifies wether or not to generate the CubeMap through CubeMapGen to avoid seams issue at run time.
         */
    public HDRCubeTexture(String url, Scene scene, double size, Boolean noMipmap, Boolean generateHarmonics, Boolean useInGammaSpace, Boolean usePMREMGenerator){}
    /**
         * Instantiates an HDRTexture from the following parameters.
         *
         * @param url The location of the HDR raw data (Panorama stored in RGBE format)
         * @param scene The scene the texture will be used in
         * @param size The cubemap desired size (the more it increases the longer the generation will be) If the size is omitted this implies you are using a preprocessed cubemap.
         * @param noMipmap Forces to not generate the mipmap if true
         * @param generateHarmonics Specifies wether you want to extract the polynomial harmonics during the generation process
         * @param useInGammaSpace Specifies if the texture will be use in gamma or linear space (the PBR material requires those texture in linear space, but the standard material would require them in Gamma space)
         * @param usePMREMGenerator Specifies wether or not to generate the CubeMap through CubeMapGen to avoid seams issue at run time.
         */
    public HDRCubeTexture(String url, Scene scene, double size, Boolean noMipmap, Boolean generateHarmonics, Boolean useInGammaSpace){}
    /**
         * Instantiates an HDRTexture from the following parameters.
         *
         * @param url The location of the HDR raw data (Panorama stored in RGBE format)
         * @param scene The scene the texture will be used in
         * @param size The cubemap desired size (the more it increases the longer the generation will be) If the size is omitted this implies you are using a preprocessed cubemap.
         * @param noMipmap Forces to not generate the mipmap if true
         * @param generateHarmonics Specifies wether you want to extract the polynomial harmonics during the generation process
         * @param useInGammaSpace Specifies if the texture will be use in gamma or linear space (the PBR material requires those texture in linear space, but the standard material would require them in Gamma space)
         * @param usePMREMGenerator Specifies wether or not to generate the CubeMap through CubeMapGen to avoid seams issue at run time.
         */
    public HDRCubeTexture(String url, Scene scene, double size, Boolean noMipmap, Boolean generateHarmonics){}
    /**
         * Instantiates an HDRTexture from the following parameters.
         *
         * @param url The location of the HDR raw data (Panorama stored in RGBE format)
         * @param scene The scene the texture will be used in
         * @param size The cubemap desired size (the more it increases the longer the generation will be) If the size is omitted this implies you are using a preprocessed cubemap.
         * @param noMipmap Forces to not generate the mipmap if true
         * @param generateHarmonics Specifies wether you want to extract the polynomial harmonics during the generation process
         * @param useInGammaSpace Specifies if the texture will be use in gamma or linear space (the PBR material requires those texture in linear space, but the standard material would require them in Gamma space)
         * @param usePMREMGenerator Specifies wether or not to generate the CubeMap through CubeMapGen to avoid seams issue at run time.
         */
    public HDRCubeTexture(String url, Scene scene, double size, Boolean noMipmap){}
    /**
         * Instantiates an HDRTexture from the following parameters.
         *
         * @param url The location of the HDR raw data (Panorama stored in RGBE format)
         * @param scene The scene the texture will be used in
         * @param size The cubemap desired size (the more it increases the longer the generation will be) If the size is omitted this implies you are using a preprocessed cubemap.
         * @param noMipmap Forces to not generate the mipmap if true
         * @param generateHarmonics Specifies wether you want to extract the polynomial harmonics during the generation process
         * @param useInGammaSpace Specifies if the texture will be use in gamma or linear space (the PBR material requires those texture in linear space, but the standard material would require them in Gamma space)
         * @param usePMREMGenerator Specifies wether or not to generate the CubeMap through CubeMapGen to avoid seams issue at run time.
         */
    public HDRCubeTexture(String url, Scene scene, double size){}
    /**
         * Instantiates an HDRTexture from the following parameters.
         *
         * @param url The location of the HDR raw data (Panorama stored in RGBE format)
         * @param scene The scene the texture will be used in
         * @param size The cubemap desired size (the more it increases the longer the generation will be) If the size is omitted this implies you are using a preprocessed cubemap.
         * @param noMipmap Forces to not generate the mipmap if true
         * @param generateHarmonics Specifies wether you want to extract the polynomial harmonics during the generation process
         * @param useInGammaSpace Specifies if the texture will be use in gamma or linear space (the PBR material requires those texture in linear space, but the standard material would require them in Gamma space)
         * @param usePMREMGenerator Specifies wether or not to generate the CubeMap through CubeMapGen to avoid seams issue at run time.
         */
    public HDRCubeTexture(String url, Scene scene){}
    /**
         * Saves as a file the data contained in the texture in a binary format.
         * This can be used to prevent the long loading tie associated with creating the seamless texture as well
         * as the spherical used in the lighting.
         * @param url The HDR file url.
         * @param size The size of the texture data to generate (one of the cubemap face desired width).
         * @param onError Method called if any error happens during download.
         * @return The packed binary data.
         */
    native public static void generateBabylonHDROnDisk(String url, double size);
    /**
         * Serializes the data contained in the texture in a binary format.
         * This can be used to prevent the long loading tie associated with creating the seamless texture as well
         * as the spherical used in the lighting.
         * @param url The HDR file url.
         * @param size The size of the texture data to generate (one of the cubemap face desired width).
         * @param onError Method called if any error happens during download.
         * @return The packed binary data.
         */
    native public static void generateBabylonHDR(String url, double size, java.util.function.Consumer<ArrayBuffer> callback);
    protected HDRCubeTexture(){}
}

