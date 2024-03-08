import org.junit.jupiter.api.Test;

import static java.util.Arrays.sort;

public class RemoveElementTest {
    /*
        Example 1:

        Input: nums = [3,2,2,3], val = 3
        Output: 2, nums = [2,2,_,_]
        Explanation: Your function should return k = 2, with the first two elements of nums being 2.
        It does not matter what you leave beyond the returned k (hence they are underscores).
     */
    @Test
    void example1(){
        int[] nums = {3, 2, 2, 3}; // Input array
        int val = 3; // Value to remove
        int[] expectedNums = {2, 2}; // The expected answer with correct length.
        // It is sorted with no values equaling val.

        RemoveElement test = new RemoveElement();
        int k = test.removeElement(nums, val); // Calls your implementation

        assert k == expectedNums.length;
        sort(nums, 0, k); // Sort the first k elements of nums
        for (int i = 0; i < expectedNums.length; i++) {
            assert nums[i] == expectedNums[i];
        }
    }
    /*
        Example 2:

        Input: nums = [0,1,2,2,3,0,4,2], val = 2
        Output: 5, nums = [0,1,4,0,3,_,_,_]
        Explanation: Your function should return k = 2, with the first two elements of nums being 2.
        It does not matter what you leave beyond the returned k (hence they are underscores).
    */
    @Test
    void example2(){
        int[] nums = {0,1,2,2,3,0,4,2}; // Input array
        int val = 2; // Value to remove
        int[] expectedNums = {0,1,4,0,3}; // The expected answer with correct length.
        // It is sorted with no values equaling val.

        RemoveElement test = new RemoveElement();
        int k = test.removeElement(nums, val); // Calls your implementation

        assert k == expectedNums.length;
        sort(nums, 0, k); // Sort the first k elements of nums
        sort(expectedNums);
        for (int i = 0; i < expectedNums.length; i++) {
            assert nums[i] == expectedNums[i];
        }
    }
}
