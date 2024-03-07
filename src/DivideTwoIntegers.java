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

        if(dividend < 0){
            dividend = -dividend;
            negDividend = true;
        }
        if(divisor < 0){
            divisor = -divisor;
            negDivisor = true;
        }

        if (dividend == Integer.MAX_VALUE+1 && divisor == 1) {
            // Handle overflow case where quotient is less than -2^31
            i = Integer.MAX_VALUE+1;
        }
        while(dividend>divisor || dividend==divisor){
            dividend-=divisor;
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
