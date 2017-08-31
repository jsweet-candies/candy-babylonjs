package def.babylonjs.babylon;
@jsweet.lang.Extends({IEasingFunction.class})
public class QuadraticEase extends EasingFunction {
    native public double easeInCore(double gradient);
    native public double ease(double gradient);
}

