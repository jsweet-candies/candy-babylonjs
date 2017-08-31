package def.babylonjs.babylon;
import def.dom.Event;
/**
     * ActionEvent is the event beint sent when an action is triggered.
     */
public class ActionEvent extends def.js.Object {
    public Object source;
    public double pointerX;
    public double pointerY;
    public AbstractMesh meshUnderPointer;
    public Object sourceEvent;
    public Object additionalData;
    /**
         * @constructor
         * @param source The mesh or sprite that triggered the action.
         * @param pointerX The X mouse cursor position at the time of the event
         * @param pointerY The Y mouse cursor position at the time of the event
         * @param meshUnderPointer The mesh that is currently pointed at (can be null)
         * @param sourceEvent the original (browser) event that triggered the ActionEvent
         */
    public ActionEvent(Object source, double pointerX, double pointerY, AbstractMesh meshUnderPointer, Object sourceEvent, Object additionalData){}
    /**
         * Helper function to auto-create an ActionEvent from a source mesh.
         * @param source The source mesh that triggered the event
         * @param evt {Event} The original (browser) event
         */
    native public static ActionEvent CreateNew(AbstractMesh source, Event evt, Object additionalData);
    /**
         * Helper function to auto-create an ActionEvent from a source mesh.
         * @param source The source sprite that triggered the event
         * @param scene Scene associated with the sprite
         * @param evt {Event} The original (browser) event
         */
    native public static ActionEvent CreateNewFromSprite(Sprite source, Scene scene, Event evt, Object additionalData);
    /**
         * Helper function to auto-create an ActionEvent from a scene. If triggered by a mesh use ActionEvent.CreateNew
         * @param scene the scene where the event occurred
         * @param evt {Event} The original (browser) event
         */
    native public static ActionEvent CreateNewFromScene(Scene scene, Event evt);
    native public static ActionEvent CreateNewFromPrimitive(Object prim, Vector2 pointerPos, Event evt, Object additionalData);
    /**
         * @constructor
         * @param source The mesh or sprite that triggered the action.
         * @param pointerX The X mouse cursor position at the time of the event
         * @param pointerY The Y mouse cursor position at the time of the event
         * @param meshUnderPointer The mesh that is currently pointed at (can be null)
         * @param sourceEvent the original (browser) event that triggered the ActionEvent
         */
    public ActionEvent(Object source, double pointerX, double pointerY, AbstractMesh meshUnderPointer, Object sourceEvent){}
    /**
         * @constructor
         * @param source The mesh or sprite that triggered the action.
         * @param pointerX The X mouse cursor position at the time of the event
         * @param pointerY The Y mouse cursor position at the time of the event
         * @param meshUnderPointer The mesh that is currently pointed at (can be null)
         * @param sourceEvent the original (browser) event that triggered the ActionEvent
         */
    public ActionEvent(Object source, double pointerX, double pointerY, AbstractMesh meshUnderPointer){}
    /**
         * Helper function to auto-create an ActionEvent from a source mesh.
         * @param source The source mesh that triggered the event
         * @param evt {Event} The original (browser) event
         */
    native public static ActionEvent CreateNew(AbstractMesh source, Event evt);
    /**
         * Helper function to auto-create an ActionEvent from a source mesh.
         * @param source The source mesh that triggered the event
         * @param evt {Event} The original (browser) event
         */
    native public static ActionEvent CreateNew(AbstractMesh source);
    /**
         * Helper function to auto-create an ActionEvent from a source mesh.
         * @param source The source sprite that triggered the event
         * @param scene Scene associated with the sprite
         * @param evt {Event} The original (browser) event
         */
    native public static ActionEvent CreateNewFromSprite(Sprite source, Scene scene, Event evt);
    /**
         * Helper function to auto-create an ActionEvent from a source mesh.
         * @param source The source sprite that triggered the event
         * @param scene Scene associated with the sprite
         * @param evt {Event} The original (browser) event
         */
    native public static ActionEvent CreateNewFromSprite(Sprite source, Scene scene);
    native public static ActionEvent CreateNewFromPrimitive(Object prim, Vector2 pointerPos, Event evt);
    native public static ActionEvent CreateNewFromPrimitive(Object prim, Vector2 pointerPos);
    protected ActionEvent(){}
}

