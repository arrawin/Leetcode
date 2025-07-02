class Solution {
    public int searchInsert(int[] nums, int target) {
      int left = 0 ;
      int right = nums.length - 1;
      int mid = 0;
      while(left<=right)
      {
          mid = (left+right)/2;
          if(nums[mid]<target)
          {
            left = mid+1;
          }
          else if(nums[mid]==target)
          {
            return mid;
          }
          else{
            right = mid-1;
          }
      }
      if(target>nums[mid]){
        return mid+1;
      }
      else{
        return mid;
      }

    }
}