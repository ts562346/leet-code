import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DivideTwoIntegersTest {
    /*
        Example 1:

        Input: dividend = 10, divisor = 3
        Output: 3
     */
    @Test
    void example1(){
        int dividend = 10;
        int divisor = 3;

        DivideTwoIntegers test = new DivideTwoIntegers();
        assert 3 == test.divide(dividend, divisor);
    }

    /*
        Example 2:

        Input: dividend = 7, divisor = -3
        Output: -2
     */
    @Test
    void example2(){
        int dividend = 7;
        int divisor = -3;

        DivideTwoIntegers test = new DivideTwoIntegers();
        assert -2 == test.divide(dividend, divisor);
    }

    /*
        Example 3:

        Input: dividend = -2147483648, divisor = -1
        Output: 2147483647
     */
    @Test
    void example3(){
        int dividend = -2147483648;
        int divisor = -1;

        DivideTwoIntegers test = new DivideTwoIntegers();
        assertEquals(2147483647, test.divide(dividend, divisor));
    }

}
