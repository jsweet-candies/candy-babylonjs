package def.babylonjs.babylon;
public class SphericalPolynomial extends def.js.Object {
    public Vector3 x;
    public Vector3 y;
    public Vector3 z;
    public Vector3 xx;
    public Vector3 yy;
    public Vector3 zz;
    public Vector3 xy;
    public Vector3 yz;
    public Vector3 zx;
    native public void addAmbient(Color3 color);
    native public static SphericalPolynomial getSphericalPolynomialFromHarmonics(SphericalHarmonics harmonics);
    native public void scale(double scale);
}

