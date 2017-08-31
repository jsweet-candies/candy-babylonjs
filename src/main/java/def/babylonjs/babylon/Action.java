package def.babylonjs.babylon;
public class Action extends def.js.Object {
    public Object triggerOptions;
    public double trigger;
    public ActionManager _actionManager;
    public Action(Object triggerOptions, Condition condition){}
    native public void _prepare();
    native public Object getTriggerParameter();
    native public void _executeCurrent(ActionEvent evt);
    native public void execute(ActionEvent evt);
    native public void skipToNextActiveAction();
    native public Action then(Action action);
    native public String _getProperty(String propertyPath);
    native public Object _getEffectiveTarget(Object target, String propertyPath);
    native public Object serialize(Object parent);
    native public Object _serialize(Object serializedAction, Object parent);
    public static java.util.function.Function<Object,String> _SerializeValueAsString;
    public static _GetTargetProperty _GetTargetProperty;
    /** This is an automatically generated object type (see the source definition). */
    @jsweet.lang.ObjectType
    public static class _GetTargetProperty extends def.js.Object {
        public String name;
        public String targetType;
        public String value;
    }
    public Action(Object triggerOptions){}
    native public Object _serialize(Object serializedAction);
    protected Action(){}
}

