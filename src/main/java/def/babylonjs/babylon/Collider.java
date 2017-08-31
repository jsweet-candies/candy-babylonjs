package def.babylonjs.babylon;
import def.js.Array;
public class Collider extends def.js.Object {
    public Vector3 radius;
    public double retry;
    public Vector3 velocity;
    public Vector3 basePoint;
    public double epsilon;
    public Boolean collisionFound;
    public double velocityWorldLength;
    public Vector3 basePointWorld;
    public Vector3 velocityWorld;
    public Vector3 normalizedVelocity;
    public Vector3 initialVelocity;
    public Vector3 initialPosition;
    public double nearestDistance;
    public Vector3 intersectionPoint;
    public AbstractMesh collidedMesh;
    public double collisionMask;
    native public void _initialize(Vector3 source, Vector3 dir, double e);
    native public Boolean _checkPointInTriangle(Vector3 point, Vector3 pa, Vector3 pb, Vector3 pc, Vector3 n);
    native public Boolean _canDoCollision(Vector3 sphereCenter, double sphereRadius, Vector3 vecMin, Vector3 vecMax);
    native public void _testTriangle(double faceIndex, Array<Plane> trianglePlaneArray, Vector3 p1, Vector3 p2, Vector3 p3, Boolean hasMaterial);
    native public void _collide(Array<Plane> trianglePlaneArray, Vector3[] pts, Object indices, double indexStart, double indexEnd, double decal, Boolean hasMaterial);
    native public void _getResponse(Vector3 pos, Vector3 vel);
    native public void _testTriangle(double faceIndex, Plane[] trianglePlaneArray, Vector3 p1, Vector3 p2, Vector3 p3, Boolean hasMaterial);
    native public void _collide(Plane[] trianglePlaneArray, Vector3[] pts, Object indices, double indexStart, double indexEnd, double decal, Boolean hasMaterial);
}

