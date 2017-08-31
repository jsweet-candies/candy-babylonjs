package def.babylonjs.babylon;
public class PathCursor extends def.js.Object {
    public double value;
    public Animation[] animations;
    public PathCursor(Path2 path){}
    native public Vector3 getPoint();
    native public PathCursor moveAhead(double step);
    native public PathCursor moveBack(double step);
    native public PathCursor move(double step);
    native public PathCursor onchange(java.util.function.Consumer<PathCursor> f);
    native public PathCursor moveAhead();
    native public PathCursor moveBack();
    protected PathCursor(){}
}

