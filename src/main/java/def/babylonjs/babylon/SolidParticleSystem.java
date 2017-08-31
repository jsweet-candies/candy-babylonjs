package def.babylonjs.babylon;
/**
    * Full documentation here : http://doc.babylonjs.com/overviews/Solid_Particle_System
    */
public class SolidParticleSystem extends IDisposable {
    /**
        *  The SPS array of Solid Particle objects. Just access each particle as with any classic array.
        *  Example : var p = SPS.particles[i];
        */
    public SolidParticle[] particles;
    /**
        * The SPS total number of particles. Read only. Use SPS.counter instead if you need to set your own value.
        */
    public double nbParticles;
    /**
        * If the particles must ever face the camera (default false). Useful for planar particles.
        */
    public Boolean billboard;
    /**
         * Recompute normals when adding a shape
         */
    public Boolean recomputeNormals;
    /**
        * This a counter ofr your own usage. It's not set by any SPS functions.
        */
    public double counter;
    /**
        * The SPS name. This name is also given to the underlying mesh.
        */
    public String name;
    /**
        * The SPS mesh. It's a standard BJS Mesh, so all the methods from the Mesh class are avalaible.
        */
    public Mesh mesh;
    /**
        * This empty object is intended to store some SPS specific or temporary values in order to lower the Garbage Collector activity.
        * Please read : http://doc.babylonjs.com/overviews/Solid_Particle_System#garbage-collector-concerns
        */
    public Object vars;
    /**
        * This array is populated when the SPS is set as 'pickable'.
        * Each key of this array is a `faceId` value that you can get from a pickResult object.
        * Each element of this array is an object `{idx: int, faceId: int}`.
        * `idx` is the picked particle index in the `SPS.particles` array
        * `faceId` is the picked face index counted within this particle.
        * Please read : http://doc.babylonjs.com/overviews/Solid_Particle_System#pickable-particles
        */
    public PickedParticles[] pickedParticles;
    public Boolean _bSphereOnly;
    public double _bSphereRadiusFactor;
    /**
        * Creates a SPS (Solid Particle System) object.
        * `name` (String) is the SPS name, this will be the underlying mesh name.
        * `scene` (Scene) is the scene in which the SPS is added.
        * `updatable` (optional boolean, default true) : if the SPS must be updatable or immutable.
        * `isPickable` (optional boolean, default false) : if the solid particles must be pickable.
        * `particleIntersection` (optional boolean, default false) : if the solid particle intersections must be computed.
        * `boundingSphereOnly` (optional boolean, default false) : if the particle intersection must be computed only with the bounding sphere (no bounding box computation, so faster).
        * `bSphereRadiusFactor` (optional float, default 1.0) : a number to multiply the boundind sphere radius by in order to reduce it for instance.
        *  Example : bSphereRadiusFactor = 1.0 / Math.sqrt(3.0) => the bounding sphere exactly matches a spherical mesh.
        */
    public SolidParticleSystem(String name, Scene scene, Options options){}
    /**
        * Builds the SPS underlying mesh. Returns a standard Mesh.
        * If no model shape was added to the SPS, the returned mesh is just a single triangular plane.
        */
    native public Mesh buildMesh();
    /**
        * Digests the mesh and generates as many solid particles in the system as wanted. Returns the SPS.
        * These particles will have the same geometry than the mesh parts and will be positioned at the same localisation than the mesh original places.
        * Thus the particles generated from `digest()` have their property `position` set yet.
        * `mesh` ( Mesh ) is the mesh to be digested
        * `facetNb` (optional integer, default 1) is the number of mesh facets per particle, this parameter is overriden by the parameter `number` if any
        * `delta` (optional integer, default 0) is the random extra number of facets per particle , each particle will have between `facetNb` and `facetNb + delta` facets
        * `number` (optional positive integer) is the wanted number of particles : each particle is built with `mesh_total_facets / number` facets
        */
    native public SolidParticleSystem digest(Mesh mesh, OptionsData options);
    /**
        * Adds some particles to the SPS from the model shape. Returns the shape id.
        * Please read the doc : http://doc.babylonjs.com/overviews/Solid_Particle_System#create-an-immutable-sps
        * `mesh` is any Mesh object that will be used as a model for the solid particles.
        * `nb` (positive integer) the number of particles to be created from this model
        * `positionFunction` is an optional javascript function to called for each particle on SPS creation.
        * `vertexFunction` is an optional javascript function to called for each vertex of each particle on SPS creation
        */
    native public double addShape(Mesh mesh, double nb, OptionsDto options);
    /**
        * Rebuilds the whole mesh and updates the VBO : custom positions and vertices are recomputed if needed.
        * Returns the SPS.
        */
    native public SolidParticleSystem rebuildMesh();
    /**
        *  Sets all the particles : this method actually really updates the mesh according to the particle positions, rotations, colors, textures, etc.
        *  This method calls `updateParticle()` for each particle of the SPS.
        *  For an animated SPS, it is usually called within the render loop.
        * @param start The particle index in the particle array where to start to compute the particle property values _(default 0)_
        * @param end The particle index in the particle array where to stop to compute the particle property values _(default nbParticle - 1)_
        * @param update If the mesh must be finally updated on this call after all the particle computations _(default true)_
        * Returns the SPS.
        */
    native public SolidParticleSystem setParticles(double start, double end, Boolean update);
    /**
        * Disposes the SPS.
        * Returns nothing.
        */
    native public void dispose();
    /**
        * Visibilty helper : Recomputes the visible size according to the mesh bounding box
        * doc : http://doc.babylonjs.com/overviews/Solid_Particle_System#sps-visibility
        * Returns the SPS.
        */
    native public SolidParticleSystem refreshVisibleSize();
    /**
        * Visibility helper : Sets the size of a visibility box, this sets the underlying mesh bounding box.
        * @param size the size (float) of the visibility box
        * note : this doesn't lock the SPS mesh bounding box.
        * doc : http://doc.babylonjs.com/overviews/Solid_Particle_System#sps-visibility
        */
    native public void setVisibilityBox(double size);
    /**
        * Sets the SPS as always visible or not
        * doc : http://doc.babylonjs.com/overviews/Solid_Particle_System#sps-visibility
        */
    public Boolean isAlwaysVisible;
    /**
        * Sets the SPS visibility box as locked or not. This enables/disables the underlying mesh bounding box updates.
        * doc : http://doc.babylonjs.com/overviews/Solid_Particle_System#sps-visibility
        */
    public Boolean isVisibilityBoxLocked;
    /**
        * Tells to `setParticles()` to compute the particle rotations or not.
        * Default value : true. The SPS is faster when it's set to false.
        * Note : the particle rotations aren't stored values, so setting `computeParticleRotation` to false will prevents the particle to rotate.
        */
    public Boolean computeParticleRotation;
    /**
        * Tells to `setParticles()` to compute the particle colors or not.
        * Default value : true. The SPS is faster when it's set to false.
        * Note : the particle colors are stored values, so setting `computeParticleColor` to false will keep yet the last colors set.
        */
    public Boolean computeParticleColor;
    /**
        * Tells to `setParticles()` to compute the particle textures or not.
        * Default value : true. The SPS is faster when it's set to false.
        * Note : the particle textures are stored values, so setting `computeParticleTexture` to false will keep yet the last colors set.
        */
    public Boolean computeParticleTexture;
    /**
        * Tells to `setParticles()` to call the vertex function for each vertex of each particle, or not.
        * Default value : false. The SPS is faster when it's set to false.
        * Note : the particle custom vertex positions aren't stored values.
        */
    public Boolean computeParticleVertex;
    /**
        * Tells to `setParticles()` to compute or not the mesh bounding box when computing the particle positions.
        */
    public Boolean computeBoundingBox;
    /**
        * This function does nothing. It may be overwritten to set all the particle first values.
        * The SPS doesn't call this function, you may have to call it by your own.
        * doc : http://doc.babylonjs.com/overviews/Solid_Particle_System#particle-management
        */
    native public void initParticles();
    /**
        * This function does nothing. It may be overwritten to recycle a particle.
        * The SPS doesn't call this function, you may have to call it by your own.
        * doc : http://doc.babylonjs.com/overviews/Solid_Particle_System#particle-management
        */
    native public SolidParticle recycleParticle(SolidParticle particle);
    /**
        * Updates a particle : this function should  be overwritten by the user.
        * It is called on each particle by `setParticles()`. This is the place to code each particle behavior.
        * doc : http://doc.babylonjs.com/overviews/Solid_Particle_System#particle-management
        * ex : just set a particle position or velocity and recycle conditions
        */
    native public SolidParticle updateParticle(SolidParticle particle);
    /**
        * Updates a vertex of a particle : it can be overwritten by the user.
        * This will be called on each vertex particle by `setParticles()` if `computeParticleVertex` is set to true only.
        * @param particle the current particle
        * @param vertex the current index of the current particle
        * @param pt the index of the current vertex in the particle shape
        * doc : http://doc.babylonjs.com/overviews/Solid_Particle_System#update-each-particle-shape
        * ex : just set a vertex particle position
        */
    native public Vector3 updateParticleVertex(SolidParticle particle, Vector3 vertex, double pt);
    /**
        * This will be called before any other treatment by `setParticles()` and will be passed three parameters.
        * This does nothing and may be overwritten by the user.
        * @param start the particle index in the particle array where to stop to iterate, same than the value passed to setParticle()
        * @param stop the particle index in the particle array where to stop to iterate, same than the value passed to setParticle()
        * @param update the boolean update value actually passed to setParticles()
        */
    native public void beforeUpdateParticles(double start, double stop, Boolean update);
    /**
        * This will be called  by `setParticles()` after all the other treatments and just before the actual mesh update.
        * This will be passed three parameters.
        * This does nothing and may be overwritten by the user.
        * @param start the particle index in the particle array where to stop to iterate, same than the value passed to setParticle()
        * @param stop the particle index in the particle array where to stop to iterate, same than the value passed to setParticle()
        * @param update the boolean update value actually passed to setParticles()
        */
    native public void afterUpdateParticles(double start, double stop, Boolean update);
    /** This is an automatically generated object type (see the source definition). */
    @jsweet.lang.ObjectType
    public static class PickedParticles extends def.js.Object {
        public double idx;
        public double faceId;
    }
    /** This is an automatically generated object type (see the source definition). */
    @jsweet.lang.ObjectType
    public static class Options extends def.js.Object {
        @jsweet.lang.Optional
        public Boolean updatable;
        @jsweet.lang.Optional
        public Boolean isPickable;
        @jsweet.lang.Optional
        public Boolean particleIntersection;
        @jsweet.lang.Optional
        public Boolean boundingSphereOnly;
        @jsweet.lang.Optional
        public double bSphereRadiusFactor;
    }
    /** This is an automatically generated object type (see the source definition). */
    @jsweet.lang.ObjectType
    public static class OptionsData extends def.js.Object {
        @jsweet.lang.Optional
        public double facetNb;
        @jsweet.lang.Optional
        public double number;
        @jsweet.lang.Optional
        public double delta;
    }
    /** This is an automatically generated object type (see the source definition). */
    @jsweet.lang.ObjectType
    public static class OptionsDto extends def.js.Object {
        @jsweet.lang.Optional
        public Object positionFunction;
        @jsweet.lang.Optional
        public Object vertexFunction;
    }
    /**
        * Creates a SPS (Solid Particle System) object.
        * `name` (String) is the SPS name, this will be the underlying mesh name.
        * `scene` (Scene) is the scene in which the SPS is added.
        * `updatable` (optional boolean, default true) : if the SPS must be updatable or immutable.
        * `isPickable` (optional boolean, default false) : if the solid particles must be pickable.
        * `particleIntersection` (optional boolean, default false) : if the solid particle intersections must be computed.
        * `boundingSphereOnly` (optional boolean, default false) : if the particle intersection must be computed only with the bounding sphere (no bounding box computation, so faster).
        * `bSphereRadiusFactor` (optional float, default 1.0) : a number to multiply the boundind sphere radius by in order to reduce it for instance.
        *  Example : bSphereRadiusFactor = 1.0 / Math.sqrt(3.0) => the bounding sphere exactly matches a spherical mesh.
        */
    public SolidParticleSystem(String name, Scene scene){}
    /**
        * Digests the mesh and generates as many solid particles in the system as wanted. Returns the SPS.
        * These particles will have the same geometry than the mesh parts and will be positioned at the same localisation than the mesh original places.
        * Thus the particles generated from `digest()` have their property `position` set yet.
        * `mesh` ( Mesh ) is the mesh to be digested
        * `facetNb` (optional integer, default 1) is the number of mesh facets per particle, this parameter is overriden by the parameter `number` if any
        * `delta` (optional integer, default 0) is the random extra number of facets per particle , each particle will have between `facetNb` and `facetNb + delta` facets
        * `number` (optional positive integer) is the wanted number of particles : each particle is built with `mesh_total_facets / number` facets
        */
    native public SolidParticleSystem digest(Mesh mesh);
    /**
        * Adds some particles to the SPS from the model shape. Returns the shape id.
        * Please read the doc : http://doc.babylonjs.com/overviews/Solid_Particle_System#create-an-immutable-sps
        * `mesh` is any Mesh object that will be used as a model for the solid particles.
        * `nb` (positive integer) the number of particles to be created from this model
        * `positionFunction` is an optional javascript function to called for each particle on SPS creation.
        * `vertexFunction` is an optional javascript function to called for each vertex of each particle on SPS creation
        */
    native public double addShape(Mesh mesh, double nb);
    /**
        *  Sets all the particles : this method actually really updates the mesh according to the particle positions, rotations, colors, textures, etc.
        *  This method calls `updateParticle()` for each particle of the SPS.
        *  For an animated SPS, it is usually called within the render loop.
        * @param start The particle index in the particle array where to start to compute the particle property values _(default 0)_
        * @param end The particle index in the particle array where to stop to compute the particle property values _(default nbParticle - 1)_
        * @param update If the mesh must be finally updated on this call after all the particle computations _(default true)_
        * Returns the SPS.
        */
    native public SolidParticleSystem setParticles(double start, double end);
    /**
        *  Sets all the particles : this method actually really updates the mesh according to the particle positions, rotations, colors, textures, etc.
        *  This method calls `updateParticle()` for each particle of the SPS.
        *  For an animated SPS, it is usually called within the render loop.
        * @param start The particle index in the particle array where to start to compute the particle property values _(default 0)_
        * @param end The particle index in the particle array where to stop to compute the particle property values _(default nbParticle - 1)_
        * @param update If the mesh must be finally updated on this call after all the particle computations _(default true)_
        * Returns the SPS.
        */
    native public SolidParticleSystem setParticles(double start);
    /**
        *  Sets all the particles : this method actually really updates the mesh according to the particle positions, rotations, colors, textures, etc.
        *  This method calls `updateParticle()` for each particle of the SPS.
        *  For an animated SPS, it is usually called within the render loop.
        * @param start The particle index in the particle array where to start to compute the particle property values _(default 0)_
        * @param end The particle index in the particle array where to stop to compute the particle property values _(default nbParticle - 1)_
        * @param update If the mesh must be finally updated on this call after all the particle computations _(default true)_
        * Returns the SPS.
        */
    native public SolidParticleSystem setParticles();
    /**
        * This will be called before any other treatment by `setParticles()` and will be passed three parameters.
        * This does nothing and may be overwritten by the user.
        * @param start the particle index in the particle array where to stop to iterate, same than the value passed to setParticle()
        * @param stop the particle index in the particle array where to stop to iterate, same than the value passed to setParticle()
        * @param update the boolean update value actually passed to setParticles()
        */
    native public void beforeUpdateParticles(double start, double stop);
    /**
        * This will be called before any other treatment by `setParticles()` and will be passed three parameters.
        * This does nothing and may be overwritten by the user.
        * @param start the particle index in the particle array where to stop to iterate, same than the value passed to setParticle()
        * @param stop the particle index in the particle array where to stop to iterate, same than the value passed to setParticle()
        * @param update the boolean update value actually passed to setParticles()
        */
    native public void beforeUpdateParticles(double start);
    /**
        * This will be called before any other treatment by `setParticles()` and will be passed three parameters.
        * This does nothing and may be overwritten by the user.
        * @param start the particle index in the particle array where to stop to iterate, same than the value passed to setParticle()
        * @param stop the particle index in the particle array where to stop to iterate, same than the value passed to setParticle()
        * @param update the boolean update value actually passed to setParticles()
        */
    native public void beforeUpdateParticles();
    /**
        * This will be called  by `setParticles()` after all the other treatments and just before the actual mesh update.
        * This will be passed three parameters.
        * This does nothing and may be overwritten by the user.
        * @param start the particle index in the particle array where to stop to iterate, same than the value passed to setParticle()
        * @param stop the particle index in the particle array where to stop to iterate, same than the value passed to setParticle()
        * @param update the boolean update value actually passed to setParticles()
        */
    native public void afterUpdateParticles(double start, double stop);
    /**
        * This will be called  by `setParticles()` after all the other treatments and just before the actual mesh update.
        * This will be passed three parameters.
        * This does nothing and may be overwritten by the user.
        * @param start the particle index in the particle array where to stop to iterate, same than the value passed to setParticle()
        * @param stop the particle index in the particle array where to stop to iterate, same than the value passed to setParticle()
        * @param update the boolean update value actually passed to setParticles()
        */
    native public void afterUpdateParticles(double start);
    /**
        * This will be called  by `setParticles()` after all the other treatments and just before the actual mesh update.
        * This will be passed three parameters.
        * This does nothing and may be overwritten by the user.
        * @param start the particle index in the particle array where to stop to iterate, same than the value passed to setParticle()
        * @param stop the particle index in the particle array where to stop to iterate, same than the value passed to setParticle()
        * @param update the boolean update value actually passed to setParticles()
        */
    native public void afterUpdateParticles();
    protected SolidParticleSystem(){}
}

