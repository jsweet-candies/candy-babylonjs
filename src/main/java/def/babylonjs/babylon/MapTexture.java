package def.babylonjs.babylon;
public class MapTexture extends Texture {
    public MapTexture(String name, Scene scene, ISize size, double samplingMode, Boolean useMipMap, double margin){}
    /**
         * Allocate a rectangle of a given size in the texture map
         * @param size the size of the rectangle to allocation
         * @return the PackedRect instance corresponding to the allocated rect or null is there was not enough space to allocate it.
         */
    native public PackedRect allocateRect(Size size);
    /**
         * Free a given rectangle from the texture map
         * @param rectInfo the instance corresponding to the rect to free.
         */
    native public void freeRect(PackedRect rectInfo);
    /**
         * Return the available space in the range of [O;1]. 0 being not space left at all, 1 being an empty texture map.
         * This is the cumulated space, not the biggest available surface. Due to fragmentation you may not allocate a rect corresponding to this surface.
         * @returns {}
         */
    public final double freeSpace=0;
    /**
         * Bind the texture to the rendering engine to render in the zone of a given rectangle.
         * Use this method when you want to render into the texture map with a clipspace set to the location and size of the given rect.
         * Don't forget to call unbindTexture when you're done rendering
         * @param rect the zone to render to
         * @param clear true to clear the portion's color/depth data
         */
    native public void bindTextureForRect(PackedRect rect, Boolean clear);
    /**
         * Bind the texture to the rendering engine to render in the zone of the given size at the given position.
         * Use this method when you want to render into the texture map with a clipspace set to the location and size of the given rect.
         * Don't forget to call unbindTexture when you're done rendering
         * @param pos the position into the texture
         * @param size the portion to fit the clip space to
         * @param clear true to clear the portion's color/depth data
         */
    native public void bindTextureForPosSize(Vector2 pos, Size size, Boolean clear);
    /**
         * Unbind the texture map from the rendering engine.
         * Call this method when you're done rendering. A previous call to bindTextureForRect has to be made.
         * @param dumpForDebug if set to true the content of the texture map will be dumped to a picture file that will be sent to the internet browser.
         */
    native public void unbindTexture(Boolean dumpForDebug);
    public final Boolean canRescale=null;
    @jsweet.lang.Name("clone")
    native public MapTexture Clone();
    public MapTexture(String name, Scene scene, ISize size, double samplingMode, Boolean useMipMap){}
    public MapTexture(String name, Scene scene, ISize size, double samplingMode){}
    public MapTexture(String name, Scene scene, ISize size){}
    /**
         * Unbind the texture map from the rendering engine.
         * Call this method when you're done rendering. A previous call to bindTextureForRect has to be made.
         * @param dumpForDebug if set to true the content of the texture map will be dumped to a picture file that will be sent to the internet browser.
         */
    native public void unbindTexture();
    protected MapTexture(){}
}

