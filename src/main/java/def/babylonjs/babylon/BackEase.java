package def.babylonjs.babylon;
@jsweet.lang.Extends({IEasingFunction.class})
public class BackEase extends EasingFunction {
    public double amplitude;
    public BackEase(double amplitude){}
    native public double easeInCore(double gradient);
    native public double ease(double gradient);
    public BackEase(){}
}

