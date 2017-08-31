package def.babylonjs.babylon;
import def.dom.MouseWheelEvent;
import def.dom.PointerEvent;
/**
     * This class is used to store pointer related info for the onPrePointerObservable event.
     * Set the skipOnPointerObservable property to true if you want the engine to stop any process after this event is triggered, even not calling onPointerObservable
     */
public class PointerInfoPre extends PointerInfoBase {
    public PointerInfoPre(double type, PointerEvent event, Object localX, Object localY){}
    public Vector2 localPosition;
    public Boolean skipOnPointerObservable;
    public PointerInfoPre(double type, MouseWheelEvent event, Object localX, Object localY){}
    protected PointerInfoPre(){}
}

