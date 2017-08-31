package def.babylonjs.babylon.geometry.primitives;
import def.babylonjs.babylon.Geometry;
import def.babylonjs.babylon.Scene;
import def.babylonjs.babylon.Mesh;
import def.babylonjs.babylon.VertexData;
public class Box extends _Primitive {
    public double size;
    public double side;
    public Box(String id, Scene scene, double size, Boolean canBeRegenerated, Mesh mesh, double side){}
    native public VertexData _regenerateVertexData();
    native public Geometry copy(String id);
    native public Object serialize();
    native public static Box Parse(Object parsedBox, Scene scene);
    public Box(String id, Scene scene, double size, Boolean canBeRegenerated, Mesh mesh){}
    public Box(String id, Scene scene, double size, Boolean canBeRegenerated){}
    public Box(String id, Scene scene, double size){}
    protected Box(){}
}

