class Solution {
    public int numberOfAlternatingGroups(int[] colors, int k) {
        int left = 0;
        int right = 0;
        int ans = 0;
        int n = colors.length;
        for (right = 1; right < n + k - 1; right++) {
            if (colors[right % n] == colors[(right - 1) % n]) {
                left = right;
            }
            if ((right - left + 1) == k) {
                ans++;
                left++;
            }
        }
        return ans;
    }
}