package def.babylonjs.babylon;
import def.dom.MouseWheelEvent;
import def.dom.PointerEvent;
public class PointerInfoBase extends def.js.Object {
    public double type;
    public jsweet.util.union.Union<PointerEvent,MouseWheelEvent> event;
    public PointerInfoBase(double type, PointerEvent event){}
    public PointerInfoBase(double type, MouseWheelEvent event){}
    protected PointerInfoBase(){}
}

