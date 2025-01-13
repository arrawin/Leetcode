class Solution {
    public int minimumLength(String s) {
        int[] freq = new int[26];
        int ans=0;
        for(char ch : s.toCharArray()){
            freq[ch-'a'] = freq[ch-'a']+1 ;         
        }
        for(int i = 0 ; i<26 ; i++){
            if(freq[i]==0){
                continue;
            }
            if(freq[i]%2==0){
                ans+=2;

            }
            if(freq[i]%2!=0){
                ans++;
        }
    }
    return ans;
}
}