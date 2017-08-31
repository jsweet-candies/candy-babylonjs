package def.babylonjs.babylon;
/**
     * The Observable class is a simple implementation of the Observable pattern.
     * There's one slight particularity though: a given Observable can notify its observer using a particular mask value, only the Observers registered with this mask value will be notified.
     * This enable a more fine grained execution without having to rely on multiple different Observable objects.
     * For instance you may have a given Observable that have four different types of notifications: Move (mask = 0x01), Stop (mask = 0x02), Turn Right (mask = 0X04), Turn Left (mask = 0X08).
     * A given observer can register itself with only Move and Stop (mask = 0x03), then it will only be notified when one of these two occurs and will never be for Turn Left/Right.
     */
public class Observable<T> extends def.js.Object {
    public Observer<T>[] _observers;
    public Observable(){}
    /**
         * Create a new Observer with the specified callback
         * @param callback the callback that will be executed for that Observer
         * @param mask the mask used to filter observers
         * @param insertFirst if true the callback will be inserted at the first position, hence executed before the others ones. If false (default behavior) the callback will be inserted at the last position, executed after all the others already present.
         */
    native public Observer<T> add(java.util.function.BiConsumer<T,EventState> callback, double mask, Boolean insertFirst);
    /**
         * Remove an Observer from the Observable object
         * @param observer the instance of the Observer to remove. If it doesn't belong to this Observable, false will be returned.
         */
    native public Boolean remove(Observer<T> observer);
    /**
         * Remove a callback from the Observable object
         * @param callback the callback to remove. If it doesn't belong to this Observable, false will be returned.
        */
    native public Boolean removeCallback(java.util.function.BiConsumer<T,EventState> callback);
    /**
         * Notify all Observers by calling their respective callback with the given data
         * Will return true if all observers were executed, false if an observer set skipNextObservers to true, then prevent the subsequent ones to execute
         * @param eventData
         * @param mask
         */
    native public Boolean notifyObservers(T eventData, double mask);
    /**
         * return true is the Observable has at least one Observer registered
         */
    native public Boolean hasObservers();
    /**
        * Clear the list of observers
        */
    native public void clear();
    /**
        * Clone the current observable
        */
    @jsweet.lang.Name("clone")
    native public Observable<T> Clone();
    native public Boolean hasSpecificMask(double mask);
    /**
         * Create a new Observer with the specified callback
         * @param callback the callback that will be executed for that Observer
         * @param mask the mask used to filter observers
         * @param insertFirst if true the callback will be inserted at the first position, hence executed before the others ones. If false (default behavior) the callback will be inserted at the last position, executed after all the others already present.
         */
    native public Observer<T> add(java.util.function.BiConsumer<T,EventState> callback, double mask);
    /**
         * Create a new Observer with the specified callback
         * @param callback the callback that will be executed for that Observer
         * @param mask the mask used to filter observers
         * @param insertFirst if true the callback will be inserted at the first position, hence executed before the others ones. If false (default behavior) the callback will be inserted at the last position, executed after all the others already present.
         */
    native public Observer<T> add(java.util.function.BiConsumer<T,EventState> callback);
    /**
         * Notify all Observers by calling their respective callback with the given data
         * Will return true if all observers were executed, false if an observer set skipNextObservers to true, then prevent the subsequent ones to execute
         * @param eventData
         * @param mask
         */
    native public Boolean notifyObservers(T eventData);
    native public Boolean hasSpecificMask();
}

