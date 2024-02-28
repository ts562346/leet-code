import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class RomanToIntegerTest {
    /*
       Example 1:

       Input: s = "III"
       Output: 3
       Explanation: III = 3.
   */
    @Test
    void example1(){
        String x = "III";
        RomanToInteger test = new RomanToInteger();
        assertEquals(3, test.romanToInt(x));
    }

    /*
        Example 2:

        Input: s = "LVIII"
        Output: 58
        Explanation: L = 50, V= 5, III = 3.
     */
    @Test
    void example2(){
        String x = "LVIII";
        RomanToInteger test = new RomanToInteger();
        assertEquals(58, test.romanToInt(x));
    }

    /*
        Example 3:

        Input: s = "MCMXCIV"
        Output: 1994
        Explanation: M = 1000, CM = 900, XC = 90 and IV = 4.
     */
    @Test
    void example3(){
        String x = "MCMXCIV";
        RomanToInteger test = new RomanToInteger();
        assertEquals(1994, test.romanToInt(x));
    }
}
