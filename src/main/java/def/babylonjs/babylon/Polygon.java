package def.babylonjs.babylon;
public class Polygon extends def.js.Object {
    native public static Vector2[] Rectangle(double xmin, double ymin, double xmax, double ymax);
    native public static Vector2[] Circle(double radius, double cx, double cy, double numberOfSides);
    native public static Vector2[] Parse(String input);
    native public static Path2 StartingAt(double x, double y);
    native public static Vector2[] Circle(double radius, double cx, double cy);
    native public static Vector2[] Circle(double radius, double cx);
    native public static Vector2[] Circle(double radius);
}

