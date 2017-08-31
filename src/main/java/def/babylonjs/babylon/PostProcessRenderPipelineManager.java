package def.babylonjs.babylon;
public class PostProcessRenderPipelineManager extends def.js.Object {
    public PostProcessRenderPipelineManager(){}
    native public void addPipeline(PostProcessRenderPipeline renderPipeline);
    native public Object attachCamerasToRenderPipeline(String renderPipelineName, Camera cameras, Boolean unique);
    native public Object attachCamerasToRenderPipeline(String renderPipelineName, Camera[] cameras, Boolean unique);
    native public Object detachCamerasFromRenderPipeline(String renderPipelineName, Camera cameras);
    native public Object detachCamerasFromRenderPipeline(String renderPipelineName, Camera[] cameras);
    native public Object enableEffectInPipeline(String renderPipelineName, String renderEffectName, Camera cameras);
    native public Object enableEffectInPipeline(String renderPipelineName, String renderEffectName, Camera[] cameras);
    native public Object disableEffectInPipeline(String renderPipelineName, String renderEffectName, Camera cameras);
    native public Object disableEffectInPipeline(String renderPipelineName, String renderEffectName, Camera[] cameras);
    native public Object enableDisplayOnlyPassInPipeline(String renderPipelineName, String passName, Camera cameras);
    native public Object enableDisplayOnlyPassInPipeline(String renderPipelineName, String passName, Camera[] cameras);
    native public Object disableDisplayOnlyPassInPipeline(String renderPipelineName, Camera cameras);
    native public Object disableDisplayOnlyPassInPipeline(String renderPipelineName, Camera[] cameras);
    native public void update();
    native public Object attachCamerasToRenderPipeline(String renderPipelineName, Camera cameras);
    native public Object attachCamerasToRenderPipeline(String renderPipelineName, Camera[] cameras);
}

