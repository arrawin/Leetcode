class Solution {
    public boolean areAlmostEqual(String s1, String s2) {
        int mismatch = 0 , mis_first=0 , mis_second=0;
        if(s1.equals(s2)){
            return true;
        }
        if(s1.length()!=s2.length()){
            return false;
        }
    
       for(int str_index = 0 ; str_index < s1.length() ; str_index++)
        {
            if(s1.charAt(str_index) != s2.charAt(str_index) )
            {
                mismatch+=1;
                if(mismatch==1){
                    mis_first = str_index;
                }
                else if(mismatch==2){
                    mis_second = str_index;
                }
                else{
                    return false;
                }
            }
        }
        if(mismatch==2 && s1.charAt(mis_first)==s2.charAt(mis_second) && s1.charAt(mis_second)==s2.charAt(mis_first)){
            return true;
        }
        else{
            return false;
        }
    }
}