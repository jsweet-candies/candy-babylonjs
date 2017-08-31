package def.babylonjs.babylon;
public class TextFileAssetTask extends IAssetTask {
    public String name;
    public String url;
    public java.util.function.Consumer<IAssetTask> onSuccess;
    public java.util.function.Consumer<IAssetTask> onError;
    public Boolean isCompleted;
    public String text;
    public TextFileAssetTask(String name, String url){}
    protected TextFileAssetTask(){}
}

