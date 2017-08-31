package def.babylonjs.babylon;
import jsweet.util.function.Consumer5;
import jsweet.util.function.Consumer6;
@jsweet.lang.Interface
public abstract class ISceneLoaderPluginAsync extends def.js.Object {
    public jsweet.util.union.Union<String,ISceneLoaderPluginExtensions> extensions;
    public Consumer6<Object,Scene,Object,String,jsweet.util.function.TriConsumer<AbstractMesh[],ParticleSystem[],Skeleton[]>,java.lang.Runnable> importMeshAsync;
    public Consumer5<Scene,String,String,java.lang.Runnable,java.lang.Runnable> loadAsync;
    @jsweet.lang.Optional
    public java.util.function.Function<String,Boolean> canDirectLoad;
    native public void importMeshAsync(Object p1, Scene p2, Object p3, String p4, jsweet.util.function.TriConsumer<AbstractMesh[],ParticleSystem[],Skeleton[]> p5, java.lang.Runnable p6);
    native public void loadAsync(Scene p1, String p2, String p3, java.lang.Runnable p4, java.lang.Runnable p5);
}

