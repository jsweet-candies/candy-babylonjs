package def.babylonjs.earcut;
/** This class holds all the global functions and variables of the Earcut package. */
public final class Globals {
    private Globals(){}
    /**
     * The fastest and smallest JavaScript polygon triangulation library for your WebGL apps
     * @param data is a flat array of vertice coordinates like [x0, y0, x1, y1, x2, y2, ...].
     * @param holeIndices is an array of hole indices if any (e.g. [5, 8] for a 12- vertice input would mean one hole with vertices 5–7 and another with 8–11).
     * @param dim is the number of coordinates per vertice in the input array (2 by default).
     */
    native public static Object[] earcut(double[] data, double[] holeIndices, double dim);
    /**
     * return a percentage difference between the polygon area and its triangulation area;
     * used to verify correctness of triangulation
     */
    native public static double deviation(double[] data, double[] holeIndices, double dim, double[] triangles);
    /**
     *  turn a polygon in a multi-dimensional array form (e.g. as in GeoJSON) into a form Earcut accepts
     */
    native public static Flatten flatten(double[][][] data);
}

