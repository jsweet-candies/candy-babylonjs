package def.babylonjs.babylon;
/**
     * The purpose of this class is to pack several Rectangles into a big map, while trying to fit everything as optimally as possible.
     * This class is typically used to build lightmaps, sprite map or to pack several little textures into a big one.
     * Note that this class allows allocated Rectangles to be freed: that is the map is dynamically maintained so you can add/remove rectangle based on their life-cycle.
     * In case you need a margin around the allocated rect, specify the amount in the margin argument during construction.
     * In such case you will have to rely on innerPositionToRef and innerSizeToRef calls to get the proper size
     */
public class RectPackingMap extends PackedRect {
    /**
         * Create an instance of the object with a dimension using the given size
         * @param size The dimension of the rectangle that will contain all the sub ones.
         * @param margin The margin (empty space) created (in pixels) around the allocated Rectangles
         */
    public RectPackingMap(Size size, double margin){}
    /**
         * Add a rectangle, finding the best location to store it into the map
         * @param size the dimension of the rectangle to store
         * @return the Node containing the rectangle information, or null if we couldn't find a free spot
         */
    native public PackedRect addRect(Size size);
    /**
         * Return the current space free normalized between [0;1]
         * @returns {}
         */
    public final double freeSpace=0;
    public double _margin;
    /**
         * Create an instance of the object with a dimension using the given size
         * @param size The dimension of the rectangle that will contain all the sub ones.
         * @param margin The margin (empty space) created (in pixels) around the allocated Rectangles
         */
    public RectPackingMap(Size size){}
    protected RectPackingMap(){}
}

