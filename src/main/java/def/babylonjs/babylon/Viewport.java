package def.babylonjs.babylon;
public class Viewport extends def.js.Object {
    public double x;
    public double y;
    public double width;
    public double height;
    /**
         * Creates a Viewport object located at (x, y) and sized (width, height).
         */
    public Viewport(double x, double y, double width, double height){}
    native public Viewport toGlobal(double renderWidthOrEngine, double renderHeight);
    /**
         * Returns a new Viewport copied from the current one.
         */
    @jsweet.lang.Name("clone")
    native public Viewport Clone();
    native public Viewport toGlobal(Engine renderWidthOrEngine, double renderHeight);
    protected Viewport(){}
}

