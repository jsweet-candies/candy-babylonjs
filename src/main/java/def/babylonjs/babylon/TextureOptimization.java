package def.babylonjs.babylon;
public class TextureOptimization extends SceneOptimization {
    public double priority;
    public double maximumSize;
    public TextureOptimization(double priority, double maximumSize){}
    public java.util.function.Function<Scene,Boolean> apply;
    public TextureOptimization(double priority){}
    public TextureOptimization(){}
}

