/*

4. Median of Two Sorted Arrays - Hard

Given two sorted arrays nums1 and nums2 of size m and n respectively,
return the median of the two sorted arrays.

The overall run time complexity should be O(log (m+n)).

 */
public class MedianSortedArray {
    public double findMedianSortedArrays(int [] nums1, int [] nums2){
        int [] mergedArray = new int[nums1.length + nums2.length];

        int j = 0, k = 0, i = 0;
        while(j < nums1.length && k < nums2.length){
            if(nums1[j] < nums2[k]){
                mergedArray[i] = nums1[j];
                j++;
            } else {
                mergedArray[i] = nums2[k];
                k++;
            }
            i++;
        }

        if (j < nums1.length){
            for (int l = j; l < nums1.length; l++) {
                mergedArray[i] = nums1[j];
                i++;
            }
        } else if (k < nums2.length){
            for (int l = k; l < nums2.length; l++) {
                mergedArray[i] = nums2[k];
                i++;
            }
        }

        int midVal = mergedArray[Math.round(mergedArray.length/2)];
        if (mergedArray.length%2==0){
            return (midVal + mergedArray[Math.round(mergedArray.length/2)-1])/2.0;
        } else {
            return midVal;
        }
    }
}