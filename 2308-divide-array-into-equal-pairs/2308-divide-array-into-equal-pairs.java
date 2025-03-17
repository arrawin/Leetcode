class Solution {
    public boolean divideArray(int[] nums) {
         int freq[] = new int[501];
         int count = 0;
         for(int ind = 0 ; ind < nums.length ; ind++)
         {
            int c = freq[nums[ind]] += 1;
            if( c%2==0){
                count++;
            }
         }
         return count*2==nums.length? true : false;


        
    }
}