package def.babylonjs.babylon;
import def.js.Array;
public class MeshAssetTask extends IAssetTask {
    public String name;
    public Object meshesNames;
    public String rootUrl;
    public String sceneFilename;
    public Array<AbstractMesh> loadedMeshes;
    public Array<ParticleSystem> loadedParticleSystems;
    public Array<Skeleton> loadedSkeletons;
    public java.util.function.Consumer<IAssetTask> onSuccess;
    public java.util.function.Consumer<IAssetTask> onError;
    public Boolean isCompleted;
    public MeshAssetTask(String name, Object meshesNames, String rootUrl, String sceneFilename){}
    protected MeshAssetTask(){}
}

