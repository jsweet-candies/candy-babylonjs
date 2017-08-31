package def.babylonjs.babylon;
public class MultiRenderTarget extends RenderTargetTexture {
    public final Boolean isSupported=null;
    public final Texture[] textures=null;
    public final Texture depthTexture=null;
    public MultiRenderTarget(String name, Object size, double count, Scene scene, Object options){}
    public double samples;
    native public void resize(Object size);
    native public void dispose();
    native public void releaseInternalTextures();
    public MultiRenderTarget(String name, Object size, double count, Scene scene){}
    protected MultiRenderTarget(){}
}

