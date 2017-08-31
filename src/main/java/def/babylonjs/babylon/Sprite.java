package def.babylonjs.babylon;
public class Sprite extends def.js.Object {
    public String name;
    public Vector3 position;
    public Color4 color;
    public double width;
    public double height;
    public double angle;
    public double cellIndex;
    public double invertU;
    public double invertV;
    public Boolean disposeWhenFinishedAnimating;
    public Animation[] animations;
    public Boolean isPickable;
    public ActionManager actionManager;
    public double size;
    public Sprite(String name, SpriteManager manager){}
    native public void playAnimation(double from, double to, Boolean loop, double delay, java.lang.Runnable onAnimationEnd);
    native public void stopAnimation();
    native public void _animate(double deltaTime);
    native public void dispose();
    protected Sprite(){}
}

