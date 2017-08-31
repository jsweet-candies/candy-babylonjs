package def.babylonjs.babylon;
import def.js.Array;
public class SpotLight extends ShadowLight {
    public double angle;
    /**
         * Allows scaling the angle of the light for shadow generation only.
         */
    public double shadowAngleScale;
    public double exponent;
    /**
         * Creates a SpotLight object in the scene with the passed parameters :
         * - `position` (Vector3) is the initial SpotLight position,
         * - `direction` (Vector3) is the initial SpotLight direction,
         * - `angle` (float, in radians) is the spot light cone angle,
         * - `exponent` (float) is the light decay speed with the distance from the emission spot.
         * A spot light is a simply light oriented cone.
         * It can cast shadows.
         * Documentation : http://doc.babylonjs.com/tutorials/lights
         */
    public SpotLight(String name, Vector3 position, Vector3 direction, double angle, double exponent, Scene scene){}
    /**
         * Returns the string "SpotLight".
         */
    native public String getClassName();
    /**
         * Returns the integer 2.
         */
    native public double getTypeID();
    /**
         * Sets the passed matrix "matrix" as perspective projection matrix for the shadows and the passed view matrix with the fov equal to the SpotLight angle and and aspect ratio of 1.0.
         * Returns the SpotLight.
         */
    native public void _setDefaultShadowProjectionMatrix(Matrix matrix, Matrix viewMatrix, Array<AbstractMesh> renderList);
    native public void _buildUniformLayout();
    /**
         * Sets the passed matrix "matrix" as perspective projection matrix for the shadows and the passed view matrix with the fov equal to the SpotLight angle and and aspect ratio of 1.0.
         * Returns the SpotLight.
         */
    native public void _setDefaultShadowProjectionMatrix(Matrix matrix, Matrix viewMatrix, AbstractMesh[] renderList);
    protected SpotLight(){}
}

