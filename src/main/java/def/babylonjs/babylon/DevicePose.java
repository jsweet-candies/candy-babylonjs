package def.babylonjs.babylon;
import def.js.Float32Array;
/**
     * This is a copy of VRPose.
     * IMPORTANT!! The data is right-hand data.
     * @export
     * @interface DevicePose
     */
@jsweet.lang.Interface
public abstract class DevicePose extends def.js.Object {
    @jsweet.lang.Optional
    public final Float32Array position=null;
    @jsweet.lang.Optional
    public final Float32Array linearVelocity=null;
    @jsweet.lang.Optional
    public final Float32Array linearAcceleration=null;
    @jsweet.lang.Optional
    public final Float32Array orientation=null;
    @jsweet.lang.Optional
    public final Float32Array angularVelocity=null;
    @jsweet.lang.Optional
    public final Float32Array angularAcceleration=null;
}

