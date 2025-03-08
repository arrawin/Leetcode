class Solution {
    public int minimumRecolors(String blocks, int k) {
        int n=blocks.length();
        
        int cur=0;
        for(int i=0;i<k;i++){
            if(blocks.charAt(i)=='W')   cur++;
        }

        int ans=cur;

        for(int i=k;i<n;i++){
            if(blocks.charAt(i)=='W')   cur++;
            if(blocks.charAt(i-k)=='W')   cur--;

            ans=Math.min(ans, cur);
        }

        return ans;
    }
}