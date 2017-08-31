package def.babylonjs.babylon;
public class EffectFallbacks extends def.js.Object {
    native public void addFallback(double rank, String define);
    native public void addCPUSkinningFallback(double rank, def.babylonjs.babylon.AbstractMesh mesh);
    public final Boolean isMoreFallbacks=null;
    native public String reduce(String currentDefines);
}

