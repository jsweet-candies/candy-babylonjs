package def.babylonjs.babylon;
public class PositionNormalTextureVertex extends def.js.Object {
    public Vector3 position;
    public Vector3 normal;
    public Vector2 uv;
    public PositionNormalTextureVertex(Vector3 position, Vector3 normal, Vector2 uv){}
    @jsweet.lang.Name("clone")
    native public PositionNormalTextureVertex Clone();
    public PositionNormalTextureVertex(Vector3 position, Vector3 normal){}
    public PositionNormalTextureVertex(Vector3 position){}
    public PositionNormalTextureVertex(){}
}

