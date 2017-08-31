package def.babylonjs.babylon;
public class SetStateAction extends Action {
    public String value;
    public SetStateAction(Object triggerOptions, Object target, String value, Condition condition){}
    native public void execute();
    native public Object serialize(Object parent);
    public SetStateAction(Object triggerOptions, Object target, String value){}
    protected SetStateAction(){}
}

