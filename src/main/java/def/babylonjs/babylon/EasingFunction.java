package def.babylonjs.babylon;
public class EasingFunction extends IEasingFunction {
    public static final double EASINGMODE_EASEIN=0;
    public static final double EASINGMODE_EASEOUT=0;
    public static final double EASINGMODE_EASEINOUT=0;
    native public void setEasingMode(double easingMode);
    native public double getEasingMode();
    native public double easeInCore(double gradient);
    native public double ease(double gradient);
}

