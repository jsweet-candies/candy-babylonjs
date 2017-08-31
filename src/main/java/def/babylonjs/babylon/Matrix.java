package def.babylonjs.babylon;
import def.js.Float32Array;
import def.js.ArrayLike;
public class Matrix extends def.js.Object {
    public double updateFlag;
    public Float32Array m;
    native public void _markAsUpdated();
    public Matrix(){}
    /**
         * Boolean : True is the matrix is the identity matrix
         */
    native public Boolean isIdentity(Boolean considerAsTextureMatrix);
    /**
         * Returns the matrix determinant (float).
         */
    native public double determinant();
    /**
         * Returns the matrix underlying array.
         */
    native public Float32Array toArray();
    /**
        * Returns the matrix underlying array.
        */
    native public Float32Array asArray();
    /**
         * Inverts in place the Matrix.
         * Returns the Matrix inverted.
         */
    native public Matrix invert();
    /**
         * Sets all the matrix elements to zero.
         * Returns the Matrix.
         */
    native public Matrix reset();
    /**
         * Returns a new Matrix as the addition result of the current Matrix and the passed one.
         */
    native public Matrix add(Matrix other);
    /**
         * Sets the passed matrix "result" with the ddition result of the current Matrix and the passed one.
         * Returns the Matrix.
         */
    native public Matrix addToRef(Matrix other, Matrix result);
    /**
         * Adds in place the passed matrix to the current Matrix.
         * Returns the updated Matrix.
         */
    native public Matrix addToSelf(Matrix other);
    /**
         * Sets the passed matrix with the current inverted Matrix.
         * Returns the unmodified current Matrix.
         */
    native public Matrix invertToRef(Matrix other);
    /**
         * Inserts the translation vector (using 3 x floats) in the current Matrix.
         * Returns the updated Matrix.
         */
    native public Matrix setTranslationFromFloats(double x, double y, double z);
    /**
 * Inserts the translation vector in the current Matrix.
 * Returns the updated Matrix.
 */
    native public Matrix setTranslation(Vector3 vector3);
    /**
         * Returns a new Vector3 as the extracted translation from the Matrix.
         */
    native public Vector3 getTranslation();
    /**
         * Fill a Vector3 with the extracted translation from the Matrix.
         */
    native public Matrix getTranslationToRef(Vector3 result);
    /**
         * Remove rotation and scaling part from the Matrix.
         * Returns the updated Matrix.
         */
    native public Matrix removeRotationAndScaling();
    /**
         * Returns a new Matrix set with the multiplication result of the current Matrix and the passed one.
         */
    native public Matrix multiply(Matrix other);
    /**
         * Updates the current Matrix from the passed one values.
         * Returns the updated Matrix.
         */
    native public Matrix copyFrom(Matrix other);
    /**
         * Populates the passed array from the starting index with the Matrix values.
         * Returns the Matrix.
         */
    native public Matrix copyToArray(Float32Array array, double offset);
    /**
         * Sets the passed matrix "result" with the multiplication result of the current Matrix and the passed one.
         */
    native public Matrix multiplyToRef(Matrix other, Matrix result);
    /**
         * Sets the Float32Array "result" from the passed index "offset" with the multiplication result of the current Matrix and the passed one.
         */
    native public Matrix multiplyToArray(Matrix other, Float32Array result, double offset);
    /**
         * Boolean : True is the current Matrix and the passed one values are strictly equal.
         */
    @jsweet.lang.Name("equals")
    native public Boolean Equals(Matrix value);
    /**
         * Returns a new Matrix from the current Matrix.
         */
    @jsweet.lang.Name("clone")
    native public Matrix Clone();
    /**
         * Returns the string "Matrix"
         */
    native public String getClassName();
    /**
         * Returns the Matrix hash code.
         */
    native public double getHashCode();
    /**
         * Decomposes the current Matrix into :
         * - a scale vector3 passed as a reference to update,
         * - a rotation quaternion passed as a reference to update,
         * - a translation vector3 passed as a reference to update.
         * Returns the boolean `true`.
         */
    native public Boolean decompose(Vector3 scale, Quaternion rotation, Vector3 translation);
    /**
         * Returns a new Matrix as the extracted rotation matrix from the current one.
         */
    native public Matrix getRotationMatrix();
    /**
         * Extracts the rotation matrix from the current one and sets it as the passed "result".
         * Returns the current Matrix.
         */
    native public Matrix getRotationMatrixToRef(Matrix result);
    /**
         * Returns a new Matrix set from the starting index of the passed array.
         */
    native public static Matrix FromArray(ArrayLike<Double> array, double offset);
    /**
         * Sets the passed "result" matrix from the starting index of the passed array.
         */
    native public static void FromArrayToRef(ArrayLike<Double> array, double offset, Matrix result);
    /**
         * Sets the passed "result" matrix from the starting index of the passed Float32Array by multiplying each element by the float "scale".
         */
    native public static void FromFloat32ArrayToRefScaled(Float32Array array, double offset, double scale, Matrix result);
    /**
         * Sets the passed matrix "result" with the 16 passed floats.
         */
    native public static void FromValuesToRef(double initialM11, double initialM12, double initialM13, double initialM14, double initialM21, double initialM22, double initialM23, double initialM24, double initialM31, double initialM32, double initialM33, double initialM34, double initialM41, double initialM42, double initialM43, double initialM44, Matrix result);
    /**
         * Returns the index-th row of the current matrix as a new Vector4.
         */
    native public Vector4 getRow(double index);
    /**
         * Sets the index-th row of the current matrix with the passed Vector4 values.
         * Returns the updated Matrix.
         */
    native public Matrix setRow(double index, Vector4 row);
    /**
         * Sets the index-th row of the current matrix with the passed 4 x float values.
         * Returns the updated Matrix.
         */
    native public Matrix setRowFromFloats(double index, double x, double y, double z, double w);
    /**
         * Returns a new Matrix set from the 16 passed floats.
         */
    native public static Matrix FromValues(double initialM11, double initialM12, double initialM13, double initialM14, double initialM21, double initialM22, double initialM23, double initialM24, double initialM31, double initialM32, double initialM33, double initialM34, double initialM41, double initialM42, double initialM43, double initialM44);
    /**
         * Returns a new Matrix composed by the passed scale (vector3), rotation (quaternion) and translation (vector3).
         */
    native public static Matrix Compose(Vector3 scale, Quaternion rotation, Vector3 translation);
    /**
       * Update a Matrix with values composed by the passed scale (vector3), rotation (quaternion) and translation (vector3).
       */
    native public static void ComposeToRef(Vector3 scale, Quaternion rotation, Vector3 translation, Matrix result);
    /**
         * Returns a new indentity Matrix.
         */
    native public static Matrix Identity();
    /**
         * Sets the passed "result" as an identity matrix.
         */
    native public static void IdentityToRef(Matrix result);
    /**
         * Returns a new zero Matrix.
         */
    native public static Matrix Zero();
    /**
         * Returns a new rotation matrix for "angle" radians around the X axis.
         */
    native public static Matrix RotationX(double angle);
    /**
         * Returns a new Matrix as the passed inverted one.
         */
    native public static Matrix Invert(Matrix source);
    /**
         * Sets the passed matrix "result" as a rotation matrix for "angle" radians around the X axis.
         */
    native public static void RotationXToRef(double angle, Matrix result);
    /**
         * Returns a new rotation matrix for "angle" radians around the Y axis.
         */
    native public static Matrix RotationY(double angle);
    /**
         * Sets the passed matrix "result" as a rotation matrix for "angle" radians around the Y axis.
         */
    native public static void RotationYToRef(double angle, Matrix result);
    /**
         * Returns a new rotation matrix for "angle" radians around the Z axis.
         */
    native public static Matrix RotationZ(double angle);
    /**
         * Sets the passed matrix "result" as a rotation matrix for "angle" radians around the Z axis.
         */
    native public static void RotationZToRef(double angle, Matrix result);
    /**
         * Returns a new rotation matrix for "angle" radians around the passed axis.
         */
    native public static Matrix RotationAxis(Vector3 axis, double angle);
    /**
         * Sets the passed matrix "result" as a rotation matrix for "angle" radians around the passed axis.
         */
    native public static void RotationAxisToRef(Vector3 axis, double angle, Matrix result);
    /**
         * Returns a new Matrix as a rotation matrix from the Euler angles (y, x, z).
         */
    native public static Matrix RotationYawPitchRoll(double yaw, double pitch, double roll);
    /**
         * Sets the passed matrix "result" as a rotation matrix from the Euler angles (y, x, z).
         */
    native public static void RotationYawPitchRollToRef(double yaw, double pitch, double roll, Matrix result);
    /**
         * Returns a new Matrix as a scaling matrix from the passed floats (x, y, z).
         */
    native public static Matrix Scaling(double x, double y, double z);
    /**
         * Sets the passed matrix "result" as a scaling matrix from the passed floats (x, y, z).
         */
    native public static void ScalingToRef(double x, double y, double z, Matrix result);
    /**
         * Returns a new Matrix as a translation matrix from the passed floats (x, y, z).
         */
    native public static Matrix Translation(double x, double y, double z);
    /**
         * Sets the passed matrix "result" as a translation matrix from the passed floats (x, y, z).
         */
    native public static void TranslationToRef(double x, double y, double z, Matrix result);
    /**
         * Returns a new Matrix whose values are the interpolated values for "gradien" (float) between the ones of the matrices "startValue" and "endValue".
         */
    native public static Matrix Lerp(Matrix startValue, Matrix endValue, double gradient);
    /**
         * Returns a new Matrix whose values are computed by :
         * - decomposing the the "startValue" and "endValue" matrices into their respective scale, rotation and translation matrices,
         * - interpolating for "gradient" (float) the values between each of these decomposed matrices between the start and the end,
         * - recomposing a new matrix from these 3 interpolated scale, rotation and translation matrices.
         */
    native public static Matrix DecomposeLerp(Matrix startValue, Matrix endValue, double gradient);
    /**
         * Returns a new rotation Matrix used to rotate a mesh so as it looks at the target Vector3, from the eye Vector3, the UP vector3 being orientated like "up".
         * This methods works for a Left-Handed system.
         */
    native public static Matrix LookAtLH(Vector3 eye, Vector3 target, Vector3 up);
    /**
         * Sets the passed "result" Matrix as a rotation matrix used to rotate a mesh so as it looks at the target Vector3, from the eye Vector3, the UP vector3 being orientated like "up".
         * This methods works for a Left-Handed system.
         */
    native public static void LookAtLHToRef(Vector3 eye, Vector3 target, Vector3 up, Matrix result);
    /**
         * Returns a new rotation Matrix used to rotate a mesh so as it looks at the target Vector3, from the eye Vector3, the UP vector3 being orientated like "up".
         * This methods works for a Right-Handed system.
         */
    native public static Matrix LookAtRH(Vector3 eye, Vector3 target, Vector3 up);
    /**
         * Sets the passed "result" Matrix as a rotation matrix used to rotate a mesh so as it looks at the target Vector3, from the eye Vector3, the UP vector3 being orientated like "up".
         * This methods works for a Left-Handed system.
         */
    native public static void LookAtRHToRef(Vector3 eye, Vector3 target, Vector3 up, Matrix result);
    /**
         * Returns a new Matrix as a left-handed orthographic projection matrix computed from the passed floats : width and height of the projection plane, z near and far limits.
         */
    native public static Matrix OrthoLH(double width, double height, double znear, double zfar);
    /**
         * Sets the passed matrix "result" as a left-handed orthographic projection matrix computed from the passed floats : width and height of the projection plane, z near and far limits.
         */
    native public static void OrthoLHToRef(double width, double height, double znear, double zfar, Matrix result);
    /**
         * Returns a new Matrix as a left-handed orthographic projection matrix computed from the passed floats : left, right, top and bottom being the coordinates of the projection plane, z near and far limits.
         */
    native public static Matrix OrthoOffCenterLH(double left, double right, double bottom, double top, double znear, double zfar);
    /**
         * Sets the passed matrix "result" as a left-handed orthographic projection matrix computed from the passed floats : left, right, top and bottom being the coordinates of the projection plane, z near and far limits.
         */
    native public static void OrthoOffCenterLHToRef(double left, double right, double bottom, double top, double znear, double zfar, Matrix result);
    /**
         * Returns a new Matrix as a right-handed orthographic projection matrix computed from the passed floats : left, right, top and bottom being the coordinates of the projection plane, z near and far limits.
         */
    native public static Matrix OrthoOffCenterRH(double left, double right, double bottom, double top, double znear, double zfar);
    /**
         * Sets the passed matrix "result" as a right-handed orthographic projection matrix computed from the passed floats : left, right, top and bottom being the coordinates of the projection plane, z near and far limits.
         */
    native public static void OrthoOffCenterRHToRef(double left, Object right, double bottom, double top, double znear, double zfar, Matrix result);
    /**
         * Returns a new Matrix as a left-handed perspective projection matrix computed from the passed floats : width and height of the projection plane, z near and far limits.
         */
    native public static Matrix PerspectiveLH(double width, double height, double znear, double zfar);
    /**
         * Returns a new Matrix as a left-handed perspective projection matrix computed from the passed floats : vertical angle of view (fov), width/height ratio (aspect), z near and far limits.
         */
    native public static Matrix PerspectiveFovLH(double fov, double aspect, double znear, double zfar);
    /**
         * Sets the passed matrix "result" as a left-handed perspective projection matrix computed from the passed floats : vertical angle of view (fov), width/height ratio (aspect), z near and far limits.
         */
    native public static void PerspectiveFovLHToRef(double fov, double aspect, double znear, double zfar, Matrix result, Boolean isVerticalFovFixed);
    /**
         * Returns a new Matrix as a right-handed perspective projection matrix computed from the passed floats : vertical angle of view (fov), width/height ratio (aspect), z near and far limits.
         */
    native public static Matrix PerspectiveFovRH(double fov, double aspect, double znear, double zfar);
    /**
         * Sets the passed matrix "result" as a right-handed perspective projection matrix computed from the passed floats : vertical angle of view (fov), width/height ratio (aspect), z near and far limits.
         */
    native public static void PerspectiveFovRHToRef(double fov, double aspect, double znear, double zfar, Matrix result, Boolean isVerticalFovFixed);
    /**
         * Sets the passed matrix "result" as a left-handed perspective projection matrix  for WebVR computed from the passed floats : vertical angle of view (fov), width/height ratio (aspect), z near and far limits.
         */
    native public static void PerspectiveFovWebVRToRef(Object fov, double znear, double zfar, Matrix result, Boolean rightHanded);
    /**
         * Returns the final transformation matrix : world * view * projection * viewport
         */
    native public static Matrix GetFinalMatrix(Viewport viewport, Matrix world, Matrix view, Matrix projection, double zmin, double zmax);
    /**
         * Returns a new Float32Array array with 4 elements : the 2x2 matrix extracted from the passed Matrix.
         */
    native public static Float32Array GetAsMatrix2x2(Matrix matrix);
    /**
         * Returns a new Float32Array array with 9 elements : the 3x3 matrix extracted from the passed Matrix.
         */
    native public static Float32Array GetAsMatrix3x3(Matrix matrix);
    /**
         * Compute the transpose of the passed Matrix.
         * Returns a new Matrix.
         */
    native public static Matrix Transpose(Matrix matrix);
    /**
         * Returns a new Matrix as the reflection  matrix across the passed plane.
         */
    native public static Matrix Reflection(Plane plane);
    /**
         * Sets the passed matrix "result" as the reflection matrix across the passed plane.
         */
    native public static void ReflectionToRef(Plane plane, Matrix result);
    /**
         * Sets the passed matrix "mat" as a rotation matrix composed from the 3 passed  left handed axis.
         */
    native public static void FromXYZAxesToRef(Vector3 xaxis, Vector3 yaxis, Vector3 zaxis, Matrix result);
    /**
         * Sets the passed matrix "result" as a rotation matrix according to the passed quaternion.
         */
    native public static void FromQuaternionToRef(Quaternion quat, Matrix result);
    /**
         * Boolean : True is the matrix is the identity matrix
         */
    native public Boolean isIdentity();
    /**
         * Populates the passed array from the starting index with the Matrix values.
         * Returns the Matrix.
         */
    native public Matrix copyToArray(Float32Array array);
    /**
         * Returns a new Matrix set from the starting index of the passed array.
         */
    native public static Matrix FromArray(ArrayLike<Double> array);
    /**
         * Sets the passed matrix "result" as a left-handed perspective projection matrix computed from the passed floats : vertical angle of view (fov), width/height ratio (aspect), z near and far limits.
         */
    native public static void PerspectiveFovLHToRef(double fov, double aspect, double znear, double zfar, Matrix result);
    /**
         * Sets the passed matrix "result" as a right-handed perspective projection matrix computed from the passed floats : vertical angle of view (fov), width/height ratio (aspect), z near and far limits.
         */
    native public static void PerspectiveFovRHToRef(double fov, double aspect, double znear, double zfar, Matrix result);
    /**
         * Sets the passed matrix "result" as a left-handed perspective projection matrix  for WebVR computed from the passed floats : vertical angle of view (fov), width/height ratio (aspect), z near and far limits.
         */
    native public static void PerspectiveFovWebVRToRef(Object fov, double znear, double zfar, Matrix result);
    /**
         * Returns a new Matrix set from the starting index of the passed array.
         */
    native public static Matrix FromArray(Double[] array, double offset);
    /**
         * Sets the passed "result" matrix from the starting index of the passed array.
         */
    native public static void FromArrayToRef(Double[] array, double offset, Matrix result);
    /**
         * Returns a new Matrix set from the starting index of the passed array.
         */
    native public static Matrix FromArray(Double[] array);
}

