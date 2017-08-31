package def.babylonjs.babylon;
public class MaterialHelper extends def.js.Object {
    native public static void PrepareDefinesForMergedUV(BaseTexture texture, MaterialDefines defines, String key);
    native public static void BindTextureMatrix(BaseTexture texture, UniformBuffer uniformBuffer, String key);
    native public static void PrepareDefinesForMisc(AbstractMesh mesh, Scene scene, Boolean useLogarithmicDepth, Object pointsCloud, Boolean fogEnabled, MaterialDefines defines);
    native public static void PrepareDefinesForFrameBoundValues(Scene scene, Engine engine, MaterialDefines defines, Boolean useInstances, Boolean forceAlphaTest);
    native public static Boolean PrepareDefinesForAttributes(AbstractMesh mesh, MaterialDefines defines, Boolean useVertexColor, Boolean useBones, Boolean useMorphTargets);
    native public static Boolean PrepareDefinesForLights(Scene scene, AbstractMesh mesh, MaterialDefines defines, Boolean specularSupported, double maxSimultaneousLights, Boolean disableLighting);
    native public static void PrepareUniformsAndSamplersList(String[] uniformsListOrOptions, String[] samplersList, MaterialDefines defines, double maxSimultaneousLights);
    native public static void HandleFallbacksForShadows(MaterialDefines defines, EffectFallbacks fallbacks, double maxSimultaneousLights);
    native public static void PrepareAttributesForMorphTargets(String[] attribs, AbstractMesh mesh, MaterialDefines defines);
    native public static void PrepareAttributesForBones(String[] attribs, AbstractMesh mesh, MaterialDefines defines, EffectFallbacks fallbacks);
    native public static void PrepareAttributesForInstances(String[] attribs, MaterialDefines defines);
    native public static void BindLightShadow(Light light, Scene scene, AbstractMesh mesh, String lightIndex, Effect effect);
    native public static void BindLightProperties(Light light, Effect effect, double lightIndex);
    native public static void BindLights(Scene scene, AbstractMesh mesh, Effect effect, MaterialDefines defines, double maxSimultaneousLights, Boolean usePhysicalLightFalloff);
    native public static void BindFogParameters(Scene scene, AbstractMesh mesh, Effect effect);
    native public static void BindBonesParameters(AbstractMesh mesh, Effect effect);
    native public static void BindMorphTargetParameters(AbstractMesh abstractMesh, Effect effect);
    native public static void BindLogDepth(MaterialDefines defines, Effect effect, Scene scene);
    native public static void BindClipPlane(Effect effect, Scene scene);
    native public static void PrepareDefinesForFrameBoundValues(Scene scene, Engine engine, MaterialDefines defines, Boolean useInstances);
    native public static Boolean PrepareDefinesForAttributes(AbstractMesh mesh, MaterialDefines defines, Boolean useVertexColor, Boolean useBones);
    native public static Boolean PrepareDefinesForLights(Scene scene, AbstractMesh mesh, MaterialDefines defines, Boolean specularSupported, double maxSimultaneousLights);
    native public static Boolean PrepareDefinesForLights(Scene scene, AbstractMesh mesh, MaterialDefines defines, Boolean specularSupported);
    native public static void PrepareUniformsAndSamplersList(String[] uniformsListOrOptions, String[] samplersList, MaterialDefines defines);
    native public static void PrepareUniformsAndSamplersList(String[] uniformsListOrOptions, String[] samplersList);
    native public static void PrepareUniformsAndSamplersList(String[] uniformsListOrOptions);
    native public static void HandleFallbacksForShadows(MaterialDefines defines, EffectFallbacks fallbacks);
    native public static void BindLights(Scene scene, AbstractMesh mesh, Effect effect, MaterialDefines defines, double maxSimultaneousLights);
    native public static void BindLights(Scene scene, AbstractMesh mesh, Effect effect, MaterialDefines defines);
    native public static void PrepareUniformsAndSamplersList(EffectCreationOptions uniformsListOrOptions, String[] samplersList, MaterialDefines defines, double maxSimultaneousLights);
    native public static void PrepareUniformsAndSamplersList(EffectCreationOptions uniformsListOrOptions, String[] samplersList, MaterialDefines defines);
    native public static void PrepareUniformsAndSamplersList(EffectCreationOptions uniformsListOrOptions, String[] samplersList);
    native public static void PrepareUniformsAndSamplersList(EffectCreationOptions uniformsListOrOptions);
}

