package sliding_window;

class Solution {
    public double findMaxAverage(int[] nums, int k) {
        // Find the largest average continuous subarray given the array nums and length k
        
        // If array is only 1 element, return that
        if (nums.length <= 1)
            return (double) nums[0];
        // Initialize the sum value
        int sum = 0;
        // Start with the sum as the sum of the first k elements of the array
        for (int i = 0; i < k; i++) {
            sum += nums[i];
        }
        // Max sum variable to store the largest sum for comparison
        int maxSum = sum;
        // Iteratively move one index forward, adding the next value and subtracting the oldest value to get the current sum
        for (int i = k; i < nums.length; i++) {
            sum += nums[i];
            sum -= nums[i - k];
            // If the current sum is bigger than the previous best, set the best to the current sum
            if (sum > maxSum) 
                maxSum = sum;
        }
        // Divide by the length to get the average
        return (double) maxSum / (double) k;

    }
}
