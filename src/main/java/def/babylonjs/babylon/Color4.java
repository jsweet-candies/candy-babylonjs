package def.babylonjs.babylon;
import def.js.ArrayLike;
public class Color4 extends def.js.Object {
    public double r;
    public double g;
    public double b;
    public double a;
    /**
         * Creates a new Color4 object from the passed float values ( < 1) : red, green, blue, alpha.
         */
    public Color4(double r, double g, double b, double a){}
    /**
         * Adds in place the passed Color4 values to the current Color4.
         * Returns the updated Color4.
         */
    native public Color4 addInPlace(Object right);
    /**
         * Returns a new array populated with 4 numeric elements : red, green, blue, alpha values.
         */
    native public double[] asArray();
    /**
         * Stores from the starting index in the passed array the Color4 successive values.
         * Returns the Color4.
         */
    native public Color4 toArray(double[] array, double index);
    /**
         * Returns a new Color4 set with the added values of the current Color4 and of the passed one.
         */
    native public Color4 add(Color4 right);
    /**
         * Returns a new Color4 set with the subtracted values of the passed one from the current Color4.
         */
    native public Color4 subtract(Color4 right);
    /**
         * Subtracts the passed ones from the current Color4 values and stores the results in "result".
         * Returns the Color4.
         */
    native public Color4 subtractToRef(Color4 right, Color4 result);
    /**
         * Creates a new Color4 with the current Color4 values multiplied by scale.
         */
    native public Color4 scale(double scale);
    /**
         * Multiplies the current Color4 values by scale and stores the result in "result".
         * Returns the Color4.
         */
    native public Color4 scaleToRef(double scale, Color4 result);
    /**
          * Multipy an RGBA Color4 value by another and return a new Color4 object
          * @param color The Color4 (RGBA) value to multiply by
          * @returns A new Color4.
          */
    native public Color4 multiply(Color4 color);
    /**
         * Multipy an RGBA Color4 value by another and push the result in a reference value
         * @param color The Color4 (RGBA) value to multiply by
         * @param result The Color4 (RGBA) to fill the result in
         * @returns the result Color4.
         */
    native public Color4 multiplyToRef(Color4 color, Color4 result);
    /**
         * Returns a string with the Color4 values.
         */
    native public String toString();
    /**
         * Returns the string "Color4"
         */
    native public String getClassName();
    /**
         * Return the Color4 hash code as a number.
         */
    native public double getHashCode();
    /**
         * Creates a new Color4 copied from the current one.
         */
    @jsweet.lang.Name("clone")
    native public Color4 Clone();
    /**
         * Copies the passed Color4 values into the current one.
         * Returns the updated Color4.
         */
    native public Color4 copyFrom(Color4 source);
    /**
         * Copies the passed float values into the current one.
         * Returns the updated Color4.
         */
    native public Color4 copyFromFloats(double r, double g, double b, double a);
    /**
         * Copies the passed float values into the current one.
         * Returns the updated Color4.
         */
    native public Color4 set(double r, double g, double b, double a);
    /**
         * Returns a string containing the hexadecimal Color4 code.
         */
    native public String toHexString();
    /**
         * Creates a new Color4 from the valid hexadecimal value contained in the passed string.
         */
    native public static Color4 FromHexString(String hex);
    /**
         * Creates a new Color4 object set with the linearly interpolated values of "amount" between the left Color4 and the right Color4.
         */
    native public static Color4 Lerp(Color4 left, Color4 right, double amount);
    /**
         * Set the passed "result" with the linearly interpolated values of "amount" between the left Color4 and the right Color4.
         */
    native public static void LerpToRef(Color4 left, Color4 right, double amount, Color4 result);
    /**
         * Creates a new Color4 from the starting index element of the passed array.
         */
    native public static Color4 FromArray(ArrayLike<Double> array, double offset);
    /**
         * Creates a new Color4 from the passed integers ( < 256 ).
         */
    native public static Color4 FromInts(double r, double g, double b, double a);
    native public static double[] CheckColors4(double[] colors, double count);
    /**
         * Stores from the starting index in the passed array the Color4 successive values.
         * Returns the Color4.
         */
    native public Color4 toArray(double[] array);
    /**
         * Creates a new Color4 from the starting index element of the passed array.
         */
    native public static Color4 FromArray(ArrayLike<Double> array);
    /**
         * Creates a new Color4 from the starting index element of the passed array.
         */
    native public static Color4 FromArray(Double[] array, double offset);
    /**
         * Creates a new Color4 from the starting index element of the passed array.
         */
    native public static Color4 FromArray(Double[] array);
    protected Color4(){}
}

