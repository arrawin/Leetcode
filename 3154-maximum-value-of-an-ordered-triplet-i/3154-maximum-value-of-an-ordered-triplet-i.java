class Solution {
    public long maximumTripletValue(int[] nums) {
        int left , mid , right ; 
        long max_val = Long.MIN_VALUE;
        long sum = 0;
        for(left = 0 ; left < nums.length-2 ; left++)
        {
            for(mid = left+1 ; mid < nums.length-1 ; mid++)
            {
                for(right = mid+1 ; right<nums.length ; right++)
                {
                    sum = (long)((nums[left]-nums[mid])) * (long)(nums[right]);
                    max_val = Math.max(sum,max_val);

                }
            }
        }
        return max_val < 0 ? 0 : max_val;
        
    }
}