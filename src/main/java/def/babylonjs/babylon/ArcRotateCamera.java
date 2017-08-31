package def.babylonjs.babylon;
import def.dom.HTMLElement;
public class ArcRotateCamera extends TargetCamera {
    public double alpha;
    public double beta;
    public double radius;
    public Vector3 _target;
    public AbstractMesh _targetHost;
    public Vector3 target;
    public double inertialAlphaOffset;
    public double inertialBetaOffset;
    public double inertialRadiusOffset;
    public Object lowerAlphaLimit;
    public Object upperAlphaLimit;
    public double lowerBetaLimit;
    public double upperBetaLimit;
    public Object lowerRadiusLimit;
    public Object upperRadiusLimit;
    public double inertialPanningX;
    public double inertialPanningY;
    public double panningInertia;
    public double angularSensibilityX;
    public double angularSensibilityY;
    public double pinchPrecision;
    public double panningSensibility;
    public double[] keysUp;
    public double[] keysDown;
    public double[] keysLeft;
    public double[] keysRight;
    public double wheelPrecision;
    public double zoomOnFactor;
    public Vector2 targetScreenOffset;
    public Boolean allowUpsideDown;
    public Matrix _viewMatrix;
    public Boolean _useCtrlForPanning;
    public double _panningMouseButton;
    public ArcRotateCameraInputsManager inputs;
    public java.lang.Runnable _reset;
    public Vector3 panningAxis;
    public Vector3 _localDirection;
    public Vector3 _transformedDirection;
    public java.util.function.Consumer<AbstractMesh> onCollide;
    public Boolean checkCollisions;
    public Vector3 collisionRadius;
    public Collider _collider;
    public Vector3 _previousPosition;
    public Vector3 _collisionVelocity;
    public Vector3 _newPosition;
    public double _previousAlpha;
    public double _previousBeta;
    public double _previousRadius;
    public Boolean _collisionTriggered;
    public Vector3 _targetBoundingCenter;
    public ArcRotateCamera(String name, double alpha, double beta, double radius, Vector3 target, Scene scene){}
    native public void _initCache();
    native public void _updateCache(Boolean ignoreParentClass);
    native public Vector3 _getTargetPosition();
    native public Boolean _isSynchronizedViewMatrix();
    native public void attachControl(HTMLElement element, Boolean noPreventDefault, Boolean useCtrlForPanning, double panningMouseButton);
    native public void detachControl(HTMLElement element);
    native public void _checkInputs();
    native public void _checkLimits();
    native public void rebuildAnglesAndRadius();
    native public void setPosition(Vector3 position);
    native public void setTarget(AbstractMesh target, Boolean toBoundingCenter, Boolean allowSamePosition);
    native public Matrix _getViewMatrix();
    public jsweet.util.function.TriConsumer<Double,Vector3,AbstractMesh> _onCollisionPositionChange;
    native public void zoomOn(AbstractMesh[] meshes, Boolean doNotUpdateMaxZ);
    native public void focusOn(Object meshesOrMinMaxVectorAndDistance, Boolean doNotUpdateMaxZ);
    /**
         * @override
         * Override Camera.createRigCamera
         */
    native public Camera createRigCamera(String name, double cameraIndex);
    /**
         * @override
         * Override Camera._updateRigCameras
         */
    native public void _updateRigCameras();
    native public void dispose();
    native public String getClassName();
    native public void _updateCache();
    native public void attachControl(HTMLElement element, Boolean noPreventDefault, Boolean useCtrlForPanning);
    native public void attachControl(HTMLElement element, Boolean noPreventDefault);
    native public void attachControl(HTMLElement element);
    native public void setTarget(AbstractMesh target, Boolean toBoundingCenter);
    native public void setTarget(AbstractMesh target);
    native public void zoomOn(AbstractMesh[] meshes);
    native public void zoomOn();
    native public void focusOn(Object meshesOrMinMaxVectorAndDistance);
    native public void setTarget(Vector3 target, Boolean toBoundingCenter, Boolean allowSamePosition);
    native public void setTarget(Vector3 target, Boolean toBoundingCenter);
    native public void setTarget(Vector3 target);
    protected ArcRotateCamera(){}
}

