package def.babylonjs.babylon.internals;
import def.js.ArrayBufferView;
/**
     * CubeMap information grouping all the data for each faces as well as the cubemap size.
     */
@jsweet.lang.Interface
public abstract class CubeMapInfo extends def.js.Object {
    /**
         * The pixel array for the front face.
         * This is stored in format, left to right, up to down format.
         */
    public ArrayBufferView front;
    /**
         * The pixel array for the back face.
         * This is stored in format, left to right, up to down format.
         */
    public ArrayBufferView back;
    /**
         * The pixel array for the left face.
         * This is stored in format, left to right, up to down format.
         */
    public ArrayBufferView left;
    /**
         * The pixel array for the right face.
         * This is stored in format, left to right, up to down format.
         */
    public ArrayBufferView right;
    /**
         * The pixel array for the up face.
         * This is stored in format, left to right, up to down format.
         */
    public ArrayBufferView up;
    /**
         * The pixel array for the down face.
         * This is stored in format, left to right, up to down format.
         */
    public ArrayBufferView down;
    /**
         * The size of the cubemap stored.
         *
         * Each faces will be size * size pixels.
         */
    public double size;
    /**
         * The format of the texture.
         *
         * RGBA, RGB.
         */
    public double format;
    /**
         * The type of the texture data.
         *
         * UNSIGNED_INT, FLOAT.
         */
    public double type;
    /**
         * Specifies whether the texture is in gamma space.
         */
    public Boolean gammaSpace;
}

