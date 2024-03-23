import org.junit.Test;
import static org.junit.Assert.assertArrayEquals;

public class MergeSortedArrayTest {
    /*
        Example 1:
        Input: nums1 = [1,2,3,0,0,0], m = 3, nums2 = [2,5,6], n = 3
        Output: [1,2,2,3,5,6]
     */
    @Test
    public void example1() {
        MergeSortedArray test = new MergeSortedArray();

        int[] nums1 = {1, 2, 3, 0, 0, 0};
        int m = 3;
        int[] nums2 = {2, 5, 6};
        int n = 3;

        test.merge(nums1, m, nums2, n);

        int[] expected = {1, 2, 2, 3, 5, 6};
        assertArrayEquals(expected, nums1);
    }
    /*
        Example 2:
        Input: nums1 = [1], m = 1, nums2 = [], n = 0
        Output: [1]
     */
    @Test
    public void example2() {
        MergeSortedArray test = new MergeSortedArray();

        int[] nums1 = {1};
        int m = 1;
        int[] nums2 = {};
        int n = 0;

        test.merge(nums1, m, nums2, n);

        int[] expected = {1};
        assertArrayEquals(expected, nums1);
    }
    /*
        Example 3:
        Input: nums1 = [0], m = 0, nums2 = [1], n = 1
        Output: [1]
     */
    @Test
    public void example3() {
        MergeSortedArray test = new MergeSortedArray();

        int[] nums1 = {0};
        int m = 0;
        int[] nums2 = {1};
        int n = 1;

        test.merge(nums1, m, nums2, n);

        int[] expected = {1};
        assertArrayEquals(expected, nums1);
    }
}
