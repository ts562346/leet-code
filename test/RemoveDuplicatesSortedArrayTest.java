import org.junit.jupiter.api.Test;
public class RemoveDuplicatesSortedArrayTest {
    /*
       Example 1:

       Input: nums = [1,1,2]
       Output: 2, nums = [1,2,_]
   */
    @Test
    void example1(){
        RemoveDuplicatesSortedArray solution = new RemoveDuplicatesSortedArray();
        int[] nums1 = {1, 1, 2};
        int[] expectedNums1 = {1, 2};
        int k1 = solution.removeDuplicates(nums1);
        assert k1 == expectedNums1.length;
        for (int i = 0; i < k1; i++) {
            assert nums1[i] == expectedNums1[i];
        }
    }

    /*
       Example 2:

       Input: nums = [0,0,1,1,1,2,2,3,3,4]
       Output: 5, nums = [0,1,2,3,4,_,_,_,_,_]
   */
    @Test
    void example2(){
        RemoveDuplicatesSortedArray solution = new RemoveDuplicatesSortedArray();
        int[] nums1 = {0,0,1,1,1,2,2,3,3,4};
        int[] expectedNums1 = {0,1,2,3,4};
        int k1 = solution.removeDuplicates(nums1);
        assert k1 == expectedNums1.length;
        for (int i = 0; i < k1; i++) {
            assert nums1[i] == expectedNums1[i];
        }
    }
}
