package def.babylonjs.babylon;
import def.js.Float32Array;
import def.dom.WebGLBuffer;
public class VertexBuffer extends def.js.Object {
    public VertexBuffer(Object engine, double[] data, String kind, Boolean updatable, Boolean postponeInternalCreation, double stride, Boolean instanced, double offset, double size){}
    /**
         * Returns the kind of the VertexBuffer (string).
         */
    native public String getKind();
    /**
         * Boolean : is the VertexBuffer updatable ?
         */
    native public Boolean isUpdatable();
    /**
         * Returns an array of numbers or a Float32Array containing the VertexBuffer data.
         */
    native public jsweet.util.union.Union<Double[],Float32Array> getData();
    /**
         * Returns the WebGLBuffer associated to the VertexBuffer.
         */
    native public WebGLBuffer getBuffer();
    /**
         * Returns the stride of the VertexBuffer (integer).
         */
    native public double getStrideSize();
    /**
         * Returns the offset (integer).
         */
    native public double getOffset();
    /**
         * Returns the VertexBuffer total size (integer).
         */
    native public double getSize();
    /**
         * Boolean : is the WebGLBuffer of the VertexBuffer instanced now ?
         */
    native public Boolean getIsInstanced();
    /**
         * Returns the instancing divisor, zero for non-instanced (integer).
         */
    native public double getInstanceDivisor();
    /**
         * Creates the underlying WebGLBuffer from the passed numeric array or Float32Array.
         * Returns the created WebGLBuffer.
         */
    native public void create(double[] data);
    /**
         * Updates the underlying WebGLBuffer according to the passed numeric array or Float32Array.
         * Returns the updated WebGLBuffer.
         */
    native public void update(double[] data);
    /**
         * Updates directly the underlying WebGLBuffer according to the passed numeric array or Float32Array.
         * Returns the directly updated WebGLBuffer.
         */
    native public void updateDirectly(Float32Array data, double offset);
    /**
         * Disposes the VertexBuffer and the underlying WebGLBuffer.
         */
    native public void dispose();
    public static final String PositionKind=null;
    public static final String NormalKind=null;
    public static final String TangentKind=null;
    public static final String UVKind=null;
    public static final String UV2Kind=null;
    public static final String UV3Kind=null;
    public static final String UV4Kind=null;
    public static final String UV5Kind=null;
    public static final String UV6Kind=null;
    public static final String ColorKind=null;
    public static final String MatricesIndicesKind=null;
    public static final String MatricesWeightsKind=null;
    public static final String MatricesIndicesExtraKind=null;
    public static final String MatricesWeightsExtraKind=null;
    public VertexBuffer(Object engine, double[] data, String kind, Boolean updatable, Boolean postponeInternalCreation, double stride, Boolean instanced, double offset){}
    public VertexBuffer(Object engine, double[] data, String kind, Boolean updatable, Boolean postponeInternalCreation, double stride, Boolean instanced){}
    public VertexBuffer(Object engine, double[] data, String kind, Boolean updatable, Boolean postponeInternalCreation, double stride){}
    public VertexBuffer(Object engine, double[] data, String kind, Boolean updatable, Boolean postponeInternalCreation){}
    public VertexBuffer(Object engine, double[] data, String kind, Boolean updatable){}
    /**
         * Creates the underlying WebGLBuffer from the passed numeric array or Float32Array.
         * Returns the created WebGLBuffer.
         */
    native public void create();
    public VertexBuffer(Object engine, Float32Array data, String kind, Boolean updatable, Boolean postponeInternalCreation, double stride, Boolean instanced, double offset, double size){}
    public VertexBuffer(Object engine, Buffer data, String kind, Boolean updatable, Boolean postponeInternalCreation, double stride, Boolean instanced, double offset, double size){}
    /**
         * Creates the underlying WebGLBuffer from the passed numeric array or Float32Array.
         * Returns the created WebGLBuffer.
         */
    native public void create(Float32Array data);
    /**
         * Updates the underlying WebGLBuffer according to the passed numeric array or Float32Array.
         * Returns the updated WebGLBuffer.
         */
    native public void update(Float32Array data);
    public VertexBuffer(Object engine, Buffer data, String kind, Boolean updatable, Boolean postponeInternalCreation, double stride, Boolean instanced, double offset){}
    public VertexBuffer(Object engine, Float32Array data, String kind, Boolean updatable, Boolean postponeInternalCreation, double stride, Boolean instanced, double offset){}
    public VertexBuffer(Object engine, Buffer data, String kind, Boolean updatable, Boolean postponeInternalCreation, double stride, Boolean instanced){}
    public VertexBuffer(Object engine, Float32Array data, String kind, Boolean updatable, Boolean postponeInternalCreation, double stride, Boolean instanced){}
    public VertexBuffer(Object engine, Float32Array data, String kind, Boolean updatable, Boolean postponeInternalCreation, double stride){}
    public VertexBuffer(Object engine, Buffer data, String kind, Boolean updatable, Boolean postponeInternalCreation, double stride){}
    public VertexBuffer(Object engine, Float32Array data, String kind, Boolean updatable, Boolean postponeInternalCreation){}
    public VertexBuffer(Object engine, Buffer data, String kind, Boolean updatable, Boolean postponeInternalCreation){}
    public VertexBuffer(Object engine, Buffer data, String kind, Boolean updatable){}
    public VertexBuffer(Object engine, Float32Array data, String kind, Boolean updatable){}
    protected VertexBuffer(){}
}

