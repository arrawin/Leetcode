class Solution {
    public int xorAllNums(int[] nums1, int[] nums2) {
        int n = nums1.length;
        int m = nums2.length;
        int res = 0;
        if((n&1)==1){
         for(int num : nums2){
          res^=(num);
         }
        }        
    
      if((m&1)==1){
         for(int num : nums1){
          res^=(num);
         }
        }        
    return res;
}
}