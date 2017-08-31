package def.babylonjs.babylon;
public class Path2 extends def.js.Object {
    public Boolean closed;
    /**
         * Creates a Path2 object from the starting 2D coordinates x and y.
         */
    public Path2(double x, double y){}
    /**
         * Adds a new segment until the passed coordinates (x, y) to the current Path2.
         * Returns the updated Path2.
         */
    native public Path2 addLineTo(double x, double y);
    /**
         * Adds _numberOfSegments_ segments according to the arc definition (middle point coordinates, end point coordinates, the arc start point being the current Path2 last point) to the current Path2.
         * Returns the updated Path2.
         */
    native public Path2 addArcTo(double midX, double midY, double endX, double endY, double numberOfSegments);
    /**
         * Closes the Path2.
         * Returns the Path2.
         */
    native public Path2 close();
    /**
         * Returns the Path2 total length (float).
         */
    native public double length();
    /**
         * Returns the Path2 internal array of points.
         */
    native public Vector2[] getPoints();
    /**
         * Returns a new Vector2 located at a percentage of the Path2 total length on this path.
         */
    native public Vector2 getPointAtLengthPosition(double normalizedLengthPosition);
    /**
         * Returns a new Path2 starting at the coordinates (x, y).
         */
    native public static Path2 StartingAt(double x, double y);
    /**
         * Adds _numberOfSegments_ segments according to the arc definition (middle point coordinates, end point coordinates, the arc start point being the current Path2 last point) to the current Path2.
         * Returns the updated Path2.
         */
    native public Path2 addArcTo(double midX, double midY, double endX, double endY);
    protected Path2(){}
}

