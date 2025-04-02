class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int max_val=0;
        int count = 0 ;
        int left = 0 ;
        for(int i = 0 ; i < nums.length ; i++)
        {
            if(nums[i]==1){
                count++;
                while(i<nums.length-1 && nums[i+1]==1){
                    count++;    
                    i++;
                }
                if(max_val<count){max_val = count;}
            }
                count = 0;
            }
    return max_val;
    }
}