package def.babylonjs.babylon.internals;
import def.js.Float32Array;
/**
     * Helper class usefull to convert panorama picture to their cubemap representation in 6 faces.
     */
public class PanoramaToCubeMapTools extends def.js.Object {
    /**
         * Converts a panorma stored in RGB right to left up to down format into a cubemap (6 faces).
         *
         * @param float32Array The source data.
         * @param inputWidth The width of the input panorama.
         * @param inputhHeight The height of the input panorama.
         * @param size The willing size of the generated cubemap (each faces will be size * size pixels)
         * @return The cubemap data
         */
    native public static CubeMapInfo ConvertPanoramaToCubemap(Float32Array float32Array, double inputWidth, double inputHeight, double size);
}

