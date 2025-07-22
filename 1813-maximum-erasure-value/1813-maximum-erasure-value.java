class Solution {
    public int maximumUniqueSubarray(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        int max_sum = 0, sum = 0;
        int i = 0, j = 0;
        
        while (j < nums.length) {
            if (!set.contains(nums[j])) {
                set.add(nums[j]);
                sum += nums[j];
                max_sum = Math.max(max_sum, sum);
                j++;
            } else {
                set.remove(nums[i]);
                sum -= nums[i];
                i++;
            }
        }
        
        return max_sum;
    }
}
