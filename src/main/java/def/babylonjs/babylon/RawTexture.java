package def.babylonjs.babylon;
import def.js.ArrayBufferView;
public class RawTexture extends Texture {
    public double format;
    public RawTexture(ArrayBufferView data, double width, double height, double format, Scene scene, Boolean generateMipMaps, Boolean invertY, double samplingMode){}
    native public void update(ArrayBufferView data);
    native public static RawTexture CreateLuminanceTexture(ArrayBufferView data, double width, double height, Scene scene, Boolean generateMipMaps, Boolean invertY, double samplingMode);
    native public static RawTexture CreateLuminanceAlphaTexture(ArrayBufferView data, double width, double height, Scene scene, Boolean generateMipMaps, Boolean invertY, double samplingMode);
    native public static RawTexture CreateAlphaTexture(ArrayBufferView data, double width, double height, Scene scene, Boolean generateMipMaps, Boolean invertY, double samplingMode);
    native public static RawTexture CreateRGBTexture(ArrayBufferView data, double width, double height, Scene scene, Boolean generateMipMaps, Boolean invertY, double samplingMode);
    native public static RawTexture CreateRGBATexture(ArrayBufferView data, double width, double height, Scene scene, Boolean generateMipMaps, Boolean invertY, double samplingMode);
    public RawTexture(ArrayBufferView data, double width, double height, double format, Scene scene, Boolean generateMipMaps, Boolean invertY){}
    public RawTexture(ArrayBufferView data, double width, double height, double format, Scene scene, Boolean generateMipMaps){}
    public RawTexture(ArrayBufferView data, double width, double height, double format, Scene scene){}
    native public static RawTexture CreateLuminanceTexture(ArrayBufferView data, double width, double height, Scene scene, Boolean generateMipMaps, Boolean invertY);
    native public static RawTexture CreateLuminanceTexture(ArrayBufferView data, double width, double height, Scene scene, Boolean generateMipMaps);
    native public static RawTexture CreateLuminanceTexture(ArrayBufferView data, double width, double height, Scene scene);
    native public static RawTexture CreateLuminanceAlphaTexture(ArrayBufferView data, double width, double height, Scene scene, Boolean generateMipMaps, Boolean invertY);
    native public static RawTexture CreateLuminanceAlphaTexture(ArrayBufferView data, double width, double height, Scene scene, Boolean generateMipMaps);
    native public static RawTexture CreateLuminanceAlphaTexture(ArrayBufferView data, double width, double height, Scene scene);
    native public static RawTexture CreateAlphaTexture(ArrayBufferView data, double width, double height, Scene scene, Boolean generateMipMaps, Boolean invertY);
    native public static RawTexture CreateAlphaTexture(ArrayBufferView data, double width, double height, Scene scene, Boolean generateMipMaps);
    native public static RawTexture CreateAlphaTexture(ArrayBufferView data, double width, double height, Scene scene);
    native public static RawTexture CreateRGBTexture(ArrayBufferView data, double width, double height, Scene scene, Boolean generateMipMaps, Boolean invertY);
    native public static RawTexture CreateRGBTexture(ArrayBufferView data, double width, double height, Scene scene, Boolean generateMipMaps);
    native public static RawTexture CreateRGBTexture(ArrayBufferView data, double width, double height, Scene scene);
    native public static RawTexture CreateRGBATexture(ArrayBufferView data, double width, double height, Scene scene, Boolean generateMipMaps, Boolean invertY);
    native public static RawTexture CreateRGBATexture(ArrayBufferView data, double width, double height, Scene scene, Boolean generateMipMaps);
    native public static RawTexture CreateRGBATexture(ArrayBufferView data, double width, double height, Scene scene);
    protected RawTexture(){}
}

