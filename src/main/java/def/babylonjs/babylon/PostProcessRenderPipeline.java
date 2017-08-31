package def.babylonjs.babylon;
public class PostProcessRenderPipeline extends def.js.Object {
    public Camera[] _cameras;
    public String _name;
    public PostProcessRenderPipeline(Engine engine, String name){}
    public final Boolean isSupported=null;
    native public void addEffect(PostProcessRenderEffect renderEffect);
    native public Object _enableEffect(String renderEffectName, Camera cameras);
    native public Object _enableEffect(String renderEffectName, Camera[] cameras);
    native public Object _disableEffect(String renderEffectName, Camera cameras);
    native public Object _disableEffect(String renderEffectName, Camera[] cameras);
    native public Object _attachCameras(Camera cameras, Boolean unique);
    native public Object _attachCameras(Camera[] cameras, Boolean unique);
    native public Object _detachCameras(Camera cameras);
    native public Object _detachCameras(Camera[] cameras);
    native public Object _enableDisplayOnlyPass(Object passName, Camera cameras);
    native public Object _enableDisplayOnlyPass(Object passName, Camera[] cameras);
    native public Object _disableDisplayOnlyPass(Camera cameras);
    native public Object _disableDisplayOnlyPass(Camera[] cameras);
    native public void _update();
    native public void _reset();
    native public void dispose();
    protected PostProcessRenderPipeline(){}
}

