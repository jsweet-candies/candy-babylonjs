package def.babylonjs.babylon.debug;
import def.babylonjs.babylon.PhysicsImpostor;
import def.js.Array;
import def.babylonjs.babylon.AbstractMesh;
import def.babylonjs.babylon.Scene;
import def.babylonjs.babylon.IPhysicsEnginePlugin;
public class PhysicsViewer extends def.js.Object {
    public Array<PhysicsImpostor> _impostors;
    public Array<AbstractMesh> _meshes;
    public Scene _scene;
    public double _numMeshes;
    public IPhysicsEnginePlugin _physicsEnginePlugin;
    public PhysicsViewer(Scene scene){}
    native public void _updateDebugMeshes();
    native public void showImpostor(PhysicsImpostor impostor);
    native public void hideImpostor(PhysicsImpostor impostor);
    native public void dispose();
    protected PhysicsViewer(){}
}

