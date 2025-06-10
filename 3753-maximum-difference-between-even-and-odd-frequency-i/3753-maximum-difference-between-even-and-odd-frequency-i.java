class Solution {
    public int maxDifference(String s) {
        int[] freq = new int[26];
        for (char ch : s.toCharArray()) {
            freq[ch - 'a']++;
        }

        int[] buckets = new int[s.length() + 1];
        for (int i = 0; i < 26; i++) {
            if (freq[i] > 0) {
                buckets[freq[i]]++;
            }
        }

        int maxOdd = 0;
        int minEven = Integer.MAX_VALUE;

        for (int f = 1; f <= s.length(); f++) {
            if (buckets[f] == 0) continue;

            if (f % 2 == 1) {
                maxOdd = Math.max(maxOdd, f);
            } else {
                minEven = Math.min(minEven, f);
            }
        }

        return maxOdd - minEven;
    }
}