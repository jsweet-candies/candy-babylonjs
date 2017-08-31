package def.babylonjs.babylon;
public class EffectCreationOptions extends def.js.Object {
    public String[] attributes;
    public String[] uniformsNames;
    public String[] uniformBuffersNames;
    public String[] samplers;
    public Object defines;
    public EffectFallbacks fallbacks;
    public java.util.function.Consumer<Effect> onCompiled;
    public java.util.function.BiConsumer<Effect,String> onError;
    public Object indexParameters;
    public double maxSimultaneousLights;
}

