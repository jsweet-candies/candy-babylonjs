package def.babylonjs.babylon;
public class GeometryBufferRenderer extends def.js.Object {
    public Mesh[] renderList;
    public final Boolean isSupported=null;
    public Boolean enablePosition;
    public GeometryBufferRenderer(Scene scene, double ratio){}
    native public Boolean isReady(SubMesh subMesh, Boolean useInstances);
    native public MultiRenderTarget getGBuffer();
    native public void dispose();
    public GeometryBufferRenderer(Scene scene){}
    protected GeometryBufferRenderer(){}
}

