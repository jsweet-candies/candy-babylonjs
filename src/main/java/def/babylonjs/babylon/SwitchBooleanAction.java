package def.babylonjs.babylon;
public class SwitchBooleanAction extends Action {
    public String propertyPath;
    public SwitchBooleanAction(Object triggerOptions, Object target, String propertyPath, Condition condition){}
    native public void _prepare();
    native public void execute();
    native public Object serialize(Object parent);
    public SwitchBooleanAction(Object triggerOptions, Object target, String propertyPath){}
    protected SwitchBooleanAction(){}
}

