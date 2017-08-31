package def.babylonjs.babylon;
@jsweet.lang.Interface
public abstract class CollidePayload extends def.js.Object {
    public double collisionId;
    public SerializedColliderToWorker collider;
    public double maximumRetry;
    @jsweet.lang.Optional
    public double excludedMeshUniqueId;
}

