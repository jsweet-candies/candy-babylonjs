package def.babylonjs.babylon;
import def.js.Array;
public class DecimationVertex extends def.js.Object {
    public Vector3 position;
    public Object id;
    public QuadraticMatrix q;
    public Boolean isBorder;
    public double triangleStart;
    public double triangleCount;
    public Array<Double> originalOffsets;
    public DecimationVertex(Vector3 position, Object id){}
    native public void updatePosition(Vector3 newPosition);
    protected DecimationVertex(){}
}

