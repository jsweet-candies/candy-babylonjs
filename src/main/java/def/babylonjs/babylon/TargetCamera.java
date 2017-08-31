package def.babylonjs.babylon;
public class TargetCamera extends Camera {
    public Vector3 cameraDirection;
    public Vector2 cameraRotation;
    public Vector3 rotation;
    public Quaternion rotationQuaternion;
    public double speed;
    public Boolean noRotationConstraint;
    public Object lockedTarget;
    public Vector3 _currentTarget;
    public Matrix _viewMatrix;
    public Matrix _camMatrix;
    public Matrix _cameraTransformMatrix;
    public Matrix _cameraRotationMatrix;
    public Vector3 _referencePoint;
    public Vector3 _transformedReferencePoint;
    public Matrix _lookAtTemp;
    public Matrix _tempMatrix;
    public java.lang.Runnable _reset;
    public TargetCamera(String name, Vector3 position, Scene scene){}
    native public Vector3 getFrontPosition(double distance);
    native public Vector3 _getLockedTargetPosition();
    native public void _initCache();
    native public void _updateCache(Boolean ignoreParentClass);
    native public Boolean _isSynchronizedViewMatrix();
    native public double _computeLocalCameraSpeed();
    native public void setTarget(Vector3 target);
    /**
         * Return the current target position of the camera. This value is expressed in local space.
         */
    native public Vector3 getTarget();
    native public Boolean _decideIfNeedsToMove();
    native public void _updatePosition();
    native public void _checkInputs();
    native public void _updateCameraRotationMatrix();
    native public Matrix _getViewMatrix();
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
    native public String getClassName();
    native public void _updateCache();
    protected TargetCamera(){}
}

