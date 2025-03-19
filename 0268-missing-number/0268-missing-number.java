class Solution {
    public int missingNumber(int[] nums) {
        int[] freq = new int[nums.length+1];
        for(int ind = 0 ; ind < nums.length; ind++){
            freq[nums[ind]]++;
        }
        for(int ind = 0 ; ind < nums.length+1 ; ind++){
            if(freq[ind]==0){
                return ind;
            }
        }
        if(freq[nums.length+1]==1){
            return nums.length+1;
        }
    return -1;
   
    }
}