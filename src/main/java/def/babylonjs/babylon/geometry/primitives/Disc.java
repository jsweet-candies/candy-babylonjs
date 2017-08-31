package def.babylonjs.babylon.geometry.primitives;
import def.babylonjs.babylon.Geometry;
import def.babylonjs.babylon.Scene;
import def.babylonjs.babylon.Mesh;
import def.babylonjs.babylon.VertexData;
public class Disc extends _Primitive {
    public double radius;
    public double tessellation;
    public double side;
    public Disc(String id, Scene scene, double radius, double tessellation, Boolean canBeRegenerated, Mesh mesh, double side){}
    native public VertexData _regenerateVertexData();
    native public Geometry copy(String id);
    public Disc(String id, Scene scene, double radius, double tessellation, Boolean canBeRegenerated, Mesh mesh){}
    public Disc(String id, Scene scene, double radius, double tessellation, Boolean canBeRegenerated){}
    public Disc(String id, Scene scene, double radius, double tessellation){}
    protected Disc(){}
}

