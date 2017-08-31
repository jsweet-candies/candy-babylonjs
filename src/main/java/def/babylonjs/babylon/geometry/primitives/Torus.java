package def.babylonjs.babylon.geometry.primitives;
import def.babylonjs.babylon.Geometry;
import def.babylonjs.babylon.Scene;
import def.babylonjs.babylon.Mesh;
import def.babylonjs.babylon.VertexData;
public class Torus extends _Primitive {
    public double diameter;
    public double thickness;
    public double tessellation;
    public double side;
    public Torus(String id, Scene scene, double diameter, double thickness, double tessellation, Boolean canBeRegenerated, Mesh mesh, double side){}
    native public VertexData _regenerateVertexData();
    native public Geometry copy(String id);
    native public Object serialize();
    native public static def.babylonjs.babylon.geometry.primitives.Torus Parse(Object parsedTorus, Scene scene);
    public Torus(String id, Scene scene, double diameter, double thickness, double tessellation, Boolean canBeRegenerated, Mesh mesh){}
    public Torus(String id, Scene scene, double diameter, double thickness, double tessellation, Boolean canBeRegenerated){}
    public Torus(String id, Scene scene, double diameter, double thickness, double tessellation){}
    protected Torus(){}
}

