package def.babylonjs.babylon;
import def.js.Float32Array;
public class Skeleton extends def.js.Object {
    public String name;
    public String id;
    public Bone[] bones;
    public Vector3 dimensionsAtRest;
    public Boolean needInitialSkinMatrix;
    /**
         * An event triggered before computing the skeleton's matrices
         * @type {BABYLON.Observable}
         */
    public Observable<Skeleton> onBeforeComputeObservable;
    public Skeleton(String name, String id, Scene scene){}
    native public Float32Array getTransformMatrices(AbstractMesh mesh);
    native public Scene getScene();
    /**
         * @param {boolean} fullDetails - support for multiple levels of logging within scene loading
         */
    native public String toString(Boolean fullDetails);
    /**
        * Get bone's index searching by name
        * @param {string} name is bone's name to search for
        * @return {number} Indice of the bone. Returns -1 if not found
        */
    native public double getBoneIndexByName(String name);
    native public void createAnimationRange(String name, double from, double to);
    native public void deleteAnimationRange(String name, Boolean deleteFrames);
    native public AnimationRange getAnimationRange(String name);
    /**
         *  Returns as an Array, all AnimationRanges defined on this skeleton
         */
    native public AnimationRange[] getAnimationRanges();
    /**
         *  note: This is not for a complete retargeting, only between very similar skeleton's with only possible bone length differences
         */
    native public Boolean copyAnimationRange(Skeleton source, String name, Boolean rescaleAsRequired);
    native public void returnToRest();
    native public Animatable beginAnimation(String name, Boolean loop, double speedRatio, java.lang.Runnable onAnimationEnd);
    native public void _markAsDirty();
    native public void _registerMeshWithPoseMatrix(AbstractMesh mesh);
    native public void _unregisterMeshWithPoseMatrix(AbstractMesh mesh);
    native public void _computeTransformMatrices(Float32Array targetMatrix, Matrix initialSkinMatrix);
    native public void prepare();
    native public IAnimatable[] getAnimatables();
    native public Skeleton clone(String name, String id);
    native public void enableBlending(double blendingSpeed);
    native public void dispose();
    native public Object serialize();
    native public static Skeleton Parse(Object parsedSkeleton, Scene scene);
    native public void computeAbsoluteTransforms(Boolean forceUpdate);
    native public Matrix getPoseMatrix();
    /**
         * @param {boolean} fullDetails - support for multiple levels of logging within scene loading
         */
    native public String toString();
    native public void deleteAnimationRange(String name);
    /**
         *  note: This is not for a complete retargeting, only between very similar skeleton's with only possible bone length differences
         */
    native public Boolean copyAnimationRange(Skeleton source, String name);
    native public Animatable beginAnimation(String name, Boolean loop, double speedRatio);
    native public Animatable beginAnimation(String name, Boolean loop);
    native public Animatable beginAnimation(String name);
    native public void enableBlending();
    native public void computeAbsoluteTransforms();
    protected Skeleton(){}
}

