package def.babylonjs.babylon.internals;
/**
     * Header information of HDR texture files.
     */
@jsweet.lang.Interface
public abstract class HDRInfo extends def.js.Object {
    /**
         * The height of the texture in pixels.
         */
    public double height;
    /**
         * The width of the texture in pixels.
         */
    public double width;
    /**
         * The index of the beginning of the data in the binary file.
         */
    public double dataPosition;
}

