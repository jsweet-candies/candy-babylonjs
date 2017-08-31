package def.babylonjs.babylon;
import def.js.Array;
public class Ray extends def.js.Object {
    public Vector3 origin;
    public Vector3 direction;
    public double length;
    public Ray(Vector3 origin, Vector3 direction, double length){}
    native public Boolean intersectsBoxMinMax(Vector3 minimum, Vector3 maximum);
    native public Boolean intersectsBox(BoundingBox box);
    native public Boolean intersectsSphere(BoundingSphere sphere);
    native public IntersectionInfo intersectsTriangle(Vector3 vertex0, Vector3 vertex1, Vector3 vertex2);
    native public double intersectsPlane(Plane plane);
    native public PickingInfo intersectsMesh(AbstractMesh mesh, Boolean fastCheck);
    native public Array<PickingInfo> intersectsMeshes(Array<AbstractMesh> meshes, Boolean fastCheck, Array<PickingInfo> results);
    /**
         * Intersection test between the ray and a given segment whithin a given tolerance (threshold)
         * @param sega the first point of the segment to test the intersection against
         * @param segb the second point of the segment to test the intersection against
         * @param threshold the tolerance margin, if the ray doesn't intersect the segment but is close to the given threshold, the intersection is successful
         * @return the distance from the ray origin to the intersection point if there's intersection, or -1 if there's no intersection
         */
    native public double intersectionSegment(Vector3 sega, Vector3 segb, double threshold);
    native public static Ray CreateNew(double x, double y, double viewportWidth, double viewportHeight, Matrix world, Matrix view, Matrix projection);
    /**
        * Function will create a new transformed ray starting from origin and ending at the end point. Ray's length will be set, and ray will be
        * transformed to the given world matrix.
        * @param origin The origin point
        * @param end The end point
        * @param world a matrix to transform the ray to. Default is the identity matrix.
        */
    native public static Ray CreateNewFromTo(Vector3 origin, Vector3 end, Matrix world);
    native public static Ray Transform(Ray ray, Matrix matrix);
    native public static void TransformToRef(Ray ray, Matrix matrix, Ray result);
    public Ray(Vector3 origin, Vector3 direction){}
    native public PickingInfo intersectsMesh(AbstractMesh mesh);
    native public Array<PickingInfo> intersectsMeshes(Array<AbstractMesh> meshes, Boolean fastCheck);
    native public Array<PickingInfo> intersectsMeshes(Array<AbstractMesh> meshes);
    /**
        * Function will create a new transformed ray starting from origin and ending at the end point. Ray's length will be set, and ray will be
        * transformed to the given world matrix.
        * @param origin The origin point
        * @param end The end point
        * @param world a matrix to transform the ray to. Default is the identity matrix.
        */
    native public static Ray CreateNewFromTo(Vector3 origin, Vector3 end);
    native public Array<PickingInfo> intersectsMeshes(Array<AbstractMesh> meshes, Boolean fastCheck, PickingInfo[] results);
    native public Array<PickingInfo> intersectsMeshes(AbstractMesh[] meshes, Boolean fastCheck, Array<PickingInfo> results);
    native public Array<PickingInfo> intersectsMeshes(AbstractMesh[] meshes, Boolean fastCheck);
    native public Array<PickingInfo> intersectsMeshes(AbstractMesh[] meshes);
    protected Ray(){}
}

