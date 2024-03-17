import java.util.ArrayList;

/*

69. Sqrt(x) - Easy

Given a non-negative integer x, return the square root of x rounded down
to the nearest integer. The returned integer should be non-negative as well.

You must not use any built-in exponent function or operator.

For example, do not use pow(x, 0.5) in c++ or x ** 0.5 in python.

 */
public class SqrtX {
    public int mySqrt(int x) {
        ArrayList<Integer> list = primeFactor(x);

        for (int i = 0; i < list.size(); i++){

        }
        return i;
    }

    public ArrayList<Integer> primeFactor (int n){
        ArrayList<Integer> list = new ArrayList<>();
        while (n % 2 == 0) {
            list.add(2);
            n /= 2;
        }

        for (int i = 3; i <= Math.sqrt(n); i += 2) {
            while (n % i == 0) {
                list.add(i);
                n /= i;
            }
        }

        if (n > 2)
            list.add(n);

        return list;
    }
}
