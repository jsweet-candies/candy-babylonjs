package def.babylonjs.babylon;
import def.js.ArrayLike;
public class Plane extends def.js.Object {
    public Vector3 normal;
    public double d;
    /**
         * Creates a Plane object according to the passed floats a, b, c, d and the plane equation : ax + by + cz + d = 0
         */
    public Plane(double a, double b, double c, double d){}
    /**
         * Returns the plane coordinates as a new array of 4 elements [a, b, c, d].
         */
    native public double[] asArray();
    /**
         * Returns a new plane copied from the current Plane.
         */
    @jsweet.lang.Name("clone")
    native public Plane Clone();
    /**
         * Returns the string "Plane".
         */
    native public String getClassName();
    /**
         * Returns the Plane hash code.
         */
    native public double getHashCode();
    /**
         * Normalize the current Plane in place.
         * Returns the updated Plane.
         */
    native public Plane normalize();
    /**
         * Returns a new Plane as the result of the transformation of the current Plane by the passed matrix.
         */
    native public Plane transform(Matrix transformation);
    /**
         * Returns the dot product (float) of the point coordinates and the plane normal.
         */
    native public double dotCoordinate(Object point);
    /**
         * Updates the current Plane from the plane defined by the three passed points.
         * Returns the updated Plane.
         */
    native public Plane copyFromPoints(Vector3 point1, Vector3 point2, Vector3 point3);
    /**
         * Boolean : True is the vector "direction"  is the same side than the plane normal.
         */
    native public Boolean isFrontFacingTo(Vector3 direction, double epsilon);
    /**
         * Returns the signed distance (float) from the passed point to the Plane.
         */
    native public double signedDistanceTo(Vector3 point);
    /**
         * Returns a new Plane from the passed array.
         */
    native public static Plane FromArray(ArrayLike<Double> array);
    /**
         * Returns a new Plane defined by the three passed points.
         */
    native public static Plane FromPoints(Object point1, Object point2, Object point3);
    /**
         * Returns a new Plane the normal vector to this plane at the passed origin point.
         * Note : the vector "normal" is updated because normalized.
         */
    native public static Plane FromPositionAndNormal(Vector3 origin, Vector3 normal);
    /**
         * Returns the signed distance between the plane defined by the normal vector at the "origin"" point and the passed other point.
         */
    native public static double SignedDistanceToPlaneFromPositionAndNormal(Vector3 origin, Vector3 normal, Vector3 point);
    /**
         * Returns a new Plane from the passed array.
         */
    native public static Plane FromArray(Double[] array);
    protected Plane(){}
}

