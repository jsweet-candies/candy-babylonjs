package def.babylonjs.babylon;
public class Condition extends def.js.Object {
    public ActionManager _actionManager;
    public double _evaluationId;
    public Boolean _currentResult;
    public Condition(ActionManager actionManager){}
    native public Boolean isValid();
    native public String _getProperty(String propertyPath);
    native public Object _getEffectiveTarget(Object target, String propertyPath);
    native public Object serialize();
    native public Object _serialize(Object serializedCondition);
    protected Condition(){}
}

