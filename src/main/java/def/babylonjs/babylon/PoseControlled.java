package def.babylonjs.babylon;
@jsweet.lang.Interface
public abstract class PoseControlled extends def.js.Object {
    public Vector3 position;
    public Quaternion rotationQuaternion;
    @jsweet.lang.Optional
    public Vector3 devicePosition;
    public Quaternion deviceRotationQuaternion;
    public DevicePose rawPose;
    public double deviceScaleFactor;
    native public Object updateFromDevice(DevicePose poseData);
}

