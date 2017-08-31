package def.babylonjs.babylon;
public class CollisionDetectorTransferable extends ICollisionDetector {
    native public void onInit(InitPayload payload);
    native public void onUpdate(UpdatePayload payload);
    native public void onCollision(CollidePayload payload);
}

