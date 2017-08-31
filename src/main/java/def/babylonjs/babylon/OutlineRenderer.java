package def.babylonjs.babylon;
public class OutlineRenderer extends def.js.Object {
    public double zOffset;
    public OutlineRenderer(Scene scene){}
    native public void render(SubMesh subMesh, _InstancesBatch batch, Boolean useOverlay);
    native public Boolean isReady(SubMesh subMesh, Boolean useInstances);
    native public void render(SubMesh subMesh, _InstancesBatch batch);
    protected OutlineRenderer(){}
}

