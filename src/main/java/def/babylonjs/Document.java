package def.babylonjs;
import def.dom.HTMLElement;
@jsweet.lang.Interface
@jsweet.lang.Mixin(target=def.dom.Document.class)
public abstract class Document extends def.dom.Document {
    native public void exitFullscreen();
    native public void webkitCancelFullScreen();
    native public void mozCancelFullScreen();
    native public void msCancelFullScreen();
    public Boolean mozFullScreen;
    public Boolean msIsFullScreen;
    public Boolean fullscreen;
    public HTMLElement mozPointerLockElement;
    public HTMLElement msPointerLockElement;
    public HTMLElement webkitPointerLockElement;
}

