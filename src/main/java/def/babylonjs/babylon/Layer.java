package def.babylonjs.babylon;
public class Layer extends def.js.Object {
    public String name;
    public Texture texture;
    public Boolean isBackground;
    public Color4 color;
    public Vector2 scale;
    public Vector2 offset;
    public double alphaBlendingMode;
    public Boolean alphaTest;
    public double layerMask;
    /**
        * An event triggered when the layer is disposed.
        * @type {BABYLON.Observable}
        */
    public Observable<Layer> onDisposeObservable;
    public java.lang.Runnable onDispose;
    /**
        * An event triggered before rendering the scene
        * @type {BABYLON.Observable}
        */
    public Observable<Layer> onBeforeRenderObservable;
    public java.lang.Runnable onBeforeRender;
    /**
        * An event triggered after rendering the scene
        * @type {BABYLON.Observable}
        */
    public Observable<Layer> onAfterRenderObservable;
    public java.lang.Runnable onAfterRender;
    public Layer(String name, String imgUrl, Scene scene, Boolean isBackground, Color4 color){}
    native public void render();
    native public void dispose();
    public Layer(String name, String imgUrl, Scene scene, Boolean isBackground){}
    public Layer(String name, String imgUrl, Scene scene){}
    protected Layer(){}
}

