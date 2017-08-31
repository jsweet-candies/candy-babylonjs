package def.babylonjs.babylon;
/** This class holds all the global functions and variables of the BABYLON package. */
public final class Globals {
    private Globals(){}
    public static java.lang.Object CameraInputTypes;
    public static String CollisionWorker;
    public static Boolean WorkerIncluded;
    public static final double ToGammaSpace=0;
    native public static java.util.function.BiConsumer<Object,String> expandToProperty(String callback, String targetKey);
    native public static java.util.function.BiConsumer<Object,jsweet.util.union.Union<String,String>> serialize(String sourceName);
    native public static java.util.function.BiConsumer<Object,jsweet.util.union.Union<String,String>> serializeAsTexture(String sourceName);
    native public static java.util.function.BiConsumer<Object,jsweet.util.union.Union<String,String>> serializeAsColor3(String sourceName);
    native public static java.util.function.BiConsumer<Object,jsweet.util.union.Union<String,String>> serializeAsFresnelParameters(String sourceName);
    native public static java.util.function.BiConsumer<Object,jsweet.util.union.Union<String,String>> serializeAsVector2(String sourceName);
    native public static java.util.function.BiConsumer<Object,jsweet.util.union.Union<String,String>> serializeAsVector3(String sourceName);
    native public static java.util.function.BiConsumer<Object,jsweet.util.union.Union<String,String>> serializeAsMeshReference(String sourceName);
    native public static java.util.function.BiConsumer<Object,jsweet.util.union.Union<String,String>> serializeAsColorCurves(String sourceName);
    native public static java.util.function.BiConsumer<Object,jsweet.util.union.Union<String,String>> serializeAsColor4(String sourceName);
    native public static java.util.function.BiConsumer<Object,jsweet.util.union.Union<String,String>> serializeAsImageProcessingConfiguration(String sourceName);
    native public static java.util.function.BiConsumer<Object,String> expandToProperty(String callback);
    native public static java.util.function.BiConsumer<Object,jsweet.util.union.Union<String,String>> serialize();
    native public static java.util.function.BiConsumer<Object,jsweet.util.union.Union<String,String>> serializeAsTexture();
    native public static java.util.function.BiConsumer<Object,jsweet.util.union.Union<String,String>> serializeAsColor3();
    native public static java.util.function.BiConsumer<Object,jsweet.util.union.Union<String,String>> serializeAsFresnelParameters();
    native public static java.util.function.BiConsumer<Object,jsweet.util.union.Union<String,String>> serializeAsVector2();
    native public static java.util.function.BiConsumer<Object,jsweet.util.union.Union<String,String>> serializeAsVector3();
    native public static java.util.function.BiConsumer<Object,jsweet.util.union.Union<String,String>> serializeAsMeshReference();
    native public static java.util.function.BiConsumer<Object,jsweet.util.union.Union<String,String>> serializeAsColorCurves();
    native public static java.util.function.BiConsumer<Object,jsweet.util.union.Union<String,String>> serializeAsColor4();
    native public static java.util.function.BiConsumer<Object,jsweet.util.union.Union<String,String>> serializeAsImageProcessingConfiguration();
    /**
     * Use this className as a decorator on a given class definition to add it a name and optionally its module.
     * You can then use the Tools.getClassName(obj) on an instance to retrieve its class name.
     * This method is the only way to get it done in all cases, even if the .js file declaring the class is minified
     * @param name The name of the class, case should be preserved
     * @param module The name of the Module hosting the class, optional, but strongly recommended to specify if possible. Case should be preserved.
     */
    native public static java.util.function.Consumer<Object> className(String name, String module);
    /**
     * Use this className as a decorator on a given class definition to add it a name and optionally its module.
     * You can then use the Tools.getClassName(obj) on an instance to retrieve its class name.
     * This method is the only way to get it done in all cases, even if the .js file declaring the class is minified
     * @param name The name of the class, case should be preserved
     * @param module The name of the Module hosting the class, optional, but strongly recommended to specify if possible. Case should be preserved.
     */
    native public static java.util.function.Consumer<Object> className(String name);
}

