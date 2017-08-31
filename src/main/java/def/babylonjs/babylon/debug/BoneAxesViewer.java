package def.babylonjs.babylon.debug;
import def.babylonjs.babylon.Bone;
import def.babylonjs.babylon.Scene;
import def.babylonjs.babylon.Mesh;
import def.babylonjs.babylon.Vector3;
public class BoneAxesViewer extends def.babylonjs.babylon.debug.AxesViewer {
    public Mesh mesh;
    public Bone bone;
    public Vector3 pos;
    public Vector3 xaxis;
    public Vector3 yaxis;
    public Vector3 zaxis;
    public BoneAxesViewer(Scene scene, Bone bone, Mesh mesh, double scaleLines){}
    native public void update();
    native public void dispose();
    public BoneAxesViewer(Scene scene, Bone bone, Mesh mesh){}
    protected BoneAxesViewer(){}
}

