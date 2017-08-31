package def.babylonjs.babylon;
public class RayHelper extends def.js.Object {
    public Ray ray;
    native public static RayHelper CreateAndShow(Ray ray, Scene scene, Color3 color);
    public RayHelper(Ray ray){}
    native public void show(Scene scene, Color3 color);
    native public void hide();
    native public void attachToMesh(AbstractMesh mesh, Vector3 meshSpaceDirection, Vector3 meshSpaceOrigin, double length);
    native public void detachFromMesh();
    native public void dispose();
    native public void attachToMesh(AbstractMesh mesh, Vector3 meshSpaceDirection, Vector3 meshSpaceOrigin);
    native public void attachToMesh(AbstractMesh mesh, Vector3 meshSpaceDirection);
    native public void attachToMesh(AbstractMesh mesh);
    protected RayHelper(){}
}

