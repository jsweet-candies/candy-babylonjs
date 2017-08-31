package def.babylonjs.babylon.internals;
import def.js.ArrayBuffer;
import def.js.Uint8Array;
import def.js.Float32Array;
/**
     * This groups tools to convert HDR texture to native colors array.
     */
public class HDRTools extends def.js.Object {
    /**
         * Reads header information from an RGBE texture stored in a native array.
         * More information on this format are available here:
         * https://en.wikipedia.org/wiki/RGBE_image_format
         *
         * @param uint8array The binary file stored in  native array.
         * @return The header information.
         */
    native public static HDRInfo RGBE_ReadHeader(Uint8Array uint8array);
    /**
         * Returns the cubemap information (each faces texture data) extracted from an RGBE texture.
         * This RGBE texture needs to store the information as a panorama.
         *
         * More information on this format are available here:
         * https://en.wikipedia.org/wiki/RGBE_image_format
         *
         * @param buffer The binary file stored in an array buffer.
         * @param size The expected size of the extracted cubemap.
         * @return The Cube Map information.
         */
    native public static CubeMapInfo GetCubeMapTextureData(ArrayBuffer buffer, double size);
    /**
         * Returns the pixels data extracted from an RGBE texture.
         * This pixels will be stored left to right up to down in the R G B order in one array.
         *
         * More information on this format are available here:
         * https://en.wikipedia.org/wiki/RGBE_image_format
         *
         * @param uint8array The binary file stored in an array buffer.
         * @param hdrInfo The header information of the file.
         * @return The pixels data in RGB right to left up to down order.
         */
    native public static Float32Array RGBE_ReadPixels(Uint8Array uint8array, HDRInfo hdrInfo);
}

