package def.babylonjs.babylon;
public class SetValueAction extends Action {
    public String propertyPath;
    public Object value;
    public SetValueAction(Object triggerOptions, Object target, String propertyPath, Object value, Condition condition){}
    native public void _prepare();
    native public void execute();
    native public Object serialize(Object parent);
    public SetValueAction(Object triggerOptions, Object target, String propertyPath, Object value){}
    protected SetValueAction(){}
}

