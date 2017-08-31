package def.babylonjs.babylon;
public class RefractionPostProcess extends PostProcess {
    public Color3 color;
    public double depth;
    public double colorLevel;
    public RefractionPostProcess(String name, String refractionTextureUrl, Color3 color, double depth, double colorLevel, double options, Camera camera, double samplingMode, Engine engine, Boolean reusable){}
    native public void dispose(Camera camera);
    public RefractionPostProcess(String name, String refractionTextureUrl, Color3 color, double depth, double colorLevel, double options, Camera camera, double samplingMode, Engine engine){}
    public RefractionPostProcess(String name, String refractionTextureUrl, Color3 color, double depth, double colorLevel, double options, Camera camera, double samplingMode){}
    public RefractionPostProcess(String name, String refractionTextureUrl, Color3 color, double depth, double colorLevel, double options, Camera camera){}
    public RefractionPostProcess(String name, String refractionTextureUrl, Color3 color, double depth, double colorLevel, PostProcessOptionsData options, Camera camera, double samplingMode, Engine engine, Boolean reusable){}
    public RefractionPostProcess(String name, String refractionTextureUrl, Color3 color, double depth, double colorLevel, PostProcessOptionsData options, Camera camera, double samplingMode, Engine engine){}
    public RefractionPostProcess(String name, String refractionTextureUrl, Color3 color, double depth, double colorLevel, PostProcessOptionsData options, Camera camera, double samplingMode){}
    public RefractionPostProcess(String name, String refractionTextureUrl, Color3 color, double depth, double colorLevel, PostProcessOptionsData options, Camera camera){}
    protected RefractionPostProcess(){}
}

