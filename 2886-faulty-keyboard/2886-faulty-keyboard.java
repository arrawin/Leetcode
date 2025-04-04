class Solution {
    public String finalString(String s) {
        StringBuilder st = new StringBuilder(s.length());
        for(int ind = 0 ; ind < s.length() ; ind++)
        {
            if(s.charAt(ind)=='i')
            {
               st.reverse();
            }
            else{
                st.append(s.charAt(ind));
            }
        }
     return st.toString();
        
    }
}