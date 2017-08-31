package def.babylonjs.babylon;
import def.js.Array;
public class QuadraticMatrix extends def.js.Object {
    public Array<Double> data;
    public QuadraticMatrix(Array<Double> data){}
    native public double det(Object a11, Object a12, Object a13, Object a21, Object a22, Object a23, Object a31, Object a32, Object a33);
    native public void addInPlace(QuadraticMatrix matrix);
    native public void addArrayInPlace(Array<Double> data);
    native public QuadraticMatrix add(QuadraticMatrix matrix);
    native public static QuadraticMatrix FromData(double a, double b, double c, double d);
    native public static double[] DataFromNumbers(double a, double b, double c, double d);
    public QuadraticMatrix(){}
    public QuadraticMatrix(Double[] data){}
    native public void addArrayInPlace(Double[] data);
}

