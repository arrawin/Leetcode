class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int[] num2=new int[nums.length];
        int k=0;
        for(int i=0;i<nums.length;i++){
            
            if(nums[i]%2==0){
                num2[k++]=nums[i];

            }
        }
        for(int i=0;i<nums.length;i++){
            if(nums[i]%2!=0){
                num2[k++]=nums[i];
            }
        }
        return num2;
        
    }
}