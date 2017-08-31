package def.babylonjs.babylon;
import jsweet.util.union.Union3;
@jsweet.lang.Interface
public abstract class BabylonMessage extends def.js.Object {
    public WorkerTaskType taskType;
    public Union3<InitPayload,CollidePayload,UpdatePayload> payload;
}

