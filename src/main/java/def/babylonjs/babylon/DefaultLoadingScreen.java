package def.babylonjs.babylon;
import def.dom.HTMLCanvasElement;
public class DefaultLoadingScreen extends ILoadingScreen {
    public DefaultLoadingScreen(HTMLCanvasElement _renderingCanvas, String _loadingText, String _loadingDivBackgroundColor){}
    native public void displayLoadingUI();
    native public void hideLoadingUI();
    public String loadingUIText;
    public String loadingUIBackgroundColor;
    public DefaultLoadingScreen(HTMLCanvasElement _renderingCanvas, String _loadingText){}
    public DefaultLoadingScreen(HTMLCanvasElement _renderingCanvas){}
    protected DefaultLoadingScreen(){}
}

