package def.babylonjs.babylon;
public class Particle extends def.js.Object {
    public Vector3 position;
    public Vector3 direction;
    public Color4 color;
    public Color4 colorStep;
    public double lifeTime;
    public double age;
    public double size;
    public double angle;
    public double angularSpeed;
    native public void copyTo(Particle other);
}

