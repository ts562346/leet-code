/*

69. Sqrt(x) - Easy

Given a non-negative integer x, return the square root of x rounded down
to the nearest integer. The returned integer should be non-negative as well.

You must not use any built-in exponent function or operator.

For example, do not use pow(x, 0.5) in c++ or x ** 0.5 in python.

 */
public class SqrtX {
    public int mySqrt(int x) {

        double x0 = x / 2.0;
        double x1;

        do {
            x1 = x0;
            x0 = (x0 + x / x0) / 2;
        } while ((x1 - x0) >= 0.1);

        return (int) Math.floor(x0);
    }

}
