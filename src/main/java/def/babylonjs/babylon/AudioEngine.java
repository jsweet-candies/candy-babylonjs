package def.babylonjs.babylon;
import def.dom.GainNode;
import def.dom.AudioContext;
public class AudioEngine extends def.js.Object {
    public Boolean canUseWebAudio;
    public GainNode masterGain;
    public Boolean WarnedWebAudioUnsupported;
    public Boolean unlocked;
    public java.util.function.Supplier<Object> onAudioUnlocked;
    public Boolean isMP3supported;
    public Boolean isOGGsupported;
    public final AudioContext audioContext=null;
    public AudioEngine(){}
    native public void dispose();
    native public double getGlobalVolume();
    native public void setGlobalVolume(double newVolume);
    native public void connectToAnalyser(Analyser analyser);
}

