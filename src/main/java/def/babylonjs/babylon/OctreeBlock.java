package def.babylonjs.babylon;
import def.js.Array;
public class OctreeBlock<T> extends def.js.Object {
    public T[] entries;
    public Array<OctreeBlock<T>> blocks;
    public OctreeBlock(Vector3 minPoint, Vector3 maxPoint, double capacity, double depth, double maxDepth, java.util.function.BiConsumer<T,OctreeBlock<T>> creationFunc){}
    public final double capacity=0;
    public final Vector3 minPoint=null;
    public final Vector3 maxPoint=null;
    native public void addEntry(T entry);
    native public void addEntries(T[] entries);
    native public void select(Plane[] frustumPlanes, SmartArray<T> selection, Boolean allowDuplicate);
    native public void intersects(Vector3 sphereCenter, double sphereRadius, SmartArray<T> selection, Boolean allowDuplicate);
    native public void intersectsRay(Ray ray, SmartArray<T> selection);
    native public void createInnerBlocks();
    native public void select(Plane[] frustumPlanes, SmartArray<T> selection);
    native public void intersects(Vector3 sphereCenter, double sphereRadius, SmartArray<T> selection);
    protected OctreeBlock(){}
}

