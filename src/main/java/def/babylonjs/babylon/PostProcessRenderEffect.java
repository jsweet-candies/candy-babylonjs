package def.babylonjs.babylon;
public class PostProcessRenderEffect extends def.js.Object {
    public String _name;
    public java.util.function.Consumer<PostProcess> applyParameters;
    public PostProcessRenderEffect(Engine engine, String name, java.util.function.Supplier<PostProcess> getPostProcess, Boolean singleInstance){}
    public final Boolean isSupported=null;
    native public void _update();
    native public void addPass(PostProcessRenderPass renderPass);
    native public void removePass(PostProcessRenderPass renderPass);
    native public void addRenderEffectAsPass(PostProcessRenderEffect renderEffect);
    native public void getPass(String passName);
    native public void emptyPasses();
    native public Object _attachCameras(Camera cameras);
    native public Object _attachCameras(Camera[] cameras);
    native public Object _detachCameras(Camera cameras);
    native public Object _detachCameras(Camera[] cameras);
    native public Object _enable(Camera cameras);
    native public Object _enable(Camera[] cameras);
    native public Object _disable(Camera cameras);
    native public Object _disable(Camera[] cameras);
    native public PostProcess getPostProcess(Camera camera);
    public PostProcessRenderEffect(Engine engine, String name, java.util.function.Supplier<PostProcess> getPostProcess){}
    native public PostProcess getPostProcess();
    protected PostProcessRenderEffect(){}
}

