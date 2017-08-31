package def.babylonjs.babylon;
/**
     * Action Manager manages all events to be triggered on a given mesh or the global scene.
     * A single scene can have many Action Managers to handle predefined actions on specific meshes.
     */
public class ActionManager extends def.js.Object {
    public static final double NothingTrigger=0;
    public static final double OnPickTrigger=0;
    public static final double OnLeftPickTrigger=0;
    public static final double OnRightPickTrigger=0;
    public static final double OnCenterPickTrigger=0;
    public static final double OnPickDownTrigger=0;
    public static final double OnDoublePickTrigger=0;
    public static final double OnPickUpTrigger=0;
    public static final double OnPickOutTrigger=0;
    public static final double OnLongPressTrigger=0;
    public static final double OnPointerOverTrigger=0;
    public static final double OnPointerOutTrigger=0;
    public static final double OnEveryFrameTrigger=0;
    public static final double OnIntersectionEnterTrigger=0;
    public static final double OnIntersectionExitTrigger=0;
    public static final double OnKeyDownTrigger=0;
    public static final double OnKeyUpTrigger=0;
    public static java.lang.Object Triggers;
    public Action[] actions;
    public String hoverCursor;
    public ActionManager(Scene scene){}
    native public void dispose();
    native public Scene getScene();
    /**
         * Does this action manager handles actions of any of the given triggers
         * @param {number[]} triggers - the triggers to be tested
         * @return {boolean} whether one (or more) of the triggers is handeled
         */
    native public Boolean hasSpecificTriggers(double[] triggers);
    /**
         * Does this action manager handles actions of a given trigger
         * @param {number} trigger - the trigger to be tested
         * @return {boolean} whether the trigger is handeled
         */
    native public Boolean hasSpecificTrigger(double trigger);
    /**
         * Does this action manager has pointer triggers
         * @return {boolean} whether or not it has pointer triggers
         */
    public final Boolean hasPointerTriggers=null;
    /**
         * Does this action manager has pick triggers
         * @return {boolean} whether or not it has pick triggers
         */
    public final Boolean hasPickTriggers=null;
    public static final Boolean HasTriggers=null;
    public static final Boolean HasPickTriggers=null;
    native public static Boolean HasSpecificTrigger(double trigger);
    /**
         * Registers an action to this action manager
         * @param {BABYLON.Action} action - the action to be registered
         * @return {BABYLON.Action} the action amended (prepared) after registration
         */
    native public Action registerAction(Action action);
    /**
         * Process a specific trigger
         * @param {number} trigger - the trigger to process
         * @param evt {BABYLON.ActionEvent} the event details to be processed
         */
    native public void processTrigger(double trigger, ActionEvent evt);
    native public Object _getEffectiveTarget(Object target, String propertyPath);
    native public String _getProperty(String propertyPath);
    native public Object serialize(String name);
    native public static void Parse(Object parsedActions, AbstractMesh object, Scene scene);
    native public static String GetTriggerName(double trigger);
    protected ActionManager(){}
}

