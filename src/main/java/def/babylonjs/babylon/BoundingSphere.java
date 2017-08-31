package def.babylonjs.babylon;
public class BoundingSphere extends def.js.Object {
    public Vector3 minimum;
    public Vector3 maximum;
    public Vector3 center;
    public double radius;
    public Vector3 centerWorld;
    public double radiusWorld;
    public BoundingSphere(Vector3 minimum, Vector3 maximum){}
    native public void _update(Matrix world);
    native public Boolean isInFrustum(Plane[] frustumPlanes);
    native public Boolean intersectsPoint(Vector3 point);
    native public static Boolean Intersects(BoundingSphere sphere0, BoundingSphere sphere1);
    protected BoundingSphere(){}
}

