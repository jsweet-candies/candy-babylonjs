package def.babylonjs.babylon.internals;
import def.babylonjs.babylon.BaseTexture;
import def.babylonjs.babylon.SphericalPolynomial;
/**
     * Helper class dealing with the extraction of spherical polynomial dataArray
     * from a cube map.
     */
public class CubeMapToSphericalPolynomialTools extends def.js.Object {
    /**
         * Converts a texture to the according Spherical Polynomial data.
         * This extracts the first 3 orders only as they are the only one used in the lighting.
         *
         * @param texture The texture to extract the information from.
         * @return The Spherical Polynomial data.
         */
    native public static SphericalPolynomial ConvertCubeMapTextureToSphericalPolynomial(BaseTexture texture);
    /**
         * Converts a cubemap to the according Spherical Polynomial data.
         * This extracts the first 3 orders only as they are the only one used in the lighting.
         *
         * @param cubeInfo The Cube map to extract the information from.
         * @return The Spherical Polynomial data.
         */
    native public static SphericalPolynomial ConvertCubeMapToSphericalPolynomial(CubeMapInfo cubeInfo);
}

