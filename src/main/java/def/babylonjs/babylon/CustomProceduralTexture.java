package def.babylonjs.babylon;
public class CustomProceduralTexture extends ProceduralTexture {
    public CustomProceduralTexture(String name, Object texturePath, double size, Scene scene, Texture fallbackTexture, Boolean generateMipMaps){}
    native public Boolean isReady();
    native public void render(Boolean useCameraPostProcess);
    native public void updateTextures();
    native public void updateShaderUniforms();
    public Boolean animate;
    public CustomProceduralTexture(String name, Object texturePath, double size, Scene scene, Texture fallbackTexture){}
    public CustomProceduralTexture(String name, Object texturePath, double size, Scene scene){}
    native public void render();
    protected CustomProceduralTexture(){}
}

