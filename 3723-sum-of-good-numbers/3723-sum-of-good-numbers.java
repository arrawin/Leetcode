class Solution {
    public int sumOfGoodNumbers(int[] nums, int k) {
        int sum = 0,n = nums.length;
        for(int i=0;i<nums.length;i++){
            if (i - k >= 0 && nums[i] <= nums[i - k])
                continue;
            if (i + k < n && nums[i] <= nums[i + k])
                continue;
            sum += nums[i];
        }
        return sum;
    }
}