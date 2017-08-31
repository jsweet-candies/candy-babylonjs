package def.babylonjs.babylon;
import def.js.Array;
@jsweet.lang.Interface
public abstract class UpdatePayload extends def.js.Object {
    public UpdatedMeshes updatedMeshes;
    public UpdatedGeometries updatedGeometries;
    public Array<Double> removedMeshes;
    public Array<String> removedGeometries;
    /** This is an automatically generated object type (see the source definition). */
    @jsweet.lang.ObjectType
    public static class UpdatedMeshes extends def.js.Object {
        native public SerializedMesh $get(double n);
    }
    /** This is an automatically generated object type (see the source definition). */
    @jsweet.lang.ObjectType
    public static class UpdatedGeometries extends def.js.Object {
        native public SerializedGeometry $get(String s);
    }
}

