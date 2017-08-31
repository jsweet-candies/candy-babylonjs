package def.babylonjs.babylon;
/**
     * The Physically based material of BJS.
     *
     * This offers the main features of a standard PBR material.
     * For more information, please refer to the documentation :
     * http://doc.babylonjs.com/extensions/Physically_Based_Rendering
     */
public class PBRMaterial extends PBRBaseMaterial {
    /**
         * PBRMaterialTransparencyMode: No transparency mode, Alpha channel is not use.
         */
    public static final double PBRMATERIAL_OPAQUE=0;
    /**
         * PBRMaterialTransparencyMode: Alpha Test mode, pixel are discarded below a certain threshold defined by the alpha cutoff value.
         */
    public static final double PBRMATERIAL_ALPHATEST=0;
    /**
         * PBRMaterialTransparencyMode: Pixels are blended (according to the alpha mode) with the already drawn pixels in the current frame buffer.
         */
    public static final double PBRMATERIAL_ALPHABLEND=0;
    /**
         * PBRMaterialTransparencyMode: Pixels are blended (according to the alpha mode) with the already drawn pixels in the current frame buffer.
         * They are also discarded below the alpha cutoff threshold to improve performances.
         */
    public static final double PBRMATERIAL_ALPHATESTANDBLEND=0;
    /**
         * Intensity of the direct lights e.g. the four lights available in your scene.
         * This impacts both the direct diffuse and specular highlights.
         */
    public double directIntensity;
    /**
         * Intensity of the emissive part of the material.
         * This helps controlling the emissive effect without modifying the emissive color.
         */
    public double emissiveIntensity;
    /**
         * Intensity of the environment e.g. how much the environment will light the object
         * either through harmonics for rough material or through the refelction for shiny ones.
         */
    public double environmentIntensity;
    /**
         * This is a special control allowing the reduction of the specular highlights coming from the
         * four lights of the scene. Those highlights may not be needed in full environment lighting.
         */
    public double specularIntensity;
    /**
         * Debug Control allowing disabling the bump map on this material.
         */
    public Boolean disableBumpMap;
    /**
         * AKA Diffuse Texture in standard nomenclature.
         */
    public BaseTexture albedoTexture;
    /**
         * AKA Occlusion Texture in other nomenclature.
         */
    public BaseTexture ambientTexture;
    /**
         * AKA Occlusion Texture Intensity in other nomenclature.
         */
    public double ambientTextureStrength;
    public BaseTexture opacityTexture;
    public BaseTexture reflectionTexture;
    public BaseTexture emissiveTexture;
    /**
         * AKA Specular texture in other nomenclature.
         */
    public BaseTexture reflectivityTexture;
    /**
         * Used to switch from specular/glossiness to metallic/roughness workflow.
         */
    public BaseTexture metallicTexture;
    /**
         * Specifies the metallic scalar of the metallic/roughness workflow.
         * Can also be used to scale the metalness values of the metallic texture.
         */
    public double metallic;
    /**
         * Specifies the roughness scalar of the metallic/roughness workflow.
         * Can also be used to scale the roughness values of the metallic texture.
         */
    public double roughness;
    /**
         * Used to enable roughness/glossiness fetch from a separate chanel depending on the current mode.
         * Gray Scale represents roughness in metallic mode and glossiness in specular mode.
         */
    public BaseTexture microSurfaceTexture;
    public BaseTexture bumpTexture;
    public BaseTexture lightmapTexture;
    public BaseTexture refractionTexture;
    public Color3 ambientColor;
    /**
         * AKA Diffuse Color in other nomenclature.
         */
    public Color3 albedoColor;
    /**
         * AKA Specular Color in other nomenclature.
         */
    public Color3 reflectivityColor;
    public Color3 reflectionColor;
    public Color3 emissiveColor;
    /**
         * AKA Glossiness in other nomenclature.
         */
    public double microSurface;
    /**
         * source material index of refraction (IOR)' / 'destination material IOR.
         */
    public double indexOfRefraction;
    /**
         * Controls if refraction needs to be inverted on Y. This could be usefull for procedural texture.
         */
    public Boolean invertRefractionY;
    /**
         * This parameters will make the material used its opacity to control how much it is refracting aginst not.
         * Materials half opaque for instance using refraction could benefit from this control.
         */
    public Boolean linkRefractionWithTransparency;
    public Boolean useLightmapAsShadowmap;
    /**
         * Specifies that the alpha is coming form the albedo channel alpha channel.
         */
    public Boolean useAlphaFromAlbedoTexture;
    /**
         * Specifies that the material will keeps the specular highlights over a transparent surface (only the most limunous ones).
         * A car glass is a good exemple of that. When sun reflects on it you can not see what is behind.
         */
    public Boolean useSpecularOverAlpha;
    /**
         * Specifies if the reflectivity texture contains the glossiness information in its alpha channel.
         */
    public Boolean useMicroSurfaceFromReflectivityMapAlpha;
    /**
         * Specifies if the metallic texture contains the roughness information in its alpha channel.
         */
    public Boolean useRoughnessFromMetallicTextureAlpha;
    /**
         * Specifies if the metallic texture contains the roughness information in its green channel.
         */
    public Boolean useRoughnessFromMetallicTextureGreen;
    /**
         * Specifies if the metallic texture contains the metallness information in its blue channel.
         */
    public Boolean useMetallnessFromMetallicTextureBlue;
    /**
         * Specifies if the metallic texture contains the ambient occlusion information in its red channel.
         */
    public Boolean useAmbientOcclusionFromMetallicTextureRed;
    /**
         * Specifies if the ambient texture contains the ambient occlusion information in its red channel only.
         */
    public Boolean useAmbientInGrayScale;
    /**
         * In case the reflectivity map does not contain the microsurface information in its alpha channel,
         * The material will try to infer what glossiness each pixel should be.
         */
    public Boolean useAutoMicroSurfaceFromReflectivityMap;
    /**
         * BJS is using an harcoded light falloff based on a manually sets up range.
         * In PBR, one way to represents the fallof is to use the inverse squared root algorythm.
         * This parameter can help you switch back to the BJS mode in order to create scenes using both materials.
         */
    public Boolean usePhysicalLightFalloff;
    /**
         * Specifies that the material will keeps the reflection highlights over a transparent surface (only the most limunous ones).
         * A car glass is a good exemple of that. When the street lights reflects on it you can not see what is behind.
         */
    public Boolean useRadianceOverAlpha;
    /**
         * Allows using the bump map in parallax mode.
         */
    public Boolean useParallax;
    /**
         * Allows using the bump map in parallax occlusion mode.
         */
    public Boolean useParallaxOcclusion;
    /**
         * Controls the scale bias of the parallax mode.
         */
    public double parallaxScaleBias;
    /**
         * If sets to true, disables all the lights affecting the material.
         */
    public Boolean disableLighting;
    /**
         * Number of Simultaneous lights allowed on the material.
         */
    public double maxSimultaneousLights;
    /**
         * If sets to true, x component of normal map value will invert (x = 1.0 - x).
         */
    public Boolean invertNormalMapX;
    /**
         * If sets to true, y component of normal map value will invert (y = 1.0 - y).
         */
    public Boolean invertNormalMapY;
    /**
         * If sets to true and backfaceCulling is false, normals will be flipped on the backside.
         */
    public Boolean twoSidedLighting;
    /**
         * Specifies that the alpha is premultiplied before output (this enables alpha premultiplied blending).
         * in your scene composition.
         */
    public Boolean premultiplyAlpha;
    /**
         * A fresnel is applied to the alpha of the model to ensure grazing angles edges are not alpha tested.
         * And/Or occlude the blended part.
         */
    public Boolean useAlphaFresnel;
    /**
         * A fresnel is applied to the alpha of the model to ensure grazing angles edges are not alpha tested.
         * And/Or occlude the blended part.
         */
    public BaseTexture environmentBRDFTexture;
    /**
         * Sets the Default image processing configuration used either in the this material.
         *
         * If sets to null, the scene one is in use.
         */
    public ImageProcessingConfiguration imageProcessingConfiguration;
    /**
         * Sets wether the color curves effect is enabled.
         */
    public Boolean cameraColorCurvesEnabled;
    /**
         * Gets wether the color grading effect is enabled.
         */
    public Boolean cameraColorGradingEnabled;
    /**
         * Sets wether tonemapping is enabled or not
         */
    public Boolean cameraToneMappingEnabled;
    /**
         * The camera exposure used on this material.
         * This property is here and not in the camera to allow controlling exposure without full screen post process.
         * This corresponds to a photographic exposure.
         */
    public double cameraExposure;
    /**
         * Sets The camera contrast used on this material.
         */
    public double cameraContrast;
    /**
         * Sets the Color Grading 2D Lookup Texture.
         */
    public BaseTexture cameraColorGradingTexture;
    /**
         * The color grading curves provide additional color adjustmnent that is applied after any color grading transform (3D LUT).
         * They allow basic adjustment of saturation and small exposure adjustments, along with color filter tinting to provide white balance adjustment or more stylistic effects.
         * These are similar to controls found in many professional imaging or colorist software. The global controls are applied to the entire image. For advanced tuning, extra controls are provided to adjust the shadow, midtone and highlight areas of the image;
         * corresponding to low luminance, medium luminance, and high luminance areas respectively.
         */
    public ColorCurves cameraColorCurves;
    /**
         * Instantiates a new PBRMaterial instance.
         *
         * @param name The material name
         * @param scene The scene the material will be use in.
         */
    public PBRMaterial(String name, Scene scene){}
    native public String getClassName();
    native public BaseTexture[] getActiveTextures();
    native public Boolean hasTexture(BaseTexture texture);
    native public PBRMaterial clone(String name);
    native public Object serialize();
    native public static PBRMaterial Parse(Object source, Scene scene, String rootUrl);
    protected PBRMaterial(){}
}

