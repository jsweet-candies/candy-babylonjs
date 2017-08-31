package def.babylonjs.babylon;
public class PostProcessRenderPass extends def.js.Object {
    public String _name;
    public PostProcessRenderPass(Scene scene, String name, double size, Mesh[] renderList, java.lang.Runnable beforeRender, java.lang.Runnable afterRender){}
    native public double _incRefCount();
    native public double _decRefCount();
    native public void _update();
    native public void setRenderList(Mesh[] renderList);
    native public RenderTargetTexture getRenderTexture();
    protected PostProcessRenderPass(){}
}

