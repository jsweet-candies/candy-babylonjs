package def.babylonjs.babylon;
/**
     * This class describe a rectangle that were added to the map.
     * You have access to its coordinates either in pixel or normalized (UV)
     */
public class PackedRect extends def.js.Object {
    public PackedRect(RectPackingMap root, PackedRect parent, Vector2 pos, Size size){}
    /**
         * @returns the position of this node into the map
         */
    public final Vector2 pos=null;
    /**
         * @returns the size of the rectangle this node handles
         */
    public final Size contentSize=null;
    /**
         * Retrieve the inner position (considering the margin) and stores it into the res object
         * @param res must be a valid Vector2 that will contain the inner position after this call
         */
    native public void getInnerPosToRef(Vector2 res);
    /**
         * Retrieve the inner size (considering the margin) and stores it into the res object
         * @param res must be a valid Size that will contain the inner size after this call
         */
    native public void getInnerSizeToRef(Size res);
    /**
         * Compute the UV of the top/left, top/right, bottom/right, bottom/left points of the rectangle this node handles into the map
         * @returns And array of 4 Vector2, containing UV coordinates for the four corners of the Rectangle into the map
         */
    public final Vector2[] UVs=null;
    /**
         * You may have allocated the PackedRect using over-provisioning (you allocated more than you need in order to prevent frequent deallocations/reallocations)
         * and then using only a part of the PackRect.
         * This method will return the UVs for this part by given the custom size of what you really use
         * @param customSize must be less/equal to the allocated size, UV will be compute from this
         */
    native public Vector2[] getUVsForCustomSize(Size customSize);
    /**
         * Free this rectangle from the map.
         * Call this method when you no longer need the rectangle to be in the map.
         */
    native public void freeContent();
    public final Boolean isUsed=null;
    native public PackedRect findAndSplitNode(Size contentSize);
    native public double evalFreeSize(double size);
    public RectPackingMap _root;
    public PackedRect _parent;
    public Size _size;
    protected PackedRect(){}
}

