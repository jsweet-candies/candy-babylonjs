package def.babylonjs.babylon;
@jsweet.lang.Extends({IEasingFunction.class})
public class QuarticEase extends EasingFunction {
    native public double easeInCore(double gradient);
    native public double ease(double gradient);
}

