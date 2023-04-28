import java.util.Arrays;

public class TwoSum {
    public static int[] twoSum(int[] nums, int target) {
        int [] index = new int [2];
        for (int i = 0; i < nums.length; i++){
            for (int j = i+1; j < nums.length; j++){
                if (i != j) {
                    if (nums[i] + nums[j] == target){
                        index[0] = i;
                        index[1] = j;
                    }
                }
            }
        }
        return index;
    }

    public static void main (String [] args){
        int [] nums = {2,7,11,15};
        int target = 9;

        int [] output = twoSum(nums, target);
        System.out.println(Arrays.toString(output));
    }
}
