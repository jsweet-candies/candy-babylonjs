package def.babylonjs.babylon.geometry.primitives;
import def.babylonjs.babylon.Geometry;
import def.babylonjs.babylon.Scene;
import def.babylonjs.babylon.Mesh;
import def.babylonjs.babylon.VertexData;
public class TorusKnot extends _Primitive {
    public double radius;
    public double tube;
    public double radialSegments;
    public double tubularSegments;
    public double p;
    public double q;
    public double side;
    public TorusKnot(String id, Scene scene, double radius, double tube, double radialSegments, double tubularSegments, double p, double q, Boolean canBeRegenerated, Mesh mesh, double side){}
    native public VertexData _regenerateVertexData();
    native public Geometry copy(String id);
    native public Object serialize();
    native public static def.babylonjs.babylon.geometry.primitives.TorusKnot Parse(Object parsedTorusKnot, Scene scene);
    public TorusKnot(String id, Scene scene, double radius, double tube, double radialSegments, double tubularSegments, double p, double q, Boolean canBeRegenerated, Mesh mesh){}
    public TorusKnot(String id, Scene scene, double radius, double tube, double radialSegments, double tubularSegments, double p, double q, Boolean canBeRegenerated){}
    public TorusKnot(String id, Scene scene, double radius, double tube, double radialSegments, double tubularSegments, double p, double q){}
    protected TorusKnot(){}
}

