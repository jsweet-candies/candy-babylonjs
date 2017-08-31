package def.babylonjs.babylon;
import def.dom.HTMLElement;
public class DebugLayer extends def.js.Object {
    public static String InspectorURL;
    public DebugLayer(Scene scene){}
    native public Boolean isVisible();
    native public void hide();
    native public void show(Config config);
    /** This is an automatically generated object type (see the source definition). */
    @jsweet.lang.ObjectType
    public static class Config extends def.js.Object {
        @jsweet.lang.Optional
        public Boolean popup;
        @jsweet.lang.Optional
        public double initialTab;
        @jsweet.lang.Optional
        public HTMLElement parentElement;
        @jsweet.lang.Optional
        public NewColors newColors;
        /** This is an automatically generated object type (see the source definition). */
        @jsweet.lang.ObjectType
        public static class NewColors extends def.js.Object {
            @jsweet.lang.Optional
            public String backgroundColor;
            @jsweet.lang.Optional
            public String backgroundColorLighter;
            @jsweet.lang.Optional
            public String backgroundColorLighter2;
            @jsweet.lang.Optional
            public String backgroundColorLighter3;
            @jsweet.lang.Optional
            public String color;
            @jsweet.lang.Optional
            public String colorTop;
            @jsweet.lang.Optional
            public String colorBot;
        }
    }
    native public void show();
    protected DebugLayer(){}
}

