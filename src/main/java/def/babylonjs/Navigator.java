package def.babylonjs;
@jsweet.lang.Interface
@jsweet.lang.Mixin(target=def.dom.Navigator.class)
public abstract class Navigator extends def.dom.Navigator {
    native public Object getGamepads(Object func);
    native public Object webkitGetGamepads(Object func);
    native public Object msGetGamepads(Object func);
    native public Object webkitGamepads(Object func);
    native public Object webkitGetGamepads();
    native public Object msGetGamepads();
    native public Object webkitGamepads();
}

