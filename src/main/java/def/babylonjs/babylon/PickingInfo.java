package def.babylonjs.babylon;
public class PickingInfo extends def.js.Object {
    public Boolean hit;
    public double distance;
    public Vector3 pickedPoint;
    public AbstractMesh pickedMesh;
    public double bu;
    public double bv;
    public double faceId;
    public double subMeshId;
    public Sprite pickedSprite;
    native public Vector3 getNormal(Boolean useWorldCoordinates, Boolean useVerticesNormals);
    native public Vector2 getTextureCoordinates();
    native public Vector3 getNormal(Boolean useWorldCoordinates);
    native public Vector3 getNormal();
}

