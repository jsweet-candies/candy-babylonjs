package def.babylonjs.babylon;
/**
     * The PBR material of BJS following the metal roughness convention.
     *
     * This fits to the PBR convention in the GLTF definition:
     * https://github.com/KhronosGroup/glTF/tree/2.0/specification/2.0
     */
public class PBRMetallicRoughnessMaterial extends def.babylonjs.babylon.internals.PBRBaseSimpleMaterial {
    /**
         * The base color has two different interpretations depending on the value of metalness.
         * When the material is a metal, the base color is the specific measured reflectance value
         * at normal incidence (F0). For a non-metal the base color represents the reflected diffuse color
         * of the material.
         */
    public Color3 baseColor;
    /**
         * Base texture of the metallic workflow. It contains both the baseColor information in RGB as
         * well as opacity information in the alpha channel.
         */
    public BaseTexture baseTexture;
    /**
         * Specifies the metallic scalar value of the material.
         * Can also be used to scale the metalness values of the metallic texture.
         */
    public double metallic;
    /**
         * Specifies the roughness scalar value of the material.
         * Can also be used to scale the roughness values of the metallic texture.
         */
    public double roughness;
    /**
         * Texture containing both the metallic value in the B channel and the
         * roughness value in the G channel to keep better precision.
         */
    public BaseTexture metallicRoughnessTexture;
    /**
         * Instantiates a new PBRMetalRoughnessMaterial instance.
         *
         * @param name The material name
         * @param scene The scene the material will be use in.
         */
    public PBRMetallicRoughnessMaterial(String name, Scene scene){}
    /**
         * Return the currrent class name of the material.
         */
    native public String getClassName();
    /**
         * Return the active textures of the material.
         */
    native public BaseTexture[] getActiveTextures();
    native public Boolean hasTexture(BaseTexture texture);
    native public PBRMetallicRoughnessMaterial clone(String name);
    /**
         * Serialize the material to a parsable JSON object.
         */
    native public Object serialize();
    /**
         * Parses a JSON object correponding to the serialize function.
         */
    native public static PBRMetallicRoughnessMaterial Parse(Object source, Scene scene, String rootUrl);
    protected PBRMetallicRoughnessMaterial(){}
}

