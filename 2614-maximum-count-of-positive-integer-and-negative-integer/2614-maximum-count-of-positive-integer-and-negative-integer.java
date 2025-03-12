class Solution {
    public int maximumCount(int[] nums) {
        int neg_count = binarySearch(nums , 0);
        int pos_count = nums.length - binarySearch(nums , 1);
        return Math.max(neg_count , pos_count);
    }

    private int binarySearch(int[] nums , int target){
        int left = 0;
        int right = nums.length-1;
        int result = nums.length;
        while(left <= right)
        {
            int mid = (left+right)/2;
            if(nums[mid] < target)
            {
                left = mid+1;
            }
            else{
                result = mid;
                right = mid - 1;
            }
        }

        return result;
    }

    }