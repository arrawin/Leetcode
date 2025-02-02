class Solution {
    public boolean check(int[] nums) {
        int len = nums.length;
        int count = 1;
        if(len==1){
            return true;
        }
        for(int i = 1 ; i < (2*len) ; i++){
            if(nums[(i-1)%len] <= nums[i%len]){
                count++;
            }
            else{
                count = 1;
            }
            if(count == len){
                return true;
            }
        }
        
    return false;
    }
}