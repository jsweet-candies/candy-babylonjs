package def.babylonjs.babylon;
public class Curve3 extends def.js.Object {
    /**
         * Returns a Curve3 object along a Quadratic Bezier curve : http://doc.babylonjs.com/tutorials/How_to_use_Curve3#quadratic-bezier-curve
         * @param v0 (Vector3) the origin point of the Quadratic Bezier
         * @param v1 (Vector3) the control point
         * @param v2 (Vector3) the end point of the Quadratic Bezier
         * @param nbPoints (integer) the wanted number of points in the curve
         */
    native public static Curve3 CreateQuadraticBezier(Vector3 v0, Vector3 v1, Vector3 v2, double nbPoints);
    /**
         * Returns a Curve3 object along a Cubic Bezier curve : http://doc.babylonjs.com/tutorials/How_to_use_Curve3#cubic-bezier-curve
         * @param v0 (Vector3) the origin point of the Cubic Bezier
         * @param v1 (Vector3) the first control point
         * @param v2 (Vector3) the second control point
         * @param v3 (Vector3) the end point of the Cubic Bezier
         * @param nbPoints (integer) the wanted number of points in the curve
         */
    native public static Curve3 CreateCubicBezier(Vector3 v0, Vector3 v1, Vector3 v2, Vector3 v3, double nbPoints);
    /**
         * Returns a Curve3 object along a Hermite Spline curve : http://doc.babylonjs.com/tutorials/How_to_use_Curve3#hermite-spline
         * @param p1 (Vector3) the origin point of the Hermite Spline
         * @param t1 (Vector3) the tangent vector at the origin point
         * @param p2 (Vector3) the end point of the Hermite Spline
         * @param t2 (Vector3) the tangent vector at the end point
         * @param nbPoints (integer) the wanted number of points in the curve
         */
    native public static Curve3 CreateHermiteSpline(Vector3 p1, Vector3 t1, Vector3 p2, Vector3 t2, double nbPoints);
    /**
         * Returns a Curve3 object along a CatmullRom Spline curve :
         * @param points (array of Vector3) the points the spline must pass through. At least, four points required.
         * @param nbPoints (integer) the wanted number of points between each curve control points.
         */
    native public static Curve3 CreateCatmullRomSpline(Vector3[] points, double nbPoints);
    /**
         * A Curve3 object is a logical object, so not a mesh, to handle curves in the 3D geometric space.
         * A Curve3 is designed from a series of successive Vector3.
         * Tuto : http://doc.babylonjs.com/tutorials/How_to_use_Curve3#curve3-object
         */
    public Curve3(Vector3[] points){}
    /**
         * Returns the Curve3 stored array of successive Vector3
         */
    native public Vector3[] getPoints();
    /**
         * Returns the computed length (float) of the curve.
         */
    native public double length();
    /**
         * Returns a new instance of Curve3 object : var curve = curveA.continue(curveB);
         * This new Curve3 is built by translating and sticking the curveB at the end of the curveA.
         * curveA and curveB keep unchanged.
         */
    @jsweet.lang.Name("continue")
    native public Curve3 Continue(Curve3 curve);
    protected Curve3(){}
}

