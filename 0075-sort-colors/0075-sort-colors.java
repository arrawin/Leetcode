class Solution {

    public void swap(int[]nums, int n,int m){
        int temp=nums[n];
        nums[n]=nums[m];
        nums[m]=temp;
    }

    public void sortColors(int[] nums) {
        int low=0,mid=0,high=nums.length-1;
        while(mid<=high){
            if (nums[mid]==0){
            swap(nums,mid,low);
            mid+=1;
            low+=1; 
            } 
            else if (nums[mid]==1){
             mid+=1;
            }
            else {
                swap(nums,mid,high);
                high-=1;
            }
        }
    }
}