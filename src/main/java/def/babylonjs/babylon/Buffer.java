package def.babylonjs.babylon;
import def.js.Float32Array;
import def.dom.WebGLBuffer;
public class Buffer extends def.js.Object {
    public Buffer(Object engine, double[] data, Boolean updatable, double stride, Boolean postponeInternalCreation, Boolean instanced){}
    native public VertexBuffer createVertexBuffer(String kind, double offset, double size, double stride);
    native public Boolean isUpdatable();
    native public jsweet.util.union.Union<Double[],Float32Array> getData();
    native public WebGLBuffer getBuffer();
    native public double getStrideSize();
    native public Boolean getIsInstanced();
    public double instanceDivisor;
    native public void create(double[] data);
    native public void update(double[] data);
    native public void updateDirectly(Float32Array data, double offset, double vertexCount);
    native public void dispose();
    public Buffer(Object engine, double[] data, Boolean updatable, double stride, Boolean postponeInternalCreation){}
    public Buffer(Object engine, double[] data, Boolean updatable, double stride){}
    native public VertexBuffer createVertexBuffer(String kind, double offset, double size);
    native public void create();
    native public void updateDirectly(Float32Array data, double offset);
    public Buffer(Object engine, Float32Array data, Boolean updatable, double stride, Boolean postponeInternalCreation, Boolean instanced){}
    native public void create(Float32Array data);
    native public void update(Float32Array data);
    public Buffer(Object engine, Float32Array data, Boolean updatable, double stride, Boolean postponeInternalCreation){}
    public Buffer(Object engine, Float32Array data, Boolean updatable, double stride){}
    protected Buffer(){}
}

