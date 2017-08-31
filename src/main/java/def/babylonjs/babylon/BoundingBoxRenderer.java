package def.babylonjs.babylon;
public class BoundingBoxRenderer extends def.js.Object {
    public Color3 frontColor;
    public Color3 backColor;
    public Boolean showBackLines;
    public SmartArray<BoundingBox> renderList;
    public BoundingBoxRenderer(Scene scene){}
    native public void reset();
    native public void render();
    native public void dispose();
    protected BoundingBoxRenderer(){}
}

