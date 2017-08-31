package def.babylonjs.babylon;
public class PushMaterial extends Material {
    public Effect _activeEffect;
    public PushMaterial(String name, Scene scene){}
    native public Effect getEffect();
    native public Boolean isReady(AbstractMesh mesh, Boolean useInstances);
    native public void bindOnlyWorldMatrix(Matrix world);
    native public void bind(Matrix world, Mesh mesh);
    native public void _afterBind(Mesh mesh, Effect effect);
    native public Boolean _mustRebind(Scene scene, Effect effect, double visibility);
    native public Boolean isReady(AbstractMesh mesh);
    native public Boolean isReady();
    native public void bind(Matrix world);
    native public void _afterBind(Mesh mesh);
    native public Boolean _mustRebind(Scene scene, Effect effect);
    protected PushMaterial(){}
}

