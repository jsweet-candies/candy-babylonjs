package def.babylonjs.babylon;
/**
     * Node is the basic class for all scene objects (Mesh, Light Camera).
     */
public class Node extends def.js.Object {
    public String name;
    public String id;
    public double uniqueId;
    public String state;
    public Object metadata;
    public Boolean doNotSerialize;
    public Animation[] animations;
    public java.util.function.Consumer<Node> onReady;
    public double _currentRenderId;
    public String _waitingParentId;
    public Object _cache;
    public Node parent;
    native public String getClassName();
    /**
        * An event triggered when the mesh is disposed.
        * @type {BABYLON.Observable}
        */
    public Observable<Node> onDisposeObservable;
    public java.lang.Runnable onDispose;
    /**
         * @constructor
         * @param {string} name - the name and id to be given to this node
         * @param {BABYLON.Scene} the scene this node will be added to
         */
    public Node(String name, Scene scene){}
    native public Scene getScene();
    native public Engine getEngine();
    native public Matrix getWorldMatrix();
    native public void _initCache();
    native public void updateCache(Boolean force);
    native public void _updateCache(Boolean ignoreParentClass);
    native public Boolean _isSynchronized();
    native public void _markSyncedWithParent();
    native public Boolean isSynchronizedWithParent();
    native public Boolean isSynchronized(Boolean updateCache);
    native public Boolean hasNewParent(Boolean update);
    /**
         * Is this node ready to be used/rendered
         * @return {boolean} is it ready
         */
    native public Boolean isReady();
    /**
         * Is this node enabled.
         * If the node has a parent and is enabled, the parent will be inspected as well.
         * @return {boolean} whether this node (and its parent) is enabled.
         * @see setEnabled
         */
    native public Boolean isEnabled();
    /**
         * Set the enabled state of this node.
         * @param {boolean} value - the new enabled state
         * @see isEnabled
         */
    native public void setEnabled(Boolean value);
    /**
         * Is this node a descendant of the given node.
         * The function will iterate up the hierarchy until the ancestor was found or no more parents defined.
         * @param {BABYLON.Node} ancestor - The parent node to inspect
         * @see parent
         */
    native public Boolean isDescendantOf(Node ancestor);
    /**
         * Evaluate the list of children and determine if they should be considered as descendants considering the given criterias
         * @param {BABYLON.Node[]} results the result array containing the nodes matching the given criterias
         * @param {boolean} directDescendantsOnly if true only direct descendants of 'this' will be considered, if false direct and also indirect (children of children, an so on in a recursive manner) descendants of 'this' will be considered.
         * @param predicate: an optional predicate that will be called on every evaluated children, the predicate must return true for a given child to be part of the result, otherwise it will be ignored.
         */
    native public void _getDescendants(Node[] results, Boolean directDescendantsOnly, java.util.function.Function<Node,Boolean> predicate);
    /**
         * Will return all nodes that have this node as ascendant.
         * @param {boolean} directDescendantsOnly if true only direct descendants of 'this' will be considered, if false direct and also indirect (children of children, an so on in a recursive manner) descendants of 'this' will be considered.
         * @param predicate: an optional predicate that will be called on every evaluated children, the predicate must return true for a given child to be part of the result, otherwise it will be ignored.
         * @return {BABYLON.Node[]} all children nodes of all types.
         */
    native public Node[] getDescendants(Boolean directDescendantsOnly, java.util.function.Function<Node,Boolean> predicate);
    /**
         * Get all child-meshes of this node.
         */
    native public AbstractMesh[] getChildMeshes(Boolean directDecendantsOnly, java.util.function.Function<Node,Boolean> predicate);
    /**
         * Get all direct children of this node.
        */
    native public Node[] getChildren(java.util.function.Function<Node,Boolean> predicate);
    native public void _setReady(Boolean state);
    native public Animation getAnimationByName(String name);
    native public void createAnimationRange(String name, double from, double to);
    native public void deleteAnimationRange(String name, Boolean deleteFrames);
    native public AnimationRange getAnimationRange(String name);
    native public void beginAnimation(String name, Boolean loop, double speedRatio, java.lang.Runnable onAnimationEnd);
    native public Object serializeAnimationRanges();
    native public void dispose();
    native public static void ParseAnimationRanges(Node node, Object parsedNode, Scene scene);
    native public void updateCache();
    native public void _updateCache();
    native public Boolean isSynchronized();
    native public Boolean hasNewParent();
    /**
         * Evaluate the list of children and determine if they should be considered as descendants considering the given criterias
         * @param {BABYLON.Node[]} results the result array containing the nodes matching the given criterias
         * @param {boolean} directDescendantsOnly if true only direct descendants of 'this' will be considered, if false direct and also indirect (children of children, an so on in a recursive manner) descendants of 'this' will be considered.
         * @param predicate: an optional predicate that will be called on every evaluated children, the predicate must return true for a given child to be part of the result, otherwise it will be ignored.
         */
    native public void _getDescendants(Node[] results, Boolean directDescendantsOnly);
    /**
         * Evaluate the list of children and determine if they should be considered as descendants considering the given criterias
         * @param {BABYLON.Node[]} results the result array containing the nodes matching the given criterias
         * @param {boolean} directDescendantsOnly if true only direct descendants of 'this' will be considered, if false direct and also indirect (children of children, an so on in a recursive manner) descendants of 'this' will be considered.
         * @param predicate: an optional predicate that will be called on every evaluated children, the predicate must return true for a given child to be part of the result, otherwise it will be ignored.
         */
    native public void _getDescendants(Node[] results);
    /**
         * Will return all nodes that have this node as ascendant.
         * @param {boolean} directDescendantsOnly if true only direct descendants of 'this' will be considered, if false direct and also indirect (children of children, an so on in a recursive manner) descendants of 'this' will be considered.
         * @param predicate: an optional predicate that will be called on every evaluated children, the predicate must return true for a given child to be part of the result, otherwise it will be ignored.
         * @return {BABYLON.Node[]} all children nodes of all types.
         */
    native public Node[] getDescendants(Boolean directDescendantsOnly);
    /**
         * Will return all nodes that have this node as ascendant.
         * @param {boolean} directDescendantsOnly if true only direct descendants of 'this' will be considered, if false direct and also indirect (children of children, an so on in a recursive manner) descendants of 'this' will be considered.
         * @param predicate: an optional predicate that will be called on every evaluated children, the predicate must return true for a given child to be part of the result, otherwise it will be ignored.
         * @return {BABYLON.Node[]} all children nodes of all types.
         */
    native public Node[] getDescendants();
    /**
         * Get all child-meshes of this node.
         */
    native public AbstractMesh[] getChildMeshes(Boolean directDecendantsOnly);
    /**
         * Get all child-meshes of this node.
         */
    native public AbstractMesh[] getChildMeshes();
    /**
         * Get all direct children of this node.
        */
    native public Node[] getChildren();
    native public void deleteAnimationRange(String name);
    native public void beginAnimation(String name, Boolean loop, double speedRatio);
    native public void beginAnimation(String name, Boolean loop);
    native public void beginAnimation(String name);
    protected Node(){}
}

