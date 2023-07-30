class Solution {
    public int[] twoSum(int[] numbers, int target) {

        // IDEA:
        // by having 2 pointers, you find 2 values that match up target
        // we cmp first and last elemt since the list is already in order

        // this is the array that will
        int[] r_arr = new int[2];

        int start = 0;
        int end = numbers.length - 1;
        // from start to element before last

        while (start <= end) {

            // this means the first and elements are less than target still
            // need to increment start because...
            if (numbers[start] + numbers[end] < target) {
                start++;
            }

            // this means first and last elem are greater than target
            // need to decrement end because...
            else if (numbers[start] + numbers[end] > target) {
                end--;
            }

            // this means the first and last elem == target so include values
            else {
                r_arr[0] = ++start;
                r_arr[1] = ++end;
                return r_arr;
            }
        }
        return r_arr;

    }
}