package def.babylonjs.babylon;
public class BlurPostProcess extends PostProcess {
    public Vector2 direction;
    public double _kernel;
    public double _idealKernel;
    public Boolean _packedFloat;
    /**
         * Sets the length in pixels of the blur sample region
         */
    public double kernel;
    /**
         * Sets wether or not the blur needs to unpack/repack floats
         */
    public Boolean packedFloat;
    public BlurPostProcess(String name, Vector2 direction, double kernel, double options, Camera camera, double samplingMode, Engine engine, Boolean reusable, double textureType){}
    native public void _updateParameters();
    /**
         * Best kernels are odd numbers that when divided by 2, their integer part is even, so 5, 9 or 13.
         * Other odd kernels optimize correctly but require proportionally more samples, even kernels are
         * possible but will produce minor visual artifacts. Since each new kernel requires a new shader we
         * want to minimize kernel changes, having gaps between physical kernels is helpful in that regard.
         * The gaps between physical kernels are compensated for in the weighting of the samples
         * @param idealKernel Ideal blur kernel.
         * @return Nearest best kernel.
         */
    native public double _nearestBestKernel(double idealKernel);
    /**
         * Calculates the value of a Gaussian distribution with sigma 3 at a given point.
         * @param x The point on the Gaussian distribution to sample.
         * @return the value of the Gaussian function at x.
         */
    native public double _gaussianWeight(double x);
    /**
          * Generates a string that can be used as a floating point number in GLSL.
          * @param x Value to print.
          * @param decimalFigures Number of decimal places to print the number to (excluding trailing 0s).
          * @return GLSL float string.
          */
    native public String _glslFloat(double x, double decimalFigures);
    public BlurPostProcess(String name, Vector2 direction, double kernel, double options, Camera camera, double samplingMode, Engine engine, Boolean reusable){}
    public BlurPostProcess(String name, Vector2 direction, double kernel, double options, Camera camera, double samplingMode, Engine engine){}
    public BlurPostProcess(String name, Vector2 direction, double kernel, double options, Camera camera, double samplingMode){}
    public BlurPostProcess(String name, Vector2 direction, double kernel, double options, Camera camera){}
    /**
          * Generates a string that can be used as a floating point number in GLSL.
          * @param x Value to print.
          * @param decimalFigures Number of decimal places to print the number to (excluding trailing 0s).
          * @return GLSL float string.
          */
    native public String _glslFloat(double x);
    public BlurPostProcess(String name, Vector2 direction, double kernel, PostProcessOptionsData options, Camera camera, double samplingMode, Engine engine, Boolean reusable, double textureType){}
    public BlurPostProcess(String name, Vector2 direction, double kernel, PostProcessOptionsData options, Camera camera, double samplingMode, Engine engine, Boolean reusable){}
    public BlurPostProcess(String name, Vector2 direction, double kernel, PostProcessOptionsData options, Camera camera, double samplingMode, Engine engine){}
    public BlurPostProcess(String name, Vector2 direction, double kernel, PostProcessOptionsData options, Camera camera, double samplingMode){}
    public BlurPostProcess(String name, Vector2 direction, double kernel, PostProcessOptionsData options, Camera camera){}
    protected BlurPostProcess(){}
}

