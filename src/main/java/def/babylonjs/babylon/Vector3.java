package def.babylonjs.babylon;
import def.js.Float32Array;
import def.js.ArrayLike;
public class Vector3 extends def.js.Object {
    public double x;
    public double y;
    public double z;
    /**
         * Creates a new Vector3 object from the passed x, y, z (floats) coordinates.
         * A Vector3 is the main object used in 3D geometry.
         * It can represent etiher the coordinates of a point the space, either a direction.
         */
    public Vector3(double x, double y, double z){}
    /**
         * Returns a string with the Vector3 coordinates.
         */
    native public String toString();
    /**
         * Returns the string "Vector3"
         */
    native public String getClassName();
    /**
         * Returns the Vector hash code.
         */
    native public double getHashCode();
    /**
         * Returns a new array with three elements : the coordinates the Vector3.
         */
    native public double[] asArray();
    /**
         * Populates the passed array or Float32Array from the passed index with the successive coordinates of the Vector3.
         * Returns the Vector3.
         */
    native public Vector3 toArray(double[] array, double index);
    /**
         * Returns a new Quaternion object, computed from the Vector3 coordinates.
         */
    native public Quaternion toQuaternion();
    /**
         * Adds the passed vector to the current Vector3.
         * Returns the updated Vector3.
         */
    native public Vector3 addInPlace(Vector3 otherVector);
    /**
         * Returns a new Vector3, result of the addition the current Vector3 and the passed vector.
         */
    native public Vector3 add(Vector3 otherVector);
    /**
         * Adds the current Vector3 to the passed one and stores the result in the vector "result".
         * Returns the current Vector3.
         */
    native public Vector3 addToRef(Vector3 otherVector, Vector3 result);
    /**
         * Subtract the passed vector from the current Vector3.
         * Returns the updated Vector3.
         */
    native public Vector3 subtractInPlace(Vector3 otherVector);
    /**
         * Returns a new Vector3, result of the subtraction of the passed vector from the current Vector3.
         */
    native public Vector3 subtract(Vector3 otherVector);
    /**
         * Subtracts the passed vector from the current Vector3 and stores the result in the vector "result".
         * Returns the current Vector3.
         */
    native public Vector3 subtractToRef(Vector3 otherVector, Vector3 result);
    /**
         * Returns a new Vector3 set with the subtraction of the passed floats from the current Vector3 coordinates.
         */
    native public Vector3 subtractFromFloats(double x, double y, double z);
    /**
         * Subtracts the passed floats from the current Vector3 coordinates and set the passed vector "result" with this result.
         * Returns the current Vector3.
         */
    native public Vector3 subtractFromFloatsToRef(double x, double y, double z, Vector3 result);
    /**
         * Returns a new Vector3 set with the current Vector3 negated coordinates.
         */
    native public Vector3 negate();
    /**
         * Multiplies the Vector3 coordinates by the float "scale".
         * Returns the updated Vector3.
         */
    native public Vector3 scaleInPlace(double scale);
    /**
         * Returns a new Vector3 set with the current Vector3 coordinates multiplied by the float "scale".
         */
    native public Vector3 scale(double scale);
    /**
         * Multiplies the current Vector3 coordinates by the float "scale" and stores the result in the passed vector "result" coordinates.
         * Returns the current Vector3.
         */
    native public Vector3 scaleToRef(double scale, Vector3 result);
    /**
         * Boolean : True if the current Vector3 and the passed vector coordinates are strictly equal.
         */
    @jsweet.lang.Name("equals")
    native public Boolean Equals(Vector3 otherVector);
    /**
         * Boolean : True if the current Vector3 and the passed vector coordinates are distant less than epsilon.
         */
    native public Boolean equalsWithEpsilon(Vector3 otherVector, double epsilon);
    /**
         * Boolean : True if the current Vector3 coordinate equal the passed floats.
         */
    native public Boolean equalsToFloats(double x, double y, double z);
    /**
         * Muliplies the current Vector3 coordinates by the passed ones.
         * Returns the updated Vector3.
         */
    native public Vector3 multiplyInPlace(Vector3 otherVector);
    /**
         * Returns a new Vector3, result of the multiplication of the current Vector3 by the passed vector.
         */
    native public Vector3 multiply(Vector3 otherVector);
    /**
         * Multiplies the current Vector3 by the passed one and stores the result in the passed vector "result".
         * Returns the current Vector3.
         */
    native public Vector3 multiplyToRef(Vector3 otherVector, Vector3 result);
    /**
         * Returns a new Vector3 set witth the result of the mulliplication of the current Vector3 coordinates by the passed floats.
         */
    native public Vector3 multiplyByFloats(double x, double y, double z);
    /**
         * Returns a new Vector3 set witth the result of the division of the current Vector3 coordinates by the passed ones.
         */
    native public Vector3 divide(Vector3 otherVector);
    /**
         * Divides the current Vector3 coordinates by the passed ones and stores the result in the passed vector "result".
         * Returns the current Vector3.
         */
    native public Vector3 divideToRef(Vector3 otherVector, Vector3 result);
    /**
         * Updates the current Vector3 with the minimal coordinate values between its and the passed vector ones.
         * Returns the updated Vector3.
         */
    native public Vector3 MinimizeInPlace(Vector3 other);
    /**
         * Updates the current Vector3 with the maximal coordinate values between its and the passed vector ones.
         * Returns the updated Vector3.
         */
    native public Vector3 MaximizeInPlace(Vector3 other);
    /**
         * Returns the length of the Vector3 (float).
         */
    native public double length();
    /**
         * Returns the squared length of the Vector3 (float).
         */
    native public double lengthSquared();
    /**
         * Normalize the current Vector3.
         * Returns the updated Vector3.
         */
    native public Vector3 normalize();
    /**
         * Returns a new Vector3 copied from the current Vector3.
         */
    @jsweet.lang.Name("clone")
    native public Vector3 Clone();
    /**
         * Copies the passed vector coordinates to the current Vector3 ones.
         * Returns the updated Vector3.
         */
    native public Vector3 copyFrom(Vector3 source);
    /**
         * Copies the passed floats to the current Vector3 coordinates.
         * Returns the updated Vector3.
         */
    native public Vector3 copyFromFloats(double x, double y, double z);
    /**
         * Copies the passed floats to the current Vector3 coordinates.
         * Returns the updated Vector3.
         */
    native public Vector3 set(double x, double y, double z);
    /**
         *
         */
    native public static double GetClipFactor(Vector3 vector0, Vector3 vector1, Vector3 axis, Object size);
    /**
         * Returns a new Vector3 set from the index "offset" of the passed array.
         */
    native public static Vector3 FromArray(ArrayLike<Double> array, double offset);
    /**
         * Returns a new Vector3 set from the index "offset" of the passed Float32Array.
         * This function is deprecated.  Use FromArray instead.
         */
    native public static Vector3 FromFloatArray(Float32Array array, double offset);
    /**
         * Sets the passed vector "result" with the element values from the index "offset" of the passed array.
         */
    native public static void FromArrayToRef(ArrayLike<Double> array, double offset, Vector3 result);
    /**
         * Sets the passed vector "result" with the element values from the index "offset" of the passed Float32Array.
         * This function is deprecated.  Use FromArrayToRef instead.
         */
    native public static void FromFloatArrayToRef(Float32Array array, double offset, Vector3 result);
    /**
         * Sets the passed vector "result" with the passed floats.
         */
    native public static void FromFloatsToRef(double x, double y, double z, Vector3 result);
    /**
         * Returns a new Vector3 set to (0.0, 0.0, 0.0).
         */
    native public static Vector3 Zero();
    /**
         * Returns a new Vector3 set to (1.0, 1.0, 1.0).
         */
    native public static Vector3 One();
    /**
         * Returns a new Vector3 set to (0.0, 1.0, 0.0)
         */
    native public static Vector3 Up();
    /**
         * Returns a new Vector3 set to (0.0, 0.0, 1.0)
         */
    native public static Vector3 Forward();
    /**
         * Returns a new Vector3 set to (1.0, 0.0, 0.0)
         */
    native public static Vector3 Right();
    /**
         * Returns a new Vector3 set to (-1.0, 0.0, 0.0)
         */
    native public static Vector3 Left();
    /**
         * Returns a new Vector3 set with the result of the transformation by the passed matrix of the passed vector.
         * This method computes tranformed coordinates only, not transformed direction vectors.
         */
    native public static Vector3 TransformCoordinates(Vector3 vector, Matrix transformation);
    /**
         * Sets the passed vector "result" coordinates with the result of the transformation by the passed matrix of the passed vector.
         * This method computes tranformed coordinates only, not transformed direction vectors.
         */
    native public static void TransformCoordinatesToRef(Vector3 vector, Matrix transformation, Vector3 result);
    /**
         * Sets the passed vector "result" coordinates with the result of the transformation by the passed matrix of the passed floats (x, y, z).
         * This method computes tranformed coordinates only, not transformed direction vectors.
         */
    native public static void TransformCoordinatesFromFloatsToRef(double x, double y, double z, Matrix transformation, Vector3 result);
    /**
         * Returns a new Vector3 set with the result of the normal transformation by the passed matrix of the passed vector.
         * This methods computes transformed normalized direction vectors only.
         */
    native public static Vector3 TransformNormal(Vector3 vector, Matrix transformation);
    /**
         * Sets the passed vector "result" with the result of the normal transformation by the passed matrix of the passed vector.
         * This methods computes transformed normalized direction vectors only.
         */
    native public static void TransformNormalToRef(Vector3 vector, Matrix transformation, Vector3 result);
    /**
         * Sets the passed vector "result" with the result of the normal transformation by the passed matrix of the passed floats (x, y, z).
         * This methods computes transformed normalized direction vectors only.
         */
    native public static void TransformNormalFromFloatsToRef(double x, double y, double z, Matrix transformation, Vector3 result);
    /**
         * Returns a new Vector3 located for "amount" on the CatmullRom interpolation spline defined by the vectors "value1", "value2", "value3", "value4".
         */
    native public static Vector3 CatmullRom(Vector3 value1, Vector3 value2, Vector3 value3, Vector3 value4, double amount);
    /**
         * Returns a new Vector3 set with the coordinates of "value", if the vector "value" is in the cube defined by the vectors "min" and "max".
         * If a coordinate value of "value" is lower than one of the "min" coordinate, then this "value" coordinate is set with the "min" one.
         * If a coordinate value of "value" is greater than one of the "max" coordinate, then this "value" coordinate is set with the "max" one.
         */
    native public static Vector3 Clamp(Vector3 value, Vector3 min, Vector3 max);
    /**
         * Returns a new Vector3 located for "amount" (float) on the Hermite interpolation spline defined by the vectors "value1", "tangent1", "value2", "tangent2".
         */
    native public static Vector3 Hermite(Vector3 value1, Vector3 tangent1, Vector3 value2, Vector3 tangent2, double amount);
    /**
         * Returns a new Vector3 located for "amount" (float) on the linear interpolation between the vectors "start" and "end".
         */
    native public static Vector3 Lerp(Vector3 start, Vector3 end, double amount);
    /**
         * Sets the passed vector "result" with the result of the linear interpolation from the vector "start" for "amount" to the vector "end".
         */
    native public static void LerpToRef(Vector3 start, Vector3 end, double amount, Vector3 result);
    /**
         * Returns the dot product (float) between the vectors "left" and "right".
         */
    native public static double Dot(Vector3 left, Vector3 right);
    /**
         * Returns a new Vector3 as the cross product of the vectors "left" and "right".
         * The cross product is then orthogonal to both "left" and "right".
         */
    native public static Vector3 Cross(Vector3 left, Vector3 right);
    /**
         * Sets the passed vector "result" with the cross product of "left" and "right".
         * The cross product is then orthogonal to both "left" and "right".
         */
    native public static void CrossToRef(Vector3 left, Vector3 right, Vector3 result);
    /**
         * Returns a new Vector3 as the normalization of the passed vector.
         */
    native public static Vector3 Normalize(Vector3 vector);
    /**
         * Sets the passed vector "result" with the normalization of the passed first vector.
         */
    native public static void NormalizeToRef(Vector3 vector, Vector3 result);
    native public static Vector3 Project(Vector3 vector, Matrix world, Matrix transform, Viewport viewport);
    native public static Vector3 UnprojectFromTransform(Vector3 source, double viewportWidth, double viewportHeight, Matrix world, Matrix transform);
    native public static Vector3 Unproject(Vector3 source, double viewportWidth, double viewportHeight, Matrix world, Matrix view, Matrix projection);
    native public static Vector3 Minimize(Vector3 left, Vector3 right);
    native public static Vector3 Maximize(Vector3 left, Vector3 right);
    /**
         * Returns the distance (float) between the vectors "value1" and "value2".
         */
    native public static double Distance(Vector3 value1, Vector3 value2);
    /**
         * Returns the squared distance (float) between the vectors "value1" and "value2".
         */
    native public static double DistanceSquared(Vector3 value1, Vector3 value2);
    /**
         * Returns a new Vector3 located at the center between "value1" and "value2".
         */
    native public static Vector3 Center(Vector3 value1, Vector3 value2);
    /**
         * Given three orthogonal normalized left-handed oriented Vector3 axis in space (target system),
         * RotationFromAxis() returns the rotation Euler angles (ex : rotation.x, rotation.y, rotation.z) to apply
         * to something in order to rotate it from its local system to the given target system.
         * Note : axis1, axis2 and axis3 are normalized during this operation.
         * Returns a new Vector3.
         */
    native public static Vector3 RotationFromAxis(Vector3 axis1, Vector3 axis2, Vector3 axis3);
    /**
         * The same than RotationFromAxis but updates the passed ref Vector3 parameter instead of returning a new Vector3.
         */
    native public static void RotationFromAxisToRef(Vector3 axis1, Vector3 axis2, Vector3 axis3, Vector3 ref);
    /**
         * Populates the passed array or Float32Array from the passed index with the successive coordinates of the Vector3.
         * Returns the Vector3.
         */
    native public Vector3 toArray(double[] array);
    /**
         * Boolean : True if the current Vector3 and the passed vector coordinates are distant less than epsilon.
         */
    native public Boolean equalsWithEpsilon(Vector3 otherVector);
    /**
         * Returns a new Vector3 set from the index "offset" of the passed array.
         */
    native public static Vector3 FromArray(ArrayLike<Double> array);
    /**
         * Returns a new Vector3 set from the index "offset" of the passed Float32Array.
         * This function is deprecated.  Use FromArray instead.
         */
    native public static Vector3 FromFloatArray(Float32Array array);
    /**
         * Populates the passed array or Float32Array from the passed index with the successive coordinates of the Vector3.
         * Returns the Vector3.
         */
    native public Vector3 toArray(Float32Array array, double index);
    /**
         * Populates the passed array or Float32Array from the passed index with the successive coordinates of the Vector3.
         * Returns the Vector3.
         */
    native public Vector3 toArray(Float32Array array);
    /**
         * Returns a new Vector3 set from the index "offset" of the passed array.
         */
    native public static Vector3 FromArray(Double[] array, double offset);
    /**
         * Sets the passed vector "result" with the element values from the index "offset" of the passed array.
         */
    native public static void FromArrayToRef(Double[] array, double offset, Vector3 result);
    /**
         * Returns a new Vector3 set from the index "offset" of the passed array.
         */
    native public static Vector3 FromArray(Double[] array);
    protected Vector3(){}
}

