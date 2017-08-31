package def.babylonjs.babylon;
@jsweet.lang.Interface
public abstract class ICollisionDetector extends def.js.Object {
    native public void onInit(InitPayload payload);
    native public void onUpdate(UpdatePayload payload);
    native public void onCollision(CollidePayload payload);
}

