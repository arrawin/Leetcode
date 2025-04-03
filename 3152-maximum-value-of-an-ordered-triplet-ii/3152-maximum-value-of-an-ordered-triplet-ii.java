class Solution {
    public long maximumTripletValue(int[] nums) {
        if(nums.length<0) return 0;
        long result = 0, maxI = 0, maxDiff = 0;
        for(int k : nums){
            //Step-1: Update result as (maxDiff*k)
            result = Math.max(result, maxDiff*k);

            //Step-2: Update maxDiff as (maxI-k)
            maxDiff = Math.max(maxI-k,maxDiff);

            //Step-3: Update maxI
            maxI = Math.max(maxI, k);
        }
        return result<0 ? 0 : result;
    }
}