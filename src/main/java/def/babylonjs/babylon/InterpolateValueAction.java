package def.babylonjs.babylon;
public class InterpolateValueAction extends Action {
    public String propertyPath;
    public Object value;
    public double duration;
    public Boolean stopOtherAnimations;
    public java.lang.Runnable onInterpolationDone;
    public InterpolateValueAction(Object triggerOptions, Object target, String propertyPath, Object value, double duration, Condition condition, Boolean stopOtherAnimations, java.lang.Runnable onInterpolationDone){}
    native public void _prepare();
    native public void execute();
    native public Object serialize(Object parent);
    public InterpolateValueAction(Object triggerOptions, Object target, String propertyPath, Object value, double duration, Condition condition, Boolean stopOtherAnimations){}
    public InterpolateValueAction(Object triggerOptions, Object target, String propertyPath, Object value, double duration, Condition condition){}
    public InterpolateValueAction(Object triggerOptions, Object target, String propertyPath, Object value, double duration){}
    public InterpolateValueAction(Object triggerOptions, Object target, String propertyPath, Object value){}
    protected InterpolateValueAction(){}
}

