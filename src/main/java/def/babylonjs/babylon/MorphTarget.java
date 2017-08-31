package def.babylonjs.babylon;
import def.js.Float32Array;
public class MorphTarget extends def.js.Object {
    public String name;
    public Animation[] animations;
    public Observable<Boolean> onInfluenceChanged;
    public double influence;
    public MorphTarget(String name, double influence){}
    public final Boolean hasNormals=null;
    public final Boolean hasTangents=null;
    native public void setPositions(Float32Array data);
    native public Float32Array getPositions();
    native public void setNormals(Float32Array data);
    native public Float32Array getNormals();
    native public void setTangents(Float32Array data);
    native public Float32Array getTangents();
    /**
         * Serializes the current target into a Serialization object.
         * Returns the serialized object.
         */
    native public Object serialize();
    native public static MorphTarget Parse(Object serializationObject);
    native public static MorphTarget FromMesh(AbstractMesh mesh, String name, double influence);
    public MorphTarget(String name){}
    native public static MorphTarget FromMesh(AbstractMesh mesh, String name);
    native public static MorphTarget FromMesh(AbstractMesh mesh);
    native public void setPositions(double[] data);
    native public void setNormals(double[] data);
    native public void setTangents(double[] data);
    protected MorphTarget(){}
}

