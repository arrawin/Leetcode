class Solution {
    public int longestMonotonicSubarray(int[] nums) {
        int incLen = 1 , decLen = 1 , maxLen = 1;
        for(int i = 0 , j = 1 ; j < nums.length ; i++,j++){
            if((nums[i] < nums[j])){
                incLen++;
                decLen = 1;
            }
            else if((nums[i] > nums[j])){
                decLen++;
                incLen = 1;
            }
            else{
                incLen = 1;
                decLen = 1;

            }
            maxLen = Math.max((Math.max(incLen , decLen)),maxLen);


        }
     return maxLen;       
    }
}