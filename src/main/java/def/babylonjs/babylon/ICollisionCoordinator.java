package def.babylonjs.babylon;
@jsweet.lang.Interface
public abstract class ICollisionCoordinator extends def.js.Object {
    native public void getNewPosition(Vector3 position, Vector3 velocity, Collider collider, double maximumRetry, AbstractMesh excludedMesh, jsweet.util.function.TriConsumer<Double,Vector3,AbstractMesh> onNewPosition, double collisionIndex);
    native public void init(Scene scene);
    native public void destroy();
    native public Object onMeshAdded(AbstractMesh mesh);
    native public Object onMeshUpdated(AbstractMesh mesh);
    native public Object onMeshRemoved(AbstractMesh mesh);
    native public Object onGeometryAdded(Geometry geometry);
    native public Object onGeometryUpdated(Geometry geometry);
    native public Object onGeometryDeleted(Geometry geometry);
    native public void getNewPosition(Vector3 position, Vector3 velocity, Collider collider, double maximumRetry, AbstractMesh excludedMesh, java.util.function.BiConsumer<Double,Vector3> onNewPosition, double collisionIndex);
}

