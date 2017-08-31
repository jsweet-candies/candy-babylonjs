package def.babylonjs.babylon;
import jsweet.util.function.Consumer4;
@jsweet.lang.Extends({IAnimatable.class})
public class ParticleSystem extends IDisposable {
    public String name;
    public static double BLENDMODE_ONEONE;
    public static double BLENDMODE_STANDARD;
    public Animation[] animations;
    public String id;
    public double renderingGroupId;
    public Object emitter;
    public double emitRate;
    public double manualEmitCount;
    public double updateSpeed;
    public double targetStopDuration;
    public Boolean disposeOnStop;
    public double minEmitPower;
    public double maxEmitPower;
    public double minLifeTime;
    public double maxLifeTime;
    public double minSize;
    public double maxSize;
    public double minAngularSpeed;
    public double maxAngularSpeed;
    public Texture particleTexture;
    public double layerMask;
    public Object customShader;
    public Boolean preventAutoStart;
    /**
        * An event triggered when the system is disposed.
        * @type {BABYLON.Observable}
        */
    public Observable<ParticleSystem> onDisposeObservable;
    public java.lang.Runnable onDispose;
    public java.util.function.Consumer<Particle[]> updateFunction;
    public double blendMode;
    public Boolean forceDepthWrite;
    public Vector3 gravity;
    public Vector3 direction1;
    public Vector3 direction2;
    public Vector3 minEmitBox;
    public Vector3 maxEmitBox;
    public Color4 color1;
    public Color4 color2;
    public Color4 colorDead;
    public Color4 textureMask;
    public Consumer4<Double,Matrix,Vector3,Particle> startDirectionFunction;
    public jsweet.util.function.TriConsumer<Matrix,Vector3,Particle> startPositionFunction;
    public ParticleSystem(String name, double capacity, Scene scene, Effect customEffect){}
    native public void recycleParticle(Particle particle);
    native public double getCapacity();
    native public Boolean isAlive();
    native public Boolean isStarted();
    native public void start();
    native public void stop();
    native public void _appendParticleVertex(double index, Particle particle, double offsetX, double offsetY);
    native public void animate();
    native public double render();
    native public void dispose();
    native public ParticleSystem clone(String name, Object newEmitter);
    native public Object serialize();
    native public static ParticleSystem Parse(Object parsedParticleSystem, Scene scene, String rootUrl);
    public ParticleSystem(String name, double capacity, Scene scene){}
    native public void startDirectionFunction(Double p1, Matrix p2, Vector3 p3, Particle p4);
    protected ParticleSystem(){}
}

