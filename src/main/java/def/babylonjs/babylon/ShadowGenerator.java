package def.babylonjs.babylon;
public class ShadowGenerator extends IShadowGenerator {
    public static final double FILTER_NONE=0;
    public static final double FILTER_POISSONSAMPLING=0;
    public static final double FILTER_EXPONENTIALSHADOWMAP=0;
    public static final double FILTER_BLUREXPONENTIALSHADOWMAP=0;
    public static final double FILTER_CLOSEEXPONENTIALSHADOWMAP=0;
    public static final double FILTER_BLURCLOSEEXPONENTIALSHADOWMAP=0;
    public double bias;
    public double blurBoxOffset;
    public double blurScale;
    public double blurKernel;
    public Boolean useKernelBlur;
    public double depthScale;
    public double filter;
    public Boolean usePoissonSampling;
    public Boolean useVarianceShadowMap;
    public Boolean useBlurVarianceShadowMap;
    public Boolean useExponentialShadowMap;
    public Boolean useBlurExponentialShadowMap;
    public Boolean useCloseExponentialShadowMap;
    public Boolean useBlurCloseExponentialShadowMap;
    /**
         * Returns the darkness value (float).
         */
    native public double getDarkness();
    /**
         * Sets the ShadowGenerator darkness value (float <= 1.0).
         * Returns the ShadowGenerator.
         */
    native public ShadowGenerator setDarkness(double darkness);
    /**
         * Sets the ability to have transparent shadow (boolean).
         * Returns the ShadowGenerator.
         */
    native public ShadowGenerator setTransparencyShadow(Boolean hasShadow);
    /**
         * Returns a RenderTargetTexture object : the shadow map texture.
         */
    native public RenderTargetTexture getShadowMap();
    /**
         * Returns the most ready computed shadow map as a RenderTargetTexture object.
         */
    native public RenderTargetTexture getShadowMapForRendering();
    /**
         * Returns the associated light object.
         */
    native public IShadowLight getLight();
    public Boolean forceBackFacesOnly;
    /**
         * Creates a ShadowGenerator object.
         * A ShadowGenerator is the required tool to use the shadows.
         * Each light casting shadows needs to use its own ShadowGenerator.
         * Required parameters :
         * - `mapSize` (integer): the size of the texture what stores the shadows. Example : 1024.
         * - `light`: the light object generating the shadows.
         * - `useFullFloatFirst`: by default the generator will try to use half float textures but if you need precision (for self shadowing for instance), you can use this option to enforce full float texture.
         * Documentation : http://doc.babylonjs.com/tutorials/shadows
         */
    public ShadowGenerator(double mapSize, IShadowLight light, Boolean useFullFloatFirst){}
    /**
         * Boolean : true when the ShadowGenerator is finally computed.
         */
    native public Boolean isReady(SubMesh subMesh, Boolean useInstances);
    /**
         * This creates the defines related to the standard BJS materials.
         */
    native public void prepareDefines(MaterialDefines defines, double lightIndex);
    /**
         * This binds shadow lights related to the standard BJS materials.
         * It implies the unifroms available on the materials are the standard BJS ones.
         */
    native public void bindShadowLight(String lightIndex, Effect effect);
    /**
         * Returns a Matrix object : the updated transformation matrix.
         */
    native public Matrix getTransformMatrix();
    native public void recreateShadowMap();
    /**
         * Disposes the ShadowGenerator.
         * Returns nothing.
         */
    native public void dispose();
    /**
         * Serializes the ShadowGenerator and returns a serializationObject.
         */
    native public Object serialize();
    /**
         * Parses a serialized ShadowGenerator and returns a new ShadowGenerator.
         */
    native public static ShadowGenerator Parse(Object parsedShadowGenerator, Scene scene);
    /**
         * Creates a ShadowGenerator object.
         * A ShadowGenerator is the required tool to use the shadows.
         * Each light casting shadows needs to use its own ShadowGenerator.
         * Required parameters :
         * - `mapSize` (integer): the size of the texture what stores the shadows. Example : 1024.
         * - `light`: the light object generating the shadows.
         * - `useFullFloatFirst`: by default the generator will try to use half float textures but if you need precision (for self shadowing for instance), you can use this option to enforce full float texture.
         * Documentation : http://doc.babylonjs.com/tutorials/shadows
         */
    public ShadowGenerator(double mapSize, IShadowLight light){}
    protected ShadowGenerator(){}
}

