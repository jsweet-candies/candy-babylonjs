package def.babylonjs.babylon;
import jsweet.util.function.Function7;
@jsweet.lang.Interface
public abstract class ISceneLoaderPlugin extends def.js.Object {
    public jsweet.util.union.Union<String,ISceneLoaderPluginExtensions> extensions;
    public Function7<Object,Scene,Object,String,AbstractMesh[],ParticleSystem[],Skeleton[],Boolean> importMesh;
    public jsweet.util.function.TriFunction<Scene,String,String,Boolean> load;
    @jsweet.lang.Optional
    public java.util.function.Function<String,Boolean> canDirectLoad;
    native public Boolean importMesh(Object p1, Scene p2, Object p3, String p4, AbstractMesh[] p5, ParticleSystem[] p6, Skeleton[] p7);
}

