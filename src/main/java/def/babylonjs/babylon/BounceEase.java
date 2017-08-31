package def.babylonjs.babylon;
@jsweet.lang.Extends({IEasingFunction.class})
public class BounceEase extends EasingFunction {
    public double bounces;
    public double bounciness;
    public BounceEase(double bounces, double bounciness){}
    native public double easeInCore(double gradient);
    native public double ease(double gradient);
    public BounceEase(double bounces){}
    public BounceEase(){}
}

