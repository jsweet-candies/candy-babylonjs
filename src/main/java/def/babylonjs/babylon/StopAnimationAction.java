package def.babylonjs.babylon;
public class StopAnimationAction extends Action {
    public StopAnimationAction(Object triggerOptions, Object target, Condition condition){}
    native public void _prepare();
    native public void execute();
    native public Object serialize(Object parent);
    public StopAnimationAction(Object triggerOptions, Object target){}
    protected StopAnimationAction(){}
}

