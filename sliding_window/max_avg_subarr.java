class Solution {
    public double findMaxAverage(int[] nums, int k) {

        if (nums.length <= 1)
            return (double) nums[0];
        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += nums[i];
        }
        int maxSum = sum;
        for (int i = k; i < nums.length; i++) {
            sum += nums[i];
            sum -= nums[i - k];
            if (sum > maxSum)
                maxSum = sum;
        }

        return (double) maxSum / (double) k;

    }
}