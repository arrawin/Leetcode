class Solution {
    public int maxAscendingSum(int[] nums) {
          int sum = nums[0], maxSum = nums[0];  

        for (int i = 1; i < nums.length; i++) {  // Start from index 1
            if (nums[i] > nums[i - 1]) {
                sum += nums[i];  // Continue summing if ascending
            } else {
                sum = nums[i];  // Reset sum for a new sequence
            }
            maxSum = Math.max(maxSum, sum);  // Update maxSum
        }

        return maxSum;
    }
}