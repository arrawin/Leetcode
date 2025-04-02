class Solution {
    public int minimumSum(int[] nums) {
        int sum = 0 , flag = 0; 
        int min_val = Integer.MAX_VALUE;
        for(int left = 0 ; left < nums.length - 2 ; left++){
            for(int mid = left+1 ; mid < nums.length ; mid++){
                for(int right = mid+1 ; right < nums.length ; right++){
                    if(nums[left]<nums[mid] && nums[right]<nums[mid]){
                        sum =(nums[left] + nums[mid] + nums[right]);
                        if(min_val >= sum){
                            min_val = sum;
                            flag = 1;
                        }
                    }
                }
            }
        }
        return flag == 0 ? -1 : min_val;
    }
}