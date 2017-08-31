package def.babylonjs.babylon;
public class TextureTools extends def.js.Object {
    /**
         * Uses the GPU to create a copy texture rescaled at a given size
         * @param texture Texture to copy from
         * @param width Desired width
         * @param height Desired height
         * @return Generated texture
         */
    native public static def.babylonjs.babylon.Texture CreateResizedCopy(def.babylonjs.babylon.Texture texture, double width, double height, Boolean useBilinearMode);
    native public static BaseTexture GetEnvironmentBRDFTexture(Scene scene);
    /**
         * Uses the GPU to create a copy texture rescaled at a given size
         * @param texture Texture to copy from
         * @param width Desired width
         * @param height Desired height
         * @return Generated texture
         */
    native public static def.babylonjs.babylon.Texture CreateResizedCopy(def.babylonjs.babylon.Texture texture, double width, double height);
}

