package def.babylonjs.babylon;
import def.js.Array;
public class SoundTrack extends def.js.Object {
    public double id;
    public Array<Sound> soundCollection;
    public SoundTrack(Scene scene, Object options){}
    native public void dispose();
    native public void AddSound(Sound sound);
    native public void RemoveSound(Sound sound);
    native public void setVolume(double newVolume);
    native public void switchPanningModelToHRTF();
    native public void switchPanningModelToEqualPower();
    native public void connectToAnalyser(Analyser analyser);
    public SoundTrack(Scene scene){}
    protected SoundTrack(){}
}

