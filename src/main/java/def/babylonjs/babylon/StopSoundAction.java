package def.babylonjs.babylon;
public class StopSoundAction extends Action {
    public StopSoundAction(Object triggerOptions, Sound sound, Condition condition){}
    native public void _prepare();
    native public void execute();
    native public Object serialize(Object parent);
    public StopSoundAction(Object triggerOptions, Sound sound){}
    protected StopSoundAction(){}
}

