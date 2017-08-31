package def.babylonjs;
import def.dom.IDBFactory;
import def.dom.MSGesture;
import def.dom.AudioContext;
import def.js.Math;
@jsweet.lang.Interface
@jsweet.lang.Mixin(target=def.dom.Window.class)
public abstract class Window extends def.dom.Window {
    native public Object mozIndexedDB(Object func);
    native public Object webkitIndexedDB(Object func);
    public IDBFactory msIndexedDB;
    native public Object IDBTransaction(Object func);
    native public Object webkitIDBTransaction(Object func);
    native public Object msIDBTransaction(Object func);
    native public Object IDBKeyRange(Object func);
    native public Object webkitIDBKeyRange(Object func);
    native public Object msIDBKeyRange(Object func);
    public HTMLURL webkitURL;
    native public Object webkitRequestAnimationFrame(Object func);
    native public Object mozRequestAnimationFrame(Object func);
    native public Object oRequestAnimationFrame(Object func);
    public WebGLRenderingContext WebGLRenderingContext;
    public MSGesture MSGesture;
    public Object CANNON;
    public Object SIMD;
    public AudioContext AudioContext;
    public AudioContext webkitAudioContext;
    public Object PointerEvent;
    public Math Math;
    public java.lang.Class<?> Uint8Array;
    public java.lang.Class<?> Float32Array;
    public Object mozURL;
    public Object msURL;
    public Object VRFrameData;
}

