package def.babylonjs.babylon;
import def.dom.WebGLTexture;
public class PostProcessManager extends def.js.Object {
    public PostProcessManager(Scene scene){}
    native public Boolean _prepareFrame(WebGLTexture sourceTexture, PostProcess[] postProcesses);
    native public void directRender(PostProcess[] postProcesses, WebGLTexture targetTexture);
    native public void _finalizeFrame(Boolean doNotPresent, WebGLTexture targetTexture, double faceIndex, PostProcess[] postProcesses);
    native public void dispose();
    native public Boolean _prepareFrame(WebGLTexture sourceTexture);
    native public Boolean _prepareFrame();
    native public void directRender(PostProcess[] postProcesses);
    native public void _finalizeFrame(Boolean doNotPresent, WebGLTexture targetTexture, double faceIndex);
    native public void _finalizeFrame(Boolean doNotPresent, WebGLTexture targetTexture);
    native public void _finalizeFrame(Boolean doNotPresent);
    native public void _finalizeFrame();
    protected PostProcessManager(){}
}

