package def.babylonjs.babylon;
import def.js.Float32Array;
@jsweet.lang.Interface
public abstract class IGetSetVerticesData extends def.js.Object {
    native public Boolean isVerticesDataPresent(String kind);
    native public jsweet.util.union.Union<Double[],Float32Array> getVerticesData(String kind, Boolean copyWhenShared, Boolean forceCopy);
    native public Object getIndices(Boolean copyWhenShared);
    native public void setVerticesData(String kind, double[] data, Boolean updatable);
    native public void updateVerticesData(String kind, double[] data, Boolean updateExtends, Boolean makeItUnique);
    native public void setIndices(Object indices);
    native public jsweet.util.union.Union<Double[],Float32Array> getVerticesData(String kind, Boolean copyWhenShared);
    native public jsweet.util.union.Union<Double[],Float32Array> getVerticesData(String kind);
    native public Object getIndices();
    native public void setVerticesData(String kind, double[] data);
    native public void updateVerticesData(String kind, double[] data, Boolean updateExtends);
    native public void updateVerticesData(String kind, double[] data);
    native public void setVerticesData(String kind, Float32Array data, Boolean updatable);
    native public void updateVerticesData(String kind, Float32Array data, Boolean updateExtends, Boolean makeItUnique);
    native public void setVerticesData(String kind, Float32Array data);
    native public void updateVerticesData(String kind, Float32Array data, Boolean updateExtends);
    native public void updateVerticesData(String kind, Float32Array data);
}

