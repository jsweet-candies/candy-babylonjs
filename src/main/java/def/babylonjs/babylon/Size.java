package def.babylonjs.babylon;
public class Size extends ISize {
    public double width;
    public double height;
    /**
         * Creates a Size object from the passed width and height (floats).
         */
    public Size(double width, double height){}
    native public String toString();
    /**
         * Returns the string "Size"
         */
    native public String getClassName();
    /**
         * Returns the Size hash code.
         */
    native public double getHashCode();
    /**
         * Updates the current size from the passed one.
         * Returns the updated Size.
         */
    native public void copyFrom(Size src);
    /**
         * Updates in place the current Size from the passed floats.
         * Returns the updated Size.
         */
    native public Size copyFromFloats(double width, double height);
    /**
         * Updates in place the current Size from the passed floats.
         * Returns the updated Size.
         */
    native public Size set(double width, double height);
    /**
         * Returns a new Size set with the multiplication result of the current Size and the passed floats.
         */
    native public Size multiplyByFloats(double w, double h);
    /**
         * Returns a new Size copied from the passed one.
         */
    @jsweet.lang.Name("clone")
    native public Size Clone();
    /**
         * Boolean : True if the current Size and the passed one width and height are strictly equal.
         */
    @jsweet.lang.Name("equals")
    native public Boolean Equals(Size other);
    /**
         * Returns the surface of the Size : width * height (float).
         */
    public final double surface=0;
    /**
         * Returns a new Size set to (0.0, 0.0)
         */
    native public static Size Zero();
    /**
         * Returns a new Size set as the addition result of the current Size and the passed one.
         */
    native public Size add(Size otherSize);
    /**
         * Returns a new Size set as the subtraction result of  the passed one from the current Size.
         */
    native public Size subtract(Size otherSize);
    /**
         * Returns a new Size set at the linear interpolation "amount" between "start" and "end".
         */
    native public static Size Lerp(Size start, Size end, double amount);
    protected Size(){}
}

