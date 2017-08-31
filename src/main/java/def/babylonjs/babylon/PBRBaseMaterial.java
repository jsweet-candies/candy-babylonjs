package def.babylonjs.babylon;
public class PBRBaseMaterial extends PushMaterial {
    public Boolean useLogarithmicDepth;
    native public Boolean needAlphaBlending();
    native public Boolean needAlphaTesting();
    native public Boolean _shouldUseAlphaFromAlbedoTexture();
    native public BaseTexture getAlphaTestTexture();
    native public Boolean isReadyForSubMesh(AbstractMesh mesh, SubMesh subMesh, Boolean useInstances);
    native public void buildUniformLayout();
    native public void unbind();
    native public void bindOnlyWorldMatrix(Matrix world);
    native public void bindForSubMesh(Matrix world, Mesh mesh, SubMesh subMesh);
    native public IAnimatable[] getAnimatables();
    native public void dispose(Boolean forceDisposeEffect, Boolean forceDisposeTextures);
    native public Boolean isReadyForSubMesh(AbstractMesh mesh, SubMesh subMesh);
    native public void dispose(Boolean forceDisposeEffect);
    native public void dispose();
}

