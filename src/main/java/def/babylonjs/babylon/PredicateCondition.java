package def.babylonjs.babylon;
public class PredicateCondition extends Condition {
    public java.util.function.Supplier<Boolean> predicate;
    public ActionManager _actionManager;
    public PredicateCondition(ActionManager actionManager, java.util.function.Supplier<Boolean> predicate){}
    native public Boolean isValid();
    protected PredicateCondition(){}
}

