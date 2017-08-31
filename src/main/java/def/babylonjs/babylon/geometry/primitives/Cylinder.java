package def.babylonjs.babylon.geometry.primitives;
import def.babylonjs.babylon.Geometry;
import def.babylonjs.babylon.Scene;
import def.babylonjs.babylon.Mesh;
import def.babylonjs.babylon.VertexData;
public class Cylinder extends _Primitive {
    public double height;
    public double diameterTop;
    public double diameterBottom;
    public double tessellation;
    public double subdivisions;
    public double side;
    public Cylinder(String id, Scene scene, double height, double diameterTop, double diameterBottom, double tessellation, double subdivisions, Boolean canBeRegenerated, Mesh mesh, double side){}
    native public VertexData _regenerateVertexData();
    native public Geometry copy(String id);
    native public Object serialize();
    native public static def.babylonjs.babylon.geometry.primitives.Cylinder Parse(Object parsedCylinder, Scene scene);
    public Cylinder(String id, Scene scene, double height, double diameterTop, double diameterBottom, double tessellation, double subdivisions, Boolean canBeRegenerated, Mesh mesh){}
    public Cylinder(String id, Scene scene, double height, double diameterTop, double diameterBottom, double tessellation, double subdivisions, Boolean canBeRegenerated){}
    public Cylinder(String id, Scene scene, double height, double diameterTop, double diameterBottom, double tessellation, double subdivisions){}
    public Cylinder(String id, Scene scene, double height, double diameterTop, double diameterBottom, double tessellation){}
    protected Cylinder(){}
}

