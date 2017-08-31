package def.babylonjs.babylon;
import def.dom.WebGLContextAttributes;
@jsweet.lang.Interface
public abstract class EngineOptions extends WebGLContextAttributes {
    @jsweet.lang.Optional
    public double limitDeviceRatio;
    @jsweet.lang.Optional
    public Boolean autoEnableWebVR;
    @jsweet.lang.Optional
    public Boolean disableWebGL2Support;
    @jsweet.lang.Optional
    public Boolean audioEngine;
}

