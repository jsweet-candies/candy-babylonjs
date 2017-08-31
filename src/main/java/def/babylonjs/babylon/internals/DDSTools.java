package def.babylonjs.babylon.internals;
import def.babylonjs.babylon.Engine;
public class DDSTools extends def.js.Object {
    public static Boolean StoreLODInAlphaChannel;
    native public static DDSInfo GetDDSInfo(Object arrayBuffer);
    native public static void UploadDDSLevels(Engine engine, Object arrayBuffer, DDSInfo info, Boolean loadMipmaps, double faces, double lodIndex);
    native public static void UploadDDSLevels(Engine engine, Object arrayBuffer, DDSInfo info, Boolean loadMipmaps, double faces);
}

