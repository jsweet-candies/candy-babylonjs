package def.babylonjs.babylon;
public class Path3D extends def.js.Object {
    public Vector3[] path;
    /**
        * new Path3D(path, normal, raw)
        * Creates a Path3D. A Path3D is a logical math object, so not a mesh.
        * please read the description in the tutorial :  http://doc.babylonjs.com/tutorials/How_to_use_Path3D
        * path : an array of Vector3, the curve axis of the Path3D
        * normal (optional) : Vector3, the first wanted normal to the curve. Ex (0, 1, 0) for a vertical normal.
        * raw (optional, default false) : boolean, if true the returned Path3D isn't normalized. Useful to depict path acceleration or speed.
        */
    public Path3D(Vector3[] path, Vector3 firstNormal, Boolean raw){}
    /**
         * Returns the Path3D array of successive Vector3 designing its curve.
         */
    native public Vector3[] getCurve();
    /**
         * Returns an array populated with tangent vectors on each Path3D curve point.
         */
    native public Vector3[] getTangents();
    /**
         * Returns an array populated with normal vectors on each Path3D curve point.
         */
    native public Vector3[] getNormals();
    /**
         * Returns an array populated with binormal vectors on each Path3D curve point.
         */
    native public Vector3[] getBinormals();
    /**
         * Returns an array populated with distances (float) of the i-th point from the first curve point.
         */
    native public double[] getDistances();
    /**
         * Forces the Path3D tangent, normal, binormal and distance recomputation.
         * Returns the same object updated.
         */
    native public Path3D update(Vector3[] path, Vector3 firstNormal);
    /**
        * new Path3D(path, normal, raw)
        * Creates a Path3D. A Path3D is a logical math object, so not a mesh.
        * please read the description in the tutorial :  http://doc.babylonjs.com/tutorials/How_to_use_Path3D
        * path : an array of Vector3, the curve axis of the Path3D
        * normal (optional) : Vector3, the first wanted normal to the curve. Ex (0, 1, 0) for a vertical normal.
        * raw (optional, default false) : boolean, if true the returned Path3D isn't normalized. Useful to depict path acceleration or speed.
        */
    public Path3D(Vector3[] path, Vector3 firstNormal){}
    /**
        * new Path3D(path, normal, raw)
        * Creates a Path3D. A Path3D is a logical math object, so not a mesh.
        * please read the description in the tutorial :  http://doc.babylonjs.com/tutorials/How_to_use_Path3D
        * path : an array of Vector3, the curve axis of the Path3D
        * normal (optional) : Vector3, the first wanted normal to the curve. Ex (0, 1, 0) for a vertical normal.
        * raw (optional, default false) : boolean, if true the returned Path3D isn't normalized. Useful to depict path acceleration or speed.
        */
    public Path3D(Vector3[] path){}
    /**
         * Forces the Path3D tangent, normal, binormal and distance recomputation.
         * Returns the same object updated.
         */
    native public Path3D update(Vector3[] path);
    protected Path3D(){}
}

