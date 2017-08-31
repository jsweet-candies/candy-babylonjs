package def.babylonjs.babylon;
import def.js.Array;
@jsweet.lang.Interface
public abstract class SerializedSubMesh extends def.js.Object {
    public double position;
    public double verticesStart;
    public double verticesCount;
    public double indexStart;
    public double indexCount;
    public Boolean hasMaterial;
    public Array<Double> sphereCenter;
    public double sphereRadius;
    public Array<Double> boxMinimum;
    public Array<Double> boxMaximum;
}

