package def.babylonjs.babylon;
public class BaseSubMesh extends def.js.Object {
    public MaterialDefines _materialDefines;
    public Effect _materialEffect;
    public final Effect effect=null;
    native public void setEffect(Effect effect, MaterialDefines defines);
    native public void setEffect(Effect effect);
}

