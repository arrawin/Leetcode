class Solution {
    public int AbsVal(int num){
        if(num<0){
            num=-num;
        }
        return num;
    }
    public int maxAdjacentDistance(int[] nums) {
        int max_val = AbsVal(nums[nums.length-1] - nums[0]);
        int val = 0;
        for(int ind = 1 ; ind < nums.length ; ind++) {
            val = AbsVal(nums[ind]-nums[ind-1]);
            if(val > max_val){
                max_val = val; 
            }
        }
        return max_val;
    }
}