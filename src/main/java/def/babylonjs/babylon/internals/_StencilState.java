package def.babylonjs.babylon.internals;
import def.dom.WebGLRenderingContext;
public class _StencilState extends def.js.Object {
    public final Boolean isDirty=null;
    public double stencilFunc;
    public double stencilFuncRef;
    public double stencilFuncMask;
    public double stencilOpStencilFail;
    public double stencilOpDepthFail;
    public double stencilOpStencilDepthPass;
    public double stencilMask;
    public Boolean stencilTest;
    public _StencilState(){}
    native public void reset();
    native public void apply(WebGLRenderingContext gl);
}

