class Solution {
    public int[] trailZeroes(int[] nums)
    {
        int nums_ind;
        int ind = 0;
        for( nums_ind = 0 ; nums_ind < nums.length ; nums_ind++)
        {
            if( nums[nums_ind]!=0){
                nums[ind] =  nums[nums_ind];
                ind++;
            }
        }
        for( nums_ind = ind ; nums_ind < nums.length ; nums_ind++)
        {
            nums[nums_ind] = 0;
        }
        return nums;
    }
    public int[] applyOperations(int[] nums) {
        int nums_ind;
        for( nums_ind = 0 ; nums_ind < nums.length - 1 ; nums_ind++)
        {
            if(nums[nums_ind] == nums[nums_ind+1]){
                nums[nums_ind] *= 2;
                nums[nums_ind+1] = 0;
            }
        }
        return trailZeroes( nums );
    }
}