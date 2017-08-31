package def.babylonjs.babylon;
public class SceneLoader extends def.js.Object {
    public static final double NO_LOGGING=0;
    public static final double MINIMAL_LOGGING=0;
    public static final double SUMMARY_LOGGING=0;
    public static final double DETAILED_LOGGING=0;
    public static Boolean ForceFullSceneLoadingForIncremental;
    public static Boolean ShowLoadingScreen;
    public static double loggingLevel;
    native public static jsweet.util.union.Union<ISceneLoaderPlugin,ISceneLoaderPluginAsync> GetPluginForExtension(String extension);
    native public static void RegisterPlugin(ISceneLoaderPlugin plugin);
    native public static void ImportMesh(Object meshesNames, String rootUrl, String sceneFilename, Scene scene, jsweet.util.function.TriConsumer<AbstractMesh[],ParticleSystem[],Skeleton[]> onsuccess, java.lang.Runnable progressCallBack, jsweet.util.function.TriConsumer<Scene,String,Object> onerror);
    /**
        * Load a scene
        * @param rootUrl a string that defines the root url for scene and resources
        * @param sceneFilename a string that defines the name of the scene file. can start with "data:" following by the stringified version of the scene
        * @param engine is the instance of BABYLON.Engine to use to create the scene
        */
    native public static void Load(String rootUrl, Object sceneFilename, Engine engine, java.util.function.Consumer<Scene> onsuccess, Object progressCallBack, java.util.function.Consumer<Scene> onerror);
    /**
        * Append a scene
        * @param rootUrl a string that defines the root url for scene and resources
        * @param sceneFilename a string that defines the name of the scene file. can start with "data:" following by the stringified version of the scene
        * @param scene is the instance of BABYLON.Scene to append to
        */
    native public static void Append(String rootUrl, Object sceneFilename, Scene scene, java.util.function.Consumer<Scene> onsuccess, Object progressCallBack, java.util.function.Consumer<Scene> onerror);
    native public static void ImportMesh(Object meshesNames, String rootUrl, String sceneFilename, Scene scene, jsweet.util.function.TriConsumer<AbstractMesh[],ParticleSystem[],Skeleton[]> onsuccess, java.lang.Runnable progressCallBack);
    native public static void ImportMesh(Object meshesNames, String rootUrl, String sceneFilename, Scene scene, jsweet.util.function.TriConsumer<AbstractMesh[],ParticleSystem[],Skeleton[]> onsuccess);
    native public static void ImportMesh(Object meshesNames, String rootUrl, String sceneFilename, Scene scene);
    /**
        * Load a scene
        * @param rootUrl a string that defines the root url for scene and resources
        * @param sceneFilename a string that defines the name of the scene file. can start with "data:" following by the stringified version of the scene
        * @param engine is the instance of BABYLON.Engine to use to create the scene
        */
    native public static void Load(String rootUrl, Object sceneFilename, Engine engine, java.util.function.Consumer<Scene> onsuccess, Object progressCallBack);
    /**
        * Load a scene
        * @param rootUrl a string that defines the root url for scene and resources
        * @param sceneFilename a string that defines the name of the scene file. can start with "data:" following by the stringified version of the scene
        * @param engine is the instance of BABYLON.Engine to use to create the scene
        */
    native public static void Load(String rootUrl, Object sceneFilename, Engine engine, java.util.function.Consumer<Scene> onsuccess);
    /**
        * Load a scene
        * @param rootUrl a string that defines the root url for scene and resources
        * @param sceneFilename a string that defines the name of the scene file. can start with "data:" following by the stringified version of the scene
        * @param engine is the instance of BABYLON.Engine to use to create the scene
        */
    native public static void Load(String rootUrl, Object sceneFilename, Engine engine);
    /**
        * Append a scene
        * @param rootUrl a string that defines the root url for scene and resources
        * @param sceneFilename a string that defines the name of the scene file. can start with "data:" following by the stringified version of the scene
        * @param scene is the instance of BABYLON.Scene to append to
        */
    native public static void Append(String rootUrl, Object sceneFilename, Scene scene, java.util.function.Consumer<Scene> onsuccess, Object progressCallBack);
    /**
        * Append a scene
        * @param rootUrl a string that defines the root url for scene and resources
        * @param sceneFilename a string that defines the name of the scene file. can start with "data:" following by the stringified version of the scene
        * @param scene is the instance of BABYLON.Scene to append to
        */
    native public static void Append(String rootUrl, Object sceneFilename, Scene scene, java.util.function.Consumer<Scene> onsuccess);
    /**
        * Append a scene
        * @param rootUrl a string that defines the root url for scene and resources
        * @param sceneFilename a string that defines the name of the scene file. can start with "data:" following by the stringified version of the scene
        * @param scene is the instance of BABYLON.Scene to append to
        */
    native public static void Append(String rootUrl, Object sceneFilename, Scene scene);
    native public static void ImportMesh(Object meshesNames, String rootUrl, String sceneFilename, Scene scene, jsweet.util.function.TriConsumer<AbstractMesh[],ParticleSystem[],Skeleton[]> onsuccess, java.lang.Runnable progressCallBack, java.util.function.BiConsumer<Scene,String> onerror);
    native public static void RegisterPlugin(ISceneLoaderPluginAsync plugin);
}

