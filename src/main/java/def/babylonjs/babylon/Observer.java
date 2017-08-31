package def.babylonjs.babylon;
/**
     * Represent an Observer registered to a given Observable object.
     */
public class Observer<T> extends def.js.Object {
    public java.util.function.BiConsumer<T,EventState> callback;
    public double mask;
    public Observer(java.util.function.BiConsumer<T,EventState> callback, double mask){}
    protected Observer(){}
}

