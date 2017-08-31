package def.babylonjs.babylon;
/**
     * An implementation of the Quadratic Error simplification algorithm.
     * Original paper : http://www1.cs.columbia.edu/~cs4162/html05s/garland97.pdf
     * Ported mostly from QSlim and http://voxels.blogspot.de/2014/05/quadric-mesh-simplification-with-source.html to babylon JS
     * @author RaananW
     */
public class QuadraticErrorSimplification extends ISimplifier {
    public double syncIterations;
    public double aggressiveness;
    public double decimationIterations;
    public double boundingBoxEpsilon;
    public QuadraticErrorSimplification(Mesh _mesh){}
    native public void simplify(ISimplificationSettings settings, java.util.function.Consumer<Mesh> successCallback);
    protected QuadraticErrorSimplification(){}
}

