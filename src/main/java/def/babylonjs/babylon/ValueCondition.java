package def.babylonjs.babylon;
public class ValueCondition extends Condition {
    public String propertyPath;
    public Object value;
    public double operator;
    public static final double IsEqual=0;
    public static final double IsDifferent=0;
    public static final double IsGreater=0;
    public static final double IsLesser=0;
    public ActionManager _actionManager;
    public ValueCondition(ActionManager actionManager, Object target, String propertyPath, Object value, double operator){}
    native public Boolean isValid();
    native public Object serialize();
    native public static String GetOperatorName(double operator);
    public ValueCondition(ActionManager actionManager, Object target, String propertyPath, Object value){}
    protected ValueCondition(){}
}

