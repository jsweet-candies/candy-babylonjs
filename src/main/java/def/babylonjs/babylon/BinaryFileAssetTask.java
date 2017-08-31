package def.babylonjs.babylon;
import def.js.ArrayBuffer;
public class BinaryFileAssetTask extends IAssetTask {
    public String name;
    public String url;
    public java.util.function.Consumer<IAssetTask> onSuccess;
    public java.util.function.Consumer<IAssetTask> onError;
    public Boolean isCompleted;
    public ArrayBuffer data;
    public BinaryFileAssetTask(String name, String url){}
    protected BinaryFileAssetTask(){}
}

