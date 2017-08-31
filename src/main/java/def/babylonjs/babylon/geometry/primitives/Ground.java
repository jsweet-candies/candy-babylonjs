package def.babylonjs.babylon.geometry.primitives;
import def.babylonjs.babylon.Geometry;
import def.babylonjs.babylon.Scene;
import def.babylonjs.babylon.Mesh;
import def.babylonjs.babylon.VertexData;
public class Ground extends _Primitive {
    public double width;
    public double height;
    public double subdivisions;
    public Ground(String id, Scene scene, double width, double height, double subdivisions, Boolean canBeRegenerated, Mesh mesh){}
    native public VertexData _regenerateVertexData();
    native public Geometry copy(String id);
    native public Object serialize();
    native public static def.babylonjs.babylon.geometry.primitives.Ground Parse(Object parsedGround, Scene scene);
    public Ground(String id, Scene scene, double width, double height, double subdivisions, Boolean canBeRegenerated){}
    public Ground(String id, Scene scene, double width, double height, double subdivisions){}
    protected Ground(){}
}

