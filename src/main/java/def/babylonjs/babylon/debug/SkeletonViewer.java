package def.babylonjs.babylon.debug;
import def.babylonjs.babylon.Skeleton;
import def.babylonjs.babylon.AbstractMesh;
import def.babylonjs.babylon.Scene;
import def.babylonjs.babylon.Color3;
/**
    * Demo available here: http://www.babylonjs-playground.com/#1BZJVJ#8
    */
public class SkeletonViewer extends def.js.Object {
    public Skeleton skeleton;
    public AbstractMesh mesh;
    public Boolean autoUpdateBonesMatrices;
    public double renderingGroupId;
    public Color3 color;
    public SkeletonViewer(Skeleton skeleton, AbstractMesh mesh, Scene scene, Boolean autoUpdateBonesMatrices, double renderingGroupId){}
    public Boolean isEnabled;
    native public void update();
    native public void dispose();
    public SkeletonViewer(Skeleton skeleton, AbstractMesh mesh, Scene scene, Boolean autoUpdateBonesMatrices){}
    public SkeletonViewer(Skeleton skeleton, AbstractMesh mesh, Scene scene){}
    protected SkeletonViewer(){}
}

