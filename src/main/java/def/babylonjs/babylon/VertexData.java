package def.babylonjs.babylon;
import def.js.Float32Array;
import def.js.Uint8Array;
public class VertexData extends def.js.Object {
    public jsweet.util.union.Union<Double[],Float32Array> positions;
    public jsweet.util.union.Union<Double[],Float32Array> normals;
    public jsweet.util.union.Union<Double[],Float32Array> tangents;
    public jsweet.util.union.Union<Double[],Float32Array> uvs;
    public jsweet.util.union.Union<Double[],Float32Array> uvs2;
    public jsweet.util.union.Union<Double[],Float32Array> uvs3;
    public jsweet.util.union.Union<Double[],Float32Array> uvs4;
    public jsweet.util.union.Union<Double[],Float32Array> uvs5;
    public jsweet.util.union.Union<Double[],Float32Array> uvs6;
    public jsweet.util.union.Union<Double[],Float32Array> colors;
    public jsweet.util.union.Union<Double[],Float32Array> matricesIndices;
    public jsweet.util.union.Union<Double[],Float32Array> matricesWeights;
    public jsweet.util.union.Union<Double[],Float32Array> matricesIndicesExtra;
    public jsweet.util.union.Union<Double[],Float32Array> matricesWeightsExtra;
    public Object indices;
    native public void set(double[] data, String kind);
    /**
         * Associates the vertexData to the passed Mesh.
         * Sets it as updatable or not (default `false`).
         * Returns the VertexData.
         */
    native public VertexData applyToMesh(Mesh mesh, Boolean updatable);
    /**
         * Associates the vertexData to the passed Geometry.
         * Sets it as updatable or not (default `false`).
         * Returns the VertexData.
         */
    native public VertexData applyToGeometry(Geometry geometry, Boolean updatable);
    /**
         * Updates the associated mesh.
         * Returns the VertexData.
         */
    native public VertexData updateMesh(Mesh mesh, Boolean updateExtends, Boolean makeItUnique);
    /**
         * Updates the associated geometry.
         * Returns the VertexData.
         */
    native public VertexData updateGeometry(Geometry geometry, Boolean updateExtends, Boolean makeItUnique);
    /**
         * Transforms each position and each normal of the vertexData according to the passed Matrix.
         * Returns the VertexData.
         */
    native public VertexData transform(Matrix matrix);
    /**
         * Merges the passed VertexData into the current one.
         * Returns the modified VertexData.
         */
    native public VertexData merge(VertexData other);
    /**
         * Serializes the VertexData.
         * Returns a serialized object.
         */
    native public Object serialize();
    /**
         * Returns the object VertexData associated to the passed mesh.
         */
    native public static VertexData ExtractFromMesh(Mesh mesh, Boolean copyWhenShared, Boolean forceCopy);
    /**
         * Returns the object VertexData associated to the passed geometry.
         */
    native public static VertexData ExtractFromGeometry(Geometry geometry, Boolean copyWhenShared, Boolean forceCopy);
    /**
         * Creates the vertexData of the Ribbon.
         */
    native public static VertexData CreateRibbon(Options options);
    /**
         * Creates the VertexData of the Box.
         */
    native public static VertexData CreateBox(OptionsData options);
    /**
         * Creates the VertexData of the Sphere.
         */
    native public static VertexData CreateSphere(OptionsDto options);
    /**
         * Creates the VertexData of the Cylinder or Cone.
         */
    native public static VertexData CreateCylinder(OptionsStructure options);
    /**
         * Creates the VertexData of the Torus.
         */
    native public static VertexData CreateTorus(OptionsInfo options);
    /**
         * Creates the VertexData of the LineSystem.
         */
    native public static VertexData CreateLineSystem(Options1 options);
    /**
         * Create the VertexData of the DashedLines.
         */
    native public static VertexData CreateDashedLines(Options2 options);
    /**
         * Creates the VertexData of the Ground.
         */
    native public static VertexData CreateGround(Options3 options);
    /**
         * Creates the VertexData of the TiledGround.
         */
    native public static VertexData CreateTiledGround(Options4 options);
    /**
         * Creates the VertexData of the Ground designed from a heightmap.
         */
    native public static VertexData CreateGroundFromHeightMap(Options5 options);
    /**
         * Creates the VertexData of the Plane.
         */
    native public static VertexData CreatePlane(OptionsData options);
    /**
         * Creates the VertexData of the Disc or regular Polygon.
         */
    native public static VertexData CreateDisc(Options6 options);
    /**
         * Re-creates the VertexData of the Polygon for sideOrientation.
         */
    native public static VertexData CreatePolygon(Mesh polygon, double sideOrientation, Object fUV, Object fColors, Vector4 frontUVs, Vector4 backUVs);
    /**
         * Creates the VertexData of the IcoSphere.
         */
    native public static VertexData CreateIcoSphere(Options7 options);
    /**
         * Creates the VertexData of the Polyhedron.
         */
    native public static VertexData CreatePolyhedron(Options8 options);
    /**
         * Creates the VertexData of the Torus Knot.
         */
    native public static VertexData CreateTorusKnot(Options9 options);
    /**
         * @param {any} - positions (number[] or Float32Array)
         * @param {any} - indices   (number[] or Uint16Array)
         * @param {any} - normals   (number[] or Float32Array)
         * options (optional) :
         * facetPositions : optional array of facet positions (vector3)
         * facetNormals : optional array of facet normals (vector3)
         * facetPartitioning : optional partitioning array. facetPositions is required for facetPartitioning computation
         * subDiv : optional partitioning data about subdivsions on  each axis (int), required for facetPartitioning computation
         * ratio : optional partitioning ratio / bounding box, required for facetPartitioning computation
         * bbSize : optional bounding box size data, required for facetPartitioning computation
         * bInfo : optional bounding info, required for facetPartitioning computation
         */
    native public static void ComputeNormals(Object positions, Object indices, Object normals, Options10 options);
    /**
         * Creates a new VertexData from the imported parameters.
         */
    native public static void ImportVertexData(Object parsedVertexData, Geometry geometry);
    /** This is an automatically generated object type (see the source definition). */
    @jsweet.lang.ObjectType
    public static class Options extends def.js.Object {
        public Vector3[][] pathArray;
        @jsweet.lang.Optional
        public Boolean closeArray;
        @jsweet.lang.Optional
        public Boolean closePath;
        @jsweet.lang.Optional
        public double offset;
        @jsweet.lang.Optional
        public double sideOrientation;
        @jsweet.lang.Optional
        public Vector4 frontUVs;
        @jsweet.lang.Optional
        public Vector4 backUVs;
        @jsweet.lang.Optional
        public Boolean invertUV;
        @jsweet.lang.Optional
        public Vector2[] uvs;
        @jsweet.lang.Optional
        public Color4[] colors;
    }
    /** This is an automatically generated object type (see the source definition). */
    @jsweet.lang.ObjectType
    public static class OptionsData extends def.js.Object {
        @jsweet.lang.Optional
        public double size;
        @jsweet.lang.Optional
        public double width;
        @jsweet.lang.Optional
        public double height;
        @jsweet.lang.Optional
        public double depth;
        @jsweet.lang.Optional
        public Vector4[] faceUV;
        @jsweet.lang.Optional
        public Color4[] faceColors;
        @jsweet.lang.Optional
        public double sideOrientation;
        @jsweet.lang.Optional
        public Vector4 frontUVs;
        @jsweet.lang.Optional
        public Vector4 backUVs;
    }
    /** This is an automatically generated object type (see the source definition). */
    @jsweet.lang.ObjectType
    public static class OptionsDto extends def.js.Object {
        @jsweet.lang.Optional
        public double segments;
        @jsweet.lang.Optional
        public double diameter;
        @jsweet.lang.Optional
        public double diameterX;
        @jsweet.lang.Optional
        public double diameterY;
        @jsweet.lang.Optional
        public double diameterZ;
        @jsweet.lang.Optional
        public double arc;
        @jsweet.lang.Optional
        public double slice;
        @jsweet.lang.Optional
        public double sideOrientation;
        @jsweet.lang.Optional
        public Vector4 frontUVs;
        @jsweet.lang.Optional
        public Vector4 backUVs;
    }
    /** This is an automatically generated object type (see the source definition). */
    @jsweet.lang.ObjectType
    public static class OptionsStructure extends def.js.Object {
        @jsweet.lang.Optional
        public double height;
        @jsweet.lang.Optional
        public double diameterTop;
        @jsweet.lang.Optional
        public double diameterBottom;
        @jsweet.lang.Optional
        public double diameter;
        @jsweet.lang.Optional
        public double tessellation;
        @jsweet.lang.Optional
        public double subdivisions;
        @jsweet.lang.Optional
        public double arc;
        @jsweet.lang.Optional
        public Color4[] faceColors;
        @jsweet.lang.Optional
        public Vector4[] faceUV;
        @jsweet.lang.Optional
        public Boolean hasRings;
        @jsweet.lang.Optional
        public Boolean enclose;
        @jsweet.lang.Optional
        public double sideOrientation;
        @jsweet.lang.Optional
        public Vector4 frontUVs;
        @jsweet.lang.Optional
        public Vector4 backUVs;
    }
    /** This is an automatically generated object type (see the source definition). */
    @jsweet.lang.ObjectType
    public static class OptionsInfo extends def.js.Object {
        @jsweet.lang.Optional
        public double diameter;
        @jsweet.lang.Optional
        public double thickness;
        @jsweet.lang.Optional
        public double tessellation;
        @jsweet.lang.Optional
        public double sideOrientation;
        @jsweet.lang.Optional
        public Vector4 frontUVs;
        @jsweet.lang.Optional
        public Vector4 backUVs;
    }
    /** This is an automatically generated object type (see the source definition). */
    @jsweet.lang.ObjectType
    public static class Options1 extends def.js.Object {
        public Vector3[][] lines;
    }
    /** This is an automatically generated object type (see the source definition). */
    @jsweet.lang.ObjectType
    public static class Options2 extends def.js.Object {
        public Vector3[] points;
        @jsweet.lang.Optional
        public double dashSize;
        @jsweet.lang.Optional
        public double gapSize;
        @jsweet.lang.Optional
        public double dashNb;
    }
    /** This is an automatically generated object type (see the source definition). */
    @jsweet.lang.ObjectType
    public static class Options3 extends def.js.Object {
        @jsweet.lang.Optional
        public double width;
        @jsweet.lang.Optional
        public double height;
        @jsweet.lang.Optional
        public double subdivisions;
        @jsweet.lang.Optional
        public double subdivisionsX;
        @jsweet.lang.Optional
        public double subdivisionsY;
    }
    /** This is an automatically generated object type (see the source definition). */
    @jsweet.lang.ObjectType
    public static class Options4 extends def.js.Object {
        public double xmin;
        public double zmin;
        public double xmax;
        public double zmax;
        @jsweet.lang.Optional
        public Subdivisions subdivisions;
        @jsweet.lang.Optional
        public Precision precision;
        /** This is an automatically generated object type (see the source definition). */
        @jsweet.lang.ObjectType
        public static class Subdivisions extends def.js.Object {
            public double w;
            public double h;
        }
        /** This is an automatically generated object type (see the source definition). */
        @jsweet.lang.ObjectType
        public static class Precision extends def.js.Object {
            public double w;
            public double h;
        }
    }
    /** This is an automatically generated object type (see the source definition). */
    @jsweet.lang.ObjectType
    public static class Options5 extends def.js.Object {
        public double width;
        public double height;
        public double subdivisions;
        public double minHeight;
        public double maxHeight;
        public Color3 colorFilter;
        public Uint8Array buffer;
        public double bufferWidth;
        public double bufferHeight;
    }
    /** This is an automatically generated object type (see the source definition). */
    @jsweet.lang.ObjectType
    public static class Options6 extends def.js.Object {
        @jsweet.lang.Optional
        public double radius;
        @jsweet.lang.Optional
        public double tessellation;
        @jsweet.lang.Optional
        public double arc;
        @jsweet.lang.Optional
        public double sideOrientation;
        @jsweet.lang.Optional
        public Vector4 frontUVs;
        @jsweet.lang.Optional
        public Vector4 backUVs;
    }
    /** This is an automatically generated object type (see the source definition). */
    @jsweet.lang.ObjectType
    public static class Options7 extends def.js.Object {
        @jsweet.lang.Optional
        public double radius;
        @jsweet.lang.Optional
        public double radiusX;
        @jsweet.lang.Optional
        public double radiusY;
        @jsweet.lang.Optional
        public double radiusZ;
        @jsweet.lang.Optional
        public Boolean flat;
        @jsweet.lang.Optional
        public double subdivisions;
        @jsweet.lang.Optional
        public double sideOrientation;
        @jsweet.lang.Optional
        public Vector4 frontUVs;
        @jsweet.lang.Optional
        public Vector4 backUVs;
    }
    /** This is an automatically generated object type (see the source definition). */
    @jsweet.lang.ObjectType
    public static class Options8 extends def.js.Object {
        @jsweet.lang.Optional
        public double type;
        @jsweet.lang.Optional
        public double size;
        @jsweet.lang.Optional
        public double sizeX;
        @jsweet.lang.Optional
        public double sizeY;
        @jsweet.lang.Optional
        public double sizeZ;
        @jsweet.lang.Optional
        public Object custom;
        @jsweet.lang.Optional
        public Vector4[] faceUV;
        @jsweet.lang.Optional
        public Color4[] faceColors;
        @jsweet.lang.Optional
        public Boolean flat;
        @jsweet.lang.Optional
        public double sideOrientation;
        @jsweet.lang.Optional
        public Vector4 frontUVs;
        @jsweet.lang.Optional
        public Vector4 backUVs;
    }
    /** This is an automatically generated object type (see the source definition). */
    @jsweet.lang.ObjectType
    public static class Options9 extends def.js.Object {
        @jsweet.lang.Optional
        public double radius;
        @jsweet.lang.Optional
        public double tube;
        @jsweet.lang.Optional
        public double radialSegments;
        @jsweet.lang.Optional
        public double tubularSegments;
        @jsweet.lang.Optional
        public double p;
        @jsweet.lang.Optional
        public double q;
        @jsweet.lang.Optional
        public double sideOrientation;
        @jsweet.lang.Optional
        public Vector4 frontUVs;
        @jsweet.lang.Optional
        public Vector4 backUVs;
    }
    /** This is an automatically generated object type (see the source definition). */
    @jsweet.lang.ObjectType
    public static class Options10 extends def.js.Object {
        @jsweet.lang.Optional
        public Object facetNormals;
        @jsweet.lang.Optional
        public Object facetPositions;
        @jsweet.lang.Optional
        public Object facetPartitioning;
        @jsweet.lang.Optional
        public double ratio;
        @jsweet.lang.Optional
        public Object bInfo;
        @jsweet.lang.Optional
        public Vector3 bbSize;
        @jsweet.lang.Optional
        public Object subDiv;
        @jsweet.lang.Optional
        public Boolean useRightHandedSystem;
    }
    /**
         * Associates the vertexData to the passed Mesh.
         * Sets it as updatable or not (default `false`).
         * Returns the VertexData.
         */
    native public VertexData applyToMesh(Mesh mesh);
    /**
         * Associates the vertexData to the passed Geometry.
         * Sets it as updatable or not (default `false`).
         * Returns the VertexData.
         */
    native public VertexData applyToGeometry(Geometry geometry);
    /**
         * Updates the associated mesh.
         * Returns the VertexData.
         */
    native public VertexData updateMesh(Mesh mesh, Boolean updateExtends);
    /**
         * Updates the associated mesh.
         * Returns the VertexData.
         */
    native public VertexData updateMesh(Mesh mesh);
    /**
         * Updates the associated geometry.
         * Returns the VertexData.
         */
    native public VertexData updateGeometry(Geometry geometry, Boolean updateExtends);
    /**
         * Updates the associated geometry.
         * Returns the VertexData.
         */
    native public VertexData updateGeometry(Geometry geometry);
    /**
         * Returns the object VertexData associated to the passed mesh.
         */
    native public static VertexData ExtractFromMesh(Mesh mesh, Boolean copyWhenShared);
    /**
         * Returns the object VertexData associated to the passed mesh.
         */
    native public static VertexData ExtractFromMesh(Mesh mesh);
    /**
         * Returns the object VertexData associated to the passed geometry.
         */
    native public static VertexData ExtractFromGeometry(Geometry geometry, Boolean copyWhenShared);
    /**
         * Returns the object VertexData associated to the passed geometry.
         */
    native public static VertexData ExtractFromGeometry(Geometry geometry);
    /**
         * Re-creates the VertexData of the Polygon for sideOrientation.
         */
    native public static VertexData CreatePolygon(Mesh polygon, double sideOrientation, Object fUV, Object fColors, Vector4 frontUVs);
    /**
         * Re-creates the VertexData of the Polygon for sideOrientation.
         */
    native public static VertexData CreatePolygon(Mesh polygon, double sideOrientation, Object fUV, Object fColors);
    /**
         * Re-creates the VertexData of the Polygon for sideOrientation.
         */
    native public static VertexData CreatePolygon(Mesh polygon, double sideOrientation, Object fUV);
    /**
         * Re-creates the VertexData of the Polygon for sideOrientation.
         */
    native public static VertexData CreatePolygon(Mesh polygon, double sideOrientation);
    /**
         * @param {any} - positions (number[] or Float32Array)
         * @param {any} - indices   (number[] or Uint16Array)
         * @param {any} - normals   (number[] or Float32Array)
         * options (optional) :
         * facetPositions : optional array of facet positions (vector3)
         * facetNormals : optional array of facet normals (vector3)
         * facetPartitioning : optional partitioning array. facetPositions is required for facetPartitioning computation
         * subDiv : optional partitioning data about subdivsions on  each axis (int), required for facetPartitioning computation
         * ratio : optional partitioning ratio / bounding box, required for facetPartitioning computation
         * bbSize : optional bounding box size data, required for facetPartitioning computation
         * bInfo : optional bounding info, required for facetPartitioning computation
         */
    native public static void ComputeNormals(Object positions, Object indices, Object normals);
    native public void set(Float32Array data, String kind);
}

