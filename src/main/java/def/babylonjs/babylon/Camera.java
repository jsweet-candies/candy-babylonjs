package def.babylonjs.babylon;
import def.dom.HTMLElement;
public class Camera extends Node {
    public CameraInputsManager<Camera> inputs;
    public static final double PERSPECTIVE_CAMERA=0;
    public static final double ORTHOGRAPHIC_CAMERA=0;
    public static final double FOVMODE_VERTICAL_FIXED=0;
    public static final double FOVMODE_HORIZONTAL_FIXED=0;
    public static final double RIG_MODE_NONE=0;
    public static final double RIG_MODE_STEREOSCOPIC_ANAGLYPH=0;
    public static final double RIG_MODE_STEREOSCOPIC_SIDEBYSIDE_PARALLEL=0;
    public static final double RIG_MODE_STEREOSCOPIC_SIDEBYSIDE_CROSSEYED=0;
    public static final double RIG_MODE_STEREOSCOPIC_OVERUNDER=0;
    public static final double RIG_MODE_VR=0;
    public static final double RIG_MODE_WEBVR=0;
    public static Boolean ForceAttachControlToAlwaysPreventDefault;
    public Vector3 position;
    public Vector3 upVector;
    public Object orthoLeft;
    public Object orthoRight;
    public Object orthoBottom;
    public Object orthoTop;
    public double fov;
    public double minZ;
    public double maxZ;
    public double inertia;
    public double mode;
    public Boolean isIntermediate;
    public Viewport viewport;
    public double layerMask;
    public double fovMode;
    public double cameraRigMode;
    public double interaxialDistance;
    public Boolean isStereoscopicSideBySide;
    public Object _cameraRigParams;
    public Camera[] _rigCameras;
    public PostProcess _rigPostProcess;
    public Matrix _webvrViewMatrix;
    public RenderTargetTexture[] customRenderTargets;
    public Matrix _projectionMatrix;
    public PostProcess[] _postProcesses;
    public SmartArray<Mesh> _activeMeshes;
    public Camera(String name, Vector3 position, Scene scene){}
    native public String getClassName();
    /**
         * @param {boolean} fullDetails - support for multiple levels of logging within scene loading
         */
    native public String toString(Boolean fullDetails);
    public final Vector3 globalPosition=null;
    native public SmartArray<Mesh> getActiveMeshes();
    native public Boolean isActiveMesh(Mesh mesh);
    native public void _initCache();
    native public void _updateCache(Boolean ignoreParentClass);
    native public void _updateFromScene();
    native public Boolean _isSynchronized();
    native public Boolean _isSynchronizedViewMatrix();
    native public Boolean _isSynchronizedProjectionMatrix();
    native public void attachControl(HTMLElement element, Boolean noPreventDefault);
    native public void detachControl(HTMLElement element);
    native public void update();
    native public void _checkInputs();
    public final Camera[] rigCameras=null;
    public final PostProcess rigPostProcess=null;
    native public double attachPostProcess(PostProcess postProcess, double insertAt);
    native public double[] detachPostProcess(PostProcess postProcess, Object atIndices);
    native public Matrix getWorldMatrix();
    native public Matrix _getViewMatrix();
    native public Matrix getViewMatrix(Boolean force);
    native public Matrix _computeViewMatrix(Boolean force);
    native public void freezeProjectionMatrix(Matrix projection);
    native public void unfreezeProjectionMatrix();
    native public Matrix getProjectionMatrix(Boolean force);
    native public Matrix getTranformationMatrix();
    native public Boolean isInFrustum(ICullable target);
    native public Boolean isCompletelyInFrustum(ICullable target);
    native public Ray getForwardRay(double length, Matrix transform, Vector3 origin);
    native public void dispose();
    public final FreeCamera leftCamera=null;
    public final FreeCamera rightCamera=null;
    native public Vector3 getLeftTarget();
    native public Vector3 getRightTarget();
    native public void setCameraRigMode(double mode, Object rigParams);
    native public void _updateCameraRotationMatrix();
    native public void _updateWebVRCameraRotationMatrix();
    /**
         * This function MUST be overwritten by the different WebVR cameras available.
         * The context in which it is running is the RIG camera. So 'this' is the TargetCamera, left or right.
         */
    native public Matrix _getWebVRProjectionMatrix();
    /**
         * This function MUST be overwritten by the different WebVR cameras available.
         * The context in which it is running is the RIG camera. So 'this' is the TargetCamera, left or right.
         */
    native public Matrix _getWebVRViewMatrix();
    native public void setCameraRigParameter(String name, Object value);
    /**
         * needs to be overridden by children so sub has required properties to be copied
         */
    native public Camera createRigCamera(String name, double cameraIndex);
    /**
         * May need to be overridden by children
         */
    native public void _updateRigCameras();
    native public void _setupInputs();
    native public Object serialize();
    native public Camera clone(String name);
    native public Vector3 getDirection(Vector3 localAxis);
    native public void getDirectionToRef(Vector3 localAxis, Vector3 result);
    native public static java.util.function.Supplier<Camera> GetConstructorFromName(String type, String name, Scene scene, double interaxial_distance, Boolean isStereoscopicSideBySide);
    native public static Camera Parse(Object parsedCamera, Scene scene);
    /**
         * @param {boolean} fullDetails - support for multiple levels of logging within scene loading
         */
    native public String toString();
    native public void _updateCache();
    native public void attachControl(HTMLElement element);
    native public double attachPostProcess(PostProcess postProcess);
    native public double[] detachPostProcess(PostProcess postProcess);
    native public Matrix getViewMatrix();
    native public Matrix _computeViewMatrix();
    native public void freezeProjectionMatrix();
    native public Matrix getProjectionMatrix();
    native public Ray getForwardRay(double length, Matrix transform);
    native public Ray getForwardRay(double length);
    native public Ray getForwardRay();
    native public static java.util.function.Supplier<Camera> GetConstructorFromName(String type, String name, Scene scene, double interaxial_distance);
    native public static java.util.function.Supplier<Camera> GetConstructorFromName(String type, String name, Scene scene);
    native public def.babylonjs.babylon.Effect _rigPostProcess();
    native public def.babylonjs.babylon.Effect rigPostProcess();
    protected Camera(){}
}

