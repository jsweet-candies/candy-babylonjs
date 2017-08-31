package def.babylonjs.babylon;
@jsweet.lang.Interface
public abstract class ICullable extends def.js.Object {
    native public Boolean isInFrustum(Plane[] frustumPlanes);
    native public Boolean isCompletelyInFrustum(Plane[] frustumPlanes);
}

