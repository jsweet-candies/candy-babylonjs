package def.babylonjs.babylon;
import def.dom.HTMLElement;
public class CameraInputsManager<TCamera extends def.babylonjs.babylon.Camera> extends def.js.Object {
    public CameraInputsMap<TCamera> attached;
    public HTMLElement attachedElement;
    public Boolean noPreventDefault;
    public TCamera camera;
    public java.lang.Runnable checkInputs;
    public CameraInputsManager(TCamera camera){}
    native public void add(ICameraInput<TCamera> input);
    native public void remove(ICameraInput<TCamera> inputToRemove);
    native public void removeByType(String inputType);
    native public void attachInput(ICameraInput<TCamera> input);
    native public void attachElement(HTMLElement element, Boolean noPreventDefault);
    native public void detachElement(HTMLElement element);
    native public void rebuildInputCheck();
    native public void clear();
    native public void serialize(Object serializedCamera);
    native public void parse(Object parsedCamera);
    native public void attachElement(HTMLElement element);
    protected CameraInputsManager(){}
}

