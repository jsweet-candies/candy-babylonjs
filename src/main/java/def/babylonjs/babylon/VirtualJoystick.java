package def.babylonjs.babylon;
public class VirtualJoystick extends def.js.Object {
    public Boolean reverseLeftRight;
    public Boolean reverseUpDown;
    public Vector3 deltaPosition;
    public Boolean pressed;
    public VirtualJoystick(Boolean leftJoystick){}
    native public void setJoystickSensibility(double newJoystickSensibility);
    /**
        * Change the color of the virtual joystick
        * @param newColor a string that must be a CSS color value (like "red") or the hexa value (like "#FF0000")
        */
    native public void setJoystickColor(String newColor);
    native public void setActionOnTouch(java.util.function.Supplier<Object> action);
    native public void setAxisForLeftRight(JoystickAxis axis);
    native public void setAxisForUpDown(JoystickAxis axis);
    native public void releaseCanvas();
    public VirtualJoystick(){}
}

