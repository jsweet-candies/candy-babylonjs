package def.babylonjs.babylon;
import def.js.Float32Array;
public class MorphTargetManager extends def.js.Object {
    public MorphTargetManager(Scene scene){}
    public final double uniqueId=0;
    public final double vertexCount=0;
    public final Boolean supportsNormals=null;
    public final Boolean supportsTangents=null;
    public final double numTargets=0;
    public final double numInfluencers=0;
    public final Float32Array influences=null;
    native public MorphTarget getActiveTarget(double index);
    native public MorphTarget getTarget(double index);
    native public void addTarget(MorphTarget target);
    native public void removeTarget(MorphTarget target);
    /**
         * Serializes the current manager into a Serialization object.
         * Returns the serialized object.
         */
    native public Object serialize();
    native public static MorphTargetManager Parse(Object serializationObject, Scene scene);
    public MorphTargetManager(){}
}

