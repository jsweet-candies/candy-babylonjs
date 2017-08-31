package def.babylonjs.babylon;
public class Light extends Node {
    /**
         * If every light affecting the material is in this lightmapMode,
         * material.lightmapTexture adds or multiplies
         * (depends on material.useLightmapAsShadowmap)
         * after every other light calculations.
         */
    public static final double LIGHTMAP_DEFAULT=0;
    /**
         * material.lightmapTexture as only diffuse lighting from this light
         * adds pnly specular lighting from this light
         * adds dynamic shadows
         */
    public static final double LIGHTMAP_SPECULAR=0;
    /**
         * material.lightmapTexture as only lighting
         * no light calculation from this light
         * only adds dynamic shadows from this light
         */
    public static final double LIGHTMAP_SHADOWSONLY=0;
    /**
         * Each light type uses the default quantity according to its type:
         *      point/spot lights use luminous intensity
         *      directional lights use illuminance
         */
    public static final double INTENSITYMODE_AUTOMATIC=0;
    /**
         * lumen (lm)
         */
    public static final double INTENSITYMODE_LUMINOUSPOWER=0;
    /**
         * candela (lm/sr)
         */
    public static final double INTENSITYMODE_LUMINOUSINTENSITY=0;
    /**
         * lux (lm/m^2)
         */
    public static final double INTENSITYMODE_ILLUMINANCE=0;
    /**
         * nit (cd/m^2)
         */
    public static final double INTENSITYMODE_LUMINANCE=0;
    /**
         * Light type const id of the point light.
         */
    public static final double LIGHTTYPEID_POINTLIGHT=0;
    /**
         * Light type const id of the directional light.
         */
    public static final double LIGHTTYPEID_DIRECTIONALLIGHT=0;
    /**
         * Light type const id of the spot light.
         */
    public static final double LIGHTTYPEID_SPOTLIGHT=0;
    /**
         * Light type const id of the hemispheric light.
         */
    public static final double LIGHTTYPEID_HEMISPHERICLIGHT=0;
    public Color3 diffuse;
    public Color3 specular;
    public double intensity;
    public double range;
    /**
         * Sets the photometric scale used to interpret the intensity.
         * This is only relevant with PBR Materials where the light intensity can be defined in a physical way.
         */
    public double intensityMode;
    /**
         * sets the light radius used by PBR Materials to simulate soft area lights.
         */
    public double radius;
    public double renderPriority;
    /**
         * Defines wether or not the shadows are enabled for this light. This can help turning off/on shadow without detaching
         * the current shadow generator.
         */
    public Boolean shadowEnabled;
    public AbstractMesh[] includedOnlyMeshes;
    public AbstractMesh[] excludedMeshes;
    public double excludeWithLayerMask;
    public double includeOnlyWithLayerMask;
    public double lightmapMode;
    public IShadowGenerator _shadowGenerator;
    public String[] _excludedMeshesIds;
    public String[] _includedOnlyMeshesIds;
    public UniformBuffer _uniformBuffer;
    /**
         * Creates a Light object in the scene.
         * Documentation : http://doc.babylonjs.com/tutorials/lights
         */
    public Light(String name, Scene scene){}
    native public void _buildUniformLayout();
    /**
         * Returns the string "Light".
         */
    native public String getClassName();
    /**
         * @param {boolean} fullDetails - support for multiple levels of logging within scene loading
         */
    native public String toString(Boolean fullDetails);
    /**
         * Set the enabled state of this node.
         * @param {boolean} value - the new enabled state
         * @see isEnabled
         */
    native public void setEnabled(Boolean value);
    /**
         * Returns the Light associated shadow generator.
         */
    native public IShadowGenerator getShadowGenerator();
    /**
         * Returns a Vector3, the absolute light position in the World.
         */
    native public Vector3 getAbsolutePosition();
    native public DirectionalLight transferToEffect(Effect effect, String lightIndex);
    native public Matrix _getWorldMatrix();
    /**
         * Boolean : True if the light will affect the passed mesh.
         */
    native public Boolean canAffectMesh(AbstractMesh mesh);
    /**
         * Returns the light World matrix.
         */
    native public Matrix getWorldMatrix();
    /**
         * Sort function to order lights for rendering.
         * @param a First Light object to compare to second.
         * @param b Second Light object to compare first.
         * @return -1 to reduce's a's index relative to be, 0 for no change, 1 to increase a's index relative to b.
         */
    native public static double compareLightsPriority(Light a, Light b);
    /**
         * Disposes the light.
         */
    native public void dispose();
    /**
         * Returns the light type ID (integer).
         */
    native public double getTypeID();
    /**
         * Returns the intensity scaled by the Photometric Scale according to the light type and intensity mode.
         */
    native public double getScaledIntensity();
    /**
         * Returns a new Light object, named "name", from the current one.
         */
    native public Light clone(String name);
    /**
         * Serializes the current light into a Serialization object.
         * Returns the serialized object.
         */
    native public Object serialize();
    /**
         * Creates a new typed light from the passed type (integer) : point light = 0, directional light = 1, spot light = 2, hemispheric light = 3.
         * This new light is named "name" and added to the passed scene.
         */
    native public static java.util.function.Supplier<Light> GetConstructorFromName(double type, String name, Scene scene);
    /**
         * Parses the passed "parsedLight" and returns a new instanced Light from this parsing.
         */
    native public static Light Parse(Object parsedLight, Scene scene);
    native public void _markMeshesAsLightDirty();
    /**
         * @param {boolean} fullDetails - support for multiple levels of logging within scene loading
         */
    native public String toString();
    protected Light(){}
}

