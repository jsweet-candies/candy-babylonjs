package def.babylonjs.babylon;
public class SerializationHelper extends def.js.Object {
    native public static <T> Object Serialize(T entity, Object serializationObject);
    native public static <T> T Parse(java.util.function.Supplier<T> creationFunction, Object source, Scene scene, String rootUrl);
    native public static <T> T Clone(java.util.function.Supplier<T> creationFunction, T source);
    native public static <T> Object Serialize(T entity);
    native public static <T> T Parse(java.util.function.Supplier<T> creationFunction, Object source, Scene scene);
}

