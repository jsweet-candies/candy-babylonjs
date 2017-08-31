package def.babylonjs.babylon;
public class CSG extends def.js.Object {
    public Matrix matrix;
    public Vector3 position;
    public Vector3 rotation;
    public Quaternion rotationQuaternion;
    public Vector3 scaling;
    native public static CSG FromMesh(Mesh mesh);
    @jsweet.lang.Name("clone")
    native public CSG Clone();
    native public CSG union(CSG csg);
    native public void unionInPlace(CSG csg);
    native public CSG subtract(CSG csg);
    native public void subtractInPlace(CSG csg);
    native public CSG intersect(CSG csg);
    native public void intersectInPlace(CSG csg);
    native public CSG inverse();
    native public void inverseInPlace();
    native public CSG copyTransformAttributes(CSG csg);
    native public Mesh buildMeshGeometry(String name, Scene scene, Boolean keepSubMeshes);
    native public Mesh toMesh(String name, Material material, Scene scene, Boolean keepSubMeshes);
}

