class Solution {
    public int lengthOfLongestSubstring(String s) {
        int[] count=new int[150];
        int ans=0;
        for(int i=0,j=0;j<s.length();j++)
        {
            count[s.charAt(j)]++;
            while(count[s.charAt(j)]>1){
                count[s.charAt(i)]--;
                i++;
            }
        ans=Math.max(ans,j-i+1);
        }
    return ans;

        
    }
}