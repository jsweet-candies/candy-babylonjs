package def.babylonjs.babylon;
/**
     * This class is used to track a performance counter which is number based.
     * The user has access to many properties which give statistics of different nature
     *
     * The implementer can track two kinds of Performance Counter: time and count
     * For time you can optionally call fetchNewFrame() to notify the start of a new frame to monitor, then call beginMonitoring() to start and endMonitoring() to record the lapsed time. endMonitoring takes a newFrame parameter for you to specify if the monitored time should be set for a new frame or accumulated to the current frame being monitored.
     * For count you first have to call fetchNewFrame() to notify the start of a new frame to monitor, then call addCount() how many time required to increment the count value you monitor.
     */
public class PerfCounter extends def.js.Object {
    public static Boolean Enabled;
    /**
         * Returns the smallest value ever
         */
    public final double min=0;
    /**
         * Returns the biggest value ever
         */
    public final double max=0;
    /**
         * Returns the average value since the performance counter is running
         */
    public final double average=0;
    /**
         * Returns the average value of the last second the counter was monitored
         */
    public final double lastSecAverage=0;
    /**
         * Returns the current value
         */
    public final double current=0;
    public final double total=0;
    public PerfCounter(){}
    /**
         * Call this method to start monitoring a new frame.
         * This scenario is typically used when you accumulate monitoring time many times for a single frame, you call this method at the start of the frame, then beginMonitoring to start recording and endMonitoring(false) to accumulated the recorded time to the PerfCounter or addCount() to accumulate a monitored count.
         */
    native public void fetchNewFrame();
    /**
         * Call this method to monitor a count of something (e.g. mesh drawn in viewport count)
         * @param newCount the count value to add to the monitored count
         * @param fetchResult true when it's the last time in the frame you add to the counter and you wish to update the statistics properties (min/max/average), false if you only want to update statistics.
         */
    native public void addCount(double newCount, Boolean fetchResult);
    /**
         * Start monitoring this performance counter
         */
    native public void beginMonitoring();
    /**
         * Compute the time lapsed since the previous beginMonitoring() call.
         * @param newFrame true by default to fetch the result and monitor a new frame, if false the time monitored will be added to the current frame counter
         */
    native public void endMonitoring(Boolean newFrame);
    /**
         * Compute the time lapsed since the previous beginMonitoring() call.
         * @param newFrame true by default to fetch the result and monitor a new frame, if false the time monitored will be added to the current frame counter
         */
    native public void endMonitoring();
}

