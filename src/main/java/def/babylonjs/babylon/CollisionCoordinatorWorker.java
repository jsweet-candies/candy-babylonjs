package def.babylonjs.babylon;
public class CollisionCoordinatorWorker extends ICollisionCoordinator {
    public CollisionCoordinatorWorker(){}
    public static java.util.function.Function<AbstractMesh,SerializedMesh> SerializeMesh;
    public static java.util.function.Function<Geometry,SerializedGeometry> SerializeGeometry;
    native public void getNewPosition(Vector3 position, Vector3 velocity, Collider collider, double maximumRetry, AbstractMesh excludedMesh, jsweet.util.function.TriConsumer<Double,Vector3,AbstractMesh> onNewPosition, double collisionIndex);
    native public void init(Scene scene);
    native public void destroy();
    public java.util.function.Consumer<AbstractMesh> onMeshUpdated;
    public java.util.function.Consumer<Geometry> onGeometryUpdated;
    native public void getNewPosition(Vector3 position, Vector3 velocity, Collider collider, double maximumRetry, AbstractMesh excludedMesh, java.util.function.BiConsumer<Double,Vector3> onNewPosition, double collisionIndex);
}

