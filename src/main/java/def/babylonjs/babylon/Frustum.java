package def.babylonjs.babylon;
public class Frustum extends def.js.Object {
    /**
         * Returns a new array of 6 Frustum planes computed by the passed transformation matrix.
         */
    native public static Plane[] GetPlanes(Matrix transform);
    /**
         * Sets the passed array "frustumPlanes" with the 6 Frustum planes computed by the passed transformation matrix.
         */
    native public static void GetPlanesToRef(Matrix transform, Plane[] frustumPlanes);
}

