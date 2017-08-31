package def.babylonjs.babylon.geometry.primitives;
import def.babylonjs.babylon.Geometry;
import def.babylonjs.babylon.Scene;
import def.babylonjs.babylon.Mesh;
import def.babylonjs.babylon.Vector3;
import def.babylonjs.babylon.VertexData;
public class Ribbon extends _Primitive {
    public Vector3[][] pathArray;
    public Boolean closeArray;
    public Boolean closePath;
    public double offset;
    public double side;
    public Ribbon(String id, Scene scene, Vector3[][] pathArray, Boolean closeArray, Boolean closePath, double offset, Boolean canBeRegenerated, Mesh mesh, double side){}
    native public VertexData _regenerateVertexData();
    native public Geometry copy(String id);
    public Ribbon(String id, Scene scene, Vector3[][] pathArray, Boolean closeArray, Boolean closePath, double offset, Boolean canBeRegenerated, Mesh mesh){}
    public Ribbon(String id, Scene scene, Vector3[][] pathArray, Boolean closeArray, Boolean closePath, double offset, Boolean canBeRegenerated){}
    public Ribbon(String id, Scene scene, Vector3[][] pathArray, Boolean closeArray, Boolean closePath, double offset){}
    protected Ribbon(){}
}

