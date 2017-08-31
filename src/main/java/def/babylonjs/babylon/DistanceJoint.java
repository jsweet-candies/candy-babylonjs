package def.babylonjs.babylon;
/**
     * A class representing a physics distance joint.
     */
public class DistanceJoint extends PhysicsJoint {
    public DistanceJoint(DistanceJointData jointData){}
    /**
         * Update the predefined distance.
         */
    native public void updateDistance(double maxDistance, double minDistance);
    /**
         * Update the predefined distance.
         */
    native public void updateDistance(double maxDistance);
    protected DistanceJoint(){}
}

