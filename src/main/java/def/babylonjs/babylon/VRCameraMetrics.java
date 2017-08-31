package def.babylonjs.babylon;
public class VRCameraMetrics extends def.js.Object {
    public double hResolution;
    public double vResolution;
    public double hScreenSize;
    public double vScreenSize;
    public double vScreenCenter;
    public double eyeToScreenDistance;
    public double lensSeparationDistance;
    public double interpupillaryDistance;
    public double[] distortionK;
    public double[] chromaAbCorrection;
    public double postProcessScaleFactor;
    public double lensCenterOffset;
    public Boolean compensateDistortion;
    public final double aspectRatio=0;
    public final double aspectRatioFov=0;
    public final Matrix leftHMatrix=null;
    public final Matrix rightHMatrix=null;
    public final Matrix leftPreViewMatrix=null;
    public final Matrix rightPreViewMatrix=null;
    native public static VRCameraMetrics GetDefault();
}

