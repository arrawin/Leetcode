class Solution {
    public boolean check(int[] nums) {
        int count = 0;
        int len = nums.length;
        if (len == 1) {
            return true;
        }
        for (int i = 1; i <2*len; i++) {
           if(nums[(i-1)%len] <= nums[i%len]){
                count++;
            } else {
                count = 0;
            }
            if (count == len-1) {
                return true;
            }
        }
        return false;
    }
}