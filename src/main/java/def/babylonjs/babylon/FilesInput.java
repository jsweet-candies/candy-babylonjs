package def.babylonjs.babylon;
import def.dom.File;
import def.dom.HTMLElement;
import def.dom.HTMLCanvasElement;
public class FilesInput extends def.js.Object {
    public static File[] FilesToLoad;
    public FilesInput(Engine p_engine, Scene p_scene, HTMLCanvasElement p_canvas, Object p_sceneLoadedCallback, Object p_progressCallback, Object p_additionnalRenderLoopLogicCallback, Object p_textureLoadingCallback, Object p_startingProcessingFilesCallback){}
    native public void monitorElementForDragNDrop(HTMLElement p_elementToMonitor);
    native public void loadFiles(Object event);
    native public void reload();
    protected FilesInput(){}
}

