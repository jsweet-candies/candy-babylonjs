package def.babylonjs.babylon;
import def.js.Array;
@jsweet.lang.Extends({IShadowLight.class})
public class ShadowLight extends Light {
    public Matrix viewMatrix;
    public Vector3 position;
    public Vector3 _direction;
    public Vector3 direction;
    public double shadowMinZ;
    public double shadowMaxZ;
    public jsweet.util.function.TriConsumer<Matrix,Array<AbstractMesh>,Matrix> customProjectionMatrixBuilder;
    public Vector3 transformedPosition;
    public Vector3 transformedDirection;
    /**
         * Returns the DirectionalLight absolute position in the World.
         */
    native public Vector3 getAbsolutePosition();
    /**
         * Sets the DirectionalLight direction toward the passed target (Vector3).
         * Returns the updated DirectionalLight direction (Vector3).
         */
    native public Vector3 setDirectionToTarget(Vector3 target);
    /**
         * Returns the light rotation (Vector3).
         */
    native public Vector3 getRotation();
    /**
         * Get the world matrix of the sahdow lights.
         */
    native public Matrix _getWorldMatrix();
    public String id;
    public String name;
    native public Boolean computeTransformedInformation();
    native public Scene getScene();
    native public IShadowLight setShadowProjectionMatrix(Matrix matrix, Matrix viewMatrix, Array<AbstractMesh> renderList);
    native public double getDepthScale();
    native public Boolean needCube();
    native public Boolean needProjectionMatrixCompute();
    native public void forceProjectionMatrixCompute();
    native public Vector3 getShadowDirection(double faceIndex);
    /**
         * Gets the minZ used for shadow according to both the scene and the light.
         * @param activeCamera
         */
    native public double getDepthMinZ(Camera activeCamera);
    /**
         * Gets the minZ used for shadow according to both the scene and the light.
         * @param activeCamera
         */
    native public double getDepthMaxZ(Camera activeCamera);
    /**
         * Returns the light direction (Vector3) for any passed face index.
         */
    native public Vector3 getShadowDirection();
    /**
         * Sets the projection matrix according to the type of light and custom projection matrix definition.
         * Returns the light.
         */
    native public IShadowLight setShadowProjectionMatrix(Matrix matrix, Matrix viewMatrix, AbstractMesh[] renderList);
}

