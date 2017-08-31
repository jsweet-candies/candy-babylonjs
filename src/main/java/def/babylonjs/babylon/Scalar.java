package def.babylonjs.babylon;
public class Scalar extends def.js.Object {
    /**
         * Creates a new scalar with values linearly interpolated of "amount" between the start scalar and the end scalar.
         */
    native public static double Lerp(double start, double end, double amount);
    /**
         * Returns a new scalar located for "amount" (float) on the Hermite spline defined by the scalars "value1", "value3", "tangent1", "tangent2".
         */
    native public static double Hermite(double value1, double tangent1, double value2, double tangent2, double amount);
}

