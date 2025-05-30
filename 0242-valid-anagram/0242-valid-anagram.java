class Solution {
    public boolean isAnagram(String s, String t) {
        int c[] = new int[26];
        if(s.length()!=t.length())
        {
            return false;
        }
        for(int i=0;i<s.length();i++)
        {
            c[s.charAt(i)-'a']++;
            c[t.charAt(i)-'a']--;
        }
        for(int i:c)
        {
            if(i!=0)
            {
                return false;
            }
        }
        return true;
    }
}