package def.babylonjs.babylon;
/**
     * Expected simplification settings.
     * Quality should be between 0 and 1 (1 being 100%, 0 being 0%);
     */
@jsweet.lang.Interface
public abstract class ISimplificationSettings extends def.js.Object {
    public double quality;
    public double distance;
    @jsweet.lang.Optional
    public Boolean optimizeMesh;
}

