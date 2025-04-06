class Solution {
    public int singleNumber(int[] nums) {
        int res = 0;
        for(int ind = 0 ; ind < nums.length ; ind++)
        {
            res ^= nums[ind];
        }
        return  res;
    }
}