class Solution {
    public int[] minOperations(String boxes) {
        int n = boxes.length();
        int[] prefix = new int[n];
        int[] res = new int[n];
        int[] suffix = new int[n];
        int balls = boxes.charAt(0) - '0';
        for(int i = 1 ; i < n ; i++){
            prefix[i] = prefix[i-1]+balls;
            balls = balls+boxes.charAt(i)-'0';
        } 
        balls = boxes.charAt(n-1) - '0';
        for(int i = n-2 ; i >=0 ; i--){
            suffix[i] = suffix[i+1]+balls;
            balls = balls+boxes.charAt(i)-'0';
        } 
        for(int i = 0 ; i < n ; i++){
             res[i] = prefix[i]+suffix[i];
        }
    return res;
        
    }
}