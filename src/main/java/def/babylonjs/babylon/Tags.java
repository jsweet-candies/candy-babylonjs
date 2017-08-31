package def.babylonjs.babylon;
public class Tags extends def.js.Object {
    native public static void EnableFor(Object obj);
    native public static void DisableFor(Object obj);
    native public static Boolean HasTags(Object obj);
    native public static Object GetTags(Object obj, Boolean asString);
    native public static void AddTagsTo(Object obj, String tagsString);
    native public static void _AddTagTo(Object obj, String tag);
    native public static void RemoveTagsFrom(Object obj, String tagsString);
    native public static void _RemoveTagFrom(Object obj, String tag);
    native public static Boolean MatchesQuery(Object obj, String tagsQuery);
    native public static Object GetTags(Object obj);
}

