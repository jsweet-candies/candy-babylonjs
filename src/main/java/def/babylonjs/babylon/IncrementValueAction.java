package def.babylonjs.babylon;
public class IncrementValueAction extends Action {
    public String propertyPath;
    public Object value;
    public IncrementValueAction(Object triggerOptions, Object target, String propertyPath, Object value, Condition condition){}
    native public void _prepare();
    native public void execute();
    native public Object serialize(Object parent);
    public IncrementValueAction(Object triggerOptions, Object target, String propertyPath, Object value){}
    protected IncrementValueAction(){}
}

