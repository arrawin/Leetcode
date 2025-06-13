class Solution {
    public void moveZeroes(int[] nums) {
        int n = nums.length;
        int pos = 0;

        //Traverse through the array . all the non zero elements to its relative position while maintaining order
        for(int i = 0 ; i < n ; i++){
            if(nums[i]!=0){
                nums[pos] = nums[i];
                pos++;
            }
        }
        while(pos < nums.length){
            nums[pos] = 0;
            pos++;
        }
       
    }
}
       