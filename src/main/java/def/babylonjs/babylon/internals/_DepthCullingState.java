package def.babylonjs.babylon.internals;
import def.dom.WebGLRenderingContext;
public class _DepthCullingState extends def.js.Object {
    /**
         * Initializes the state.
         */
    public _DepthCullingState(){}
    public final Boolean isDirty=null;
    public double zOffset;
    public double cullFace;
    public Boolean cull;
    public double depthFunc;
    public Boolean depthMask;
    public Boolean depthTest;
    native public void reset();
    native public void apply(WebGLRenderingContext gl);
}

