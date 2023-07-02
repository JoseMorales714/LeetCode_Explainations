import java.util.Arrays;

class Solution {
    public int maxOperations(int[] nums, int k) {

        int rtn_added_up = 0;
        Arrays.sort(nums);

        // 1,3,3,3,4 with 6
        // 1,2,3,4 with 5

        int ix = 0, iy = nums.length - 1;

        while (ix < iy) {
            if (nums[ix] + nums[iy] < k) {
                ix++;
            } else if (nums[ix] + nums[iy] > k) {
                iy--;
            } else {
                rtn_added_up++;
                ix++;
                iy--;
            }
        }

        return rtn_added_up;

    }
}