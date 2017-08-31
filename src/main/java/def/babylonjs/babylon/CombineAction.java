package def.babylonjs.babylon;
public class CombineAction extends Action {
    public Action[] children;
    public CombineAction(Object triggerOptions, Action[] children, Condition condition){}
    native public void _prepare();
    native public void execute(ActionEvent evt);
    native public Object serialize(Object parent);
    public CombineAction(Object triggerOptions, Action[] children){}
    protected CombineAction(){}
}

