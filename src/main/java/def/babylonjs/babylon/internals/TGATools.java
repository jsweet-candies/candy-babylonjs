package def.babylonjs.babylon.internals;
import def.js.Uint8Array;
import def.dom.WebGLRenderingContext;
public class TGATools extends def.js.Object {
    native public static Object GetTGAHeader(Uint8Array data);
    native public static void UploadContent(WebGLRenderingContext gl, Uint8Array data);
    native public static Uint8Array _getImageData8bits(Object header, Uint8Array palettes, Uint8Array pixel_data, double y_start, double y_step, double y_end, double x_start, double x_step, double x_end);
    native public static Uint8Array _getImageData16bits(Object header, Uint8Array palettes, Uint8Array pixel_data, double y_start, double y_step, double y_end, double x_start, double x_step, double x_end);
    native public static Uint8Array _getImageData24bits(Object header, Uint8Array palettes, Uint8Array pixel_data, double y_start, double y_step, double y_end, double x_start, double x_step, double x_end);
    native public static Uint8Array _getImageData32bits(Object header, Uint8Array palettes, Uint8Array pixel_data, double y_start, double y_step, double y_end, double x_start, double x_step, double x_end);
    native public static Uint8Array _getImageDataGrey8bits(Object header, Uint8Array palettes, Uint8Array pixel_data, double y_start, double y_step, double y_end, double x_start, double x_step, double x_end);
    native public static Uint8Array _getImageDataGrey16bits(Object header, Uint8Array palettes, Uint8Array pixel_data, double y_start, double y_step, double y_end, double x_start, double x_step, double x_end);
}

