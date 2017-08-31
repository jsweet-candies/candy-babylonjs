package def.babylonjs.babylon;
import def.dom.HTMLImageElement;
public class Database extends def.js.Object {
    public static Boolean IsUASupportingBlobStorage;
    public static Boolean IDBStorageEnabled;
    public Database(String urlToScene, java.util.function.Function<Boolean,Object> callbackManifestChecked){}
    public static java.util.function.Function<String,String> parseURL;
    public static java.util.function.Function<String,String> ReturnFullUrlLocation;
    native public void checkManifestFile();
    native public void openAsync(Object successCallback, Object errorCallback);
    native public void loadImageFromDB(String url, HTMLImageElement image);
    protected Database(){}
}

