package def.babylonjs.babylon;
@jsweet.lang.Extends({IEasingFunction.class})
public class ExponentialEase extends EasingFunction {
    public double exponent;
    public ExponentialEase(double exponent){}
    native public double easeInCore(double gradient);
    native public double ease(double gradient);
    public ExponentialEase(){}
}

