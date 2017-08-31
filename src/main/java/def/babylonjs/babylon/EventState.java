package def.babylonjs.babylon;
/**
     * A class serves as a medium between the observable and its observers
     */
public class EventState extends def.js.Object {
    /**
        * If the callback of a given Observer set skipNextObservers to true the following observers will be ignored
        */
    public EventState(double mask, Boolean skipNextObservers){}
    native public EventState initalize(double mask, Boolean skipNextObservers);
    /**
         * An Observer can set this property to true to prevent subsequent observers of being notified
         */
    public Boolean skipNextObservers;
    /**
         * Get the mask value that were used to trigger the event corresponding to this EventState object
         */
    public double mask;
    /**
        * If the callback of a given Observer set skipNextObservers to true the following observers will be ignored
        */
    public EventState(double mask){}
    native public EventState initalize(double mask);
    protected EventState(){}
}

