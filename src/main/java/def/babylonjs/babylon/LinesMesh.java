package def.babylonjs.babylon;
public class LinesMesh extends Mesh {
    public Boolean useVertexColor;
    public Color3 color;
    public double alpha;
    /**
         * The intersection Threshold is the margin applied when intersection a segment of the LinesMesh with a Ray.
         * This margin is expressed in world space coordinates, so its value may vary.
         * @param value the new threshold to apply
         */
    public double intersectionThreshold;
    public LinesMesh(String name, Scene scene, Node parent, LinesMesh source, Boolean doNotCloneChildren, Boolean useVertexColor){}
    /**
         * Returns the string "LineMesh"
         */
    native public String getClassName();
    public final Material material=null;
    public final Boolean checkCollisions=null;
    native public InstancedMesh createInstance(String name);
    native public LinesMesh _bind(SubMesh subMesh, Effect effect, double fillMode);
    native public LinesMesh _draw(SubMesh subMesh, double fillMode, double instancesCount);
    native public void dispose(Boolean doNotRecurse);
    /**
         * Returns a new LineMesh object cloned from the current one.
         */
    native public LinesMesh clone(String name, Node newParent, Boolean doNotCloneChildren);
    public LinesMesh(String name, Scene scene, Node parent, LinesMesh source, Boolean doNotCloneChildren){}
    public LinesMesh(String name, Scene scene, Node parent, LinesMesh source){}
    public LinesMesh(String name, Scene scene, Node parent){}
    public LinesMesh(String name, Scene scene){}
    native public LinesMesh _draw(SubMesh subMesh, double fillMode);
    native public void dispose();
    /**
         * Returns a new LineMesh object cloned from the current one.
         */
    native public LinesMesh clone(String name, Node newParent);
    /**
         * Returns a new LineMesh object cloned from the current one.
         */
    native public LinesMesh clone(String name);
    protected LinesMesh(){}
}

