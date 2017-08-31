package def.babylonjs.babylon;
import def.js.Array;
@jsweet.lang.Interface
public abstract class ISimplificationTask extends def.js.Object {
    public Array<ISimplificationSettings> settings;
    public SimplificationType simplificationType;
    public Mesh mesh;
    @jsweet.lang.Optional
    public java.lang.Runnable successCallback;
    public Boolean parallelProcessing;
}

