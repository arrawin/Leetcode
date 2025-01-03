class Solution {
    public int waysToSplitArray(int[] nums) {
        int res = 0 ;
        long totalSum = 0, lSum = 0;
        for(int i = 0 ; i < nums.length ; i++){
            totalSum+=nums[i];
        }
        for(int i = 0 ; i < nums.length-1 ; i++){
            lSum+=nums[i];
            totalSum-=nums[i];
            if(lSum>=totalSum){
                res++;
            }

        }
        return res;
    }
}