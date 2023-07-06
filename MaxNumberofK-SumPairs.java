import java.util.Arrays;

class Solution {
    public int maxOperations(int[] nums, int k) {
        // Find the max amount of pairs of numbers in an array nums that add up to k

        // Initialize the solution value as 0
        int rtn_added_up = 0;
        // Sort the array so we don't need to check all possible pair combinations
        Arrays.sort(nums);

        // 1,3,3,3,4 with 6
        // 1,2,3,4 with 5

        // ix starts at the beginning and moves right, iy starts at the end and moves left
        int ix = 0, iy = nums.length - 1;

        // This only works if the array is sorted, as it does not check all combinations
        // If the sum is too small, just keep moving ix right, and if it is too big, move ix left
        
        // Until the two indices meet and all pairs are checked
        while (ix < iy) {
            if (nums[ix] + nums[iy] < k) {
                // If the sum is too small, move ix right 1 and check again
                ix++;
            } else if (nums[ix] + nums[iy] > k) {
                // If the sum is too large move iy left 1 and check again
                iy--;
            } else {
                // The pair adds up to k, add to the number of working pairs and move ix and iy inwards
                rtn_added_up++;
                ix++;
                iy--;
            }
        }
        // Return the number of possible pairs
        return rtn_added_up;

    }
}
