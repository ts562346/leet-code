import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertArrayEquals;

public class PlusOneTest {
    /*
        Example 1:
        Input: digits = [1,2,3]
        Output: [1,2,4]
     */
    @Test
    void example1(){
        int [] digits = {1,2,3};
        int [] expected = {1,2,4};
        PlusOne test = new PlusOne();
        assertArrayEquals(test.plusOne(digits), expected);
    }
    /*
        Example 2:
        Input: digits = [4,3,2,1]
        Output: [4,3,2,2]
     */
    @Test
    void example2(){
        int [] digits = {4,3,2,1};
        int [] expected = {4,3,2,2};
        PlusOne test = new PlusOne();
        assertArrayEquals(test.plusOne(digits), expected);
    }
    /*
        Example 3:
        Input: digits = [9]
        Output: [1,0]
     */
        @Test
        void example3(){
            int [] digits = {9};
            int [] expected = {1,0};
            PlusOne test = new PlusOne();
            assertArrayEquals(test.plusOne(digits), expected);
    }

}
