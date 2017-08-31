package def.babylonjs.babylon;
public class FresnelParameters extends def.js.Object {
    public Boolean isEnabled;
    public Color3 leftColor;
    public Color3 rightColor;
    public double bias;
    public double power;
    @jsweet.lang.Name("clone")
    native public FresnelParameters Clone();
    native public Object serialize();
    native public static FresnelParameters Parse(Object parsedFresnelParameters);
}

