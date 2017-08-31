package def.babylonjs;
import def.dom.WebGLProgram;
@jsweet.lang.Interface
@jsweet.lang.Mixin(target=def.dom.WebGLRenderingContext.class)
public abstract class WebGLRenderingContext extends def.dom.WebGLRenderingContext {
    native public void drawArraysInstanced(double mode, double first, double count, double primcount);
    native public void drawElementsInstanced(double mode, double count, double type, double offset, double primcount);
    native public void vertexAttribDivisor(double index, double divisor);
    native public Object createVertexArray();
    native public void bindVertexArray(WebGLVertexArrayObject vao);
    native public void deleteVertexArray(WebGLVertexArrayObject vao);
    native public void blitFramebuffer(double srcX0, double srcY0, double srcX1, double srcY1, double dstX0, double dstY0, double dstX1, double dstY1, double mask, double filter);
    native public void renderbufferStorageMultisample(double target, double samples, double internalformat, double width, double height);
    native public void bindBufferBase(double target, double index, WebGLBuffer buffer);
    native public double getUniformBlockIndex(WebGLProgram program, String uniformBlockName);
    native public void uniformBlockBinding(WebGLProgram program, double uniformBlockIndex, double uniformBlockBinding);
    public double MAX_SAMPLES;
    public double RGBA8;
    public double READ_FRAMEBUFFER;
    public double DRAW_FRAMEBUFFER;
    public double UNIFORM_BUFFER;
    public double HALF_FLOAT_OES;
    public double RGBA16F;
    public double RGBA32F;
    public double DEPTH24_STENCIL8;
    native public void drawBuffers(double[] buffers);
    native public void readBuffer(double src);
    public final double COLOR_ATTACHMENT0=0;
    public final double COLOR_ATTACHMENT1=0;
    public final double COLOR_ATTACHMENT2=0;
    public final double COLOR_ATTACHMENT3=0;
}

