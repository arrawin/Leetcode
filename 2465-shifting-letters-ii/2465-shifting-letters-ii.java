class Solution {
    public String shiftingLetters(String s, int[][] shifts) {
        final int n = s.length();
        final int m = shifts.length;
        int[] ps = new int[n + 1];
        char[] chars = s.toCharArray();

        for (int i = 0; i < m; ++i) {
            int left = shifts[i][0];
            int right = shifts[i][1];
            int dirc = shifts[i][2];
            
            if (dirc == 0) {
                dirc = 25;
            }

            ps[left] += dirc;
            ps[right + 1] -= dirc;
        }

        for (int i = 1; i < n + 1; ++i) {
            ps[i] = ps[i] + ps[i - 1];
        }

        for (int i = 0; i < n; ++i) {
            chars[i] = (char) ('a' + (chars[i] - 'a' + ps[i]) % 26);
        }

        return new String(chars);
    }
}