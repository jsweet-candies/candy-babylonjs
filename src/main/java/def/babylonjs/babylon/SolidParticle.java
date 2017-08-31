package def.babylonjs.babylon;
public class SolidParticle extends def.js.Object {
    public double idx;
    public Color4 color;
    public Vector3 position;
    public Vector3 rotation;
    public Quaternion rotationQuaternion;
    public Vector3 scaling;
    public Vector4 uvs;
    public Vector3 velocity;
    public Boolean alive;
    public Boolean isVisible;
    public double _pos;
    public ModelShape _model;
    public double shapeId;
    public double idxInShape;
    public BoundingInfo _modelBoundingInfo;
    public BoundingInfo _boundingInfo;
    public SolidParticleSystem _sps;
    /**
         * Creates a Solid Particle object.
         * Don't create particles manually, use instead the Solid Particle System internal tools like _addParticle()
         * `particleIndex` (integer) is the particle index in the Solid Particle System pool. It's also the particle identifier.
         * `positionIndex` (integer) is the starting index of the particle vertices in the SPS "positions" array.
         *  `model` (ModelShape) is a reference to the model shape on what the particle is designed.
         * `shapeId` (integer) is the model shape identifier in the SPS.
         * `idxInShape` (integer) is the index of the particle in the current model (ex: the 10th box of addShape(box, 30))
         * `modelBoundingInfo` is the reference to the model BoundingInfo used for intersection computations.
         */
    public SolidParticle(double particleIndex, double positionIndex, ModelShape model, double shapeId, double idxInShape, SolidParticleSystem sps, BoundingInfo modelBoundingInfo){}
    /**
         * legacy support, changed scale to scaling
         */
    public Vector3 scale;
    /**
         * legacy support, changed quaternion to rotationQuaternion
         */
    public Quaternion quaternion;
    /**
         * Returns a boolean. True if the particle intersects another particle or another mesh, else false.
         * The intersection is computed on the particle bounding sphere and Axis Aligned Bounding Box (AABB)
         * `target` is the object (solid particle or mesh) what the intersection is computed against.
         */
    native public Boolean intersectsMesh(Mesh target);
    /**
         * Creates a Solid Particle object.
         * Don't create particles manually, use instead the Solid Particle System internal tools like _addParticle()
         * `particleIndex` (integer) is the particle index in the Solid Particle System pool. It's also the particle identifier.
         * `positionIndex` (integer) is the starting index of the particle vertices in the SPS "positions" array.
         *  `model` (ModelShape) is a reference to the model shape on what the particle is designed.
         * `shapeId` (integer) is the model shape identifier in the SPS.
         * `idxInShape` (integer) is the index of the particle in the current model (ex: the 10th box of addShape(box, 30))
         * `modelBoundingInfo` is the reference to the model BoundingInfo used for intersection computations.
         */
    public SolidParticle(double particleIndex, double positionIndex, ModelShape model, double shapeId, double idxInShape, SolidParticleSystem sps){}
    /**
         * Returns a boolean. True if the particle intersects another particle or another mesh, else false.
         * The intersection is computed on the particle bounding sphere and Axis Aligned Bounding Box (AABB)
         * `target` is the object (solid particle or mesh) what the intersection is computed against.
         */
    native public Boolean intersectsMesh(SolidParticle target);
    protected SolidParticle(){}
}

