package def.babylonjs.babylon;
import def.js.Array;
public class Octree<T> extends def.js.Object {
    public double maxDepth;
    public Array<OctreeBlock<T>> blocks;
    public T[] dynamicContent;
    public Octree(java.util.function.BiConsumer<T,OctreeBlock<T>> creationFunc, double maxBlockCapacity, double maxDepth){}
    native public void update(Vector3 worldMin, Vector3 worldMax, T[] entries);
    native public void addMesh(T entry);
    native public SmartArray<T> select(Plane[] frustumPlanes, Boolean allowDuplicate);
    native public SmartArray<T> intersects(Vector3 sphereCenter, double sphereRadius, Boolean allowDuplicate);
    native public SmartArray<T> intersectsRay(Ray ray);
    native public static <T> void _CreateBlocks(Vector3 worldMin, Vector3 worldMax, T[] entries, double maxBlockCapacity, double currentDepth, double maxDepth, IOctreeContainer<T> target, java.util.function.BiConsumer<T,OctreeBlock<T>> creationFunc);
    public static java.util.function.BiConsumer<AbstractMesh,OctreeBlock<AbstractMesh>> CreationFuncForMeshes;
    public static java.util.function.BiConsumer<SubMesh,OctreeBlock<SubMesh>> CreationFuncForSubMeshes;
    public Octree(java.util.function.BiConsumer<T,OctreeBlock<T>> creationFunc, double maxBlockCapacity){}
    public Octree(java.util.function.BiConsumer<T,OctreeBlock<T>> creationFunc){}
    native public SmartArray<T> select(Plane[] frustumPlanes);
    native public SmartArray<T> intersects(Vector3 sphereCenter, double sphereRadius);
    protected Octree(){}
}

