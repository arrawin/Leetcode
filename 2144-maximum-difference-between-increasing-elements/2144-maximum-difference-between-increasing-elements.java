class Solution {
    public int maximumDifference(int[] nums) {
        int max = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if ((i < j) && nums[i] < nums[j]) {
                    int diff = nums[j] - nums[i];
                    if (diff > max) {
                        max = diff;
                    }
                }
            }
        }
        return max == 0 ? -1 : max;
    }
}