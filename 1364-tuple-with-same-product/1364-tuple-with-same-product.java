class Solution {
    public int tupleSameProduct(int[] nums) {
        int count=0;
        Map<Integer,Integer> freq = new HashMap<>(); 
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                int key = nums[i]*nums[j];
                count += freq.getOrDefault(key,0)*8;
                freq.merge(key,1,Integer::sum);
            }
        }
        
        return count;
    }
}