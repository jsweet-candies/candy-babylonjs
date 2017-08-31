package def.babylonjs.babylon;
import def.js.Float32Array;
import def.js.ArrayLike;
public class Vector4 extends def.js.Object {
    public double x;
    public double y;
    public double z;
    public double w;
    /**
         * Creates a Vector4 object from the passed floats.
         */
    public Vector4(double x, double y, double z, double w){}
    /**
         * Returns the string with the Vector4 coordinates.
         */
    native public String toString();
    /**
         * Returns the string "Vector4".
         */
    native public String getClassName();
    /**
         * Returns the Vector4 hash code.
         */
    native public double getHashCode();
    /**
         * Returns a new array populated with 4 elements : the Vector4 coordinates.
         */
    native public double[] asArray();
    /**
         * Populates the passed array from the passed index with the Vector4 coordinates.
         * Returns the Vector4.
         */
    native public Vector4 toArray(double[] array, double index);
    /**
         * Adds the passed vector to the current Vector4.
         * Returns the updated Vector4.
         */
    native public Vector4 addInPlace(Vector4 otherVector);
    /**
         * Returns a new Vector4 as the result of the addition of the current Vector4 and the passed one.
         */
    native public Vector4 add(Vector4 otherVector);
    /**
         * Updates the passed vector "result" with the result of the addition of the current Vector4 and the passed one.
         * Returns the current Vector4.
         */
    native public Vector4 addToRef(Vector4 otherVector, Vector4 result);
    /**
         * Subtract in place the passed vector from the current Vector4.
         * Returns the updated Vector4.
         */
    native public Vector4 subtractInPlace(Vector4 otherVector);
    /**
         * Returns a new Vector4 with the result of the subtraction of the passed vector from the current Vector4.
         */
    native public Vector4 subtract(Vector4 otherVector);
    /**
         * Sets the passed vector "result" with the result of the subtraction of the passed vector from the current Vector4.
         * Returns the current Vector4.
         */
    native public Vector4 subtractToRef(Vector4 otherVector, Vector4 result);
    /**
         * Returns a new Vector4 set with the result of the subtraction of the passed floats from the current Vector4 coordinates.
         */
    native public Vector4 subtractFromFloats(double x, double y, double z, double w);
    /**
         * Sets the passed vector "result" set with the result of the subtraction of the passed floats from the current Vector4 coordinates.
         * Returns the current Vector4.
         */
    native public Vector4 subtractFromFloatsToRef(double x, double y, double z, double w, Vector4 result);
    /**
         * Returns a new Vector4 set with the current Vector4 negated coordinates.
         */
    native public Vector4 negate();
    /**
         * Multiplies the current Vector4 coordinates by scale (float).
         * Returns the updated Vector4.
         */
    native public Vector4 scaleInPlace(double scale);
    /**
         * Returns a new Vector4 set with the current Vector4 coordinates multiplied by scale (float).
         */
    native public Vector4 scale(double scale);
    /**
         * Sets the passed vector "result" with the current Vector4 coordinates multiplied by scale (float).
         * Returns the current Vector4.
         */
    native public Vector4 scaleToRef(double scale, Vector4 result);
    /**
         * Boolean : True if the current Vector4 coordinates are stricly equal to the passed ones.
         */
    @jsweet.lang.Name("equals")
    native public Boolean Equals(Vector4 otherVector);
    /**
         * Boolean : True if the current Vector4 coordinates are each beneath the distance "epsilon" from the passed vector ones.
         */
    native public Boolean equalsWithEpsilon(Vector4 otherVector, double epsilon);
    /**
         * Boolean : True if the passed floats are strictly equal to the current Vector4 coordinates.
         */
    native public Boolean equalsToFloats(double x, double y, double z, double w);
    /**
         * Multiplies in place the current Vector4 by the passed one.
         * Returns the updated Vector4.
         */
    native public Vector4 multiplyInPlace(Vector4 otherVector);
    /**
         * Returns a new Vector4 set with the multiplication result of the current Vector4 and the passed one.
         */
    native public Vector4 multiply(Vector4 otherVector);
    /**
         * Updates the passed vector "result" with the multiplication result of the current Vector4 and the passed one.
         * Returns the current Vector4.
         */
    native public Vector4 multiplyToRef(Vector4 otherVector, Vector4 result);
    /**
         * Returns a new Vector4 set with the multiplication result of the passed floats and the current Vector4 coordinates.
         */
    native public Vector4 multiplyByFloats(double x, double y, double z, double w);
    /**
         * Returns a new Vector4 set with the division result of the current Vector4 by the passed one.
         */
    native public Vector4 divide(Vector4 otherVector);
    /**
         * Updates the passed vector "result" with the division result of the current Vector4 by the passed one.
         * Returns the current Vector4.
         */
    native public Vector4 divideToRef(Vector4 otherVector, Vector4 result);
    /**
         * Updates the Vector4 coordinates with the minimum values between its own and the passed vector ones.
         */
    native public Vector4 MinimizeInPlace(Vector4 other);
    /**
         * Updates the Vector4 coordinates with the maximum values between its own and the passed vector ones.
         */
    native public Vector4 MaximizeInPlace(Vector4 other);
    /**
         * Returns the Vector4 length (float).
         */
    native public double length();
    /**
         * Returns the Vector4 squared length (float).
         */
    native public double lengthSquared();
    /**
         * Normalizes in place the Vector4.
         * Returns the updated Vector4.
         */
    native public Vector4 normalize();
    /**
         * Returns a new Vector3 from the Vector4 (x, y, z) coordinates.
         */
    native public Vector3 toVector3();
    /**
         * Returns a new Vector4 copied from the current one.
         */
    @jsweet.lang.Name("clone")
    native public Vector4 Clone();
    /**
         * Updates the current Vector4 with the passed one coordinates.
         * Returns the updated Vector4.
         */
    native public Vector4 copyFrom(Vector4 source);
    /**
         * Updates the current Vector4 coordinates with the passed floats.
         * Returns the updated Vector4.
         */
    native public Vector4 copyFromFloats(double x, double y, double z, double w);
    /**
         * Updates the current Vector4 coordinates with the passed floats.
         * Returns the updated Vector4.
         */
    native public Vector4 set(double x, double y, double z, double w);
    /**
         * Returns a new Vector4 set from the starting index of the passed array.
         */
    native public static Vector4 FromArray(ArrayLike<Double> array, double offset);
    /**
         * Updates the passed vector "result" from the starting index of the passed array.
         */
    native public static void FromArrayToRef(ArrayLike<Double> array, double offset, Vector4 result);
    /**
         * Updates the passed vector "result" from the starting index of the passed Float32Array.
         */
    native public static void FromFloatArrayToRef(Float32Array array, double offset, Vector4 result);
    /**
         * Updates the passed vector "result" coordinates from the passed floats.
         */
    native public static void FromFloatsToRef(double x, double y, double z, double w, Vector4 result);
    /**
         * Returns a new Vector4 set to (0.0, 0.0, 0.0, 0.0)
         */
    native public static Vector4 Zero();
    /**
         * Returns a new Vector4 set to (1.0, 1.0, 1.0, 1.0)
         */
    native public static Vector4 One();
    /**
         * Returns a new normalized Vector4 from the passed one.
         */
    native public static Vector4 Normalize(Vector4 vector);
    /**
         * Updates the passed vector "result" from the normalization of the passed one.
         */
    native public static void NormalizeToRef(Vector4 vector, Vector4 result);
    native public static Vector4 Minimize(Vector4 left, Vector4 right);
    native public static Vector4 Maximize(Vector4 left, Vector4 right);
    /**
         * Returns the distance (float) between the vectors "value1" and "value2".
         */
    native public static double Distance(Vector4 value1, Vector4 value2);
    /**
         * Returns the squared distance (float) between the vectors "value1" and "value2".
         */
    native public static double DistanceSquared(Vector4 value1, Vector4 value2);
    /**
         * Returns a new Vector4 located at the center between the vectors "value1" and "value2".
         */
    native public static Vector4 Center(Vector4 value1, Vector4 value2);
    /**
         * Returns a new Vector4 set with the result of the normal transformation by the passed matrix of the passed vector.
         * This methods computes transformed normalized direction vectors only.
         */
    native public static Vector4 TransformNormal(Vector4 vector, Matrix transformation);
    /**
         * Sets the passed vector "result" with the result of the normal transformation by the passed matrix of the passed vector.
         * This methods computes transformed normalized direction vectors only.
         */
    native public static void TransformNormalToRef(Vector4 vector, Matrix transformation, Vector4 result);
    /**
         * Sets the passed vector "result" with the result of the normal transformation by the passed matrix of the passed floats (x, y, z, w).
         * This methods computes transformed normalized direction vectors only.
         */
    native public static void TransformNormalFromFloatsToRef(double x, double y, double z, double w, Matrix transformation, Vector4 result);
    /**
         * Populates the passed array from the passed index with the Vector4 coordinates.
         * Returns the Vector4.
         */
    native public Vector4 toArray(double[] array);
    /**
         * Boolean : True if the current Vector4 coordinates are each beneath the distance "epsilon" from the passed vector ones.
         */
    native public Boolean equalsWithEpsilon(Vector4 otherVector);
    /**
         * Returns a new Vector4 set from the starting index of the passed array.
         */
    native public static Vector4 FromArray(ArrayLike<Double> array);
    /**
         * Populates the passed array from the passed index with the Vector4 coordinates.
         * Returns the Vector4.
         */
    native public Vector4 toArray(Float32Array array, double index);
    /**
         * Populates the passed array from the passed index with the Vector4 coordinates.
         * Returns the Vector4.
         */
    native public Vector4 toArray(Float32Array array);
    /**
         * Returns a new Vector4 set from the starting index of the passed array.
         */
    native public static Vector4 FromArray(Double[] array, double offset);
    /**
         * Updates the passed vector "result" from the starting index of the passed array.
         */
    native public static void FromArrayToRef(Double[] array, double offset, Vector4 result);
    /**
         * Returns a new Vector4 set from the starting index of the passed array.
         */
    native public static Vector4 FromArray(Double[] array);
    protected Vector4(){}
}

