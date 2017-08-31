package def.babylonjs.babylon;
public class ReflectionProbe extends def.js.Object {
    public String name;
    public Boolean invertYAxis;
    public Vector3 position;
    public ReflectionProbe(String name, double size, Scene scene, Boolean generateMipMaps){}
    public double samples;
    public double refreshRate;
    native public Scene getScene();
    public final RenderTargetTexture cubeTexture=null;
    public final AbstractMesh[] renderList=null;
    native public void attachToMesh(AbstractMesh mesh);
    /**
         * Specifies whether or not the stencil and depth buffer are cleared between two rendering groups.
         *
         * @param renderingGroupId The rendering group id corresponding to its index
         * @param autoClearDepthStencil Automatically clears depth and stencil between groups if true.
         */
    native public void setRenderingAutoClearDepthStencil(double renderingGroupId, Boolean autoClearDepthStencil);
    native public void dispose();
    public ReflectionProbe(String name, double size, Scene scene){}
    protected ReflectionProbe(){}
}

