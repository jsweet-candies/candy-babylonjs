package def.babylonjs.babylon;
/**
    * Creates a refraction texture used by refraction channel of the standard material.
    * @param name the texture name
    * @param size size of the underlying texture
    * @param scene root scene
    */
public class RefractionTexture extends RenderTargetTexture {
    public Plane refractionPlane;
    public double depth;
    public RefractionTexture(String name, double size, Scene scene, Boolean generateMipMaps){}
    @jsweet.lang.Name("clone")
    native public RefractionTexture Clone();
    native public Object serialize();
    public RefractionTexture(String name, double size, Scene scene){}
    protected RefractionTexture(){}
}

