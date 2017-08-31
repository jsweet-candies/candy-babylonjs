package def.babylonjs.babylon;
public class Animatable extends def.js.Object {
    public Object target;
    public double fromFrame;
    public double toFrame;
    public Boolean loopAnimation;
    public double speedRatio;
    public Object onAnimationEnd;
    public Boolean animationStarted;
    public Animatable(Scene scene, Object target, double fromFrame, double toFrame, Boolean loopAnimation, double speedRatio, Object onAnimationEnd, Object animations){}
    native public Animation[] getAnimations();
    native public void appendAnimations(Object target, Animation[] animations);
    native public Animation getAnimationByTargetProperty(String property);
    native public void reset();
    native public void enableBlending(double blendingSpeed);
    native public void disableBlending();
    native public void goToFrame(double frame);
    native public void pause();
    native public void restart();
    native public void stop(String animationName);
    native public Boolean _animate(double delay);
    public Animatable(Scene scene, Object target, double fromFrame, double toFrame, Boolean loopAnimation, double speedRatio, Object onAnimationEnd){}
    public Animatable(Scene scene, Object target, double fromFrame, double toFrame, Boolean loopAnimation, double speedRatio){}
    public Animatable(Scene scene, Object target, double fromFrame, double toFrame, Boolean loopAnimation){}
    public Animatable(Scene scene, Object target, double fromFrame, double toFrame){}
    public Animatable(Scene scene, Object target, double fromFrame){}
    public Animatable(Scene scene, Object target){}
    native public void stop();
    protected Animatable(){}
}

