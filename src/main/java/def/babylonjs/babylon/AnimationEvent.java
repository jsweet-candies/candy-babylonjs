package def.babylonjs.babylon;
/**
     * Composed of a frame, and an action function
     */
public class AnimationEvent extends def.js.Object {
    public double frame;
    public java.lang.Runnable action;
    public Boolean onlyOnce;
    public Boolean isDone;
    public AnimationEvent(double frame, java.lang.Runnable action, Boolean onlyOnce){}
    public AnimationEvent(double frame, java.lang.Runnable action){}
    protected AnimationEvent(){}
}

