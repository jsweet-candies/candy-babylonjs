package def.babylonjs.babylon;
import def.js.Array;
import def.js.Float32Array;
@jsweet.lang.Interface
public abstract class IPhysicsEnabledObject extends def.js.Object {
    public Vector3 position;
    public Quaternion rotationQuaternion;
    public Vector3 scaling;
    @jsweet.lang.Optional
    public Vector3 rotation;
    @jsweet.lang.Optional
    public Object parent;
    native public BoundingInfo getBoundingInfo();
    native public void computeWorldMatrix(Boolean force);
    native public Matrix getWorldMatrix();
    native public Array<AbstractMesh> getChildMeshes();
    native public jsweet.util.union.Union<Array<Double>,Float32Array> getVerticesData(String kind);
    native public Object getIndices();
    native public Scene getScene();
}

