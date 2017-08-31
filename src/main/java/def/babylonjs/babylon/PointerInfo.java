package def.babylonjs.babylon;
import def.dom.MouseWheelEvent;
import def.dom.PointerEvent;
/**
     * This type contains all the data related to a pointer event in Babylon.js.
     * The event member is an instance of PointerEvent for all types except PointerWheel and is of type MouseWheelEvent when type equals PointerWheel. The different event types can be found in the PointerEventTypes class.
     */
public class PointerInfo extends PointerInfoBase {
    public PickingInfo pickInfo;
    public PointerInfo(double type, PointerEvent event, PickingInfo pickInfo){}
    public PointerInfo(double type, MouseWheelEvent event, PickingInfo pickInfo){}
    protected PointerInfo(){}
}

