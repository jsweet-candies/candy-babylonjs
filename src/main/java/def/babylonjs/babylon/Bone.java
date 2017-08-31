package def.babylonjs.babylon;
public class Bone extends Node {
    public String name;
    public Bone[] children;
    public Animation[] animations;
    public double length;
    public Matrix _matrix;
    public Bone(String name, Skeleton skeleton, Bone parentBone, Matrix matrix, Matrix restPose){}
    native public Skeleton getSkeleton();
    native public Bone getParent();
    native public void setParent(Bone parent, Boolean updateDifferenceMatrix);
    native public Matrix getLocalMatrix();
    native public Matrix getBaseMatrix();
    native public Matrix getRestPose();
    native public void returnToRest();
    native public Matrix getWorldMatrix();
    native public Matrix getInvertedAbsoluteTransform();
    native public Matrix getAbsoluteTransform();
    public Vector3 position;
    public Vector3 rotation;
    public Quaternion rotationQuaternion;
    public Vector3 scaling;
    native public void updateMatrix(Matrix matrix, Boolean updateDifferenceMatrix);
    native public void _updateDifferenceMatrix(Matrix rootMatrix);
    native public void markAsDirty();
    native public Boolean copyAnimationRange(Bone source, String rangeName, double frameOffset, Boolean rescaleAsRequired, Vector3 skelDimensionsRatio);
    /**
         * Translate the bone in local or world space.
         * @param vec The amount to translate the bone.
         * @param space The space that the translation is in.
         * @param mesh The mesh that this bone is attached to.  This is only used in world space.
         */
    native public void translate(Vector3 vec, Space space, AbstractMesh mesh);
    /**
         * Set the postion of the bone in local or world space.
         * @param position The position to set the bone.
         * @param space The space that the position is in.
         * @param mesh The mesh that this bone is attached to.  This is only used in world space.
         */
    native public void setPosition(Vector3 position, Space space, AbstractMesh mesh);
    /**
         * Set the absolute postion of the bone (world space).
         * @param position The position to set the bone.
         * @param mesh The mesh that this bone is attached to.
         */
    native public void setAbsolutePosition(Vector3 position, AbstractMesh mesh);
    /**
         * Set the scale of the bone on the x, y and z axes.
         * @param x The scale of the bone on the x axis.
         * @param x The scale of the bone on the y axis.
         * @param z The scale of the bone on the z axis.
         * @param scaleChildren Set this to true if children of the bone should be scaled.
         */
    native public void setScale(double x, double y, double z, Boolean scaleChildren);
    /**
         * Scale the bone on the x, y and z axes.
         * @param x The amount to scale the bone on the x axis.
         * @param x The amount to scale the bone on the y axis.
         * @param z The amount to scale the bone on the z axis.
         * @param scaleChildren Set this to true if children of the bone should be scaled.
         */
    native public void scale(double x, double y, double z, Boolean scaleChildren);
    /**
         * Set the yaw, pitch, and roll of the bone in local or world space.
         * @param yaw The rotation of the bone on the y axis.
         * @param pitch The rotation of the bone on the x axis.
         * @param roll The rotation of the bone on the z axis.
         * @param space The space that the axes of rotation are in.
         * @param mesh The mesh that this bone is attached to.  This is only used in world space.
         */
    native public void setYawPitchRoll(double yaw, double pitch, double roll, Space space, AbstractMesh mesh);
    /**
         * Rotate the bone on an axis in local or world space.
         * @param axis The axis to rotate the bone on.
         * @param amount The amount to rotate the bone.
         * @param space The space that the axis is in.
         * @param mesh The mesh that this bone is attached to.  This is only used in world space.
         */
    native public void rotate(Vector3 axis, double amount, Space space, AbstractMesh mesh);
    /**
         * Set the rotation of the bone to a particular axis angle in local or world space.
         * @param axis The axis to rotate the bone on.
         * @param angle The angle that the bone should be rotated to.
         * @param space The space that the axis is in.
         * @param mesh The mesh that this bone is attached to.  This is only used in world space.
         */
    native public void setAxisAngle(Vector3 axis, double angle, Space space, AbstractMesh mesh);
    /**
         * Set the euler rotation of the bone in local of world space.
         * @param rotation The euler rotation that the bone should be set to.
         * @param space The space that the rotation is in.
         * @param mesh The mesh that this bone is attached to.  This is only used in world space.
         */
    native public void setRotation(Vector3 rotation, Space space, AbstractMesh mesh);
    /**
         * Set the quaternion rotation of the bone in local of world space.
         * @param quat The quaternion rotation that the bone should be set to.
         * @param space The space that the rotation is in.
         * @param mesh The mesh that this bone is attached to.  This is only used in world space.
         */
    native public void setRotationQuaternion(Quaternion quat, Space space, AbstractMesh mesh);
    /**
         * Set the rotation matrix of the bone in local of world space.
         * @param rotMat The rotation matrix that the bone should be set to.
         * @param space The space that the rotation is in.
         * @param mesh The mesh that this bone is attached to.  This is only used in world space.
         */
    native public void setRotationMatrix(Matrix rotMat, Space space, AbstractMesh mesh);
    /**
         * Get the scale of the bone
         * @returns the scale of the bone
         */
    native public Vector3 getScale();
    /**
         * Copy the scale of the bone to a vector3.
         * @param result The vector3 to copy the scale to
         */
    native public void getScaleToRef(Vector3 result);
    /**
         * Get the position of the bone in local or world space.
         * @param space The space that the returned position is in.
         * @param mesh The mesh that this bone is attached to.  This is only used in world space.
         * @returns The position of the bone
         */
    native public Vector3 getPosition(Space space, AbstractMesh mesh);
    /**
         * Copy the position of the bone to a vector3 in local or world space.
         * @param space The space that the returned position is in.
         * @param mesh The mesh that this bone is attached to.  This is only used in world space.
         * @param result The vector3 to copy the position to.
         */
    native public void getPositionToRef(Space space, AbstractMesh mesh, Vector3 result);
    /**
         * Get the absolute position of the bone (world space).
         * @param mesh The mesh that this bone is attached to.
         * @returns The absolute position of the bone
         */
    native public Vector3 getAbsolutePosition(AbstractMesh mesh);
    /**
         * Copy the absolute position of the bone (world space) to the result param.
         * @param mesh The mesh that this bone is attached to.
         * @param result The vector3 to copy the absolute position to.
         */
    native public void getAbsolutePositionToRef(AbstractMesh mesh, Vector3 result);
    /**
         * Compute the absolute transforms of this bone and its children.
         */
    native public void computeAbsoluteTransforms();
    /**
         * Get the world direction from an axis that is in the local space of the bone.
         * @param localAxis The local direction that is used to compute the world direction.
         * @param mesh The mesh that this bone is attached to.
         * @returns The world direction
         */
    native public Vector3 getDirection(Vector3 localAxis, AbstractMesh mesh);
    /**
         * Copy the world direction to a vector3 from an axis that is in the local space of the bone.
         * @param localAxis The local direction that is used to compute the world direction.
         * @param mesh The mesh that this bone is attached to.
         * @param result The vector3 that the world direction will be copied to.
         */
    native public void getDirectionToRef(Vector3 localAxis, AbstractMesh mesh, Vector3 result);
    /**
         * Get the euler rotation of the bone in local or world space.
         * @param space The space that the rotation should be in.
         * @param mesh The mesh that this bone is attached to.  This is only used in world space.
         * @returns The euler rotation
         */
    native public Vector3 getRotation(Space space, AbstractMesh mesh);
    /**
         * Copy the euler rotation of the bone to a vector3.  The rotation can be in either local or world space.
         * @param space The space that the rotation should be in.
         * @param mesh The mesh that this bone is attached to.  This is only used in world space.
         * @param result The vector3 that the rotation should be copied to.
         */
    native public void getRotationToRef(Space space, AbstractMesh mesh, Vector3 result);
    /**
         * Get the quaternion rotation of the bone in either local or world space.
         * @param space The space that the rotation should be in.
         * @param mesh The mesh that this bone is attached to.  This is only used in world space.
         * @returns The quaternion rotation
         */
    native public Quaternion getRotationQuaternion(Space space, AbstractMesh mesh);
    /**
         * Copy the quaternion rotation of the bone to a quaternion.  The rotation can be in either local or world space.
         * @param space The space that the rotation should be in.
         * @param mesh The mesh that this bone is attached to.  This is only used in world space.
         * @param result The quaternion that the rotation should be copied to.
         */
    native public void getRotationQuaternionToRef(Space space, AbstractMesh mesh, Quaternion result);
    /**
         * Get the rotation matrix of the bone in local or world space.
         * @param space The space that the rotation should be in.
         * @param mesh The mesh that this bone is attached to.  This is only used in world space.
         * @returns The rotation matrix
         */
    native public Matrix getRotationMatrix(Space space, AbstractMesh mesh);
    /**
         * Copy the rotation matrix of the bone to a matrix.  The rotation can be in either local or world space.
         * @param space The space that the rotation should be in.
         * @param mesh The mesh that this bone is attached to.  This is only used in world space.
         * @param result The quaternion that the rotation should be copied to.
         */
    native public void getRotationMatrixToRef(Space space, AbstractMesh mesh, Matrix result);
    /**
         * Get the world position of a point that is in the local space of the bone.
         * @param position The local position
         * @param mesh The mesh that this bone is attached to.
         * @returns The world position
         */
    native public Vector3 getAbsolutePositionFromLocal(Vector3 position, AbstractMesh mesh);
    /**
         * Get the world position of a point that is in the local space of the bone and copy it to the result param.
         * @param position The local position
         * @param mesh The mesh that this bone is attached to.
         * @param result The vector3 that the world position should be copied to.
         */
    native public void getAbsolutePositionFromLocalToRef(Vector3 position, AbstractMesh mesh, Vector3 result);
    /**
         * Get the local position of a point that is in world space.
         * @param position The world position
         * @param mesh The mesh that this bone is attached to.
         * @returns The local position
         */
    native public Vector3 getLocalPositionFromAbsolute(Vector3 position, AbstractMesh mesh);
    /**
         * Get the local position of a point that is in world space and copy it to the result param.
         * @param position The world position
         * @param mesh The mesh that this bone is attached to.
         * @param result The vector3 that the local position should be copied to.
         */
    native public void getLocalPositionFromAbsoluteToRef(Vector3 position, AbstractMesh mesh, Vector3 result);
    public Bone(String name, Skeleton skeleton, Bone parentBone, Matrix matrix){}
    public Bone(String name, Skeleton skeleton, Bone parentBone){}
    public Bone(String name, Skeleton skeleton){}
    native public void setParent(Bone parent);
    native public void updateMatrix(Matrix matrix);
    native public void _updateDifferenceMatrix();
    native public Boolean copyAnimationRange(Bone source, String rangeName, double frameOffset, Boolean rescaleAsRequired);
    native public Boolean copyAnimationRange(Bone source, String rangeName, double frameOffset);
    /**
         * Translate the bone in local or world space.
         * @param vec The amount to translate the bone.
         * @param space The space that the translation is in.
         * @param mesh The mesh that this bone is attached to.  This is only used in world space.
         */
    native public void translate(Vector3 vec, Space space);
    /**
         * Translate the bone in local or world space.
         * @param vec The amount to translate the bone.
         * @param space The space that the translation is in.
         * @param mesh The mesh that this bone is attached to.  This is only used in world space.
         */
    native public void translate(Vector3 vec);
    /**
         * Set the postion of the bone in local or world space.
         * @param position The position to set the bone.
         * @param space The space that the position is in.
         * @param mesh The mesh that this bone is attached to.  This is only used in world space.
         */
    native public void setPosition(Vector3 position, Space space);
    /**
         * Set the postion of the bone in local or world space.
         * @param position The position to set the bone.
         * @param space The space that the position is in.
         * @param mesh The mesh that this bone is attached to.  This is only used in world space.
         */
    native public void setPosition(Vector3 position);
    /**
         * Set the absolute postion of the bone (world space).
         * @param position The position to set the bone.
         * @param mesh The mesh that this bone is attached to.
         */
    native public void setAbsolutePosition(Vector3 position);
    /**
         * Set the scale of the bone on the x, y and z axes.
         * @param x The scale of the bone on the x axis.
         * @param x The scale of the bone on the y axis.
         * @param z The scale of the bone on the z axis.
         * @param scaleChildren Set this to true if children of the bone should be scaled.
         */
    native public void setScale(double x, double y, double z);
    /**
         * Scale the bone on the x, y and z axes.
         * @param x The amount to scale the bone on the x axis.
         * @param x The amount to scale the bone on the y axis.
         * @param z The amount to scale the bone on the z axis.
         * @param scaleChildren Set this to true if children of the bone should be scaled.
         */
    native public void scale(double x, double y, double z);
    /**
         * Set the yaw, pitch, and roll of the bone in local or world space.
         * @param yaw The rotation of the bone on the y axis.
         * @param pitch The rotation of the bone on the x axis.
         * @param roll The rotation of the bone on the z axis.
         * @param space The space that the axes of rotation are in.
         * @param mesh The mesh that this bone is attached to.  This is only used in world space.
         */
    native public void setYawPitchRoll(double yaw, double pitch, double roll, Space space);
    /**
         * Set the yaw, pitch, and roll of the bone in local or world space.
         * @param yaw The rotation of the bone on the y axis.
         * @param pitch The rotation of the bone on the x axis.
         * @param roll The rotation of the bone on the z axis.
         * @param space The space that the axes of rotation are in.
         * @param mesh The mesh that this bone is attached to.  This is only used in world space.
         */
    native public void setYawPitchRoll(double yaw, double pitch, double roll);
    /**
         * Rotate the bone on an axis in local or world space.
         * @param axis The axis to rotate the bone on.
         * @param amount The amount to rotate the bone.
         * @param space The space that the axis is in.
         * @param mesh The mesh that this bone is attached to.  This is only used in world space.
         */
    native public void rotate(Vector3 axis, double amount, Space space);
    /**
         * Rotate the bone on an axis in local or world space.
         * @param axis The axis to rotate the bone on.
         * @param amount The amount to rotate the bone.
         * @param space The space that the axis is in.
         * @param mesh The mesh that this bone is attached to.  This is only used in world space.
         */
    native public void rotate(Vector3 axis, double amount);
    /**
         * Set the rotation of the bone to a particular axis angle in local or world space.
         * @param axis The axis to rotate the bone on.
         * @param angle The angle that the bone should be rotated to.
         * @param space The space that the axis is in.
         * @param mesh The mesh that this bone is attached to.  This is only used in world space.
         */
    native public void setAxisAngle(Vector3 axis, double angle, Space space);
    /**
         * Set the rotation of the bone to a particular axis angle in local or world space.
         * @param axis The axis to rotate the bone on.
         * @param angle The angle that the bone should be rotated to.
         * @param space The space that the axis is in.
         * @param mesh The mesh that this bone is attached to.  This is only used in world space.
         */
    native public void setAxisAngle(Vector3 axis, double angle);
    /**
         * Set the euler rotation of the bone in local of world space.
         * @param rotation The euler rotation that the bone should be set to.
         * @param space The space that the rotation is in.
         * @param mesh The mesh that this bone is attached to.  This is only used in world space.
         */
    native public void setRotation(Vector3 rotation, Space space);
    /**
         * Set the euler rotation of the bone in local of world space.
         * @param rotation The euler rotation that the bone should be set to.
         * @param space The space that the rotation is in.
         * @param mesh The mesh that this bone is attached to.  This is only used in world space.
         */
    native public void setRotation(Vector3 rotation);
    /**
         * Set the quaternion rotation of the bone in local of world space.
         * @param quat The quaternion rotation that the bone should be set to.
         * @param space The space that the rotation is in.
         * @param mesh The mesh that this bone is attached to.  This is only used in world space.
         */
    native public void setRotationQuaternion(Quaternion quat, Space space);
    /**
         * Set the quaternion rotation of the bone in local of world space.
         * @param quat The quaternion rotation that the bone should be set to.
         * @param space The space that the rotation is in.
         * @param mesh The mesh that this bone is attached to.  This is only used in world space.
         */
    native public void setRotationQuaternion(Quaternion quat);
    /**
         * Set the rotation matrix of the bone in local of world space.
         * @param rotMat The rotation matrix that the bone should be set to.
         * @param space The space that the rotation is in.
         * @param mesh The mesh that this bone is attached to.  This is only used in world space.
         */
    native public void setRotationMatrix(Matrix rotMat, Space space);
    /**
         * Set the rotation matrix of the bone in local of world space.
         * @param rotMat The rotation matrix that the bone should be set to.
         * @param space The space that the rotation is in.
         * @param mesh The mesh that this bone is attached to.  This is only used in world space.
         */
    native public void setRotationMatrix(Matrix rotMat);
    /**
         * Get the position of the bone in local or world space.
         * @param space The space that the returned position is in.
         * @param mesh The mesh that this bone is attached to.  This is only used in world space.
         * @returns The position of the bone
         */
    native public Vector3 getPosition(Space space);
    /**
         * Get the position of the bone in local or world space.
         * @param space The space that the returned position is in.
         * @param mesh The mesh that this bone is attached to.  This is only used in world space.
         * @returns The position of the bone
         */
    native public Vector3 getPosition();
    /**
         * Get the absolute position of the bone (world space).
         * @param mesh The mesh that this bone is attached to.
         * @returns The absolute position of the bone
         */
    native public Vector3 getAbsolutePosition();
    /**
         * Get the world direction from an axis that is in the local space of the bone.
         * @param localAxis The local direction that is used to compute the world direction.
         * @param mesh The mesh that this bone is attached to.
         * @returns The world direction
         */
    native public Vector3 getDirection(Vector3 localAxis);
    /**
         * Get the euler rotation of the bone in local or world space.
         * @param space The space that the rotation should be in.
         * @param mesh The mesh that this bone is attached to.  This is only used in world space.
         * @returns The euler rotation
         */
    native public Vector3 getRotation(Space space);
    /**
         * Get the euler rotation of the bone in local or world space.
         * @param space The space that the rotation should be in.
         * @param mesh The mesh that this bone is attached to.  This is only used in world space.
         * @returns The euler rotation
         */
    native public Vector3 getRotation();
    /**
         * Get the quaternion rotation of the bone in either local or world space.
         * @param space The space that the rotation should be in.
         * @param mesh The mesh that this bone is attached to.  This is only used in world space.
         * @returns The quaternion rotation
         */
    native public Quaternion getRotationQuaternion(Space space);
    /**
         * Get the quaternion rotation of the bone in either local or world space.
         * @param space The space that the rotation should be in.
         * @param mesh The mesh that this bone is attached to.  This is only used in world space.
         * @returns The quaternion rotation
         */
    native public Quaternion getRotationQuaternion();
    /**
         * Get the world position of a point that is in the local space of the bone.
         * @param position The local position
         * @param mesh The mesh that this bone is attached to.
         * @returns The world position
         */
    native public Vector3 getAbsolutePositionFromLocal(Vector3 position);
    /**
         * Get the local position of a point that is in world space.
         * @param position The world position
         * @param mesh The mesh that this bone is attached to.
         * @returns The local position
         */
    native public Vector3 getLocalPositionFromAbsolute(Vector3 position);
    protected Bone(){}
}

