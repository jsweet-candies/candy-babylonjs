package def.babylonjs.babylon;
public class SimplificationQueue extends def.js.Object {
    public Object running;
    public SimplificationQueue(){}
    native public void addTask(ISimplificationTask task);
    native public void executeNext();
    native public void runSimplification(ISimplificationTask task);
}

