package def.babylonjs.babylon;
import def.dom.CanvasRenderingContext2D;
public class DynamicTexture extends Texture {
    public DynamicTexture(String name, Object options, Scene scene, Boolean generateMipMaps, double samplingMode, double format){}
    public final Boolean canRescale=null;
    native public void scale(double ratio);
    native public void scaleTo(double width, double height);
    native public CanvasRenderingContext2D getContext();
    native public void clear();
    native public void update(Boolean invertY);
    native public void drawText(String text, double x, double y, String font, String color, String clearColor, Boolean invertY, Boolean update);
    @jsweet.lang.Name("clone")
    native public DynamicTexture Clone();
    public DynamicTexture(String name, Object options, Scene scene, Boolean generateMipMaps, double samplingMode){}
    public DynamicTexture(String name, Object options, Scene scene, Boolean generateMipMaps){}
    native public void update();
    native public void drawText(String text, double x, double y, String font, String color, String clearColor, Boolean invertY);
    native public void drawText(String text, double x, double y, String font, String color, String clearColor);
    protected DynamicTexture(){}
}

