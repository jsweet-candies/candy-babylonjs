package def.babylonjs.babylon;
@jsweet.lang.Extends({IEasingFunction.class})
public class BezierCurveEase extends EasingFunction {
    public double x1;
    public double y1;
    public double x2;
    public double y2;
    public BezierCurveEase(double x1, double y1, double x2, double y2){}
    native public double easeInCore(double gradient);
    native public double ease(double gradient);
    public BezierCurveEase(double x1, double y1, double x2){}
    public BezierCurveEase(double x1, double y1){}
    public BezierCurveEase(double x1){}
    public BezierCurveEase(){}
}

