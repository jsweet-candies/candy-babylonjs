package def.babylonjs.babylon;
import def.dom.WebGLBuffer;
@jsweet.lang.Extends({ICullable.class})
public class SubMesh extends BaseSubMesh {
    public double materialIndex;
    public double verticesStart;
    public double verticesCount;
    public Object indexStart;
    public double indexCount;
    public double linesIndexCount;
    public Vector3[] _lastColliderWorldVertices;
    public Plane[] _trianglePlanes;
    public Matrix _lastColliderTransformMatrix;
    public double _renderId;
    public double _alphaIndex;
    public double _distanceToCamera;
    public double _id;
    public SubMesh(double materialIndex, double verticesStart, double verticesCount, Object indexStart, double indexCount, AbstractMesh mesh, Mesh renderingMesh, Boolean createBoundingBox){}
    public final Boolean IsGlobal=null;
    /**
         * Returns the submesh BoudingInfo object.
         */
    native public BoundingInfo getBoundingInfo();
    /**
         * Sets the submesh BoundingInfo.
         * Return the SubMesh.
         */
    native public SubMesh setBoundingInfo(BoundingInfo boundingInfo);
    /**
         * Returns the mesh of the current submesh.
         */
    native public AbstractMesh getMesh();
    /**
         * Returns the rendering mesh of the submesh.
         */
    native public Mesh getRenderingMesh();
    /**
         * Returns the submesh material.
         */
    native public Material getMaterial();
    /**
         * Sets a new updated BoundingInfo object to the submesh.
         * Returns the SubMesh.
         */
    native public SubMesh refreshBoundingInfo();
    native public Boolean _checkCollision(Collider collider);
    /**
         * Updates the submesh BoundingInfo.
         * Returns the Submesh.
         */
    native public SubMesh updateBoundingInfo(Matrix world);
    /**
         * Renders the submesh.
         * Returns it.
         */
    native public SubMesh render(Boolean enableAlphaMode);
    /**
         * Returns a new Index Buffer.
         * Type returned : WebGLBuffer.
         */
    native public WebGLBuffer getLinesIndexBuffer(Object indices, Engine engine);
    /**
         * True is the passed Ray intersects the submesh bounding box.
         * Boolean returned.
         */
    native public Boolean canIntersects(Ray ray);
    /**
         * Returns an object IntersectionInfo.
         */
    native public IntersectionInfo intersects(Ray ray, Vector3[] positions, Object indices, Boolean fastCheck);
    /**
         * Creates a new Submesh from the passed Mesh.
         */
    native public SubMesh clone(AbstractMesh newMesh, Mesh newRenderingMesh);
    /**
         * Disposes the Submesh.
         * Returns nothing.
         */
    native public void dispose();
    /**
         * Creates a new Submesh from the passed parameters :
         * - materialIndex (integer) : the index of the main mesh material.
         * - startIndex (integer) : the index where to start the copy in the mesh indices array.
         * - indexCount (integer) : the number of indices to copy then from the startIndex.
         * - mesh (Mesh) : the main mesh to create the submesh from.
         * - renderingMesh (optional Mesh) : rendering mesh.
         */
    native public static SubMesh CreateFromIndices(double materialIndex, double startIndex, double indexCount, AbstractMesh mesh, Mesh renderingMesh);
    native public Boolean isInFrustum(Plane[] frustumPlanes);
    native public Boolean isCompletelyInFrustum(Plane[] frustumPlanes);
    public SubMesh(double materialIndex, double verticesStart, double verticesCount, Object indexStart, double indexCount, AbstractMesh mesh, Mesh renderingMesh){}
    public SubMesh(double materialIndex, double verticesStart, double verticesCount, Object indexStart, double indexCount, AbstractMesh mesh){}
    /**
         * Returns an object IntersectionInfo.
         */
    native public IntersectionInfo intersects(Ray ray, Vector3[] positions, Object indices);
    /**
         * Creates a new Submesh from the passed Mesh.
         */
    native public SubMesh clone(AbstractMesh newMesh);
    /**
         * Creates a new Submesh from the passed parameters :
         * - materialIndex (integer) : the index of the main mesh material.
         * - startIndex (integer) : the index where to start the copy in the mesh indices array.
         * - indexCount (integer) : the number of indices to copy then from the startIndex.
         * - mesh (Mesh) : the main mesh to create the submesh from.
         * - renderingMesh (optional Mesh) : rendering mesh.
         */
    native public static SubMesh CreateFromIndices(double materialIndex, double startIndex, double indexCount, AbstractMesh mesh);
    protected SubMesh(){}
}

