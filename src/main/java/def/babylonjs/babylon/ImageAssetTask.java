package def.babylonjs.babylon;
import def.dom.HTMLImageElement;
public class ImageAssetTask extends IAssetTask {
    public String name;
    public String url;
    public java.util.function.Consumer<IAssetTask> onSuccess;
    public java.util.function.Consumer<IAssetTask> onError;
    public Boolean isCompleted;
    public HTMLImageElement image;
    public ImageAssetTask(String name, String url){}
    protected ImageAssetTask(){}
}

