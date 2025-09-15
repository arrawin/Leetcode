class Solution {
    public int canBeTypedWords(String text, String brokenLetters) {
        boolean[] arr = new boolean[26];
        for(char c : brokenLetters.toCharArray()){
            arr[c - 'a'] = true;
        }
        int res = 0;
        for(String word : text.split(" ")){
            boolean f = true;
            for(char c : word.toCharArray()){
                if(arr[c - 'a']){
                    f = false;
                    break;
                }
            }
            if(f){
                res++;
            }
        }
        return res;
    }
}