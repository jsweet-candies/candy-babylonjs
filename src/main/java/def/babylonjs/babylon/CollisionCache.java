package def.babylonjs.babylon;
public class CollisionCache extends def.js.Object {
    native public GetMeshes getMeshes();
    native public GetGeometries getGeometries();
    native public SerializedMesh getMesh(Object id);
    native public void addMesh(SerializedMesh mesh);
    native public void removeMesh(double uniqueId);
    native public SerializedGeometry getGeometry(String id);
    native public void addGeometry(SerializedGeometry geometry);
    native public void removeGeometry(String id);
    /** This is an automatically generated object type (see the source definition). */
    @jsweet.lang.ObjectType
    public static class GetMeshes extends def.js.Object {
        native public SerializedMesh $get(double n);
    }
    /** This is an automatically generated object type (see the source definition). */
    @jsweet.lang.ObjectType
    public static class GetGeometries extends def.js.Object {
        native public SerializedGeometry $get(double s);
    }
}

