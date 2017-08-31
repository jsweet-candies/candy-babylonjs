package def.babylonjs.babylon;
/**
     * Highlight layer options. This helps customizing the behaviour
     * of the highlight layer.
     */
@jsweet.lang.Interface
public abstract class IHighlightLayerOptions extends def.js.Object {
    /**
         * Multiplication factor apply to the canvas size to compute the render target size
         * used to generated the glowing objects (the smaller the faster).
         */
    @jsweet.lang.Optional
    public double mainTextureRatio;
    /**
         * Enforces a fixed size texture to ensure resize independant blur.
         */
    @jsweet.lang.Optional
    public double mainTextureFixedSize;
    /**
         * Multiplication factor apply to the main texture size in the first step of the blur to reduce the size
         * of the picture to blur (the smaller the faster).
         */
    @jsweet.lang.Optional
    public double blurTextureSizeRatio;
    /**
         * How big in texel of the blur texture is the vertical blur.
         */
    @jsweet.lang.Optional
    public double blurVerticalSize;
    /**
         * How big in texel of the blur texture is the horizontal blur.
         */
    @jsweet.lang.Optional
    public double blurHorizontalSize;
    /**
         * Alpha blending mode used to apply the blur. Default is combine.
         */
    @jsweet.lang.Optional
    public double alphaBlendingMode;
    /**
         * The camera attached to the layer.
         */
    @jsweet.lang.Optional
    public Camera camera;
}

