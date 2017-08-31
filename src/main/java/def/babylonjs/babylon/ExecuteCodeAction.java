package def.babylonjs.babylon;
public class ExecuteCodeAction extends Action {
    public java.util.function.Consumer<ActionEvent> func;
    public ExecuteCodeAction(Object triggerOptions, java.util.function.Consumer<ActionEvent> func, Condition condition){}
    native public void execute(ActionEvent evt);
    public ExecuteCodeAction(Object triggerOptions, java.util.function.Consumer<ActionEvent> func){}
    protected ExecuteCodeAction(){}
}

