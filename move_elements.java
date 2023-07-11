class Solution {
    public void moveZeroes(int[] nums) {

        int i = 0;
        for (int num : nums) {
            if (num != 0) {                           // If the current number is not zero,
                nums[i] = num;                        // move it to the front of the array               
                i++;
            }
        }

        while (i < nums.length) {
            nums[i] = 0;                             // Fill the remaining elements with zeroes
            i++;
        }

    }
}