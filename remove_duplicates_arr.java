class Solution {
    public int removeDuplicates(int[] nums) {

        int ecx = 1;

        for (int ix = 1; ix < nums.length; ix++) {

            System.out.println("First: " + nums[ix] + " and " + nums[ix - 1]);

            if (nums[ix] != nums[ix - 1]) {
                nums[ecx] = nums[ix];
                ecx++;
            }

        }

        for (int num : nums) {
            System.out.println(num);
        }

        return ecx;
    }
}