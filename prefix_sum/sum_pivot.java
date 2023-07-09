class Solution {
    public int pivotIndex(int[] nums) {

        int sum = 0;
        int r_pivot = 0;
        int r_zero = 0;

        for (int ix = 0; ix < nums.length / 2; ix++) {
            sum += nums[ix];
        }

        for (int iy = nums.length / 2 + 1; iy < nums.length; iy++) {
            r_pivot += nums[iy];
        }

        for (int iz = 1; iz < nums.length; iz++) {
            r_zero += nums[iz];
        }

        if (sum == r_pivot) {
            r_pivot = nums.length / 2;
        } else if (r_zero == 0) {
            r_pivot = 0;
        } else {
            r_pivot = -1;
        }
        return r_pivot;
    }
}