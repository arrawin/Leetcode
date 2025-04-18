class Solution {
    public int[] swap(int[] nums , int pos1 , int pos2)
    {
        int temp = nums[pos1];
        nums[pos1] = nums[pos2];
        nums[pos2] = temp;
        return nums;
    }
    public int[] reverse(int[] nums , int pos)
    {
        int r , l;
        for(r = pos , l = nums.length-1 ; r<=l ; r++,l--)
        {
            swap(nums,r,l);
        }
        return nums;
    }
    public void nextPermutation(int[] nums) {
        int ind = nums.length-2;
        while(ind>=0 && nums[ind]>= nums[ind+1]){
            ind--;
        }
        if(ind>=0)
        {
            int j = nums.length-1;
            while(nums[j] <= nums[ind]){
                j--;
            }
            swap(nums , ind , j);
        }
            reverse(nums,ind+1);
   }
}