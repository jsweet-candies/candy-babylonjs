package def.babylonjs.babylon;
public class HemisphericLight extends Light {
    public Color3 groundColor;
    public Vector3 direction;
    /**
         * Creates a HemisphericLight object in the scene according to the passed direction (Vector3).
         * The HemisphericLight simulates the ambient environment light, so the passed direction is the light reflection direction, not the incoming direction.
         * The HemisphericLight can't cast shadows.
         * Documentation : http://doc.babylonjs.com/tutorials/lights
         */
    public HemisphericLight(String name, Vector3 direction, Scene scene){}
    native public void _buildUniformLayout();
    /**
         * Returns the string "HemisphericLight".
         */
    native public String getClassName();
    /**
         * Sets the HemisphericLight direction towards the passed target (Vector3).
         * Returns the updated direction.
         */
    native public Vector3 setDirectionToTarget(Vector3 target);
    native public ShadowGenerator getShadowGenerator();
    native public Matrix _getWorldMatrix();
    /**
         * Returns the integer 3.
         */
    native public double getTypeID();
    protected HemisphericLight(){}
}

