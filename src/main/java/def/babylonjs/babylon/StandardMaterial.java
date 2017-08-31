package def.babylonjs.babylon;
import jsweet.util.function.Function5;
public class StandardMaterial extends PushMaterial {
    public BaseTexture diffuseTexture;
    public BaseTexture ambientTexture;
    public BaseTexture opacityTexture;
    public BaseTexture reflectionTexture;
    public BaseTexture emissiveTexture;
    public BaseTexture specularTexture;
    public BaseTexture bumpTexture;
    public BaseTexture lightmapTexture;
    public BaseTexture refractionTexture;
    public Color3 ambientColor;
    public Color3 diffuseColor;
    public Color3 specularColor;
    public Color3 emissiveColor;
    public double specularPower;
    public Boolean useAlphaFromDiffuseTexture;
    public Boolean useEmissiveAsIllumination;
    public Boolean linkEmissiveWithDiffuse;
    public Boolean useSpecularOverAlpha;
    public Boolean useReflectionOverAlpha;
    public Boolean disableLighting;
    public Boolean useParallax;
    public Boolean useParallaxOcclusion;
    public double parallaxScaleBias;
    public double roughness;
    public double indexOfRefraction;
    public Boolean invertRefractionY;
    public Boolean useLightmapAsShadowmap;
    public FresnelParameters diffuseFresnelParameters;
    public FresnelParameters opacityFresnelParameters;
    public FresnelParameters reflectionFresnelParameters;
    public FresnelParameters refractionFresnelParameters;
    public FresnelParameters emissiveFresnelParameters;
    public Boolean useReflectionFresnelFromSpecular;
    public Boolean useGlossinessFromSpecularMapAlpha;
    public double maxSimultaneousLights;
    public Boolean invertNormalMapX;
    public Boolean invertNormalMapY;
    public Boolean twoSidedLighting;
    /**
         * Default configuration related to image processing available in the standard Material.
         */
    public ImageProcessingConfiguration _imageProcessingConfiguration;
    /**
         * Sets the Default image processing configuration used either in the this material.
         *
         * If sets to null, the scene one is in use.
         */
    public ImageProcessingConfiguration imageProcessingConfiguration;
    /**
         * Attaches a new image processing configuration to the Standard Material.
         * @param configuration
         */
    native public void _attachImageProcessingConfiguration(ImageProcessingConfiguration configuration);
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
    public Function5<String,String[],String[],String[],StandardMaterialDefines,String> customShaderNameResolve;
    public SmartArray<RenderTargetTexture> _renderTargets;
    public Matrix _worldViewProjectionMatrix;
    public Color3 _globalAmbientColor;
    public Boolean _useLogarithmicDepth;
    public StandardMaterial(String name, Scene scene){}
    native public String getClassName();
    public Boolean useLogarithmicDepth;
    native public Boolean needAlphaBlending();
    native public Boolean needAlphaTesting();
    native public Boolean _shouldUseAlphaFromDiffuseTexture();
    native public BaseTexture getAlphaTestTexture();
    /**
         * Child classes can use it to update shaders
         */
    native public Boolean isReadyForSubMesh(AbstractMesh mesh, SubMesh subMesh, Boolean useInstances);
    native public void buildUniformLayout();
    native public void unbind();
    native public void bindForSubMesh(Matrix world, Mesh mesh, SubMesh subMesh);
    native public IAnimatable[] getAnimatables();
    native public BaseTexture[] getActiveTextures();
    native public Boolean hasTexture(BaseTexture texture);
    native public void dispose(Boolean forceDisposeEffect, Boolean forceDisposeTextures);
    native public StandardMaterial clone(String name);
    native public Object serialize();
    native public static StandardMaterial Parse(Object source, Scene scene, String rootUrl);
    public static Boolean _DiffuseTextureEnabled;
    public static Boolean DiffuseTextureEnabled;
    public static Boolean _AmbientTextureEnabled;
    public static Boolean AmbientTextureEnabled;
    public static Boolean _OpacityTextureEnabled;
    public static Boolean OpacityTextureEnabled;
    public static Boolean _ReflectionTextureEnabled;
    public static Boolean ReflectionTextureEnabled;
    public static Boolean _EmissiveTextureEnabled;
    public static Boolean EmissiveTextureEnabled;
    public static Boolean _SpecularTextureEnabled;
    public static Boolean SpecularTextureEnabled;
    public static Boolean _BumpTextureEnabled;
    public static Boolean BumpTextureEnabled;
    public static Boolean _LightmapTextureEnabled;
    public static Boolean LightmapTextureEnabled;
    public static Boolean _RefractionTextureEnabled;
    public static Boolean RefractionTextureEnabled;
    public static Boolean _ColorGradingTextureEnabled;
    public static Boolean ColorGradingTextureEnabled;
    public static Boolean _FresnelEnabled;
    public static Boolean FresnelEnabled;
    /**
         * Child classes can use it to update shaders
         */
    native public Boolean isReadyForSubMesh(AbstractMesh mesh, SubMesh subMesh);
    native public void dispose(Boolean forceDisposeEffect);
    native public void dispose();
    native public String customShaderNameResolve(String p1, String[] p2, String[] p3, String[] p4, StandardMaterialDefines p5);
    protected StandardMaterial(){}
}

