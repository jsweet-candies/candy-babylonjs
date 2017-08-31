package def.babylonjs;
@jsweet.lang.Interface
@jsweet.lang.Mixin(target=def.dom.MouseEvent.class)
public abstract class MouseEvent extends def.dom.MouseEvent {
    public double mozMovementX;
    public double mozMovementY;
    public double webkitMovementX;
    public double webkitMovementY;
    public double msMovementX;
    public double msMovementY;
}

