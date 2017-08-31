package def.babylonjs.babylon;
public class BoundingInfo extends ICullable {
    public Vector3 minimum;
    public Vector3 maximum;
    public BoundingBox boundingBox;
    public BoundingSphere boundingSphere;
    public BoundingInfo(Vector3 minimum, Vector3 maximum){}
    public Boolean isLocked;
    native public void update(Matrix world);
    native public Boolean isInFrustum(Plane[] frustumPlanes);
    native public Boolean isCompletelyInFrustum(Plane[] frustumPlanes);
    native public Boolean _checkCollision(Collider collider);
    native public Boolean intersectsPoint(Vector3 point);
    native public Boolean intersects(BoundingInfo boundingInfo, Boolean precise);
    protected BoundingInfo(){}
}

