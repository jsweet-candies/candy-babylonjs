package def.babylonjs.babylon;
public class LensFlareSystem extends def.js.Object {
    public String name;
    public LensFlare[] lensFlares;
    public double borderLimit;
    public double viewportBorder;
    public java.util.function.Function<Mesh,Boolean> meshesSelectionPredicate;
    public double layerMask;
    public String id;
    public LensFlareSystem(String name, Object emitter, Scene scene){}
    public Boolean isEnabled;
    native public Scene getScene();
    native public Object getEmitter();
    native public void setEmitter(Object newEmitter);
    native public Vector3 getEmitterPosition();
    native public Boolean computeEffectivePosition(Viewport globalViewport);
    native public Boolean _isVisible();
    native public Boolean render();
    native public void dispose();
    native public static LensFlareSystem Parse(Object parsedLensFlareSystem, Scene scene, String rootUrl);
    native public Object serialize();
    protected LensFlareSystem(){}
}

