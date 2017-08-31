package def.babylonjs.babylon.geometry.primitives;
import def.babylonjs.babylon.Geometry;
import def.babylonjs.babylon.Scene;
import def.babylonjs.babylon.Mesh;
import def.babylonjs.babylon.VertexData;
public class Plane extends _Primitive {
    public double size;
    public double side;
    public Plane(String id, Scene scene, double size, Boolean canBeRegenerated, Mesh mesh, double side){}
    native public VertexData _regenerateVertexData();
    native public Geometry copy(String id);
    native public Object serialize();
    native public static def.babylonjs.babylon.geometry.primitives.Plane Parse(Object parsedPlane, Scene scene);
    public Plane(String id, Scene scene, double size, Boolean canBeRegenerated, Mesh mesh){}
    public Plane(String id, Scene scene, double size, Boolean canBeRegenerated){}
    public Plane(String id, Scene scene, double size){}
    protected Plane(){}
}

