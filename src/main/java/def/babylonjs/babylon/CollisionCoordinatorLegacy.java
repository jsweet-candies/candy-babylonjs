package def.babylonjs.babylon;
public class CollisionCoordinatorLegacy extends ICollisionCoordinator {
    native public void getNewPosition(Vector3 position, Vector3 velocity, Collider collider, double maximumRetry, AbstractMesh excludedMesh, jsweet.util.function.TriConsumer<Double,Vector3,AbstractMesh> onNewPosition, double collisionIndex);
    native public void init(Scene scene);
    native public void destroy();
    native public void getNewPosition(Vector3 position, Vector3 velocity, Collider collider, double maximumRetry, AbstractMesh excludedMesh, java.util.function.BiConsumer<Double,Vector3> onNewPosition, double collisionIndex);
}

