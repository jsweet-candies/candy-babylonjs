package def.babylonjs.babylon;
public class PolygonMeshBuilder extends def.js.Object {
    public PolygonMeshBuilder(String name, Path2 contours, Scene scene){}
    public PolygonMeshBuilder(String name, Vector2[] contours, Scene scene){}
    native public PolygonMeshBuilder addHole(Vector2[] hole);
    native public Mesh build(Boolean updatable, double depth);
    native public Mesh build(Boolean updatable);
    native public Mesh build();
    protected PolygonMeshBuilder(){}
}

