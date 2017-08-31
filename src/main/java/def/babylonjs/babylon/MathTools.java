package def.babylonjs.babylon;
public class MathTools extends def.js.Object {
    /**
         * Boolean : true if the absolute difference between a and b is lower than epsilon (default = 1.401298E-45)
         */
    native public static Boolean WithinEpsilon(double a, double b, double epsilon);
    /**
         * Returns a string : the upper case translation of the number i to hexadecimal.
         */
    native public static String ToHex(double i);
    /**
         * Returns -1 if value is negative and +1 is value is positive.
         * Returns the value itself if it's equal to zero.
         */
    native public static double Sign(double value);
    /**
         * Returns the value itself if it's between min and max.
         * Returns min if the value is lower than min.
         * Returns max if the value is greater than max.
         */
    native public static double Clamp(double value, double min, double max);
    /**
         * Returns the log2 of value.
         */
    native public static double Log2(double value);
    /**
         * Boolean : true if the absolute difference between a and b is lower than epsilon (default = 1.401298E-45)
         */
    native public static Boolean WithinEpsilon(double a, double b);
    /**
         * Returns the value itself if it's between min and max.
         * Returns min if the value is lower than min.
         * Returns max if the value is greater than max.
         */
    native public static double Clamp(double value, double min);
    /**
         * Returns the value itself if it's between min and max.
         * Returns min if the value is lower than min.
         * Returns max if the value is greater than max.
         */
    native public static double Clamp(double value);
}

