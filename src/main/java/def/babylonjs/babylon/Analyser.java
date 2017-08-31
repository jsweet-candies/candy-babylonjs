package def.babylonjs.babylon;
import def.js.Uint8Array;
import def.dom.AudioNode;
public class Analyser extends def.js.Object {
    public double SMOOTHING;
    public double FFT_SIZE;
    public double BARGRAPHAMPLITUDE;
    public DEBUGCANVASPOS DEBUGCANVASPOS;
    public DEBUGCANVASSIZE DEBUGCANVASSIZE;
    public Analyser(Scene scene){}
    native public double getFrequencyBinCount();
    native public Uint8Array getByteFrequencyData();
    native public Uint8Array getByteTimeDomainData();
    native public Uint8Array getFloatFrequencyData();
    native public void drawDebugCanvas();
    native public void stopDebugCanvas();
    native public void connectAudioNodes(AudioNode inputAudioNode, AudioNode outputAudioNode);
    native public void dispose();
    /** This is an automatically generated object type (see the source definition). */
    @jsweet.lang.ObjectType
    public static class DEBUGCANVASPOS extends def.js.Object {
        public double x;
        public double y;
    }
    /** This is an automatically generated object type (see the source definition). */
    @jsweet.lang.ObjectType
    public static class DEBUGCANVASSIZE extends def.js.Object {
        public double width;
        public double height;
    }
    protected Analyser(){}
}

