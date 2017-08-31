package def.babylonjs.babylon.internals;
import def.dom.WebGLRenderingContext;
/**
     * for description see https://www.khronos.org/opengles/sdk/tools/KTX/
     * for file layout see https://www.khronos.org/opengles/sdk/tools/KTX/file_format_spec/
     */
public class KhronosTextureContainer extends def.js.Object {
    public Object arrayBuffer;
    public static double HEADER_LEN;
    public static double COMPRESSED_2D;
    public static double COMPRESSED_3D;
    public static double TEX_2D;
    public static double TEX_3D;
    public double glType;
    public double glTypeSize;
    public double glFormat;
    public double glInternalFormat;
    public double glBaseInternalFormat;
    public double pixelWidth;
    public double pixelHeight;
    public double pixelDepth;
    public double numberOfArrayElements;
    public double numberOfFaces;
    public double numberOfMipmapLevels;
    public double bytesOfKeyValueData;
    public double loadType;
    /**
         * @param {ArrayBuffer} arrayBuffer- contents of the KTX container file
         * @param {number} facesExpected- should be either 1 or 6, based whether a cube texture or or
         * @param {boolean} threeDExpected- provision for indicating that data should be a 3D texture, not implemented
         * @param {boolean} textureArrayExpected- provision for indicating that data should be a texture array, not implemented
         */
    public KhronosTextureContainer(Object arrayBuffer, double facesExpected, Boolean threeDExpected, Boolean textureArrayExpected){}
    native public double switchEndainness(double val);
    /**
         * It is assumed that the texture has already been created & is currently bound
         */
    native public void uploadLevels(WebGLRenderingContext gl, Boolean loadMipmaps);
    /**
         * @param {ArrayBuffer} arrayBuffer- contents of the KTX container file
         * @param {number} facesExpected- should be either 1 or 6, based whether a cube texture or or
         * @param {boolean} threeDExpected- provision for indicating that data should be a 3D texture, not implemented
         * @param {boolean} textureArrayExpected- provision for indicating that data should be a texture array, not implemented
         */
    public KhronosTextureContainer(Object arrayBuffer, double facesExpected, Boolean threeDExpected){}
    /**
         * @param {ArrayBuffer} arrayBuffer- contents of the KTX container file
         * @param {number} facesExpected- should be either 1 or 6, based whether a cube texture or or
         * @param {boolean} threeDExpected- provision for indicating that data should be a 3D texture, not implemented
         * @param {boolean} textureArrayExpected- provision for indicating that data should be a texture array, not implemented
         */
    public KhronosTextureContainer(Object arrayBuffer, double facesExpected){}
    protected KhronosTextureContainer(){}
}

