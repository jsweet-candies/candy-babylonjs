package def.babylonjs.babylon;
import def.js.Float32Array;
import def.js.ArrayLike;
public class Vector2 extends def.js.Object {
    public double x;
    public double y;
    /**
         * Creates a new Vector2 from the passed x and y coordinates.
         */
    public Vector2(double x, double y){}
    /**
         * Returns a string with the Vector2 coordinates.
         */
    native public String toString();
    /**
         * Returns the string "Vector2"
         */
    native public String getClassName();
    /**
         * Returns the Vector2 hash code as a number.
         */
    native public double getHashCode();
    /**
         * Sets the Vector2 coordinates in the passed array or Float32Array from the passed index.
         * Returns the Vector2.
         */
    native public Vector2 toArray(double[] array, double index);
    /**
         * Returns a new array with 2 elements : the Vector2 coordinates.
         */
    native public double[] asArray();
    /**
         *  Sets the Vector2 coordinates with the passed Vector2 coordinates.
         * Returns the updated Vector2.
         */
    native public Vector2 copyFrom(Vector2 source);
    /**
         * Sets the Vector2 coordinates with the passed floats.
         * Returns the updated Vector2.
         */
    native public Vector2 copyFromFloats(double x, double y);
    /**
         * Sets the Vector2 coordinates with the passed floats.
         * Returns the updated Vector2.
         */
    native public Vector2 set(double x, double y);
    /**
         * Returns a new Vector2 set with the addition of the current Vector2 and the passed one coordinates.
         */
    native public Vector2 add(Vector2 otherVector);
    /**
         * Sets the "result" coordinates with the addition of the current Vector2 and the passed one coordinates.
         * Returns the Vector2.
         */
    native public Vector2 addToRef(Vector2 otherVector, Vector2 result);
    /**
         * Set the Vector2 coordinates by adding the passed Vector2 coordinates.
         * Returns the updated Vector2.
         */
    native public Vector2 addInPlace(Vector2 otherVector);
    /**
         * Returns a new Vector2 by adding the current Vector2 coordinates to the passed Vector3 x, y coordinates.
         */
    native public Vector2 addVector3(Vector3 otherVector);
    /**
         * Returns a new Vector2 set with the subtracted coordinates of the passed one from the current Vector2.
         */
    native public Vector2 subtract(Vector2 otherVector);
    /**
         * Sets the "result" coordinates with the subtraction of the passed one from the current Vector2 coordinates.
         * Returns the Vector2.
         */
    native public Vector2 subtractToRef(Vector2 otherVector, Vector2 result);
    /**
         * Sets the current Vector2 coordinates by subtracting from it the passed one coordinates.
         * Returns the updated Vector2.
         */
    native public Vector2 subtractInPlace(Vector2 otherVector);
    /**
         * Multiplies in place the current Vector2 coordinates by the passed ones.
         * Returns the updated Vector2.
         */
    native public Vector2 multiplyInPlace(Vector2 otherVector);
    /**
         * Returns a new Vector2 set with the multiplication of the current Vector2 and the passed one coordinates.
         */
    native public Vector2 multiply(Vector2 otherVector);
    /**
         * Sets "result" coordinates with the multiplication of the current Vector2 and the passed one coordinates.
         * Returns the Vector2.
         */
    native public Vector2 multiplyToRef(Vector2 otherVector, Vector2 result);
    /**
         * Returns a new Vector2 set with the Vector2 coordinates multiplied by the passed floats.
         */
    native public Vector2 multiplyByFloats(double x, double y);
    /**
         * Returns a new Vector2 set with the Vector2 coordinates divided by the passed one coordinates.
         */
    native public Vector2 divide(Vector2 otherVector);
    /**
         * Sets the "result" coordinates with the Vector2 divided by the passed one coordinates.
         * Returns the Vector2.
         */
    native public Vector2 divideToRef(Vector2 otherVector, Vector2 result);
    /**
         * Returns a new Vector2 with current Vector2 negated coordinates.
         */
    native public Vector2 negate();
    /**
         * Multiply the Vector2 coordinates by scale.
         * Returns the updated Vector2.
         */
    native public Vector2 scaleInPlace(double scale);
    /**
         * Returns a new Vector2 scaled by "scale" from the current Vector2.
         */
    native public Vector2 scale(double scale);
    /**
         * Boolean : True if the passed vector coordinates strictly equal the current Vector2 ones.
         */
    @jsweet.lang.Name("equals")
    native public Boolean Equals(Vector2 otherVector);
    /**
         * Boolean : True if the passed vector coordinates are close to the current ones by a distance of epsilon.
         */
    native public Boolean equalsWithEpsilon(Vector2 otherVector, double epsilon);
    /**
         * Returns the vector length (float).
         */
    native public double length();
    /**
         * Returns the vector squared length (float);
         */
    native public double lengthSquared();
    /**
         * Normalize the vector.
         * Returns the updated Vector2.
         */
    native public Vector2 normalize();
    /**
         * Returns a new Vector2 copied from the Vector2.
         */
    @jsweet.lang.Name("clone")
    native public Vector2 Clone();
    /**
         * Returns a new Vector2(0, 0)
         */
    native public static Vector2 Zero();
    /**
         * Returns a new Vector2(1, 1)
         */
    native public static Vector2 One();
    /**
         * Returns a new Vector2 set from the passed index element of the passed array.
         */
    native public static Vector2 FromArray(ArrayLike<Double> array, double offset);
    /**
         * Sets "result" from the passed index element of the passed array.
         */
    native public static void FromArrayToRef(ArrayLike<Double> array, double offset, Vector2 result);
    /**
         * Retuns a new Vector2 located for "amount" (float) on the CatmullRom  spline defined by the passed four Vector2.
         */
    native public static Vector2 CatmullRom(Vector2 value1, Vector2 value2, Vector2 value3, Vector2 value4, double amount);
    /**
         * Returns a new Vector2 set with same the coordinates than "value" ones if the vector "value" is in the square defined by "min" and "max".
         * If a coordinate of "value" is lower than "min" coordinates, the returned Vector2 is given this "min" coordinate.
         * If a coordinate of "value" is greater than "max" coordinates, the returned Vector2 is given this "max" coordinate.
         */
    native public static Vector2 Clamp(Vector2 value, Vector2 min, Vector2 max);
    /**
         * Returns a new Vector2 located for "amount" (float) on the Hermite spline defined by the vectors "value1", "value3", "tangent1", "tangent2".
         */
    native public static Vector2 Hermite(Vector2 value1, Vector2 tangent1, Vector2 value2, Vector2 tangent2, double amount);
    /**
         * Returns a new Vector2 located for "amount" (float) on the linear interpolation between the vector "start" adn the vector "end".
         */
    native public static Vector2 Lerp(Vector2 start, Vector2 end, double amount);
    /**
         * Returns the dot product (float) of the vector "left" and the vector "right".
         */
    native public static double Dot(Vector2 left, Vector2 right);
    /**
         * Returns a new Vector2 equal to the normalized passed vector.
         */
    native public static Vector2 Normalize(Vector2 vector);
    /**
         * Returns a new Vecto2 set with the minimal coordinate values from the "left" and "right" vectors.
         */
    native public static Vector2 Minimize(Vector2 left, Vector2 right);
    /**
         * Returns a new Vecto2 set with the maximal coordinate values from the "left" and "right" vectors.
         */
    native public static Vector2 Maximize(Vector2 left, Vector2 right);
    /**
         * Returns a new Vecto2 set with the transformed coordinates of the passed vector by the passed transformation matrix.
         */
    native public static Vector2 Transform(Vector2 vector, Matrix transformation);
    /**
         * Transforms the passed vector coordinates by the passed transformation matrix and stores the result in the vector "result" coordinates.
         */
    native public static void TransformToRef(Vector2 vector, Matrix transformation, Vector2 result);
    /**
         * Boolean : True if the point "p" is in the triangle defined by the vertors "p0", "p1", "p2"
         */
    native public static Boolean PointInTriangle(Vector2 p, Vector2 p0, Vector2 p1, Vector2 p2);
    /**
         * Returns the distance (float) between the vectors "value1" and "value2".
         */
    native public static double Distance(Vector2 value1, Vector2 value2);
    /**
         * Returns the squared distance (float) between the vectors "value1" and "value2".
         */
    native public static double DistanceSquared(Vector2 value1, Vector2 value2);
    /**
         * Returns a new Vecto2 located at the center of the vectors "value1" and "value2".
         */
    native public static Vector2 Center(Vector2 value1, Vector2 value2);
    /**
         * Returns the shortest distance (float) between the point "p" and the segment defined by the two points "segA" and "segB".
         */
    native public static double DistanceOfPointFromSegment(Vector2 p, Vector2 segA, Vector2 segB);
    /**
         * Sets the Vector2 coordinates in the passed array or Float32Array from the passed index.
         * Returns the Vector2.
         */
    native public Vector2 toArray(double[] array);
    /**
         * Boolean : True if the passed vector coordinates are close to the current ones by a distance of epsilon.
         */
    native public Boolean equalsWithEpsilon(Vector2 otherVector);
    /**
         * Returns a new Vector2 set from the passed index element of the passed array.
         */
    native public static Vector2 FromArray(ArrayLike<Double> array);
    /**
         * Sets the Vector2 coordinates in the passed array or Float32Array from the passed index.
         * Returns the Vector2.
         */
    native public Vector2 toArray(Float32Array array, double index);
    /**
         * Sets the Vector2 coordinates in the passed array or Float32Array from the passed index.
         * Returns the Vector2.
         */
    native public Vector2 toArray(Float32Array array);
    /**
         * Returns a new Vector2 set from the passed index element of the passed array.
         */
    native public static Vector2 FromArray(Double[] array, double offset);
    /**
         * Sets "result" from the passed index element of the passed array.
         */
    native public static void FromArrayToRef(Double[] array, double offset, Vector2 result);
    /**
         * Returns a new Vector2 set from the passed index element of the passed array.
         */
    native public static Vector2 FromArray(Double[] array);
    protected Vector2(){}
}

