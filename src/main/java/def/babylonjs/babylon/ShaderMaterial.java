package def.babylonjs.babylon;
import def.js.Float32Array;
public class ShaderMaterial extends Material {
    public ShaderMaterial(String name, Scene scene, Object shaderPath, Object options){}
    native public String getClassName();
    native public Boolean needAlphaBlending();
    native public Boolean needAlphaTesting();
    native public ShaderMaterial setTexture(String name, Texture texture);
    native public ShaderMaterial setTextureArray(String name, Texture[] textures);
    native public ShaderMaterial setFloat(String name, double value);
    native public ShaderMaterial setFloats(String name, double[] value);
    native public ShaderMaterial setColor3(String name, Color3 value);
    native public ShaderMaterial setColor4(String name, Color4 value);
    native public ShaderMaterial setVector2(String name, Vector2 value);
    native public ShaderMaterial setVector3(String name, Vector3 value);
    native public ShaderMaterial setVector4(String name, Vector4 value);
    native public ShaderMaterial setMatrix(String name, Matrix value);
    native public ShaderMaterial setMatrix3x3(String name, Float32Array value);
    native public ShaderMaterial setMatrix2x2(String name, Float32Array value);
    native public ShaderMaterial setArray3(String name, double[] value);
    native public Boolean isReady(AbstractMesh mesh, Boolean useInstances);
    native public void bindOnlyWorldMatrix(Matrix world);
    native public void bind(Matrix world, Mesh mesh);
    native public BaseTexture[] getActiveTextures();
    native public Boolean hasTexture(BaseTexture texture);
    native public ShaderMaterial clone(String name);
    native public void dispose(Boolean forceDisposeEffect, Boolean forceDisposeTextures);
    native public Object serialize();
    native public static ShaderMaterial Parse(Object source, Scene scene, String rootUrl);
    native public Boolean isReady(AbstractMesh mesh);
    native public Boolean isReady();
    native public void bind(Matrix world);
    native public void dispose(Boolean forceDisposeEffect);
    native public void dispose();
    protected ShaderMaterial(){}
}

