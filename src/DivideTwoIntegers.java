/*

29. Divide Two Integers - Medium

Given two integers dividend and divisor, divide two integers without using
multiplication, division, and mod operator.

The integer division should truncate toward zero, which means losing its
fractional part. For example, 8.345 would be truncated to 8, and -2.7335
would be truncated to -2.

Return the quotient after dividing dividend by divisor.

Note: Assume we are dealing with an environment that could only store integers
within the 32-bit signed integer range: [−2^31, 231 − 1]. For this problem, if
the quotient is strictly greater than 2^31 - 1, then return 2^31 - 1, and if
the quotient is strictly less than -2^31, then return -2^31.

 */
public class DivideTwoIntegers {
    public int divide(int dividend, int divisor) {
        int i = 0;
        boolean negDividend = false;
        boolean negDivisor = false;

        if (dividend == Integer.MIN_VALUE && divisor == 1) {
            return Integer.MIN_VALUE;
        } else if (dividend == Integer.MAX_VALUE && divisor == 1) {
            return Integer.MAX_VALUE;
        } else if (dividend == Integer.MIN_VALUE && divisor == -1){
            return Integer.MAX_VALUE;
        } else if (dividend == Integer.MAX_VALUE && divisor == -1){
            return Integer.MIN_VALUE+1;
        }

        if(divisor == 1 || divisor == -1){
            return dividend*divisor;
        }

        if(dividend < 0){
            negDividend = true;
        }

        if(divisor < 0){
            negDivisor = true;
        }

        long dvd = Math.abs((long) dividend);
        long dvs = Math.abs((long) divisor);

        if(dvd<dvs){
            return 0;
        }

        while(dvd>dvs || dvd==dvs){
            dvd-=dvs;
            i++;
        }

        if (negDividend && negDivisor)
            return i;
        else if (negDividend || negDivisor)
            return -i;
        else
            return i;
    }
}
