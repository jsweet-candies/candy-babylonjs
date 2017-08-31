package def.babylonjs.babylon;
import def.js.Float32Array;
import def.js.ArrayLike;
public class Color3 extends def.js.Object {
    public double r;
    public double g;
    public double b;
    /**
         * Creates a new Color3 object from red, green, blue values, all between 0 and 1.
         */
    public Color3(double r, double g, double b){}
    /**
         * Returns a string with the Color3 current values.
         */
    native public String toString();
    /**
         * Returns the string "Color3".
         */
    native public String getClassName();
    /**
         * Returns the Color3 hash code.
         */
    native public double getHashCode();
    /**
         * Stores in the passed array from the passed starting index the red, green, blue values as successive elements.
         * Returns the Color3.
         */
    native public Color3 toArray(double[] array, double index);
    /**
         * Returns a new Color4 object from the current Color3 and the passed alpha.
         */
    native public Color4 toColor4(double alpha);
    /**
         * Returns a new array populated with 3 numeric elements : red, green and blue values.
         */
    native public double[] asArray();
    /**
         * Returns the luminance value (float).
         */
    native public double toLuminance();
    /**
         * Multiply each Color3 rgb values by the passed Color3 rgb values in a new Color3 object.
         * Returns this new object.
         */
    native public Color3 multiply(Color3 otherColor);
    /**
         * Multiply the rgb values of the Color3 and the passed Color3 and stores the result in the object "result".
         * Returns the current Color3.
         */
    native public Color3 multiplyToRef(Color3 otherColor, Color3 result);
    /**
         * Boolean : True if the rgb values are equal to the passed ones.
         */
    @jsweet.lang.Name("equals")
    native public Boolean Equals(Color3 otherColor);
    /**
         * Boolean : True if the rgb values are equal to the passed ones.
         */
    native public Boolean equalsFloats(double r, double g, double b);
    /**
         * Multiplies in place each rgb value by scale.
         * Returns the updated Color3.
         */
    native public Color3 scale(double scale);
    /**
         * Multiplies the rgb values by scale and stores the result into "result".
         * Returns the unmodified current Color3.
         */
    native public Color3 scaleToRef(double scale, Color3 result);
    /**
         * Returns a new Color3 set with the added values of the current Color3 and of the passed one.
         */
    native public Color3 add(Color3 otherColor);
    /**
         * Stores the result of the addition of the current Color3 and passed one rgb values into "result".
         * Returns the unmodified current Color3.
         */
    native public Color3 addToRef(Color3 otherColor, Color3 result);
    /**
         * Returns a new Color3 set with the subtracted values of the passed one from the current Color3 .
         */
    native public Color3 subtract(Color3 otherColor);
    /**
         * Stores the result of the subtraction of passed one from the current Color3 rgb values into "result".
         * Returns the unmodified current Color3.
         */
    native public Color3 subtractToRef(Color3 otherColor, Color3 result);
    /**
         * Returns a new Color3 copied the current one.
         */
    @jsweet.lang.Name("clone")
    native public Color3 Clone();
    /**
         * Copies the rgb values from the source in the current Color3.
         * Returns the updated Color3.
         */
    native public Color3 copyFrom(Color3 source);
    /**
         * Updates the Color3 rgb values from the passed floats.
         * Returns the Color3.
         */
    native public Color3 copyFromFloats(double r, double g, double b);
    /**
         * Updates the Color3 rgb values from the passed floats.
         * Returns the Color3.
         */
    native public Color3 set(double r, double g, double b);
    /**
         * Returns the Color3 hexadecimal code as a string.
         */
    native public String toHexString();
    /**
         * Returns a new Color3 converted to linear space.
         */
    native public Color3 toLinearSpace();
    /**
         * Converts the Color3 values to linear space and stores the result in "convertedColor".
         * Returns the unmodified Color3.
         */
    native public Color3 toLinearSpaceToRef(Color3 convertedColor);
    /**
         * Returns a new Color3 converted to gamma space.
         */
    native public Color3 toGammaSpace();
    /**
         * Converts the Color3 values to gamma space and stores the result in "convertedColor".
         * Returns the unmodified Color3.
         */
    native public Color3 toGammaSpaceToRef(Color3 convertedColor);
    /**
         * Creates a new Color3 from the string containing valid hexadecimal values.
         */
    native public static Color3 FromHexString(String hex);
    /**
         * Creates a new Vector3 from the startind index of the passed array.
         */
    native public static Color3 FromArray(ArrayLike<Double> array, double offset);
    /**
         * Creates a new Color3 from integer values ( < 256).
         */
    native public static Color3 FromInts(double r, double g, double b);
    /**
         * Creates a new Color3 with values linearly interpolated of "amount" between the start Color3 and the end Color3.
         */
    native public static Color3 Lerp(Color3 start, Color3 end, double amount);
    native public static Color3 Red();
    native public static Color3 Green();
    native public static Color3 Blue();
    native public static Color3 Black();
    native public static Color3 White();
    native public static Color3 Purple();
    native public static Color3 Magenta();
    native public static Color3 Yellow();
    native public static Color3 Gray();
    native public static Color3 Random();
    /**
         * Creates a new Color3 object from red, green, blue values, all between 0 and 1.
         */
    public Color3(double r, double g){}
    /**
         * Creates a new Color3 object from red, green, blue values, all between 0 and 1.
         */
    public Color3(double r){}
    /**
         * Creates a new Color3 object from red, green, blue values, all between 0 and 1.
         */
    public Color3(){}
    /**
         * Stores in the passed array from the passed starting index the red, green, blue values as successive elements.
         * Returns the Color3.
         */
    native public Color3 toArray(double[] array);
    /**
         * Returns a new Color4 object from the current Color3 and the passed alpha.
         */
    native public Color4 toColor4();
    /**
         * Creates a new Vector3 from the startind index of the passed array.
         */
    native public static Color3 FromArray(ArrayLike<Double> array);
    /**
         * Stores in the passed array from the passed starting index the red, green, blue values as successive elements.
         * Returns the Color3.
         */
    native public Color3 toArray(Float32Array array, double index);
    /**
         * Stores in the passed array from the passed starting index the red, green, blue values as successive elements.
         * Returns the Color3.
         */
    native public Color3 toArray(Float32Array array);
    /**
         * Creates a new Vector3 from the startind index of the passed array.
         */
    native public static Color3 FromArray(Double[] array, double offset);
    /**
         * Creates a new Vector3 from the startind index of the passed array.
         */
    native public static Color3 FromArray(Double[] array);
}

