package def.babylonjs.babylon;
public class ArcFollowCamera extends TargetCamera {
    public double alpha;
    public double beta;
    public double radius;
    public AbstractMesh target;
    public ArcFollowCamera(String name, double alpha, double beta, double radius, AbstractMesh target, Scene scene){}
    native public void _checkInputs();
    native public String getClassName();
    protected ArcFollowCamera(){}
}

