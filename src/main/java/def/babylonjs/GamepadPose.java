package def.babylonjs;
import def.js.Float32Array;
@jsweet.lang.Interface
public abstract class GamepadPose extends def.js.Object {
    public Boolean hasOrientation;
    public Boolean hasPosition;
    @jsweet.lang.Optional
    public Float32Array position;
    @jsweet.lang.Optional
    public Float32Array linearVelocity;
    @jsweet.lang.Optional
    public Float32Array linearAcceleration;
    @jsweet.lang.Optional
    public Float32Array orientation;
    @jsweet.lang.Optional
    public Float32Array angularVelocity;
    @jsweet.lang.Optional
    public Float32Array angularAcceleration;
}

