package def.babylonjs.babylon;
import def.js.Float32Array;
import jsweet.util.function.Consumer4;
import jsweet.util.function.Consumer5;
import jsweet.util.function.Consumer6;
import def.dom.WebGLBuffer;
public class UniformBuffer extends def.js.Object {
    /**
         * Wrapper for updateUniform.
         * @method updateMatrix3x3
         * @param {string} name Name of the uniform, as used in the uniform block in the shader.
         * @param {Float32Array} matrix
         */
    public java.util.function.BiConsumer<String,Float32Array> updateMatrix3x3;
    /**
         * Wrapper for updateUniform.
         * @param {string} name Name of the uniform, as used in the uniform block in the shader.
         * @param {Float32Array} matrix
         */
    public java.util.function.BiConsumer<String,Float32Array> updateMatrix2x2;
    /**
         * Wrapper for updateUniform.
         * @param {string} name Name of the uniform, as used in the uniform block in the shader.
         * @param {number} x
         */
    public java.util.function.BiConsumer<String,Double> updateFloat;
    /**
         * Wrapper for updateUniform.
         * @param {string} name Name of the uniform, as used in the uniform block in the shader.
         * @param {number} x
         * @param {number} y
         * @param {string} [suffix] Suffix to add to the uniform name.
         */
    public Consumer4<String,Double,Double,String> updateFloat2;
    /**
         * Wrapper for updateUniform.
         * @param {string} name Name of the uniform, as used in the uniform block in the shader.
         * @param {number} x
         * @param {number} y
         * @param {number} z
         * @param {string} [suffix] Suffix to add to the uniform name.
         */
    public Consumer5<String,Double,Double,Double,String> updateFloat3;
    /**
         * Wrapper for updateUniform.
         * @param {string} name Name of the uniform, as used in the uniform block in the shader.
         * @param {number} x
         * @param {number} y
         * @param {number} z
         * @param {number} w
         * @param {string} [suffix] Suffix to add to the uniform name.
         */
    public Consumer6<String,Double,Double,Double,Double,String> updateFloat4;
    /**
         * Wrapper for updateUniform.
         * @param {string} name Name of the uniform, as used in the uniform block in the shader.
         * @param {Matrix} A 4x4 matrix.
         */
    public java.util.function.BiConsumer<String,Matrix> updateMatrix;
    /**
         * Wrapper for updateUniform.
         * @param {string} name Name of the uniform, as used in the uniform block in the shader.
         * @param {Vector3} vector
         */
    public java.util.function.BiConsumer<String,Vector3> updateVector3;
    /**
         * Wrapper for updateUniform.
         * @param {string} name Name of the uniform, as used in the uniform block in the shader.
         * @param {Vector4} vector
         */
    public java.util.function.BiConsumer<String,Vector4> updateVector4;
    /**
         * Wrapper for updateUniform.
         * @param {string} name Name of the uniform, as used in the uniform block in the shader.
         * @param {Color3} color
         * @param {string} [suffix] Suffix to add to the uniform name.
         */
    public jsweet.util.function.TriConsumer<String,Color3,String> updateColor3;
    /**
         * Wrapper for updateUniform.
         * @param {string} name Name of the uniform, as used in the uniform block in the shader.
         * @param {Color3} color
         * @param {number} alpha
         * @param {string} [suffix] Suffix to add to the uniform name.
         */
    public Consumer4<String,Color3,Double,String> updateColor4;
    /**
         * Uniform buffer objects.
         *
         * Handles blocks of uniform on the GPU.
         *
         * If WebGL 2 is not available, this class falls back on traditionnal setUniformXXX calls.
         *
         * For more information, please refer to :
         * https://www.khronos.org/opengl/wiki/Uniform_Buffer_Object
         */
    public UniformBuffer(Engine engine, double[] data, Boolean dynamic){}
    /**
         * Indicates if the buffer is using the WebGL2 UBO implementation,
         * or just falling back on setUniformXXX calls.
         */
    public final Boolean useUbo=null;
    /**
         * Indicates if the WebGL underlying uniform buffer is in sync
         * with the javascript cache data.
         */
    public final Boolean isSync=null;
    /**
         * Indicates if the WebGL underlying uniform buffer is dynamic.
         * Also, a dynamic UniformBuffer will disable cache verification and always
         * update the underlying WebGL uniform buffer to the GPU.
         */
    native public Boolean isDynamic();
    /**
         * The data cache on JS side.
         */
    native public Float32Array getData();
    /**
         * The underlying WebGL Uniform buffer.
         */
    native public WebGLBuffer getBuffer();
    /**
         * Adds an uniform in the buffer.
         * Warning : the subsequents calls of this function must be in the same order as declared in the shader
         * for the layout to be correct !
         * @param {string} name Name of the uniform, as used in the uniform block in the shader.
         * @param {number|number[]} size Data size, or data directly.
         */
    native public void addUniform(String name, double size);
    /**
         * Wrapper for addUniform.
         * @param {string} name Name of the uniform, as used in the uniform block in the shader.
         * @param {Matrix} mat A 4x4 matrix.
         */
    native public void addMatrix(String name, Matrix mat);
    /**
         * Wrapper for addUniform.
         * @param {string} name Name of the uniform, as used in the uniform block in the shader.
         * @param {number} x
         * @param {number} y
         */
    native public void addFloat2(String name, double x, double y);
    /**
         * Wrapper for addUniform.
         * @param {string} name Name of the uniform, as used in the uniform block in the shader.
         * @param {number} x
         * @param {number} y
         * @param {number} z
         */
    native public void addFloat3(String name, double x, double y, double z);
    /**
         * Wrapper for addUniform.
         * @param {string} name Name of the uniform, as used in the uniform block in the shader.
         * @param {Color3} color
         */
    native public void addColor3(String name, Color3 color);
    /**
         * Wrapper for addUniform.
         * @param {string} name Name of the uniform, as used in the uniform block in the shader.
         * @param {Color3} color
         * @param {number} alpha
         */
    native public void addColor4(String name, Color3 color, double alpha);
    /**
         * Wrapper for addUniform.
         * @param {string} name Name of the uniform, as used in the uniform block in the shader.
         * @param {Vector3} vector
         */
    native public void addVector3(String name, Vector3 vector);
    /**
         * Wrapper for addUniform.
         * @param {string} name Name of the uniform, as used in the uniform block in the shader.
         */
    native public void addMatrix3x3(String name);
    /**
         * Wrapper for addUniform.
         * @param {string} name Name of the uniform, as used in the uniform block in the shader.
         */
    native public void addMatrix2x2(String name);
    /**
         * Effectively creates the WebGL Uniform Buffer, once layout is completed with `addUniform`.
         */
    native public void create();
    /**
         * Updates the WebGL Uniform Buffer on the GPU.
         * If the `dynamic` flag is set to true, no cache comparison is done.
         * Otherwise, the buffer will be updated only if the cache differs.
         */
    native public void update();
    /**
         * Updates the value of an uniform. The `update` method must be called afterwards to make it effective in the GPU.
         * @param {string} uniformName Name of the uniform, as used in the uniform block in the shader.
         * @param {number[]|Float32Array} data Flattened data
         * @param {number} size Size of the data.
         */
    native public void updateUniform(String uniformName, double[] data, double size);
    /**
         * Sets a sampler uniform on the effect.
         * @param {string} name Name of the sampler.
         * @param {Texture} texture
         */
    native public void setTexture(String name, BaseTexture texture);
    /**
         * Directly updates the value of the uniform in the cache AND on the GPU.
         * @param {string} uniformName Name of the uniform, as used in the uniform block in the shader.
         * @param {number[]|Float32Array} data Flattened data
         */
    native public void updateUniformDirectly(String uniformName, double[] data);
    /**
         * Binds this uniform buffer to an effect.
         * @param {Effect} effect
         * @param {string} name Name of the uniform block in the shader.
         */
    native public void bindToEffect(Effect effect, String name);
    /**
         * Disposes the uniform buffer.
         */
    native public void dispose();
    /**
         * Uniform buffer objects.
         *
         * Handles blocks of uniform on the GPU.
         *
         * If WebGL 2 is not available, this class falls back on traditionnal setUniformXXX calls.
         *
         * For more information, please refer to :
         * https://www.khronos.org/opengl/wiki/Uniform_Buffer_Object
         */
    public UniformBuffer(Engine engine, double[] data){}
    /**
         * Uniform buffer objects.
         *
         * Handles blocks of uniform on the GPU.
         *
         * If WebGL 2 is not available, this class falls back on traditionnal setUniformXXX calls.
         *
         * For more information, please refer to :
         * https://www.khronos.org/opengl/wiki/Uniform_Buffer_Object
         */
    public UniformBuffer(Engine engine){}
    /**
         * Adds an uniform in the buffer.
         * Warning : the subsequents calls of this function must be in the same order as declared in the shader
         * for the layout to be correct !
         * @param {string} name Name of the uniform, as used in the uniform block in the shader.
         * @param {number|number[]} size Data size, or data directly.
         */
    native public void addUniform(String name, double[] size);
    /**
         * Updates the value of an uniform. The `update` method must be called afterwards to make it effective in the GPU.
         * @param {string} uniformName Name of the uniform, as used in the uniform block in the shader.
         * @param {number[]|Float32Array} data Flattened data
         * @param {number} size Size of the data.
         */
    native public void updateUniform(String uniformName, Float32Array data, double size);
    /**
         * Directly updates the value of the uniform in the cache AND on the GPU.
         * @param {string} uniformName Name of the uniform, as used in the uniform block in the shader.
         * @param {number[]|Float32Array} data Flattened data
         */
    native public void updateUniformDirectly(String uniformName, Float32Array data);
    native public void updateFloat2(String p1, Double p2, Double p3, String p4);
    native public void updateFloat3(String p1, Double p2, Double p3, Double p4, String p5);
    native public void updateFloat4(String p1, Double p2, Double p3, Double p4, Double p5, String p6);
    native public void updateColor4(String p1, Color3 p2, Double p3, String p4);
    protected UniformBuffer(){}
}

