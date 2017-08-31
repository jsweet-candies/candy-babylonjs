package def.babylonjs.babylon;
public class SetParentAction extends Action {
    public SetParentAction(Object triggerOptions, Object target, Object parent, Condition condition){}
    native public void _prepare();
    native public void execute();
    native public Object serialize(Object parent);
    public SetParentAction(Object triggerOptions, Object target, Object parent){}
    protected SetParentAction(){}
}

