package def.babylonjs.babylon;
public class ModelShape extends def.js.Object {
    public double shapeID;
    public Vector3[] _shape;
    public double[] _shapeUV;
    public jsweet.util.function.TriConsumer<SolidParticle,Double,Double> _positionFunction;
    public jsweet.util.function.TriConsumer<SolidParticle,Vector3,Double> _vertexFunction;
    /**
         * Creates a ModelShape object. This is an internal simplified reference to a mesh used as for a model to replicate particles from by the SPS.
         * SPS internal tool, don't use it manually.
         */
    public ModelShape(double id, Vector3[] shape, double[] shapeUV, jsweet.util.function.TriConsumer<SolidParticle,Double,Double> posFunction, jsweet.util.function.TriConsumer<SolidParticle,Vector3,Double> vtxFunction){}
    protected ModelShape(){}
}

