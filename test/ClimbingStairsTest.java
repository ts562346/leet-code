import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ClimbingStairsTest {
    /*
        Example 1:
        Input: n = 2
        Output: 2
        Explanation: There are two ways to climb to the top.
        1. 1 step + 1 step
        2. 2 steps
     */
    @Test
    void example1(){
        assertEquals(2, new ClimbingStairs().climbStairs(2));
    }
    /*
        Example 2:
        Input: n = 3
        Output: 3
        Explanation: There are three ways to climb to the top.
        1. 1 step + 1 step + 1 step
        2. 1 step + 2 steps
        3. 2 steps + 1 step
     */
    @Test
    void example2(){
        assertEquals(3, new ClimbingStairs().climbStairs(3));
    }

}
