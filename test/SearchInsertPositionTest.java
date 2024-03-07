import org.junit.jupiter.api.Test;

public class SearchInsertPositionTest {
    /*
        Example 1:

        Input: nums = [1,3,5,6], target = 5
        Output: 2
     */
    @Test
    void example1(){
        int[] nums = {1, 3, 5, 6};
        int target = 5;
        SearchInsertPosition test = new SearchInsertPosition();
        assert 2 == test.searchInsert(nums, target);
    }
    /*
        Example 2:

        Input: nums = [1,3,5,6], target = 2
        Output: 1
     */
    @Test
    void example2(){
        int[] nums = {1,3,5,6};
        int target = 2;
        SearchInsertPosition test = new SearchInsertPosition();
        assert 1 == test.searchInsert(nums, target);
    }
    /*
        Example 3:

        Input: nums = [1,3,5,6], target = 7
        Output: 4
     */
    @Test
    void example3(){
        int[] nums = {1,3,5,6};
        int target = 7;
        SearchInsertPosition test = new SearchInsertPosition();
        assert 4 == test.searchInsert(nums, target);
    }
}
