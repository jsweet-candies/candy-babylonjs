package def.babylonjs.babylon;
/**
     * The PBR material of BJS following the specular glossiness convention.
     *
     * This fits to the PBR convention in the GLTF definition:
     * https://github.com/KhronosGroup/glTF/tree/2.0/extensions/Khronos/KHR_materials_pbrSpecularGlossiness
     */
public class PBRSpecularGlossinessMaterial extends def.babylonjs.babylon.internals.PBRBaseSimpleMaterial {
    /**
         * Specifies the diffuse color of the material.
         */
    public Color3 diffuseColor;
    /**
         * Specifies the diffuse texture of the material. This can also contains the opcity value in its alpha
         * channel.
         */
    public BaseTexture diffuseTexture;
    /**
         * Specifies the specular color of the material. This indicates how reflective is the material (none to mirror).
         */
    public Color3 specularColor;
    /**
         * Specifies the glossiness of the material. This indicates "how sharp is the reflection".
         */
    public double glossiness;
    /**
         * Specifies both the specular color RGB and the glossiness A of the material per pixels.
         */
    public BaseTexture specularGlossinessTexture;
    /**
         * Instantiates a new PBRSpecularGlossinessMaterial instance.
         *
         * @param name The material name
         * @param scene The scene the material will be use in.
         */
    public PBRSpecularGlossinessMaterial(String name, Scene scene){}
    /**
         * Return the currrent class name of the material.
         */
    native public String getClassName();
    /**
         * Return the active textures of the material.
         */
    native public BaseTexture[] getActiveTextures();
    native public Boolean hasTexture(BaseTexture texture);
    native public PBRSpecularGlossinessMaterial clone(String name);
    /**
         * Serialize the material to a parsable JSON object.
         */
    native public Object serialize();
    /**
         * Parses a JSON object correponding to the serialize function.
         */
    native public static PBRSpecularGlossinessMaterial Parse(Object source, Scene scene, String rootUrl);
    protected PBRSpecularGlossinessMaterial(){}
}

