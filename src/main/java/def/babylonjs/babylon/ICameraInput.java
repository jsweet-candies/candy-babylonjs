package def.babylonjs.babylon;
import def.dom.HTMLElement;
@jsweet.lang.Interface
public abstract class ICameraInput<TCamera extends def.babylonjs.babylon.Camera> extends def.js.Object {
    public TCamera camera;
    native public String getTypeName();
    native public String getSimpleName();
    public java.util.function.BiConsumer<HTMLElement,Boolean> attachControl;
    public java.util.function.Consumer<HTMLElement> detachControl;
    @jsweet.lang.Optional
    public java.lang.Runnable checkInputs;
}

