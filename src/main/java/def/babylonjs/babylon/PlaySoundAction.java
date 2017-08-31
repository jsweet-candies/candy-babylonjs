package def.babylonjs.babylon;
public class PlaySoundAction extends Action {
    public PlaySoundAction(Object triggerOptions, Sound sound, Condition condition){}
    native public void _prepare();
    native public void execute();
    native public Object serialize(Object parent);
    public PlaySoundAction(Object triggerOptions, Sound sound){}
    protected PlaySoundAction(){}
}

