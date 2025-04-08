class Solution {
    public int[] swap(int num1 , int num2 , int nums[])
    {
        int temp = nums[num1];
        nums[num1] = nums[num2];
        nums[num2] = temp;
        return nums;
    }
    public void sortColors(int[] nums) {
        int low = 0;
        int mid = 0;
        int high = nums.length-1;
        while(high>=mid){
            if(nums[mid]==1){
                mid++;
            }
            else if(nums[mid] == 0){
                swap(mid,low,nums);
                mid++;
                low++;
            }
            else{
                swap(mid,high,nums);
                high--;
            }
        }
    }
}