class Solution {
    public long minSum(int[] nums1, int[] nums2) {
        int n1 = nums1.length, n2 = nums2.length;
        long sum1 = 0, sum2 = 0;
        long zero1 = 0, zero2 = 0;

        for(int i = 0; i < n1; i++){
            if(nums1[i] == 0){
                sum1++; zero1++;
            }
            else{
                sum1 += nums1[i];
            }
        }
        for(int j = 0; j < n2; j++){
            if(nums2[j] == 0){
                sum2++; zero2++;
            }
            else{
                sum2 += nums2[j];
            }
        }
        // Check if balancing is impossible
        if ((zero1 == 0 && sum2 > sum1) || (zero2 == 0 && sum1 > sum2)) {
            return -1;
        }
        // The minimal balanced sum is the maximum of the two sums
        return Math.max(sum1, sum2);
    }
}