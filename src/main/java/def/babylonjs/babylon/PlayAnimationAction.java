package def.babylonjs.babylon;
public class PlayAnimationAction extends Action {
    public double from;
    public double to;
    public Boolean loop;
    public PlayAnimationAction(Object triggerOptions, Object target, double from, double to, Boolean loop, Condition condition){}
    native public void _prepare();
    native public void execute();
    native public Object serialize(Object parent);
    public PlayAnimationAction(Object triggerOptions, Object target, double from, double to, Boolean loop){}
    public PlayAnimationAction(Object triggerOptions, Object target, double from, double to){}
    protected PlayAnimationAction(){}
}

