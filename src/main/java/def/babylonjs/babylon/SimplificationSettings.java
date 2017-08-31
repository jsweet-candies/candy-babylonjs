package def.babylonjs.babylon;
public class SimplificationSettings extends ISimplificationSettings {
    public double quality;
    public double distance;
    public Boolean optimizeMesh;
    public SimplificationSettings(double quality, double distance, Boolean optimizeMesh){}
    public SimplificationSettings(double quality, double distance){}
    protected SimplificationSettings(){}
}

