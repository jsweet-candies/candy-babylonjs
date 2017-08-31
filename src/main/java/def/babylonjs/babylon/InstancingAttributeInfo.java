package def.babylonjs.babylon;
public class InstancingAttributeInfo extends def.js.Object {
    /**
         * Index/offset of the attribute in the vertex shader
         */
    public double index;
    /**
         * size of the attribute, 1, 2, 3 or 4
         */
    public double attributeSize;
    /**
         * type of the attribute, gl.BYTE, gl.UNSIGNED_BYTE, gl.SHORT, gl.UNSIGNED_SHORT, gl.FIXED, gl.FLOAT.
         * default is FLOAT
         */
    public double attribyteType;
    /**
         * normalization of fixed-point data. behavior unclear, use FALSE, default is FALSE
         */
    public Boolean normalized;
    /**
         * Offset of the data in the Vertex Buffer acting as the instancing buffer
         */
    public double offset;
    /**
         * Name of the GLSL attribute, for debugging purpose only
         */
    public String attributeName;
}

