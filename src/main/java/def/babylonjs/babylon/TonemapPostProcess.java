package def.babylonjs.babylon;
public class TonemapPostProcess extends PostProcess {
    public double exposureAdjustment;
    public TonemapPostProcess(String name, TonemappingOperator _operator, double exposureAdjustment, Camera camera, double samplingMode, Engine engine, double textureFormat){}
    public TonemapPostProcess(String name, TonemappingOperator _operator, double exposureAdjustment, Camera camera, double samplingMode, Engine engine){}
    public TonemapPostProcess(String name, TonemappingOperator _operator, double exposureAdjustment, Camera camera, double samplingMode){}
    public TonemapPostProcess(String name, TonemappingOperator _operator, double exposureAdjustment, Camera camera){}
    protected TonemapPostProcess(){}
}

