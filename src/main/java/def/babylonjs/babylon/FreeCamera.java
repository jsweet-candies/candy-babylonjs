package def.babylonjs.babylon;
import def.dom.HTMLElement;
public class FreeCamera extends TargetCamera {
    public Vector3 ellipsoid;
    public Boolean checkCollisions;
    public Boolean applyGravity;
    public FreeCameraInputsManager inputs;
    public double angularSensibility;
    public double[] keysUp;
    public double[] keysDown;
    public double[] keysLeft;
    public double[] keysRight;
    public java.util.function.Consumer<AbstractMesh> onCollide;
    public Vector3 _localDirection;
    public Vector3 _transformedDirection;
    public FreeCamera(String name, Vector3 position, Scene scene){}
    native public void attachControl(HTMLElement element, Boolean noPreventDefault);
    native public void detachControl(HTMLElement element);
    public double collisionMask;
    native public void _collideWithWorld(Vector3 velocity);
    native public void _checkInputs();
    native public Boolean _decideIfNeedsToMove();
    native public void _updatePosition();
    native public void dispose();
    native public String getClassName();
    native public void attachControl(HTMLElement element);
    protected FreeCamera(){}
}

