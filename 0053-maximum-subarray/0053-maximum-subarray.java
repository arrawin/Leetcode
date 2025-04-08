class Solution {
    public int maxSubArray(int[] nums) {
        int sum=0 , maxsum=Integer.MIN_VALUE;
        for(int a : nums ){
            sum+=a;
            if(sum>maxsum){
                maxsum=sum;
            }
            if(sum<0){sum=0;}
        }
        return maxsum;
    }
}