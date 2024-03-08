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
    /*
        Example 4:

        Input: dividend = -2147483648, divisor = 1
        Output: -2147483648
     */
    @Test
    void example4(){
        int dividend = -2147483648;
        int divisor = 1;

        DivideTwoIntegers test = new DivideTwoIntegers();
        assertEquals(-2147483648, test.divide(dividend, divisor));
    }
    /*
        Example 5:

        Input: dividend = -2147483648, divisor = 1
        Output: -2147483648
     */
    @Test
    void example5(){
        int dividend = -2147483648;
        int divisor = 2;

        DivideTwoIntegers test = new DivideTwoIntegers();
        assertEquals(-1073741824, test.divide(dividend, divisor));
    }
    /*
        Example 6:

        Input: dividend = 1000000000, divisor = 1
        Output: 1000000000
     */
    @Test
    void example6(){
        int dividend = 1000000000;
        int divisor = 1;

        DivideTwoIntegers test = new DivideTwoIntegers();
        assertEquals(1000000000, test.divide(dividend, divisor));
    }
    /*
        Example 7:

        Input: dividend = 1, divisor = 2
        Output: 0
     */
    @Test
    void example7(){
        int dividend = 1;
        int divisor = 2;

        DivideTwoIntegers test = new DivideTwoIntegers();
        assertEquals(0, test.divide(dividend, divisor));
    }
    /*
        Example 8:

        Input: dividend = 2147483647, divisor = -1
        Output: -2147483648
     */
    @Test
    void example8(){
        int dividend = 2147483647;
        int divisor = -1;

        DivideTwoIntegers test = new DivideTwoIntegers();
        assertEquals(-2147483647, test.divide(dividend, divisor));
    }

}
