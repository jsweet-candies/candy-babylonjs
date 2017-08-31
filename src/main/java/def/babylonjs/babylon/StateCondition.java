package def.babylonjs.babylon;
public class StateCondition extends Condition {
    public String value;
    public ActionManager _actionManager;
    public StateCondition(ActionManager actionManager, Object target, String value){}
    native public Boolean isValid();
    native public Object serialize();
    protected StateCondition(){}
}

