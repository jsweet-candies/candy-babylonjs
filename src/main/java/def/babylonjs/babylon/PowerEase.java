package def.babylonjs.babylon;
@jsweet.lang.Extends({IEasingFunction.class})
public class PowerEase extends EasingFunction {
    public double power;
    public PowerEase(double power){}
    native public double easeInCore(double gradient);
    native public double ease(double gradient);
    public PowerEase(){}
}

