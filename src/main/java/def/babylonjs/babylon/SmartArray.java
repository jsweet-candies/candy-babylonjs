package def.babylonjs.babylon;
import def.js.Array;
public class SmartArray<T> extends def.js.Object {
    public Array<T> data;
    public double length;
    public SmartArray(double capacity){}
    native public void push(Object value);
    native public void forEach(jsweet.util.function.Consumer<T> func);
    native public Boolean pushNoDuplicate(Object value);
    native public void sort(Object compareFn);
    native public void reset();
    native public void dispose();
    native public void concat(Object array);
    native public void concatWithNoDuplicate(Object array);
    native public double indexOf(T value);
    native public Boolean contains(T value);
    protected SmartArray(){}
}

