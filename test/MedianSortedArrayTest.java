import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/*

    Example 1:

    Input: nums1 = [1,3], nums2 = [2]
    Output: 2.00000
    Explanation: merged array = [1,2,3] and median is 2.

    Example 2:

    Input: nums1 = [1,2], nums2 = [3,4]
    Output: 2.50000
    Explanation: merged array = [1,2,3,4] and median is (2 + 3) / 2 = 2.5.

 */

class MedianSortedArrayTest {
    @Test
    void example1(){
        int [] nums1 = {1,3};
        int [] nums2 = {2};

        assertEquals(2.0, MedianSortedArray.findMedianSortedArrays(nums1,nums2));
    }

    @Test
    void example2(){
        int [] nums1 = {1,3};
        int [] nums2 = {2,4};

        assertEquals(2.5, MedianSortedArray.findMedianSortedArrays(nums1,nums2));
    }


}