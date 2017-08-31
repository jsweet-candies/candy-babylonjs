package def.babylonjs.babylon;
import def.js.Array;
public class DirectionalLight extends ShadowLight {
    /**
         * Specifies a fix frustum size for the shadow generation.
         */
    public double shadowFrustumSize;
    public double shadowOrthoScale;
    public Boolean autoUpdateExtends;
    /**
         * Creates a DirectionalLight object in the scene, oriented towards the passed direction (Vector3).
         * The directional light is emitted from everywhere in the given direction.
         * It can cast shawdows.
         * Documentation : http://doc.babylonjs.com/tutorials/lights
         */
    public DirectionalLight(String name, Vector3 direction, Scene scene){}
    /**
         * Returns the string "DirectionalLight".
         */
    native public String getClassName();
    /**
         * Returns the integer 1.
         */
    native public double getTypeID();
    /**
         * Sets the passed matrix "matrix" as projection matrix for the shadows cast by the light according to the passed view matrix.
         * Returns the DirectionalLight Shadow projection matrix.
         */
    native public void _setDefaultShadowProjectionMatrix(Matrix matrix, Matrix viewMatrix, Array<AbstractMesh> renderList);
    /**
         * Sets the passed matrix "matrix" as fixed frustum projection matrix for the shadows cast by the light according to the passed view matrix.
         * Returns the DirectionalLight Shadow projection matrix.
         */
    native public void _setDefaultFixedFrustumShadowProjectionMatrix(Matrix matrix, Matrix viewMatrix);
    /**
         * Sets the passed matrix "matrix" as auto extend projection matrix for the shadows cast by the light according to the passed view matrix.
         * Returns the DirectionalLight Shadow projection matrix.
         */
    native public void _setDefaultAutoExtendShadowProjectionMatrix(Matrix matrix, Matrix viewMatrix, Array<AbstractMesh> renderList);
    native public void _buildUniformLayout();
    /**
         * Sets the passed Effect object with the DirectionalLight transformed position (or position if not parented) and the passed name.
         * Returns the DirectionalLight.
         */
    native public DirectionalLight transferToEffect(Effect effect, String lightIndex);
    /**
         * Gets the minZ used for shadow according to both the scene and the light.
         *
         * Values are fixed on directional lights as it relies on an ortho projection hence the need to convert being
         * -1 and 1 to 0 and 1 doing (depth + min) / (min + max) -> (depth + 1) / (1 + 1) -> (depth * 0.5) + 0.5.
         * @param activeCamera
         */
    native public double getDepthMinZ(Camera activeCamera);
    /**
         * Gets the maxZ used for shadow according to both the scene and the light.
         *
         * Values are fixed on directional lights as it relies on an ortho projection hence the need to convert being
         * -1 and 1 to 0 and 1 doing (depth + min) / (min + max) -> (depth + 1) / (1 + 1) -> (depth * 0.5) + 0.5.
         * @param activeCamera
         */
    native public double getDepthMaxZ(Camera activeCamera);
    /**
         * Sets the passed matrix "matrix" as projection matrix for the shadows cast by the light according to the passed view matrix.
         * Returns the DirectionalLight Shadow projection matrix.
         */
    native public void _setDefaultShadowProjectionMatrix(Matrix matrix, Matrix viewMatrix, AbstractMesh[] renderList);
    /**
         * Sets the passed matrix "matrix" as auto extend projection matrix for the shadows cast by the light according to the passed view matrix.
         * Returns the DirectionalLight Shadow projection matrix.
         */
    native public void _setDefaultAutoExtendShadowProjectionMatrix(Matrix matrix, Matrix viewMatrix, AbstractMesh[] renderList);
    protected DirectionalLight(){}
}

