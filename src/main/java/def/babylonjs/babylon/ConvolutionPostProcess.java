package def.babylonjs.babylon;
public class ConvolutionPostProcess extends PostProcess {
    public double[] kernel;
    public ConvolutionPostProcess(String name, double[] kernel, double options, Camera camera, double samplingMode, Engine engine, Boolean reusable){}
    public static double[] EdgeDetect0Kernel;
    public static double[] EdgeDetect1Kernel;
    public static double[] EdgeDetect2Kernel;
    public static double[] SharpenKernel;
    public static double[] EmbossKernel;
    public static double[] GaussianKernel;
    public ConvolutionPostProcess(String name, double[] kernel, double options, Camera camera, double samplingMode, Engine engine){}
    public ConvolutionPostProcess(String name, double[] kernel, double options, Camera camera, double samplingMode){}
    public ConvolutionPostProcess(String name, double[] kernel, double options, Camera camera){}
    public ConvolutionPostProcess(String name, double[] kernel, PostProcessOptionsData options, Camera camera, double samplingMode, Engine engine, Boolean reusable){}
    public ConvolutionPostProcess(String name, double[] kernel, PostProcessOptionsData options, Camera camera, double samplingMode, Engine engine){}
    public ConvolutionPostProcess(String name, double[] kernel, PostProcessOptionsData options, Camera camera, double samplingMode){}
    public ConvolutionPostProcess(String name, double[] kernel, PostProcessOptionsData options, Camera camera){}
    protected ConvolutionPostProcess(){}
}

