package def.babylonjs.babylon;
public class SphericalHarmonics extends def.js.Object {
    public Vector3 L00;
    public Vector3 L1_1;
    public Vector3 L10;
    public Vector3 L11;
    public Vector3 L2_2;
    public Vector3 L2_1;
    public Vector3 L20;
    public Vector3 L21;
    public Vector3 L22;
    native public void addLight(Vector3 direction, Color3 color, double deltaSolidAngle);
    native public void scale(double scale);
    native public void convertIncidentRadianceToIrradiance();
    native public void convertIrradianceToLambertianRadiance();
    native public static SphericalHarmonics getsphericalHarmonicsFromPolynomial(SphericalPolynomial polynomial);
}

