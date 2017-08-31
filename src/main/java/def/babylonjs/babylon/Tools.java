package def.babylonjs.babylon;
import def.dom.XMLHttpRequest;
import def.js.Array;
import def.dom.HTMLImageElement;
import def.js.Float32Array;
import def.js.ArrayBuffer;
import def.dom.EventListener;
import def.dom.HTMLElement;
public class Tools extends def.js.Object {
    public static String BaseUrl;
    public static Object CorsBehavior;
    public static Boolean UseFallbackTexture;
    /**
         * Interpolates between a and b via alpha
         * @param a The lower value (returned when alpha = 0)
         * @param b The upper value (returned when alpha = 1)
         * @param alpha The interpolation-factor
         * @return The mixed value
         */
    native public static double Mix(double a, double b, double alpha);
    native public static Object Instantiate(String className);
    native public static void SetImmediate(java.lang.Runnable action);
    native public static Boolean IsExponentOfTwo(double value);
    /**
         * Find the next highest power of two.
         * @param x Number to start search from.
         * @return Next highest power of two.
         */
    native public static double CeilingPOT(double x);
    /**
         * Find the next lowest power of two.
         * @param x Number to start search from.
         * @return Next lowest power of two.
         */
    native public static double FloorPOT(double x);
    /**
         * Find the nearest power of two.
         * @param x Number to start search from.
         * @return Next nearest power of two.
         */
    native public static double NearestPOT(double x);
    native public static double GetExponentOfTwo(double value, double max, double mode);
    native public static String GetFilename(String path);
    native public static String GetDOMTextContent(HTMLElement element);
    native public static double ToDegrees(double angle);
    native public static double ToRadians(double angle);
    native public static String EncodeArrayBufferTobase64(ArrayBuffer buffer);
    native public static ExtractMinAndMaxIndexed ExtractMinAndMaxIndexed(double[] positions, Object indices, double indexStart, double indexCount, Vector2 bias);
    native public static ExtractMinAndMax ExtractMinAndMax(double[] positions, double start, double count, Vector2 bias, double stride);
    native public static java.util.function.Function<Double,Vector2> Vector2ArrayFeeder(Array<Vector2> array);
    native public static ExtractMinAndMaxVector2 ExtractMinAndMaxVector2(java.util.function.Function<Double,Vector2> feeder, Vector2 bias);
    native public static Array<?> MakeArray(Object obj, Boolean allowsNullUndefined);
    native public static String GetPointerPrefix();
    /**
         * @param func - the function to be called
         * @param requester - the object that will request the next frame. Falls back to window.
         */
    native public static void QueueNewFrame(Object func, Object requester);
    native public static void RequestFullscreen(Object element);
    native public static void ExitFullscreen();
    native public static void SetCorsBehavior(String url, HTMLImageElement img);
    native public static String CleanUrl(String url);
    native public static HTMLImageElement LoadImage(Object url, Object onload, Object onerror, Object database);
    native public static void LoadFile(String url, java.util.function.Consumer<Object> callback, java.util.function.Consumer<Object> progressCallBack, Object database, Boolean useArrayBuffer, java.util.function.Consumer<XMLHttpRequest> onError);
    /**
         * Load a script (identified by an url). When the url returns, the
         * content of this file is added into a new script element, attached to the DOM (body element)
         */
    native public static void LoadScript(String scriptUrl, java.lang.Runnable onSuccess, java.lang.Runnable onError);
    native public static void ReadFileAsDataURL(Object fileToLoad, Object callback, Object progressCallback);
    native public static void ReadFile(Object fileToLoad, Object callback, Object progressCallBack, Boolean useArrayBuffer);
    native public static String FileAsURL(String content);
    native public static String Format(double value, double decimals);
    native public static void CheckExtends(Vector3 v, Vector3 min, Vector3 max);
    native public static void DeepCopy(Object source, Object destination, String[] doNotCopyList, String[] mustCopyList);
    native public static Boolean IsEmpty(Object obj);
    native public static void RegisterTopRootEvents(Events[] events);
    native public static void UnregisterTopRootEvents(Events[] events);
    native public static void DumpFramebuffer(double width, double height, Engine engine, java.util.function.Consumer<String> successCallback, String mimeType);
    native public static void EncodeScreenshotCanvasData(java.util.function.Consumer<String> successCallback, String mimeType);
    native public static void CreateScreenshot(Engine engine, Camera camera, Object size, java.util.function.Consumer<String> successCallback, String mimeType);
    native public static void CreateScreenshotUsingRenderTarget(Engine engine, Camera camera, Object size, java.util.function.Consumer<String> successCallback, String mimeType, double samples);
    native public static Boolean ValidateXHRData(XMLHttpRequest xhr, double dataType);
    /**
         * Implementation from http://stackoverflow.com/questions/105034/how-to-create-a-guid-uuid-in-javascript/2117523#answer-2117523
         * Be aware Math.random() could cause collisions, but:
         * "All but 6 of the 128 bits of the ID are randomly generated, which means that for any two ids, there's a 1 in 2^^122 (or 5.3x10^^36) chance they'll collide"
         */
    native public static String RandomId();
    public static double errorsCount;
    public static java.util.function.Consumer<String> OnNewCacheEntry;
    public static final double NoneLogLevel=0;
    public static final double MessageLogLevel=0;
    public static final double WarningLogLevel=0;
    public static final double ErrorLogLevel=0;
    public static final double AllLogLevel=0;
    public static java.util.function.Consumer<String> Log;
    public static java.util.function.Consumer<String> Warn;
    public static java.util.function.Consumer<String> Error;
    public static final String LogCache=null;
    native public static void ClearLogCache();
    public static double LogLevels;
    public static final double PerformanceNoneLogLevel=0;
    public static final double PerformanceUserMarkLogLevel=0;
    public static final double PerformanceConsoleLogLevel=0;
    public static double PerformanceLogLevel;
    native public static void _StartPerformanceCounterDisabled(String counterName, Boolean condition);
    native public static void _EndPerformanceCounterDisabled(String counterName, Boolean condition);
    native public static void _StartUserMark(String counterName, Boolean condition);
    native public static void _EndUserMark(String counterName, Boolean condition);
    native public static void _StartPerformanceConsole(String counterName, Boolean condition);
    native public static void _EndPerformanceConsole(String counterName, Boolean condition);
    public static java.util.function.BiConsumer<String,Boolean> StartPerformanceCounter;
    public static java.util.function.BiConsumer<String,Boolean> EndPerformanceCounter;
    public static final double Now=0;
    /**
         * This method will return the name of the class used to create the instance of the given object.
         * It will works only on Javascript basic data types (number, string, ...) and instance of class declared with the @className decorator.
         * @param object the object to get the class name from
         * @return the name of the class, will be "object" for a custom data type not using the @className decorator
         */
    native public static String getClassName(Object object, Boolean isType);
    native public static <T> T first(Array<T> array, java.util.function.Function<T,Boolean> predicate);
    /**
         * This method will return the name of the full name of the class, including its owning module (if any).
         * It will works only on Javascript basic data types (number, string, ...) and instance of class declared with the @className decorator or implementing a method getClassName():string (in which case the module won't be specified).
         * @param object the object to get the class name from
         * @return a string that can have two forms: "moduleName.className" if module was specified when the class' Name was registered or "className" if there was not module specified.
         */
    native public static String getFullClassName(Object object, Boolean isType);
    /**
         * This method can be used with hashCodeFromStream when your input is an array of values that are either: number, string, boolean or custom type implementing the getHashCode():number method.
         * @param array
         */
    native public static java.util.function.Function<Double,Double> arrayOrStringFeeder(Object array);
    /**
         * Compute the hashCode of a stream of number
         * To compute the HashCode on a string or an Array of data types implementing the getHashCode() method, use the arrayOrStringFeeder method.
         * @param feeder a callback that will be called until it returns null, each valid returned values will be used to compute the hash code.
         * @return the hash code computed
         */
    native public static double hashCodeFromStream(java.util.function.Function<Double,Double> feeder);
    /** This is an automatically generated object type (see the source definition). */
    @jsweet.lang.ObjectType
    public static class ExtractMinAndMaxIndexed extends def.js.Object {
        public Vector3 minimum;
        public Vector3 maximum;
    }
    /** This is an automatically generated object type (see the source definition). */
    @jsweet.lang.ObjectType
    public static class ExtractMinAndMax extends def.js.Object {
        public Vector3 minimum;
        public Vector3 maximum;
    }
    /** This is an automatically generated object type (see the source definition). */
    @jsweet.lang.ObjectType
    public static class ExtractMinAndMaxVector2 extends def.js.Object {
        public Vector2 minimum;
        public Vector2 maximum;
    }
    /** This is an automatically generated object type (see the source definition). */
    @jsweet.lang.ObjectType
    public static class Events extends def.js.Object {
        public String name;
        public EventListener handler;
        native public void handler(def.dom.Event evt);
    }
    native public static double GetExponentOfTwo(double value, double max);
    native public static ExtractMinAndMaxIndexed ExtractMinAndMaxIndexed(double[] positions, Object indices, double indexStart, double indexCount);
    native public static ExtractMinAndMax ExtractMinAndMax(double[] positions, double start, double count, Vector2 bias);
    native public static ExtractMinAndMax ExtractMinAndMax(double[] positions, double start, double count);
    native public static ExtractMinAndMaxVector2 ExtractMinAndMaxVector2(java.util.function.Function<Double,Vector2> feeder);
    native public static Array<?> MakeArray(Object obj);
    /**
         * @param func - the function to be called
         * @param requester - the object that will request the next frame. Falls back to window.
         */
    native public static void QueueNewFrame(Object func);
    native public static void LoadFile(String url, java.util.function.Consumer<Object> callback, java.util.function.Consumer<Object> progressCallBack, Object database, Boolean useArrayBuffer);
    native public static void LoadFile(String url, java.util.function.Consumer<Object> callback, java.util.function.Consumer<Object> progressCallBack, Object database);
    native public static void LoadFile(String url, java.util.function.Consumer<Object> callback, java.util.function.Consumer<Object> progressCallBack);
    native public static void LoadFile(String url, java.util.function.Consumer<Object> callback);
    /**
         * Load a script (identified by an url). When the url returns, the
         * content of this file is added into a new script element, attached to the DOM (body element)
         */
    native public static void LoadScript(String scriptUrl, java.lang.Runnable onSuccess);
    native public static void ReadFile(Object fileToLoad, Object callback, Object progressCallBack);
    native public static String Format(double value);
    native public static void DeepCopy(Object source, Object destination, String[] doNotCopyList);
    native public static void DeepCopy(Object source, Object destination);
    native public static void DumpFramebuffer(double width, double height, Engine engine, java.util.function.Consumer<String> successCallback);
    native public static void DumpFramebuffer(double width, double height, Engine engine);
    native public static void EncodeScreenshotCanvasData(java.util.function.Consumer<String> successCallback);
    native public static void EncodeScreenshotCanvasData();
    native public static void CreateScreenshot(Engine engine, Camera camera, Object size, java.util.function.Consumer<String> successCallback);
    native public static void CreateScreenshot(Engine engine, Camera camera, Object size);
    native public static void CreateScreenshotUsingRenderTarget(Engine engine, Camera camera, Object size, java.util.function.Consumer<String> successCallback, String mimeType);
    native public static void CreateScreenshotUsingRenderTarget(Engine engine, Camera camera, Object size, java.util.function.Consumer<String> successCallback);
    native public static void CreateScreenshotUsingRenderTarget(Engine engine, Camera camera, Object size);
    native public static Boolean ValidateXHRData(XMLHttpRequest xhr);
    native public static void _StartPerformanceCounterDisabled(String counterName);
    native public static void _EndPerformanceCounterDisabled(String counterName);
    native public static void _StartUserMark(String counterName);
    native public static void _EndUserMark(String counterName);
    native public static void _StartPerformanceConsole(String counterName);
    native public static void _EndPerformanceConsole(String counterName);
    /**
         * This method will return the name of the class used to create the instance of the given object.
         * It will works only on Javascript basic data types (number, string, ...) and instance of class declared with the @className decorator.
         * @param object the object to get the class name from
         * @return the name of the class, will be "object" for a custom data type not using the @className decorator
         */
    native public static String getClassName(Object object);
    /**
         * This method will return the name of the full name of the class, including its owning module (if any).
         * It will works only on Javascript basic data types (number, string, ...) and instance of class declared with the @className decorator or implementing a method getClassName():string (in which case the module won't be specified).
         * @param object the object to get the class name from
         * @return a string that can have two forms: "moduleName.className" if module was specified when the class' Name was registered or "className" if there was not module specified.
         */
    native public static String getFullClassName(Object object);
    native public static ExtractMinAndMaxIndexed ExtractMinAndMaxIndexed(Float32Array positions, Object indices, double indexStart, double indexCount, Vector2 bias);
    native public static ExtractMinAndMax ExtractMinAndMax(Float32Array positions, double start, double count, Vector2 bias, double stride);
    native public static java.util.function.Function<Double,Vector2> Vector2ArrayFeeder(Float32Array array);
    native public static ExtractMinAndMaxIndexed ExtractMinAndMaxIndexed(Float32Array positions, Object indices, double indexStart, double indexCount);
    native public static ExtractMinAndMax ExtractMinAndMax(Float32Array positions, double start, double count, Vector2 bias);
    native public static ExtractMinAndMax ExtractMinAndMax(Float32Array positions, double start, double count);
    native public static java.util.function.Function<Double,Vector2> Vector2ArrayFeeder(Vector2[] array);
    native public static <T> T first(T[] array, java.util.function.Function<T,Boolean> predicate);
}

