package def.babylonjs.babylon.internals;
import def.dom.WebGLRenderingContext;
public class _AlphaState extends def.js.Object {
    /**
         * Initializes the state.
         */
    public _AlphaState(){}
    public final Boolean isDirty=null;
    public Boolean alphaBlend;
    native public void setAlphaBlendConstants(double r, double g, double b, double a);
    native public void setAlphaBlendFunctionParameters(double value0, double value1, double value2, double value3);
    native public void setAlphaEquationParameters(double rgb, Object alpha);
    native public void reset();
    native public void apply(WebGLRenderingContext gl);
}

