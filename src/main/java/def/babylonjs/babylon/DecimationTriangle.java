package def.babylonjs.babylon;
import def.js.Array;
public class DecimationTriangle extends def.js.Object {
    public Array<DecimationVertex> vertices;
    public Vector3 normal;
    public Array<Double> error;
    public Boolean deleted;
    public Boolean isDirty;
    public double borderFactor;
    public Boolean deletePending;
    public double originalOffset;
    public DecimationTriangle(Array<DecimationVertex> vertices){}
    public DecimationTriangle(DecimationVertex[] vertices){}
    protected DecimationTriangle(){}
}

