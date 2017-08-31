package def.babylonjs.babylon.geometry.primitives;
import def.babylonjs.babylon.Geometry;
import def.babylonjs.babylon.Scene;
import def.babylonjs.babylon.Mesh;
import def.babylonjs.babylon.VertexData;
public class TiledGround extends _Primitive {
    public double xmin;
    public double zmin;
    public double xmax;
    public double zmax;
    public Subdivisions subdivisions;
    public Precision precision;
    public TiledGround(String id, Scene scene, double xmin, double zmin, double xmax, double zmax, Subdivisions subdivisions, Precision precision, Boolean canBeRegenerated, Mesh mesh){}
    native public VertexData _regenerateVertexData();
    native public Geometry copy(String id);
    /** This is an automatically generated object type (see the source definition). */
    @jsweet.lang.ObjectType
    public static class Subdivisions extends def.js.Object {
        public double w;
        public double h;
    }
    /** This is an automatically generated object type (see the source definition). */
    @jsweet.lang.ObjectType
    public static class Precision extends def.js.Object {
        public double w;
        public double h;
    }
    public TiledGround(String id, Scene scene, double xmin, double zmin, double xmax, double zmax, Subdivisions subdivisions, Precision precision, Boolean canBeRegenerated){}
    public TiledGround(String id, Scene scene, double xmin, double zmin, double xmax, double zmax, Subdivisions subdivisions, Precision precision){}
    protected TiledGround(){}
}

