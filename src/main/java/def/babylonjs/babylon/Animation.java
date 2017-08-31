package def.babylonjs.babylon;
import def.js.Array;
public class Animation extends def.js.Object {
    public String name;
    public String targetProperty;
    public double framePerSecond;
    public double dataType;
    public double loopMode;
    public Boolean enableBlending;
    public Object _target;
    public String[] targetPropertyPath;
    public double currentFrame;
    public Boolean allowMatricesInterpolation;
    public double blendingSpeed;
    native public static Animation _PrepareAnimation(String name, String targetProperty, double framePerSecond, double totalFrame, Object from, Object to, double loopMode, EasingFunction easingFunction);
    native public static Animatable CreateAndStartAnimation(String name, Node node, String targetProperty, double framePerSecond, double totalFrame, Object from, Object to, double loopMode, EasingFunction easingFunction, java.lang.Runnable onAnimationEnd);
    native public static Animatable CreateMergeAndStartAnimation(String name, Node node, String targetProperty, double framePerSecond, double totalFrame, Object from, Object to, double loopMode, EasingFunction easingFunction, java.lang.Runnable onAnimationEnd);
    public Animation(String name, String targetProperty, double framePerSecond, double dataType, double loopMode, Boolean enableBlending){}
    /**
         * @param {boolean} fullDetails - support for multiple levels of logging within scene loading
         */
    native public String toString(Boolean fullDetails);
    /**
         * Add an event to this animation.
         */
    native public void addEvent(AnimationEvent event);
    /**
         * Remove all events found at the given frame
         * @param frame
         */
    native public void removeEvents(double frame);
    native public void createRange(String name, double from, double to);
    native public void deleteRange(String name, Boolean deleteFrames);
    native public AnimationRange getRange(String name);
    native public void reset();
    native public Boolean isStopped();
    native public Array<GetKeys> getKeys();
    native public double getHighestFrame();
    native public IEasingFunction getEasingFunction();
    native public void setEasingFunction(EasingFunction easingFunction);
    native public double floatInterpolateFunction(double startValue, double endValue, double gradient);
    native public double floatInterpolateFunctionWithTangents(double startValue, double outTangent, double endValue, double inTangent, double gradient);
    native public Quaternion quaternionInterpolateFunction(Quaternion startValue, Quaternion endValue, double gradient);
    native public Quaternion quaternionInterpolateFunctionWithTangents(Quaternion startValue, Quaternion outTangent, Quaternion endValue, Quaternion inTangent, double gradient);
    native public Vector3 vector3InterpolateFunction(Vector3 startValue, Vector3 endValue, double gradient);
    native public Vector3 vector3InterpolateFunctionWithTangents(Vector3 startValue, Vector3 outTangent, Vector3 endValue, Vector3 inTangent, double gradient);
    native public Vector2 vector2InterpolateFunction(Vector2 startValue, Vector2 endValue, double gradient);
    native public Vector2 vector2InterpolateFunctionWithTangents(Vector2 startValue, Vector2 outTangent, Vector2 endValue, Vector2 inTangent, double gradient);
    native public Size sizeInterpolateFunction(Size startValue, Size endValue, double gradient);
    native public Color3 color3InterpolateFunction(Color3 startValue, Color3 endValue, double gradient);
    native public Matrix matrixInterpolateFunction(Matrix startValue, Matrix endValue, double gradient);
    @jsweet.lang.Name("clone")
    native public Animation Clone();
    native public void setKeys(Array<Values> values);
    native public void setValue(Object currentValue, Boolean blend);
    native public void goToFrame(double frame);
    native public Boolean animate(double delay, double from, double to, Boolean loop, double speedRatio, Boolean blend);
    native public Object serialize();
    public static final double ANIMATIONTYPE_FLOAT=0;
    public static final double ANIMATIONTYPE_VECTOR3=0;
    public static final double ANIMATIONTYPE_VECTOR2=0;
    public static final double ANIMATIONTYPE_SIZE=0;
    public static final double ANIMATIONTYPE_QUATERNION=0;
    public static final double ANIMATIONTYPE_MATRIX=0;
    public static final double ANIMATIONTYPE_COLOR3=0;
    public static final double ANIMATIONLOOPMODE_RELATIVE=0;
    public static final double ANIMATIONLOOPMODE_CYCLE=0;
    public static final double ANIMATIONLOOPMODE_CONSTANT=0;
    native public static Animation Parse(Object parsedAnimation);
    native public static Object AppendSerializedAnimations(IAnimatable source, Object destination);
    /** This is an automatically generated object type (see the source definition). */
    @jsweet.lang.ObjectType
    public static class GetKeys extends def.js.Object {
        public double frame;
        public Object value;
    }
    /** This is an automatically generated object type (see the source definition). */
    @jsweet.lang.ObjectType
    public static class Values extends def.js.Object {
        public double frame;
        public Object value;
    }
    native public static Animation _PrepareAnimation(String name, String targetProperty, double framePerSecond, double totalFrame, Object from, Object to, double loopMode);
    native public static Animation _PrepareAnimation(String name, String targetProperty, double framePerSecond, double totalFrame, Object from, Object to);
    native public static Animatable CreateAndStartAnimation(String name, Node node, String targetProperty, double framePerSecond, double totalFrame, Object from, Object to, double loopMode, EasingFunction easingFunction);
    native public static Animatable CreateAndStartAnimation(String name, Node node, String targetProperty, double framePerSecond, double totalFrame, Object from, Object to, double loopMode);
    native public static Animatable CreateAndStartAnimation(String name, Node node, String targetProperty, double framePerSecond, double totalFrame, Object from, Object to);
    native public static Animatable CreateMergeAndStartAnimation(String name, Node node, String targetProperty, double framePerSecond, double totalFrame, Object from, Object to, double loopMode, EasingFunction easingFunction);
    native public static Animatable CreateMergeAndStartAnimation(String name, Node node, String targetProperty, double framePerSecond, double totalFrame, Object from, Object to, double loopMode);
    native public static Animatable CreateMergeAndStartAnimation(String name, Node node, String targetProperty, double framePerSecond, double totalFrame, Object from, Object to);
    public Animation(String name, String targetProperty, double framePerSecond, double dataType, double loopMode){}
    public Animation(String name, String targetProperty, double framePerSecond, double dataType){}
    /**
         * @param {boolean} fullDetails - support for multiple levels of logging within scene loading
         */
    native public String toString();
    native public void deleteRange(String name);
    native public void setValue(Object currentValue);
    native public Boolean animate(double delay, double from, double to, Boolean loop, double speedRatio);
    native public void setKeys(Values[] values);
    protected Animation(){}
}

