package def.babylonjs.babylon;
@jsweet.lang.Extends({IEasingFunction.class})
public class ElasticEase extends EasingFunction {
    public double oscillations;
    public double springiness;
    public ElasticEase(double oscillations, double springiness){}
    native public double easeInCore(double gradient);
    native public double ease(double gradient);
    public ElasticEase(double oscillations){}
    public ElasticEase(){}
}

