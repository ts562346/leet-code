import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

public class SqrtXTest {
    /*
        Example 1:
        Input: x = 4
        Output: 2
        Explanation: The square root of 4 is 2, so we return 2.
     */
    @Test
    void example1(){
        int x = 4;
        SqrtX test = new SqrtX();
        assertEquals(2, test.mySqrt(x));
    }
    /*
        Example 2:
        Input: x = 8
        Output: 2
        Explanation: The square root of 8 is 2.82842..., and since
        we round it down to the nearest integer, 2 is returned.
     */
    @Test
    void example2(){
        int x = 8;
        SqrtX test = new SqrtX();
        assertEquals(2, test.mySqrt(x));
    }
    /*
        Example 3:
        Input: x = 9
        Output: 3
     */
    @Test
    void example3(){
        int x = 9;
        SqrtX test = new SqrtX();
        assertEquals(3, test.mySqrt(x));
    }
}
