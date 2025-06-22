class Solution {
    public String[] divideString(String s, int k, char fill) {
        int len = s.length();
        int complete_divide = len / k;
        int remain = len % k;
        int totalGroups = complete_divide + (remain > 0 ? 1 : 0); // FIX 1
        int pos = 0;
        
        String[] res = new String[totalGroups];
        
        for (int i = 0; i < complete_divide; i++) {
            res[i] = s.substring(pos, pos + k);
            pos += k;
        }

        if (remain != 0) {
            StringBuilder st = new StringBuilder();
            st.append(s.substring(pos)); 
            int fillCount = k - remain;
            while (fillCount-- > 0) {
                st.append(fill);
            }
            res[totalGroups - 1] = st.toString();
        }

        return res;
    }
}
