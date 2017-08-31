package def.babylonjs.babylon;
public class MultiMaterial extends Material {
    public Material[] subMaterials;
    public MultiMaterial(String name, Scene scene){}
    native public Material getSubMaterial(Object index);
    native public BaseTexture[] getActiveTextures();
    native public String getClassName();
    native public Boolean isReady(AbstractMesh mesh);
    native public MultiMaterial clone(String name, Boolean cloneChildren);
    native public Object serialize();
    native public Boolean isReady();
    native public MultiMaterial clone(String name);
    protected MultiMaterial(){}
}

