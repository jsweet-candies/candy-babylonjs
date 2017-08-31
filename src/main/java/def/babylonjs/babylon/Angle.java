package def.babylonjs.babylon;
public class Angle extends def.js.Object {
    /**
         * Creates an Angle object of "radians" radians (float).
         */
    public Angle(double radians){}
    /**
         * Returns the Angle value in degrees (float).
         */
    public java.util.function.Supplier<Double> degrees;
    /**
         * Returns the Angle value in radians (float).
         */
    public java.util.function.Supplier<Double> radians;
    /**
         * Returns a new Angle object valued with the angle value in radians between the two passed vectors.
         */
    native public static Angle BetweenTwoPoints(Vector2 a, Vector2 b);
    /**
         * Returns a new Angle object from the passed float in radians.
         */
    native public static Angle FromRadians(double radians);
    /**
         * Returns a new Angle object from the passed float in degrees.
         */
    native public static Angle FromDegrees(double degrees);
    protected Angle(){}
}

