package def.babylonjs.babylon;
public class BezierCurve extends def.js.Object {
    /**
         * Returns the cubic Bezier interpolated value (float) at "t" (float) from the passed x1, y1, x2, y2 floats.
         */
    native public static double interpolate(double t, double x1, double y1, double x2, double y2);
}

