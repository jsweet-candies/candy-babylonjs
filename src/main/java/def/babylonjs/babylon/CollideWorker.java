package def.babylonjs.babylon;
public class CollideWorker extends def.js.Object {
    public Collider collider;
    public CollideWorker(Collider collider, CollisionCache _collisionCache, Vector3 finalPosition){}
    native public void collideWithWorld(Vector3 position, Vector3 velocity, double maximumRetry, double excludedMeshUniqueId);
    native public void collideWithWorld(Vector3 position, Vector3 velocity, double maximumRetry);
    protected CollideWorker(){}
}

