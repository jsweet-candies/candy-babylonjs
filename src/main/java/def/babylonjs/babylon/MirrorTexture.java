package def.babylonjs.babylon;
public class MirrorTexture extends RenderTargetTexture {
    public Plane mirrorPlane;
    public double blurRatio;
    public double blurKernel;
    public double blurKernelX;
    public double blurKernelY;
    public MirrorTexture(String name, Object size, Scene scene, Boolean generateMipMaps, double type, double samplingMode, Boolean generateDepthBuffer){}
    @jsweet.lang.Name("clone")
    native public MirrorTexture Clone();
    native public Object serialize();
    public MirrorTexture(String name, Object size, Scene scene, Boolean generateMipMaps, double type, double samplingMode){}
    public MirrorTexture(String name, Object size, Scene scene, Boolean generateMipMaps, double type){}
    public MirrorTexture(String name, Object size, Scene scene, Boolean generateMipMaps){}
    public MirrorTexture(String name, Object size, Scene scene){}
    protected MirrorTexture(){}
}

