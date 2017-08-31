package def.babylonjs.babylon;
public class SceneSerializer extends def.js.Object {
    native public static void ClearCache();
    native public static Object Serialize(Scene scene);
    native public static Object SerializeMesh(Object toSerialize, Boolean withParents, Boolean withChildren);
    native public static Object SerializeMesh(Object toSerialize, Boolean withParents);
    native public static Object SerializeMesh(Object toSerialize);
}

