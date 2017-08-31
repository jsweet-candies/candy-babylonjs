package def.babylonjs.babylon;
public class EdgesRenderer extends def.js.Object {
    public double edgesWidthScalerForOrthographic;
    public double edgesWidthScalerForPerspective;
    public EdgesRenderer(AbstractMesh source, double epsilon, Boolean checkVerticesInsteadOfIndices){}
    native public void dispose();
    native public void _generateEdgesLines();
    native public void render();
    public EdgesRenderer(AbstractMesh source, double epsilon){}
    public EdgesRenderer(AbstractMesh source){}
    protected EdgesRenderer(){}
}

