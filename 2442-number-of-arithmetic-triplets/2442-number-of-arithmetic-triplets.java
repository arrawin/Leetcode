class Solution {
    public int arithmeticTriplets(int[] nums, int diff) {
        int left , mid , right ; 
        int count = 0;
        for(left = 0 ; left < nums.length-2 ; left++)
        {
            for(mid = left+1 ; mid < nums.length-1 ; mid++)
            {
                for(right = mid+1 ; right<nums.length ; right++)
                {
                   if(nums[mid]-nums[left]==diff && nums[right]-nums[mid]==diff){
                    count++;
                   }

                }
            }
        }
        return count;
        
    }
}