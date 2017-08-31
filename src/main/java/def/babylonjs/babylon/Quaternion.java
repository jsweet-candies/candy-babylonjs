package def.babylonjs.babylon;
import def.js.ArrayLike;
public class Quaternion extends def.js.Object {
    public double x;
    public double y;
    public double z;
    public double w;
    /**
         * Creates a new Quaternion from the passed floats.
         */
    public Quaternion(double x, double y, double z, double w){}
    /**
         * Returns a string with the Quaternion coordinates.
         */
    native public String toString();
    /**
         * Returns the string "Quaternion".
         */
    native public String getClassName();
    /**
         * Returns the Quaternion hash code.
         */
    native public double getHashCode();
    /**
         * Returns a new array populated with 4 elements : the Quaternion coordinates.
         */
    native public double[] asArray();
    /**
         * Boolean : True if the current Quaterion and the passed one coordinates are strictly equal.
         */
    @jsweet.lang.Name("equals")
    native public Boolean Equals(Quaternion otherQuaternion);
    /**
         * Returns a new Quaternion copied from the current one.
         */
    @jsweet.lang.Name("clone")
    native public Quaternion Clone();
    /**
         * Updates the current Quaternion from the passed one coordinates.
         * Returns the updated Quaterion.
         */
    native public Quaternion copyFrom(Quaternion other);
    /**
         * Updates the current Quaternion from the passed float coordinates.
         * Returns the updated Quaterion.
         */
    native public Quaternion copyFromFloats(double x, double y, double z, double w);
    /**
         * Updates the current Quaternion from the passed float coordinates.
         * Returns the updated Quaterion.
         */
    native public Quaternion set(double x, double y, double z, double w);
    /**
         * Returns a new Quaternion as the addition result of the passed one and the current Quaternion.
         */
    native public Quaternion add(Quaternion other);
    /**
         * Returns a new Quaternion as the subtraction result of the passed one from the current Quaternion.
         */
    native public Quaternion subtract(Quaternion other);
    /**
         * Returns a new Quaternion set by multiplying the current Quaterion coordinates by the float "scale".
         */
    native public Quaternion scale(double value);
    /**
         * Returns a new Quaternion set as the quaternion mulplication result of the current one with the passed one "q1".
         */
    native public Quaternion multiply(Quaternion q1);
    /**
         * Sets the passed "result" as the quaternion mulplication result of the current one with the passed one "q1".
         * Returns the current Quaternion.
         */
    native public Quaternion multiplyToRef(Quaternion q1, Quaternion result);
    /**
         * Updates the current Quaternion with the quaternion mulplication result of itself with the passed one "q1".
         * Returns the updated Quaternion.
         */
    native public Quaternion multiplyInPlace(Quaternion q1);
    /**
         * Sets the passed "ref" with the conjugation of the current Quaternion.
         * Returns the current Quaternion.
         */
    native public Quaternion conjugateToRef(Quaternion ref);
    /**
         * Conjugates in place the current Quaternion.
         * Returns the updated Quaternion.
         */
    native public Quaternion conjugateInPlace();
    /**
         * Returns a new Quaternion as the conjugate of the current Quaternion.
         */
    native public Quaternion conjugate();
    /**
         * Returns the Quaternion length (float).
         */
    native public double length();
    /**
         * Normalize in place the current Quaternion.
         * Returns the updated Quaternion.
         */
    native public Quaternion normalize();
    /**
         * Returns a new Vector3 set with the Euler angles translated from the current Quaternion.
         */
    native public Vector3 toEulerAngles(String order);
    /**
         * Sets the passed vector3 "result" with the Euler angles translated from the current Quaternion.
         * Returns the current Quaternion.
         */
    native public Quaternion toEulerAnglesToRef(Vector3 result, String order);
    /**
         * Updates the passed rotation matrix with the current Quaternion values.
         * Returns the current Quaternion.
         */
    native public Quaternion toRotationMatrix(Matrix result);
    /**
         * Updates the current Quaternion from the passed rotation matrix values.
         * Returns the updated Quaternion.
         */
    native public Quaternion fromRotationMatrix(Matrix matrix);
    /**
         * Returns a new Quaternion set from the passed rotation matrix values.
         */
    native public static Quaternion FromRotationMatrix(Matrix matrix);
    /**
         * Updates the passed quaternion "result" with the passed rotation matrix values.
         */
    native public static void FromRotationMatrixToRef(Matrix matrix, Quaternion result);
    /**
         * Returns a new Quaternion set to (0.0, 0.0, 0.0).
         */
    native public static Quaternion Zero();
    /**
         * Returns a new Quaternion as the inverted current Quaternion.
         */
    native public static Quaternion Inverse(Quaternion q);
    /**
         * Returns the identity Quaternion.
         */
    native public static Quaternion Identity();
    native public static Boolean IsIdentity(Quaternion quaternion);
    /**
         * Returns a new Quaternion set from the passed axis (Vector3) and angle in radians (float).
         */
    native public static Quaternion RotationAxis(Vector3 axis, double angle);
    /**
         * Sets the passed quaternion "result" from the passed axis (Vector3) and angle in radians (float).
         */
    native public static Quaternion RotationAxisToRef(Vector3 axis, double angle, Quaternion result);
    /**
         * Retuns a new Quaternion set from the starting index of the passed array.
         */
    native public static Quaternion FromArray(ArrayLike<Double> array, double offset);
    /**
         * Returns a new Quaternion set from the passed Euler float angles (y, x, z).
         */
    native public static Quaternion RotationYawPitchRoll(double yaw, double pitch, double roll);
    /**
         * Sets the passed quaternion "result" from the passed float Euler angles (y, x, z).
         */
    native public static void RotationYawPitchRollToRef(double yaw, double pitch, double roll, Quaternion result);
    /**
         * Returns a new Quaternion from the passed float Euler angles expressed in z-x-z orientation
         */
    native public static Quaternion RotationAlphaBetaGamma(double alpha, double beta, double gamma);
    /**
         * Sets the passed quaternion "result" from the passed float Euler angles expressed in z-x-z orientation
         */
    native public static void RotationAlphaBetaGammaToRef(double alpha, double beta, double gamma, Quaternion result);
    /**
         * Returns a new Quaternion as the quaternion rotation value to reach the target (axis1, axis2, axis3) orientation as a rotated XYZ system.
         * cf to Vector3.RotationFromAxis() documentation.
         * Note : axis1, axis2 and axis3 are normalized during this operation.
         */
    native public static Quaternion RotationQuaternionFromAxis(Vector3 axis1, Vector3 axis2, Vector3 axis3, Quaternion ref);
    /**
         * Sets the passed quaternion "ref" with the quaternion rotation value to reach the target (axis1, axis2, axis3) orientation as a rotated XYZ system.
         * cf to Vector3.RotationFromAxis() documentation.
         * Note : axis1, axis2 and axis3 are normalized during this operation.
         */
    native public static void RotationQuaternionFromAxisToRef(Vector3 axis1, Vector3 axis2, Vector3 axis3, Quaternion ref);
    native public static Quaternion Slerp(Quaternion left, Quaternion right, double amount);
    native public static void SlerpToRef(Quaternion left, Quaternion right, double amount, Quaternion result);
    /**
         * Returns a new Quaternion located for "amount" (float) on the Hermite interpolation spline defined by the vectors "value1", "tangent1", "value2", "tangent2".
         */
    native public static Quaternion Hermite(Quaternion value1, Quaternion tangent1, Quaternion value2, Quaternion tangent2, double amount);
    /**
         * Creates a new Quaternion from the passed floats.
         */
    public Quaternion(double x, double y, double z){}
    /**
         * Creates a new Quaternion from the passed floats.
         */
    public Quaternion(double x, double y){}
    /**
         * Creates a new Quaternion from the passed floats.
         */
    public Quaternion(double x){}
    /**
         * Creates a new Quaternion from the passed floats.
         */
    public Quaternion(){}
    /**
         * Returns a new Vector3 set with the Euler angles translated from the current Quaternion.
         */
    native public Vector3 toEulerAngles();
    /**
         * Sets the passed vector3 "result" with the Euler angles translated from the current Quaternion.
         * Returns the current Quaternion.
         */
    native public Quaternion toEulerAnglesToRef(Vector3 result);
    /**
         * Retuns a new Quaternion set from the starting index of the passed array.
         */
    native public static Quaternion FromArray(ArrayLike<Double> array);
    /**
         * Retuns a new Quaternion set from the starting index of the passed array.
         */
    native public static Quaternion FromArray(Double[] array, double offset);
    /**
         * Retuns a new Quaternion set from the starting index of the passed array.
         */
    native public static Quaternion FromArray(Double[] array);
}

