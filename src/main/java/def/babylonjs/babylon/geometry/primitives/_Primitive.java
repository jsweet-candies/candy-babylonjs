package def.babylonjs.babylon.geometry.primitives;
import def.babylonjs.babylon.Geometry;
import def.js.Float32Array;
import def.babylonjs.babylon.Scene;
import def.babylonjs.babylon.Mesh;
import def.babylonjs.babylon.VertexData;
public class _Primitive extends Geometry {
    public _Primitive(String id, Scene scene, Boolean _canBeRegenerated, Mesh mesh){}
    native public Boolean canBeRegenerated();
    native public void regenerate();
    native public Geometry asNewGeometry(String id);
    native public void setAllVerticesData(VertexData vertexData, Boolean updatable);
    native public void setVerticesData(String kind, double[] data, Boolean updatable);
    native public VertexData _regenerateVertexData();
    native public Geometry copy(String id);
    native public Object serialize();
    public _Primitive(String id, Scene scene, Boolean _canBeRegenerated){}
    public _Primitive(String id, Scene scene){}
    native public void setAllVerticesData(VertexData vertexData);
    native public void setVerticesData(String kind, double[] data);
    native public void setVerticesData(String kind, Float32Array data, Boolean updatable);
    native public void setVerticesData(String kind, Float32Array data);
    protected _Primitive(){}
}

