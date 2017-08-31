package def.babylonjs.babylon;
/**
     * This class is used by the onRenderingGroupObservable
     */
public class RenderingGroupInfo extends def.js.Object {
    /**
         * The Scene that being rendered
         */
    public Scene scene;
    /**
         * The camera currently used for the rendering pass
         */
    public Camera camera;
    /**
         * The ID of the renderingGroup being processed
         */
    public double renderingGroupId;
    /**
         * The rendering stage, can be either STAGE_PRECLEAR, STAGE_PREOPAQUE, STAGE_PRETRANSPARENT, STAGE_POSTTRANSPARENT
         */
    public double renderStage;
    /**
         * Stage corresponding to the very first hook in the renderingGroup phase: before the render buffer may be cleared
         * This stage will be fired no matter what
         */
    public static double STAGE_PRECLEAR;
    /**
         * Called before opaque object are rendered.
         * This stage will be fired only if there's 3D Opaque content to render
         */
    public static double STAGE_PREOPAQUE;
    /**
         * Called after the opaque objects are rendered and before the transparent ones
         * This stage will be fired only if there's 3D transparent content to render
         */
    public static double STAGE_PRETRANSPARENT;
    /**
         * Called after the transparent object are rendered, last hook of the renderingGroup phase
         * This stage will be fired no matter what
         */
    public static double STAGE_POSTTRANSPARENT;
}

