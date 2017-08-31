package def.babylonjs.babylon;
import jsweet.util.function.Function5;
import def.dom.AudioBuffer;
import def.dom.AudioNode;
public class Sound extends def.js.Object {
    public String name;
    public Boolean autoplay;
    public Boolean loop;
    public Boolean useCustomAttenuation;
    public double soundTrackId;
    public Boolean spatialSound;
    public double refDistance;
    public double rolloffFactor;
    public double maxDistance;
    public String distanceModel;
    public java.util.function.Supplier<Object> onended;
    public Boolean isPlaying;
    public Boolean isPaused;
    /**
        * Create a sound and attach it to a scene
        * @param name Name of your sound
        * @param urlOrArrayBuffer Url to the sound to load async or ArrayBuffer
        * @param readyToPlayCallback Provide a callback function if you'd like to load your code once the sound is ready to be played
        * @param options Objects to provide with the current available options: autoplay, loop, volume, spatialSound, maxDistance, rolloffFactor, refDistance, distanceModel, panningModel, streaming
        */
    public Sound(String name, Object urlOrArrayBuffer, Scene scene, java.lang.Runnable readyToPlayCallback, Object options){}
    native public void dispose();
    native public Boolean isReady();
    native public void setAudioBuffer(AudioBuffer audioBuffer);
    native public void updateOptions(Object options);
    native public void switchPanningModelToHRTF();
    native public void switchPanningModelToEqualPower();
    native public void connectToSoundTrackAudioNode(AudioNode soundTrackAudioNode);
    /**
        * Transform this sound into a directional source
        * @param coneInnerAngle Size of the inner cone in degree
        * @param coneOuterAngle Size of the outer cone in degree
        * @param coneOuterGain Volume of the sound outside the outer cone (between 0.0 and 1.0)
        */
    native public void setDirectionalCone(double coneInnerAngle, double coneOuterAngle, double coneOuterGain);
    native public void setPosition(Vector3 newPosition);
    native public void setLocalDirectionToMesh(Vector3 newLocalDirection);
    native public void updateDistanceFromListener();
    native public void setAttenuationFunction(Function5<Double,Double,Double,Double,Double,Double> callback);
    /**
        * Play the sound
        * @param time (optional) Start the sound after X seconds. Start immediately (0) by default.
        * @param offset (optional) Start the sound setting it at a specific time
        */
    native public void play(double time, double offset);
    /**
        * Stop the sound
        * @param time (optional) Stop the sound after X seconds. Stop immediately (0) by default.
        */
    native public void stop(double time);
    native public void pause();
    native public void setVolume(double newVolume, double time);
    native public void setPlaybackRate(double newPlaybackRate);
    native public double getVolume();
    native public void attachToMesh(AbstractMesh meshToConnectTo);
    native public void detachFromMesh();
    @jsweet.lang.Name("clone")
    native public Sound Clone();
    native public AudioBuffer getAudioBuffer();
    native public Object serialize();
    native public static Sound Parse(Object parsedSound, Scene scene, String rootUrl, Sound sourceSound);
    /**
        * Create a sound and attach it to a scene
        * @param name Name of your sound
        * @param urlOrArrayBuffer Url to the sound to load async or ArrayBuffer
        * @param readyToPlayCallback Provide a callback function if you'd like to load your code once the sound is ready to be played
        * @param options Objects to provide with the current available options: autoplay, loop, volume, spatialSound, maxDistance, rolloffFactor, refDistance, distanceModel, panningModel, streaming
        */
    public Sound(String name, Object urlOrArrayBuffer, Scene scene, java.lang.Runnable readyToPlayCallback){}
    /**
        * Create a sound and attach it to a scene
        * @param name Name of your sound
        * @param urlOrArrayBuffer Url to the sound to load async or ArrayBuffer
        * @param readyToPlayCallback Provide a callback function if you'd like to load your code once the sound is ready to be played
        * @param options Objects to provide with the current available options: autoplay, loop, volume, spatialSound, maxDistance, rolloffFactor, refDistance, distanceModel, panningModel, streaming
        */
    public Sound(String name, Object urlOrArrayBuffer, Scene scene){}
    /**
        * Play the sound
        * @param time (optional) Start the sound after X seconds. Start immediately (0) by default.
        * @param offset (optional) Start the sound setting it at a specific time
        */
    native public void play(double time);
    /**
        * Play the sound
        * @param time (optional) Start the sound after X seconds. Start immediately (0) by default.
        * @param offset (optional) Start the sound setting it at a specific time
        */
    native public void play();
    /**
        * Stop the sound
        * @param time (optional) Stop the sound after X seconds. Stop immediately (0) by default.
        */
    native public void stop();
    native public void setVolume(double newVolume);
    native public static Sound Parse(Object parsedSound, Scene scene, String rootUrl);
    protected Sound(){}
}

