import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class TwoSumTest {
    /*
        Example 1:

        Input: nums = [2,7,11,15], target = 9
        Output: [0,1]
        Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].

        Example 2:

        Input: nums = [3,2,4], target = 6
        Output: [1,2]

        Example 3:

        Input: nums = [3,3], target = 6
        Output: [0,1]
    */
    @Test
    void example1(){
        int [] nums = {2,7,11,15};
        int target = 9;

        TwoSum test = new TwoSum();
        assertArrayEquals(new int[]{0, 1}, test.twoSum(nums, target));
    }

    @Test
    void example2(){
        int [] nums = {3,2,4};
        int target = 6;

        TwoSum test = new TwoSum();
        assertArrayEquals(new int[]{1,2}, test.twoSum(nums, target));
    }

    @Test
    void example3(){
        int [] nums = {3,3};
        int target = 6;

        TwoSum test = new TwoSum();
        assertArrayEquals(new int[]{0, 1}, test.twoSum(nums, target));
    }
}
