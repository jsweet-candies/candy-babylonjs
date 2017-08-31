package def.babylonjs.babylon;
import def.js.Array;
import def.dom.HTMLElement;
@jsweet.lang.Extends({PoseControlled.class})
public class WebVRFreeCamera extends FreeCamera {
    public Object _vrDevice;
    public DevicePose rawPose;
    public Array<Node> _descendants;
    public Vector3 devicePosition;
    public Object deviceRotationQuaternion;
    public double deviceScaleFactor;
    public Array<WebVRController> controllers;
    public Array<Gamepad> nonVRControllers;
    public Boolean rigParenting;
    public WebVRFreeCamera(String name, Vector3 position, Scene scene, WebVROptions webVROptions){}
    public java.util.function.Consumer<Array<WebVRController>> onControllersAttached;
    public java.util.function.Consumer<Gamepad> onNonVRControllerAttached;
    native public WebVRController getControllerByName(String name);
    public final WebVRController leftController=null;
    public final WebVRController rightController=null;
    native public Ray getForwardRay(double length);
    native public void _checkInputs();
    /**
         * WebVR's attach control will start broadcasting frames to the device.
         * Note that in certain browsers (chrome for example) this function must be called
         * within a user-interaction callback. Example:
         * <pre> scene.onPointerDown = function() { camera.attachControl(canvas); }</pre>
         *
         * @param {HTMLElement} element
         * @param {boolean} [noPreventDefault]
         *
         * @memberOf WebVRFreeCamera
         */
    native public void attachControl(HTMLElement element, Boolean noPreventDefault);
    native public void detachControl(HTMLElement element);
    native public String getClassName();
    native public void resetToCurrentRotation();
    native public void _updateRigCameras();
    /**
         * This function is called by the two RIG cameras.
         * 'this' is the left or right camera (and NOT (!!!) the WebVRFreeCamera instance)
         */
    native public Matrix _getWebVRViewMatrix();
    native public Matrix _getWebVRProjectionMatrix();
    native public void initControllers();
    public Vector3 position;
    public Quaternion rotationQuaternion;
    native public Object updateFromDevice(DevicePose poseData);
    public WebVRFreeCamera(String name, Vector3 position, Scene scene){}
    native public Ray getForwardRay();
    /**
         * WebVR's attach control will start broadcasting frames to the device.
         * Note that in certain browsers (chrome for example) this function must be called
         * within a user-interaction callback. Example:
         * <pre> scene.onPointerDown = function() { camera.attachControl(canvas); }</pre>
         *
         * @param {HTMLElement} element
         * @param {boolean} [noPreventDefault]
         *
         * @memberOf WebVRFreeCamera
         */
    native public void attachControl(HTMLElement element);
    protected WebVRFreeCamera(){}
}

