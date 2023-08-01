class Solution {
    public int longestSubarray(int[] nums) {

        int zero_count = 0;
        int longest_window = 0;

        int start = 0;

        for (int ix = 0; ix < nums.length; ix++) {
            // zero_count += nums[ix] == 0 ? 1 : 0;
            if (nums[ix] == 0) {
                zero_count += 1;
            }

            // we need this while loop because ...
            //
            while (zero_count > 1) {
                if (nums[start] == 0) {
                    zero_count -= 1;
                }

                // zero_count -= nums[start] == 0 ? 1 : 0;
                start++;
            }

            // we assign the max of longest window and (ix - start)
            // because
            longest_window = Math.max(longest_window, ix - start);
        }

        // longest subarray with 1s after deleting one element
        return longest_window;

    }
}