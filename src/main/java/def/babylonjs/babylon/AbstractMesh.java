package def.babylonjs.babylon;
import def.js.Float32Array;
@jsweet.lang.Extends({IDisposable.class,ICullable.class,IGetSetVerticesData.class})
public class AbstractMesh extends Node {
    public static final double BILLBOARDMODE_NONE=0;
    public static final double BILLBOARDMODE_X=0;
    public static final double BILLBOARDMODE_Y=0;
    public static final double BILLBOARDMODE_Z=0;
    public static final double BILLBOARDMODE_ALL=0;
    /**
         * Read-only : the number of facets in the mesh
         */
    public final double facetNb=0;
    /**
         * The number (integer) of subdivisions per axis in the partioning space
         */
    public double partitioningSubdivisions;
    /**
         * The ratio (float) to apply to the bouding box size to set to the partioning space.
         * Ex : 1.01 (default) the partioning space is 1% bigger than the bounding box.
         */
    public double partitioningBBoxRatio;
    /**
         * Read-only boolean : is the feature facetData enabled ?
         */
    public final Boolean isFacetDataEnabled=null;
    /**
        * An event triggered when this mesh collides with another one
        * @type {BABYLON.Observable}
        */
    public Observable<AbstractMesh> onCollideObservable;
    public java.lang.Runnable onCollide;
    /**
        * An event triggered when the collision's position changes
        * @type {BABYLON.Observable}
        */
    public Observable<Vector3> onCollisionPositionChangeObservable;
    public java.lang.Runnable onCollisionPositionChange;
    /**
        * An event triggered after the world matrix is updated
        * @type {BABYLON.Observable}
        */
    public Observable<AbstractMesh> onAfterWorldMatrixUpdateObservable;
    public Boolean definedFacingForward;
    public Vector3 position;
    public double billboardMode;
    public double visibility;
    public double alphaIndex;
    public Boolean infiniteDistance;
    public Boolean isVisible;
    public Boolean isPickable;
    public Boolean showBoundingBox;
    public Boolean showSubMeshesBoundingBox;
    public Boolean isBlocker;
    public double renderingGroupId;
    public Material material;
    public Boolean receiveShadows;
    public Boolean renderOutline;
    public Color3 outlineColor;
    public double outlineWidth;
    public Boolean renderOverlay;
    public Color3 overlayColor;
    public double overlayAlpha;
    public Boolean hasVertexAlpha;
    public Boolean useVertexColors;
    public Boolean computeBonesUsingShaders;
    public double numBoneInfluencers;
    public Boolean applyFog;
    public double scalingDeterminant;
    public Boolean useOctreeForRenderingSelection;
    public Boolean useOctreeForPicking;
    public Boolean useOctreeForCollisions;
    public double layerMask;
    /**
         * True if the mesh must be rendered in any case.
         */
    public Boolean alwaysSelectAsActiveMesh;
    /**
         * This scene's action manager
         * @type {BABYLON.ActionManager}
        */
    public ActionManager actionManager;
    public def.babylonjs.babylon.PhysicsImpostor physicsImpostor;
    public Vector3 ellipsoid;
    public Vector3 ellipsoidOffset;
    public double collisionMask;
    public double collisionGroup;
    public double edgesWidth;
    public Color4 edgesColor;
    public EdgesRenderer _edgesRenderer;
    public Matrix _worldMatrix;
    public AbstractMesh _masterMesh;
    public BoundingInfo _boundingInfo;
    public Boolean _isDisposed;
    public double _renderId;
    public SubMesh[] subMeshes;
    public Octree<SubMesh> _submeshesOctree;
    public AbstractMesh[] _intersectionsInProgress;
    public Boolean _unIndexed;
    public Matrix _poseMatrix;
    public Light[] _lightSources;
    public final Vector3[] _positions=null;
    public Object _waitingActions;
    public Boolean _waitingFreezeWorldMatrix;
    public Float32Array _bonesTransformMatrices;
    public Skeleton skeleton;
    public AbstractMesh(String name, Scene scene){}
    /**
         * Returns the string "AbstractMesh"
         */
    native public String getClassName();
    /**
         * @param {boolean} fullDetails - support for multiple levels of logging within scene loading
         */
    native public String toString(Boolean fullDetails);
    native public void _resyncLightSources();
    native public void _resyncLighSource(Light light);
    native public void _removeLightSource(Light light);
    native public void _markSubMeshesAsLightDirty();
    native public void _markSubMeshesAsAttributesDirty();
    native public void _markSubMeshesAsMiscDirty();
    /**
         * Rotation property : a Vector3 depicting the rotation value in radians around each local axis X, Y, Z.
         * If rotation quaternion is set, this Vector3 will (almost always) be the Zero vector!
         * Default : (0.0, 0.0, 0.0)
         */
    public Vector3 rotation;
    /**
         * Scaling property : a Vector3 depicting the mesh scaling along each local axis X, Y, Z.
         * Default : (1.0, 1.0, 1.0)
         */
    public Vector3 scaling;
    /**
         * Rotation Quaternion property : this a Quaternion object depicting the mesh rotation by using a unit quaternion.
         * It's null by default.
         * If set, only the rotationQuaternion is then used to compute the mesh rotation and its property `.rotation\ is then ignored and set to (0.0, 0.0, 0.0)
         */
    public Quaternion rotationQuaternion;
    /**
         * Copies the paramater passed Matrix into the mesh Pose matrix.
         * Returns the AbstractMesh.
         */
    native public AbstractMesh updatePoseMatrix(Matrix matrix);
    /**
         * Returns the mesh Pose matrix.
         * Returned object : Matrix
         */
    native public Matrix getPoseMatrix();
    /**
         * Disables the mesh edger rendering mode.
         * Returns the AbstractMesh.
         */
    native public AbstractMesh disableEdgesRendering();
    /**
         * Enables the edge rendering mode on the mesh.
         * This mode makes the mesh edges visible.
         * Returns the AbstractMesh.
         */
    native public AbstractMesh enableEdgesRendering(double epsilon, Boolean checkVerticesInsteadOfIndices);
    /**
         * Returns true if the mesh is blocked. Used by the class Mesh.
         * Returns the boolean `false` by default.
         */
    public final Boolean isBlocked=null;
    /**
         * Returns the mesh itself by default, used by the class Mesh.
         * Returned type : AbstractMesh
         */
    native public AbstractMesh getLOD(Camera camera);
    /**
         * Returns 0 by default, used by the class Mesh.
         * Returns an integer.
         */
    native public double getTotalVertices();
    /**
         * Returns null by default, used by the class Mesh.
         * Returned type : integer array
         */
    native public Object getIndices();
    /**
         * Returns the array of the requested vertex data kind. Used by the class Mesh. Returns null here.
         * Returned type : float array or Float32Array
         */
    native public jsweet.util.union.Union<Double[],Float32Array> getVerticesData(String kind);
    /**
         * Sets the vertex data of the mesh geometry for the requested `kind`.
         * If the mesh has no geometry, a new Geometry object is set to the mesh and then passed this vertex data.
         * The `data` are either a numeric array either a Float32Array.
         * The parameter `updatable` is passed as is to the underlying Geometry object constructor (if initianilly none) or updater.
         * The parameter `stride` is an optional positive integer, it is usually automatically deducted from the `kind` (3 for positions or normals, 2 for UV, etc).
         * Note that a new underlying VertexBuffer object is created each call.
         * If the `kind` is the `PositionKind`, the mesh BoundingInfo is renewed, so the bounding box and sphere, and the mesh World Matrix is recomputed.
         *
         * Possible `kind` values :
         * - BABYLON.VertexBuffer.PositionKind
         * - BABYLON.VertexBuffer.UVKind
         * - BABYLON.VertexBuffer.UV2Kind
         * - BABYLON.VertexBuffer.UV3Kind
         * - BABYLON.VertexBuffer.UV4Kind
         * - BABYLON.VertexBuffer.UV5Kind
         * - BABYLON.VertexBuffer.UV6Kind
         * - BABYLON.VertexBuffer.ColorKind
         * - BABYLON.VertexBuffer.MatricesIndicesKind
         * - BABYLON.VertexBuffer.MatricesIndicesExtraKind
         * - BABYLON.VertexBuffer.MatricesWeightsKind
         * - BABYLON.VertexBuffer.MatricesWeightsExtraKind
         *
         * Returns the Mesh.
         */
    native public Mesh setVerticesData(String kind, double[] data, Boolean updatable, double stride);
    /**
         * Sets the mesh indices.
         * Expects an array populated with integers or a typed array (Int32Array, Uint32Array, Uint16Array).
         * If the mesh has no geometry, a new Geometry object is created and set to the mesh.
         * This method creates a new index buffer each call.
         * Returns the Mesh.
         */
    native public Mesh setIndices(Object indices, double totalVertices);
    /**
         * Returns the mesh BoundingInfo object or creates a new one and returns it if undefined.
         * Returns a BoundingInfo
         */
    native public BoundingInfo getBoundingInfo();
    /**
         * Sets a mesh new object BoundingInfo.
         * Returns the AbstractMesh.
         */
    native public AbstractMesh setBoundingInfo(BoundingInfo boundingInfo);
    public final Boolean useBones=null;
    native public InstancedMesh _preActivate();
    native public Mesh _preActivateForIntermediateRendering(double renderId);
    native public InstancedMesh _activate(double renderId);
    /**
         * Returns the last update of the World matrix
         * Returns a Matrix.
         */
    native public Matrix getWorldMatrix();
    /**
         * Returns directly the last state of the mesh World matrix.
         * A Matrix is returned.
         */
    public final Matrix worldMatrixFromCache=null;
    /**
         * Returns the current mesh absolute position.
         * Retuns a Vector3.
         */
    public final Vector3 absolutePosition=null;
    /**
         * Prevents the World matrix to be computed any longer.
         * Returns the AbstractMesh.
         */
    native public AbstractMesh freezeWorldMatrix();
    /**
         * Allows back the World matrix computation.
         * Returns the AbstractMesh.
         */
    native public AbstractMesh unfreezeWorldMatrix();
    /**
         * True if the World matrix has been frozen.
         * Returns a boolean.
         */
    public final Boolean isWorldMatrixFrozen=null;
    /**
         * Rotates the mesh around the axis vector for the passed angle (amount) expressed in radians, in the given space.
         * space (default LOCAL) can be either BABYLON.Space.LOCAL, either BABYLON.Space.WORLD.
         * Note that the property `rotationQuaternion` is then automatically updated and the property `rotation` is set to (0,0,0) and no longer used.
         * The passed axis is also normalized.
         * Returns the AbstractMesh.
         */
    native public AbstractMesh rotate(Vector3 axis, double amount, Space space);
    /**
         * Rotates the mesh around the axis vector for the passed angle (amount) expressed in radians, in world space.
         * Note that the property `rotationQuaternion` is then automatically updated and the property `rotation` is set to (0,0,0) and no longer used.
         * The passed axis is also normalized.
         * Returns the AbstractMesh.
         * Method is based on http://www.euclideanspace.com/maths/geometry/affine/aroundPoint/index.htm
         */
    native public AbstractMesh rotateAround(Vector3 point, Vector3 axis, double amount);
    /**
         * Translates the mesh along the axis vector for the passed distance in the given space.
         * space (default LOCAL) can be either BABYLON.Space.LOCAL, either BABYLON.Space.WORLD.
         * Returns the AbstractMesh.
         */
    native public AbstractMesh translate(Vector3 axis, double distance, Space space);
    /**
         * Adds a rotation step to the mesh current rotation.
         * x, y, z are Euler angles expressed in radians.
         * This methods updates the current mesh rotation, either mesh.rotation, either mesh.rotationQuaternion if it's set.
         * This means this rotation is made in the mesh local space only.
         * It's useful to set a custom rotation order different from the BJS standard one YXZ.
         * Example : this rotates the mesh first around its local X axis, then around its local Z axis, finally around its local Y axis.
         * ```javascript
         * mesh.addRotation(x1, 0, 0).addRotation(0, 0, z2).addRotation(0, 0, y3);
         * ```
         * Note that `addRotation()` accumulates the passed rotation values to the current ones and computes the .rotation or .rotationQuaternion updated values.
         * Under the hood, only quaternions are used. So it's a little faster is you use .rotationQuaternion because it doesn't need to translate them back to Euler angles.
         * Returns the AbstractMesh.
         */
    native public AbstractMesh addRotation(double x, double y, double z);
    /**
         * Retuns the mesh absolute position in the World.
         * Returns a Vector3.
         */
    native public Vector3 getAbsolutePosition();
    /**
         * Sets the mesh absolute position in the World from a Vector3 or an Array(3).
         * Returns the AbstractMesh.
         */
    native public AbstractMesh setAbsolutePosition(Vector3 absolutePosition);
    /**
         * Perform relative position change from the point of view of behind the front of the mesh.
         * This is performed taking into account the meshes current rotation, so you do not have to care.
         * Supports definition of mesh facing forward or backward.
         * @param {number} amountRight
         * @param {number} amountUp
         * @param {number} amountForward
         *
         * Returns the AbstractMesh.
         */
    native public AbstractMesh movePOV(double amountRight, double amountUp, double amountForward);
    /**
         * Calculate relative position change from the point of view of behind the front of the mesh.
         * This is performed taking into account the meshes current rotation, so you do not have to care.
         * Supports definition of mesh facing forward or backward.
         * @param {number} amountRight
         * @param {number} amountUp
         * @param {number} amountForward
         *
         * Returns a new Vector3.
         */
    native public Vector3 calcMovePOV(double amountRight, double amountUp, double amountForward);
    /**
         * Perform relative rotation change from the point of view of behind the front of the mesh.
         * Supports definition of mesh facing forward or backward.
         * @param {number} flipBack
         * @param {number} twirlClockwise
         * @param {number} tiltRight
         *
         * Returns the AbstractMesh.
         */
    native public AbstractMesh rotatePOV(double flipBack, double twirlClockwise, double tiltRight);
    /**
         * Calculate relative rotation change from the point of view of behind the front of the mesh.
         * Supports definition of mesh facing forward or backward.
         * @param {number} flipBack
         * @param {number} twirlClockwise
         * @param {number} tiltRight
         *
         * Returns a new Vector3.
         */
    native public Vector3 calcRotatePOV(double flipBack, double twirlClockwise, double tiltRight);
    /**
         * Sets a new pivot matrix to the mesh.
         * Returns the AbstractMesh.
         */
    native public AbstractMesh setPivotMatrix(Matrix matrix);
    /**
         * Returns the mesh pivot matrix.
         * Default : Identity.
         * A Matrix is returned.
         */
    native public Matrix getPivotMatrix();
    native public Boolean _isSynchronized();
    native public void _initCache();
    native public AbstractMesh markAsDirty(String property);
    /**
         * Updates the mesh BoundingInfo object and all its children BoundingInfo objects also.
         * Returns the AbstractMesh.
         */
    native public AbstractMesh _updateBoundingInfo();
    /**
         * Update a mesh's children BoundingInfo objects only.
         * Returns the AbstractMesh.
         */
    native public AbstractMesh _updateSubMeshesBoundingInfo(Matrix matrix);
    /**
         * Computes the mesh World matrix and returns it.
         * If the mesh world matrix is frozen, this computation does nothing more than returning the last frozen values.
         * If the parameter `force` is let to `false` (default), the current cached World matrix is returned.
         * If the parameter `force`is set to `true`, the actual computation is done.
         * Returns the mesh World Matrix.
         */
    native public Matrix computeWorldMatrix(Boolean force);
    /**
        * If you'd like to be called back after the mesh position, rotation or scaling has been updated.
        * @param func: callback function to add
        *
        * Returns the AbstractMesh.
        */
    native public AbstractMesh registerAfterWorldMatrixUpdate(java.util.function.Consumer<AbstractMesh> func);
    /**
         * Removes a registered callback function.
         * Returns the AbstractMesh.
         */
    native public AbstractMesh unregisterAfterWorldMatrixUpdate(java.util.function.Consumer<AbstractMesh> func);
    /**
         * Sets the mesh position in its local space.
         * Returns the AbstractMesh.
         */
    native public AbstractMesh setPositionWithLocalVector(Vector3 vector3);
    /**
         * Returns the mesh position in the local space from the current World matrix values.
         * Returns a new Vector3.
         */
    native public Vector3 getPositionExpressedInLocalSpace();
    /**
         * Translates the mesh along the passed Vector3 in its local space.
         * Returns the AbstractMesh.
         */
    native public AbstractMesh locallyTranslate(Vector3 vector3);
    native public AbstractMesh lookAt(Vector3 targetPoint, double yawCor, double pitchCor, double rollCor, Space space);
    native public AbstractMesh attachToBone(Bone bone, AbstractMesh affectedMesh);
    native public AbstractMesh detachFromBone();
    /**
         * True if the mesh intersects another mesh or a SolidParticle object.
         * Unless the parameter `precise` is set to `true` the intersection is computed according to Axis Aligned Bounding Boxes (AABB), else according to OBB (Oriented BBoxes)
         * Returns a boolean.
         */
    native public Boolean intersectsMesh(AbstractMesh mesh, Boolean precise);
    /**
         * Returns true if the passed point (Vector3) is inside the mesh bounding box.
         * Returns a boolean.
         */
    native public Boolean intersectsPoint(Vector3 point);
    native public PhysicsImpostor getPhysicsImpostor();
    native public Vector3 getPositionInCameraSpace(Camera camera);
    /**
         * Returns the distance from the mesh to the active camera.
         * Returns a float.
         */
    native public double getDistanceToCamera(Camera camera);
    native public AbstractMesh applyImpulse(Vector3 force, Vector3 contactPoint);
    native public AbstractMesh setPhysicsLinkWith(Mesh otherMesh, Vector3 pivot1, Vector3 pivot2, Object options);
    /**
         * Property checkCollisions : Boolean, whether the camera should check the collisions against the mesh.
         * Default `false`.
         */
    public Boolean checkCollisions;
    native public AbstractMesh moveWithCollisions(Vector3 velocity);
    /**
        * This function will create an octree to help to select the right submeshes for rendering, picking and collision computations.
        * Please note that you must have a decent number of submeshes to get performance improvements when using an octree.
        * Returns an Octree of submeshes.
        */
    native public Octree<SubMesh> createOrUpdateSubmeshesOctree(double maxCapacity, double maxDepth);
    native public AbstractMesh _collideForSubMesh(SubMesh subMesh, Matrix transformMatrix, Collider collider);
    native public AbstractMesh _processCollisionsForSubMeshes(Collider collider, Matrix transformMatrix);
    native public AbstractMesh _checkCollision(Collider collider);
    native public Boolean _generatePointsArray();
    /**
         * Checks if the passed Ray intersects with the mesh.
         * Returns an object PickingInfo.
         */
    native public PickingInfo intersects(Ray ray, Boolean fastCheck);
    /**
         * Clones the mesh, used by the class Mesh.
         * Just returns `null` for an AbstractMesh.
         */
    native public AbstractMesh clone(String name, Node newParent, Boolean doNotCloneChildren);
    /**
         * Disposes all the mesh submeshes.
         * Returns the AbstractMesh.
         */
    native public AbstractMesh releaseSubMeshes();
    /**
         * Disposes the AbstractMesh.
         * Some internal references are kept for further use.
         * By default, all the mesh children are also disposed unless the parameter `doNotRecurse` is set to `true`.
         * Returns nothing.
         */
    native public void dispose(Boolean doNotRecurse);
    /**
         * Returns a new Vector3 what is the localAxis, expressed in the mesh local space, rotated like the mesh.
         * This Vector3 is expressed in the World space.
         */
    native public Vector3 getDirection(Vector3 localAxis);
    /**
         * Sets the Vector3 "result" as the rotated Vector3 "localAxis" in the same rotation than the mesh.
         * localAxis is expressed in the mesh local space.
         * result is computed in the Wordl space from the mesh World matrix.
         * Returns the AbstractMesh.
         */
    native public AbstractMesh getDirectionToRef(Vector3 localAxis, Vector3 result);
    native public AbstractMesh setPivotPoint(Vector3 point, Space space);
    /**
         * Returns a new Vector3 set with the mesh pivot point coordinates in the local space.
         */
    native public Vector3 getPivotPoint();
    /**
         * Sets the passed Vector3 "result" with the coordinates of the mesh pivot point in the local space.
         * Returns the AbstractMesh.
         */
    native public AbstractMesh getPivotPointToRef(Vector3 result);
    /**
         * Returns a new Vector3 set with the mesh pivot point World coordinates.
         */
    native public Vector3 getAbsolutePivotPoint();
    /**
         * Defines the passed mesh as the parent of the current mesh.
         * Returns the AbstractMesh.
         */
    native public AbstractMesh setParent(AbstractMesh mesh);
    /**
         * Adds the passed mesh as a child to the current mesh.
         * Returns the AbstractMesh.
         */
    native public AbstractMesh addChild(AbstractMesh mesh);
    /**
         * Removes the passed mesh from the current mesh children list.
         * Returns the AbstractMesh.
         */
    native public AbstractMesh removeChild(AbstractMesh mesh);
    /**
         * Sets the Vector3 "result" coordinates with the mesh pivot point World coordinates.
         * Returns the AbstractMesh.
         */
    native public AbstractMesh getAbsolutePivotPointToRef(Vector3 result);
    /**
         * Updates the mesh facetData arrays and the internal partitioning when the mesh is morphed or updated.
         * This method can be called within the render loop.
         * You don't need to call this method by yourself in the render loop when you update/morph a mesh with the methods CreateXXX() as they automatically manage this computation.
         * Returns the AbstractMesh.
         */
    native public AbstractMesh updateFacetData();
    /**
         * Returns the facetLocalNormals array.
         * The normals are expressed in the mesh local space.
         */
    native public Vector3[] getFacetLocalNormals();
    /**
         * Returns the facetLocalPositions array.
         * The facet positions are expressed in the mesh local space.
         */
    native public Vector3[] getFacetLocalPositions();
    /**
         * Returns the facetLocalPartioning array.
         */
    native public double[][] getFacetLocalPartitioning();
    /**
         * Returns the i-th facet position in the world system.
         * This method allocates a new Vector3 per call.
         */
    native public Vector3 getFacetPosition(double i);
    /**
         * Sets the reference Vector3 with the i-th facet position in the world system.
         * Returns the AbstractMesh.
         */
    native public AbstractMesh getFacetPositionToRef(double i, Vector3 ref);
    /**
         * Returns the i-th facet normal in the world system.
         * This method allocates a new Vector3 per call.
         */
    native public Vector3 getFacetNormal(double i);
    /**
         * Sets the reference Vector3 with the i-th facet normal in the world system.
         * Returns the AbstractMesh.
         */
    native public AbstractMesh getFacetNormalToRef(double i, Vector3 ref);
    /**
         * Returns the facets (in an array) in the same partitioning block than the one the passed coordinates are located (expressed in the mesh local system).
         */
    native public double[] getFacetsAtLocalCoordinates(double x, double y, double z);
    /**
         * Returns the closest mesh facet index at (x,y,z) World coordinates, null if not found.
         * If the parameter projected (vector3) is passed, it is set as the (x,y,z) World projection on the facet.
         * If checkFace is true (default false), only the facet "facing" to (x,y,z) or only the ones "turning their backs", according to the parameter "facing" are returned.
         * If facing and checkFace are true, only the facet "facing" to (x, y, z) are returned : positive dot (x, y, z) * facet position.
         * If facing si false and checkFace is true, only the facet "turning their backs" to (x, y, z) are returned : negative dot (x, y, z) * facet position.
         */
    native public double getClosestFacetAtCoordinates(double x, double y, double z, Vector3 projected, Boolean checkFace, Boolean facing);
    /**
         * Returns the closest mesh facet index at (x,y,z) local coordinates, null if not found.
         * If the parameter projected (vector3) is passed, it is set as the (x,y,z) local projection on the facet.
         * If checkFace is true (default false), only the facet "facing" to (x,y,z) or only the ones "turning their backs", according to the parameter "facing" are returned.
         * If facing and checkFace are true, only the facet "facing" to (x, y, z) are returned : positive dot (x, y, z) * facet position.
         * If facing si false and checkFace is true, only the facet "turning their backs"  to (x, y, z) are returned : negative dot (x, y, z) * facet position.
         */
    native public double getClosestFacetAtLocalCoordinates(double x, double y, double z, Vector3 projected, Boolean checkFace, Boolean facing);
    /**
         * Returns the object "parameter" set with all the expected parameters for facetData computation by ComputeNormals()
         */
    native public Object getFacetDataParameters();
    /**
         * Disables the feature FacetData and frees the related memory.
         * Returns the AbstractMesh.
         */
    native public AbstractMesh disableFacetData();
    /**
         * Creates new normals data for the mesh.
         * @param updatable.
         */
    native public void createNormals(Boolean updatable);
    native public void dispose();
    native public Boolean isInFrustum(Plane[] frustumPlanes);
    native public Boolean isCompletelyInFrustum(Plane[] frustumPlanes);
    native public Boolean isVerticesDataPresent(String kind);
    native public jsweet.util.union.Union<Double[],Float32Array> getVerticesData(String kind, Boolean copyWhenShared, Boolean forceCopy);
    native public Object getIndices(Boolean copyWhenShared);
    native public void setVerticesData(String kind, double[] data, Boolean updatable);
    native public void updateVerticesData(String kind, double[] data, Boolean updateExtends, Boolean makeItUnique);
    native public Mesh setIndices(Object indices);
    /**
         * @param {boolean} fullDetails - support for multiple levels of logging within scene loading
         */
    native public String toString();
    /**
         * Enables the edge rendering mode on the mesh.
         * This mode makes the mesh edges visible.
         * Returns the AbstractMesh.
         */
    native public AbstractMesh enableEdgesRendering(double epsilon);
    /**
         * Enables the edge rendering mode on the mesh.
         * This mode makes the mesh edges visible.
         * Returns the AbstractMesh.
         */
    native public AbstractMesh enableEdgesRendering();
    /**
         * Sets the vertex data of the mesh geometry for the requested `kind`.
         * If the mesh has no geometry, a new Geometry object is set to the mesh and then passed this vertex data.
         * The `data` are either a numeric array either a Float32Array.
         * The parameter `updatable` is passed as is to the underlying Geometry object constructor (if initianilly none) or updater.
         * The parameter `stride` is an optional positive integer, it is usually automatically deducted from the `kind` (3 for positions or normals, 2 for UV, etc).
         * Note that a new underlying VertexBuffer object is created each call.
         * If the `kind` is the `PositionKind`, the mesh BoundingInfo is renewed, so the bounding box and sphere, and the mesh World Matrix is recomputed.
         *
         * Possible `kind` values :
         * - BABYLON.VertexBuffer.PositionKind
         * - BABYLON.VertexBuffer.UVKind
         * - BABYLON.VertexBuffer.UV2Kind
         * - BABYLON.VertexBuffer.UV3Kind
         * - BABYLON.VertexBuffer.UV4Kind
         * - BABYLON.VertexBuffer.UV5Kind
         * - BABYLON.VertexBuffer.UV6Kind
         * - BABYLON.VertexBuffer.ColorKind
         * - BABYLON.VertexBuffer.MatricesIndicesKind
         * - BABYLON.VertexBuffer.MatricesIndicesExtraKind
         * - BABYLON.VertexBuffer.MatricesWeightsKind
         * - BABYLON.VertexBuffer.MatricesWeightsExtraKind
         *
         * Returns the Mesh.
         */
    native public Mesh setVerticesData(String kind, double[] data);
    /**
         * Updates the existing vertex data of the mesh geometry for the requested `kind`.
         * If the mesh has no geometry, it is simply returned as it is.
         * The `data` are either a numeric array either a Float32Array.
         * No new underlying VertexBuffer object is created.
         * If the `kind` is the `PositionKind` and if `updateExtends` is true, the mesh BoundingInfo is renewed, so the bounding box and sphere, and the mesh World Matrix is recomputed.
         * If the parameter `makeItUnique` is true, a new global geometry is created from this positions and is set to the mesh.
         *
         * Possible `kind` values :
         * - BABYLON.VertexBuffer.PositionKind
         * - BABYLON.VertexBuffer.UVKind
         * - BABYLON.VertexBuffer.UV2Kind
         * - BABYLON.VertexBuffer.UV3Kind
         * - BABYLON.VertexBuffer.UV4Kind
         * - BABYLON.VertexBuffer.UV5Kind
         * - BABYLON.VertexBuffer.UV6Kind
         * - BABYLON.VertexBuffer.ColorKind
         * - BABYLON.VertexBuffer.MatricesIndicesKind
         * - BABYLON.VertexBuffer.MatricesIndicesExtraKind
         * - BABYLON.VertexBuffer.MatricesWeightsKind
         * - BABYLON.VertexBuffer.MatricesWeightsExtraKind
         *
         * Returns the Mesh.
         */
    native public Mesh updateVerticesData(String kind, double[] data, Boolean updateExtends);
    /**
         * Updates the existing vertex data of the mesh geometry for the requested `kind`.
         * If the mesh has no geometry, it is simply returned as it is.
         * The `data` are either a numeric array either a Float32Array.
         * No new underlying VertexBuffer object is created.
         * If the `kind` is the `PositionKind` and if `updateExtends` is true, the mesh BoundingInfo is renewed, so the bounding box and sphere, and the mesh World Matrix is recomputed.
         * If the parameter `makeItUnique` is true, a new global geometry is created from this positions and is set to the mesh.
         *
         * Possible `kind` values :
         * - BABYLON.VertexBuffer.PositionKind
         * - BABYLON.VertexBuffer.UVKind
         * - BABYLON.VertexBuffer.UV2Kind
         * - BABYLON.VertexBuffer.UV3Kind
         * - BABYLON.VertexBuffer.UV4Kind
         * - BABYLON.VertexBuffer.UV5Kind
         * - BABYLON.VertexBuffer.UV6Kind
         * - BABYLON.VertexBuffer.ColorKind
         * - BABYLON.VertexBuffer.MatricesIndicesKind
         * - BABYLON.VertexBuffer.MatricesIndicesExtraKind
         * - BABYLON.VertexBuffer.MatricesWeightsKind
         * - BABYLON.VertexBuffer.MatricesWeightsExtraKind
         *
         * Returns the Mesh.
         */
    native public Mesh updateVerticesData(String kind, double[] data);
    /**
         * Rotates the mesh around the axis vector for the passed angle (amount) expressed in radians, in the given space.
         * space (default LOCAL) can be either BABYLON.Space.LOCAL, either BABYLON.Space.WORLD.
         * Note that the property `rotationQuaternion` is then automatically updated and the property `rotation` is set to (0,0,0) and no longer used.
         * The passed axis is also normalized.
         * Returns the AbstractMesh.
         */
    native public AbstractMesh rotate(Vector3 axis, double amount);
    /**
         * Translates the mesh along the axis vector for the passed distance in the given space.
         * space (default LOCAL) can be either BABYLON.Space.LOCAL, either BABYLON.Space.WORLD.
         * Returns the AbstractMesh.
         */
    native public AbstractMesh translate(Vector3 axis, double distance);
    /**
         * Computes the mesh World matrix and returns it.
         * If the mesh world matrix is frozen, this computation does nothing more than returning the last frozen values.
         * If the parameter `force` is let to `false` (default), the current cached World matrix is returned.
         * If the parameter `force`is set to `true`, the actual computation is done.
         * Returns the mesh World Matrix.
         */
    native public Matrix computeWorldMatrix();
    native public AbstractMesh lookAt(Vector3 targetPoint, double yawCor, double pitchCor, double rollCor);
    native public AbstractMesh lookAt(Vector3 targetPoint, double yawCor, double pitchCor);
    native public AbstractMesh lookAt(Vector3 targetPoint, double yawCor);
    native public AbstractMesh lookAt(Vector3 targetPoint);
    /**
         * True if the mesh intersects another mesh or a SolidParticle object.
         * Unless the parameter `precise` is set to `true` the intersection is computed according to Axis Aligned Bounding Boxes (AABB), else according to OBB (Oriented BBoxes)
         * Returns a boolean.
         */
    native public Boolean intersectsMesh(AbstractMesh mesh);
    native public Vector3 getPositionInCameraSpace();
    /**
         * Returns the distance from the mesh to the active camera.
         * Returns a float.
         */
    native public double getDistanceToCamera();
    native public AbstractMesh setPhysicsLinkWith(Mesh otherMesh, Vector3 pivot1, Vector3 pivot2);
    /**
        * This function will create an octree to help to select the right submeshes for rendering, picking and collision computations.
        * Please note that you must have a decent number of submeshes to get performance improvements when using an octree.
        * Returns an Octree of submeshes.
        */
    native public Octree<SubMesh> createOrUpdateSubmeshesOctree(double maxCapacity);
    /**
        * This function will create an octree to help to select the right submeshes for rendering, picking and collision computations.
        * Please note that you must have a decent number of submeshes to get performance improvements when using an octree.
        * Returns an Octree of submeshes.
        */
    native public Octree<SubMesh> createOrUpdateSubmeshesOctree();
    /**
         * Checks if the passed Ray intersects with the mesh.
         * Returns an object PickingInfo.
         */
    native public PickingInfo intersects(Ray ray);
    /**
         * Clones the mesh, used by the class Mesh.
         * Just returns `null` for an AbstractMesh.
         */
    native public AbstractMesh clone(String name, Node newParent);
    native public AbstractMesh setPivotPoint(Vector3 point);
    /**
         * Returns the closest mesh facet index at (x,y,z) World coordinates, null if not found.
         * If the parameter projected (vector3) is passed, it is set as the (x,y,z) World projection on the facet.
         * If checkFace is true (default false), only the facet "facing" to (x,y,z) or only the ones "turning their backs", according to the parameter "facing" are returned.
         * If facing and checkFace are true, only the facet "facing" to (x, y, z) are returned : positive dot (x, y, z) * facet position.
         * If facing si false and checkFace is true, only the facet "turning their backs" to (x, y, z) are returned : negative dot (x, y, z) * facet position.
         */
    native public double getClosestFacetAtCoordinates(double x, double y, double z, Vector3 projected, Boolean checkFace);
    /**
         * Returns the closest mesh facet index at (x,y,z) World coordinates, null if not found.
         * If the parameter projected (vector3) is passed, it is set as the (x,y,z) World projection on the facet.
         * If checkFace is true (default false), only the facet "facing" to (x,y,z) or only the ones "turning their backs", according to the parameter "facing" are returned.
         * If facing and checkFace are true, only the facet "facing" to (x, y, z) are returned : positive dot (x, y, z) * facet position.
         * If facing si false and checkFace is true, only the facet "turning their backs" to (x, y, z) are returned : negative dot (x, y, z) * facet position.
         */
    native public double getClosestFacetAtCoordinates(double x, double y, double z, Vector3 projected);
    /**
         * Returns the closest mesh facet index at (x,y,z) World coordinates, null if not found.
         * If the parameter projected (vector3) is passed, it is set as the (x,y,z) World projection on the facet.
         * If checkFace is true (default false), only the facet "facing" to (x,y,z) or only the ones "turning their backs", according to the parameter "facing" are returned.
         * If facing and checkFace are true, only the facet "facing" to (x, y, z) are returned : positive dot (x, y, z) * facet position.
         * If facing si false and checkFace is true, only the facet "turning their backs" to (x, y, z) are returned : negative dot (x, y, z) * facet position.
         */
    native public double getClosestFacetAtCoordinates(double x, double y, double z);
    /**
         * Returns the closest mesh facet index at (x,y,z) local coordinates, null if not found.
         * If the parameter projected (vector3) is passed, it is set as the (x,y,z) local projection on the facet.
         * If checkFace is true (default false), only the facet "facing" to (x,y,z) or only the ones "turning their backs", according to the parameter "facing" are returned.
         * If facing and checkFace are true, only the facet "facing" to (x, y, z) are returned : positive dot (x, y, z) * facet position.
         * If facing si false and checkFace is true, only the facet "turning their backs"  to (x, y, z) are returned : negative dot (x, y, z) * facet position.
         */
    native public double getClosestFacetAtLocalCoordinates(double x, double y, double z, Vector3 projected, Boolean checkFace);
    /**
         * Returns the closest mesh facet index at (x,y,z) local coordinates, null if not found.
         * If the parameter projected (vector3) is passed, it is set as the (x,y,z) local projection on the facet.
         * If checkFace is true (default false), only the facet "facing" to (x,y,z) or only the ones "turning their backs", according to the parameter "facing" are returned.
         * If facing and checkFace are true, only the facet "facing" to (x, y, z) are returned : positive dot (x, y, z) * facet position.
         * If facing si false and checkFace is true, only the facet "turning their backs"  to (x, y, z) are returned : negative dot (x, y, z) * facet position.
         */
    native public double getClosestFacetAtLocalCoordinates(double x, double y, double z, Vector3 projected);
    /**
         * Returns the closest mesh facet index at (x,y,z) local coordinates, null if not found.
         * If the parameter projected (vector3) is passed, it is set as the (x,y,z) local projection on the facet.
         * If checkFace is true (default false), only the facet "facing" to (x,y,z) or only the ones "turning their backs", according to the parameter "facing" are returned.
         * If facing and checkFace are true, only the facet "facing" to (x, y, z) are returned : positive dot (x, y, z) * facet position.
         * If facing si false and checkFace is true, only the facet "turning their backs"  to (x, y, z) are returned : negative dot (x, y, z) * facet position.
         */
    native public double getClosestFacetAtLocalCoordinates(double x, double y, double z);
    native public jsweet.util.union.Union<Double[],Float32Array> getVerticesData(String kind, Boolean copyWhenShared);
    /**
         * Sets the vertex data of the mesh geometry for the requested `kind`.
         * If the mesh has no geometry, a new Geometry object is set to the mesh and then passed this vertex data.
         * The `data` are either a numeric array either a Float32Array.
         * The parameter `updatable` is passed as is to the underlying Geometry object constructor (if initianilly none) or updater.
         * The parameter `stride` is an optional positive integer, it is usually automatically deducted from the `kind` (3 for positions or normals, 2 for UV, etc).
         * Note that a new underlying VertexBuffer object is created each call.
         * If the `kind` is the `PositionKind`, the mesh BoundingInfo is renewed, so the bounding box and sphere, and the mesh World Matrix is recomputed.
         *
         * Possible `kind` values :
         * - BABYLON.VertexBuffer.PositionKind
         * - BABYLON.VertexBuffer.UVKind
         * - BABYLON.VertexBuffer.UV2Kind
         * - BABYLON.VertexBuffer.UV3Kind
         * - BABYLON.VertexBuffer.UV4Kind
         * - BABYLON.VertexBuffer.UV5Kind
         * - BABYLON.VertexBuffer.UV6Kind
         * - BABYLON.VertexBuffer.ColorKind
         * - BABYLON.VertexBuffer.MatricesIndicesKind
         * - BABYLON.VertexBuffer.MatricesIndicesExtraKind
         * - BABYLON.VertexBuffer.MatricesWeightsKind
         * - BABYLON.VertexBuffer.MatricesWeightsExtraKind
         *
         * Returns the Mesh.
         */
    native public Mesh setVerticesData(String kind, Float32Array data, Boolean updatable, double stride);
    /**
         * True if the mesh intersects another mesh or a SolidParticle object.
         * Unless the parameter `precise` is set to `true` the intersection is computed according to Axis Aligned Bounding Boxes (AABB), else according to OBB (Oriented BBoxes)
         * Returns a boolean.
         */
    native public Boolean intersectsMesh(SolidParticle mesh, Boolean precise);
    native public void setVerticesData(String kind, Float32Array data, Boolean updatable);
    native public void updateVerticesData(String kind, Float32Array data, Boolean updateExtends, Boolean makeItUnique);
    /**
         * Sets the vertex data of the mesh geometry for the requested `kind`.
         * If the mesh has no geometry, a new Geometry object is set to the mesh and then passed this vertex data.
         * The `data` are either a numeric array either a Float32Array.
         * The parameter `updatable` is passed as is to the underlying Geometry object constructor (if initianilly none) or updater.
         * The parameter `stride` is an optional positive integer, it is usually automatically deducted from the `kind` (3 for positions or normals, 2 for UV, etc).
         * Note that a new underlying VertexBuffer object is created each call.
         * If the `kind` is the `PositionKind`, the mesh BoundingInfo is renewed, so the bounding box and sphere, and the mesh World Matrix is recomputed.
         *
         * Possible `kind` values :
         * - BABYLON.VertexBuffer.PositionKind
         * - BABYLON.VertexBuffer.UVKind
         * - BABYLON.VertexBuffer.UV2Kind
         * - BABYLON.VertexBuffer.UV3Kind
         * - BABYLON.VertexBuffer.UV4Kind
         * - BABYLON.VertexBuffer.UV5Kind
         * - BABYLON.VertexBuffer.UV6Kind
         * - BABYLON.VertexBuffer.ColorKind
         * - BABYLON.VertexBuffer.MatricesIndicesKind
         * - BABYLON.VertexBuffer.MatricesIndicesExtraKind
         * - BABYLON.VertexBuffer.MatricesWeightsKind
         * - BABYLON.VertexBuffer.MatricesWeightsExtraKind
         *
         * Returns the Mesh.
         */
    native public Mesh setVerticesData(String kind, Float32Array data);
    /**
         * Updates the existing vertex data of the mesh geometry for the requested `kind`.
         * If the mesh has no geometry, it is simply returned as it is.
         * The `data` are either a numeric array either a Float32Array.
         * No new underlying VertexBuffer object is created.
         * If the `kind` is the `PositionKind` and if `updateExtends` is true, the mesh BoundingInfo is renewed, so the bounding box and sphere, and the mesh World Matrix is recomputed.
         * If the parameter `makeItUnique` is true, a new global geometry is created from this positions and is set to the mesh.
         *
         * Possible `kind` values :
         * - BABYLON.VertexBuffer.PositionKind
         * - BABYLON.VertexBuffer.UVKind
         * - BABYLON.VertexBuffer.UV2Kind
         * - BABYLON.VertexBuffer.UV3Kind
         * - BABYLON.VertexBuffer.UV4Kind
         * - BABYLON.VertexBuffer.UV5Kind
         * - BABYLON.VertexBuffer.UV6Kind
         * - BABYLON.VertexBuffer.ColorKind
         * - BABYLON.VertexBuffer.MatricesIndicesKind
         * - BABYLON.VertexBuffer.MatricesIndicesExtraKind
         * - BABYLON.VertexBuffer.MatricesWeightsKind
         * - BABYLON.VertexBuffer.MatricesWeightsExtraKind
         *
         * Returns the Mesh.
         */
    native public Mesh updateVerticesData(String kind, Float32Array data, Boolean updateExtends);
    /**
         * Updates the existing vertex data of the mesh geometry for the requested `kind`.
         * If the mesh has no geometry, it is simply returned as it is.
         * The `data` are either a numeric array either a Float32Array.
         * No new underlying VertexBuffer object is created.
         * If the `kind` is the `PositionKind` and if `updateExtends` is true, the mesh BoundingInfo is renewed, so the bounding box and sphere, and the mesh World Matrix is recomputed.
         * If the parameter `makeItUnique` is true, a new global geometry is created from this positions and is set to the mesh.
         *
         * Possible `kind` values :
         * - BABYLON.VertexBuffer.PositionKind
         * - BABYLON.VertexBuffer.UVKind
         * - BABYLON.VertexBuffer.UV2Kind
         * - BABYLON.VertexBuffer.UV3Kind
         * - BABYLON.VertexBuffer.UV4Kind
         * - BABYLON.VertexBuffer.UV5Kind
         * - BABYLON.VertexBuffer.UV6Kind
         * - BABYLON.VertexBuffer.ColorKind
         * - BABYLON.VertexBuffer.MatricesIndicesKind
         * - BABYLON.VertexBuffer.MatricesIndicesExtraKind
         * - BABYLON.VertexBuffer.MatricesWeightsKind
         * - BABYLON.VertexBuffer.MatricesWeightsExtraKind
         *
         * Returns the Mesh.
         */
    native public Mesh updateVerticesData(String kind, Float32Array data);
    /**
         * True if the mesh intersects another mesh or a SolidParticle object.
         * Unless the parameter `precise` is set to `true` the intersection is computed according to Axis Aligned Bounding Boxes (AABB), else according to OBB (Oriented BBoxes)
         * Returns a boolean.
         */
    native public Boolean intersectsMesh(SolidParticle mesh);
    protected AbstractMesh(){}
}

