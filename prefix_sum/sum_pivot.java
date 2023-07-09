class Solution {
    public int pivotIndex(int[] nums) {

        int sum = 0;
        int r_pivot = 0;

        for (int ix = 0; ix < nums.length / 2; ix++) {
            sum += nums[ix];
        }

        for (int iy = nums.length / 2 + 1; iy < nums.length; iy++) {
            r_pivot += nums[iy];
        }

        if (sum == r_pivot) {
            r_pivot = nums.length / 2;
        }

        return r_pivot;

    }
}