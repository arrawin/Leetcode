class Solution {
    public boolean checkIfPangram(String sentence) {
        if(sentence.length()<26){
            return false;
        }
        int[] freq_count = new int[26];
        for(int i = 0 ; i < sentence.length() ; i++){
            int ch = (sentence.charAt(i)-'a');
            freq_count[ch]++;

        }
         for(int i = 0 ; i < 26 ; i++){
                if(freq_count[i]<1){
                return false;
            }
         }
         return true;
        
    }
}