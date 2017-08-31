package def.babylonjs.babylon;
import def.js.Array;
@jsweet.lang.Interface
public abstract class SerializedMesh extends def.js.Object {
    public String id;
    public String name;
    public double uniqueId;
    public String geometryId;
    public Array<Double> sphereCenter;
    public double sphereRadius;
    public Array<Double> boxMinimum;
    public Array<Double> boxMaximum;
    public Object worldMatrixFromCache;
    public Array<SerializedSubMesh> subMeshes;
    public Boolean checkCollisions;
}

