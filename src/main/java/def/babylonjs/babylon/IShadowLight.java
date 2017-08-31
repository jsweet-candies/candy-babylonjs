package def.babylonjs.babylon;
import def.js.Array;
@jsweet.lang.Interface
public abstract class IShadowLight extends Light {
    public String id;
    public Vector3 position;
    public Vector3 direction;
    public Vector3 transformedPosition;
    public Vector3 transformedDirection;
    public String name;
    public double shadowMinZ;
    public double shadowMaxZ;
    native public Boolean computeTransformedInformation();
    native public Scene getScene();
    public jsweet.util.function.TriConsumer<Matrix,Array<AbstractMesh>,Matrix> customProjectionMatrixBuilder;
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
    native public Vector3 getShadowDirection();
    native public IShadowLight setShadowProjectionMatrix(Matrix matrix, Matrix viewMatrix, AbstractMesh[] renderList);
}

