package def.babylonjs.babylon.internals;
import def.babylonjs.babylon.BaseTexture;
import def.babylonjs.babylon.Scene;
import def.babylonjs.babylon.Color3;
import def.babylonjs.babylon.PBRBaseMaterial;
/**
     * The Physically based simple base material of BJS.
     *
     * This enables better naming and convention enforcements on top of the pbrMaterial.
     * It is used as the base class for both the specGloss and metalRough conventions.
     */
public class PBRBaseSimpleMaterial extends PBRBaseMaterial {
    /**
         * Number of Simultaneous lights allowed on the material.
         */
    public double maxSimultaneousLights;
    /**
         * If sets to true, disables all the lights affecting the material.
         */
    public Boolean disableLighting;
    /**
         * Environment Texture used in the material (this is use for both reflection and environment lighting).
         */
    public BaseTexture environmentTexture;
    /**
         * If sets to true, x component of normal map value will invert (x = 1.0 - x).
         */
    public Boolean invertNormalMapX;
    /**
         * If sets to true, y component of normal map value will invert (y = 1.0 - y).
         */
    public Boolean invertNormalMapY;
    /**
         * Normal map used in the model.
         */
    public BaseTexture normalTexture;
    /**
         * Emissivie color used to self-illuminate the model.
         */
    public Color3 emissiveColor;
    /**
         * Emissivie texture used to self-illuminate the model.
         */
    public BaseTexture emissiveTexture;
    /**
         * Occlusion Channel Strenght.
         */
    public double occlusionStrength;
    /**
         * Occlusion Texture of the material (adding extra occlusion effects).
         */
    public BaseTexture occlusionTexture;
    /**
         * Defines the alpha limits in alpha test mode.
         */
    public double alphaCutOff;
    public double _transparencyMode;
    /**
         * Sets the transparency mode of the material.
         */
    public double transparencyMode;
    /**
         * If sets to true and backfaceCulling is false, normals will be flipped on the backside.
         */
    public Boolean doubleSided;
    /**
         * Specifies wether or not the alpha value of the albedo texture should be used.
         */
    native public Boolean _shouldUseAlphaFromAlbedoTexture();
    /**
         * Specifies wether or not the meshes using this material should be rendered in alpha blend mode.
         */
    native public Boolean needAlphaBlending();
    /**
         * Specifies wether or not the meshes using this material should be rendered in alpha test mode.
         */
    native public Boolean needAlphaTesting();
    /**
         * Instantiates a new PBRMaterial instance.
         *
         * @param name The material name
         * @param scene The scene the material will be use in.
         */
    public PBRBaseSimpleMaterial(String name, Scene scene){}
    protected PBRBaseSimpleMaterial(){}
}

