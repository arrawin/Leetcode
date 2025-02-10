class Solution {
    public String clearDigits(String s) {
        StringBuilder str = new StringBuilder(s);
        if( Character.isDigit( str.charAt(0) ) ) str.deleteCharAt(0);
        for(int i = 0 ; i < str.length() ; i++){
            if((Character.isDigit(str.charAt(i)))){
                str.delete( i - 1 , i+1);
                i-=2;
            }
        }
        return str.toString();
    }
}