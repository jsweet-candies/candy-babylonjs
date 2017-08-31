package def.babylonjs.babylon;
public class MaterialDefines extends def.js.Object {
    public double _renderId;
    public Boolean _areLightsDirty;
    public Boolean _areAttributesDirty;
    public Boolean _areTexturesDirty;
    public Boolean _areFresnelDirty;
    public Boolean _areMiscDirty;
    public Boolean _areImageProcessingDirty;
    public Boolean _normals;
    public Boolean _uvs;
    public Boolean _needNormals;
    public Boolean _needUVs;
    public final Boolean isDirty=null;
    native public void markAsProcessed();
    native public void markAsUnprocessed();
    native public void markAllAsDirty();
    native public void markAsImageProcessingDirty();
    native public void markAsLightDirty();
    native public void markAsAttributesDirty();
    native public void markAsTexturesDirty();
    native public void markAsFresnelDirty();
    native public void markAsMiscDirty();
    native public void rebuild();
    native public Boolean isEqual(MaterialDefines other);
    native public void cloneTo(MaterialDefines other);
    native public void reset();
    native public String toString();
}

