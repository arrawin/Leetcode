class Solution {
    public int numTilePossibilities(String tiles) {
        int[] freq = new int[26];
        for(char c : tiles.toCharArray()){
            freq[c - 'A']++;
        }
        return backTrack(freq);
    }
    public int backTrack(int[] freq){
        int count=0;
        for(int i=0; i<freq.length; i++){
            if(freq[i]>0){
                freq[i]--;
                count += 1 + backTrack(freq);
                freq[i]++;
            }
        }
        return count;
    }
}