package def.babylonjs.babylon;
/**
    * An implementation of a loop for asynchronous functions.
    */
public class AsyncLoop extends def.js.Object {
    public double iterations;
    public double index;
    /**
         * Constroctor.
         * @param iterations the number of iterations.
         * @param _fn the function to run each iteration
         * @param _successCallback the callback that will be called upon succesful execution
         * @param offset starting offset.
         */
    public AsyncLoop(double iterations, java.util.function.Consumer<AsyncLoop> _fn, java.lang.Runnable _successCallback, double offset){}
    /**
         * Execute the next iteration. Must be called after the last iteration was finished.
         */
    native public void executeNext();
    /**
         * Break the loop and run the success callback.
         */
    native public void breakLoop();
    /**
         * Helper function
         */
    native public static AsyncLoop Run(double iterations, java.util.function.Consumer<AsyncLoop> _fn, java.lang.Runnable _successCallback, double offset);
    /**
         * A for-loop that will run a given number of iterations synchronous and the rest async.
         * @param iterations total number of iterations
         * @param syncedIterations number of synchronous iterations in each async iteration.
         * @param fn the function to call each iteration.
         * @param callback a success call back that will be called when iterating stops.
         * @param breakFunction a break condition (optional)
         * @param timeout timeout settings for the setTimeout function. default - 0.
         * @constructor
         */
    native public static void SyncAsyncForLoop(double iterations, double syncedIterations, java.util.function.Consumer<Double> fn, java.lang.Runnable callback, java.util.function.Supplier<Boolean> breakFunction, double timeout);
    /**
         * Constroctor.
         * @param iterations the number of iterations.
         * @param _fn the function to run each iteration
         * @param _successCallback the callback that will be called upon succesful execution
         * @param offset starting offset.
         */
    public AsyncLoop(double iterations, java.util.function.Consumer<AsyncLoop> _fn, java.lang.Runnable _successCallback){}
    /**
         * Helper function
         */
    native public static AsyncLoop Run(double iterations, java.util.function.Consumer<AsyncLoop> _fn, java.lang.Runnable _successCallback);
    /**
         * A for-loop that will run a given number of iterations synchronous and the rest async.
         * @param iterations total number of iterations
         * @param syncedIterations number of synchronous iterations in each async iteration.
         * @param fn the function to call each iteration.
         * @param callback a success call back that will be called when iterating stops.
         * @param breakFunction a break condition (optional)
         * @param timeout timeout settings for the setTimeout function. default - 0.
         * @constructor
         */
    native public static void SyncAsyncForLoop(double iterations, double syncedIterations, java.util.function.Consumer<Double> fn, java.lang.Runnable callback, java.util.function.Supplier<Boolean> breakFunction);
    /**
         * A for-loop that will run a given number of iterations synchronous and the rest async.
         * @param iterations total number of iterations
         * @param syncedIterations number of synchronous iterations in each async iteration.
         * @param fn the function to call each iteration.
         * @param callback a success call back that will be called when iterating stops.
         * @param breakFunction a break condition (optional)
         * @param timeout timeout settings for the setTimeout function. default - 0.
         * @constructor
         */
    native public static void SyncAsyncForLoop(double iterations, double syncedIterations, java.util.function.Consumer<Double> fn, java.lang.Runnable callback);
    protected AsyncLoop(){}
}

