package def.babylonjs.babylon.debug;
import def.babylonjs.babylon.Scene;
import def.babylonjs.babylon.Vector3;
public class AxesViewer extends def.js.Object {
    public Scene scene;
    public double scaleLines;
    public AxesViewer(Scene scene, double scaleLines){}
    native public void update(Vector3 position, Vector3 xaxis, Vector3 yaxis, Vector3 zaxis);
    native public void dispose();
    public AxesViewer(Scene scene){}
    protected AxesViewer(){}
}

