package def.babylonjs.babylon.geometry.primitives;
import def.babylonjs.babylon.Geometry;
import def.babylonjs.babylon.Scene;
import def.babylonjs.babylon.Mesh;
import def.babylonjs.babylon.VertexData;
public class Sphere extends _Primitive {
    public double segments;
    public double diameter;
    public double side;
    public Sphere(String id, Scene scene, double segments, double diameter, Boolean canBeRegenerated, Mesh mesh, double side){}
    native public VertexData _regenerateVertexData();
    native public Geometry copy(String id);
    native public Object serialize();
    native public static def.babylonjs.babylon.geometry.primitives.Sphere Parse(Object parsedSphere, Scene scene);
    public Sphere(String id, Scene scene, double segments, double diameter, Boolean canBeRegenerated, Mesh mesh){}
    public Sphere(String id, Scene scene, double segments, double diameter, Boolean canBeRegenerated){}
    public Sphere(String id, Scene scene, double segments, double diameter){}
    protected Sphere(){}
}

