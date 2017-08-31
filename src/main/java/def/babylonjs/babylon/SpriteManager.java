package def.babylonjs.babylon;
public class SpriteManager extends def.js.Object {
    public String name;
    public Sprite[] sprites;
    public double renderingGroupId;
    public double layerMask;
    public Boolean fogEnabled;
    public Boolean isPickable;
    public double cellWidth;
    public double cellHeight;
    /**
        * An event triggered when the manager is disposed.
        * @type {BABYLON.Observable}
        */
    public Observable<SpriteManager> onDisposeObservable;
    public java.lang.Runnable onDispose;
    public Texture texture;
    public SpriteManager(String name, String imgUrl, double capacity, Object cellSize, Scene scene, double epsilon, double samplingMode){}
    native public PickingInfo intersects(Ray ray, Camera camera, java.util.function.Function<Sprite,Boolean> predicate, Boolean fastCheck);
    native public void render();
    native public void dispose();
    public SpriteManager(String name, String imgUrl, double capacity, Object cellSize, Scene scene, double epsilon){}
    public SpriteManager(String name, String imgUrl, double capacity, Object cellSize, Scene scene){}
    native public PickingInfo intersects(Ray ray, Camera camera, java.util.function.Function<Sprite,Boolean> predicate);
    native public PickingInfo intersects(Ray ray, Camera camera);
    protected SpriteManager(){}
}

