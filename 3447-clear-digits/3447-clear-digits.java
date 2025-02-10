class Solution {
    public String clearDigits(String s) {
        StringBuilder str = new StringBuilder();
        int char_index = -1 , check_factor ;
        for( check_factor = 0 ; check_factor < s.length() ; check_factor++)
        {
            char ch = s.charAt( check_factor );
             if( ch>='a' && ch<='z'){
                str.append( ch );
                char_index+=1;

             }
             else{
                if(check_factor!=0)
                {
                    str.deleteCharAt(char_index);
                    char_index-=1;
                }
             }
        } 
        return str.toString();
    }
}