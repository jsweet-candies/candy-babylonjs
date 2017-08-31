package def.babylonjs.babylon;
import def.js.Array;
public class PointLight extends ShadowLight {
    /**
         * Setter: In case of direction provided, the shadow will not use a cube texture but simulate a spot shadow as a fallback
         * This specifies what angle the shadow will use to be created.
         *
         * It default to 90 degrees to work nicely with the cube texture generation for point lights shadow maps.
         */
    public double shadowAngle;
    /**
         * In case of direction provided, the shadow will not use a cube texture but simulate a spot shadow as a fallback
         */
    public Vector3 direction;
    /**
         * Creates a PointLight object from the passed name and position (Vector3) and adds it in the scene.
         * A PointLight emits the light in every direction.
         * It can cast shadows.
         * If the scene camera is already defined and you want to set your PointLight at the camera position, just set it :
         * ```javascript
         * var pointLight = new BABYLON.PointLight("pl", camera.position, scene);
         * ```
         * Documentation : http://doc.babylonjs.com/tutorials/lights
         */
    public PointLight(String name, Vector3 position, Scene scene){}
    /**
         * Returns the string "PointLight"
         */
    native public String getClassName();
    /**
         * Returns the integer 0.
         */
    native public double getTypeID();
    /**
         * Specifies wether or not the shadowmap should be a cube texture.
         */
    native public Boolean needCube();
    /**
         * Returns a new Vector3 aligned with the PointLight cube system according to the passed cube face index (integer).
         */
    native public Vector3 getShadowDirection(double faceIndex);
    /**
         * Sets the passed matrix "matrix" as a left-handed perspective projection matrix with the following settings :
         * - fov = PI / 2
         * - aspect ratio : 1.0
         * - z-near and far equal to the active camera minZ and maxZ.
         * Returns the PointLight.
         */
    native public void _setDefaultShadowProjectionMatrix(Matrix matrix, Matrix viewMatrix, Array<AbstractMesh> renderList);
    native public void _buildUniformLayout();
    /**
         * Returns a new Vector3 aligned with the PointLight cube system according to the passed cube face index (integer).
         */
    native public Vector3 getShadowDirection();
    /**
         * Sets the passed matrix "matrix" as a left-handed perspective projection matrix with the following settings :
         * - fov = PI / 2
         * - aspect ratio : 1.0
         * - z-near and far equal to the active camera minZ and maxZ.
         * Returns the PointLight.
         */
    native public void _setDefaultShadowProjectionMatrix(Matrix matrix, Matrix viewMatrix, AbstractMesh[] renderList);
    protected PointLight(){}
}

