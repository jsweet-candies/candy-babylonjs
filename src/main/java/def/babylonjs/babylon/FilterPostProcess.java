package def.babylonjs.babylon;
public class FilterPostProcess extends PostProcess {
    public Matrix kernelMatrix;
    public FilterPostProcess(String name, Matrix kernelMatrix, double options, Camera camera, double samplingMode, Engine engine, Boolean reusable){}
    public FilterPostProcess(String name, Matrix kernelMatrix, double options, Camera camera, double samplingMode, Engine engine){}
    public FilterPostProcess(String name, Matrix kernelMatrix, double options, Camera camera, double samplingMode){}
    public FilterPostProcess(String name, Matrix kernelMatrix, double options, Camera camera){}
    public FilterPostProcess(String name, Matrix kernelMatrix, double options){}
    public FilterPostProcess(String name, Matrix kernelMatrix, PostProcessOptionsData options, Camera camera, double samplingMode, Engine engine, Boolean reusable){}
    public FilterPostProcess(String name, Matrix kernelMatrix, PostProcessOptionsData options, Camera camera, double samplingMode, Engine engine){}
    public FilterPostProcess(String name, Matrix kernelMatrix, PostProcessOptionsData options, Camera camera, double samplingMode){}
    public FilterPostProcess(String name, Matrix kernelMatrix, PostProcessOptionsData options, Camera camera){}
    public FilterPostProcess(String name, Matrix kernelMatrix, PostProcessOptionsData options){}
    protected FilterPostProcess(){}
}

