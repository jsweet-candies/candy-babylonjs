package def.babylonjs.babylon;
/**
     * Interface to implement to create a shadow generator compatible with BJS.
     */
@jsweet.lang.Interface
public abstract class IShadowGenerator extends def.js.Object {
    native public RenderTargetTexture getShadowMap();
    native public RenderTargetTexture getShadowMapForRendering();
    native public Boolean isReady(SubMesh subMesh, Boolean useInstances);
    native public void prepareDefines(MaterialDefines defines, double lightIndex);
    native public void bindShadowLight(String lightIndex, Effect effect);
    native public Matrix getTransformMatrix();
    native public void recreateShadowMap();
    native public Object serialize();
    native public void dispose();
}

