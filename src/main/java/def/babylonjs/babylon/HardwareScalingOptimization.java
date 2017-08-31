package def.babylonjs.babylon;
public class HardwareScalingOptimization extends SceneOptimization {
    public double priority;
    public double maximumScale;
    public HardwareScalingOptimization(double priority, double maximumScale){}
    public java.util.function.Function<Scene,Boolean> apply;
    public HardwareScalingOptimization(double priority){}
    public HardwareScalingOptimization(){}
}

