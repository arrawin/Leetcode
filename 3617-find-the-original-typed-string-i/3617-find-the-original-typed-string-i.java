class Solution {
    public int possibleStringCount(String word) 
    {
        int c=1;
        int n=word.length();
        for(int i=0;i<n-1;i++)
        {
            while(i<n-1 && word.charAt(i)==word.charAt(i+1))
            {
                c++;
                i++;
            }
        }
        return c;
    }
}