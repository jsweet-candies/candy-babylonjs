package def.babylonjs.babylon;
public class ProceduralTexture extends Texture {
    public Boolean isCube;
    public Boolean _generateMipMaps;
    public Boolean isEnabled;
    public java.lang.Runnable onGenerated;
    public Texture[] _textures;
    public ProceduralTexture(String name, Object size, Object fragment, Scene scene, Texture fallbackTexture, Boolean generateMipMaps, Boolean isCube){}
    native public void reset();
    native public Boolean isReady();
    native public void resetRefreshCounter();
    native public void setFragment(Object fragment);
    public double refreshRate;
    native public Boolean _shouldRender();
    native public double getRenderSize();
    native public void resize(Object size, Object generateMipMaps);
    native public ProceduralTexture setTexture(String name, Texture texture);
    native public ProceduralTexture setFloat(String name, double value);
    native public ProceduralTexture setFloats(String name, double[] value);
    native public ProceduralTexture setColor3(String name, Color3 value);
    native public ProceduralTexture setColor4(String name, Color4 value);
    native public ProceduralTexture setVector2(String name, Vector2 value);
    native public ProceduralTexture setVector3(String name, Vector3 value);
    native public ProceduralTexture setMatrix(String name, Matrix value);
    native public void render(Boolean useCameraPostProcess);
    @jsweet.lang.Name("clone")
    native public ProceduralTexture Clone();
    native public void dispose();
    public ProceduralTexture(String name, Object size, Object fragment, Scene scene, Texture fallbackTexture, Boolean generateMipMaps){}
    public ProceduralTexture(String name, Object size, Object fragment, Scene scene, Texture fallbackTexture){}
    public ProceduralTexture(String name, Object size, Object fragment, Scene scene){}
    native public void render();
    protected ProceduralTexture(){}
}

