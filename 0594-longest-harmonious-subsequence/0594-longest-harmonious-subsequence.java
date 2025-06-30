class Solution {
    public int findLHS(int[] nums) {
        HashMap<Integer,Integer> hm=new HashMap<>();
        for(int i:nums){
            hm.put(i,hm.getOrDefault(i,0)+1);
        }
        // return 0;
        int ans=0;
        for(int i:nums){
            int x=hm.getOrDefault(i+1,0);
            if(x>0) ans=Math.max(ans,x+hm.get(i));
        }
        return ans;
    }
}