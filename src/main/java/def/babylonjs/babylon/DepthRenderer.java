package def.babylonjs.babylon;
public class DepthRenderer extends def.js.Object {
    public DepthRenderer(Scene scene, double type){}
    native public Boolean isReady(SubMesh subMesh, Boolean useInstances);
    native public RenderTargetTexture getDepthMap();
    native public void dispose();
    public DepthRenderer(Scene scene){}
    protected DepthRenderer(){}
}

