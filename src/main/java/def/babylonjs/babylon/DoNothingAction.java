package def.babylonjs.babylon;
public class DoNothingAction extends Action {
    public DoNothingAction(Object triggerOptions, Condition condition){}
    native public void execute();
    native public Object serialize(Object parent);
    public DoNothingAction(Object triggerOptions){}
    public DoNothingAction(){}
}

