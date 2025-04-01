class Solution {
    public boolean isalpha(char ch) {
        return ch >= 'a' && ch <= 'z';
    }
    public boolean isdigit(char ch) {
        return ch >= '0' && ch <= '9';
    }
    public boolean ispunc(char ch) {
        return ch == '!' || ch == '.' || ch == ',';
    }
    public boolean isvalid(String s) {
        int n = s.length();
        int pc = 0, hc = 0;
        for(int i = 0 ; i < n ; i++) {
            char ch = s.charAt(i);
            if(isdigit(ch)) return false;
            else if(ch == '-') {
                hc++;
                if(hc > 1) return false;
                if(i == 0 || i == n-1) return false; // first last index
                else if(!(isalpha(s.charAt(i-1)) && isalpha(s.charAt(i+1)))) return false; // if in between should be surrounded
            } else if(ispunc(ch)) {
                pc++;
                if(pc > 1) return false;
                if(n == 1 ) return true; // only letter
                else if(i != n-1) return false; // not the last index
                else if(!(i == n-1 && !ispunc(s.charAt(i-1)))) return false;
            }
        }
        return true;
    }
    public int countValidWords(String s) {
        // int c = 0;
        // sentence = sentence.trim();
        // for(String s : sentence.split("\\s+")) if(isvalid(s)) c++;
        // return c;
        int c = 0, l = 0, r = 0;
        s = s.trim();
        while(r < s.length()) {
            while (r < s.length() && s.charAt(r) == ' ') r++;
            l = r;
            while (r < s.length() && s.charAt(r) != ' ') r++;
            if(isvalid(s.substring(l,r))) c++;
            r++;
        }
        return c;
    }
}