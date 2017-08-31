package def.babylonjs.babylon;
public class BoundingBox extends ICullable {
    public Vector3 minimum;
    public Vector3 maximum;
    public Vector3[] vectors;
    public Vector3 center;
    public Vector3 centerWorld;
    public Vector3 extendSize;
    public Vector3 extendSizeWorld;
    public Vector3[] directions;
    public Vector3[] vectorsWorld;
    public Vector3 minimumWorld;
    public Vector3 maximumWorld;
    public BoundingBox(Vector3 minimum, Vector3 maximum){}
    native public Matrix getWorldMatrix();
    native public BoundingBox setWorldMatrix(Matrix matrix);
    native public void _update(Matrix world);
    native public Boolean isInFrustum(Plane[] frustumPlanes);
    native public Boolean isCompletelyInFrustum(Plane[] frustumPlanes);
    native public Boolean intersectsPoint(Vector3 point);
    native public Boolean intersectsSphere(BoundingSphere sphere);
    native public Boolean intersectsMinMax(Vector3 min, Vector3 max);
    native public static Boolean Intersects(BoundingBox box0, BoundingBox box1);
    native public static Boolean IntersectsSphere(Vector3 minPoint, Vector3 maxPoint, Vector3 sphereCenter, double sphereRadius);
    native public static Boolean IsCompletelyInFrustum(Vector3[] boundingVectors, Plane[] frustumPlanes);
    native public static Boolean IsInFrustum(Vector3[] boundingVectors, Plane[] frustumPlanes);
    protected BoundingBox(){}
}

