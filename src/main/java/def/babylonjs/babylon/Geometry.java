package def.babylonjs.babylon;
import def.js.Float32Array;
import def.dom.WebGLBuffer;
public class Geometry extends IGetSetVerticesData {
    public String id;
    public double delayLoadState;
    public String delayLoadingFile;
    public java.util.function.BiConsumer<Geometry,String> onGeometryUpdated;
    public Object _delayInfo;
    public BoundingInfo _boundingInfo;
    public java.util.function.BiConsumer<Object,Geometry> _delayLoadingFunction;
    public double _softwareSkinningRenderId;
    public Vector3[] _positions;
    /**
         *  The Bias Vector to apply on the bounding elements (box/sphere), the max extend is computed as v += v * bias.x + bias.y, the min is computed as v -= v * bias.x + bias.y
         * @returns The Bias Vector
         */
    public Vector2 boundingBias;
    public Geometry(String id, Scene scene, VertexData vertexData, Boolean updatable, Mesh mesh){}
    public final Extend extend=null;
    native public Scene getScene();
    native public Engine getEngine();
    native public Boolean isReady();
    public final Boolean doNotSerialize=null;
    native public void setAllVerticesData(VertexData vertexData, Boolean updatable);
    native public void setVerticesData(String kind, double[] data, Boolean updatable, double stride);
    native public void removeVerticesData(String kind);
    native public void setVerticesBuffer(VertexBuffer buffer);
    native public void updateVerticesDataDirectly(String kind, Float32Array data, double offset);
    native public void updateVerticesData(String kind, double[] data, Boolean updateExtends);
    native public void _bind(Effect effect, WebGLBuffer indexToBind);
    native public double getTotalVertices();
    native public jsweet.util.union.Union<Double[],Float32Array> getVerticesData(String kind, Boolean copyWhenShared, Boolean forceCopy);
    native public VertexBuffer getVertexBuffer(String kind);
    native public GetVertexBuffers getVertexBuffers();
    native public Boolean isVerticesDataPresent(String kind);
    native public String[] getVerticesDataKinds();
    native public void setIndices(Object indices, double totalVertices);
    native public double getTotalIndices();
    native public Object getIndices(Boolean copyWhenShared);
    native public WebGLBuffer getIndexBuffer();
    native public void _releaseVertexArrayObject(Effect effect);
    native public void releaseForMesh(Mesh mesh, Boolean shouldDispose);
    native public void applyToMesh(Mesh mesh);
    native public void load(Scene scene, java.lang.Runnable onLoaded);
    /**
         * Invert the geometry to move from a right handed system to a left handed one.
         */
    native public void toLeftHanded();
    native public void _resetPointsArrayCache();
    native public Boolean _generatePointsArray();
    native public Boolean isDisposed();
    native public void dispose();
    native public Geometry copy(String id);
    native public Object serialize();
    native public Object serializeVerticeData();
    native public static Geometry ExtractFromMesh(Mesh mesh, String id);
    /**
         * You should now use Tools.RandomId(), this method is still here for legacy reasons.
         * Implementation from http://stackoverflow.com/questions/105034/how-to-create-a-guid-uuid-in-javascript/2117523#answer-2117523
         * Be aware Math.random() could cause collisions, but:
         * "All but 6 of the 128 bits of the ID are randomly generated, which means that for any two ids, there's a 1 in 2^^122 (or 5.3x10^^36) chance they'll collide"
         */
    native public static String RandomId();
    native public static void ImportGeometry(Object parsedGeometry, Mesh mesh);
    native public static Geometry Parse(Object parsedVertexData, Scene scene, String rootUrl);
    /** This is an automatically generated object type (see the source definition). */
    @jsweet.lang.ObjectType
    public static class Extend extends def.js.Object {
        public Vector3 minimum;
        public Vector3 maximum;
    }
    /** This is an automatically generated object type (see the source definition). */
    @jsweet.lang.ObjectType
    public static class GetVertexBuffers extends def.js.Object {
        native public VertexBuffer $get(String key);
    }
    public Geometry(String id, Scene scene, VertexData vertexData, Boolean updatable){}
    public Geometry(String id, Scene scene, VertexData vertexData){}
    public Geometry(String id, Scene scene){}
    native public void setAllVerticesData(VertexData vertexData);
    native public void setVerticesData(String kind, double[] data, Boolean updatable);
    native public void setVerticesData(String kind, double[] data);
    native public void updateVerticesData(String kind, double[] data);
    native public void _bind(Effect effect);
    native public jsweet.util.union.Union<Double[],Float32Array> getVerticesData(String kind, Boolean copyWhenShared);
    native public jsweet.util.union.Union<Double[],Float32Array> getVerticesData(String kind);
    native public void setIndices(Object indices);
    native public Object getIndices();
    native public void releaseForMesh(Mesh mesh);
    native public void load(Scene scene);
    native public void setVerticesData(String kind, Float32Array data, Boolean updatable, double stride);
    native public void updateVerticesData(String kind, Float32Array data, Boolean updateExtends);
    native public void setVerticesData(String kind, Float32Array data, Boolean updatable);
    native public void setVerticesData(String kind, Float32Array data);
    native public void updateVerticesData(String kind, Float32Array data);
    protected Geometry(){}
}

