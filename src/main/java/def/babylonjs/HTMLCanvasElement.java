package def.babylonjs;
@jsweet.lang.Interface
@jsweet.lang.Mixin(target=def.dom.HTMLCanvasElement.class)
public abstract class HTMLCanvasElement extends def.dom.HTMLCanvasElement {
    native public void requestPointerLock();
    native public void msRequestPointerLock();
    native public void mozRequestPointerLock();
    native public void webkitRequestPointerLock();
}

