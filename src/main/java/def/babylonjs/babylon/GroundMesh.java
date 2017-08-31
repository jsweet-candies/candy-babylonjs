package def.babylonjs.babylon;
public class GroundMesh extends Mesh {
    public Boolean generateOctree;
    public double _subdivisionsX;
    public double _subdivisionsY;
    public double _width;
    public double _height;
    public double _minX;
    public double _maxX;
    public double _minZ;
    public double _maxZ;
    public GroundMesh(String name, Scene scene){}
    native public String getClassName();
    public final double subdivisions=0;
    public final double subdivisionsX=0;
    public final double subdivisionsY=0;
    native public void optimize(double chunksCount, double octreeBlocksSize);
    /**
         * Returns a height (y) value in the Worl system :
         * the ground altitude at the coordinates (x, z) expressed in the World system.
         * Returns the ground y position if (x, z) are outside the ground surface.
         */
    native public double getHeightAtCoordinates(double x, double z);
    /**
         * Returns a normalized vector (Vector3) orthogonal to the ground
         * at the ground coordinates (x, z) expressed in the World system.
         * Returns Vector3(0.0, 1.0, 0.0) if (x, z) are outside the ground surface.
         */
    native public Vector3 getNormalAtCoordinates(double x, double z);
    /**
         * Updates the Vector3 passed a reference with a normalized vector orthogonal to the ground
         * at the ground coordinates (x, z) expressed in the World system.
         * Doesn't uptade the reference Vector3 if (x, z) are outside the ground surface.
         * Returns the GroundMesh.
         */
    native public GroundMesh getNormalAtCoordinatesToRef(double x, double z, Vector3 ref);
    /**
        * Force the heights to be recomputed for getHeightAtCoordinates() or getNormalAtCoordinates()
        * if the ground has been updated.
        * This can be used in the render loop.
        * Returns the GroundMesh.
        */
    native public GroundMesh updateCoordinateHeights();
    native public void serialize(Object serializationObject);
    native public static GroundMesh Parse(Object parsedMesh, Scene scene);
    native public void optimize(double chunksCount);
    protected GroundMesh(){}
}

